.class Lcom/scandit/base/camera/profiles/StandardProfile;
.super Lcom/scandit/base/camera/profiles/DeviceProfile;
.source "StandardProfile.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/scandit/base/camera/profiles/StandardProfile$Settings;
    }
.end annotation


# instance fields
.field private mUseFpsRangeWithBiggestSpread:Z


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/scandit/base/camera/profiles/StandardProfile$Settings;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1, p2}, Lcom/scandit/base/camera/profiles/DeviceProfile;-><init>(Landroid/content/Context;Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;)V

    .line 28
    iget-boolean p1, p2, Lcom/scandit/base/camera/profiles/StandardProfile$Settings;->useFpsRangeWithBiggestSpread:Z

    iput-boolean p1, p0, Lcom/scandit/base/camera/profiles/StandardProfile;->mUseFpsRangeWithBiggestSpread:Z

    return-void
.end method

.method private disableEdgeEnhancements(Landroid/hardware/Camera$Parameters;)V
    .locals 2

    const-string v0, "min-sharpness"

    .line 45
    invoke-virtual {p1, v0}, Landroid/hardware/Camera$Parameters;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/scandit/base/camera/profiles/StandardProfile;->parseIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "max-sharpness"

    .line 46
    invoke-virtual {p1, v1}, Landroid/hardware/Camera$Parameters;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/scandit/base/camera/profiles/StandardProfile;->parseIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    .line 49
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 50
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-gtz v0, :cond_1

    if-ltz v1, :cond_1

    const-string v0, "sharpness"

    const-string v1, "0"

    .line 52
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v0, "sharpness"

    const-string v1, "0"

    .line 56
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private parseIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 65
    :cond_0
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    return-object v0
.end method


# virtual methods
.method public setupCameraParameters(Landroid/hardware/Camera$Parameters;F)V
    .locals 2

    .line 34
    invoke-virtual {p0}, Lcom/scandit/base/camera/profiles/StandardProfile;->getMinExposureTargetBias()F

    move-result v0

    invoke-static {v0, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    .line 33
    invoke-static {p1, p2}, Lcom/scandit/base/camera/profiles/DeviceProfile;->setExposureTargetBias(Landroid/hardware/Camera$Parameters;F)V

    .line 35
    invoke-direct {p0, p1}, Lcom/scandit/base/camera/profiles/StandardProfile;->disableEdgeEnhancements(Landroid/hardware/Camera$Parameters;)V

    .line 36
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x7530

    const/16 v1, 0x17

    if-lt p2, v1, :cond_0

    iget-boolean p2, p0, Lcom/scandit/base/camera/profiles/StandardProfile;->mUseFpsRangeWithBiggestSpread:Z

    if-eqz p2, :cond_0

    .line 37
    invoke-static {p1, v0}, Lcom/scandit/base/camera/profiles/DeviceProfile;->setPreviewFrameRateWithBiggestSpread(Landroid/hardware/Camera$Parameters;I)V

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 40
    invoke-static {p1, v0, p2}, Lcom/scandit/base/camera/profiles/DeviceProfile;->setHighestAvailablePreviewFrameRate(Landroid/hardware/Camera$Parameters;IZ)V

    :goto_0
    return-void
.end method
