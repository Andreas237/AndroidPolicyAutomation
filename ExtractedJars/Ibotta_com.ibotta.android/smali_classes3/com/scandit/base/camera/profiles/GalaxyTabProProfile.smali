.class public Lcom/scandit/base/camera/profiles/GalaxyTabProProfile;
.super Lcom/scandit/base/camera/profiles/DeviceProfile;
.source "GalaxyTabProProfile.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 24
    invoke-static {}, Lcom/scandit/base/camera/profiles/GalaxyTabProProfile;->getSettings()Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/scandit/base/camera/profiles/DeviceProfile;-><init>(Landroid/content/Context;Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;)V

    return-void
.end method

.method private static getSettings()Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;
    .locals 3

    .line 15
    new-instance v0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;

    invoke-direct {v0}, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;-><init>()V

    const/4 v1, 0x0

    .line 16
    iput-boolean v1, v0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->disableTorch:Z

    const/4 v2, 0x1

    .line 17
    iput-boolean v2, v0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->disableContinuous:Z

    .line 18
    iput-boolean v1, v0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->disableMacro:Z

    const/high16 v1, -0x40800000    # -1.0f

    .line 19
    iput v1, v0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->minExposureTargetBias:F

    return-object v0
.end method


# virtual methods
.method public setupCameraParameters(Landroid/hardware/Camera$Parameters;F)V
    .locals 3

    const-string v0, "sharpness"

    const/4 v1, 0x0

    .line 33
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;I)V

    const-string v0, "mce"

    const-string v2, "disable"

    .line 34
    invoke-virtual {p1, v0, v2}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "contrast"

    .line 35
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;I)V

    .line 37
    invoke-virtual {p0}, Lcom/scandit/base/camera/profiles/GalaxyTabProProfile;->getMinExposureTargetBias()F

    move-result v0

    invoke-static {v0, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    .line 36
    invoke-static {p1, p2}, Lcom/scandit/base/camera/profiles/GalaxyTabProProfile;->setExposureTargetBias(Landroid/hardware/Camera$Parameters;F)V

    const/16 p2, 0x7530

    .line 38
    invoke-static {p1, p2, v1}, Lcom/scandit/base/camera/profiles/GalaxyTabProProfile;->setHighestAvailablePreviewFrameRate(Landroid/hardware/Camera$Parameters;IZ)V

    return-void
.end method
