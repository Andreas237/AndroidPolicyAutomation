.class final Lio/streamroot/dna/core/proxy/server/WebServer$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "WebServer.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/proxy/server/WebServer;-><init>(Lio/streamroot/dna/core/proxy/ProxyRequestForwarder;Ljava/util/List;Lkotlin/coroutines/CoroutineContext;I)V
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
    value = "SMAP\nWebServer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebServer.kt\nio/streamroot/dna/core/proxy/server/WebServer$1\n+ 2 ClosableExtension.kt\nio/streamroot/dna/core/utils/ClosableExtensionKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,136:1\n9#2:137\n10#2,3:142\n156#3,4:138\n160#3,2:145\n*E\n*S KotlinDebug\n*F\n+ 1 WebServer.kt\nio/streamroot/dna/core/proxy/server/WebServer$1\n*L\n52#1:137\n52#1,3:142\n52#1,4:138\n52#1,2:145\n*E\n"
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
    c = "io/streamroot/dna/core/proxy/server/WebServer$1"
    f = "WebServer.kt"
    i = {
        0x0,
        0x1
    }
    l = {
        0x31,
        0x92,
        0x37
    }
    m = "invokeSuspend"
    n = {
        "$receiver$iv",
        "client"
    }
    s = {
        "L$1",
        "L$1"
    }
.end annotation


# instance fields
.field final synthetic $myServerSocket:Ljava/net/ServerSocket;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field private p$:Lkotlinx/coroutines/CoroutineScope;

.field final synthetic this$0:Lio/streamroot/dna/core/proxy/server/WebServer;


# direct methods
.method constructor <init>(Lio/streamroot/dna/core/proxy/server/WebServer;Ljava/net/ServerSocket;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/proxy/server/WebServer$1;->this$0:Lio/streamroot/dna/core/proxy/server/WebServer;

    iput-object p2, p0, Lio/streamroot/dna/core/proxy/server/WebServer$1;->$myServerSocket:Ljava/net/ServerSocket;

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

    new-instance v0, Lio/streamroot/dna/core/proxy/server/WebServer$1;

    iget-object v1, p0, Lio/streamroot/dna/core/proxy/server/WebServer$1;->this$0:Lio/streamroot/dna/core/proxy/server/WebServer;

    iget-object v2, p0, Lio/streamroot/dna/core/proxy/server/WebServer$1;->$myServerSocket:Ljava/net/ServerSocket;

    invoke-direct {v0, v1, v2, p2}, Lio/streamroot/dna/core/proxy/server/WebServer$1;-><init>(Lio/streamroot/dna/core/proxy/server/WebServer;Ljava/net/ServerSocket;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    iput-object p1, v0, Lio/streamroot/dna/core/proxy/server/WebServer$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lio/streamroot/dna/core/proxy/server/WebServer$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/proxy/server/WebServer$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/proxy/server/WebServer$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 49
    iget v1, p0, Lio/streamroot/dna/core/proxy/server/WebServer$1;->label:I

    packed-switch v1, :pswitch_data_0

    .line 61
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 49
    :pswitch_0
    iget-object v1, p0, Lio/streamroot/dna/core/proxy/server/WebServer$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/net/Socket;

    iget-object v1, p0, Lio/streamroot/dna/core/proxy/server/WebServer$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    :try_start_0
    instance-of v2, p1, Lkotlin/Result$Failure;

    if-eqz v2, :cond_0

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    move-object v2, v0

    move-object v0, p0

    goto/16 :goto_1

    :pswitch_1
    iget-object v1, p0, Lio/streamroot/dna/core/proxy/server/WebServer$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lio/streamroot/dna/core/proxy/server/WebServer$1;

    iget-object v1, p0, Lio/streamroot/dna/core/proxy/server/WebServer$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/io/Closeable;

    iget-object v1, p0, Lio/streamroot/dna/core/proxy/server/WebServer$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    :try_start_1
    instance-of v2, p1, Lkotlin/Result$Failure;

    if-eqz v2, :cond_1

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :cond_1
    move-object v2, v0

    move-object v0, p0

    goto :goto_0

    :catch_0
    move-exception p1

    move-object v6, p1

    move-object p1, p0

    goto/16 :goto_2

    :pswitch_2
    instance-of v1, p1, Lkotlin/Result$Failure;

    if-eqz v1, :cond_2

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :cond_2
    iget-object p1, p0, Lio/streamroot/dna/core/proxy/server/WebServer$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    move-object v1, p1

    move-object p1, p0

    .line 52
    :cond_3
    :try_start_2
    iget-object v2, p1, Lio/streamroot/dna/core/proxy/server/WebServer$1;->$myServerSocket:Ljava/net/ServerSocket;

    check-cast v2, Ljava/io/Closeable;

    .line 138
    iput-object v1, p1, Lio/streamroot/dna/core/proxy/server/WebServer$1;->L$0:Ljava/lang/Object;

    iput-object v2, p1, Lio/streamroot/dna/core/proxy/server/WebServer$1;->L$1:Ljava/lang/Object;

    iput-object p1, p1, Lio/streamroot/dna/core/proxy/server/WebServer$1;->L$2:Ljava/lang/Object;

    const/4 v3, 0x1

    iput v3, p1, Lio/streamroot/dna/core/proxy/server/WebServer$1;->label:I

    .line 139
    new-instance v4, Lkotlinx/coroutines/CancellableContinuationImpl;

    invoke-static {p1}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v5

    invoke-direct {v4, v5, v3}, Lkotlinx/coroutines/CancellableContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 140
    invoke-virtual {v4}, Lkotlinx/coroutines/CancellableContinuationImpl;->initCancellability()V

    .line 141
    move-object v3, v4

    check-cast v3, Lkotlinx/coroutines/CancellableContinuation;

    .line 142
    new-instance v5, Lio/streamroot/dna/core/proxy/server/WebServer$1$invokeSuspend$$inlined$useCancellably$1;

    invoke-direct {v5, v2}, Lio/streamroot/dna/core/proxy/server/WebServer$1$invokeSuspend$$inlined$useCancellably$1;-><init>(Ljava/io/Closeable;)V

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-interface {v3, v5}, Lkotlinx/coroutines/CancellableContinuation;->invokeOnCancellation(Lkotlin/jvm/functions/Function1;)V

    .line 143
    check-cast v3, Lkotlin/coroutines/Continuation;

    check-cast v2, Ljava/net/ServerSocket;

    .line 52
    invoke-virtual {v2}, Ljava/net/ServerSocket;->accept()Ljava/net/Socket;

    move-result-object v2

    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v3, v2}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    .line 145
    invoke-virtual {v4}, Lkotlinx/coroutines/CancellableContinuationImpl;->getResult()Ljava/lang/Object;

    move-result-object v2

    .line 138
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_4

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :cond_4
    if-ne v2, v0, :cond_5

    return-object v0

    :cond_5
    move-object v11, v0

    move-object v0, p1

    move-object p1, v2

    move-object v2, v11

    .line 52
    :goto_0
    :try_start_3
    check-cast p1, Ljava/net/Socket;

    const-string v3, "client"

    .line 53
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x493e0

    invoke-virtual {p1, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 54
    iget-object v3, v0, Lio/streamroot/dna/core/proxy/server/WebServer$1;->this$0:Lio/streamroot/dna/core/proxy/server/WebServer;

    iput-object v1, v0, Lio/streamroot/dna/core/proxy/server/WebServer$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lio/streamroot/dna/core/proxy/server/WebServer$1;->L$1:Ljava/lang/Object;

    const/4 v4, 0x2

    iput v4, v0, Lio/streamroot/dna/core/proxy/server/WebServer$1;->label:I

    invoke-virtual {v3, p1, v0}, Lio/streamroot/dna/core/proxy/server/WebServer;->handleSession(Ljava/net/Socket;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    if-ne p1, v2, :cond_6

    return-object v2

    :cond_6
    :goto_1
    move-object p1, v0

    move-object v0, v2

    goto :goto_3

    :catch_1
    move-exception p1

    move-object v6, p1

    move-object p1, v0

    move-object v0, v2

    goto :goto_2

    :catch_2
    move-exception v2

    move-object v6, v2

    .line 56
    :goto_2
    instance-of v2, v6, Ljava/net/SocketException;

    if-nez v2, :cond_7

    .line 57
    invoke-interface {v1}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v2

    sget-object v3, Lio/streamroot/dna/core/context/DnaCoroutineContext;->Key:Lio/streamroot/dna/core/context/DnaCoroutineContext$Key;

    check-cast v3, Lkotlin/coroutines/CoroutineContext$Key;

    invoke-interface {v2, v3}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v2

    check-cast v2, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    if-eqz v2, :cond_7

    invoke-interface {v1}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v9

    new-instance v10, Lio/streamroot/dna/core/proxy/server/WebServerException;

    const-string v4, "Exception during session opening"

    const/4 v5, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    move-object v3, v10

    invoke-direct/range {v3 .. v8}, Lio/streamroot/dna/core/proxy/server/WebServerException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v10, Ljava/lang/Throwable;

    invoke-virtual {v2, v9, v10}, Lio/streamroot/dna/core/context/DnaCoroutineContext;->handleException(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V

    .line 60
    :cond_7
    :goto_3
    invoke-static {v1}, Lkotlinx/coroutines/CoroutineScopeKt;->isActive(Lkotlinx/coroutines/CoroutineScope;)Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v2, p1, Lio/streamroot/dna/core/proxy/server/WebServer$1;->$myServerSocket:Ljava/net/ServerSocket;

    invoke-virtual {v2}, Ljava/net/ServerSocket;->isClosed()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 61
    :cond_8
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
