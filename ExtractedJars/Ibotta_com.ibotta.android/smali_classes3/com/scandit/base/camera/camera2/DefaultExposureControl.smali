.class Lcom/scandit/base/camera/camera2/DefaultExposureControl;
.super Ljava/lang/Object;
.source "DefaultExposureControl.java"

# interfaces
.implements Lcom/scandit/base/camera/camera2/ExposureControl;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCaptureRequestApplied(Landroid/hardware/camera2/CaptureRequest;J)V
    .locals 0

    return-void
.end method

.method public onImageAvailable(Lcom/scandit/base/camera/camera2/SbCamera2;JLjava/nio/ByteBuffer;IILandroid/hardware/camera2/TotalCaptureResult;)V
    .locals 0

    return-void
.end method

.method public setup(Lcom/scandit/base/camera/camera2/SbCamera2;Ljava/lang/Float;)V
    .locals 1

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    .line 25
    :goto_0
    new-instance v0, Lcom/scandit/base/camera/camera2/DefaultExposureControl$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/scandit/base/camera/camera2/DefaultExposureControl$1;-><init>(Lcom/scandit/base/camera/camera2/DefaultExposureControl;Lcom/scandit/base/camera/camera2/SbCamera2;F)V

    invoke-virtual {p1, v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->modifyCaptureRequestAsync(Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;)V

    return-void
.end method
