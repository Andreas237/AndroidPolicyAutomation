.class final Lcom/ibotta/android/graphql/category/AutoValue_RetailerCategoriesGraphQLResponse;
.super Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;
.source "AutoValue_RetailerCategoriesGraphQLResponse.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/category/AutoValue_RetailerCategoriesGraphQLResponse$Builder;
    }
.end annotation


# instance fields
.field private final favoriteRetailers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end field

.field private final retailerCategoryNodes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/RetailerCategoryNode;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/RetailerCategoryNode;",
            ">;)V"
        }
    .end annotation

    .line 18
    invoke-direct {p0}, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/graphql/category/AutoValue_RetailerCategoriesGraphQLResponse;->favoriteRetailers:Ljava/util/List;

    .line 20
    iput-object p2, p0, Lcom/ibotta/android/graphql/category/AutoValue_RetailerCategoriesGraphQLResponse;->retailerCategoryNodes:Ljava/util/List;

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/List;Ljava/util/List;Lcom/ibotta/android/graphql/category/AutoValue_RetailerCategoriesGraphQLResponse$1;)V
    .locals 0

    .line 11
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/graphql/category/AutoValue_RetailerCategoriesGraphQLResponse;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 46
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 47
    check-cast p1, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;

    .line 48
    iget-object v1, p0, Lcom/ibotta/android/graphql/category/AutoValue_RetailerCategoriesGraphQLResponse;->favoriteRetailers:Ljava/util/List;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;->getFavoriteRetailers()Ljava/util/List;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/graphql/category/AutoValue_RetailerCategoriesGraphQLResponse;->retailerCategoryNodes:Ljava/util/List;

    .line 49
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;->getRetailerCategoryNodes()Ljava/util/List;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public getFavoriteRetailers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/graphql/category/AutoValue_RetailerCategoriesGraphQLResponse;->favoriteRetailers:Ljava/util/List;

    return-object v0
.end method

.method public getRetailerCategoryNodes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/RetailerCategoryNode;",
            ">;"
        }
    .end annotation

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/graphql/category/AutoValue_RetailerCategoriesGraphQLResponse;->retailerCategoryNodes:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/graphql/category/AutoValue_RetailerCategoriesGraphQLResponse;->favoriteRetailers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 60
    iget-object v1, p0, Lcom/ibotta/android/graphql/category/AutoValue_RetailerCategoriesGraphQLResponse;->retailerCategoryNodes:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RetailerCategoriesGraphQLResponse{favoriteRetailers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/category/AutoValue_RetailerCategoriesGraphQLResponse;->favoriteRetailers:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", retailerCategoryNodes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/category/AutoValue_RetailerCategoriesGraphQLResponse;->retailerCategoryNodes:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
