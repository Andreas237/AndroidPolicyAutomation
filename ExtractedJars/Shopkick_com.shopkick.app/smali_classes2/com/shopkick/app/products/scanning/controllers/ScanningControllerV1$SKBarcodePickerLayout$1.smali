.class Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout$1;
.super Ljava/lang/Object;
.source "ScanningControllerV1.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;

.field final synthetic val$scanBarcodeController:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;


# direct methods
.method constructor <init>(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;)V
    .locals 0

    .line 235
    iput-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout$1;->this$1:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout;

    iput-object p2, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout$1;->val$scanBarcodeController:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 238
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout$1;->val$scanBarcodeController:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;

    iget-object v0, v0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->scanInitListener:Lcom/shopkick/app/products/scanning/interfaces/ScanInitListener;

    if-eqz v0, :cond_0

    .line 239
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1$SKBarcodePickerLayout$1;->val$scanBarcodeController:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;

    iget-object v0, v0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV1;->scanInitListener:Lcom/shopkick/app/products/scanning/interfaces/ScanInitListener;

    invoke-interface {v0}, Lcom/shopkick/app/products/scanning/interfaces/ScanInitListener;->tryInitializeCamera()V

    :cond_0
    return-void
.end method
