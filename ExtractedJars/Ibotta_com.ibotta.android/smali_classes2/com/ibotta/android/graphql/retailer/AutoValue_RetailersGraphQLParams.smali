.class final Lcom/ibotta/android/graphql/retailer/AutoValue_RetailersGraphQLParams;
.super Lcom/ibotta/android/graphql/retailer/RetailersGraphQLParams;
.source "AutoValue_RetailersGraphQLParams.java"


# instance fields
.field private final nearbyOnly:Z

.field private final retailerIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/List;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .line 16
    invoke-direct {p0}, Lcom/ibotta/android/graphql/retailer/RetailersGraphQLParams;-><init>()V

    if-eqz p1, :cond_0

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/graphql/retailer/AutoValue_RetailersGraphQLParams;->retailerIds:Ljava/util/List;

    .line 21
    iput-boolean p2, p0, Lcom/ibotta/android/graphql/retailer/AutoValue_RetailersGraphQLParams;->nearbyOnly:Z

    return-void

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null retailerIds"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 47
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/retailer/RetailersGraphQLParams;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 48
    check-cast p1, Lcom/ibotta/android/graphql/retailer/RetailersGraphQLParams;

    .line 49
    iget-object v1, p0, Lcom/ibotta/android/graphql/retailer/AutoValue_RetailersGraphQLParams;->retailerIds:Ljava/util/List;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/retailer/RetailersGraphQLParams;->getRetailerIds()Ljava/util/List;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lcom/ibotta/android/graphql/retailer/AutoValue_RetailersGraphQLParams;->nearbyOnly:Z

    .line 50
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/retailer/RetailersGraphQLParams;->isNearbyOnly()Z

    move-result p1

    if-ne v1, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method getRetailerIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/graphql/retailer/AutoValue_RetailersGraphQLParams;->retailerIds:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/graphql/retailer/AutoValue_RetailersGraphQLParams;->retailerIds:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 61
    iget-boolean v1, p0, Lcom/ibotta/android/graphql/retailer/AutoValue_RetailersGraphQLParams;->nearbyOnly:Z

    if-eqz v1, :cond_0

    const/16 v1, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v1, 0x4d5

    :goto_0
    xor-int/2addr v0, v1

    return v0
.end method

.method isNearbyOnly()Z
    .locals 1

    .line 31
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/retailer/AutoValue_RetailersGraphQLParams;->nearbyOnly:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 36
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RetailersGraphQLParams{retailerIds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/retailer/AutoValue_RetailersGraphQLParams;->retailerIds:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", nearbyOnly="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/graphql/retailer/AutoValue_RetailersGraphQLParams;->nearbyOnly:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
