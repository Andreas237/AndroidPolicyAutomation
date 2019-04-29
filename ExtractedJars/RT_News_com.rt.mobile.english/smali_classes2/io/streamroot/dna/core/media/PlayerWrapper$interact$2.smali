.class final Lio/streamroot/dna/core/media/PlayerWrapper$interact$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "PlayerWrapper.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/media/PlayerWrapper;->interact(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lkotlin/Pair<",
        "+",
        "Ljava/lang/Long;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lio/streamroot/dna/core/TimeRange;",
        ">;>;>;",
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
        "\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0005H\u008a@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "<anonymous>",
        "Lkotlin/Pair;",
        "",
        "",
        "Lio/streamroot/dna/core/TimeRange;",
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
    c = "io/streamroot/dna/core/media/PlayerWrapper$interact$2"
    f = "PlayerWrapper.kt"
    i = {}
    l = {
        0xf
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field private p$:Lkotlinx/coroutines/CoroutineScope;

.field final synthetic this$0:Lio/streamroot/dna/core/media/PlayerWrapper;


# direct methods
.method constructor <init>(Lio/streamroot/dna/core/media/PlayerWrapper;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/media/PlayerWrapper$interact$2;->this$0:Lio/streamroot/dna/core/media/PlayerWrapper;

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

    new-instance v0, Lio/streamroot/dna/core/media/PlayerWrapper$interact$2;

    iget-object v1, p0, Lio/streamroot/dna/core/media/PlayerWrapper$interact$2;->this$0:Lio/streamroot/dna/core/media/PlayerWrapper;

    invoke-direct {v0, v1, p2}, Lio/streamroot/dna/core/media/PlayerWrapper$interact$2;-><init>(Lio/streamroot/dna/core/media/PlayerWrapper;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    iput-object p1, v0, Lio/streamroot/dna/core/media/PlayerWrapper$interact$2;->p$:Lkotlinx/coroutines/CoroutineScope;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lio/streamroot/dna/core/media/PlayerWrapper$interact$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/media/PlayerWrapper$interact$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/media/PlayerWrapper$interact$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    .line 15
    iget v0, p0, Lio/streamroot/dna/core/media/PlayerWrapper$interact$2;->label:I

    if-eqz v0, :cond_0

    .line 16
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 15
    :cond_0
    instance-of v0, p1, Lkotlin/Result$Failure;

    if-eqz v0, :cond_1

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :cond_1
    iget-object p1, p0, Lio/streamroot/dna/core/media/PlayerWrapper$interact$2;->p$:Lkotlinx/coroutines/CoroutineScope;

    .line 16
    new-instance p1, Lkotlin/Pair;

    iget-object v0, p0, Lio/streamroot/dna/core/media/PlayerWrapper$interact$2;->this$0:Lio/streamroot/dna/core/media/PlayerWrapper;

    invoke-static {v0}, Lio/streamroot/dna/core/media/PlayerWrapper;->access$getPlayerInteractor$p(Lio/streamroot/dna/core/media/PlayerWrapper;)Lio/streamroot/dna/core/PlayerInteractor;

    move-result-object v0

    invoke-interface {v0}, Lio/streamroot/dna/core/PlayerInteractor;->playbackTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object v0

    iget-object v1, p0, Lio/streamroot/dna/core/media/PlayerWrapper$interact$2;->this$0:Lio/streamroot/dna/core/media/PlayerWrapper;

    invoke-static {v1}, Lio/streamroot/dna/core/media/PlayerWrapper;->access$getPlayerInteractor$p(Lio/streamroot/dna/core/media/PlayerWrapper;)Lio/streamroot/dna/core/PlayerInteractor;

    move-result-object v1

    invoke-interface {v1}, Lio/streamroot/dna/core/PlayerInteractor;->loadedTimeRanges()Ljava/util/List;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method
