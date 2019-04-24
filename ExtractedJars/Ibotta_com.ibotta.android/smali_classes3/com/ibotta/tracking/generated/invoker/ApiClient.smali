.class public Lcom/ibotta/tracking/generated/invoker/ApiClient;
.super Ljava/lang/Object;
.source "ApiClient.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private authentications:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/tracking/generated/invoker/auth/Authentication;",
            ">;"
        }
    .end annotation
.end field

.field private basePath:Ljava/lang/String;

.field private dateFormat:Ljava/text/DateFormat;

.field private dateLength:I

.field private datetimeFormat:Ljava/text/DateFormat;

.field private debugging:Z

.field private defaultHeaderMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private httpClient:Lcom/squareup/okhttp/OkHttpClient;

.field private json:Lcom/ibotta/tracking/generated/invoker/JSON;

.field private keyManagers:[Ljavax/net/ssl/KeyManager;

.field private lenientDatetimeFormat:Z

.field private loggingInterceptor:Lcom/squareup/okhttp/logging/HttpLoggingInterceptor;

.field private sslCaCert:Ljava/io/InputStream;

.field private tempFolderPath:Ljava/lang/String;

.field private verifyingSsl:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "https://api.ibops.net/tracking-server"

    .line 55
    iput-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->basePath:Ljava/lang/String;

    const/4 v0, 0x0

    .line 56
    iput-boolean v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->debugging:Z

    .line 57
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->defaultHeaderMap:Ljava/util/Map;

    const/4 v0, 0x0

    .line 58
    iput-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->tempFolderPath:Ljava/lang/String;

    .line 80
    new-instance v0, Lcom/squareup/okhttp/OkHttpClient;

    invoke-direct {v0}, Lcom/squareup/okhttp/OkHttpClient;-><init>()V

    iput-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->httpClient:Lcom/squareup/okhttp/OkHttpClient;

    .line 83
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->httpClient:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->interceptors()Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/ibotta/tracking/generated/invoker/GzipRequestInterceptor;

    invoke-direct {v1}, Lcom/ibotta/tracking/generated/invoker/GzipRequestInterceptor;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    .line 85
    iput-boolean v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->verifyingSsl:Z

    .line 87
    new-instance v0, Lcom/ibotta/tracking/generated/invoker/JSON;

    invoke-direct {v0}, Lcom/ibotta/tracking/generated/invoker/JSON;-><init>()V

    iput-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->json:Lcom/ibotta/tracking/generated/invoker/JSON;

    const-string v0, "OpenAPI-Generator/1.0.0/java"

    .line 90
    invoke-virtual {p0, v0}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->setUserAgent(Ljava/lang/String;)Lcom/ibotta/tracking/generated/invoker/ApiClient;

    .line 93
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->authentications:Ljava/util/Map;

    .line 95
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->authentications:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->authentications:Ljava/util/Map;

    return-void
.end method

.method private applySslSettings()V
    .locals 7

    .line 1152
    :try_start_0
    iget-boolean v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->verifyingSsl:Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    .line 1153
    new-instance v0, Lcom/ibotta/tracking/generated/invoker/ApiClient$2;

    invoke-direct {v0, p0}, Lcom/ibotta/tracking/generated/invoker/ApiClient$2;-><init>(Lcom/ibotta/tracking/generated/invoker/ApiClient;)V

    const-string v3, "TLS"

    .line 1161
    invoke-static {v3}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    const/4 v3, 0x1

    .line 1162
    new-array v3, v3, [Ljavax/net/ssl/TrustManager;

    aput-object v0, v3, v1

    .line 1163
    new-instance v0, Lcom/ibotta/tracking/generated/invoker/ApiClient$3;

    invoke-direct {v0, p0}, Lcom/ibotta/tracking/generated/invoker/ApiClient$3;-><init>(Lcom/ibotta/tracking/generated/invoker/ApiClient;)V

    move-object v1, v0

    move-object v0, v3

    goto :goto_1

    .line 1167
    :cond_0
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->sslCaCert:Ljava/io/InputStream;

    if-eqz v0, :cond_3

    const-string v0, "X.509"

    .line 1169
    invoke-static {v0}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v0

    .line 1170
    iget-object v3, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->sslCaCert:Ljava/io/InputStream;

    invoke-virtual {v0, v3}, Ljava/security/cert/CertificateFactory;->generateCertificates(Ljava/io/InputStream;)Ljava/util/Collection;

    move-result-object v0

    .line 1171
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    .line 1174
    invoke-direct {p0, v2}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->newEmptyKeyStore([C)Ljava/security/KeyStore;

    move-result-object v3

    .line 1176
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/security/cert/Certificate;

    .line 1177
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "ca"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v6, v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1178
    invoke-virtual {v3, v1, v4}, Ljava/security/KeyStore;->setCertificateEntry(Ljava/lang/String;Ljava/security/cert/Certificate;)V

    move v1, v6

    goto :goto_0

    .line 1180
    :cond_1
    invoke-static {}, Ljavax/net/ssl/TrustManagerFactory;->getDefaultAlgorithm()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljavax/net/ssl/TrustManagerFactory;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;

    move-result-object v0

    .line 1181
    invoke-virtual {v0, v3}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V

    .line 1182
    invoke-virtual {v0}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;

    move-result-object v0

    move-object v1, v2

    goto :goto_1

    .line 1172
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "expected non-empty set of trusted certificates"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    move-object v0, v2

    move-object v1, v0

    .line 1185
    :goto_1
    iget-object v3, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->keyManagers:[Ljavax/net/ssl/KeyManager;

    if-nez v3, :cond_5

    if-eqz v0, :cond_4

    goto :goto_2

    .line 1190
    :cond_4
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->httpClient:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0, v2}, Lcom/squareup/okhttp/OkHttpClient;->setSslSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)Lcom/squareup/okhttp/OkHttpClient;

    goto :goto_3

    :cond_5
    :goto_2
    const-string v2, "TLS"

    .line 1186
    invoke-static {v2}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v2

    .line 1187
    iget-object v3, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->keyManagers:[Ljavax/net/ssl/KeyManager;

    new-instance v4, Ljava/security/SecureRandom;

    invoke-direct {v4}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v2, v3, v0, v4}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 1188
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->httpClient:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v2}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/squareup/okhttp/OkHttpClient;->setSslSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)Lcom/squareup/okhttp/OkHttpClient;

    .line 1192
    :goto_3
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->httpClient:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/OkHttpClient;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)Lcom/squareup/okhttp/OkHttpClient;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 1194
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private newEmptyKeyStore([C)Ljava/security/KeyStore;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1200
    :try_start_0
    invoke-static {}, Ljava/security/KeyStore;->getDefaultType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v0

    const/4 v1, 0x0

    .line 1201
    invoke-virtual {v0, v1, p1}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    .line 1204
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method


# virtual methods
.method public addDefaultHeader(Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/tracking/generated/invoker/ApiClient;
    .locals 1

    .line 362
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->defaultHeaderMap:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public buildCall(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Object;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody$ProgressRequestListener;)Lcom/squareup/okhttp/Call;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ibotta/tracking/generated/invoker/Pair;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/tracking/generated/invoker/Pair;",
            ">;",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;[",
            "Ljava/lang/String;",
            "Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody$ProgressRequestListener;",
            ")",
            "Lcom/squareup/okhttp/Call;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/tracking/generated/invoker/ApiException;
        }
    .end annotation

    .line 947
    invoke-virtual/range {p0 .. p9}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->buildRequest(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Object;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody$ProgressRequestListener;)Lcom/squareup/okhttp/Request;

    move-result-object p1

    .line 949
    iget-object p2, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->httpClient:Lcom/squareup/okhttp/OkHttpClient;

    instance-of p3, p2, Lcom/squareup/okhttp/OkHttpClient;

    if-nez p3, :cond_0

    invoke-virtual {p2, p1}, Lcom/squareup/okhttp/OkHttpClient;->newCall(Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/Call;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast p2, Lcom/squareup/okhttp/OkHttpClient;

    invoke-static {p2, p1}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->newCall(Lcom/squareup/okhttp/OkHttpClient;Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/Call;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public buildRequest(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Object;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody$ProgressRequestListener;)Lcom/squareup/okhttp/Request;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ibotta/tracking/generated/invoker/Pair;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/tracking/generated/invoker/Pair;",
            ">;",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;[",
            "Ljava/lang/String;",
            "Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody$ProgressRequestListener;",
            ")",
            "Lcom/squareup/okhttp/Request;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/tracking/generated/invoker/ApiException;
        }
    .end annotation

    .line 968
    invoke-virtual {p0, p8, p3, p6}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->updateParamsForAuth([Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V

    .line 970
    invoke-virtual {p0, p1, p3, p4}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->buildUrl(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/lang/String;

    move-result-object p1

    .line 971
    new-instance p3, Lcom/squareup/okhttp/Request$Builder;

    invoke-direct {p3}, Lcom/squareup/okhttp/Request$Builder;-><init>()V

    invoke-virtual {p3, p1}, Lcom/squareup/okhttp/Request$Builder;->url(Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object p1

    .line 972
    invoke-virtual {p0, p6, p1}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->processHeaderParams(Ljava/util/Map;Lcom/squareup/okhttp/Request$Builder;)V

    const-string p3, "Content-Type"

    .line 974
    invoke-interface {p6, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    if-nez p3, :cond_0

    const-string p3, "application/json"

    .line 981
    :cond_0
    invoke-static {p2}, Lcom/squareup/okhttp/internal/http/HttpMethod;->permitsRequestBody(Ljava/lang/String;)Z

    move-result p4

    const/4 p6, 0x0

    if-nez p4, :cond_1

    goto :goto_0

    :cond_1
    const-string p4, "application/x-www-form-urlencoded"

    .line 983
    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_2

    .line 984
    invoke-virtual {p0, p7}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->buildRequestBodyFormEncoding(Ljava/util/Map;)Lcom/squareup/okhttp/RequestBody;

    move-result-object p6

    goto :goto_0

    :cond_2
    const-string p4, "multipart/form-data"

    .line 985
    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_3

    .line 986
    invoke-virtual {p0, p7}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->buildRequestBodyMultipart(Ljava/util/Map;)Lcom/squareup/okhttp/RequestBody;

    move-result-object p6

    goto :goto_0

    :cond_3
    if-nez p5, :cond_5

    const-string p4, "DELETE"

    .line 988
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_4

    goto :goto_0

    .line 993
    :cond_4
    invoke-static {p3}, Lcom/squareup/okhttp/MediaType;->parse(Ljava/lang/String;)Lcom/squareup/okhttp/MediaType;

    move-result-object p3

    const-string p4, ""

    invoke-static {p3, p4}, Lcom/squareup/okhttp/RequestBody;->create(Lcom/squareup/okhttp/MediaType;Ljava/lang/String;)Lcom/squareup/okhttp/RequestBody;

    move-result-object p6

    goto :goto_0

    .line 996
    :cond_5
    invoke-virtual {p0, p5, p3}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->serialize(Ljava/lang/Object;Ljava/lang/String;)Lcom/squareup/okhttp/RequestBody;

    move-result-object p6

    :goto_0
    if-eqz p9, :cond_7

    if-eqz p6, :cond_7

    .line 1002
    new-instance p3, Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody;

    invoke-direct {p3, p6, p9}, Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody;-><init>(Lcom/squareup/okhttp/RequestBody;Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody$ProgressRequestListener;)V

    .line 1003
    invoke-virtual {p1, p2, p3}, Lcom/squareup/okhttp/Request$Builder;->method(Ljava/lang/String;Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object p1

    instance-of p2, p1, Lcom/squareup/okhttp/Request$Builder;

    if-nez p2, :cond_6

    invoke-virtual {p1}, Lcom/squareup/okhttp/Request$Builder;->build()Lcom/squareup/okhttp/Request;

    move-result-object p1

    goto :goto_1

    :cond_6
    check-cast p1, Lcom/squareup/okhttp/Request$Builder;

    invoke-static {p1}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->build(Lcom/squareup/okhttp/Request$Builder;)Lcom/squareup/okhttp/Request;

    move-result-object p1

    goto :goto_1

    .line 1005
    :cond_7
    invoke-virtual {p1, p2, p6}, Lcom/squareup/okhttp/Request$Builder;->method(Ljava/lang/String;Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object p1

    instance-of p2, p1, Lcom/squareup/okhttp/Request$Builder;

    if-nez p2, :cond_8

    invoke-virtual {p1}, Lcom/squareup/okhttp/Request$Builder;->build()Lcom/squareup/okhttp/Request;

    move-result-object p1

    goto :goto_1

    :cond_8
    check-cast p1, Lcom/squareup/okhttp/Request$Builder;

    invoke-static {p1}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->build(Lcom/squareup/okhttp/Request$Builder;)Lcom/squareup/okhttp/Request;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public buildRequestBodyFormEncoding(Ljava/util/Map;)Lcom/squareup/okhttp/RequestBody;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/squareup/okhttp/RequestBody;"
        }
    .end annotation

    .line 1099
    new-instance v0, Lcom/squareup/okhttp/FormEncodingBuilder;

    invoke-direct {v0}, Lcom/squareup/okhttp/FormEncodingBuilder;-><init>()V

    .line 1100
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 1101
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->parameterToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lcom/squareup/okhttp/FormEncodingBuilder;->add(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/FormEncodingBuilder;

    goto :goto_0

    .line 1103
    :cond_0
    invoke-virtual {v0}, Lcom/squareup/okhttp/FormEncodingBuilder;->build()Lcom/squareup/okhttp/RequestBody;

    move-result-object p1

    return-object p1
.end method

.method public buildRequestBodyMultipart(Ljava/util/Map;)Lcom/squareup/okhttp/RequestBody;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/squareup/okhttp/RequestBody;"
        }
    .end annotation

    .line 1114
    new-instance v0, Lcom/squareup/okhttp/MultipartBuilder;

    invoke-direct {v0}, Lcom/squareup/okhttp/MultipartBuilder;-><init>()V

    sget-object v1, Lcom/squareup/okhttp/MultipartBuilder;->FORM:Lcom/squareup/okhttp/MediaType;

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/MultipartBuilder;->type(Lcom/squareup/okhttp/MediaType;)Lcom/squareup/okhttp/MultipartBuilder;

    move-result-object v0

    .line 1115
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 1116
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Ljava/io/File;

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-eqz v2, :cond_0

    .line 1117
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    .line 1118
    new-array v5, v5, [Ljava/lang/String;

    const-string v6, "Content-Disposition"

    aput-object v6, v5, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "form-data; name=\""

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\"; filename=\""

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\""

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v5, v3

    invoke-static {v5}, Lcom/squareup/okhttp/Headers;->of([Ljava/lang/String;)Lcom/squareup/okhttp/Headers;

    move-result-object v1

    .line 1119
    invoke-virtual {p0, v2}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->guessContentTypeFromFile(Ljava/io/File;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/squareup/okhttp/MediaType;->parse(Ljava/lang/String;)Lcom/squareup/okhttp/MediaType;

    move-result-object v3

    .line 1120
    invoke-static {v3, v2}, Lcom/squareup/okhttp/RequestBody;->create(Lcom/squareup/okhttp/MediaType;Ljava/io/File;)Lcom/squareup/okhttp/RequestBody;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/squareup/okhttp/MultipartBuilder;->addPart(Lcom/squareup/okhttp/Headers;Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/MultipartBuilder;

    goto :goto_0

    .line 1122
    :cond_0
    new-array v2, v5, [Ljava/lang/String;

    const-string v5, "Content-Disposition"

    aput-object v5, v2, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "form-data; name=\""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v2}, Lcom/squareup/okhttp/Headers;->of([Ljava/lang/String;)Lcom/squareup/okhttp/Headers;

    move-result-object v2

    const/4 v3, 0x0

    .line 1123
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->parameterToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lcom/squareup/okhttp/RequestBody;->create(Lcom/squareup/okhttp/MediaType;Ljava/lang/String;)Lcom/squareup/okhttp/RequestBody;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lcom/squareup/okhttp/MultipartBuilder;->addPart(Lcom/squareup/okhttp/Headers;Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/MultipartBuilder;

    goto/16 :goto_0

    .line 1126
    :cond_1
    invoke-virtual {v0}, Lcom/squareup/okhttp/MultipartBuilder;->build()Lcom/squareup/okhttp/RequestBody;

    move-result-object p1

    return-object p1
.end method

.method public buildUrl(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ibotta/tracking/generated/invoker/Pair;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/tracking/generated/invoker/Pair;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1020
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1021
    iget-object v1, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->basePath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    if-eqz p2, :cond_3

    .line 1023
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "?"

    .line 1025
    invoke-virtual {p1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "&"

    goto :goto_0

    :cond_0
    const-string p1, "?"

    .line 1026
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/tracking/generated/invoker/Pair;

    .line 1027
    invoke-virtual {v2}, Lcom/ibotta/tracking/generated/invoker/Pair;->getValue()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    if-eqz p1, :cond_2

    .line 1029
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object p1, v1

    goto :goto_2

    :cond_2
    const-string v3, "&"

    .line 1032
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1034
    :goto_2
    invoke-virtual {v2}, Lcom/ibotta/tracking/generated/invoker/Pair;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->parameterToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 1035
    invoke-virtual {v2}, Lcom/ibotta/tracking/generated/invoker/Pair;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->escapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->escapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_3
    if-eqz p3, :cond_7

    .line 1040
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_7

    .line 1041
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "?"

    invoke-virtual {p1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "&"

    goto :goto_3

    :cond_4
    const-string p1, "?"

    .line 1042
    :goto_3
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_5
    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ibotta/tracking/generated/invoker/Pair;

    .line 1043
    invoke-virtual {p3}, Lcom/ibotta/tracking/generated/invoker/Pair;->getValue()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5

    if-eqz p1, :cond_6

    .line 1045
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object p1, v1

    goto :goto_5

    :cond_6
    const-string v2, "&"

    .line 1048
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1050
    :goto_5
    invoke-virtual {p3}, Lcom/ibotta/tracking/generated/invoker/Pair;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->parameterToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 1052
    invoke-virtual {p3}, Lcom/ibotta/tracking/generated/invoker/Pair;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p3}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->escapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "="

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_4

    .line 1057
    :cond_7
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public deserialize(Lcom/squareup/okhttp/Response;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/squareup/okhttp/Response;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/tracking/generated/invoker/ApiException;
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_c

    if-nez p2, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v1, "byte[]"

    .line 681
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 684
    :try_start_0
    instance-of p2, p1, Lcom/squareup/okhttp/Response;

    if-nez p2, :cond_1

    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->body()Lcom/squareup/okhttp/ResponseBody;

    move-result-object p1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/squareup/okhttp/Response;

    invoke-static {p1}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->body(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/ResponseBody;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Lcom/squareup/okhttp/ResponseBody;->bytes()[B

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 686
    new-instance p2, Lcom/ibotta/tracking/generated/invoker/ApiException;

    invoke-direct {p2, p1}, Lcom/ibotta/tracking/generated/invoker/ApiException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 688
    :cond_2
    const-class v1, Ljava/io/File;

    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 690
    invoke-virtual {p0, p1}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->downloadFileFromResponse(Lcom/squareup/okhttp/Response;)Ljava/io/File;

    move-result-object p1

    return-object p1

    .line 695
    :cond_3
    :try_start_1
    instance-of v1, p1, Lcom/squareup/okhttp/Response;

    if-nez v1, :cond_4

    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->body()Lcom/squareup/okhttp/ResponseBody;

    move-result-object v1

    goto :goto_1

    :cond_4
    move-object v1, p1

    check-cast v1, Lcom/squareup/okhttp/Response;

    invoke-static {v1}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->body(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/ResponseBody;

    move-result-object v1

    :goto_1
    if-eqz v1, :cond_6

    .line 696
    instance-of v1, p1, Lcom/squareup/okhttp/Response;

    if-nez v1, :cond_5

    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->body()Lcom/squareup/okhttp/ResponseBody;

    move-result-object v1

    goto :goto_2

    :cond_5
    move-object v1, p1

    check-cast v1, Lcom/squareup/okhttp/Response;

    invoke-static {v1}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->body(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/ResponseBody;

    move-result-object v1

    :goto_2
    invoke-virtual {v1}, Lcom/squareup/okhttp/ResponseBody;->string()Ljava/lang/String;

    move-result-object v1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :cond_6
    move-object v1, v0

    :goto_3
    if-eqz v1, :cond_b

    const-string v2, ""

    .line 703
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_4

    .line 707
    :cond_7
    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->headers()Lcom/squareup/okhttp/Headers;

    move-result-object v0

    const-string v2, "Content-Type"

    invoke-virtual {v0, v2}, Lcom/squareup/okhttp/Headers;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_8

    const-string v0, "application/json"

    .line 712
    :cond_8
    invoke-virtual {p0, v0}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->isJsonMime(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 713
    iget-object p1, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->json:Lcom/ibotta/tracking/generated/invoker/JSON;

    invoke-virtual {p1, v1, p2}, Lcom/ibotta/tracking/generated/invoker/JSON;->deserialize(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 714
    :cond_9
    const-class v2, Ljava/lang/String;

    invoke-virtual {p2, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    return-object v1

    .line 718
    :cond_a
    new-instance v2, Lcom/ibotta/tracking/generated/invoker/ApiException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Content type \""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\" is not supported for type: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 720
    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->code()I

    move-result v0

    .line 721
    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->headers()Lcom/squareup/okhttp/Headers;

    move-result-object p1

    invoke-virtual {p1}, Lcom/squareup/okhttp/Headers;->toMultimap()Ljava/util/Map;

    move-result-object p1

    invoke-direct {v2, p2, v0, p1, v1}, Lcom/ibotta/tracking/generated/invoker/ApiException;-><init>(Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;)V

    throw v2

    :cond_b
    :goto_4
    return-object v0

    :catch_1
    move-exception p1

    .line 700
    new-instance p2, Lcom/ibotta/tracking/generated/invoker/ApiException;

    invoke-direct {p2, p1}, Lcom/ibotta/tracking/generated/invoker/ApiException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_c
    :goto_5
    return-object v0
.end method

.method public downloadFileFromResponse(Lcom/squareup/okhttp/Response;)Ljava/io/File;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/tracking/generated/invoker/ApiException;
        }
    .end annotation

    .line 764
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->prepareDownloadFile(Lcom/squareup/okhttp/Response;)Ljava/io/File;

    move-result-object v0

    .line 765
    invoke-static {v0}, Lokio/Okio;->sink(Ljava/io/File;)Lokio/Sink;

    move-result-object v1

    invoke-static {v1}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    move-result-object v1

    .line 766
    instance-of v2, p1, Lcom/squareup/okhttp/Response;

    if-nez v2, :cond_0

    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->body()Lcom/squareup/okhttp/ResponseBody;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast p1, Lcom/squareup/okhttp/Response;

    invoke-static {p1}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->body(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/ResponseBody;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Lcom/squareup/okhttp/ResponseBody;->source()Lokio/BufferedSource;

    move-result-object p1

    invoke-interface {v1, p1}, Lokio/BufferedSink;->writeAll(Lokio/Source;)J

    .line 767
    invoke-interface {v1}, Lokio/BufferedSink;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    .line 770
    new-instance v0, Lcom/ibotta/tracking/generated/invoker/ApiException;

    invoke-direct {v0, p1}, Lcom/ibotta/tracking/generated/invoker/ApiException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public escapeString(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    :try_start_0
    const-string v0, "utf8"

    .line 658
    invoke-static {p1, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\+"

    const-string v2, "%20"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    return-object p1
.end method

.method public execute(Lcom/squareup/okhttp/Call;)Lcom/ibotta/tracking/generated/invoker/ApiResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/squareup/okhttp/Call;",
            ")",
            "Lcom/ibotta/tracking/generated/invoker/ApiResponse<",
            "TT;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/tracking/generated/invoker/ApiException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 826
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->execute(Lcom/squareup/okhttp/Call;Ljava/lang/reflect/Type;)Lcom/ibotta/tracking/generated/invoker/ApiResponse;

    move-result-object p1

    return-object p1
.end method

.method public execute(Lcom/squareup/okhttp/Call;Ljava/lang/reflect/Type;)Lcom/ibotta/tracking/generated/invoker/ApiResponse;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/squareup/okhttp/Call;",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lcom/ibotta/tracking/generated/invoker/ApiResponse<",
            "TT;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/tracking/generated/invoker/ApiException;
        }
    .end annotation

    .line 842
    :try_start_0
    invoke-virtual {p1}, Lcom/squareup/okhttp/Call;->execute()Lcom/squareup/okhttp/Response;

    move-result-object p1

    .line 843
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->handleResponse(Lcom/squareup/okhttp/Response;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p2

    .line 844
    new-instance v0, Lcom/ibotta/tracking/generated/invoker/ApiResponse;

    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->code()I

    move-result v1

    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->headers()Lcom/squareup/okhttp/Headers;

    move-result-object p1

    invoke-virtual {p1}, Lcom/squareup/okhttp/Headers;->toMultimap()Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, v1, p1, p2}, Lcom/ibotta/tracking/generated/invoker/ApiResponse;-><init>(ILjava/util/Map;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    .line 846
    new-instance p2, Lcom/ibotta/tracking/generated/invoker/ApiException;

    invoke-direct {p2, p1}, Lcom/ibotta/tracking/generated/invoker/ApiException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public executeAsync(Lcom/squareup/okhttp/Call;Lcom/ibotta/tracking/generated/invoker/ApiCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/squareup/okhttp/Call;",
            "Lcom/ibotta/tracking/generated/invoker/ApiCallback<",
            "TT;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 858
    invoke-virtual {p0, p1, v0, p2}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->executeAsync(Lcom/squareup/okhttp/Call;Ljava/lang/reflect/Type;Lcom/ibotta/tracking/generated/invoker/ApiCallback;)V

    return-void
.end method

.method public executeAsync(Lcom/squareup/okhttp/Call;Ljava/lang/reflect/Type;Lcom/ibotta/tracking/generated/invoker/ApiCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/squareup/okhttp/Call;",
            "Ljava/lang/reflect/Type;",
            "Lcom/ibotta/tracking/generated/invoker/ApiCallback<",
            "TT;>;)V"
        }
    .end annotation

    .line 872
    new-instance v0, Lcom/ibotta/tracking/generated/invoker/ApiClient$1;

    invoke-direct {v0, p0, p3, p2}, Lcom/ibotta/tracking/generated/invoker/ApiClient$1;-><init>(Lcom/ibotta/tracking/generated/invoker/ApiClient;Lcom/ibotta/tracking/generated/invoker/ApiCallback;Ljava/lang/reflect/Type;)V

    invoke-virtual {p1, v0}, Lcom/squareup/okhttp/Call;->enqueue(Lcom/squareup/okhttp/Callback;)V

    return-void
.end method

.method public getAuthentication(Ljava/lang/String;)Lcom/ibotta/tracking/generated/invoker/auth/Authentication;
    .locals 1

    .line 265
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->authentications:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/tracking/generated/invoker/auth/Authentication;

    return-object p1
.end method

.method public getAuthentications()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/tracking/generated/invoker/auth/Authentication;",
            ">;"
        }
    .end annotation

    .line 255
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->authentications:Ljava/util/Map;

    return-object v0
.end method

.method public getBasePath()Ljava/lang/String;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->basePath:Ljava/lang/String;

    return-object v0
.end method

.method public getConnectTimeout()I
    .locals 1

    .line 425
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->httpClient:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->getConnectTimeout()I

    move-result v0

    return v0
.end method

.method public getDateFormat()Ljava/text/DateFormat;
    .locals 1

    .line 221
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->dateFormat:Ljava/text/DateFormat;

    return-object v0
.end method

.method public getHttpClient()Lcom/squareup/okhttp/OkHttpClient;
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->httpClient:Lcom/squareup/okhttp/OkHttpClient;

    return-object v0
.end method

.method public getJSON()Lcom/ibotta/tracking/generated/invoker/JSON;
    .locals 1

    .line 144
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->json:Lcom/ibotta/tracking/generated/invoker/JSON;

    return-object v0
.end method

.method public getKeyManagers()[Ljavax/net/ssl/KeyManager;
    .locals 1

    .line 204
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->keyManagers:[Ljavax/net/ssl/KeyManager;

    return-object v0
.end method

.method public getReadTimeout()I
    .locals 1

    .line 447
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->httpClient:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->getReadTimeout()I

    move-result v0

    return v0
.end method

.method public getSslCaCert()Ljava/io/InputStream;
    .locals 1

    .line 187
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->sslCaCert:Ljava/io/InputStream;

    return-object v0
.end method

.method public getTempFolderPath()Ljava/lang/String;
    .locals 1

    .line 405
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->tempFolderPath:Ljava/lang/String;

    return-object v0
.end method

.method public getWriteTimeout()I
    .locals 1

    .line 469
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->httpClient:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->getWriteTimeout()I

    move-result v0

    return v0
.end method

.method public guessContentTypeFromFile(Ljava/io/File;)Ljava/lang/String;
    .locals 0

    .line 1136
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/net/URLConnection;->guessContentTypeFromName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "application/octet-stream"

    return-object p1

    :cond_0
    return-object p1
.end method

.method public handleResponse(Lcom/squareup/okhttp/Response;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/squareup/okhttp/Response;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/tracking/generated/invoker/ApiException;
        }
    .end annotation

    .line 903
    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->isSuccessful()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    if-eqz p2, :cond_1

    .line 904
    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->code()I

    move-result v0

    const/16 v2, 0xcc

    if-ne v0, v2, :cond_0

    goto :goto_0

    .line 916
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->deserialize(Lcom/squareup/okhttp/Response;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 907
    :cond_1
    :goto_0
    instance-of p2, p1, Lcom/squareup/okhttp/Response;

    if-nez p2, :cond_2

    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->body()Lcom/squareup/okhttp/ResponseBody;

    move-result-object p2

    goto :goto_1

    :cond_2
    move-object p2, p1

    check-cast p2, Lcom/squareup/okhttp/Response;

    invoke-static {p2}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->body(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/ResponseBody;

    move-result-object p2

    :goto_1
    if-eqz p2, :cond_4

    .line 909
    :try_start_0
    instance-of p2, p1, Lcom/squareup/okhttp/Response;

    if-nez p2, :cond_3

    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->body()Lcom/squareup/okhttp/ResponseBody;

    move-result-object p2

    goto :goto_2

    :cond_3
    move-object p2, p1

    check-cast p2, Lcom/squareup/okhttp/Response;

    invoke-static {p2}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->body(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/ResponseBody;

    move-result-object p2

    :goto_2
    invoke-virtual {p2}, Lcom/squareup/okhttp/ResponseBody;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p2

    .line 911
    new-instance v0, Lcom/ibotta/tracking/generated/invoker/ApiException;

    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->message()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->code()I

    move-result v2

    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->headers()Lcom/squareup/okhttp/Headers;

    move-result-object p1

    invoke-virtual {p1}, Lcom/squareup/okhttp/Headers;->toMultimap()Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, v1, p2, v2, p1}, Lcom/ibotta/tracking/generated/invoker/ApiException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILjava/util/Map;)V

    throw v0

    :cond_4
    :goto_3
    return-object v1

    .line 920
    :cond_5
    instance-of p2, p1, Lcom/squareup/okhttp/Response;

    if-nez p2, :cond_6

    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->body()Lcom/squareup/okhttp/ResponseBody;

    move-result-object p2

    goto :goto_4

    :cond_6
    move-object p2, p1

    check-cast p2, Lcom/squareup/okhttp/Response;

    invoke-static {p2}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->body(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/ResponseBody;

    move-result-object p2

    :goto_4
    if-eqz p2, :cond_8

    .line 922
    :try_start_1
    instance-of p2, p1, Lcom/squareup/okhttp/Response;

    if-nez p2, :cond_7

    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->body()Lcom/squareup/okhttp/ResponseBody;

    move-result-object p2

    goto :goto_5

    :cond_7
    move-object p2, p1

    check-cast p2, Lcom/squareup/okhttp/Response;

    invoke-static {p2}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->body(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/ResponseBody;

    move-result-object p2

    :goto_5
    invoke-virtual {p2}, Lcom/squareup/okhttp/ResponseBody;->string()Ljava/lang/String;

    move-result-object v1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_6

    :catch_1
    move-exception p2

    .line 924
    new-instance v0, Lcom/ibotta/tracking/generated/invoker/ApiException;

    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->message()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->code()I

    move-result v2

    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->headers()Lcom/squareup/okhttp/Headers;

    move-result-object p1

    invoke-virtual {p1}, Lcom/squareup/okhttp/Headers;->toMultimap()Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, v1, p2, v2, p1}, Lcom/ibotta/tracking/generated/invoker/ApiException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILjava/util/Map;)V

    throw v0

    .line 927
    :cond_8
    :goto_6
    new-instance p2, Lcom/ibotta/tracking/generated/invoker/ApiException;

    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->message()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->code()I

    move-result v2

    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->headers()Lcom/squareup/okhttp/Headers;

    move-result-object p1

    invoke-virtual {p1}, Lcom/squareup/okhttp/Headers;->toMultimap()Ljava/util/Map;

    move-result-object p1

    invoke-direct {p2, v0, v2, p1, v1}, Lcom/ibotta/tracking/generated/invoker/ApiException;-><init>(Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;)V

    throw p2
.end method

.method public isDebugging()Z
    .locals 1

    .line 372
    iget-boolean v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->debugging:Z

    return v0
.end method

.method public isJsonMime(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "(?i)^(application/json|[^;/ \t]+/[^;/ \t]+[+]json)[ \t]*(;.*)?$"

    if-eqz p1, :cond_1

    .line 605
    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "*/*"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isVerifyingSsl()Z
    .locals 1

    .line 164
    iget-boolean v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->verifyingSsl:Z

    return v0
.end method

.method public parameterToPair(Ljava/lang/String;Ljava/lang/Object;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/tracking/generated/invoker/Pair;",
            ">;"
        }
    .end annotation

    .line 522
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_1

    .line 525
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    if-eqz p2, :cond_1

    instance-of v1, p2, Ljava/util/Collection;

    if-eqz v1, :cond_0

    goto :goto_0

    .line 527
    :cond_0
    new-instance v1, Lcom/ibotta/tracking/generated/invoker/Pair;

    invoke-virtual {p0, p2}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->parameterToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v1, p1, p2}, Lcom/ibotta/tracking/generated/invoker/Pair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public parameterToPairs(Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Collection;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/tracking/generated/invoker/Pair;",
            ">;"
        }
    .end annotation

    .line 542
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p2, :cond_7

    .line 545
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_7

    if-eqz p3, :cond_7

    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v1, "multi"

    .line 550
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 551
    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    .line 552
    new-instance v1, Lcom/ibotta/tracking/generated/invoker/Pair;

    invoke-virtual {p0, p3}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->parameterToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p3}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->escapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-direct {v1, p2, p3}, Lcom/ibotta/tracking/generated/invoker/Pair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    const-string v1, ","

    const-string v2, "ssv"

    .line 562
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const-string p1, " "

    .line 563
    invoke-virtual {p0, p1}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->escapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_3
    const-string v2, "tsv"

    .line 564
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const-string p1, "\t"

    .line 565
    invoke-virtual {p0, p1}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->escapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_4
    const-string v2, "pipes"

    .line 566
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    const-string p1, "|"

    .line 567
    invoke-virtual {p0, p1}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->escapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 570
    :cond_5
    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 571
    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 572
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 573
    invoke-virtual {p0, v2}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->parameterToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->escapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 576
    :cond_6
    new-instance p3, Lcom/ibotta/tracking/generated/invoker/Pair;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p2, p1}, Lcom/ibotta/tracking/generated/invoker/Pair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0

    :cond_7
    :goto_3
    return-object v0
.end method

.method public parameterToString(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    if-nez p1, :cond_0

    const-string p1, ""

    return-object p1

    .line 494
    :cond_0
    instance-of v0, p1, Ljava/util/Date;

    if-nez v0, :cond_5

    instance-of v0, p1, Lorg/threeten/bp/OffsetDateTime;

    if-nez v0, :cond_5

    instance-of v0, p1, Lorg/threeten/bp/LocalDate;

    if-eqz v0, :cond_1

    goto :goto_1

    .line 498
    :cond_1
    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_4

    .line 499
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 500
    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 501
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-lez v2, :cond_2

    const-string v2, ","

    .line 502
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 504
    :cond_2
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 506
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 508
    :cond_4
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 496
    :cond_5
    :goto_1
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->json:Lcom/ibotta/tracking/generated/invoker/JSON;

    invoke-virtual {v0, p1}, Lcom/ibotta/tracking/generated/invoker/JSON;->serialize(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 497
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public prepareDownloadFile(Lcom/squareup/okhttp/Response;)Ljava/io/File;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "Content-Disposition"

    .line 783
    invoke-virtual {p1, v0}, Lcom/squareup/okhttp/Response;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string v1, ""

    .line 784
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "filename=[\'\"]?([^\'\"\\s]+)[\'\"]?"

    .line 786
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    .line 787
    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    .line 788
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    .line 789
    invoke-virtual {p1, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->sanitizeFilename(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-nez p1, :cond_1

    const-string p1, "download-"

    const-string v0, ""

    goto :goto_2

    :cond_1
    const-string v1, "."

    .line 799
    invoke-virtual {p1, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_2

    .line 801
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "-"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    .line 803
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "-"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 804
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    move-object v3, v0

    move-object v0, p1

    move-object p1, v3

    .line 807
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x3

    if-ge v1, v2, :cond_3

    const-string p1, "download-"

    .line 811
    :cond_3
    :goto_2
    iget-object v1, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->tempFolderPath:Ljava/lang/String;

    if-nez v1, :cond_4

    .line 812
    invoke-static {p1, v0}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    return-object p1

    .line 814
    :cond_4
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v0, v2}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method public processHeaderParams(Ljava/util/Map;Lcom/squareup/okhttp/Request$Builder;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/squareup/okhttp/Request$Builder;",
            ")V"
        }
    .end annotation

    .line 1067
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 1068
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->parameterToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v2, v1}, Lcom/squareup/okhttp/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    goto :goto_0

    .line 1070
    :cond_0
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->defaultHeaderMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 1071
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 1072
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->parameterToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v2, v1}, Lcom/squareup/okhttp/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    goto :goto_1

    :cond_2
    return-void
.end method

.method public sanitizeFilename(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, ".*[/\\\\]"

    const-string v1, ""

    .line 589
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public selectHeaderAccept([Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 618
    array-length v0, p1

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 621
    :cond_0
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget-object v2, p1, v1

    .line 622
    invoke-virtual {p0, v2}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->isJsonMime(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    return-object v2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const-string v0, ","

    .line 626
    invoke-static {p1, v0}, Lcom/ibotta/tracking/generated/invoker/StringUtil;->join([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public selectHeaderContentType([Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 639
    array-length v0, p1

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    aget-object v1, p1, v0

    const-string v2, "*/*"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 642
    :cond_0
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p1, v2

    .line 643
    invoke-virtual {p0, v3}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->isJsonMime(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 647
    :cond_2
    aget-object p1, p1, v0

    return-object p1

    :cond_3
    :goto_1
    const-string p1, "application/json"

    return-object p1
.end method

.method public serialize(Ljava/lang/Object;Ljava/lang/String;)Lcom/squareup/okhttp/RequestBody;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/tracking/generated/invoker/ApiException;
        }
    .end annotation

    .line 736
    instance-of v0, p1, [B

    if-eqz v0, :cond_0

    .line 738
    invoke-static {p2}, Lcom/squareup/okhttp/MediaType;->parse(Ljava/lang/String;)Lcom/squareup/okhttp/MediaType;

    move-result-object p2

    check-cast p1, [B

    invoke-static {p2, p1}, Lcom/squareup/okhttp/RequestBody;->create(Lcom/squareup/okhttp/MediaType;[B)Lcom/squareup/okhttp/RequestBody;

    move-result-object p1

    return-object p1

    .line 739
    :cond_0
    instance-of v0, p1, Ljava/io/File;

    if-eqz v0, :cond_1

    .line 741
    invoke-static {p2}, Lcom/squareup/okhttp/MediaType;->parse(Ljava/lang/String;)Lcom/squareup/okhttp/MediaType;

    move-result-object p2

    check-cast p1, Ljava/io/File;

    invoke-static {p2, p1}, Lcom/squareup/okhttp/RequestBody;->create(Lcom/squareup/okhttp/MediaType;Ljava/io/File;)Lcom/squareup/okhttp/RequestBody;

    move-result-object p1

    return-object p1

    .line 742
    :cond_1
    invoke-virtual {p0, p2}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->isJsonMime(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    if-eqz p1, :cond_2

    .line 745
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->json:Lcom/ibotta/tracking/generated/invoker/JSON;

    invoke-virtual {v0, p1}, Lcom/ibotta/tracking/generated/invoker/JSON;->serialize(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    .line 749
    :goto_0
    invoke-static {p2}, Lcom/squareup/okhttp/MediaType;->parse(Ljava/lang/String;)Lcom/squareup/okhttp/MediaType;

    move-result-object p2

    invoke-static {p2, p1}, Lcom/squareup/okhttp/RequestBody;->create(Lcom/squareup/okhttp/MediaType;Ljava/lang/String;)Lcom/squareup/okhttp/RequestBody;

    move-result-object p1

    return-object p1

    .line 751
    :cond_3
    new-instance p1, Lcom/ibotta/tracking/generated/invoker/ApiException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Content type \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\" is not supported"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/ibotta/tracking/generated/invoker/ApiException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setAccessToken(Ljava/lang/String;)V
    .locals 3

    .line 334
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->authentications:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/tracking/generated/invoker/auth/Authentication;

    .line 335
    instance-of v2, v1, Lcom/ibotta/tracking/generated/invoker/auth/OAuth;

    if-eqz v2, :cond_0

    .line 336
    check-cast v1, Lcom/ibotta/tracking/generated/invoker/auth/OAuth;

    invoke-virtual {v1, p1}, Lcom/ibotta/tracking/generated/invoker/auth/OAuth;->setAccessToken(Ljava/lang/String;)V

    return-void

    .line 340
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "No OAuth2 authentication configured!"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setApiKey(Ljava/lang/String;)V
    .locals 3

    .line 304
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->authentications:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/tracking/generated/invoker/auth/Authentication;

    .line 305
    instance-of v2, v1, Lcom/ibotta/tracking/generated/invoker/auth/ApiKeyAuth;

    if-eqz v2, :cond_0

    .line 306
    check-cast v1, Lcom/ibotta/tracking/generated/invoker/auth/ApiKeyAuth;

    invoke-virtual {v1, p1}, Lcom/ibotta/tracking/generated/invoker/auth/ApiKeyAuth;->setApiKey(Ljava/lang/String;)V

    return-void

    .line 310
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "No API key authentication configured!"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setApiKeyPrefix(Ljava/lang/String;)V
    .locals 3

    .line 319
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->authentications:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/tracking/generated/invoker/auth/Authentication;

    .line 320
    instance-of v2, v1, Lcom/ibotta/tracking/generated/invoker/auth/ApiKeyAuth;

    if-eqz v2, :cond_0

    .line 321
    check-cast v1, Lcom/ibotta/tracking/generated/invoker/auth/ApiKeyAuth;

    invoke-virtual {v1, p1}, Lcom/ibotta/tracking/generated/invoker/auth/ApiKeyAuth;->setApiKeyPrefix(Ljava/lang/String;)V

    return-void

    .line 325
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "No API key authentication configured!"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setBasePath(Ljava/lang/String;)Lcom/ibotta/tracking/generated/invoker/ApiClient;
    .locals 0

    .line 114
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->basePath:Ljava/lang/String;

    return-object p0
.end method

.method public setConnectTimeout(I)Lcom/ibotta/tracking/generated/invoker/ApiClient;
    .locals 3

    .line 437
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->httpClient:Lcom/squareup/okhttp/OkHttpClient;

    int-to-long v1, p1

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, p1}, Lcom/squareup/okhttp/OkHttpClient;->setConnectTimeout(JLjava/util/concurrent/TimeUnit;)V

    return-object p0
.end method

.method public setDateFormat(Ljava/text/DateFormat;)Lcom/ibotta/tracking/generated/invoker/ApiClient;
    .locals 1

    .line 225
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->json:Lcom/ibotta/tracking/generated/invoker/JSON;

    invoke-virtual {v0, p1}, Lcom/ibotta/tracking/generated/invoker/JSON;->setDateFormat(Ljava/text/DateFormat;)Lcom/ibotta/tracking/generated/invoker/JSON;

    return-object p0
.end method

.method public setDebugging(Z)Lcom/ibotta/tracking/generated/invoker/ApiClient;
    .locals 2

    .line 382
    iget-boolean v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->debugging:Z

    if-eq p1, v0, :cond_1

    if-eqz p1, :cond_0

    .line 384
    new-instance v0, Lcom/squareup/okhttp/logging/HttpLoggingInterceptor;

    invoke-direct {v0}, Lcom/squareup/okhttp/logging/HttpLoggingInterceptor;-><init>()V

    iput-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->loggingInterceptor:Lcom/squareup/okhttp/logging/HttpLoggingInterceptor;

    .line 385
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->loggingInterceptor:Lcom/squareup/okhttp/logging/HttpLoggingInterceptor;

    sget-object v1, Lcom/squareup/okhttp/logging/HttpLoggingInterceptor$Level;->BODY:Lcom/squareup/okhttp/logging/HttpLoggingInterceptor$Level;

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/logging/HttpLoggingInterceptor;->setLevel(Lcom/squareup/okhttp/logging/HttpLoggingInterceptor$Level;)Lcom/squareup/okhttp/logging/HttpLoggingInterceptor;

    .line 386
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->httpClient:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->interceptors()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->loggingInterceptor:Lcom/squareup/okhttp/logging/HttpLoggingInterceptor;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 388
    :cond_0
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->httpClient:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->interceptors()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->loggingInterceptor:Lcom/squareup/okhttp/logging/HttpLoggingInterceptor;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    .line 389
    iput-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->loggingInterceptor:Lcom/squareup/okhttp/logging/HttpLoggingInterceptor;

    .line 392
    :cond_1
    :goto_0
    iput-boolean p1, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->debugging:Z

    return-object p0
.end method

.method public setHttpClient(Lcom/squareup/okhttp/OkHttpClient;)Lcom/ibotta/tracking/generated/invoker/ApiClient;
    .locals 0

    .line 134
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->httpClient:Lcom/squareup/okhttp/OkHttpClient;

    return-object p0
.end method

.method public setJSON(Lcom/ibotta/tracking/generated/invoker/JSON;)Lcom/ibotta/tracking/generated/invoker/ApiClient;
    .locals 0

    .line 154
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->json:Lcom/ibotta/tracking/generated/invoker/JSON;

    return-object p0
.end method

.method public setKeyManagers([Ljavax/net/ssl/KeyManager;)Lcom/ibotta/tracking/generated/invoker/ApiClient;
    .locals 0

    .line 215
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->keyManagers:[Ljavax/net/ssl/KeyManager;

    .line 216
    invoke-direct {p0}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->applySslSettings()V

    return-object p0
.end method

.method public setLenientOnJson(Z)Lcom/ibotta/tracking/generated/invoker/ApiClient;
    .locals 1

    .line 245
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->json:Lcom/ibotta/tracking/generated/invoker/JSON;

    invoke-virtual {v0, p1}, Lcom/ibotta/tracking/generated/invoker/JSON;->setLenientOnJson(Z)Lcom/ibotta/tracking/generated/invoker/JSON;

    return-object p0
.end method

.method public setLocalDateFormat(Lorg/threeten/bp/format/DateTimeFormatter;)Lcom/ibotta/tracking/generated/invoker/ApiClient;
    .locals 1

    .line 240
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->json:Lcom/ibotta/tracking/generated/invoker/JSON;

    invoke-virtual {v0, p1}, Lcom/ibotta/tracking/generated/invoker/JSON;->setLocalDateFormat(Lorg/threeten/bp/format/DateTimeFormatter;)Lcom/ibotta/tracking/generated/invoker/JSON;

    return-object p0
.end method

.method public setOffsetDateTimeFormat(Lorg/threeten/bp/format/DateTimeFormatter;)Lcom/ibotta/tracking/generated/invoker/ApiClient;
    .locals 1

    .line 235
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->json:Lcom/ibotta/tracking/generated/invoker/JSON;

    invoke-virtual {v0, p1}, Lcom/ibotta/tracking/generated/invoker/JSON;->setOffsetDateTimeFormat(Lorg/threeten/bp/format/DateTimeFormatter;)Lcom/ibotta/tracking/generated/invoker/JSON;

    return-object p0
.end method

.method public setPassword(Ljava/lang/String;)V
    .locals 3

    .line 289
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->authentications:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/tracking/generated/invoker/auth/Authentication;

    .line 290
    instance-of v2, v1, Lcom/ibotta/tracking/generated/invoker/auth/HttpBasicAuth;

    if-eqz v2, :cond_0

    .line 291
    check-cast v1, Lcom/ibotta/tracking/generated/invoker/auth/HttpBasicAuth;

    invoke-virtual {v1, p1}, Lcom/ibotta/tracking/generated/invoker/auth/HttpBasicAuth;->setPassword(Ljava/lang/String;)V

    return-void

    .line 295
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "No HTTP basic authentication configured!"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setReadTimeout(I)Lcom/ibotta/tracking/generated/invoker/ApiClient;
    .locals 3

    .line 459
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->httpClient:Lcom/squareup/okhttp/OkHttpClient;

    int-to-long v1, p1

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, p1}, Lcom/squareup/okhttp/OkHttpClient;->setReadTimeout(JLjava/util/concurrent/TimeUnit;)V

    return-object p0
.end method

.method public setSqlDateFormat(Ljava/text/DateFormat;)Lcom/ibotta/tracking/generated/invoker/ApiClient;
    .locals 1

    .line 230
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->json:Lcom/ibotta/tracking/generated/invoker/JSON;

    invoke-virtual {v0, p1}, Lcom/ibotta/tracking/generated/invoker/JSON;->setSqlDateFormat(Ljava/text/DateFormat;)Lcom/ibotta/tracking/generated/invoker/JSON;

    return-object p0
.end method

.method public setSslCaCert(Ljava/io/InputStream;)Lcom/ibotta/tracking/generated/invoker/ApiClient;
    .locals 0

    .line 198
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->sslCaCert:Ljava/io/InputStream;

    .line 199
    invoke-direct {p0}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->applySslSettings()V

    return-object p0
.end method

.method public setTempFolderPath(Ljava/lang/String;)Lcom/ibotta/tracking/generated/invoker/ApiClient;
    .locals 0

    .line 415
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->tempFolderPath:Ljava/lang/String;

    return-object p0
.end method

.method public setUserAgent(Ljava/lang/String;)Lcom/ibotta/tracking/generated/invoker/ApiClient;
    .locals 1

    const-string v0, "User-Agent"

    .line 350
    invoke-virtual {p0, v0, p1}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->addDefaultHeader(Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/tracking/generated/invoker/ApiClient;

    return-object p0
.end method

.method public setUsername(Ljava/lang/String;)V
    .locals 3

    .line 274
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->authentications:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/tracking/generated/invoker/auth/Authentication;

    .line 275
    instance-of v2, v1, Lcom/ibotta/tracking/generated/invoker/auth/HttpBasicAuth;

    if-eqz v2, :cond_0

    .line 276
    check-cast v1, Lcom/ibotta/tracking/generated/invoker/auth/HttpBasicAuth;

    invoke-virtual {v1, p1}, Lcom/ibotta/tracking/generated/invoker/auth/HttpBasicAuth;->setUsername(Ljava/lang/String;)V

    return-void

    .line 280
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "No HTTP basic authentication configured!"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setVerifyingSsl(Z)Lcom/ibotta/tracking/generated/invoker/ApiClient;
    .locals 0

    .line 176
    iput-boolean p1, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->verifyingSsl:Z

    .line 177
    invoke-direct {p0}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->applySslSettings()V

    return-object p0
.end method

.method public setWriteTimeout(I)Lcom/ibotta/tracking/generated/invoker/ApiClient;
    .locals 3

    .line 481
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->httpClient:Lcom/squareup/okhttp/OkHttpClient;

    int-to-long v1, p1

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, p1}, Lcom/squareup/okhttp/OkHttpClient;->setWriteTimeout(JLjava/util/concurrent/TimeUnit;)V

    return-object p0
.end method

.method public updateParamsForAuth([Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ibotta/tracking/generated/invoker/Pair;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1085
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    .line 1086
    iget-object v3, p0, Lcom/ibotta/tracking/generated/invoker/ApiClient;->authentications:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/tracking/generated/invoker/auth/Authentication;

    if-eqz v3, :cond_0

    .line 1088
    invoke-interface {v3, p2, p3}, Lcom/ibotta/tracking/generated/invoker/auth/Authentication;->applyToParams(Ljava/util/List;Ljava/util/Map;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1087
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Authentication undefined: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void
.end method
