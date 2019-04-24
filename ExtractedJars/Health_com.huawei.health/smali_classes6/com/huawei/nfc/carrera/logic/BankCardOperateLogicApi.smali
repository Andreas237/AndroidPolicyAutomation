.class public interface abstract Lcom/huawei/nfc/carrera/logic/BankCardOperateLogicApi;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract activeCard(Ljava/lang/String;ILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/ActiveCardCallback;)V
.end method

.method public abstract checkCUPInterruptedCard(ZLcom/huawei/nfc/carrera/logic/cardoperate/response/CheckCUPCardCallback;)V
.end method

.method public abstract identifyCardType(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/CardTypeIdentifyCallback;)V
.end method

.method public abstract initCUPCardOperator(Lcom/huawei/nfc/carrera/logic/cardoperate/response/InitCUPCardOperatorCallback;)V
.end method

.method public abstract initEseInfo()V
.end method

.method public abstract initEseInfo(Lcom/huawei/nfc/carrera/logic/cardoperate/response/InitEseResultCallback;)V
.end method

.method public abstract notifyCUPCardOperation(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lcom/huawei/nfc/carrera/logic/cardoperate/response/HandleCUPOperateResultCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList<Ljava/lang/String;>;Lcom/huawei/nfc/carrera/logic/cardoperate/response/HandleCUPOperateResultCallback;)V"
        }
    .end annotation
.end method

.method public abstract notifyCUPCardPersonalized(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/HandleCUPPersonalizedResultCallback;)V
.end method

.method public abstract nullifyCard(Ljava/lang/String;ILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/NullifyCardResultCallback;)V
.end method

.method public abstract openCard(ILcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;Lcom/huawei/nfc/carrera/logic/cardoperate/response/InstallCardResultCallback;)V
.end method

.method public abstract registerCUPOperationListener(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/CUPOperationListener;)V
.end method

.method public abstract requestActiveSmsCode(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/response/RequestVerifyCodeCallback;)V
.end method

.method public abstract requestNullifySmsCode(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/response/RequestVerifyCodeCallback;)V
.end method

.method public abstract retryDownloadCard(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/InstallCardResultCallback;)V
.end method

.method public abstract unregisterCUPOperationListener(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/CUPOperationListener;)V
.end method
