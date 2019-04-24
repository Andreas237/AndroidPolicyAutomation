.class public abstract Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field protected mContext:Landroid/content/Context;

.field protected mIssuerId:Ljava/lang/String;

.field protected operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;Ljava/lang/String;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;->mContext:Landroid/content/Context;

    .line 24
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;->mIssuerId:Ljava/lang/String;

    .line 25
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;

    .line 26
    return-void
.end method


# virtual methods
.method protected abstract excuteAction(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)V
.end method

.method public run()V
    .locals 5

    .line 31
    const-string v0, "TrafficCardBaseTask run begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 32
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardAndIssuerInfoCacheApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;->mIssuerId:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;->cacheIssuerInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    move-result-object v2

    .line 33
    if-nez v2, :cond_0

    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TrafficCardBaseTask run failed. issuer info dose not exist. issuerId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;->mIssuerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 36
    return-void

    .line 38
    :cond_0
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getMode()I

    move-result v3

    .line 39
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;

    invoke-virtual {v0, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;->getTrafficCardOpertor(I)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;

    move-result-object v4

    .line 40
    if-nez v4, :cond_1

    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TrafficCardBaseTask run failed. don\'t support the mode. mode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 43
    return-void

    .line 45
    :cond_1
    invoke-virtual {p0, v4, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;->excuteAction(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)V

    .line 46
    const-string v0, "TrafficCardBaseTask run end"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 47
    return-void
.end method
