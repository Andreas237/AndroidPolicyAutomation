.class public Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x10
.end annotation


# instance fields
.field private mAfStatusView:Lcom/microblink/camera/hardware/camera/AutofocusListener;

.field private mCamera:Landroid/hardware/Camera;

.field private mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

.field private mFocusAreas:[Landroid/graphics/Rect;

.field private mFocusInProgress:Z

.field private mFocusPaused:Z

.field private mFocused:Z

.field private mFullAutofocusInProgress:Z

.field private mMacroMode:Z


# direct methods
.method public constructor <init>(Lcom/microblink/camera/hardware/camera/AutofocusListener;Lcom/microblink/camera/hardware/DeviceManager;Z)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mFocusPaused:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mAfStatusView:Lcom/microblink/camera/hardware/camera/AutofocusListener;

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mFocusInProgress:Z

    iput-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mFocusAreas:[Landroid/graphics/Rect;

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mFullAutofocusInProgress:Z

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mFocused:Z

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mMacroMode:Z

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mAfStatusView:Lcom/microblink/camera/hardware/camera/AutofocusListener;

    iput-object p2, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/DeviceManager;->hasDeviceListsLoaded()Z

    move-result p1

    if-eqz p1, :cond_0

    iput-boolean p3, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mMacroMode:Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Device manager needs to have device lists loaded"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic access$002(Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mFullAutofocusInProgress:Z

    return p1
.end method

.method static synthetic access$102(Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mFocusInProgress:Z

    return p1
.end method

.method static synthetic access$200(Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;)Lcom/microblink/camera/hardware/DeviceManager;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    return-object p0
.end method

.method static synthetic access$300(Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;)Lcom/microblink/camera/hardware/camera/AutofocusListener;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mAfStatusView:Lcom/microblink/camera/hardware/camera/AutofocusListener;

    return-object p0
.end method

.method static synthetic access$400(Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;)[Landroid/graphics/Rect;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mFocusAreas:[Landroid/graphics/Rect;

    return-object p0
.end method

.method static synthetic access$502(Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mFocused:Z

    return p1
.end method

.method static synthetic access$600(Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;)Landroid/hardware/Camera;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mCamera:Landroid/hardware/Camera;

    return-object p0
.end method


# virtual methods
.method public cancelOngoingFocus()V
    .locals 3

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mCamera:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mFullAutofocusInProgress:Z

    if-eqz v1, :cond_0

    :try_start_0
    invoke-virtual {v0}, Landroid/hardware/Camera;->cancelAutoFocus()V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    const-string v1, "continuous-picture"

    invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v1, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to resume continuous autofocus because attempt to modify camera parameters failed or because autofocus cancelling has failed."

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p0, v0, v1, v2}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public checkFocus()V
    .locals 0

    return-void
.end method

.method public dispose()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mCamera:Landroid/hardware/Camera;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mAfStatusView:Lcom/microblink/camera/hardware/camera/AutofocusListener;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mFocusAreas:[Landroid/graphics/Rect;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    return-void
.end method

.method public doAutofocus(Z)V
    .locals 3

    if-nez p1, :cond_0

    iget-boolean p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mFocused:Z

    if-nez p1, :cond_4

    :cond_0
    iget-boolean p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mFullAutofocusInProgress:Z

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mCamera:Landroid/hardware/Camera;

    if-eqz p1, :cond_4

    const-string p1, "Performing full autofocus cycle"

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, v1}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :try_start_0
    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {p1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_3

    iget-boolean v1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mMacroMode:Z

    if-eqz v1, :cond_1

    const-string v1, "macro"

    goto :goto_0

    :cond_1
    const-string v1, "auto"

    :goto_0
    invoke-virtual {p1, v1}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    :try_start_1
    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v1, p1}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    const-string v1, "Failed to transfer camera into autofocus mode from continuous autofocus. Focus may fail! This is a device issue!"

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, v1, v2}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mAfStatusView:Lcom/microblink/camera/hardware/camera/AutofocusListener;

    if-eqz p1, :cond_2

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mFocusAreas:[Landroid/graphics/Rect;

    invoke-interface {p1, v1}, Lcom/microblink/camera/hardware/camera/AutofocusListener;->onAutofocusStarted([Landroid/graphics/Rect;)V

    :cond_2
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mFullAutofocusInProgress:Z

    iput-boolean p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mFocusInProgress:Z

    :try_start_2
    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mCamera:Landroid/hardware/Camera;

    new-instance v1, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager$1;

    invoke-direct {v1, p0}, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager$1;-><init>(Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;)V

    invoke-virtual {p1, v1}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    return-void

    :catch_1
    move-exception p1

    const-string v1, "A runtime exception occurred while attempting to perform autofocus"

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, v1, v2}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mFullAutofocusInProgress:Z

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mFocusInProgress:Z

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mFocused:Z

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mAfStatusView:Lcom/microblink/camera/hardware/camera/AutofocusListener;

    if-eqz p1, :cond_3

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mFocusAreas:[Landroid/graphics/Rect;

    invoke-interface {p1, v1}, Lcom/microblink/camera/hardware/camera/AutofocusListener;->onAutofocusStopped([Landroid/graphics/Rect;)V

    :cond_3
    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mCamera:Landroid/hardware/Camera;

    if-eqz p1, :cond_4

    :try_start_3
    invoke-virtual {p1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object p1

    const-string v1, "continuous-picture"

    invoke-virtual {p1, v1}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v1, p1}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_2

    return-void

    :catch_2
    move-exception p1

    const-string v1, "Failed to transfer camera back into continuous autofocus mode! This is a device issue!"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, v1, v0}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :catch_3
    move-exception p1

    const-string v1, "Failed to obtain parameters from camera! Cannot perform autofocus cycle."

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, v1, v0}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    :goto_2
    return-void
.end method

.method public invalidateFocus()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mFocused:Z

    return-void
.end method

.method public isAutofocusing()Z
    .locals 5

    const-string v0, "Focus in progress: {}, full autofocus in progress: {}"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-boolean v2, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mFocusInProgress:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mFullAutofocusInProgress:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v4, 0x1

    aput-object v2, v1, v4

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mFocusInProgress:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mFullAutofocusInProgress:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return v3

    :cond_1
    :goto_0
    return v4
.end method

.method public isCameraFocused()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mFocused:Z

    return v0
.end method

.method public isContinuous()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isFocusManagerPaused()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mFocusPaused:Z

    return v0
.end method

.method public pauseFocusing()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mFocusPaused:Z

    return-void
.end method

.method public resumeFocusing()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mFocusPaused:Z

    return-void
.end method

.method public setCamera(Landroid/hardware/Camera;)V
    .locals 1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mCamera:Landroid/hardware/Camera;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Landroid/hardware/Camera;->setAutoFocusMoveCallback(Landroid/hardware/Camera$AutoFocusMoveCallback;)V

    :cond_0
    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mCamera:Landroid/hardware/Camera;

    return-void

    :cond_1
    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mCamera:Landroid/hardware/Camera;

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mCamera:Landroid/hardware/Camera;

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager$2;

    invoke-direct {v0, p0}, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager$2;-><init>(Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;)V

    invoke-virtual {p1, v0}, Landroid/hardware/Camera;->setAutoFocusMoveCallback(Landroid/hardware/Camera$AutoFocusMoveCallback;)V

    return-void
.end method

.method public setMeteringAreas([Landroid/graphics/Rect;)V
    .locals 10

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mCamera:Landroid/hardware/Camera;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    :try_start_0
    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    if-nez p1, :cond_0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/hardware/Camera$Parameters;->setMeteringAreas(Ljava/util/List;)V

    :goto_0
    invoke-virtual {v0, v2}, Landroid/hardware/Camera$Parameters;->setFocusAreas(Ljava/util/List;)V

    goto :goto_3

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    :goto_1
    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getMaxNumFocusAreas()I

    move-result v4

    const/16 v5, 0x3e8

    const/4 v6, 0x1

    if-ge v3, v4, :cond_1

    array-length v4, p1

    if-ge v3, v4, :cond_1

    const-string v4, "Adding focus area {}"

    new-array v6, v6, [Ljava/lang/Object;

    aget-object v7, p1, v3

    aput-object v7, v6, v1

    invoke-static {p0, v4, v6}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v4, Landroid/hardware/Camera$Area;

    aget-object v6, p1, v3

    invoke-direct {v4, v6, v5}, Landroid/hardware/Camera$Area;-><init>(Landroid/graphics/Rect;I)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const/4 v4, 0x0

    :goto_2
    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getMaxNumMeteringAreas()I

    move-result v7

    if-ge v4, v7, :cond_2

    array-length v7, p1

    if-ge v4, v7, :cond_2

    const-string v7, "Adding metering area {}"

    new-array v8, v6, [Ljava/lang/Object;

    aget-object v9, p1, v4

    aput-object v9, v8, v1

    invoke-static {p0, v7, v8}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v7, Landroid/hardware/Camera$Area;

    aget-object v8, p1, v4

    invoke-direct {v7, v8, v5}, Landroid/hardware/Camera$Area;-><init>(Landroid/graphics/Rect;I)V

    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v3}, Landroid/hardware/Camera$Parameters;->setMeteringAreas(Ljava/util/List;)V

    goto :goto_0

    :goto_3
    :try_start_1
    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v2, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->mFocusAreas:[Landroid/graphics/Rect;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    const-string p1, "Failed to apply new camera parameters!"

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p0, p1, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :catch_1
    move-exception p1

    const-string v0, "Failed to obtain camera paremeters. Cannot set metering areas!"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, p1, v0, v1}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_3
    const-string p1, "Cannot set focus area, camera is null"

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p0, p1, v0}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
