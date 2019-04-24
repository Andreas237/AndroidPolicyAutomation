.class Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$1;
.super Ljava/lang/Object;
.source "SbPostLollipopCamera.java"

# interfaces
.implements Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->disableImagePostProcessingFilters()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;


# direct methods
.method constructor <init>(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)V
    .locals 0

    .line 147
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$1;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Landroid/hardware/camera2/CaptureRequest$Builder;)V
    .locals 3

    .line 150
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->EDGE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 151
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->NOISE_REDUCTION_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 152
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 151
    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    return-void
.end method
