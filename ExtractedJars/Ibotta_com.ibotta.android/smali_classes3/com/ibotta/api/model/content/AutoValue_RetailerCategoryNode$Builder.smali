.class final Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode$Builder;
.super Lcom/ibotta/api/model/content/RetailerCategoryNode$Builder;
.source "AutoValue_RetailerCategoryNode.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private category:Lcom/ibotta/api/model/retailer/Category;

.field private featuredNode:Lcom/ibotta/api/model/content/FeaturedNode;

.field private retailers:Ljava/util/List;
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
.method constructor <init>()V
    .locals 0

    .line 80
    invoke-direct {p0}, Lcom/ibotta/api/model/content/RetailerCategoryNode$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/api/model/content/RetailerCategoryNode;
    .locals 5

    const-string v0, ""

    .line 109
    iget-object v1, p0, Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode$Builder;->category:Lcom/ibotta/api/model/retailer/Category;

    if-nez v1, :cond_0

    .line 110
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " category"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 112
    :cond_0
    iget-object v1, p0, Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode$Builder;->retailers:Ljava/util/List;

    if-nez v1, :cond_1

    .line 113
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " retailers"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 115
    :cond_1
    iget-object v1, p0, Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode$Builder;->featuredNode:Lcom/ibotta/api/model/content/FeaturedNode;

    if-nez v1, :cond_2

    .line 116
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " featuredNode"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 118
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 121
    new-instance v0, Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode;

    iget-object v1, p0, Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode$Builder;->category:Lcom/ibotta/api/model/retailer/Category;

    iget-object v2, p0, Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode$Builder;->retailers:Ljava/util/List;

    iget-object v3, p0, Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode$Builder;->featuredNode:Lcom/ibotta/api/model/content/FeaturedNode;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode;-><init>(Lcom/ibotta/api/model/retailer/Category;Ljava/util/List;Lcom/ibotta/api/model/content/FeaturedNode;Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode$1;)V

    return-object v0

    .line 119
    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public category(Lcom/ibotta/api/model/retailer/Category;)Lcom/ibotta/api/model/content/RetailerCategoryNode$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 87
    iput-object p1, p0, Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode$Builder;->category:Lcom/ibotta/api/model/retailer/Category;

    return-object p0

    .line 85
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null category"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public featuredNode(Lcom/ibotta/api/model/content/FeaturedNode;)Lcom/ibotta/api/model/content/RetailerCategoryNode$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 103
    iput-object p1, p0, Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode$Builder;->featuredNode:Lcom/ibotta/api/model/content/FeaturedNode;

    return-object p0

    .line 101
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null featuredNode"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public retailers(Ljava/util/List;)Lcom/ibotta/api/model/content/RetailerCategoryNode$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)",
            "Lcom/ibotta/api/model/content/RetailerCategoryNode$Builder;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 95
    iput-object p1, p0, Lcom/ibotta/api/model/content/AutoValue_RetailerCategoryNode$Builder;->retailers:Ljava/util/List;

    return-object p0

    .line 93
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null retailers"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
