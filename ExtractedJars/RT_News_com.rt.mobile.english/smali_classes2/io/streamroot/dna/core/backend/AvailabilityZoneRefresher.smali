.class public final Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;
.super Ljava/lang/Object;
.source "AvailabilityZoneRefresher.kt"

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
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u0008\u0010\u0014\u001a\u00020\u0013H\u0002J\u0008\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;",
        "Ljava/lang/AutoCloseable;",
        "callFactory",
        "Lokhttp3/Call$Factory;",
        "refreshTime",
        "",
        "delaySequence",
        "Lkotlin/sequences/Sequence;",
        "backendUrl",
        "Lokhttp3/HttpUrl;",
        "streamrootKey",
        "",
        "contentId",
        "context",
        "Lkotlin/coroutines/CoroutineContext;",
        "(Lokhttp3/Call$Factory;JLkotlin/sequences/Sequence;Lokhttp3/HttpUrl;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;)V",
        "refresherJob",
        "Lkotlinx/coroutines/Job;",
        "request",
        "Lokhttp3/Request;",
        "buildAvailabilityZoneRequest",
        "close",
        "",
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
.field private final backendUrl:Lokhttp3/HttpUrl;

.field private final callFactory:Lokhttp3/Call$Factory;

.field private final contentId:Ljava/lang/String;

.field private final delaySequence:Lkotlin/sequences/Sequence;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/sequences/Sequence<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final refreshTime:J

.field private final refresherJob:Lkotlinx/coroutines/Job;

.field private final request:Lokhttp3/Request;

.field private final streamrootKey:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lokhttp3/Call$Factory;JLkotlin/sequences/Sequence;Lokhttp3/HttpUrl;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;)V
    .locals 1
    .param p1    # Lokhttp3/Call$Factory;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/sequences/Sequence;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lokhttp3/HttpUrl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/Call$Factory;",
            "J",
            "Lkotlin/sequences/Sequence<",
            "Ljava/lang/Long;",
            ">;",
            "Lokhttp3/HttpUrl;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/CoroutineContext;",
            ")V"
        }
    .end annotation

    const-string v0, "callFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "delaySequence"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backendUrl"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streamrootKey"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentId"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;->callFactory:Lokhttp3/Call$Factory;

    iput-wide p2, p0, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;->refreshTime:J

    iput-object p4, p0, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;->delaySequence:Lkotlin/sequences/Sequence;

    iput-object p5, p0, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;->backendUrl:Lokhttp3/HttpUrl;

    iput-object p6, p0, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;->streamrootKey:Ljava/lang/String;

    iput-object p7, p0, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;->contentId:Ljava/lang/String;

    .line 33
    invoke-direct {p0}, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;->buildAvailabilityZoneRequest()Lokhttp3/Request;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;->request:Lokhttp3/Request;

    .line 36
    sget-object p1, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    move-object p2, p1

    check-cast p2, Lkotlinx/coroutines/CoroutineScope;

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object p1

    check-cast p1, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {p8, p1}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p3

    new-instance p1, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher$1;

    const/4 p4, 0x0

    invoke-direct {p1, p0, p4}, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher$1;-><init>(Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;Lkotlin/coroutines/Continuation;)V

    move-object p5, p1

    check-cast p5, Lkotlin/jvm/functions/Function2;

    const/4 p6, 0x2

    const/4 p7, 0x0

    invoke-static/range {p2 .. p7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;->refresherJob:Lkotlinx/coroutines/Job;

    return-void
.end method

.method public static final synthetic access$getCallFactory$p(Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;)Lokhttp3/Call$Factory;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 23
    iget-object p0, p0, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;->callFactory:Lokhttp3/Call$Factory;

    return-object p0
.end method

.method public static final synthetic access$getDelaySequence$p(Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;)Lkotlin/sequences/Sequence;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 23
    iget-object p0, p0, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;->delaySequence:Lkotlin/sequences/Sequence;

    return-object p0
.end method

.method public static final synthetic access$getRefreshTime$p(Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;)J
    .locals 2

    .line 23
    iget-wide v0, p0, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;->refreshTime:J

    return-wide v0
.end method

.method public static final synthetic access$getRequest$p(Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;)Lokhttp3/Request;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 23
    iget-object p0, p0, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;->request:Lokhttp3/Request;

    return-object p0
.end method

.method private final buildAvailabilityZoneRequest()Lokhttp3/Request;
    .locals 5

    .line 69
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "streamrootKey"

    .line 70
    iget-object v2, p0, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;->streamrootKey:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "content"

    .line 71
    iget-object v2, p0, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;->contentId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    .line 72
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "JSONObject()\n           \u2026)\n            .toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    iget-object v1, p0, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;->backendUrl:Lokhttp3/HttpUrl;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "router/az"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Lio/streamroot/dna/core/utils/UrlsKt;->buildDnaDeliveryUrl(Lokhttp3/HttpUrl;[Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object v1

    .line 77
    new-instance v2, Lokhttp3/Request$Builder;

    invoke-direct {v2}, Lokhttp3/Request$Builder;-><init>()V

    const-string v3, "application/json"

    .line 78
    invoke-static {v3}, Lokhttp3/MediaType;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v3

    invoke-static {v3, v0}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;

    move-result-object v0

    invoke-virtual {v2, v0}, Lokhttp3/Request$Builder;->post(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    move-result-object v0

    .line 79
    invoke-virtual {v0, v1}, Lokhttp3/Request$Builder;->url(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;

    move-result-object v0

    .line 80
    invoke-virtual {v0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v0

    const-string v1, "Request\n            .Bui\u2026url)\n            .build()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 63
    iget-object v0, p0, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;->refresherJob:Lkotlinx/coroutines/Job;

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->isActive()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 64
    iget-object v0, p0, Lio/streamroot/dna/core/backend/AvailabilityZoneRefresher;->refresherJob:Lkotlinx/coroutines/Job;

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->cancel()V

    :cond_0
    return-void
.end method
