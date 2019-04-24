.class public interface abstract Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract checkCardStatusWaitingReport()V
.end method

.method public abstract checkDeviceStatus(Lcom/huawei/nfc/carrera/logic/lostmanager/callback/CheckDeviceStatusCallback;)V
.end method

.method public abstract clearAllNullifiedCardLocalInfo()V
.end method

.method public abstract clearNullifiedCardLocalInfo(Ljava/lang/String;)V
.end method

.method public abstract deleteLocalBankCards(Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleDeleteLocalCardsCallback;)V
.end method

.method public abstract handleDeviceRepair(ILcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleDeviceRepairCallback;)V
.end method

.method public abstract handleServerCardLostMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleServerCardLostMsgCallback;)V
.end method

.method public abstract reportCardDeletedStatus(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract reportCardDeletedStatus(Ljava/lang/String;Ljava/lang/String;Z)V
.end method

.method public abstract reportCardLockedStatus(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract reportCardOpenedAvailableStatus(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
.end method

.method public abstract reportCardOpenedNotActiveStatus(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method
