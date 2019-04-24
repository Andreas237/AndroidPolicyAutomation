.class public Lcom/microblink/internal/services/google/GoogleNearbySearchRepository;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/Cancelable;


# static fields
.field private static final TAG:Ljava/lang/String; = "GoogleNearbySearchRepository"


# instance fields
.field private callableService:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/concurrent/Callable<",
            "Lcom/microblink/internal/services/google/NearbySearchResults;",
            ">;>;"
        }
    .end annotation
.end field

.field private executorService:Ljava/util/concurrent/ExecutorService;

.field private mapper:Lcom/microblink/internal/merchant/MerchantDetectionMapper;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/microblink/internal/merchant/MerchantDetectionMapper<",
            "Lcom/microblink/internal/services/google/GoogleAreaSearchLookupResult;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/microblink/internal/merchant/MerchantDetectionMapper;)V
    .locals 1
    .param p1    # Lcom/microblink/internal/merchant/MerchantDetectionMapper;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/internal/merchant/MerchantDetectionMapper<",
            "Lcom/microblink/internal/services/google/GoogleAreaSearchLookupResult;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/internal/services/google/GoogleNearbySearchRepository;->executorService:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/microblink/internal/services/google/GoogleNearbySearchRepository;->callableService:Ljava/util/List;

    iput-object p1, p0, Lcom/microblink/internal/services/google/GoogleNearbySearchRepository;->mapper:Lcom/microblink/internal/merchant/MerchantDetectionMapper;

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/google/GoogleNearbySearchRepository;->executorService:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    return-void
.end method

.method public varargs enqueue(Lcom/microblink/OnNullableCompleteListener;[Lcom/microblink/internal/services/lookup/StoreLookupRequest;)V
    .locals 7
    .param p1    # Lcom/microblink/OnNullableCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # [Lcom/microblink/internal/services/lookup/StoreLookupRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/OnNullableCompleteListener<",
            "Lcom/microblink/internal/merchant/MerchantDetection;",
            ">;[",
            "Lcom/microblink/internal/services/lookup/StoreLookupRequest;",
            ")V"
        }
    .end annotation

    array-length v0, p2

    if-lez v0, :cond_2

    new-instance v0, Lcom/microblink/internal/services/google/GoogleAreaSearchLookupResult;

    invoke-direct {v0}, Lcom/microblink/internal/services/google/GoogleAreaSearchLookupResult;-><init>()V

    array-length v1, p2

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, p2, v3

    iget-object v5, p0, Lcom/microblink/internal/services/google/GoogleNearbySearchRepository;->callableService:Ljava/util/List;

    new-instance v6, Lcom/microblink/internal/services/google/GoogleNearbySearchCallable;

    invoke-direct {v6, v4}, Lcom/microblink/internal/services/google/GoogleNearbySearchCallable;-><init>(Lcom/microblink/internal/services/lookup/StoreLookupRequest;)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object p2, p0, Lcom/microblink/internal/services/google/GoogleNearbySearchRepository;->executorService:Ljava/util/concurrent/ExecutorService;

    iget-object v1, p0, Lcom/microblink/internal/services/google/GoogleNearbySearchRepository;->callableService:Ljava/util/List;

    invoke-interface {p2, v1}, Ljava/util/concurrent/ExecutorService;->invokeAll(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p2

    iget-object v1, p0, Lcom/microblink/internal/services/google/GoogleNearbySearchRepository;->executorService:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/Future;

    invoke-interface {v3}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1}, Lcom/microblink/internal/services/google/GoogleAreaSearchLookupResult;->nearbySearchResults(Ljava/util/List;)Lcom/microblink/internal/services/google/GoogleAreaSearchLookupResult;

    iget-object p2, p0, Lcom/microblink/internal/services/google/GoogleNearbySearchRepository;->mapper:Lcom/microblink/internal/merchant/MerchantDetectionMapper;

    invoke-interface {p2, v0}, Lcom/microblink/internal/merchant/MerchantDetectionMapper;->transform(Ljava/lang/Object;)Lcom/microblink/internal/merchant/MerchantDetection;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/microblink/OnNullableCompleteListener;->onComplete(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p2

    const-string v1, "GoogleNearbySearchRepository"

    invoke-virtual {p2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, p2, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/microblink/internal/services/google/GoogleNearbySearchRepository;->mapper:Lcom/microblink/internal/merchant/MerchantDetectionMapper;

    invoke-interface {p2, v0}, Lcom/microblink/internal/merchant/MerchantDetectionMapper;->transform(Ljava/lang/Object;)Lcom/microblink/internal/merchant/MerchantDetection;

    move-result-object p2

    :goto_2
    invoke-interface {p1, p2}, Lcom/microblink/OnNullableCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void

    :cond_2
    const/4 p2, 0x0

    goto :goto_2
.end method

.method public varargs execute([Lcom/microblink/internal/services/lookup/StoreLookupRequest;)Lcom/microblink/internal/merchant/MerchantDetection;
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lcom/microblink/internal/services/google/GoogleNearbyServiceImpl;

    invoke-direct {v1}, Lcom/microblink/internal/services/google/GoogleNearbyServiceImpl;-><init>()V

    array-length v2, p1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, p1, v3

    invoke-virtual {v1, v4}, Lcom/microblink/internal/services/google/GoogleNearbyServiceImpl;->execute(Lcom/microblink/internal/services/lookup/StoreLookupRequest;)Lcom/microblink/internal/services/google/NearbySearchResults;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/microblink/internal/services/google/GoogleAreaSearchLookupResult;

    invoke-direct {p1}, Lcom/microblink/internal/services/google/GoogleAreaSearchLookupResult;-><init>()V

    invoke-virtual {p1, v0}, Lcom/microblink/internal/services/google/GoogleAreaSearchLookupResult;->nearbySearchResults(Ljava/util/List;)Lcom/microblink/internal/services/google/GoogleAreaSearchLookupResult;

    iget-object v0, p0, Lcom/microblink/internal/services/google/GoogleNearbySearchRepository;->mapper:Lcom/microblink/internal/merchant/MerchantDetectionMapper;

    invoke-interface {v0, p1}, Lcom/microblink/internal/merchant/MerchantDetectionMapper;->transform(Ljava/lang/Object;)Lcom/microblink/internal/merchant/MerchantDetection;

    move-result-object p1

    return-object p1
.end method
