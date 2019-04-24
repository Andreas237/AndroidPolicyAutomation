.class public Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCardNullifiedTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final mAid:Ljava/lang/String;

.field private final mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCardNullifiedTask;->mContext:Landroid/content/Context;

    .line 40
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCardNullifiedTask;->mAid:Ljava/lang/String;

    .line 41
    return-void
.end method

.method private isCUPCard(ILjava/lang/String;)Z
    .locals 1

    .line 80
    const/16 v0, 0xd

    if-eq v0, p1, :cond_0

    const/16 v0, 0xb

    if-ne v0, p1, :cond_1

    const-string v0, "A0000003330101020063020000000301"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 82
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 84
    :cond_1
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 51
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCardNullifiedTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCardNullifiedTask;->mAid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardInfoByAid(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v2

    .line 52
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 54
    const-string v0, "HandleCardNullifiedTask, taCardInfo not existed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 55
    return-void

    .line 58
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCardNullifiedTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardAndIssuerInfoCacheApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;

    move-result-object v0

    iget-object v1, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;->cacheIssuerInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    move-result-object v3

    .line 59
    if-nez v3, :cond_1

    .line 61
    const-string v0, "HandleCardNullifiedTask, issuer info not existed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 62
    return-void

    .line 65
    :cond_1
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getMode()I

    move-result v0

    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCardNullifiedTask;->isCUPCard(ILjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 67
    const-string v0, "handle cup card nullified."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 68
    new-instance v4, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCUPCardNullifiedTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCardNullifiedTask;->mContext:Landroid/content/Context;

    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getDpanDigest()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, v0, v1}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCUPCardNullifiedTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 69
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCUPCardNullifiedTask;->modifyCUPCard()Z

    .line 70
    goto :goto_0

    .line 73
    :cond_2
    const-string v0, "handle common bank card nullified."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 74
    new-instance v4, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/BankCardNullifiedModifier;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCardNullifiedTask;->mAid:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCardNullifiedTask;->mContext:Landroid/content/Context;

    invoke-direct {v4, v0, v1}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/BankCardNullifiedModifier;-><init>(Ljava/lang/String;Landroid/content/Context;)V

    .line 75
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/BankCardNullifiedModifier;->modifyLocalCardStatus(Z)Z

    .line 77
    :goto_0
    return-void
.end method
