.class Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$MyBarcodeTracker$1;
.super Ljava/lang/Object;
.source "ScanningControllerV2.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$MyBarcodeTracker;->onUpdate(Lcom/google/android/gms/vision/Detector$Detections;Lcom/google/android/gms/vision/barcode/Barcode;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$MyBarcodeTracker;

.field final synthetic val$barcodeToSend:Ljava/lang/String;

.field final synthetic val$compressedData:[B


# direct methods
.method constructor <init>(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$MyBarcodeTracker;Ljava/lang/String;[B)V
    .locals 0

    .line 282
    iput-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$MyBarcodeTracker$1;->this$1:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$MyBarcodeTracker;

    iput-object p2, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$MyBarcodeTracker$1;->val$barcodeToSend:Ljava/lang/String;

    iput-object p3, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$MyBarcodeTracker$1;->val$compressedData:[B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 285
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$MyBarcodeTracker$1;->this$1:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$MyBarcodeTracker;

    iget-object v0, v0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$MyBarcodeTracker;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    iget-object v0, v0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->scanBCListener:Lcom/shopkick/app/products/scanning/interfaces/ScanBCListener;

    iget-object v1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$MyBarcodeTracker$1;->val$barcodeToSend:Ljava/lang/String;

    iget-object v2, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$MyBarcodeTracker$1;->val$compressedData:[B

    invoke-interface {v0, v1, v2}, Lcom/shopkick/app/products/scanning/interfaces/ScanBCListener;->tryRequestValidateBC(Ljava/lang/String;[B)V

    return-void
.end method
