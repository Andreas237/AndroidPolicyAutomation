.class public Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "FavoriteRetailersFlushCall.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushCall$FavoriteRetailersFlushExecution;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private final favoriteRetailerSettingsFlushWorker:Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    const/4 v0, 0x0

    .line 22
    invoke-virtual {p0, v0}, Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushCall;->setRequiresAuthToken(Z)V

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushCall;->favoriteRetailerSettingsFlushWorker:Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushCall;)Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;
    .locals 0

    .line 17
    iget-object p0, p0, Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushCall;->favoriteRetailerSettingsFlushWorker:Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    return-object p0
.end method


# virtual methods
.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 43
    const-class v0, Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushResponse;

    invoke-static {p1, p2, v0}, Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushResponse;

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
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushResponse;

    move-result-object p1

    return-object p1
.end method

.method public getApiExecution()Lcom/ibotta/api/execution/ApiExecution;
    .locals 2

    .line 48
    new-instance v0, Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushCall$FavoriteRetailersFlushExecution;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushCall$FavoriteRetailersFlushExecution;-><init>(Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushCall;Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushCall$1;)V

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/favorite_retailers_flush"

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
            "Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushResponse;",
            ">;"
        }
    .end annotation

    .line 28
    const-class v0, Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushResponse;

    return-object v0
.end method
