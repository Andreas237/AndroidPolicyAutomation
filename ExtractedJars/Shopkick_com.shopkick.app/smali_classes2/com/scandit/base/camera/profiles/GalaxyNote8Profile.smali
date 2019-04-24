.class public Lcom/scandit/base/camera/profiles/GalaxyNote8Profile;
.super Lcom/scandit/base/camera/profiles/DeviceProfile;
.source "GalaxyNote8Profile.java"


# instance fields
.field private final mModel:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 16
    invoke-direct/range {v0 .. v5}, Lcom/scandit/base/camera/profiles/DeviceProfile;-><init>(Landroid/content/Context;ZZZF)V

    .line 17
    iput-object p2, p0, Lcom/scandit/base/camera/profiles/GalaxyNote8Profile;->mModel:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public isInitialFocusRequired()Z
    .locals 2

    const-string v0, "SM-N950F"

    .line 34
    iget-object v1, p0, Lcom/scandit/base/camera/profiles/GalaxyNote8Profile;->mModel:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public setupCameraParameters(Landroid/hardware/Camera$Parameters;F)V
    .locals 2

    .line 23
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->flatten()Ljava/lang/String;

    const-string v0, "phase-af"

    const-string v1, "on"

    .line 24
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "dynamic-range-control"

    const-string v1, "on"

    .line 25
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    invoke-virtual {p0}, Lcom/scandit/base/camera/profiles/GalaxyNote8Profile;->getMinExposureTargetBias()F

    move-result v0

    invoke-static {v0, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    .line 26
    invoke-static {p1, p2}, Lcom/scandit/base/camera/profiles/GalaxyNote8Profile;->setExposureTargetBias(Landroid/hardware/Camera$Parameters;F)V

    const/16 p2, 0x7530

    const/4 v0, 0x0

    .line 29
    invoke-static {p1, p2, v0}, Lcom/scandit/base/camera/profiles/GalaxyNote8Profile;->setHighestAvailablePreviewFrameRate(Landroid/hardware/Camera$Parameters;IZ)V

    return-void
.end method
