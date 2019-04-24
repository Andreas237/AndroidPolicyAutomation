.class public Lcom/newrelic/agent/android/instrumentation/OkHttpInstrumentation;
.super Ljava/lang/Object;
.source "OkHttpInstrumentation.java"


# static fields
.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 13
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/instrumentation/OkHttpInstrumentation;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static open(Ljava/net/HttpURLConnection;)Ljava/net/HttpURLConnection;
    .locals 1
    .annotation build Lcom/newrelic/agent/android/instrumentation/WrapReturn;
        className = "com/squareup/okhttp/OkHttpClient"
        methodDesc = "(Ljava/net/URL;)Ljava/net/HttpURLConnection;"
        methodName = "open"
    .end annotation

    .line 19
    instance-of v0, p0, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v0, :cond_0

    .line 20
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;

    check-cast p0, Ljavax/net/ssl/HttpsURLConnection;

    invoke-direct {v0, p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;-><init>(Ljavax/net/ssl/HttpsURLConnection;)V

    return-object v0

    :cond_0
    if-eqz p0, :cond_1

    .line 22
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;

    invoke-direct {v0, p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;-><init>(Ljava/net/HttpURLConnection;)V

    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static openWithProxy(Ljava/net/HttpURLConnection;)Ljava/net/HttpURLConnection;
    .locals 1
    .annotation build Lcom/newrelic/agent/android/instrumentation/WrapReturn;
        className = "com/squareup/okhttp/OkHttpClient"
        methodDesc = "(Ljava/net/URL;Ljava/net/Proxy)Ljava/net/HttpURLConnection;"
        methodName = "open"
    .end annotation

    .line 30
    instance-of v0, p0, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v0, :cond_0

    .line 31
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;

    check-cast p0, Ljavax/net/ssl/HttpsURLConnection;

    invoke-direct {v0, p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;-><init>(Ljavax/net/ssl/HttpsURLConnection;)V

    return-object v0

    :cond_0
    if-eqz p0, :cond_1

    .line 33
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;

    invoke-direct {v0, p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;-><init>(Ljava/net/HttpURLConnection;)V

    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static urlFactoryOpen(Ljava/net/HttpURLConnection;)Ljava/net/HttpURLConnection;
    .locals 2
    .annotation build Lcom/newrelic/agent/android/instrumentation/WrapReturn;
        className = "com/squareup/okhttp/OkUrlFactory"
        methodDesc = "(Ljava/net/URL;)Ljava/net/HttpURLConnection;"
        methodName = "open"
    .end annotation

    .line 41
    sget-object v0, Lcom/newrelic/agent/android/instrumentation/OkHttpInstrumentation;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "OkHttpInstrumentation - wrapping return of call to OkUrlFactory.open..."

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 42
    instance-of v0, p0, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v0, :cond_0

    .line 43
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;

    check-cast p0, Ljavax/net/ssl/HttpsURLConnection;

    invoke-direct {v0, p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;-><init>(Ljavax/net/ssl/HttpsURLConnection;)V

    return-object v0

    :cond_0
    if-eqz p0, :cond_1

    .line 45
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;

    invoke-direct {v0, p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;-><init>(Ljava/net/HttpURLConnection;)V

    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method
