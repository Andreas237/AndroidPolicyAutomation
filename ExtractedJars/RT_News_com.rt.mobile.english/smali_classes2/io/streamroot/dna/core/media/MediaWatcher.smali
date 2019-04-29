.class public final Lio/streamroot/dna/core/media/MediaWatcher;
.super Ljava/lang/Object;
.source "MediaWatcher.kt"

# interfaces
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation runtime Lio/streamroot/dna/core/context/bean/DnaBean;
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0008\u0010\r\u001a\u00020\u000eH\u0016J\u0006\u0010\u000f\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lio/streamroot/dna/core/media/MediaWatcher;",
        "Ljava/lang/AutoCloseable;",
        "dnaCoroutineContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "handler",
        "Lio/streamroot/dna/core/media/MediaElementHandler;",
        "player",
        "Lio/streamroot/dna/core/media/PlayerWrapper;",
        "refreshDelayInMs",
        "",
        "(Lkotlin/coroutines/CoroutineContext;Lio/streamroot/dna/core/media/MediaElementHandler;Lio/streamroot/dna/core/media/PlayerWrapper;J)V",
        "mediaWatcherJob",
        "Lkotlinx/coroutines/Job;",
        "close",
        "",
        "start",
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
.field private final dnaCoroutineContext:Lkotlin/coroutines/CoroutineContext;

.field private final handler:Lio/streamroot/dna/core/media/MediaElementHandler;

.field private mediaWatcherJob:Lkotlinx/coroutines/Job;

.field private final player:Lio/streamroot/dna/core/media/PlayerWrapper;

.field private final refreshDelayInMs:J


# direct methods
.method public constructor <init>(Lkotlin/coroutines/CoroutineContext;Lio/streamroot/dna/core/media/MediaElementHandler;Lio/streamroot/dna/core/media/PlayerWrapper;J)V
    .locals 1
    .param p1    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/media/MediaElementHandler;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/streamroot/dna/core/media/PlayerWrapper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "dnaCoroutineContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "player"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/media/MediaWatcher;->dnaCoroutineContext:Lkotlin/coroutines/CoroutineContext;

    iput-object p2, p0, Lio/streamroot/dna/core/media/MediaWatcher;->handler:Lio/streamroot/dna/core/media/MediaElementHandler;

    iput-object p3, p0, Lio/streamroot/dna/core/media/MediaWatcher;->player:Lio/streamroot/dna/core/media/PlayerWrapper;

    iput-wide p4, p0, Lio/streamroot/dna/core/media/MediaWatcher;->refreshDelayInMs:J

    return-void
.end method

.method public static final synthetic access$getHandler$p(Lio/streamroot/dna/core/media/MediaWatcher;)Lio/streamroot/dna/core/media/MediaElementHandler;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 17
    iget-object p0, p0, Lio/streamroot/dna/core/media/MediaWatcher;->handler:Lio/streamroot/dna/core/media/MediaElementHandler;

    return-object p0
.end method

.method public static final synthetic access$getPlayer$p(Lio/streamroot/dna/core/media/MediaWatcher;)Lio/streamroot/dna/core/media/PlayerWrapper;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 17
    iget-object p0, p0, Lio/streamroot/dna/core/media/MediaWatcher;->player:Lio/streamroot/dna/core/media/PlayerWrapper;

    return-object p0
.end method

.method public static final synthetic access$getRefreshDelayInMs$p(Lio/streamroot/dna/core/media/MediaWatcher;)J
    .locals 2

    .line 17
    iget-wide v0, p0, Lio/streamroot/dna/core/media/MediaWatcher;->refreshDelayInMs:J

    return-wide v0
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 42
    iget-object v0, p0, Lio/streamroot/dna/core/media/MediaWatcher;->mediaWatcherJob:Lkotlinx/coroutines/Job;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->cancel()V

    :cond_0
    return-void
.end method

.method public final start()V
    .locals 7

    .line 26
    iget-object v0, p0, Lio/streamroot/dna/core/media/MediaWatcher;->mediaWatcherJob:Lkotlinx/coroutines/Job;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->cancel()V

    .line 27
    :cond_0
    sget-object v0, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    iget-object v0, p0, Lio/streamroot/dna/core/media/MediaWatcher;->dnaCoroutineContext:Lkotlin/coroutines/CoroutineContext;

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getDefault()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v2

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {v0, v2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v2

    const/4 v3, 0x0

    new-instance v0, Lio/streamroot/dna/core/media/MediaWatcher$start$1;

    const/4 v4, 0x0

    invoke-direct {v0, p0, v4}, Lio/streamroot/dna/core/media/MediaWatcher$start$1;-><init>(Lio/streamroot/dna/core/media/MediaWatcher;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object v0

    iput-object v0, p0, Lio/streamroot/dna/core/media/MediaWatcher;->mediaWatcherJob:Lkotlinx/coroutines/Job;

    return-void
.end method
