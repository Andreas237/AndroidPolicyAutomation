.class public interface abstract Lcom/ibotta/api/model/RetailerModel;
.super Ljava/lang/Object;
.source "RetailerModel.java"

# interfaces
.implements Lcom/ibotta/api/ContentEventTrackable;
.implements Lcom/ibotta/api/ModuleEventTrackable;
.implements Lcom/ibotta/api/model/ContentModel;
.implements Lcom/ibotta/api/model/base/Routable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/RetailerModel$AllowedViewport;,
        Lcom/ibotta/api/model/RetailerModel$CardThemeType;,
        Lcom/ibotta/api/model/RetailerModel$CardInputType;,
        Lcom/ibotta/api/model/RetailerModel$CardIdType;
    }
.end annotation


# virtual methods
.method public abstract getAllowedViewportEnums()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/api/model/RetailerModel$AllowedViewport;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getAllowedViewports()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getAnyBrandFullUrl()Ljava/lang/String;
.end method

.method public abstract getAnyBrandIconUrl()Ljava/lang/String;
.end method

.method public abstract getButtonInfo()Lcom/ibotta/api/model/retailer/ButtonInfo;
.end method

.method public abstract getCardDescription()Ljava/lang/String;
.end method

.method public abstract getCardDisplayBarcodeType()Ljava/lang/String;
.end method

.method public abstract getCardEntryDesc()Ljava/lang/String;
.end method

.method public abstract getCardHelpDescription()Ljava/lang/String;
.end method

.method public abstract getCardHelpTitle()Ljava/lang/String;
.end method

.method public abstract getCardIdType()Ljava/lang/String;
.end method

.method public abstract getCardIdTypeEnum()Lcom/ibotta/api/model/RetailerModel$CardIdType;
.end method

.method public abstract getCardInputType()Ljava/lang/String;
.end method

.method public abstract getCardInputTypeEnum()Lcom/ibotta/api/model/RetailerModel$CardInputType;
.end method

.method public abstract getCardLinkButtonText()Ljava/lang/String;
.end method

.method public abstract getCardLinkText()Ljava/lang/String;
.end method

.method public abstract getCardLinkTitle()Ljava/lang/String;
.end method

.method public abstract getCardName()Ljava/lang/String;
.end method

.method public abstract getCardNumberName()Ljava/lang/String;
.end method

.method public abstract getCardScanBarcodeType()Ljava/lang/String;
.end method

.method public abstract getCardScanBarcodeTypeEnum()Lcom/ibotta/api/model/common/BarcodeType;
.end method

.method public abstract getCardSignupCompletionUrl()Ljava/lang/String;
.end method

.method public abstract getCardSignupUrl()Ljava/lang/String;
.end method

.method public abstract getCardValidationRegex()Ljava/lang/String;
.end method

.method public abstract getCategoryIds()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getCreditPendingPeriod()Ljava/lang/String;
.end method

.method public abstract getCustomerLoyalty()Lcom/ibotta/api/model/customer/CustomerLoyalty;
.end method

.method public abstract getDasherizedName()Ljava/lang/String;
.end method

.method public abstract getDistance()Ljava/lang/Float;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getDynamicContentId()Ljava/lang/Integer;
.end method

.method public abstract getFavorite()Lcom/ibotta/api/model/customer/FavoriteRetailer;
.end method

.method public abstract getGalleryFeatures()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/FeatureModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getHomeSortOrder()I
.end method

.method public abstract getHotness()D
.end method

.method public abstract getIconUrl()Ljava/lang/String;
.end method

.method public abstract getId()I
.end method

.method public abstract getLargeCardLogoUrl()Ljava/lang/String;
.end method

.method public abstract getLargeIconUrl()Ljava/lang/String;
.end method

.method public abstract getMenuActionsAsActionables()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/base/Actionable;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getModelCImageUrl()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getMoreAction()Lcom/ibotta/api/model/content/Action;
.end method

.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract getOfferCount()I
.end method

.method public abstract getParentRetailerId()I
.end method

.method public abstract getPercentCashBack()Ljava/lang/String;
.end method

.method public abstract getPrimaryCategoryId()I
.end method

.method public abstract getPwiHomeBannerImageUrl()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getReceiptFormatEnums()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/api/model/receipt/ReceiptFormat;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getReceiptFormats()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getRedemptionMeta()Lcom/ibotta/api/model/retailer/RedemptionMeta;
.end method

.method public abstract getResolvedCoords()Lcom/ibotta/api/model/retailer/ResolvedCoords;
.end method

.method public abstract getRetailerBarcodeConfiguration()Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;
.end method

.method public abstract getRetailerTerms()Ljava/lang/String;
.end method

.method public abstract getSecondaryCategoryId()I
.end method

.method public abstract getShortDescription()Ljava/lang/String;
.end method

.method public abstract getSortData()Ljava/lang/String;
.end method

.method public abstract getSortOrder()Ljava/lang/String;
.end method

.method public abstract getSortResults()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/SortResultModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getStores()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Store;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getUrl()Ljava/lang/String;
.end method

.method public abstract getVerificationType()Ljava/lang/String;
.end method

.method public abstract getVerificationTypeEnum()Lcom/ibotta/api/model/common/VerificationType;
.end method

.method public abstract isAnyBrand()Z
.end method

.method public abstract isAuxiliaryLoyaltyEnabled()Z
.end method

.method public abstract isBarcode()Z
.end method

.method public abstract isCredentialIntegration()Z
.end method

.method public abstract isDeviceOcrEnabled()Z
.end method

.method public abstract isDeviceOcrPreverify()Z
.end method

.method public abstract isFeatured()Z
.end method

.method public abstract isHomeFeatured()Z
.end method

.method public abstract isNearby()Z
.end method

.method public abstract isReceiptFallbackEnabled()Z
.end method

.method public abstract setCustomerLoyalty(Lcom/ibotta/api/model/customer/CustomerLoyalty;)V
.end method

.method public abstract setDistance(Ljava/lang/Float;)V
    .param p1    # Ljava/lang/Float;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setName(Ljava/lang/String;)V
.end method
