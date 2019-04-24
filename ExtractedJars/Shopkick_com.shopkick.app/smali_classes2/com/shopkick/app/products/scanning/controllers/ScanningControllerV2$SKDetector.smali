.class Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;
.super Lcom/google/android/gms/vision/Detector;
.source "ScanningControllerV2.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "SKDetector"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/vision/Detector<",
        "Lcom/google/android/gms/vision/barcode/Barcode;",
        ">;"
    }
.end annotation


# instance fields
.field private detector:Lcom/google/android/gms/vision/barcode/BarcodeDetector;

.field final synthetic this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;Lcom/google/android/gms/vision/barcode/BarcodeDetector;)V
    .locals 0

    .line 296
    iput-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    invoke-direct {p0}, Lcom/google/android/gms/vision/Detector;-><init>()V

    .line 297
    iput-object p2, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;->detector:Lcom/google/android/gms/vision/barcode/BarcodeDetector;

    return-void
.end method


# virtual methods
.method public detect(Lcom/google/android/gms/vision/Frame;)Landroid/util/SparseArray;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/Frame;",
            ")",
            "Landroid/util/SparseArray<",
            "Lcom/google/android/gms/vision/barcode/Barcode;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 303
    invoke-virtual {p1}, Lcom/google/android/gms/vision/Frame;->getGrayscaleImageData()Ljava/nio/ByteBuffer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 304
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    invoke-virtual {p1}, Lcom/google/android/gms/vision/Frame;->getGrayscaleImageData()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->lastUpdatedFrame:[B

    .line 305
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    invoke-virtual {p1}, Lcom/google/android/gms/vision/Frame;->getMetadata()Lcom/google/android/gms/vision/Frame$Metadata;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/vision/Frame$Metadata;->getWidth()I

    move-result v1

    iput v1, v0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->lastUpdatedFrameWidth:I

    .line 306
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    invoke-virtual {p1}, Lcom/google/android/gms/vision/Frame;->getMetadata()Lcom/google/android/gms/vision/Frame$Metadata;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/vision/Frame$Metadata;->getHeight()I

    move-result v1

    iput v1, v0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->lastUpdatedFrameHeight:I

    .line 308
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->bcLastFrameTime:J

    .line 312
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    invoke-virtual {v0}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->areWeDoingIR()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 313
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    iget-object v0, p1, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->lastUpdatedFrame:[B

    iget-object v1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    iget v1, v1, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->lastUpdatedFrameWidth:I

    iget-object v2, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    iget v2, v2, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->lastUpdatedFrameHeight:I

    invoke-virtual {p1, v0, v1, v2}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->processFrameIR([BII)V

    const/4 p1, 0x0

    return-object p1

    .line 316
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;->detector:Lcom/google/android/gms/vision/barcode/BarcodeDetector;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/vision/barcode/BarcodeDetector;->detect(Lcom/google/android/gms/vision/Frame;)Landroid/util/SparseArray;

    move-result-object p1

    return-object p1
.end method

.method public getLastDetectedFrame()[B
    .locals 3

    .line 335
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    iget-object v0, v0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->lastUpdatedFrame:[B

    if-eqz v0, :cond_0

    .line 336
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    iget-object v0, v0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->lastUpdatedFrame:[B

    iget-object v1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    iget v1, v1, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->lastUpdatedFrameWidth:I

    iget-object v2, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    iget v2, v2, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->lastUpdatedFrameHeight:I

    invoke-static {v0, v1, v2}, Lcom/shopkick/app/util/TileUtils;->compressImage([BII)[B

    move-result-object v0

    return-object v0

    .line 338
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->logScanImageProcessingError(I)V

    .line 341
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    iget-object v0, v0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->lastUpdatedFrame:[B

    return-object v0
.end method

.method public isOperational()Z
    .locals 1

    .line 327
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;->detector:Lcom/google/android/gms/vision/barcode/BarcodeDetector;

    invoke-virtual {v0}, Lcom/google/android/gms/vision/barcode/BarcodeDetector;->isOperational()Z

    move-result v0

    return v0
.end method

.method public release()V
    .locals 2

    .line 322
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;->detector:Lcom/google/android/gms/vision/barcode/BarcodeDetector;

    invoke-virtual {v0}, Lcom/google/android/gms/vision/barcode/BarcodeDetector;->release()V

    .line 323
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->lastUpdatedFrame:[B

    return-void
.end method

.method public setFocus(I)Z
    .locals 1

    .line 331
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;->detector:Lcom/google/android/gms/vision/barcode/BarcodeDetector;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/vision/barcode/BarcodeDetector;->setFocus(I)Z

    move-result p1

    return p1
.end method
