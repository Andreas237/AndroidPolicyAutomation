.class public interface abstract Lcom/ibotta/api/helper/offer/OfferCategoryHelper;
.super Ljava/lang/Object;
.source "OfferCategoryHelper.java"


# virtual methods
.method public abstract dedupeOffersAcrossCategories(Ljava/util/List;)Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            ">;)",
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract findById(Ljava/util/List;I)Lcom/ibotta/api/model/OfferCategoryModel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            ">;I)",
            "Lcom/ibotta/api/model/OfferCategoryModel;"
        }
    .end annotation
.end method

.method public abstract removeSelfFundedOffers(Ljava/util/List;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            ">;"
        }
    .end annotation
.end method
