.class public Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Service;
.super Lcom/twitter/sdk/android/core/internal/oauth/OAuthService;
.source "OAuth2Service.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Service$OAuth2Api;
    }
.end annotation


# instance fields
.field api:Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Service$OAuth2Api;


# direct methods
.method public constructor <init>(Lcom/twitter/sdk/android/core/TwitterCore;Ljavax/net/ssl/SSLSocketFactory;Lcom/twitter/sdk/android/core/internal/TwitterApi;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1, p2, p3}, Lcom/twitter/sdk/android/core/internal/oauth/OAuthService;-><init>(Lcom/twitter/sdk/android/core/TwitterCore;Ljavax/net/ssl/SSLSocketFactory;Lcom/twitter/sdk/android/core/internal/TwitterApi;)V

    .line 60
    invoke-virtual {p0}, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Service;->getApiAdapter()Lretrofit/RestAdapter;

    move-result-object p1

    const-class p2, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Service$OAuth2Api;

    invoke-virtual {p1, p2}, Lretrofit/RestAdapter;->create(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Service$OAuth2Api;

    iput-object p1, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Service;->api:Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Service$OAuth2Api;

    return-void
.end method

.method private getAuthHeader()Ljava/lang/String;
    .locals 4

    .line 135
    invoke-virtual {p0}, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Service;->getTwitterCore()Lcom/twitter/sdk/android/core/TwitterCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/twitter/sdk/android/core/TwitterCore;->getAuthConfig()Lcom/twitter/sdk/android/core/TwitterAuthConfig;

    move-result-object v0

    .line 136
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Basic "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/twitter/sdk/android/core/TwitterAuthConfig;->getConsumerKey()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lio/fabric/sdk/android/services/network/UrlUtils;->percentEncode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/twitter/sdk/android/core/TwitterAuthConfig;->getConsumerSecret()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lio/fabric/sdk/android/services/network/UrlUtils;->percentEncode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lio/fabric/sdk/android/services/network/HttpRequest$Base64;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getAuthorizationHeader(Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;)Ljava/lang/String;
    .locals 2

    .line 131
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Bearer "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;->getAccessToken()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public requestAppAuthToken(Lcom/twitter/sdk/android/core/Callback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/twitter/sdk/android/core/Callback<",
            "Lcom/twitter/sdk/android/core/internal/oauth/AppAuthToken;",
            ">;)V"
        }
    .end annotation

    .line 112
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Service;->api:Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Service$OAuth2Api;

    invoke-direct {p0}, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Service;->getAuthHeader()Ljava/lang/String;

    move-result-object v1

    const-string v2, "client_credentials"

    invoke-interface {v0, v1, v2, p1}, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Service$OAuth2Api;->getAppAuthToken(Ljava/lang/String;Ljava/lang/String;Lcom/twitter/sdk/android/core/Callback;)V

    return-void
.end method

.method public requestGuestAuthToken(Lcom/twitter/sdk/android/core/Callback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/twitter/sdk/android/core/Callback<",
            "Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;",
            ">;)V"
        }
    .end annotation

    .line 68
    new-instance v0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Service$1;

    invoke-direct {v0, p0, p1}, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Service$1;-><init>(Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Service;Lcom/twitter/sdk/android/core/Callback;)V

    .line 103
    invoke-virtual {p0, v0}, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Service;->requestAppAuthToken(Lcom/twitter/sdk/android/core/Callback;)V

    return-void
.end method

.method public requestGuestToken(Lcom/twitter/sdk/android/core/Callback;Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/twitter/sdk/android/core/Callback<",
            "Lcom/twitter/sdk/android/core/internal/oauth/GuestTokenResponse;",
            ">;",
            "Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;",
            ")V"
        }
    .end annotation

    .line 124
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Service;->api:Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Service$OAuth2Api;

    invoke-static {p2}, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Service;->getAuthorizationHeader(Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p2, p1}, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Service$OAuth2Api;->getGuestToken(Ljava/lang/String;Lcom/twitter/sdk/android/core/Callback;)V

    return-void
.end method
