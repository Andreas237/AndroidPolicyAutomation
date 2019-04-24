.class Lcom/scandit/base/camera/profiles/GalaxySxProfile;
.super Lcom/scandit/base/camera/profiles/DeviceProfile;
.source "GalaxySxProfile.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x1

    .line 21
    invoke-direct {p0, p1, v0}, Lcom/scandit/base/camera/profiles/DeviceProfile;-><init>(Landroid/content/Context;Z)V

    const/4 p1, 0x0

    .line 22
    iput-boolean p1, p0, Lcom/scandit/base/camera/profiles/GalaxySxProfile;->mCustomMeteringAndFocusAreaSupported:Z

    return-void
.end method


# virtual methods
.method public setupCameraParameters(Landroid/hardware/Camera$Parameters;F)V
    .locals 2

    const-string/jumbo v0, "slow_ae"

    const-string v1, "off"

    .line 28
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    const-string/jumbo v0, "sw-vdis"

    const-string v1, "off"

    .line 29
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "dynamic-range-control"

    const-string v1, "on"

    .line 33
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "phase-af"

    const-string v1, "on"

    .line 36
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    invoke-virtual {p0}, Lcom/scandit/base/camera/profiles/GalaxySxProfile;->getMinExposureTargetBias()F

    move-result v0

    invoke-static {v0, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    .line 37
    invoke-static {p1, p2}, Lcom/scandit/base/camera/profiles/GalaxySxProfile;->setExposureTargetBias(Landroid/hardware/Camera$Parameters;F)V

    const/16 p2, 0x7530

    const/4 v0, 0x1

    .line 39
    invoke-static {p1, p2, v0}, Lcom/scandit/base/camera/profiles/GalaxySxProfile;->setHighestAvailablePreviewFrameRate(Landroid/hardware/Camera$Parameters;IZ)V

    return-void
.end method
