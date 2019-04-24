.class public abstract Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;
.source "RetailerCategoriesGraphQLResponse.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse$Builder;
    .locals 2

    .line 18
    new-instance v0, Lcom/ibotta/android/graphql/category/AutoValue_RetailerCategoriesGraphQLResponse$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/category/AutoValue_RetailerCategoriesGraphQLResponse$Builder;-><init>()V

    .line 19
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/category/AutoValue_RetailerCategoriesGraphQLResponse$Builder;->favoriteRetailers(Ljava/util/List;)Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse$Builder;

    move-result-object v0

    .line 20
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse$Builder;->retailerCategoryNodes(Ljava/util/List;)Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse$Builder;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract getFavoriteRetailers()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getRetailerCategoryNodes()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/RetailerCategoryNode;",
            ">;"
        }
    .end annotation
.end method
