package com.example.gRPC.service;

import io.grpc.stub.StreamObserver;

public class OrderServiceImpl extends com.grpc.order.v1.OrderServiceGrpc.OrderServiceImplBase {
    @Override
    public void executeOrder(com.grpc.order.v1.OrderRequest request, StreamObserver<com.grpc.order.v1.OrderResponse> responseObserver) {
        com.grpc.order.v1.OrderResponse response = com.grpc.order.v1.OrderResponse.newBuilder()
                .setInfo("Hi "+request.getEmail()+", you order has been executed")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
