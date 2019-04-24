.class Lcom/scandit/base/camera/profiles/Integra2Profile;
.super Lcom/scandit/base/camera/profiles/DeviceProfile;
.source "Integra2Profile.java"


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public setupCameraParameters(Landroid/hardware/Camera$Parameters;F)V
    .locals 2

    .line 22
    invoke-virtual {p0}, Lcom/scandit/base/camera/profiles/Integra2Profile;->getMinExposureTargetBias()F

    move-result v0

    invoke-static {v0, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    .line 21
    invoke-static {p1, p2}, Lcom/scandit/base/camera/profiles/DeviceProfile;->setExposureTargetBias(Landroid/hardware/Camera$Parameters;F)V

    .line 23
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x7530

    const/16 v1, 0x17

    if-lt p2, v1, :cond_0

    .line 24
    invoke-static {p1, v0}, Lcom/scandit/base/camera/profiles/DeviceProfile;->setPreviewFrameRateWithBiggestSpread(Landroid/hardware/Camera$Parameters;I)V

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 27
    invoke-static {p1, v0, p2}, Lcom/scandit/base/camera/profiles/DeviceProfile;->setHighestAvailablePreviewFrameRate(Landroid/hardware/Camera$Parameters;IZ)V

    :goto_0
    return-void
.end method
