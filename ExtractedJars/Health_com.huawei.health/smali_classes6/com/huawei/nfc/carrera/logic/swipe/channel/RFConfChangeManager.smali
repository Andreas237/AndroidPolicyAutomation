.class public Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final RF_CHANGE_EVENT_TYPE_DEFAULTCARD_CHANGE:I = 0x1

.field public static final RF_CHANGE_EVENT_TYPE_NFC_CONFIG_CHANGE:I = 0x2

.field private static final SYNC_LOCK:Ljava/lang/Object;

.field private static final TAG:Ljava/lang/String; = "RFConfChangeHandler"

.field private static volatile sInstance:Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager; = null


# instance fields
.field private mCardPicRescManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

.field private mContext:Landroid/content/Context;

.field private mHandledCardGroupType:I

.field private mHandledIssuerId:Ljava/lang/String;

.field private mPkg:Ljava/lang/String;

.field private mWaitingHandleCardGroupType:I

.field private mWaitingHandleIssuerId:Ljava/lang/String;

.field private mWalletTaManager:Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 52
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->SYNC_LOCK:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    if-nez p1, :cond_0

    .line 89
    invoke-static {}, Lo/dte;->c()Lo/dte;

    move-result-object v0

    invoke-virtual {v0}, Lo/dte;->b()Landroid/content/Context;

    move-result-object p1

    .line 91
    :cond_0
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->mContext:Landroid/content/Context;

    .line 92
    invoke-static {p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->mWalletTaManager:Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    .line 93
    invoke-static {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->mCardPicRescManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    .line 94
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->mPkg:Ljava/lang/String;

    .line 95
    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;
    .locals 3

    .line 99
    sget-object v0, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->sInstance:Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;

    if-nez v0, :cond_1

    .line 101
    sget-object v1, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->SYNC_LOCK:Ljava/lang/Object;

    monitor-enter v1

    .line 103
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->sInstance:Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;

    if-nez v0, :cond_0

    .line 105
    new-instance v0, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->sInstance:Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 109
    :cond_1
    :goto_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->sInstance:Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;

    return-object v0
.end method

.method private isFileExists(Ljava/lang/String;)Z
    .locals 2

    .line 213
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 214
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public setDefaultCardRFConf(IZ)V
    .locals 7

    .line 124
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RFConfChangeHandler changeRFInfo begin eventType : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " forceChange : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/NfcUtil;->isMatchPayCondition(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 127
    const-string v0, "RFConfChangeHandler changeRFInfo failed end.do not match HUAWEI PAY condition."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    return-void

    .line 131
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->mWalletTaManager:Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getDefaultCard()Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v4

    .line 133
    if-nez v4, :cond_1

    .line 135
    const-string v0, "RFConfChangeHandler changeRFInfo failed end. default taCardInfo is null."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    return-void

    .line 139
    :cond_1
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getCardGroupType()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->mWaitingHandleCardGroupType:I

    .line 140
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->mWaitingHandleCardGroupType:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    const/4 v5, 0x1

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    .line 141
    :goto_0
    if-nez p2, :cond_3

    const/4 v0, 0x2

    if-ne p1, v0, :cond_4

    if-nez v5, :cond_4

    .line 146
    :cond_3
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->mHandledIssuerId:Ljava/lang/String;

    .line 147
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->mHandledCardGroupType:I

    .line 149
    :cond_4
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->mWaitingHandleIssuerId:Ljava/lang/String;

    .line 150
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getCardGroupType()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->mWaitingHandleCardGroupType:I

    .line 151
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->mWaitingHandleIssuerId:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->mHandledIssuerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    iget v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->mWaitingHandleCardGroupType:I

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->mHandledCardGroupType:I

    if-ne v0, v1, :cond_6

    if-eqz v5, :cond_6

    .line 154
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RFConfChangeHandler changeRFInfo success end. duplicate set.mWaitingHandleIssuerId : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->mWaitingHandleIssuerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " mHandledIssuerId : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->mHandledIssuerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " mWaitingHandleType : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 156
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getCardGroupType()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " mHandledCardGroupType : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->mHandledCardGroupType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    .line 154
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    return-void

    .line 159
    :cond_6
    if-eqz v5, :cond_7

    .line 163
    const-string v0, "RFConfChangeHandler changeRFInfo end.set default RF conf for bank card."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    return-void

    .line 166
    :cond_7
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->mCardPicRescManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->mHandledIssuerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->getCardRFConfFilePath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 167
    const-string v0, "RFConfChangeHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " setDefaultCardRFConf path : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    invoke-direct {p0, v6}, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->isFileExists(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 172
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RFConfChangeHandler changeRFInfo end.set RF conf for bus card. IssuerId : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->mWaitingHandleIssuerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 176
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RFConfChangeHandler changeRFInfo end.RF conf for IssuerId<"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->mWaitingHandleIssuerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "> does not exists"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    :goto_1
    return-void
.end method
