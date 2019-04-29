.class abstract Lorg/webrtc/CameraCapturer;
.super Ljava/lang/Object;
.source "CameraCapturer.java"

# interfaces
.implements Lorg/webrtc/CameraVideoCapturer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/webrtc/CameraCapturer$SwitchState;
    }
.end annotation


# static fields
.field private static final MAX_OPEN_CAMERA_ATTEMPTS:I = 0x3

.field private static final OPEN_CAMERA_DELAY_MS:I = 0x1f4

.field private static final OPEN_CAMERA_TIMEOUT:I = 0x2710

.field private static final TAG:Ljava/lang/String; = "CameraCapturer"


# instance fields
.field private applicationContext:Landroid/content/Context;

.field private final cameraEnumerator:Lorg/webrtc/CameraEnumerator;

.field private cameraName:Ljava/lang/String;

.field private final cameraSessionEventsHandler:Lorg/webrtc/CameraSession$Events;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private cameraStatistics:Lorg/webrtc/CameraVideoCapturer$CameraStatistics;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private cameraThreadHandler:Landroid/os/Handler;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private capturerObserver:Lorg/webrtc/CapturerObserver;

.field private final createSessionCallback:Lorg/webrtc/CameraSession$CreateSessionCallback;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private currentSession:Lorg/webrtc/CameraSession;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final eventsHandler:Lorg/webrtc/CameraVideoCapturer$CameraEventsHandler;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private firstFrameObserved:Z

.field private framerate:I

.field private height:I

.field private openAttemptsRemaining:I

.field private final openCameraTimeoutRunnable:Ljava/lang/Runnable;

.field private sessionOpening:Z

.field private final stateLock:Ljava/lang/Object;

.field private surfaceHelper:Lorg/webrtc/SurfaceTextureHelper;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private switchEventsHandler:Lorg/webrtc/CameraVideoCapturer$CameraSwitchHandler;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private switchState:Lorg/webrtc/CameraCapturer$SwitchState;

.field private final uiThreadHandler:Landroid/os/Handler;

.field private width:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lorg/webrtc/CameraVideoCapturer$CameraEventsHandler;Lorg/webrtc/CameraEnumerator;)V
    .locals 1
    .param p2    # Lorg/webrtc/CameraVideoCapturer$CameraEventsHandler;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 198
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v0, Lorg/webrtc/CameraCapturer$1;

    invoke-direct {v0, p0}, Lorg/webrtc/CameraCapturer$1;-><init>(Lorg/webrtc/CameraCapturer;)V

    iput-object v0, p0, Lorg/webrtc/CameraCapturer;->createSessionCallback:Lorg/webrtc/CameraSession$CreateSessionCallback;

    .line 99
    new-instance v0, Lorg/webrtc/CameraCapturer$2;

    invoke-direct {v0, p0}, Lorg/webrtc/CameraCapturer$2;-><init>(Lorg/webrtc/CameraCapturer;)V

    iput-object v0, p0, Lorg/webrtc/CameraCapturer;->cameraSessionEventsHandler:Lorg/webrtc/CameraSession$Events;

    .line 169
    new-instance v0, Lorg/webrtc/CameraCapturer$3;

    invoke-direct {v0, p0}, Lorg/webrtc/CameraCapturer$3;-><init>(Lorg/webrtc/CameraCapturer;)V

    iput-object v0, p0, Lorg/webrtc/CameraCapturer;->openCameraTimeoutRunnable:Ljava/lang/Runnable;

    .line 183
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lorg/webrtc/CameraCapturer;->stateLock:Ljava/lang/Object;

    .line 191
    sget-object v0, Lorg/webrtc/CameraCapturer$SwitchState;->IDLE:Lorg/webrtc/CameraCapturer$SwitchState;

    iput-object v0, p0, Lorg/webrtc/CameraCapturer;->switchState:Lorg/webrtc/CameraCapturer$SwitchState;

    if-nez p2, :cond_0

    .line 200
    new-instance p2, Lorg/webrtc/CameraCapturer$4;

    invoke-direct {p2, p0}, Lorg/webrtc/CameraCapturer$4;-><init>(Lorg/webrtc/CameraCapturer;)V

    .line 216
    :cond_0
    iput-object p2, p0, Lorg/webrtc/CameraCapturer;->eventsHandler:Lorg/webrtc/CameraVideoCapturer$CameraEventsHandler;

    .line 217
    iput-object p3, p0, Lorg/webrtc/CameraCapturer;->cameraEnumerator:Lorg/webrtc/CameraEnumerator;

    .line 218
    iput-object p1, p0, Lorg/webrtc/CameraCapturer;->cameraName:Ljava/lang/String;

    .line 219
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lorg/webrtc/CameraCapturer;->uiThreadHandler:Landroid/os/Handler;

    .line 221
    invoke-interface {p3}, Lorg/webrtc/CameraEnumerator;->getDeviceNames()[Ljava/lang/String;

    move-result-object p1

    .line 223
    array-length p2, p1

    if-nez p2, :cond_1

    .line 224
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "No cameras attached."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 226
    :cond_1
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iget-object p2, p0, Lorg/webrtc/CameraCapturer;->cameraName:Ljava/lang/String;

    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 227
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Camera name "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lorg/webrtc/CameraCapturer;->cameraName:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " does not match any known camera device."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void
.end method

.method static synthetic access$000(Lorg/webrtc/CameraCapturer;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Lorg/webrtc/CameraCapturer;->checkIsOnCameraThread()V

    return-void
.end method

.method static synthetic access$100(Lorg/webrtc/CameraCapturer;)Lorg/webrtc/CameraCapturer$SwitchState;
    .locals 0

    .line 20
    iget-object p0, p0, Lorg/webrtc/CameraCapturer;->switchState:Lorg/webrtc/CameraCapturer$SwitchState;

    return-object p0
.end method

.method static synthetic access$1000(Lorg/webrtc/CameraCapturer;)Lorg/webrtc/CameraVideoCapturer$CameraEventsHandler;
    .locals 0

    .line 20
    iget-object p0, p0, Lorg/webrtc/CameraCapturer;->eventsHandler:Lorg/webrtc/CameraVideoCapturer$CameraEventsHandler;

    return-object p0
.end method

.method static synthetic access$102(Lorg/webrtc/CameraCapturer;Lorg/webrtc/CameraCapturer$SwitchState;)Lorg/webrtc/CameraCapturer$SwitchState;
    .locals 0

    .line 20
    iput-object p1, p0, Lorg/webrtc/CameraCapturer;->switchState:Lorg/webrtc/CameraCapturer$SwitchState;

    return-object p1
.end method

.method static synthetic access$1100(Lorg/webrtc/CameraCapturer;)Z
    .locals 0

    .line 20
    iget-boolean p0, p0, Lorg/webrtc/CameraCapturer;->firstFrameObserved:Z

    return p0
.end method

.method static synthetic access$1102(Lorg/webrtc/CameraCapturer;Z)Z
    .locals 0

    .line 20
    iput-boolean p1, p0, Lorg/webrtc/CameraCapturer;->firstFrameObserved:Z

    return p1
.end method

.method static synthetic access$1200(Lorg/webrtc/CameraCapturer;)Lorg/webrtc/CameraVideoCapturer$CameraSwitchHandler;
    .locals 0

    .line 20
    iget-object p0, p0, Lorg/webrtc/CameraCapturer;->switchEventsHandler:Lorg/webrtc/CameraVideoCapturer$CameraSwitchHandler;

    return-object p0
.end method

.method static synthetic access$1202(Lorg/webrtc/CameraCapturer;Lorg/webrtc/CameraVideoCapturer$CameraSwitchHandler;)Lorg/webrtc/CameraVideoCapturer$CameraSwitchHandler;
    .locals 0

    .line 20
    iput-object p1, p0, Lorg/webrtc/CameraCapturer;->switchEventsHandler:Lorg/webrtc/CameraVideoCapturer$CameraSwitchHandler;

    return-object p1
.end method

.method static synthetic access$1300(Lorg/webrtc/CameraCapturer;)Ljava/lang/String;
    .locals 0

    .line 20
    iget-object p0, p0, Lorg/webrtc/CameraCapturer;->cameraName:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$1400(Lorg/webrtc/CameraCapturer;)Lorg/webrtc/CameraEnumerator;
    .locals 0

    .line 20
    iget-object p0, p0, Lorg/webrtc/CameraCapturer;->cameraEnumerator:Lorg/webrtc/CameraEnumerator;

    return-object p0
.end method

.method static synthetic access$1500(Lorg/webrtc/CameraCapturer;Lorg/webrtc/CameraVideoCapturer$CameraSwitchHandler;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lorg/webrtc/CameraCapturer;->switchCameraInternal(Lorg/webrtc/CameraVideoCapturer$CameraSwitchHandler;)V

    return-void
.end method

.method static synthetic access$1600(Lorg/webrtc/CameraCapturer;)I
    .locals 0

    .line 20
    iget p0, p0, Lorg/webrtc/CameraCapturer;->openAttemptsRemaining:I

    return p0
.end method

.method static synthetic access$1610(Lorg/webrtc/CameraCapturer;)I
    .locals 2

    .line 20
    iget v0, p0, Lorg/webrtc/CameraCapturer;->openAttemptsRemaining:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lorg/webrtc/CameraCapturer;->openAttemptsRemaining:I

    return v0
.end method

.method static synthetic access$1700(Lorg/webrtc/CameraCapturer;I)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lorg/webrtc/CameraCapturer;->createSessionInternal(I)V

    return-void
.end method

.method static synthetic access$1800(Lorg/webrtc/CameraCapturer;)Lorg/webrtc/CameraSession$CreateSessionCallback;
    .locals 0

    .line 20
    iget-object p0, p0, Lorg/webrtc/CameraCapturer;->createSessionCallback:Lorg/webrtc/CameraSession$CreateSessionCallback;

    return-object p0
.end method

.method static synthetic access$1900(Lorg/webrtc/CameraCapturer;)Lorg/webrtc/CameraSession$Events;
    .locals 0

    .line 20
    iget-object p0, p0, Lorg/webrtc/CameraCapturer;->cameraSessionEventsHandler:Lorg/webrtc/CameraSession$Events;

    return-object p0
.end method

.method static synthetic access$200(Lorg/webrtc/CameraCapturer;)Ljava/lang/Runnable;
    .locals 0

    .line 20
    iget-object p0, p0, Lorg/webrtc/CameraCapturer;->openCameraTimeoutRunnable:Ljava/lang/Runnable;

    return-object p0
.end method

.method static synthetic access$2000(Lorg/webrtc/CameraCapturer;)Landroid/content/Context;
    .locals 0

    .line 20
    iget-object p0, p0, Lorg/webrtc/CameraCapturer;->applicationContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$2100(Lorg/webrtc/CameraCapturer;)I
    .locals 0

    .line 20
    iget p0, p0, Lorg/webrtc/CameraCapturer;->width:I

    return p0
.end method

.method static synthetic access$2200(Lorg/webrtc/CameraCapturer;)I
    .locals 0

    .line 20
    iget p0, p0, Lorg/webrtc/CameraCapturer;->height:I

    return p0
.end method

.method static synthetic access$2300(Lorg/webrtc/CameraCapturer;)I
    .locals 0

    .line 20
    iget p0, p0, Lorg/webrtc/CameraCapturer;->framerate:I

    return p0
.end method

.method static synthetic access$300(Lorg/webrtc/CameraCapturer;)Landroid/os/Handler;
    .locals 0

    .line 20
    iget-object p0, p0, Lorg/webrtc/CameraCapturer;->uiThreadHandler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$400(Lorg/webrtc/CameraCapturer;)Ljava/lang/Object;
    .locals 0

    .line 20
    iget-object p0, p0, Lorg/webrtc/CameraCapturer;->stateLock:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic access$500(Lorg/webrtc/CameraCapturer;)Lorg/webrtc/CapturerObserver;
    .locals 0

    .line 20
    iget-object p0, p0, Lorg/webrtc/CameraCapturer;->capturerObserver:Lorg/webrtc/CapturerObserver;

    return-object p0
.end method

.method static synthetic access$602(Lorg/webrtc/CameraCapturer;Z)Z
    .locals 0

    .line 20
    iput-boolean p1, p0, Lorg/webrtc/CameraCapturer;->sessionOpening:Z

    return p1
.end method

.method static synthetic access$700(Lorg/webrtc/CameraCapturer;)Lorg/webrtc/CameraSession;
    .locals 0

    .line 20
    iget-object p0, p0, Lorg/webrtc/CameraCapturer;->currentSession:Lorg/webrtc/CameraSession;

    return-object p0
.end method

.method static synthetic access$702(Lorg/webrtc/CameraCapturer;Lorg/webrtc/CameraSession;)Lorg/webrtc/CameraSession;
    .locals 0

    .line 20
    iput-object p1, p0, Lorg/webrtc/CameraCapturer;->currentSession:Lorg/webrtc/CameraSession;

    return-object p1
.end method

.method static synthetic access$800(Lorg/webrtc/CameraCapturer;)Lorg/webrtc/CameraVideoCapturer$CameraStatistics;
    .locals 0

    .line 20
    iget-object p0, p0, Lorg/webrtc/CameraCapturer;->cameraStatistics:Lorg/webrtc/CameraVideoCapturer$CameraStatistics;

    return-object p0
.end method

.method static synthetic access$802(Lorg/webrtc/CameraCapturer;Lorg/webrtc/CameraVideoCapturer$CameraStatistics;)Lorg/webrtc/CameraVideoCapturer$CameraStatistics;
    .locals 0

    .line 20
    iput-object p1, p0, Lorg/webrtc/CameraCapturer;->cameraStatistics:Lorg/webrtc/CameraVideoCapturer$CameraStatistics;

    return-object p1
.end method

.method static synthetic access$900(Lorg/webrtc/CameraCapturer;)Lorg/webrtc/SurfaceTextureHelper;
    .locals 0

    .line 20
    iget-object p0, p0, Lorg/webrtc/CameraCapturer;->surfaceHelper:Lorg/webrtc/SurfaceTextureHelper;

    return-object p0
.end method

.method private checkIsOnCameraThread()V
    .locals 2

    .line 421
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lorg/webrtc/CameraCapturer;->cameraThreadHandler:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq v0, v1, :cond_0

    const-string v0, "CameraCapturer"

    const-string v1, "Check is on camera thread failed."

    .line 422
    invoke-static {v0, v1}, Lorg/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 423
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Not on camera thread."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method private createSessionInternal(I)V
    .locals 4

    .line 266
    iget-object v0, p0, Lorg/webrtc/CameraCapturer;->uiThreadHandler:Landroid/os/Handler;

    iget-object v1, p0, Lorg/webrtc/CameraCapturer;->openCameraTimeoutRunnable:Ljava/lang/Runnable;

    add-int/lit16 v2, p1, 0x2710

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 267
    iget-object v0, p0, Lorg/webrtc/CameraCapturer;->cameraThreadHandler:Landroid/os/Handler;

    new-instance v1, Lorg/webrtc/CameraCapturer$5;

    invoke-direct {v1, p0}, Lorg/webrtc/CameraCapturer$5;-><init>(Lorg/webrtc/CameraCapturer;)V

    int-to-long v2, p1

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private reportCameraSwitchError(Ljava/lang/String;Lorg/webrtc/CameraVideoCapturer$CameraSwitchHandler;)V
    .locals 1
    .param p2    # Lorg/webrtc/CameraVideoCapturer$CameraSwitchHandler;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    const-string v0, "CameraCapturer"

    .line 362
    invoke-static {v0, p1}, Lorg/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 364
    invoke-interface {p2, p1}, Lorg/webrtc/CameraVideoCapturer$CameraSwitchHandler;->onCameraSwitchError(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private switchCameraInternal(Lorg/webrtc/CameraVideoCapturer$CameraSwitchHandler;)V
    .locals 5
    .param p1    # Lorg/webrtc/CameraVideoCapturer$CameraSwitchHandler;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    const-string v0, "CameraCapturer"

    const-string v1, "switchCamera internal"

    .line 369
    invoke-static {v0, v1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 371
    iget-object v0, p0, Lorg/webrtc/CameraCapturer;->cameraEnumerator:Lorg/webrtc/CameraEnumerator;

    invoke-interface {v0}, Lorg/webrtc/CameraEnumerator;->getDeviceNames()[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    .line 373
    array-length v2, v0

    if-ge v2, v1, :cond_1

    if-eqz p1, :cond_0

    const-string v0, "No camera to switch to."

    .line 375
    invoke-interface {p1, v0}, Lorg/webrtc/CameraVideoCapturer$CameraSwitchHandler;->onCameraSwitchError(Ljava/lang/String;)V

    :cond_0
    return-void

    .line 380
    :cond_1
    iget-object v1, p0, Lorg/webrtc/CameraCapturer;->stateLock:Ljava/lang/Object;

    monitor-enter v1

    .line 381
    :try_start_0
    iget-object v2, p0, Lorg/webrtc/CameraCapturer;->switchState:Lorg/webrtc/CameraCapturer$SwitchState;

    sget-object v3, Lorg/webrtc/CameraCapturer$SwitchState;->IDLE:Lorg/webrtc/CameraCapturer$SwitchState;

    if-eq v2, v3, :cond_2

    const-string v0, "Camera switch already in progress."

    .line 382
    invoke-direct {p0, v0, p1}, Lorg/webrtc/CameraCapturer;->reportCameraSwitchError(Ljava/lang/String;Lorg/webrtc/CameraVideoCapturer$CameraSwitchHandler;)V

    .line 383
    monitor-exit v1

    return-void

    .line 385
    :cond_2
    iget-boolean v2, p0, Lorg/webrtc/CameraCapturer;->sessionOpening:Z

    if-nez v2, :cond_3

    iget-object v2, p0, Lorg/webrtc/CameraCapturer;->currentSession:Lorg/webrtc/CameraSession;

    if-nez v2, :cond_3

    const-string v0, "switchCamera: camera is not running."

    .line 386
    invoke-direct {p0, v0, p1}, Lorg/webrtc/CameraCapturer;->reportCameraSwitchError(Ljava/lang/String;Lorg/webrtc/CameraVideoCapturer$CameraSwitchHandler;)V

    .line 387
    monitor-exit v1

    return-void

    .line 390
    :cond_3
    iput-object p1, p0, Lorg/webrtc/CameraCapturer;->switchEventsHandler:Lorg/webrtc/CameraVideoCapturer$CameraSwitchHandler;

    .line 391
    iget-boolean p1, p0, Lorg/webrtc/CameraCapturer;->sessionOpening:Z

    if-eqz p1, :cond_4

    .line 392
    sget-object p1, Lorg/webrtc/CameraCapturer$SwitchState;->PENDING:Lorg/webrtc/CameraCapturer$SwitchState;

    iput-object p1, p0, Lorg/webrtc/CameraCapturer;->switchState:Lorg/webrtc/CameraCapturer$SwitchState;

    .line 393
    monitor-exit v1

    return-void

    .line 395
    :cond_4
    sget-object p1, Lorg/webrtc/CameraCapturer$SwitchState;->IN_PROGRESS:Lorg/webrtc/CameraCapturer$SwitchState;

    iput-object p1, p0, Lorg/webrtc/CameraCapturer;->switchState:Lorg/webrtc/CameraCapturer$SwitchState;

    const-string p1, "CameraCapturer"

    const-string v2, "switchCamera: Stopping session"

    .line 398
    invoke-static {p1, v2}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 399
    iget-object p1, p0, Lorg/webrtc/CameraCapturer;->cameraStatistics:Lorg/webrtc/CameraVideoCapturer$CameraStatistics;

    invoke-virtual {p1}, Lorg/webrtc/CameraVideoCapturer$CameraStatistics;->release()V

    const/4 p1, 0x0

    .line 400
    iput-object p1, p0, Lorg/webrtc/CameraCapturer;->cameraStatistics:Lorg/webrtc/CameraVideoCapturer$CameraStatistics;

    .line 401
    iget-object v2, p0, Lorg/webrtc/CameraCapturer;->currentSession:Lorg/webrtc/CameraSession;

    .line 402
    iget-object v3, p0, Lorg/webrtc/CameraCapturer;->cameraThreadHandler:Landroid/os/Handler;

    new-instance v4, Lorg/webrtc/CameraCapturer$8;

    invoke-direct {v4, p0, v2}, Lorg/webrtc/CameraCapturer$8;-><init>(Lorg/webrtc/CameraCapturer;Lorg/webrtc/CameraSession;)V

    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 408
    iput-object p1, p0, Lorg/webrtc/CameraCapturer;->currentSession:Lorg/webrtc/CameraSession;

    .line 410
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iget-object v2, p0, Lorg/webrtc/CameraCapturer;->cameraName:Ljava/lang/String;

    invoke-interface {p1, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    const/4 v2, 0x1

    add-int/2addr p1, v2

    .line 411
    array-length v3, v0

    rem-int/2addr p1, v3

    aget-object p1, v0, p1

    iput-object p1, p0, Lorg/webrtc/CameraCapturer;->cameraName:Ljava/lang/String;

    .line 413
    iput-boolean v2, p0, Lorg/webrtc/CameraCapturer;->sessionOpening:Z

    .line 414
    iput v2, p0, Lorg/webrtc/CameraCapturer;->openAttemptsRemaining:I

    const/4 p1, 0x0

    .line 415
    invoke-direct {p0, p1}, Lorg/webrtc/CameraCapturer;->createSessionInternal(I)V

    .line 416
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string p1, "CameraCapturer"

    const-string v0, "switchCamera done"

    .line 417
    invoke-static {p1, v0}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception p1

    .line 416
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method


# virtual methods
.method public addMediaRecorderToCamera(Landroid/media/MediaRecorder;Lorg/webrtc/CameraVideoCapturer$MediaRecorderHandler;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lorg/webrtc/CameraVideoCapturer$$CC;->addMediaRecorderToCamera(Lorg/webrtc/CameraVideoCapturer;Landroid/media/MediaRecorder;Lorg/webrtc/CameraVideoCapturer$MediaRecorderHandler;)V

    return-void
.end method

.method public changeCaptureFormat(III)V
    .locals 3

    const-string v0, "CameraCapturer"

    .line 315
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "changeCaptureFormat: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "@"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 316
    iget-object v0, p0, Lorg/webrtc/CameraCapturer;->stateLock:Ljava/lang/Object;

    monitor-enter v0

    .line 317
    :try_start_0
    invoke-virtual {p0}, Lorg/webrtc/CameraCapturer;->stopCapture()V

    .line 318
    invoke-virtual {p0, p1, p2, p3}, Lorg/webrtc/CameraCapturer;->startCapture(III)V

    .line 319
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method protected abstract createCameraSession(Lorg/webrtc/CameraSession$CreateSessionCallback;Lorg/webrtc/CameraSession$Events;Landroid/content/Context;Lorg/webrtc/SurfaceTextureHelper;Ljava/lang/String;III)V
.end method

.method public dispose()V
    .locals 2

    const-string v0, "CameraCapturer"

    const-string v1, "dispose"

    .line 324
    invoke-static {v0, v1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 325
    invoke-virtual {p0}, Lorg/webrtc/CameraCapturer;->stopCapture()V

    return-void
.end method

.method protected getCameraName()Ljava/lang/String;
    .locals 2

    .line 428
    iget-object v0, p0, Lorg/webrtc/CameraCapturer;->stateLock:Ljava/lang/Object;

    monitor-enter v0

    .line 429
    :try_start_0
    iget-object v1, p0, Lorg/webrtc/CameraCapturer;->cameraName:Ljava/lang/String;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 430
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public initialize(Lorg/webrtc/SurfaceTextureHelper;Landroid/content/Context;Lorg/webrtc/CapturerObserver;)V
    .locals 0
    .param p1    # Lorg/webrtc/SurfaceTextureHelper;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 235
    iput-object p2, p0, Lorg/webrtc/CameraCapturer;->applicationContext:Landroid/content/Context;

    .line 236
    iput-object p3, p0, Lorg/webrtc/CameraCapturer;->capturerObserver:Lorg/webrtc/CapturerObserver;

    .line 237
    iput-object p1, p0, Lorg/webrtc/CameraCapturer;->surfaceHelper:Lorg/webrtc/SurfaceTextureHelper;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 239
    :cond_0
    invoke-virtual {p1}, Lorg/webrtc/SurfaceTextureHelper;->getHandler()Landroid/os/Handler;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lorg/webrtc/CameraCapturer;->cameraThreadHandler:Landroid/os/Handler;

    return-void
.end method

.method public isScreencast()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public printStackTrace()V
    .locals 5

    .line 346
    iget-object v0, p0, Lorg/webrtc/CameraCapturer;->cameraThreadHandler:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 347
    iget-object v0, p0, Lorg/webrtc/CameraCapturer;->cameraThreadHandler:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 350
    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    .line 351
    array-length v1, v0

    if-lez v1, :cond_1

    const-string v1, "CameraCapturer"

    const-string v2, "CameraCapturer stack trace:"

    .line 352
    invoke-static {v1, v2}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 353
    array-length v1, v0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    const-string v4, "CameraCapturer"

    .line 354
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public removeMediaRecorderFromCamera(Lorg/webrtc/CameraVideoCapturer$MediaRecorderHandler;)V
    .locals 0

    invoke-static {p0, p1}, Lorg/webrtc/CameraVideoCapturer$$CC;->removeMediaRecorderFromCamera(Lorg/webrtc/CameraVideoCapturer;Lorg/webrtc/CameraVideoCapturer$MediaRecorderHandler;)V

    return-void
.end method

.method public startCapture(III)V
    .locals 3

    const-string v0, "CameraCapturer"

    .line 244
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "startCapture: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "@"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    iget-object v0, p0, Lorg/webrtc/CameraCapturer;->applicationContext:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 246
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "CameraCapturer must be initialized before calling startCapture."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 249
    :cond_0
    iget-object v0, p0, Lorg/webrtc/CameraCapturer;->stateLock:Ljava/lang/Object;

    monitor-enter v0

    .line 250
    :try_start_0
    iget-boolean v1, p0, Lorg/webrtc/CameraCapturer;->sessionOpening:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Lorg/webrtc/CameraCapturer;->currentSession:Lorg/webrtc/CameraSession;

    if-eqz v1, :cond_1

    goto :goto_0

    .line 255
    :cond_1
    iput p1, p0, Lorg/webrtc/CameraCapturer;->width:I

    .line 256
    iput p2, p0, Lorg/webrtc/CameraCapturer;->height:I

    .line 257
    iput p3, p0, Lorg/webrtc/CameraCapturer;->framerate:I

    const/4 p1, 0x1

    .line 259
    iput-boolean p1, p0, Lorg/webrtc/CameraCapturer;->sessionOpening:Z

    const/4 p1, 0x3

    .line 260
    iput p1, p0, Lorg/webrtc/CameraCapturer;->openAttemptsRemaining:I

    const/4 p1, 0x0

    .line 261
    invoke-direct {p0, p1}, Lorg/webrtc/CameraCapturer;->createSessionInternal(I)V

    .line 262
    monitor-exit v0

    return-void

    :cond_2
    :goto_0
    const-string p1, "CameraCapturer"

    const-string p2, "Session already open"

    .line 251
    invoke-static {p1, p2}, Lorg/webrtc/Logging;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 262
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public stopCapture()V
    .locals 5

    const-string v0, "CameraCapturer"

    const-string v1, "Stop capture"

    .line 278
    invoke-static {v0, v1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    iget-object v0, p0, Lorg/webrtc/CameraCapturer;->stateLock:Ljava/lang/Object;

    monitor-enter v0

    .line 281
    :goto_0
    :try_start_0
    iget-boolean v1, p0, Lorg/webrtc/CameraCapturer;->sessionOpening:Z

    if-eqz v1, :cond_0

    const-string v1, "CameraCapturer"

    const-string v2, "Stop capture: Waiting for session to open"

    .line 282
    invoke-static {v1, v2}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 284
    :try_start_1
    iget-object v1, p0, Lorg/webrtc/CameraCapturer;->stateLock:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    :try_start_2
    const-string v1, "CameraCapturer"

    const-string v2, "Stop capture interrupted while waiting for the session to open."

    .line 286
    invoke-static {v1, v2}, Lorg/webrtc/Logging;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 288
    monitor-exit v0

    return-void

    .line 292
    :cond_0
    iget-object v1, p0, Lorg/webrtc/CameraCapturer;->currentSession:Lorg/webrtc/CameraSession;

    if-eqz v1, :cond_1

    const-string v1, "CameraCapturer"

    const-string v2, "Stop capture: Nulling session"

    .line 293
    invoke-static {v1, v2}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 294
    iget-object v1, p0, Lorg/webrtc/CameraCapturer;->cameraStatistics:Lorg/webrtc/CameraVideoCapturer$CameraStatistics;

    invoke-virtual {v1}, Lorg/webrtc/CameraVideoCapturer$CameraStatistics;->release()V

    const/4 v1, 0x0

    .line 295
    iput-object v1, p0, Lorg/webrtc/CameraCapturer;->cameraStatistics:Lorg/webrtc/CameraVideoCapturer$CameraStatistics;

    .line 296
    iget-object v2, p0, Lorg/webrtc/CameraCapturer;->currentSession:Lorg/webrtc/CameraSession;

    .line 297
    iget-object v3, p0, Lorg/webrtc/CameraCapturer;->cameraThreadHandler:Landroid/os/Handler;

    new-instance v4, Lorg/webrtc/CameraCapturer$6;

    invoke-direct {v4, p0, v2}, Lorg/webrtc/CameraCapturer$6;-><init>(Lorg/webrtc/CameraCapturer;Lorg/webrtc/CameraSession;)V

    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 303
    iput-object v1, p0, Lorg/webrtc/CameraCapturer;->currentSession:Lorg/webrtc/CameraSession;

    .line 304
    iget-object v1, p0, Lorg/webrtc/CameraCapturer;->capturerObserver:Lorg/webrtc/CapturerObserver;

    invoke-interface {v1}, Lorg/webrtc/CapturerObserver;->onCapturerStopped()V

    goto :goto_1

    :cond_1
    const-string v1, "CameraCapturer"

    const-string v2, "Stop capture: No session open"

    .line 306
    invoke-static {v1, v2}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v0, "CameraCapturer"

    const-string v1, "Stop capture done"

    .line 310
    invoke-static {v0, v1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception v1

    .line 308
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method

.method public switchCamera(Lorg/webrtc/CameraVideoCapturer$CameraSwitchHandler;)V
    .locals 2

    const-string v0, "CameraCapturer"

    const-string v1, "switchCamera"

    .line 330
    invoke-static {v0, v1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 331
    iget-object v0, p0, Lorg/webrtc/CameraCapturer;->cameraThreadHandler:Landroid/os/Handler;

    new-instance v1, Lorg/webrtc/CameraCapturer$7;

    invoke-direct {v1, p0, p1}, Lorg/webrtc/CameraCapturer$7;-><init>(Lorg/webrtc/CameraCapturer;Lorg/webrtc/CameraVideoCapturer$CameraSwitchHandler;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
