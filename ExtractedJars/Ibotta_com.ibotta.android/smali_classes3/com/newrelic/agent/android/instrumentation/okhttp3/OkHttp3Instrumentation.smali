.class public Lcom/newrelic/agent/android/instrumentation/okhttp3/OkHttp3Instrumentation;
.super Ljava/lang/Object;
.source "OkHttp3Instrumentation.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/newrelic/agent/android/instrumentation/okhttp3/OkHttp3Instrumentation$OkHttp32;,
        Lcom/newrelic/agent/android/instrumentation/okhttp3/OkHttp3Instrumentation$OkHttp35;,
        Lcom/newrelic/agent/android/instrumentation/okhttp3/OkHttp3Instrumentation$OkHttp34;
    }
.end annotation


# static fields
.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 28
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/instrumentation/okhttp3/OkHttp3Instrumentation;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(Ljava/lang/String;)V
    .locals 0

    .line 27
    invoke-static {p0}, Lcom/newrelic/agent/android/instrumentation/okhttp3/OkHttp3Instrumentation;->logReflectionError(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$100()Lcom/newrelic/agent/android/logging/AgentLog;
    .locals 1

    .line 27
    sget-object v0, Lcom/newrelic/agent/android/instrumentation/okhttp3/OkHttp3Instrumentation;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-object v0
.end method

.method public static body(Lokhttp3/Response$Builder;Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;
    .locals 1
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
    .end annotation

    .line 57
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/okhttp3/ResponseBuilderExtension;

    invoke-direct {v0, p0}, Lcom/newrelic/agent/android/instrumentation/okhttp3/ResponseBuilderExtension;-><init>(Lokhttp3/Response$Builder;)V

    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/instrumentation/okhttp3/ResponseBuilderExtension;->body(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;

    move-result-object p0

    return-object p0
.end method

.method public static build(Lokhttp3/Request$Builder;)Lokhttp3/Request;
    .locals 1
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
    .end annotation

    .line 35
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/okhttp3/RequestBuilderExtension;

    invoke-direct {v0, p0}, Lcom/newrelic/agent/android/instrumentation/okhttp3/RequestBuilderExtension;-><init>(Lokhttp3/Request$Builder;)V

    invoke-virtual {v0}, Lcom/newrelic/agent/android/instrumentation/okhttp3/RequestBuilderExtension;->build()Lokhttp3/Request;

    move-result-object p0

    return-object p0
.end method

.method private static logReflectionError(Ljava/lang/String;)V
    .locals 4

    const-string v0, "line.separator"

    .line 202
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 203
    sget-object v1, Lcom/newrelic/agent/android/instrumentation/okhttp3/OkHttp3Instrumentation;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to resolve method \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\"."

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "This is usually due to building the app with unsupported OkHttp versions."

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "Check your build configuration for compatibility."

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v1, p0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    return-void
.end method

.method public static newBuilder(Lokhttp3/Response$Builder;)Lokhttp3/Response$Builder;
    .locals 1
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
    .end annotation

    .line 62
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/okhttp3/ResponseBuilderExtension;

    invoke-direct {v0, p0}, Lcom/newrelic/agent/android/instrumentation/okhttp3/ResponseBuilderExtension;-><init>(Lokhttp3/Response$Builder;)V

    return-object v0
.end method

.method public static newCall(Lokhttp3/OkHttpClient;Lokhttp3/Request;)Lokhttp3/Call;
    .locals 4
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
    .end annotation

    .line 40
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/TransactionState;

    invoke-direct {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionState;-><init>()V

    .line 41
    sget-object v1, Lcom/newrelic/agent/android/FeatureFlag;->DistributedTracing:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-static {v1}, Lcom/newrelic/agent/android/FeatureFlag;->featureEnabled(Lcom/newrelic/agent/android/FeatureFlag;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 42
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getCatFacade()Lcom/newrelic/agent/android/connectivity/CatFacade;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/agent/android/connectivity/CatFacade;->startTrip()Lcom/newrelic/agent/android/connectivity/CatPayload;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->setCatPayload(Lcom/newrelic/agent/android/connectivity/CatPayload;)V

    .line 44
    :try_start_0
    invoke-virtual {p1}, Lokhttp3/Request;->newBuilder()Lokhttp3/Request$Builder;

    move-result-object v1

    const-string v2, "newrelic"

    .line 45
    invoke-virtual {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->getCatPayload()Lcom/newrelic/agent/android/connectivity/CatPayload;

    move-result-object v3

    invoke-virtual {v3}, Lcom/newrelic/agent/android/connectivity/CatPayload;->asBase64Json()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v1

    .line 46
    invoke-virtual {v1}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v1

    .line 47
    new-instance v2, Lcom/newrelic/agent/android/instrumentation/okhttp3/CallExtension;

    invoke-virtual {p0, v1}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object v3

    invoke-direct {v2, p0, v1, v3, v0}, Lcom/newrelic/agent/android/instrumentation/okhttp3/CallExtension;-><init>(Lokhttp3/OkHttpClient;Lokhttp3/Request;Lokhttp3/Call;Lcom/newrelic/agent/android/instrumentation/TransactionState;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    move-exception v1

    .line 49
    sget-object v2, Lcom/newrelic/agent/android/instrumentation/okhttp3/OkHttp3Instrumentation;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    .line 52
    :cond_0
    new-instance v1, Lcom/newrelic/agent/android/instrumentation/okhttp3/CallExtension;

    invoke-virtual {p0, p1}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object v2

    invoke-direct {v1, p0, p1, v2, v0}, Lcom/newrelic/agent/android/instrumentation/okhttp3/CallExtension;-><init>(Lokhttp3/OkHttpClient;Lokhttp3/Request;Lokhttp3/Call;Lcom/newrelic/agent/android/instrumentation/TransactionState;)V

    return-object v1
.end method

.method public static open(Lokhttp3/OkUrlFactory;Ljava/net/URL;)Ljava/net/HttpURLConnection;
    .locals 1
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
        isStatic = false
        scope = "okhttp3.OkUrlFactory"
    .end annotation

    .line 67
    invoke-virtual {p0, p1}, Lokhttp3/OkUrlFactory;->open(Ljava/net/URL;)Ljava/net/HttpURLConnection;

    move-result-object p0

    .line 68
    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object p1

    const-string v0, "http"

    .line 70
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 71
    new-instance p1, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;

    invoke-direct {p1, p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;-><init>(Ljava/net/HttpURLConnection;)V

    return-object p1

    :cond_0
    const-string v0, "https"

    .line 73
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    instance-of p1, p0, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz p1, :cond_1

    .line 74
    new-instance p1, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;

    check-cast p0, Ljavax/net/ssl/HttpsURLConnection;

    invoke-direct {p1, p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;-><init>(Ljavax/net/ssl/HttpsURLConnection;)V

    return-object p1

    .line 77
    :cond_1
    new-instance p1, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;

    invoke-direct {p1, p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;-><init>(Ljava/net/HttpURLConnection;)V

    return-object p1
.end method
