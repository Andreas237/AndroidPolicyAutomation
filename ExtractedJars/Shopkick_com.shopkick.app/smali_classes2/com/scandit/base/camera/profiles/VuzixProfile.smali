.class public Lcom/scandit/base/camera/profiles/VuzixProfile;
.super Lcom/scandit/base/camera/profiles/DeviceProfile;
.source "VuzixProfile.java"


# static fields
.field private static final GPU_LOCALIZATION_PROPERTY:Ljava/lang/String; = "gpu_localization_enabled"


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 6

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 17
    invoke-direct/range {v0 .. v5}, Lcom/scandit/base/camera/profiles/DeviceProfile;-><init>(Landroid/content/Context;ZZZF)V

    return-void
.end method


# virtual methods
.method public adjustSettings(Lcom/scandit/barcodepicker/ScanSettings;)V
    .locals 2

    const-string v0, "gpu_localization_enabled"

    .line 30
    invoke-virtual {p1, v0}, Lcom/scandit/barcodepicker/ScanSettings;->getProperty(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const-string v0, "gpu_localization_enabled"

    const/4 v1, 0x0

    .line 31
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/scandit/barcodepicker/ScanSettings;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public setupCameraParameters(Landroid/hardware/Camera$Parameters;F)V
    .locals 1

    .line 23
    invoke-virtual {p0}, Lcom/scandit/base/camera/profiles/VuzixProfile;->getMinExposureTargetBias()F

    move-result v0

    invoke-static {v0, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    .line 22
    invoke-static {p1, p2}, Lcom/scandit/base/camera/profiles/DeviceProfile;->setExposureTargetBias(Landroid/hardware/Camera$Parameters;F)V

    const/16 p2, 0x7530

    const/4 v0, 0x0

    .line 25
    invoke-static {p1, p2, v0}, Lcom/scandit/base/camera/profiles/DeviceProfile;->setHighestAvailablePreviewFrameRate(Landroid/hardware/Camera$Parameters;IZ)V

    return-void
.end method
