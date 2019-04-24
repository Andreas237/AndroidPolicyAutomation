.class final Lcom/microblink/RecognizerRunner;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final MAX_WIDTH_THRESHOLD:I = 0x2bc

.field private static final TAG:Ljava/lang/String; = "RecognizerRunner"


# instance fields
.field private bitmapResult:Lcom/microblink/BitmapResult;

.field private context:Landroid/content/Context;

.field private country:Lcom/microblink/internal/country/Country;

.field private frameCount:I

.field private listener:Lcom/microblink/RecognizeDataCallback;

.field private options:Lcom/microblink/ScanOptions;

.field private recognizer:Lcom/microblink/OcrRecognizer;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/microblink/OcrRecognizer;ILcom/microblink/BitmapResult;Lcom/microblink/ScanOptions;Lcom/microblink/RecognizeDataCallback;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/OcrRecognizer;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/microblink/BitmapResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/microblink/ScanOptions;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lcom/microblink/RecognizeDataCallback;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/microblink/RecognizerRunner;->context:Landroid/content/Context;

    iput p3, p0, Lcom/microblink/RecognizerRunner;->frameCount:I

    iput-object p2, p0, Lcom/microblink/RecognizerRunner;->recognizer:Lcom/microblink/OcrRecognizer;

    iput-object p6, p0, Lcom/microblink/RecognizerRunner;->listener:Lcom/microblink/RecognizeDataCallback;

    iput-object p4, p0, Lcom/microblink/RecognizerRunner;->bitmapResult:Lcom/microblink/BitmapResult;

    iput-object p5, p0, Lcom/microblink/RecognizerRunner;->options:Lcom/microblink/ScanOptions;

    invoke-static {}, Lcom/microblink/internal/Validate;->sdkInitialized()V

    const-string p1, "options"

    invoke-static {p5, p1}, Lcom/microblink/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "bitmapResult"

    invoke-static {p4, p1}, Lcom/microblink/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "listener"

    invoke-static {p6, p1}, Lcom/microblink/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p5}, Lcom/microblink/ScanOptions;->countryCode()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p5}, Lcom/microblink/ScanOptions;->countryCode()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/microblink/internal/country/Country;->getCountryByCode(Ljava/lang/String;)Lcom/microblink/internal/country/Country;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/microblink/RecognizerRunner;->country:Lcom/microblink/internal/country/Country;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/RecognizerRunner;->listener:Lcom/microblink/RecognizeDataCallback;

    new-instance v1, Lcom/microblink/RecognizerNotInitializedException;

    const-string v2, "Continuous Deep Ocr Runner recognizer thread has been interrupted!"

    invoke-direct {v1, v2}, Lcom/microblink/RecognizerNotInitializedException;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/microblink/RecognizeDataCallback;->onRecognizerException(Lcom/microblink/RecognizerException;)V

    return-void

    :cond_0
    invoke-static {}, Lcom/microblink/Recognizer;->getInstance()Lcom/microblink/Recognizer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/Recognizer;->initialized()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/microblink/RecognizerRunner;->listener:Lcom/microblink/RecognizeDataCallback;

    new-instance v1, Lcom/microblink/RecognizerNotInitializedException;

    const-string v2, "Recognizer not initialized!"

    invoke-direct {v1, v2}, Lcom/microblink/RecognizerNotInitializedException;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/microblink/RecognizeDataCallback;->onRecognizerException(Lcom/microblink/RecognizerException;)V

    return-void

    :cond_1
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/RecognizerRunner;->bitmapResult:Lcom/microblink/BitmapResult;

    invoke-interface {v1}, Lcom/microblink/BitmapResult;->bitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/microblink/internal/BitmapUtils;->copy(Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {}, Lcom/microblink/Recognizer;->getInstance()Lcom/microblink/Recognizer;

    move-result-object v3

    invoke-virtual {v3}, Lcom/microblink/Recognizer;->receipt()Lcom/microblink/Receipt;

    move-result-object v3

    new-instance v4, Lcom/microblink/DebugResult;

    iget-object v5, p0, Lcom/microblink/RecognizerRunner;->bitmapResult:Lcom/microblink/BitmapResult;

    invoke-interface {v5}, Lcom/microblink/BitmapResult;->frameId()J

    move-result-wide v5

    invoke-direct {v4, v5, v6}, Lcom/microblink/DebugResult;-><init>(J)V

    iget-object v5, p0, Lcom/microblink/RecognizerRunner;->bitmapResult:Lcom/microblink/BitmapResult;

    invoke-interface {v5}, Lcom/microblink/BitmapResult;->edgeDetection()Lcom/microblink/EdgeDetection;

    move-result-object v5

    if-nez v5, :cond_7

    iget-object v5, p0, Lcom/microblink/RecognizerRunner;->options:Lcom/microblink/ScanOptions;

    invoke-virtual {v5}, Lcom/microblink/ScanOptions;->detectEdges()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-static {v1}, Lcom/microblink/internal/DetectionUtils;->findEdges(Landroid/graphics/Bitmap;)Lcom/microblink/EdgeResult;

    move-result-object v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/microblink/RecognizerRunner;->listener:Lcom/microblink/RecognizeDataCallback;

    new-instance v2, Lcom/microblink/AdaptiveThresholdException;

    const-string v3, "edge detection couldn\'t be performed on bitmap."

    invoke-direct {v2, v3}, Lcom/microblink/AdaptiveThresholdException;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v2}, Lcom/microblink/RecognizeDataCallback;->onRecognizerException(Lcom/microblink/RecognizerException;)V

    return-void

    :cond_2
    invoke-virtual {v1}, Lcom/microblink/EdgeResult;->edgeDetection()Lcom/microblink/EdgeDetection;

    move-result-object v5

    invoke-virtual {v3}, Lcom/microblink/Receipt;->foundTopEdge()Z

    move-result v6

    if-nez v6, :cond_3

    iget-boolean v6, v5, Lcom/microblink/EdgeDetection;->foundTopEdge:Z

    invoke-virtual {v3, v6}, Lcom/microblink/Receipt;->foundTopEdge(Z)Lcom/microblink/Receipt;

    :cond_3
    invoke-virtual {v3}, Lcom/microblink/Receipt;->foundBottomEdge()Z

    move-result v6

    if-nez v6, :cond_4

    iget-boolean v6, v5, Lcom/microblink/EdgeDetection;->foundBottomEdge:Z

    invoke-virtual {v3, v6}, Lcom/microblink/Receipt;->foundBottomEdge(Z)Lcom/microblink/Receipt;

    :cond_4
    invoke-static {}, Lcom/microblink/ReceiptSdk;->debug()Z

    move-result v6

    if-eqz v6, :cond_5

    iget-object v6, p0, Lcom/microblink/RecognizerRunner;->bitmapResult:Lcom/microblink/BitmapResult;

    instance-of v6, v6, Lcom/microblink/TakePictureResult;

    invoke-virtual {v4, v6}, Lcom/microblink/DebugResult;->captured(Z)V

    invoke-virtual {v4, v5}, Lcom/microblink/DebugResult;->edgeDetection(Lcom/microblink/EdgeDetection;)V

    invoke-virtual {v1}, Lcom/microblink/EdgeResult;->stats()Lcom/microblink/StatsResults;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/microblink/DebugResult;->edgeDetectionStats(Lcom/microblink/StatsResults;)V

    :cond_5
    invoke-static {}, Lcom/microblink/Recognizer;->getInstance()Lcom/microblink/Recognizer;

    move-result-object v6

    invoke-virtual {v6}, Lcom/microblink/Recognizer;->edgeDetection()Lcom/microblink/internal/EdgeDetectionProcessor;

    move-result-object v6

    if-eqz v6, :cond_6

    invoke-virtual {v6}, Lcom/microblink/internal/EdgeDetectionProcessor;->incrementFrameCount()V

    iget-object v7, p0, Lcom/microblink/RecognizerRunner;->listener:Lcom/microblink/RecognizeDataCallback;

    invoke-virtual {v6, v5}, Lcom/microblink/internal/EdgeDetectionProcessor;->process(Lcom/microblink/EdgeDetection;)Lcom/microblink/EdgeDetectionResult;

    move-result-object v5

    invoke-interface {v7, v5}, Lcom/microblink/RecognizeDataCallback;->onRecognizerResult(Lcom/microblink/RecognizerResult;)V

    :cond_6
    invoke-virtual {v1}, Lcom/microblink/EdgeResult;->resultBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    :cond_7
    if-nez v1, :cond_8

    iget-object v1, p0, Lcom/microblink/RecognizerRunner;->listener:Lcom/microblink/RecognizeDataCallback;

    new-instance v2, Lcom/microblink/RecognizerException;

    const-string v3, "bitmap cannot be null"

    invoke-direct {v2, v3}, Lcom/microblink/RecognizerException;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v2}, Lcom/microblink/RecognizeDataCallback;->onRecognizerException(Lcom/microblink/RecognizerException;)V

    return-void

    :cond_8
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    invoke-static {}, Lcom/microblink/ReceiptSdk;->onDeviceOcr()Z

    move-result v7

    if-eqz v7, :cond_9

    const/16 v7, 0x2bc

    if-le v5, v7, :cond_9

    const/high16 v7, 0x442f0000    # 700.0f

    int-to-float v5, v5

    div-float/2addr v7, v5

    mul-float v5, v5, v7

    float-to-int v5, v5

    int-to-float v6, v6

    mul-float v6, v6, v7

    float-to-int v6, v6

    invoke-static {v1, v5, v6, v0}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v5

    goto :goto_0

    :cond_9
    move-object v5, v1

    :goto_0
    iget v6, p0, Lcom/microblink/RecognizerRunner;->frameCount:I

    if-nez v6, :cond_a

    iget-object v6, p0, Lcom/microblink/RecognizerRunner;->options:Lcom/microblink/ScanOptions;

    invoke-virtual {v6}, Lcom/microblink/ScanOptions;->detectLogo()Z

    move-result v6

    if-eqz v6, :cond_a

    new-instance v6, Lcom/microblink/internal/logo/LogoRepository;

    iget-object v7, p0, Lcom/microblink/RecognizerRunner;->context:Landroid/content/Context;

    invoke-direct {v6, v7}, Lcom/microblink/internal/logo/LogoRepository;-><init>(Landroid/content/Context;)V

    invoke-virtual {v6, v1}, Lcom/microblink/internal/logo/LogoRepository;->logo(Landroid/graphics/Bitmap;)Lcom/microblink/StringType;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {v6, v1}, Lcom/microblink/internal/logo/LogoRepository;->friendlyName(Lcom/microblink/StringType;)Lcom/microblink/StringType;

    move-result-object v7

    invoke-virtual {v3, v7}, Lcom/microblink/Receipt;->retailerFromLogo(Lcom/microblink/StringType;)Lcom/microblink/Receipt;

    invoke-virtual {v6, v1}, Lcom/microblink/internal/logo/LogoRepository;->bannerId(Lcom/microblink/StringType;)I

    move-result v1

    invoke-virtual {v3, v1}, Lcom/microblink/Receipt;->detectedBannerId(I)Lcom/microblink/Receipt;

    :cond_a
    invoke-static {}, Lcom/microblink/StatsResults;->create()Lcom/microblink/StatsResults;

    move-result-object v1

    invoke-virtual {v1}, Lcom/microblink/StatsResults;->start()V

    iget-object v6, p0, Lcom/microblink/RecognizerRunner;->listener:Lcom/microblink/RecognizeDataCallback;

    const/4 v7, 0x4

    invoke-interface {v6, v7}, Lcom/microblink/RecognizeDataCallback;->onProcessStateChanged(I)V

    invoke-static {}, Lcom/microblink/ReceiptSdk;->debug()Z

    move-result v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v6, :cond_b

    :try_start_1
    invoke-static {}, Lcom/microblink/Recognizer;->getInstance()Lcom/microblink/Recognizer;

    move-result-object v6

    iget-object v7, p0, Lcom/microblink/RecognizerRunner;->context:Landroid/content/Context;

    iget-object v8, p0, Lcom/microblink/RecognizerRunner;->bitmapResult:Lcom/microblink/BitmapResult;

    invoke-interface {v8}, Lcom/microblink/BitmapResult;->frameId()J

    move-result-wide v8

    invoke-virtual {v6, v7, v8, v9, v5}, Lcom/microblink/Recognizer;->addDebugFrames(Landroid/content/Context;JLandroid/graphics/Bitmap;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v6

    :try_start_2
    const-string v7, "RecognizerRunner"

    invoke-virtual {v6}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v6

    new-array v8, v0, [Ljava/lang/Object;

    invoke-static {v7, v6, v8}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_b
    :goto_1
    iget-object v6, p0, Lcom/microblink/RecognizerRunner;->context:Landroid/content/Context;

    invoke-static {v6}, Lcom/microblink/internal/MerchantCsvManager;->getInstance(Landroid/content/Context;)Lcom/microblink/internal/MerchantCsvManager;

    move-result-object v6

    invoke-virtual {v6}, Lcom/microblink/internal/MerchantCsvManager;->csv()Ljava/util/ArrayList;

    move-result-object v6

    iget-object v7, p0, Lcom/microblink/RecognizerRunner;->country:Lcom/microblink/internal/country/Country;

    if-eqz v7, :cond_e

    sget-object v7, Lcom/microblink/RecognizerRunner$1;->$SwitchMap$com$microblink$internal$country$Country:[I

    iget-object v8, p0, Lcom/microblink/RecognizerRunner;->country:Lcom/microblink/internal/country/Country;

    invoke-virtual {v8}, Lcom/microblink/internal/country/Country;->ordinal()I

    move-result v8

    aget v7, v7, v8

    if-eq v7, v2, :cond_c

    goto :goto_2

    :cond_c
    iget-object v6, p0, Lcom/microblink/RecognizerRunner;->context:Landroid/content/Context;

    invoke-static {v6}, Lcom/microblink/internal/CountryCsvManager;->getInstance(Landroid/content/Context;)Lcom/microblink/internal/CountryCsvManager;

    move-result-object v6

    iget-object v7, p0, Lcom/microblink/RecognizerRunner;->country:Lcom/microblink/internal/country/Country;

    invoke-virtual {v6, v7}, Lcom/microblink/internal/CountryCsvManager;->contains(Lcom/microblink/internal/country/Country;)Z

    move-result v6

    if-nez v6, :cond_d

    iget-object v6, p0, Lcom/microblink/RecognizerRunner;->context:Landroid/content/Context;

    invoke-static {v6}, Lcom/microblink/internal/CountryCsvManager;->getInstance(Landroid/content/Context;)Lcom/microblink/internal/CountryCsvManager;

    move-result-object v6

    iget-object v7, p0, Lcom/microblink/RecognizerRunner;->country:Lcom/microblink/internal/country/Country;

    invoke-virtual {v6, v7}, Lcom/microblink/internal/CountryCsvManager;->parse(Lcom/microblink/internal/country/Country;)V

    :cond_d
    iget-object v6, p0, Lcom/microblink/RecognizerRunner;->context:Landroid/content/Context;

    invoke-static {v6}, Lcom/microblink/internal/CountryCsvManager;->getInstance(Landroid/content/Context;)Lcom/microblink/internal/CountryCsvManager;

    move-result-object v6

    iget-object v7, p0, Lcom/microblink/RecognizerRunner;->country:Lcom/microblink/internal/country/Country;

    invoke-virtual {v6, v7}, Lcom/microblink/internal/CountryCsvManager;->csv(Lcom/microblink/internal/country/Country;)Ljava/util/ArrayList;

    move-result-object v6

    :cond_e
    :goto_2
    iget-object v7, p0, Lcom/microblink/RecognizerRunner;->recognizer:Lcom/microblink/OcrRecognizer;

    new-instance v8, Lcom/microblink/RecognizerDataItem;

    invoke-direct {v8, v5}, Lcom/microblink/RecognizerDataItem;-><init>(Landroid/graphics/Bitmap;)V

    iget v5, p0, Lcom/microblink/RecognizerRunner;->frameCount:I

    invoke-virtual {v8, v5}, Lcom/microblink/RecognizerDataItem;->frameIndex(I)Lcom/microblink/RecognizerDataItem;

    move-result-object v5

    invoke-virtual {v3}, Lcom/microblink/Receipt;->receiptId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Lcom/microblink/RecognizerDataItem;->blinkReceiptId(Ljava/lang/String;)Lcom/microblink/RecognizerDataItem;

    move-result-object v5

    iget-object v8, p0, Lcom/microblink/RecognizerRunner;->options:Lcom/microblink/ScanOptions;

    invoke-virtual {v8}, Lcom/microblink/ScanOptions;->retailer()Lcom/microblink/Retailer;

    move-result-object v8

    invoke-virtual {v8}, Lcom/microblink/Retailer;->id()I

    move-result v8

    invoke-virtual {v5, v8}, Lcom/microblink/RecognizerDataItem;->retailerId(I)Lcom/microblink/RecognizerDataItem;

    move-result-object v5

    iget-object v8, p0, Lcom/microblink/RecognizerRunner;->options:Lcom/microblink/ScanOptions;

    invoke-virtual {v8}, Lcom/microblink/ScanOptions;->countryCode()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Lcom/microblink/RecognizerDataItem;->countryCode(Ljava/lang/String;)Lcom/microblink/RecognizerDataItem;

    move-result-object v5

    invoke-static {}, Lcom/microblink/ReceiptSdk;->ocrCorrections()Z

    move-result v8

    invoke-virtual {v5, v8}, Lcom/microblink/RecognizerDataItem;->ocrCorrections(Z)Lcom/microblink/RecognizerDataItem;

    move-result-object v5

    invoke-virtual {v5, v6}, Lcom/microblink/RecognizerDataItem;->csv(Ljava/util/ArrayList;)Lcom/microblink/RecognizerDataItem;

    move-result-object v5

    invoke-interface {v7, v5}, Lcom/microblink/OcrRecognizer;->perform(Lcom/microblink/RecognizerDataItem;)Lcom/microblink/OcrResult;

    move-result-object v5

    invoke-virtual {v1}, Lcom/microblink/StatsResults;->end()V

    iget-object v6, p0, Lcom/microblink/RecognizerRunner;->listener:Lcom/microblink/RecognizeDataCallback;

    const/4 v7, 0x5

    invoke-interface {v6, v7}, Lcom/microblink/RecognizeDataCallback;->onProcessStateChanged(I)V

    invoke-static {}, Lcom/microblink/ReceiptSdk;->debug()Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-virtual {v4, v1}, Lcom/microblink/DebugResult;->ocrStats(Lcom/microblink/StatsResults;)V

    iget-object v6, p0, Lcom/microblink/RecognizerRunner;->listener:Lcom/microblink/RecognizeDataCallback;

    invoke-interface {v6, v4}, Lcom/microblink/RecognizeDataCallback;->onRecognizerResult(Lcom/microblink/RecognizerResult;)V

    :cond_f
    const/4 v4, 0x2

    if-nez v5, :cond_10

    iget-object v1, p0, Lcom/microblink/RecognizerRunner;->listener:Lcom/microblink/RecognizeDataCallback;

    iget-object v2, p0, Lcom/microblink/RecognizerRunner;->bitmapResult:Lcom/microblink/BitmapResult;

    invoke-interface {v1, v2}, Lcom/microblink/RecognizeDataCallback;->onRecognizerResult(Lcom/microblink/RecognizerResult;)V

    iget-object v1, p0, Lcom/microblink/RecognizerRunner;->listener:Lcom/microblink/RecognizeDataCallback;

    invoke-interface {v1, v4}, Lcom/microblink/RecognizeDataCallback;->onProcessStateChanged(I)V

    return-void

    :cond_10
    iget-object v6, v5, Lcom/microblink/OcrResult;->rawResults:Ljava/lang/String;

    invoke-static {v6}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_11

    iget-object v6, p0, Lcom/microblink/RecognizerRunner;->listener:Lcom/microblink/RecognizeDataCallback;

    new-instance v7, Lcom/microblink/OcrRawResult;

    iget-object v8, v5, Lcom/microblink/OcrResult;->rawResults:Ljava/lang/String;

    invoke-direct {v7, v8}, Lcom/microblink/OcrRawResult;-><init>(Ljava/lang/String;)V

    invoke-interface {v6, v7}, Lcom/microblink/RecognizeDataCallback;->onRecognizerResult(Lcom/microblink/RecognizerResult;)V

    :cond_11
    iget-object v6, p0, Lcom/microblink/RecognizerRunner;->bitmapResult:Lcom/microblink/BitmapResult;

    instance-of v6, v6, Lcom/microblink/TakePictureResult;

    if-eqz v6, :cond_12

    invoke-virtual {v5}, Lcom/microblink/OcrResult;->hasProducts()Z

    move-result v6

    if-eqz v6, :cond_12

    iget-object v6, p0, Lcom/microblink/RecognizerRunner;->bitmapResult:Lcom/microblink/BitmapResult;

    invoke-interface {v6}, Lcom/microblink/BitmapResult;->blurScore()I

    move-result v6

    int-to-double v6, v6

    const-wide v8, 0x3feccccccccccccdL    # 0.9

    mul-double v6, v6, v8

    double-to-int v6, v6

    iget-object v7, p0, Lcom/microblink/RecognizerRunner;->listener:Lcom/microblink/RecognizeDataCallback;

    invoke-interface {v7, v6}, Lcom/microblink/RecognizeDataCallback;->onBlurScoreChange(I)V

    :cond_12
    iput-object v1, v5, Lcom/microblink/OcrResult;->stats:Lcom/microblink/StatsResults;

    invoke-virtual {v5}, Lcom/microblink/OcrResult;->hasProducts()Z

    move-result v1

    if-eqz v1, :cond_13

    invoke-static {}, Lcom/microblink/Recognizer;->getInstance()Lcom/microblink/Recognizer;

    move-result-object v1

    invoke-virtual {v1}, Lcom/microblink/Recognizer;->productDetector()Lcom/microblink/ProductDetector;

    move-result-object v1

    if-eqz v1, :cond_13

    iget-object v6, v5, Lcom/microblink/OcrResult;->products:[Lcom/microblink/internal/OcrProduct;

    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-virtual {v3}, Lcom/microblink/Receipt;->detectedBannerId()I

    move-result v7

    invoke-virtual {v1, v6, v7}, Lcom/microblink/ProductDetector;->recognizeProducts(Ljava/util/List;I)V

    :cond_13
    iget-object v1, p0, Lcom/microblink/RecognizerRunner;->options:Lcom/microblink/ScanOptions;

    invoke-virtual {v1}, Lcom/microblink/ScanOptions;->searchTargets()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v1

    if-nez v1, :cond_14

    new-instance v1, Lcom/microblink/internal/TargetMatchesMapper;

    iget-object v6, p0, Lcom/microblink/RecognizerRunner;->options:Lcom/microblink/ScanOptions;

    invoke-virtual {v6}, Lcom/microblink/ScanOptions;->searchTargets()Ljava/util/List;

    move-result-object v6

    invoke-direct {v1, v6}, Lcom/microblink/internal/TargetMatchesMapper;-><init>(Ljava/util/List;)V

    invoke-virtual {v1, v5}, Lcom/microblink/internal/TargetMatchesMapper;->transform(Lcom/microblink/OcrResult;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v6

    if-nez v6, :cond_14

    iget-object v6, p0, Lcom/microblink/RecognizerRunner;->listener:Lcom/microblink/RecognizeDataCallback;

    invoke-static {v1}, Lcom/microblink/SearchTargetResult;->create(Ljava/util/List;)Lcom/microblink/SearchTargetResult;

    move-result-object v1

    invoke-interface {v6, v1}, Lcom/microblink/RecognizeDataCallback;->onRecognizerResult(Lcom/microblink/RecognizerResult;)V

    :cond_14
    invoke-static {}, Lcom/microblink/Recognizer;->getInstance()Lcom/microblink/Recognizer;

    move-result-object v1

    invoke-virtual {v1}, Lcom/microblink/Recognizer;->merchantDetector()Lcom/microblink/internal/merchant/MerchantDetector;

    move-result-object v1

    if-eqz v1, :cond_1a

    iget-object v6, p0, Lcom/microblink/RecognizerRunner;->recognizer:Lcom/microblink/OcrRecognizer;

    instance-of v6, v6, Lcom/microblink/LinuxOcrRecognizer;

    if-eqz v6, :cond_15

    iget-object v6, v5, Lcom/microblink/OcrResult;->merchantMatchName:Ljava/lang/String;

    iget-object v7, v5, Lcom/microblink/OcrResult;->merchantSource:Ljava/lang/String;

    iget-object v8, p0, Lcom/microblink/RecognizerRunner;->options:Lcom/microblink/ScanOptions;

    invoke-virtual {v8}, Lcom/microblink/ScanOptions;->countryCode()Ljava/lang/String;

    move-result-object v8

    iget-object v9, v5, Lcom/microblink/OcrResult;->street:Ljava/lang/String;

    invoke-virtual {v1, v6, v7, v8, v9}, Lcom/microblink/internal/merchant/MerchantDetector;->detectMerchant(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_15
    iget-object v6, p0, Lcom/microblink/RecognizerRunner;->context:Landroid/content/Context;

    invoke-static {v6}, Lcom/microblink/internal/Validate;->hasInternetPermissions(Landroid/content/Context;)Z

    move-result v6

    if-eqz v6, :cond_1a

    iget-object v6, v5, Lcom/microblink/OcrResult;->merchantCandidates:Ljava/lang/String;

    invoke-static {v6}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_16

    iget-object v7, v5, Lcom/microblink/OcrResult;->merchantCandidates:Ljava/lang/String;

    invoke-virtual {v3}, Lcom/microblink/Receipt;->storeCity()Lcom/microblink/StringType;

    move-result-object v8

    invoke-virtual {v3}, Lcom/microblink/Receipt;->storeZip()Lcom/microblink/StringType;

    move-result-object v9

    invoke-virtual {v3}, Lcom/microblink/Receipt;->storeState()Lcom/microblink/StringType;

    move-result-object v10

    iget-object v6, p0, Lcom/microblink/RecognizerRunner;->options:Lcom/microblink/ScanOptions;

    invoke-virtual {v6}, Lcom/microblink/ScanOptions;->countryCode()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v3}, Lcom/microblink/Receipt;->rawResults()Ljava/util/ArrayList;

    move-result-object v12

    move-object v6, v1

    invoke-virtual/range {v6 .. v12}, Lcom/microblink/internal/merchant/MerchantDetector;->storeMerchantCandidate(Ljava/lang/String;Lcom/microblink/StringType;Lcom/microblink/StringType;Lcom/microblink/StringType;Ljava/lang/String;Ljava/util/List;)V

    :cond_16
    invoke-virtual {v1}, Lcom/microblink/internal/merchant/MerchantDetector;->hasFoundMerchant()Z

    move-result v6

    if-nez v6, :cond_1a

    iget-object v6, v5, Lcom/microblink/OcrResult;->phones:[Lcom/microblink/internal/OcrPhone;

    if-eqz v6, :cond_17

    new-instance v6, Lcom/microblink/internal/phone/PhoneMatchMapper;

    invoke-direct {v6}, Lcom/microblink/internal/phone/PhoneMatchMapper;-><init>()V

    iget-object v7, v5, Lcom/microblink/OcrResult;->phones:[Lcom/microblink/internal/OcrPhone;

    invoke-virtual {v6, v7}, Lcom/microblink/internal/phone/PhoneMatchMapper;->transform([Lcom/microblink/internal/OcrPhone;)Lcom/microblink/internal/phone/PhoneMatch;

    move-result-object v6

    if-eqz v6, :cond_17

    invoke-virtual {v1}, Lcom/microblink/internal/merchant/MerchantDetector;->phoneCoordinator()Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    move-result-object v7

    invoke-virtual {v7, v6}, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->getStatusForSearch(Ljava/lang/Object;)Lcom/microblink/internal/services/LookupStatus;

    move-result-object v8

    sget-object v9, Lcom/microblink/internal/services/LookupStatus;->UNKNOWN:Lcom/microblink/internal/services/LookupStatus;

    if-ne v8, v9, :cond_17

    invoke-virtual {v7}, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->hasResult()Z

    move-result v7

    if-nez v7, :cond_17

    iget-object v7, p0, Lcom/microblink/RecognizerRunner;->options:Lcom/microblink/ScanOptions;

    invoke-virtual {v3}, Lcom/microblink/Receipt;->rawResults()Ljava/util/ArrayList;

    move-result-object v8

    invoke-virtual {v1, v7, v6, v8, v2}, Lcom/microblink/internal/merchant/MerchantDetector;->detectMerchant(Lcom/microblink/ScanOptions;Lcom/microblink/internal/phone/PhoneMatch;Ljava/util/ArrayList;Z)V

    :cond_17
    new-instance v6, Lcom/microblink/internal/merchant/AddressMatchMapper;

    invoke-direct {v6}, Lcom/microblink/internal/merchant/AddressMatchMapper;-><init>()V

    invoke-virtual {v6, v5}, Lcom/microblink/internal/merchant/AddressMatchMapper;->transform(Lcom/microblink/OcrResult;)Lcom/microblink/internal/merchant/AddressMatch;

    move-result-object v6

    iget-object v7, p0, Lcom/microblink/RecognizerRunner;->options:Lcom/microblink/ScanOptions;

    invoke-virtual {v7}, Lcom/microblink/ScanOptions;->merchantConfiguration()Lcom/microblink/MerchantConfiguration;

    move-result-object v7

    if-eqz v7, :cond_18

    invoke-virtual {v7}, Lcom/microblink/MerchantConfiguration;->googleAddressLookup()Z

    move-result v7

    if-eqz v7, :cond_18

    if-eqz v6, :cond_18

    invoke-virtual {v1}, Lcom/microblink/internal/merchant/MerchantDetector;->addressCoordinator()Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    move-result-object v7

    invoke-virtual {v7, v6}, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->getStatusForSearch(Ljava/lang/Object;)Lcom/microblink/internal/services/LookupStatus;

    move-result-object v8

    sget-object v9, Lcom/microblink/internal/services/LookupStatus;->UNKNOWN:Lcom/microblink/internal/services/LookupStatus;

    if-ne v8, v9, :cond_18

    invoke-virtual {v7}, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->hasResult()Z

    move-result v7

    if-nez v7, :cond_18

    iget-object v7, p0, Lcom/microblink/RecognizerRunner;->options:Lcom/microblink/ScanOptions;

    invoke-virtual {v3}, Lcom/microblink/Receipt;->rawResults()Ljava/util/ArrayList;

    move-result-object v8

    invoke-virtual {v1, v7, v6, v8, v2}, Lcom/microblink/internal/merchant/MerchantDetector;->detectMerchant(Lcom/microblink/ScanOptions;Lcom/microblink/internal/merchant/AddressMatch;Ljava/util/List;Z)V

    :cond_18
    iget-object v6, v5, Lcom/microblink/OcrResult;->taxId:Ljava/lang/String;

    invoke-static {v6}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_19

    new-instance v6, Lcom/microblink/internal/merchant/TaxMatch;

    iget-object v7, v5, Lcom/microblink/OcrResult;->taxId:Ljava/lang/String;

    invoke-direct {v6, v7}, Lcom/microblink/internal/merchant/TaxMatch;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :cond_19
    const/4 v6, 0x0

    :goto_3
    if-eqz v6, :cond_1a

    sget-object v7, Lcom/microblink/internal/country/Country;->AUSTRALIA:Lcom/microblink/internal/country/Country;

    invoke-virtual {v7}, Lcom/microblink/internal/country/Country;->isoCode()Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lcom/microblink/RecognizerRunner;->options:Lcom/microblink/ScanOptions;

    invoke-virtual {v8}, Lcom/microblink/ScanOptions;->countryCode()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1a

    invoke-virtual {v1}, Lcom/microblink/internal/merchant/MerchantDetector;->taxResultCoordinator()Lcom/microblink/internal/merchant/MerchantResultCoordinators;

    move-result-object v7

    invoke-virtual {v7, v6}, Lcom/microblink/internal/merchant/MerchantResultCoordinators;->getStatusForSearch(Ljava/lang/Object;)Lcom/microblink/internal/services/LookupStatus;

    move-result-object v7

    sget-object v8, Lcom/microblink/internal/services/LookupStatus;->UNKNOWN:Lcom/microblink/internal/services/LookupStatus;

    if-ne v7, v8, :cond_1a

    iget-object v7, p0, Lcom/microblink/RecognizerRunner;->options:Lcom/microblink/ScanOptions;

    invoke-virtual {v3}, Lcom/microblink/Receipt;->rawResults()Ljava/util/ArrayList;

    move-result-object v8

    invoke-virtual {v1, v7, v6, v8, v2}, Lcom/microblink/internal/merchant/MerchantDetector;->detectMerchant(Lcom/microblink/ScanOptions;Lcom/microblink/internal/merchant/TaxMatch;Ljava/util/List;Z)V

    :cond_1a
    new-instance v1, Lcom/microblink/OcrResultsTransformer;

    invoke-direct {v1, v3}, Lcom/microblink/OcrResultsTransformer;-><init>(Lcom/microblink/Receipt;)V

    invoke-virtual {v1, v5}, Lcom/microblink/OcrResultsTransformer;->transform(Lcom/microblink/OcrResult;)V

    invoke-static {}, Lcom/microblink/ReceiptSdk;->debug()Z

    move-result v1

    if-eqz v1, :cond_1b

    iget-object v1, p0, Lcom/microblink/RecognizerRunner;->listener:Lcom/microblink/RecognizeDataCallback;

    invoke-interface {v1, v5}, Lcom/microblink/RecognizeDataCallback;->onRecognizerResult(Lcom/microblink/RecognizerResult;)V

    :cond_1b
    iget-object v1, p0, Lcom/microblink/RecognizerRunner;->listener:Lcom/microblink/RecognizeDataCallback;

    iget-object v2, p0, Lcom/microblink/RecognizerRunner;->bitmapResult:Lcom/microblink/BitmapResult;

    invoke-interface {v1, v2}, Lcom/microblink/RecognizeDataCallback;->onRecognizerResult(Lcom/microblink/RecognizerResult;)V

    iget-object v1, p0, Lcom/microblink/RecognizerRunner;->listener:Lcom/microblink/RecognizeDataCallback;

    invoke-interface {v1, v4}, Lcom/microblink/RecognizeDataCallback;->onProcessStateChanged(I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    return-void

    :catch_1
    move-exception v1

    const-string v2, "RecognizerRunner"

    invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v2, v3, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/RecognizerRunner;->listener:Lcom/microblink/RecognizeDataCallback;

    new-instance v2, Lcom/microblink/RecognizerException;

    invoke-direct {v2, v1}, Lcom/microblink/RecognizerException;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {v0, v2}, Lcom/microblink/RecognizeDataCallback;->onRecognizerException(Lcom/microblink/RecognizerException;)V

    return-void
.end method
