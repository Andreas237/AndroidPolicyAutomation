.class final Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode;
.super Lcom/ibotta/api/model/content/RetailerCategoryNode;
.source "AutoValue_RetailerCategoryNode.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode$Builder;
    }
.end annotation


# instance fields
.field private final category:Lcom/ibotta/api/model/retailer/Category;

.field private final featuredNode:Lcom/ibotta/api/model/content/FeaturedNode;

.field private final retailers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/ibotta/api/model/retailer/Category;Ljava/util/List;Lcom/ibotta/api/model/content/FeaturedNode;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/retailer/Category;",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Lcom/ibotta/api/model/content/FeaturedNode;",
            ")V"
        }
    .end annotation

    .line 20
    invoke-direct {p0}, Lcom/ibotta/api/model/content/RetailerCategoryNode;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode;->category:Lcom/ibotta/api/model/retailer/Category;

    .line 22
    iput-object p2, p0, Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode;->retailers:Ljava/util/List;

    .line 23
    iput-object p3, p0, Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode;->featuredNode:Lcom/ibotta/api/model/content/FeaturedNode;

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/api/model/retailer/Category;Ljava/util/List;Lcom/ibotta/api/model/content/FeaturedNode;Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode$1;)V
    .locals 0

    .line 11
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode;-><init>(Lcom/ibotta/api/model/retailer/Category;Ljava/util/List;Lcom/ibotta/api/model/content/FeaturedNode;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 55
    :cond_0
    instance-of v1, p1, Lcom/ibotta/api/model/content/RetailerCategoryNode;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 56
    check-cast p1, Lcom/ibotta/api/model/content/RetailerCategoryNode;

    .line 57
    iget-object v1, p0, Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode;->category:Lcom/ibotta/api/model/retailer/Category;

    invoke-virtual {p1}, Lcom/ibotta/api/model/content/RetailerCategoryNode;->getCategory()Lcom/ibotta/api/model/retailer/Category;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ibotta/api/model/retailer/Category;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode;->retailers:Ljava/util/List;

    .line 58
    invoke-virtual {p1}, Lcom/ibotta/api/model/content/RetailerCategoryNode;->getRetailers()Ljava/util/List;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode;->featuredNode:Lcom/ibotta/api/model/content/FeaturedNode;

    .line 59
    invoke-virtual {p1}, Lcom/ibotta/api/model/content/RetailerCategoryNode;->getFeaturedNode()Lcom/ibotta/api/model/content/FeaturedNode;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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

.method public getCategory()Lcom/ibotta/api/model/retailer/Category;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode;->category:Lcom/ibotta/api/model/retailer/Category;

    return-object v0
.end method

.method public getFeaturedNode()Lcom/ibotta/api/model/content/FeaturedNode;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode;->featuredNode:Lcom/ibotta/api/model/content/FeaturedNode;

    return-object v0
.end method

.method public getRetailers()Ljava/util/List;
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

    .line 33
    iget-object v0, p0, Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode;->retailers:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 68
    iget-object v0, p0, Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode;->category:Lcom/ibotta/api/model/retailer/Category;

    invoke-virtual {v0}, Lcom/ibotta/api/model/retailer/Category;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 70
    iget-object v2, p0, Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode;->retailers:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 72
    iget-object v1, p0, Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode;->featuredNode:Lcom/ibotta/api/model/content/FeaturedNode;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RetailerCategoryNode{category="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode;->category:Lcom/ibotta/api/model/retailer/Category;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", retailers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode;->retailers:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", featuredNode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode;->featuredNode:Lcom/ibotta/api/model/content/FeaturedNode;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
