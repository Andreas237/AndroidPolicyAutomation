.class public Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;
.super Ljava/lang/Object;
.source "DeviceProfile.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/base/camera/profiles/DeviceProfile;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Settings"
.end annotation


# instance fields
.field customMeteringAreaSupported:Z

.field disableContinuous:Z

.field disableMacro:Z

.field disableTorch:Z

.field minExposureTargetBias:F

.field requiresRestartOnTorchSwitch:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 39
    iput-boolean v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->disableTorch:Z

    .line 40
    iput-boolean v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->disableContinuous:Z

    .line 42
    iput-boolean v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->disableMacro:Z

    const/4 v1, 0x0

    .line 43
    iput v1, p0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->minExposureTargetBias:F

    const/4 v1, 0x1

    .line 44
    iput-boolean v1, p0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->customMeteringAreaSupported:Z

    .line 45
    iput-boolean v0, p0, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;->requiresRestartOnTorchSwitch:Z

    return-void
.end method
