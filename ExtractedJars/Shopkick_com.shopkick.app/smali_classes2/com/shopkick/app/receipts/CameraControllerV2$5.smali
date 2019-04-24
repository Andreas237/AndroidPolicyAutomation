.class Lcom/shopkick/app/receipts/CameraControllerV2$5;
.super Ljava/lang/Object;
.source "CameraControllerV2.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/receipts/CameraControllerV2;->updateUiThread(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

.field final synthetic val$state:I


# direct methods
.method constructor <init>(Lcom/shopkick/app/receipts/CameraControllerV2;I)V
    .locals 0

    .line 962
    iput-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$5;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    iput p2, p0, Lcom/shopkick/app/receipts/CameraControllerV2$5;->val$state:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 965
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2$5;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    iget v1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$5;->val$state:I

    invoke-static {v0, v1}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$100(Lcom/shopkick/app/receipts/CameraControllerV2;I)V

    .line 966
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2$5;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {v0}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$1300(Lcom/shopkick/app/receipts/CameraControllerV2;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 967
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2$5;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    iget-object v0, v0, Lcom/shopkick/app/receipts/CameraControllerV2;->receiptScanScreenFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    iget-object v1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$5;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {v1}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$1300(Lcom/shopkick/app/receipts/CameraControllerV2;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->setTempAlignHerePreviewBitmap(Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method
