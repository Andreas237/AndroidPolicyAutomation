.class Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;
.super Lcom/scandit/barcodepicker/BarcodePicker;
.source "ScanningControllerV1.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "SKBarcodePickerLayout"
.end annotation


# instance fields
.field private scanBarcodeControllerRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;Landroid/content/Context;Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;Lcom/scandit/barcodepicker/ScanSettings;)V
    .locals 0

    .line 224
    iput-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;

    .line 225
    invoke-direct {p0, p2, p4}, Lcom/scandit/barcodepicker/BarcodePicker;-><init>(Landroid/content/Context;Lcom/scandit/barcodepicker/ScanSettings;)V

    .line 226
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;->scanBarcodeControllerRef:Ljava/lang/ref/WeakReference;

    const/4 p1, 0x0

    .line 228
    invoke-virtual {p0, p1, p0}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;->startScanning(ZLjava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 233
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;->scanBarcodeControllerRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;

    if-eqz v0, :cond_0

    .line 235
    iget-object v1, v0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->mainHandler:Landroid/os/Handler;

    new-instance v2, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout$1;

    invoke-direct {v2, p0, v0}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout$1;-><init>(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
