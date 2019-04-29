.class final Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "CircuitBreakers.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt;->executeHttpRequest(Lokhttp3/Call$Factory;Lkotlin/sequences/Sequence;Lokhttp3/Request;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000.\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\u0008\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0008\u001a\u00020\t2$\u0010\n\u001a \u0008\u0001\u0012\u0004\u0012\u00020\u000c\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\rH\u0086@\u00f8\u0001\u0000"
    }
    d2 = {
        "executeHttpRequest",
        "",
        "T",
        "callFactory",
        "Lokhttp3/Call$Factory;",
        "delaySequence",
        "Lkotlin/sequences/Sequence;",
        "",
        "request",
        "Lokhttp3/Request;",
        "block",
        "Lkotlin/Function2;",
        "Lokhttp3/Response;",
        "Lkotlin/coroutines/Continuation;",
        "continuation"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "io/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt"
    f = "CircuitBreakers.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1
    }
    l = {
        0xc,
        0x14,
        0xc
    }
    m = "executeHttpRequest"
    n = {
        "callFactory",
        "delaySequence",
        "request",
        "block",
        "validResponse",
        "exponentialBackoff",
        "callFactory",
        "delaySequence",
        "request",
        "block",
        "validResponse",
        "exponentialBackoff"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lkotlin/coroutines/Continuation;)V
    .locals 0

    invoke-direct {p0, p1}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iput-object p1, p0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->result:Ljava/lang/Object;

    iget p1, p0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeHttpRequest$1;->label:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p1, p1, p0}, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt;->executeHttpRequest(Lokhttp3/Call$Factory;Lkotlin/sequences/Sequence;Lokhttp3/Request;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
