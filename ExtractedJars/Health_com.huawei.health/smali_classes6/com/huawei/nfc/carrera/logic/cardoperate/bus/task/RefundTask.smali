.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/RefundTask;
.super Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;
.source "SourceFile"


# instance fields
.field private mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

.field private mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;Ljava/lang/String;)V

    .line 22
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/RefundTask;->mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    .line 23
    iput-object p5, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/RefundTask;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler;

    .line 24
    return-void
.end method


# virtual methods
.method public excuteAction(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)V
    .locals 2

    .line 29
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/RefundTask;->mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/RefundTask;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler;

    invoke-interface {p1, p2, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;->refund(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler;)V

    .line 31
    return-void
.end method
