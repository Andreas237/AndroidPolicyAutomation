.class public final Lio/fotoapparat/routine/orientation/StartOrientationRoutineKt;
.super Ljava/lang/Object;
.source "StartOrientationRoutine.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u00a8\u0006\u0005"
    }
    d2 = {
        "startOrientationMonitoring",
        "",
        "Lio/fotoapparat/hardware/Device;",
        "orientationSensor",
        "Lio/fotoapparat/hardware/orientation/OrientationSensor;",
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
.method public static final startOrientationMonitoring(Lio/fotoapparat/hardware/Device;Lio/fotoapparat/hardware/orientation/OrientationSensor;)V
    .locals 1
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
    new-instance v0, Lio/fotoapparat/routine/orientation/StartOrientationRoutineKt$startOrientationMonitoring$1;

    invoke-direct {v0, p0}, Lio/fotoapparat/routine/orientation/StartOrientationRoutineKt$startOrientationMonitoring$1;-><init>(Lio/fotoapparat/hardware/Device;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1, v0}, Lio/fotoapparat/hardware/orientation/OrientationSensor;->start(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
