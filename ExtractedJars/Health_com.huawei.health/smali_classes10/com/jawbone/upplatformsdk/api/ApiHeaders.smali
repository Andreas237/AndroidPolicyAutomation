.class public Lcom/jawbone/upplatformsdk/api/ApiHeaders;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lretrofit/RequestInterceptor;


# instance fields
.field private accessToken:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public clearAccessToken()V
    .locals 1

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jawbone/upplatformsdk/api/ApiHeaders;->accessToken:Ljava/lang/String;

    .line 22
    return-void
.end method

.method public intercept(Lretrofit/RequestInterceptor$RequestFacade;)V
    .locals 3

    .line 26
    iget-object v0, p0, Lcom/jawbone/upplatformsdk/api/ApiHeaders;->accessToken:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 27
    const-string v0, "Authorization"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Bearer "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/jawbone/upplatformsdk/api/ApiHeaders;->accessToken:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lretrofit/RequestInterceptor$RequestFacade;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    const-string v0, "Accept"

    const-string v1, "application/json"

    invoke-interface {p1, v0, v1}, Lretrofit/RequestInterceptor$RequestFacade;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    :cond_0
    return-void
.end method

.method public setAccessToken(Ljava/lang/String;)V
    .locals 0

    .line 17
    iput-object p1, p0, Lcom/jawbone/upplatformsdk/api/ApiHeaders;->accessToken:Ljava/lang/String;

    .line 18
    return-void
.end method
