.class public Lcom/newrelic/agent/android/instrumentation/okhttp2/RequestBuilderExtension;
.super Lcom/squareup/okhttp/Request$Builder;
.source "RequestBuilderExtension.java"


# static fields
.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# instance fields
.field private impl:Lcom/squareup/okhttp/Request$Builder;

.field private transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/instrumentation/okhttp2/RequestBuilderExtension;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-void
.end method

.method public constructor <init>(Lcom/squareup/okhttp/Request$Builder;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/squareup/okhttp/Request$Builder;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/newrelic/agent/android/instrumentation/okhttp2/RequestBuilderExtension;->impl:Lcom/squareup/okhttp/Request$Builder;

    .line 27
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/okhttp2/RequestBuilderExtension;->setCrossProcessHeader()V

    return-void
.end method

.method private setCrossProcessHeader()V
    .locals 3

    .line 112
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getCrossProcessId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 114
    iget-object v1, p0, Lcom/newrelic/agent/android/instrumentation/okhttp2/RequestBuilderExtension;->impl:Lcom/squareup/okhttp/Request$Builder;

    const-string v2, "X-NewRelic-ID"

    invoke-virtual {v1, v2}, Lcom/squareup/okhttp/Request$Builder;->removeHeader(Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    .line 115
    iget-object v1, p0, Lcom/newrelic/agent/android/instrumentation/okhttp2/RequestBuilderExtension;->impl:Lcom/squareup/okhttp/Request$Builder;

    const-string v2, "X-NewRelic-ID"

    invoke-virtual {v1, v2, v0}, Lcom/squareup/okhttp/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    :cond_0
    return-void
.end method


# virtual methods
.method public addHeader(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp2/RequestBuilderExtension;->impl:Lcom/squareup/okhttp/Request$Builder;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/okhttp/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object p1

    return-object p1
.end method

.method public build()Lcom/squareup/okhttp/Request;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp2/RequestBuilderExtension;->impl:Lcom/squareup/okhttp/Request$Builder;

    invoke-virtual {v0}, Lcom/squareup/okhttp/Request$Builder;->build()Lcom/squareup/okhttp/Request;

    move-result-object v0

    return-object v0
.end method

.method public cacheControl(Lcom/squareup/okhttp/CacheControl;)Lcom/squareup/okhttp/Request$Builder;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp2/RequestBuilderExtension;->impl:Lcom/squareup/okhttp/Request$Builder;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/Request$Builder;->cacheControl(Lcom/squareup/okhttp/CacheControl;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object p1

    return-object p1
.end method

.method public delete()Lcom/squareup/okhttp/Request$Builder;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp2/RequestBuilderExtension;->impl:Lcom/squareup/okhttp/Request$Builder;

    invoke-virtual {v0}, Lcom/squareup/okhttp/Request$Builder;->delete()Lcom/squareup/okhttp/Request$Builder;

    move-result-object v0

    return-object v0
.end method

.method public get()Lcom/squareup/okhttp/Request$Builder;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp2/RequestBuilderExtension;->impl:Lcom/squareup/okhttp/Request$Builder;

    invoke-virtual {v0}, Lcom/squareup/okhttp/Request$Builder;->get()Lcom/squareup/okhttp/Request$Builder;

    move-result-object v0

    return-object v0
.end method

.method public head()Lcom/squareup/okhttp/Request$Builder;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp2/RequestBuilderExtension;->impl:Lcom/squareup/okhttp/Request$Builder;

    invoke-virtual {v0}, Lcom/squareup/okhttp/Request$Builder;->head()Lcom/squareup/okhttp/Request$Builder;

    move-result-object v0

    return-object v0
.end method

.method public header(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp2/RequestBuilderExtension;->impl:Lcom/squareup/okhttp/Request$Builder;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/okhttp/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object p1

    return-object p1
.end method

.method public headers(Lcom/squareup/okhttp/Headers;)Lcom/squareup/okhttp/Request$Builder;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp2/RequestBuilderExtension;->impl:Lcom/squareup/okhttp/Request$Builder;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/Request$Builder;->headers(Lcom/squareup/okhttp/Headers;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object p1

    return-object p1
.end method

.method public method(Ljava/lang/String;Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/Request$Builder;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp2/RequestBuilderExtension;->impl:Lcom/squareup/okhttp/Request$Builder;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/okhttp/Request$Builder;->method(Ljava/lang/String;Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object p1

    return-object p1
.end method

.method public patch(Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/Request$Builder;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp2/RequestBuilderExtension;->impl:Lcom/squareup/okhttp/Request$Builder;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/Request$Builder;->patch(Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object p1

    return-object p1
.end method

.method public post(Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/Request$Builder;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp2/RequestBuilderExtension;->impl:Lcom/squareup/okhttp/Request$Builder;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/Request$Builder;->post(Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object p1

    return-object p1
.end method

.method public put(Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/Request$Builder;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp2/RequestBuilderExtension;->impl:Lcom/squareup/okhttp/Request$Builder;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/Request$Builder;->put(Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object p1

    return-object p1
.end method

.method public removeHeader(Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp2/RequestBuilderExtension;->impl:Lcom/squareup/okhttp/Request$Builder;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/Request$Builder;->removeHeader(Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object p1

    return-object p1
.end method

.method public tag(Ljava/lang/Object;)Lcom/squareup/okhttp/Request$Builder;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp2/RequestBuilderExtension;->impl:Lcom/squareup/okhttp/Request$Builder;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/Request$Builder;->tag(Ljava/lang/Object;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object p1

    return-object p1
.end method

.method public url(Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp2/RequestBuilderExtension;->impl:Lcom/squareup/okhttp/Request$Builder;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/Request$Builder;->url(Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object p1

    return-object p1
.end method

.method public url(Ljava/net/URL;)Lcom/squareup/okhttp/Request$Builder;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp2/RequestBuilderExtension;->impl:Lcom/squareup/okhttp/Request$Builder;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/Request$Builder;->url(Ljava/net/URL;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object p1

    return-object p1
.end method
