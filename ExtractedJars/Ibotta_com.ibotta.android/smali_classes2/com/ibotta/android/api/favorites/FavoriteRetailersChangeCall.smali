.class public Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeCall;
.super Lcom/ibotta/api/BaseCacheableApiCall;
.source "FavoriteRetailersChangeCall.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeCall$FavoriteRetailersChangeExecution;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseCacheableApiCall<",
        "Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeResponse;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Lcom/ibotta/api/BaseCacheableApiCall;-><init>()V

    const/4 v0, 0x0

    .line 19
    invoke-virtual {p0, v0}, Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeCall;->setRequiresAuthToken(Z)V

    return-void
.end method


# virtual methods
.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 39
    const-class v0, Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeResponse;

    invoke-static {p1, p2, v0}, Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeResponse;

    return-object p1
.end method

.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 17
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeResponse;

    move-result-object p1

    return-object p1
.end method

.method public getApiExecution()Lcom/ibotta/api/execution/ApiExecution;
    .locals 2

    .line 59
    new-instance v0, Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeCall$FavoriteRetailersChangeExecution;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeCall$FavoriteRetailersChangeExecution;-><init>(Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeCall;Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeCall$1;)V

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/favorite_retailers_change"

    return-object v0
.end method

.method public getCacheFamily()Ljava/lang/String;
    .locals 1

    const-string v0, "favorite_retailers_change"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 1

    .line 44
    invoke-virtual {p0}, Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeCall;->getApiFunction()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeResponse;",
            ">;"
        }
    .end annotation

    .line 24
    const-class v0, Lcom/ibotta/android/api/favorites/FavoriteRetailersChangeResponse;

    return-object v0
.end method

.method public isInvalidatesCacheFamily()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
