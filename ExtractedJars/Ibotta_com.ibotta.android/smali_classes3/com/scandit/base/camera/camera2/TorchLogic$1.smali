.class Lcom/scandit/base/camera/camera2/TorchLogic$1;
.super Ljava/lang/Object;
.source "TorchLogic.java"

# interfaces
.implements Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scandit/base/camera/camera2/TorchLogic;->run(Lcom/scandit/base/camera/camera2/SbCamera2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scandit/base/camera/camera2/TorchLogic;


# direct methods
.method constructor <init>(Lcom/scandit/base/camera/camera2/TorchLogic;)V
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/TorchLogic$1;->this$0:Lcom/scandit/base/camera/camera2/TorchLogic;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Landroid/hardware/camera2/CaptureRequest$Builder;)V
    .locals 2

    .line 22
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/TorchLogic$1;->this$0:Lcom/scandit/base/camera/camera2/TorchLogic;

    iget-boolean v0, v0, Lcom/scandit/base/camera/camera2/TorchLogic;->isTorch:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 23
    :goto_0
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    return-void
.end method
