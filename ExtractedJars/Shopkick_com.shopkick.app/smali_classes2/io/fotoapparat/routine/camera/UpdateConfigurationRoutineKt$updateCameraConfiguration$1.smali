.class final Lio/fotoapparat/routine/camera/UpdateConfigurationRoutineKt$updateCameraConfiguration$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "UpdateConfigurationRoutine.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/routine/camera/UpdateConfigurationRoutineKt;->updateCameraConfiguration(Lio/fotoapparat/hardware/Device;Lio/fotoapparat/hardware/CameraDevice;)V
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
    c = "io/fotoapparat/routine/camera/UpdateConfigurationRoutineKt$updateCameraConfiguration$1"
    f = "UpdateConfigurationRoutine.kt"
    i = {
        0x1,
        0x1
    }
    l = {
        0x18,
        0x1a,
        0x20
    }
    m = "invokeSuspend"
    n = {
        "cameraParameters",
        "frameProcessor"
    }
    s = {
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field final synthetic $cameraDevice:Lio/fotoapparat/hardware/CameraDevice;

.field final synthetic $this_updateCameraConfiguration:Lio/fotoapparat/hardware/Device;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field private p$:Lkotlinx/coroutines/CoroutineScope;


# direct methods
.method constructor <init>(Lio/fotoapparat/hardware/Device;Lio/fotoapparat/hardware/CameraDevice;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lio/fotoapparat/routine/camera/UpdateConfigurationRoutineKt$updateCameraConfiguration$1;->$this_updateCameraConfiguration:Lio/fotoapparat/hardware/Device;

    iput-object p2, p0, Lio/fotoapparat/routine/camera/UpdateConfigurationRoutineKt$updateCameraConfiguration$1;->$cameraDevice:Lio/fotoapparat/hardware/CameraDevice;

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

    new-instance v0, Lio/fotoapparat/routine/camera/UpdateConfigurationRoutineKt$updateCameraConfiguration$1;

    iget-object v1, p0, Lio/fotoapparat/routine/camera/UpdateConfigurationRoutineKt$updateCameraConfiguration$1;->$this_updateCameraConfiguration:Lio/fotoapparat/hardware/Device;

    iget-object v2, p0, Lio/fotoapparat/routine/camera/UpdateConfigurationRoutineKt$updateCameraConfiguration$1;->$cameraDevice:Lio/fotoapparat/hardware/CameraDevice;

    invoke-direct {v0, v1, v2, p2}, Lio/fotoapparat/routine/camera/UpdateConfigurationRoutineKt$updateCameraConfiguration$1;-><init>(Lio/fotoapparat/hardware/Device;Lio/fotoapparat/hardware/CameraDevice;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    iput-object p1, v0, Lio/fotoapparat/routine/camera/UpdateConfigurationRoutineKt$updateCameraConfiguration$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lio/fotoapparat/routine/camera/UpdateConfigurationRoutineKt$updateCameraConfiguration$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lio/fotoapparat/routine/camera/UpdateConfigurationRoutineKt$updateCameraConfiguration$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lio/fotoapparat/routine/camera/UpdateConfigurationRoutineKt$updateCameraConfiguration$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 24
    iget v1, p0, Lio/fotoapparat/routine/camera/UpdateConfigurationRoutineKt$updateCameraConfiguration$1;->label:I

    packed-switch v1, :pswitch_data_0

    .line 35
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 24
    :pswitch_0
    iget-object v0, p0, Lio/fotoapparat/routine/camera/UpdateConfigurationRoutineKt$updateCameraConfiguration$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lio/fotoapparat/routine/camera/UpdateConfigurationRoutineKt$updateCameraConfiguration$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lio/fotoapparat/parameter/camera/CameraParameters;

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

    if-nez v1, :cond_4

    iget-object p1, p0, Lio/fotoapparat/routine/camera/UpdateConfigurationRoutineKt$updateCameraConfiguration$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    .line 25
    iget-object p1, p0, Lio/fotoapparat/routine/camera/UpdateConfigurationRoutineKt$updateCameraConfiguration$1;->$this_updateCameraConfiguration:Lio/fotoapparat/hardware/Device;

    iget-object v1, p0, Lio/fotoapparat/routine/camera/UpdateConfigurationRoutineKt$updateCameraConfiguration$1;->$cameraDevice:Lio/fotoapparat/hardware/CameraDevice;

    const/4 v2, 0x1

    iput v2, p0, Lio/fotoapparat/routine/camera/UpdateConfigurationRoutineKt$updateCameraConfiguration$1;->label:I

    invoke-virtual {p1, v1, p0}, Lio/fotoapparat/hardware/Device;->getCameraParameters(Lio/fotoapparat/hardware/CameraDevice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    .line 26
    :cond_2
    :goto_0
    check-cast p1, Lio/fotoapparat/parameter/camera/CameraParameters;

    iget-object v1, p0, Lio/fotoapparat/routine/camera/UpdateConfigurationRoutineKt$updateCameraConfiguration$1;->$this_updateCameraConfiguration:Lio/fotoapparat/hardware/Device;

    invoke-virtual {v1}, Lio/fotoapparat/hardware/Device;->getFrameProcessor()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    .line 28
    iget-object v2, p0, Lio/fotoapparat/routine/camera/UpdateConfigurationRoutineKt$updateCameraConfiguration$1;->$cameraDevice:Lio/fotoapparat/hardware/CameraDevice;

    .line 29
    iput-object p1, p0, Lio/fotoapparat/routine/camera/UpdateConfigurationRoutineKt$updateCameraConfiguration$1;->L$0:Ljava/lang/Object;

    iput-object v1, p0, Lio/fotoapparat/routine/camera/UpdateConfigurationRoutineKt$updateCameraConfiguration$1;->L$1:Ljava/lang/Object;

    const/4 v3, 0x2

    iput v3, p0, Lio/fotoapparat/routine/camera/UpdateConfigurationRoutineKt$updateCameraConfiguration$1;->label:I

    .line 28
    invoke-virtual {v2, p1, p0}, Lio/fotoapparat/hardware/CameraDevice;->updateParameters(Lio/fotoapparat/parameter/camera/CameraParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    move-object v0, v1

    .line 32
    :goto_1
    iget-object p1, p0, Lio/fotoapparat/routine/camera/UpdateConfigurationRoutineKt$updateCameraConfiguration$1;->$cameraDevice:Lio/fotoapparat/hardware/CameraDevice;

    invoke-virtual {p1, v0}, Lio/fotoapparat/hardware/CameraDevice;->updateFrameProcessor(Lkotlin/jvm/functions/Function1;)V

    .line 35
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 24
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
