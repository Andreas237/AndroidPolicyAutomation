.class public abstract Lcom/ibotta/android/view/camera/CameraView;
.super Landroid/view/SurfaceView;
.source "CameraView.java"

# interfaces
.implements Landroid/hardware/Camera$AutoFocusCallback;
.implements Landroid/hardware/Camera$ErrorCallback;
.implements Landroid/hardware/Camera$PictureCallback;
.implements Landroid/view/SurfaceHolder$Callback;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/view/camera/CameraView$CameraListener;
    }
.end annotation


# instance fields
.field protected buildProfile:Lcom/ibotta/android/profile/BuildProfile;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected camera:Landroid/hardware/Camera;

.field private focused:Z

.field protected handler:Landroid/os/Handler;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private manualFocusJob:Ljava/lang/Runnable;

.field private manualOverride:Z

.field private manuallyFocusing:Z

.field private openTask:Landroid/os/AsyncTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/AsyncTask<",
            "Ljava/lang/Void;",
            "Ljava/lang/Void;",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private pausing:Z

.field private previewing:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 71
    invoke-direct {p0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    .line 72
    invoke-direct {p0}, Lcom/ibotta/android/view/camera/CameraView;->initHolder()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 66
    invoke-direct {p0, p1, p2}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 67
    invoke-direct {p0}, Lcom/ibotta/android/view/camera/CameraView;->initHolder()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 61
    invoke-direct {p0, p1, p2, p3}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 62
    invoke-direct {p0}, Lcom/ibotta/android/view/camera/CameraView;->initHolder()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/view/camera/CameraView;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Lcom/ibotta/android/view/camera/CameraView;->releaseCamera()V

    return-void
.end method

.method static synthetic access$102(Lcom/ibotta/android/view/camera/CameraView;Landroid/os/AsyncTask;)Landroid/os/AsyncTask;
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/view/camera/CameraView;->openTask:Landroid/os/AsyncTask;

    return-object p1
.end method

.method static synthetic access$200(Lcom/ibotta/android/view/camera/CameraView;Landroid/view/SurfaceHolder;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/camera/CameraView;->startPreview(Landroid/view/SurfaceHolder;)V

    return-void
.end method

.method private doFocus()V
    .locals 3

    .line 420
    iget-boolean v0, p0, Lcom/ibotta/android/view/camera/CameraView;->previewing:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "Can\'t start focus until preview has started."

    .line 421
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 424
    :cond_0
    iget-boolean v0, p0, Lcom/ibotta/android/view/camera/CameraView;->manuallyFocusing:Z

    if-eqz v0, :cond_1

    const-string v0, "Focusing already in progress."

    .line 425
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    const/4 v0, 0x1

    .line 429
    iput-boolean v0, p0, Lcom/ibotta/android/view/camera/CameraView;->manuallyFocusing:Z

    .line 431
    iget-object v0, p0, Lcom/ibotta/android/view/camera/CameraView;->manualFocusJob:Ljava/lang/Runnable;

    if-eqz v0, :cond_2

    const-string v0, "Cancelling a previous focus job."

    .line 432
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 433
    iget-object v0, p0, Lcom/ibotta/android/view/camera/CameraView;->handler:Landroid/os/Handler;

    iget-object v2, p0, Lcom/ibotta/android/view/camera/CameraView;->manualFocusJob:Ljava/lang/Runnable;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_2
    const-string v0, "Queueing mimic auto focus job."

    .line 436
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 437
    new-instance v0, Lcom/ibotta/android/view/camera/-$$Lambda$CameraView$bwBx5uiK9CeQPHxtbAxWrmmMi6E;

    invoke-direct {v0, p0}, Lcom/ibotta/android/view/camera/-$$Lambda$CameraView$bwBx5uiK9CeQPHxtbAxWrmmMi6E;-><init>(Lcom/ibotta/android/view/camera/CameraView;)V

    iput-object v0, p0, Lcom/ibotta/android/view/camera/CameraView;->manualFocusJob:Ljava/lang/Runnable;

    .line 451
    iget-object v0, p0, Lcom/ibotta/android/view/camera/CameraView;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/ibotta/android/view/camera/CameraView;->manualFocusJob:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private initHolder()V
    .locals 2

    .line 197
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-interface {v0, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 199
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    const/4 v1, 0x3

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->setType(I)V

    .line 201
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    const/4 v1, 0x7

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->setFormat(I)V

    return-void
.end method

.method public static synthetic lambda$doFocus$1(Lcom/ibotta/android/view/camera/CameraView;)V
    .locals 3

    .line 438
    iget-object v0, p0, Lcom/ibotta/android/view/camera/CameraView;->camera:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/ibotta/android/view/camera/CameraView;->previewing:Z

    if-eqz v0, :cond_0

    const-string v0, "Issuing focus request..."

    const/4 v1, 0x0

    .line 439
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 440
    iput-boolean v1, p0, Lcom/ibotta/android/view/camera/CameraView;->focused:Z

    .line 442
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/view/camera/CameraView;->camera:Landroid/hardware/Camera;

    invoke-virtual {v0, p0}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "Failed to request autoFocus."

    .line 445
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 448
    iput-object v0, p0, Lcom/ibotta/android/view/camera/CameraView;->manualFocusJob:Ljava/lang/Runnable;

    return-void
.end method

.method public static synthetic lambda$onPreviewStarted$0(Lcom/ibotta/android/view/camera/CameraView;Landroid/view/View;)V
    .locals 0

    .line 142
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView;->onManualOverride()V

    return-void
.end method

.method private openCamera(Landroid/view/SurfaceHolder;)V
    .locals 2

    .line 238
    iget-object v0, p0, Lcom/ibotta/android/view/camera/CameraView;->camera:Landroid/hardware/Camera;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/ibotta/android/view/camera/CameraView;->openTask:Landroid/os/AsyncTask;

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/ibotta/android/view/camera/CameraView;->pausing:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 242
    :cond_0
    new-instance v0, Lcom/ibotta/android/view/camera/CameraView$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/view/camera/CameraView$1;-><init>(Lcom/ibotta/android/view/camera/CameraView;Landroid/view/SurfaceHolder;)V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Void;

    .line 301
    instance-of v1, v0, Landroid/os/AsyncTask;

    if-nez v1, :cond_1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/camera/CameraView$1;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    move-result-object p1

    goto :goto_0

    :cond_1
    check-cast v0, Landroid/os/AsyncTask;

    invoke-static {v0, p1}, Lcom/newrelic/agent/android/instrumentation/AsyncTaskInstrumentation;->execute(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/ibotta/android/view/camera/CameraView;->openTask:Landroid/os/AsyncTask;

    return-void

    :cond_2
    :goto_1
    return-void
.end method

.method private releaseCamera()V
    .locals 4

    const-string v0, "releaseCamera"

    const/4 v1, 0x0

    .line 338
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 339
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView;->onCameraClosing()V

    .line 341
    iget-object v0, p0, Lcom/ibotta/android/view/camera/CameraView;->openTask:Landroid/os/AsyncTask;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v3, 0x1

    .line 342
    invoke-virtual {v0, v3}, Landroid/os/AsyncTask;->cancel(Z)Z

    .line 343
    iput-object v2, p0, Lcom/ibotta/android/view/camera/CameraView;->openTask:Landroid/os/AsyncTask;

    .line 346
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/view/camera/CameraView;->camera:Landroid/hardware/Camera;

    if-eqz v0, :cond_1

    .line 347
    invoke-direct {p0}, Lcom/ibotta/android/view/camera/CameraView;->stopPreview()V

    .line 348
    iget-object v0, p0, Lcom/ibotta/android/view/camera/CameraView;->camera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->release()V

    .line 349
    iput-object v2, p0, Lcom/ibotta/android/view/camera/CameraView;->camera:Landroid/hardware/Camera;

    .line 353
    :cond_1
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView;->onCameraClosed()V

    const-string v0, "Camera released."

    .line 354
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private startPreview(Landroid/view/SurfaceHolder;)V
    .locals 4

    .line 305
    iget-object v0, p0, Lcom/ibotta/android/view/camera/CameraView;->camera:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 311
    :try_start_0
    invoke-virtual {v0, p1}, Landroid/hardware/Camera;->setPreviewDisplay(Landroid/view/SurfaceHolder;)V

    .line 312
    iget-object p1, p0, Lcom/ibotta/android/view/camera/CameraView;->camera:Landroid/hardware/Camera;

    invoke-virtual {p1}, Landroid/hardware/Camera;->startPreview()V

    .line 313
    iput-boolean v1, p0, Lcom/ibotta/android/view/camera/CameraView;->previewing:Z

    .line 314
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView;->onPreviewStarted()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Error starting camera preview: %1$s"

    .line 316
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 317
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView;->getContext()Landroid/content/Context;

    move-result-object p1

    instance-of p1, p1, Lcom/ibotta/android/view/camera/CameraView$CameraListener;

    if-eqz p1, :cond_1

    .line 318
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView;->getContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/view/camera/CameraView$CameraListener;

    invoke-interface {p1}, Lcom/ibotta/android/view/camera/CameraView$CameraListener;->onCameraError()V

    :cond_1
    :goto_0
    return-void
.end method

.method private stopManualFocus()V
    .locals 3

    const-string v0, "stopManualFocus"

    const/4 v1, 0x0

    .line 455
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 456
    iget-object v0, p0, Lcom/ibotta/android/view/camera/CameraView;->manualFocusJob:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 457
    iget-object v2, p0, Lcom/ibotta/android/view/camera/CameraView;->handler:Landroid/os/Handler;

    invoke-virtual {v2, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    .line 458
    iput-object v0, p0, Lcom/ibotta/android/view/camera/CameraView;->manualFocusJob:Ljava/lang/Runnable;

    .line 461
    :cond_0
    iput-boolean v1, p0, Lcom/ibotta/android/view/camera/CameraView;->focused:Z

    .line 462
    iput-boolean v1, p0, Lcom/ibotta/android/view/camera/CameraView;->manuallyFocusing:Z

    return-void
.end method

.method private stopPreview()V
    .locals 1

    .line 324
    iget-object v0, p0, Lcom/ibotta/android/view/camera/CameraView;->camera:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    return-void

    .line 329
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V

    const/4 v0, 0x0

    .line 330
    iput-boolean v0, p0, Lcom/ibotta/android/view/camera/CameraView;->previewing:Z

    .line 331
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView;->onPreviewStopped()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method


# virtual methods
.method protected abstract initCamera()V
.end method

.method protected initFocus(Landroid/hardware/Camera$Parameters;Ljava/util/List;)V
    .locals 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/hardware/Camera$Parameters;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 359
    iget-object v0, p0, Lcom/ibotta/android/view/camera/CameraView;->camera:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p2, :cond_1

    .line 364
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p2

    .line 367
    :cond_1
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedFocusModes()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 369
    iget-object v1, p0, Lcom/ibotta/android/view/camera/CameraView;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    invoke-interface {v1}, Lcom/ibotta/android/profile/BuildProfile;->isDebugCamera()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    .line 370
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v5, "Available focus mode: %1$s"

    .line 371
    new-array v6, v2, [Ljava/lang/Object;

    aput-object v4, v6, v3

    invoke-static {v5, v6}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 376
    :cond_2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0xe

    if-lt v1, v4, :cond_3

    const/4 v1, 0x1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    .line 380
    :goto_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    const-string v5, "edof"

    .line 381
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v5, "auto"

    .line 382
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v5, "continuous-picture"

    .line 383
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 387
    invoke-interface {v4, p2}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    if-nez v1, :cond_4

    const-string p2, "continuous-picture"

    .line 390
    invoke-interface {v4, p2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 393
    :cond_4
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 394
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 395
    invoke-virtual {p1, v1}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    :cond_6
    const-string p2, "Focus mode set to: %1$s"

    .line 400
    new-array v0, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getFocusMode()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v0, v3

    invoke-static {p2, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_7
    return-void
.end method

.method public isManualFocus()Z
    .locals 1

    .line 408
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView;->shouldRequestFocus()Z

    move-result v0

    return v0
.end method

.method public onAutoFocus(ZLandroid/hardware/Camera;)V
    .locals 5

    const-string v0, "onAutoFocus: success=%1$b"

    const/4 v1, 0x1

    .line 164
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    iget-boolean v0, p0, Lcom/ibotta/android/view/camera/CameraView;->manuallyFocusing:Z

    xor-int/2addr v0, v1

    .line 166
    iput-boolean p1, p0, Lcom/ibotta/android/view/camera/CameraView;->focused:Z

    .line 167
    iput-boolean v4, p0, Lcom/ibotta/android/view/camera/CameraView;->manuallyFocusing:Z

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    .line 171
    :try_start_0
    invoke-virtual {p2, p1, p1, p1, p0}, Landroid/hardware/Camera;->takePicture(Landroid/hardware/Camera$ShutterCallback;Landroid/hardware/Camera$PictureCallback;Landroid/hardware/Camera$PictureCallback;Landroid/hardware/Camera$PictureCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Take picture failed."

    .line 173
    new-array v1, v4, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    invoke-virtual {p0, v4, p2}, Lcom/ibotta/android/view/camera/CameraView;->onError(ILandroid/hardware/Camera;)V

    :cond_0
    :goto_0
    return-void
.end method

.method protected onCameraClosed()V
    .locals 0

    return-void
.end method

.method protected onCameraClosing()V
    .locals 0

    return-void
.end method

.method protected onCameraOpened()V
    .locals 0

    return-void
.end method

.method public onError(ILandroid/hardware/Camera;)V
    .locals 2

    const-string p2, "Camera error: code=%1$d"

    const/4 v0, 0x1

    .line 189
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {p2, v0}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView;->getContext()Landroid/content/Context;

    move-result-object p1

    instance-of p1, p1, Lcom/ibotta/android/view/camera/CameraView$CameraListener;

    if-eqz p1, :cond_0

    .line 191
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView;->getContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/view/camera/CameraView$CameraListener;

    invoke-interface {p1}, Lcom/ibotta/android/view/camera/CameraView$CameraListener;->onCameraError()V

    :cond_0
    return-void
.end method

.method protected onManualOverride()V
    .locals 1

    const/4 v0, 0x1

    .line 412
    iput-boolean v0, p0, Lcom/ibotta/android/view/camera/CameraView;->manualOverride:Z

    .line 413
    invoke-direct {p0}, Lcom/ibotta/android/view/camera/CameraView;->doFocus()V

    .line 414
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView;->getContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/android/view/camera/CameraView$CameraListener;

    if-eqz v0, :cond_0

    .line 415
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/camera/CameraView$CameraListener;

    invoke-interface {v0}, Lcom/ibotta/android/view/camera/CameraView$CameraListener;->onManualOverride()V

    :cond_0
    return-void
.end method

.method public onPictureTaken([BLandroid/hardware/Camera;)V
    .locals 0

    .line 181
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView;->getContext()Landroid/content/Context;

    move-result-object p2

    instance-of p2, p2, Lcom/ibotta/android/view/camera/CameraView$CameraListener;

    if-eqz p2, :cond_0

    .line 182
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView;->getContext()Landroid/content/Context;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/view/camera/CameraView$CameraListener;

    invoke-interface {p2, p1}, Lcom/ibotta/android/view/camera/CameraView$CameraListener;->onPictureTaken([B)V

    :cond_0
    return-void
.end method

.method protected onPreviewStarted()V
    .locals 2

    .line 141
    iget-object v0, p0, Lcom/ibotta/android/view/camera/CameraView;->camera:Landroid/hardware/Camera;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView;->isManualFocus()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 142
    new-instance v0, Lcom/ibotta/android/view/camera/-$$Lambda$CameraView$zecJXh8zazITLBcWru-zje4W6aw;

    invoke-direct {v0, p0}, Lcom/ibotta/android/view/camera/-$$Lambda$CameraView$zecJXh8zazITLBcWru-zje4W6aw;-><init>(Lcom/ibotta/android/view/camera/CameraView;)V

    instance-of v1, p0, Landroid/view/View;

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/camera/CameraView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-static {v1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const/4 v0, 0x1

    .line 144
    iput-boolean v0, p0, Lcom/ibotta/android/view/camera/CameraView;->previewing:Z

    .line 145
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView;->isManualFocus()Z

    move-result v1

    if-nez v1, :cond_1

    .line 147
    iput-boolean v0, p0, Lcom/ibotta/android/view/camera/CameraView;->focused:Z

    .line 151
    :cond_1
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView;->getContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/android/view/camera/CameraView$CameraListener;

    if-eqz v0, :cond_2

    .line 152
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/camera/CameraView$CameraListener;

    invoke-interface {v0}, Lcom/ibotta/android/view/camera/CameraView$CameraListener;->onPreviewStarted()V

    :cond_2
    return-void
.end method

.method protected onPreviewStopped()V
    .locals 1

    .line 157
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView;->getContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/android/view/camera/CameraView$CameraListener;

    if-eqz v0, :cond_0

    .line 158
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/camera/CameraView$CameraListener;

    invoke-interface {v0}, Lcom/ibotta/android/view/camera/CameraView$CameraListener;->onPreviewStopped()V

    :cond_0
    return-void
.end method

.method public pause()V
    .locals 1

    const/4 v0, 0x1

    .line 76
    iput-boolean v0, p0, Lcom/ibotta/android/view/camera/CameraView;->pausing:Z

    .line 77
    invoke-direct {p0}, Lcom/ibotta/android/view/camera/CameraView;->releaseCamera()V

    const/16 v0, 0x8

    .line 78
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/camera/CameraView;->setVisibility(I)V

    return-void
.end method

.method public resume()V
    .locals 1

    const/4 v0, 0x0

    .line 82
    iput-boolean v0, p0, Lcom/ibotta/android/view/camera/CameraView;->pausing:Z

    .line 83
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/camera/CameraView;->setVisibility(I)V

    return-void
.end method

.method protected shouldRequestFocus()Z
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/view/camera/CameraView;->camera:Landroid/hardware/Camera;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 92
    :cond_0
    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getFocusMode()Ljava/lang/String;

    move-result-object v0

    .line 95
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xe

    const/4 v4, 0x1

    if-lt v2, v3, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    const-string v3, "auto"

    .line 98
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    const-string v3, "macro"

    .line 99
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    if-eqz v2, :cond_3

    const-string v2, "continuous-picture"

    .line 100
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/4 v1, 0x1

    :cond_3
    return v1
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    const-string p2, "surfaceChanged"

    const/4 p3, 0x0

    .line 217
    new-array p4, p3, [Ljava/lang/Object;

    invoke-static {p2, p4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 220
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object p2

    if-nez p2, :cond_0

    const-string p1, "Surface not available, nothing to do in surfaceChanged."

    .line 222
    new-array p2, p3, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 226
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView;->getVisibility()I

    move-result p2

    if-nez p2, :cond_1

    .line 227
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/camera/CameraView;->openCamera(Landroid/view/SurfaceHolder;)V

    .line 228
    iget-object p1, p0, Lcom/ibotta/android/view/camera/CameraView;->camera:Landroid/hardware/Camera;

    if-nez p1, :cond_2

    const-string p1, "Camera not available, nothing to do in surfaceCreated."

    .line 229
    new-array p2, p3, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 233
    :cond_1
    invoke-direct {p0}, Lcom/ibotta/android/view/camera/CameraView;->releaseCamera()V

    :cond_2
    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 1

    const-string p1, "surfaceCreated"

    const/4 v0, 0x0

    .line 205
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 2

    const-string p1, "surfaceDestroyed"

    const/4 v0, 0x0

    .line 209
    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p1, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    invoke-direct {p0}, Lcom/ibotta/android/view/camera/CameraView;->releaseCamera()V

    .line 211
    instance-of p1, p0, Landroid/view/View;

    const/4 v1, 0x0

    if-nez p1, :cond_0

    invoke-virtual {p0, v1}, Lcom/ibotta/android/view/camera/CameraView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    move-object p1, p0

    check-cast p1, Landroid/view/View;

    invoke-static {p1, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 212
    :goto_0
    invoke-direct {p0}, Lcom/ibotta/android/view/camera/CameraView;->stopManualFocus()V

    .line 213
    iput-boolean v0, p0, Lcom/ibotta/android/view/camera/CameraView;->previewing:Z

    return-void
.end method

.method public takePicture()V
    .locals 4

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/view/camera/CameraView;->camera:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    return-void

    .line 108
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView;->getContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/android/view/camera/CameraView$CameraListener;

    if-eqz v0, :cond_1

    .line 109
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/camera/CameraView$CameraListener;

    invoke-interface {v0}, Lcom/ibotta/android/view/camera/CameraView$CameraListener;->onFocusing()V

    .line 112
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/view/camera/CameraView;->camera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getFocusMode()Ljava/lang/String;

    move-result-object v0

    .line 113
    iget-boolean v1, p0, Lcom/ibotta/android/view/camera/CameraView;->manualOverride:Z

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lcom/ibotta/android/view/camera/CameraView;->focused:Z

    if-nez v1, :cond_3

    :cond_2
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView;->shouldRequestFocus()Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "Asking for focus: focusMode=%1$s"

    .line 114
    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/view/camera/CameraView;->camera:Landroid/hardware/Camera;

    invoke-virtual {v0, p0}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to invoke autoFocus."

    .line 119
    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView;->getContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/android/view/camera/CameraView$CameraListener;

    if-eqz v0, :cond_4

    .line 121
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/camera/CameraView$CameraListener;

    invoke-interface {v0}, Lcom/ibotta/android/view/camera/CameraView$CameraListener;->onFocusFail()V

    goto :goto_0

    .line 124
    :cond_3
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/CameraView;->getContext()Landroid/content/Context;

    move-result-object v1

    instance-of v1, v1, Lcom/ibotta/android/view/camera/CameraView$CameraListener;

    if-eqz v1, :cond_4

    const-string v1, "Skipping focus: focusMode=%1$s"

    .line 126
    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/view/camera/CameraView;->camera:Landroid/hardware/Camera;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1, v1, p0}, Landroid/hardware/Camera;->takePicture(Landroid/hardware/Camera$ShutterCallback;Landroid/hardware/Camera$PictureCallback;Landroid/hardware/Camera$PictureCallback;Landroid/hardware/Camera$PictureCallback;)V

    :cond_4
    :goto_0
    return-void
.end method

.method protected trackFocusFail(Ljava/lang/String;)V
    .locals 0

    return-void
.end method
