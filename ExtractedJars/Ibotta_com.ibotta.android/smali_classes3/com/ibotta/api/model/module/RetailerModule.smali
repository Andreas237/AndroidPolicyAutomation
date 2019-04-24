.class public Lcom/ibotta/api/model/module/RetailerModule;
.super Lcom/ibotta/api/model/base/Module;
.source "RetailerModule.java"

# interfaces
.implements Lcom/ibotta/api/model/RetailerModel;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/ibotta/api/model/base/Module;-><init>()V

    return-void
.end method


# virtual methods
.method public getAllowedViewportEnums()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/api/model/RetailerModel$AllowedViewport;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getAllowedViewports()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getAnyBrandFullUrl()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getAnyBrandIconUrl()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getButtonInfo()Lcom/ibotta/api/model/retailer/ButtonInfo;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCardDescription()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCardDisplayBarcodeType()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCardEntryDesc()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCardHelpDescription()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCardHelpTitle()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCardIdType()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCardIdTypeEnum()Lcom/ibotta/api/model/RetailerModel$CardIdType;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCardInputType()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCardInputTypeEnum()Lcom/ibotta/api/model/RetailerModel$CardInputType;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCardLinkButtonText()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCardLinkText()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCardLinkTitle()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCardName()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCardNumberName()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCardScanBarcodeType()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCardScanBarcodeTypeEnum()Lcom/ibotta/api/model/common/BarcodeType;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCardSignupCompletionUrl()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCardSignupUrl()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCardValidationRegex()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCategoryIds()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCreditPendingPeriod()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCustomerLoyalty()Lcom/ibotta/api/model/customer/CustomerLoyalty;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getDasherizedName()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getDistance()Ljava/lang/Float;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getFavorite()Lcom/ibotta/api/model/customer/FavoriteRetailer;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getGalleryFeatures()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/FeatureModel;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getHomeSortOrder()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getHotness()D
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getIconUrl()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 33
    invoke-virtual {p0}, Lcom/ibotta/api/model/module/RetailerModule;->getRetailerId()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 34
    invoke-virtual {p0}, Lcom/ibotta/api/model/module/RetailerModule;->getRetailerId()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getIdString()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getLargeCardLogoUrl()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getLargeIconUrl()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getLink()Ljava/lang/String;
    .locals 1

    .line 51
    invoke-virtual {p0}, Lcom/ibotta/api/model/module/RetailerModule;->getMoreAction()Lcom/ibotta/api/model/content/Action;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 52
    invoke-virtual {p0}, Lcom/ibotta/api/model/module/RetailerModule;->getMoreAction()Lcom/ibotta/api/model/content/Action;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/api/model/content/Action;->getLink()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getModelCImageUrl()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getOfferCount()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getParentRetailerId()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getPercentCashBack()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public getPrimaryCategoryId()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getPwiHomeBannerImageUrl()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getReceiptFormatEnums()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/api/model/receipt/ReceiptFormat;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getReceiptFormats()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getRedemptionMeta()Lcom/ibotta/api/model/retailer/RedemptionMeta;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getResolvedCoords()Lcom/ibotta/api/model/retailer/ResolvedCoords;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getRetailerBarcodeConfiguration()Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getRetailerTerms()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getSecondaryCategoryId()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getShortDescription()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getSortData()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getSortOrder()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getSortResults()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/SortResultModel;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getStores()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Store;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getTypeEnum()Lcom/ibotta/api/model/ContentModel$Type;
    .locals 1

    .line 337
    sget-object v0, Lcom/ibotta/api/model/ContentModel$Type;->RETAILER:Lcom/ibotta/api/model/ContentModel$Type;

    return-object v0
.end method

.method public getTypedId()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getVerificationType()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getVerificationTypeEnum()Lcom/ibotta/api/model/common/VerificationType;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public isAnyBrand()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isAuxiliaryLoyaltyEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isBarcode()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isCredentialIntegration()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isDeviceOcrEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isDeviceOcrPreverify()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isFeatured()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isHomeFeatured()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isNearby()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isReceiptFallbackEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public setCustomerLoyalty(Lcom/ibotta/api/model/customer/CustomerLoyalty;)V
    .locals 0

    return-void
.end method

.method public setDistance(Ljava/lang/Float;)V
    .locals 0

    return-void
.end method

.method public setLink(Ljava/lang/String;)V
    .locals 0

    return-void
.end method
