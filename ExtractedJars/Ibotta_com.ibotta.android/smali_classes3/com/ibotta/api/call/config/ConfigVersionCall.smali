.class public Lcom/ibotta/api/call/config/ConfigVersionCall;
.super Lcom/ibotta/api/BaseCacheableApiCall;
.source "ConfigVersionCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseCacheableApiCall<",
        "Lcom/ibotta/api/call/config/ConfigVersionResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private platform:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/ibotta/api/BaseCacheableApiCall;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/api/call/config/ConfigVersionCall;->platform:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 11
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/config/ConfigVersionCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/config/ConfigVersionResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/config/ConfigVersionResponse;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 36
    const-class v0, Ljava/lang/String;

    const-class v1, Ljava/lang/String;

    invoke-static {p1, p2, v0, v1}, Lcom/ibotta/api/call/config/ConfigVersionCall;->fromJsonToLinkedHashMap(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/LinkedHashMap;

    move-result-object p1

    .line 38
    new-instance p2, Lcom/ibotta/api/call/config/ConfigVersionResponse;

    invoke-direct {p2}, Lcom/ibotta/api/call/config/ConfigVersionResponse;-><init>()V

    .line 39
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/config/ConfigVersionResponse;->setVersions(Ljava/util/LinkedHashMap;)V

    return-object p2
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 31
    invoke-virtual {p0}, Lcom/ibotta/api/call/config/ConfigVersionCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "config/%1$s/version.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/ibotta/api/call/config/ConfigVersionCall;->platform:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCacheFamily()Ljava/lang/String;
    .locals 1

    const-string v0, "app_version"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    invoke-virtual {p0}, Lcom/ibotta/api/call/config/ConfigVersionCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    invoke-virtual {p0}, Lcom/ibotta/api/call/config/ConfigVersionCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    iget-object v1, p0, Lcom/ibotta/api/call/config/ConfigVersionCall;->platform:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 26
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->GET:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/config/ConfigVersionResponse;",
            ">;"
        }
    .end annotation

    .line 21
    const-class v0, Lcom/ibotta/api/call/config/ConfigVersionResponse;

    return-object v0
.end method

.method public isInvalidatesCacheFamily()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
