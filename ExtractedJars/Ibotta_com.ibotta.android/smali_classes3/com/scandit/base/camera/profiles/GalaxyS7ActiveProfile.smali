.class public Lcom/scandit/base/camera/profiles/GalaxyS7ActiveProfile;
.super Lcom/scandit/base/camera/profiles/DeviceProfile;
.source "GalaxyS7ActiveProfile.java"


# instance fields
.field private final mModel:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 27
    invoke-static {}, Lcom/scandit/base/camera/profiles/GalaxyS7ActiveProfile;->getSettings()Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/scandit/base/camera/profiles/DeviceProfile;-><init>(Landroid/content/Context;Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;)V

    .line 28
    iput-object p2, p0, Lcom/scandit/base/camera/profiles/GalaxyS7ActiveProfile;->mModel:Ljava/lang/String;

    return-void
.end method

.method private static getSettings()Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;
    .locals 3

    .line 16
    new-instance v0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;

    invoke-direct {v0}, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;-><init>()V

    const/4 v1, 0x0

    .line 17
    iput-boolean v1, v0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->disableTorch:Z

    .line 18
    iput-boolean v1, v0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->disableContinuous:Z

    const/4 v2, 0x1

    .line 19
    iput-boolean v2, v0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->disableMacro:Z

    const/4 v2, 0x0

    .line 20
    iput v2, v0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->minExposureTargetBias:F

    .line 21
    iput-boolean v1, v0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->customMeteringAreaSupported:Z

    .line 22
    iput-boolean v1, v0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->requiresRestartOnTorchSwitch:Z

    return-object v0
.end method


# virtual methods
.method public getContinuousFocusModeString()Ljava/lang/String;
    .locals 1

    const-string v0, "object-tracking-picture"

    return-object v0
.end method

.method public isInitialFocusRequired()Z
    .locals 2

    const-string v0, "sm-g891a"

    .line 56
    iget-object v1, p0, Lcom/scandit/base/camera/profiles/GalaxyS7ActiveProfile;->mModel:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public setupCameraParameters(Landroid/hardware/Camera$Parameters;F)V
    .locals 2

    const-string v0, "phase-af"

    const-string v1, "on"

    .line 34
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "dynamic-range-control"

    const-string v1, "on"

    .line 35
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "slow_ae"

    const-string v1, "on"

    .line 36
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "sw-vdis"

    const-string v1, "off"

    .line 37
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "sharpness"

    const-string v1, "0"

    .line 38
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "video_recording_gamma"

    const-string v1, "on"

    .line 39
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "denoise"

    const-string v1, "denoise-off"

    .line 40
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "zsl"

    const-string v1, "off"

    .line 41
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    invoke-virtual {p0}, Lcom/scandit/base/camera/profiles/GalaxyS7ActiveProfile;->getMinExposureTargetBias()F

    move-result v0

    invoke-static {v0, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    .line 42
    invoke-static {p1, p2}, Lcom/scandit/base/camera/profiles/GalaxyS7ActiveProfile;->setExposureTargetBias(Landroid/hardware/Camera$Parameters;F)V

    const/16 p2, 0x7530

    const/4 v0, 0x0

    .line 45
    invoke-static {p1, p2, v0}, Lcom/scandit/base/camera/profiles/GalaxyS7ActiveProfile;->setHighestAvailablePreviewFrameRate(Landroid/hardware/Camera$Parameters;IZ)V

    return-void
.end method
