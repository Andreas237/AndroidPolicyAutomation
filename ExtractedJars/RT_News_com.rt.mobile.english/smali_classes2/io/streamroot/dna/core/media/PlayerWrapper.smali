.class public final Lio/streamroot/dna/core/media/PlayerWrapper;
.super Ljava/lang/Object;
.source "PlayerWrapper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J#\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n0\u0008H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000cR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\r"
    }
    d2 = {
        "Lio/streamroot/dna/core/media/PlayerWrapper;",
        "",
        "playerInteractor",
        "Lio/streamroot/dna/core/PlayerInteractor;",
        "(Lio/streamroot/dna/core/PlayerInteractor;)V",
        "playerCoroutineContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "interact",
        "Lkotlin/Pair;",
        "",
        "",
        "Lio/streamroot/dna/core/TimeRange;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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
.field private final playerCoroutineContext:Lkotlin/coroutines/CoroutineContext;

.field private final playerInteractor:Lio/streamroot/dna/core/PlayerInteractor;


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/PlayerInteractor;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/PlayerInteractor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "playerInteractor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/media/PlayerWrapper;->playerInteractor:Lio/streamroot/dna/core/PlayerInteractor;

    .line 11
    iget-object p1, p0, Lio/streamroot/dna/core/media/PlayerWrapper;->playerInteractor:Lio/streamroot/dna/core/PlayerInteractor;

    invoke-interface {p1}, Lio/streamroot/dna/core/PlayerInteractor;->looper()Landroid/os/Looper;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance p1, Landroid/os/Handler;

    iget-object v0, p0, Lio/streamroot/dna/core/media/PlayerWrapper;->playerInteractor:Lio/streamroot/dna/core/PlayerInteractor;

    invoke-interface {v0}, Lio/streamroot/dna/core/PlayerInteractor;->looper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    const-string v0, "playerDispatcher"

    invoke-static {p1, v0}, Lkotlinx/coroutines/android/HandlerDispatcherKt;->from(Landroid/os/Handler;Ljava/lang/String;)Lkotlinx/coroutines/android/HandlerDispatcher;

    move-result-object p1

    check-cast p1, Lkotlin/coroutines/CoroutineContext;

    :goto_0
    iput-object p1, p0, Lio/streamroot/dna/core/media/PlayerWrapper;->playerCoroutineContext:Lkotlin/coroutines/CoroutineContext;

    return-void
.end method

.method public static final synthetic access$getPlayerInteractor$p(Lio/streamroot/dna/core/media/PlayerWrapper;)Lio/streamroot/dna/core/PlayerInteractor;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 10
    iget-object p0, p0, Lio/streamroot/dna/core/media/PlayerWrapper;->playerInteractor:Lio/streamroot/dna/core/PlayerInteractor;

    return-object p0
.end method


# virtual methods
.method public final interact(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Pair<",
            "Ljava/lang/Long;",
            "+",
            "Ljava/util/List<",
            "Lio/streamroot/dna/core/TimeRange;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p1, Lio/streamroot/dna/core/media/PlayerWrapper$interact$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/streamroot/dna/core/media/PlayerWrapper$interact$1;

    iget v1, v0, Lio/streamroot/dna/core/media/PlayerWrapper$interact$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lio/streamroot/dna/core/media/PlayerWrapper$interact$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lio/streamroot/dna/core/media/PlayerWrapper$interact$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/streamroot/dna/core/media/PlayerWrapper$interact$1;

    invoke-direct {v0, p0, p1}, Lio/streamroot/dna/core/media/PlayerWrapper$interact$1;-><init>(Lio/streamroot/dna/core/media/PlayerWrapper;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lio/streamroot/dna/core/media/PlayerWrapper$interact$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 13
    iget v2, v0, Lio/streamroot/dna/core/media/PlayerWrapper$interact$1;->label:I

    packed-switch v2, :pswitch_data_0

    .line 14
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 13
    :pswitch_0
    iget-object v0, v0, Lio/streamroot/dna/core/media/PlayerWrapper$interact$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/streamroot/dna/core/media/PlayerWrapper;

    instance-of v0, p1, Lkotlin/Result$Failure;

    if-eqz v0, :cond_2

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :pswitch_1
    instance-of v2, p1, Lkotlin/Result$Failure;

    if-eqz v2, :cond_1

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    .line 14
    :cond_1
    iget-object p1, p0, Lio/streamroot/dna/core/media/PlayerWrapper;->playerCoroutineContext:Lkotlin/coroutines/CoroutineContext;

    if-eqz p1, :cond_3

    .line 15
    iget-object p1, p0, Lio/streamroot/dna/core/media/PlayerWrapper;->playerCoroutineContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v2, Lio/streamroot/dna/core/media/PlayerWrapper$interact$2;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lio/streamroot/dna/core/media/PlayerWrapper$interact$2;-><init>(Lio/streamroot/dna/core/media/PlayerWrapper;Lkotlin/coroutines/Continuation;)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    iput-object p0, v0, Lio/streamroot/dna/core/media/PlayerWrapper$interact$1;->L$0:Ljava/lang/Object;

    const/4 v3, 0x1

    iput v3, v0, Lio/streamroot/dna/core/media/PlayerWrapper$interact$1;->label:I

    invoke-static {p1, v2, v0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    .line 19
    :cond_2
    check-cast p1, Lkotlin/Pair;

    goto :goto_1

    :cond_3
    new-instance p1, Lkotlin/Pair;

    iget-object v0, p0, Lio/streamroot/dna/core/media/PlayerWrapper;->playerInteractor:Lio/streamroot/dna/core/PlayerInteractor;

    invoke-interface {v0}, Lio/streamroot/dna/core/PlayerInteractor;->playbackTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object v0

    iget-object v1, p0, Lio/streamroot/dna/core/media/PlayerWrapper;->playerInteractor:Lio/streamroot/dna/core/PlayerInteractor;

    invoke-interface {v1}, Lio/streamroot/dna/core/PlayerInteractor;->loadedTimeRanges()Ljava/util/List;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
