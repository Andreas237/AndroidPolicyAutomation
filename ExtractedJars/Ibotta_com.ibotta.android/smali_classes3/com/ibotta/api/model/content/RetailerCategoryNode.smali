.class public abstract Lcom/ibotta/api/model/content/RetailerCategoryNode;
.super Ljava/lang/Object;
.source "RetailerCategoryNode.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/content/RetailerCategoryNode$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/api/model/content/RetailerCategoryNode$Builder;
    .locals 2

    .line 18
    new-instance v0, Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode$Builder;

    invoke-direct {v0}, Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode$Builder;-><init>()V

    new-instance v1, Lcom/ibotta/api/model/retailer/Category;

    invoke-direct {v1}, Lcom/ibotta/api/model/retailer/Category;-><init>()V

    .line 19
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode$Builder;->category(Lcom/ibotta/api/model/retailer/Category;)Lcom/ibotta/api/model/content/RetailerCategoryNode$Builder;

    move-result-object v0

    .line 20
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerCategoryNode$Builder;->retailers(Ljava/util/List;)Lcom/ibotta/api/model/content/RetailerCategoryNode$Builder;

    move-result-object v0

    .line 21
    invoke-static {}, Lcom/ibotta/api/model/content/FeaturedNode;->builder()Lcom/ibotta/api/model/content/FeaturedNode$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/content/FeaturedNode$Builder;->build()Lcom/ibotta/api/model/content/FeaturedNode;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerCategoryNode$Builder;->featuredNode(Lcom/ibotta/api/model/content/FeaturedNode;)Lcom/ibotta/api/model/content/RetailerCategoryNode$Builder;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract getCategory()Lcom/ibotta/api/model/retailer/Category;
.end method

.method public abstract getFeaturedNode()Lcom/ibotta/api/model/content/FeaturedNode;
.end method

.method public abstract getRetailers()Ljava/util/List;
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
