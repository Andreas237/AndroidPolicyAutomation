.class public final Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;


# static fields
.field private static final SYNC_LOCK:[B

.field private static instance:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;

.field private static threadPool:Ljava/util/concurrent/ExecutorService;


# instance fields
.field private final cardDBManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

.field private final cardPicRescManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

.field private final listsLoader:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;

.field private mContext:Landroid/content/Context;

.field private final mSyncInfoCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncInfosFromServerCallback;

.field private final refresher:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

.field private final syncInfoHandler:Landroid/os/Handler;

.field private final syncInfoTask:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 68
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->SYNC_LOCK:[B

    .line 102
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->threadPool:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 6

    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 135
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$1;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$1;-><init>(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->mSyncInfoCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncInfosFromServerCallback;

    .line 112
    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 114
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->mContext:Landroid/content/Context;

    goto :goto_0

    .line 118
    :cond_0
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->mContext:Landroid/content/Context;

    .line 121
    :goto_0
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->refresher:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    .line 122
    new-instance v0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->cardDBManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    .line 123
    invoke-static {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->cardPicRescManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    .line 125
    new-instance v3, Landroid/os/HandlerThread;

    const-string v0, "CardListsLoader"

    invoke-direct {v3, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 126
    invoke-virtual {v3}, Landroid/os/HandlerThread;->start()V

    .line 127
    invoke-virtual {v3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v4

    .line 128
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->refresher:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    invoke-direct {v0, v1, v4, v2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->listsLoader:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;

    .line 129
    new-instance v5, Landroid/os/HandlerThread;

    const-string v0, "LocalInfoSyncer"

    invoke-direct {v5, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 130
    invoke-virtual {v5}, Landroid/os/HandlerThread;->start()V

    .line 131
    new-instance v0, Landroid/os/Handler;

    invoke-virtual {v5}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->syncInfoHandler:Landroid/os/Handler;

    .line 132
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->mSyncInfoCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncInfosFromServerCallback;

    invoke-direct {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncInfosFromServerCallback;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->syncInfoTask:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;

    .line 133
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->cardPicRescManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->listsLoader:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;)Landroid/content/Context;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;Ljava/util/List;Lcom/huawei/wallet/model/unicard/UniCardInfo;I)V
    .locals 0

    .line 58
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->dealWithsetDefaultResult(Ljava/util/List;Lcom/huawei/wallet/model/unicard/UniCardInfo;I)V

    return-void
.end method

.method private dealWithsetDefaultResult(Ljava/util/List;Lcom/huawei/wallet/model/unicard/UniCardInfo;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;>;Lcom/huawei/wallet/model/unicard/UniCardInfo;I)V"
        }
    .end annotation

    .line 609
    if-nez p3, :cond_1

    .line 611
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->cardDBManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    invoke-virtual {p2}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->queryCardProductInfoById(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;

    move-result-object v4

    .line 613
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->getProductName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 615
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->mContext:Landroid/content/Context;

    .line 616
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_set_default_card_success_info:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    .line 617
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->getProductName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 615
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 621
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_set_last_as_default_card_success:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 623
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->mContext:Landroid/content/Context;

    invoke-static {v0, v5}, Lcom/huawei/pay/ui/util/ToastManager;->show(Landroid/content/Context;Ljava/lang/String;)V

    .line 625
    goto :goto_1

    .line 629
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_set_default_card_fail:I

    invoke-static {v0, v1}, Lcom/huawei/pay/ui/util/ToastManager;->show(Landroid/content/Context;I)V

    .line 630
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->cardDBManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->insertOrUpdateCardOrderInfos(Ljava/util/List;)V

    .line 632
    :goto_1
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->refreshCardList()V

    .line 633
    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;
    .locals 4

    .line 181
    sget-object v2, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->SYNC_LOCK:[B

    monitor-enter v2

    .line 182
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->instance:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 183
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->instance:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;

    .line 185
    :cond_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->instance:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 186
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private setDefaultCardIfNecessary(IILjava/util/List;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILjava/util/List<Lcom/huawei/wallet/model/unicard/UniCardInfo;>;Ljava/util/List<Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;>;)V"
        }
    .end annotation

    .line 577
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    .line 578
    add-int/lit8 v0, v2, -0x1

    if-ne p2, v0, :cond_0

    .line 580
    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/wallet/model/unicard/UniCardInfo;

    .line 582
    invoke-virtual {v3}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$3;

    invoke-direct {v1, p0, p4, v3}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$3;-><init>(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;Ljava/util/List;Lcom/huawei/wallet/model/unicard/UniCardInfo;)V

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->setCardDefault(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SetCardDefaultCallback;)V

    .line 591
    goto :goto_0

    .line 592
    :cond_0
    add-int/lit8 v0, v2, -0x1

    if-ne p1, v0, :cond_1

    .line 594
    add-int/lit8 v0, v2, -0x2

    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/wallet/model/unicard/UniCardInfo;

    .line 595
    invoke-virtual {v3}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$4;

    invoke-direct {v1, p0, p4, v3}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$4;-><init>(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;Ljava/util/List;Lcom/huawei/wallet/model/unicard/UniCardInfo;)V

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->setCardDefault(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SetCardDefaultCallback;)V

    .line 604
    :cond_1
    :goto_0
    return-void
.end method

.method private sortCardListItem(Ljava/util/List;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/wallet/model/unicard/UniCardInfo;>;Ljava/util/List<Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;>;)V"
        }
    .end annotation

    .line 637
    const/4 v0, 0x0

    if-eq v0, p2, :cond_3

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 639
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;

    .line 641
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/wallet/model/unicard/UniCardInfo;

    .line 643
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->getReference_id()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 645
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->getTimestamp()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->a(J)V

    .line 646
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cardListItem.statusUpdateTime::"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->getTimestamp()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 648
    :cond_0
    goto :goto_1

    .line 649
    :cond_1
    goto :goto_0

    :cond_2
    goto :goto_2

    .line 653
    :cond_3
    const-string v0, "sortCardListItem  queryCardOrderInfo  erro"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 656
    :goto_2
    return-void
.end method


# virtual methods
.method cardListLoaded(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/wallet/model/unicard/UniCardInfo;>;)V"
        }
    .end annotation

    .line 221
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->refresher:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->cardListRefreshed(Ljava/util/List;)V

    .line 224
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->checkCardStatusWaitingReport()V

    .line 225
    return-void
.end method

.method public checkAvaiableCard()I
    .locals 6

    .line 341
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardList()Ljava/util/ArrayList;

    move-result-object v2

    .line 342
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 344
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 346
    :cond_1
    const/4 v3, 0x0

    .line 347
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

    .line 350
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getCardStatus()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getCardStatus()I

    move-result v0

    if-eqz v0, :cond_2

    .line 352
    add-int/lit8 v3, v3, 0x1

    .line 354
    :cond_2
    goto :goto_0

    .line 356
    :cond_3
    return v3
.end method

.method public getCardIcon(Ljava/lang/String;I)Landroid/graphics/Bitmap;
    .locals 1

    .line 506
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->cardPicRescManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    invoke-virtual {v0, p1, p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->getCardIcon(Ljava/lang/String;I)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public isExsitGroupTypeCard(I)Z
    .locals 4

    .line 361
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardList()Ljava/util/ArrayList;

    move-result-object v1

    .line 363
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 365
    :cond_0
    const-string v0, "isExsitGroupTypeCard but the crad list from ta is null"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 367
    const/4 v0, 0x0

    return v0

    .line 370
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    .line 373
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getCardGroupType()I

    move-result v0

    if-ne v0, p1, :cond_2

    .line 375
    const/4 v0, 0x1

    return v0

    .line 377
    :cond_2
    goto :goto_0

    .line 379
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public queryBankCardInfo(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankCardInfoCallback;)V
    .locals 2

    .line 695
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 697
    const-string v0, "CardInfoManager queryBankCardInfo, null == callback"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 698
    return-void

    .line 700
    :cond_0
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 702
    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankCardInfoCallback;->queryBankCardInfoCallback(ILcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;)V

    .line 703
    return-void

    .line 705
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->listsLoader:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;

    invoke-virtual {v0, p1, p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->queryBankCardInfo(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankCardInfoCallback;)V

    .line 706
    return-void
.end method

.method public queryBankIssuerInfo(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankIssuerInfoCallback;)V
    .locals 2

    .line 678
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queryBankIssuerInfo issuerId == issuerId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 679
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 681
    const-string v0, "CardInfoManager queryBankIssuerInfo, null == callback"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 682
    return-void

    .line 684
    :cond_0
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 686
    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankIssuerInfoCallback;->queryBankIssuerInfoCallback(ILcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;)V

    .line 687
    return-void

    .line 689
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->listsLoader:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;

    invoke-virtual {v0, p1, p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->queryBankIssuerInfo(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankIssuerInfoCallback;)V

    .line 690
    return-void
.end method

.method public queryCardNotice(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardNoticeCallback;)V
    .locals 1

    .line 723
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    .line 725
    const-string v0, "queryCardNotice, null == callback"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 726
    return-void

    .line 728
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->listsLoader:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;

    invoke-virtual {v0, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->queryCardNotice(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardNoticeCallback;)V

    .line 729
    return-void
.end method

.method public queryCardTransferAbility(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardTransferAbilityCallback;)V
    .locals 1

    .line 734
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 736
    const-string v0, "queryCardTransferAbility, null == callback"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 737
    return-void

    .line 740
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->listsLoader:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;

    invoke-virtual {v0, p1, p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->queryCardTransferAbility(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardTransferAbilityCallback;)V

    .line 741
    return-void
.end method

.method public queryPayableCardInfos(Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryPayableCardCallback;)V
    .locals 1

    .line 405
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 407
    const-string v0, "queryPayableCardInfos, callback is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 408
    return-void

    .line 428
    :cond_0
    return-void
.end method

.method public querySupportNFCBankInfos(Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QuerySupportBankInfoCallback;)V
    .locals 1

    .line 319
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 321
    const-string v0, "querySupportNFCBankInfos, callback is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 322
    return-void

    .line 324
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->listsLoader:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->querySupportNFCBankInfos(Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QuerySupportBankInfoCallback;)V

    .line 325
    return-void
.end method

.method public querySupportedTrafficCardList(Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QuerySupportedTrafficCardListCallback;)V
    .locals 1

    .line 330
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 332
    const-string v0, "querySupportedTrafficCardList, but callback is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 333
    return-void

    .line 335
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->listsLoader:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->querySupportTrafficCardList(Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QuerySupportedTrafficCardListCallback;)V

    .line 336
    return-void
.end method

.method public queryTrafficCardInfo(Ljava/lang/String;ILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryTrafficCardInfoCallback;)V
    .locals 2

    .line 661
    const/4 v0, 0x0

    if-ne v0, p4, :cond_0

    .line 663
    const-string v0, "CardInfoManager queryTrafficCardInfo, null == callback"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 664
    return-void

    .line 666
    :cond_0
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 668
    const-string v0, "CardInfoManager queryTrafficCardInfo, param isserId is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 669
    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-interface {p4, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryTrafficCardInfoCallback;->queryTrafficCardInfoCallback(ILcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;)V

    .line 670
    return-void

    .line 672
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->listsLoader:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->queryTrafficCardInfo(Ljava/lang/String;ILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryTrafficCardInfoCallback;)V

    .line 673
    return-void
.end method

.method public refreshCardList()V
    .locals 2

    .line 230
    const-string v0, "refreshCardList now"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 251
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->listsLoader:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->loadCardLists()V

    .line 252
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->listsLoader:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->refreshRFConfs(Z)V

    .line 253
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->syncInfoHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->syncInfoTask:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 254
    return-void
.end method

.method public registerCardListListener(Lcom/huawei/wallet/ui/carddisplay/CardListInfoListener;)V
    .locals 1

    .line 200
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->refresher:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->addCardListInfoListener(Lcom/huawei/wallet/ui/carddisplay/CardListInfoListener;)V

    .line 201
    return-void
.end method

.method public setCardDefault(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SetCardDefaultCallback;)V
    .locals 2

    .line 259
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setCardDefault now, refId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 260
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 262
    const-string v0, "setCardDefault, callback is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 263
    return-void

    .line 266
    :cond_0
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 268
    const-string v0, "setCardDefault, but refId is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 269
    const/4 v0, -0x1

    invoke-interface {p2, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SetCardDefaultCallback;->setResultCallback(I)V

    .line 270
    return-void

    .line 287
    :cond_1
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->threadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$2;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$2;-><init>(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SetCardDefaultCallback;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 303
    return-void
.end method

.method setCardDefaultCallback(Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SetCardDefaultCallback;Z)V
    .locals 2

    .line 313
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->refresher:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SetDefaultCardCallbackTask;

    invoke-direct {v1, p1, p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SetDefaultCardCallbackTask;-><init>(Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SetCardDefaultCallback;Z)V

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->post(Ljava/lang/Runnable;)Z

    .line 314
    return-void
.end method

.method public setRefreshRF(Z)V
    .locals 1

    .line 716
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->listsLoader:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->setHasSyncRFConf(Z)V

    .line 717
    return-void
.end method

.method public syncRFConfFiles(Z)V
    .locals 1

    .line 711
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->listsLoader:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->refreshRFConfs(Z)V

    .line 712
    return-void
.end method

.method public unregisterCardListListener(Lcom/huawei/wallet/ui/carddisplay/CardListInfoListener;)V
    .locals 1

    .line 213
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->refresher:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->removeCardListInfoListener(Lcom/huawei/wallet/ui/carddisplay/CardListInfoListener;)V

    .line 214
    return-void
.end method

.method public updateCardOrder(IILjava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILjava/util/List<Lcom/huawei/wallet/model/unicard/UniCardInfo;>;)V"
        }
    .end annotation

    .line 513
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "updateCardOrder begin\uff0cfrom="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",to="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 515
    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 516
    :cond_0
    return-void

    .line 518
    :cond_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    .line 520
    add-int/lit8 v0, v2, -0x1

    if-gt p1, v0, :cond_2

    add-int/lit8 v0, v2, -0x1

    if-le p2, v0, :cond_3

    .line 522
    :cond_2
    const-string v0, "updateCardOrder from or to biger than list size"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 523
    return-void

    .line 527
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->cardDBManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->queryCardOrderInfo()Ljava/util/ArrayList;

    move-result-object v3

    .line 529
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 530
    if-ge p1, p2, :cond_5

    .line 536
    move v5, p1

    :goto_0
    if-ge v5, p2, :cond_4

    .line 537
    new-instance v6, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;

    invoke-direct {v6}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;-><init>()V

    .line 538
    add-int/lit8 v0, v5, 0x1

    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/wallet/model/unicard/UniCardInfo;

    .line 539
    invoke-virtual {v7}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->setReference_id(Ljava/lang/String;)V

    .line 540
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->l()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->setTimestamp(J)V

    .line 541
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OrderItem  \uff0c OrderItem.reference_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->getReference_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 542
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 536
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_4
    goto :goto_2

    .line 544
    :cond_5
    if-le p1, p2, :cond_6

    .line 547
    move v5, p1

    :goto_1
    if-le v5, p2, :cond_6

    .line 548
    new-instance v6, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;

    invoke-direct {v6}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;-><init>()V

    .line 549
    add-int/lit8 v0, v5, -0x1

    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/wallet/model/unicard/UniCardInfo;

    .line 550
    invoke-virtual {v7}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->setReference_id(Ljava/lang/String;)V

    .line 551
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->l()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->setTimestamp(J)V

    .line 552
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OrderItem  \uff0c OrderItem.reference_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->getReference_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 553
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 547
    add-int/lit8 v5, v5, -0x1

    goto :goto_1

    .line 557
    :cond_6
    :goto_2
    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->a()Ljava/lang/String;

    move-result-object v5

    .line 558
    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->l()J

    move-result-wide v6

    .line 559
    new-instance v8, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;

    invoke-direct {v8, v5, v6, v7}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;-><init>(Ljava/lang/String;J)V

    .line 560
    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 561
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->cardDBManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    invoke-virtual {v0, v4}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->insertOrUpdateCardOrderInfos(Ljava/util/List;)V

    .line 564
    invoke-direct {p0, p3, v4}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->sortCardListItem(Ljava/util/List;Ljava/util/List;)V

    .line 566
    add-int/lit8 v0, v2, -0x1

    if-eq p2, v0, :cond_7

    add-int/lit8 v0, v2, -0x1

    if-ne p1, v0, :cond_8

    .line 567
    :cond_7
    invoke-direct {p0, p1, p2, p3, v3}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->setDefaultCardIfNecessary(IILjava/util/List;Ljava/util/List;)V

    .line 569
    :cond_8
    const-string v0, "updateCardOrder    end"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 572
    return-void
.end method

.method public updateTACardTimeStamp(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/UpdateCardTimeStampCallback;J)V
    .locals 2

    .line 386
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setCardDefault now, referenceId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 387
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 389
    const-string v0, "setCardDefault, callback is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 390
    return-void

    .line 393
    :cond_0
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 395
    const-string v0, "setCardDefault, but refId is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 398
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->listsLoader:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;

    invoke-virtual {v0, p1, p3, p4, p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->updateCardTimeStamp(Ljava/lang/String;JLcom/huawei/nfc/carrera/logic/cardinfo/callback/UpdateCardTimeStampCallback;)V

    .line 400
    return-void
.end method
