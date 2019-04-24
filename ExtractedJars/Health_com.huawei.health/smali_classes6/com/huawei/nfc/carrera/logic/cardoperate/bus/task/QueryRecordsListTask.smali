.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/QueryRecordsListTask;
.super Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;
.source "SourceFile"


# instance fields
.field private mPriorType:I

.field private mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;Ljava/lang/String;)V

    .line 22
    iput p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/QueryRecordsListTask;->mPriorType:I

    .line 23
    iput-object p5, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/QueryRecordsListTask;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;

    .line 24
    return-void
.end method


# virtual methods
.method public excuteAction(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)V
    .locals 2

    .line 29
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/QueryRecordsListTask;->mPriorType:I

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/QueryRecordsListTask;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;

    invoke-interface {p1, p2, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;->queryRecords(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;)V

    .line 30
    return-void
.end method
