.class Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$BarcodeTrackerFactory;
.super Ljava/lang/Object;
.source "ScanningControllerV2.java"

# interfaces
.implements Lcom/google/android/gms/vision/MultiProcessor$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "BarcodeTrackerFactory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/vision/MultiProcessor$Factory<",
        "Lcom/google/android/gms/vision/barcode/Barcode;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;


# direct methods
.method private constructor <init>(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;)V
    .locals 0

    .line 253
    iput-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$BarcodeTrackerFactory;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$1;)V
    .locals 0

    .line 253
    invoke-direct {p0, p1}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$BarcodeTrackerFactory;-><init>(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;)V

    return-void
.end method


# virtual methods
.method public create(Lcom/google/android/gms/vision/barcode/Barcode;)Lcom/google/android/gms/vision/Tracker;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/barcode/Barcode;",
            ")",
            "Lcom/google/android/gms/vision/Tracker<",
            "Lcom/google/android/gms/vision/barcode/Barcode;",
            ">;"
        }
    .end annotation

    .line 256
    new-instance p1, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$MyBarcodeTracker;

    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$BarcodeTrackerFactory;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$MyBarcodeTracker;-><init>(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$1;)V

    return-object p1
.end method

.method public bridge synthetic create(Ljava/lang/Object;)Lcom/google/android/gms/vision/Tracker;
    .locals 0

    .line 253
    check-cast p1, Lcom/google/android/gms/vision/barcode/Barcode;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$BarcodeTrackerFactory;->create(Lcom/google/android/gms/vision/barcode/Barcode;)Lcom/google/android/gms/vision/Tracker;

    move-result-object p1

    return-object p1
.end method
