.class final Lio/streamroot/dna/core/stream/ManifestHandler$updatePlaylistManifest$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ManifestHandler.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/stream/ManifestHandler;->updatePlaylistManifest(Lokhttp3/HttpUrl;Ljava/lang/String;)V
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
    value = "SMAP\nManifestHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManifestHandler.kt\nio/streamroot/dna/core/stream/ManifestHandler$updatePlaylistManifest$1\n+ 2 CallExecutor.kt\nio/streamroot/dna/core/js/CallExecutor\n*L\n1#1,58:1\n23#2,2:59\n*E\n*S KotlinDebug\n*F\n+ 1 ManifestHandler.kt\nio/streamroot/dna/core/stream/ManifestHandler$updatePlaylistManifest$1\n*L\n42#1,2:59\n*E\n"
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
    c = "io/streamroot/dna/core/stream/ManifestHandler$updatePlaylistManifest$1"
    f = "ManifestHandler.kt"
    i = {}
    l = {
        0x27
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $content:Ljava/lang/String;

.field final synthetic $manifestUrl:Lokhttp3/HttpUrl;

.field label:I

.field private p$:Lkotlinx/coroutines/CoroutineScope;

.field final synthetic this$0:Lio/streamroot/dna/core/stream/ManifestHandler;


# direct methods
.method constructor <init>(Lio/streamroot/dna/core/stream/ManifestHandler;Lokhttp3/HttpUrl;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/stream/ManifestHandler$updatePlaylistManifest$1;->this$0:Lio/streamroot/dna/core/stream/ManifestHandler;

    iput-object p2, p0, Lio/streamroot/dna/core/stream/ManifestHandler$updatePlaylistManifest$1;->$manifestUrl:Lokhttp3/HttpUrl;

    iput-object p3, p0, Lio/streamroot/dna/core/stream/ManifestHandler$updatePlaylistManifest$1;->$content:Ljava/lang/String;

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

    new-instance v0, Lio/streamroot/dna/core/stream/ManifestHandler$updatePlaylistManifest$1;

    iget-object v1, p0, Lio/streamroot/dna/core/stream/ManifestHandler$updatePlaylistManifest$1;->this$0:Lio/streamroot/dna/core/stream/ManifestHandler;

    iget-object v2, p0, Lio/streamroot/dna/core/stream/ManifestHandler$updatePlaylistManifest$1;->$manifestUrl:Lokhttp3/HttpUrl;

    iget-object v3, p0, Lio/streamroot/dna/core/stream/ManifestHandler$updatePlaylistManifest$1;->$content:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p2}, Lio/streamroot/dna/core/stream/ManifestHandler$updatePlaylistManifest$1;-><init>(Lio/streamroot/dna/core/stream/ManifestHandler;Lokhttp3/HttpUrl;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    iput-object p1, v0, Lio/streamroot/dna/core/stream/ManifestHandler$updatePlaylistManifest$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lio/streamroot/dna/core/stream/ManifestHandler$updatePlaylistManifest$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/stream/ManifestHandler$updatePlaylistManifest$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/stream/ManifestHandler$updatePlaylistManifest$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    .line 39
    iget v0, p0, Lio/streamroot/dna/core/stream/ManifestHandler$updatePlaylistManifest$1;->label:I

    if-eqz v0, :cond_0

    .line 51
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 39
    :cond_0
    instance-of v0, p1, Lkotlin/Result$Failure;

    if-eqz v0, :cond_1

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :cond_1
    iget-object p1, p0, Lio/streamroot/dna/core/stream/ManifestHandler$updatePlaylistManifest$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    .line 41
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/stream/ManifestHandler$updatePlaylistManifest$1;->$manifestUrl:Lokhttp3/HttpUrl;

    invoke-virtual {v0}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "manifestUrl.toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    iget-object v1, p0, Lio/streamroot/dna/core/stream/ManifestHandler$updatePlaylistManifest$1;->this$0:Lio/streamroot/dna/core/stream/ManifestHandler;

    invoke-static {v1}, Lio/streamroot/dna/core/stream/ManifestHandler;->access$getCallExecutor$p(Lio/streamroot/dna/core/stream/ManifestHandler;)Lio/streamroot/dna/core/js/CallExecutor;

    move-result-object v1

    .line 59
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Panama.updatePlaylistManifest("

    .line 43
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v2, v0}, Lio/streamroot/dna/core/utils/StringBuilderExtensionKt;->encodeAndAppendWithComma(Ljava/lang/StringBuilder;Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 45
    iget-object v0, p0, Lio/streamroot/dna/core/stream/ManifestHandler$updatePlaylistManifest$1;->$content:Ljava/lang/String;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v2, v0}, Lio/streamroot/dna/core/utils/StringBuilderExtensionKt;->encodeAndAppend(Ljava/lang/StringBuilder;Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const-string v0, ");"

    .line 46
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lio/streamroot/dna/core/js/CallExecutor;->execute(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 49
    invoke-interface {p1}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v1

    sget-object v2, Lio/streamroot/dna/core/context/DnaCoroutineContext;->Key:Lio/streamroot/dna/core/context/DnaCoroutineContext$Key;

    check-cast v2, Lkotlin/coroutines/CoroutineContext$Key;

    invoke-interface {v1, v2}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v1

    check-cast v1, Lio/streamroot/dna/core/context/DnaCoroutineContext;

    if-eqz v1, :cond_2

    invoke-interface {p1}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    check-cast v0, Ljava/lang/Throwable;

    invoke-virtual {v1, p1, v0}, Lio/streamroot/dna/core/context/DnaCoroutineContext;->handleException(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V

    .line 51
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
