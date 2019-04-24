.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/PreIssueTrafficCardFMOperator;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "PreIssueTrafficCardFMOperator"


# instance fields
.field private mContext:Landroid/content/Context;

.field private mInfos:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/PreIssueTrafficCardFMOperator;->mContext:Landroid/content/Context;

    .line 28
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/PreIssueTrafficCardFMOperator;->mInfos:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 29
    return-void
.end method


# virtual methods
.method public preIssueTrafficCard()V
    .locals 10

    .line 34
    const-string v0, "tsm preIssueTrafficCard begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 35
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/PreIssueTrafficCardFMOperator;->mInfos:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    if-nez v0, :cond_0

    .line 36
    const-string v0, "tsm PreIssueTrafficCardSNBTask installSSD failed, can not find issuer info."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 37
    return-void

    .line 39
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/PreIssueTrafficCardFMOperator;->mInfos:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v4

    .line 40
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "tsm PreIssueTrafficCardSNBTask installSSD failed, aid or productId is illegal. aid = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 43
    return-void

    .line 45
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/PreIssueTrafficCardFMOperator;->mInfos:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v5

    .line 47
    new-instance v6, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/CreateSSDTsmOperator;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/PreIssueTrafficCardFMOperator;->mContext:Landroid/content/Context;

    invoke-direct {v6, v0, v4, v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/CreateSSDTsmOperator;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    const-string v0, "PreIssueTrafficCardFMOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " CardEvent CREATESSD bus cardEvent START_LOCK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/PreIssueTrafficCardFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    .line 52
    invoke-virtual {v0, v4}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->lockCardEvent(Ljava/lang/String;)V

    .line 54
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/CreateSSDTsmOperator;->excute()I

    move-result v7

    .line 56
    const-string v0, "PreIssueTrafficCardFMOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " CardEvent CREATESSD bus cardEvent END_LOCK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/PreIssueTrafficCardFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    .line 58
    invoke-virtual {v0, v4}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->unLockCardEvent(Ljava/lang/String;)V

    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IssueTrafficCardFMOperator createDMSD result="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 61
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 62
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "tsm PreIssueTrafficCardSNBTask installSSD, create ssd failed response = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 65
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 66
    const-string v0, "aid"

    invoke-interface {v9, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    const-string v0, "fail_code"

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    const v0, 0x3611a405

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v9, v8, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 70
    return-void

    .line 73
    :cond_2
    const-string v0, "create SSD  successfully"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 74
    return-void
.end method
