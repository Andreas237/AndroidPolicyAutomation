.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/PreIssueTrafficCardTask;
.super Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1, p3, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;Ljava/lang/String;)V

    .line 16
    return-void
.end method


# virtual methods
.method public excuteAction(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)V
    .locals 0

    .line 21
    invoke-interface {p1, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;->preIssueTrafficCard(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)V

    .line 22
    return-void
.end method
