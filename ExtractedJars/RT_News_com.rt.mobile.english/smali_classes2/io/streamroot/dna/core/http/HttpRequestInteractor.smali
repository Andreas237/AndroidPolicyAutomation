.class public final Lio/streamroot/dna/core/http/HttpRequestInteractor;
.super Ljava/lang/Object;
.source "HttpRequestInteractor.kt"

# interfaces
.implements Lio/streamroot/dna/core/js/PanamaInteractor;
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHttpRequestInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpRequestInteractor.kt\nio/streamroot/dna/core/http/HttpRequestInteractor\n+ 2 ChunkPool.kt\nio/streamroot/dna/core/binary/store/ChunkPool\n+ 3 IntrinsicArrayConstructors.kt\norg/jetbrains/kotlin/codegen/intrinsics/IntrinsicArrayConstructorsKt\n*L\n1#1,86:1\n35#2:87\n42#3,5:88\n*E\n*S KotlinDebug\n*F\n+ 1 HttpRequestInteractor.kt\nio/streamroot/dna/core/http/HttpRequestInteractor\n*L\n78#1:87\n78#1,5:88\n*E\n"
.end annotation

.annotation runtime Lio/streamroot/dna/core/context/bean/DnaBean;
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0008\u0010\u0016\u001a\u00020\u0013H\u0016J \u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0015H\u0007J\u001d\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002\u00a2\u0006\u0002\u0010\u001fJ\u0008\u0010 \u001a\u00020\u0015H\u0016R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"
    }
    d2 = {
        "Lio/streamroot/dna/core/http/HttpRequestInteractor;",
        "Lio/streamroot/dna/core/js/PanamaInteractor;",
        "Ljava/lang/AutoCloseable;",
        "callFactory",
        "Lokhttp3/Call$Factory;",
        "httpRequestHandler",
        "Lio/streamroot/dna/core/http/HttpRequestHandler;",
        "binaryDataStore",
        "Lio/streamroot/dna/core/binary/store/BinaryDataStore;",
        "requestFactory",
        "Lio/streamroot/dna/core/http/RequestFactory;",
        "context",
        "Lkotlin/coroutines/CoroutineContext;",
        "chunkPool",
        "Lio/streamroot/dna/core/binary/store/ChunkPool;",
        "(Lokhttp3/Call$Factory;Lio/streamroot/dna/core/http/HttpRequestHandler;Lio/streamroot/dna/core/binary/store/BinaryDataStore;Lio/streamroot/dna/core/http/RequestFactory;Lkotlin/coroutines/CoroutineContext;Lio/streamroot/dna/core/binary/store/ChunkPool;)V",
        "supervisor",
        "Lkotlinx/coroutines/Job;",
        "abort",
        "",
        "requestId",
        "",
        "close",
        "getBinaryData",
        "url",
        "encodedHeaders",
        "loadResponseBody",
        "",
        "Ljava/nio/ByteBuffer;",
        "body",
        "Lokhttp3/ResponseBody;",
        "(Lokhttp3/ResponseBody;)[Ljava/nio/ByteBuffer;",
        "name",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final binaryDataStore:Lio/streamroot/dna/core/binary/store/BinaryDataStore;

.field private final callFactory:Lokhttp3/Call$Factory;

.field private final chunkPool:Lio/streamroot/dna/core/binary/store/ChunkPool;

.field private final context:Lkotlin/coroutines/CoroutineContext;

.field private final httpRequestHandler:Lio/streamroot/dna/core/http/HttpRequestHandler;

.field private final requestFactory:Lio/streamroot/dna/core/http/RequestFactory;

.field private final supervisor:Lkotlinx/coroutines/Job;


# direct methods
.method public constructor <init>(Lokhttp3/Call$Factory;Lio/streamroot/dna/core/http/HttpRequestHandler;Lio/streamroot/dna/core/binary/store/BinaryDataStore;Lio/streamroot/dna/core/http/RequestFactory;Lkotlin/coroutines/CoroutineContext;Lio/streamroot/dna/core/binary/store/ChunkPool;)V
    .locals 1
    .param p1    # Lokhttp3/Call$Factory;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/http/HttpRequestHandler;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/streamroot/dna/core/binary/store/BinaryDataStore;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lio/streamroot/dna/core/http/RequestFactory;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lio/streamroot/dna/core/binary/store/ChunkPool;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "callFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "httpRequestHandler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binaryDataStore"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestFactory"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chunkPool"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/http/HttpRequestInteractor;->callFactory:Lokhttp3/Call$Factory;

    iput-object p2, p0, Lio/streamroot/dna/core/http/HttpRequestInteractor;->httpRequestHandler:Lio/streamroot/dna/core/http/HttpRequestHandler;

    iput-object p3, p0, Lio/streamroot/dna/core/http/HttpRequestInteractor;->binaryDataStore:Lio/streamroot/dna/core/binary/store/BinaryDataStore;

    iput-object p4, p0, Lio/streamroot/dna/core/http/HttpRequestInteractor;->requestFactory:Lio/streamroot/dna/core/http/RequestFactory;

    iput-object p5, p0, Lio/streamroot/dna/core/http/HttpRequestInteractor;->context:Lkotlin/coroutines/CoroutineContext;

    iput-object p6, p0, Lio/streamroot/dna/core/http/HttpRequestInteractor;->chunkPool:Lio/streamroot/dna/core/binary/store/ChunkPool;

    const/4 p1, 0x0

    const/4 p2, 0x1

    .line 30
    invoke-static {p1, p2, p1}, Lkotlinx/coroutines/SupervisorKt;->SupervisorJob$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/core/http/HttpRequestInteractor;->supervisor:Lkotlinx/coroutines/Job;

    return-void
.end method

.method public static final synthetic access$getBinaryDataStore$p(Lio/streamroot/dna/core/http/HttpRequestInteractor;)Lio/streamroot/dna/core/binary/store/BinaryDataStore;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 22
    iget-object p0, p0, Lio/streamroot/dna/core/http/HttpRequestInteractor;->binaryDataStore:Lio/streamroot/dna/core/binary/store/BinaryDataStore;

    return-object p0
.end method

.method public static final synthetic access$getCallFactory$p(Lio/streamroot/dna/core/http/HttpRequestInteractor;)Lokhttp3/Call$Factory;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 22
    iget-object p0, p0, Lio/streamroot/dna/core/http/HttpRequestInteractor;->callFactory:Lokhttp3/Call$Factory;

    return-object p0
.end method

.method public static final synthetic access$getHttpRequestHandler$p(Lio/streamroot/dna/core/http/HttpRequestInteractor;)Lio/streamroot/dna/core/http/HttpRequestHandler;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 22
    iget-object p0, p0, Lio/streamroot/dna/core/http/HttpRequestInteractor;->httpRequestHandler:Lio/streamroot/dna/core/http/HttpRequestHandler;

    return-object p0
.end method

.method public static final synthetic access$getRequestFactory$p(Lio/streamroot/dna/core/http/HttpRequestInteractor;)Lio/streamroot/dna/core/http/RequestFactory;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 22
    iget-object p0, p0, Lio/streamroot/dna/core/http/HttpRequestInteractor;->requestFactory:Lio/streamroot/dna/core/http/RequestFactory;

    return-object p0
.end method

.method public static final synthetic access$loadResponseBody(Lio/streamroot/dna/core/http/HttpRequestInteractor;Lokhttp3/ResponseBody;)[Ljava/nio/ByteBuffer;
    .locals 0
    .param p1    # Lokhttp3/ResponseBody;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 22
    invoke-direct {p0, p1}, Lio/streamroot/dna/core/http/HttpRequestInteractor;->loadResponseBody(Lokhttp3/ResponseBody;)[Ljava/nio/ByteBuffer;

    move-result-object p0

    return-object p0
.end method

.method private final loadResponseBody(Lokhttp3/ResponseBody;)[Ljava/nio/ByteBuffer;
    .locals 6

    .line 75
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v0

    .line 77
    :try_start_0
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->source()Lokio/BufferedSource;

    move-result-object p1

    .line 78
    iget-object v2, p0, Lio/streamroot/dna/core/http/HttpRequestInteractor;->chunkPool:Lio/streamroot/dna/core/binary/store/ChunkPool;

    long-to-double v0, v0

    .line 87
    invoke-virtual {v2}, Lio/streamroot/dna/core/binary/store/ChunkPool;->getChunkSize()I

    move-result v3

    int-to-double v3, v3

    div-double/2addr v0, v3

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    .line 88
    new-array v0, v0, [Ljava/nio/ByteBuffer;

    const/4 v1, 0x0

    .line 89
    array-length v3, v0

    :goto_0
    if-ge v1, v3, :cond_1

    .line 87
    invoke-virtual {v2}, Lio/streamroot/dna/core/binary/store/ChunkPool;->borrow()Ljava/nio/ByteBuffer;

    move-result-object v4

    .line 79
    :goto_1
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {p1, v4}, Lokio/BufferedSource;->read(Ljava/nio/ByteBuffer;)I

    move-result v5

    if-lez v5, :cond_0

    goto :goto_1

    .line 80
    :cond_0
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 87
    aput-object v4, v0, v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0

    :catch_0
    move-exception p1

    .line 83
    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method


# virtual methods
.method public final abort(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "requestId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public close()V
    .locals 1

    .line 71
    iget-object v0, p0, Lio/streamroot/dna/core/http/HttpRequestInteractor;->supervisor:Lkotlinx/coroutines/Job;

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->cancel()V

    return-void
.end method

.method public final getBinaryData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "requestId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "encodedHeaders"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    sget-object v0, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    iget-object v0, p0, Lio/streamroot/dna/core/http/HttpRequestInteractor;->context:Lkotlin/coroutines/CoroutineContext;

    iget-object v2, p0, Lio/streamroot/dna/core/http/HttpRequestInteractor;->supervisor:Lkotlinx/coroutines/Job;

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {v0, v2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v2

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {v0, v2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v2

    new-instance v0, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;

    const/4 v8, 0x0

    move-object v3, v0

    move-object v4, p0

    move-object v5, p2

    move-object v6, p3

    move-object v7, p1

    invoke-direct/range {v3 .. v8}, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1;-><init>(Lio/streamroot/dna/core/http/HttpRequestInteractor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public name()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "HttpRequestInteractor"

    return-object v0
.end method
