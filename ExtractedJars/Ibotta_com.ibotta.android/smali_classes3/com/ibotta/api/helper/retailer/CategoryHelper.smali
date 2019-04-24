.class public interface abstract Lcom/ibotta/api/helper/retailer/CategoryHelper;
.super Ljava/lang/Object;
.source "CategoryHelper.java"


# virtual methods
.method public abstract findById(Ljava/util/List;I)Lcom/ibotta/api/model/retailer/Category;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Category;",
            ">;I)",
            "Lcom/ibotta/api/model/retailer/Category;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract findByType(Ljava/util/List;Lcom/ibotta/api/model/retailer/CategoryType;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Category;",
            ">;",
            "Lcom/ibotta/api/model/retailer/CategoryType;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Category;",
            ">;"
        }
    .end annotation
.end method

.method public abstract findFirstByType(Ljava/util/List;Lcom/ibotta/api/model/retailer/CategoryType;)Lcom/ibotta/api/model/retailer/Category;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Category;",
            ">;",
            "Lcom/ibotta/api/model/retailer/CategoryType;",
            ")",
            "Lcom/ibotta/api/model/retailer/Category;"
        }
    .end annotation
.end method
