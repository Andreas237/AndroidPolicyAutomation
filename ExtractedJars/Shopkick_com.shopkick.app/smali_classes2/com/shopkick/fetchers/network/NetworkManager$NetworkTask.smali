.class public Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;
.super Landroid/os/AsyncTask;
.source "NetworkManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/fetchers/network/NetworkManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "NetworkTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Object;",
        "Ljava/lang/Void;",
        "Lcom/shopkick/fetchers/DataResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private callbackRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/fetchers/network/NetworkManager$NetworkRequestCallbacks;",
            ">;"
        }
    .end annotation
.end field

.field private networkWork:Lnet/toddm/comm/SubmittableWork;

.field private request:Lcom/shopkick/fetchers/network/NetworkRequest;

.field final synthetic this$0:Lcom/shopkick/fetchers/network/NetworkManager;


# direct methods
.method public constructor <init>(Lcom/shopkick/fetchers/network/NetworkManager;Lcom/shopkick/fetchers/network/NetworkRequest;Lcom/shopkick/fetchers/network/NetworkManager$NetworkRequestCallbacks;Lnet/toddm/comm/SubmittableWork;)V
    .locals 0

    .line 478
    iput-object p1, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->this$0:Lcom/shopkick/fetchers/network/NetworkManager;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    if-eqz p4, :cond_1

    .line 480
    iput-object p2, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->request:Lcom/shopkick/fetchers/network/NetworkRequest;

    if-eqz p3, :cond_0

    .line 482
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->callbackRef:Ljava/lang/ref/WeakReference;

    .line 484
    :cond_0
    iput-object p4, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->networkWork:Lnet/toddm/comm/SubmittableWork;

    return-void

    .line 479
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'networkWork\' can not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/Object;)Lcom/shopkick/fetchers/DataResponse;
    .locals 14

    const/4 p1, 0x2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 500
    :try_start_0
    iget-object v2, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->request:Lcom/shopkick/fetchers/network/NetworkRequest;

    iget-boolean v2, v2, Lcom/shopkick/fetchers/network/NetworkRequest;->ignoreRequestHeaders:Z

    if-eqz v2, :cond_0

    .line 501
    iget-object v2, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->networkWork:Lnet/toddm/comm/SubmittableWork;

    invoke-interface {v2}, Lnet/toddm/comm/SubmittableWork;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v2

    invoke-virtual {v2}, Lnet/toddm/comm/Request;->getHeaders()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->clear()V

    goto :goto_0

    .line 503
    :cond_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    .line 504
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 505
    iget-object v3, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->networkWork:Lnet/toddm/comm/SubmittableWork;

    invoke-interface {v3}, Lnet/toddm/comm/SubmittableWork;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v3

    invoke-virtual {v3}, Lnet/toddm/comm/Request;->getHeaders()Ljava/util/Map;

    move-result-object v3

    const-string v4, "Accept-Language"

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 506
    iget-object v2, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->request:Lcom/shopkick/fetchers/network/NetworkRequest;

    iget-object v2, v2, Lcom/shopkick/fetchers/network/NetworkRequest;->contentType:Ljava/lang/String;

    if-eqz v2, :cond_1

    .line 507
    iget-object v2, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->networkWork:Lnet/toddm/comm/SubmittableWork;

    invoke-interface {v2}, Lnet/toddm/comm/SubmittableWork;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v2

    invoke-virtual {v2}, Lnet/toddm/comm/Request;->getHeaders()Ljava/util/Map;

    move-result-object v2

    const-string v3, "Content-Type"

    iget-object v4, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->request:Lcom/shopkick/fetchers/network/NetworkRequest;

    iget-object v4, v4, Lcom/shopkick/fetchers/network/NetworkRequest;->contentType:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 513
    :cond_1
    :goto_0
    iget-object v2, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->this$0:Lcom/shopkick/fetchers/network/NetworkManager;

    invoke-static {v2}, Lcom/shopkick/fetchers/network/NetworkManager;->access$300(Lcom/shopkick/fetchers/network/NetworkManager;)Lcom/shopkick/fetchers/network/SKConnectivityManager;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    .line 514
    iget-object v2, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->this$0:Lcom/shopkick/fetchers/network/NetworkManager;

    invoke-static {v2}, Lcom/shopkick/fetchers/network/NetworkManager;->access$300(Lcom/shopkick/fetchers/network/NetworkManager;)Lcom/shopkick/fetchers/network/SKConnectivityManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/fetchers/network/SKConnectivityManager;->isNetworkConnected()Z

    move-result v2

    if-nez v2, :cond_3

    .line 516
    iget-object v2, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->networkWork:Lnet/toddm/comm/SubmittableWork;

    invoke-interface {v2}, Lnet/toddm/comm/SubmittableWork;->getCachingBehavior()Lnet/toddm/comm/CacheBehavior;

    move-result-object v2

    sget-object v4, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    invoke-virtual {v2, v4}, Lnet/toddm/comm/CacheBehavior;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v2, p1

    move v4, v3

    goto :goto_1

    :cond_2
    move v4, v0

    move v2, v3

    goto :goto_1

    :cond_3
    move v2, v3

    move v4, v2

    :goto_1
    if-nez v2, :cond_9

    if-eqz v4, :cond_4

    .line 526
    invoke-static {}, Lcom/shopkick/comm/FetchersCommManagerAccessor;->getInstance()Lnet/toddm/comm/CommManager;

    move-result-object v5

    iget-object v4, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->networkWork:Lnet/toddm/comm/SubmittableWork;

    .line 527
    invoke-interface {v4}, Lnet/toddm/comm/SubmittableWork;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v4

    invoke-virtual {v4}, Lnet/toddm/comm/Request;->getUri()Ljava/net/URI;

    move-result-object v6

    iget-object v4, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->networkWork:Lnet/toddm/comm/SubmittableWork;

    .line 528
    invoke-interface {v4}, Lnet/toddm/comm/SubmittableWork;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v4

    invoke-virtual {v4}, Lnet/toddm/comm/Request;->getMethod()Lnet/toddm/comm/Request$RequestMethod;

    move-result-object v7

    iget-object v4, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->networkWork:Lnet/toddm/comm/SubmittableWork;

    .line 529
    invoke-interface {v4}, Lnet/toddm/comm/SubmittableWork;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v4

    invoke-virtual {v4}, Lnet/toddm/comm/Request;->getPostData()[B

    move-result-object v8

    iget-object v4, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->networkWork:Lnet/toddm/comm/SubmittableWork;

    .line 530
    invoke-interface {v4}, Lnet/toddm/comm/SubmittableWork;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v4

    invoke-virtual {v4}, Lnet/toddm/comm/Request;->getHeaders()Ljava/util/Map;

    move-result-object v9

    iget-object v4, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->networkWork:Lnet/toddm/comm/SubmittableWork;

    .line 531
    invoke-interface {v4}, Lnet/toddm/comm/SubmittableWork;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v4

    invoke-virtual {v4}, Lnet/toddm/comm/Request;->isIdempotent()Z

    move-result v10

    iget-object v4, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->networkWork:Lnet/toddm/comm/SubmittableWork;

    .line 532
    invoke-interface {v4}, Lnet/toddm/comm/SubmittableWork;->getRequestPriority()Lnet/toddm/comm/Priority;

    move-result-object v4

    .line 533
    invoke-virtual {v4}, Lnet/toddm/comm/Priority;->getStartingValue()Lnet/toddm/comm/Priority$StartingPriority;

    move-result-object v11

    iget-object v4, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->networkWork:Lnet/toddm/comm/SubmittableWork;

    .line 534
    invoke-interface {v4}, Lnet/toddm/comm/SubmittableWork;->getCachingPriority()Lnet/toddm/cache/CachePriority;

    move-result-object v12

    sget-object v13, Lnet/toddm/comm/CacheBehavior;->GET_ONLY_FROM_CACHE:Lnet/toddm/comm/CacheBehavior;

    .line 527
    invoke-virtual/range {v5 .. v13}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v4

    goto :goto_2

    .line 537
    :cond_4
    invoke-static {}, Lcom/shopkick/comm/FetchersCommManagerAccessor;->getInstance()Lnet/toddm/comm/CommManager;

    move-result-object v4

    iget-object v5, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->networkWork:Lnet/toddm/comm/SubmittableWork;

    invoke-virtual {v4, v5}, Lnet/toddm/comm/CommManager;->enqueueWork(Lnet/toddm/comm/SubmittableWork;)Lnet/toddm/comm/Work;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    .line 539
    :goto_2
    :try_start_1
    iput-object v4, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->networkWork:Lnet/toddm/comm/SubmittableWork;

    .line 540
    iget-object v5, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->request:Lcom/shopkick/fetchers/network/NetworkRequest;

    iget-object v6, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->networkWork:Lnet/toddm/comm/SubmittableWork;

    invoke-interface {v6}, Lnet/toddm/comm/SubmittableWork;->getId()I

    move-result v6

    invoke-virtual {v5, v6}, Lcom/shopkick/fetchers/network/NetworkRequest;->setRequestWorkId(I)V

    .line 544
    invoke-static {}, Lcom/shopkick/fetchers/network/NetworkManager;->access$100()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v5

    iget-object v6, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->networkWork:Lnet/toddm/comm/SubmittableWork;

    invoke-interface {v6}, Lnet/toddm/comm/SubmittableWork;->getId()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    .line 545
    invoke-static {}, Lcom/shopkick/fetchers/network/NetworkManager;->access$100()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v5

    iget-object v6, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->networkWork:Lnet/toddm/comm/SubmittableWork;

    invoke-interface {v6}, Lnet/toddm/comm/SubmittableWork;->getId()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 546
    invoke-static {v7}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    .line 545
    invoke-virtual {v5, v6, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 548
    :cond_5
    invoke-static {}, Lcom/shopkick/fetchers/network/NetworkManager;->access$100()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v5

    iget-object v6, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->networkWork:Lnet/toddm/comm/SubmittableWork;

    invoke-interface {v6}, Lnet/toddm/comm/SubmittableWork;->getId()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    iget-object v6, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->request:Lcom/shopkick/fetchers/network/NetworkRequest;

    iget v6, v6, Lcom/shopkick/fetchers/network/NetworkRequest;->authType:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    .line 552
    :try_start_2
    invoke-interface {v4}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 557
    :try_start_3
    invoke-static {}, Lcom/shopkick/fetchers/network/NetworkManager;->access$100()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v6

    iget-object v7, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->networkWork:Lnet/toddm/comm/SubmittableWork;

    invoke-interface {v7}, Lnet/toddm/comm/SubmittableWork;->getId()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-interface {v6, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 558
    invoke-static {}, Lcom/shopkick/fetchers/network/NetworkManager;->access$100()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v3

    iget-object v6, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->networkWork:Lnet/toddm/comm/SubmittableWork;

    invoke-interface {v6}, Lnet/toddm/comm/SubmittableWork;->getId()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-gtz v3, :cond_6

    .line 559
    invoke-static {}, Lcom/shopkick/fetchers/network/NetworkManager;->access$100()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v3

    iget-object v6, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->networkWork:Lnet/toddm/comm/SubmittableWork;

    invoke-interface {v6}, Lnet/toddm/comm/SubmittableWork;->getId()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 563
    :cond_6
    invoke-virtual {v5}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 565
    iget-object v6, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->callbackRef:Ljava/lang/ref/WeakReference;

    if-eqz v6, :cond_a

    iget-object v6, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->callbackRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v6}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_a

    iget-object v6, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->callbackRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v6}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/shopkick/fetchers/network/NetworkManager$NetworkRequestCallbacks;

    invoke-virtual {v6}, Lcom/shopkick/fetchers/network/NetworkManager$NetworkRequestCallbacks;->getParseCallback()Lcom/shopkick/fetchers/network/INetworkResponseParseCallback;

    move-result-object v6

    if-eqz v6, :cond_a

    const/16 v6, 0x191

    if-ne v3, v6, :cond_7

    .line 568
    iget-object v3, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->callbackRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/fetchers/network/NetworkManager$NetworkRequestCallbacks;

    invoke-virtual {v3}, Lcom/shopkick/fetchers/network/NetworkManager$NetworkRequestCallbacks;->getParseCallback()Lcom/shopkick/fetchers/network/INetworkResponseParseCallback;

    move-result-object v3

    invoke-virtual {v5}, Lnet/toddm/comm/Response;->getResponseBytes()[B

    move-result-object v5

    invoke-interface {v3, v5}, Lcom/shopkick/fetchers/network/INetworkResponseParseCallback;->parse401Response([B)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object v0

    move-object v1, v0

    goto :goto_3

    .line 570
    :cond_7
    iget-object v3, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->callbackRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/fetchers/network/NetworkManager$NetworkRequestCallbacks;

    .line 571
    invoke-virtual {v3}, Lcom/shopkick/fetchers/network/NetworkManager$NetworkRequestCallbacks;->getParseCallback()Lcom/shopkick/fetchers/network/INetworkResponseParseCallback;

    move-result-object v3

    iget-object v6, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->request:Lcom/shopkick/fetchers/network/NetworkRequest;

    .line 572
    invoke-virtual {v5}, Lnet/toddm/comm/Response;->getResponseBytes()[B

    move-result-object v5

    invoke-interface {v3, v6, v5}, Lcom/shopkick/fetchers/network/INetworkResponseParseCallback;->parseResponse(Lcom/shopkick/fetchers/network/NetworkRequest;[B)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object v0

    move-object v1, v0

    goto :goto_3

    :catchall_0
    move-exception v2

    .line 557
    invoke-static {}, Lcom/shopkick/fetchers/network/NetworkManager;->access$100()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v5

    iget-object v6, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->networkWork:Lnet/toddm/comm/SubmittableWork;

    invoke-interface {v6}, Lnet/toddm/comm/SubmittableWork;->getId()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 558
    invoke-static {}, Lcom/shopkick/fetchers/network/NetworkManager;->access$100()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v3

    iget-object v5, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->networkWork:Lnet/toddm/comm/SubmittableWork;

    invoke-interface {v5}, Lnet/toddm/comm/SubmittableWork;->getId()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-gtz v3, :cond_8

    .line 559
    invoke-static {}, Lcom/shopkick/fetchers/network/NetworkManager;->access$100()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v3

    iget-object v5, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->networkWork:Lnet/toddm/comm/SubmittableWork;

    invoke-interface {v5}, Lnet/toddm/comm/SubmittableWork;->getId()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    throw v2
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    move-exception v2

    goto :goto_4

    :cond_9
    move-object v4, v1

    :cond_a
    :goto_3
    move v0, v2

    goto :goto_5

    :catch_1
    move-exception v2

    move-object v4, v1

    .line 578
    :goto_4
    const-class v3, Lcom/shopkick/fetchers/network/NetworkManager;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 582
    :goto_5
    iget-object v2, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->this$0:Lcom/shopkick/fetchers/network/NetworkManager;

    invoke-virtual {v2, v4, v1, v0}, Lcom/shopkick/fetchers/network/NetworkManager;->buildDataResponseFromCommWork(Lnet/toddm/comm/Work;Ljava/lang/Object;I)Lcom/shopkick/fetchers/DataResponse;

    move-result-object v0

    .line 583
    iget-boolean v1, v0, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v1, :cond_b

    .line 584
    iget-object p1, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->this$0:Lcom/shopkick/fetchers/network/NetworkManager;

    invoke-static {p1}, Lcom/shopkick/fetchers/network/NetworkManager;->access$400(Lcom/shopkick/fetchers/network/NetworkManager;)Lcom/shopkick/app/controllers/NetworkStatsCounter;

    move-result-object p1

    const-string/jumbo v1, "success_count"

    invoke-virtual {p1, v1}, Lcom/shopkick/app/controllers/NetworkStatsCounter;->increment(Ljava/lang/String;)V

    goto :goto_6

    .line 585
    :cond_b
    iget v1, v0, Lcom/shopkick/fetchers/DataResponse;->clientError:I

    if-eqz v1, :cond_c

    iget v1, v0, Lcom/shopkick/fetchers/DataResponse;->clientError:I

    if-ne v1, p1, :cond_c

    .line 586
    iget-object p1, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->this$0:Lcom/shopkick/fetchers/network/NetworkManager;

    invoke-static {p1}, Lcom/shopkick/fetchers/network/NetworkManager;->access$400(Lcom/shopkick/fetchers/network/NetworkManager;)Lcom/shopkick/app/controllers/NetworkStatsCounter;

    move-result-object p1

    const-string v1, "no_network_error_count"

    invoke-virtual {p1, v1}, Lcom/shopkick/app/controllers/NetworkStatsCounter;->increment(Ljava/lang/String;)V

    .line 588
    :cond_c
    :goto_6
    iget-object p1, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->this$0:Lcom/shopkick/fetchers/network/NetworkManager;

    invoke-static {p1}, Lcom/shopkick/fetchers/network/NetworkManager;->access$400(Lcom/shopkick/fetchers/network/NetworkManager;)Lcom/shopkick/app/controllers/NetworkStatsCounter;

    move-result-object p1

    const-string v1, "response_count"

    invoke-virtual {p1, v1}, Lcom/shopkick/app/controllers/NetworkStatsCounter;->increment(Ljava/lang/String;)V

    return-object v0
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 470
    invoke-virtual {p0, p1}, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->doInBackground([Ljava/lang/Object;)Lcom/shopkick/fetchers/DataResponse;

    move-result-object p1

    return-object p1
.end method

.method protected onPostExecute(Lcom/shopkick/fetchers/DataResponse;)V
    .locals 3

    .line 595
    iget-object v0, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->this$0:Lcom/shopkick/fetchers/network/NetworkManager;

    invoke-static {v0}, Lcom/shopkick/fetchers/network/NetworkManager;->access$500(Lcom/shopkick/fetchers/network/NetworkManager;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->request:Lcom/shopkick/fetchers/network/NetworkRequest;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkRequestCallbacks;

    .line 596
    iget-object v1, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->this$0:Lcom/shopkick/fetchers/network/NetworkManager;

    invoke-static {v1}, Lcom/shopkick/fetchers/network/NetworkManager;->access$600(Lcom/shopkick/fetchers/network/NetworkManager;)Ljava/util/HashMap;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->request:Lcom/shopkick/fetchers/network/NetworkRequest;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 598
    invoke-virtual {v0}, Lcom/shopkick/fetchers/network/NetworkManager$NetworkRequestCallbacks;->getFinishedCallback()Lcom/shopkick/fetchers/network/INetworkRequestFinishedCallback;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 599
    invoke-virtual {v0}, Lcom/shopkick/fetchers/network/NetworkManager$NetworkRequestCallbacks;->getFinishedCallback()Lcom/shopkick/fetchers/network/INetworkRequestFinishedCallback;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->request:Lcom/shopkick/fetchers/network/NetworkRequest;

    invoke-interface {v0, v1, p1}, Lcom/shopkick/fetchers/network/INetworkRequestFinishedCallback;->receivedResponse(Lcom/shopkick/fetchers/network/NetworkRequest;Lcom/shopkick/fetchers/DataResponse;)V

    .line 600
    iget-object v0, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->this$0:Lcom/shopkick/fetchers/network/NetworkManager;

    invoke-static {v0}, Lcom/shopkick/fetchers/network/NetworkManager;->access$600(Lcom/shopkick/fetchers/network/NetworkManager;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 601
    iget-object v0, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->this$0:Lcom/shopkick/fetchers/network/NetworkManager;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/shopkick/fetchers/network/NetworkManager;->access$700(Lcom/shopkick/fetchers/network/NetworkManager;Z)V

    .line 605
    :cond_0
    iget-object v0, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->this$0:Lcom/shopkick/fetchers/network/NetworkManager;

    iget-object v1, p0, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->request:Lcom/shopkick/fetchers/network/NetworkRequest;

    invoke-static {v0, v1, p1}, Lcom/shopkick/fetchers/network/NetworkManager;->access$800(Lcom/shopkick/fetchers/network/NetworkManager;Lcom/shopkick/fetchers/network/NetworkRequest;Lcom/shopkick/fetchers/DataResponse;)V

    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 470
    check-cast p1, Lcom/shopkick/fetchers/DataResponse;

    invoke-virtual {p0, p1}, Lcom/shopkick/fetchers/network/NetworkManager$NetworkTask;->onPostExecute(Lcom/shopkick/fetchers/DataResponse;)V

    return-void
.end method
