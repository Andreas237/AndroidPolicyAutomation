.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/RechargeTask;
.super Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;
.source "SourceFile"


# instance fields
.field private mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

.field private mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;Ljava/lang/String;)V

    .line 23
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/RechargeTask;->mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    .line 24
    iput-object p5, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/RechargeTask;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;

    .line 25
    return-void
.end method


# virtual methods
.method public excuteAction(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)V
    .locals 2

    .line 30
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/RechargeTask;->mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/RechargeTask;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;

    invoke-interface {p1, p2, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;->recharge(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;)V

    .line 31
    return-void
.end method
