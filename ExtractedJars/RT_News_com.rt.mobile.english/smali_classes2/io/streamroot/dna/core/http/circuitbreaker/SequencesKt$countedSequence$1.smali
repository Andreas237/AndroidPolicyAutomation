.class final Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt$countedSequence$1;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "Sequences.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt;->countedSequence(IJ)Lkotlin/sequences/Sequence;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlin/sequences/SequenceScope<",
        "-",
        "Ljava/lang/Long;",
        ">;",
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
        "\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlin/sequences/SequenceScope;",
        "",
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
    c = "io/streamroot/dna/core/http/circuitbreaker/SequencesKt$countedSequence$1"
    f = "Sequences.kt"
    i = {
        0x0
    }
    l = {
        0xb,
        0xc
    }
    m = "invokeSuspend"
    n = {
        "i"
    }
    s = {
        "I$0"
    }
.end annotation


# instance fields
.field final synthetic $maxRetryCount:I

.field final synthetic $retryDelay:J

.field I$0:I

.field I$1:I

.field L$0:Ljava/lang/Object;

.field label:I

.field private p$:Lkotlin/sequences/SequenceScope;


# direct methods
.method constructor <init>(IJLkotlin/coroutines/Continuation;)V
    .locals 0

    iput p1, p0, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt$countedSequence$1;->$maxRetryCount:I

    iput-wide p2, p0, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt$countedSequence$1;->$retryDelay:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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

    new-instance v0, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt$countedSequence$1;

    iget v1, p0, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt$countedSequence$1;->$maxRetryCount:I

    iget-wide v2, p0, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt$countedSequence$1;->$retryDelay:J

    invoke-direct {v0, v1, v2, v3, p2}, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt$countedSequence$1;-><init>(IJLkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/sequences/SequenceScope;

    iput-object p1, v0, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt$countedSequence$1;->p$:Lkotlin/sequences/SequenceScope;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt$countedSequence$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt$countedSequence$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt$countedSequence$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 11
    iget v1, p0, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt$countedSequence$1;->label:I

    packed-switch v1, :pswitch_data_0

    .line 15
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 11
    :pswitch_0
    iget v1, p0, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt$countedSequence$1;->I$1:I

    iget v2, p0, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt$countedSequence$1;->I$0:I

    iget-object v3, p0, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt$countedSequence$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lkotlin/sequences/SequenceScope;

    instance-of v4, p1, Lkotlin/Result$Failure;

    if-eqz v4, :cond_0

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :cond_0
    move-object p1, p0

    goto :goto_1

    :pswitch_1
    instance-of v1, p1, Lkotlin/Result$Failure;

    if-eqz v1, :cond_1

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :cond_1
    iget-object p1, p0, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt$countedSequence$1;->p$:Lkotlin/sequences/SequenceScope;

    const/4 v1, 0x0

    .line 12
    iget v2, p0, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt$countedSequence$1;->$maxRetryCount:I

    if-ltz v2, :cond_3

    move-object v3, p1

    move-object p1, p0

    move v6, v2

    move v2, v1

    move v1, v6

    .line 13
    :goto_0
    iget-wide v4, p1, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt$countedSequence$1;->$retryDelay:J

    invoke-static {v4, v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object v4

    iput-object v3, p1, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt$countedSequence$1;->L$0:Ljava/lang/Object;

    iput v2, p1, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt$countedSequence$1;->I$0:I

    iput v1, p1, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt$countedSequence$1;->I$1:I

    const/4 v5, 0x1

    iput v5, p1, Lio/streamroot/dna/core/http/circuitbreaker/SequencesKt$countedSequence$1;->label:I

    invoke-virtual {v3, v4, p1}, Lkotlin/sequences/SequenceScope;->yield(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_2

    return-object v0

    :cond_2
    :goto_1
    if-eq v2, v1, :cond_3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 15
    :cond_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
