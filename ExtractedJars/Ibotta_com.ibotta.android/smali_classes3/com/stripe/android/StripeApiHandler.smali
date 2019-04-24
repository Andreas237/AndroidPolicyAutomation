.class Lcom/stripe/android/StripeApiHandler;
.super Ljava/lang/Object;
.source "StripeApiHandler.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/StripeApiHandler$Parameter;,
        Lcom/stripe/android/StripeApiHandler$StripeResponseListener;,
        Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;
    }
.end annotation


# static fields
.field private static final SSL_SOCKET_FACTORY:Ljavax/net/ssl/SSLSocketFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 75
    new-instance v0, Lcom/stripe/android/StripeSSLSocketFactory;

    invoke-direct {v0}, Lcom/stripe/android/StripeSSLSocketFactory;-><init>()V

    sput-object v0, Lcom/stripe/android/StripeApiHandler;->SSL_SOCKET_FACTORY:Ljavax/net/ssl/SSLSocketFactory;

    return-void
.end method

.method static addCustomerSource(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;)Lcom/stripe/android/model/Source;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;",
            ")",
            "Lcom/stripe/android/model/Source;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/exception/InvalidRequestException;,
            Lcom/stripe/android/exception/APIConnectionException;,
            Lcom/stripe/android/exception/APIException;,
            Lcom/stripe/android/exception/AuthenticationException;,
            Lcom/stripe/android/exception/CardException;
        }
    .end annotation

    .line 425
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "source"

    .line 426
    invoke-interface {v0, v1, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p0, :cond_0

    .line 430
    invoke-static {p0, p3, p2, p5}, Lcom/stripe/android/LoggingUtils;->getAddSourceParams(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p0

    .line 438
    invoke-static {p2}, Lcom/stripe/android/RequestOptions;->builder(Ljava/lang/String;)Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;

    move-result-object p2

    const-string p3, "2017-06-05"

    invoke-virtual {p2, p3}, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->setApiVersion(Ljava/lang/String;)Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->build()Lcom/stripe/android/RequestOptions;

    move-result-object p2

    .line 439
    invoke-static {p0, p2, p7}, Lcom/stripe/android/StripeApiHandler;->logApiCall(Ljava/util/Map;Lcom/stripe/android/RequestOptions;Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;)V

    :cond_0
    const-string p0, "POST"

    .line 444
    invoke-static {p1}, Lcom/stripe/android/StripeApiHandler;->getAddCustomerSourceUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 446
    invoke-static {p6}, Lcom/stripe/android/RequestOptions;->builder(Ljava/lang/String;)Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;

    move-result-object p2

    const-string p3, "2017-06-05"

    invoke-virtual {p2, p3}, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->setApiVersion(Ljava/lang/String;)Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->build()Lcom/stripe/android/RequestOptions;

    move-result-object p2

    .line 442
    invoke-static {p0, p1, v0, p2}, Lcom/stripe/android/StripeApiHandler;->getStripeResponse(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/RequestOptions;)Lcom/stripe/android/StripeResponse;

    move-result-object p0

    .line 448
    invoke-static {p0}, Lcom/stripe/android/StripeApiHandler;->convertErrorsToExceptionsAndThrowIfNecessary(Lcom/stripe/android/StripeResponse;)V

    .line 449
    invoke-virtual {p0}, Lcom/stripe/android/StripeResponse;->getResponseBody()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/stripe/android/model/Source;->fromString(Ljava/lang/String;)Lcom/stripe/android/model/Source;

    move-result-object p0

    return-object p0
.end method

.method private static attachPseudoCookie(Ljava/net/HttpURLConnection;Lcom/stripe/android/RequestOptions;)V
    .locals 3
    .param p0    # Ljava/net/HttpURLConnection;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/stripe/android/RequestOptions;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 817
    invoke-virtual {p1}, Lcom/stripe/android/RequestOptions;->getGuid()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/RequestOptions;->getGuid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Cookie"

    .line 818
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "m="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/stripe/android/RequestOptions;->getGuid()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method static convertErrorsToExceptionsAndThrowIfNecessary(Lcom/stripe/android/StripeResponse;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/exception/InvalidRequestException;,
            Lcom/stripe/android/exception/APIConnectionException;,
            Lcom/stripe/android/exception/APIException;,
            Lcom/stripe/android/exception/AuthenticationException;,
            Lcom/stripe/android/exception/CardException;
        }
    .end annotation

    .line 722
    invoke-virtual {p0}, Lcom/stripe/android/StripeResponse;->getResponseCode()I

    move-result v0

    .line 723
    invoke-virtual {p0}, Lcom/stripe/android/StripeResponse;->getResponseBody()Ljava/lang/String;

    move-result-object v1

    .line 725
    invoke-virtual {p0}, Lcom/stripe/android/StripeResponse;->getResponseHeaders()Ljava/util/Map;

    move-result-object p0

    const/4 v2, 0x0

    if-nez p0, :cond_0

    move-object p0, v2

    goto :goto_0

    :cond_0
    const-string v3, "Request-Id"

    .line 726
    invoke-interface {p0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    :goto_0
    if-eqz p0, :cond_1

    .line 728
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_1

    const/4 v2, 0x0

    .line 729
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Ljava/lang/String;

    :cond_1
    const/16 p0, 0xc8

    if-lt v0, p0, :cond_2

    const/16 p0, 0x12c

    if-lt v0, p0, :cond_3

    .line 733
    :cond_2
    invoke-static {v1, v0, v2}, Lcom/stripe/android/StripeApiHandler;->handleAPIError(Ljava/lang/String;ILjava/lang/String;)V

    :cond_3
    return-void
.end method

.method private static createDeleteConnection(Ljava/lang/String;Lcom/stripe/android/RequestOptions;)Ljava/net/HttpURLConnection;
    .locals 0
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/stripe/android/RequestOptions;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 825
    invoke-static {p0, p1}, Lcom/stripe/android/StripeApiHandler;->createStripeConnection(Ljava/lang/String;Lcom/stripe/android/RequestOptions;)Ljava/net/HttpURLConnection;

    move-result-object p0

    const-string p1, "DELETE"

    .line 826
    invoke-virtual {p0, p1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    return-object p0
.end method

.method private static createGetConnection(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/RequestOptions;)Ljava/net/HttpURLConnection;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 833
    invoke-static {p0, p1}, Lcom/stripe/android/StripeApiHandler;->formatURL(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 834
    invoke-static {p0, p2}, Lcom/stripe/android/StripeApiHandler;->createStripeConnection(Ljava/lang/String;Lcom/stripe/android/RequestOptions;)Ljava/net/HttpURLConnection;

    move-result-object p0

    const-string p1, "GET"

    .line 835
    invoke-virtual {p0, p1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    return-object p0
.end method

.method private static createPostConnection(Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/RequestOptions;)Ljava/net/HttpURLConnection;
    .locals 2
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/stripe/android/RequestOptions;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/stripe/android/RequestOptions;",
            ")",
            "Ljava/net/HttpURLConnection;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/stripe/android/exception/InvalidRequestException;
        }
    .end annotation

    .line 844
    invoke-static {p0, p2}, Lcom/stripe/android/StripeApiHandler;->createStripeConnection(Ljava/lang/String;Lcom/stripe/android/RequestOptions;)Ljava/net/HttpURLConnection;

    move-result-object p0

    const/4 v0, 0x1

    .line 846
    invoke-virtual {p0, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    const-string v0, "POST"

    .line 847
    invoke-virtual {p0, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const-string v0, "Content-Type"

    .line 848
    invoke-static {p2}, Lcom/stripe/android/StripeApiHandler;->getContentType(Lcom/stripe/android/RequestOptions;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 852
    :try_start_0
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 853
    :try_start_1
    invoke-static {p1, p2}, Lcom/stripe/android/StripeApiHandler;->getOutputBytes(Ljava/util/Map;Lcom/stripe/android/RequestOptions;)[B

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_0

    .line 856
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    :cond_0
    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_0

    :catchall_1
    move-exception p0

    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    :cond_1
    throw p0
.end method

.method static createQuery(Ljava/util/Map;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;,
            Lcom/stripe/android/exception/InvalidRequestException;
        }
    .end annotation

    .line 600
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 601
    invoke-static {p0}, Lcom/stripe/android/StripeApiHandler;->flattenParams(Ljava/util/Map;)Ljava/util/List;

    move-result-object p0

    .line 602
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 604
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 605
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-lez v1, :cond_0

    const-string v1, "&"

    .line 606
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 608
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/StripeApiHandler$Parameter;

    .line 609
    iget-object v2, v1, Lcom/stripe/android/StripeApiHandler$Parameter;->key:Ljava/lang/String;

    iget-object v1, v1, Lcom/stripe/android/StripeApiHandler$Parameter;->value:Ljava/lang/String;

    invoke-static {v2, v1}, Lcom/stripe/android/StripeApiHandler;->urlEncodePair(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 612
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static createSource(Lcom/stripe/android/StripeNetworkUtils$UidProvider;Landroid/content/Context;Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;)Lcom/stripe/android/model/Source;
    .locals 7
    .param p0    # Lcom/stripe/android/StripeNetworkUtils$UidProvider;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/stripe/android/model/SourceParams;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/exception/AuthenticationException;,
            Lcom/stripe/android/exception/InvalidRequestException;,
            Lcom/stripe/android/exception/APIConnectionException;,
            Lcom/stripe/android/exception/APIException;
        }
    .end annotation

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 256
    invoke-static/range {v0 .. v6}, Lcom/stripe/android/StripeApiHandler;->createSource(Lcom/stripe/android/StripeNetworkUtils$UidProvider;Landroid/content/Context;Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;Lcom/stripe/android/StripeApiHandler$StripeResponseListener;)Lcom/stripe/android/model/Source;

    move-result-object p0

    return-object p0
.end method

.method static createSource(Lcom/stripe/android/StripeNetworkUtils$UidProvider;Landroid/content/Context;Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;Lcom/stripe/android/StripeApiHandler$StripeResponseListener;)Lcom/stripe/android/model/Source;
    .locals 3
    .param p0    # Lcom/stripe/android/StripeNetworkUtils$UidProvider;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/stripe/android/model/SourceParams;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p6    # Lcom/stripe/android/StripeApiHandler$StripeResponseListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/exception/AuthenticationException;,
            Lcom/stripe/android/exception/InvalidRequestException;,
            Lcom/stripe/android/exception/APIConnectionException;,
            Lcom/stripe/android/exception/APIException;
        }
    .end annotation

    .line 280
    invoke-virtual {p2}, Lcom/stripe/android/model/SourceParams;->toParamMap()Ljava/util/Map;

    move-result-object v0

    .line 281
    invoke-static {p0, p1, v0}, Lcom/stripe/android/StripeNetworkUtils;->addUidParams(Lcom/stripe/android/StripeNetworkUtils$UidProvider;Landroid/content/Context;Ljava/util/Map;)V

    const-string p0, "source"

    .line 282
    invoke-static {p3, p4, p0}, Lcom/stripe/android/RequestOptions;->builder(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;

    move-result-object p0

    .line 285
    invoke-virtual {p0}, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->build()Lcom/stripe/android/RequestOptions;

    move-result-object p0

    .line 288
    :try_start_0
    invoke-virtual {p0}, Lcom/stripe/android/RequestOptions;->getPublishableApiKey()Ljava/lang/String;

    move-result-object p4

    .line 289
    invoke-static {p4}, Lcom/stripe/android/StripeTextUtils;->isBlank(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    .line 293
    :cond_0
    invoke-static {p1, p5}, Lcom/stripe/android/StripeApiHandler;->setTelemetryData(Landroid/content/Context;Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;)V

    .line 298
    invoke-virtual {p2}, Lcom/stripe/android/model/SourceParams;->getType()Ljava/lang/String;

    move-result-object p2

    .line 294
    invoke-static {p1, v2, p4, p2}, Lcom/stripe/android/LoggingUtils;->getSourceCreationParams(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    .line 299
    invoke-static {p3}, Lcom/stripe/android/RequestOptions;->builder(Ljava/lang/String;)Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->build()Lcom/stripe/android/RequestOptions;

    move-result-object p2

    .line 300
    invoke-static {p1, p2, p5}, Lcom/stripe/android/StripeApiHandler;->logApiCall(Ljava/util/Map;Lcom/stripe/android/RequestOptions;Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;)V

    const-string p1, "POST"

    .line 301
    invoke-static {}, Lcom/stripe/android/StripeApiHandler;->getSourcesUrl()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2, v0, p0}, Lcom/stripe/android/StripeApiHandler;->requestData(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/RequestOptions;)Lcom/stripe/android/StripeResponse;

    move-result-object p0

    if-eqz p6, :cond_1

    .line 303
    invoke-interface {p6, p0}, Lcom/stripe/android/StripeApiHandler$StripeResponseListener;->onStripeResponse(Lcom/stripe/android/StripeResponse;)V

    .line 305
    :cond_1
    invoke-virtual {p0}, Lcom/stripe/android/StripeResponse;->getResponseBody()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/stripe/android/model/Source;->fromString(Ljava/lang/String;)Lcom/stripe/android/model/Source;

    move-result-object p0
    :try_end_0
    .catch Lcom/stripe/android/exception/CardException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 308
    new-instance p1, Lcom/stripe/android/exception/APIException;

    .line 309
    invoke-virtual {p0}, Lcom/stripe/android/exception/CardException;->getMessage()Ljava/lang/String;

    move-result-object p2

    .line 310
    invoke-virtual {p0}, Lcom/stripe/android/exception/CardException;->getRequestId()Ljava/lang/String;

    move-result-object p3

    .line 311
    invoke-virtual {p0}, Lcom/stripe/android/exception/CardException;->getStatusCode()Ljava/lang/Integer;

    move-result-object p4

    invoke-direct {p1, p2, p3, p4, p0}, Lcom/stripe/android/exception/APIException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Throwable;)V

    throw p1
.end method

.method private static createStripeConnection(Ljava/lang/String;Lcom/stripe/android/RequestOptions;)Ljava/net/HttpURLConnection;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 868
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 869
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/URLConnectionInstrumentation;->openConnection(Ljava/net/URLConnection;)Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    const/16 v1, 0x7530

    .line 870
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    const v1, 0x13880

    .line 871
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    const/4 v1, 0x0

    .line 872
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    .line 874
    invoke-static {p0}, Lcom/stripe/android/StripeApiHandler;->urlNeedsHeaderData(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 875
    invoke-static {p1}, Lcom/stripe/android/StripeApiHandler;->getHeaders(Lcom/stripe/android/RequestOptions;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 876
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v3, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 880
    :cond_0
    invoke-static {p0}, Lcom/stripe/android/StripeApiHandler;->urlNeedsPseudoCookie(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 881
    invoke-static {v0, p1}, Lcom/stripe/android/StripeApiHandler;->attachPseudoCookie(Ljava/net/HttpURLConnection;Lcom/stripe/android/RequestOptions;)V

    .line 884
    :cond_1
    instance-of p0, v0, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz p0, :cond_2

    .line 885
    move-object p0, v0

    check-cast p0, Ljavax/net/ssl/HttpsURLConnection;

    sget-object p1, Lcom/stripe/android/StripeApiHandler;->SSL_SOCKET_FACTORY:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {p0, p1}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    :cond_2
    return-object v0
.end method

.method static createToken(Landroid/content/Context;Ljava/util/Map;Lcom/stripe/android/RequestOptions;Ljava/lang/String;Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;)Lcom/stripe/android/model/Token;
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/stripe/android/RequestOptions;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/stripe/android/RequestOptions;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;",
            ")",
            "Lcom/stripe/android/model/Token;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/exception/AuthenticationException;,
            Lcom/stripe/android/exception/InvalidRequestException;,
            Lcom/stripe/android/exception/APIConnectionException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/exception/APIException;
        }
    .end annotation

    .line 388
    :try_start_0
    invoke-virtual {p2}, Lcom/stripe/android/RequestOptions;->getPublishableApiKey()Ljava/lang/String;

    move-result-object v0

    .line 389
    invoke-static {v0}, Lcom/stripe/android/StripeTextUtils;->isBlank(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v1, "product_usage"

    .line 394
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    const-string v2, "product_usage"

    .line 395
    invoke-interface {p1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 397
    invoke-static {p0, p4}, Lcom/stripe/android/StripeApiHandler;->setTelemetryData(Landroid/content/Context;Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;)V

    .line 400
    invoke-static {p0, v1, v0, p3}, Lcom/stripe/android/LoggingUtils;->getTokenCreationParams(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p0

    .line 401
    invoke-static {p0, p2, p4}, Lcom/stripe/android/StripeApiHandler;->logApiCall(Ljava/util/Map;Lcom/stripe/android/RequestOptions;Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p0, "product_usage"

    .line 404
    invoke-interface {p1, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    const-string p0, "POST"

    .line 407
    invoke-static {}, Lcom/stripe/android/StripeApiHandler;->getApiUrl()Ljava/lang/String;

    move-result-object p3

    invoke-static {p0, p3, p1, p2}, Lcom/stripe/android/StripeApiHandler;->requestToken(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/RequestOptions;)Lcom/stripe/android/model/Token;

    move-result-object p0

    return-object p0
.end method

.method static deleteCustomerSource(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;)Lcom/stripe/android/model/Source;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;",
            ")",
            "Lcom/stripe/android/model/Source;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/exception/InvalidRequestException;,
            Lcom/stripe/android/exception/APIConnectionException;,
            Lcom/stripe/android/exception/APIException;,
            Lcom/stripe/android/exception/AuthenticationException;,
            Lcom/stripe/android/exception/CardException;
        }
    .end annotation

    .line 466
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    if-eqz p0, :cond_0

    .line 470
    invoke-static {p0, p3, p2}, Lcom/stripe/android/LoggingUtils;->getDeleteSourceParams(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p0

    .line 477
    invoke-static {p2}, Lcom/stripe/android/RequestOptions;->builder(Ljava/lang/String;)Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;

    move-result-object p2

    const-string p3, "2017-06-05"

    invoke-virtual {p2, p3}, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->setApiVersion(Ljava/lang/String;)Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->build()Lcom/stripe/android/RequestOptions;

    move-result-object p2

    .line 478
    invoke-static {p0, p2, p6}, Lcom/stripe/android/StripeApiHandler;->logApiCall(Ljava/util/Map;Lcom/stripe/android/RequestOptions;Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;)V

    :cond_0
    const-string p0, "DELETE"

    .line 483
    invoke-static {p1, p4}, Lcom/stripe/android/StripeApiHandler;->getDeleteCustomerSourceUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 485
    invoke-static {p5}, Lcom/stripe/android/RequestOptions;->builder(Ljava/lang/String;)Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;

    move-result-object p2

    const-string p3, "2017-06-05"

    invoke-virtual {p2, p3}, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->setApiVersion(Ljava/lang/String;)Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->build()Lcom/stripe/android/RequestOptions;

    move-result-object p2

    .line 481
    invoke-static {p0, p1, v0, p2}, Lcom/stripe/android/StripeApiHandler;->getStripeResponse(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/RequestOptions;)Lcom/stripe/android/StripeResponse;

    move-result-object p0

    .line 487
    invoke-static {p0}, Lcom/stripe/android/StripeApiHandler;->convertErrorsToExceptionsAndThrowIfNecessary(Lcom/stripe/android/StripeResponse;)V

    .line 488
    invoke-virtual {p0}, Lcom/stripe/android/StripeResponse;->getResponseBody()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/stripe/android/model/Source;->fromString(Ljava/lang/String;)Lcom/stripe/android/model/Source;

    move-result-object p0

    return-object p0
.end method

.method private static fireAndForgetApiCall(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/RequestOptions;Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;)V
    .locals 4
    .param p0    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/stripe/android/RequestOptions;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/RequestOptions;",
            "Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x1

    .line 898
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "networkaddress.cache.ttl"

    .line 902
    invoke-static {v2}, Ljava/security/Security;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "networkaddress.cache.ttl"

    const-string v3, "0"

    .line 905
    invoke-static {v2, v3}, Ljava/security/Security;->setProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    .line 907
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 911
    :goto_0
    :try_start_1
    invoke-static {p2, p1, p0, p3}, Lcom/stripe/android/StripeApiHandler;->getStripeResponse(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/RequestOptions;)Lcom/stripe/android/StripeResponse;

    move-result-object p0

    if-eqz p4, :cond_0

    .line 918
    invoke-interface {p4, p0}, Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;->onLoggingResponse(Lcom/stripe/android/StripeResponse;)V
    :try_end_1
    .catch Lcom/stripe/android/exception/StripeException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 926
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_5

    if-nez v1, :cond_1

    :goto_1
    const-string p0, "networkaddress.cache.ttl"

    const-string p1, "-1"

    .line 930
    invoke-static {p0, p1}, Ljava/security/Security;->setProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :cond_1
    const-string p0, "networkaddress.cache.ttl"

    .line 933
    invoke-static {p0, v1}, Ljava/security/Security;->setProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :catchall_0
    move-exception p0

    goto :goto_2

    :catch_1
    move-exception p0

    if-eqz p4, :cond_4

    .line 922
    :try_start_2
    invoke-interface {p4, p0}, Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;->onStripeException(Lcom/stripe/android/exception/StripeException;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_4

    .line 926
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    if-nez v1, :cond_2

    const-string p1, "networkaddress.cache.ttl"

    const-string p2, "-1"

    .line 930
    invoke-static {p1, p2}, Ljava/security/Security;->setProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_2
    const-string p1, "networkaddress.cache.ttl"

    .line 933
    invoke-static {p1, v1}, Ljava/security/Security;->setProperty(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_3
    throw p0

    .line 926
    :cond_4
    :goto_4
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_5

    if-nez v1, :cond_1

    goto :goto_1

    :cond_5
    :goto_5
    return-void
.end method

.method private static flattenParams(Ljava/util/Map;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/stripe/android/StripeApiHandler$Parameter;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/exception/InvalidRequestException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 942
    invoke-static {p0, v0}, Lcom/stripe/android/StripeApiHandler;->flattenParamsMap(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static flattenParamsList(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/stripe/android/StripeApiHandler$Parameter;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/exception/InvalidRequestException;
        }
    .end annotation

    .line 947
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 948
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const-string v2, "%s[]"

    const/4 v3, 0x1

    .line 949
    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 955
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 956
    new-instance p0, Lcom/stripe/android/StripeApiHandler$Parameter;

    const-string v1, ""

    invoke-direct {p0, p1, v1}, Lcom/stripe/android/StripeApiHandler$Parameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 958
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result p0

    if-eqz p0, :cond_1

    .line 959
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v2}, Lcom/stripe/android/StripeApiHandler;->flattenParamsValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    :goto_1
    return-object v0
.end method

.method private static flattenParamsMap(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/stripe/android/StripeApiHandler$Parameter;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/exception/InvalidRequestException;
        }
    .end annotation

    .line 968
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    if-nez p0, :cond_0

    return-object v0

    .line 973
    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 974
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 975
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-eqz p1, :cond_1

    const-string v3, "%s[%s]"

    const/4 v4, 0x2

    .line 978
    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const/4 v5, 0x1

    aput-object v2, v4, v5

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 981
    :cond_1
    invoke-static {v1, v2}, Lcom/stripe/android/StripeApiHandler;->flattenParamsValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method private static flattenParamsValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/stripe/android/StripeApiHandler$Parameter;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/exception/InvalidRequestException;
        }
    .end annotation

    .line 990
    instance-of v0, p0, Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 991
    check-cast p0, Ljava/util/Map;

    invoke-static {p0, p1}, Lcom/stripe/android/StripeApiHandler;->flattenParamsMap(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    goto :goto_0

    .line 992
    :cond_0
    instance-of v0, p0, Ljava/util/List;

    if-eqz v0, :cond_1

    .line 993
    check-cast p0, Ljava/util/List;

    invoke-static {p0, p1}, Lcom/stripe/android/StripeApiHandler;->flattenParamsList(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :cond_1
    const-string v0, ""

    .line 994
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    if-nez p0, :cond_2

    .line 1000
    new-instance p0, Ljava/util/LinkedList;

    invoke-direct {p0}, Ljava/util/LinkedList;-><init>()V

    .line 1001
    new-instance v0, Lcom/stripe/android/StripeApiHandler$Parameter;

    const-string v1, ""

    invoke-direct {v0, p1, v1}, Lcom/stripe/android/StripeApiHandler$Parameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1003
    :cond_2
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 1004
    new-instance v1, Lcom/stripe/android/StripeApiHandler$Parameter;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p1, p0}, Lcom/stripe/android/StripeApiHandler$Parameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object p0, v0

    :goto_0
    return-object p0

    .line 995
    :cond_3
    new-instance p0, Lcom/stripe/android/exception/InvalidRequestException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "You cannot set \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\' to an empty string. We interpret empty strings as null in requests. You may set \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\' to null to delete the property."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v0, 0x0

    .line 998
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/exception/InvalidRequestException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Throwable;)V

    throw p0
.end method

.method private static formatURL(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    if-eqz p1, :cond_2

    .line 1011
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "?"

    .line 1015
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "&"

    goto :goto_0

    :cond_1
    const-string v0, "?"

    :goto_0
    const-string v1, "%s%s%s"

    const/4 v2, 0x3

    .line 1016
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    const/4 p0, 0x1

    aput-object v0, v2, p0

    const/4 p0, 0x2

    aput-object p1, v2, p0

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_1
    return-object p0
.end method

.method static getAddCustomerSourceUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 692
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v1, "%s/%s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p0}, Lcom/stripe/android/StripeApiHandler;->getRetrieveCustomerUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v3, 0x0

    aput-object p0, v2, v3

    const-string p0, "sources"

    const/4 v3, 0x1

    aput-object p0, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static getApiUrl()Ljava/lang/String;
    .locals 5
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 657
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v1, "%s/v1/%s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "https://api.stripe.com"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "tokens"

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static getContentType(Lcom/stripe/android/RequestOptions;)Ljava/lang/String;
    .locals 3
    .param p0    # Lcom/stripe/android/RequestOptions;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "json_data"

    .line 1021
    invoke-virtual {p0}, Lcom/stripe/android/RequestOptions;->getRequestType()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p0, :cond_0

    const-string p0, "application/json; charset=%s"

    .line 1022
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UTF-8"

    aput-object v2, v1, v0

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "application/x-www-form-urlencoded;charset=%s"

    .line 1025
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UTF-8"

    aput-object v2, v1, v0

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static getCustomersUrl()Ljava/lang/String;
    .locals 5
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 687
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v1, "%s/v1/%s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "https://api.stripe.com"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "customers"

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static getDeleteCustomerSourceUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 697
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v1, "%s/%s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    .line 698
    invoke-static {p0}, Lcom/stripe/android/StripeApiHandler;->getAddCustomerSourceUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v3, 0x0

    aput-object p0, v2, v3

    const/4 p0, 0x1

    aput-object p1, v2, p0

    .line 697
    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static getHeaders(Lcom/stripe/android/RequestOptions;)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/RequestOptions;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 616
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "Accept-Charset"

    const-string v2, "UTF-8"

    .line 617
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "Accept"

    const-string v2, "application/json"

    .line 618
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "User-Agent"

    const-string v2, "Stripe/v1 AndroidBindings/%s"

    const/4 v3, 0x1

    .line 619
    new-array v4, v3, [Ljava/lang/Object;

    const-string v5, "8.0.0"

    const/4 v6, 0x0

    aput-object v5, v4, v6

    .line 620
    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 619
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p0, :cond_0

    const-string v1, "Authorization"

    .line 623
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v4, "Bearer %s"

    new-array v3, v3, [Ljava/lang/Object;

    .line 624
    invoke-virtual {p0}, Lcom/stripe/android/RequestOptions;->getPublishableApiKey()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v6

    .line 623
    invoke-static {v2, v4, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 628
    :cond_0
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "java.version"

    const-string v3, "java.version"

    .line 631
    invoke-static {v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "os.name"

    const-string v3, "android"

    .line 632
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "os.version"

    .line 633
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "bindings.version"

    const-string v3, "8.0.0"

    .line 634
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "lang"

    const-string v3, "Java"

    .line 635
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "publisher"

    const-string v3, "Stripe"

    .line 636
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 637
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    const-string v1, "X-Stripe-Client-User-Agent"

    .line 638
    instance-of v3, v2, Lorg/json/JSONObject;

    if-nez v3, :cond_1

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    check-cast v2, Lorg/json/JSONObject;

    invoke-static {v2}, Lcom/newrelic/agent/android/instrumentation/JSONObjectInstrumentation;->toString(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p0, :cond_2

    .line 640
    invoke-virtual {p0}, Lcom/stripe/android/RequestOptions;->getApiVersion()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    const-string v1, "Stripe-Version"

    .line 641
    invoke-virtual {p0}, Lcom/stripe/android/RequestOptions;->getApiVersion()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    if-eqz p0, :cond_3

    .line 644
    invoke-virtual {p0}, Lcom/stripe/android/RequestOptions;->getStripeAccount()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    const-string v1, "Stripe-Account"

    .line 645
    invoke-virtual {p0}, Lcom/stripe/android/RequestOptions;->getStripeAccount()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    if-eqz p0, :cond_4

    .line 648
    invoke-virtual {p0}, Lcom/stripe/android/RequestOptions;->getIdempotencyKey()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    const-string v1, "Idempotency-Key"

    .line 649
    invoke-virtual {p0}, Lcom/stripe/android/RequestOptions;->getIdempotencyKey()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-object v0
.end method

.method private static getOutputBytes(Ljava/util/Map;Lcom/stripe/android/RequestOptions;)[B
    .locals 7
    .param p0    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/stripe/android/RequestOptions;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/stripe/android/RequestOptions;",
            ")[B"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/exception/InvalidRequestException;
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "json_data"

    .line 1034
    invoke-virtual {p1}, Lcom/stripe/android/RequestOptions;->getRequestType()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 1035
    invoke-static {p0}, Lcom/stripe/android/StripeApiHandler;->mapToJsonObject(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 1041
    instance-of p1, p0, Lorg/json/JSONObject;

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    check-cast p0, Lorg/json/JSONObject;

    invoke-static {p0}, Lcom/newrelic/agent/android/instrumentation/JSONObjectInstrumentation;->toString(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    const-string p1, "UTF-8"

    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p0

    return-object p0

    .line 1037
    :cond_1
    new-instance p0, Lcom/stripe/android/exception/InvalidRequestException;

    const-string v2, "Unable to create JSON data from parameters. Please contact support@stripe.com for assistance."

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 1039
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/exception/InvalidRequestException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Throwable;)V

    throw p0

    .line 1043
    :cond_2
    invoke-static {p0}, Lcom/stripe/android/StripeApiHandler;->createQuery(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "UTF-8"

    .line 1044
    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    move-object v6, p0

    .line 1047
    new-instance p0, Lcom/stripe/android/exception/InvalidRequestException;

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 1050
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v2, "Unable to encode parameters to UTF-8. Please contact support@stripe.com for assistance."

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/exception/InvalidRequestException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Throwable;)V

    throw p0
.end method

.method private static getResponseBody(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1058
    new-instance v0, Ljava/util/Scanner;

    const-string v1, "UTF-8"

    invoke-direct {v0, p0, v1}, Ljava/util/Scanner;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    const-string v1, "\\A"

    invoke-virtual {v0, v1}, Ljava/util/Scanner;->useDelimiter(Ljava/lang/String;)Ljava/util/Scanner;

    move-result-object v0

    .line 1059
    invoke-virtual {v0}, Ljava/util/Scanner;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/util/Scanner;->next()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 1060
    :goto_0
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    return-object v0
.end method

.method static getRetrieveCustomerUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 703
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v1, "%s/%s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {}, Lcom/stripe/android/StripeApiHandler;->getCustomersUrl()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p0, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static getSourcesUrl()Ljava/lang/String;
    .locals 5
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 663
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v1, "%s/v1/%s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "https://api.stripe.com"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "sources"

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static getStripeResponse(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/RequestOptions;)Lcom/stripe/android/StripeResponse;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/stripe/android/RequestOptions;",
            ")",
            "Lcom/stripe/android/StripeResponse;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/exception/InvalidRequestException;,
            Lcom/stripe/android/exception/APIConnectionException;,
            Lcom/stripe/android/exception/APIException;
        }
    .end annotation

    const/4 v0, -0x1

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 1073
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v5

    const v6, 0x11336

    if-eq v5, v6, :cond_2

    const v6, 0x2590a0

    if-eq v5, v6, :cond_1

    const v6, 0x77f979ab

    if-eq v5, v6, :cond_0

    goto :goto_0

    :cond_0
    const-string v5, "DELETE"

    invoke-virtual {p0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/4 v0, 0x2

    goto :goto_0

    :cond_1
    const-string v5, "POST"

    invoke-virtual {p0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const-string v5, "GET"

    invoke-virtual {p0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/4 v0, 0x0

    :cond_3
    :goto_0
    packed-switch v0, :pswitch_data_0

    .line 1084
    new-instance p1, Lcom/stripe/android/exception/APIConnectionException;

    goto :goto_3

    .line 1081
    :pswitch_0
    invoke-static {p1, p3}, Lcom/stripe/android/StripeApiHandler;->createDeleteConnection(Ljava/lang/String;Lcom/stripe/android/RequestOptions;)Ljava/net/HttpURLConnection;

    move-result-object p0

    move-object v4, p0

    goto :goto_1

    .line 1078
    :pswitch_1
    invoke-static {p1, p2, p3}, Lcom/stripe/android/StripeApiHandler;->createPostConnection(Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/RequestOptions;)Ljava/net/HttpURLConnection;

    move-result-object p0

    move-object v4, p0

    goto :goto_1

    .line 1075
    :pswitch_2
    invoke-static {p2}, Lcom/stripe/android/StripeApiHandler;->createQuery(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0, p3}, Lcom/stripe/android/StripeApiHandler;->createGetConnection(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/RequestOptions;)Ljava/net/HttpURLConnection;

    move-result-object p0

    move-object v4, p0

    .line 1092
    :goto_1
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result p0

    const/16 p1, 0xc8

    if-lt p0, p1, :cond_4

    const/16 p1, 0x12c

    if-ge p0, p1, :cond_4

    .line 1097
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/StripeApiHandler;->getResponseBody(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    .line 1099
    :cond_4
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/StripeApiHandler;->getResponseBody(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object p1

    .line 1101
    :goto_2
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object p2

    .line 1102
    new-instance p3, Lcom/stripe/android/StripeResponse;

    invoke-direct {p3, p0, p1, p2}, Lcom/stripe/android/StripeResponse;-><init>(ILjava/lang/String;Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_5

    .line 1115
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_5
    return-object p3

    :goto_3
    :try_start_1
    const-string p2, "Unrecognized HTTP method %s. This indicates a bug in the Stripe bindings. Please contact support@stripe.com for assistance."

    .line 1084
    new-array p3, v2, [Ljava/lang/Object;

    aput-object p0, p3, v3

    .line 1085
    invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/stripe/android/exception/APIConnectionException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p0

    goto :goto_4

    :catch_0
    move-exception p0

    .line 1105
    :try_start_2
    new-instance p1, Lcom/stripe/android/exception/APIConnectionException;

    const-string p2, "IOException during API request to Stripe (%s): %s Please check your internet connection and try again. If this problem persists, you should check Stripe\'s service status at https://twitter.com/stripestatus, or let us know at support@stripe.com."

    new-array p3, v1, [Ljava/lang/Object;

    .line 1112
    invoke-static {}, Lcom/stripe/android/StripeApiHandler;->getApiUrl()Ljava/lang/String;

    move-result-object v0

    aput-object v0, p3, v3

    invoke-virtual {p0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    aput-object v0, p3, v2

    .line 1106
    invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Lcom/stripe/android/exception/APIConnectionException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_4
    if-eqz v4, :cond_6

    .line 1115
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_6
    throw p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static handleAPIError(Ljava/lang/String;ILjava/lang/String;)V
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/exception/InvalidRequestException;,
            Lcom/stripe/android/exception/AuthenticationException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/exception/APIException;
        }
    .end annotation

    .line 1124
    invoke-static {p0}, Lcom/stripe/android/ErrorParser;->parseError(Ljava/lang/String;)Lcom/stripe/android/ErrorParser$StripeError;

    move-result-object p0

    const/16 v0, 0x1ad

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    .line 1158
    new-instance v0, Lcom/stripe/android/exception/APIException;

    iget-object p0, p0, Lcom/stripe/android/ErrorParser$StripeError;->message:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {v0, p0, p2, p1, v1}, Lcom/stripe/android/exception/APIException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Throwable;)V

    throw v0

    .line 1134
    :pswitch_0
    new-instance v0, Lcom/stripe/android/exception/InvalidRequestException;

    iget-object v3, p0, Lcom/stripe/android/ErrorParser$StripeError;->message:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/ErrorParser$StripeError;->param:Ljava/lang/String;

    .line 1138
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v7, 0x0

    move-object v2, v0

    move-object v5, p2

    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/exception/InvalidRequestException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Throwable;)V

    throw v0

    .line 1153
    :pswitch_1
    new-instance v0, Lcom/stripe/android/exception/PermissionException;

    iget-object p0, p0, Lcom/stripe/android/ErrorParser$StripeError;->message:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {v0, p0, p2, p1}, Lcom/stripe/android/exception/PermissionException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    throw v0

    .line 1143
    :pswitch_2
    new-instance v0, Lcom/stripe/android/exception/CardException;

    iget-object v2, p0, Lcom/stripe/android/ErrorParser$StripeError;->message:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/ErrorParser$StripeError;->code:Ljava/lang/String;

    iget-object v5, p0, Lcom/stripe/android/ErrorParser$StripeError;->param:Ljava/lang/String;

    iget-object v6, p0, Lcom/stripe/android/ErrorParser$StripeError;->decline_code:Ljava/lang/String;

    iget-object v7, p0, Lcom/stripe/android/ErrorParser$StripeError;->charge:Ljava/lang/String;

    .line 1150
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/4 v9, 0x0

    move-object v1, v0

    move-object v3, p2

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/exception/CardException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Throwable;)V

    throw v0

    .line 1141
    :pswitch_3
    new-instance v0, Lcom/stripe/android/exception/AuthenticationException;

    iget-object p0, p0, Lcom/stripe/android/ErrorParser$StripeError;->message:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {v0, p0, p2, p1}, Lcom/stripe/android/exception/AuthenticationException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    throw v0

    .line 1127
    :pswitch_4
    new-instance v0, Lcom/stripe/android/exception/InvalidRequestException;

    iget-object v2, p0, Lcom/stripe/android/ErrorParser$StripeError;->message:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/ErrorParser$StripeError;->param:Ljava/lang/String;

    .line 1131
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    move-object v1, v0

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/exception/InvalidRequestException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Throwable;)V

    throw v0

    .line 1155
    :cond_0
    new-instance v0, Lcom/stripe/android/exception/RateLimitException;

    iget-object v8, p0, Lcom/stripe/android/ErrorParser$StripeError;->message:Ljava/lang/String;

    iget-object v9, p0, Lcom/stripe/android/ErrorParser$StripeError;->param:Ljava/lang/String;

    .line 1156
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/4 v12, 0x0

    move-object v7, v0

    move-object v10, p2

    invoke-direct/range {v7 .. v12}, Lcom/stripe/android/exception/RateLimitException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Throwable;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x190
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static listToJsonArray(Ljava/util/List;)Lorg/json/JSONArray;
    .locals 3
    .param p0    # Ljava/util/List;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 795
    :cond_0
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 796
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 797
    instance-of v2, v1, Ljava/util/Map;

    if-eqz v2, :cond_1

    .line 801
    check-cast v1, Ljava/util/Map;

    .line 802
    invoke-static {v1}, Lcom/stripe/android/StripeApiHandler;->mapToJsonObject(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    .line 803
    :cond_1
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_2

    .line 804
    check-cast v1, Ljava/util/List;

    invoke-static {v1}, Lcom/stripe/android/StripeApiHandler;->listToJsonArray(Ljava/util/List;)Lorg/json/JSONArray;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    .line 805
    :cond_2
    instance-of v2, v1, Ljava/lang/Number;

    if-nez v2, :cond_4

    instance-of v2, v1, Ljava/lang/Boolean;

    if-eqz v2, :cond_3

    goto :goto_1

    .line 808
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    .line 806
    :cond_4
    :goto_1
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    :cond_5
    return-object v0
.end method

.method static logApiCall(Ljava/util/Map;Lcom/stripe/android/RequestOptions;Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;)V
    .locals 2
    .param p0    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/stripe/android/RequestOptions;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/stripe/android/RequestOptions;",
            "Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;",
            ")V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    if-eqz p2, :cond_1

    .line 87
    invoke-interface {p2}, Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;->shouldLogTest()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 91
    :cond_1
    invoke-virtual {p1}, Lcom/stripe/android/RequestOptions;->getPublishableApiKey()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 92
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const-string v0, "https://q.stripe.com"

    const-string v1, "GET"

    .line 97
    invoke-static {p0, v0, v1, p1, p2}, Lcom/stripe/android/StripeApiHandler;->fireAndForgetApiCall(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/RequestOptions;Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;)V

    return-void

    :cond_3
    :goto_0
    return-void
.end method

.method private static mapToJsonObject(Ljava/util/Map;)Lorg/json/JSONObject;
    .locals 5
    .param p0    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lorg/json/JSONObject;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 751
    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 752
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 753
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_0

    .line 759
    :cond_1
    :try_start_0
    instance-of v4, v3, Ljava/util/Map;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v4, :cond_2

    .line 761
    :try_start_1
    check-cast v3, Ljava/util/Map;

    .line 762
    invoke-static {v3}, Lcom/stripe/android/StripeApiHandler;->mapToJsonObject(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    .line 766
    :cond_2
    :try_start_2
    instance-of v4, v3, Ljava/util/List;

    if-eqz v4, :cond_3

    .line 767
    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/stripe/android/StripeApiHandler;->listToJsonArray(Ljava/util/List;)Lorg/json/JSONArray;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 768
    :cond_3
    instance-of v4, v3, Ljava/lang/Number;

    if-nez v4, :cond_5

    instance-of v4, v3, Ljava/lang/Boolean;

    if-eqz v4, :cond_4

    goto :goto_1

    .line 771
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 769
    :cond_5
    :goto_1
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    nop

    goto :goto_0

    :cond_6
    return-object v0
.end method

.method private static requestData(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/RequestOptions;)Lcom/stripe/android/StripeResponse;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/stripe/android/RequestOptions;",
            ")",
            "Lcom/stripe/android/StripeResponse;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/exception/AuthenticationException;,
            Lcom/stripe/android/exception/InvalidRequestException;,
            Lcom/stripe/android/exception/APIConnectionException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/exception/APIException;
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return-object v0

    :cond_0
    const/4 v1, 0x1

    .line 1175
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_0
    const-string v3, "networkaddress.cache.ttl"

    .line 1179
    invoke-static {v3}, Ljava/security/Security;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    const-string v4, "networkaddress.cache.ttl"

    const-string v5, "0"

    .line 1182
    invoke-static {v4, v5}, Ljava/security/Security;->setProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    move-object v3, v0

    .line 1184
    :catch_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 1187
    :goto_0
    invoke-virtual {p3}, Lcom/stripe/android/RequestOptions;->getPublishableApiKey()Ljava/lang/String;

    move-result-object v4

    .line 1188
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_7

    .line 1195
    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/StripeApiHandler;->getStripeResponse(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/RequestOptions;)Lcom/stripe/android/StripeResponse;

    move-result-object p0

    .line 1197
    invoke-virtual {p0}, Lcom/stripe/android/StripeResponse;->getResponseCode()I

    move-result p1

    .line 1198
    invoke-virtual {p0}, Lcom/stripe/android/StripeResponse;->getResponseBody()Ljava/lang/String;

    move-result-object p2

    .line 1201
    invoke-virtual {p0}, Lcom/stripe/android/StripeResponse;->getResponseHeaders()Ljava/util/Map;

    move-result-object p3

    if-nez p3, :cond_1

    move-object p3, v0

    goto :goto_1

    :cond_1
    const-string v4, "Request-Id"

    .line 1202
    invoke-interface {p3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/List;

    :goto_1
    if-eqz p3, :cond_2

    .line 1203
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_2

    .line 1204
    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    move-object v0, p3

    check-cast v0, Ljava/lang/String;

    :cond_2
    const/16 p3, 0xc8

    if-lt p1, p3, :cond_3

    const/16 p3, 0x12c

    if-lt p1, p3, :cond_4

    .line 1208
    :cond_3
    invoke-static {p2, p1, v0}, Lcom/stripe/android/StripeApiHandler;->handleAPIError(Ljava/lang/String;ILjava/lang/String;)V

    .line 1211
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_6

    if-nez v3, :cond_5

    const-string p1, "networkaddress.cache.ttl"

    const-string p2, "-1"

    .line 1215
    invoke-static {p1, p2}, Ljava/security/Security;->setProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    const-string p1, "networkaddress.cache.ttl"

    .line 1218
    invoke-static {p1, v3}, Ljava/security/Security;->setProperty(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    :goto_2
    return-object p0

    .line 1189
    :cond_7
    new-instance p0, Lcom/stripe/android/exception/AuthenticationException;

    .line 1192
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "No API key provided. (HINT: set your API key using \'Stripe.apiKey = <API-KEY>\'. You can generate API keys from the Stripe web interface. See https://stripe.com/api for details or email support@stripe.com if you have questions."

    invoke-direct {p0, p2, v0, p1}, Lcom/stripe/android/exception/AuthenticationException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    throw p0
.end method

.method private static requestToken(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/RequestOptions;)Lcom/stripe/android/model/Token;
    .locals 0
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/stripe/android/RequestOptions;",
            ")",
            "Lcom/stripe/android/model/Token;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/exception/AuthenticationException;,
            Lcom/stripe/android/exception/InvalidRequestException;,
            Lcom/stripe/android/exception/APIConnectionException;,
            Lcom/stripe/android/exception/CardException;,
            Lcom/stripe/android/exception/APIException;
        }
    .end annotation

    .line 1233
    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/StripeApiHandler;->requestData(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/RequestOptions;)Lcom/stripe/android/StripeResponse;

    move-result-object p0

    .line 1234
    invoke-virtual {p0}, Lcom/stripe/android/StripeResponse;->getResponseBody()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/stripe/android/model/Token;->fromString(Ljava/lang/String;)Lcom/stripe/android/model/Token;

    move-result-object p0

    return-object p0
.end method

.method static retrieveCustomer(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Customer;
    .locals 2
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/exception/InvalidRequestException;,
            Lcom/stripe/android/exception/APIConnectionException;,
            Lcom/stripe/android/exception/APIException;,
            Lcom/stripe/android/exception/AuthenticationException;,
            Lcom/stripe/android/exception/CardException;
        }
    .end annotation

    const-string v0, "GET"

    .line 591
    invoke-static {p0}, Lcom/stripe/android/StripeApiHandler;->getRetrieveCustomerUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 593
    invoke-static {p1}, Lcom/stripe/android/RequestOptions;->builder(Ljava/lang/String;)Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;

    move-result-object p1

    const-string v1, "2017-06-05"

    invoke-virtual {p1, v1}, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->setApiVersion(Ljava/lang/String;)Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->build()Lcom/stripe/android/RequestOptions;

    move-result-object p1

    const/4 v1, 0x0

    .line 589
    invoke-static {v0, p0, v1, p1}, Lcom/stripe/android/StripeApiHandler;->getStripeResponse(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/RequestOptions;)Lcom/stripe/android/StripeResponse;

    move-result-object p0

    .line 594
    invoke-static {p0}, Lcom/stripe/android/StripeApiHandler;->convertErrorsToExceptionsAndThrowIfNecessary(Lcom/stripe/android/StripeResponse;)V

    .line 595
    invoke-virtual {p0}, Lcom/stripe/android/StripeResponse;->getResponseBody()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/stripe/android/model/Customer;->fromString(Ljava/lang/String;)Lcom/stripe/android/model/Customer;

    move-result-object p0

    return-object p0
.end method

.method static setCustomerShippingInfo(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/ShippingInformation;Ljava/lang/String;Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;)Lcom/stripe/android/model/Customer;
    .locals 7
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/stripe/android/model/ShippingInformation;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/model/ShippingInformation;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;",
            ")",
            "Lcom/stripe/android/model/Customer;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/exception/InvalidRequestException;,
            Lcom/stripe/android/exception/APIConnectionException;,
            Lcom/stripe/android/exception/APIException;,
            Lcom/stripe/android/exception/AuthenticationException;,
            Lcom/stripe/android/exception/CardException;
        }
    .end annotation

    .line 551
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "shipping"

    .line 552
    invoke-virtual {p4}, Lcom/stripe/android/model/ShippingInformation;->toMap()Ljava/util/Map;

    move-result-object p4

    invoke-interface {v0, v1, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p0, :cond_0

    .line 556
    invoke-static {p2}, Lcom/stripe/android/RequestOptions;->builder(Ljava/lang/String;)Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;

    move-result-object p4

    const-string v1, "2017-06-05"

    .line 557
    invoke-virtual {p4, v1}, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->setApiVersion(Ljava/lang/String;)Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;

    move-result-object p4

    .line 558
    invoke-virtual {p4}, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->build()Lcom/stripe/android/RequestOptions;

    move-result-object p4

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v6, "set_shipping_info"

    move-object v1, p0

    move-object v2, p3

    move-object v5, p2

    .line 560
    invoke-static/range {v1 .. v6}, Lcom/stripe/android/LoggingUtils;->getEventLoggingParams(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p0

    .line 568
    invoke-static {p0, p4, p6}, Lcom/stripe/android/StripeApiHandler;->logApiCall(Ljava/util/Map;Lcom/stripe/android/RequestOptions;Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;)V

    :cond_0
    const-string p0, "POST"

    .line 573
    invoke-static {p1}, Lcom/stripe/android/StripeApiHandler;->getRetrieveCustomerUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 575
    invoke-static {p5}, Lcom/stripe/android/RequestOptions;->builder(Ljava/lang/String;)Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;

    move-result-object p2

    const-string p3, "2017-06-05"

    invoke-virtual {p2, p3}, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->setApiVersion(Ljava/lang/String;)Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->build()Lcom/stripe/android/RequestOptions;

    move-result-object p2

    .line 571
    invoke-static {p0, p1, v0, p2}, Lcom/stripe/android/StripeApiHandler;->getStripeResponse(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/RequestOptions;)Lcom/stripe/android/StripeResponse;

    move-result-object p0

    .line 577
    invoke-static {p0}, Lcom/stripe/android/StripeApiHandler;->convertErrorsToExceptionsAndThrowIfNecessary(Lcom/stripe/android/StripeResponse;)V

    .line 578
    invoke-virtual {p0}, Lcom/stripe/android/StripeResponse;->getResponseBody()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/stripe/android/model/Customer;->fromString(Ljava/lang/String;)Lcom/stripe/android/model/Customer;

    move-result-object p0

    return-object p0
.end method

.method static setDefaultCustomerSource(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;)Lcom/stripe/android/model/Customer;
    .locals 7
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;",
            ")",
            "Lcom/stripe/android/model/Customer;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/exception/InvalidRequestException;,
            Lcom/stripe/android/exception/APIConnectionException;,
            Lcom/stripe/android/exception/APIException;,
            Lcom/stripe/android/exception/AuthenticationException;,
            Lcom/stripe/android/exception/CardException;
        }
    .end annotation

    .line 506
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "default_source"

    .line 507
    invoke-interface {v0, v1, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p0, :cond_0

    .line 511
    invoke-static {p2}, Lcom/stripe/android/RequestOptions;->builder(Ljava/lang/String;)Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;

    move-result-object p4

    const-string v1, "2017-06-05"

    .line 512
    invoke-virtual {p4, v1}, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->setApiVersion(Ljava/lang/String;)Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;

    move-result-object p4

    .line 513
    invoke-virtual {p4}, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->build()Lcom/stripe/android/RequestOptions;

    move-result-object p4

    const/4 v4, 0x0

    const-string v6, "default_source"

    move-object v1, p0

    move-object v2, p3

    move-object v3, p5

    move-object v5, p2

    .line 515
    invoke-static/range {v1 .. v6}, Lcom/stripe/android/LoggingUtils;->getEventLoggingParams(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p0

    .line 523
    invoke-static {p0, p4, p7}, Lcom/stripe/android/StripeApiHandler;->logApiCall(Ljava/util/Map;Lcom/stripe/android/RequestOptions;Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;)V

    :cond_0
    const-string p0, "POST"

    .line 528
    invoke-static {p1}, Lcom/stripe/android/StripeApiHandler;->getRetrieveCustomerUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 530
    invoke-static {p6}, Lcom/stripe/android/RequestOptions;->builder(Ljava/lang/String;)Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;

    move-result-object p2

    const-string p3, "2017-06-05"

    invoke-virtual {p2, p3}, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->setApiVersion(Ljava/lang/String;)Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->build()Lcom/stripe/android/RequestOptions;

    move-result-object p2

    .line 526
    invoke-static {p0, p1, v0, p2}, Lcom/stripe/android/StripeApiHandler;->getStripeResponse(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/RequestOptions;)Lcom/stripe/android/StripeResponse;

    move-result-object p0

    .line 533
    invoke-static {p0}, Lcom/stripe/android/StripeApiHandler;->convertErrorsToExceptionsAndThrowIfNecessary(Lcom/stripe/android/StripeResponse;)V

    .line 534
    invoke-virtual {p0}, Lcom/stripe/android/StripeResponse;->getResponseBody()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/stripe/android/model/Customer;->fromString(Ljava/lang/String;)Lcom/stripe/android/model/Customer;

    move-result-object p0

    return-object p0
.end method

.method private static setTelemetryData(Landroid/content/Context;Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;)V
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 1239
    invoke-static {p0}, Lcom/stripe/android/TelemetryClientUtil;->createTelemetryMap(Landroid/content/Context;)Ljava/util/Map;

    move-result-object v0

    .line 1240
    invoke-static {v0}, Lcom/stripe/android/StripeNetworkUtils;->removeNullAndEmptyParams(Ljava/util/Map;)V

    if-eqz p1, :cond_0

    .line 1241
    invoke-interface {p1}, Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;->shouldLogTest()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    const-string v2, "json_data"

    .line 1246
    invoke-static {v1, v2}, Lcom/stripe/android/RequestOptions;->builder(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;

    move-result-object v1

    .line 1247
    invoke-static {p0}, Lcom/stripe/android/TelemetryClientUtil;->getHashedId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->setGuid(Ljava/lang/String;)Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;

    move-result-object p0

    .line 1248
    invoke-virtual {p0}, Lcom/stripe/android/RequestOptions$RequestOptionsBuilder;->build()Lcom/stripe/android/RequestOptions;

    move-result-object p0

    const-string v1, "https://m.stripe.com/4"

    const-string v2, "POST"

    .line 1249
    invoke-static {v0, v1, v2, p0, p1}, Lcom/stripe/android/StripeApiHandler;->fireAndForgetApiCall(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/RequestOptions;Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;)V

    return-void
.end method

.method private static urlEncode(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "UTF-8"

    .line 1271
    invoke-static {p0, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static urlEncodePair(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    const-string v0, "%s=%s"

    const/4 v1, 0x2

    .line 1262
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0}, Lcom/stripe/android/StripeApiHandler;->urlEncode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-static {p1}, Lcom/stripe/android/StripeApiHandler;->urlEncode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x1

    aput-object p0, v1, p1

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static urlNeedsHeaderData(Ljava/lang/String;)Z
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "https://api.stripe.com"

    .line 1253
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "https://q.stripe.com"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static urlNeedsPseudoCookie(Ljava/lang/String;)Z
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "https://m.stripe.com/4"

    .line 1257
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method
