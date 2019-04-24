.class Lcom/shopkick/app/receipts/CameraControllerV1$2$1;
.super Ljava/lang/Object;
.source "CameraControllerV1.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/receipts/CameraControllerV1$2;->onPictureTaken([BLandroid/hardware/Camera;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/shopkick/app/receipts/CameraControllerV1$2;

.field final synthetic val$ocrPreviewImage:Landroid/graphics/Bitmap;


# direct methods
.method constructor <init>(Lcom/shopkick/app/receipts/CameraControllerV1$2;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 340
    iput-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV1$2$1;->this$1:Lcom/shopkick/app/receipts/CameraControllerV1$2;

    iput-object p2, p0, Lcom/shopkick/app/receipts/CameraControllerV1$2$1;->val$ocrPreviewImage:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 343
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV1$2$1;->this$1:Lcom/shopkick/app/receipts/CameraControllerV1$2;

    iget-object v0, v0, Lcom/shopkick/app/receipts/CameraControllerV1$2;->this$0:Lcom/shopkick/app/receipts/CameraControllerV1;

    iget-object v1, p0, Lcom/shopkick/app/receipts/CameraControllerV1$2$1;->val$ocrPreviewImage:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/receipts/CameraControllerV1;->analyzeReceipt(Landroid/graphics/Bitmap;)V

    return-void
.end method
