.class public Lcom/jawbone/upplatformsdk/api/ApiManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jawbone/upplatformsdk/api/ApiManager$CustomErrorHandler;
    }
.end annotation


# static fields
.field private static restAdapter:Lretrofit/RestAdapter;

.field private static restApiHeaders:Lcom/jawbone/upplatformsdk/api/ApiHeaders;

.field private static restApiInterface:Lcom/jawbone/upplatformsdk/api/RestApiInterface;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getRequestInterceptor()Lcom/jawbone/upplatformsdk/api/ApiHeaders;
    .locals 1

    .line 57
    sget-object v0, Lcom/jawbone/upplatformsdk/api/ApiManager;->restApiHeaders:Lcom/jawbone/upplatformsdk/api/ApiHeaders;

    if-nez v0, :cond_0

    .line 58
    new-instance v0, Lcom/jawbone/upplatformsdk/api/ApiHeaders;

    invoke-direct {v0}, Lcom/jawbone/upplatformsdk/api/ApiHeaders;-><init>()V

    sput-object v0, Lcom/jawbone/upplatformsdk/api/ApiManager;->restApiHeaders:Lcom/jawbone/upplatformsdk/api/ApiHeaders;

    .line 60
    :cond_0
    sget-object v0, Lcom/jawbone/upplatformsdk/api/ApiManager;->restApiHeaders:Lcom/jawbone/upplatformsdk/api/ApiHeaders;

    return-object v0
.end method

.method private static getRestAdapter()Lretrofit/RestAdapter;
    .locals 3

    .line 24
    sget-object v0, Lcom/jawbone/upplatformsdk/api/ApiManager;->restAdapter:Lretrofit/RestAdapter;

    if-nez v0, :cond_0

    .line 25
    new-instance v0, Lretrofit/RestAdapter$Builder;

    invoke-direct {v0}, Lretrofit/RestAdapter$Builder;-><init>()V

    .line 26
    invoke-static {}, Lcom/jawbone/upplatformsdk/api/ApiManager;->getRequestInterceptor()Lcom/jawbone/upplatformsdk/api/ApiHeaders;

    move-result-object v1

    invoke-virtual {v0, v1}, Lretrofit/RestAdapter$Builder;->setRequestInterceptor(Lretrofit/RequestInterceptor;)Lretrofit/RestAdapter$Builder;

    move-result-object v0

    sget-object v1, Lretrofit/RestAdapter$LogLevel;->FULL:Lretrofit/RestAdapter$LogLevel;

    .line 27
    invoke-virtual {v0, v1}, Lretrofit/RestAdapter$Builder;->setLogLevel(Lretrofit/RestAdapter$LogLevel;)Lretrofit/RestAdapter$Builder;

    move-result-object v0

    new-instance v1, Lcom/jawbone/upplatformsdk/api/ApiManager$CustomErrorHandler;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/jawbone/upplatformsdk/api/ApiManager$CustomErrorHandler;-><init>(Lcom/jawbone/upplatformsdk/api/ApiManager$1;)V

    .line 28
    invoke-virtual {v0, v1}, Lretrofit/RestAdapter$Builder;->setErrorHandler(Lretrofit/ErrorHandler;)Lretrofit/RestAdapter$Builder;

    move-result-object v0

    const-string v1, "https://jawbone.com"

    .line 29
    invoke-virtual {v0, v1}, Lretrofit/RestAdapter$Builder;->setEndpoint(Ljava/lang/String;)Lretrofit/RestAdapter$Builder;

    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lretrofit/RestAdapter$Builder;->build()Lretrofit/RestAdapter;

    move-result-object v0

    sput-object v0, Lcom/jawbone/upplatformsdk/api/ApiManager;->restAdapter:Lretrofit/RestAdapter;

    .line 32
    :cond_0
    sget-object v0, Lcom/jawbone/upplatformsdk/api/ApiManager;->restAdapter:Lretrofit/RestAdapter;

    return-object v0
.end method

.method public static getRestApiInterface()Lcom/jawbone/upplatformsdk/api/RestApiInterface;
    .locals 2

    .line 49
    invoke-static {}, Lcom/jawbone/upplatformsdk/api/ApiManager;->getRestAdapter()Lretrofit/RestAdapter;

    move-result-object v0

    sput-object v0, Lcom/jawbone/upplatformsdk/api/ApiManager;->restAdapter:Lretrofit/RestAdapter;

    .line 50
    sget-object v0, Lcom/jawbone/upplatformsdk/api/ApiManager;->restApiInterface:Lcom/jawbone/upplatformsdk/api/RestApiInterface;

    if-nez v0, :cond_0

    .line 51
    sget-object v0, Lcom/jawbone/upplatformsdk/api/ApiManager;->restAdapter:Lretrofit/RestAdapter;

    const-class v1, Lcom/jawbone/upplatformsdk/api/RestApiInterface;

    invoke-virtual {v0, v1}, Lretrofit/RestAdapter;->create(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jawbone/upplatformsdk/api/RestApiInterface;

    sput-object v0, Lcom/jawbone/upplatformsdk/api/ApiManager;->restApiInterface:Lcom/jawbone/upplatformsdk/api/RestApiInterface;

    .line 53
    :cond_0
    sget-object v0, Lcom/jawbone/upplatformsdk/api/ApiManager;->restApiInterface:Lcom/jawbone/upplatformsdk/api/RestApiInterface;

    return-object v0
.end method
