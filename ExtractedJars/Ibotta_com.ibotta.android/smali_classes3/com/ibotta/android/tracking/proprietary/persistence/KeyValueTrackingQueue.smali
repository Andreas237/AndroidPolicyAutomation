.class public Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;
.super Ljava/lang/Object;
.source "KeyValueTrackingQueue.java"

# interfaces
.implements Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final atomicBoundedInteger:Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;

.field private final executor:Ljava/util/concurrent/ExecutorService;

.field private final lastKeyPersistence:Lcom/ibotta/android/tracking/proprietary/persistence/SingleValuePersistence;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ibotta/android/tracking/proprietary/persistence/SingleValuePersistence<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final trackingPersistence:Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ExecutorService;Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;Lcom/ibotta/android/tracking/proprietary/persistence/SingleValuePersistence;Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/ExecutorService;",
            "Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence<",
            "TT;>;",
            "Lcom/ibotta/android/tracking/proprietary/persistence/SingleValuePersistence<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;",
            ")V"
        }
    .end annotation

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;->executor:Ljava/util/concurrent/ExecutorService;

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;->trackingPersistence:Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;

    .line 30
    iput-object p3, p0, Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;->lastKeyPersistence:Lcom/ibotta/android/tracking/proprietary/persistence/SingleValuePersistence;

    .line 31
    iput-object p4, p0, Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;->atomicBoundedInteger:Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;

    .line 36
    new-instance p3, Lcom/ibotta/android/tracking/proprietary/persistence/-$$Lambda$KeyValueTrackingQueue$EwoDWU2AgcvnK3VkcxBIh8sZ2Ac;

    invoke-direct {p3, p2, p4}, Lcom/ibotta/android/tracking/proprietary/persistence/-$$Lambda$KeyValueTrackingQueue$EwoDWU2AgcvnK3VkcxBIh8sZ2Ac;-><init>(Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;)V

    invoke-interface {p1, p3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method private deleteEventsForKeys(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 74
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 75
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;->trackingPersistence:Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;

    invoke-interface {v1, v0}, Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;->delete(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private getEventsForKeys(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .line 80
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 82
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 83
    iget-object v2, p0, Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;->trackingPersistence:Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;

    invoke-interface {v2, v1}, Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;->read(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 86
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static synthetic lambda$addEntry$1(Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;Ljava/lang/Object;)V
    .locals 2

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;->trackingPersistence:Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;->atomicBoundedInteger:Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;

    invoke-virtual {v1}, Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;->getAndIncrement()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;->write(Ljava/lang/String;Ljava/lang/Object;)V

    .line 49
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;->lastKeyPersistence:Lcom/ibotta/android/tracking/proprietary/persistence/SingleValuePersistence;

    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;->atomicBoundedInteger:Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;

    invoke-virtual {v0}, Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;->get()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ibotta/android/tracking/proprietary/persistence/SingleValuePersistence;->write(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic lambda$clearAllEntries$3(Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;)V
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;->trackingPersistence:Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;->destroy()V

    return-void
.end method

.method public static synthetic lambda$getEntriesForFlush$2(Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;Ljava/util/List;Ljava/lang/Boolean;)V
    .locals 1

    .line 59
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 60
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Received successful callback, deleting "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " keys"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p2, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    invoke-direct {p0, p1}, Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;->deleteEventsForKeys(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method static synthetic lambda$new$0(Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;)V
    .locals 1

    .line 37
    invoke-interface {p0}, Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;->getSize()I

    move-result v0

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/AtomicBoundedInteger;->getMaxBound()I

    move-result p1

    if-le v0, p1, :cond_0

    .line 38
    invoke-interface {p0}, Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;->destroy()V

    :cond_0
    return-void
.end method


# virtual methods
.method public addEntry(Ljava/lang/Object;)V
    .locals 2
    .annotation build Landroid/support/annotation/AnyThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/ibotta/android/tracking/proprietary/persistence/-$$Lambda$KeyValueTrackingQueue$YZzU8EcIKTP_9gIRu2OajygMDEM;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/tracking/proprietary/persistence/-$$Lambda$KeyValueTrackingQueue$YZzU8EcIKTP_9gIRu2OajygMDEM;-><init>(Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public clearAllEntries()V
    .locals 2
    .annotation build Landroid/support/annotation/AnyThread;
    .end annotation

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/ibotta/android/tracking/proprietary/persistence/-$$Lambda$KeyValueTrackingQueue$JWs2m0hXXOksp5wVPHc6PnYQp-4;

    invoke-direct {v1, p0}, Lcom/ibotta/android/tracking/proprietary/persistence/-$$Lambda$KeyValueTrackingQueue$JWs2m0hXXOksp5wVPHc6PnYQp-4;-><init>(Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public getEntriesForFlush()Landroid/util/Pair;
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Pair<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingFlushCallback;",
            "Ljava/util/List<",
            "TT;>;>;"
        }
    .end annotation

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;->trackingPersistence:Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;->getAllKeys()Ljava/util/List;

    move-result-object v0

    .line 56
    invoke-direct {p0, v0}, Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;->getEventsForKeys(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    .line 58
    new-instance v2, Lcom/ibotta/android/tracking/proprietary/persistence/-$$Lambda$KeyValueTrackingQueue$VCBAgs8Wo2qgezjTXIK04g4n1Ug;

    invoke-direct {v2, p0, v0}, Lcom/ibotta/android/tracking/proprietary/persistence/-$$Lambda$KeyValueTrackingQueue$VCBAgs8Wo2qgezjTXIK04g4n1Ug;-><init>(Lcom/ibotta/android/tracking/proprietary/persistence/KeyValueTrackingQueue;Ljava/util/List;)V

    .line 65
    invoke-static {v2, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    return-object v0
.end method
