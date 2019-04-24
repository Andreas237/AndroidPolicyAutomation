.class final Lio/fotoapparat/routine/capability/GetCapabilitiesRoutineKt$getCapabilities$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "GetCapabilitiesRoutine.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/routine/capability/GetCapabilitiesRoutineKt;->getCapabilities(Lio/fotoapparat/hardware/Device;)Lio/fotoapparat/capability/Capabilities;
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
        "Lio/fotoapparat/capability/Capabilities;",
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
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "<anonymous>",
        "Lio/fotoapparat/capability/Capabilities;",
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
    c = "io/fotoapparat/routine/capability/GetCapabilitiesRoutineKt$getCapabilities$1"
    f = "GetCapabilitiesRoutine.kt"
    i = {
        0x1
    }
    l = {
        0xa,
        0xd,
        0xa
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
.field final synthetic $this_getCapabilities:Lio/fotoapparat/hardware/Device;

.field L$0:Ljava/lang/Object;

.field label:I

.field private p$:Lkotlinx/coroutines/CoroutineScope;


# direct methods
.method constructor <init>(Lio/fotoapparat/hardware/Device;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lio/fotoapparat/routine/capability/GetCapabilitiesRoutineKt$getCapabilities$1;->$this_getCapabilities:Lio/fotoapparat/hardware/Device;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
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

    new-instance v0, Lio/fotoapparat/routine/capability/GetCapabilitiesRoutineKt$getCapabilities$1;

    iget-object v1, p0, Lio/fotoapparat/routine/capability/GetCapabilitiesRoutineKt$getCapabilities$1;->$this_getCapabilities:Lio/fotoapparat/hardware/Device;

    invoke-direct {v0, v1, p2}, Lio/fotoapparat/routine/capability/GetCapabilitiesRoutineKt$getCapabilities$1;-><init>(Lio/fotoapparat/hardware/Device;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    iput-object p1, v0, Lio/fotoapparat/routine/capability/GetCapabilitiesRoutineKt$getCapabilities$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lio/fotoapparat/routine/capability/GetCapabilitiesRoutineKt$getCapabilities$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lio/fotoapparat/routine/capability/GetCapabilitiesRoutineKt$getCapabilities$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lio/fotoapparat/routine/capability/GetCapabilitiesRoutineKt$getCapabilities$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    .line 10
    iget v1, p0, Lio/fotoapparat/routine/capability/GetCapabilitiesRoutineKt$getCapabilities$1;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lio/fotoapparat/routine/capability/GetCapabilitiesRoutineKt$getCapabilities$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/fotoapparat/hardware/CameraDevice;

    instance-of v0, p1, Lkotlin/Result$Failure;

    if-nez v0, :cond_0

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

    if-nez v1, :cond_4

    iget-object p1, p0, Lio/fotoapparat/routine/capability/GetCapabilitiesRoutineKt$getCapabilities$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    .line 11
    iget-object p1, p0, Lio/fotoapparat/routine/capability/GetCapabilitiesRoutineKt$getCapabilities$1;->$this_getCapabilities:Lio/fotoapparat/hardware/Device;

    const/4 v1, 0x1

    iput v1, p0, Lio/fotoapparat/routine/capability/GetCapabilitiesRoutineKt$getCapabilities$1;->label:I

    invoke-virtual {p1, p0}, Lio/fotoapparat/hardware/Device;->awaitSelectedCamera(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    .line 13
    :cond_2
    :goto_0
    check-cast p1, Lio/fotoapparat/hardware/CameraDevice;

    iput-object p1, p0, Lio/fotoapparat/routine/capability/GetCapabilitiesRoutineKt$getCapabilities$1;->L$0:Ljava/lang/Object;

    const/4 v1, 0x2

    iput v1, p0, Lio/fotoapparat/routine/capability/GetCapabilitiesRoutineKt$getCapabilities$1;->label:I

    invoke-virtual {p1, p0}, Lio/fotoapparat/hardware/CameraDevice;->getCapabilities(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    return-object p1

    .line 10
    :cond_4
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
