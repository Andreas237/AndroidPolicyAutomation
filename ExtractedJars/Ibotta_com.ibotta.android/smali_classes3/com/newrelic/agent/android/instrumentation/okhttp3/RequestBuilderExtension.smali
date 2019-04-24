.class public Lcom/newrelic/agent/android/instrumentation/okhttp3/RequestBuilderExtension;
.super Lokhttp3/Request$Builder;
.source "RequestBuilderExtension.java"


# static fields
.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# instance fields
.field private impl:Lokhttp3/Request$Builder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/instrumentation/okhttp3/RequestBuilderExtension;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-void
.end method

.method public constructor <init>(Lokhttp3/Request$Builder;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lokhttp3/Request$Builder;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/newrelic/agent/android/instrumentation/okhttp3/RequestBuilderExtension;->impl:Lokhttp3/Request$Builder;

    .line 26
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/okhttp3/RequestBuilderExtension;->setCrossProcessHeader()V

    return-void
.end method

.method private setCrossProcessHeader()V
    .locals 3

    .line 111
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getCrossProcessId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 113
    iget-object v1, p0, Lcom/newrelic/agent/android/instrumentation/okhttp3/RequestBuilderExtension;->impl:Lokhttp3/Request$Builder;

    const-string v2, "X-NewRelic-ID"

    invoke-virtual {v1, v2}, Lokhttp3/Request$Builder;->removeHeader(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 114
    iget-object v1, p0, Lcom/newrelic/agent/android/instrumentation/okhttp3/RequestBuilderExtension;->impl:Lokhttp3/Request$Builder;

    const-string v2, "X-NewRelic-ID"

    invoke-virtual {v1, v2, v0}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    :cond_0
    return-void
.end method


# virtual methods
.method public addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp3/RequestBuilderExtension;->impl:Lokhttp3/Request$Builder;

    invoke-virtual {v0, p1, p2}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p1

    return-object p1
.end method

.method public build()Lokhttp3/Request;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp3/RequestBuilderExtension;->impl:Lokhttp3/Request$Builder;

    invoke-virtual {v0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v0

    return-object v0
.end method

.method public cacheControl(Lokhttp3/CacheControl;)Lokhttp3/Request$Builder;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp3/RequestBuilderExtension;->impl:Lokhttp3/Request$Builder;

    invoke-virtual {v0, p1}, Lokhttp3/Request$Builder;->cacheControl(Lokhttp3/CacheControl;)Lokhttp3/Request$Builder;

    move-result-object p1

    return-object p1
.end method

.method public delete()Lokhttp3/Request$Builder;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp3/RequestBuilderExtension;->impl:Lokhttp3/Request$Builder;

    invoke-virtual {v0}, Lokhttp3/Request$Builder;->delete()Lokhttp3/Request$Builder;

    move-result-object v0

    return-object v0
.end method

.method public get()Lokhttp3/Request$Builder;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp3/RequestBuilderExtension;->impl:Lokhttp3/Request$Builder;

    invoke-virtual {v0}, Lokhttp3/Request$Builder;->get()Lokhttp3/Request$Builder;

    move-result-object v0

    return-object v0
.end method

.method public head()Lokhttp3/Request$Builder;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp3/RequestBuilderExtension;->impl:Lokhttp3/Request$Builder;

    invoke-virtual {v0}, Lokhttp3/Request$Builder;->head()Lokhttp3/Request$Builder;

    move-result-object v0

    return-object v0
.end method

.method public header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp3/RequestBuilderExtension;->impl:Lokhttp3/Request$Builder;

    invoke-virtual {v0, p1, p2}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p1

    return-object p1
.end method

.method public headers(Lokhttp3/Headers;)Lokhttp3/Request$Builder;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp3/RequestBuilderExtension;->impl:Lokhttp3/Request$Builder;

    invoke-virtual {v0, p1}, Lokhttp3/Request$Builder;->headers(Lokhttp3/Headers;)Lokhttp3/Request$Builder;

    move-result-object p1

    return-object p1
.end method

.method public method(Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp3/RequestBuilderExtension;->impl:Lokhttp3/Request$Builder;

    invoke-virtual {v0, p1, p2}, Lokhttp3/Request$Builder;->method(Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    move-result-object p1

    return-object p1
.end method

.method public patch(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp3/RequestBuilderExtension;->impl:Lokhttp3/Request$Builder;

    invoke-virtual {v0, p1}, Lokhttp3/Request$Builder;->patch(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    move-result-object p1

    return-object p1
.end method

.method public post(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp3/RequestBuilderExtension;->impl:Lokhttp3/Request$Builder;

    invoke-virtual {v0, p1}, Lokhttp3/Request$Builder;->post(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    move-result-object p1

    return-object p1
.end method

.method public put(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp3/RequestBuilderExtension;->impl:Lokhttp3/Request$Builder;

    invoke-virtual {v0, p1}, Lokhttp3/Request$Builder;->put(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    move-result-object p1

    return-object p1
.end method

.method public removeHeader(Ljava/lang/String;)Lokhttp3/Request$Builder;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp3/RequestBuilderExtension;->impl:Lokhttp3/Request$Builder;

    invoke-virtual {v0, p1}, Lokhttp3/Request$Builder;->removeHeader(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p1

    return-object p1
.end method

.method public tag(Ljava/lang/Object;)Lokhttp3/Request$Builder;
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp3/RequestBuilderExtension;->impl:Lokhttp3/Request$Builder;

    invoke-virtual {v0, p1}, Lokhttp3/Request$Builder;->tag(Ljava/lang/Object;)Lokhttp3/Request$Builder;

    move-result-object p1

    return-object p1
.end method

.method public url(Ljava/lang/String;)Lokhttp3/Request$Builder;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp3/RequestBuilderExtension;->impl:Lokhttp3/Request$Builder;

    invoke-virtual {v0, p1}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p1

    return-object p1
.end method

.method public url(Ljava/net/URL;)Lokhttp3/Request$Builder;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp3/RequestBuilderExtension;->impl:Lokhttp3/Request$Builder;

    invoke-virtual {v0, p1}, Lokhttp3/Request$Builder;->url(Ljava/net/URL;)Lokhttp3/Request$Builder;

    move-result-object p1

    return-object p1
.end method
