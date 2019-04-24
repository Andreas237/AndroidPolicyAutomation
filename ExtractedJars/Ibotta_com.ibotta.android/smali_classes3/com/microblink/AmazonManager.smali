.class public final Lcom/microblink/AmazonManager;
.super Landroid/webkit/WebViewClient;


# annotations
.annotation build Landroid/support/annotation/RequiresApi;
    value = 0x13
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "AmazonManager"

.field private static volatile instance:Lcom/microblink/AmazonManager;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field

.field private static final lock:Ljava/lang/Object;


# instance fields
.field private allOrders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/amazon/AmazonOrder;",
            ">;"
        }
    .end annotation
.end field

.field private asinsToParse:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private callback:Lcom/microblink/AmazonCallback;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private dayCutoff:I

.field private gson:Lcom/google/gson/Gson;

.field private javaScript:Ljava/lang/String;

.field private loginSucceeded:Z

.field private loginTimedOut:Z

.field private loginTimer:Landroid/os/CountDownTimer;

.field private ordersCompletion:Lcom/microblink/AmazonCallback;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private ordersNeedingSeeAll:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/amazon/AmazonOrder;",
            ">;"
        }
    .end annotation
.end field

.field private ordersOnRemoteLoad:Z

.field private productLookupRepository:Lcom/microblink/internal/services/product/ProductLookupRepository;

.field private productsByAsin:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/microblink/internal/services/product/LookedUpProduct;",
            ">;"
        }
    .end annotation
.end field

.field private remoteLoadInProgress:Z

.field private final repository:Lcom/microblink/internal/services/amazon/AmazonRepository;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private storedOrders:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private verifyAccountInProgress:Z

.field private final webViewCompat:Lcom/microblink/AmazonWebViewCompat;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/microblink/AmazonManager;->lock:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Z)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    const/16 v0, 0xf

    iput v0, p0, Lcom/microblink/AmazonManager;->dayCutoff:I

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    iput-object v0, p0, Lcom/microblink/AmazonManager;->gson:Lcom/google/gson/Gson;

    new-instance v0, Lcom/microblink/internal/services/amazon/AmazonRepository;

    invoke-direct {v0, p1}, Lcom/microblink/internal/services/amazon/AmazonRepository;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/microblink/AmazonManager;->repository:Lcom/microblink/internal/services/amazon/AmazonRepository;

    new-instance v0, Lcom/microblink/AmazonWebViewCompat;

    invoke-direct {v0, p1, p0, p2}, Lcom/microblink/AmazonWebViewCompat;-><init>(Landroid/content/Context;Landroid/webkit/WebViewClient;Z)V

    iput-object v0, p0, Lcom/microblink/AmazonManager;->webViewCompat:Lcom/microblink/AmazonWebViewCompat;

    new-instance p2, Lcom/microblink/internal/services/product/ProductLookupRepository;

    new-instance v0, Lcom/microblink/internal/services/product/ProductServiceImpl;

    invoke-direct {v0}, Lcom/microblink/internal/services/product/ProductServiceImpl;-><init>()V

    invoke-direct {p2, p1, v0}, Lcom/microblink/internal/services/product/ProductLookupRepository;-><init>(Landroid/content/Context;Lcom/microblink/internal/services/product/ProductService;)V

    iput-object p2, p0, Lcom/microblink/AmazonManager;->productLookupRepository:Lcom/microblink/internal/services/product/ProductLookupRepository;

    iget-object p1, p0, Lcom/microblink/AmazonManager;->repository:Lcom/microblink/internal/services/amazon/AmazonRepository;

    new-instance p2, Lcom/microblink/AmazonManager$1;

    invoke-direct {p2, p0}, Lcom/microblink/AmazonManager$1;-><init>(Lcom/microblink/AmazonManager;)V

    invoke-virtual {p1, p2}, Lcom/microblink/internal/services/amazon/AmazonRepository;->javaScriptFromDisk(Lcom/microblink/OnCompleteListener;)V

    invoke-direct {p0}, Lcom/microblink/AmazonManager;->fetchJs()V

    iget-object p1, p0, Lcom/microblink/AmazonManager;->repository:Lcom/microblink/internal/services/amazon/AmazonRepository;

    invoke-virtual {p0}, Lcom/microblink/AmazonManager;->credentials()Lcom/microblink/AmazonCredentials;

    move-result-object p2

    new-instance v0, Lcom/microblink/AmazonManager$2;

    invoke-direct {v0, p0}, Lcom/microblink/AmazonManager$2;-><init>(Lcom/microblink/AmazonManager;)V

    invoke-virtual {p1, p2, v0}, Lcom/microblink/internal/services/amazon/AmazonRepository;->storedOrders(Lcom/microblink/AmazonCredentials;Lcom/microblink/OnCompleteListener;)V

    return-void
.end method

.method static synthetic access$000(Lcom/microblink/AmazonManager;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/microblink/AmazonManager;->javaScript:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$002(Lcom/microblink/AmazonManager;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/microblink/AmazonManager;->javaScript:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$100(Lcom/microblink/AmazonManager;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/microblink/AmazonManager;->storedOrders:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/microblink/AmazonManager;)V
    .locals 0

    invoke-direct {p0}, Lcom/microblink/AmazonManager;->doProductIntelligence()V

    return-void
.end method

.method static synthetic access$102(Lcom/microblink/AmazonManager;Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    iput-object p1, p0, Lcom/microblink/AmazonManager;->storedOrders:Ljava/util/Map;

    return-object p1
.end method

.method static synthetic access$1102(Lcom/microblink/AmazonManager;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/AmazonManager;->remoteLoadInProgress:Z

    return p1
.end method

.method static synthetic access$1200(Lcom/microblink/AmazonManager;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/microblink/AmazonManager;->ordersOnRemoteLoad:Z

    return p0
.end method

.method static synthetic access$1202(Lcom/microblink/AmazonManager;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/AmazonManager;->ordersOnRemoteLoad:Z

    return p1
.end method

.method static synthetic access$1300(Lcom/microblink/AmazonManager;)Lcom/microblink/AmazonCallback;
    .locals 0

    iget-object p0, p0, Lcom/microblink/AmazonManager;->ordersCompletion:Lcom/microblink/AmazonCallback;

    return-object p0
.end method

.method static synthetic access$1400(Lcom/microblink/AmazonManager;Lcom/microblink/AmazonCallback;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/microblink/AmazonManager;->findOrders(Lcom/microblink/AmazonCallback;)V

    return-void
.end method

.method static synthetic access$1500(Lcom/microblink/AmazonManager;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/microblink/AmazonManager;->productsByAsin:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic access$1600(Lcom/microblink/AmazonManager;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/microblink/AmazonManager;->asinsToParse:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$1700(Lcom/microblink/AmazonManager;)V
    .locals 0

    invoke-direct {p0}, Lcom/microblink/AmazonManager;->returnResults()V

    return-void
.end method

.method static synthetic access$1800(Lcom/microblink/AmazonManager;)V
    .locals 0

    invoke-direct {p0}, Lcom/microblink/AmazonManager;->cancelTimer()V

    return-void
.end method

.method static synthetic access$200(Lcom/microblink/AmazonManager;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/microblink/AmazonManager;->loginSucceeded:Z

    return p0
.end method

.method static synthetic access$302(Lcom/microblink/AmazonManager;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/AmazonManager;->loginTimedOut:Z

    return p1
.end method

.method static synthetic access$400(Lcom/microblink/AmazonManager;)Lcom/microblink/AmazonCallback;
    .locals 0

    iget-object p0, p0, Lcom/microblink/AmazonManager;->callback:Lcom/microblink/AmazonCallback;

    return-object p0
.end method

.method static synthetic access$502(Lcom/microblink/AmazonManager;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/AmazonManager;->verifyAccountInProgress:Z

    return p1
.end method

.method static synthetic access$600(Lcom/microblink/AmazonManager;)Lcom/google/gson/Gson;
    .locals 0

    iget-object p0, p0, Lcom/microblink/AmazonManager;->gson:Lcom/google/gson/Gson;

    return-object p0
.end method

.method static synthetic access$700(Lcom/microblink/AmazonManager;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/microblink/AmazonManager;->allOrders:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$800(Lcom/microblink/AmazonManager;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/microblink/AmazonManager;->ordersNeedingSeeAll:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$900(Lcom/microblink/AmazonManager;)V
    .locals 0

    invoke-direct {p0}, Lcom/microblink/AmazonManager;->visitSeeAllLinks()V

    return-void
.end method

.method private applyStoredOrders()V
    .locals 5

    sget-object v0, Lcom/microblink/AmazonManager;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lcom/microblink/AmazonManager;->hasCredentials()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/microblink/AmazonManager;->repository:Lcom/microblink/internal/services/amazon/AmazonRepository;

    invoke-virtual {p0}, Lcom/microblink/AmazonManager;->credentials()Lcom/microblink/AmazonCredentials;

    move-result-object v2

    iget-object v3, p0, Lcom/microblink/AmazonManager;->storedOrders:Ljava/util/Map;

    new-instance v4, Lcom/microblink/AmazonManager$10;

    invoke-direct {v4, p0}, Lcom/microblink/AmazonManager$10;-><init>(Lcom/microblink/AmazonManager;)V

    invoke-virtual {v1, v2, v3, v4}, Lcom/microblink/internal/services/amazon/AmazonRepository;->applyStoredOrders(Lcom/microblink/AmazonCredentials;Ljava/util/Map;Lcom/microblink/OnCompleteListener;)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private cancelTimer()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/AmazonManager;->loginTimer:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/AmazonManager;->loginTimer:Landroid/os/CountDownTimer;

    :cond_0
    return-void
.end method

.method private doProductIntelligence()V
    .locals 11

    sget-object v0, Lcom/microblink/AmazonManager;->lock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {v2}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    iput-object v2, p0, Lcom/microblink/AmazonManager;->productsByAsin:Ljava/util/Map;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, p0, Lcom/microblink/AmazonManager;->allOrders:Ljava/util/List;

    invoke-static {v3}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v3, p0, Lcom/microblink/AmazonManager;->allOrders:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/microblink/internal/services/amazon/AmazonOrder;

    invoke-virtual {v4}, Lcom/microblink/internal/services/amazon/AmazonOrder;->shipments()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/microblink/internal/services/amazon/AmazonShipment;

    invoke-virtual {v5}, Lcom/microblink/internal/services/amazon/AmazonShipment;->products()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v6

    if-nez v6, :cond_1

    const/4 v6, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_1

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/microblink/internal/services/amazon/AmazonProduct;

    invoke-virtual {v7}, Lcom/microblink/internal/services/amazon/AmazonProduct;->asin()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_2

    new-instance v8, Lcom/microblink/internal/services/product/ProductLookupItem;

    invoke-virtual {v7}, Lcom/microblink/internal/services/amazon/AmazonProduct;->description()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7}, Lcom/microblink/internal/services/amazon/AmazonProduct;->asin()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7}, Lcom/microblink/internal/services/amazon/AmazonProduct;->price()F

    move-result v7

    invoke-direct {v8, v9, v10, v7, v6}, Lcom/microblink/internal/services/product/ProductLookupItem;-><init>(Ljava/lang/String;Ljava/lang/String;FI)V

    invoke-interface {v2, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v3}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, p0, Lcom/microblink/AmazonManager;->asinsToParse:Ljava/util/List;

    invoke-static {v2}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v3

    if-nez v3, :cond_4

    iget-object v3, p0, Lcom/microblink/AmazonManager;->productLookupRepository:Lcom/microblink/internal/services/product/ProductLookupRepository;

    sget-object v4, Lcom/microblink/Retailer;->AMAZON:Lcom/microblink/Retailer;

    invoke-virtual {v4}, Lcom/microblink/Retailer;->bannerId()I

    move-result v4

    new-instance v5, Lcom/microblink/AmazonManager$8;

    invoke-direct {v5, p0}, Lcom/microblink/AmazonManager$8;-><init>(Lcom/microblink/AmazonManager;)V

    invoke-virtual {v3, v2, v4, v5}, Lcom/microblink/internal/services/product/ProductLookupRepository;->enqueue(Ljava/util/List;ILcom/microblink/OnCompleteListener;)V

    goto :goto_1

    :cond_4
    invoke-direct {p0}, Lcom/microblink/AmazonManager;->returnResults()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :catch_0
    move-exception v2

    :try_start_1
    const-string v3, "AmazonManager"

    invoke-virtual {v2}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v3, v2, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/microblink/AmazonManager;->returnResults()V

    :goto_1
    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private fetchJs()V
    .locals 4

    sget-object v0, Lcom/microblink/AmazonManager;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/microblink/AmazonManager;->remoteLoadInProgress:Z

    if-eqz v1, :cond_0

    const-string v1, "AmazonManager"

    const-string v2, "remote loading is in progress"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/microblink/AmazonManager;->remoteLoadInProgress:Z

    iget-object v1, p0, Lcom/microblink/AmazonManager;->repository:Lcom/microblink/internal/services/amazon/AmazonRepository;

    new-instance v2, Lcom/microblink/AmazonManager$7;

    invoke-direct {v2, p0}, Lcom/microblink/AmazonManager$7;-><init>(Lcom/microblink/AmazonManager;)V

    invoke-virtual {v1, v2}, Lcom/microblink/internal/services/amazon/AmazonRepository;->javaScriptFromRemote(Lcom/microblink/OnCompleteListener;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private findOrders(Lcom/microblink/AmazonCallback;)V
    .locals 4
    .param p1    # Lcom/microblink/AmazonCallback;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lcom/microblink/AmazonManager;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/AmazonManager;->javaScript:Ljava/lang/String;

    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    iget-boolean v1, p0, Lcom/microblink/AmazonManager;->remoteLoadInProgress:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/microblink/AmazonManager;->hasCredentials()Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "AmazonManager"

    const-string v3, "No credentials present, exiting grabNewAmazonOrdersInternal"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v3, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/microblink/AmazonManager;->cancelTimer()V

    sget-object v1, Lcom/microblink/AmazonException;->NO_CREDENTIALS:Lcom/microblink/AmazonException;

    invoke-interface {p1, v1}, Lcom/microblink/AmazonCallback;->onException(Lcom/microblink/AmazonException;)V

    monitor-exit v0

    return-void

    :cond_1
    new-instance v1, Lcom/microblink/AmazonManager$11;

    invoke-direct {v1, p0, p1}, Lcom/microblink/AmazonManager$11;-><init>(Lcom/microblink/AmazonManager;Lcom/microblink/AmazonCallback;)V

    iput-object v1, p0, Lcom/microblink/AmazonManager;->callback:Lcom/microblink/AmazonCallback;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/microblink/AmazonManager;->allOrders:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/microblink/AmazonManager;->ordersNeedingSeeAll:Ljava/util/List;

    iget-object p1, p0, Lcom/microblink/AmazonManager;->webViewCompat:Lcom/microblink/AmazonWebViewCompat;

    invoke-virtual {p1}, Lcom/microblink/AmazonWebViewCompat;->loadOrdersUrl()V

    monitor-exit v0

    return-void

    :cond_2
    :goto_0
    const-string v1, "AmazonManager"

    const-string v3, "No parsing code or parsing code retrieval in process, setting flag for pending grab"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v3, v2}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/microblink/AmazonManager;->ordersOnRemoteLoad:Z

    iput-object p1, p0, Lcom/microblink/AmazonManager;->ordersCompletion:Lcom/microblink/AmazonCallback;

    invoke-direct {p0}, Lcom/microblink/AmazonManager;->fetchJs()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/microblink/AmazonManager;
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lcom/microblink/AmazonManager;->instance:Lcom/microblink/AmazonManager;

    if-nez v0, :cond_1

    sget-object v0, Lcom/microblink/AmazonManager;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/microblink/AmazonManager;->instance:Lcom/microblink/AmazonManager;

    if-nez v1, :cond_0

    new-instance v1, Lcom/microblink/AmazonManager;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/microblink/AmazonManager;-><init>(Landroid/content/Context;Z)V

    sput-object v1, Lcom/microblink/AmazonManager;->instance:Lcom/microblink/AmazonManager;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    sget-object p0, Lcom/microblink/AmazonManager;->instance:Lcom/microblink/AmazonManager;

    return-object p0
.end method

.method private removeWebViewFromParent()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/AmazonManager;->webViewCompat:Lcom/microblink/AmazonWebViewCompat;

    invoke-virtual {v0}, Lcom/microblink/AmazonWebViewCompat;->view()Landroid/webkit/WebView;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/webkit/WebView;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/webkit/WebView;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v1, v1, Landroid/view/ViewGroup;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/webkit/WebView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    :cond_0
    return-void
.end method

.method private returnResults()V
    .locals 20

    move-object/from16 v1, p0

    sget-object v2, Lcom/microblink/AmazonManager;->lock:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v0, v1, Lcom/microblink/AmazonManager;->allOrders:Ljava/util/List;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct/range {p0 .. p0}, Lcom/microblink/AmazonManager;->applyStoredOrders()V

    :cond_0
    invoke-direct/range {p0 .. p0}, Lcom/microblink/AmazonManager;->removeWebViewFromParent()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, v1, Lcom/microblink/AmazonManager;->allOrders:Ljava/util/List;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, v1, Lcom/microblink/AmazonManager;->allOrders:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/microblink/internal/services/amazon/AmazonOrder;

    new-instance v5, Lcom/microblink/SummaryStats;

    invoke-direct {v5}, Lcom/microblink/SummaryStats;-><init>()V

    invoke-virtual {v5}, Lcom/microblink/SummaryStats;->start()V

    new-instance v6, Lcom/microblink/Receipt;

    sget-object v7, Lcom/microblink/Retailer;->AMAZON:Lcom/microblink/Retailer;

    invoke-direct {v6, v7}, Lcom/microblink/Receipt;-><init>(Lcom/microblink/Retailer;)V

    sget-object v7, Lcom/microblink/Retailer;->AMAZON:Lcom/microblink/Retailer;

    invoke-virtual {v7}, Lcom/microblink/Retailer;->bannerId()I

    move-result v7

    invoke-virtual {v6, v7}, Lcom/microblink/Receipt;->detectedBannerId(I)Lcom/microblink/Receipt;

    new-instance v7, Lcom/microblink/DateTime;

    invoke-direct {v7}, Lcom/microblink/DateTime;-><init>()V

    new-instance v8, Ljava/util/Date;

    invoke-virtual {v0}, Lcom/microblink/internal/services/amazon/AmazonOrder;->dateUTC()J

    move-result-wide v9

    invoke-direct {v8, v9, v10}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v7, v8}, Lcom/microblink/DateTime;->dateTime(Ljava/util/Date;)Lcom/microblink/DateTime;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/microblink/Receipt;->purchaseDateTime(Lcom/microblink/DateTime;)Lcom/microblink/Receipt;

    invoke-virtual {v0}, Lcom/microblink/internal/services/amazon/AmazonOrder;->total()F

    move-result v7

    const/high16 v8, 0x42c80000    # 100.0f

    invoke-static {v7, v8}, Lcom/microblink/TypeValueUtils;->valueOf(FF)Lcom/microblink/FloatType;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/microblink/Receipt;->total(Lcom/microblink/FloatType;)Lcom/microblink/Receipt;

    invoke-virtual {v0}, Lcom/microblink/internal/services/amazon/AmazonOrder;->shipments()Ljava/util/List;

    move-result-object v7

    invoke-static {v7}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v9

    if-nez v9, :cond_7

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/microblink/internal/services/amazon/AmazonShipment;

    invoke-virtual {v10}, Lcom/microblink/internal/services/amazon/AmazonShipment;->products()Ljava/util/List;

    move-result-object v11

    invoke-static {v11}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v12

    if-nez v12, :cond_4

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    new-instance v13, Lcom/microblink/internal/amazon/AmazonProductMapper;

    invoke-direct {v13}, Lcom/microblink/internal/amazon/AmazonProductMapper;-><init>()V

    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_3

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/microblink/internal/services/amazon/AmazonProduct;

    invoke-virtual {v13, v14}, Lcom/microblink/internal/amazon/AmazonProductMapper;->transform(Lcom/microblink/internal/services/amazon/AmazonProduct;)Lcom/microblink/Product;

    move-result-object v15

    invoke-interface {v12, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v15, Lcom/microblink/internal/OcrProduct;

    invoke-direct {v15}, Lcom/microblink/internal/OcrProduct;-><init>()V

    invoke-virtual {v14}, Lcom/microblink/internal/services/amazon/AmazonProduct;->qty()I

    move-result v16

    if-gtz v16, :cond_1

    const/16 v16, 0x1

    move-object/from16 v16, v4

    const/4 v8, 0x1

    goto :goto_3

    :cond_1
    invoke-virtual {v14}, Lcom/microblink/internal/services/amazon/AmazonProduct;->qty()I

    move-result v16

    move/from16 v8, v16

    move-object/from16 v16, v4

    :goto_3
    invoke-virtual {v14}, Lcom/microblink/internal/services/amazon/AmazonProduct;->price()F

    move-result v4

    move-object/from16 v17, v7

    int-to-float v7, v8

    mul-float v7, v7, v4

    move-object/from16 v18, v11

    invoke-virtual {v14}, Lcom/microblink/internal/services/amazon/AmazonProduct;->asin()Ljava/lang/String;

    move-result-object v11

    iput-object v11, v15, Lcom/microblink/internal/OcrProduct;->sku:Ljava/lang/String;

    move-object/from16 v19, v13

    const/high16 v13, 0x42c80000    # 100.0f

    iput v13, v15, Lcom/microblink/internal/OcrProduct;->skuConfidence:F

    invoke-virtual {v14}, Lcom/microblink/internal/services/amazon/AmazonProduct;->description()Ljava/lang/String;

    move-result-object v13

    iput-object v13, v15, Lcom/microblink/internal/OcrProduct;->description:Ljava/lang/String;

    const/high16 v13, 0x42c80000    # 100.0f

    iput v13, v15, Lcom/microblink/internal/OcrProduct;->descriptionConfidence:F

    iput v8, v15, Lcom/microblink/internal/OcrProduct;->quantity:I

    iput v13, v15, Lcom/microblink/internal/OcrProduct;->quantityConfidence:F

    iput v4, v15, Lcom/microblink/internal/OcrProduct;->price:F

    iput v13, v15, Lcom/microblink/internal/OcrProduct;->priceConfidence:F

    iput v7, v15, Lcom/microblink/internal/OcrProduct;->totalPrice:F

    iput v13, v15, Lcom/microblink/internal/OcrProduct;->totalPriceConfidence:F

    invoke-virtual {v14}, Lcom/microblink/internal/services/amazon/AmazonProduct;->brand()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v15, Lcom/microblink/internal/OcrProduct;->brand:Ljava/lang/String;

    invoke-virtual {v14}, Lcom/microblink/internal/services/amazon/AmazonProduct;->productName()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v15, Lcom/microblink/internal/OcrProduct;->name:Ljava/lang/String;

    invoke-virtual {v14}, Lcom/microblink/internal/services/amazon/AmazonProduct;->imageUrl()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v15, Lcom/microblink/internal/OcrProduct;->imageUrl:Ljava/lang/String;

    invoke-virtual {v14}, Lcom/microblink/internal/services/amazon/AmazonProduct;->category()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v15, Lcom/microblink/internal/OcrProduct;->category:Ljava/lang/String;

    invoke-virtual {v14}, Lcom/microblink/internal/services/amazon/AmazonProduct;->upc()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v15, Lcom/microblink/internal/OcrProduct;->upc:Ljava/lang/String;

    invoke-virtual {v14}, Lcom/microblink/internal/services/amazon/AmazonProduct;->size()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v15, Lcom/microblink/internal/OcrProduct;->size:Ljava/lang/String;

    invoke-virtual {v14}, Lcom/microblink/internal/services/amazon/AmazonProduct;->rewardsGroup()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v15, Lcom/microblink/internal/OcrProduct;->rewardsGroup:Ljava/lang/String;

    invoke-virtual {v14}, Lcom/microblink/internal/services/amazon/AmazonProduct;->competitorRewardsGroup()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v15, Lcom/microblink/internal/OcrProduct;->competitorRewardsGroup:Ljava/lang/String;

    invoke-static {v11}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, v1, Lcom/microblink/AmazonManager;->productsByAsin:Ljava/util/Map;

    if-eqz v4, :cond_2

    iget-object v4, v1, Lcom/microblink/AmazonManager;->productsByAsin:Ljava/util/Map;

    invoke-interface {v4, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/microblink/internal/services/product/LookedUpProduct;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lcom/microblink/internal/services/product/LookedUpProduct;->brand()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v15, Lcom/microblink/internal/OcrProduct;->brand:Ljava/lang/String;

    invoke-virtual {v4}, Lcom/microblink/internal/services/product/LookedUpProduct;->productName()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v15, Lcom/microblink/internal/OcrProduct;->name:Ljava/lang/String;

    invoke-virtual {v4}, Lcom/microblink/internal/services/product/LookedUpProduct;->imageUrl()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v15, Lcom/microblink/internal/OcrProduct;->imageUrl:Ljava/lang/String;

    invoke-virtual {v4}, Lcom/microblink/internal/services/product/LookedUpProduct;->category()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v15, Lcom/microblink/internal/OcrProduct;->category:Ljava/lang/String;

    invoke-virtual {v4}, Lcom/microblink/internal/services/product/LookedUpProduct;->upc()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v15, Lcom/microblink/internal/OcrProduct;->upc:Ljava/lang/String;

    invoke-virtual {v4}, Lcom/microblink/internal/services/product/LookedUpProduct;->size()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v15, Lcom/microblink/internal/OcrProduct;->size:Ljava/lang/String;

    invoke-virtual {v4}, Lcom/microblink/internal/services/product/LookedUpProduct;->rewardsGroup()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v15, Lcom/microblink/internal/OcrProduct;->rewardsGroup:Ljava/lang/String;

    invoke-virtual {v4}, Lcom/microblink/internal/services/product/LookedUpProduct;->competitorRewardsGroup()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v15, Lcom/microblink/internal/OcrProduct;->competitorRewardsGroup:Ljava/lang/String;

    :cond_2
    invoke-virtual {v6, v15}, Lcom/microblink/Receipt;->addOcrProduct(Lcom/microblink/internal/OcrProduct;)Lcom/microblink/Receipt;

    move-object/from16 v4, v16

    move-object/from16 v7, v17

    move-object/from16 v11, v18

    move-object/from16 v13, v19

    const/high16 v8, 0x42c80000    # 100.0f

    goto/16 :goto_2

    :cond_3
    move-object/from16 v16, v4

    move-object/from16 v17, v7

    const/high16 v13, 0x42c80000    # 100.0f

    invoke-static {}, Lcom/microblink/Shipment;->newBuilder()Lcom/microblink/Shipment$Builder;

    move-result-object v4

    invoke-virtual {v4, v12}, Lcom/microblink/Shipment$Builder;->products(Ljava/util/List;)Lcom/microblink/Shipment$Builder;

    move-result-object v4

    invoke-virtual {v10}, Lcom/microblink/internal/services/amazon/AmazonShipment;->status()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Lcom/microblink/Shipment$Builder;->status(Ljava/lang/String;)Lcom/microblink/Shipment$Builder;

    move-result-object v4

    invoke-virtual {v4}, Lcom/microblink/Shipment$Builder;->build()Lcom/microblink/Shipment;

    move-result-object v4

    invoke-interface {v9, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_4
    move-object/from16 v16, v4

    move-object/from16 v17, v7

    const/high16 v13, 0x42c80000    # 100.0f

    :goto_4
    move-object/from16 v4, v16

    move-object/from16 v7, v17

    const/high16 v8, 0x42c80000    # 100.0f

    goto/16 :goto_1

    :cond_5
    move-object/from16 v16, v4

    invoke-virtual {v6}, Lcom/microblink/Receipt;->purchaseDateTime()Lcom/microblink/DateTime;

    move-result-object v4

    const/4 v7, 0x0

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Lcom/microblink/DateTime;->date()Lcom/microblink/StringType;

    move-result-object v8

    invoke-virtual {v4}, Lcom/microblink/DateTime;->time()Lcom/microblink/StringType;

    move-result-object v4

    goto :goto_5

    :cond_6
    move-object v4, v7

    move-object v8, v4

    :goto_5
    invoke-static {}, Lcom/microblink/ScanResults;->newBuilder()Lcom/microblink/ScanResults$Builder;

    move-result-object v10

    invoke-virtual {v6}, Lcom/microblink/Receipt;->retailer()Lcom/microblink/Retailer;

    move-result-object v11

    invoke-virtual {v10, v11}, Lcom/microblink/ScanResults$Builder;->retailerId(Lcom/microblink/Retailer;)Lcom/microblink/ScanResults$Builder;

    move-result-object v10

    new-instance v11, Lcom/microblink/internal/OcrToProductMapper;

    invoke-direct {v11}, Lcom/microblink/internal/OcrToProductMapper;-><init>()V

    invoke-virtual {v6}, Lcom/microblink/Receipt;->ocrProducts()Ljava/util/List;

    move-result-object v12

    invoke-virtual {v11, v12}, Lcom/microblink/internal/OcrToProductMapper;->transform(Ljava/util/List;)Ljava/util/List;

    move-result-object v11

    invoke-virtual {v10, v11}, Lcom/microblink/ScanResults$Builder;->products(Ljava/util/List;)Lcom/microblink/ScanResults$Builder;

    move-result-object v10

    invoke-virtual {v0}, Lcom/microblink/internal/services/amazon/AmazonOrder;->shippingAddress()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Lcom/microblink/ScanResults$Builder;->eReceiptShippingAddress(Ljava/lang/String;)Lcom/microblink/ScanResults$Builder;

    move-result-object v10

    invoke-virtual {v0}, Lcom/microblink/internal/services/amazon/AmazonOrder;->rawHtml()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Lcom/microblink/ScanResults$Builder;->eReceiptRawHtml(Ljava/lang/String;)Lcom/microblink/ScanResults$Builder;

    move-result-object v10

    invoke-virtual {v0}, Lcom/microblink/internal/services/amazon/AmazonOrder;->orderNumber()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/microblink/ScanResults$Builder;->eReceiptOrderNumber(Ljava/lang/String;)Lcom/microblink/ScanResults$Builder;

    move-result-object v0

    invoke-virtual {v0, v9}, Lcom/microblink/ScanResults$Builder;->shipments(Ljava/util/List;)Lcom/microblink/ScanResults$Builder;

    move-result-object v0

    invoke-virtual {v6}, Lcom/microblink/Receipt;->total()Lcom/microblink/FloatType;

    move-result-object v9

    invoke-virtual {v0, v9}, Lcom/microblink/ScanResults$Builder;->total(Lcom/microblink/FloatType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v0

    invoke-virtual {v6}, Lcom/microblink/Receipt;->subTotal()Lcom/microblink/FloatType;

    move-result-object v9

    invoke-virtual {v0, v9}, Lcom/microblink/ScanResults$Builder;->subTotal(Lcom/microblink/FloatType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v0

    invoke-virtual {v6}, Lcom/microblink/Receipt;->taxes()Lcom/microblink/FloatType;

    move-result-object v9

    invoke-virtual {v0, v9}, Lcom/microblink/ScanResults$Builder;->taxes(Lcom/microblink/FloatType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/microblink/ScanResults$Builder;->receiptDate(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/microblink/ScanResults$Builder;->receiptTime(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v0

    invoke-virtual {v6}, Lcom/microblink/Receipt;->storeNumber()Lcom/microblink/StringType;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/microblink/ScanResults$Builder;->storeNumber(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v0

    invoke-virtual {v6}, Lcom/microblink/Receipt;->merchantName()Lcom/microblink/StringType;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/microblink/ScanResults$Builder;->merchantName(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v0

    invoke-virtual {v6}, Lcom/microblink/Receipt;->storeAddress()Lcom/microblink/StringType;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/microblink/ScanResults$Builder;->storeAddress(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v0

    invoke-virtual {v6}, Lcom/microblink/Receipt;->storeCity()Lcom/microblink/StringType;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/microblink/ScanResults$Builder;->storeCity(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v0

    invoke-virtual {v6}, Lcom/microblink/Receipt;->storeState()Lcom/microblink/StringType;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/microblink/ScanResults$Builder;->storeState(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v0

    invoke-virtual {v6}, Lcom/microblink/Receipt;->storeZip()Lcom/microblink/StringType;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/microblink/ScanResults$Builder;->storeZip(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v0

    invoke-virtual {v6}, Lcom/microblink/Receipt;->storePhone()Lcom/microblink/StringType;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/microblink/ScanResults$Builder;->storePhone(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v0

    invoke-virtual {v6}, Lcom/microblink/Receipt;->cashierId()Lcom/microblink/StringType;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/microblink/ScanResults$Builder;->cashierId(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v0

    invoke-virtual {v6}, Lcom/microblink/Receipt;->transactionId()Lcom/microblink/StringType;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/microblink/ScanResults$Builder;->transactionId(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v0

    invoke-virtual {v6}, Lcom/microblink/Receipt;->register()Lcom/microblink/StringType;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/microblink/ScanResults$Builder;->registerId(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v0

    invoke-virtual {v6}, Lcom/microblink/Receipt;->paymentMethods()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/microblink/ScanResults$Builder;->paymentMethods(Ljava/util/List;)Lcom/microblink/ScanResults$Builder;

    move-result-object v0

    invoke-virtual {v6}, Lcom/microblink/Receipt;->receiptId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/microblink/ScanResults$Builder;->blinkReceiptId(Ljava/lang/String;)Lcom/microblink/ScanResults$Builder;

    move-result-object v0

    invoke-virtual {v6}, Lcom/microblink/Receipt;->taxId()Lcom/microblink/StringType;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/microblink/ScanResults$Builder;->taxId(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v0

    invoke-virtual {v6}, Lcom/microblink/Receipt;->mallName()Lcom/microblink/StringType;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/microblink/ScanResults$Builder;->mallName(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v0

    invoke-virtual {v6}, Lcom/microblink/Receipt;->ocrConfidence()F

    move-result v4

    invoke-virtual {v0, v4}, Lcom/microblink/ScanResults$Builder;->ocrConfidence(F)Lcom/microblink/ScanResults$Builder;

    move-result-object v0

    invoke-virtual {v6}, Lcom/microblink/Receipt;->merchantSource()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/microblink/ScanResults$Builder;->merchantSource(Ljava/lang/String;)Lcom/microblink/ScanResults$Builder;

    move-result-object v0

    invoke-virtual {v6}, Lcom/microblink/Receipt;->foundTopEdge()Z

    move-result v4

    invoke-virtual {v0, v4}, Lcom/microblink/ScanResults$Builder;->foundTopEdge(Z)Lcom/microblink/ScanResults$Builder;

    move-result-object v0

    invoke-virtual {v6}, Lcom/microblink/Receipt;->foundBottomEdge()Z

    move-result v4

    invoke-virtual {v0, v4}, Lcom/microblink/ScanResults$Builder;->foundBottomEdge(Z)Lcom/microblink/ScanResults$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/ScanResults$Builder;->build()Lcom/microblink/ScanResults;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v5}, Lcom/microblink/SummaryStats;->stop()V

    new-instance v0, Lcom/microblink/SummaryRepository;

    invoke-direct {v0}, Lcom/microblink/SummaryRepository;-><init>()V

    new-instance v4, Lcom/microblink/AmazonManager$9;

    invoke-direct {v4, v1}, Lcom/microblink/AmazonManager$9;-><init>(Lcom/microblink/AmazonManager;)V

    invoke-virtual {v0, v5, v6, v7, v4}, Lcom/microblink/SummaryRepository;->summary(Lcom/microblink/SummaryStats;Lcom/microblink/Receipt;Lcom/microblink/internal/merchant/MerchantResult;Lcom/microblink/OnCompleteListener;)Lcom/microblink/SummaryRepository;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_6

    :catch_0
    move-exception v0

    :try_start_2
    const-string v4, "AmazonManager"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v4, v0, v5}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_6

    :cond_7
    move-object/from16 v16, v4

    :goto_6
    move-object/from16 v4, v16

    goto/16 :goto_0

    :cond_8
    iget-object v0, v1, Lcom/microblink/AmazonManager;->callback:Lcom/microblink/AmazonCallback;

    if-eqz v0, :cond_9

    iget-object v0, v1, Lcom/microblink/AmazonManager;->callback:Lcom/microblink/AmazonCallback;

    invoke-interface {v0, v3}, Lcom/microblink/AmazonCallback;->onComplete(Ljava/util/List;)V

    :cond_9
    monitor-exit v2

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method private visitSeeAllLinks()V
    .locals 4

    iget-object v0, p0, Lcom/microblink/AmazonManager;->ordersNeedingSeeAll:Ljava/util/List;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/microblink/AmazonManager;->doProductIntelligence()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/microblink/AmazonManager;->ordersNeedingSeeAll:Ljava/util/List;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->getFirst(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/microblink/internal/services/amazon/AmazonOrder;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/microblink/internal/services/amazon/AmazonOrder;->shipments()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/microblink/internal/services/amazon/AmazonShipment;

    invoke-virtual {v2}, Lcom/microblink/internal/services/amazon/AmazonShipment;->seeAllLink()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    move-object v1, v2

    :cond_2
    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lcom/microblink/AmazonManager;->doProductIntelligence()V

    return-void

    :cond_3
    iget-object v0, p0, Lcom/microblink/AmazonManager;->webViewCompat:Lcom/microblink/AmazonWebViewCompat;

    invoke-virtual {v0, v1}, Lcom/microblink/AmazonWebViewCompat;->loadUrl(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final clearCredentials()V
    .locals 2

    sget-object v0, Lcom/microblink/AmazonManager;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lcom/microblink/AmazonManager;->clearOrders()V

    iget-object v1, p0, Lcom/microblink/AmazonManager;->repository:Lcom/microblink/internal/services/amazon/AmazonRepository;

    invoke-virtual {v1}, Lcom/microblink/internal/services/amazon/AmazonRepository;->clearCredentials()Z

    iget-object v1, p0, Lcom/microblink/AmazonManager;->webViewCompat:Lcom/microblink/AmazonWebViewCompat;

    invoke-virtual {v1}, Lcom/microblink/AmazonWebViewCompat;->clearCache()V

    iget-object v1, p0, Lcom/microblink/AmazonManager;->webViewCompat:Lcom/microblink/AmazonWebViewCompat;

    invoke-virtual {v1}, Lcom/microblink/AmazonWebViewCompat;->clearCookies()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final clearOrders()V
    .locals 2

    sget-object v0, Lcom/microblink/AmazonManager;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/AmazonManager;->repository:Lcom/microblink/internal/services/amazon/AmazonRepository;

    invoke-virtual {v1}, Lcom/microblink/internal/services/amazon/AmazonRepository;->clearOrders()Z

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-static {v1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    iput-object v1, p0, Lcom/microblink/AmazonManager;->storedOrders:Ljava/util/Map;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final credentials()Lcom/microblink/AmazonCredentials;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    sget-object v0, Lcom/microblink/AmazonManager;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/AmazonManager;->repository:Lcom/microblink/internal/services/amazon/AmazonRepository;

    invoke-virtual {v1}, Lcom/microblink/internal/services/amazon/AmazonRepository;->credentials()Lcom/microblink/AmazonCredentials;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final credentials(Lcom/microblink/AmazonCredentials;)Z
    .locals 2
    .param p1    # Lcom/microblink/AmazonCredentials;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lcom/microblink/AmazonManager;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/AmazonManager;->repository:Lcom/microblink/internal/services/amazon/AmazonRepository;

    invoke-virtual {v1, p1}, Lcom/microblink/internal/services/amazon/AmazonRepository;->applyCredentials(Lcom/microblink/AmazonCredentials;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final dayCutoff(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    sget-object v0, Lcom/microblink/AmazonManager;->lock:Ljava/lang/Object;

    monitor-enter v0

    if-lez p1, :cond_0

    :try_start_0
    iput p1, p0, Lcom/microblink/AmazonManager;->dayCutoff:I

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v1, "Days should be greater than 0"

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final hasCredentials()Z
    .locals 2

    sget-object v0, Lcom/microblink/AmazonManager;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lcom/microblink/AmazonManager;->credentials()Lcom/microblink/AmazonCredentials;

    move-result-object v1

    invoke-virtual {v1}, Lcom/microblink/AmazonCredentials;->has()Z

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 8

    const-string v0, "AmazonManager"

    const-string v1, "Finished navigation and URL is: "

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v3}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/microblink/AmazonManager;->loginTimedOut:Z

    if-eqz v0, :cond_0

    const-string p1, "AmazonManager"

    const-string p2, "Detected timeout so bailing out"

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    sget-object v0, Lcom/microblink/internal/amazon/AmazonPage;->UNKNOWN:Lcom/microblink/internal/amazon/AmazonPage;

    iget-object v1, p0, Lcom/microblink/AmazonManager;->javaScript:Ljava/lang/String;

    const-string v3, "openid"

    invoke-virtual {p2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_8

    const-string v3, "signin"

    invoke-virtual {p2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v3, "order-history"

    invoke-virtual {p2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3

    sget-object v0, Lcom/microblink/internal/amazon/AmazonPage;->ORDER_HISTORY:Lcom/microblink/internal/amazon/AmazonPage;

    iput-boolean v4, p0, Lcom/microblink/AmazonManager;->loginSucceeded:Z

    iget-boolean p2, p0, Lcom/microblink/AmazonManager;->verifyAccountInProgress:Z

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/microblink/AmazonManager;->callback:Lcom/microblink/AmazonCallback;

    if-eqz p2, :cond_2

    sget-object p1, Lcom/microblink/AmazonException;->NONE:Lcom/microblink/AmazonException;

    invoke-interface {p2, p1}, Lcom/microblink/AmazonCallback;->onException(Lcom/microblink/AmazonException;)V

    return-void

    :cond_2
    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, " parseOrders20180608(\'\',%d)"

    new-array v4, v4, [Ljava/lang/Object;

    iget v5, p0, Lcom/microblink/AmazonManager;->dayCutoff:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {p2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    goto/16 :goto_2

    :cond_3
    const-string v3, "order-details"

    invoke-virtual {p2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_4

    sget-object v0, Lcom/microblink/internal/amazon/AmazonPage;->ORDER_DETAILS:Lcom/microblink/internal/amazon/AmazonPage;

    const-string p2, " parseOrderDetails();"

    goto/16 :goto_2

    :cond_4
    const-string v3, "/product/"

    invoke-virtual {p2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_5

    const-string p2, "AmazonManager"

    const-string v0, "Product page detected, attempting parse..."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2, v0, v2}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Lcom/microblink/internal/amazon/AmazonPage;->PRODUCT:Lcom/microblink/internal/amazon/AmazonPage;

    const-string p2, " parseProduct();"

    goto/16 :goto_2

    :cond_5
    const-string v3, "/cvf/request"

    invoke-virtual {p2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_7

    const-string v3, "/mfa?"

    invoke-virtual {p2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_0

    :cond_6
    const-string v3, "/cvf/verify"

    invoke-virtual {p2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_b

    sget-object v0, Lcom/microblink/internal/amazon/AmazonPage;->ENTER_CODE:Lcom/microblink/internal/amazon/AmazonPage;

    const-string p2, "AmazonManager"

    const-string v3, "Enter code page detected..."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2, v3, v2}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    :cond_7
    :goto_0
    sget-object v0, Lcom/microblink/internal/amazon/AmazonPage;->VERIFICATION_NEEDED:Lcom/microblink/internal/amazon/AmazonPage;

    const-string p2, "AmazonManager"

    const-string v3, "Verification needed page detected, returning to client..."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2, v3, v2}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/microblink/AmazonManager;->callback:Lcom/microblink/AmazonCallback;

    if-eqz p2, :cond_b

    sget-object v2, Lcom/microblink/AmazonException;->VERIFICATION_NEEDED:Lcom/microblink/AmazonException;

    invoke-interface {p2, v2}, Lcom/microblink/AmazonCallback;->onException(Lcom/microblink/AmazonException;)V

    goto :goto_3

    :cond_8
    :goto_1
    sget-object v0, Lcom/microblink/internal/amazon/AmazonPage;->LOGIN:Lcom/microblink/internal/amazon/AmazonPage;

    const-string p2, "AmazonManager"

    const-string v3, "Login page found!"

    new-array v5, v2, [Ljava/lang/Object;

    invoke-static {p2, v3, v5}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/microblink/AmazonManager;->hasCredentials()Z

    move-result p2

    if-nez p2, :cond_a

    const-string p1, "AmazonManager"

    const-string p2, "attempting to login, but credentials have been cleared before page finsihed loading!!!"

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/AmazonManager;->callback:Lcom/microblink/AmazonCallback;

    if-eqz p1, :cond_9

    sget-object p2, Lcom/microblink/AmazonException;->NO_CREDENTIALS:Lcom/microblink/AmazonException;

    invoke-interface {p1, p2}, Lcom/microblink/AmazonCallback;->onException(Lcom/microblink/AmazonException;)V

    :cond_9
    return-void

    :cond_a
    invoke-virtual {p0}, Lcom/microblink/AmazonManager;->credentials()Lcom/microblink/AmazonCredentials;

    move-result-object p2

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, " doLogin(\'%1$s\',\'%2$s\');"

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/microblink/AmazonCredentials;->email()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v2

    invoke-virtual {p2}, Lcom/microblink/AmazonCredentials;->password()Ljava/lang/String;

    move-result-object p2

    aput-object p2, v6, v4

    invoke-static {v3, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    :goto_2
    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_b
    :goto_3
    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_c

    new-instance p2, Lcom/microblink/AmazonManager$6;

    invoke-direct {p2, p0, v0, p1}, Lcom/microblink/AmazonManager$6;-><init>(Lcom/microblink/AmazonManager;Lcom/microblink/internal/amazon/AmazonPage;Landroid/webkit/WebView;)V

    invoke-virtual {p1, v1, p2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    :cond_c
    return-void
.end method

.method public final orders(Lcom/microblink/AmazonCallback;)V
    .locals 8
    .param p1    # Lcom/microblink/AmazonCallback;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lcom/microblink/AmazonManager;->lock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v1, p0, Lcom/microblink/AmazonManager;->verifyAccountInProgress:Z

    iput-boolean v1, p0, Lcom/microblink/AmazonManager;->loginTimedOut:Z

    iput-boolean v1, p0, Lcom/microblink/AmazonManager;->loginSucceeded:Z

    invoke-direct {p0}, Lcom/microblink/AmazonManager;->cancelTimer()V

    new-instance v1, Lcom/microblink/AmazonManager$3;

    const-wide/32 v4, 0xea60

    const-wide/16 v6, 0x3e8

    move-object v2, v1

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Lcom/microblink/AmazonManager$3;-><init>(Lcom/microblink/AmazonManager;JJ)V

    iput-object v1, p0, Lcom/microblink/AmazonManager;->loginTimer:Landroid/os/CountDownTimer;

    new-instance v1, Lcom/microblink/AmazonManager$4;

    invoke-direct {v1, p0, p1}, Lcom/microblink/AmazonManager$4;-><init>(Lcom/microblink/AmazonManager;Lcom/microblink/AmazonCallback;)V

    invoke-direct {p0, v1}, Lcom/microblink/AmazonManager;->findOrders(Lcom/microblink/AmazonCallback;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final verifyAccount(Lcom/microblink/AmazonCallback;)V
    .locals 2
    .param p1    # Lcom/microblink/AmazonCallback;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lcom/microblink/AmazonManager;->lock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lcom/microblink/AmazonManager;->verifyAccountInProgress:Z

    new-instance v1, Lcom/microblink/AmazonManager$5;

    invoke-direct {v1, p0, p1}, Lcom/microblink/AmazonManager$5;-><init>(Lcom/microblink/AmazonManager;Lcom/microblink/AmazonCallback;)V

    invoke-direct {p0, v1}, Lcom/microblink/AmazonManager;->findOrders(Lcom/microblink/AmazonCallback;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final webView()Landroid/webkit/WebView;
    .locals 1

    invoke-direct {p0}, Lcom/microblink/AmazonManager;->removeWebViewFromParent()V

    iget-object v0, p0, Lcom/microblink/AmazonManager;->webViewCompat:Lcom/microblink/AmazonWebViewCompat;

    invoke-virtual {v0}, Lcom/microblink/AmazonWebViewCompat;->view()Landroid/webkit/WebView;

    move-result-object v0

    return-object v0
.end method
