.class final Lio/fotoapparat/routine/zoom/UpdateZoomLevelRoutineKt$updateZoomLevel$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "UpdateZoomLevelRoutine.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/routine/zoom/UpdateZoomLevelRoutineKt;->updateZoomLevel(Lio/fotoapparat/hardware/Device;F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;",
        "invoke",
        "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "io/fotoapparat/routine/zoom/UpdateZoomLevelRoutineKt$updateZoomLevel$1"
    f = "UpdateZoomLevelRoutine.kt"
    i = {
        0x1
    }
    l = {
        0x10,
        0x14,
        0x15
    }
    m = "invokeSuspend"
    n = {
        "cameraDevice"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field final synthetic $this_updateZoomLevel:Lio/fotoapparat/hardware/Device;

.field final synthetic $zoomLevel:F

.field L$0:Ljava/lang/Object;

.field label:I

.field private p$:Lkotlinx/coroutines/CoroutineScope;


# direct methods
.method constructor <init>(Lio/fotoapparat/hardware/Device;FLkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lio/fotoapparat/routine/zoom/UpdateZoomLevelRoutineKt$updateZoomLevel$1;->$this_updateZoomLevel:Lio/fotoapparat/hardware/Device;

    iput p2, p0, Lio/fotoapparat/routine/zoom/UpdateZoomLevelRoutineKt$updateZoomLevel$1;->$zoomLevel:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "completion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/fotoapparat/routine/zoom/UpdateZoomLevelRoutineKt$updateZoomLevel$1;

    iget-object v1, p0, Lio/fotoapparat/routine/zoom/UpdateZoomLevelRoutineKt$updateZoomLevel$1;->$this_updateZoomLevel:Lio/fotoapparat/hardware/Device;

    iget v2, p0, Lio/fotoapparat/routine/zoom/UpdateZoomLevelRoutineKt$updateZoomLevel$1;->$zoomLevel:F

    invoke-direct {v0, v1, v2, p2}, Lio/fotoapparat/routine/zoom/UpdateZoomLevelRoutineKt$updateZoomLevel$1;-><init>(Lio/fotoapparat/hardware/Device;FLkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    iput-object p1, v0, Lio/fotoapparat/routine/zoom/UpdateZoomLevelRoutineKt$updateZoomLevel$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lio/fotoapparat/routine/zoom/UpdateZoomLevelRoutineKt$updateZoomLevel$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lio/fotoapparat/routine/zoom/UpdateZoomLevelRoutineKt$updateZoomLevel$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lio/fotoapparat/routine/zoom/UpdateZoomLevelRoutineKt$updateZoomLevel$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 16
    iget v1, p0, Lio/fotoapparat/routine/zoom/UpdateZoomLevelRoutineKt$updateZoomLevel$1;->label:I

    packed-switch v1, :pswitch_data_0

    .line 23
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 16
    :pswitch_0
    iget-object v0, p0, Lio/fotoapparat/routine/zoom/UpdateZoomLevelRoutineKt$updateZoomLevel$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/fotoapparat/hardware/CameraDevice;

    instance-of v1, p1, Lkotlin/Result$Failure;

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :pswitch_1
    instance-of v1, p1, Lkotlin/Result$Failure;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :pswitch_2
    instance-of v1, p1, Lkotlin/Result$Failure;

    if-nez v1, :cond_5

    iget-object p1, p0, Lio/fotoapparat/routine/zoom/UpdateZoomLevelRoutineKt$updateZoomLevel$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    .line 17
    iget p1, p0, Lio/fotoapparat/routine/zoom/UpdateZoomLevelRoutineKt$updateZoomLevel$1;->$zoomLevel:F

    invoke-static {p1}, Lio/fotoapparat/routine/zoom/UpdateZoomLevelRoutineKt;->access$ensureInBounds(F)V

    .line 18
    iget-object p1, p0, Lio/fotoapparat/routine/zoom/UpdateZoomLevelRoutineKt$updateZoomLevel$1;->$this_updateZoomLevel:Lio/fotoapparat/hardware/Device;

    const/4 v1, 0x1

    iput v1, p0, Lio/fotoapparat/routine/zoom/UpdateZoomLevelRoutineKt$updateZoomLevel$1;->label:I

    invoke-virtual {p1, p0}, Lio/fotoapparat/hardware/Device;->awaitSelectedCamera(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    .line 20
    :cond_2
    :goto_0
    check-cast p1, Lio/fotoapparat/hardware/CameraDevice;

    iput-object p1, p0, Lio/fotoapparat/routine/zoom/UpdateZoomLevelRoutineKt$updateZoomLevel$1;->L$0:Ljava/lang/Object;

    const/4 v1, 0x2

    iput v1, p0, Lio/fotoapparat/routine/zoom/UpdateZoomLevelRoutineKt$updateZoomLevel$1;->label:I

    invoke-virtual {p1, p0}, Lio/fotoapparat/hardware/CameraDevice;->getCapabilities(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_3

    return-object v0

    :cond_3
    move-object v0, p1

    move-object p1, v1

    .line 21
    :goto_1
    check-cast p1, Lio/fotoapparat/capability/Capabilities;

    invoke-virtual {p1}, Lio/fotoapparat/capability/Capabilities;->getZoom()Lio/fotoapparat/parameter/Zoom;

    move-result-object p1

    instance-of p1, p1, Lio/fotoapparat/parameter/Zoom$VariableZoom;

    if-eqz p1, :cond_4

    iget p1, p0, Lio/fotoapparat/routine/zoom/UpdateZoomLevelRoutineKt$updateZoomLevel$1;->$zoomLevel:F

    invoke-virtual {v0, p1}, Lio/fotoapparat/hardware/CameraDevice;->setZoom(F)V

    .line 23
    :cond_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 16
    :cond_5
    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
