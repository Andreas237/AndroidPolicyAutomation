.class public Lcom/microblink/camera/hardware/camera/camera1/focus/StillFocusManager;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;


# instance fields
.field private volatile mFocusPaused:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/StillFocusManager;->mFocusPaused:Z

    return-void
.end method


# virtual methods
.method public cancelOngoingFocus()V
    .locals 0

    return-void
.end method

.method public checkFocus()V
    .locals 0

    return-void
.end method

.method public dispose()V
    .locals 0

    return-void
.end method

.method public doAutofocus(Z)V
    .locals 0

    return-void
.end method

.method public invalidateFocus()V
    .locals 0

    return-void
.end method

.method public isAutofocusing()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isCameraFocused()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isContinuous()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isFocusManagerPaused()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/StillFocusManager;->mFocusPaused:Z

    return v0
.end method

.method public pauseFocusing()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/StillFocusManager;->mFocusPaused:Z

    return-void
.end method

.method public resumeFocusing()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/StillFocusManager;->mFocusPaused:Z

    return-void
.end method

.method public setCamera(Landroid/hardware/Camera;)V
    .locals 0

    return-void
.end method

.method public setMeteringAreas([Landroid/graphics/Rect;)V
    .locals 0

    return-void
.end method
