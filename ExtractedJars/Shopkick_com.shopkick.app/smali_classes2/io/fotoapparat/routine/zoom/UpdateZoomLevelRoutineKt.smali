.class public final Lio/fotoapparat/routine/zoom/UpdateZoomLevelRoutineKt;
.super Ljava/lang/Object;
.source "UpdateZoomLevelRoutine.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0016\u0010\u0003\u001a\u00020\u0001*\u00020\u00042\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0002H\u0000\u00a8\u0006\u0006"
    }
    d2 = {
        "ensureInBounds",
        "",
        "",
        "updateZoomLevel",
        "Lio/fotoapparat/hardware/Device;",
        "zoomLevel",
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
.method public static final synthetic access$ensureInBounds(F)V
    .locals 0

    .line 1
    invoke-static {p0}, Lio/fotoapparat/routine/zoom/UpdateZoomLevelRoutineKt;->ensureInBounds(F)V

    return-void
.end method

.method private static final ensureInBounds(F)V
    .locals 1

    const/4 v0, 0x0

    cmpl-float v0, p0, v0

    if-ltz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_0

    return-void

    .line 27
    :cond_0
    new-instance v0, Lio/fotoapparat/exception/LevelOutOfRangeException;

    invoke-direct {v0, p0}, Lio/fotoapparat/exception/LevelOutOfRangeException;-><init>(F)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method public static final updateZoomLevel(Lio/fotoapparat/hardware/Device;F)V
    .locals 2
    .param p0    # Lio/fotoapparat/hardware/Device;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # F
        .annotation build Landroidx/annotation/FloatRange;
            from = 0.0
            to = 1.0
        .end annotation
    .end param

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    new-instance v0, Lio/fotoapparat/routine/zoom/UpdateZoomLevelRoutineKt$updateZoomLevel$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lio/fotoapparat/routine/zoom/UpdateZoomLevelRoutineKt$updateZoomLevel$1;-><init>(Lio/fotoapparat/hardware/Device;FLkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    const/4 p0, 0x1

    invoke-static {v1, v0, p0, v1}, Lkotlinx/coroutines/BuildersKt;->runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
