.class public Lcom/microblink/RecognizerDispatcher;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/Cancelable;
.implements Lcom/microblink/RecognizeDataCallback;


# static fields
.field private static final TAG:Ljava/lang/String; = "RecognizerDispatcher"

.field private static final lock:Ljava/lang/Object;


# instance fields
.field private final callback:Lcom/microblink/RecognizerCallback;

.field private isCancelled:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private isShutdown:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private isStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final listener:Lcom/microblink/OnCompleteListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/microblink/OnCompleteListener<",
            "Lcom/microblink/BitmapResult;",
            ">;"
        }
    .end annotation
.end field

.field private final merchantDetector:Lcom/microblink/internal/merchant/MerchantDetector;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private merchantDetectorState:Ljava/util/concurrent/atomic/AtomicInteger;

.field private merchantObserver:Lcom/microblink/internal/merchant/MerchantDetector$DetectorStateObserver;

.field private final productDetector:Lcom/microblink/ProductDetector;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private productDetectorState:Ljava/util/concurrent/atomic/AtomicInteger;

.field private productObserver:Lcom/microblink/ProductDetector$Listener;

.field private queue:Lcom/microblink/CameraFrameQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/microblink/CameraFrameQueue<",
            "Lcom/microblink/BitmapResult;",
            ">;"
        }
    .end annotation
.end field

.field private shouldDequeueFrame:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private status:I

.field private summaryStats:Lcom/microblink/SummaryStats;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/microblink/RecognizerDispatcher;->lock:Ljava/lang/Object;

    return-void
.end method

.method constructor <init>(ILcom/microblink/RecognizerCallback;Lcom/microblink/internal/merchant/MerchantDetector;Lcom/microblink/ProductDetector;Lcom/microblink/OnCompleteListener;)V
    .locals 2
    .param p2    # Lcom/microblink/RecognizerCallback;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/microblink/internal/merchant/MerchantDetector;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/microblink/ProductDetector;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Lcom/microblink/OnCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/microblink/RecognizerCallback;",
            "Lcom/microblink/internal/merchant/MerchantDetector;",
            "Lcom/microblink/ProductDetector;",
            "Lcom/microblink/OnCompleteListener<",
            "Lcom/microblink/BitmapResult;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/microblink/RecognizerDispatcher;->isShutdown:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/microblink/RecognizerDispatcher;->isStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/microblink/RecognizerDispatcher;->isCancelled:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/microblink/RecognizerDispatcher;->shouldDequeueFrame:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Lcom/microblink/SummaryStats;

    invoke-direct {v0}, Lcom/microblink/SummaryStats;-><init>()V

    iput-object v0, p0, Lcom/microblink/RecognizerDispatcher;->summaryStats:Lcom/microblink/SummaryStats;

    iput v1, p0, Lcom/microblink/RecognizerDispatcher;->status:I

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lcom/microblink/RecognizerDispatcher;->merchantDetectorState:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lcom/microblink/RecognizerDispatcher;->productDetectorState:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Lcom/microblink/RecognizerDispatcher$1;

    invoke-direct {v0, p0}, Lcom/microblink/RecognizerDispatcher$1;-><init>(Lcom/microblink/RecognizerDispatcher;)V

    iput-object v0, p0, Lcom/microblink/RecognizerDispatcher;->productObserver:Lcom/microblink/ProductDetector$Listener;

    new-instance v0, Lcom/microblink/RecognizerDispatcher$2;

    invoke-direct {v0, p0}, Lcom/microblink/RecognizerDispatcher$2;-><init>(Lcom/microblink/RecognizerDispatcher;)V

    iput-object v0, p0, Lcom/microblink/RecognizerDispatcher;->merchantObserver:Lcom/microblink/internal/merchant/MerchantDetector$DetectorStateObserver;

    iput-object p2, p0, Lcom/microblink/RecognizerDispatcher;->callback:Lcom/microblink/RecognizerCallback;

    invoke-static {p1}, Lcom/microblink/CameraFrameQueueFactory;->create(I)Lcom/microblink/CameraFrameQueue;

    move-result-object p1

    iput-object p1, p0, Lcom/microblink/RecognizerDispatcher;->queue:Lcom/microblink/CameraFrameQueue;

    iput-object p5, p0, Lcom/microblink/RecognizerDispatcher;->listener:Lcom/microblink/OnCompleteListener;

    iput-object p3, p0, Lcom/microblink/RecognizerDispatcher;->merchantDetector:Lcom/microblink/internal/merchant/MerchantDetector;

    iput-object p4, p0, Lcom/microblink/RecognizerDispatcher;->productDetector:Lcom/microblink/ProductDetector;

    return-void
.end method

.method static synthetic access$000()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/microblink/RecognizerDispatcher;->lock:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$100(Lcom/microblink/RecognizerDispatcher;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    iget-object p0, p0, Lcom/microblink/RecognizerDispatcher;->productDetectorState:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method static synthetic access$200(Lcom/microblink/RecognizerDispatcher;)Z
    .locals 0

    invoke-direct {p0}, Lcom/microblink/RecognizerDispatcher;->isFinished()Z

    move-result p0

    return p0
.end method

.method static synthetic access$300(Lcom/microblink/RecognizerDispatcher;)V
    .locals 0

    invoke-direct {p0}, Lcom/microblink/RecognizerDispatcher;->finishScanSession()V

    return-void
.end method

.method static synthetic access$400(Lcom/microblink/RecognizerDispatcher;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    iget-object p0, p0, Lcom/microblink/RecognizerDispatcher;->merchantDetectorState:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method private dispatch()V
    .locals 5

    sget-object v0, Lcom/microblink/RecognizerDispatcher;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/RecognizerDispatcher;->isCancelled:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/microblink/RecognizerDispatcher;->queue:Lcom/microblink/CameraFrameQueue;

    invoke-interface {v1}, Lcom/microblink/CameraFrameQueue;->clear()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :cond_0
    :try_start_2
    iget-object v1, p0, Lcom/microblink/RecognizerDispatcher;->queue:Lcom/microblink/CameraFrameQueue;

    invoke-interface {v1}, Lcom/microblink/CameraFrameQueue;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/microblink/RecognizerDispatcher;->summaryStats:Lcom/microblink/SummaryStats;

    invoke-virtual {v1}, Lcom/microblink/SummaryStats;->incrementFrameCount()V

    iget-object v1, p0, Lcom/microblink/RecognizerDispatcher;->queue:Lcom/microblink/CameraFrameQueue;

    invoke-interface {v1}, Lcom/microblink/CameraFrameQueue;->dequeue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/microblink/BitmapResult;

    iget-object v3, p0, Lcom/microblink/RecognizerDispatcher;->shouldDequeueFrame:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v3, p0, Lcom/microblink/RecognizerDispatcher;->listener:Lcom/microblink/OnCompleteListener;

    invoke-interface {v3, v1}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    invoke-virtual {p0, v2}, Lcom/microblink/RecognizerDispatcher;->onProcessStateChanged(I)V

    invoke-static {}, Lcom/microblink/Recognizer;->getInstance()Lcom/microblink/Recognizer;

    move-result-object v2

    invoke-virtual {v2, v1, p0}, Lcom/microblink/Recognizer;->recognize(Lcom/microblink/BitmapResult;Lcom/microblink/RecognizeDataCallback;)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/microblink/RecognizerDispatcher;->shouldDequeueFrame:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-exception v1

    :try_start_3
    new-instance v2, Lcom/microblink/RecognizerException;

    invoke-direct {v2, v1}, Lcom/microblink/RecognizerException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, v2}, Lcom/microblink/RecognizerDispatcher;->onRecognizerException(Lcom/microblink/RecognizerException;)V

    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method

.method private finishScanSession()V
    .locals 4

    const/4 v0, 0x7

    invoke-virtual {p0, v0}, Lcom/microblink/RecognizerDispatcher;->onProcessStateChanged(I)V

    iget-object v0, p0, Lcom/microblink/RecognizerDispatcher;->productDetector:Lcom/microblink/ProductDetector;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/microblink/RecognizerDispatcher;->productObserver:Lcom/microblink/ProductDetector$Listener;

    invoke-virtual {v0, v1}, Lcom/microblink/ProductDetector;->unobserve(Lcom/microblink/ProductDetector$Listener;)V

    :cond_0
    iget-object v0, p0, Lcom/microblink/RecognizerDispatcher;->merchantDetector:Lcom/microblink/internal/merchant/MerchantDetector;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/microblink/RecognizerDispatcher;->merchantObserver:Lcom/microblink/internal/merchant/MerchantDetector$DetectorStateObserver;

    invoke-virtual {v0, v1}, Lcom/microblink/internal/merchant/MerchantDetector;->unobserve(Lcom/microblink/internal/merchant/MerchantDetector$DetectorStateObserver;)V

    :cond_1
    invoke-static {}, Lcom/microblink/Recognizer;->getInstance()Lcom/microblink/Recognizer;

    move-result-object v0

    iget-object v1, p0, Lcom/microblink/RecognizerDispatcher;->summaryStats:Lcom/microblink/SummaryStats;

    iget v2, p0, Lcom/microblink/RecognizerDispatcher;->status:I

    iget-object v3, p0, Lcom/microblink/RecognizerDispatcher;->callback:Lcom/microblink/RecognizerCallback;

    invoke-virtual {v0, v1, v2, v3}, Lcom/microblink/Recognizer;->finishScan(Lcom/microblink/SummaryStats;ILcom/microblink/RecognizerCallback;)V

    return-void
.end method

.method private isFinished()Z
    .locals 2

    invoke-virtual {p0}, Lcom/microblink/RecognizerDispatcher;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/microblink/RecognizerDispatcher;->status:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/microblink/RecognizerDispatcher;->queue:Lcom/microblink/CameraFrameQueue;

    invoke-interface {v0}, Lcom/microblink/CameraFrameQueue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/microblink/RecognizerDispatcher;->merchantDetectorState:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/microblink/RecognizerDispatcher;->productDetectorState:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-ne v0, v1, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public cancel()V
    .locals 3

    sget-object v0, Lcom/microblink/RecognizerDispatcher;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/RecognizerDispatcher;->isCancelled:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v1, p0, Lcom/microblink/RecognizerDispatcher;->queue:Lcom/microblink/CameraFrameQueue;

    invoke-interface {v1}, Lcom/microblink/CameraFrameQueue;->clear()V

    iget-object v1, p0, Lcom/microblink/RecognizerDispatcher;->merchantDetector:Lcom/microblink/internal/merchant/MerchantDetector;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/microblink/RecognizerDispatcher;->merchantDetector:Lcom/microblink/internal/merchant/MerchantDetector;

    iget-object v2, p0, Lcom/microblink/RecognizerDispatcher;->merchantObserver:Lcom/microblink/internal/merchant/MerchantDetector$DetectorStateObserver;

    invoke-virtual {v1, v2}, Lcom/microblink/internal/merchant/MerchantDetector;->unobserve(Lcom/microblink/internal/merchant/MerchantDetector$DetectorStateObserver;)V

    :cond_0
    iget-object v1, p0, Lcom/microblink/RecognizerDispatcher;->productDetector:Lcom/microblink/ProductDetector;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/microblink/RecognizerDispatcher;->productDetector:Lcom/microblink/ProductDetector;

    iget-object v2, p0, Lcom/microblink/RecognizerDispatcher;->productObserver:Lcom/microblink/ProductDetector$Listener;

    invoke-virtual {v1, v2}, Lcom/microblink/ProductDetector;->unobserve(Lcom/microblink/ProductDetector$Listener;)V

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public varargs enqueue([Lcom/microblink/BitmapResult;)V
    .locals 5
    .param p1    # [Lcom/microblink/BitmapResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lcom/microblink/RecognizerDispatcher;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/RecognizerDispatcher;->isShutdown:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-nez v1, :cond_2

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p1, v2

    iget-object v4, p0, Lcom/microblink/RecognizerDispatcher;->queue:Lcom/microblink/CameraFrameQueue;

    invoke-interface {v4, v3}, Lcom/microblink/CameraFrameQueue;->enqueue(Ljava/lang/Object;)V

    iget-object v3, p0, Lcom/microblink/RecognizerDispatcher;->shouldDequeueFrame:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-direct {p0}, Lcom/microblink/RecognizerDispatcher;->dispatch()V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    monitor-exit v0

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot enqueue frames once dispatcher is shut down"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public isShutdown()Z
    .locals 1

    iget-object v0, p0, Lcom/microblink/RecognizerDispatcher;->isShutdown:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public onBlurScoreChange(I)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/RecognizerDispatcher;->queue:Lcom/microblink/CameraFrameQueue;

    invoke-interface {v0, p1}, Lcom/microblink/CameraFrameQueue;->blurScore(I)V

    return-void
.end method

.method public onProcessStateChanged(I)V
    .locals 3

    iget-object v0, p0, Lcom/microblink/RecognizerDispatcher;->isCancelled:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string p1, "RecognizerDispatcher"

    const-string v0, "Scanning has been cancelled"

    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget v0, p0, Lcom/microblink/RecognizerDispatcher;->status:I

    const/4 v2, 0x7

    if-ne v0, v2, :cond_1

    const-string p1, "RecognizerDispatcher"

    const-string v0, "on process state change is already finishing!"

    goto :goto_0

    :cond_1
    iput p1, p0, Lcom/microblink/RecognizerDispatcher;->status:I

    const/4 v0, 0x4

    if-ne p1, v0, :cond_2

    iget-object v0, p0, Lcom/microblink/RecognizerDispatcher;->summaryStats:Lcom/microblink/SummaryStats;

    invoke-virtual {v0}, Lcom/microblink/SummaryStats;->startOcrTimer()V

    :cond_2
    const/4 v0, 0x5

    if-ne p1, v0, :cond_3

    iget-object v0, p0, Lcom/microblink/RecognizerDispatcher;->summaryStats:Lcom/microblink/SummaryStats;

    invoke-virtual {v0}, Lcom/microblink/SummaryStats;->endOcrTimer()V

    :cond_3
    const/4 v0, 0x2

    if-ne p1, v0, :cond_4

    invoke-static {}, Lcom/microblink/Recognizer;->getInstance()Lcom/microblink/Recognizer;

    move-result-object p1

    invoke-virtual {p1}, Lcom/microblink/Recognizer;->initialized()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-direct {p0}, Lcom/microblink/RecognizerDispatcher;->dispatch()V

    invoke-direct {p0}, Lcom/microblink/RecognizerDispatcher;->isFinished()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-direct {p0}, Lcom/microblink/RecognizerDispatcher;->finishScanSession()V

    :cond_4
    return-void
.end method

.method public onRecognizerException(Lcom/microblink/RecognizerException;)V
    .locals 3
    .param p1    # Lcom/microblink/RecognizerException;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "RecognizerDispatcher"

    invoke-virtual {p1}, Lcom/microblink/RecognizerException;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/RecognizerDispatcher;->summaryStats:Lcom/microblink/SummaryStats;

    invoke-virtual {v0}, Lcom/microblink/SummaryStats;->stop()V

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/microblink/RecognizerDispatcher;->onProcessStateChanged(I)V

    iget-object v0, p0, Lcom/microblink/RecognizerDispatcher;->isShutdown:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/RecognizerDispatcher;->callback:Lcom/microblink/RecognizerCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/microblink/RecognizerCallback;->onRecognizerException(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public onRecognizerResult(Lcom/microblink/RecognizerResult;)V
    .locals 1
    .param p1    # Lcom/microblink/RecognizerResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/RecognizerDispatcher;->callback:Lcom/microblink/RecognizerCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/microblink/RecognizerCallback;->onRecognizerResultsChanged(Lcom/microblink/RecognizerResult;)V

    :cond_0
    return-void
.end method

.method public processingFrame()Z
    .locals 3

    sget-object v0, Lcom/microblink/RecognizerDispatcher;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/microblink/RecognizerDispatcher;->status:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lcom/microblink/RecognizerDispatcher;->queue:Lcom/microblink/CameraFrameQueue;

    invoke-interface {v1}, Lcom/microblink/CameraFrameQueue;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public shutdown()V
    .locals 3

    sget-object v0, Lcom/microblink/RecognizerDispatcher;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/RecognizerDispatcher;->isShutdown:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-direct {p0}, Lcom/microblink/RecognizerDispatcher;->isFinished()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lcom/microblink/RecognizerDispatcher;->finishScanSession()V

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

.method public start()V
    .locals 3

    sget-object v0, Lcom/microblink/RecognizerDispatcher;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/RecognizerDispatcher;->isStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/microblink/RecognizerDispatcher;->merchantDetector:Lcom/microblink/internal/merchant/MerchantDetector;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/microblink/RecognizerDispatcher;->merchantDetector:Lcom/microblink/internal/merchant/MerchantDetector;

    iget-object v2, p0, Lcom/microblink/RecognizerDispatcher;->merchantObserver:Lcom/microblink/internal/merchant/MerchantDetector$DetectorStateObserver;

    invoke-virtual {v1, v2}, Lcom/microblink/internal/merchant/MerchantDetector;->observeStateChange(Lcom/microblink/internal/merchant/MerchantDetector$DetectorStateObserver;)V

    :cond_0
    iget-object v1, p0, Lcom/microblink/RecognizerDispatcher;->productDetector:Lcom/microblink/ProductDetector;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/microblink/RecognizerDispatcher;->productDetector:Lcom/microblink/ProductDetector;

    iget-object v2, p0, Lcom/microblink/RecognizerDispatcher;->productObserver:Lcom/microblink/ProductDetector$Listener;

    invoke-virtual {v1, v2}, Lcom/microblink/ProductDetector;->addObserver(Lcom/microblink/ProductDetector$Listener;)V

    :cond_1
    iget-object v1, p0, Lcom/microblink/RecognizerDispatcher;->summaryStats:Lcom/microblink/SummaryStats;

    invoke-virtual {v1}, Lcom/microblink/SummaryStats;->start()V

    iget-object v1, p0, Lcom/microblink/RecognizerDispatcher;->isStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v1, p0, Lcom/microblink/RecognizerDispatcher;->shouldDequeueFrame:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public state()I
    .locals 2

    sget-object v0, Lcom/microblink/RecognizerDispatcher;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/microblink/RecognizerDispatcher;->status:I

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
