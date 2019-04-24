.class public Lcom/jawbone/upplatformsdk/api/response/OauthAccessTokenResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private access_token:Ljava/lang/String;

.field private refresh_token:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAccessToken()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/jawbone/upplatformsdk/api/response/OauthAccessTokenResponse;->access_token:Ljava/lang/String;

    return-object v0
.end method

.method public getRefreshToken()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/jawbone/upplatformsdk/api/response/OauthAccessTokenResponse;->refresh_token:Ljava/lang/String;

    return-object v0
.end method

.method public setAccessToken(Ljava/lang/String;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/jawbone/upplatformsdk/api/response/OauthAccessTokenResponse;->access_token:Ljava/lang/String;

    .line 31
    return-void
.end method

.method public setRefreshToken(Ljava/lang/String;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/jawbone/upplatformsdk/api/response/OauthAccessTokenResponse;->refresh_token:Ljava/lang/String;

    .line 39
    return-void
.end method
