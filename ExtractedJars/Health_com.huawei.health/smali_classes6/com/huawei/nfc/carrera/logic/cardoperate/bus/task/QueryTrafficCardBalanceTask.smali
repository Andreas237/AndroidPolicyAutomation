.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/QueryTrafficCardBalanceTask;
.super Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;
.source "SourceFile"


# instance fields
.field private data:I

.field private mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;Ljava/lang/String;)V

    .line 21
    iput-object p5, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/QueryTrafficCardBalanceTask;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;

    .line 22
    iput p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/QueryTrafficCardBalanceTask;->data:I

    .line 23
    return-void
.end method


# virtual methods
.method public excuteAction(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)V
    .locals 2

    .line 28
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/QueryTrafficCardBalanceTask;->data:I

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/QueryTrafficCardBalanceTask;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;

    invoke-interface {p1, p2, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;->queryOfflineCardInfo(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;)V

    .line 29
    return-void
.end method
