.class public final Lcom/microblink/RecognizerView;
.super Lcom/microblink/RecognizerCameraView;

# interfaces
.implements Lcom/microblink/CameraDataListener;
.implements Lcom/microblink/OnCompleteListener;
.implements Lcom/microblink/RecognizeDataCallback;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/microblink/RecognizerCameraView;",
        "Lcom/microblink/CameraDataListener;",
        "Lcom/microblink/OnCompleteListener<",
        "Lcom/microblink/BitmapResult;",
        ">;",
        "Lcom/microblink/RecognizeDataCallback;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "RecognizerView"

.field private static final lock:Ljava/lang/Object;


# instance fields
.field private callback:Lcom/microblink/CameraRecognizerCallback;

.field private confirmPictureTask:Landroid/os/AsyncTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/AsyncTask<",
            "Lcom/microblink/BitmapResult;",
            "Ljava/lang/Void;",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field private dispatcher:Lcom/microblink/RecognizerDispatcher;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private finishing:Z

.field private scanOptions:Lcom/microblink/ScanOptions;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private simpleCameraEvents:Lcom/microblink/SimpleCameraEvents;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/microblink/RecognizerView;->lock:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/microblink/RecognizerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/microblink/RecognizerCameraView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/microblink/RecognizerView;->scanOptions:Lcom/microblink/ScanOptions;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/microblink/RecognizerView;->finishing:Z

    new-instance p1, Lcom/microblink/RecognizerView$1;

    invoke-direct {p1, p0}, Lcom/microblink/RecognizerView$1;-><init>(Lcom/microblink/RecognizerView;)V

    iput-object p1, p0, Lcom/microblink/RecognizerView;->simpleCameraEvents:Lcom/microblink/SimpleCameraEvents;

    invoke-virtual {p0, p0}, Lcom/microblink/RecognizerView;->cameraDataListener(Lcom/microblink/CameraDataListener;)V

    iget-object p1, p0, Lcom/microblink/RecognizerView;->simpleCameraEvents:Lcom/microblink/SimpleCameraEvents;

    invoke-virtual {p0, p1}, Lcom/microblink/RecognizerView;->cameraEventsListener(Lcom/microblink/camera/view/CameraEventsListener;)V

    invoke-static {}, Lcom/microblink/CameraOptions;->create()Lcom/microblink/CameraOptions;

    move-result-object p1

    invoke-virtual {p1}, Lcom/microblink/CameraOptions;->videoResolutionPreset()Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/microblink/RecognizerView;->setVideoResolutionPreset(Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;)V

    invoke-virtual {p1}, Lcom/microblink/CameraOptions;->aspectMode()Lcom/microblink/camera/view/CameraAspectMode;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/microblink/RecognizerView;->setAspectMode(Lcom/microblink/camera/view/CameraAspectMode;)V

    invoke-virtual {p1}, Lcom/microblink/CameraOptions;->optimizeCameraForNearScan()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/microblink/RecognizerView;->setOptimizeCameraForNearScan(Z)V

    return-void
.end method

.method static synthetic access$000(Lcom/microblink/RecognizerView;)Lcom/microblink/RecognizerDispatcher;
    .locals 0

    iget-object p0, p0, Lcom/microblink/RecognizerView;->dispatcher:Lcom/microblink/RecognizerDispatcher;

    return-object p0
.end method

.method static synthetic access$100(Lcom/microblink/RecognizerView;)Lcom/microblink/CameraRecognizerCallback;
    .locals 0

    iget-object p0, p0, Lcom/microblink/RecognizerView;->callback:Lcom/microblink/CameraRecognizerCallback;

    return-object p0
.end method

.method static synthetic access$200(Lcom/microblink/RecognizerView;Ljava/lang/Runnable;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/microblink/RecognizerView;->runOnUIThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic access$300(Lcom/microblink/RecognizerView;Ljava/lang/Runnable;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/microblink/RecognizerView;->runOnUIThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic access$400(Lcom/microblink/RecognizerView;Ljava/lang/Runnable;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/microblink/RecognizerView;->runOnUIThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic access$502(Lcom/microblink/RecognizerView;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/RecognizerView;->finishing:Z

    return p1
.end method

.method static synthetic access$600(Lcom/microblink/RecognizerView;Ljava/lang/Runnable;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/microblink/RecognizerView;->runOnUIThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic access$700(Lcom/microblink/RecognizerView;Ljava/lang/Runnable;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/microblink/RecognizerView;->runOnUIThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method private checkIfInitialized()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/RecognizerView;->scanOptions:Lcom/microblink/ScanOptions;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The recognizer has not been initialized with options, make sure to call Recognizer.getInstance().initialize() first. ( Scan options is null )"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private receiptId()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    invoke-static {}, Lcom/microblink/Recognizer;->getInstance()Lcom/microblink/Recognizer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/Recognizer;->receiptId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final cameraEventsListener(Lcom/microblink/camera/view/CameraEventsListener;)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/RecognizerView;->simpleCameraEvents:Lcom/microblink/SimpleCameraEvents;

    invoke-static {p1, v0}, Lcom/microblink/internal/Utility;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Lcom/microblink/RecognizerCameraView;->setCameraEventsListener(Lcom/microblink/camera/view/CameraEventsListener;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "camera event listener is implicitly set."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final confirmPicture(Lcom/microblink/BitmapResult;)V
    .locals 7
    .param p1    # Lcom/microblink/BitmapResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/microblink/RecognizerView;->checkIfInitialized()V

    const-string v0, "cameraFrameResult"

    invoke-static {p1, v0}, Lcom/microblink/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/microblink/RecognizerView;->scanOptions:Lcom/microblink/ScanOptions;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/microblink/ScanOptions;->storeFrames()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_0
    new-array v2, v1, [Landroid/os/AsyncTask;

    iget-object v3, p0, Lcom/microblink/RecognizerView;->confirmPictureTask:Landroid/os/AsyncTask;

    aput-object v3, v2, v0

    invoke-static {v1, v2}, Lcom/microblink/internal/Utility;->cancelTasks(Z[Landroid/os/AsyncTask;)V

    new-instance v2, Lcom/microblink/ConfirmPictureTask;

    invoke-virtual {p0}, Lcom/microblink/RecognizerView;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {p0}, Lcom/microblink/RecognizerView;->receiptId()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/microblink/RecognizerView;->scanOptions:Lcom/microblink/ScanOptions;

    iget-object v6, p0, Lcom/microblink/RecognizerView;->callback:Lcom/microblink/CameraRecognizerCallback;

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/microblink/ConfirmPictureTask;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/microblink/ScanOptions;Lcom/microblink/CameraRecognizerCallback;)V

    new-array v1, v1, [Lcom/microblink/BitmapResult;

    aput-object p1, v1, v0

    instance-of p1, v2, Landroid/os/AsyncTask;

    if-nez p1, :cond_0

    invoke-virtual {v2, v1}, Lcom/microblink/ConfirmPictureTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast v2, Landroid/os/AsyncTask;

    invoke-static {v2, v1}, Lcom/newrelic/agent/android/instrumentation/AsyncTaskInstrumentation;->execute(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/microblink/RecognizerView;->confirmPictureTask:Landroid/os/AsyncTask;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v1, "RecognizerView"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/RecognizerView;->callback:Lcom/microblink/CameraRecognizerCallback;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lcom/microblink/CameraRecognizerCallback;->onRecognizerException(Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method public final destroy()V
    .locals 4

    invoke-super {p0}, Lcom/microblink/RecognizerCameraView;->destroy()V

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Lcom/microblink/RecognizerView;->terminate()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "RecognizerView"

    invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v3, v0, [Ljava/lang/Object;

    invoke-static {v2, v1, v3}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    const/4 v1, 0x1

    new-array v2, v1, [Landroid/os/AsyncTask;

    iget-object v3, p0, Lcom/microblink/RecognizerView;->confirmPictureTask:Landroid/os/AsyncTask;

    aput-object v3, v2, v0

    invoke-static {v1, v2}, Lcom/microblink/internal/Utility;->cancelTasks(Z[Landroid/os/AsyncTask;)V

    return-void
.end method

.method public final bridge synthetic enableEnhancedAutofocus(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/microblink/RecognizerCameraView;->enableEnhancedAutofocus(Z)V

    return-void
.end method

.method public final bridge synthetic enqueue(Lcom/microblink/BitmapResult;)V
    .locals 0
    .param p1    # Lcom/microblink/BitmapResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Lcom/microblink/RecognizerCameraView;->enqueue(Lcom/microblink/BitmapResult;)V

    return-void
.end method

.method public final finishedScanning()V
    .locals 2

    sget-object v0, Lcom/microblink/RecognizerView;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/microblink/RecognizerView;->finishing:Z

    if-nez v1, :cond_1

    invoke-direct {p0}, Lcom/microblink/RecognizerView;->checkIfInitialized()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/microblink/RecognizerView;->finishing:Z

    iget-object v1, p0, Lcom/microblink/RecognizerView;->dispatcher:Lcom/microblink/RecognizerDispatcher;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/microblink/RecognizerView;->dispatcher:Lcom/microblink/RecognizerDispatcher;

    invoke-virtual {v1}, Lcom/microblink/RecognizerDispatcher;->shutdown()V

    :cond_0
    invoke-virtual {p0}, Lcom/microblink/RecognizerView;->stopDispatchingFrames()V

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

.method public final initialize(Lcom/microblink/ScanOptions;)V
    .locals 6
    .param p1    # Lcom/microblink/ScanOptions;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/microblink/InvalidLicenceException;,
            Lcom/microblink/RecognizerNotInitializedException;
        }
    .end annotation

    invoke-static {}, Lcom/microblink/internal/Validate;->sdkInitialized()V

    const-string v0, "scanOptions"

    invoke-static {p1, v0}, Lcom/microblink/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/microblink/RecognizerView;->scanOptions:Lcom/microblink/ScanOptions;

    :try_start_0
    invoke-static {}, Lcom/microblink/Recognizer;->getInstance()Lcom/microblink/Recognizer;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/microblink/Recognizer;->initialize(Lcom/microblink/ScanOptions;)V

    invoke-virtual {p1}, Lcom/microblink/ScanOptions;->detectEdges()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/microblink/Recognizer;->getInstance()Lcom/microblink/Recognizer;

    move-result-object p1

    invoke-virtual {p1}, Lcom/microblink/Recognizer;->edgeDetection()Lcom/microblink/internal/EdgeDetectionProcessor;

    move-result-object p1

    iput-object p1, p0, Lcom/microblink/RecognizerView;->edgeDetection:Lcom/microblink/internal/EdgeDetectionProcessor;

    :cond_0
    new-instance p1, Lcom/microblink/RecognizerDispatcher;

    const/4 v1, 0x1

    new-instance v2, Lcom/microblink/RecognizerView$4;

    invoke-direct {v2, p0}, Lcom/microblink/RecognizerView$4;-><init>(Lcom/microblink/RecognizerView;)V

    invoke-static {}, Lcom/microblink/Recognizer;->getInstance()Lcom/microblink/Recognizer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/Recognizer;->merchantDetector()Lcom/microblink/internal/merchant/MerchantDetector;

    move-result-object v3

    invoke-static {}, Lcom/microblink/Recognizer;->getInstance()Lcom/microblink/Recognizer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/Recognizer;->productDetector()Lcom/microblink/ProductDetector;

    move-result-object v4

    move-object v0, p1

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lcom/microblink/RecognizerDispatcher;-><init>(ILcom/microblink/RecognizerCallback;Lcom/microblink/internal/merchant/MerchantDetector;Lcom/microblink/ProductDetector;Lcom/microblink/OnCompleteListener;)V

    iput-object p1, p0, Lcom/microblink/RecognizerView;->dispatcher:Lcom/microblink/RecognizerDispatcher;
    :try_end_0
    .catch Lcom/microblink/InvalidLicenceException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/microblink/RecognizerException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    invoke-virtual {p1}, Lcom/microblink/ReceiptSdkException;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RecognizerView"

    invoke-static {v2, v0, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/microblink/RecognizerView;->terminate()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/RecognizerView;->scanOptions:Lcom/microblink/ScanOptions;

    throw p1
.end method

.method public final onBlurScoreChange(I)V
    .locals 0

    return-void
.end method

.method public final onCameraFrameError(Ljava/lang/Exception;)V
    .locals 3
    .param p1    # Ljava/lang/Exception;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "RecognizerView"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lcom/microblink/RecognizerView$2;

    invoke-direct {v0, p0, p1}, Lcom/microblink/RecognizerView$2;-><init>(Lcom/microblink/RecognizerView;Ljava/lang/Exception;)V

    invoke-virtual {p0, v0}, Lcom/microblink/RecognizerView;->runOnUIThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final onCameraFrameResults(Lcom/microblink/BitmapResult;)V
    .locals 4
    .param p1    # Lcom/microblink/BitmapResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lcom/microblink/RecognizerView;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/RecognizerView;->dispatcher:Lcom/microblink/RecognizerDispatcher;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/microblink/RecognizerView;->dispatcher:Lcom/microblink/RecognizerDispatcher;

    invoke-virtual {v1}, Lcom/microblink/RecognizerDispatcher;->isShutdown()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {}, Lcom/microblink/ReceiptSdk;->onDeviceOcr()Z

    move-result v1

    if-nez v1, :cond_0

    instance-of v1, p1, Lcom/microblink/TakePictureResult;

    if-eqz v1, :cond_1

    :cond_0
    iget-object v1, p0, Lcom/microblink/RecognizerView;->dispatcher:Lcom/microblink/RecognizerDispatcher;

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/microblink/BitmapResult;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v1, v2}, Lcom/microblink/RecognizerDispatcher;->enqueue([Lcom/microblink/BitmapResult;)V

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

.method public final onComplete(Lcom/microblink/BitmapResult;)V
    .locals 5
    .param p1    # Lcom/microblink/BitmapResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/RecognizerView;->scanOptions:Lcom/microblink/ScanOptions;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/microblink/ScanOptions;->storeFrames()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-interface {p1}, Lcom/microblink/BitmapResult;->bitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    invoke-interface {p1}, Lcom/microblink/BitmapResult;->blurScore()I

    move-result v3

    iget-object v4, p0, Lcom/microblink/RecognizerView;->scanOptions:Lcom/microblink/ScanOptions;

    invoke-virtual {v4}, Lcom/microblink/ScanOptions;->frameCharacteristics()Lcom/microblink/FrameCharacteristics;

    move-result-object v4

    invoke-static {v1, v2, v3, v4}, Lcom/microblink/internal/DiskUtils;->createName(IIILcom/microblink/FrameCharacteristics;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/microblink/Recognizer;->getInstance()Lcom/microblink/Recognizer;

    move-result-object v2

    invoke-virtual {p0}, Lcom/microblink/RecognizerView;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, v3, v0, v1}, Lcom/microblink/Recognizer;->addDebugFrames(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "RecognizerView"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/microblink/RecognizerView;->callback:Lcom/microblink/CameraRecognizerCallback;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/microblink/RecognizerView$6;

    invoke-direct {v0, p0, p1}, Lcom/microblink/RecognizerView$6;-><init>(Lcom/microblink/RecognizerView;Lcom/microblink/BitmapResult;)V

    invoke-virtual {p0, v0}, Lcom/microblink/RecognizerView;->runOnUIThread(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public final bridge synthetic onComplete(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lcom/microblink/BitmapResult;

    invoke-virtual {p0, p1}, Lcom/microblink/RecognizerView;->onComplete(Lcom/microblink/BitmapResult;)V

    return-void
.end method

.method public final onDebugResults(Lcom/microblink/DebugResult;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/microblink/RecognizerView;->onRecognizerResult(Lcom/microblink/RecognizerResult;)V

    return-void
.end method

.method public final onEdgeDetectionResult(Lcom/microblink/EdgeDetectionResult;)V
    .locals 0
    .param p1    # Lcom/microblink/EdgeDetectionResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Lcom/microblink/RecognizerView;->onRecognizerResult(Lcom/microblink/RecognizerResult;)V

    return-void
.end method

.method public final onProcessStateChanged(I)V
    .locals 0

    return-void
.end method

.method public final onRecognizerException(Lcom/microblink/RecognizerException;)V
    .locals 2
    .param p1    # Lcom/microblink/RecognizerException;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "RecognizerView"

    invoke-virtual {p1}, Lcom/microblink/RecognizerException;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final onRecognizerResult(Lcom/microblink/RecognizerResult;)V
    .locals 1
    .param p1    # Lcom/microblink/RecognizerResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lcom/microblink/RecognizerView$3;

    invoke-direct {v0, p0, p1}, Lcom/microblink/RecognizerView$3;-><init>(Lcom/microblink/RecognizerView;Lcom/microblink/RecognizerResult;)V

    invoke-virtual {p0, v0}, Lcom/microblink/RecognizerView;->runOnUIThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final preliminaryResults()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    invoke-direct {p0}, Lcom/microblink/RecognizerView;->checkIfInitialized()V

    iget-object v0, p0, Lcom/microblink/RecognizerView;->dispatcher:Lcom/microblink/RecognizerDispatcher;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/microblink/RecognizerDispatcher;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Recognizer is already shutdown!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-static {}, Lcom/microblink/Recognizer;->getInstance()Lcom/microblink/Recognizer;

    move-result-object v0

    invoke-virtual {p0}, Lcom/microblink/RecognizerView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/microblink/RecognizerView;->dispatcher:Lcom/microblink/RecognizerDispatcher;

    invoke-virtual {v2}, Lcom/microblink/RecognizerDispatcher;->state()I

    move-result v2

    new-instance v3, Lcom/microblink/RecognizerView$5;

    invoke-direct {v3, p0}, Lcom/microblink/RecognizerView$5;-><init>(Lcom/microblink/RecognizerView;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/microblink/Recognizer;->ocrResults(Landroid/content/Context;ILcom/microblink/RecognizerCallback;)V

    return-void
.end method

.method public final recognizerCallback(Lcom/microblink/CameraRecognizerCallback;)V
    .locals 0
    .param p1    # Lcom/microblink/CameraRecognizerCallback;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/microblink/RecognizerView;->callback:Lcom/microblink/CameraRecognizerCallback;

    return-void
.end method

.method public final bridge synthetic scanRegion(Landroid/graphics/RectF;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/microblink/RecognizerCameraView;->scanRegion(Landroid/graphics/RectF;)V

    return-void
.end method

.method final shouldRunEdgeDetection()Z
    .locals 2

    invoke-static {}, Lcom/microblink/Recognizer;->getInstance()Lcom/microblink/Recognizer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/Recognizer;->edgeDetection()Lcom/microblink/internal/EdgeDetectionProcessor;

    move-result-object v0

    iget-object v1, p0, Lcom/microblink/RecognizerView;->scanOptions:Lcom/microblink/ScanOptions;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/microblink/ScanOptions;->detectEdges()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/microblink/internal/EdgeDetectionProcessor;->aboveThresholdCountAtLimit()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/microblink/internal/EdgeDetectionProcessor;->isNthFrame()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final takePicture(Lcom/microblink/CameraCaptureListener;)V
    .locals 1
    .param p1    # Lcom/microblink/CameraCaptureListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/microblink/RecognizerView;->checkIfInitialized()V

    new-instance v0, Lcom/microblink/TakePictureInterceptor;

    invoke-direct {v0, p0, p1}, Lcom/microblink/TakePictureInterceptor;-><init>(Lcom/microblink/RecognizerView;Lcom/microblink/CameraCaptureListener;)V

    invoke-virtual {p0, v0}, Lcom/microblink/RecognizerView;->interceptor(Lcom/microblink/Interceptor;)V

    return-void
.end method

.method final terminate()V
    .locals 2

    sget-object v0, Lcom/microblink/RecognizerView;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/RecognizerView;->dispatcher:Lcom/microblink/RecognizerDispatcher;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/microblink/RecognizerView;->dispatcher:Lcom/microblink/RecognizerDispatcher;

    invoke-virtual {v1}, Lcom/microblink/RecognizerDispatcher;->cancel()V

    :cond_0
    invoke-static {}, Lcom/microblink/Recognizer;->getInstance()Lcom/microblink/Recognizer;

    move-result-object v1

    invoke-virtual {v1}, Lcom/microblink/Recognizer;->terminate()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
