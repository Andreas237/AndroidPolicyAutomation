.class Lcom/scandit/base/camera/SbPreLollipopCamera$2;
.super Ljava/lang/Object;
.source "SbPreLollipopCamera.java"

# interfaces
.implements Landroid/hardware/Camera$AutoFocusCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scandit/base/camera/SbPreLollipopCamera;->triggerAutoFocus()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scandit/base/camera/SbPreLollipopCamera;


# direct methods
.method constructor <init>(Lcom/scandit/base/camera/SbPreLollipopCamera;)V
    .locals 0

    .line 636
    iput-object p1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera$2;->this$0:Lcom/scandit/base/camera/SbPreLollipopCamera;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAutoFocus(ZLandroid/hardware/Camera;)V
    .locals 2

    .line 639
    iget-object p2, p0, Lcom/scandit/base/camera/SbPreLollipopCamera$2;->this$0:Lcom/scandit/base/camera/SbPreLollipopCamera;

    if-eqz p1, :cond_0

    sget-object p1, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->FOCUSED_LOCKED:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->NOT_FOCUSED_LOCKED:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    :goto_0
    invoke-static {p2, p1}, Lcom/scandit/base/camera/SbPreLollipopCamera;->access$402(Lcom/scandit/base/camera/SbPreLollipopCamera;Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;)Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    .line 643
    iget-object p1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera$2;->this$0:Lcom/scandit/base/camera/SbPreLollipopCamera;

    invoke-static {p1}, Lcom/scandit/base/camera/SbPreLollipopCamera;->access$900(Lcom/scandit/base/camera/SbPreLollipopCamera;)Lcom/scandit/base/camera/SbPreLollipopCamera$CameraHandler;

    move-result-object p1

    iget-object p2, p0, Lcom/scandit/base/camera/SbPreLollipopCamera$2;->this$0:Lcom/scandit/base/camera/SbPreLollipopCamera;

    invoke-static {p2}, Lcom/scandit/base/camera/SbPreLollipopCamera;->access$900(Lcom/scandit/base/camera/SbPreLollipopCamera;)Lcom/scandit/base/camera/SbPreLollipopCamera$CameraHandler;

    move-result-object p2

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/scandit/base/camera/SbPreLollipopCamera$2;->this$0:Lcom/scandit/base/camera/SbPreLollipopCamera;

    invoke-virtual {p2, v0, v1}, Lcom/scandit/base/camera/SbPreLollipopCamera$CameraHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/scandit/base/camera/SbPreLollipopCamera$CameraHandler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method
