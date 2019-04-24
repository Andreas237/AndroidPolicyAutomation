.class public Lcom/ibotta/android/tracking/proprietary/RoomTrackingFlushScheduler;
.super Ljava/lang/Object;
.source "RoomTrackingFlushScheduler.java"

# interfaces
.implements Lcom/ibotta/android/tracking/proprietary/TrackingFlushScheduler;


# static fields
.field private static final WORK_TAG:Ljava/lang/String;


# instance fields
.field private final databaseSizeLiveData:Landroid/arch/lifecycle/LiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/arch/lifecycle/LiveData<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final flushWorkerClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Landroidx/work/ListenableWorker;",
            ">;"
        }
    .end annotation
.end field

.field private final numEntriesThreshold:I

.field private final workManager:Landroidx/work/WorkManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 15
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/RoomTrackingFlushScheduler;->WORK_TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/arch/lifecycle/LiveData;Landroidx/work/WorkManager;Ljava/lang/Class;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/arch/lifecycle/LiveData<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroidx/work/WorkManager;",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/work/ListenableWorker;",
            ">;I)V"
        }
    .end annotation

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/RoomTrackingFlushScheduler;->databaseSizeLiveData:Landroid/arch/lifecycle/LiveData;

    .line 31
    iput-object p2, p0, Lcom/ibotta/android/tracking/proprietary/RoomTrackingFlushScheduler;->workManager:Landroidx/work/WorkManager;

    .line 32
    iput-object p3, p0, Lcom/ibotta/android/tracking/proprietary/RoomTrackingFlushScheduler;->flushWorkerClass:Ljava/lang/Class;

    .line 33
    iput p4, p0, Lcom/ibotta/android/tracking/proprietary/RoomTrackingFlushScheduler;->numEntriesThreshold:I

    .line 35
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/RoomTrackingFlushScheduler;->databaseSizeLiveData:Landroid/arch/lifecycle/LiveData;

    new-instance p2, Lcom/ibotta/android/tracking/proprietary/-$$Lambda$EPCb472uWRAbfMX0foLWD3P3kKY;

    invoke-direct {p2, p0}, Lcom/ibotta/android/tracking/proprietary/-$$Lambda$EPCb472uWRAbfMX0foLWD3P3kKY;-><init>(Lcom/ibotta/android/tracking/proprietary/RoomTrackingFlushScheduler;)V

    invoke-virtual {p1, p2}, Landroid/arch/lifecycle/LiveData;->observeForever(Landroid/arch/lifecycle/Observer;)V

    return-void
.end method


# virtual methods
.method public onDatabaseSizeChanged(Ljava/lang/Integer;)V
    .locals 1
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 40
    iget v0, p0, Lcom/ibotta/android/tracking/proprietary/RoomTrackingFlushScheduler;->numEntriesThreshold:I

    if-eqz v0, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget v0, p0, Lcom/ibotta/android/tracking/proprietary/RoomTrackingFlushScheduler;->numEntriesThreshold:I

    if-le p1, v0, :cond_1

    .line 43
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/proprietary/RoomTrackingFlushScheduler;->requestImmediateFlush()V

    :cond_1
    return-void

    :cond_2
    :goto_0
    return-void
.end method

.method public requestImmediateFlush()V
    .locals 6

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/RoomTrackingFlushScheduler;->workManager:Landroidx/work/WorkManager;

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/RoomTrackingFlushScheduler;->WORK_TAG:Ljava/lang/String;

    sget-object v2, Landroidx/work/ExistingWorkPolicy;->KEEP:Landroidx/work/ExistingWorkPolicy;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Class;

    iget-object v4, p0, Lcom/ibotta/android/tracking/proprietary/RoomTrackingFlushScheduler;->flushWorkerClass:Ljava/lang/Class;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v3}, Landroidx/work/OneTimeWorkRequest;->from([Ljava/lang/Class;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Landroidx/work/WorkManager;->beginUniqueWork(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Ljava/util/List;)Landroidx/work/WorkContinuation;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/work/WorkContinuation;->enqueue()Lcom/google/common/util/concurrent/ListenableFuture;

    return-void
.end method
