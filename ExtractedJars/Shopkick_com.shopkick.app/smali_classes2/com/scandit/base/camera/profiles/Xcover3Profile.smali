.class public Lcom/scandit/base/camera/profiles/Xcover3Profile;
.super Lcom/scandit/base/camera/profiles/DeviceProfile;
.source "Xcover3Profile.java"


# direct methods
.method constructor <init>(Landroid/content/Context;I)V
    .locals 6

    int-to-float v5, p2

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x1

    move-object v0, p0

    move-object v1, p1

    .line 16
    invoke-direct/range {v0 .. v5}, Lcom/scandit/base/camera/profiles/DeviceProfile;-><init>(Landroid/content/Context;ZZZF)V

    const/4 p1, 0x0

    .line 19
    iput-boolean p1, p0, Lcom/scandit/base/camera/profiles/Xcover3Profile;->mCustomMeteringAndFocusAreaSupported:Z

    return-void
.end method


# virtual methods
.method public setupCameraParameters(Landroid/hardware/Camera$Parameters;F)V
    .locals 1

    const-string/jumbo p2, "slow_ae"

    const-string v0, "off"

    .line 25
    invoke-virtual {p1, p2, v0}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    const-string/jumbo p2, "sw-vdis"

    const-string v0, "off"

    .line 26
    invoke-virtual {p1, p2, v0}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "dynamic-range-control"

    const-string v0, "on"

    .line 27
    invoke-virtual {p1, p2, v0}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "phase-af"

    const-string v0, "on"

    .line 28
    invoke-virtual {p1, p2, v0}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    invoke-virtual {p0}, Lcom/scandit/base/camera/profiles/Xcover3Profile;->getMinExposureTargetBias()F

    move-result p2

    invoke-static {p1, p2}, Lcom/scandit/base/camera/profiles/DeviceProfile;->setExposureTargetBias(Landroid/hardware/Camera$Parameters;F)V

    const/16 p2, 0x7530

    const/4 v0, 0x1

    .line 32
    invoke-static {p1, p2, v0}, Lcom/scandit/base/camera/profiles/DeviceProfile;->setHighestAvailablePreviewFrameRate(Landroid/hardware/Camera$Parameters;IZ)V

    return-void
.end method
