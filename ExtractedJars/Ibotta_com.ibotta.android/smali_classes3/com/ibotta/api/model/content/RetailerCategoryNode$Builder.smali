.class public abstract Lcom/ibotta/api/model/content/RetailerCategoryNode$Builder;
.super Ljava/lang/Object;
.source "RetailerCategoryNode.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/content/RetailerCategoryNode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract build()Lcom/ibotta/api/model/content/RetailerCategoryNode;
.end method

.method public abstract category(Lcom/ibotta/api/model/retailer/Category;)Lcom/ibotta/api/model/content/RetailerCategoryNode$Builder;
.end method

.method public abstract featuredNode(Lcom/ibotta/api/model/content/FeaturedNode;)Lcom/ibotta/api/model/content/RetailerCategoryNode$Builder;
.end method

.method public abstract retailers(Ljava/util/List;)Lcom/ibotta/api/model/content/RetailerCategoryNode$Builder;
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
.end method
