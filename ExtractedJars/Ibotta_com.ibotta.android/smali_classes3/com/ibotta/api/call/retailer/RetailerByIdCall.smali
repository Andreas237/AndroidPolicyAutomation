.class public Lcom/ibotta/api/call/retailer/RetailerByIdCall;
.super Lcom/ibotta/api/BaseCacheableApiCall;
.source "RetailerByIdCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseCacheableApiCall<",
        "Lcom/ibotta/api/call/retailer/RetailerByIdResponse;",
        ">;"
    }
.end annotation


# static fields
.field public static final API_FUNCTION:Ljava/lang/String; = "retailers/%1$s.json"


# instance fields
.field private nearLat:Ljava/lang/Double;

.field private nearLong:Ljava/lang/Double;

.field private nearZip:Ljava/lang/String;

.field private retailerId:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Lcom/ibotta/api/BaseCacheableApiCall;-><init>()V

    const/4 v0, 0x1

    .line 20
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->setRequiresAuthToken(Z)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/ibotta/api/call/retailer/RetailerByIdCall;-><init>()V

    .line 25
    iput p1, p0, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->retailerId:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/Double;Ljava/lang/Double;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Lcom/ibotta/api/call/retailer/RetailerByIdCall;-><init>(I)V

    .line 30
    iput-object p2, p0, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->nearLat:Ljava/lang/Double;

    .line 31
    iput-object p3, p0, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->nearLong:Ljava/lang/Double;

    return-void
.end method

.method public constructor <init>(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/api/call/retailer/RetailerByIdCall;-><init>(ILjava/lang/Double;Ljava/lang/Double;)V

    .line 36
    iput-object p4, p0, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->nearZip:Ljava/lang/String;

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

    .line 88
    invoke-super {p0}, Lcom/ibotta/api/BaseCacheableApiCall;->buildParams()V

    .line 90
    iget-object v0, p0, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->nearLat:Ljava/lang/Double;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->nearLong:Ljava/lang/Double;

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p0, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->params:Ljava/util/Map;

    const-string v1, "near_coords[lat]"

    iget-object v2, p0, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->nearLat:Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    iget-object v0, p0, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->params:Ljava/util/Map;

    const-string v1, "near_coords[long]"

    iget-object v2, p0, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->nearLong:Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->nearZip:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 95
    iget-object v0, p0, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->params:Ljava/util/Map;

    const-string v1, "near_zip"

    iget-object v2, p0, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->nearZip:Ljava/lang/String;

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

    .line 11
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/retailer/RetailerByIdResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/retailer/RetailerByIdResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 101
    const-class v0, Lcom/ibotta/api/model/retailer/Retailer;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/retailer/Retailer;

    .line 103
    new-instance p2, Lcom/ibotta/api/call/retailer/RetailerByIdResponse;

    invoke-direct {p2}, Lcom/ibotta/api/call/retailer/RetailerByIdResponse;-><init>()V

    .line 104
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/retailer/RetailerByIdResponse;->setRetailer(Lcom/ibotta/api/model/retailer/Retailer;)V

    return-object p2
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 83
    invoke-virtual {p0}, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "retailers/%1$s.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->retailerId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCacheFamily()Ljava/lang/String;
    .locals 1

    const-string v0, "retailers"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 110
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    invoke-virtual {p0}, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    invoke-virtual {p0}, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    iget v1, p0, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->retailerId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 114
    iget-object v1, p0, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->nearLat:Ljava/lang/Double;

    if-eqz v1, :cond_0

    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    :cond_0
    iget-object v1, p0, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->nearLong:Ljava/lang/Double;

    if-eqz v1, :cond_1

    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 120
    :cond_1
    iget-object v1, p0, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->nearZip:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 121
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    :cond_2
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 78
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->GET:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getNearLat()Ljava/lang/Double;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->nearLat:Ljava/lang/Double;

    return-object v0
.end method

.method public getNearLong()Ljava/lang/Double;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->nearLong:Ljava/lang/Double;

    return-object v0
.end method

.method public getNearZip()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->nearZip:Ljava/lang/String;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/retailer/RetailerByIdResponse;",
            ">;"
        }
    .end annotation

    .line 41
    const-class v0, Lcom/ibotta/api/call/retailer/RetailerByIdResponse;

    return-object v0
.end method

.method public getRetailerId()I
    .locals 1

    .line 49
    iget v0, p0, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->retailerId:I

    return v0
.end method

.method public isInvalidatesCacheFamily()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public setNearLat(Ljava/lang/Double;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->nearLat:Ljava/lang/Double;

    return-void
.end method

.method public setNearLong(Ljava/lang/Double;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->nearLong:Ljava/lang/Double;

    return-void
.end method

.method public setNearZip(Ljava/lang/String;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->nearZip:Ljava/lang/String;

    return-void
.end method

.method public setRetailerId(I)V
    .locals 0

    .line 45
    iput p1, p0, Lcom/ibotta/api/call/retailer/RetailerByIdCall;->retailerId:I

    return-void
.end method
