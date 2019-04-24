.class public final Lio/fotoapparat/routine/camera/UpdateConfigurationRoutineKt;
.super Ljava/lang/Object;
.source "UpdateConfigurationRoutine.kt"


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
        "updateCameraConfiguration",
        "",
        "Lio/fotoapparat/hardware/Device;",
        "cameraDevice",
        "Lio/fotoapparat/hardware/CameraDevice;",
        "updateDeviceConfiguration",
        "newConfiguration",
        "Lio/fotoapparat/configuration/Configuration;",
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
.method public static final updateCameraConfiguration(Lio/fotoapparat/hardware/Device;Lio/fotoapparat/hardware/CameraDevice;)V
    .locals 2
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

    .line 24
    new-instance v0, Lio/fotoapparat/routine/camera/UpdateConfigurationRoutineKt$updateCameraConfiguration$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lio/fotoapparat/routine/camera/UpdateConfigurationRoutineKt$updateCameraConfiguration$1;-><init>(Lio/fotoapparat/hardware/Device;Lio/fotoapparat/hardware/CameraDevice;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    const/4 p0, 0x1

    invoke-static {v1, v0, p0, v1}, Lkotlinx/coroutines/BuildersKt;->runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final updateDeviceConfiguration(Lio/fotoapparat/hardware/Device;Lio/fotoapparat/configuration/Configuration;)V
    .locals 1
    .param p0    # Lio/fotoapparat/hardware/Device;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lio/fotoapparat/configuration/Configuration;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newConfiguration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-virtual {p0}, Lio/fotoapparat/hardware/Device;->getSelectedCamera()Lio/fotoapparat/hardware/CameraDevice;

    move-result-object v0

    .line 14
    invoke-virtual {p0, p1}, Lio/fotoapparat/hardware/Device;->updateConfiguration(Lio/fotoapparat/configuration/Configuration;)V

    .line 16
    invoke-static {p0, v0}, Lio/fotoapparat/routine/camera/UpdateConfigurationRoutineKt;->updateCameraConfiguration(Lio/fotoapparat/hardware/Device;Lio/fotoapparat/hardware/CameraDevice;)V

    return-void
.end method
