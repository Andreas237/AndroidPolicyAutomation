.class public abstract Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;
.super Ljava/lang/Object;
.source "AsyncStartStopStateMachine.java"


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "CameraState"

.field public static final STATE_STARTED:I = 0x1

.field public static final STATE_STARTING:I = 0x3

.field public static final STATE_STOPPED:I = 0x2

.field public static final STATE_STOPPING:I = 0x4


# instance fields
.field private mCurrentState:I

.field private mDesiredState:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    .line 27
    iput v0, p0, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->mDesiredState:I

    .line 28
    iput v0, p0, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->mCurrentState:I

    return-void
.end method

.method private static isTransitioning(I)Z
    .locals 1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static stateToString(I)Ljava/lang/String;
    .locals 0

    packed-switch p0, :pswitch_data_0

    const-string/jumbo p0, "unknown"

    return-object p0

    :pswitch_0
    const-string/jumbo p0, "stopping"

    return-object p0

    :pswitch_1
    const-string/jumbo p0, "starting"

    return-object p0

    :pswitch_2
    const-string/jumbo p0, "stopped"

    return-object p0

    :pswitch_3
    const-string/jumbo p0, "started"

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private switchToDesiredState()V
    .locals 5

    const-string v0, "CameraState"

    const-string/jumbo v1, "switch to desired state %s (current=%s)"

    const/4 v2, 0x2

    .line 79
    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->mDesiredState:I

    .line 80
    invoke-static {v3}, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->stateToString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, p0, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->mCurrentState:I

    invoke-static {v3}, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->stateToString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 79
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 81
    iget v0, p0, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->mDesiredState:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 86
    :pswitch_0
    invoke-virtual {p0}, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->transitionToStoppedStateAsync()V

    goto :goto_0

    .line 83
    :pswitch_1
    invoke-virtual {p0}, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->transitionToStartedStateAsync()V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public forceStop()V
    .locals 3

    .line 118
    iget v0, p0, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->mDesiredState:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->mCurrentState:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    const-string v0, "CameraState"

    const-string v2, "forcing to stopped state"

    .line 121
    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 122
    iget v0, p0, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->mCurrentState:I

    const/4 v2, 0x3

    if-ne v0, v2, :cond_1

    const/4 v0, 0x1

    .line 123
    iput v0, p0, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->mCurrentState:I

    .line 125
    :cond_1
    iput v1, p0, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->mDesiredState:I

    .line 126
    invoke-direct {p0}, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->switchToDesiredState()V

    return-void
.end method

.method public getCurrentState()I
    .locals 1

    .line 95
    iget v0, p0, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->mCurrentState:I

    return v0
.end method

.method protected setCurrentState(I)V
    .locals 4

    .line 103
    iput p1, p0, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->mCurrentState:I

    const-string p1, "CameraState"

    const-string v0, "set current state to %s (desired=%s)"

    const/4 v1, 0x2

    .line 104
    new-array v1, v1, [Ljava/lang/Object;

    iget v2, p0, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->mCurrentState:I

    .line 105
    invoke-static {v2}, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->stateToString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->mDesiredState:I

    invoke-static {v2}, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->stateToString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 104
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 106
    iget p1, p0, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->mCurrentState:I

    iget v0, p0, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->mDesiredState:I

    if-eq p1, v0, :cond_1

    invoke-static {p1}, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->isTransitioning(I)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 109
    :cond_0
    invoke-direct {p0}, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->switchToDesiredState()V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public setDesiredState(I)V
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_1

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 52
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "desired state must either be started or stopped"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 54
    :cond_1
    :goto_0
    iget v2, p0, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->mDesiredState:I

    const/4 v3, 0x0

    if-ne v2, p1, :cond_4

    const-string v4, "CameraState"

    const-string v5, "already at desired state %s (current=%s)"

    .line 55
    new-array v1, v1, [Ljava/lang/Object;

    .line 56
    invoke-static {v2}, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->stateToString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v3

    iget v2, p0, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->mCurrentState:I

    invoke-static {v2}, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->stateToString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v0

    .line 55
    invoke-static {v5, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    iget v0, p0, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->mCurrentState:I

    if-eq v0, p1, :cond_3

    invoke-static {v0}, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->isTransitioning(I)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    .line 58
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "got into an illegal state"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    return-void

    .line 62
    :cond_4
    iput p1, p0, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->mDesiredState:I

    .line 63
    iget p1, p0, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->mCurrentState:I

    iget v2, p0, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->mDesiredState:I

    if-eq p1, v2, :cond_6

    .line 68
    invoke-static {p1}, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->isTransitioning(I)Z

    move-result p1

    if-eqz p1, :cond_5

    const-string p1, "CameraState"

    const-string v2, "already transitioning to %s (current=%s)"

    .line 69
    new-array v1, v1, [Ljava/lang/Object;

    iget v4, p0, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->mDesiredState:I

    .line 70
    invoke-static {v4}, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->stateToString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v3

    iget v3, p0, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->mCurrentState:I

    invoke-static {v3}, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->stateToString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v0

    .line 69
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 75
    :cond_5
    invoke-direct {p0}, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->switchToDesiredState()V

    return-void

    .line 65
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    new-array v1, v1, [Ljava/lang/Object;

    .line 66
    invoke-static {v2}, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->stateToString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v3

    iget v2, p0, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->mCurrentState:I

    invoke-static {v2}, Lcom/scandit/base/camera/camera2/AsyncStartStopStateMachine;->stateToString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v0

    const-string v0, "new desired state %s is different from previous, but current state is %s"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected abstract transitionToStartedStateAsync()V
.end method

.method protected abstract transitionToStoppedStateAsync()V
.end method
