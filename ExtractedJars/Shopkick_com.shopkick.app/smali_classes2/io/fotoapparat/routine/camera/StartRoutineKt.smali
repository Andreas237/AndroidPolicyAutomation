.class public final Lio/fotoapparat/routine/camera/StartRoutineKt;
.super Ljava/lang/Object;
.source "StartRoutine.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStartRoutine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartRoutine.kt\nio/fotoapparat/routine/camera/StartRoutineKt\n*L\n1#1,79:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006j\u0002`\u0008H\u0000\u001a\u0014\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u00a8\u0006\n"
    }
    d2 = {
        "bootStart",
        "",
        "Lio/fotoapparat/hardware/Device;",
        "orientationSensor",
        "Lio/fotoapparat/hardware/orientation/OrientationSensor;",
        "mainThreadErrorCallback",
        "Lkotlin/Function1;",
        "Lio/fotoapparat/exception/camera/CameraException;",
        "Lio/fotoapparat/error/CameraErrorCallback;",
        "start",
        "fotoapparat_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public static final bootStart(Lio/fotoapparat/hardware/Device;Lio/fotoapparat/hardware/orientation/OrientationSensor;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p0    # Lio/fotoapparat/hardware/Device;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lio/fotoapparat/hardware/orientation/OrientationSensor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/fotoapparat/hardware/Device;",
            "Lio/fotoapparat/hardware/orientation/OrientationSensor;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lio/fotoapparat/exception/camera/CameraException;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "orientationSensor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mainThreadErrorCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-virtual {p0}, Lio/fotoapparat/hardware/Device;->hasSelectedCamera()Z

    move-result v0

    if-nez v0, :cond_0

    .line 24
    :try_start_0
    invoke-static {p0, p1}, Lio/fotoapparat/routine/camera/StartRoutineKt;->start(Lio/fotoapparat/hardware/Device;Lio/fotoapparat/hardware/orientation/OrientationSensor;)V

    .line 27
    invoke-static {p0, p1}, Lio/fotoapparat/routine/orientation/StartOrientationRoutineKt;->startOrientationMonitoring(Lio/fotoapparat/hardware/Device;Lio/fotoapparat/hardware/orientation/OrientationSensor;)V
    :try_end_0
    .catch Lio/fotoapparat/exception/camera/CameraException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 31
    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void

    .line 20
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Camera has already started!"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Throwable;

    throw p0
.end method

.method public static final start(Lio/fotoapparat/hardware/Device;Lio/fotoapparat/hardware/orientation/OrientationSensor;)V
    .locals 3
    .param p0    # Lio/fotoapparat/hardware/Device;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lio/fotoapparat/hardware/orientation/OrientationSensor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "orientationSensor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    invoke-virtual {p0}, Lio/fotoapparat/hardware/Device;->selectCamera()V

    .line 41
    invoke-virtual {p0}, Lio/fotoapparat/hardware/Device;->getSelectedCamera()Lio/fotoapparat/hardware/CameraDevice;

    move-result-object v0

    .line 42
    invoke-virtual {v0}, Lio/fotoapparat/hardware/CameraDevice;->open()V

    .line 44
    invoke-static {p0, v0}, Lio/fotoapparat/routine/camera/UpdateConfigurationRoutineKt;->updateCameraConfiguration(Lio/fotoapparat/hardware/Device;Lio/fotoapparat/hardware/CameraDevice;)V

    .line 47
    invoke-virtual {p1}, Lio/fotoapparat/hardware/orientation/OrientationSensor;->getLastKnownOrientationState()Lio/fotoapparat/hardware/orientation/OrientationState;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/fotoapparat/hardware/CameraDevice;->setDisplayOrientation(Lio/fotoapparat/hardware/orientation/OrientationState;)V

    .line 50
    invoke-virtual {v0}, Lio/fotoapparat/hardware/CameraDevice;->getPreviewResolution()Lio/fotoapparat/parameter/Resolution;

    move-result-object p1

    .line 52
    invoke-virtual {p0}, Lio/fotoapparat/hardware/Device;->getCameraRenderer$fotoapparat_release()Lio/fotoapparat/view/CameraRenderer;

    move-result-object v1

    .line 54
    invoke-virtual {p0}, Lio/fotoapparat/hardware/Device;->getScaleType$fotoapparat_release()Lio/fotoapparat/parameter/ScaleType;

    move-result-object v2

    .line 53
    invoke-interface {v1, v2}, Lio/fotoapparat/view/CameraRenderer;->setScaleType(Lio/fotoapparat/parameter/ScaleType;)V

    .line 57
    invoke-interface {v1, p1}, Lio/fotoapparat/view/CameraRenderer;->setPreviewResolution(Lio/fotoapparat/parameter/Resolution;)V

    .line 62
    invoke-virtual {p0}, Lio/fotoapparat/hardware/Device;->getFocusPointSelector$fotoapparat_release()Lio/fotoapparat/view/FocalPointSelector;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v1, Lio/fotoapparat/routine/camera/StartRoutineKt$start$2;

    invoke-direct {v1, p0}, Lio/fotoapparat/routine/camera/StartRoutineKt$start$2;-><init>(Lio/fotoapparat/hardware/Device;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v1}, Lio/fotoapparat/view/FocalPointSelector;->setFocalPointListener(Lkotlin/jvm/functions/Function1;)V

    .line 71
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lio/fotoapparat/hardware/Device;->getCameraRenderer$fotoapparat_release()Lio/fotoapparat/view/CameraRenderer;

    move-result-object p1

    invoke-interface {p1}, Lio/fotoapparat/view/CameraRenderer;->getPreview()Lio/fotoapparat/view/Preview;

    move-result-object p1

    .line 70
    invoke-virtual {v0, p1}, Lio/fotoapparat/hardware/CameraDevice;->setDisplaySurface(Lio/fotoapparat/view/Preview;)V

    .line 74
    invoke-virtual {v0}, Lio/fotoapparat/hardware/CameraDevice;->startPreview()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 76
    invoke-virtual {p0}, Lio/fotoapparat/hardware/Device;->getLogger$fotoapparat_release()Lio/fotoapparat/log/Logger;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Can\'t start preview because of the exception: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/fotoapparat/log/Logger;->log(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
