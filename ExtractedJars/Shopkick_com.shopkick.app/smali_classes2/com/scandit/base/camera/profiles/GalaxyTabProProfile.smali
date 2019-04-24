.class public Lcom/scandit/base/camera/profiles/GalaxyTabProProfile;
.super Lcom/scandit/base/camera/profiles/DeviceProfile;
.source "GalaxyTabProProfile.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/high16 v5, -0x40800000    # -1.0f

    move-object v0, p0

    move-object v1, p1

    .line 15
    invoke-direct/range {v0 .. v5}, Lcom/scandit/base/camera/profiles/DeviceProfile;-><init>(Landroid/content/Context;ZZZF)V

    return-void
.end method


# virtual methods
.method public setupCameraParameters(Landroid/hardware/Camera$Parameters;F)V
    .locals 3

    const-string/jumbo v0, "sharpness"

    const/4 v1, 0x0

    .line 24
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;I)V

    const-string v0, "mce"

    const-string v2, "disable"

    .line 25
    invoke-virtual {p1, v0, v2}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "contrast"

    .line 26
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;I)V

    .line 28
    invoke-virtual {p0}, Lcom/scandit/base/camera/profiles/GalaxyTabProProfile;->getMinExposureTargetBias()F

    move-result v0

    invoke-static {v0, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    .line 27
    invoke-static {p1, p2}, Lcom/scandit/base/camera/profiles/GalaxyTabProProfile;->setExposureTargetBias(Landroid/hardware/Camera$Parameters;F)V

    const/16 p2, 0x7530

    .line 29
    invoke-static {p1, p2, v1}, Lcom/scandit/base/camera/profiles/GalaxyTabProProfile;->setHighestAvailablePreviewFrameRate(Landroid/hardware/Camera$Parameters;IZ)V

    return-void
.end method
