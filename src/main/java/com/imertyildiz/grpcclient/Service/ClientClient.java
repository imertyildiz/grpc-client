package com.imertyildiz.grpcclient.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.imertyildiz.grpcproto.HelloWorldRequest;
import com.imertyildiz.grpcproto.HelloWorldResponse;
import com.imertyildiz.grpcproto.HelloWorldServiceGrpc.HelloWorldServiceBlockingStub;

import net.devh.boot.grpc.client.inject.GrpcClient;

@Service
public class ClientClient {
    private static final Logger logger = LoggerFactory.getLogger(ClientClient.class);

    @GrpcClient("grpc-server")
    private HelloWorldServiceBlockingStub helloWorldServiceStub;

    public void sayHello(String sender, String message) {
        HelloWorldRequest helloWorldRequest = HelloWorldRequest.newBuilder().setClientName(sender)
                .setRequestMessage(message).build();
        HelloWorldResponse helloWorldResponse = this.helloWorldServiceStub.helloWorld(helloWorldRequest);
        logger.info(String.format("Server sent a response: %1s", helloWorldResponse.getResponseMessage()));
    }

}