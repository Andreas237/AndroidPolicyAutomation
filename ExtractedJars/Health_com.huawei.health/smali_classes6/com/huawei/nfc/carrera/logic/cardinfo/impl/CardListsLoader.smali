.class public Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$LogoDownloadCallback;
    }
.end annotation


# static fields
.field private static final BUNDLE_KEY_BUSINESSCODE:Ljava/lang/String; = "businessCode"

.field private static final BUNDLE_KEY_CITYCODE:Ljava/lang/String; = "bundle_key_citycode"

.field private static final BUNDLE_KEY_DEFAULT_REFID:Ljava/lang/String; = "set_default_ref_id"

.field private static final BUNDLE_KEY_DEFAULT_TIMESTAMP:Ljava/lang/String; = "update_card_timestamp"

.field private static final BUNDLE_KEY_ISSUERID:Ljava/lang/String; = "issuerId"

.field private static final BUNDLE_KEY_NOTICETYPE:Ljava/lang/String; = "noticeType"

.field private static final CARD_LIST_DB_LOAD:I = 0x1

.field private static final CARD_LIST_DB_REFRESH:I = 0x2

.field public static final INCONSISTENT_ACCOUNTS_ATYPISM_STATUS:I = 0x186a4

.field private static final QUERY_BANK_CARD_INFO:I = 0x8

.field private static final QUERY_BANK_ISSUER_INFO:I = 0x7

.field private static final QUERY_CARD_NOTICE:I = 0x10

.field private static final QUERY_CARD_TRANSFER_ABILITY:I = 0xf

.field private static final QUERY_SUPPORTED_BANK:I = 0x9

.field private static final QUERY_SUPPORTED_TRAFFIC:I = 0xa

.field private static final QUERY_TRAFFIC_CARD_INFO:I = 0xb

.field private static final REFRESH_RFCONF_FILES:I = 0xc

.field private static final TAG:Ljava/lang/String; = "CardListsLoader"

.field private static final UPDATE_CARD_STIMESTAMP:I = 0x5

.field private static pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter; = null

.field private static threadPool:Ljava/util/concurrent/ExecutorService; = null


# instance fields
.field private final cardDBManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

.field private final cardPicRescManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

.field private hasSyncRFConf:Z

.field private final mContext:Landroid/content/Context;

.field private final mInfoCache:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;

.field mRefreshLocalIconCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;

.field private final mSpiOperatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;

.field private mSyncRFConfFilesCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncRFConfFilesCallback;

.field private final mUIHandler:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

.field private updateCardTimeStampCallbacks:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/UpdateCardTimeStampCallback;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 204
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->threadPool:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;)V
    .locals 1

    .line 215
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 728
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$2;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$2;-><init>(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mSyncRFConfFilesCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncRFConfFilesCallback;

    .line 777
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$LogoDownloadCallback;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$LogoDownloadCallback;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mRefreshLocalIconCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;

    .line 216
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mContext:Landroid/content/Context;

    .line 217
    new-instance v0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    invoke-direct {v0, p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->cardDBManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    .line 218
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->cardPicRescManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    .line 219
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->updateCardTimeStampCallbacks:Ljava/util/Map;

    .line 220
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mUIHandler:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    .line 221
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;

    invoke-direct {v0, p1, p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mSpiOperatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;

    .line 222
    invoke-static {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mInfoCache:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;

    .line 224
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->initPluginPay()V

    .line 225
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;)Landroid/content/Context;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;)Z
    .locals 1

    .line 80
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->hasSyncRFConf:Z

    return v0
.end method

.method static synthetic access$102(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;Z)Z
    .locals 0

    .line 80
    iput-boolean p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->hasSyncRFConf:Z

    return p1
.end method

.method static synthetic access$200()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 80
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->threadPool:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method private checkDefaultCard(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/wallet/model/unicard/UniCardInfo;>;)V"
        }
    .end annotation

    .line 431
    const/4 v4, 0x0

    .line 432
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/wallet/model/unicard/UniCardInfo;

    .line 434
    invoke-virtual {v6}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b()I

    move-result v0

    const/4 v1, 0x2

    if-eq v1, v0, :cond_0

    .line 436
    goto :goto_0

    .line 439
    :cond_0
    invoke-virtual {v6}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 441
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "default card existed, aid: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 442
    const/4 v4, 0x0

    .line 443
    goto :goto_2

    .line 446
    :cond_1
    const/4 v0, 0x0

    if-ne v0, v4, :cond_2

    .line 448
    move-object v4, v6

    goto :goto_1

    .line 452
    :cond_2
    invoke-virtual {v6}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->l()J

    move-result-wide v0

    invoke-virtual {v4}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->l()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    .line 454
    move-object v4, v6

    .line 457
    :cond_3
    :goto_1
    goto :goto_0

    .line 459
    :cond_4
    :goto_2
    const/4 v0, 0x0

    if-eq v0, v4, :cond_5

    .line 461
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "set card default automatically, aid: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 462
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->a(Z)V

    .line 466
    move-object v5, v4

    .line 467
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->threadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$1;

    invoke-direct {v1, p0, v5}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$1;-><init>(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;Lcom/huawei/wallet/model/unicard/UniCardInfo;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 481
    :cond_5
    return-void
.end method

.method private convertFromCardTAList(Ljava/util/List;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;>;)Ljava/util/List<Lcom/huawei/wallet/model/unicard/UniCardInfo;>;"
        }
    .end annotation

    .line 611
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 612
    const/4 v6, 0x0

    .line 613
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    .line 614
    invoke-static {v8}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/LogicModelConverter;->convertToUniCardInfo(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)Lcom/huawei/wallet/model/unicard/UniCardInfo;

    move-result-object v6

    .line 615
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->cardPicRescManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    iget-object v1, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->productId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->getCardIconDirPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 616
    invoke-virtual {v6, v9}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->k(Ljava/lang/String;)V

    .line 618
    iget v0, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 619
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_description_activited:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    goto :goto_1

    .line 620
    :cond_0
    iget v0, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 621
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_description_unactivited:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    goto :goto_1

    .line 622
    :cond_1
    iget v0, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x63

    if-eq v0, v1, :cond_2

    iget v0, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x5c

    if-eq v0, v1, :cond_2

    iget v0, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x60

    if-eq v0, v1, :cond_2

    iget v0, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x5f

    if-ne v0, v1, :cond_3

    .line 626
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_locked:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    goto :goto_1

    .line 628
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_description_unused:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 631
    :goto_1
    iget v0, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 632
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_num_show:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanFour:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->d(Ljava/lang/String;)V

    goto :goto_2

    .line 634
    :cond_4
    iget-object v0, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanFour:Ljava/lang/String;

    invoke-virtual {v6, v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->d(Ljava/lang/String;)V

    .line 637
    :goto_2
    invoke-virtual {v6, v10}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->c(Ljava/lang/String;)V

    .line 638
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 639
    goto/16 :goto_0

    .line 641
    :cond_5
    return-object v5
.end method

.method private filterCardList(Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;>;)V"
        }
    .end annotation

    .line 540
    const-string v0, "the card in TA filterCardList"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 541
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->initPluginPay()V

    .line 542
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 543
    const/4 v5, 0x0

    .line 544
    const/4 v6, -0x1

    .line 545
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 546
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    .line 547
    const-string v0, "CardListsLoader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "filterCardList taCardInfo="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 548
    iget v0, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x62

    if-eq v1, v0, :cond_0

    iget v0, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x61

    if-eq v1, v0, :cond_0

    iget v0, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x60

    if-eq v1, v0, :cond_0

    iget v0, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x5f

    if-ne v1, v0, :cond_1

    .line 552
    :cond_0
    const-string v0, "Cup error card existed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 553
    const/4 v5, 0x1

    .line 556
    :cond_1
    iget v0, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    iget v0, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    iget v0, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x63

    if-eq v0, v1, :cond_2

    iget v0, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x5c

    if-eq v0, v1, :cond_2

    iget v0, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x5f

    if-eq v0, v1, :cond_2

    iget v0, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x60

    if-eq v0, v1, :cond_2

    iget v0, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x61

    if-eq v0, v1, :cond_2

    iget v0, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x5e

    if-eq v0, v1, :cond_2

    iget v0, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x62

    if-eq v0, v1, :cond_2

    iget v0, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0xb

    if-eq v0, v1, :cond_2

    iget v0, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0xc

    if-eq v0, v1, :cond_2

    iget v0, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0xd

    if-eq v0, v1, :cond_2

    iget v0, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x5d

    if-eq v0, v1, :cond_2

    iget v0, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v8, 0x1

    goto :goto_1

    :cond_2
    const/4 v8, 0x0

    .line 570
    :goto_1
    if-eqz v8, :cond_3

    .line 571
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "The card should not be showed, aid: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " and status: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 573
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    goto/16 :goto_2

    .line 575
    :cond_3
    iget v0, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_6

    .line 577
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 578
    const-string v0, "CardListsLoader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pluginPayAdapter is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 579
    return-void

    .line 581
    :cond_4
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v0}, Lcom/huawei/nfc/PluginPayAdapter;->getUserID()Ljava/lang/String;

    move-result-object v9

    .line 583
    const-string v0, "CardListsLoader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "== checkWatchStatus userID : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",mAcountStatus="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 585
    const/4 v0, 0x1

    invoke-static {v9, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_5

    const/4 v0, -0x1

    if-ne v0, v6, :cond_5

    .line 586
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v0, v9}, Lcom/huawei/nfc/PluginPayAdapter;->sendAccount(Ljava/lang/String;)I

    move-result v6

    .line 587
    const-string v0, "CardListsLoader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter filterCardList ,mAcountStatus="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 589
    :cond_5
    const-string v0, "CardListsLoader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "== checkWatchStatus sendAccount  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 590
    const v0, 0x186a4

    if-ne v0, v6, :cond_6

    .line 592
    const-string v0, "enter getCacheAccountstate"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 593
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    .line 596
    :cond_6
    :goto_2
    goto/16 :goto_0

    .line 597
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "enter isCupErrorCardExisted="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 598
    if-eqz v5, :cond_8

    .line 600
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->checkCUPInterruptedCard(ZLcom/huawei/nfc/carrera/logic/cardoperate/response/CheckCUPCardCallback;)V

    .line 602
    :cond_8
    return-void
.end method

.method private getBankCardInfo(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankCardInfoCallback;)V
    .locals 9

    .line 956
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v3

    .line 957
    if-nez v3, :cond_0

    .line 958
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mUIHandler:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->handleQueryBankCardInfoResult(ILcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankCardInfoCallback;)V

    .line 959
    return-void

    .line 961
    :cond_0
    iget-object v4, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    .line 962
    iget-object v5, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->productId:Ljava/lang/String;

    .line 963
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 964
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mUIHandler:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->handleQueryBankCardInfoResult(ILcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankCardInfoCallback;)V

    .line 965
    return-void

    .line 967
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mInfoCache:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;

    invoke-virtual {v0, v4}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->cacheIssuerInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    move-result-object v6

    .line 968
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mInfoCache:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;

    invoke-virtual {v0, v5}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->cacheCardProductInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;

    move-result-object v7

    .line 970
    const/4 v0, 0x0

    if-ne v0, v6, :cond_4

    .line 971
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/ecz;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 972
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mUIHandler:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    const/4 v1, -0x2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->handleQueryBankCardInfoResult(ILcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankCardInfoCallback;)V

    goto :goto_0

    .line 975
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mUIHandler:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->handleQueryBankCardInfoResult(ILcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankCardInfoCallback;)V

    .line 978
    :goto_0
    return-void

    .line 981
    :cond_4
    new-instance v8, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;

    invoke-direct {v8, v3, v6, v7}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;-><init>(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;)V

    .line 982
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->cardPicRescManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v5, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->getCardIcon(Ljava/lang/String;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, v8, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;->cardIcon:Landroid/graphics/Bitmap;

    .line 983
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mUIHandler:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v8, p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->handleQueryBankCardInfoResult(ILcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankCardInfoCallback;)V

    .line 984
    return-void
.end method

.method private getBankIssuerInfo(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankIssuerInfoCallback;)V
    .locals 5

    .line 943
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mInfoCache:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->cacheIssuerInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    move-result-object v3

    .line 944
    if-nez v3, :cond_0

    .line 945
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mUIHandler:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->handleQueryBankIssuerInfoResult(ILcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankIssuerInfoCallback;)V

    .line 946
    return-void

    .line 948
    :cond_0
    new-instance v4, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;

    invoke-direct {v4, v3}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;-><init>(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)V

    .line 949
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->cardPicRescManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->getCardLogo(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->setLogoIcon(Landroid/graphics/Bitmap;)V

    .line 950
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->cardPicRescManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAppInfos()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->getCardApkIcons(Ljava/util/List;)V

    .line 951
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mUIHandler:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    .line 952
    const/4 v1, 0x0

    invoke-virtual {v0, v1, v4, p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->handleQueryBankIssuerInfoResult(ILcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankIssuerInfoCallback;)V

    .line 953
    return-void
.end method

.method private getSupportNFCBankInfos(Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QuerySupportBankInfoCallback;)V
    .locals 3

    .line 987
    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedBankCardListTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mContext:Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedBankCardListTask;-><init>(Landroid/content/Context;)V

    .line 988
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->getSupportedCardList()Ljava/util/Map;

    move-result-object v2

    .line 989
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mUIHandler:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    invoke-virtual {v0, v2, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->handleQuerySupportedBankCardInfoResult(Ljava/util/Map;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QuerySupportBankInfoCallback;)V

    .line 990
    return-void
.end method

.method private getSupportTrafficCardList(Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QuerySupportedTrafficCardListCallback;)V
    .locals 3

    .line 993
    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedTrafficCardListTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mContext:Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedTrafficCardListTask;-><init>(Landroid/content/Context;)V

    .line 994
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;->getSupportedCardList()Ljava/util/Map;

    move-result-object v2

    .line 995
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mUIHandler:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    invoke-virtual {v0, v2, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->handleQuerySupportedTrafficCardsResult(Ljava/util/Map;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QuerySupportedTrafficCardListCallback;)V

    .line 996
    return-void
.end method

.method private getTrafficCardinfo(Ljava/lang/String;ILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryTrafficCardInfoCallback;)V
    .locals 10

    .line 999
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CardListsLoader getTrafficCardinfo begin,businessCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "issuerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1000
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1001
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mUIHandler:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p4}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->handleQueryTrafficCardInfoResult(ILcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryTrafficCardInfoCallback;)V

    .line 1002
    return-void

    .line 1005
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mInfoCache:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->cacheIssuerInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    move-result-object v3

    .line 1006
    if-nez v3, :cond_2

    .line 1007
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CardListsLoader getTrafficCardinfo failed. issuer info does not exists. issuerId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 1009
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/ecz;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1010
    const-string v0, "processTask, no network."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 1011
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mUIHandler:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    const/4 v1, -0x2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p4}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->handleQueryTrafficCardInfoResult(ILcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryTrafficCardInfoCallback;)V

    .line 1013
    return-void

    .line 1015
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mUIHandler:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p4}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->handleQueryTrafficCardInfoResult(ILcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryTrafficCardInfoCallback;)V

    .line 1016
    return-void

    .line 1018
    :cond_2
    const/4 v4, 0x0

    .line 1019
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getProductId()Ljava/lang/String;

    move-result-object v5

    .line 1020
    const/4 v0, 0x1

    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1021
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mUIHandler:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p4}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->handleQueryTrafficCardInfoResult(ILcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryTrafficCardInfoCallback;)V

    .line 1022
    return-void

    .line 1024
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mInfoCache:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->loadLocalCardProductInfo()V

    .line 1025
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mInfoCache:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;

    invoke-virtual {v0, v5}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->cacheCardProductInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;

    move-result-object v4

    .line 1026
    if-nez v4, :cond_5

    .line 1027
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CardListsLoader getTrafficCardinfo failed. card info does not exists. productId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 1029
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/ecz;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1030
    const-string v0, "processTask, no network."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 1031
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mUIHandler:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    const/4 v1, -0x2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p4}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->handleQueryTrafficCardInfoResult(ILcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryTrafficCardInfoCallback;)V

    .line 1033
    return-void

    .line 1035
    :cond_4
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mUIHandler:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p4}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->handleQueryTrafficCardInfoResult(ILcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryTrafficCardInfoCallback;)V

    .line 1036
    return-void

    .line 1038
    :cond_5
    new-instance v6, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-direct {v6, v3, v4}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;-><init>(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;)V

    .line 1039
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->cardPicRescManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->getProductId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->getCardIcon(Ljava/lang/String;I)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->setCardIcon(Landroid/graphics/Bitmap;)V

    .line 1040
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->cardPicRescManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->getCardLogo(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->setCardLogo(Landroid/graphics/Bitmap;)V

    .line 1041
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mUIHandler:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v6, p4}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->handleQueryTrafficCardInfoResult(ILcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryTrafficCardInfoCallback;)V

    .line 1042
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardInfoByAid(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v7

    .line 1043
    if-eqz v7, :cond_6

    .line 1045
    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getFpanFour()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->setCardNum(Ljava/lang/String;)V

    .line 1046
    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getCardStatus()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->setCardStatus(I)V

    .line 1049
    :cond_6
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getMode()I

    move-result v8

    .line 1050
    const/4 v9, 0x0

    .line 1051
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 1053
    :pswitch_0
    invoke-direct {p0, v8, p3, v3, v6}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->handleSpecialOpenCardBusiness(ILjava/lang/String;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;)I

    move-result v9

    .line 1054
    goto :goto_0

    .line 1056
    :pswitch_1
    invoke-direct {p0, v8, v3, v6}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->handleSpecialRechargeBusiness(ILcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;)I

    move-result v9

    .line 1057
    goto :goto_0

    .line 1059
    :pswitch_2
    invoke-direct {p0, v8, v3, v6}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->handleSpecialOpenCardAndRechargeBusiness(ILcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;)I

    move-result v9

    .line 1060
    .line 1065
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mUIHandler:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    invoke-virtual {v0, v9, v6, p4}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->handleQueryTrafficCardInfoResult(ILcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryTrafficCardInfoCallback;)V

    .line 1066
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private handleSpecialOpenCardAndRechargeBusiness(ILcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;)I
    .locals 17

    .line 1213
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mSpiOperatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;

    move/from16 v1, p1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;->getTrafficCardOpertor(I)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;

    move-result-object v4

    .line 1214
    if-nez v4, :cond_0

    .line 1216
    const/4 v0, 0x0

    return v0

    .line 1218
    :cond_0
    const-string v0, ""

    move-object/from16 v1, p2

    invoke-interface {v4, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;->getIssueCardCoupon(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;

    move-result-object v5

    .line 1219
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getReturnCd()I

    move-result v0

    if-eqz v0, :cond_3

    .line 1220
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getReturnCd()I

    move-result v0

    const/16 v1, 0xb

    if-ne v0, v1, :cond_1

    .line 1221
    const/4 v0, -0x2

    return v0

    .line 1222
    :cond_1
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getReturnCd()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 1224
    const/4 v0, 0x0

    return v0

    .line 1226
    :cond_2
    const/4 v0, -0x1

    return v0

    .line 1232
    :cond_3
    :try_start_0
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getIssueActAmount()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v6

    .line 1233
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getIssueStdAmount()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v8

    .line 1238
    goto :goto_0

    .line 1234
    :catch_0
    move-exception v10

    .line 1235
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleSpecialOpenCardAndRechargeBusiness exception need check the config. issueCardCost = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1236
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getIssueActAmount()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1235
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 1237
    const/4 v0, -0x1

    return v0

    .line 1239
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleSpecialOpenCardAndRechargeBusiness issueCardCost = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ,issueStdCost = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1241
    move-object/from16 v0, p2

    invoke-interface {v4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;->getRechargeCoupon(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;

    move-result-object v10

    .line 1242
    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getReturnCd()I

    move-result v0

    if-eqz v0, :cond_6

    .line 1243
    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getReturnCd()I

    move-result v0

    const/16 v1, 0xb

    if-ne v0, v1, :cond_4

    .line 1244
    const/4 v0, -0x2

    return v0

    .line 1245
    :cond_4
    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getReturnCd()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 1247
    const/4 v0, 0x0

    return v0

    .line 1249
    :cond_5
    const/4 v0, -0x1

    return v0

    .line 1251
    :cond_6
    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getRechargeStdAmounts()[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getRechargeActAmounts()[Ljava/lang/String;

    move-result-object v1

    array-length v1, v1

    if-eq v0, v1, :cond_7

    .line 1253
    const-string v0, "handleSpecialOpenCardAndRechargeBusiness failed. amounts config error."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 1254
    const/4 v0, -0x1

    return v0

    .line 1256
    :cond_7
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->clearRechargeAmounts()V

    .line 1257
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getIssueAmounts()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1258
    const/4 v11, 0x0

    .line 1259
    const/4 v12, 0x0

    .line 1260
    const/4 v13, 0x0

    .line 1261
    const/4 v14, 0x0

    .line 1262
    const/4 v15, 0x0

    :goto_1
    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getRechargeStdAmounts()[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    if-ge v15, v0, :cond_8

    .line 1264
    :try_start_1
    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getRechargeStdAmounts()[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, v15

    move-object v13, v0

    .line 1265
    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getRechargeActAmounts()[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, v15

    move-object v14, v0

    .line 1266
    new-instance v11, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;

    invoke-direct {v11}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;-><init>()V

    .line 1267
    invoke-static {v14}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v11, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;->setPayMoney(D)V

    .line 1268
    invoke-static {v13}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v11, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;->setRechargeMoney(D)V

    .line 1269
    new-instance v12, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;

    invoke-direct {v12}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;-><init>()V

    .line 1270
    invoke-virtual {v12, v6, v7}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->setIssueMoney(D)V

    .line 1271
    invoke-virtual {v12, v8, v9}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->setIssueStdMoney(D)V

    .line 1272
    invoke-static {v14}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v12, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->setRechargeMoney(D)V

    .line 1273
    invoke-virtual {v12}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getIssueMoney()D

    move-result-wide v0

    invoke-virtual {v12}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getRechargeMoney()D

    move-result-wide v2

    add-double/2addr v0, v2

    invoke-virtual {v12, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->setPayMoney(D)V

    .line 1274
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleSpecialOpenCardAndRechargeBusiness issueMoney.getIssueMoney() = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v12}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getIssueMoney()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ,issueMoney.getRechargeMoney() = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1275
    invoke-virtual {v12}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getRechargeMoney()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1274
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1280
    goto :goto_2

    .line 1276
    :catch_1
    move-exception v16

    .line 1277
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleSpecialOpenCardAndRechargeBusiness exception. stdAmount = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " actAmount = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 1279
    const/4 v0, -0x1

    return v0

    .line 1281
    :goto_2
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getRechargeAmounts()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1282
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getIssueAmounts()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1262
    add-int/lit8 v15, v15, 0x1

    goto/16 :goto_1

    .line 1284
    :cond_8
    const/4 v0, 0x0

    return v0
.end method

.method private handleSpecialOpenCardBusiness(ILjava/lang/String;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;)I
    .locals 20

    .line 1111
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mSpiOperatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;

    move/from16 v1, p1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;->getTrafficCardOpertor(I)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;

    move-result-object v2

    .line 1112
    if-nez v2, :cond_0

    .line 1114
    const/4 v0, 0x0

    return v0

    .line 1116
    :cond_0
    move-object/from16 v0, p2

    move-object/from16 v1, p3

    invoke-interface {v2, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;->getIssueCardCoupon(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;

    move-result-object v3

    .line 1117
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getReturnCd()I

    move-result v0

    if-eqz v0, :cond_3

    .line 1118
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getReturnCd()I

    move-result v0

    const/16 v1, 0xb

    if-ne v0, v1, :cond_1

    .line 1119
    const/4 v0, -0x2

    return v0

    .line 1120
    :cond_1
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getReturnCd()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 1122
    const/4 v0, 0x0

    return v0

    .line 1124
    :cond_2
    const/4 v0, -0x1

    return v0

    .line 1129
    :cond_3
    :try_start_0
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getProductCode()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p4

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->setProductCode(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1132
    goto :goto_0

    .line 1130
    :catch_0
    move-exception v4

    .line 1131
    const/4 v0, -0x1

    return v0

    .line 1134
    :goto_0
    const-string v0, "t_fdw_lingnantong"

    invoke-virtual/range {p3 .. p3}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1135
    const/4 v0, 0x0

    return v0

    .line 1139
    :cond_4
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getIssueActAmount()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v4

    .line 1140
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getIssueStdAmount()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v6

    .line 1142
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1143
    const-wide/16 v0, 0x0

    cmpg-double v0, v4, v0

    if-ltz v0, :cond_5

    const-wide/16 v0, 0x0

    cmpg-double v0, v6, v0

    if-gez v0, :cond_6

    .line 1144
    :cond_5
    const/4 v0, -0x1

    return v0

    .line 1148
    :cond_6
    const/4 v9, 0x0

    .line 1149
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getRechargeStdAmounts()[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_b

    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getRechargeActAmounts()[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_b

    .line 1150
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getRechargeStdAmounts()[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    if-eqz v0, :cond_b

    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getRechargeActAmounts()[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    if-eqz v0, :cond_b

    .line 1151
    const-string v0, "handleSpecialRechargeBusiness success. SP"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 1152
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getRechargeStdAmounts()[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getRechargeActAmounts()[Ljava/lang/String;

    move-result-object v1

    array-length v1, v1

    if-eq v0, v1, :cond_7

    .line 1153
    const/4 v0, -0x1

    return v0

    .line 1155
    :cond_7
    const-wide/high16 v10, -0x4010000000000000L    # -1.0

    .line 1156
    const-wide/high16 v12, -0x4010000000000000L    # -1.0

    .line 1157
    const/4 v14, 0x0

    :goto_1
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getRechargeStdAmounts()[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    if-ge v14, v0, :cond_a

    .line 1158
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getRechargeStdAmounts()[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, v14

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v10

    .line 1159
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getRechargeActAmounts()[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, v14

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v12

    .line 1160
    const-wide/16 v0, 0x0

    cmpg-double v0, v10, v0

    if-ltz v0, :cond_8

    const-wide/16 v0, 0x0

    cmpg-double v0, v12, v0

    if-gez v0, :cond_9

    .line 1161
    :cond_8
    const/4 v0, -0x1

    return v0

    .line 1163
    :cond_9
    new-instance v9, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;

    invoke-direct {v9}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;-><init>()V

    .line 1164
    invoke-virtual {v9, v6, v7}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->setIssueStdMoney(D)V

    .line 1165
    invoke-virtual {v9, v4, v5}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->setIssueMoney(D)V

    .line 1166
    invoke-virtual {v9, v10, v11}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->setRechargeMoney(D)V

    .line 1167
    add-double v0, v4, v12

    invoke-virtual {v9, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->setPayMoney(D)V

    .line 1168
    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1157
    add-int/lit8 v14, v14, 0x1

    goto :goto_1

    .line 1170
    :cond_a
    goto/16 :goto_3

    .line 1171
    :cond_b
    const-string v0, "handleSpecialRechargeBusiness success. WS"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 1172
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mInfoCache:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;

    invoke-virtual/range {p3 .. p3}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getProductId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->cacheCardProductInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;

    move-result-object v10

    .line 1173
    if-nez v10, :cond_c

    .line 1174
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryTrafficCardIssueMoneyTask.change2IssueMoney getIssueCardCoupon failed.CardProductInfoItem for productId<"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {p3 .. p3}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getProductId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "> is not exists."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 1176
    invoke-static {v11}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 1177
    const/16 v0, 0x63

    return v0

    .line 1179
    :cond_c
    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->getIssueCardRechargeAmounts()[Ljava/lang/String;

    move-result-object v11

    .line 1180
    if-eqz v11, :cond_d

    array-length v0, v11

    if-gtz v0, :cond_e

    .line 1181
    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryTrafficCardIssueMoneyTask.change2IssueMoney getIssueCardCoupon failed.rechargeMoneys not config for productId<"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {p3 .. p3}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getProductId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 1182
    invoke-static {v12}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 1183
    const/16 v0, 0x63

    return v0

    .line 1185
    :cond_e
    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->getIssueCardStdCost()I

    move-result v0

    int-to-double v6, v0

    .line 1186
    const-wide/16 v12, 0x0

    .line 1187
    const-wide/16 v14, 0x0

    .line 1188
    move-object/from16 v16, v11

    move-object/from16 v0, v16

    array-length v0, v0

    move/from16 v17, v0

    const/16 v18, 0x0

    :goto_2
    move/from16 v0, v18

    move/from16 v1, v17

    if-ge v0, v1, :cond_f

    aget-object v19, v16, v18

    .line 1189
    new-instance v9, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;

    invoke-direct {v9}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;-><init>()V

    .line 1190
    invoke-virtual {v9, v6, v7}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->setIssueStdMoney(D)V

    .line 1191
    invoke-virtual {v9, v4, v5}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->setIssueMoney(D)V

    .line 1192
    invoke-static/range {v19 .. v19}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v14

    .line 1193
    invoke-virtual {v9, v14, v15}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->setRechargeMoney(D)V

    .line 1195
    add-double v12, v14, v4

    .line 1196
    invoke-virtual {v9, v12, v13}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->setPayMoney(D)V

    .line 1197
    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1188
    add-int/lit8 v18, v18, 0x1

    goto :goto_2

    .line 1200
    :cond_f
    :goto_3
    move-object/from16 v0, p4

    invoke-virtual {v0, v8}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->setIssueAmounts(Ljava/util/List;)V

    .line 1201
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleSpecialGetDetailBusiness TrafficCardInfo info.getIssueAmounts ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {p4 .. p4}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getIssueAmounts()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1202
    const/4 v0, 0x0

    return v0
.end method

.method private handleSpecialRechargeBusiness(ILcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;)I
    .locals 9

    .line 1069
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mSpiOperatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;->getTrafficCardOpertor(I)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;

    move-result-object v2

    .line 1070
    if-nez v2, :cond_0

    .line 1072
    const/4 v0, 0x0

    return v0

    .line 1074
    :cond_0
    invoke-interface {v2, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardOperator;->getRechargeCoupon(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;

    move-result-object v3

    .line 1075
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getReturnCd()I

    move-result v0

    if-eqz v0, :cond_3

    .line 1076
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getReturnCd()I

    move-result v0

    const/16 v1, 0xb

    if-ne v0, v1, :cond_1

    .line 1077
    const/4 v0, -0x2

    return v0

    .line 1078
    :cond_1
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getReturnCd()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 1080
    const/4 v0, 0x0

    return v0

    .line 1082
    :cond_2
    const/4 v0, -0x1

    return v0

    .line 1084
    :cond_3
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getRechargeStdAmounts()[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getRechargeActAmounts()[Ljava/lang/String;

    move-result-object v1

    array-length v1, v1

    if-eq v0, v1, :cond_4

    .line 1086
    const-string v0, "handleSpecialRechargeBusiness failed. amounts config error."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 1087
    const/4 v0, -0x1

    return v0

    .line 1089
    :cond_4
    invoke-virtual {p3}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->clearRechargeAmounts()V

    .line 1090
    const/4 v4, 0x0

    .line 1091
    const/4 v5, 0x0

    .line 1092
    const/4 v6, 0x0

    .line 1093
    const/4 v7, 0x0

    :goto_0
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getRechargeStdAmounts()[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    if-ge v7, v0, :cond_5

    .line 1095
    :try_start_0
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getRechargeStdAmounts()[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, v7

    move-object v5, v0

    .line 1096
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->getRechargeActAmounts()[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, v7

    move-object v6, v0

    .line 1097
    new-instance v4, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;

    invoke-direct {v4}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;-><init>()V

    .line 1098
    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;->setPayMoney(D)V

    .line 1099
    invoke-static {v5}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;->setRechargeMoney(D)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1104
    goto :goto_1

    .line 1100
    :catch_0
    move-exception v8

    .line 1101
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleSpecialRechargeBusiness exception. stdAmount = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " actAmount = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 1103
    const/4 v0, -0x1

    return v0

    .line 1105
    :goto_1
    invoke-virtual {p3}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getRechargeAmounts()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1093
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 1107
    :cond_5
    const/4 v0, 0x0

    return v0
.end method

.method private initCardOrder(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;>;)V"
        }
    .end annotation

    .line 484
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->cardDBManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->queryCardOrderInfo()Ljava/util/ArrayList;

    move-result-object v4

    .line 486
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 487
    const-string v0, "CardListsLoader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ll == cardOrderInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 488
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->initCardOrderDB(Ljava/util/List;)V

    goto :goto_0

    .line 491
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->cardDBManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->deleteAllCardOrderInfos()V

    .line 492
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->initCardOrderDB(Ljava/util/List;)V

    .line 495
    :goto_0
    return-void
.end method

.method private initCardOrderDB(Ljava/util/List;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;>;)V"
        }
    .end annotation

    .line 499
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 500
    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 501
    const-wide/16 v4, 0x0

    .line 502
    const-wide/16 v6, 0x0

    .line 503
    const/4 v8, 0x0

    .line 504
    const/4 v9, 0x0

    .line 505
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v10

    .line 506
    const/4 v11, 0x0

    :goto_0
    if-ge v11, v10, :cond_3

    .line 507
    invoke-interface {p1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    .line 508
    const/4 v13, 0x0

    .line 510
    iget-boolean v0, v12, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->isDefaultCard:Z

    if-eqz v0, :cond_0

    .line 511
    iget-wide v6, v12, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->statusUpdateTime:J

    .line 512
    move v9, v11

    .line 514
    :cond_0
    if-nez v11, :cond_1

    .line 516
    iget-wide v4, v12, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->statusUpdateTime:J

    goto :goto_1

    .line 517
    :cond_1
    iget-wide v0, v12, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->statusUpdateTime:J

    cmp-long v0, v0, v4

    if-gez v0, :cond_2

    .line 519
    iget-wide v4, v12, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->statusUpdateTime:J

    .line 520
    move v8, v11

    .line 522
    :cond_2
    :goto_1
    new-instance v13, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;

    iget-object v0, v12, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    iget-wide v1, v12, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->statusUpdateTime:J

    invoke-direct {v13, v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;-><init>(Ljava/lang/String;J)V

    .line 523
    invoke-interface {v3, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 506
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 525
    :cond_3
    cmp-long v0, v6, v4

    if-lez v0, :cond_4

    .line 527
    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;

    invoke-virtual {v0, v4, v5}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->setTimestamp(J)V

    .line 528
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;

    invoke-virtual {v0, v6, v7}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->setTimestamp(J)V

    .line 531
    :cond_4
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->cardDBManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    invoke-virtual {v0, v3}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->insertOrUpdateCardOrderInfos(Ljava/util/List;)V

    .line 532
    return-void
.end method

.method private initPluginPay()V
    .locals 2

    .line 229
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v1

    .line 230
    invoke-virtual {v1}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/PluginPayAdapter;

    sput-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    .line 231
    return-void
.end method

.method private loadCardListData()V
    .locals 6

    .line 391
    const-string v0, "CardListsLoader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadCardListData   enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 393
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardList()Ljava/util/ArrayList;

    move-result-object v4

    .line 394
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getWalletAbility()Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;

    .line 397
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 398
    :cond_0
    const-string v0, "CardListsLoader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadCardListData, but TA is empty."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 400
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->cardListLoaded(Ljava/util/List;)V

    .line 401
    return-void

    .line 403
    :cond_1
    const-string v0, "CardListsLoader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "loadCardListData , taCardInfos.size= "

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

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 405
    invoke-direct {p0, v4}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->initCardOrder(Ljava/util/List;)V

    .line 408
    invoke-direct {p0, v4}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->filterCardList(Ljava/util/List;)V

    .line 411
    invoke-direct {p0, v4}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->convertFromCardTAList(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    .line 412
    const-string v0, "CardListsLoader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "befor sort loadCardListData lists="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 414
    invoke-direct {p0, v5}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->checkDefaultCard(Ljava/util/List;)V

    .line 417
    invoke-direct {p0, v5}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->sortCardList(Ljava/util/List;)V

    .line 418
    const-string v0, "CardListsLoader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stop sort loadCardListData lists="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 420
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->cardListLoaded(Ljava/util/List;)V

    .line 424
    return-void
.end method

.method private refreshCardListDB()V
    .locals 1

    .line 716
    const-string v0, "refreshCardListDB"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 719
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mInfoCache:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->loadLocalIssuerInfo()V

    .line 721
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mInfoCache:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->loadLocalCardProductInfo()V

    .line 723
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->refreshLocalCardPic()V

    .line 725
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->refreshLocalIssuerLogo()V

    .line 726
    return-void
.end method

.method private refreshLocalCardPic()V
    .locals 9

    .line 816
    const-string v0, "refreshaLocalCardPic"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 817
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mInfoCache:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->cacheCardProductInfoItems()Ljava/util/Map;

    move-result-object v2

    .line 818
    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v0

    if-gtz v0, :cond_0

    .line 820
    const-string v0, "no card info in db, no need to refresh local pic."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 821
    return-void

    .line 825
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardList()Ljava/util/ArrayList;

    move-result-object v3

    .line 827
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 829
    :cond_1
    const-string v0, "loadCardListDBData, but TA is empty."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 834
    :cond_2
    invoke-direct {p0, v3}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->filterCardList(Ljava/util/List;)V

    .line 838
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v3, :cond_4

    .line 840
    const/4 v4, 0x0

    .line 841
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    .line 844
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getProductId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;

    .line 845
    const/4 v0, 0x0

    if-ne v0, v4, :cond_3

    .line 847
    goto :goto_1

    .line 849
    :cond_3
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->getProductId()Ljava/lang/String;

    move-result-object v7

    .line 850
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->getPictureUrl()Ljava/lang/String;

    move-result-object v8

    .line 851
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->cardPicRescManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$3;

    invoke-direct {v1, p0, v7}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$3;-><init>(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;Ljava/lang/String;)V

    invoke-virtual {v0, v7, v8, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshLocalCardIcon(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;)V

    .line 866
    goto :goto_1

    .line 870
    :cond_4
    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;

    .line 872
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->getType()I

    move-result v0

    const/16 v1, 0xb

    if-ne v0, v1, :cond_5

    .line 874
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->getProductId()Ljava/lang/String;

    move-result-object v6

    .line 875
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->getPictureUrl()Ljava/lang/String;

    move-result-object v7

    .line 876
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->cardPicRescManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$4;

    invoke-direct {v1, p0, v6}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$4;-><init>(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;Ljava/lang/String;)V

    invoke-virtual {v0, v6, v7, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshLocalCardIcon(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;)V

    .line 890
    :cond_5
    goto :goto_2

    .line 891
    :cond_6
    return-void
.end method

.method private refreshLocalIssuerLogo()V
    .locals 8

    .line 783
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mInfoCache:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->cacheIssuerInfoItems()Ljava/util/Map;

    move-result-object v5

    .line 784
    invoke-interface {v5}, Ljava/util/Map;->size()I

    move-result v0

    if-gtz v0, :cond_0

    .line 785
    return-void

    .line 788
    :cond_0
    invoke-interface {v5}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 789
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 790
    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 791
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->cardPicRescManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getLogoUrl()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mRefreshLocalIconCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshLocalCardLogo(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;)V

    .line 792
    invoke-interface {v6}, Ljava/util/Iterator;->remove()V

    .line 795
    :cond_1
    goto :goto_0

    .line 797
    :cond_2
    invoke-interface {v5}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 798
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->cardPicRescManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    .line 799
    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getLogoUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAppInfos()Ljava/util/List;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mRefreshLocalIconCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshCardSmlPics(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;)V

    .line 800
    goto :goto_1

    .line 801
    :cond_3
    return-void
.end method

.method private refreshRFConfFiles(Z)V
    .locals 5

    .line 768
    const-string v0, "CardListsLoader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CardListsLoader refreshRFConfFiles begin. hasSyncRFConf : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->hasSyncRFConf:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " forceSync : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 770
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->hasSyncRFConf:Z

    if-eqz v0, :cond_0

    if-eqz p1, :cond_1

    .line 772
    :cond_0
    new-instance v4, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mUIHandler:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mSyncRFConfFilesCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncRFConfFilesCallback;

    invoke-direct {v4, v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncRFConfFilesCallback;)V

    .line 773
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->refreshRFConfFiles()V

    .line 775
    :cond_1
    return-void
.end method

.method private sortCardList(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/wallet/model/unicard/UniCardInfo;>;)V"
        }
    .end annotation

    .line 651
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->cardDBManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->queryCardOrderInfo()Ljava/util/ArrayList;

    move-result-object v3

    .line 653
    const/4 v0, 0x0

    if-eq v0, v3, :cond_3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 654
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;

    .line 655
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/wallet/model/unicard/UniCardInfo;

    .line 656
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->getReference_id()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 657
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->getTimestamp()J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->a(J)V

    .line 658
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cardListItem.statusUpdateTime::"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->getTimestamp()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 660
    :cond_0
    goto :goto_1

    .line 661
    :cond_1
    goto :goto_0

    :cond_2
    goto :goto_2

    .line 663
    :cond_3
    const-string v0, "sortCardList  queryCardOrderInfo  erro"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 666
    :goto_2
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/UniCardInfoComparator;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/UniCardInfoComparator;-><init>()V

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 667
    return-void
.end method

.method private updateCardTimeStampImpl(Ljava/lang/String;JLcom/huawei/nfc/carrera/logic/cardinfo/callback/UpdateCardTimeStampCallback;)V
    .locals 4

    .line 921
    const/4 v2, 0x1

    .line 923
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->updateCardTimeStamp(Ljava/lang/String;J)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_1

    .line 930
    goto :goto_0

    .line 924
    :catch_0
    move-exception v3

    .line 925
    const/4 v2, 0x0

    .line 926
    const-string v0, "updateCardTimeStampImpl , WalletTaCardNotExistException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 930
    goto :goto_0

    .line 927
    :catch_1
    move-exception v3

    .line 928
    const/4 v2, 0x0

    .line 929
    const-string v0, "updateCardTimeStampImpl , WalletTaSystemErrorException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 932
    :goto_0
    if-eqz v2, :cond_0

    .line 933
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->updateCardTimeStampCallbacks:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 936
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->updateCardTimeStampCallbacks:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    .line 937
    const/4 v0, 0x0

    invoke-interface {p4, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/UpdateCardTimeStampCallback;->updateCardTimeStamp(I)V

    .line 940
    :cond_1
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 13

    .line 304
    const/4 v2, 0x0

    .line 305
    const/4 v3, 0x0

    .line 307
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 308
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 310
    :pswitch_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->removeMessages(I)V

    .line 311
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->loadCardListData()V

    .line 312
    goto/16 :goto_0

    .line 314
    :pswitch_1
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->removeMessages(I)V

    .line 315
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->refreshCardListDB()V

    .line 316
    goto/16 :goto_0

    .line 318
    :pswitch_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/UpdateCardTimeStampCallback;

    .line 319
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "set_default_ref_id"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 320
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "update_card_timestamp"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v4

    .line 321
    invoke-direct {p0, v7, v4, v5, v6}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->updateCardTimeStampImpl(Ljava/lang/String;JLcom/huawei/nfc/carrera/logic/cardinfo/callback/UpdateCardTimeStampCallback;)V

    .line 322
    goto/16 :goto_0

    .line 324
    :pswitch_3
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankIssuerInfoCallback;

    .line 325
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 326
    const-string v0, "issuerId"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 327
    invoke-direct {p0, v9, v8}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->getBankIssuerInfo(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankIssuerInfoCallback;)V

    .line 328
    goto/16 :goto_0

    .line 331
    :pswitch_4
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankCardInfoCallback;

    .line 332
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 333
    const-string v0, "set_default_ref_id"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 334
    invoke-direct {p0, v3, v8}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->getBankCardInfo(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankCardInfoCallback;)V

    .line 335
    goto/16 :goto_0

    .line 338
    :pswitch_5
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QuerySupportBankInfoCallback;

    .line 339
    invoke-direct {p0, v8}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->getSupportNFCBankInfos(Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QuerySupportBankInfoCallback;)V

    .line 340
    goto/16 :goto_0

    .line 343
    :pswitch_6
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QuerySupportedTrafficCardListCallback;

    .line 344
    invoke-direct {p0, v8}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->getSupportTrafficCardList(Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QuerySupportedTrafficCardListCallback;)V

    .line 345
    goto/16 :goto_0

    .line 348
    :pswitch_7
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryTrafficCardInfoCallback;

    .line 349
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 350
    const-string v0, "issuerId"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 351
    const-string v0, "bundle_key_citycode"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 352
    const-string v0, "businessCode"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v11

    .line 353
    invoke-direct {p0, v9, v11, v10, v8}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->getTrafficCardinfo(Ljava/lang/String;ILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryTrafficCardInfoCallback;)V

    .line 354
    goto/16 :goto_0

    .line 358
    :pswitch_8
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->refreshRFConfFiles(Z)V

    .line 359
    goto/16 :goto_0

    .line 363
    :pswitch_9
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardNoticeCallback;

    .line 364
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 365
    const-string v0, "issuerId"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 366
    const-string v0, "noticeType"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 367
    new-instance v11, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QueryCardNotice;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mContext:Landroid/content/Context;

    invoke-direct {v11, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QueryCardNotice;-><init>(Landroid/content/Context;)V

    .line 368
    invoke-virtual {v11, v9, v10}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QueryCardNotice;->getCardNotice(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v12

    .line 369
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mUIHandler:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    invoke-virtual {v0, v12, v8}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->handleQueryCardNoticeResult(Ljava/util/List;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardNoticeCallback;)V

    .line 370
    goto :goto_0

    .line 374
    :pswitch_a
    const-string v0, "CardListsLoader"

    const-string v1, "Start to process QUERY_CARD_TRANSFER_ABILITY message."

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 375
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardTransferAbilityCallback;

    .line 376
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 377
    const-string v0, "issuerId"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 378
    new-instance v10, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QueryBusCardTransferAbilityTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->mUIHandler:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    invoke-direct {v10, v0, v1, v8}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QueryBusCardTransferAbilityTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardTransferAbilityCallback;)V

    .line 379
    invoke-virtual {v10, v9}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QueryBusCardTransferAbilityTask;->getCardTransferAbility(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;

    .line 380
    .line 385
    :goto_0
    :pswitch_b
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_b
        :pswitch_b
        :pswitch_2
        :pswitch_b
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch
.end method

.method loadCardListDate()V
    .locals 1

    .line 245
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->sendEmptyMessage(I)Z

    .line 246
    return-void
.end method

.method loadCardLists()V
    .locals 1

    .line 237
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->sendEmptyMessage(I)Z

    .line 238
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->sendEmptyMessage(I)Z

    .line 239
    return-void
.end method

.method queryBankCardInfo(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankCardInfoCallback;)V
    .locals 3

    .line 271
    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    .line 272
    const/16 v0, 0x8

    iput v0, v1, Landroid/os/Message;->what:I

    .line 273
    iput-object p2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 274
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 275
    const-string v0, "set_default_ref_id"

    invoke-virtual {v2, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    invoke-virtual {v1, v2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 277
    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->sendMessage(Landroid/os/Message;)Z

    .line 278
    return-void
.end method

.method queryBankIssuerInfo(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankIssuerInfoCallback;)V
    .locals 3

    .line 261
    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    .line 262
    const/4 v0, 0x7

    iput v0, v1, Landroid/os/Message;->what:I

    .line 263
    iput-object p2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 264
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 265
    const-string v0, "issuerId"

    invoke-virtual {v2, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 266
    invoke-virtual {v1, v2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 267
    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->sendMessage(Landroid/os/Message;)Z

    .line 268
    return-void
.end method

.method queryCardNotice(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardNoticeCallback;)V
    .locals 3

    .line 1294
    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    .line 1295
    const/16 v0, 0x10

    iput v0, v1, Landroid/os/Message;->what:I

    .line 1296
    iput-object p3, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1297
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 1298
    const-string v0, "issuerId"

    invoke-virtual {v2, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1299
    const-string v0, "noticeType"

    invoke-virtual {v2, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1300
    invoke-virtual {v1, v2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 1301
    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->sendMessage(Landroid/os/Message;)Z

    .line 1302
    return-void
.end method

.method queryCardTransferAbility(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardTransferAbilityCallback;)V
    .locals 4

    .line 1306
    new-instance v2, Landroid/os/Message;

    invoke-direct {v2}, Landroid/os/Message;-><init>()V

    .line 1307
    const/16 v0, 0xf

    iput v0, v2, Landroid/os/Message;->what:I

    .line 1308
    iput-object p2, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1309
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 1310
    const-string v0, "issuerId"

    invoke-virtual {v3, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1311
    invoke-virtual {v2, v3}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 1312
    const-string v0, "CardListsLoader"

    const-string v1, "Send QUERY_CARD_TRANSFER_ABILITY message to handler."

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 1313
    invoke-virtual {p0, v2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->sendMessage(Landroid/os/Message;)Z

    .line 1314
    return-void
.end method

.method querySupportNFCBankInfos(Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QuerySupportBankInfoCallback;)V
    .locals 2

    .line 281
    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    .line 282
    const/16 v0, 0x9

    iput v0, v1, Landroid/os/Message;->what:I

    .line 283
    iput-object p1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 284
    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->sendMessage(Landroid/os/Message;)Z

    .line 285
    return-void
.end method

.method querySupportTrafficCardList(Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QuerySupportedTrafficCardListCallback;)V
    .locals 2

    .line 288
    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    .line 289
    const/16 v0, 0xa

    iput v0, v1, Landroid/os/Message;->what:I

    .line 290
    iput-object p1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 291
    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->sendMessage(Landroid/os/Message;)Z

    .line 292
    return-void
.end method

.method queryTrafficCardInfo(Ljava/lang/String;ILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryTrafficCardInfoCallback;)V
    .locals 3

    .line 249
    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    .line 250
    const/16 v0, 0xb

    iput v0, v1, Landroid/os/Message;->what:I

    .line 251
    iput-object p4, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 252
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 253
    const-string v0, "issuerId"

    invoke-virtual {v2, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    const-string v0, "businessCode"

    invoke-virtual {v2, v0, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 255
    const-string v0, "bundle_key_citycode"

    invoke-virtual {v2, v0, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    invoke-virtual {v1, v2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 257
    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->sendMessage(Landroid/os/Message;)Z

    .line 258
    return-void
.end method

.method refreshRFConfs(Z)V
    .locals 2

    .line 296
    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    .line 297
    const/16 v0, 0xc

    iput v0, v1, Landroid/os/Message;->what:I

    .line 298
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 299
    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->sendMessage(Landroid/os/Message;)Z

    .line 300
    return-void
.end method

.method public setHasSyncRFConf(Z)V
    .locals 4

    .line 1288
    const-string v0, "CardListsLoader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter setHasSyncRFConf hasSyncRFConf : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1289
    iput-boolean p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->hasSyncRFConf:Z

    .line 1290
    return-void
.end method

.method public updateCardTimeStamp(Ljava/lang/String;JLcom/huawei/nfc/carrera/logic/cardinfo/callback/UpdateCardTimeStampCallback;)V
    .locals 3

    .line 902
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->updateCardTimeStampCallbacks:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 903
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->updateCardTimeStampCallbacks:Ljava/util/Map;

    .line 905
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->updateCardTimeStampCallbacks:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 906
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->updateCardTimeStampCallbacks:Ljava/util/Map;

    invoke-interface {v0, p1, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 909
    :cond_1
    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    .line 910
    const/4 v0, 0x5

    iput v0, v1, Landroid/os/Message;->what:I

    .line 911
    iput-object p4, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 912
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 913
    const-string v0, "set_default_ref_id"

    invoke-virtual {v2, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 914
    const-string v0, "update_card_timestamp"

    invoke-virtual {v2, v0, p2, p3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 915
    invoke-virtual {v1, v2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 916
    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->sendMessage(Landroid/os/Message;)Z

    .line 917
    return-void
.end method
