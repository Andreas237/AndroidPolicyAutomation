.class public Lcom/ibotta/android/util/pipeline/receipt/ReceiptImageToResizedBitmapPipe;
.super Ljava/lang/Object;
.source "ReceiptImageToResizedBitmapPipe.java"

# interfaces
.implements Lcom/ibotta/android/util/pipeline/Pipe;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/util/pipeline/Pipe<",
        "Ljava/io/File;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field private final bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

.field private final receiptProcessingMath:Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;

.field private final receiptSizeWidthPerc:D


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;Lcom/ibotta/android/util/BitmapUtil;Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/util/pipeline/receipt/ReceiptImageToResizedBitmapPipe;->receiptProcessingMath:Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;

    .line 27
    iput-object p2, p0, Lcom/ibotta/android/util/pipeline/receipt/ReceiptImageToResizedBitmapPipe;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    .line 28
    invoke-virtual {p3}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->getReceiptSizeWidthPerc()D

    move-result-wide p1

    iput-wide p1, p0, Lcom/ibotta/android/util/pipeline/receipt/ReceiptImageToResizedBitmapPipe;->receiptSizeWidthPerc:D

    return-void
.end method

.method private buildOptions(I)Landroid/graphics/BitmapFactory$Options;
    .locals 2

    .line 39
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v1, 0x0

    .line 40
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    const/4 v1, 0x1

    .line 41
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inPreferQualityOverSpeed:Z

    .line 44
    sget-object v1, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    iput-object v1, v0, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 45
    iput p1, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    return-object v0
.end method


# virtual methods
.method public process(Ljava/io/File;)Landroid/graphics/Bitmap;
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/util/pipeline/PipeProcessingException;
        }
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/util/pipeline/receipt/ReceiptImageToResizedBitmapPipe;->receiptProcessingMath:Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;

    iget-wide v1, p0, Lcom/ibotta/android/util/pipeline/receipt/ReceiptImageToResizedBitmapPipe;->receiptSizeWidthPerc:D

    invoke-virtual {v0, p1, v1, v2}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;->calculateInSampleSize(Ljava/io/File;D)I

    move-result v0

    .line 35
    iget-object v1, p0, Lcom/ibotta/android/util/pipeline/receipt/ReceiptImageToResizedBitmapPipe;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptImageToResizedBitmapPipe;->buildOptions(I)Landroid/graphics/BitmapFactory$Options;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Lcom/ibotta/android/util/BitmapUtil;->decodeFileToBitmap(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic process(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/util/pipeline/PipeProcessingException;
        }
    .end annotation

    .line 17
    check-cast p1, Ljava/io/File;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptImageToResizedBitmapPipe;->process(Ljava/io/File;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method
