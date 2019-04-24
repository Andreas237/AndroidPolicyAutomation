.class public abstract Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse$Builder;
.super Ljava/lang/Object;
.source "RetailerCategoriesGraphQLResponse.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract build()Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse;
.end method

.method public abstract favoriteRetailers(Ljava/util/List;)Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse$Builder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)",
            "Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse$Builder;"
        }
    .end annotation
.end method

.method public abstract retailerCategoryNodes(Ljava/util/List;)Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse$Builder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/RetailerCategoryNode;",
            ">;)",
            "Lcom/ibotta/android/graphql/category/RetailerCategoriesGraphQLResponse$Builder;"
        }
    .end annotation
.end method
