.class public final Lcom/microblink/ProductDetector;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/Cancelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/ProductDetector$Listener;,
        Lcom/microblink/ProductDetector$DetectorState;
    }
.end annotation


# static fields
.field public static final LOOKUP_COMPLETED:I = 0x1

.field static final LOOKUP_RUNNING:I = 0x0

.field private static final TAG:Ljava/lang/String; = "ProductDetector"


# instance fields
.field private calls:Ljava/util/concurrent/atomic/AtomicInteger;

.field private observers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/ProductDetector$Listener;",
            ">;"
        }
    .end annotation
.end field

.field private final productLookup:Lcom/microblink/ProductLookup;

.field private productResultCoordinator:Lcom/microblink/ProductResultCoordinator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/microblink/ProductResultCoordinator<",
            "Lcom/microblink/internal/OcrProduct;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/microblink/ProductLookup;)V
    .locals 1
    .param p1    # Lcom/microblink/ProductLookup;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/microblink/ProductResultCoordinator;

    invoke-direct {v0}, Lcom/microblink/ProductResultCoordinator;-><init>()V

    iput-object v0, p0, Lcom/microblink/ProductDetector;->productResultCoordinator:Lcom/microblink/ProductResultCoordinator;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lcom/microblink/ProductDetector;->calls:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/microblink/ProductDetector;->observers:Ljava/util/List;

    iput-object p1, p0, Lcom/microblink/ProductDetector;->productLookup:Lcom/microblink/ProductLookup;

    return-void
.end method

.method static synthetic access$000(Lcom/microblink/ProductDetector;)Lcom/microblink/ProductResultCoordinator;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ProductDetector;->productResultCoordinator:Lcom/microblink/ProductResultCoordinator;

    return-object p0
.end method

.method static synthetic access$100(Lcom/microblink/ProductDetector;)V
    .locals 0

    invoke-direct {p0}, Lcom/microblink/ProductDetector;->decrementAndNotify()V

    return-void
.end method

.method private decrementAndNotify()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/ProductDetector;->calls:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/microblink/ProductDetector;->notifyStateChange(I)V

    :cond_0
    return-void
.end method

.method private incrementAndNotify()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/ProductDetector;->calls:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/microblink/ProductDetector;->notifyStateChange(I)V

    return-void
.end method

.method private notifyStateChange(I)V
    .locals 2

    iget-object v0, p0, Lcom/microblink/ProductDetector;->observers:Ljava/util/List;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/microblink/ProductDetector;->observers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/microblink/ProductDetector$Listener;

    invoke-interface {v1, p1}, Lcom/microblink/ProductDetector$Listener;->onStateChange(I)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final addObserver(Lcom/microblink/ProductDetector$Listener;)V
    .locals 1
    .param p1    # Lcom/microblink/ProductDetector$Listener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/ProductDetector;->observers:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/microblink/ProductDetector;->calls:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1, v0}, Lcom/microblink/ProductDetector$Listener;->onStateChange(I)V

    return-void
.end method

.method public final cancel()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/microblink/ProductDetector;->observers:Ljava/util/List;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/microblink/ProductDetector;->observers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "ProductDetector"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final foundProducts()Ljava/util/List;
    .locals 1
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

    iget-object v0, p0, Lcom/microblink/ProductDetector;->productResultCoordinator:Lcom/microblink/ProductResultCoordinator;

    invoke-virtual {v0}, Lcom/microblink/ProductResultCoordinator;->products()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final recognizeProducts(Ljava/util/List;I)V
    .locals 4
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/internal/OcrProduct;",
            ">;I)V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/microblink/internal/OcrProduct;

    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/microblink/ProductDetector;->productResultCoordinator:Lcom/microblink/ProductResultCoordinator;

    invoke-virtual {v2, v1}, Lcom/microblink/ProductResultCoordinator;->getStatusForSearch(Ljava/lang/Object;)Lcom/microblink/internal/services/LookupStatus;

    move-result-object v2

    sget-object v3, Lcom/microblink/internal/services/LookupStatus;->UNKNOWN:Lcom/microblink/internal/services/LookupStatus;

    if-ne v2, v3, :cond_0

    iget-object v2, p0, Lcom/microblink/ProductDetector;->productResultCoordinator:Lcom/microblink/ProductResultCoordinator;

    invoke-virtual {v2, v1}, Lcom/microblink/ProductResultCoordinator;->add(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-direct {p0}, Lcom/microblink/ProductDetector;->incrementAndNotify()V

    iget-object p1, p0, Lcom/microblink/ProductDetector;->productLookup:Lcom/microblink/ProductLookup;

    new-instance v1, Lcom/microblink/ProductDetector$1;

    invoke-direct {v1, p0}, Lcom/microblink/ProductDetector$1;-><init>(Lcom/microblink/ProductDetector;)V

    invoke-interface {p1, v0, p2, v1}, Lcom/microblink/ProductLookup;->products(Ljava/util/List;ILcom/microblink/OnNullableCompleteListener;)V

    :cond_2
    return-void
.end method

.method public final unobserve(Lcom/microblink/ProductDetector$Listener;)V
    .locals 1
    .param p1    # Lcom/microblink/ProductDetector$Listener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/ProductDetector;->observers:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method
