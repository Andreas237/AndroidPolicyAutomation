.class public Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;
.super Ljava/lang/Object;
.source "ShoppingListRequestManager.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# static fields
.field public static final REQUEST_INTERVAL_MS:I = 0x1388


# instance fields
.field private final LOG_TAG:Ljava/lang/String;

.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private batchRequestTimerTask:Ljava/util/TimerTask;

.field private context:Landroid/content/Context;

.field private createListRequestQueue:Lcom/shopkick/app/queue/SKPersistentQueue;

.field private requestsOnFlying:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;"
        }
    .end annotation
.end field

.field private shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

.field private shoppingListQueueMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/queue/ShoppingListRequestQueue;",
            ">;"
        }
    .end annotation
.end field

.field private shoppingListVersionMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private timer:Ljava/util/Timer;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Lcom/shopkick/app/account/UserAccount;)V
    .locals 1

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "SLRequestManager"

    .line 31
    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->LOG_TAG:Ljava/lang/String;

    .line 41
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListQueueMap:Ljava/util/HashMap;

    .line 42
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListVersionMap:Ljava/util/HashMap;

    .line 43
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->requestsOnFlying:Ljava/util/ArrayList;

    .line 52
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->context:Landroid/content/Context;

    .line 53
    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    .line 54
    iput-object p3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 55
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->createCommonRequestQueues()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->createAndFetchAllRequests()V

    return-void
.end method

.method private createAndFetchAllRequests()V
    .locals 11

    .line 468
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->requestsOnFlying:Ljava/util/ArrayList;

    monitor-enter v0

    .line 469
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->requestsOnFlying:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    monitor-exit v0

    return-void

    .line 470
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->createListRequestQueue:Lcom/shopkick/app/queue/SKPersistentQueue;

    if-nez v1, :cond_1

    monitor-exit v0

    return-void

    .line 473
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->createListRequestQueue:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v1}, Lcom/shopkick/app/queue/SKPersistentQueue;->getObjects()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 474
    instance-of v3, v2, Ljava/lang/String;

    if-nez v3, :cond_2

    goto :goto_0

    .line 475
    :cond_2
    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/CreateShoppingListRequest;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/CreateShoppingListRequest;

    move-result-object v2

    .line 476
    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->requestsOnFlying:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 480
    :cond_3
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListQueueMap:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 481
    invoke-static {v2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->isCanonicalShoppingListId(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_1

    .line 483
    :cond_5
    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListQueueMap:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/queue/ShoppingListRequestQueue;

    if-eqz v3, :cond_6

    .line 485
    invoke-virtual {v3}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->getCanonicalRequest()Lcom/shopkick/app/fetchers/api/skapi/ModifyShoppingListRequest;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 487
    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->requestsOnFlying:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    const-string v3, "SLRequestManager"

    .line 491
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "queue not found!!: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 496
    :cond_7
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->requestsOnFlying:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lcom/shopkick/app/fetchers/api/IAPIObject;

    const-string v2, "SLRequestManager"

    .line 497
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "fetch request: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 498
    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v4, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    const/4 v7, 0x1

    sget-object v8, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v9, Lnet/toddm/cache/CachePriority;->LOW:Lnet/toddm/cache/CachePriority;

    sget-object v10, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v6, p0

    invoke-virtual/range {v3 .. v10}, Lcom/shopkick/fetchers/api/APIManager;->fetch(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    goto :goto_2

    .line 506
    :cond_8
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private createCommonRequestQueues()V
    .locals 4

    .line 343
    new-instance v0, Lcom/shopkick/app/queue/SKPersistentQueue;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->context:Landroid/content/Context;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 344
    invoke-virtual {v3}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "SLRequestManager"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "create"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;->QUEUE_TYPE_STRING:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    invoke-direct {v0, v1, v2, v3}, Lcom/shopkick/app/queue/SKPersistentQueue;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;)V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->createListRequestQueue:Lcom/shopkick/app/queue/SKPersistentQueue;

    return-void
.end method

.method private destroyCommonRequestQueues()V
    .locals 1

    .line 349
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->createListRequestQueue:Lcom/shopkick/app/queue/SKPersistentQueue;

    if-eqz v0, :cond_0

    .line 350
    invoke-virtual {v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->removeQueue()V

    const/4 v0, 0x0

    .line 351
    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->createListRequestQueue:Lcom/shopkick/app/queue/SKPersistentQueue;

    :cond_0
    return-void
.end method

.method private getRequestQueue(Ljava/lang/String;)Lcom/shopkick/app/queue/ShoppingListRequestQueue;
    .locals 3

    .line 365
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListQueueMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 366
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListQueueMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/queue/ShoppingListRequestQueue;

    return-object p1

    .line 370
    :cond_0
    new-instance v0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 371
    invoke-virtual {v2}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2, p1}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 373
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListQueueMap:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->getShoppingListVersion(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 377
    invoke-virtual {v0, v1}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->updateShoppingListVersion(Ljava/lang/String;)V

    .line 378
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListVersionMap:Ljava/util/HashMap;

    invoke-virtual {v2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method private getShoppingListVersion(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 357
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListVersionMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 358
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListVersionMap:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-virtual {v1, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getShoppingListVersion(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListVersionMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method private logQueueStatus()V
    .locals 6

    const-string v0, "SLRequestManager"

    .line 412
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestOnFlying: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->requestsOnFlying:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "SLRequestManager"

    .line 413
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "createListRequestQueue: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->createListRequestQueue:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v2}, Lcom/shopkick/app/queue/SKPersistentQueue;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 416
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListQueueMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x1

    const-string v3, "SLRequestManager"

    .line 418
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "listQueue: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "/"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListQueueMap:Ljava/util/HashMap;

    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/queue/ShoppingListRequestQueue;

    invoke-virtual {v1}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->size()I

    move-result v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    move v1, v2

    goto :goto_0

    :cond_0
    const-string v0, "SLRequestManager"

    .line 421
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "shoppingListVersions: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListVersionMap:Ljava/util/HashMap;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v1, :cond_1

    const-string v0, "SLRequestManager"

    const-string v1, "No list queue exists"

    .line 423
    invoke-static {v0, v1}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method private maybeRemoveRequestQueue(Ljava/lang/String;)V
    .locals 2

    .line 386
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListQueueMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;

    if-eqz v0, :cond_0

    .line 387
    invoke-virtual {v0}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->size()I

    move-result v1

    if-nez v1, :cond_0

    .line 388
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListQueueMap:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    invoke-virtual {v0}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->removeQueue()V

    :cond_0
    return-void
.end method

.method private updateShoppingListVersionOnMemory(ZLjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 397
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListQueueMap:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 398
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListQueueMap:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;

    invoke-virtual {v0, p3}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->updateShoppingListVersion(Ljava/lang/String;)V

    .line 401
    :cond_0
    invoke-direct {p0, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->getShoppingListVersion(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 402
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListVersionMap:Ljava/util/HashMap;

    invoke-virtual {v1, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p1, :cond_1

    .line 406
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-virtual {p1, p2, v0, p3}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->maybeUpdateShoppingListVersionOnDisk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 3

    .line 59
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->stopApiRequests()V

    .line 61
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListQueueMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 62
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListQueueMap:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/queue/ShoppingListRequestQueue;

    invoke-virtual {v1}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->removeQueue()V

    goto :goto_0

    .line 64
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListQueueMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 65
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListVersionMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 67
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->destroyCommonRequestQueues()V

    .line 68
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->createCommonRequestQueues()V

    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    .line 520
    iget-object v3, v1, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->requestsOnFlying:Ljava/util/ArrayList;

    monitor-enter v3

    :try_start_0
    const-string v4, "SLRequestManager"

    .line 521
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "on completedResponse response status: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v6, v2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "SLRequestManager"

    .line 522
    invoke-virtual/range {p1 .. p1}, Lcom/shopkick/app/fetchers/api/IAPIObject;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 525
    iget-object v4, v1, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->requestsOnFlying:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    const-string v0, "SLRequestManager"

    const-string v2, "invalid request"

    .line 526
    invoke-static {v0, v2}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 527
    monitor-exit v3

    return-void

    .line 532
    :cond_0
    iget-boolean v5, v2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v5, :cond_f

    .line 533
    instance-of v5, v0, Lcom/shopkick/app/fetchers/api/skapi/CreateShoppingListRequest;

    if-eqz v5, :cond_3

    const-string v5, "SLRequestManager"

    .line 534
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "CreateShoppingListResponse: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, v2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 537
    iget-object v2, v2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/CreateShoppingListResponse;

    .line 538
    iget-object v11, v2, Lcom/shopkick/app/fetchers/api/skapi/CreateShoppingListResponse;->shoppingListId:Ljava/lang/String;

    .line 539
    move-object v5, v0

    check-cast v5, Lcom/shopkick/app/fetchers/api/skapi/CreateShoppingListRequest;

    iget-object v6, v5, Lcom/shopkick/app/fetchers/api/skapi/CreateShoppingListRequest;->uuid:Ljava/lang/String;

    .line 542
    iget-object v5, v1, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->createListRequestQueue:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual/range {p1 .. p1}, Lcom/shopkick/app/fetchers/api/IAPIObject;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Lcom/shopkick/app/queue/SKPersistentQueue;->removeString(Ljava/lang/String;)V

    .line 545
    iget-object v5, v1, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListVersionMap:Ljava/util/HashMap;

    invoke-virtual {v5, v6}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    if-nez v11, :cond_1

    .line 551
    iget-object v2, v1, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-virtual {v2, v6}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->deleteShoppingList(Ljava/lang/String;)V

    goto/16 :goto_8

    .line 555
    :cond_1
    iget-object v5, v1, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListQueueMap:Ljava/util/HashMap;

    invoke-virtual {v5, v6}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/shopkick/app/queue/ShoppingListRequestQueue;

    if-eqz v5, :cond_2

    .line 557
    iget-object v7, v1, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListQueueMap:Ljava/util/HashMap;

    invoke-virtual {v7, v11, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 558
    invoke-virtual {v5, v11}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->updateShoppingListId(Ljava/lang/String;)V

    .line 559
    iget-object v7, v2, Lcom/shopkick/app/fetchers/api/skapi/CreateShoppingListResponse;->shoppingListVersion:Ljava/lang/String;

    invoke-virtual {v5, v7}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->updateShoppingListVersion(Ljava/lang/String;)V

    .line 563
    :cond_2
    iget-object v5, v1, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iget-object v8, v2, Lcom/shopkick/app/fetchers/api/skapi/CreateShoppingListResponse;->createdMs:Ljava/lang/Long;

    iget-object v9, v2, Lcom/shopkick/app/fetchers/api/skapi/CreateShoppingListResponse;->modifiedMs:Ljava/lang/Long;

    iget-object v10, v2, Lcom/shopkick/app/fetchers/api/skapi/CreateShoppingListResponse;->shoppingListVersion:Ljava/lang/String;

    move-object v7, v11

    invoke-virtual/range {v5 .. v10}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->updateShoppingListId(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V

    .line 571
    iget-object v5, v1, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListVersionMap:Ljava/util/HashMap;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/CreateShoppingListResponse;->shoppingListVersion:Ljava/lang/String;

    invoke-virtual {v5, v11, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_8

    .line 574
    :cond_3
    instance-of v5, v0, Lcom/shopkick/app/fetchers/api/skapi/ModifyShoppingListRequest;

    if-eqz v5, :cond_f

    const-string v5, "SLRequestManager"

    .line 575
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "ModifyShoppingListResponse: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, v2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 578
    move-object v5, v0

    check-cast v5, Lcom/shopkick/app/fetchers/api/skapi/ModifyShoppingListRequest;

    .line 579
    iget-object v2, v2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/ModifyShoppingListResponse;

    .line 580
    iget-object v12, v5, Lcom/shopkick/app/fetchers/api/skapi/ModifyShoppingListRequest;->shoppingListId:Ljava/lang/String;

    .line 581
    invoke-direct {v1, v12}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->getRequestQueue(Ljava/lang/String;)Lcom/shopkick/app/queue/ShoppingListRequestQueue;

    move-result-object v13

    .line 583
    iget-object v6, v5, Lcom/shopkick/app/fetchers/api/skapi/ModifyShoppingListRequest;->modifications:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-ne v6, v15, :cond_4

    iget-object v6, v5, Lcom/shopkick/app/fetchers/api/skapi/ModifyShoppingListRequest;->modifications:Ljava/util/List;

    .line 584
    invoke-interface {v6, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;

    iget-object v6, v6, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->deleteModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListDeleteModification;

    if-eqz v6, :cond_4

    .line 586
    iget-object v5, v1, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListVersionMap:Ljava/util/HashMap;

    invoke-virtual {v5, v12}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 589
    iget-object v5, v1, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListQueueMap:Ljava/util/HashMap;

    invoke-virtual {v5, v12}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 590
    invoke-virtual {v13}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->removeQueue()V

    goto/16 :goto_6

    .line 597
    :cond_4
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 598
    iget-object v6, v5, Lcom/shopkick/app/fetchers/api/skapi/ModifyShoppingListRequest;->modifications:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_5
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;

    .line 599
    iget-object v8, v7, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->entryToAdd:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    if-eqz v8, :cond_5

    iget-object v7, v7, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 602
    :cond_6
    iget-object v6, v2, Lcom/shopkick/app/fetchers/api/skapi/ModifyShoppingListResponse;->shoppingListEntryCreationStatuses:Ljava/util/List;

    if-eqz v6, :cond_8

    if-eqz v13, :cond_8

    .line 603
    iget-object v6, v2, Lcom/shopkick/app/fetchers/api/skapi/ModifyShoppingListResponse;->shoppingListEntryCreationStatuses:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_1
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v10, v6

    check-cast v10, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryCreationStatus;

    .line 604
    iget-object v6, v10, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryCreationStatus;->tempId:Ljava/lang/String;

    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 607
    iget-object v6, v1, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iget-object v8, v10, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryCreationStatus;->tempId:Ljava/lang/String;

    iget-object v9, v10, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryCreationStatus;->createdShoppingListEntryId:Ljava/lang/String;

    iget-object v7, v10, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryCreationStatus;->entryCreatedMs:Ljava/lang/Long;

    iget-object v4, v10, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryCreationStatus;->taxonomyNodeId:Ljava/lang/String;

    move-object/from16 v18, v7

    move-object v7, v12

    move-object v14, v10

    move-object/from16 v10, v18

    move-object/from16 v18, v11

    move-object v11, v4

    invoke-virtual/range {v6 .. v11}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->updateShoppingListEntryId(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V

    .line 614
    iget-object v4, v14, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryCreationStatus;->tempId:Ljava/lang/String;

    iget-object v6, v14, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryCreationStatus;->createdShoppingListEntryId:Ljava/lang/String;

    invoke-virtual {v13, v4, v6}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->updateEntryId(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v11, v18

    const/4 v14, 0x0

    goto :goto_1

    :cond_7
    move-object/from16 v18, v11

    goto :goto_2

    :cond_8
    move-object/from16 v18, v11

    .line 620
    :goto_2
    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_a

    .line 624
    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 627
    iget-object v7, v1, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-virtual {v7, v12, v6}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->deleteShoppingListEntry(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_9
    const/4 v4, 0x0

    goto :goto_4

    :cond_a
    move v4, v15

    :goto_4
    if-eqz v13, :cond_b

    .line 632
    invoke-virtual {v13, v5}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->removeRequest(Lcom/shopkick/app/fetchers/api/skapi/ModifyShoppingListRequest;)V

    .line 634
    :cond_b
    invoke-direct {v1, v12}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->maybeRemoveRequestQueue(Ljava/lang/String;)V

    if-eqz v4, :cond_c

    .line 637
    iget-object v4, v2, Lcom/shopkick/app/fetchers/api/skapi/ModifyShoppingListResponse;->shoppingListStatus:Ljava/lang/Integer;

    .line 638
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v4, v15, :cond_c

    move v4, v15

    goto :goto_5

    :cond_c
    const/4 v4, 0x0

    :goto_5
    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/ModifyShoppingListRequest;->shoppingListId:Ljava/lang/String;

    iget-object v6, v2, Lcom/shopkick/app/fetchers/api/skapi/ModifyShoppingListResponse;->shoppingListVersion:Ljava/lang/String;

    .line 637
    invoke-direct {v1, v4, v5, v6}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->updateShoppingListVersionOnMemory(ZLjava/lang/String;Ljava/lang/String;)V

    :goto_6
    const/4 v4, 0x6

    if-eqz v13, :cond_d

    .line 645
    invoke-virtual {v13}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->maybeRemoveInvalidModifications()Z

    move-result v5

    if-eqz v5, :cond_d

    const-string v5, "SLRequestManager"

    const-string v6, "invalid modifications in the queue detected!!"

    .line 646
    invoke-static {v5, v6}, Lcom/shopkick/app/util/SKLog;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 649
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v17, v5

    goto :goto_7

    :cond_d
    const/16 v17, 0x0

    .line 653
    :goto_7
    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ModifyShoppingListResponse;->shoppingListStatus:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-eq v2, v15, :cond_e

    .line 654
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_9

    :cond_e
    move-object/from16 v4, v17

    goto :goto_9

    :cond_f
    :goto_8
    const/4 v4, 0x0

    .line 660
    :goto_9
    iget-object v2, v1, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->requestsOnFlying:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 662
    iget-object v0, v1, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-virtual {v0, v4}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->maybeStartSync(Ljava/lang/Integer;)V

    .line 663
    invoke-direct/range {p0 .. p0}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->logQueueStatus()V

    .line 664
    monitor-exit v3

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getModificationCount()I
    .locals 3

    .line 112
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->createListRequestQueue:Lcom/shopkick/app/queue/SKPersistentQueue;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 113
    invoke-virtual {v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->size()I

    move-result v0

    add-int/2addr v1, v0

    .line 115
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListQueueMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/queue/ShoppingListRequestQueue;

    .line 116
    invoke-virtual {v2}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->size()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_1
    return v1
.end method

.method public isRequestExist()Z
    .locals 4

    .line 97
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->requestsOnFlying:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    .line 98
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->createListRequestQueue:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->hasQueuedObjects()Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    .line 100
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListQueueMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 102
    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListQueueMap:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/queue/ShoppingListRequestQueue;

    invoke-virtual {v2}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->hasQueuedObjects()Z

    move-result v2

    if-eqz v2, :cond_2

    return v1

    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public maybeLoadOfflineRequestQueue(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 77
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->context:Landroid/content/Context;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->isQueueExists(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 78
    new-instance v0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 79
    invoke-virtual {v2}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2, p1}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    invoke-virtual {v0}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->size()I

    move-result v1

    if-nez v1, :cond_0

    .line 84
    invoke-virtual {v0}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->removeQueue()V

    goto :goto_0

    .line 86
    :cond_0
    invoke-virtual {v0, p2}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->updateShoppingListVersion(Ljava/lang/String;)V

    .line 87
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListQueueMap:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListVersionMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public requestAddShoppingListEntry(Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)V
    .locals 2

    .line 207
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->getRequestQueue(Ljava/lang/String;)Lcom/shopkick/app/queue/ShoppingListRequestQueue;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 211
    invoke-virtual {p2, v0}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object v0

    const/4 v1, 0x0

    .line 212
    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    .line 213
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->deleted:Ljava/lang/Boolean;

    invoke-static {v1}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->deleted:Ljava/lang/Boolean;

    .line 216
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;-><init>()V

    .line 217
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    iput-object p2, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->shoppingListEntryId:Ljava/lang/String;

    .line 218
    iput-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->entryToAdd:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 220
    invoke-virtual {p1, v1}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->addToQueue(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;)V

    .line 221
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->logQueueStatus()V

    return-void
.end method

.method public requestChangeShoppingListEntryPriority(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 262
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->getRequestQueue(Ljava/lang/String;)Lcom/shopkick/app/queue/ShoppingListRequestQueue;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 265
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;-><init>()V

    .line 266
    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->shoppingListEntryId:Ljava/lang/String;

    .line 267
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryPriorityModification;

    invoke-direct {p2}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryPriorityModification;-><init>()V

    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->entryPriorityModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryPriorityModification;

    .line 268
    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->entryPriorityModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryPriorityModification;

    iput-object p3, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryPriorityModification;->oldPriority:Ljava/lang/String;

    .line 269
    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->entryPriorityModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryPriorityModification;

    iput-object p4, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryPriorityModification;->newPriority:Ljava/lang/String;

    .line 271
    invoke-virtual {p1, v0}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->addToQueue(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;)V

    .line 272
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->logQueueStatus()V

    return-void
.end method

.method public requestCreateShoppingList(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;)V
    .locals 2

    .line 127
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/CreateShoppingListRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/CreateShoppingListRequest;-><init>()V

    .line 128
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->name:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/CreateShoppingListRequest;->name:Ljava/lang/String;

    .line 129
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/CreateShoppingListRequest;->uuid:Ljava/lang/String;

    .line 130
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->createListRequestQueue:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/CreateShoppingListRequest;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->addToQueue(Ljava/lang/Object;)V

    .line 131
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->logQueueStatus()V

    return-void
.end method

.method public requestDeleteShoppingList(Ljava/lang/String;)V
    .locals 5

    .line 152
    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->isCanonicalShoppingListId(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    .line 155
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->requestsOnFlying:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 157
    instance-of v4, v3, Lcom/shopkick/app/fetchers/api/skapi/CreateShoppingListRequest;

    if-eqz v4, :cond_0

    .line 158
    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/CreateShoppingListRequest;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/CreateShoppingListRequest;->uuid:Ljava/lang/String;

    .line 159
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v0, v1

    :cond_1
    if-eqz v0, :cond_3

    .line 169
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->getRequestQueue(Ljava/lang/String;)Lcom/shopkick/app/queue/ShoppingListRequestQueue;

    move-result-object p1

    if-nez p1, :cond_2

    return-void

    .line 171
    :cond_2
    invoke-virtual {p1}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->clear()V

    .line 174
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;-><init>()V

    .line 175
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SLRequestManager"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-virtual {v3}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getUniqueNumericString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->uuid:Ljava/lang/String;

    .line 176
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListDeleteModification;

    invoke-direct {v2}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListDeleteModification;-><init>()V

    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->deleteModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListDeleteModification;

    .line 177
    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->deleteModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListDeleteModification;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListDeleteModification;->newDeleteState:Ljava/lang/Boolean;

    .line 178
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->deleteModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListDeleteModification;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListDeleteModification;->oldDeleteState:Ljava/lang/Boolean;

    .line 179
    invoke-virtual {p1, v0}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->addToQueue(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;)V

    goto :goto_1

    .line 183
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->createListRequestQueue:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->getObjects()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 184
    instance-of v2, v1, Ljava/lang/String;

    if-nez v2, :cond_5

    goto :goto_0

    .line 186
    :cond_5
    check-cast v1, Ljava/lang/String;

    .line 187
    invoke-virtual {v1, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 188
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->createListRequestQueue:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/queue/SKPersistentQueue;->removeString(Ljava/lang/String;)V

    .line 194
    :cond_6
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->shoppingListQueueMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/queue/ShoppingListRequestQueue;

    if-eqz p1, :cond_7

    .line 196
    invoke-virtual {p1}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->removeQueue()V

    .line 199
    :cond_7
    :goto_1
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->logQueueStatus()V

    return-void
.end method

.method public requestDeleteShoppingListEntry(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 294
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->getRequestQueue(Ljava/lang/String;)Lcom/shopkick/app/queue/ShoppingListRequestQueue;

    move-result-object v0

    .line 296
    invoke-static {p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->isCanonicalEntryId(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_2

    .line 301
    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->requestsOnFlying:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 302
    instance-of v5, v4, Lcom/shopkick/app/fetchers/api/skapi/ModifyShoppingListRequest;

    if-eqz v5, :cond_0

    check-cast v4, Lcom/shopkick/app/fetchers/api/skapi/ModifyShoppingListRequest;

    iget-object v5, v4, Lcom/shopkick/app/fetchers/api/skapi/ModifyShoppingListRequest;->shoppingListId:Ljava/lang/String;

    .line 303
    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 307
    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/ModifyShoppingListRequest;->modifications:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;

    .line 308
    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {v5, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v1, v2

    .line 318
    :cond_2
    invoke-virtual {v0, p2}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->removeRequestsWithEntryId(Ljava/lang/String;)V

    if-eqz v1, :cond_3

    .line 324
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;-><init>()V

    .line 325
    new-instance v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryDeleteModification;

    invoke-direct {v3}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryDeleteModification;-><init>()V

    iput-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->entryDeleteModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryDeleteModification;

    .line 326
    iput-object p2, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->shoppingListEntryId:Ljava/lang/String;

    .line 327
    iget-object p2, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->entryDeleteModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryDeleteModification;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iput-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryDeleteModification;->oldDeleteState:Ljava/lang/Boolean;

    .line 328
    iget-object p2, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->entryDeleteModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryDeleteModification;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryDeleteModification;->newDeleteState:Ljava/lang/Boolean;

    .line 329
    invoke-virtual {v0, v1}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->addToQueue(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;)V

    .line 333
    :cond_3
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->maybeRemoveRequestQueue(Ljava/lang/String;)V

    .line 335
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->logQueueStatus()V

    return-void
.end method

.method public requestRenameShoppingList(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 136
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;-><init>()V

    .line 137
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListNameModification;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListNameModification;-><init>()V

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->nameModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListNameModification;

    .line 138
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->nameModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListNameModification;

    iput-object p2, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListNameModification;->oldName:Ljava/lang/String;

    .line 139
    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->nameModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListNameModification;

    iput-object p3, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListNameModification;->newName:Ljava/lang/String;

    .line 143
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->getRequestQueue(Ljava/lang/String;)Lcom/shopkick/app/queue/ShoppingListRequestQueue;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 145
    invoke-virtual {p1, v0}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->addToQueue(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;)V

    .line 147
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->logQueueStatus()V

    return-void
.end method

.method public requestToggleShoppingListEntryCompletion(Ljava/lang/String;Ljava/lang/String;II)V
    .locals 1

    .line 244
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->getRequestQueue(Ljava/lang/String;)Lcom/shopkick/app/queue/ShoppingListRequestQueue;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 248
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;-><init>()V

    .line 249
    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->shoppingListEntryId:Ljava/lang/String;

    .line 250
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryStateModification;

    invoke-direct {p2}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryStateModification;-><init>()V

    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->entryStateModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryStateModification;

    .line 251
    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->entryStateModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryStateModification;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    iput-object p3, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryStateModification;->oldState:Ljava/lang/Integer;

    .line 252
    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->entryStateModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryStateModification;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    iput-object p3, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryStateModification;->newState:Ljava/lang/Integer;

    .line 254
    invoke-virtual {p1, v0}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->addToQueue(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;)V

    .line 255
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->logQueueStatus()V

    return-void
.end method

.method public requestUpdateShoppingListEntryQuantity(Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/Quantity;Lcom/shopkick/app/fetchers/api/skapi/Quantity;)V
    .locals 1

    .line 228
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->getRequestQueue(Ljava/lang/String;)Lcom/shopkick/app/queue/ShoppingListRequestQueue;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 231
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;-><init>()V

    .line 232
    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->shoppingListEntryId:Ljava/lang/String;

    .line 233
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryQuantityModification;

    invoke-direct {p2}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryQuantityModification;-><init>()V

    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->entryQuantityModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryQuantityModification;

    .line 234
    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->entryQuantityModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryQuantityModification;

    iput-object p3, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryQuantityModification;->oldQuantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    .line 235
    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->entryQuantityModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryQuantityModification;

    iput-object p4, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryQuantityModification;->newQuantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    .line 236
    invoke-virtual {p1, v0}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->addToQueue(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;)V

    .line 237
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->logQueueStatus()V

    return-void
.end method

.method public requestUpdateShoppingListEntryTitle(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 279
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->getRequestQueue(Ljava/lang/String;)Lcom/shopkick/app/queue/ShoppingListRequestQueue;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 283
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;-><init>()V

    .line 284
    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->shoppingListEntryId:Ljava/lang/String;

    .line 285
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryTitleModification;

    invoke-direct {p2}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryTitleModification;-><init>()V

    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->entryTitleModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryTitleModification;

    .line 286
    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->entryTitleModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryTitleModification;

    iput-object p3, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryTitleModification;->oldTitle:Ljava/lang/String;

    .line 287
    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->entryTitleModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryTitleModification;

    iput-object p4, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryTitleModification;->newTitle:Ljava/lang/String;

    .line 289
    invoke-virtual {p1, v0}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->addToQueue(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;)V

    .line 290
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->logQueueStatus()V

    return-void
.end method

.method public setApiManager(Lcom/shopkick/fetchers/api/APIManager;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    return-void
.end method

.method public startRequestCycle()V
    .locals 7

    .line 431
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->stopRequestCycle()V

    .line 433
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->batchRequestTimerTask:Ljava/util/TimerTask;

    if-nez v0, :cond_0

    .line 434
    new-instance v0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager$1;-><init>(Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;)V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->batchRequestTimerTask:Ljava/util/TimerTask;

    .line 443
    :cond_0
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->timer:Ljava/util/Timer;

    .line 444
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->timer:Ljava/util/Timer;

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->batchRequestTimerTask:Ljava/util/TimerTask;

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x1388

    invoke-virtual/range {v1 .. v6}, Ljava/util/Timer;->scheduleAtFixedRate(Ljava/util/TimerTask;JJ)V

    return-void
.end method

.method public stopApiRequests()V
    .locals 3

    .line 458
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->requestsOnFlying:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 459
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->requestsOnFlying:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 460
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v2, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    goto :goto_0

    .line 462
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->requestsOnFlying:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    :cond_1
    return-void
.end method

.method public stopRequestCycle()V
    .locals 2

    .line 448
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->timer:Ljava/util/Timer;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 449
    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 450
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->timer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->purge()I

    .line 451
    iput-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->timer:Ljava/util/Timer;

    .line 454
    :cond_0
    iput-object v1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->batchRequestTimerTask:Ljava/util/TimerTask;

    return-void
.end method
