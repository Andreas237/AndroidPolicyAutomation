.class Lcom/shopkick/app/receipts/CameraControllerV2$3;
.super Ljava/lang/Object;
.source "CameraControllerV2.java"

# interfaces
.implements Landroid/view/TextureView$SurfaceTextureListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/receipts/CameraControllerV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private myHeight:I

.field private myWidth:I

.field final synthetic this$0:Lcom/shopkick/app/receipts/CameraControllerV2;


# direct methods
.method constructor <init>(Lcom/shopkick/app/receipts/CameraControllerV2;)V
    .locals 0

    .line 209
    iput-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$3;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    .line 216
    iput p2, p0, Lcom/shopkick/app/receipts/CameraControllerV2$3;->myWidth:I

    .line 217
    iput p3, p0, Lcom/shopkick/app/receipts/CameraControllerV2$3;->myHeight:I

    .line 218
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$3;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {p1, p2, p3}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$700(Lcom/shopkick/app/receipts/CameraControllerV2;II)V

    return-void
.end method

.method public onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 0

    .line 232
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$3;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {p1}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$400(Lcom/shopkick/app/receipts/CameraControllerV2;)Landroid/hardware/camera2/CameraDevice;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 233
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$3;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {p1}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$900(Lcom/shopkick/app/receipts/CameraControllerV2;)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    .line 223
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$3;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {p1}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$400(Lcom/shopkick/app/receipts/CameraControllerV2;)Landroid/hardware/camera2/CameraDevice;

    move-result-object p1

    if-nez p1, :cond_0

    .line 224
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$3;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {p1, p2, p3}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$700(Lcom/shopkick/app/receipts/CameraControllerV2;II)V

    goto :goto_0

    .line 226
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$3;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {p1, p2, p3}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$800(Lcom/shopkick/app/receipts/CameraControllerV2;II)V

    :goto_0
    return-void
.end method

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 2

    .line 240
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$3;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    invoke-static {p1}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$400(Lcom/shopkick/app/receipts/CameraControllerV2;)Landroid/hardware/camera2/CameraDevice;

    move-result-object p1

    if-nez p1, :cond_0

    .line 241
    iget-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$3;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    iget v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2$3;->myWidth:I

    iget v1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$3;->myHeight:I

    invoke-static {p1, v0, v1}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$700(Lcom/shopkick/app/receipts/CameraControllerV2;II)V

    :cond_0
    return-void
.end method
