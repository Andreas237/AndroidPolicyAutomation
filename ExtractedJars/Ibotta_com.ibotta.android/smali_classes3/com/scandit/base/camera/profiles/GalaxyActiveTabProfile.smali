.class Lcom/scandit/base/camera/profiles/GalaxyActiveTabProfile;
.super Lcom/scandit/base/camera/profiles/DeviceProfile;
.source "GalaxyActiveTabProfile.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 32
    invoke-static {}, Lcom/scandit/base/camera/profiles/GalaxyActiveTabProfile;->getSettings()Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/scandit/base/camera/profiles/DeviceProfile;-><init>(Landroid/content/Context;Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;)V

    return-void
.end method

.method private static getSettings()Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;
    .locals 3

    .line 21
    new-instance v0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;

    invoke-direct {v0}, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;-><init>()V

    const/4 v1, 0x0

    .line 22
    iput-boolean v1, v0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->disableTorch:Z

    const/4 v2, 0x1

    .line 23
    iput-boolean v2, v0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->disableContinuous:Z

    .line 24
    iput-boolean v2, v0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->disableMacro:Z

    const/4 v2, 0x0

    .line 25
    iput v2, v0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->minExposureTargetBias:F

    .line 26
    iput-boolean v1, v0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->customMeteringAreaSupported:Z

    .line 27
    iput-boolean v1, v0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->requiresRestartOnTorchSwitch:Z

    return-object v0
.end method


# virtual methods
.method public setupCameraParameters(Landroid/hardware/Camera$Parameters;F)V
    .locals 2

    const-string v0, "slow_ae"

    const-string v1, "on"

    .line 40
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "sw-vdis"

    const-string v1, "off"

    .line 41
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "sharpness"

    const-string v1, "0"

    .line 42
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "video_recording_gamma"

    const-string v1, "on"

    .line 43
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "denoise"

    const-string v1, "denoise-off"

    .line 44
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "zsl"

    const-string v1, "off"

    .line 45
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    invoke-virtual {p0}, Lcom/scandit/base/camera/profiles/GalaxyActiveTabProfile;->getMinExposureTargetBias()F

    move-result v0

    invoke-static {v0, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    .line 47
    invoke-static {p1, p2}, Lcom/scandit/base/camera/profiles/GalaxyActiveTabProfile;->setExposureTargetBias(Landroid/hardware/Camera$Parameters;F)V

    const/16 p2, 0x7530

    const/4 v0, 0x0

    .line 49
    invoke-static {p1, p2, v0}, Lcom/scandit/base/camera/profiles/GalaxyActiveTabProfile;->setHighestAvailablePreviewFrameRate(Landroid/hardware/Camera$Parameters;IZ)V

    return-void
.end method
