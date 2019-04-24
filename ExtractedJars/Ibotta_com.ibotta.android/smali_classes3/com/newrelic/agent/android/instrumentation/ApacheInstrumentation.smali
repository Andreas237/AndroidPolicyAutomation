.class public final Lcom/newrelic/agent/android/instrumentation/ApacheInstrumentation;
.super Ljava/lang/Object;
.source "ApacheInstrumentation.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static delegate(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lcom/newrelic/agent/android/instrumentation/TransactionState;)Lorg/apache/http/HttpRequest;
    .locals 0

    .line 167
    invoke-static {p2, p0, p1}, Lcom/newrelic/agent/android/instrumentation/TransactionStateUtil;->inspectAndInstrument(Lcom/newrelic/agent/android/instrumentation/TransactionState;Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;)Lorg/apache/http/HttpRequest;

    move-result-object p0

    return-object p0
.end method

.method private static delegate(Lorg/apache/http/HttpResponse;Lcom/newrelic/agent/android/instrumentation/TransactionState;)Lorg/apache/http/HttpResponse;
    .locals 0

    .line 171
    invoke-static {p1, p0}, Lcom/newrelic/agent/android/instrumentation/TransactionStateUtil;->inspectAndInstrument(Lcom/newrelic/agent/android/instrumentation/TransactionState;Lorg/apache/http/HttpResponse;)Lorg/apache/http/HttpResponse;

    move-result-object p0

    return-object p0
.end method

.method private static delegate(Lorg/apache/http/client/ResponseHandler;Lcom/newrelic/agent/android/instrumentation/TransactionState;)Lorg/apache/http/client/ResponseHandler;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/apache/http/client/ResponseHandler<",
            "+TT;>;",
            "Lcom/newrelic/agent/android/instrumentation/TransactionState;",
            ")",
            "Lorg/apache/http/client/ResponseHandler<",
            "+TT;>;"
        }
    .end annotation

    .line 175
    invoke-static {p0, p1}, Lcom/newrelic/agent/android/instrumentation/httpclient/ResponseHandlerImpl;->wrap(Lorg/apache/http/client/ResponseHandler;Lcom/newrelic/agent/android/instrumentation/TransactionState;)Lorg/apache/http/client/ResponseHandler;

    move-result-object p0

    return-object p0
.end method

.method private static delegate(Lorg/apache/http/client/methods/HttpUriRequest;Lcom/newrelic/agent/android/instrumentation/TransactionState;)Lorg/apache/http/client/methods/HttpUriRequest;
    .locals 0

    .line 163
    invoke-static {p1, p0}, Lcom/newrelic/agent/android/instrumentation/TransactionStateUtil;->inspectAndInstrument(Lcom/newrelic/agent/android/instrumentation/TransactionState;Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/client/methods/HttpUriRequest;

    move-result-object p0

    return-object p0
.end method

.method public static execute(Lorg/apache/http/client/HttpClient;Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;
    .locals 1
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/apache/http/client/HttpClient;",
            "Lorg/apache/http/HttpHost;",
            "Lorg/apache/http/HttpRequest;",
            "Lorg/apache/http/client/ResponseHandler<",
            "+TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/apache/http/client/ClientProtocolException;
        }
    .end annotation

    .line 59
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/TransactionState;

    invoke-direct {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionState;-><init>()V

    .line 60
    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionStateUtil;->setCatPayload(Lcom/newrelic/agent/android/instrumentation/TransactionState;)V

    .line 62
    :try_start_0
    invoke-static {p1, p2, v0}, Lcom/newrelic/agent/android/instrumentation/ApacheInstrumentation;->delegate(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lcom/newrelic/agent/android/instrumentation/TransactionState;)Lorg/apache/http/HttpRequest;

    move-result-object p2

    invoke-static {p3, v0}, Lcom/newrelic/agent/android/instrumentation/ApacheInstrumentation;->delegate(Lorg/apache/http/client/ResponseHandler;Lcom/newrelic/agent/android/instrumentation/TransactionState;)Lorg/apache/http/client/ResponseHandler;

    move-result-object p3

    invoke-interface {p0, p1, p2, p3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 67
    invoke-static {v0, p0}, Lcom/newrelic/agent/android/instrumentation/ApacheInstrumentation;->httpClientError(Lcom/newrelic/agent/android/instrumentation/TransactionState;Ljava/lang/Exception;)V

    .line 68
    throw p0

    :catch_1
    move-exception p0

    .line 64
    invoke-static {v0, p0}, Lcom/newrelic/agent/android/instrumentation/ApacheInstrumentation;->httpClientError(Lcom/newrelic/agent/android/instrumentation/TransactionState;Ljava/lang/Exception;)V

    .line 65
    throw p0
.end method

.method public static execute(Lorg/apache/http/client/HttpClient;Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;
    .locals 1
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/apache/http/client/HttpClient;",
            "Lorg/apache/http/HttpHost;",
            "Lorg/apache/http/HttpRequest;",
            "Lorg/apache/http/client/ResponseHandler<",
            "+TT;>;",
            "Lorg/apache/http/protocol/HttpContext;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/apache/http/client/ClientProtocolException;
        }
    .end annotation

    .line 42
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/TransactionState;

    invoke-direct {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionState;-><init>()V

    .line 43
    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionStateUtil;->setCatPayload(Lcom/newrelic/agent/android/instrumentation/TransactionState;)V

    .line 45
    :try_start_0
    invoke-static {p1, p2, v0}, Lcom/newrelic/agent/android/instrumentation/ApacheInstrumentation;->delegate(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lcom/newrelic/agent/android/instrumentation/TransactionState;)Lorg/apache/http/HttpRequest;

    move-result-object p2

    invoke-static {p3, v0}, Lcom/newrelic/agent/android/instrumentation/ApacheInstrumentation;->delegate(Lorg/apache/http/client/ResponseHandler;Lcom/newrelic/agent/android/instrumentation/TransactionState;)Lorg/apache/http/client/ResponseHandler;

    move-result-object p3

    invoke-interface {p0, p1, p2, p3, p4}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 50
    invoke-static {v0, p0}, Lcom/newrelic/agent/android/instrumentation/ApacheInstrumentation;->httpClientError(Lcom/newrelic/agent/android/instrumentation/TransactionState;Ljava/lang/Exception;)V

    .line 51
    throw p0

    :catch_1
    move-exception p0

    .line 47
    invoke-static {v0, p0}, Lcom/newrelic/agent/android/instrumentation/ApacheInstrumentation;->httpClientError(Lcom/newrelic/agent/android/instrumentation/TransactionState;Ljava/lang/Exception;)V

    .line 48
    throw p0
.end method

.method public static execute(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;
    .locals 1
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/apache/http/client/HttpClient;",
            "Lorg/apache/http/client/methods/HttpUriRequest;",
            "Lorg/apache/http/client/ResponseHandler<",
            "+TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/apache/http/client/ClientProtocolException;
        }
    .end annotation

    .line 119
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/TransactionState;

    invoke-direct {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionState;-><init>()V

    .line 120
    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionStateUtil;->setCatPayload(Lcom/newrelic/agent/android/instrumentation/TransactionState;)V

    .line 122
    :try_start_0
    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ApacheInstrumentation;->delegate(Lorg/apache/http/client/methods/HttpUriRequest;Lcom/newrelic/agent/android/instrumentation/TransactionState;)Lorg/apache/http/client/methods/HttpUriRequest;

    move-result-object p1

    invoke-static {p2, v0}, Lcom/newrelic/agent/android/instrumentation/ApacheInstrumentation;->delegate(Lorg/apache/http/client/ResponseHandler;Lcom/newrelic/agent/android/instrumentation/TransactionState;)Lorg/apache/http/client/ResponseHandler;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 127
    invoke-static {v0, p0}, Lcom/newrelic/agent/android/instrumentation/ApacheInstrumentation;->httpClientError(Lcom/newrelic/agent/android/instrumentation/TransactionState;Ljava/lang/Exception;)V

    .line 128
    throw p0

    :catch_1
    move-exception p0

    .line 124
    invoke-static {v0, p0}, Lcom/newrelic/agent/android/instrumentation/ApacheInstrumentation;->httpClientError(Lcom/newrelic/agent/android/instrumentation/TransactionState;Ljava/lang/Exception;)V

    .line 125
    throw p0
.end method

.method public static execute(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;
    .locals 1
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/apache/http/client/HttpClient;",
            "Lorg/apache/http/client/methods/HttpUriRequest;",
            "Lorg/apache/http/client/ResponseHandler<",
            "+TT;>;",
            "Lorg/apache/http/protocol/HttpContext;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/apache/http/client/ClientProtocolException;
        }
    .end annotation

    .line 102
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/TransactionState;

    invoke-direct {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionState;-><init>()V

    .line 103
    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionStateUtil;->setCatPayload(Lcom/newrelic/agent/android/instrumentation/TransactionState;)V

    .line 105
    :try_start_0
    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ApacheInstrumentation;->delegate(Lorg/apache/http/client/methods/HttpUriRequest;Lcom/newrelic/agent/android/instrumentation/TransactionState;)Lorg/apache/http/client/methods/HttpUriRequest;

    move-result-object p1

    invoke-static {p2, v0}, Lcom/newrelic/agent/android/instrumentation/ApacheInstrumentation;->delegate(Lorg/apache/http/client/ResponseHandler;Lcom/newrelic/agent/android/instrumentation/TransactionState;)Lorg/apache/http/client/ResponseHandler;

    move-result-object p2

    invoke-interface {p0, p1, p2, p3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 110
    invoke-static {v0, p0}, Lcom/newrelic/agent/android/instrumentation/ApacheInstrumentation;->httpClientError(Lcom/newrelic/agent/android/instrumentation/TransactionState;Ljava/lang/Exception;)V

    .line 111
    throw p0

    :catch_1
    move-exception p0

    .line 107
    invoke-static {v0, p0}, Lcom/newrelic/agent/android/instrumentation/ApacheInstrumentation;->httpClientError(Lcom/newrelic/agent/android/instrumentation/TransactionState;Ljava/lang/Exception;)V

    .line 108
    throw p0
.end method

.method public static execute(Lorg/apache/http/client/HttpClient;Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;)Lorg/apache/http/HttpResponse;
    .locals 1
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 75
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/TransactionState;

    invoke-direct {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionState;-><init>()V

    .line 76
    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionStateUtil;->setCatPayload(Lcom/newrelic/agent/android/instrumentation/TransactionState;)V

    .line 78
    :try_start_0
    invoke-static {p1, p2, v0}, Lcom/newrelic/agent/android/instrumentation/ApacheInstrumentation;->delegate(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lcom/newrelic/agent/android/instrumentation/TransactionState;)Lorg/apache/http/HttpRequest;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;)Lorg/apache/http/HttpResponse;

    move-result-object p0

    invoke-static {p0, v0}, Lcom/newrelic/agent/android/instrumentation/ApacheInstrumentation;->delegate(Lorg/apache/http/HttpResponse;Lcom/newrelic/agent/android/instrumentation/TransactionState;)Lorg/apache/http/HttpResponse;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 80
    invoke-static {v0, p0}, Lcom/newrelic/agent/android/instrumentation/ApacheInstrumentation;->httpClientError(Lcom/newrelic/agent/android/instrumentation/TransactionState;Ljava/lang/Exception;)V

    .line 81
    throw p0
.end method

.method public static execute(Lorg/apache/http/client/HttpClient;Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;
    .locals 1
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 28
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/TransactionState;

    invoke-direct {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionState;-><init>()V

    .line 29
    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionStateUtil;->setCatPayload(Lcom/newrelic/agent/android/instrumentation/TransactionState;)V

    .line 31
    :try_start_0
    invoke-static {p1, p2, v0}, Lcom/newrelic/agent/android/instrumentation/ApacheInstrumentation;->delegate(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lcom/newrelic/agent/android/instrumentation/TransactionState;)Lorg/apache/http/HttpRequest;

    move-result-object p2

    invoke-interface {p0, p1, p2, p3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;

    move-result-object p0

    invoke-static {p0, v0}, Lcom/newrelic/agent/android/instrumentation/ApacheInstrumentation;->delegate(Lorg/apache/http/HttpResponse;Lcom/newrelic/agent/android/instrumentation/TransactionState;)Lorg/apache/http/HttpResponse;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 33
    invoke-static {v0, p0}, Lcom/newrelic/agent/android/instrumentation/ApacheInstrumentation;->httpClientError(Lcom/newrelic/agent/android/instrumentation/TransactionState;Ljava/lang/Exception;)V

    .line 34
    throw p0
.end method

.method public static execute(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    .locals 1
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 134
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/TransactionState;

    invoke-direct {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionState;-><init>()V

    .line 135
    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionStateUtil;->setCatPayload(Lcom/newrelic/agent/android/instrumentation/TransactionState;)V

    .line 137
    :try_start_0
    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ApacheInstrumentation;->delegate(Lorg/apache/http/client/methods/HttpUriRequest;Lcom/newrelic/agent/android/instrumentation/TransactionState;)Lorg/apache/http/client/methods/HttpUriRequest;

    move-result-object p1

    invoke-interface {p0, p1}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object p0

    invoke-static {p0, v0}, Lcom/newrelic/agent/android/instrumentation/ApacheInstrumentation;->delegate(Lorg/apache/http/HttpResponse;Lcom/newrelic/agent/android/instrumentation/TransactionState;)Lorg/apache/http/HttpResponse;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 139
    invoke-static {v0, p0}, Lcom/newrelic/agent/android/instrumentation/ApacheInstrumentation;->httpClientError(Lcom/newrelic/agent/android/instrumentation/TransactionState;Ljava/lang/Exception;)V

    .line 140
    throw p0
.end method

.method public static execute(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;
    .locals 1
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 88
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/TransactionState;

    invoke-direct {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionState;-><init>()V

    .line 89
    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionStateUtil;->setCatPayload(Lcom/newrelic/agent/android/instrumentation/TransactionState;)V

    .line 91
    :try_start_0
    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ApacheInstrumentation;->delegate(Lorg/apache/http/client/methods/HttpUriRequest;Lcom/newrelic/agent/android/instrumentation/TransactionState;)Lorg/apache/http/client/methods/HttpUriRequest;

    move-result-object p1

    invoke-interface {p0, p1, p2}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;

    move-result-object p0

    invoke-static {p0, v0}, Lcom/newrelic/agent/android/instrumentation/ApacheInstrumentation;->delegate(Lorg/apache/http/HttpResponse;Lcom/newrelic/agent/android/instrumentation/TransactionState;)Lorg/apache/http/HttpResponse;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 93
    invoke-static {v0, p0}, Lcom/newrelic/agent/android/instrumentation/ApacheInstrumentation;->httpClientError(Lcom/newrelic/agent/android/instrumentation/TransactionState;Ljava/lang/Exception;)V

    .line 94
    throw p0
.end method

.method protected static httpClientError(Lcom/newrelic/agent/android/instrumentation/TransactionState;Ljava/lang/Exception;)V
    .locals 1

    .line 145
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->isComplete()Z

    move-result v0

    if-nez v0, :cond_0

    .line 146
    invoke-static {p0, p1}, Lcom/newrelic/agent/android/instrumentation/TransactionStateUtil;->setErrorCodeFromException(Lcom/newrelic/agent/android/instrumentation/TransactionState;Ljava/lang/Exception;)V

    .line 147
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->end()Lcom/newrelic/agent/android/api/common/TransactionData;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 151
    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/api/common/TransactionData;->setResponseBody(Ljava/lang/String;)V

    .line 153
    new-instance p1, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;

    invoke-direct {p1, p0}, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;-><init>(Lcom/newrelic/agent/android/api/common/TransactionData;)V

    invoke-static {p1}, Lcom/newrelic/agent/android/TaskQueue;->queue(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
