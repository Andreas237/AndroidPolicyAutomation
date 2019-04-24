.class public final Lcom/newrelic/agent/android/instrumentation/URLConnectionInstrumentation;
.super Ljava/lang/Object;
.source "URLConnectionInstrumentation.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected static httpClientError(Lcom/newrelic/agent/android/instrumentation/TransactionState;Ljava/lang/Exception;)V
    .locals 1

    .line 39
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->isComplete()Z

    move-result v0

    if-nez v0, :cond_0

    .line 40
    invoke-static {p0, p1}, Lcom/newrelic/agent/android/instrumentation/TransactionStateUtil;->setErrorCodeFromException(Lcom/newrelic/agent/android/instrumentation/TransactionState;Ljava/lang/Exception;)V

    .line 41
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->end()Lcom/newrelic/agent/android/api/common/TransactionData;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 45
    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/api/common/TransactionData;->setResponseBody(Ljava/lang/String;)V

    .line 47
    new-instance p1, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;

    invoke-direct {p1, p0}, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;-><init>(Lcom/newrelic/agent/android/api/common/TransactionData;)V

    invoke-static {p1}, Lcom/newrelic/agent/android/TaskQueue;->queue(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static openConnection(Ljava/net/URLConnection;)Ljava/net/URLConnection;
    .locals 1
    .annotation build Lcom/newrelic/agent/android/instrumentation/WrapReturn;
        className = "java/net/URL"
        methodDesc = "()Ljava/net/URLConnection;"
        methodName = "openConnection"
    .end annotation

    .line 18
    instance-of v0, p0, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v0, :cond_0

    .line 19
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;

    check-cast p0, Ljavax/net/ssl/HttpsURLConnection;

    invoke-direct {v0, p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;-><init>(Ljavax/net/ssl/HttpsURLConnection;)V

    return-object v0

    .line 20
    :cond_0
    instance-of v0, p0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_1

    .line 21
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;

    check-cast p0, Ljava/net/HttpURLConnection;

    invoke-direct {v0, p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;-><init>(Ljava/net/HttpURLConnection;)V

    return-object v0

    :cond_1
    return-object p0
.end method

.method public static openConnectionWithProxy(Ljava/net/URLConnection;)Ljava/net/URLConnection;
    .locals 1
    .annotation build Lcom/newrelic/agent/android/instrumentation/WrapReturn;
        className = "java/net/URL"
        methodDesc = "(Ljava/net/Proxy;)Ljava/net/URLConnection;"
        methodName = "openConnection"
    .end annotation

    .line 29
    instance-of v0, p0, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v0, :cond_0

    .line 30
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;

    check-cast p0, Ljavax/net/ssl/HttpsURLConnection;

    invoke-direct {v0, p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;-><init>(Ljavax/net/ssl/HttpsURLConnection;)V

    return-object v0

    .line 31
    :cond_0
    instance-of v0, p0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_1

    .line 32
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;

    check-cast p0, Ljava/net/HttpURLConnection;

    invoke-direct {v0, p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;-><init>(Ljava/net/HttpURLConnection;)V

    return-object v0

    :cond_1
    return-object p0
.end method
