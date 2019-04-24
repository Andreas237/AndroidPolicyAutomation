.class public Lcom/ibotta/api/call/home/HomeCall;
.super Lcom/ibotta/api/BaseCacheableApiCall;
.source "HomeCall.java"

# interfaces
.implements Lcom/ibotta/api/call/location/LocationCall;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseCacheableApiCall<",
        "Lcom/ibotta/api/call/home/HomeResponse;",
        ">;",
        "Lcom/ibotta/api/call/location/LocationCall;"
    }
.end annotation


# static fields
.field public static final API_FUNCTION:Ljava/lang/String; = "home.json"


# instance fields
.field private nearLat:Ljava/lang/Double;

.field private nearLong:Ljava/lang/Double;

.field private nearZip:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Lcom/ibotta/api/BaseCacheableApiCall;-><init>()V

    const/4 v0, 0x1

    .line 21
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/home/HomeCall;->setRequiresAuthToken(Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Double;Ljava/lang/Double;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/ibotta/api/call/home/HomeCall;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/api/call/home/HomeCall;->nearLat:Ljava/lang/Double;

    .line 27
    iput-object p2, p0, Lcom/ibotta/api/call/home/HomeCall;->nearLong:Ljava/lang/Double;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2}, Lcom/ibotta/api/call/home/HomeCall;-><init>(Ljava/lang/Double;Ljava/lang/Double;)V

    .line 32
    iput-object p3, p0, Lcom/ibotta/api/call/home/HomeCall;->nearZip:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public buildParams()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 81
    invoke-super {p0}, Lcom/ibotta/api/BaseCacheableApiCall;->buildParams()V

    .line 83
    iget-object v0, p0, Lcom/ibotta/api/call/home/HomeCall;->nearLat:Ljava/lang/Double;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/api/call/home/HomeCall;->nearLong:Ljava/lang/Double;

    if-eqz v0, :cond_0

    .line 84
    iget-object v0, p0, Lcom/ibotta/api/call/home/HomeCall;->params:Ljava/util/Map;

    const-string v1, "near_coords[lat]"

    iget-object v2, p0, Lcom/ibotta/api/call/home/HomeCall;->nearLat:Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    iget-object v0, p0, Lcom/ibotta/api/call/home/HomeCall;->params:Ljava/util/Map;

    const-string v1, "near_coords[long]"

    iget-object v2, p0, Lcom/ibotta/api/call/home/HomeCall;->nearLong:Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/call/home/HomeCall;->nearZip:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 88
    iget-object v0, p0, Lcom/ibotta/api/call/home/HomeCall;->params:Ljava/util/Map;

    const-string v1, "near_zip"

    iget-object v2, p0, Lcom/ibotta/api/call/home/HomeCall;->nearZip:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 13
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/home/HomeCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/home/HomeResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/home/HomeResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 94
    const-class v0, Lcom/ibotta/api/call/home/HomeResponse;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/home/HomeCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/call/home/HomeResponse;

    return-object p1
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "home.json"

    return-object v0
.end method

.method public getCacheFamily()Ljava/lang/String;
    .locals 1

    const-string v0, "home"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 6

    .line 99
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    invoke-virtual {p0}, Lcom/ibotta/api/call/home/HomeCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    invoke-virtual {p0}, Lcom/ibotta/api/call/home/HomeCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 103
    sget-object v1, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v2, "Cache key string: %1$s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-interface {v1, v2, v3}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 71
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->GET:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getNearLat()Ljava/lang/Double;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/ibotta/api/call/home/HomeCall;->nearLat:Ljava/lang/Double;

    return-object v0
.end method

.method public getNearLong()Ljava/lang/Double;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/ibotta/api/call/home/HomeCall;->nearLong:Ljava/lang/Double;

    return-object v0
.end method

.method public getNearZip()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/ibotta/api/call/home/HomeCall;->nearZip:Ljava/lang/String;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/home/HomeResponse;",
            ">;"
        }
    .end annotation

    .line 37
    const-class v0, Lcom/ibotta/api/call/home/HomeResponse;

    return-object v0
.end method

.method public isInvalidatesCacheFamily()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public setNearLat(Ljava/lang/Double;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/ibotta/api/call/home/HomeCall;->nearLat:Ljava/lang/Double;

    return-void
.end method

.method public setNearLong(Ljava/lang/Double;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/ibotta/api/call/home/HomeCall;->nearLong:Ljava/lang/Double;

    return-void
.end method

.method public setNearZip(Ljava/lang/String;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/ibotta/api/call/home/HomeCall;->nearZip:Ljava/lang/String;

    return-void
.end method
