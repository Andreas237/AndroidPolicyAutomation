.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/UninstallTrafficCardTask;
.super Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;
.source "SourceFile"


# instance fields
.field private mReasonCode:Ljava/lang/String;

.field private mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;

.field private mUpdateTA:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;Ljava/lang/String;Z)V
    .locals 0

    .line 22
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;Ljava/lang/String;)V

    .line 23
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/UninstallTrafficCardTask;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;

    .line 24
    iput-object p5, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/UninstallTrafficCardTask;->mReasonCode:Ljava/lang/String;

    .line 25
    iput-boolean p6, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/UninstallTrafficCardTask;->mUpdateTA:Z

    .line 26
    return-void
.end method


# virtual methods
.method public excuteAction(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)V
    .locals 3

    .line 31
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/UninstallTrafficCardTask;->mUpdateTA:Z

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/UninstallTrafficCardTask;->mReasonCode:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/UninstallTrafficCardTask;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;

    invoke-interface {p1, p2, v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;->uninstallTrafficCard(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;ZLjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;)V

    .line 33
    return-void
.end method
