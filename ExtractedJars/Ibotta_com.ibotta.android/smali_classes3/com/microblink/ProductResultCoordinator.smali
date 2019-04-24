.class public Lcom/microblink/ProductResultCoordinator;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/ProductResultCoordinator$DetectedProduct;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final lock:Ljava/lang/Object;


# instance fields
.field private lookUp:Landroid/support/v4/util/ArrayMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/ArrayMap<",
            "TT;",
            "Lcom/microblink/ProductResultCoordinator$DetectedProduct;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/microblink/ProductResultCoordinator;->lock:Ljava/lang/Object;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v0}, Landroid/support/v4/util/ArrayMap;-><init>()V

    iput-object v0, p0, Lcom/microblink/ProductResultCoordinator;->lookUp:Landroid/support/v4/util/ArrayMap;

    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    sget-object v0, Lcom/microblink/ProductResultCoordinator;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/ProductResultCoordinator;->lookUp:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v1, p1}, Landroid/support/v4/util/ArrayMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/microblink/ProductResultCoordinator;->lookUp:Landroid/support/v4/util/ArrayMap;

    new-instance v2, Lcom/microblink/ProductResultCoordinator$DetectedProduct;

    invoke-direct {v2}, Lcom/microblink/ProductResultCoordinator$DetectedProduct;-><init>()V

    invoke-virtual {v1, p1, v2}, Landroid/support/v4/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/ProductResultCoordinator;->lookUp:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v0}, Landroid/support/v4/util/ArrayMap;->clear()V

    return-void
.end method

.method public getStatusForSearch(Ljava/lang/Object;)Lcom/microblink/internal/services/LookupStatus;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lcom/microblink/internal/services/LookupStatus;"
        }
    .end annotation

    sget-object v0, Lcom/microblink/ProductResultCoordinator;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/ProductResultCoordinator;->lookUp:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v1, p1}, Landroid/support/v4/util/ArrayMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/microblink/ProductResultCoordinator;->lookUp:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v1, p1}, Landroid/support/v4/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/microblink/ProductResultCoordinator$DetectedProduct;

    iget-object p1, p1, Lcom/microblink/ProductResultCoordinator$DetectedProduct;->lookupStatus:Lcom/microblink/internal/services/LookupStatus;

    monitor-exit v0

    return-object p1

    :cond_0
    sget-object p1, Lcom/microblink/internal/services/LookupStatus;->UNKNOWN:Lcom/microblink/internal/services/LookupStatus;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public products()Ljava/util/List;
    .locals 4
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/microblink/internal/ProductSummary;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/microblink/ProductResultCoordinator;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lcom/microblink/ProductResultCoordinator;->lookUp:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v2}, Landroid/support/v4/util/ArrayMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/microblink/ProductResultCoordinator$DetectedProduct;

    iget-object v3, v3, Lcom/microblink/ProductResultCoordinator$DetectedProduct;->product:Lcom/microblink/internal/ProductSummary;

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public storeResult(Ljava/lang/Object;Lcom/microblink/internal/ProductSummary;)V
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/internal/ProductSummary;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/microblink/internal/ProductSummary;",
            ")V"
        }
    .end annotation

    sget-object v0, Lcom/microblink/ProductResultCoordinator;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/ProductResultCoordinator;->lookUp:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v1, p1}, Landroid/support/v4/util/ArrayMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/microblink/ProductResultCoordinator;->lookUp:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v1, p1}, Landroid/support/v4/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/microblink/ProductResultCoordinator$DetectedProduct;

    if-eqz p2, :cond_0

    iput-object p2, p1, Lcom/microblink/ProductResultCoordinator$DetectedProduct;->product:Lcom/microblink/internal/ProductSummary;

    :cond_0
    sget-object p2, Lcom/microblink/internal/services/LookupStatus;->COMPLETED:Lcom/microblink/internal/services/LookupStatus;

    iput-object p2, p1, Lcom/microblink/ProductResultCoordinator$DetectedProduct;->lookupStatus:Lcom/microblink/internal/services/LookupStatus;

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
