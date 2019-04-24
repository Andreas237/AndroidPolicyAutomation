.class public Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;
.super Ljava/lang/Object;
.source "IbottaHeaderInterceptor.java"

# interfaces
.implements Lokhttp3/Interceptor;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field static final TOKEN_FORMAT:Ljava/lang/String; = "Token token=\"%1$s\""
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field


# instance fields
.field private final apiContext:Lcom/ibotta/api/ApiContext;

.field private final debugHeaders:Z

.field private final httpHeaders:Lcom/ibotta/api/HttpHeaders;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/ApiContext;Lcom/ibotta/api/HttpHeaders;Z)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;->apiContext:Lcom/ibotta/api/ApiContext;

    .line 41
    iput-object p2, p0, Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;->httpHeaders:Lcom/ibotta/api/HttpHeaders;

    .line 42
    iput-boolean p3, p0, Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;->debugHeaders:Z

    return-void
.end method

.method private addAllHeaders(Lokhttp3/Request$Builder;)Lokhttp3/Request$Builder;
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "X-App-Token"

    .line 56
    iget-object v2, p0, Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;->httpHeaders:Lcom/ibotta/api/HttpHeaders;

    invoke-virtual {v2}, Lcom/ibotta/api/HttpHeaders;->getAppToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;
    :try_end_0
    .catch Lcom/ibotta/api/ApiException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Failed to set header for app token."

    .line 58
    new-array v3, v0, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    const-string v1, "X-Device-Id"

    .line 61
    iget-object v2, p0, Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;->httpHeaders:Lcom/ibotta/api/HttpHeaders;

    invoke-virtual {v2}, Lcom/ibotta/api/HttpHeaders;->getDeviceId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    const-string v1, "X-App-Version"

    .line 62
    iget-object v2, p0, Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;->httpHeaders:Lcom/ibotta/api/HttpHeaders;

    invoke-virtual {v2}, Lcom/ibotta/api/HttpHeaders;->getAppVersion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    const-string v1, "Authorization"

    const-string v2, "Token token=\"%1$s\""

    const/4 v3, 0x1

    .line 63
    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;->apiContext:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v4}, Lcom/ibotta/api/ApiContext;->getApiAuthManager()Lcom/ibotta/api/auth/ApiAuthManager;

    move-result-object v4

    invoke-interface {v4}, Lcom/ibotta/api/auth/ApiAuthManager;->getAuthToken()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v0

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    const-string v0, "X-Location"

    .line 64
    iget-object v1, p0, Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;->httpHeaders:Lcom/ibotta/api/HttpHeaders;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/graphql/interceptor/-$$Lambda$4hpkswh1sWxc7hcEk48wJ5F1hbA;

    invoke-direct {v2, v1}, Lcom/ibotta/android/graphql/interceptor/-$$Lambda$4hpkswh1sWxc7hcEk48wJ5F1hbA;-><init>(Lcom/ibotta/api/HttpHeaders;)V

    invoke-direct {p0, p1, v0, v2}, Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;->addHeaderIfNonNull(Lokhttp3/Request$Builder;Ljava/lang/String;Ljava9/util/function/Supplier;)V

    const-string v0, "X-AppsFlyer-Id"

    .line 65
    iget-object v1, p0, Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;->httpHeaders:Lcom/ibotta/api/HttpHeaders;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/graphql/interceptor/-$$Lambda$QAGnAOhjZWkQ8qM5bCKtAJhnNrk;

    invoke-direct {v2, v1}, Lcom/ibotta/android/graphql/interceptor/-$$Lambda$QAGnAOhjZWkQ8qM5bCKtAJhnNrk;-><init>(Lcom/ibotta/api/HttpHeaders;)V

    invoke-direct {p0, p1, v0, v2}, Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;->addHeaderIfNonNull(Lokhttp3/Request$Builder;Ljava/lang/String;Ljava9/util/function/Supplier;)V

    return-object p1
.end method

.method private addHeaderIfNonNull(Lokhttp3/Request$Builder;Ljava/lang/String;Ljava9/util/function/Supplier;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/Request$Builder;",
            "Ljava/lang/String;",
            "Ljava9/util/function/Supplier<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 71
    invoke-interface {p3}, Ljava9/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-static {p3}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object p3

    new-instance v0, Lcom/ibotta/android/graphql/interceptor/-$$Lambda$IbottaHeaderInterceptor$TZRtGaCeGzEKvHgAwfcv6Yhjejo;

    invoke-direct {v0, p1, p2}, Lcom/ibotta/android/graphql/interceptor/-$$Lambda$IbottaHeaderInterceptor$TZRtGaCeGzEKvHgAwfcv6Yhjejo;-><init>(Lokhttp3/Request$Builder;Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Ljava9/util/Optional;->ifPresent(Ljava9/util/function/Consumer;)V

    return-void
.end method

.method private debugHeaders(Lokhttp3/Request;)V
    .locals 5

    .line 75
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;->debugHeaders:Z

    if-eqz v0, :cond_0

    .line 76
    invoke-virtual {p1}, Lokhttp3/Request;->headers()Lokhttp3/Headers;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Headers;->names()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "Writing GraphQL header: %1$s=%2$s"

    const/4 v3, 0x2

    .line 77
    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    invoke-virtual {p1, v1}, Lokhttp3/Request;->headers(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    aput-object v1, v3, v4

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method static synthetic lambda$addHeaderIfNonNull$0(Lokhttp3/Request$Builder;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 71
    invoke-virtual {p0, p1, p2}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    return-void
.end method


# virtual methods
.method public intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 47
    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->request()Lokhttp3/Request;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Request;->newBuilder()Lokhttp3/Request$Builder;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;->addAllHeaders(Lokhttp3/Request$Builder;)Lokhttp3/Request$Builder;

    move-result-object v0

    instance-of v1, v0, Lokhttp3/Request$Builder;

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v0

    goto :goto_0

    :cond_0
    check-cast v0, Lokhttp3/Request$Builder;

    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/okhttp3/OkHttp3Instrumentation;->build(Lokhttp3/Request$Builder;)Lokhttp3/Request;

    move-result-object v0

    .line 49
    :goto_0
    invoke-direct {p0, v0}, Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;->debugHeaders(Lokhttp3/Request;)V

    .line 51
    invoke-interface {p1, v0}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object p1

    return-object p1
.end method
