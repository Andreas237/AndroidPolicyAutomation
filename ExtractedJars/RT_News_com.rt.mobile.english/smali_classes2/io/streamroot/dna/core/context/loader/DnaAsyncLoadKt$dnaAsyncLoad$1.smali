.class final Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "DnaAsyncLoad.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt;->dnaAsyncLoad(Ljava/lang/ref/WeakReference;Lio/streamroot/dna/core/context/state/StateManager;Lokhttp3/Call$Factory;Lkotlin/coroutines/CoroutineContext;Lio/streamroot/dna/core/context/config/SessionInformation;Lokhttp3/HttpUrl;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;
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
    c = "io/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1"
    f = "DnaAsyncLoad.kt"
    i = {
        0x1,
        0x2,
        0x2,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3
    }
    l = {
        0x29,
        0x2d,
        0x33,
        0x45,
        0x67
    }
    m = "invokeSuspend"
    n = {
        "availabilityZone",
        "availabilityZone",
        "activationRules",
        "availabilityZone",
        "activationRules",
        "injectedConf",
        "lowCapacityDeviceEnabled",
        "infrastructure",
        "panamaConfiguration",
        "qosTesterRatio"
    }
    s = {
        "L$1",
        "L$1",
        "L$2",
        "L$1",
        "L$2",
        "L$3",
        "Z$0",
        "L$4",
        "L$5",
        "D$0"
    }
.end annotation


# instance fields
.field final synthetic $androidContextRef:Ljava/lang/ref/WeakReference;

.field final synthetic $backendUrl:Lokhttp3/HttpUrl;

.field final synthetic $callFactory:Lokhttp3/Call$Factory;

.field final synthetic $sessionInformation:Lio/streamroot/dna/core/context/config/SessionInformation;

.field final synthetic $stateManager:Lio/streamroot/dna/core/context/state/StateManager;

.field final synthetic $success:Lkotlin/jvm/functions/Function2;

.field D$0:D

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field Z$0:Z

.field label:I

.field private p$:Lkotlinx/coroutines/CoroutineScope;


# direct methods
.method constructor <init>(Lokhttp3/Call$Factory;Lokhttp3/HttpUrl;Lio/streamroot/dna/core/context/config/SessionInformation;Ljava/lang/ref/WeakReference;Lkotlin/jvm/functions/Function2;Lio/streamroot/dna/core/context/state/StateManager;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$callFactory:Lokhttp3/Call$Factory;

    iput-object p2, p0, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$backendUrl:Lokhttp3/HttpUrl;

    iput-object p3, p0, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$sessionInformation:Lio/streamroot/dna/core/context/config/SessionInformation;

    iput-object p4, p0, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$androidContextRef:Ljava/lang/ref/WeakReference;

    iput-object p5, p0, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$success:Lkotlin/jvm/functions/Function2;

    iput-object p6, p0, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$stateManager:Lio/streamroot/dna/core/context/state/StateManager;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 9
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

    new-instance v0, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;

    iget-object v2, p0, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$callFactory:Lokhttp3/Call$Factory;

    iget-object v3, p0, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$backendUrl:Lokhttp3/HttpUrl;

    iget-object v4, p0, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$sessionInformation:Lio/streamroot/dna/core/context/config/SessionInformation;

    iget-object v5, p0, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$androidContextRef:Ljava/lang/ref/WeakReference;

    iget-object v6, p0, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$success:Lkotlin/jvm/functions/Function2;

    iget-object v7, p0, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$stateManager:Lio/streamroot/dna/core/context/state/StateManager;

    move-object v1, v0

    move-object v8, p2

    invoke-direct/range {v1 .. v8}, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;-><init>(Lokhttp3/Call$Factory;Lokhttp3/HttpUrl;Lio/streamroot/dna/core/context/config/SessionInformation;Ljava/lang/ref/WeakReference;Lkotlin/jvm/functions/Function2;Lio/streamroot/dna/core/context/state/StateManager;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    iput-object p1, v0, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 41
    iget v4, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->label:I

    const/4 v5, 0x1

    const/4 v6, 0x2

    const/4 v7, 0x0

    packed-switch v4, :pswitch_data_0

    .line 109
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 41
    :pswitch_0
    iget-wide v3, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->D$0:D

    iget-object v3, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->L$5:Ljava/lang/Object;

    check-cast v3, Lorg/json/JSONObject;

    iget-object v3, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->L$4:Ljava/lang/Object;

    check-cast v3, Lio/streamroot/dna/core/context/config/Infrastructure;

    iget-boolean v3, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->Z$0:Z

    iget-object v3, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->L$3:Ljava/lang/Object;

    check-cast v3, Lio/streamroot/dna/core/context/loader/InjectedConf;

    iget-object v3, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->L$2:Ljava/lang/Object;

    check-cast v3, Lio/streamroot/dna/core/context/loader/ActivationRules;

    iget-object v3, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v3, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lkotlinx/coroutines/CoroutineScope;

    :try_start_0
    instance-of v4, v2, Lkotlin/Result$Failure;

    if-eqz v4, :cond_15

    check-cast v2, Lkotlin/Result$Failure;

    iget-object v2, v2, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw v2
    :try_end_0
    .catch Lio/streamroot/dna/core/context/loader/ActivationException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    move-object v2, v0

    move-object v4, v3

    goto/16 :goto_4

    :pswitch_1
    iget-object v4, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->L$2:Ljava/lang/Object;

    check-cast v4, Lio/streamroot/dna/core/context/loader/ActivationRules;

    iget-object v8, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->L$1:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->L$0:Ljava/lang/Object;

    check-cast v9, Lkotlinx/coroutines/CoroutineScope;

    :try_start_1
    instance-of v10, v2, Lkotlin/Result$Failure;

    if-eqz v10, :cond_0

    check-cast v2, Lkotlin/Result$Failure;

    iget-object v2, v2, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw v2
    :try_end_1
    .catch Lio/streamroot/dna/core/context/loader/ActivationException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :cond_0
    move-object/from16 v25, v8

    move-object v8, v4

    move-object v4, v9

    :goto_0
    move-object/from16 v9, v25

    goto/16 :goto_3

    :catch_1
    move-exception v0

    move-object v2, v0

    move-object v4, v9

    goto/16 :goto_4

    :pswitch_2
    iget-object v4, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v8, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lkotlinx/coroutines/CoroutineScope;

    :try_start_2
    instance-of v9, v2, Lkotlin/Result$Failure;

    if-eqz v9, :cond_1

    check-cast v2, Lkotlin/Result$Failure;

    iget-object v2, v2, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw v2
    :try_end_2
    .catch Lio/streamroot/dna/core/context/loader/ActivationException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :cond_1
    move-object/from16 v25, v8

    move-object v8, v4

    move-object/from16 v4, v25

    goto/16 :goto_2

    :catch_2
    move-exception v0

    move-object v2, v0

    move-object v4, v8

    goto/16 :goto_4

    :pswitch_3
    iget-object v4, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lkotlinx/coroutines/CoroutineScope;

    :try_start_3
    instance-of v8, v2, Lkotlin/Result$Failure;

    if-eqz v8, :cond_5

    check-cast v2, Lkotlin/Result$Failure;

    iget-object v2, v2, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw v2
    :try_end_3
    .catch Lio/streamroot/dna/core/context/loader/ActivationException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    move-exception v0

    :goto_1
    move-object v2, v0

    goto/16 :goto_4

    :catch_4
    move-exception v0

    move-object v2, v0

    goto/16 :goto_5

    :pswitch_4
    instance-of v4, v2, Lkotlin/Result$Failure;

    if-eqz v4, :cond_2

    check-cast v2, Lkotlin/Result$Failure;

    iget-object v2, v2, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw v2

    :cond_2
    iget-object v2, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    .line 43
    :try_start_4
    invoke-static {v2}, Lkotlinx/coroutines/CoroutineScopeKt;->isActive(Lkotlinx/coroutines/CoroutineScope;)Z

    move-result v4

    if-nez v4, :cond_3

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v3

    .line 44
    :cond_3
    iget-object v4, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$callFactory:Lokhttp3/Call$Factory;

    iget-object v8, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$backendUrl:Lokhttp3/HttpUrl;

    iget-object v9, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$sessionInformation:Lio/streamroot/dna/core/context/config/SessionInformation;

    iput-object v2, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->L$0:Ljava/lang/Object;

    iput v5, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->label:I

    invoke-static {v4, v8, v9, v1}, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt;->routerRequest(Lokhttp3/Call$Factory;Lokhttp3/HttpUrl;Lio/streamroot/dna/core/context/config/SessionInformation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4
    :try_end_4
    .catch Lio/streamroot/dna/core/context/loader/ActivationException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_5

    if-ne v4, v3, :cond_4

    return-object v3

    :cond_4
    move-object/from16 v25, v4

    move-object v4, v2

    move-object/from16 v2, v25

    .line 45
    :cond_5
    :try_start_5
    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_13

    .line 47
    invoke-interface {v4}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v8

    sget-object v9, Lio/streamroot/dna/core/context/DnaCoroutineContext;->Key:Lio/streamroot/dna/core/context/DnaCoroutineContext$Key;

    check-cast v9, Lkotlin/coroutines/CoroutineContext$Key;

    invoke-interface {v8, v9}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v8

    check-cast v8, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    if-eqz v8, :cond_6

    invoke-virtual {v8, v2}, Lio/streamroot/dna/core/context/DnaCoroutineContext;->setAvailabilityZone(Ljava/lang/String;)V

    .line 48
    :cond_6
    invoke-static {v4}, Lkotlinx/coroutines/CoroutineScopeKt;->isActive(Lkotlinx/coroutines/CoroutineScope;)Z

    move-result v8

    if-nez v8, :cond_7

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    .line 50
    :cond_7
    iget-object v8, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$callFactory:Lokhttp3/Call$Factory;

    iget-object v9, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$backendUrl:Lokhttp3/HttpUrl;

    iget-object v10, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$sessionInformation:Lio/streamroot/dna/core/context/config/SessionInformation;

    iput-object v4, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->L$0:Ljava/lang/Object;

    iput-object v2, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->L$1:Ljava/lang/Object;

    iput v6, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->label:I

    invoke-static {v8, v9, v10, v1}, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt;->activatorRequest(Lokhttp3/Call$Factory;Lokhttp3/HttpUrl;Lio/streamroot/dna/core/context/config/SessionInformation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v3, :cond_8

    return-object v3

    :cond_8
    move-object/from16 v25, v8

    move-object v8, v2

    move-object/from16 v2, v25

    .line 51
    :goto_2
    check-cast v2, Lio/streamroot/dna/core/context/loader/ActivationRules;

    if-eqz v2, :cond_12

    .line 53
    invoke-virtual {v2}, Lio/streamroot/dna/core/context/loader/ActivationRules;->getBypassed()Z

    move-result v9

    if-eqz v9, :cond_9

    .line 54
    new-instance v2, Lio/streamroot/dna/core/context/loader/ActivationException;

    sget-object v3, Lio/streamroot/dna/core/State;->DISABLED_BY_BYPASS:Lio/streamroot/dna/core/State;

    invoke-direct {v2, v3, v7, v6, v7}, Lio/streamroot/dna/core/context/loader/ActivationException;-><init>(Lio/streamroot/dna/core/State;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Ljava/lang/Throwable;

    throw v2

    .line 57
    :cond_9
    invoke-virtual {v2}, Lio/streamroot/dna/core/context/loader/ActivationRules;->getBackendCounts()Lio/streamroot/dna/core/context/loader/BackendCounts;

    move-result-object v9

    invoke-virtual {v9}, Lio/streamroot/dna/core/context/loader/BackendCounts;->getContentActivated()Z

    move-result v9

    if-nez v9, :cond_a

    .line 58
    new-instance v2, Lio/streamroot/dna/core/context/loader/ActivationException;

    sget-object v3, Lio/streamroot/dna/core/State;->DISABLED_BY_ACTIVATION_THRESHOLD:Lio/streamroot/dna/core/State;

    invoke-direct {v2, v3, v7, v6, v7}, Lio/streamroot/dna/core/context/loader/ActivationException;-><init>(Lio/streamroot/dna/core/State;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Ljava/lang/Throwable;

    throw v2

    .line 61
    :cond_a
    invoke-virtual {v2}, Lio/streamroot/dna/core/context/loader/ActivationRules;->getBackendCounts()Lio/streamroot/dna/core/context/loader/BackendCounts;

    move-result-object v9

    invoke-virtual {v9}, Lio/streamroot/dna/core/context/loader/BackendCounts;->getUsageQuotaReached()Z

    move-result v9

    if-eqz v9, :cond_b

    .line 62
    new-instance v2, Lio/streamroot/dna/core/context/loader/ActivationException;

    sget-object v3, Lio/streamroot/dna/core/State;->USAGE_QUOTA_REACHED:Lio/streamroot/dna/core/State;

    invoke-direct {v2, v3, v7, v6, v7}, Lio/streamroot/dna/core/context/loader/ActivationException;-><init>(Lio/streamroot/dna/core/State;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Ljava/lang/Throwable;

    throw v2

    .line 64
    :cond_b
    invoke-static {}, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt;->access$rollDice()D

    move-result-wide v9

    invoke-virtual {v2}, Lio/streamroot/dna/core/context/loader/ActivationRules;->getCustomerProperties()Lio/streamroot/dna/core/context/loader/CustomerProperties;

    move-result-object v11

    invoke-virtual {v11}, Lio/streamroot/dna/core/context/loader/CustomerProperties;->getActivationRatio()D

    move-result-wide v11

    cmpl-double v13, v9, v11

    if-lez v13, :cond_c

    .line 65
    new-instance v2, Lio/streamroot/dna/core/context/loader/ActivationException;

    sget-object v3, Lio/streamroot/dna/core/State;->DISABLED_BY_ACTIVATION_RATIO:Lio/streamroot/dna/core/State;

    invoke-direct {v2, v3, v7, v6, v7}, Lio/streamroot/dna/core/context/loader/ActivationException;-><init>(Lio/streamroot/dna/core/State;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Ljava/lang/Throwable;

    throw v2

    .line 68
    :cond_c
    iget-object v9, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$callFactory:Lokhttp3/Call$Factory;

    iget-object v10, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$backendUrl:Lokhttp3/HttpUrl;

    iget-object v11, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$sessionInformation:Lio/streamroot/dna/core/context/config/SessionInformation;

    iput-object v4, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->L$0:Ljava/lang/Object;

    iput-object v8, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->L$1:Ljava/lang/Object;

    iput-object v2, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->L$2:Ljava/lang/Object;

    const/4 v12, 0x3

    iput v12, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->label:I

    invoke-static {v9, v10, v11, v1}, Lio/streamroot/dna/core/context/loader/ActivationRequestsKt;->injectedConfRequest(Lokhttp3/Call$Factory;Lokhttp3/HttpUrl;Lio/streamroot/dna/core/context/config/SessionInformation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v3, :cond_d

    return-object v3

    :cond_d
    move-object/from16 v25, v8

    move-object v8, v2

    move-object v2, v9

    goto/16 :goto_0

    .line 69
    :goto_3
    check-cast v2, Lio/streamroot/dna/core/context/loader/InjectedConf;

    if-eqz v2, :cond_11

    .line 70
    invoke-static {v4}, Lkotlinx/coroutines/CoroutineScopeKt;->isActive(Lkotlinx/coroutines/CoroutineScope;)Z

    move-result v10

    if-nez v10, :cond_e

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    .line 72
    :cond_e
    invoke-virtual {v2}, Lio/streamroot/dna/core/context/loader/InjectedConf;->getNativeConf()Lio/streamroot/dna/core/context/loader/NativeConf;

    move-result-object v10

    invoke-virtual {v10}, Lio/streamroot/dna/core/context/loader/NativeConf;->getBooleanConfigurations()Ljava/util/Map;

    move-result-object v10

    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getENABLE_LOW_CAPACITY_DEVICES()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v11

    invoke-static {v10, v11}, Lio/streamroot/dna/core/utils/MapExtentionsKt;->getConfiguration(Ljava/util/Map;Lio/streamroot/dna/core/context/config/Configuration;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Boolean;

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    if-nez v10, :cond_f

    .line 73
    iget-object v11, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$androidContextRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v11}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/content/Context;

    if-eqz v11, :cond_f

    invoke-static {v11}, Lio/streamroot/dna/core/utils/ContextExtensionKt;->isLowRamDevice(Landroid/content/Context;)Z

    move-result v11

    if-ne v11, v5, :cond_f

    .line 74
    new-instance v2, Lio/streamroot/dna/core/context/loader/ActivationException;

    sget-object v3, Lio/streamroot/dna/core/State;->DISABLED_FOR_INSUFFICIENT_CAPACITY:Lio/streamroot/dna/core/State;

    invoke-direct {v2, v3, v7, v6, v7}, Lio/streamroot/dna/core/context/loader/ActivationException;-><init>(Lio/streamroot/dna/core/State;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Ljava/lang/Throwable;

    throw v2

    .line 76
    :cond_f
    iget-object v7, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$sessionInformation:Lio/streamroot/dna/core/context/config/SessionInformation;

    invoke-virtual {v2}, Lio/streamroot/dna/core/context/loader/InjectedConf;->getConfLabel()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7, v11}, Lio/streamroot/dna/core/context/config/SessionInformation;->setConfLabel(Ljava/lang/String;)V

    .line 78
    new-instance v7, Lio/streamroot/dna/core/context/config/Infrastructure;

    iget-object v13, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$backendUrl:Lokhttp3/HttpUrl;

    .line 79
    invoke-virtual {v8}, Lio/streamroot/dna/core/context/loader/ActivationRules;->getBackendPaths()Lio/streamroot/dna/core/context/loader/BackendPaths;

    move-result-object v11

    invoke-virtual {v11}, Lio/streamroot/dna/core/context/loader/BackendPaths;->getSignalingPath()Ljava/lang/String;

    move-result-object v14

    .line 80
    iget-object v11, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$backendUrl:Lokhttp3/HttpUrl;

    new-array v12, v6, [Ljava/lang/String;

    const/16 v20, 0x0

    aput-object v9, v12, v20

    invoke-virtual {v8}, Lio/streamroot/dna/core/context/loader/ActivationRules;->getBackendPaths()Lio/streamroot/dna/core/context/loader/BackendPaths;

    move-result-object v15

    invoke-virtual {v15}, Lio/streamroot/dna/core/context/loader/BackendPaths;->getSignalingPath()Ljava/lang/String;

    move-result-object v15

    aput-object v15, v12, v5

    invoke-static {v11, v12}, Lio/streamroot/dna/core/utils/UrlsKt;->buildDnaDeliveryUrl(Lokhttp3/HttpUrl;[Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object v15

    .line 81
    invoke-virtual {v8}, Lio/streamroot/dna/core/context/loader/ActivationRules;->getBackendPaths()Lio/streamroot/dna/core/context/loader/BackendPaths;

    move-result-object v11

    invoke-virtual {v11}, Lio/streamroot/dna/core/context/loader/BackendPaths;->getTrackerPath()Ljava/lang/String;

    move-result-object v16

    .line 82
    iget-object v11, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$backendUrl:Lokhttp3/HttpUrl;

    new-array v6, v6, [Ljava/lang/String;

    aput-object v9, v6, v20

    invoke-virtual {v8}, Lio/streamroot/dna/core/context/loader/ActivationRules;->getBackendPaths()Lio/streamroot/dna/core/context/loader/BackendPaths;

    move-result-object v12

    invoke-virtual {v12}, Lio/streamroot/dna/core/context/loader/BackendPaths;->getTrackerPath()Ljava/lang/String;

    move-result-object v12

    aput-object v12, v6, v5

    invoke-static {v11, v6}, Lio/streamroot/dna/core/utils/UrlsKt;->buildDnaDeliveryUrl(Lokhttp3/HttpUrl;[Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object v17

    .line 83
    invoke-virtual {v8}, Lio/streamroot/dna/core/context/loader/ActivationRules;->getBackendPaths()Lio/streamroot/dna/core/context/loader/BackendPaths;

    move-result-object v6

    invoke-virtual {v6}, Lio/streamroot/dna/core/context/loader/BackendPaths;->getKlaraPath()Ljava/lang/String;

    move-result-object v18

    .line 84
    iget-object v6, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$backendUrl:Lokhttp3/HttpUrl;

    new-array v11, v5, [Ljava/lang/String;

    invoke-virtual {v8}, Lio/streamroot/dna/core/context/loader/ActivationRules;->getBackendPaths()Lio/streamroot/dna/core/context/loader/BackendPaths;

    move-result-object v12

    invoke-virtual {v12}, Lio/streamroot/dna/core/context/loader/BackendPaths;->getKlaraPath()Ljava/lang/String;

    move-result-object v12

    aput-object v12, v11, v20

    invoke-static {v6, v11}, Lio/streamroot/dna/core/utils/UrlsKt;->buildDnaDeliveryUrl(Lokhttp3/HttpUrl;[Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object v19

    move-object v12, v7

    .line 78
    invoke-direct/range {v12 .. v19}, Lio/streamroot/dna/core/context/config/Infrastructure;-><init>(Lokhttp3/HttpUrl;Ljava/lang/String;Lokhttp3/HttpUrl;Ljava/lang/String;Lokhttp3/HttpUrl;Ljava/lang/String;Lokhttp3/HttpUrl;)V

    .line 87
    invoke-virtual {v2}, Lio/streamroot/dna/core/context/loader/InjectedConf;->getPaConf()Lorg/json/JSONObject;

    move-result-object v6

    .line 88
    iget-object v11, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$sessionInformation:Lio/streamroot/dna/core/context/config/SessionInformation;

    .line 89
    invoke-virtual {v8}, Lio/streamroot/dna/core/context/loader/ActivationRules;->getCustomerProperties()Lio/streamroot/dna/core/context/loader/CustomerProperties;

    move-result-object v12

    .line 91
    iget-object v13, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$androidContextRef:Ljava/lang/ref/WeakReference;

    .line 86
    invoke-static {v6, v11, v12, v7, v13}, Lio/streamroot/dna/core/context/config/PanamaConfigurationKt;->buildPanamaConfiguration(Lorg/json/JSONObject;Lio/streamroot/dna/core/context/config/SessionInformation;Lio/streamroot/dna/core/context/loader/CustomerProperties;Lio/streamroot/dna/core/context/config/Infrastructure;Ljava/lang/ref/WeakReference;)Lorg/json/JSONObject;

    move-result-object v6

    .line 93
    invoke-virtual {v2}, Lio/streamroot/dna/core/context/loader/InjectedConf;->getNativeConf()Lio/streamroot/dna/core/context/loader/NativeConf;

    move-result-object v11

    invoke-virtual {v11}, Lio/streamroot/dna/core/context/loader/NativeConf;->getNumberConfigurations()Ljava/util/Map;

    move-result-object v11

    invoke-static {}, Lio/streamroot/dna/core/context/config/Configurations;->getQOS_TESTER_RATIO()Lio/streamroot/dna/core/context/config/Configuration;

    move-result-object v12

    invoke-static {v11, v12}, Lio/streamroot/dna/core/utils/MapExtentionsKt;->getConfiguration(Ljava/util/Map;Lio/streamroot/dna/core/context/config/Configuration;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v14

    .line 94
    iget-object v11, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$success:Lkotlin/jvm/functions/Function2;

    new-instance v13, Lio/streamroot/dna/core/context/config/DnaConfiguration;

    .line 95
    invoke-static {}, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt;->access$rollDice()D

    move-result-wide v16

    cmpg-double v12, v16, v14

    if-gez v12, :cond_10

    move/from16 v20, v5

    .line 96
    :cond_10
    iget-object v5, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$sessionInformation:Lio/streamroot/dna/core/context/config/SessionInformation;

    .line 97
    invoke-virtual {v8}, Lio/streamroot/dna/core/context/loader/ActivationRules;->getCustomerProperties()Lio/streamroot/dna/core/context/loader/CustomerProperties;

    move-result-object v16

    .line 100
    invoke-virtual {v2}, Lio/streamroot/dna/core/context/loader/InjectedConf;->getNativeConf()Lio/streamroot/dna/core/context/loader/NativeConf;

    move-result-object v12

    invoke-virtual {v12}, Lio/streamroot/dna/core/context/loader/NativeConf;->getBooleanConfigurations()Ljava/util/Map;

    move-result-object v18

    .line 101
    invoke-virtual {v2}, Lio/streamroot/dna/core/context/loader/InjectedConf;->getNativeConf()Lio/streamroot/dna/core/context/loader/NativeConf;

    move-result-object v12

    invoke-virtual {v12}, Lio/streamroot/dna/core/context/loader/NativeConf;->getStringConfigurations()Ljava/util/Map;

    move-result-object v19

    .line 102
    invoke-virtual {v2}, Lio/streamroot/dna/core/context/loader/InjectedConf;->getNativeConf()Lio/streamroot/dna/core/context/loader/NativeConf;

    move-result-object v12

    invoke-virtual {v12}, Lio/streamroot/dna/core/context/loader/NativeConf;->getNumberConfigurations()Ljava/util/Map;

    move-result-object v21

    move-object v12, v13

    move-object/from16 v22, v3

    move-object v3, v13

    move/from16 v13, v20

    move-wide/from16 v23, v14

    move-object v14, v5

    move-object/from16 v15, v16

    move-object/from16 v16, v7

    move-object/from16 v17, v6

    move-object/from16 v20, v21

    .line 94
    invoke-direct/range {v12 .. v20}, Lio/streamroot/dna/core/context/config/DnaConfiguration;-><init>(ZLio/streamroot/dna/core/context/config/SessionInformation;Lio/streamroot/dna/core/context/loader/CustomerProperties;Lio/streamroot/dna/core/context/config/Infrastructure;Lorg/json/JSONObject;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    iput-object v4, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->L$0:Ljava/lang/Object;

    iput-object v9, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->L$1:Ljava/lang/Object;

    iput-object v8, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->L$2:Ljava/lang/Object;

    iput-object v2, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->L$3:Ljava/lang/Object;

    iput-boolean v10, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->Z$0:Z

    iput-object v7, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->L$4:Ljava/lang/Object;

    iput-object v6, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->L$5:Ljava/lang/Object;

    move-wide/from16 v5, v23

    iput-wide v5, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->D$0:D

    const/4 v2, 0x4

    iput v2, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->label:I

    invoke-interface {v11, v3, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v3, v22

    if-ne v2, v3, :cond_15

    return-object v3

    .line 69
    :cond_11
    new-instance v2, Lio/streamroot/dna/core/context/loader/ActivationException;

    sget-object v3, Lio/streamroot/dna/core/State;->ACTIVATION_FAILED:Lio/streamroot/dna/core/State;

    const-string v5, "Injected conf can\'t be null"

    invoke-direct {v2, v3, v5}, Lio/streamroot/dna/core/context/loader/ActivationException;-><init>(Lio/streamroot/dna/core/State;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Throwable;

    throw v2

    .line 51
    :cond_12
    new-instance v2, Lio/streamroot/dna/core/context/loader/ActivationException;

    sget-object v3, Lio/streamroot/dna/core/State;->ACTIVATION_FAILED:Lio/streamroot/dna/core/State;

    const-string v5, "Activation rules can\'t be null"

    invoke-direct {v2, v3, v5}, Lio/streamroot/dna/core/context/loader/ActivationException;-><init>(Lio/streamroot/dna/core/State;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Throwable;

    throw v2

    .line 45
    :cond_13
    new-instance v2, Lio/streamroot/dna/core/context/loader/ActivationException;

    sget-object v3, Lio/streamroot/dna/core/State;->ACTIVATION_FAILED:Lio/streamroot/dna/core/State;

    const-string v5, "Availability zone received from the backend is empty, blank or null"

    invoke-direct {v2, v3, v5}, Lio/streamroot/dna/core/context/loader/ActivationException;-><init>(Lio/streamroot/dna/core/State;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Throwable;

    throw v2
    :try_end_5
    .catch Lio/streamroot/dna/core/context/loader/ActivationException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    :catch_5
    move-exception v0

    move-object v4, v2

    goto/16 :goto_1

    .line 106
    :goto_4
    invoke-interface {v4}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v3

    sget-object v5, Lio/streamroot/dna/core/context/DnaCoroutineContext;->Key:Lio/streamroot/dna/core/context/DnaCoroutineContext$Key;

    check-cast v5, Lkotlin/coroutines/CoroutineContext$Key;

    invoke-interface {v3, v5}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v3

    check-cast v3, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    if-eqz v3, :cond_14

    invoke-interface {v4}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v4

    new-instance v5, Lio/streamroot/dna/core/context/loader/DnaInitializationException;

    const-string v6, "Dna initialization exception."

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Impossible to initialize properly DNA client, cause:"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v5, v6, v7, v2}, Lio/streamroot/dna/core/context/loader/DnaInitializationException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    check-cast v5, Ljava/lang/Throwable;

    invoke-virtual {v3, v4, v5}, Lio/streamroot/dna/core/context/DnaCoroutineContext;->handleException(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V

    .line 107
    :cond_14
    iget-object v2, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$stateManager:Lio/streamroot/dna/core/context/state/StateManager;

    sget-object v3, Lio/streamroot/dna/core/State;->ACTIVATION_FAILED:Lio/streamroot/dna/core/State;

    invoke-virtual {v2, v3}, Lio/streamroot/dna/core/context/state/StateManager;->updateState(Lio/streamroot/dna/core/State;)V

    goto :goto_6

    .line 104
    :goto_5
    iget-object v3, v1, Lio/streamroot/dna/core/context/loader/DnaAsyncLoadKt$dnaAsyncLoad$1;->$stateManager:Lio/streamroot/dna/core/context/state/StateManager;

    invoke-virtual {v2}, Lio/streamroot/dna/core/context/loader/ActivationException;->getState()Lio/streamroot/dna/core/State;

    move-result-object v2

    invoke-virtual {v3, v2}, Lio/streamroot/dna/core/context/state/StateManager;->updateState(Lio/streamroot/dna/core/State;)V

    .line 109
    :cond_15
    :goto_6
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
