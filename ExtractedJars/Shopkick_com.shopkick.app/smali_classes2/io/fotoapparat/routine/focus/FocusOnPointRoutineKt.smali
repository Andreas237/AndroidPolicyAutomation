.class public final Lio/fotoapparat/routine/focus/FocusOnPointRoutineKt;
.super Ljava/lang/Object;
.source "FocusOnPointRoutine.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u00a8\u0006\u0005"
    }
    d2 = {
        "focusOnPoint",
        "Lio/fotoapparat/result/FocusResult;",
        "Lio/fotoapparat/hardware/Device;",
        "focalRequest",
        "Lio/fotoapparat/hardware/metering/FocalRequest;",
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
.method public static final focusOnPoint(Lio/fotoapparat/hardware/Device;Lio/fotoapparat/hardware/metering/FocalRequest;)Lio/fotoapparat/result/FocusResult;
    .locals 2
    .param p0    # Lio/fotoapparat/hardware/Device;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lio/fotoapparat/hardware/metering/FocalRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "focalRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    new-instance v0, Lio/fotoapparat/routine/focus/FocusOnPointRoutineKt$focusOnPoint$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lio/fotoapparat/routine/focus/FocusOnPointRoutineKt$focusOnPoint$1;-><init>(Lio/fotoapparat/hardware/Device;Lio/fotoapparat/hardware/metering/FocalRequest;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    const/4 p0, 0x1

    invoke-static {v1, v0, p0, v1}, Lkotlinx/coroutines/BuildersKt;->runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/fotoapparat/result/FocusResult;

    return-object p0
.end method
