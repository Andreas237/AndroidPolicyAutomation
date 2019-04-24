.class public Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;
.super Ljava/lang/Object;
.source "MvtTestsHolder.java"


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# instance fields
.field private final listeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/app/mvt/MvtTestsHolderListener;",
            ">;"
        }
    .end annotation
.end field

.field private lock:Ljava/util/concurrent/locks/Lock;

.field private testVariants:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/mvt/TestVariant;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;->lock:Ljava/util/concurrent/locks/Lock;

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;->testVariants:Ljava/util/List;

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;->listeners:Ljava/util/List;

    return-void
.end method

.method public static synthetic lambda$notifyListeners$0(Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;Lcom/ibotta/android/state/app/mvt/MvtTestsHolderListener;)V
    .locals 4

    .line 58
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;->testVariants:Ljava/util/List;

    invoke-interface {p1, v0}, Lcom/ibotta/android/state/app/mvt/MvtTestsHolderListener;->onTestVariantsSet(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to notify listener: %1$s"

    const/4 v2, 0x1

    .line 60
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    sget-object p1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private notifyListeners()V
    .locals 2

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;->listeners:Ljava/util/List;

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/state/app/mvt/-$$Lambda$MvtTestsHolder$M0EQDh625XNjmN1uQKEjrQBM_lo;

    invoke-direct {v1, p0}, Lcom/ibotta/android/state/app/mvt/-$$Lambda$MvtTestsHolder$M0EQDh625XNjmN1uQKEjrQBM_lo;-><init>(Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;)V

    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->forEach(Ljava9/util/function/Consumer;)V

    return-void
.end method


# virtual methods
.method public addListener(Lcom/ibotta/android/state/app/mvt/MvtTestsHolderListener;)V
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;->listeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public getTestVariants()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/mvt/TestVariant;",
            ">;"
        }
    .end annotation

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;->testVariants:Ljava/util/List;

    return-object v0
.end method

.method public isFetched()Z
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;->testVariants:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public setTestVariants(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/mvt/TestVariant;",
            ">;)V"
        }
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 35
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;->testVariants:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    if-eqz p1, :cond_0

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;->testVariants:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 44
    invoke-direct {p0}, Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;->notifyListeners()V

    return-void

    :catchall_0
    move-exception p1

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method
