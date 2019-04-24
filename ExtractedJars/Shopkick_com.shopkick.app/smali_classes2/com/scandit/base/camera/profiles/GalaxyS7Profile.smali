.class public Lcom/scandit/base/camera/profiles/GalaxyS7Profile;
.super Lcom/scandit/base/camera/profiles/DeviceProfile;
.source "GalaxyS7Profile.java"


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 15
    invoke-direct/range {v0 .. v5}, Lcom/scandit/base/camera/profiles/DeviceProfile;-><init>(Landroid/content/Context;ZZZF)V

    return-void
.end method


# virtual methods
.method public isInitialFocusRequired()Z
    .locals 2

    .line 32
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "SM-G930F"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "SM-G930V"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setupCameraParameters(Landroid/hardware/Camera$Parameters;F)V
    .locals 2

    .line 21
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->flatten()Ljava/lang/String;

    const-string v0, "phase-af"

    const-string v1, "on"

    .line 22
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "dynamic-range-control"

    const-string v1, "on"

    .line 23
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    invoke-virtual {p0}, Lcom/scandit/base/camera/profiles/GalaxyS7Profile;->getMinExposureTargetBias()F

    move-result v0

    invoke-static {v0, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    .line 24
    invoke-static {p1, p2}, Lcom/scandit/base/camera/profiles/GalaxyS7Profile;->setExposureTargetBias(Landroid/hardware/Camera$Parameters;F)V

    const/16 p2, 0x7530

    const/4 v0, 0x0

    .line 27
    invoke-static {p1, p2, v0}, Lcom/scandit/base/camera/profiles/GalaxyS7Profile;->setHighestAvailablePreviewFrameRate(Landroid/hardware/Camera$Parameters;IZ)V

    return-void
.end method
