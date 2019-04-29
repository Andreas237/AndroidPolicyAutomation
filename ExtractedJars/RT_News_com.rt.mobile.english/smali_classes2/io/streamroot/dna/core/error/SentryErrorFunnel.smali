.class public final Lio/streamroot/dna/core/error/SentryErrorFunnel;
.super Ljava/lang/Object;
.source "ErrorFunnel.kt"

# interfaces
.implements Lio/streamroot/dna/core/error/ErrorFunnel;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u000cH\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u000cH\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u000cH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/streamroot/dna/core/error/SentryErrorFunnel;",
        "Lio/streamroot/dna/core/error/ErrorFunnel;",
        "sentryClient",
        "Lio/sentry/SentryClient;",
        "(Lio/sentry/SentryClient;)V",
        "sendDnaException",
        "",
        "level",
        "Lio/sentry/event/Event$Level;",
        "throwable",
        "Lio/streamroot/dna/core/error/DnaException;",
        "sendError",
        "",
        "sendRegularException",
        "sendWtf",
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
.field private final sentryClient:Lio/sentry/SentryClient;


# direct methods
.method public constructor <init>(Lio/sentry/SentryClient;)V
    .locals 1
    .param p1    # Lio/sentry/SentryClient;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sentryClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/error/SentryErrorFunnel;->sentryClient:Lio/sentry/SentryClient;

    return-void
.end method

.method private final sendDnaException(Lio/sentry/event/Event$Level;Lio/streamroot/dna/core/error/DnaException;)V
    .locals 2

    .line 64
    iget-object v0, p0, Lio/streamroot/dna/core/error/SentryErrorFunnel;->sentryClient:Lio/sentry/SentryClient;

    new-instance v1, Lio/sentry/event/EventBuilder;

    invoke-direct {v1}, Lio/sentry/event/EventBuilder;-><init>()V

    .line 65
    invoke-virtual {v1, p1}, Lio/sentry/event/EventBuilder;->withLevel(Lio/sentry/event/Event$Level;)Lio/sentry/event/EventBuilder;

    move-result-object p1

    .line 66
    invoke-virtual {p2}, Lio/streamroot/dna/core/error/DnaException;->getDetails()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/sentry/event/EventBuilder;->withMessage(Ljava/lang/String;)Lio/sentry/event/EventBuilder;

    move-result-object p1

    .line 67
    new-instance v1, Lio/sentry/event/interfaces/ExceptionInterface;

    check-cast p2, Ljava/lang/Throwable;

    invoke-direct {v1, p2}, Lio/sentry/event/interfaces/ExceptionInterface;-><init>(Ljava/lang/Throwable;)V

    check-cast v1, Lio/sentry/event/interfaces/SentryInterface;

    invoke-virtual {p1, v1}, Lio/sentry/event/EventBuilder;->withSentryInterface(Lio/sentry/event/interfaces/SentryInterface;)Lio/sentry/event/EventBuilder;

    move-result-object p1

    .line 64
    invoke-virtual {v0, p1}, Lio/sentry/SentryClient;->sendEvent(Lio/sentry/event/EventBuilder;)V

    return-void
.end method

.method private final sendRegularException(Lio/sentry/event/Event$Level;Ljava/lang/Throwable;)V
    .locals 2

    .line 71
    iget-object v0, p0, Lio/streamroot/dna/core/error/SentryErrorFunnel;->sentryClient:Lio/sentry/SentryClient;

    new-instance v1, Lio/sentry/event/EventBuilder;

    invoke-direct {v1}, Lio/sentry/event/EventBuilder;-><init>()V

    .line 72
    invoke-virtual {v1, p1}, Lio/sentry/event/EventBuilder;->withLevel(Lio/sentry/event/Event$Level;)Lio/sentry/event/EventBuilder;

    move-result-object p1

    .line 73
    new-instance v1, Lio/sentry/event/interfaces/ExceptionInterface;

    invoke-direct {v1, p2}, Lio/sentry/event/interfaces/ExceptionInterface;-><init>(Ljava/lang/Throwable;)V

    check-cast v1, Lio/sentry/event/interfaces/SentryInterface;

    invoke-virtual {p1, v1}, Lio/sentry/event/EventBuilder;->withSentryInterface(Lio/sentry/event/interfaces/SentryInterface;)Lio/sentry/event/EventBuilder;

    move-result-object p1

    .line 71
    invoke-virtual {v0, p1}, Lio/sentry/SentryClient;->sendEvent(Lio/sentry/event/EventBuilder;)V

    return-void
.end method


# virtual methods
.method public sendError(Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "throwable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_0

    return-void

    .line 38
    :cond_0
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_1

    goto :goto_0

    .line 39
    :cond_1
    instance-of v0, p1, Ljava/net/UnknownHostException;

    if-eqz v0, :cond_2

    goto :goto_0

    .line 40
    :cond_2
    instance-of v0, p1, Ljava/net/SocketException;

    if-eqz v0, :cond_3

    goto :goto_0

    .line 41
    :cond_3
    instance-of v0, p1, Ljava/net/SocketTimeoutException;

    if-eqz v0, :cond_4

    goto :goto_0

    .line 42
    :cond_4
    instance-of v0, p1, Ljava/net/ProtocolException;

    if-eqz v0, :cond_5

    goto :goto_0

    .line 43
    :cond_5
    instance-of v0, p1, Ljava/net/ConnectException;

    if-eqz v0, :cond_6

    goto :goto_0

    .line 44
    :cond_6
    instance-of v0, p1, Lio/streamroot/dna/core/error/DnaException;

    if-eqz v0, :cond_7

    .line 45
    sget-object v0, Lio/sentry/event/Event$Level;->ERROR:Lio/sentry/event/Event$Level;

    check-cast p1, Lio/streamroot/dna/core/error/DnaException;

    invoke-direct {p0, v0, p1}, Lio/streamroot/dna/core/error/SentryErrorFunnel;->sendDnaException(Lio/sentry/event/Event$Level;Lio/streamroot/dna/core/error/DnaException;)V

    goto :goto_0

    .line 48
    :cond_7
    sget-object v0, Lio/sentry/event/Event$Level;->ERROR:Lio/sentry/event/Event$Level;

    invoke-direct {p0, v0, p1}, Lio/streamroot/dna/core/error/SentryErrorFunnel;->sendRegularException(Lio/sentry/event/Event$Level;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public sendWtf(Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "throwable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_0

    return-void

    .line 56
    :cond_0
    instance-of v0, p1, Lio/streamroot/dna/core/error/DnaException;

    if-eqz v0, :cond_1

    .line 57
    sget-object v0, Lio/sentry/event/Event$Level;->FATAL:Lio/sentry/event/Event$Level;

    check-cast p1, Lio/streamroot/dna/core/error/DnaException;

    invoke-direct {p0, v0, p1}, Lio/streamroot/dna/core/error/SentryErrorFunnel;->sendDnaException(Lio/sentry/event/Event$Level;Lio/streamroot/dna/core/error/DnaException;)V

    goto :goto_0

    .line 59
    :cond_1
    sget-object v0, Lio/sentry/event/Event$Level;->FATAL:Lio/sentry/event/Event$Level;

    invoke-direct {p0, v0, p1}, Lio/streamroot/dna/core/error/SentryErrorFunnel;->sendRegularException(Lio/sentry/event/Event$Level;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
