.class public final Lio/fotoapparat/routine/camera/StopRoutineKt;
.super Ljava/lang/Object;
.source "StopRoutine.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u00a8\u0006\u0008"
    }
    d2 = {
        "shutDown",
        "",
        "Lio/fotoapparat/hardware/Device;",
        "orientationSensor",
        "Lio/fotoapparat/hardware/orientation/OrientationSensor;",
        "stop",
        "cameraDevice",
        "Lio/fotoapparat/hardware/CameraDevice;",
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
.method public static final shutDown(Lio/fotoapparat/hardware/Device;Lio/fotoapparat/hardware/orientation/OrientationSensor;)V
    .locals 2
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

    .line 14
    invoke-virtual {p0}, Lio/fotoapparat/hardware/Device;->getFocusPointSelector$fotoapparat_release()Lio/fotoapparat/view/FocalPointSelector;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lio/fotoapparat/routine/camera/StopRoutineKt$shutDown$1;->INSTANCE:Lio/fotoapparat/routine/camera/StopRoutineKt$shutDown$1;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, v1}, Lio/fotoapparat/view/FocalPointSelector;->setFocalPointListener(Lkotlin/jvm/functions/Function1;)V

    .line 15
    :cond_0
    invoke-static {p1}, Lio/fotoapparat/routine/orientation/StopOrientationRoutineKt;->stopMonitoring(Lio/fotoapparat/hardware/orientation/OrientationSensor;)V

    .line 17
    invoke-virtual {p0}, Lio/fotoapparat/hardware/Device;->getSelectedCamera()Lio/fotoapparat/hardware/CameraDevice;

    move-result-object p1

    .line 19
    invoke-static {p0, p1}, Lio/fotoapparat/routine/camera/StopRoutineKt;->stop(Lio/fotoapparat/hardware/Device;Lio/fotoapparat/hardware/CameraDevice;)V

    return-void
.end method

.method public static final stop(Lio/fotoapparat/hardware/Device;Lio/fotoapparat/hardware/CameraDevice;)V
    .locals 1
    .param p0    # Lio/fotoapparat/hardware/Device;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lio/fotoapparat/hardware/CameraDevice;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraDevice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-virtual {p1}, Lio/fotoapparat/hardware/CameraDevice;->stopPreview()V

    .line 28
    invoke-virtual {p1}, Lio/fotoapparat/hardware/CameraDevice;->close()V

    .line 30
    invoke-virtual {p0}, Lio/fotoapparat/hardware/Device;->clearSelectedCamera()V

    return-void
.end method
