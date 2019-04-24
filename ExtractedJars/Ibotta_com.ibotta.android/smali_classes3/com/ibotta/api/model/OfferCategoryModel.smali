.class public interface abstract Lcom/ibotta/api/model/OfferCategoryModel;
.super Ljava/lang/Object;
.source "OfferCategoryModel.java"


# virtual methods
.method public abstract getBuyableGiftCards()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BuyableGiftCardModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getCategoryType()Ljava/lang/String;
.end method

.method public abstract getCategoryTypeEnum()Lcom/ibotta/api/model/offer/CategoryType;
.end method

.method public abstract getContentIds()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getDeals()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/DealModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getDefaultViewState()Ljava/lang/String;
.end method

.method public abstract getEndTime()Ljava/lang/String;
.end method

.method public abstract getExpiration()Ljava/lang/String;
.end method

.method public abstract getIconUrl()Ljava/lang/String;
.end method

.method public abstract getId()I
.end method

.method public abstract getImageUrl()Ljava/lang/String;
.end method

.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract getNumPreviewItems()I
.end method

.method public abstract getOffers()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getRawCategoryType()Ljava/lang/String;
.end method

.method public abstract getRetailers()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getShortName()Ljava/lang/String;
.end method

.method public abstract getSortOrder()I
.end method

.method public abstract getStartTime()Ljava/lang/String;
.end method

.method public abstract getType()Ljava/lang/String;
.end method

.method public abstract isCollapsible()Z
.end method

.method public abstract isLaunch()Z
.end method

.method public abstract setBuyableGiftCards(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BuyableGiftCardModel;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setDeals(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/DealModel;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setOffers(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)V"
        }
    .end annotation
.end method
