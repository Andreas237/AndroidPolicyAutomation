.class public Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;


# static fields
.field private static final AF_FAIL_TIMEOUT_INTERVAL:I = 0x1f4

.field private static final AF_TIMEOUT_INTERVAL:I = 0xbb8


# instance fields
.field private final mAutofocusCallback:Landroid/hardware/Camera$AutoFocusCallback;

.field protected volatile mAutofocusInProgress:Z

.field protected mCamera:Landroid/hardware/Camera;

.field private mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

.field private mFocusAreas:[Landroid/graphics/Rect;

.field private volatile mFocusPaused:Z

.field protected volatile mFocused:Z

.field private mNumFailedAutofocusAttempts:I

.field private mStatusView:Lcom/microblink/camera/hardware/camera/AutofocusListener;

.field protected mTimer:Ljava/util/Timer;

.field private volatile reqCnt:I


# direct methods
.method public constructor <init>(Lcom/microblink/camera/hardware/camera/AutofocusListener;Lcom/microblink/camera/hardware/DeviceManager;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mFocused:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mTimer:Ljava/util/Timer;

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mFocusPaused:Z

    iput v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mNumFailedAutofocusAttempts:I

    iput-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mFocusAreas:[Landroid/graphics/Rect;

    iput v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->reqCnt:I

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$2;

    invoke-direct {v0, p0}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$2;-><init>(Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;)V

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mAutofocusCallback:Landroid/hardware/Camera$AutoFocusCallback;

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mStatusView:Lcom/microblink/camera/hardware/camera/AutofocusListener;

    iput-object p2, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/DeviceManager;->hasDeviceListsLoaded()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Device manager needs to have device lists loaded"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic access$000(Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;)Lcom/microblink/camera/hardware/camera/AutofocusListener;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mStatusView:Lcom/microblink/camera/hardware/camera/AutofocusListener;

    return-object p0
.end method

.method static synthetic access$100(Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;)[Landroid/graphics/Rect;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mFocusAreas:[Landroid/graphics/Rect;

    return-object p0
.end method

.method static synthetic access$200(Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;)I
    .locals 0

    iget p0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->reqCnt:I

    return p0
.end method

.method static synthetic access$210(Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;)I
    .locals 2

    iget v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->reqCnt:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->reqCnt:I

    return v0
.end method

.method static synthetic access$300(Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;)Lcom/microblink/camera/hardware/DeviceManager;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    return-object p0
.end method

.method static synthetic access$400(Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->invalidateFocus(I)V

    return-void
.end method

.method static synthetic access$500(Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;)I
    .locals 0

    iget p0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mNumFailedAutofocusAttempts:I

    return p0
.end method

.method static synthetic access$502(Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;I)I
    .locals 0

    iput p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mNumFailedAutofocusAttempts:I

    return p1
.end method

.method static synthetic access$508(Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;)I
    .locals 2

    iget v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mNumFailedAutofocusAttempts:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mNumFailedAutofocusAttempts:I

    return v0
.end method

.method static synthetic access$600(Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mFocusPaused:Z

    return p0
.end method

.method private doAutofocus(ZLandroid/hardware/Camera$AutoFocusCallback;)V
    .locals 3

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mCamera:Landroid/hardware/Camera;

    if-eqz v0, :cond_5

    if-eqz p2, :cond_5

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mFocusPaused:Z

    if-nez v0, :cond_5

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mFocused:Z

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mFocused:Z

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mAutofocusCallback:Landroid/hardware/Camera$AutoFocusCallback;

    if-eq p2, p1, :cond_5

    const-string p1, "Frame should be focused..."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, p1, v1}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->reqCnt:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->reqCnt:I

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mCamera:Landroid/hardware/Camera;

    invoke-interface {p2, v0, p1}, Landroid/hardware/Camera$AutoFocusCallback;->onAutoFocus(ZLandroid/hardware/Camera;)V

    goto :goto_1

    :cond_1
    :goto_0
    iget-boolean p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mAutofocusInProgress:Z

    if-nez p1, :cond_4

    :try_start_0
    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mAutofocusInProgress:Z

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mTimer:Ljava/util/Timer;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mTimer:Ljava/util/Timer;

    invoke-virtual {p1}, Ljava/util/Timer;->cancel()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mTimer:Ljava/util/Timer;

    :cond_2
    const-string p1, "requesting autofocus..."

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p0, p1, v2}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->reqCnt:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->reqCnt:I

    const-string p1, "Requests count: {}"

    new-array v0, v0, [Ljava/lang/Object;

    iget v2, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->reqCnt:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {p0, p1, v0}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mStatusView:Lcom/microblink/camera/hardware/camera/AutofocusListener;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mStatusView:Lcom/microblink/camera/hardware/camera/AutofocusListener;

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mFocusAreas:[Landroid/graphics/Rect;

    invoke-interface {p1, v0}, Lcom/microblink/camera/hardware/camera/AutofocusListener;->onAutofocusStarted([Landroid/graphics/Rect;)V

    :cond_3
    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {p1, p2}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V

    const-string p1, "request issued"

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p0, p1, v0}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "Autofocus call failed!"

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p0, p1, v0, v2}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mCamera:Landroid/hardware/Camera;

    invoke-interface {p2, v1, p1}, Landroid/hardware/Camera$AutoFocusCallback;->onAutoFocus(ZLandroid/hardware/Camera;)V

    return-void

    :cond_4
    const-string p1, "Autofocus is in progress..."

    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p0, p1, p2}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_5
    :goto_1
    return-void
.end method

.method private invalidateFocus(I)V
    .locals 3

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mTimer:Ljava/util/Timer;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/Timer;->cancel()V

    :cond_0
    new-instance p1, Ljava/util/Timer;

    invoke-direct {p1}, Ljava/util/Timer;-><init>()V

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mTimer:Ljava/util/Timer;

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mTimer:Ljava/util/Timer;

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$1;

    invoke-direct {v0, p0}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$1;-><init>(Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;)V

    const-wide/16 v1, 0xbb8

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    const-string p1, "focus timer set"

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, v0}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public cancelOngoingFocus()V
    .locals 4

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mCamera:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mAutofocusInProgress:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v1}, Landroid/hardware/Camera;->cancelAutoFocus()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "There has been error in cancelling autofocus cycle. This probably a bug in device"

    new-array v3, v0, [Ljava/lang/Object;

    invoke-static {p0, v1, v2, v3}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mAutofocusInProgress:Z

    iget v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->reqCnt:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->reqCnt:I

    :cond_0
    return-void
.end method

.method public checkFocus()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->doAutofocus(Z)V

    return-void
.end method

.method public dispose()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mCamera:Landroid/hardware/Camera;

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mTimer:Ljava/util/Timer;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/util/Timer;->cancel()V

    :cond_0
    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mTimer:Ljava/util/Timer;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mStatusView:Lcom/microblink/camera/hardware/camera/AutofocusListener;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mFocusAreas:[Landroid/graphics/Rect;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mDeviceManager:Lcom/microblink/camera/hardware/DeviceManager;

    return-void
.end method

.method public doAutofocus(Z)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mAutofocusCallback:Landroid/hardware/Camera$AutoFocusCallback;

    invoke-direct {p0, p1, v0}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->doAutofocus(ZLandroid/hardware/Camera$AutoFocusCallback;)V

    return-void
.end method

.method public invalidateFocus()V
    .locals 3

    const-string v0, "invalidating focus"

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v2}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iput-boolean v1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mFocused:Z

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mTimer:Ljava/util/Timer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mTimer:Ljava/util/Timer;

    return-void
.end method

.method public isAutofocusing()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mAutofocusInProgress:Z

    return v0
.end method

.method public isCameraFocused()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mFocused:Z

    return v0
.end method

.method public isContinuous()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isFocusManagerPaused()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mFocusPaused:Z

    return v0
.end method

.method public pauseFocusing()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mFocusPaused:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mFocused:Z

    return-void
.end method

.method public resumeFocusing()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mFocusPaused:Z

    return-void
.end method

.method public setCamera(Landroid/hardware/Camera;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mCamera:Landroid/hardware/Camera;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mAutofocusInProgress:Z

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mTimer:Ljava/util/Timer;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/Timer;->cancel()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mTimer:Ljava/util/Timer;

    :cond_0
    return-void
.end method

.method public setMeteringAreas([Landroid/graphics/Rect;)V
    .locals 10
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mCamera:Landroid/hardware/Camera;

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
    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v2, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mFocusAreas:[Landroid/graphics/Rect;

    invoke-virtual {p0}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->invalidateFocus()V

    invoke-virtual {p0, v1}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->doAutofocus(Z)V
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

    const-string v0, "Failed to get camera parameters. Cannot set metering areas!"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, p1, v0, v1}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_3
    const-string p1, "Cannot set focus area, camera is null"

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p0, p1, v0}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
