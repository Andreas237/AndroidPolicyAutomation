.class Lcom/shopkick/app/receipts/CameraControllerV2$6$1;
.super Ljava/lang/Object;
.source "CameraControllerV2.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/receipts/CameraControllerV2$6;->onConfigured(Landroid/hardware/camera2/CameraCaptureSession;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/shopkick/app/receipts/CameraControllerV2$6;


# direct methods
.method constructor <init>(Lcom/shopkick/app/receipts/CameraControllerV2$6;)V
    .locals 0

    .line 1111
    iput-object p1, p0, Lcom/shopkick/app/receipts/CameraControllerV2$6$1;->this$1:Lcom/shopkick/app/receipts/CameraControllerV2$6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1114
    iget-object v0, p0, Lcom/shopkick/app/receipts/CameraControllerV2$6$1;->this$1:Lcom/shopkick/app/receipts/CameraControllerV2$6;

    iget-object v0, v0, Lcom/shopkick/app/receipts/CameraControllerV2$6;->this$0:Lcom/shopkick/app/receipts/CameraControllerV2;

    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_READY_TO_TAKE_FIRST_PHOTO:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    invoke-virtual {v1}, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->ordinal()I

    move-result v1

    invoke-static {v0, v1}, Lcom/shopkick/app/receipts/CameraControllerV2;->access$100(Lcom/shopkick/app/receipts/CameraControllerV2;I)V

    return-void
.end method
