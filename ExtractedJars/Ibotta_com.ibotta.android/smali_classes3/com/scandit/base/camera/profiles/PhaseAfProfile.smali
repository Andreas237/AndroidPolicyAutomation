.class public Lcom/scandit/base/camera/profiles/PhaseAfProfile;
.super Lcom/scandit/base/camera/profiles/DeviceProfile;
.source "PhaseAfProfile.java"


# static fields
.field public static final INITIAL_FOCUS_MODEL:Ljava/lang/String; = "scandit-phase_af-initial_trigger"

.field public static final MODEL:Ljava/lang/String; = "scandit-phase_af"


# instance fields
.field protected final mModel:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 34
    invoke-static {}, Lcom/scandit/base/camera/profiles/PhaseAfProfile;->getSettings()Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/scandit/base/camera/profiles/PhaseAfProfile;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p3}, Lcom/scandit/base/camera/profiles/DeviceProfile;-><init>(Landroid/content/Context;Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;)V

    .line 30
    iput-object p2, p0, Lcom/scandit/base/camera/profiles/PhaseAfProfile;->mModel:Ljava/lang/String;

    return-void
.end method

.method protected static getSettings()Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;
    .locals 2

    .line 19
    new-instance v0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;

    invoke-direct {v0}, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;-><init>()V

    const/4 v1, 0x0

    .line 20
    iput-boolean v1, v0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->disableTorch:Z

    .line 21
    iput-boolean v1, v0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->disableContinuous:Z

    const/4 v1, 0x1

    .line 22
    iput-boolean v1, v0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->disableMacro:Z

    const/4 v1, 0x0

    .line 23
    iput v1, v0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->minExposureTargetBias:F

    return-object v0
.end method


# virtual methods
.method public isInitialFocusRequired()Z
    .locals 2

    const-string v0, "scandit-phase_af-initial_trigger"

    .line 50
    iget-object v1, p0, Lcom/scandit/base/camera/profiles/PhaseAfProfile;->mModel:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public setupCameraParameters(Landroid/hardware/Camera$Parameters;F)V
    .locals 2

    const-string v0, "phase-af"

    const-string v1, "on"

    .line 40
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "dynamic-range-control"

    const-string v1, "on"

    .line 41
    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    invoke-virtual {p0}, Lcom/scandit/base/camera/profiles/PhaseAfProfile;->getMinExposureTargetBias()F

    move-result v0

    invoke-static {v0, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    .line 42
    invoke-static {p1, p2}, Lcom/scandit/base/camera/profiles/PhaseAfProfile;->setExposureTargetBias(Landroid/hardware/Camera$Parameters;F)V

    const/16 p2, 0x7530

    const/4 v0, 0x0

    .line 45
    invoke-static {p1, p2, v0}, Lcom/scandit/base/camera/profiles/PhaseAfProfile;->setHighestAvailablePreviewFrameRate(Landroid/hardware/Camera$Parameters;IZ)V

    return-void
.end method
