.class public Lcom/ibotta/android/api/like/PendingLikeCall;
.super Lcom/ibotta/api/BaseCacheableApiCall;
.source "PendingLikeCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseCacheableApiCall<",
        "Lcom/ibotta/android/api/like/PendingLikeResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private offerIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Lcom/ibotta/api/BaseCacheableApiCall;-><init>()V

    .line 18
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/api/like/PendingLikeCall;->offerIds:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 23
    invoke-direct {p0}, Lcom/ibotta/api/BaseCacheableApiCall;-><init>()V

    .line 18
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/api/like/PendingLikeCall;->offerIds:Ljava/util/Set;

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/api/like/PendingLikeCall;->offerIds:Ljava/util/Set;

    const/4 p1, 0x0

    .line 25
    invoke-virtual {p0, p1}, Lcom/ibotta/android/api/like/PendingLikeCall;->setRequiresAuthToken(Z)V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/api/like/PendingLikeCall;)Ljava/util/Set;
    .locals 0

    .line 17
    iget-object p0, p0, Lcom/ibotta/android/api/like/PendingLikeCall;->offerIds:Ljava/util/Set;

    return-object p0
.end method


# virtual methods
.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/android/api/like/PendingLikeResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 45
    const-class v0, Lcom/ibotta/android/api/like/PendingLikeResponse;

    invoke-static {p1, p2, v0}, Lcom/ibotta/android/api/like/PendingLikeCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/api/like/PendingLikeResponse;

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
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/api/like/PendingLikeCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/android/api/like/PendingLikeResponse;

    move-result-object p1

    return-object p1
.end method

.method public getApiExecution()Lcom/ibotta/api/execution/ApiExecution;
    .locals 1

    .line 65
    new-instance v0, Lcom/ibotta/android/api/like/PendingLikeCall$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/api/like/PendingLikeCall$1;-><init>(Lcom/ibotta/android/api/like/PendingLikeCall;)V

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/like"

    return-object v0
.end method

.method public getCacheFamily()Ljava/lang/String;
    .locals 1

    const-string v0, "like"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 1

    .line 50
    invoke-virtual {p0}, Lcom/ibotta/android/api/like/PendingLikeCall;->getApiFunction()Ljava/lang/String;

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
            "Lcom/ibotta/android/api/like/PendingLikeResponse;",
            ">;"
        }
    .end annotation

    .line 30
    const-class v0, Lcom/ibotta/android/api/like/PendingLikeResponse;

    return-object v0
.end method

.method public isInvalidatesCacheFamily()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
