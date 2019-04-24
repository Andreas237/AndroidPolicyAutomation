.class public final Lcom/microblink/Recognizer;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/Recognizer$ServiceHandler;
    }
.end annotation


# static fields
.field private static final INVALID_FRAME_INDEX:I = -0x1

.field private static final TAG:Ljava/lang/String; = "Recognizer"

.field private static volatile instance:Lcom/microblink/Recognizer;

.field private static final lock:Ljava/lang/Object;


# instance fields
.field private edgeDetection:Lcom/microblink/internal/EdgeDetectionProcessor;

.field private initialized:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private mainThread:Landroid/os/Handler;

.field private merchantDetector:Lcom/microblink/internal/merchant/MerchantDetector;

.field private options:Lcom/microblink/ScanOptions;

.field private productDetector:Lcom/microblink/ProductDetector;

.field private receipt:Lcom/microblink/Receipt;

.field private scanFrameIndex:I

.field private volatile serviceHandler:Lcom/microblink/Recognizer$ServiceHandler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/microblink/Recognizer;->lock:Ljava/lang/Object;

    invoke-static {}, Lcom/microblink/NativeLibraryLoader;->loadNativeLibrary()Z

    return-void
.end method

.method private constructor <init>()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/microblink/RecognizerException;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/microblink/Recognizer;->mainThread:Landroid/os/Handler;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/microblink/Recognizer;->initialized:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, -0x1

    iput v0, p0, Lcom/microblink/Recognizer;->scanFrameIndex:I

    :try_start_0
    invoke-direct {p0}, Lcom/microblink/Recognizer;->createServiceHandlerIfNeeded()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v2, "Recognizer"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v2, v0, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic access$000(Lcom/microblink/Recognizer;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/microblink/Recognizer;->mainThread:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$100(Lcom/microblink/Recognizer;)Lcom/microblink/ScanOptions;
    .locals 0

    iget-object p0, p0, Lcom/microblink/Recognizer;->options:Lcom/microblink/ScanOptions;

    return-object p0
.end method

.method static synthetic access$200(Lcom/microblink/Recognizer;)Lcom/microblink/Receipt;
    .locals 0

    iget-object p0, p0, Lcom/microblink/Recognizer;->receipt:Lcom/microblink/Receipt;

    return-object p0
.end method

.method private checkIfInitialized()V
    .locals 2

    invoke-static {}, Lcom/microblink/internal/Validate;->sdkInitialized()V

    invoke-virtual {p0}, Lcom/microblink/Recognizer;->initialized()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/microblink/RecognizerNotInitializedException;

    const-string v1, "The recognizer has not been initialized, make sure to call Recognizer.getInstance().initialize() first."

    invoke-direct {v0, v1}, Lcom/microblink/RecognizerNotInitializedException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private createServiceHandlerIfNeeded()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/microblink/SdkNotInitializedException;
        }
    .end annotation

    invoke-static {}, Lcom/microblink/internal/Validate;->sdkInitialized()V

    iget-object v0, p0, Lcom/microblink/Recognizer;->serviceHandler:Lcom/microblink/Recognizer$ServiceHandler;

    if-nez v0, :cond_0

    :try_start_0
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "RecognizerHandlerThread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    new-instance v1, Lcom/microblink/Recognizer$ServiceHandler;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Lcom/microblink/Recognizer$ServiceHandler;-><init>(Lcom/microblink/Recognizer;Landroid/os/Looper;)V

    iput-object v1, p0, Lcom/microblink/Recognizer;->serviceHandler:Lcom/microblink/Recognizer$ServiceHandler;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    const-string v4, "Recognizer"

    invoke-static {v4, v1, v3}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/microblink/Recognizer;->initialized:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    new-instance v1, Lcom/microblink/RecognizerException;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/microblink/RecognizerException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_0
    return-void
.end method

.method public static getInstance()Lcom/microblink/Recognizer;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/microblink/RecognizerException;
        }
    .end annotation

    sget-object v0, Lcom/microblink/Recognizer;->instance:Lcom/microblink/Recognizer;

    if-nez v0, :cond_1

    sget-object v1, Lcom/microblink/Recognizer;->lock:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/microblink/Recognizer;->instance:Lcom/microblink/Recognizer;

    if-nez v0, :cond_0

    new-instance v0, Lcom/microblink/Recognizer;

    invoke-direct {v0}, Lcom/microblink/Recognizer;-><init>()V

    sput-object v0, Lcom/microblink/Recognizer;->instance:Lcom/microblink/Recognizer;

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method private static native performLogoDetection(Landroid/graphics/Bitmap;)Ljava/util/ArrayList;
    .param p0    # Landroid/graphics/Bitmap;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/microblink/internal/LogoResult;",
            ">;"
        }
    .end annotation
.end method


# virtual methods
.method final addDebugFrames(Landroid/content/Context;JLandroid/graphics/Bitmap;)V
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Landroid/graphics/Bitmap;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lcom/microblink/Recognizer;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p4}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    :try_start_1
    invoke-virtual {p0}, Lcom/microblink/Recognizer;->scanOptions()Lcom/microblink/ScanOptions;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {p4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    invoke-virtual {v1}, Lcom/microblink/ScanOptions;->frameCharacteristics()Lcom/microblink/FrameCharacteristics;

    move-result-object v1

    invoke-static {p2, p3, v2, v3, v1}, Lcom/microblink/internal/DiskUtils;->croppedFileName(JIILcom/microblink/FrameCharacteristics;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p4, p2}, Lcom/microblink/Recognizer;->addDebugFrames(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    const-string p2, "Recognizer"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p3, 0x0

    new-array p3, p3, [Ljava/lang/Object;

    invoke-static {p2, p1, p3}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method final addDebugFrames(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Bitmap;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lcom/microblink/Recognizer;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lcom/microblink/Recognizer;->scanOptions()Lcom/microblink/ScanOptions;

    move-result-object v1

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/microblink/ScanOptions;->frameCharacteristics()Lcom/microblink/FrameCharacteristics;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, p3, p2, v1}, Lcom/microblink/internal/DiskUtils;->writeToDisk(Landroid/content/Context;Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/microblink/FrameCharacteristics;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_1
    const-string p2, "Recognizer"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p3, 0x0

    new-array p3, p3, [Ljava/lang/Object;

    invoke-static {p2, p1, p3}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method final edgeDetection()Lcom/microblink/internal/EdgeDetectionProcessor;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/Recognizer;->edgeDetection:Lcom/microblink/internal/EdgeDetectionProcessor;

    return-object v0
.end method

.method final finishScan(Lcom/microblink/SummaryStats;ILcom/microblink/RecognizerCallback;)V
    .locals 5
    .param p1    # Lcom/microblink/SummaryStats;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/microblink/RecognizerCallback;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/microblink/Recognizer;->initialized()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string p1, "Recognizer"

    const-string p2, "Recognizer was terminated while trying to process finished results."

    new-array p3, v1, [Ljava/lang/Object;

    invoke-static {p1, p2, p3}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    sget-object v0, Lcom/microblink/Recognizer;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v2, p0, Lcom/microblink/Recognizer;->scanFrameIndex:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_2

    invoke-virtual {p0}, Lcom/microblink/Recognizer;->scanOptions()Lcom/microblink/ScanOptions;

    move-result-object p1

    invoke-static {}, Lcom/microblink/ScanResults;->newBuilder()Lcom/microblink/ScanResults$Builder;

    move-result-object p2

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/microblink/ScanOptions;->retailer()Lcom/microblink/Retailer;

    move-result-object p1

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/microblink/Retailer;->UNKNOWN:Lcom/microblink/Retailer;

    :goto_0
    invoke-virtual {p2, p1}, Lcom/microblink/ScanResults$Builder;->retailerId(Lcom/microblink/Retailer;)Lcom/microblink/ScanResults$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/microblink/ScanResults$Builder;->build()Lcom/microblink/ScanResults;

    move-result-object p1

    new-instance p2, Lcom/microblink/Media;

    new-array v1, v1, [Ljava/io/File;

    invoke-static {v1}, Lcom/microblink/internal/Utility;->newArrayList([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-direct {p2, v1}, Lcom/microblink/Media;-><init>(Ljava/util/List;)V

    invoke-interface {p3, p1, p2}, Lcom/microblink/RecognizerCallback;->onRecognizerDone(Lcom/microblink/ScanResults;Lcom/microblink/Media;)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :cond_2
    :try_start_1
    iget-object v2, p0, Lcom/microblink/Recognizer;->serviceHandler:Lcom/microblink/Recognizer$ServiceHandler;

    new-instance v3, Lcom/microblink/OcrResultsRunner;

    invoke-static {}, Lcom/microblink/ReceiptSdk;->applicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4, p1, p2, p3}, Lcom/microblink/OcrResultsRunner;-><init>(Landroid/content/Context;Lcom/microblink/SummaryStats;ILcom/microblink/RecognizerCallback;)V

    invoke-virtual {v2, v3}, Lcom/microblink/Recognizer$ServiceHandler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_2
    const-string p2, "Recognizer"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p2, v2, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {p3, p1}, Lcom/microblink/RecognizerCallback;->onRecognizerException(Ljava/lang/Throwable;)V

    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final initialize(Lcom/microblink/ScanOptions;)V
    .locals 5
    .param p1    # Lcom/microblink/ScanOptions;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "VisibleForTests"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/microblink/InvalidLicenceException;,
            Lcom/microblink/RecognizerException;,
            Lcom/microblink/SdkNotInitializedException;
        }
    .end annotation

    sget-object v0, Lcom/microblink/Recognizer;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lcom/microblink/Recognizer;->createServiceHandlerIfNeeded()V

    iput-object p1, p0, Lcom/microblink/Recognizer;->options:Lcom/microblink/ScanOptions;

    const/4 v1, -0x1

    iput v1, p0, Lcom/microblink/Recognizer;->scanFrameIndex:I

    new-instance v1, Lcom/microblink/Receipt;

    invoke-virtual {p1}, Lcom/microblink/ScanOptions;->retailer()Lcom/microblink/Retailer;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/microblink/Receipt;-><init>(Lcom/microblink/Retailer;)V

    iput-object v1, p0, Lcom/microblink/Recognizer;->receipt:Lcom/microblink/Receipt;

    iget-object v1, p0, Lcom/microblink/Recognizer;->merchantDetector:Lcom/microblink/internal/merchant/MerchantDetector;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/microblink/Recognizer;->merchantDetector:Lcom/microblink/internal/merchant/MerchantDetector;

    invoke-virtual {v1}, Lcom/microblink/internal/merchant/MerchantDetector;->cancel()V

    :cond_0
    iget-object v1, p0, Lcom/microblink/Recognizer;->productDetector:Lcom/microblink/ProductDetector;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/microblink/Recognizer;->productDetector:Lcom/microblink/ProductDetector;

    invoke-virtual {v1}, Lcom/microblink/ProductDetector;->cancel()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    const/4 v1, 0x0

    :try_start_1
    invoke-static {}, Lcom/microblink/ReceiptSdk;->applicationContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/microblink/Recognizer;->receipt:Lcom/microblink/Receipt;

    invoke-virtual {v3}, Lcom/microblink/Receipt;->receiptId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v1}, Lcom/microblink/internal/DiskUtils;->deleteFilesAsync(Landroid/content/Context;Ljava/lang/String;Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v2

    :try_start_2
    const-string v3, "Recognizer"

    invoke-virtual {v2}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v3, v2, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    new-instance v1, Lcom/microblink/internal/services/merchant/MerchantLookupProcess;

    new-instance v2, Lcom/microblink/internal/merchant/MerchantResultValidatorInvalidStores;

    invoke-direct {v2}, Lcom/microblink/internal/merchant/MerchantResultValidatorInvalidStores;-><init>()V

    invoke-direct {v1, v2}, Lcom/microblink/internal/services/merchant/MerchantLookupProcess;-><init>(Lcom/microblink/internal/merchant/MerchantResultValidator;)V

    new-instance v2, Lcom/microblink/internal/services/merchant/BlinkMerchantLookupProcess;

    invoke-direct {v2}, Lcom/microblink/internal/services/merchant/BlinkMerchantLookupProcess;-><init>()V

    invoke-virtual {v1, v2}, Lcom/microblink/internal/services/merchant/MerchantLookupProcess;->chain(Lcom/microblink/internal/services/merchant/MerchantDetectionProcess;)Lcom/microblink/internal/services/merchant/MerchantLookupProcess;

    move-result-object v1

    invoke-virtual {p1}, Lcom/microblink/ScanOptions;->merchantConfiguration()Lcom/microblink/MerchantConfiguration;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {p1}, Lcom/microblink/ScanOptions;->retailer()Lcom/microblink/Retailer;

    move-result-object v3

    sget-object v4, Lcom/microblink/Retailer;->UNKNOWN:Lcom/microblink/Retailer;

    if-ne v3, v4, :cond_3

    invoke-virtual {v2}, Lcom/microblink/MerchantConfiguration;->googlePhoneLookup()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {}, Lcom/microblink/ReceiptSdk;->googleApiKey()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    new-instance v3, Lcom/microblink/internal/services/google/GoogleMerchantLookupProcess;

    invoke-direct {v3}, Lcom/microblink/internal/services/google/GoogleMerchantLookupProcess;-><init>()V

    invoke-virtual {v1, v3}, Lcom/microblink/internal/services/merchant/MerchantLookupProcess;->chain(Lcom/microblink/internal/services/merchant/MerchantDetectionProcess;)Lcom/microblink/internal/services/merchant/MerchantLookupProcess;

    :cond_2
    invoke-virtual {v2}, Lcom/microblink/MerchantConfiguration;->yelpPhoneLookup()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {}, Lcom/microblink/ReceiptSdk;->yelpApiKey()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    new-instance v2, Lcom/microblink/internal/services/yelp/YelpMerchantLookupProcess;

    invoke-direct {v2}, Lcom/microblink/internal/services/yelp/YelpMerchantLookupProcess;-><init>()V

    invoke-virtual {v1, v2}, Lcom/microblink/internal/services/merchant/MerchantLookupProcess;->chain(Lcom/microblink/internal/services/merchant/MerchantDetectionProcess;)Lcom/microblink/internal/services/merchant/MerchantLookupProcess;

    :cond_3
    new-instance v2, Lcom/microblink/internal/merchant/MerchantDetector;

    new-instance v3, Lcom/microblink/internal/merchant/MerchantResultValidatorImpl;

    invoke-direct {v3}, Lcom/microblink/internal/merchant/MerchantResultValidatorImpl;-><init>()V

    invoke-direct {v2, v1, v3}, Lcom/microblink/internal/merchant/MerchantDetector;-><init>(Lcom/microblink/internal/services/merchant/MerchantLookupProcess;Lcom/microblink/internal/merchant/MerchantResultValidator;)V

    iput-object v2, p0, Lcom/microblink/Recognizer;->merchantDetector:Lcom/microblink/internal/merchant/MerchantDetector;

    new-instance v1, Lcom/microblink/ProductDetector;

    invoke-static {}, Lcom/microblink/ReceiptSdk;->productIntelligenceKey()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_4

    new-instance v2, Lcom/microblink/ProductIntelligenceLookup;

    invoke-static {}, Lcom/microblink/ReceiptSdk;->applicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {}, Lcom/microblink/ReceiptSdk;->productIntelligenceKey()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/microblink/ProductIntelligenceLookup;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    new-instance v2, Lcom/microblink/ProductLookupImpl;

    invoke-direct {v2}, Lcom/microblink/ProductLookupImpl;-><init>()V

    :goto_1
    invoke-direct {v1, v2}, Lcom/microblink/ProductDetector;-><init>(Lcom/microblink/ProductLookup;)V

    iput-object v1, p0, Lcom/microblink/Recognizer;->productDetector:Lcom/microblink/ProductDetector;

    invoke-virtual {p1}, Lcom/microblink/ScanOptions;->detectEdges()Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v1, Lcom/microblink/internal/EdgeDetectionProcessor;

    invoke-virtual {p1}, Lcom/microblink/ScanOptions;->edgeDetectionConfiguration()Lcom/microblink/EdgeDetectionConfiguration;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/microblink/internal/EdgeDetectionProcessor;-><init>(Lcom/microblink/EdgeDetectionConfiguration;)V

    iput-object v1, p0, Lcom/microblink/Recognizer;->edgeDetection:Lcom/microblink/internal/EdgeDetectionProcessor;

    :cond_5
    iget-object p1, p0, Lcom/microblink/Recognizer;->initialized:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method final initialized()Z
    .locals 2

    sget-object v0, Lcom/microblink/Recognizer;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/Recognizer;->initialized:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

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

.method final merchantDetector()Lcom/microblink/internal/merchant/MerchantDetector;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/Recognizer;->merchantDetector:Lcom/microblink/internal/merchant/MerchantDetector;

    return-object v0
.end method

.method final ocrResults(Landroid/content/Context;ILcom/microblink/RecognizerCallback;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/microblink/RecognizerCallback;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/microblink/Recognizer;->checkIfInitialized()V

    sget-object v0, Lcom/microblink/Recognizer;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/microblink/Recognizer;->scanFrameIndex:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    invoke-virtual {p0}, Lcom/microblink/Recognizer;->scanOptions()Lcom/microblink/ScanOptions;

    move-result-object p1

    new-instance p2, Lcom/microblink/PreliminaryResult;

    invoke-static {}, Lcom/microblink/ScanResults;->newBuilder()Lcom/microblink/ScanResults$Builder;

    move-result-object v1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/microblink/ScanOptions;->retailer()Lcom/microblink/Retailer;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/microblink/Retailer;->UNKNOWN:Lcom/microblink/Retailer;

    :goto_0
    invoke-virtual {v1, p1}, Lcom/microblink/ScanResults$Builder;->retailerId(Lcom/microblink/Retailer;)Lcom/microblink/ScanResults$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/microblink/ScanResults$Builder;->build()Lcom/microblink/ScanResults;

    move-result-object p1

    new-instance v1, Lcom/microblink/Media;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/io/File;

    invoke-static {v2}, Lcom/microblink/internal/Utility;->newArrayList([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/microblink/Media;-><init>(Ljava/util/List;)V

    invoke-direct {p2, p1, v1}, Lcom/microblink/PreliminaryResult;-><init>(Lcom/microblink/ScanResults;Lcom/microblink/Media;)V

    invoke-interface {p3, p2}, Lcom/microblink/RecognizerCallback;->onRecognizerResultsChanged(Lcom/microblink/RecognizerResult;)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :cond_1
    :try_start_1
    iget-object v1, p0, Lcom/microblink/Recognizer;->serviceHandler:Lcom/microblink/Recognizer$ServiceHandler;

    new-instance v2, Lcom/microblink/OcrResultsRunner;

    invoke-direct {v2, p1, p2, p3}, Lcom/microblink/OcrResultsRunner;-><init>(Landroid/content/Context;ILcom/microblink/RecognizerCallback;)V

    invoke-virtual {v1, v2}, Lcom/microblink/Recognizer$ServiceHandler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_2
    invoke-interface {p3, p1}, Lcom/microblink/RecognizerCallback;->onRecognizerException(Ljava/lang/Throwable;)V

    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final productDetector()Lcom/microblink/ProductDetector;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/Recognizer;->productDetector:Lcom/microblink/ProductDetector;

    return-object v0
.end method

.method final receipt()Lcom/microblink/Receipt;
    .locals 2

    sget-object v0, Lcom/microblink/Recognizer;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/Recognizer;->receipt:Lcom/microblink/Receipt;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method final receiptId()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    sget-object v0, Lcom/microblink/Recognizer;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/Recognizer;->receipt:Lcom/microblink/Receipt;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/microblink/Recognizer;->receipt:Lcom/microblink/Receipt;

    invoke-virtual {v1}, Lcom/microblink/Receipt;->receiptId()Ljava/lang/String;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :cond_0
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

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

.method public final varargs recognize(Landroid/content/Context;Lcom/microblink/RecognizerCallback;Lcom/microblink/CameraOrientation;[Landroid/graphics/Bitmap;)V
    .locals 9
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/RecognizerCallback;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/microblink/CameraOrientation;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # [Landroid/graphics/Bitmap;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/microblink/RecognizerException;
        }
    .end annotation

    invoke-direct {p0}, Lcom/microblink/Recognizer;->checkIfInitialized()V

    iget-object v0, p0, Lcom/microblink/Recognizer;->receipt:Lcom/microblink/Receipt;

    const-string v1, "receipt"

    invoke-static {v0, v1}, Lcom/microblink/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/microblink/Recognizer;->lock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    new-instance v8, Lcom/microblink/RecognizerDispatcher;

    const/4 v3, 0x0

    new-instance v4, Lcom/microblink/Recognizer$2;

    invoke-direct {v4, p0, p2}, Lcom/microblink/Recognizer$2;-><init>(Lcom/microblink/Recognizer;Lcom/microblink/RecognizerCallback;)V

    iget-object v5, p0, Lcom/microblink/Recognizer;->merchantDetector:Lcom/microblink/internal/merchant/MerchantDetector;

    iget-object v6, p0, Lcom/microblink/Recognizer;->productDetector:Lcom/microblink/ProductDetector;

    new-instance v7, Lcom/microblink/Recognizer$3;

    invoke-direct {v7, p0, p1}, Lcom/microblink/Recognizer$3;-><init>(Lcom/microblink/Recognizer;Landroid/content/Context;)V

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Lcom/microblink/RecognizerDispatcher;-><init>(ILcom/microblink/RecognizerCallback;Lcom/microblink/internal/merchant/MerchantDetector;Lcom/microblink/ProductDetector;Lcom/microblink/OnCompleteListener;)V

    invoke-virtual {v8}, Lcom/microblink/RecognizerDispatcher;->start()V

    array-length p1, p4

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    aget-object v3, p4, v2

    const/4 v4, 0x1

    new-array v4, v4, [Lcom/microblink/BitmapResult;

    invoke-static {v3, p3}, Lcom/microblink/CameraFrameResult;->create(Landroid/graphics/Bitmap;Lcom/microblink/CameraOrientation;)Lcom/microblink/CameraFrameResult;

    move-result-object v3

    aput-object v3, v4, v1

    invoke-virtual {v8, v4}, Lcom/microblink/RecognizerDispatcher;->enqueue([Lcom/microblink/BitmapResult;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v8}, Lcom/microblink/RecognizerDispatcher;->shutdown()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    :try_start_1
    const-string p3, "Recognizer"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p4

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p3, p4, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {p2, p1}, Lcom/microblink/RecognizerCallback;->onRecognizerException(Ljava/lang/Throwable;)V

    :goto_1
    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method final recognize(Lcom/microblink/BitmapResult;Lcom/microblink/RecognizeDataCallback;)V
    .locals 12
    .param p1    # Lcom/microblink/BitmapResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/RecognizeDataCallback;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/microblink/RecognizerException;
        }
    .end annotation

    invoke-direct {p0}, Lcom/microblink/Recognizer;->checkIfInitialized()V

    const-string v0, "results"

    invoke-static {p1, v0}, Lcom/microblink/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lcom/microblink/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/microblink/Recognizer;->receipt:Lcom/microblink/Receipt;

    const-string v1, "receipt"

    invoke-static {v0, v1}, Lcom/microblink/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/microblink/Recognizer;->lock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iget v2, p0, Lcom/microblink/Recognizer;->scanFrameIndex:I

    const/4 v3, 0x1

    add-int/2addr v2, v3

    iput v2, p0, Lcom/microblink/Recognizer;->scanFrameIndex:I

    iget-object v2, p0, Lcom/microblink/Recognizer;->serviceHandler:Lcom/microblink/Recognizer$ServiceHandler;

    new-instance v11, Lcom/microblink/RecognizerRunner;

    invoke-static {}, Lcom/microblink/ReceiptSdk;->applicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {}, Lcom/microblink/ReceiptSdk;->applicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {}, Lcom/microblink/ReceiptSdk;->onDeviceOcr()Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-static {v4, v3}, Lcom/microblink/OcrRecognizerFactory;->create(Landroid/content/Context;I)Lcom/microblink/OcrRecognizer;

    move-result-object v6

    iget v7, p0, Lcom/microblink/Recognizer;->scanFrameIndex:I

    iget-object v9, p0, Lcom/microblink/Recognizer;->options:Lcom/microblink/ScanOptions;

    move-object v4, v11

    move-object v8, p1

    move-object v10, p2

    invoke-direct/range {v4 .. v10}, Lcom/microblink/RecognizerRunner;-><init>(Landroid/content/Context;Lcom/microblink/OcrRecognizer;ILcom/microblink/BitmapResult;Lcom/microblink/ScanOptions;Lcom/microblink/RecognizeDataCallback;)V

    invoke-virtual {v2, v11}, Lcom/microblink/Recognizer$ServiceHandler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    const-string p2, "Recognizer"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p2, v2, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p2, Lcom/microblink/RecognizerException;

    invoke-direct {p2, p1}, Lcom/microblink/RecognizerException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final recognizeLogo(Landroid/graphics/Bitmap;)Ljava/util/ArrayList;
    .locals 4
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/microblink/internal/LogoResult;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/microblink/RecognizerException;
        }
    .end annotation

    invoke-direct {p0}, Lcom/microblink/Recognizer;->checkIfInitialized()V

    sget-object v0, Lcom/microblink/Recognizer;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p1}, Lcom/microblink/Recognizer;->performLogoDetection(Landroid/graphics/Bitmap;)Ljava/util/ArrayList;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v1, "Recognizer"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v1, p1, v3}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-array p1, v2, [Lcom/microblink/internal/LogoResult;

    invoke-static {p1}, Lcom/microblink/internal/Utility;->newArrayList([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :goto_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final recognizeWalmartQR(Landroid/content/Context;Landroid/net/Uri;Lcom/microblink/RecognizerCallback;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/microblink/RecognizerCallback;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/microblink/RecognizerNotInitializedException;
        }
    .end annotation

    invoke-direct {p0}, Lcom/microblink/Recognizer;->checkIfInitialized()V

    sget-object v0, Lcom/microblink/Recognizer;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p2}, Lcom/microblink/internal/ServiceUtils;->hasHttpOrHttps(Landroid/net/Uri;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to parse uri: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-interface {p3, p1}, Lcom/microblink/RecognizerCallback;->onRecognizerException(Ljava/lang/Throwable;)V
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
    new-instance v1, Lcom/microblink/internal/services/walmart/WalmartRepository;

    invoke-direct {v1}, Lcom/microblink/internal/services/walmart/WalmartRepository;-><init>()V

    new-instance v2, Lcom/microblink/Recognizer$1;

    invoke-direct {v2, p0, p3, p2, p1}, Lcom/microblink/Recognizer$1;-><init>(Lcom/microblink/Recognizer;Lcom/microblink/RecognizerCallback;Landroid/net/Uri;Landroid/content/Context;)V

    invoke-virtual {v1, p2, v2}, Lcom/microblink/internal/services/walmart/WalmartRepository;->download(Landroid/net/Uri;Lcom/microblink/OnNullableCompleteListener;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_3
    const-string p2, "Recognizer"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2, v1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {p3, p1}, Lcom/microblink/RecognizerCallback;->onRecognizerException(Ljava/lang/Throwable;)V

    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method final scanOptions()Lcom/microblink/ScanOptions;
    .locals 2

    sget-object v0, Lcom/microblink/Recognizer;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/Recognizer;->options:Lcom/microblink/ScanOptions;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method final terminate()V
    .locals 3

    sget-object v0, Lcom/microblink/Recognizer;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/Recognizer;->merchantDetector:Lcom/microblink/internal/merchant/MerchantDetector;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/microblink/Recognizer;->merchantDetector:Lcom/microblink/internal/merchant/MerchantDetector;

    invoke-virtual {v1}, Lcom/microblink/internal/merchant/MerchantDetector;->cancel()V

    :cond_0
    iget-object v1, p0, Lcom/microblink/Recognizer;->productDetector:Lcom/microblink/ProductDetector;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/microblink/Recognizer;->productDetector:Lcom/microblink/ProductDetector;

    invoke-virtual {v1}, Lcom/microblink/ProductDetector;->cancel()V

    :cond_1
    iget-object v1, p0, Lcom/microblink/Recognizer;->serviceHandler:Lcom/microblink/Recognizer$ServiceHandler;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/microblink/Recognizer;->serviceHandler:Lcom/microblink/Recognizer$ServiceHandler;

    invoke-virtual {v1, v2}, Lcom/microblink/Recognizer$ServiceHandler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    :cond_2
    iput-object v2, p0, Lcom/microblink/Recognizer;->options:Lcom/microblink/ScanOptions;

    iput-object v2, p0, Lcom/microblink/Recognizer;->receipt:Lcom/microblink/Receipt;

    iput-object v2, p0, Lcom/microblink/Recognizer;->merchantDetector:Lcom/microblink/internal/merchant/MerchantDetector;

    iput-object v2, p0, Lcom/microblink/Recognizer;->productDetector:Lcom/microblink/ProductDetector;

    iput-object v2, p0, Lcom/microblink/Recognizer;->edgeDetection:Lcom/microblink/internal/EdgeDetectionProcessor;

    iget-object v1, p0, Lcom/microblink/Recognizer;->initialized:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
