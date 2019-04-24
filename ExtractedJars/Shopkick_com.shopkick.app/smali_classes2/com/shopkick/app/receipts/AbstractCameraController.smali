.class public abstract Lcom/shopkick/app/receipts/AbstractCameraController;
.super Ljava/lang/Object;
.source "AbstractCameraController.java"


# static fields
.field protected static final LOG_TAG:Ljava/lang/String;

.field protected static final OCR_THRESHOLD:F = 25.0f


# instance fields
.field protected final chainId:Ljava/lang/String;

.field protected clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field protected hasCleanedUp:Z

.field protected volatile isProcessingInitialImage:Z

.field protected volatile isProcessingReceipt:Z

.field protected jpegCompressionLevel:I

.field protected lastHeightCache:I

.field protected lastImageCache:Ljava/io/File;

.field protected lastWidthCache:I

.field private final locationId:Ljava/lang/String;

.field protected maxScanCount:I

.field protected receiptScanScreenFragment:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/receipts/ReceiptScanScreen;",
            ">;"
        }
    .end annotation
.end field

.field protected requestedImageSize:Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;

.field protected scanCount:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 27
    const-class v0, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/receipts/AbstractCameraController;->LOG_TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/app/receipts/ReceiptScanScreen;Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/receipts/ReceiptScanScreen;",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xf

    .line 29
    iput v0, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->maxScanCount:I

    const/4 v0, 0x0

    .line 30
    iput v0, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->scanCount:I

    const/16 v1, 0x3c

    .line 31
    iput v1, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->jpegCompressionLevel:I

    .line 32
    new-instance v1, Lcom/shopkick/app/receipts/AbstractCameraController$1;

    invoke-direct {v1, p0}, Lcom/shopkick/app/receipts/AbstractCameraController$1;-><init>(Lcom/shopkick/app/receipts/AbstractCameraController;)V

    iput-object v1, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->requestedImageSize:Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;

    const/4 v1, 0x0

    .line 38
    iput-object v1, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->lastImageCache:Ljava/io/File;

    .line 39
    iput v0, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->lastWidthCache:I

    .line 40
    iput v0, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->lastHeightCache:I

    .line 48
    iput-boolean v0, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->hasCleanedUp:Z

    .line 64
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    .line 66
    iget-object p1, p2, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object p1, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 69
    iget-object p1, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxReceiptScanPages:Ljava/lang/Integer;

    if-eqz p1, :cond_0

    .line 70
    iget-object p1, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxReceiptScanPages:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->maxScanCount:I

    :cond_0
    const-string p1, "chain_id"

    .line 74
    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->chainId:Ljava/lang/String;

    const-string p1, "location_id"

    .line 75
    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->locationId:Ljava/lang/String;

    .line 76
    iget-object p1, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->chainId:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 80
    iget-object p1, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->androidReceiptScanImageSize:Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;

    if-eqz p1, :cond_1

    .line 81
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;->width:Ljava/lang/Integer;

    if-eqz p2, :cond_1

    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;->height:Ljava/lang/Integer;

    if-eqz p2, :cond_1

    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;->width:Ljava/lang/Integer;

    .line 84
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-lez p2, :cond_1

    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;->height:Ljava/lang/Integer;

    .line 85
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-lez p2, :cond_1

    .line 86
    iput-object p1, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->requestedImageSize:Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;

    .line 90
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->androidReceiptScanJpegCompression:Ljava/lang/Double;

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->androidReceiptScanJpegCompression:Ljava/lang/Double;

    .line 91
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    const-wide/16 v1, 0x0

    cmpl-double p1, p1, v1

    if-lez p1, :cond_4

    iget-object p1, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->androidReceiptScanJpegCompression:Ljava/lang/Double;

    .line 92
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    cmpg-double p1, p1, v1

    if-gtz p1, :cond_4

    .line 93
    iget-object p1, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->androidReceiptScanJpegCompression:Ljava/lang/Double;

    .line 94
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    const-wide/high16 v1, 0x4059000000000000L    # 100.0

    mul-double/2addr p1, v1

    .line 93
    invoke-static {p1, p2}, Ljava/lang/Math;->floor(D)D

    move-result-wide p1

    double-to-int p1, p1

    iput p1, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->jpegCompressionLevel:I

    .line 95
    iget p1, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->jpegCompressionLevel:I

    if-gtz p1, :cond_2

    const/16 p1, 0x32

    :cond_2
    iput p1, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->jpegCompressionLevel:I

    .line 96
    iget p1, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->jpegCompressionLevel:I

    const/16 p2, 0x64

    if-le p1, p2, :cond_3

    move p1, p2

    :cond_3
    iput p1, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->jpegCompressionLevel:I

    .line 99
    :cond_4
    iput-boolean v0, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->isProcessingInitialImage:Z

    .line 100
    iput-boolean v0, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->isProcessingReceipt:Z

    return-void

    .line 77
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "ReceiptScanScreen.init() called with params that have no chain ID"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic access$000(Lcom/shopkick/app/receipts/AbstractCameraController;FFIF)D
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/shopkick/app/receipts/AbstractCameraController;->getOCRScore(FFIF)D

    move-result-wide p0

    return-wide p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/receipts/AbstractCameraController;Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;D)Ljava/lang/String;
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/receipts/AbstractCameraController;->getResultString(Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;D)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private cleanUp()V
    .locals 2

    .line 178
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/AbstractCameraController;->hasValidFragment()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 180
    invoke-static {}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->getInstance()Lcom/shopkick/app/receipts/ReceiptScanImageCache;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    .line 181
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->clearCache(Landroid/content/Context;)V

    :cond_0
    const/4 v0, 0x1

    .line 183
    iput-boolean v0, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->hasCleanedUp:Z

    return-void
.end method

.method private getOCRScore(FFIF)D
    .locals 4

    float-to-double v0, p1

    const-wide v2, -0x408bf4a6f2d3e0a8L    # -0.00489363466

    mul-double/2addr v0, v2

    const-wide v2, 0x3ff539e378e0bc6eL    # 1.32663295

    add-double/2addr v0, v2

    float-to-double p1, p2

    const-wide v2, -0x40744abae28a3b67L    # -0.0135293388

    mul-double/2addr p1, v2

    add-double/2addr v0, p1

    int-to-double p1, p3

    const-wide v2, -0x4127d903319a8c95L    # -5.75835586E-6

    mul-double/2addr p1, v2

    add-double/2addr v0, p1

    float-to-double p1, p4

    const-wide p3, -0x40540b9d8cd62d42L    # -0.0545988813

    mul-double/2addr p1, p3

    add-double/2addr v0, p1

    .line 313
    invoke-static {v0, v1}, Ljava/lang/Math;->exp(D)D

    move-result-wide p1

    invoke-static {v0, v1}, Ljava/lang/Math;->exp(D)D

    move-result-wide p3

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    add-double/2addr p3, v0

    div-double/2addr p1, p3

    const-wide/high16 p3, 0x4059000000000000L    # 100.0

    mul-double/2addr p1, p3

    return-wide p1
.end method

.method private getResultString(Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;D)Ljava/lang/String;
    .locals 3

    .line 236
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Brightness = "

    .line 237
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->getResultBrightness()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "Contrast = "

    .line 238
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->getResultContrast()F

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "TopologicScore = "

    .line 239
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->getResultTopologicScore()F

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "Element = "

    .line 240
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->getResultElementAmount()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "Time = "

    .line 241
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 243
    invoke-virtual {p1}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->getResultBrightness()F

    move-result p2

    invoke-virtual {p1}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->getResultContrast()F

    move-result p3

    .line 244
    invoke-virtual {p1}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->getResultElementAmount()I

    move-result v1

    invoke-virtual {p1}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->getResultTopologicScore()F

    move-result p1

    .line 242
    invoke-direct {p0, p2, p3, v1, p1}, Lcom/shopkick/app/receipts/AbstractCameraController;->getOCRScore(FFIF)D

    move-result-wide p1

    const-string p3, "Receipt Found: "

    .line 245
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide/high16 v1, 0x4039000000000000L    # 25.0

    cmpg-double p1, p1, v1

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 246
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private showConfirmCancelDialog()V
    .locals 4

    .line 145
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/AbstractCameraController;->hasValidFragment()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 146
    iget-object v0, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    .line 147
    new-instance v1, Landroid/app/AlertDialog$Builder;

    iget-object v2, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v2}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x7f1104e6

    .line 148
    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    const v2, 0x7f1104e3

    .line 149
    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    const v2, 0x7f1104e4

    .line 150
    new-instance v3, Lcom/shopkick/app/receipts/AbstractCameraController$2;

    invoke-direct {v3, p0}, Lcom/shopkick/app/receipts/AbstractCameraController$2;-><init>(Lcom/shopkick/app/receipts/AbstractCameraController;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    const v2, 0x7f1104e5

    .line 156
    new-instance v3, Lcom/shopkick/app/receipts/AbstractCameraController$3;

    invoke-direct {v3, p0, v0}, Lcom/shopkick/app/receipts/AbstractCameraController$3;-><init>(Lcom/shopkick/app/receipts/AbstractCameraController;Landroid/app/Activity;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 166
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    :cond_0
    return-void
.end method


# virtual methods
.method public abstract addSection()V
.end method

.method protected analyzeReceipt(Landroid/graphics/Bitmap;)V
    .locals 7

    const/4 v0, 0x1

    .line 250
    iput-boolean v0, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->isProcessingReceipt:Z

    .line 252
    new-instance v3, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;

    invoke-direct {v3}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;-><init>()V

    .line 253
    new-instance v6, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    .line 254
    invoke-virtual {v1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v6, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string v1, "OCR Result"

    .line 255
    invoke-virtual {v6, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    const/4 v1, 0x0

    .line 256
    invoke-virtual {v6, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    const-string v2, "Close"

    .line 257
    new-instance v4, Lcom/shopkick/app/receipts/AbstractCameraController$4;

    invoke-direct {v4, p0}, Lcom/shopkick/app/receipts/AbstractCameraController$4;-><init>(Lcom/shopkick/app/receipts/AbstractCameraController;)V

    invoke-virtual {v6, v2, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 263
    iget-object v2, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v2}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    new-instance v4, Lcom/shopkick/app/receipts/AbstractCameraController$5;

    invoke-direct {v4, p0}, Lcom/shopkick/app/receipts/AbstractCameraController$5;-><init>(Lcom/shopkick/app/receipts/AbstractCameraController;)V

    invoke-virtual {v2, v4}, Landroid/support/v4/app/FragmentActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 269
    invoke-virtual {v3, v1}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->resetOCRProcessor(I)V

    .line 270
    iget-object v1, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->ocrImageSize:Ljava/lang/Integer;

    const/16 v2, 0x3e8

    invoke-static {v1, v2}, Lcom/shopkick/app/util/TypeUtils;->toInteger(Ljava/lang/Object;I)I

    move-result v1

    invoke-virtual {v3, v1}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->setStdImgSize(I)V

    .line 271
    invoke-virtual {v3, v0}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->setOCRSkippingResize(Z)V

    const/4 v0, 0x4

    .line 272
    invoke-virtual {v3, v0}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->setMaxThreadNumber(I)V

    .line 273
    invoke-virtual {v3}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->updateConfig()V

    .line 274
    invoke-virtual {v3}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->debugPrintConfig()V

    .line 275
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/16 v2, 0x50

    .line 276
    invoke-virtual {v3, p1, v2}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->executeOCR(Landroid/graphics/Bitmap;I)I

    .line 277
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v0

    long-to-double v0, v4

    const-wide v4, 0x408f400000000000L    # 1000.0

    div-double v4, v0, v4

    .line 278
    invoke-virtual {v3}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->debugPrintResult()V

    .line 279
    iget-object p1, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {p1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    new-instance v0, Lcom/shopkick/app/receipts/AbstractCameraController$6;

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lcom/shopkick/app/receipts/AbstractCameraController$6;-><init>(Lcom/shopkick/app/receipts/AbstractCameraController;Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;DLandroid/app/AlertDialog$Builder;)V

    invoke-virtual {p1, v0}, Landroid/support/v4/app/FragmentActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected abstract canCancel()Z
.end method

.method public cancel()V
    .locals 1

    .line 136
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/AbstractCameraController;->canCancel()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 137
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/AbstractCameraController;->cleanUpAndExit()V

    goto :goto_0

    .line 139
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/receipts/AbstractCameraController;->showConfirmCancelDialog()V

    :goto_0
    return-void
.end method

.method public cancelFromBack()Z
    .locals 2

    .line 117
    iget-boolean v0, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->hasCleanedUp:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 121
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/AbstractCameraController;->canCancel()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 122
    invoke-direct {p0}, Lcom/shopkick/app/receipts/AbstractCameraController;->cleanUp()V

    return v1

    .line 126
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/app/receipts/AbstractCameraController;->showConfirmCancelDialog()V

    const/4 v0, 0x0

    return v0
.end method

.method protected cleanUpAndExit()V
    .locals 1

    .line 189
    invoke-direct {p0}, Lcom/shopkick/app/receipts/AbstractCameraController;->cleanUp()V

    .line 191
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/AbstractCameraController;->hasValidFragment()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 193
    iget-object v0, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->cleanUpAndExit()V

    :cond_0
    return-void
.end method

.method public freeResourcesForPause()V
    .locals 0

    return-void
.end method

.method public getChainId()Ljava/lang/String;
    .locals 1

    .line 219
    iget-object v0, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->chainId:Ljava/lang/String;

    return-object v0
.end method

.method public getLocationId()Ljava/lang/String;
    .locals 1

    .line 228
    iget-object v0, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->locationId:Ljava/lang/String;

    return-object v0
.end method

.method public getScanCount()I
    .locals 1

    .line 224
    iget v0, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->scanCount:I

    return v0
.end method

.method protected hasValidFragment()Z
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public abstract isCameraReady()Z
.end method

.method public isDoneProcessingAndAnalyzingCapture()Z
    .locals 1

    .line 104
    iget-boolean v0, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->isProcessingInitialImage:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/shopkick/app/receipts/AbstractCameraController;->isProcessingReceipt:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public performResumeActions()V
    .locals 0

    return-void
.end method

.method public abstract retake()V
.end method

.method public abstract takePhoto()V
.end method
