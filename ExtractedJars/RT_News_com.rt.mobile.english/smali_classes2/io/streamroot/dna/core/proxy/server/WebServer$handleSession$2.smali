.class final Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "WebServer.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/proxy/server/WebServer;->handleSession(Ljava/net/Socket;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    value = "SMAP\nWebServer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebServer.kt\nio/streamroot/dna/core/proxy/server/WebServer$handleSession$2\n+ 2 ClosableExtension.kt\nio/streamroot/dna/core/utils/ClosableExtensionKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,136:1\n9#2:137\n10#2,3:142\n156#3,4:138\n160#3,2:145\n*E\n*S KotlinDebug\n*F\n+ 1 WebServer.kt\nio/streamroot/dna/core/proxy/server/WebServer$handleSession$2\n*L\n67#1:137\n67#1,3:142\n67#1,4:138\n67#1,2:145\n*E\n"
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
    c = "io/streamroot/dna/core/proxy/server/WebServer$handleSession$2"
    f = "WebServer.kt"
    i = {
        0x0
    }
    l = {
        0x42,
        0x92
    }
    m = "invokeSuspend"
    n = {
        "$receiver$iv"
    }
    s = {
        "L$1"
    }
.end annotation


# instance fields
.field final synthetic $acceptSocket:Ljava/net/Socket;

.field final synthetic $sessionCount:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field private p$:Lkotlinx/coroutines/CoroutineScope;

.field final synthetic this$0:Lio/streamroot/dna/core/proxy/server/WebServer;


# direct methods
.method constructor <init>(Lio/streamroot/dna/core/proxy/server/WebServer;Ljava/net/Socket;ILkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;->this$0:Lio/streamroot/dna/core/proxy/server/WebServer;

    iput-object p2, p0, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;->$acceptSocket:Ljava/net/Socket;

    iput p3, p0, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;->$sessionCount:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4
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

    new-instance v0, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;

    iget-object v1, p0, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;->this$0:Lio/streamroot/dna/core/proxy/server/WebServer;

    iget-object v2, p0, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;->$acceptSocket:Ljava/net/Socket;

    iget v3, p0, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;->$sessionCount:I

    invoke-direct {v0, v1, v2, v3, p2}, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;-><init>(Lio/streamroot/dna/core/proxy/server/WebServer;Ljava/net/Socket;ILkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    iput-object p1, v0, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;->p$:Lkotlinx/coroutines/CoroutineScope;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 66
    iget v1, p0, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;->label:I

    packed-switch v1, :pswitch_data_0

    .line 94
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 66
    :pswitch_0
    iget-object v0, p0, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;->L$2:Ljava/lang/Object;

    check-cast v0, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;

    iget-object v0, p0, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/io/Closeable;

    iget-object v0, p0, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    instance-of v0, p1, Lkotlin/Result$Failure;

    if-eqz v0, :cond_4

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :pswitch_1
    instance-of v1, p1, Lkotlin/Result$Failure;

    if-eqz v1, :cond_0

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :cond_0
    iget-object p1, p0, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;->p$:Lkotlinx/coroutines/CoroutineScope;

    .line 67
    iget-object v1, p0, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;->$acceptSocket:Ljava/net/Socket;

    check-cast v1, Ljava/io/Closeable;

    .line 138
    iput-object p1, p0, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;->L$0:Ljava/lang/Object;

    iput-object v1, p0, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;->L$1:Ljava/lang/Object;

    iput-object p0, p0, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;->L$2:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, p0, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;->label:I

    .line 139
    new-instance v3, Lkotlinx/coroutines/CancellableContinuationImpl;

    invoke-static {p0}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v4

    invoke-direct {v3, v4, v2}, Lkotlinx/coroutines/CancellableContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 140
    invoke-virtual {v3}, Lkotlinx/coroutines/CancellableContinuationImpl;->initCancellability()V

    .line 141
    move-object v2, v3

    check-cast v2, Lkotlinx/coroutines/CancellableContinuation;

    .line 142
    new-instance v4, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2$invokeSuspend$$inlined$useCancellably$1;

    invoke-direct {v4, v1, p0, p1}, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2$invokeSuspend$$inlined$useCancellably$1;-><init>(Ljava/io/Closeable;Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;Lkotlinx/coroutines/CoroutineScope;)V

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-interface {v2, v4}, Lkotlinx/coroutines/CancellableContinuation;->invokeOnCancellation(Lkotlin/jvm/functions/Function1;)V

    .line 143
    check-cast v2, Lkotlin/coroutines/Continuation;

    check-cast v1, Ljava/net/Socket;

    const/4 v4, 0x0

    .line 68
    move-object v5, v4

    check-cast v5, Ljava/io/InputStream;

    .line 69
    check-cast v4, Ljava/io/OutputStream;

    const/16 v6, 0x29

    const/4 v7, 0x0

    .line 71
    :try_start_0
    sget-object v8, Lio/streamroot/dna/core/log/Logger;->INSTANCE:Lio/streamroot/dna/core/log/Logger;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "[SESSION] New Session open "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v10, p0, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;->$sessionCount:I

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    new-array v10, v7, [Ljava/lang/Object;

    invoke-virtual {v8, v9, v10}, Lio/streamroot/dna/core/log/Logger;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    invoke-virtual {v1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 73
    :try_start_1
    invoke-virtual {v1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 74
    :try_start_2
    new-instance v4, Lio/streamroot/dna/core/proxy/server/HTTPSession;

    const-string v9, "outputStream"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "inputStream"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v5, v8}, Lio/streamroot/dna/core/proxy/server/HTTPSession;-><init>(Ljava/io/OutputStream;Ljava/io/InputStream;)V

    .line 75
    :goto_0
    invoke-static {p1}, Lkotlinx/coroutines/CoroutineScopeKt;->isActive(Lkotlinx/coroutines/CoroutineScope;)Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-virtual {v1}, Ljava/net/Socket;->isClosed()Z

    move-result v9

    if-nez v9, :cond_1

    .line 76
    iget-object v9, p0, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;->this$0:Lio/streamroot/dna/core/proxy/server/WebServer;

    check-cast v9, Lio/streamroot/dna/core/proxy/server/SessionHandler;

    invoke-virtual {v4, v9}, Lio/streamroot/dna/core/proxy/server/HTTPSession;->execute(Lio/streamroot/dna/core/proxy/server/SessionHandler;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 88
    :cond_1
    sget-object v4, Lio/streamroot/dna/core/log/Logger;->INSTANCE:Lio/streamroot/dna/core/log/Logger;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "[SESSION] Session "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v10, p0, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;->$sessionCount:I

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v10, " Close ("

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lkotlinx/coroutines/CoroutineScopeKt;->isActive(Lkotlinx/coroutines/CoroutineScope;)Z

    move-result p1

    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v6, v7, [Ljava/lang/Object;

    invoke-virtual {v4, p1, v6}, Lio/streamroot/dna/core/log/Logger;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    check-cast v5, Ljava/io/Closeable;

    invoke-static {v5}, Lio/streamroot/dna/core/utils/ClosableExtensionKt;->closeSafely(Ljava/io/Closeable;)V

    .line 90
    check-cast v8, Ljava/io/Closeable;

    invoke-static {v8}, Lio/streamroot/dna/core/utils/ClosableExtensionKt;->closeSafely(Ljava/io/Closeable;)V

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    move-object v13, v8

    move-object v8, v5

    move-object v5, v13

    goto/16 :goto_5

    :catch_0
    move-exception v4

    move-object v13, v8

    move-object v8, v5

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v5, v8

    goto :goto_2

    :catch_1
    move-exception v5

    move-object v13, v8

    move-object v8, v4

    move-object v4, v5

    :goto_1
    move-object v5, v13

    goto :goto_3

    :catchall_2
    move-exception v0

    :goto_2
    move-object v8, v4

    goto/16 :goto_5

    :catch_2
    move-exception v8

    move-object v13, v8

    move-object v8, v4

    move-object v4, v13

    .line 84
    :goto_3
    :try_start_3
    instance-of v9, v4, Lio/streamroot/dna/core/proxy/server/SocketCloseException;

    if-nez v9, :cond_2

    instance-of v9, v4, Ljava/net/SocketException;

    if-nez v9, :cond_2

    .line 85
    invoke-interface {p1}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v9

    sget-object v10, Lio/streamroot/dna/core/context/DnaCoroutineContext;->Key:Lio/streamroot/dna/core/context/DnaCoroutineContext$Key;

    check-cast v10, Lkotlin/coroutines/CoroutineContext$Key;

    invoke-interface {v9, v10}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v9

    check-cast v9, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    if-eqz v9, :cond_2

    invoke-interface {p1}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v10

    new-instance v11, Lio/streamroot/dna/core/proxy/server/SocketCloseException;

    const-string v12, "Unexpected session closing"

    check-cast v4, Ljava/lang/Throwable;

    invoke-direct {v11, v12, v4}, Lio/streamroot/dna/core/proxy/server/SocketCloseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast v11, Ljava/lang/Throwable;

    invoke-virtual {v9, v10, v11}, Lio/streamroot/dna/core/context/DnaCoroutineContext;->handleException(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 88
    :cond_2
    sget-object v4, Lio/streamroot/dna/core/log/Logger;->INSTANCE:Lio/streamroot/dna/core/log/Logger;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "[SESSION] Session "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v10, p0, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;->$sessionCount:I

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v10, " Close ("

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lkotlinx/coroutines/CoroutineScopeKt;->isActive(Lkotlinx/coroutines/CoroutineScope;)Z

    move-result p1

    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v6, v7, [Ljava/lang/Object;

    invoke-virtual {v4, p1, v6}, Lio/streamroot/dna/core/log/Logger;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    check-cast v8, Ljava/io/Closeable;

    invoke-static {v8}, Lio/streamroot/dna/core/utils/ClosableExtensionKt;->closeSafely(Ljava/io/Closeable;)V

    .line 90
    check-cast v5, Ljava/io/Closeable;

    invoke-static {v5}, Lio/streamroot/dna/core/utils/ClosableExtensionKt;->closeSafely(Ljava/io/Closeable;)V

    .line 91
    :goto_4
    check-cast v1, Ljava/io/Closeable;

    invoke-static {v1}, Lio/streamroot/dna/core/utils/ClosableExtensionKt;->closeSafely(Ljava/io/Closeable;)V

    .line 93
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v2, p1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    .line 145
    invoke-virtual {v3}, Lkotlinx/coroutines/CancellableContinuationImpl;->getResult()Ljava/lang/Object;

    move-result-object p1

    .line 138
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    if-ne p1, v1, :cond_3

    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_3
    if-ne p1, v0, :cond_4

    return-object v0

    .line 94
    :cond_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :catchall_3
    move-exception v0

    .line 88
    :goto_5
    sget-object v2, Lio/streamroot/dna/core/log/Logger;->INSTANCE:Lio/streamroot/dna/core/log/Logger;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "[SESSION] Session "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;->$sessionCount:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " Close ("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lkotlinx/coroutines/CoroutineScopeKt;->isActive(Lkotlinx/coroutines/CoroutineScope;)Z

    move-result p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v3, v7, [Ljava/lang/Object;

    invoke-virtual {v2, p1, v3}, Lio/streamroot/dna/core/log/Logger;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    check-cast v8, Ljava/io/Closeable;

    invoke-static {v8}, Lio/streamroot/dna/core/utils/ClosableExtensionKt;->closeSafely(Ljava/io/Closeable;)V

    .line 90
    check-cast v5, Ljava/io/Closeable;

    invoke-static {v5}, Lio/streamroot/dna/core/utils/ClosableExtensionKt;->closeSafely(Ljava/io/Closeable;)V

    .line 91
    check-cast v1, Ljava/io/Closeable;

    invoke-static {v1}, Lio/streamroot/dna/core/utils/ClosableExtensionKt;->closeSafely(Ljava/io/Closeable;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
