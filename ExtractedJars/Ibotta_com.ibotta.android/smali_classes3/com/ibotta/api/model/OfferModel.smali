.class public interface abstract Lcom/ibotta/api/model/OfferModel;
.super Ljava/lang/Object;
.source "OfferModel.java"

# interfaces
.implements Lcom/ibotta/api/ContentEventTrackable;
.implements Lcom/ibotta/api/Likable;
.implements Lcom/ibotta/api/model/ContentModel;
.implements Lcom/ibotta/api/model/base/Routable;
.implements Lcom/ibotta/api/model/offer/ScanMetaCriteria;


# virtual methods
.method public abstract getAbout()Ljava/lang/String;
.end method

.method public abstract getAboutTitle()Ljava/lang/String;
.end method

.method public abstract getAlternateText()Ljava/lang/String;
.end method

.method public abstract getAmount()F
.end method

.method public abstract getAvailableAtRetailers()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getBonusIds()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getButtonInfo()Lcom/ibotta/api/model/retailer/ButtonInfo;
.end method

.method public abstract getCaption()Ljava/lang/String;
.end method

.method public abstract getCategories()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/Category;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getContextSortData()Lcom/ibotta/api/model/offer/ContextSortData;
.end method

.method public abstract getCurrentValue()Ljava/lang/String;
.end method

.method public abstract getDescription()Ljava/lang/String;
.end method

.method public abstract getDigitalProducts()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/DigitalProduct;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getEarnedAmount()F
.end method

.method public abstract getExpiration()Ljava/util/Date;
.end method

.method public abstract getHotness()Ljava/lang/Float;
.end method

.method public abstract getLargeUrl()Ljava/lang/String;
.end method

.method public abstract getLegal()Ljava/lang/String;
.end method

.method public abstract getMultiplesCount()S
.end method

.method public abstract getNonItemTotal()F
.end method

.method public abstract getOfferAmountType()Lcom/ibotta/api/model/offer/OfferAmountType;
.end method

.method public abstract getOfferGroupId()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getOfferSegmentId()I
.end method

.method public abstract getOfferTags()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/OfferTag;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getOfferType()Ljava/lang/String;
.end method

.method public abstract getOfferTypeEnum()Lcom/ibotta/api/model/offer/OfferType;
.end method

.method public abstract getOldValue()Ljava/lang/String;
.end method

.method public abstract getPercentBack()Ljava/lang/Float;
.end method

.method public abstract getProductGroups()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/ProductGroup;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getPurchaseType()Ljava/lang/String;
.end method

.method public abstract getPurchaseTypeEnum()Lcom/ibotta/api/model/common/VerificationType;
.end method

.method public abstract getReceiptTotal()F
.end method

.method public abstract getRecommendationScore()F
.end method

.method public abstract getRetailerCategories()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
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

.method public abstract getRewards()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RewardModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getSegmentId()I
.end method

.method public abstract getShareUrl()Ljava/lang/String;
.end method

.method public abstract getTerms()Ljava/lang/String;
.end method

.method public abstract getThumbUrl()Ljava/lang/String;
.end method

.method public abstract getUrl()Ljava/lang/String;
.end method

.method public abstract getVariablePercentBack()Ljava/lang/String;
.end method

.method public abstract getVerifiedCount()I
.end method

.method public abstract hasBonuses()Z
.end method

.method public abstract isActivated()Z
.end method

.method public abstract isBlockCustomerSubmittedUpcs()Z
.end method

.method public abstract isCombo()Z
.end method

.method public abstract isExpiringSoon()Z
.end method

.method public abstract isHideAvailableAt()Z
.end method

.method public abstract isIgnoreBarcode()Z
.end method

.method public abstract isNewFlag()Z
.end method

.method public abstract isNonItem()Z
.end method

.method public abstract isPreselect()Z
.end method

.method public abstract isSelfFunded()Z
.end method

.method public abstract isVerified()Z
.end method

.method public abstract setActivated(Z)V
.end method

.method public abstract setAlternateText(Ljava/lang/String;)V
.end method

.method public abstract setAmount(F)V
.end method

.method public abstract setCategories(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/Category;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setHotness(Ljava/lang/Float;)V
.end method

.method public abstract setOfferType(Ljava/lang/String;)V
.end method

.method public abstract setProductGroups(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/ProductGroup;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setProducts(Ljava/util/Set;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method
