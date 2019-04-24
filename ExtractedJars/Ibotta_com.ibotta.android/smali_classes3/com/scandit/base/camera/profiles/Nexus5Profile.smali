.class public Lcom/scandit/base/camera/profiles/Nexus5Profile;
.super Lcom/scandit/base/camera/profiles/DeviceProfile;
.source "Nexus5Profile.java"


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 23
    invoke-static {}, Lcom/scandit/base/camera/profiles/Nexus5Profile;->getSettings()Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/scandit/base/camera/profiles/DeviceProfile;-><init>(Landroid/content/Context;Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;)V

    return-void
.end method

.method private static getSettings()Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;
    .locals 3

    .line 14
    new-instance v0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;

    invoke-direct {v0}, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;-><init>()V

    const/4 v1, 0x0

    .line 15
    iput-boolean v1, v0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->disableTorch:Z

    const/4 v2, 0x1

    .line 16
    iput-boolean v2, v0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->disableContinuous:Z

    .line 17
    iput-boolean v1, v0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->disableMacro:Z

    const/high16 v1, -0x40800000    # -1.0f

    .line 18
    iput v1, v0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->minExposureTargetBias:F

    return-object v0
.end method


# virtual methods
.method public setupCameraParameters(Landroid/hardware/Camera$Parameters;F)V
    .locals 7

    .line 30
    invoke-virtual {p0}, Lcom/scandit/base/camera/profiles/Nexus5Profile;->getMinExposureTargetBias()F

    move-result v0

    invoke-static {v0, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    .line 29
    invoke-static {p1, p2}, Lcom/scandit/base/camera/profiles/Nexus5Profile;->setExposureTargetBias(Landroid/hardware/Camera$Parameters;F)V

    .line 37
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewFpsRange()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/16 v3, 0x7530

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    .line 38
    aget v2, v0, v2

    const/16 v4, 0x1b58

    if-ne v2, v4, :cond_0

    aget v0, v0, v1

    if-ne v0, v3, :cond_0

    .line 39
    invoke-virtual {p1, v4, v3}, Landroid/hardware/Camera$Parameters;->setPreviewFpsRange(II)V

    return-void

    :cond_1
    const/4 p2, 0x0

    .line 45
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewFpsRange()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/16 v4, 0x7530

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [I

    .line 46
    aget v6, v5, v2

    if-ge v6, v4, :cond_2

    aget v6, v5, v1

    if-ne v6, v3, :cond_2

    .line 48
    aget p2, v5, v2

    move v4, p2

    move-object p2, v5

    goto :goto_0

    :cond_3
    if-eqz p2, :cond_4

    .line 52
    aget v0, p2, v2

    aget p2, p2, v1

    invoke-virtual {p1, v0, p2}, Landroid/hardware/Camera$Parameters;->setPreviewFpsRange(II)V

    return-void

    .line 55
    :cond_4
    invoke-static {p1, v3, v2}, Lcom/scandit/base/camera/profiles/Nexus5Profile;->setHighestAvailablePreviewFrameRate(Landroid/hardware/Camera$Parameters;IZ)V

    return-void
.end method
