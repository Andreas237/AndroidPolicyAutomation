.class public interface abstract Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract applyIssueOrder(Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;I)Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;
.end method

.method public abstract applyIssueOrderByproduct(Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;I)Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;
.end method

.method public abstract applyRechargeOrder(Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyRechargeOrderRequest;I)Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;
.end method

.method public abstract deleteApp(Lcom/huawei/nfc/carrera/logic/spi/fm/request/MoveOrDeleteAppRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;
.end method

.method public abstract doUnsolvedOrder(Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;
.end method

.method public abstract downloadCAP(Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;
.end method

.method public abstract installAndPersonalizeApplet(Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;
.end method

.method public abstract moveApp(Lcom/huawei/nfc/carrera/logic/spi/fm/request/MoveOrDeleteAppRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;
.end method

.method public abstract queryBusinessOrder(Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrderRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrderResponse;
.end method

.method public abstract queryBusinessOrders(Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;
.end method

.method public abstract queryCardInfo(ILjava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;
.end method

.method public abstract queryProducts(Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryProductsRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryProductsResponse;
.end method

.method public abstract queryTrade(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryTradeResponse;
.end method

.method public abstract recharge(Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;
.end method

.method public abstract retryInstallApplet(Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;
.end method
