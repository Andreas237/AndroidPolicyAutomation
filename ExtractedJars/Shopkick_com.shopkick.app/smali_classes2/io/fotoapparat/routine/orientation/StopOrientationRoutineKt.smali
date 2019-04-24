.class public final Lio/fotoapparat/routine/orientation/StopOrientationRoutineKt;
.super Ljava/lang/Object;
.source "StopOrientationRoutine.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "stopMonitoring",
        "",
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
.method public static final stopMonitoring(Lio/fotoapparat/hardware/orientation/OrientationSensor;)V
    .locals 1
    .param p0    # Lio/fotoapparat/hardware/orientation/OrientationSensor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-virtual {p0}, Lio/fotoapparat/hardware/orientation/OrientationSensor;->stop()V

    return-void
.end method
