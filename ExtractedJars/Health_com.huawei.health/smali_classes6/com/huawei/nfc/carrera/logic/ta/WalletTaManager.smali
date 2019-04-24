.class public final Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final NOTIFICATION_CARD_EVENT_ACTIVTE:I = 0x4

.field public static final NOTIFICATION_CARD_EVENT_BUS_TOP_UP:I = 0x1

.field public static final NOTIFICATION_CARD_EVENT_DEFAULT:I = 0x0

.field public static final NOTIFICATION_CARD_EVENT_END_LOCK:I = 0x3

.field public static final NOTIFICATION_CARD_EVENT_START_LOCK:I = 0x2

.field private static final OPEN_CARD_NUMBER_LIMIT:I = 0x8

.field private static final TAG:Ljava/lang/String; = "WalletTaManager"

.field private static cardInfoListCache:Ljava/util/ArrayList; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;>;"
        }
    .end annotation
.end field

.field private static final cardInfoListLock:Ljava/lang/Object;

.field private static volatile instance:Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager; = null

.field private static pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter; = null


# instance fields
.field private dbManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

.field private mContext:Landroid/content/Context;

.field timeStamp:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 37
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    .line 42
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListLock:Ljava/lang/Object;

    .line 45
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 7

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 199
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->timeStamp:J

    .line 77
    const-string v0, "WalletTaManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WalletTaManager enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 79
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->mContext:Landroid/content/Context;

    goto :goto_0

    .line 81
    :cond_0
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->mContext:Landroid/content/Context;

    .line 83
    :goto_0
    new-instance v0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->dbManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    .line 84
    sget-object v4, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListLock:Ljava/lang/Object;

    monitor-enter v4

    .line 86
    :try_start_0
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardListFromTa()Ljava/util/ArrayList;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    goto :goto_1

    .line 87
    :catch_0
    move-exception v5

    .line 88
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cardInfoListCache init, getCardListFromTa failed, errorCode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;->getCode()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    :goto_1
    monitor-exit v4

    goto :goto_2

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 92
    :goto_2
    return-void
.end method

.method private checkAvaiableCard()I
    .locals 6

    .line 407
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardList()Ljava/util/ArrayList;

    move-result-object v2

    .line 408
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 409
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 411
    :cond_1
    const/4 v3, 0x0

    .line 412
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    .line 414
    iget v0, v5, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    iget v0, v5, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    if-eqz v0, :cond_2

    .line 415
    add-int/lit8 v3, v3, 0x1

    .line 417
    :cond_2
    goto :goto_0

    .line 419
    :cond_3
    return v3
.end method

.method private deleteCardFromDB(Ljava/lang/String;)V
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->dbManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->deleteCardOrderItem(Ljava/lang/String;)V

    .line 112
    return-void
.end method

.method public static destroy()V
    .locals 4

    .line 863
    const-string v0, "WalletTaManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 864
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->instance:Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    .line 865
    return-void
.end method

.method private getCardFromCardListCache(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;
    .locals 4

    .line 823
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 824
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    .line 825
    iget-object v0, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 826
    return-object v3

    .line 828
    :cond_0
    goto :goto_0

    .line 830
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private getCardListFromTa()Ljava/util/ArrayList;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException;
        }
    .end annotation

    .line 727
    const-string v0, "WalletTaManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCardListFromTa enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 728
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 729
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 730
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v0}, Lcom/huawei/nfc/PluginPayAdapter;->obtainCardList()Ljava/util/List;

    move-result-object v5

    .line 731
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 732
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 733
    const-string v0, "WalletTaManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cardInfoStr = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 734
    new-instance v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    invoke-direct {v8, v7}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;-><init>(Ljava/lang/String;)V

    .line 735
    invoke-direct {p0, v8}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->handleTACardInfoUpdate(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)V

    .line 736
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 737
    goto :goto_0

    .line 739
    :cond_0
    goto :goto_1

    .line 740
    :cond_1
    const-string v0, "WalletTaManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pluginPayAdapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 742
    :goto_1
    const-string v0, "WalletTaManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCardListFromTa end.cardList.size()="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 743
    return-object v4
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;
    .locals 7

    .line 121
    invoke-static {p0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v4

    .line 123
    :try_start_0
    invoke-virtual {v4}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/PluginPayAdapter;

    sput-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 126
    goto :goto_0

    .line 124
    :catch_0
    move-exception v5

    .line 125
    const-string v0, "WalletTaManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ClassCastException() e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    :goto_0
    const-string v0, "WalletTaManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WalletTaManager getInstance ,pluginPayAdapter="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",instance="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->instance:Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    sget-object v5, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListLock:Ljava/lang/Object;

    monitor-enter v5

    .line 129
    :try_start_1
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->instance:Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 130
    new-instance v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->instance:Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    .line 132
    :cond_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->instance:Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v5

    return-object v0

    .line 133
    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6
.end method

.method private handleTACardInfoUpdate(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException;
        }
    .end annotation

    .line 753
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->transformSNB(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)V

    .line 755
    const-string v0, "A0000003330101020063020000000301"

    iget-object v1, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 756
    const-string v0, "handleTACardInfoUpdate, not citic card, no need to upgrade."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 757
    return-void

    .line 761
    :cond_0
    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->productId:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 762
    const-string v0, "handleTACardInfoUpdate, productId existed, no need to upgrade."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 763
    return-void

    .line 766
    :cond_1
    const-string v0, "upgrade citic ta info now."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 768
    const/4 v0, 0x3

    iput v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardType:I

    .line 769
    const-string v0, "*_63020000_01"

    iput-object v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->productId:Ljava/lang/String;

    .line 770
    const-string v0, "63020000"

    iput-object v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    .line 772
    return-void
.end method

.method private isCardAdded(Ljava/lang/String;)Z
    .locals 3

    .line 423
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v2

    .line 425
    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    .line 426
    iget v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/4 v1, 0x2

    if-eq v1, v0, :cond_0

    iget v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 428
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 431
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private recoverSNB(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)V
    .locals 4

    .line 801
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 802
    const-string v0, "recoverSNB, null == taInfo "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 803
    return-void

    .line 805
    :cond_0
    iget-boolean v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->isSNB:Z

    if-nez v0, :cond_1

    .line 806
    const-string v0, "recoverSNB, !taInfo.isSN "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 807
    return-void

    .line 809
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getIssuerId()Ljava/lang/String;

    move-result-object v2

    .line 810
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardAndIssuerInfoCacheApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;->cacheIssuerInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    move-result-object v3

    .line 811
    const/4 v0, 0x0

    if-ne v0, v3, :cond_2

    .line 812
    const-string v0, "recoverSNB, null == item "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 813
    return-void

    .line 815
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "recoverSNB start, issuerId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 816
    const-string v0, "t_fdw_lingnantong"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 817
    const-string v0, "90000029"

    invoke-virtual {p1, v0}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->setIssuerId(Ljava/lang/String;)V

    .line 819
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "recoverSNB end  , issuerId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 820
    return-void
.end method

.method private removeDefaultCard()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException;,
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException;
        }
    .end annotation

    .line 212
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getDefaulBusCard()Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v2

    .line 213
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 214
    iget-object v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->updateCardDefault(Ljava/lang/String;Z)V

    goto :goto_0

    .line 216
    :cond_0
    const-string v0, "no defaultCard"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 218
    :goto_0
    return-void
.end method

.method private setNewTimeStamp(Ljava/lang/String;J)V
    .locals 3

    .line 102
    new-instance v1, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;

    invoke-direct {v1, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;-><init>(Ljava/lang/String;J)V

    .line 103
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 104
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->dbManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    invoke-virtual {v0, v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->insertOrUpdateCardOrderInfos(Ljava/util/List;)V

    .line 107
    return-void
.end method

.method private transformSNB(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)V
    .locals 4

    .line 777
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 778
    const-string v0, "transformSNB, null == taInfo "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 779
    return-void

    .line 781
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getIssuerId()Ljava/lang/String;

    move-result-object v2

    .line 782
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardAndIssuerInfoCacheApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;->cacheIssuerInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    move-result-object v3

    .line 783
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 784
    const-string v0, "transformSNB, null == item "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 785
    return-void

    .line 787
    :cond_1
    const-string v0, "90000029"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 788
    const-string v0, "t_fdw_lingnantong"

    invoke-virtual {p1, v0}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->setIssuerId(Ljava/lang/String;)V

    .line 789
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getProductId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->setProductId(Ljava/lang/String;)V

    .line 790
    const/4 v0, 0x1

    iput-boolean v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->isSNB:Z

    goto :goto_0

    .line 792
    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->isSNB:Z

    .line 794
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "transformSNB end  , issuerId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", productId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getProductId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",isSNB="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->isSNB:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 795
    return-void
.end method


# virtual methods
.method public activateCardByFpPwd(I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaFingerIdMismatchException;,
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException;,
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaDefaultCardNotExistException;,
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException;
        }
    .end annotation

    .line 274
    return-void
.end method

.method public activateCardByPayPwd(I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException;,
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaDefaultCardNotExistException;,
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException;
        }
    .end annotation

    .line 287
    return-void
.end method

.method public activteCardEvent(Ljava/lang/String;)V
    .locals 4

    .line 848
    const-string v0, "WalletTaManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "activteCardEvent.refId."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 849
    const/4 v0, 0x4

    invoke-virtual {p0, p1, v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardEvent(Ljava/lang/String;I)V

    .line 850
    return-void
.end method

.method public addCard(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardAlreadyExistException;,
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNumReachMaxException;,
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaBadParammeterException;,
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException;
        }
    .end annotation

    .line 374
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getTaCardInfoJsonStr()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 375
    :cond_0
    const-string v0, "addCard failed, bad parameter"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 376
    new-instance v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;-><init>()V

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;->newWalletTaBadParammeterException()Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaBadParammeterException;

    move-result-object v0

    throw v0

    .line 379
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->statusUpdateTime:J

    .line 380
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getTaCardInfoJsonStr()Ljava/lang/String;

    move-result-object v3

    .line 381
    const/4 v4, 0x0

    .line 382
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 383
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v0, v3}, Lcom/huawei/nfc/PluginPayAdapter;->addCard2Watch(Ljava/lang/String;)Z

    move-result v4

    .line 385
    :cond_2
    if-nez v4, :cond_5

    .line 386
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->checkAvaiableCard()I

    move-result v5

    .line 387
    const/16 v0, 0x8

    if-lt v5, v0, :cond_3

    .line 388
    new-instance v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;-><init>()V

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;->newWalletTaCardNumReachMaxException()Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNumReachMaxException;

    move-result-object v0

    throw v0

    .line 389
    :cond_3
    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanDigest:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->isCardAdded(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 390
    new-instance v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;-><init>()V

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;->newWalletTaCardAlreadyExistException()Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardAlreadyExistException;

    move-result-object v0

    throw v0

    .line 392
    :cond_4
    new-instance v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;-><init>()V

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;->newWalletTaBadParammeterException()Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaBadParammeterException;

    move-result-object v0

    throw v0

    .line 395
    :cond_5
    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    iget-wide v1, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->statusUpdateTime:J

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->setNewTimeStamp(Ljava/lang/String;J)V

    .line 397
    sget-object v5, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListLock:Ljava/lang/Object;

    monitor-enter v5

    .line 398
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    if-nez v0, :cond_6

    .line 399
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardListFromTa()Ljava/util/ArrayList;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    goto :goto_0

    .line 401
    :cond_6
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 403
    :goto_0
    monitor-exit v5

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 404
    :goto_1
    return-void
.end method

.method public addESELockTimes()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException;
        }
    .end annotation

    .line 839
    return-void
.end method

.method public cardEvent(Ljava/lang/String;I)V
    .locals 2

    .line 842
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 843
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v0, p1, p2}, Lcom/huawei/nfc/PluginPayAdapter;->cardEvent(Ljava/lang/String;I)V

    .line 845
    :cond_0
    return-void
.end method

.method public checkUserAccount(Ljava/lang/String;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaAccountNotExistException;,
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException;
        }
    .end annotation

    .line 313
    const/4 v0, 0x0

    return v0
.end method

.method public deactivateCard(I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException;
        }
    .end annotation

    .line 298
    return-void
.end method

.method public getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;
    .locals 7

    .line 666
    sget-object v4, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListLock:Ljava/lang/Object;

    monitor-enter v4

    .line 667
    const-string v0, "WalletTaManager"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCard(),referenceId="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 668
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 669
    :cond_0
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 671
    :cond_1
    :try_start_1
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardFromCardListCache(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v5

    .line 672
    const/4 v0, 0x0

    if-ne v0, v5, :cond_2

    .line 673
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 675
    :cond_2
    :try_start_2
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->clone()Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    monitor-exit v4

    return-object v0

    .line 676
    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6
.end method

.method public getCardInfoByAid(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;
    .locals 8

    .line 686
    const-string v0, "WalletTaManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCardInfoByAid(),aid="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 687
    sget-object v4, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListLock:Ljava/lang/Object;

    monitor-enter v4

    .line 688
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 689
    :cond_0
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 691
    :cond_1
    :try_start_1
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    .line 692
    iget-object v0, v6, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 693
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->clone()Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    monitor-exit v4

    return-object v0

    .line 695
    :cond_2
    goto :goto_0

    .line 696
    :cond_3
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 697
    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7
.end method

.method public getCardInfoByIssuerId(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;
    .locals 8

    .line 931
    const-string v0, "WalletTaManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCardInfoByIssuerId(),issuerId="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 932
    sget-object v4, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListLock:Ljava/lang/Object;

    monitor-enter v4

    .line 933
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 934
    :cond_0
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 936
    :cond_1
    :try_start_1
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    .line 937
    iget-object v0, v6, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 938
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->clone()Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    monitor-exit v4

    return-object v0

    .line 940
    :cond_2
    goto :goto_0

    .line 941
    :cond_3
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 942
    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7
.end method

.method public getCardList()Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;>;"
        }
    .end annotation

    .line 707
    sget-object v1, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListLock:Ljava/lang/Object;

    monitor-enter v1

    .line 708
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 709
    :cond_0
    monitor-exit v1

    const/4 v0, 0x0

    return-object v0

    .line 711
    :cond_1
    :try_start_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 712
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    .line 713
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->clone()Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 714
    goto :goto_0

    .line 715
    :cond_2
    monitor-exit v1

    return-object v2

    .line 716
    :catchall_0
    move-exception v5

    monitor-exit v1

    throw v5
.end method

.method public getCardListForDelete()Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;>;"
        }
    .end annotation

    .line 1089
    sget-object v1, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListLock:Ljava/lang/Object;

    monitor-enter v1

    .line 1091
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1092
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 1094
    monitor-exit v1

    const/4 v0, 0x0

    return-object v0

    .line 1097
    :cond_0
    :try_start_1
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-nez v0, :cond_1

    .line 1100
    monitor-exit v1

    return-object v2

    .line 1103
    :cond_1
    :try_start_2
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    .line 1105
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->clone()Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1106
    goto :goto_0

    .line 1107
    :cond_2
    monitor-exit v1

    return-object v2

    .line 1108
    :catchall_0
    move-exception v5

    monitor-exit v1

    throw v5
.end method

.method public getCardproductIdByIssuerId(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 946
    const-string v0, "WalletTaManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCardproductIdByIssuerId(),issuerId="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 947
    sget-object v4, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListLock:Ljava/lang/Object;

    monitor-enter v4

    .line 948
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 949
    :cond_0
    const-string v0, ""

    monitor-exit v4

    return-object v0

    .line 951
    :cond_1
    :try_start_1
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    .line 952
    iget-object v0, v6, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, v6, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 953
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getProductId()Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    monitor-exit v4

    return-object v0

    .line 955
    :cond_2
    goto :goto_0

    .line 956
    :cond_3
    const-string v0, ""

    monitor-exit v4

    return-object v0

    .line 957
    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7
.end method

.method public getDefaulBusCard()Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;
    .locals 6

    .line 247
    sget-object v2, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListLock:Ljava/lang/Object;

    monitor-enter v2

    .line 248
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 249
    :cond_0
    const-string v0, "getDefaultCard failed, default card not exist"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 250
    monitor-exit v2

    const/4 v0, 0x0

    return-object v0

    .line 252
    :cond_1
    :try_start_1
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    .line 253
    iget-boolean v0, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->isDefaultCard:Z

    if-eqz v0, :cond_2

    iget v0, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_2

    .line 254
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->clone()Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    monitor-exit v2

    return-object v0

    .line 256
    :cond_2
    goto :goto_0

    .line 257
    :cond_3
    const-string v0, "getDefaultCard failed, default card not exist"

    :try_start_2
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 258
    monitor-exit v2

    const/4 v0, 0x0

    return-object v0

    .line 259
    :catchall_0
    move-exception v5

    monitor-exit v2

    throw v5
.end method

.method public getDefaultCard()Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;
    .locals 6

    .line 226
    sget-object v2, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListLock:Ljava/lang/Object;

    monitor-enter v2

    .line 227
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 228
    :cond_0
    const-string v0, "getDefaultCard failed, default card not exist"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 229
    monitor-exit v2

    const/4 v0, 0x0

    return-object v0

    .line 231
    :cond_1
    :try_start_1
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    .line 232
    iget-boolean v0, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->isDefaultCard:Z

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 233
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->clone()Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    monitor-exit v2

    return-object v0

    .line 235
    :cond_2
    goto :goto_0

    .line 236
    :cond_3
    const-string v0, "getDefaultCard failed, default card not exist"

    :try_start_2
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 237
    monitor-exit v2

    const/4 v0, 0x0

    return-object v0

    .line 238
    :catchall_0
    move-exception v5

    monitor-exit v2

    throw v5
.end method

.method public getFingerId()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaFingerIdNotExistException;,
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException;
        }
    .end annotation

    .line 153
    const/4 v0, -0x1

    return v0
.end method

.method public isBusUnite(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    .line 1074
    const-string v0, "WalletTaManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isBusUnite(),issueID="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", aid = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1075
    const-string v0, "t_vfc_sz_union"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "t_vfc_guiminka"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "A000000632010105"

    .line 1076
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1077
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 1079
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public isInRule4NewDevice(I)Z
    .locals 10

    .line 1031
    const-string v0, "WalletTaManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isInRule4NewDevice carType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1032
    sget-object v4, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListLock:Ljava/lang/Object;

    monitor-enter v4

    .line 1033
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1034
    :cond_0
    const-string v0, "WalletTaManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isInRule4NewDevice cardInfoListCache is null or empty."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1035
    monitor-exit v4

    const/4 v0, 0x1

    return v0

    .line 1037
    :cond_1
    const/4 v5, 0x0

    .line 1038
    const/4 v6, 0x0

    .line 1040
    :try_start_1
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    .line 1041
    const/4 v0, 0x0

    if-ne v0, v8, :cond_2

    .line 1042
    goto :goto_0

    .line 1043
    :cond_2
    iget v0, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_4

    .line 1044
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->isBusUnite(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1045
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 1047
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 1050
    :cond_4
    :goto_1
    goto :goto_0

    .line 1051
    :cond_5
    const-string v0, "WalletTaManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isInRule4NewDevice,\u5df2\u7ecf\u5f00\u901a busCardCount="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",uniBusCardCount="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1052
    const/16 v0, 0xb

    if-ne v0, p1, :cond_6

    .line 1053
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 1054
    :cond_6
    const/16 v0, 0xc

    if-ne v0, p1, :cond_7

    .line 1055
    add-int/lit8 v6, v6, 0x1

    .line 1058
    :cond_7
    :goto_2
    const-string v0, "WalletTaManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isInRule4NewDevice,\u5c06\u8981\u5f00\u901a busCardCount="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",uniBusCardCount="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1060
    const/4 v0, 0x1

    if-gt v6, v0, :cond_8

    const/4 v0, 0x4

    if-gt v5, v0, :cond_8

    add-int v0, v6, v5

    const/4 v1, 0x4

    if-gt v0, v1, :cond_8

    .line 1061
    monitor-exit v4

    const/4 v0, 0x1

    return v0

    .line 1063
    :cond_8
    monitor-exit v4

    goto :goto_3

    :catchall_0
    move-exception v9

    monitor-exit v4

    throw v9

    .line 1064
    :goto_3
    const/4 v0, 0x0

    return v0
.end method

.method public isInRuleLEO(I)Z
    .locals 11

    .line 965
    const-string v0, "WalletTaManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isOverrun(),carType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 966
    sget-object v4, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListLock:Ljava/lang/Object;

    monitor-enter v4

    .line 967
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 968
    :cond_0
    const-string v0, "WalletTaManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isOverrun(),false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 969
    monitor-exit v4

    const/4 v0, 0x1

    return v0

    .line 971
    :cond_1
    const/4 v5, 0x0

    .line 972
    const/4 v6, 0x0

    .line 973
    const/4 v7, 0x0

    .line 975
    :try_start_1
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    .line 976
    const/4 v0, 0x0

    if-ne v0, v9, :cond_2

    .line 977
    goto :goto_0

    .line 978
    :cond_2
    iget v0, v9, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 979
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 980
    :cond_3
    iget v0, v9, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_5

    .line 981
    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->isBusUnite(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 982
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 984
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 987
    :cond_5
    :goto_1
    goto :goto_0

    .line 988
    :cond_6
    const-string v0, "WalletTaManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isOverrun(),\u5df2\u7ecf\u5f00\u901a bankCardCount="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",busCardCount="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",uniBusCardCount="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 989
    const/16 v0, 0xb

    if-ne v0, p1, :cond_7

    .line 990
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 991
    :cond_7
    const/16 v0, 0xc

    if-ne v0, p1, :cond_8

    .line 992
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 994
    :cond_8
    add-int/lit8 v5, v5, 0x1

    .line 996
    :goto_2
    const-string v0, "WalletTaManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isOverrun(),\u5c06\u8981\u5f00\u901a bankCardCount="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",busCardCount="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",uniBusCardCount="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 999
    const/4 v0, 0x0

    if-ne v0, v6, :cond_a

    .line 1000
    const/4 v0, 0x0

    if-ne v0, v7, :cond_9

    const/16 v0, 0x8

    if-gt v5, v0, :cond_9

    .line 1001
    monitor-exit v4

    const/4 v0, 0x1

    return v0

    .line 1002
    :cond_9
    const/4 v0, 0x1

    if-ne v0, v7, :cond_e

    const/4 v0, 0x4

    if-gt v5, v0, :cond_e

    .line 1003
    monitor-exit v4

    const/4 v0, 0x1

    return v0

    .line 1006
    :cond_a
    const/4 v0, 0x0

    if-ne v0, v7, :cond_c

    .line 1007
    const/4 v0, 0x0

    if-ne v0, v5, :cond_b

    const/4 v0, 0x4

    if-gt v6, v0, :cond_b

    .line 1008
    monitor-exit v4

    const/4 v0, 0x1

    return v0

    .line 1009
    :cond_b
    const/4 v0, 0x2

    if-gt v6, v0, :cond_e

    const/4 v0, 0x4

    if-gt v5, v0, :cond_e

    .line 1010
    monitor-exit v4

    const/4 v0, 0x1

    return v0

    .line 1013
    :cond_c
    const/4 v0, 0x0

    if-ne v0, v5, :cond_d

    .line 1014
    const/4 v0, 0x1

    if-ne v0, v6, :cond_e

    const/4 v0, 0x1

    if-ne v0, v7, :cond_e

    .line 1015
    monitor-exit v4

    const/4 v0, 0x1

    return v0

    .line 1018
    :cond_d
    monitor-exit v4

    const/4 v0, 0x0

    return v0

    .line 1021
    :cond_e
    monitor-exit v4

    goto :goto_3

    :catchall_0
    move-exception v10

    monitor-exit v4

    throw v10

    .line 1022
    :goto_3
    const/4 v0, 0x0

    return v0
.end method

.method public lockCardEvent(Ljava/lang/String;)V
    .locals 4

    .line 853
    const-string v0, "WalletTaManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "lockCardEvent.refId."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 854
    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardEvent(Ljava/lang/String;I)V

    .line 855
    return-void
.end method

.method public removeCard(Ljava/lang/String;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException;,
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException;
        }
    .end annotation

    .line 590
    sget-object v2, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListLock:Ljava/lang/Object;

    monitor-enter v2

    .line 591
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 592
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardListFromTa()Ljava/util/ArrayList;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    .line 594
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardFromCardListCache(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v3

    .line 595
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 596
    const-string v0, "removeCard failed, card is not exsit"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 597
    new-instance v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;-><init>()V

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;->newWalletTaCardNotExistException()Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException;

    move-result-object v0

    throw v0

    .line 599
    :cond_1
    const/4 v4, 0x0

    .line 600
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 601
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getTaCardInfoJsonStr()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/nfc/PluginPayAdapter;->deleteCard(Ljava/lang/String;)Z

    move-result v4

    .line 603
    :cond_2
    if-nez v4, :cond_3

    .line 604
    const-string v0, "deleteCard failed"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 605
    new-instance v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;-><init>()V

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;->newWalletTaCardNotExistException()Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException;

    move-result-object v0

    throw v0

    .line 607
    :cond_3
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->deleteCardFromDB(Ljava/lang/String;)V

    .line 609
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    .line 610
    iget v0, v6, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    iget v1, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    if-ne v0, v1, :cond_4

    iget-object v0, v6, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    iget-object v1, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 611
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 612
    monitor-exit v2

    return-void

    .line 614
    :cond_4
    goto :goto_0

    .line 615
    :cond_5
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v7

    monitor-exit v2

    throw v7

    .line 616
    :goto_1
    return-void
.end method

.method public removeCardByAid(Ljava/lang/String;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException;,
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException;
        }
    .end annotation

    .line 627
    sget-object v2, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListLock:Ljava/lang/Object;

    monitor-enter v2

    .line 628
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 629
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardListFromTa()Ljava/util/ArrayList;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    .line 631
    :cond_0
    const/4 v3, 0x0

    .line 632
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    .line 633
    iget-object v0, v5, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 634
    move-object v3, v5

    .line 636
    :cond_1
    goto :goto_0

    .line 637
    :cond_2
    const/4 v0, 0x0

    if-ne v0, v3, :cond_3

    .line 638
    const-string v0, "removeCardByAid failed, card is not exsit"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 639
    new-instance v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;-><init>()V

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;->newWalletTaCardNotExistException()Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException;

    move-result-object v0

    throw v0

    .line 641
    :cond_3
    const/4 v4, 0x0

    .line 642
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 643
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getTaCardInfoJsonStr()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/nfc/PluginPayAdapter;->deleteCard(Ljava/lang/String;)Z

    move-result v4

    .line 645
    :cond_4
    if-nez v4, :cond_5

    .line 646
    const-string v0, "removeCardByAid failed"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 647
    new-instance v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;-><init>()V

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;->newWalletTaCardNotExistException()Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException;

    move-result-object v0

    throw v0

    .line 650
    :cond_5
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    .line 651
    iget v0, v6, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    iget v1, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    if-ne v0, v1, :cond_6

    iget-object v0, v6, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    iget-object v1, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 652
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 653
    monitor-exit v2

    return-void

    .line 655
    :cond_6
    goto :goto_1

    .line 656
    :cond_7
    monitor-exit v2

    goto :goto_2

    :catchall_0
    move-exception v7

    monitor-exit v2

    throw v7

    .line 657
    :goto_2
    return-void
.end method

.method public removeFingerId()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException;
        }
    .end annotation

    .line 164
    return-void
.end method

.method public setDefaultCard(Ljava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException;,
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException;
        }
    .end annotation

    .line 176
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->removeDefaultCard()V

    .line 180
    sget-object v3, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListLock:Ljava/lang/Object;

    monitor-enter v3

    .line 181
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 182
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardListFromTa()Ljava/util/ArrayList;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    .line 184
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardFromCardListCache(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v2

    .line 185
    const/4 v0, 0x0

    if-ne v0, v2, :cond_1

    .line 186
    const-string v0, "setDefaultCard failed, card is not exsit"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 187
    new-instance v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;-><init>()V

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;->newWalletTaCardNotExistException()Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException;

    move-result-object v0

    throw v0

    .line 190
    :cond_1
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->updateCardDefault(Ljava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 191
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 193
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->isDefaultCard:Z

    .line 195
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->dbManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    iget-object v1, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->updateDefalutCardOrderInfo(Ljava/lang/String;)V

    .line 196
    return-void
.end method

.method public setFingerId(I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException;
        }
    .end annotation

    .line 143
    return-void
.end method

.method public unLockCardEvent(Ljava/lang/String;)V
    .locals 4

    .line 858
    const-string v0, "WalletTaManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "lockCardEvent.refId."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 859
    const/4 v0, 0x3

    invoke-virtual {p0, p1, v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardEvent(Ljava/lang/String;I)V

    .line 860
    return-void
.end method

.method public updateCardDefault(Ljava/lang/String;Z)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException;,
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException;
        }
    .end annotation

    .line 519
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "updateCardDefault ,referenceId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 520
    sget-object v2, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListLock:Ljava/lang/Object;

    monitor-enter v2

    .line 521
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 522
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardListFromTa()Ljava/util/ArrayList;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    .line 524
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardFromCardListCache(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v3

    .line 525
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 526
    const-string v0, "updateCardDefault failed, card is not exsit"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 527
    new-instance v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;-><init>()V

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;->newWalletTaCardNotExistException()Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException;

    move-result-object v0

    throw v0

    .line 529
    :cond_1
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->clone()Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v4

    .line 530
    iput-boolean p2, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->isDefaultCard:Z

    .line 531
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 532
    iput-wide v5, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->statusUpdateTime:J

    .line 534
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 535
    invoke-direct {p0, v4}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->recoverSNB(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)V

    .line 536
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getTaCardInfoJsonStr()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/nfc/PluginPayAdapter;->updateCardInfo(Ljava/lang/String;)Z

    move-result v7

    .line 537
    if-nez v7, :cond_2

    .line 538
    new-instance v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;-><init>()V

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;->newWalletTaCardNotExistException()Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException;

    move-result-object v0

    throw v0

    .line 542
    :cond_2
    iput-boolean p2, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->isDefaultCard:Z

    .line 543
    iput-wide v5, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->statusUpdateTime:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 544
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v8

    monitor-exit v2

    throw v8

    .line 545
    :goto_0
    return-void
.end method

.method public updateCardInfo(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)Z
    .locals 10

    .line 883
    sget-object v4, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListLock:Ljava/lang/Object;

    monitor-enter v4

    .line 884
    const-string v0, "WalletTaManager"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateCardInfo(),enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 886
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 887
    monitor-exit v4

    const/4 v0, 0x0

    return v0

    .line 890
    :cond_0
    :try_start_1
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getDpanDigest()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardFromCardListCache(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v5

    .line 892
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 893
    const-string v0, "updateCardDefault failed, card is not exsit"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 894
    monitor-exit v4

    const/4 v0, 0x0

    return v0

    .line 896
    :cond_1
    :try_start_2
    iget-boolean v0, v5, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->isSNB:Z

    if-eqz v0, :cond_2

    .line 897
    const/4 v0, 0x1

    iput-boolean v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->isSNB:Z

    .line 899
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 900
    iput-wide v6, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->statusUpdateTime:J

    .line 902
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 903
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->recoverSNB(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)V

    .line 904
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getTaCardInfoJsonStr()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/nfc/PluginPayAdapter;->updateCardInfo(Ljava/lang/String;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v8

    .line 905
    if-nez v8, :cond_3

    .line 906
    monitor-exit v4

    const/4 v0, 0x0

    return v0

    .line 911
    :cond_3
    :try_start_3
    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    iput-object v0, v5, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    .line 912
    iget v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    iput v0, v5, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    .line 913
    iget v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    iput v0, v5, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    .line 914
    iget v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardType:I

    iput v0, v5, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardType:I

    .line 915
    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    iput-object v0, v5, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    .line 916
    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanFour:Ljava/lang/String;

    iput-object v0, v5, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanFour:Ljava/lang/String;

    .line 917
    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanDigest:Ljava/lang/String;

    iput-object v0, v5, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanDigest:Ljava/lang/String;

    .line 918
    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanFour:Ljava/lang/String;

    iput-object v0, v5, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanFour:Ljava/lang/String;

    .line 919
    iget-boolean v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->isDefaultCard:Z

    iput-boolean v0, v5, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->isDefaultCard:Z

    .line 920
    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    iput-object v0, v5, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    .line 921
    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->productId:Ljava/lang/String;

    iput-object v0, v5, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->productId:Ljava/lang/String;

    .line 922
    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->Rf_file_name:Ljava/lang/String;

    iput-object v0, v5, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->Rf_file_name:Ljava/lang/String;

    .line 923
    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->background_file_name:Ljava/lang/String;

    iput-object v0, v5, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->background_file_name:Ljava/lang/String;

    .line 924
    iput-wide v6, v5, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->statusUpdateTime:J

    .line 925
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v5, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->name:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 926
    monitor-exit v4

    const/4 v0, 0x1

    return v0

    .line 927
    :catchall_0
    move-exception v9

    monitor-exit v4

    throw v9
.end method

.method public updateCardName(Ljava/lang/String;Ljava/lang/String;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException;,
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException;
        }
    .end annotation

    .line 482
    sget-object v2, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListLock:Ljava/lang/Object;

    monitor-enter v2

    .line 483
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 484
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardListFromTa()Ljava/util/ArrayList;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    .line 486
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardFromCardListCache(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v3

    .line 487
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 488
    const-string v0, "updateCardStatus failed, card is not exsit"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 489
    new-instance v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;-><init>()V

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;->newWalletTaCardNotExistException()Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException;

    move-result-object v0

    throw v0

    .line 491
    :cond_1
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->clone()Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v4

    .line 492
    iput-object p2, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->name:Ljava/lang/String;

    .line 493
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 494
    iput-wide v5, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->statusUpdateTime:J

    .line 496
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 497
    invoke-direct {p0, v4}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->recoverSNB(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)V

    .line 498
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getTaCardInfoJsonStr()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/nfc/PluginPayAdapter;->updateCardInfo(Ljava/lang/String;)Z

    move-result v7

    .line 499
    if-nez v7, :cond_2

    .line 500
    new-instance v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;-><init>()V

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;->newWalletTaCardNotExistException()Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException;

    move-result-object v0

    throw v0

    .line 504
    :cond_2
    iput-object p2, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->name:Ljava/lang/String;

    .line 505
    iput-wide v5, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->statusUpdateTime:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 506
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v8

    monitor-exit v2

    throw v8

    .line 507
    :goto_0
    return-void
.end method

.method public updateCardRFFileName(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)V
    .locals 4

    .line 873
    const-string v0, "WalletTaManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateCardRFFileName(),enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 874
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->updateCardInfo(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)Z

    .line 875
    return-void
.end method

.method public updateCardStatus(Ljava/lang/String;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException;,
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException;
        }
    .end annotation

    .line 445
    sget-object v2, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListLock:Ljava/lang/Object;

    monitor-enter v2

    .line 446
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 447
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardListFromTa()Ljava/util/ArrayList;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    .line 449
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardFromCardListCache(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v3

    .line 450
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 451
    const-string v0, "updateCardStatus failed, card is not exsit"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 452
    new-instance v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;-><init>()V

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;->newWalletTaCardNotExistException()Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException;

    move-result-object v0

    throw v0

    .line 454
    :cond_1
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->clone()Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v4

    .line 455
    iput p2, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    .line 456
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 457
    iput-wide v5, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->statusUpdateTime:J

    .line 458
    const/4 v7, 0x0

    .line 459
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 460
    invoke-direct {p0, v4}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->recoverSNB(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)V

    .line 461
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getTaCardInfoJsonStr()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/nfc/PluginPayAdapter;->updateCardInfo(Ljava/lang/String;)Z

    move-result v7

    .line 463
    :cond_2
    if-nez v7, :cond_3

    .line 464
    new-instance v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;-><init>()V

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;->newWalletTaCardNotExistException()Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException;

    move-result-object v0

    throw v0

    .line 467
    :cond_3
    iput p2, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    .line 468
    iput-wide v5, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->statusUpdateTime:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 469
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v8

    monitor-exit v2

    throw v8

    .line 470
    :goto_0
    return-void
.end method

.method public updateCardTimeStamp(Ljava/lang/String;J)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException;,
            Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException;
        }
    .end annotation

    .line 557
    sget-object v2, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListLock:Ljava/lang/Object;

    monitor-enter v2

    .line 558
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 559
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardListFromTa()Ljava/util/ArrayList;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListCache:Ljava/util/ArrayList;

    .line 561
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardFromCardListCache(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v3

    .line 562
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 563
    const-string v0, "updateCardTimeStamp failed, card is not exsit"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 564
    new-instance v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;-><init>()V

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;->newWalletTaCardNotExistException()Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException;

    move-result-object v0

    throw v0

    .line 566
    :cond_1
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->clone()Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v4

    .line 567
    iput-wide p2, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->statusUpdateTime:J

    .line 568
    const/4 v5, 0x0

    .line 569
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 570
    invoke-direct {p0, v4}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->recoverSNB(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)V

    .line 571
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getTaCardInfoJsonStr()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/nfc/PluginPayAdapter;->updateCardInfo(Ljava/lang/String;)Z

    move-result v5

    .line 573
    :cond_2
    if-nez v5, :cond_3

    .line 574
    new-instance v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;-><init>()V

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;->newWalletTaCardNotExistException()Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException;

    move-result-object v0

    throw v0

    .line 577
    :cond_3
    iput-wide p2, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->statusUpdateTime:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 578
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v2

    throw v6

    .line 579
    :goto_0
    return-void
.end method

.method public updateTaCardInfoForCUP(Ljava/lang/String;Ljava/lang/String;I)Z
    .locals 7

    .line 326
    sget-object v2, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardInfoListLock:Ljava/lang/Object;

    monitor-enter v2

    .line 327
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v3

    .line 328
    if-nez v3, :cond_0

    .line 329
    const-string v0, "updateCardForCUP target card does not exists."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 330
    monitor-exit v2

    const/4 v0, 0x0

    return v0

    .line 332
    :cond_0
    const/4 v4, 0x0

    .line 334
    :try_start_1
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->removeCard(Ljava/lang/String;)V
    :try_end_1
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 335
    const/4 v4, 0x1

    .line 340
    goto :goto_0

    .line 336
    :catch_0
    move-exception v5

    .line 337
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "updateCardForCUP remove card exception: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v5}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 340
    goto :goto_0

    .line 338
    :catch_1
    move-exception v5

    .line 339
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "updateCardForCUP remove card exception: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v5}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 342
    :goto_0
    if-eqz v4, :cond_1

    .line 343
    iput-object p2, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    .line 344
    iput p3, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 346
    :try_start_3
    invoke-virtual {p0, v3}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->addCard(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)V
    :try_end_3
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardAlreadyExistException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNumReachMaxException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaBadParammeterException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_3 .. :try_end_3} :catch_5
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 347
    monitor-exit v2

    const/4 v0, 0x1

    return v0

    .line 348
    :catch_2
    move-exception v5

    .line 349
    :try_start_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "updateCardForCUP add card exception: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v5}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 356
    goto :goto_1

    .line 350
    :catch_3
    move-exception v5

    .line 351
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "updateCardForCUP add card exception: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v5}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 356
    goto :goto_1

    .line 352
    :catch_4
    move-exception v5

    .line 353
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "updateCardForCUP add card exception: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v5}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 356
    goto :goto_1

    .line 354
    :catch_5
    move-exception v5

    .line 355
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "updateCardForCUP add card exception: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v5}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 358
    :cond_1
    :goto_1
    monitor-exit v2

    const/4 v0, 0x0

    return v0

    .line 359
    :catchall_0
    move-exception v6

    monitor-exit v2

    throw v6
.end method
