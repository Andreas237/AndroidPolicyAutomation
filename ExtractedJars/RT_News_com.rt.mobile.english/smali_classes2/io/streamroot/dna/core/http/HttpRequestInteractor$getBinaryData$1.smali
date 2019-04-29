.class final Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "HttpRequestInteractor.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/http/HttpRequestInteractor;->getBinaryData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
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

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHttpRequestInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpRequestInteractor.kt\nio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1\n+ 2 CallExtension.kt\nio/streamroot/dna/core/utils/CallExtensionKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,86:1\n9#2:87\n10#2,3:92\n156#3,4:88\n160#3,2:95\n*E\n*S KotlinDebug\n*F\n+ 1 HttpRequestInteractor.kt\nio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1\n*L\n43#1:87\n43#1,3:92\n43#1,4:88\n43#1,2:95\n*E\n"
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
    c = "io/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1"
    f = "HttpRequestInteractor.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x28,
        0x60
    }
    m = "invokeSuspend"
    n = {
        "request",
        "$receiver$iv"
    }
    s = {
        "L$1",
        "L$2"
    }
.end annotation


# instance fields
.field final synthetic $encodedHeaders:Ljava/lang/String;

.field final synthetic $requestId:Ljava/lang/String;

.field final synthetic $url:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I

.field private p$:Lkotlinx/coroutines/CoroutineScope;

.field final synthetic this$0:Lio/streamroot/dna/core/http/HttpRequestInteractor;


# direct methods
.method constructor <init>(Lio/streamroot/dna/core/http/HttpRequestInteractor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->this$0:Lio/streamroot/dna/core/http/HttpRequestInteractor;

    iput-object p2, p0, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->$url:Ljava/lang/String;

    iput-object p3, p0, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->$encodedHeaders:Ljava/lang/String;

    iput-object p4, p0, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->$requestId:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
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

    new-instance v0, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;

    iget-object v2, p0, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->this$0:Lio/streamroot/dna/core/http/HttpRequestInteractor;

    iget-object v3, p0, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->$url:Ljava/lang/String;

    iget-object v4, p0, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->$encodedHeaders:Ljava/lang/String;

    iget-object v5, p0, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->$requestId:Ljava/lang/String;

    move-object v1, v0

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;-><init>(Lio/streamroot/dna/core/http/HttpRequestInteractor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    iput-object p1, v0, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19
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

    .line 40
    iget v4, v1, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->label:I

    const/4 v5, 0x0

    packed-switch v4, :pswitch_data_0

    .line 64
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 40
    :pswitch_0
    iget-object v3, v1, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->L$3:Ljava/lang/Object;

    check-cast v3, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;

    iget-object v3, v1, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->L$2:Ljava/lang/Object;

    check-cast v3, Lokhttp3/Call;

    iget-object v3, v1, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lokhttp3/Request;

    iget-object v3, v1, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lkotlinx/coroutines/CoroutineScope;

    :try_start_0
    instance-of v4, v2, Lkotlin/Result$Failure;

    if-eqz v4, :cond_5

    check-cast v2, Lkotlin/Result$Failure;

    iget-object v2, v2, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    :goto_0
    move-object v2, v0

    goto/16 :goto_3

    :pswitch_1
    instance-of v4, v2, Lkotlin/Result$Failure;

    if-eqz v4, :cond_0

    check-cast v2, Lkotlin/Result$Failure;

    iget-object v2, v2, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw v2

    :cond_0
    iget-object v2, v1, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    .line 42
    :try_start_1
    iget-object v4, v1, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->this$0:Lio/streamroot/dna/core/http/HttpRequestInteractor;

    invoke-static {v4}, Lio/streamroot/dna/core/http/HttpRequestInteractor;->access$getRequestFactory$p(Lio/streamroot/dna/core/http/HttpRequestInteractor;)Lio/streamroot/dna/core/http/RequestFactory;

    move-result-object v4

    iget-object v6, v1, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->$url:Ljava/lang/String;

    iget-object v7, v1, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->$encodedHeaders:Ljava/lang/String;

    invoke-virtual {v4, v6, v7}, Lio/streamroot/dna/core/http/RequestFactory;->buildGetRequest(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request;

    move-result-object v4

    .line 43
    iget-object v6, v1, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->this$0:Lio/streamroot/dna/core/http/HttpRequestInteractor;

    invoke-static {v6}, Lio/streamroot/dna/core/http/HttpRequestInteractor;->access$getCallFactory$p(Lio/streamroot/dna/core/http/HttpRequestInteractor;)Lokhttp3/Call$Factory;

    move-result-object v6

    invoke-interface {v6, v4}, Lokhttp3/Call$Factory;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object v6

    const-string v7, "callFactory.newCall(request)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    iput-object v2, v1, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->L$0:Ljava/lang/Object;

    iput-object v4, v1, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->L$1:Ljava/lang/Object;

    iput-object v6, v1, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->L$2:Ljava/lang/Object;

    iput-object v1, v1, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->L$3:Ljava/lang/Object;

    const/4 v4, 0x1

    iput v4, v1, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->label:I

    .line 89
    new-instance v7, Lkotlinx/coroutines/CancellableContinuationImpl;

    invoke-static/range {p0 .. p0}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v8

    invoke-direct {v7, v8, v4}, Lkotlinx/coroutines/CancellableContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 90
    invoke-virtual {v7}, Lkotlinx/coroutines/CancellableContinuationImpl;->initCancellability()V

    .line 91
    move-object v4, v7

    check-cast v4, Lkotlinx/coroutines/CancellableContinuation;

    .line 92
    new-instance v8, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1$invokeSuspend$$inlined$executeCancellably$1;

    invoke-direct {v8, v6, v1, v2}, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1$invokeSuspend$$inlined$executeCancellably$1;-><init>(Lokhttp3/Call;Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;Lkotlinx/coroutines/CoroutineScope;)V

    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-interface {v4, v8}, Lkotlinx/coroutines/CancellableContinuation;->invokeOnCancellation(Lkotlin/jvm/functions/Function1;)V

    .line 93
    check-cast v4, Lkotlin/coroutines/Continuation;

    invoke-interface {v6}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    move-result-object v6

    check-cast v6, Ljava/io/Closeable;

    move-object v8, v5

    check-cast v8, Ljava/lang/Throwable;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    :try_start_2
    move-object v9, v6

    check-cast v9, Lokhttp3/Response;

    .line 44
    invoke-static {v2}, Lkotlinx/coroutines/CoroutineScopeKt;->isActive(Lkotlinx/coroutines/CoroutineScope;)Z

    move-result v10

    if-nez v10, :cond_1

    goto :goto_1

    .line 46
    :cond_1
    invoke-virtual {v9}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v10

    if-nez v10, :cond_2

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    .line 47
    :cond_2
    iget-object v11, v1, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->this$0:Lio/streamroot/dna/core/http/HttpRequestInteractor;

    const-string v12, "this"

    invoke-static {v10, v12}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11, v10}, Lio/streamroot/dna/core/http/HttpRequestInteractor;->access$loadResponseBody(Lio/streamroot/dna/core/http/HttpRequestInteractor;Lokhttp3/ResponseBody;)[Ljava/nio/ByteBuffer;

    move-result-object v15

    .line 48
    invoke-virtual {v10}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v10

    long-to-int v10, v10

    .line 49
    new-instance v11, Lio/streamroot/dna/core/binary/store/BinaryData;

    const/4 v14, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x0

    move-object v13, v11

    move/from16 v16, v10

    invoke-direct/range {v13 .. v18}, Lio/streamroot/dna/core/binary/store/BinaryData;-><init>(Ljava/lang/String;[Ljava/nio/ByteBuffer;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 50
    iget-object v12, v1, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->this$0:Lio/streamroot/dna/core/http/HttpRequestInteractor;

    invoke-static {v12}, Lio/streamroot/dna/core/http/HttpRequestInteractor;->access$getBinaryDataStore$p(Lio/streamroot/dna/core/http/HttpRequestInteractor;)Lio/streamroot/dna/core/binary/store/BinaryDataStore;

    move-result-object v12

    invoke-virtual {v12, v11}, Lio/streamroot/dna/core/binary/store/BinaryDataStore;->add(Lio/streamroot/dna/core/binary/store/BinaryData;)Ljava/lang/String;

    .line 51
    iget-object v12, v1, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->this$0:Lio/streamroot/dna/core/http/HttpRequestInteractor;

    invoke-static {v12}, Lio/streamroot/dna/core/http/HttpRequestInteractor;->access$getHttpRequestHandler$p(Lio/streamroot/dna/core/http/HttpRequestInteractor;)Lio/streamroot/dna/core/http/HttpRequestHandler;

    move-result-object v12

    .line 52
    iget-object v13, v1, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->$requestId:Ljava/lang/String;

    .line 53
    invoke-virtual {v11}, Lio/streamroot/dna/core/binary/store/BinaryData;->getId()Ljava/lang/String;

    move-result-object v11

    .line 55
    invoke-virtual {v9}, Lokhttp3/Response;->code()I

    move-result v14

    .line 51
    invoke-virtual {v12, v13, v11, v10, v14}, Lio/streamroot/dna/core/http/HttpRequestHandler;->dataResponseCall(Ljava/lang/String;Ljava/lang/String;II)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 93
    :goto_1
    :try_start_3
    invoke-static {v6, v8}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v9}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v4, v6}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    .line 95
    invoke-virtual {v7}, Lkotlinx/coroutines/CancellableContinuationImpl;->getResult()Ljava/lang/Object;

    move-result-object v4

    .line 88
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v6

    if-ne v4, v6, :cond_3

    invoke-static/range {p0 .. p0}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    :cond_3
    if-ne v4, v3, :cond_5

    return-object v3

    :catchall_0
    move-exception v0

    move-object v3, v0

    goto :goto_2

    :catch_1
    move-exception v0

    move-object v8, v0

    .line 93
    :try_start_4
    throw v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_2
    :try_start_5
    invoke-static {v6, v8}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v3
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    :catch_2
    move-exception v0

    move-object v3, v2

    goto/16 :goto_0

    .line 59
    :goto_3
    invoke-interface {v3}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v4

    sget-object v6, Lio/streamroot/dna/core/context/DnaCoroutineContext;->Key:Lio/streamroot/dna/core/context/DnaCoroutineContext$Key;

    check-cast v6, Lkotlin/coroutines/CoroutineContext$Key;

    invoke-interface {v4, v6}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v4

    check-cast v4, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    if-eqz v4, :cond_4

    invoke-interface {v3}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v6

    check-cast v2, Ljava/lang/Throwable;

    invoke-virtual {v4, v6, v2}, Lio/streamroot/dna/core/context/DnaCoroutineContext;->handleException(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V

    .line 60
    :cond_4
    invoke-static {v3}, Lkotlinx/coroutines/CoroutineScopeKt;->isActive(Lkotlinx/coroutines/CoroutineScope;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 61
    iget-object v2, v1, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->this$0:Lio/streamroot/dna/core/http/HttpRequestInteractor;

    invoke-static {v2}, Lio/streamroot/dna/core/http/HttpRequestInteractor;->access$getHttpRequestHandler$p(Lio/streamroot/dna/core/http/HttpRequestInteractor;)Lio/streamroot/dna/core/http/HttpRequestHandler;

    move-result-object v2

    iget-object v3, v1, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;->$requestId:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v5, v4, v4}, Lio/streamroot/dna/core/http/HttpRequestHandler;->dataResponseCall(Ljava/lang/String;Ljava/lang/String;II)V

    .line 64
    :cond_5
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
