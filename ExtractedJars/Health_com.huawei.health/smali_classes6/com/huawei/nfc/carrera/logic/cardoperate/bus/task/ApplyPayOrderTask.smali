.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/ApplyPayOrderTask;
.super Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;
.source "SourceFile"


# instance fields
.field private amount:D

.field private mProductCode:Ljava/lang/String;

.field private mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

.field private orderType:I

.field private payType:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;Ljava/lang/String;DIILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;Ljava/lang/String;)V

    .line 27
    iput-wide p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/ApplyPayOrderTask;->amount:D

    .line 28
    iput p6, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/ApplyPayOrderTask;->orderType:I

    .line 29
    iput p7, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/ApplyPayOrderTask;->payType:I

    .line 30
    iput-object p9, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/ApplyPayOrderTask;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    .line 31
    iput-object p8, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/ApplyPayOrderTask;->mProductCode:Ljava/lang/String;

    .line 32
    return-void
.end method


# virtual methods
.method public excuteAction(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)V
    .locals 8

    .line 37
    move-object v0, p1

    move-object v1, p2

    iget-wide v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/ApplyPayOrderTask;->amount:D

    iget v4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/ApplyPayOrderTask;->orderType:I

    iget v5, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/ApplyPayOrderTask;->payType:I

    iget-object v6, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/ApplyPayOrderTask;->mProductCode:Ljava/lang/String;

    iget-object v7, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/ApplyPayOrderTask;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    invoke-interface/range {v0 .. v7}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;->applyPayOrder(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;DIILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;)V

    .line 38
    return-void
.end method
