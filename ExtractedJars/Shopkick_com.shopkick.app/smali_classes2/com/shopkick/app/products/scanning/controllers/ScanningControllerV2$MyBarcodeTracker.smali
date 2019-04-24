.class Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$MyBarcodeTracker;
.super Lcom/google/android/gms/vision/Tracker;
.source "ScanningControllerV2.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "MyBarcodeTracker"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/vision/Tracker<",
        "Lcom/google/android/gms/vision/barcode/Barcode;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;


# direct methods
.method private constructor <init>(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;)V
    .locals 0

    .line 260
    iput-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$MyBarcodeTracker;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    invoke-direct {p0}, Lcom/google/android/gms/vision/Tracker;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$1;)V
    .locals 0

    .line 260
    invoke-direct {p0, p1}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$MyBarcodeTracker;-><init>(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;)V

    return-void
.end method


# virtual methods
.method public onUpdate(Lcom/google/android/gms/vision/Detector$Detections;Lcom/google/android/gms/vision/barcode/Barcode;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/Detector$Detections<",
            "Lcom/google/android/gms/vision/barcode/Barcode;",
            ">;",
            "Lcom/google/android/gms/vision/barcode/Barcode;",
            ")V"
        }
    .end annotation

    .line 263
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$MyBarcodeTracker;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    invoke-static {p1}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->access$500(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;)Z

    move-result p1

    if-nez p1, :cond_4

    if-nez p2, :cond_0

    goto :goto_1

    .line 264
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$MyBarcodeTracker;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->access$502(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;Z)Z

    const-string p1, "ScanningControllerV2"

    .line 267
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "barcode detected: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p2, Lcom/google/android/gms/vision/barcode/Barcode;->displayValue:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 269
    iget-object p1, p2, Lcom/google/android/gms/vision/barcode/Barcode;->displayValue:Ljava/lang/String;

    .line 271
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$MyBarcodeTracker;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    iget-object p2, p2, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p2, p2, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->sendScanImage:Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_1

    const/4 p2, 0x0

    goto :goto_0

    .line 275
    :cond_1
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$MyBarcodeTracker;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    invoke-static {p2}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->access$600(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;)Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$SKDetector;->getLastDetectedFrame()[B

    move-result-object p2

    if-eqz p2, :cond_2

    .line 276
    array-length v0, p2

    if-nez v0, :cond_3

    .line 277
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$MyBarcodeTracker;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->logScanImageProcessingError(I)V

    .line 282
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$MyBarcodeTracker;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    iget-object v0, v0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->mainHandler:Landroid/os/Handler;

    new-instance v1, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$MyBarcodeTracker$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$MyBarcodeTracker$1;-><init>(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$MyBarcodeTracker;Ljava/lang/String;[B)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_4
    :goto_1
    return-void
.end method

.method public bridge synthetic onUpdate(Lcom/google/android/gms/vision/Detector$Detections;Ljava/lang/Object;)V
    .locals 0

    .line 260
    check-cast p2, Lcom/google/android/gms/vision/barcode/Barcode;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$MyBarcodeTracker;->onUpdate(Lcom/google/android/gms/vision/Detector$Detections;Lcom/google/android/gms/vision/barcode/Barcode;)V

    return-void
.end method
