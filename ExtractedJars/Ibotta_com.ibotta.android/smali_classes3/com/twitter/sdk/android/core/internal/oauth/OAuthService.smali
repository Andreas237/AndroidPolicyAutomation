.class abstract Lcom/twitter/sdk/android/core/internal/oauth/OAuthService;
.super Ljava/lang/Object;
.source "OAuthService.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private final api:Lcom/twitter/sdk/android/core/internal/TwitterApi;

.field private final apiAdapter:Lretrofit/RestAdapter;

.field private final sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

.field private final twitterCore:Lcom/twitter/sdk/android/core/TwitterCore;

.field private final userAgent:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/twitter/sdk/android/core/TwitterCore;Ljavax/net/ssl/SSLSocketFactory;Lcom/twitter/sdk/android/core/internal/TwitterApi;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuthService;->twitterCore:Lcom/twitter/sdk/android/core/TwitterCore;

    .line 45
    iput-object p2, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuthService;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    .line 46
    iput-object p3, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuthService;->api:Lcom/twitter/sdk/android/core/internal/TwitterApi;

    const-string p2, "TwitterAndroidSDK"

    .line 47
    invoke-virtual {p1}, Lcom/twitter/sdk/android/core/TwitterCore;->getVersion()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/twitter/sdk/android/core/internal/TwitterApi;->buildUserAgent(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuthService;->userAgent:Ljava/lang/String;

    .line 50
    new-instance p1, Lretrofit/RestAdapter$Builder;

    invoke-direct {p1}, Lretrofit/RestAdapter$Builder;-><init>()V

    invoke-virtual {p0}, Lcom/twitter/sdk/android/core/internal/oauth/OAuthService;->getApi()Lcom/twitter/sdk/android/core/internal/TwitterApi;

    move-result-object p2

    invoke-virtual {p2}, Lcom/twitter/sdk/android/core/internal/TwitterApi;->getBaseHostUrl()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lretrofit/RestAdapter$Builder;->setEndpoint(Ljava/lang/String;)Lretrofit/RestAdapter$Builder;

    move-result-object p1

    new-instance p2, Lcom/twitter/sdk/android/core/DefaultClient;

    iget-object p3, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuthService;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    invoke-direct {p2, p3}, Lcom/twitter/sdk/android/core/DefaultClient;-><init>(Ljavax/net/ssl/SSLSocketFactory;)V

    instance-of p3, p1, Lretrofit/RestAdapter$Builder;

    if-nez p3, :cond_0

    invoke-virtual {p1, p2}, Lretrofit/RestAdapter$Builder;->setClient(Lretrofit/client/Client;)Lretrofit/RestAdapter$Builder;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast p1, Lretrofit/RestAdapter$Builder;

    invoke-static {p1, p2}, Lcom/newrelic/agent/android/instrumentation/retrofit/RetrofitInstrumentation;->setClient(Lretrofit/RestAdapter$Builder;Lretrofit/client/Client;)Lretrofit/RestAdapter$Builder;

    move-result-object p1

    :goto_0
    new-instance p2, Lcom/twitter/sdk/android/core/internal/oauth/OAuthService$1;

    invoke-direct {p2, p0}, Lcom/twitter/sdk/android/core/internal/oauth/OAuthService$1;-><init>(Lcom/twitter/sdk/android/core/internal/oauth/OAuthService;)V

    invoke-virtual {p1, p2}, Lretrofit/RestAdapter$Builder;->setRequestInterceptor(Lretrofit/RequestInterceptor;)Lretrofit/RestAdapter$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lretrofit/RestAdapter$Builder;->build()Lretrofit/RestAdapter;

    move-result-object p1

    iput-object p1, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuthService;->apiAdapter:Lretrofit/RestAdapter;

    return-void
.end method


# virtual methods
.method protected getApi()Lcom/twitter/sdk/android/core/internal/TwitterApi;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuthService;->api:Lcom/twitter/sdk/android/core/internal/TwitterApi;

    return-object v0
.end method

.method protected getApiAdapter()Lretrofit/RestAdapter;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuthService;->apiAdapter:Lretrofit/RestAdapter;

    return-object v0
.end method

.method protected getTwitterCore()Lcom/twitter/sdk/android/core/TwitterCore;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuthService;->twitterCore:Lcom/twitter/sdk/android/core/TwitterCore;

    return-object v0
.end method

.method protected getUserAgent()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuthService;->userAgent:Ljava/lang/String;

    return-object v0
.end method
