.class public Lcom/scandit/base/camera/profiles/GalaxyJ3Profile;
.super Lcom/scandit/base/camera/profiles/DeviceProfile;
.source "GalaxyJ3Profile.java"


# static fields
.field private static final GPU_LOCALIZATION_PROPERTY:Ljava/lang/String; = "gpu_localization_enabled"


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public adjustSettings(Lcom/scandit/barcodepicker/ScanSettings;)V
    .locals 2

    const-string v0, "gpu_localization_enabled"

    .line 31
    invoke-virtual {p1, v0}, Lcom/scandit/barcodepicker/ScanSettings;->getProperty(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const-string v0, "gpu_localization_enabled"

    const/4 v1, 0x0

    .line 32
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/scandit/barcodepicker/ScanSettings;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public setupCameraParameters(Landroid/hardware/Camera$Parameters;F)V
    .locals 2

    .line 20
    invoke-virtual {p0}, Lcom/scandit/base/camera/profiles/GalaxyJ3Profile;->getMinExposureTargetBias()F

    move-result v0

    invoke-static {v0, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    .line 19
    invoke-static {p1, p2}, Lcom/scandit/base/camera/profiles/DeviceProfile;->setExposureTargetBias(Landroid/hardware/Camera$Parameters;F)V

    .line 21
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x7530

    const/16 v1, 0x17

    if-lt p2, v1, :cond_0

    .line 22
    invoke-static {p1, v0}, Lcom/scandit/base/camera/profiles/DeviceProfile;->setPreviewFrameRateWithBiggestSpread(Landroid/hardware/Camera$Parameters;I)V

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 25
    invoke-static {p1, v0, p2}, Lcom/scandit/base/camera/profiles/DeviceProfile;->setHighestAvailablePreviewFrameRate(Landroid/hardware/Camera$Parameters;IZ)V

    :goto_0
    return-void
.end method
