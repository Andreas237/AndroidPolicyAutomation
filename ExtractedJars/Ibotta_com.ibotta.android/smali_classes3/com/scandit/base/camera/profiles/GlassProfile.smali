.class public Lcom/scandit/base/camera/profiles/GlassProfile;
.super Lcom/scandit/base/camera/profiles/DeviceProfile;
.source "GlassProfile.java"


# instance fields
.field private final mModel:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;-><init>(Landroid/content/Context;)V

    .line 20
    iput-object p2, p0, Lcom/scandit/base/camera/profiles/GlassProfile;->mModel:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public createDefaultResolutionStrategy()Lcom/scandit/base/camera/resolution/SbResolutionStrategy;
    .locals 1

    .line 41
    new-instance v0, Lcom/scandit/base/camera/resolution/SbHighDensityResolutionStrategy;

    invoke-direct {v0}, Lcom/scandit/base/camera/resolution/SbHighDensityResolutionStrategy;-><init>()V

    return-object v0
.end method

.method public setupCameraParameters(Landroid/hardware/Camera$Parameters;F)V
    .locals 2

    const-string v0, "glass1"

    .line 26
    iget-object v1, p0, Lcom/scandit/base/camera/profiles/GlassProfile;->mModel:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/16 v1, 0x7530

    if-eqz v0, :cond_0

    .line 27
    invoke-virtual {p1, v1, v1}, Landroid/hardware/Camera$Parameters;->setPreviewFpsRange(II)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 29
    invoke-static {p1, v1, v0}, Lcom/scandit/base/camera/profiles/GlassProfile;->setHighestAvailablePreviewFrameRate(Landroid/hardware/Camera$Parameters;IZ)V

    :goto_0
    const-string v0, "glass 2 (oem)"

    .line 32
    iget-object v1, p0, Lcom/scandit/base/camera/profiles/GlassProfile;->mModel:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/high16 p2, -0x40400000    # -1.5f

    .line 33
    invoke-static {p1, p2}, Lcom/scandit/base/camera/profiles/GlassProfile;->setExposureTargetBias(Landroid/hardware/Camera$Parameters;F)V

    goto :goto_1

    .line 36
    :cond_1
    invoke-virtual {p0}, Lcom/scandit/base/camera/profiles/GlassProfile;->getMinExposureTargetBias()F

    move-result v0

    invoke-static {v0, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    .line 35
    invoke-static {p1, p2}, Lcom/scandit/base/camera/profiles/GlassProfile;->setExposureTargetBias(Landroid/hardware/Camera$Parameters;F)V

    :goto_1
    return-void
.end method
