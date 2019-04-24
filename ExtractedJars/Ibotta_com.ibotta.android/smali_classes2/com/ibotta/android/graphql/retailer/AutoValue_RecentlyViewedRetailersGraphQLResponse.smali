.class final Lcom/ibotta/android/graphql/retailer/AutoValue_RecentlyViewedRetailersGraphQLResponse;
.super Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLResponse;
.source "AutoValue_RecentlyViewedRetailersGraphQLResponse.java"


# instance fields
.field private final retailerModels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)V"
        }
    .end annotation

    .line 15
    invoke-direct {p0}, Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLResponse;-><init>()V

    if-eqz p1, :cond_0

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/graphql/retailer/AutoValue_RecentlyViewedRetailersGraphQLResponse;->retailerModels:Ljava/util/List;

    return-void

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null retailerModels"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 39
    :cond_0
    instance-of v0, p1, Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLResponse;

    if-eqz v0, :cond_1

    .line 40
    check-cast p1, Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLResponse;

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/graphql/retailer/AutoValue_RecentlyViewedRetailersGraphQLResponse;->retailerModels:Ljava/util/List;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/retailer/RecentlyViewedRetailersGraphQLResponse;->getRetailerModels()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public getRetailerModels()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/graphql/retailer/AutoValue_RecentlyViewedRetailersGraphQLResponse;->retailerModels:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/graphql/retailer/AutoValue_RecentlyViewedRetailersGraphQLResponse;->retailerModels:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RecentlyViewedRetailersGraphQLResponse{retailerModels="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/retailer/AutoValue_RecentlyViewedRetailersGraphQLResponse;->retailerModels:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
