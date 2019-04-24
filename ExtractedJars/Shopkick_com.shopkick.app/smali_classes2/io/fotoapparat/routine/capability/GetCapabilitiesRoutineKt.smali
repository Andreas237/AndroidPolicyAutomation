.class public final Lio/fotoapparat/routine/capability/GetCapabilitiesRoutineKt;
.super Ljava/lang/Object;
.source "GetCapabilitiesRoutine.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "getCapabilities",
        "Lio/fotoapparat/capability/Capabilities;",
        "Lio/fotoapparat/hardware/Device;",
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
.method public static final getCapabilities(Lio/fotoapparat/hardware/Device;)Lio/fotoapparat/capability/Capabilities;
    .locals 2
    .param p0    # Lio/fotoapparat/hardware/Device;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    new-instance v0, Lio/fotoapparat/routine/capability/GetCapabilitiesRoutineKt$getCapabilities$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/fotoapparat/routine/capability/GetCapabilitiesRoutineKt$getCapabilities$1;-><init>(Lio/fotoapparat/hardware/Device;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    const/4 p0, 0x1

    invoke-static {v1, v0, p0, v1}, Lkotlinx/coroutines/BuildersKt;->runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/fotoapparat/capability/Capabilities;

    return-object p0
.end method
