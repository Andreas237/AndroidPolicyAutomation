.class Lcom/shopkick/app/receipts/AbstractCameraController$5;
.super Ljava/lang/Object;
.source "AbstractCameraController.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/receipts/AbstractCameraController;->analyzeReceipt(Landroid/graphics/Bitmap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/receipts/AbstractCameraController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/receipts/AbstractCameraController;)V
    .locals 0

    .line 263
    iput-object p1, p0, Lcom/shopkick/app/receipts/AbstractCameraController$5;->this$0:Lcom/shopkick/app/receipts/AbstractCameraController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 266
    iget-object v0, p0, Lcom/shopkick/app/receipts/AbstractCameraController$5;->this$0:Lcom/shopkick/app/receipts/AbstractCameraController;

    iget-object v0, v0, Lcom/shopkick/app/receipts/AbstractCameraController;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->updateUIFromState(I)V

    return-void
.end method
