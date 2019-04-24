.class public Lcom/ibotta/android/util/pipeline/PipelineFactoryImpl;
.super Ljava/lang/Object;
.source "PipelineFactoryImpl.java"

# interfaces
.implements Lcom/ibotta/android/util/pipeline/PipelineFactory;


# instance fields
.field private final bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

.field private final compressFormat:Landroid/graphics/Bitmap$CompressFormat;

.field private final fileIO:Lcom/ibotta/android/util/FileIO;

.field private final quality:I

.field private final receiptProcessingMath:Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;

.field private final targetWidthInPx:F


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;Lcom/ibotta/android/util/FileIO;Lcom/ibotta/android/util/BitmapUtil;FLandroid/graphics/Bitmap$CompressFormat;I)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/ibotta/android/util/pipeline/PipelineFactoryImpl;->receiptProcessingMath:Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;

    .line 36
    iput-object p2, p0, Lcom/ibotta/android/util/pipeline/PipelineFactoryImpl;->fileIO:Lcom/ibotta/android/util/FileIO;

    .line 37
    iput-object p3, p0, Lcom/ibotta/android/util/pipeline/PipelineFactoryImpl;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    .line 38
    iput p4, p0, Lcom/ibotta/android/util/pipeline/PipelineFactoryImpl;->targetWidthInPx:F

    .line 39
    iput-object p5, p0, Lcom/ibotta/android/util/pipeline/PipelineFactoryImpl;->compressFormat:Landroid/graphics/Bitmap$CompressFormat;

    .line 40
    iput p6, p0, Lcom/ibotta/android/util/pipeline/PipelineFactoryImpl;->quality:I

    return-void
.end method


# virtual methods
.method public createProductImageResizePipeline(Ljava/io/File;I)Lcom/ibotta/android/util/pipeline/Pipeline;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "I)",
            "Lcom/ibotta/android/util/pipeline/Pipeline<",
            "Ljava/io/File;",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .line 65
    new-instance v0, Lcom/ibotta/android/util/pipeline/Pipeline;

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/ibotta/android/util/pipeline/Pipe;

    new-instance v2, Lcom/ibotta/android/util/pipeline/bitmap/FileToResizedBitmapPipe;

    iget-object v3, p0, Lcom/ibotta/android/util/pipeline/PipelineFactoryImpl;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    invoke-direct {v2, v3, p2}, Lcom/ibotta/android/util/pipeline/bitmap/FileToResizedBitmapPipe;-><init>(Lcom/ibotta/android/util/BitmapUtil;I)V

    const/4 p2, 0x0

    aput-object v2, v1, p2

    new-instance p2, Lcom/ibotta/android/util/pipeline/file/BitmapToFilePipe;

    iget-object v2, p0, Lcom/ibotta/android/util/pipeline/PipelineFactoryImpl;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v4, 0x1e

    invoke-direct {p2, v2, p1, v3, v4}, Lcom/ibotta/android/util/pipeline/file/BitmapToFilePipe;-><init>(Lcom/ibotta/android/util/BitmapUtil;Ljava/io/File;Landroid/graphics/Bitmap$CompressFormat;I)V

    const/4 p1, 0x1

    aput-object p2, v1, p1

    invoke-direct {v0, v1}, Lcom/ibotta/android/util/pipeline/Pipeline;-><init>([Lcom/ibotta/android/util/pipeline/Pipe;)V

    return-object v0
.end method

.method public createReceiptImagePipeline(Ljava/io/File;Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;)Lcom/ibotta/android/util/pipeline/Pipeline;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;",
            ")",
            "Lcom/ibotta/android/util/pipeline/Pipeline<",
            "Ljava/io/ByteArrayOutputStream;",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .line 47
    new-instance v0, Lcom/ibotta/android/util/pipeline/file/ByteArrayToFilePipe;

    iget-object v1, p0, Lcom/ibotta/android/util/pipeline/PipelineFactoryImpl;->fileIO:Lcom/ibotta/android/util/FileIO;

    invoke-direct {v0, v1, p1}, Lcom/ibotta/android/util/pipeline/file/ByteArrayToFilePipe;-><init>(Lcom/ibotta/android/util/FileIO;Ljava/io/File;)V

    .line 48
    new-instance v1, Lcom/ibotta/android/util/pipeline/receipt/ReceiptImageToResizedBitmapPipe;

    iget-object v2, p0, Lcom/ibotta/android/util/pipeline/PipelineFactoryImpl;->receiptProcessingMath:Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;

    iget-object v3, p0, Lcom/ibotta/android/util/pipeline/PipelineFactoryImpl;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    invoke-direct {v1, v2, v3, p2}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptImageToResizedBitmapPipe;-><init>(Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;Lcom/ibotta/android/util/BitmapUtil;Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;)V

    .line 50
    new-instance v2, Lcom/ibotta/android/util/pipeline/receipt/ReceiptBitmapToRotatedBitmapPipe;

    iget-object v3, p0, Lcom/ibotta/android/util/pipeline/PipelineFactoryImpl;->receiptProcessingMath:Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;

    iget-object v4, p0, Lcom/ibotta/android/util/pipeline/PipelineFactoryImpl;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    invoke-direct {v2, v3, v4, p2}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptBitmapToRotatedBitmapPipe;-><init>(Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;Lcom/ibotta/android/util/BitmapUtil;Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;)V

    .line 52
    new-instance p2, Lcom/ibotta/android/util/pipeline/bitmap/BitmapToResizedBitmapPipe;

    iget-object v3, p0, Lcom/ibotta/android/util/pipeline/PipelineFactoryImpl;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    iget v4, p0, Lcom/ibotta/android/util/pipeline/PipelineFactoryImpl;->targetWidthInPx:F

    invoke-direct {p2, v3, v4}, Lcom/ibotta/android/util/pipeline/bitmap/BitmapToResizedBitmapPipe;-><init>(Lcom/ibotta/android/util/BitmapUtil;F)V

    .line 53
    new-instance v3, Lcom/ibotta/android/util/pipeline/file/BitmapToFilePipe;

    iget-object v4, p0, Lcom/ibotta/android/util/pipeline/PipelineFactoryImpl;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    iget-object v5, p0, Lcom/ibotta/android/util/pipeline/PipelineFactoryImpl;->compressFormat:Landroid/graphics/Bitmap$CompressFormat;

    iget v6, p0, Lcom/ibotta/android/util/pipeline/PipelineFactoryImpl;->quality:I

    invoke-direct {v3, v4, p1, v5, v6}, Lcom/ibotta/android/util/pipeline/file/BitmapToFilePipe;-><init>(Lcom/ibotta/android/util/BitmapUtil;Ljava/io/File;Landroid/graphics/Bitmap$CompressFormat;I)V

    .line 55
    new-instance p1, Lcom/ibotta/android/util/pipeline/Pipeline;

    const/4 v4, 0x5

    new-array v4, v4, [Lcom/ibotta/android/util/pipeline/Pipe;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v2, v4, v0

    const/4 v0, 0x3

    aput-object p2, v4, v0

    const/4 p2, 0x4

    aput-object v3, v4, p2

    invoke-direct {p1, v4}, Lcom/ibotta/android/util/pipeline/Pipeline;-><init>([Lcom/ibotta/android/util/pipeline/Pipe;)V

    return-object p1
.end method
