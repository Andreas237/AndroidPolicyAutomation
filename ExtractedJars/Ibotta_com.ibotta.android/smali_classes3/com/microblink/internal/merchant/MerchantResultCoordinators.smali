.class public Lcom/microblink/internal/merchant/MerchantResultCoordinators;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/Cancelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/internal/merchant/MerchantResultCoordinators$DetectedMerchantResponse;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/microblink/Cancelable;"
    }
.end annotation


# static fields
.field private static final lock:Ljava/lang/Object;


# instance fields
.field private foundResult:Lcom/microblink/internal/merchant/MerchantResult;

.field private lookUp:Landroid/support/v4/util/ArrayMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/ArrayMap<",
            "TT;",
            "Lcom/microblink/internal/merchant/MerchantResultCoordinators$DetectedMerchantResponse;",
            ">;"
        }
    .end annotation
.end field

.field private validator:Lcom/microblink/internal/merchant/MerchantResultValidator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->lock:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/microblink/internal/merchant/MerchantResultValidator;)V
    .locals 0
    .param p1    # Lcom/microblink/internal/merchant/MerchantResultValidator;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->validator:Lcom/microblink/internal/merchant/MerchantResultValidator;

    new-instance p1, Landroid/support/v4/util/ArrayMap;

    invoke-direct {p1}, Landroid/support/v4/util/ArrayMap;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->lookUp:Landroid/support/v4/util/ArrayMap;

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

    sget-object v0, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->lookUp:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v1, p1}, Landroid/support/v4/util/ArrayMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->lookUp:Landroid/support/v4/util/ArrayMap;

    new-instance v2, Lcom/microblink/internal/merchant/MerchantResultCoordinators$DetectedMerchantResponse;

    invoke-direct {v2}, Lcom/microblink/internal/merchant/MerchantResultCoordinators$DetectedMerchantResponse;-><init>()V

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

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->lookUp:Landroid/support/v4/util/ArrayMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/support/v4/util/ArrayMap;->clear()V

    :cond_0
    return-void
.end method

.method public foundMerchants()Lcom/microblink/internal/merchant/MerchantResult;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->foundResult:Lcom/microblink/internal/merchant/MerchantResult;

    return-object v0
.end method

.method public getStatusForSearch(Ljava/lang/Object;)Lcom/microblink/internal/services/LookupStatus;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lcom/microblink/internal/services/LookupStatus;"
        }
    .end annotation

    sget-object v0, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->lookUp:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v1, p1}, Landroid/support/v4/util/ArrayMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->lookUp:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v1, p1}, Landroid/support/v4/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/microblink/internal/merchant/MerchantResultCoordinators$DetectedMerchantResponse;

    iget-object p1, p1, Lcom/microblink/internal/merchant/MerchantResultCoordinators$DetectedMerchantResponse;->lookupStatus:Lcom/microblink/internal/services/LookupStatus;

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

.method public hasResult()Z
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->foundResult:Lcom/microblink/internal/merchant/MerchantResult;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public storeResult(Ljava/lang/Object;Lcom/microblink/internal/merchant/MerchantResult;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/microblink/internal/merchant/MerchantResult;",
            ")V"
        }
    .end annotation

    sget-object v0, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->lookUp:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v1, p1}, Landroid/support/v4/util/ArrayMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->lookUp:Landroid/support/v4/util/ArrayMap;

    invoke-virtual {v1, p1}, Landroid/support/v4/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/microblink/internal/merchant/MerchantResultCoordinators$DetectedMerchantResponse;

    iget-object v1, p0, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->validator:Lcom/microblink/internal/merchant/MerchantResultValidator;

    invoke-interface {v1, p2}, Lcom/microblink/internal/merchant/MerchantResultValidator;->valid(Lcom/microblink/internal/merchant/MerchantResult;)Z

    move-result v1

    if-eqz v1, :cond_0

    iput-object p2, p1, Lcom/microblink/internal/merchant/MerchantResultCoordinators$DetectedMerchantResponse;->response:Lcom/microblink/internal/merchant/MerchantResult;

    sget-object v1, Lcom/microblink/internal/services/LookupStatus;->FOUND:Lcom/microblink/internal/services/LookupStatus;

    iput-object v1, p1, Lcom/microblink/internal/merchant/MerchantResultCoordinators$DetectedMerchantResponse;->lookupStatus:Lcom/microblink/internal/services/LookupStatus;

    iput-object p2, p0, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->foundResult:Lcom/microblink/internal/merchant/MerchantResult;

    goto :goto_0

    :cond_0
    sget-object p2, Lcom/microblink/internal/services/LookupStatus;->NOT_FOUND:Lcom/microblink/internal/services/LookupStatus;

    iput-object p2, p1, Lcom/microblink/internal/merchant/MerchantResultCoordinators$DetectedMerchantResponse;->lookupStatus:Lcom/microblink/internal/services/LookupStatus;

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
