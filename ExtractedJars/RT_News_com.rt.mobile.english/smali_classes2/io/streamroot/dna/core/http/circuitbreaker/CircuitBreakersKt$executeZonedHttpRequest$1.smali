.class final Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "CircuitBreakers.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt;->executeZonedHttpRequest(Lokhttp3/Call$Factory;ZLkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "\u0000B\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\u0008\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\"\u0010\n\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u000c\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b2\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102$\u0010\u0012\u001a \u0008\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\rH\u0086@\u00f8\u0001\u0000"
    }
    d2 = {
        "executeZonedHttpRequest",
        "",
        "T",
        "callFactory",
        "Lokhttp3/Call$Factory;",
        "forceRefreshOnFailure",
        "",
        "delaySequence",
        "Lkotlin/sequences/Sequence;",
        "",
        "buildRequest",
        "Lkotlin/Function2;",
        "",
        "Lkotlin/coroutines/Continuation;",
        "Lokhttp3/Request;",
        "failureBlock",
        "Lkotlin/Function0;",
        "",
        "block",
        "Lokhttp3/Response;",
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
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4
    }
    l = {
        0x25,
        0x31,
        0x38,
        0x3c,
        0x33,
        0x25
    }
    m = "executeZonedHttpRequest"
    n = {
        "callFactory",
        "forceRefreshOnFailure",
        "delaySequence",
        "buildRequest",
        "failureBlock",
        "block",
        "dnaCoroutineContext",
        "availabilityZone",
        "callFactory",
        "forceRefreshOnFailure",
        "delaySequence",
        "buildRequest",
        "failureBlock",
        "block",
        "dnaCoroutineContext",
        "availabilityZone",
        "request",
        "exponentialBackoff",
        "validResponse",
        "latestAvailabilityZone",
        "callFactory",
        "forceRefreshOnFailure",
        "delaySequence",
        "buildRequest",
        "failureBlock",
        "block",
        "dnaCoroutineContext",
        "availabilityZone",
        "request",
        "exponentialBackoff",
        "validResponse",
        "latestAvailabilityZone",
        "callFactory",
        "forceRefreshOnFailure",
        "delaySequence",
        "buildRequest",
        "failureBlock",
        "block",
        "dnaCoroutineContext",
        "availabilityZone",
        "request",
        "exponentialBackoff",
        "validResponse",
        "callFactory",
        "forceRefreshOnFailure",
        "delaySequence",
        "buildRequest",
        "failureBlock",
        "block",
        "dnaCoroutineContext",
        "availabilityZone",
        "request",
        "exponentialBackoff",
        "validResponse"
    }
    s = {
        "L$0",
        "Z$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$6",
        "L$0",
        "Z$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$6",
        "L$7",
        "L$8",
        "L$9",
        "L$10",
        "L$0",
        "Z$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$6",
        "L$7",
        "L$8",
        "L$9",
        "L$10",
        "L$0",
        "Z$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$6",
        "L$7",
        "L$8",
        "L$9",
        "L$0",
        "Z$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$6",
        "L$7",
        "L$8",
        "L$9"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$10:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field L$8:Ljava/lang/Object;

.field L$9:Ljava/lang/Object;

.field Z$0:Z

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
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iput-object p1, p0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->result:Ljava/lang/Object;

    iget p1, p0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt$executeZonedHttpRequest$1;->label:I

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p0

    invoke-static/range {v0 .. v6}, Lio/streamroot/dna/core/http/circuitbreaker/CircuitBreakersKt;->executeZonedHttpRequest(Lokhttp3/Call$Factory;ZLkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
