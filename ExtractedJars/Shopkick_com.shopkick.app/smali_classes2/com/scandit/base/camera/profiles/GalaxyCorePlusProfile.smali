.class public Lcom/scandit/base/camera/profiles/GalaxyCorePlusProfile;
.super Lcom/scandit/base/camera/profiles/DeviceProfile;
.source "GalaxyCorePlusProfile.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method protected static setPreviewFrameRate(Landroid/hardware/Camera$Parameters;IZ)V
    .locals 6

    .line 49
    invoke-virtual {p0}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewFpsRange()Ljava/util/List;

    move-result-object p2

    .line 50
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 54
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    .line 55
    aget v4, v1, v3

    if-le v4, p1, :cond_2

    goto :goto_0

    .line 59
    :cond_2
    aget v4, v1, v2

    const/16 v5, 0x3e80

    if-ge v4, v5, :cond_1

    if-eqz v0, :cond_3

    .line 60
    aget v4, v1, v3

    aget v5, v0, v3

    if-gt v4, v5, :cond_3

    aget v4, v1, v3

    aget v3, v0, v3

    if-ne v4, v3, :cond_1

    aget v3, v1, v2

    aget v2, v0, v2

    if-le v3, v2, :cond_1

    :cond_3
    move-object v0, v1

    goto :goto_0

    :cond_4
    if-eqz v0, :cond_5

    .line 68
    aget p1, v0, v2

    aget p2, v0, v3

    invoke-virtual {p0, p1, p2}, Landroid/hardware/Camera$Parameters;->setPreviewFpsRange(II)V

    :cond_5
    return-void
.end method


# virtual methods
.method public setupCameraParameters(Landroid/hardware/Camera$Parameters;F)V
    .locals 1

    .line 28
    invoke-virtual {p0}, Lcom/scandit/base/camera/profiles/GalaxyCorePlusProfile;->getMinExposureTargetBias()F

    move-result v0

    invoke-static {v0, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    .line 27
    invoke-static {p1, p2}, Lcom/scandit/base/camera/profiles/GalaxyCorePlusProfile;->setExposureTargetBias(Landroid/hardware/Camera$Parameters;F)V

    const/16 p2, 0x7530

    const/4 v0, 0x0

    .line 30
    invoke-static {p1, p2, v0}, Lcom/scandit/base/camera/profiles/GalaxyCorePlusProfile;->setPreviewFrameRate(Landroid/hardware/Camera$Parameters;IZ)V

    return-void
.end method
