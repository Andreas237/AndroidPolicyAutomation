.class Lcom/scandit/base/camera/profiles/GalaxyActiveTabProfile;
.super Lcom/scandit/base/camera/profiles/DeviceProfile;
.source "GalaxyActiveTabProfile.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 8

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 21
    invoke-direct/range {v0 .. v7}, Lcom/scandit/base/camera/profiles/DeviceProfile;-><init>(Landroid/content/Context;ZZZFZZ)V

    return-void
.end method


# virtual methods
.method public setupCameraParameters(Landroid/hardware/Camera$Parameters;F)V
    .locals 2

    const-string/jumbo v0, "slow_ae"

    const-string v1, "on"

    .line 29
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    const-string/jumbo v0, "sw-vdis"

    const-string v1, "off"

    .line 30
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    const-string/jumbo v0, "sharpness"

    const-string v1, "0"

    .line 31
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    const-string/jumbo v0, "video_recording_gamma"

    const-string v1, "on"

    .line 32
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "denoise"

    const-string v1, "denoise-off"

    .line 33
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    const-string/jumbo v0, "zsl"

    const-string v1, "off"

    .line 34
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    invoke-virtual {p0}, Lcom/scandit/base/camera/profiles/GalaxyActiveTabProfile;->getMinExposureTargetBias()F

    move-result v0

    invoke-static {v0, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    .line 36
    invoke-static {p1, p2}, Lcom/scandit/base/camera/profiles/GalaxyActiveTabProfile;->setExposureTargetBias(Landroid/hardware/Camera$Parameters;F)V

    const/16 p2, 0x7530

    const/4 v0, 0x0

    .line 38
    invoke-static {p1, p2, v0}, Lcom/scandit/base/camera/profiles/GalaxyActiveTabProfile;->setHighestAvailablePreviewFrameRate(Landroid/hardware/Camera$Parameters;IZ)V

    return-void
.end method
