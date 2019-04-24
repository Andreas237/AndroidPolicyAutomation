.class public Lcom/ibotta/android/util/pipeline/receipt/ReceiptBitmapToRotatedBitmapPipe;
.super Ljava/lang/Object;
.source "ReceiptBitmapToRotatedBitmapPipe.java"

# interfaces
.implements Lcom/ibotta/android/util/pipeline/Pipe;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/util/pipeline/Pipe<",
        "Landroid/graphics/Bitmap;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field private final bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

.field private final receiptCaptureDetails:Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;

.field private final receiptProcessingMath:Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;Lcom/ibotta/android/util/BitmapUtil;Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/util/pipeline/receipt/ReceiptBitmapToRotatedBitmapPipe;->receiptProcessingMath:Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;

    .line 28
    iput-object p2, p0, Lcom/ibotta/android/util/pipeline/receipt/ReceiptBitmapToRotatedBitmapPipe;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    .line 29
    iput-object p3, p0, Lcom/ibotta/android/util/pipeline/receipt/ReceiptBitmapToRotatedBitmapPipe;->receiptCaptureDetails:Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;

    return-void
.end method


# virtual methods
.method public process(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/util/pipeline/PipeProcessingException;
        }
    .end annotation

    const-string v0, "Performing crop and rotate."

    const/4 v1, 0x0

    .line 34
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/util/pipeline/receipt/ReceiptBitmapToRotatedBitmapPipe;->receiptProcessingMath:Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;

    iget-object v1, p0, Lcom/ibotta/android/util/pipeline/receipt/ReceiptBitmapToRotatedBitmapPipe;->receiptCaptureDetails:Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;

    .line 37
    invoke-virtual {v0, p1, v1}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;->scaleReceiptEdgePercentagesForBitmap(Landroid/graphics/Bitmap;Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;

    move-result-object v0

    .line 38
    iget-object v1, p0, Lcom/ibotta/android/util/pipeline/receipt/ReceiptBitmapToRotatedBitmapPipe;->receiptProcessingMath:Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;

    invoke-virtual {v1, p1, v0}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;->extractJustReceiptFromImage(Landroid/graphics/Bitmap;Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 40
    iget-object v1, p0, Lcom/ibotta/android/util/pipeline/receipt/ReceiptBitmapToRotatedBitmapPipe;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/util/BitmapUtil;->recycle(Landroid/graphics/Bitmap;)V

    return-object v0
.end method

.method public bridge synthetic process(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/util/pipeline/PipeProcessingException;
        }
    .end annotation

    .line 18
    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptBitmapToRotatedBitmapPipe;->process(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method
