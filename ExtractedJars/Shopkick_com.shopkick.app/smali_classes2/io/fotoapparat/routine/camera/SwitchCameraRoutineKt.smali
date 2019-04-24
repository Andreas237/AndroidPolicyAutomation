.class public final Lio/fotoapparat/routine/camera/SwitchCameraRoutineKt;
.super Ljava/lang/Object;
.source "SwitchCameraRoutine.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0008j\u0002`\nH\u0000\u001aY\u0010\u000b\u001a\u00020\u0001*\u00020\u00022#\u0010\u000c\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0008j\u0002`\u000f\u00a2\u0006\u0002\u0008\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0008j\u0002`\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "restartPreview",
        "",
        "Lio/fotoapparat/hardware/Device;",
        "oldCameraDevice",
        "Lio/fotoapparat/hardware/CameraDevice;",
        "orientationSensor",
        "Lio/fotoapparat/hardware/orientation/OrientationSensor;",
        "mainThreadErrorCallback",
        "Lkotlin/Function1;",
        "Lio/fotoapparat/exception/camera/CameraException;",
        "Lio/fotoapparat/error/CameraErrorCallback;",
        "switchCamera",
        "newLensPositionSelector",
        "",
        "Lio/fotoapparat/characteristic/LensPosition;",
        "Lio/fotoapparat/selector/LensPositionSelector;",
        "Lkotlin/ExtensionFunctionType;",
        "newConfiguration",
        "Lio/fotoapparat/configuration/CameraConfiguration;",
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
.method public static final restartPreview(Lio/fotoapparat/hardware/Device;Lio/fotoapparat/hardware/CameraDevice;Lio/fotoapparat/hardware/orientation/OrientationSensor;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p0    # Lio/fotoapparat/hardware/Device;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lio/fotoapparat/hardware/CameraDevice;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/fotoapparat/hardware/orientation/OrientationSensor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/fotoapparat/hardware/Device;",
            "Lio/fotoapparat/hardware/CameraDevice;",
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

    const-string v0, "oldCameraDevice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "orientationSensor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mainThreadErrorCallback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    invoke-static {p0, p1}, Lio/fotoapparat/routine/camera/StopRoutineKt;->stop(Lio/fotoapparat/hardware/Device;Lio/fotoapparat/hardware/CameraDevice;)V

    .line 55
    :try_start_0
    invoke-static {p0, p2}, Lio/fotoapparat/routine/camera/StartRoutineKt;->start(Lio/fotoapparat/hardware/Device;Lio/fotoapparat/hardware/orientation/OrientationSensor;)V
    :try_end_0
    .catch Lio/fotoapparat/exception/camera/CameraException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 57
    invoke-interface {p3, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public static final switchCamera(Lio/fotoapparat/hardware/Device;Lkotlin/jvm/functions/Function1;Lio/fotoapparat/configuration/CameraConfiguration;Lkotlin/jvm/functions/Function1;Lio/fotoapparat/hardware/orientation/OrientationSensor;)V
    .locals 2
    .param p0    # Lio/fotoapparat/hardware/Device;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/fotoapparat/configuration/CameraConfiguration;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lio/fotoapparat/hardware/orientation/OrientationSensor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/fotoapparat/hardware/Device;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/characteristic/LensPosition;",
            ">;+",
            "Lio/fotoapparat/characteristic/LensPosition;",
            ">;",
            "Lio/fotoapparat/configuration/CameraConfiguration;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lio/fotoapparat/exception/camera/CameraException;",
            "Lkotlin/Unit;",
            ">;",
            "Lio/fotoapparat/hardware/orientation/OrientationSensor;",
            ")V"
        }
    .end annotation

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newLensPositionSelector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newConfiguration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mainThreadErrorCallback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "orientationSensor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    :try_start_0
    invoke-virtual {p0}, Lio/fotoapparat/hardware/Device;->getSelectedCamera()Lio/fotoapparat/hardware/CameraDevice;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_0

    .line 30
    invoke-virtual {p0, p1}, Lio/fotoapparat/hardware/Device;->updateLensPositionSelector(Lkotlin/jvm/functions/Function1;)V

    .line 31
    check-cast p2, Lio/fotoapparat/configuration/Configuration;

    invoke-virtual {p0, p2}, Lio/fotoapparat/hardware/Device;->updateConfiguration(Lio/fotoapparat/configuration/Configuration;)V

    goto :goto_1

    .line 32
    :cond_0
    invoke-virtual {p0}, Lio/fotoapparat/hardware/Device;->getLensPositionSelector()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_1

    .line 33
    invoke-virtual {p0, p1}, Lio/fotoapparat/hardware/Device;->updateLensPositionSelector(Lkotlin/jvm/functions/Function1;)V

    .line 34
    check-cast p2, Lio/fotoapparat/configuration/Configuration;

    invoke-virtual {p0, p2}, Lio/fotoapparat/hardware/Device;->updateConfiguration(Lio/fotoapparat/configuration/Configuration;)V

    .line 36
    invoke-static {p0, v0, p4, p3}, Lio/fotoapparat/routine/camera/SwitchCameraRoutineKt;->restartPreview(Lio/fotoapparat/hardware/Device;Lio/fotoapparat/hardware/CameraDevice;Lio/fotoapparat/hardware/orientation/OrientationSensor;Lkotlin/jvm/functions/Function1;)V

    :cond_1
    :goto_1
    return-void
.end method
