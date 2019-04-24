.class public Lcom/ibotta/api/model/content/RetailerContent;
.super Lcom/ibotta/api/model/base/BaseContent;
.source "RetailerContent.java"

# interfaces
.implements Lcom/ibotta/api/model/RetailerModel;


# instance fields
.field private transient allowedViewportEnums:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/ibotta/api/model/RetailerModel$AllowedViewport;",
            ">;"
        }
    .end annotation
.end field

.field private allowedViewports:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private anyBrand:Z

.field private anyBrandFullUrl:Ljava/lang/String;

.field private anyBrandIconUrl:Ljava/lang/String;

.field private auxiliaryLoyaltyEnabled:Z

.field private barcode:Z

.field private buttonInfo:Lcom/ibotta/api/model/retailer/ButtonInfo;

.field private cardDescription:Ljava/lang/String;

.field private cardDisplayBarcodeType:Ljava/lang/String;

.field private cardEntryDesc:Ljava/lang/String;

.field private cardHelpDescription:Ljava/lang/String;

.field private cardHelpTitle:Ljava/lang/String;

.field private cardIdType:Ljava/lang/String;

.field private transient cardIdTypeEnum:Lcom/ibotta/api/model/RetailerModel$CardIdType;

.field private cardInputType:Ljava/lang/String;

.field private transient cardInputTypeEnum:Lcom/ibotta/api/model/RetailerModel$CardInputType;

.field private cardLinkButtonText:Ljava/lang/String;

.field private cardLinkText:Ljava/lang/String;

.field private cardLinkTitle:Ljava/lang/String;

.field private cardName:Ljava/lang/String;

.field private cardNumberName:Ljava/lang/String;

.field private cardScanBarcodeType:Ljava/lang/String;

.field private cardSignupCompletionUrl:Ljava/lang/String;

.field private cardSignupUrl:Ljava/lang/String;

.field private cardValidationRegex:Ljava/lang/String;

.field private categoryIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private credentialIntegration:Z

.field private creditPendingPeriod:Ljava/lang/String;

.field private customerLoyalty:Lcom/ibotta/api/model/customer/CustomerLoyalty;

.field private dasherizedName:Ljava/lang/String;

.field private deviceOcrEnabled:Z

.field private distance:Ljava/lang/Float;

.field private dynamicContentId:Ljava/lang/Integer;

.field private favorite:Lcom/ibotta/api/model/customer/FavoriteRetailer;

.field private featured:Z

.field private galleryFeatures:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
        contentAs = Lcom/ibotta/api/model/content/FeatureContent;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/FeatureModel;",
            ">;"
        }
    .end annotation
.end field

.field private homeFeatured:Z

.field private homeSortOrder:I

.field private hotness:D

.field private iconUrl:Ljava/lang/String;

.field private largeCardLogoUrl:Ljava/lang/String;

.field private largeIconUrl:Ljava/lang/String;

.field private link:Ljava/lang/String;

.field private menuActions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/Action;",
            ">;"
        }
    .end annotation
.end field

.field private modelCImageUrl:Ljava/lang/String;

.field private moreAction:Lcom/ibotta/api/model/content/Action;

.field private name:Ljava/lang/String;

.field private nearby:Z

.field private offerCount:I

.field private parentRetailerId:I

.field private percentCashBack:Ljava/lang/String;

.field private primaryCategoryId:I

.field private pwiHomeBannerImageUrl:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private receiptFallbackEnabled:Z

.field private receiptFormatEnums:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/ibotta/api/model/receipt/ReceiptFormat;",
            ">;"
        }
    .end annotation
.end field

.field private receiptFormats:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private redemptionMeta:Lcom/ibotta/api/model/retailer/RedemptionMeta;

.field private resolvedCoords:Lcom/ibotta/api/model/retailer/ResolvedCoords;

.field private retailerBarcodeConfiguration:Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;

.field private retailerTerms:Ljava/lang/String;

.field private secondaryCategoryId:I

.field private shortDescription:Ljava/lang/String;

.field private sortData:Ljava/lang/String;

.field private sortOrder:Ljava/lang/String;

.field private sortResults:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/SortResultModel;",
            ">;"
        }
    .end annotation
.end field

.field private stores:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Store;",
            ">;"
        }
    .end annotation
.end field

.field private url:Ljava/lang/String;

.field private verificationType:Ljava/lang/String;

.field private transient verificationTypeEnum:Lcom/ibotta/api/model/common/VerificationType;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Lcom/ibotta/api/model/base/BaseContent;-><init>()V

    .line 100
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->allowedViewports:Ljava/util/Set;

    .line 101
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->allowedViewportEnums:Ljava/util/Set;

    .line 103
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->galleryFeatures:Ljava/util/List;

    .line 105
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->menuActions:Ljava/util/List;

    .line 106
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->receiptFormats:Ljava/util/Set;

    .line 107
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->receiptFormatEnums:Ljava/util/Set;

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

    .line 655
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->allowedViewportEnums:Ljava/util/Set;

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

    .line 646
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->allowedViewports:Ljava/util/Set;

    return-object v0
.end method

.method public getAnyBrandFullUrl()Ljava/lang/String;
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->anyBrandFullUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getAnyBrandIconUrl()Ljava/lang/String;
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->anyBrandIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getButtonInfo()Lcom/ibotta/api/model/retailer/ButtonInfo;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->buttonInfo:Lcom/ibotta/api/model/retailer/ButtonInfo;

    return-object v0
.end method

.method public getCardDescription()Ljava/lang/String;
    .locals 1

    .line 161
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardDescription:Ljava/lang/String;

    return-object v0
.end method

.method public getCardDisplayBarcodeType()Ljava/lang/String;
    .locals 1

    .line 170
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardDisplayBarcodeType:Ljava/lang/String;

    return-object v0
.end method

.method public getCardEntryDesc()Ljava/lang/String;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardEntryDesc:Ljava/lang/String;

    return-object v0
.end method

.method public getCardHelpDescription()Ljava/lang/String;
    .locals 1

    .line 188
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardHelpDescription:Ljava/lang/String;

    return-object v0
.end method

.method public getCardHelpTitle()Ljava/lang/String;
    .locals 1

    .line 197
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardHelpTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getCardIdType()Ljava/lang/String;
    .locals 1

    .line 206
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardIdType:Ljava/lang/String;

    return-object v0
.end method

.method public getCardIdTypeEnum()Lcom/ibotta/api/model/RetailerModel$CardIdType;
    .locals 1

    .line 216
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardIdTypeEnum:Lcom/ibotta/api/model/RetailerModel$CardIdType;

    if-eqz v0, :cond_0

    return-object v0

    .line 219
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardIdType:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/RetailerModel$CardIdType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/RetailerModel$CardIdType;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardIdTypeEnum:Lcom/ibotta/api/model/RetailerModel$CardIdType;

    .line 220
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardIdTypeEnum:Lcom/ibotta/api/model/RetailerModel$CardIdType;

    return-object v0
.end method

.method public getCardInputType()Ljava/lang/String;
    .locals 1

    .line 229
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardInputType:Ljava/lang/String;

    return-object v0
.end method

.method public getCardInputTypeEnum()Lcom/ibotta/api/model/RetailerModel$CardInputType;
    .locals 1

    .line 239
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardInputTypeEnum:Lcom/ibotta/api/model/RetailerModel$CardInputType;

    if-eqz v0, :cond_0

    return-object v0

    .line 242
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardInputType:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/RetailerModel$CardInputType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/RetailerModel$CardInputType;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardInputTypeEnum:Lcom/ibotta/api/model/RetailerModel$CardInputType;

    .line 243
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardInputTypeEnum:Lcom/ibotta/api/model/RetailerModel$CardInputType;

    return-object v0
.end method

.method public getCardLinkButtonText()Ljava/lang/String;
    .locals 1

    .line 252
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardLinkButtonText:Ljava/lang/String;

    return-object v0
.end method

.method public getCardLinkText()Ljava/lang/String;
    .locals 1

    .line 261
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardLinkText:Ljava/lang/String;

    return-object v0
.end method

.method public getCardLinkTitle()Ljava/lang/String;
    .locals 1

    .line 270
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardLinkTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getCardName()Ljava/lang/String;
    .locals 1

    .line 279
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardName:Ljava/lang/String;

    return-object v0
.end method

.method public getCardNumberName()Ljava/lang/String;
    .locals 1

    .line 288
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardNumberName:Ljava/lang/String;

    return-object v0
.end method

.method public getCardScanBarcodeType()Ljava/lang/String;
    .locals 1

    .line 297
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardScanBarcodeType:Ljava/lang/String;

    return-object v0
.end method

.method public getCardScanBarcodeTypeEnum()Lcom/ibotta/api/model/common/BarcodeType;
    .locals 1

    .line 306
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardScanBarcodeType:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/common/BarcodeType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/common/BarcodeType;

    move-result-object v0

    return-object v0
.end method

.method public getCardSignupCompletionUrl()Ljava/lang/String;
    .locals 1

    .line 343
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardSignupCompletionUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getCardSignupUrl()Ljava/lang/String;
    .locals 1

    .line 311
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardSignupUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getCardValidationRegex()Ljava/lang/String;
    .locals 1

    .line 352
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardValidationRegex:Ljava/lang/String;

    return-object v0
.end method

.method public getCategoryIds()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 665
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->categoryIds:Ljava/util/Set;

    if-nez v0, :cond_1

    .line 666
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->categoryIds:Ljava/util/Set;

    .line 668
    iget v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->primaryCategoryId:I

    if-lez v0, :cond_0

    .line 669
    iget-object v1, p0, Lcom/ibotta/api/model/content/RetailerContent;->categoryIds:Ljava/util/Set;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 672
    :cond_0
    iget v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->secondaryCategoryId:I

    if-lez v0, :cond_1

    .line 673
    iget-object v1, p0, Lcom/ibotta/api/model/content/RetailerContent;->categoryIds:Ljava/util/Set;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 677
    :cond_1
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->categoryIds:Ljava/util/Set;

    return-object v0
.end method

.method public getCreditPendingPeriod()Ljava/lang/String;
    .locals 1

    .line 361
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->creditPendingPeriod:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomerLoyalty()Lcom/ibotta/api/model/customer/CustomerLoyalty;
    .locals 1

    .line 370
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->customerLoyalty:Lcom/ibotta/api/model/customer/CustomerLoyalty;

    return-object v0
.end method

.method public getDasherizedName()Ljava/lang/String;
    .locals 1

    .line 380
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->dasherizedName:Ljava/lang/String;

    return-object v0
.end method

.method public getDistance()Ljava/lang/Float;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 389
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->distance:Ljava/lang/Float;

    return-object v0
.end method

.method public getDynamicContentId()Ljava/lang/Integer;
    .locals 1

    .line 398
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->dynamicContentId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getFavorite()Lcom/ibotta/api/model/customer/FavoriteRetailer;
    .locals 1

    .line 407
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->favorite:Lcom/ibotta/api/model/customer/FavoriteRetailer;

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

    .line 686
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->galleryFeatures:Ljava/util/List;

    return-object v0
.end method

.method public getHomeSortOrder()I
    .locals 1

    .line 434
    iget v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->homeSortOrder:I

    return v0
.end method

.method public getHotness()D
    .locals 2

    .line 443
    iget-wide v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->hotness:D

    return-wide v0
.end method

.method public getIconUrl()Ljava/lang/String;
    .locals 1

    .line 452
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getLargeCardLogoUrl()Ljava/lang/String;
    .locals 1

    .line 470
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->largeCardLogoUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getLargeIconUrl()Ljava/lang/String;
    .locals 1

    .line 461
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->largeIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getLink()Ljava/lang/String;
    .locals 1

    .line 755
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->link:Ljava/lang/String;

    return-object v0
.end method

.method public getMenuActions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/Action;",
            ">;"
        }
    .end annotation

    .line 703
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->menuActions:Ljava/util/List;

    return-object v0
.end method

.method public getMenuActionsAsActionables()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/base/Actionable;",
            ">;"
        }
    .end annotation

    .line 695
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->menuActions:Ljava/util/List;

    if-nez v0, :cond_0

    .line 696
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 698
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v1
.end method

.method public getModelCImageUrl()Ljava/lang/String;
    .locals 1

    .line 765
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->modelCImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getMoreAction()Lcom/ibotta/api/model/content/Action;
    .locals 1

    .line 479
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->moreAction:Lcom/ibotta/api/model/content/Action;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 488
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getOfferCount()I
    .locals 1

    .line 523
    iget v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->offerCount:I

    return v0
.end method

.method public getParentRetailerId()I
    .locals 1

    .line 506
    iget v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->parentRetailerId:I

    return v0
.end method

.method public getPercentCashBack()Ljava/lang/String;
    .locals 1

    .line 783
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->percentCashBack:Ljava/lang/String;

    return-object v0
.end method

.method public getPrimaryCategoryId()I
    .locals 1

    .line 515
    iget v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->primaryCategoryId:I

    return v0
.end method

.method public getPwiHomeBannerImageUrl()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 774
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->pwiHomeBannerImageUrl:Ljava/lang/String;

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

    .line 721
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->receiptFormatEnums:Ljava/util/Set;

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

    .line 712
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->receiptFormats:Ljava/util/Set;

    return-object v0
.end method

.method public getRedemptionMeta()Lcom/ibotta/api/model/retailer/RedemptionMeta;
    .locals 1

    .line 532
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->redemptionMeta:Lcom/ibotta/api/model/retailer/RedemptionMeta;

    return-object v0
.end method

.method public getResolvedCoords()Lcom/ibotta/api/model/retailer/ResolvedCoords;
    .locals 1

    .line 541
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->resolvedCoords:Lcom/ibotta/api/model/retailer/ResolvedCoords;

    return-object v0
.end method

.method public getRetailerBarcodeConfiguration()Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;
    .locals 1

    .line 550
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->retailerBarcodeConfiguration:Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;

    return-object v0
.end method

.method public getRetailerTerms()Ljava/lang/String;
    .locals 1

    .line 560
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->retailerTerms:Ljava/lang/String;

    return-object v0
.end method

.method public getSecondaryCategoryId()I
    .locals 1

    .line 569
    iget v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->secondaryCategoryId:I

    return v0
.end method

.method public getShortDescription()Ljava/lang/String;
    .locals 1

    .line 578
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->shortDescription:Ljava/lang/String;

    return-object v0
.end method

.method public getSortData()Ljava/lang/String;
    .locals 1

    .line 587
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->sortData:Ljava/lang/String;

    return-object v0
.end method

.method public getSortOrder()Ljava/lang/String;
    .locals 1

    .line 605
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->sortOrder:Ljava/lang/String;

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

    .line 596
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->sortResults:Ljava/util/List;

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

    .line 730
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->stores:Ljava/util/List;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 614
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->url:Ljava/lang/String;

    return-object v0
.end method

.method public getVerificationType()Ljava/lang/String;
    .locals 1

    .line 623
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->verificationType:Ljava/lang/String;

    return-object v0
.end method

.method public getVerificationTypeEnum()Lcom/ibotta/api/model/common/VerificationType;
    .locals 1

    .line 633
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->verificationTypeEnum:Lcom/ibotta/api/model/common/VerificationType;

    if-eqz v0, :cond_0

    return-object v0

    .line 636
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->verificationType:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/common/VerificationType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->verificationTypeEnum:Lcom/ibotta/api/model/common/VerificationType;

    .line 637
    iget-object v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->verificationTypeEnum:Lcom/ibotta/api/model/common/VerificationType;

    return-object v0
.end method

.method public isAnyBrand()Z
    .locals 1

    .line 116
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->anyBrand:Z

    return v0
.end method

.method public isAuxiliaryLoyaltyEnabled()Z
    .locals 1

    .line 325
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->auxiliaryLoyaltyEnabled:Z

    return v0
.end method

.method public isBarcode()Z
    .locals 1

    .line 143
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->barcode:Z

    return v0
.end method

.method public isCredentialIntegration()Z
    .locals 1

    .line 316
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->credentialIntegration:Z

    return v0
.end method

.method public isDeviceOcrEnabled()Z
    .locals 1

    .line 739
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->deviceOcrEnabled:Z

    return v0
.end method

.method public isDeviceOcrPreverify()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isFeatured()Z
    .locals 1

    .line 416
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->featured:Z

    return v0
.end method

.method public isHomeFeatured()Z
    .locals 1

    .line 425
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->homeFeatured:Z

    return v0
.end method

.method public isNearby()Z
    .locals 1

    .line 497
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->nearby:Z

    return v0
.end method

.method public isReceiptFallbackEnabled()Z
    .locals 1

    .line 334
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/RetailerContent;->receiptFallbackEnabled:Z

    return v0
.end method

.method public setAllowedViewportEnums(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/ibotta/api/model/RetailerModel$AllowedViewport;",
            ">;)V"
        }
    .end annotation

    .line 660
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->allowedViewportEnums:Ljava/util/Set;

    return-void
.end method

.method public setAllowedViewports(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 650
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->allowedViewports:Ljava/util/Set;

    return-void
.end method

.method public setAnyBrand(Z)V
    .locals 0

    .line 120
    iput-boolean p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->anyBrand:Z

    return-void
.end method

.method public setAnyBrandFullUrl(Ljava/lang/String;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->anyBrandFullUrl:Ljava/lang/String;

    return-void
.end method

.method public setAnyBrandIconUrl(Ljava/lang/String;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->anyBrandIconUrl:Ljava/lang/String;

    return-void
.end method

.method public setAuxiliaryLoyaltyEnabled(Z)V
    .locals 0

    .line 329
    iput-boolean p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->auxiliaryLoyaltyEnabled:Z

    return-void
.end method

.method public setBarcode(Z)V
    .locals 0

    .line 147
    iput-boolean p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->barcode:Z

    return-void
.end method

.method public setButtonInfo(Lcom/ibotta/api/model/retailer/ButtonInfo;)V
    .locals 0

    .line 156
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->buttonInfo:Lcom/ibotta/api/model/retailer/ButtonInfo;

    return-void
.end method

.method public setCardDescription(Ljava/lang/String;)V
    .locals 0

    .line 165
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardDescription:Ljava/lang/String;

    return-void
.end method

.method public setCardDisplayBarcodeType(Ljava/lang/String;)V
    .locals 0

    .line 174
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardDisplayBarcodeType:Ljava/lang/String;

    return-void
.end method

.method public setCardEntryDesc(Ljava/lang/String;)V
    .locals 0

    .line 183
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardEntryDesc:Ljava/lang/String;

    return-void
.end method

.method public setCardHelpDescription(Ljava/lang/String;)V
    .locals 0

    .line 192
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardHelpDescription:Ljava/lang/String;

    return-void
.end method

.method public setCardHelpTitle(Ljava/lang/String;)V
    .locals 0

    .line 201
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardHelpTitle:Ljava/lang/String;

    return-void
.end method

.method public setCardIdType(Ljava/lang/String;)V
    .locals 0

    .line 210
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardIdType:Ljava/lang/String;

    const/4 p1, 0x0

    .line 211
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardIdTypeEnum:Lcom/ibotta/api/model/RetailerModel$CardIdType;

    return-void
.end method

.method public setCardIdTypeEnum(Lcom/ibotta/api/model/RetailerModel$CardIdType;)V
    .locals 0

    .line 224
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardIdTypeEnum:Lcom/ibotta/api/model/RetailerModel$CardIdType;

    return-void
.end method

.method public setCardInputType(Ljava/lang/String;)V
    .locals 0

    .line 233
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardInputType:Ljava/lang/String;

    const/4 p1, 0x0

    .line 234
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardInputTypeEnum:Lcom/ibotta/api/model/RetailerModel$CardInputType;

    return-void
.end method

.method public setCardInputTypeEnum(Lcom/ibotta/api/model/RetailerModel$CardInputType;)V
    .locals 0

    .line 247
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardInputTypeEnum:Lcom/ibotta/api/model/RetailerModel$CardInputType;

    return-void
.end method

.method public setCardLinkButtonText(Ljava/lang/String;)V
    .locals 0

    .line 256
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardLinkButtonText:Ljava/lang/String;

    return-void
.end method

.method public setCardLinkText(Ljava/lang/String;)V
    .locals 0

    .line 265
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardLinkText:Ljava/lang/String;

    return-void
.end method

.method public setCardLinkTitle(Ljava/lang/String;)V
    .locals 0

    .line 274
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardLinkTitle:Ljava/lang/String;

    return-void
.end method

.method public setCardName(Ljava/lang/String;)V
    .locals 0

    .line 283
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardName:Ljava/lang/String;

    return-void
.end method

.method public setCardNumberName(Ljava/lang/String;)V
    .locals 0

    .line 292
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardNumberName:Ljava/lang/String;

    return-void
.end method

.method public setCardScanBarcodeType(Ljava/lang/String;)V
    .locals 0

    .line 301
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardScanBarcodeType:Ljava/lang/String;

    return-void
.end method

.method public setCardSignupCompletionUrl(Ljava/lang/String;)V
    .locals 0

    .line 347
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardSignupCompletionUrl:Ljava/lang/String;

    return-void
.end method

.method public setCardSignupUrl(Ljava/lang/String;)V
    .locals 0

    .line 338
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardSignupUrl:Ljava/lang/String;

    return-void
.end method

.method public setCardValidationRegex(Ljava/lang/String;)V
    .locals 0

    .line 356
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->cardValidationRegex:Ljava/lang/String;

    return-void
.end method

.method public setCategoryIds(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 681
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->categoryIds:Ljava/util/Set;

    return-void
.end method

.method public setCredentialIntegration(Z)V
    .locals 0

    .line 320
    iput-boolean p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->credentialIntegration:Z

    return-void
.end method

.method public setCreditPendingPeriod(Ljava/lang/String;)V
    .locals 0

    .line 365
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->creditPendingPeriod:Ljava/lang/String;

    return-void
.end method

.method public setCustomerLoyalty(Lcom/ibotta/api/model/customer/CustomerLoyalty;)V
    .locals 0

    .line 375
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->customerLoyalty:Lcom/ibotta/api/model/customer/CustomerLoyalty;

    return-void
.end method

.method public setDasherizedName(Ljava/lang/String;)V
    .locals 0

    .line 384
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->dasherizedName:Ljava/lang/String;

    return-void
.end method

.method public setDeviceOcrEnabled(Z)V
    .locals 0

    .line 734
    iput-boolean p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->deviceOcrEnabled:Z

    return-void
.end method

.method public setDistance(Ljava/lang/Float;)V
    .locals 0
    .param p1    # Ljava/lang/Float;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 393
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->distance:Ljava/lang/Float;

    return-void
.end method

.method public setDynamicContentId(Ljava/lang/Integer;)V
    .locals 0

    .line 402
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->dynamicContentId:Ljava/lang/Integer;

    return-void
.end method

.method public setFavorite(Lcom/ibotta/api/model/customer/FavoriteRetailer;)V
    .locals 0

    .line 411
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->favorite:Lcom/ibotta/api/model/customer/FavoriteRetailer;

    return-void
.end method

.method public setFeatured(Z)V
    .locals 0

    .line 420
    iput-boolean p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->featured:Z

    return-void
.end method

.method public setGalleryFeatures(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/FeatureModel;",
            ">;)V"
        }
    .end annotation

    .line 690
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->galleryFeatures:Ljava/util/List;

    return-void
.end method

.method public setHomeFeatured(Z)V
    .locals 0

    .line 429
    iput-boolean p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->homeFeatured:Z

    return-void
.end method

.method public setHomeSortOrder(I)V
    .locals 0

    .line 438
    iput p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->homeSortOrder:I

    return-void
.end method

.method public setHotness(D)V
    .locals 0

    .line 447
    iput-wide p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->hotness:D

    return-void
.end method

.method public setIconUrl(Ljava/lang/String;)V
    .locals 0

    .line 456
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->iconUrl:Ljava/lang/String;

    return-void
.end method

.method public setLargeCardLogoUrl(Ljava/lang/String;)V
    .locals 0

    .line 474
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->largeCardLogoUrl:Ljava/lang/String;

    return-void
.end method

.method public setLargeIconUrl(Ljava/lang/String;)V
    .locals 0

    .line 465
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->largeIconUrl:Ljava/lang/String;

    return-void
.end method

.method public setLink(Ljava/lang/String;)V
    .locals 0

    .line 760
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->link:Ljava/lang/String;

    return-void
.end method

.method public setMenuActions(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/Action;",
            ">;)V"
        }
    .end annotation

    .line 707
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->menuActions:Ljava/util/List;

    return-void
.end method

.method public setModelCImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 769
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->modelCImageUrl:Ljava/lang/String;

    return-void
.end method

.method public setMoreAction(Lcom/ibotta/api/model/content/Action;)V
    .locals 0

    .line 483
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->moreAction:Lcom/ibotta/api/model/content/Action;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 492
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->name:Ljava/lang/String;

    return-void
.end method

.method public setNearby(Z)V
    .locals 0

    .line 501
    iput-boolean p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->nearby:Z

    return-void
.end method

.method public setOfferCount(I)V
    .locals 0

    .line 527
    iput p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->offerCount:I

    return-void
.end method

.method public setParentRetailerId(I)V
    .locals 0

    .line 510
    iput p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->parentRetailerId:I

    return-void
.end method

.method public setPercentCashBack(Ljava/lang/String;)V
    .locals 0

    .line 778
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->percentCashBack:Ljava/lang/String;

    return-void
.end method

.method public setPrimaryCategoryId(I)V
    .locals 0

    .line 519
    iput p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->primaryCategoryId:I

    return-void
.end method

.method public setPwiHomeBannerImageUrl(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 787
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->pwiHomeBannerImageUrl:Ljava/lang/String;

    return-void
.end method

.method public setReceiptFormatEnums(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/ibotta/api/model/receipt/ReceiptFormat;",
            ">;)V"
        }
    .end annotation

    .line 725
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->receiptFormatEnums:Ljava/util/Set;

    return-void
.end method

.method public setReceiptFormats(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 716
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->receiptFormats:Ljava/util/Set;

    return-void
.end method

.method public setRedemptionMeta(Lcom/ibotta/api/model/retailer/RedemptionMeta;)V
    .locals 0

    .line 536
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->redemptionMeta:Lcom/ibotta/api/model/retailer/RedemptionMeta;

    return-void
.end method

.method public setResolvedCoords(Lcom/ibotta/api/model/retailer/ResolvedCoords;)V
    .locals 0

    .line 545
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->resolvedCoords:Lcom/ibotta/api/model/retailer/ResolvedCoords;

    return-void
.end method

.method public setRetailerBarcodeConfiguration(Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;)V
    .locals 0

    .line 555
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->retailerBarcodeConfiguration:Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;

    return-void
.end method

.method public setRetailerTerms(Ljava/lang/String;)V
    .locals 0

    .line 564
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->retailerTerms:Ljava/lang/String;

    return-void
.end method

.method public setSecondaryCategoryId(I)V
    .locals 0

    .line 573
    iput p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->secondaryCategoryId:I

    return-void
.end method

.method public setShortDescription(Ljava/lang/String;)V
    .locals 0

    .line 582
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->shortDescription:Ljava/lang/String;

    return-void
.end method

.method public setSortData(Ljava/lang/String;)V
    .locals 0

    .line 591
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->sortData:Ljava/lang/String;

    return-void
.end method

.method public setSortOrder(Ljava/lang/String;)V
    .locals 0

    .line 609
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->sortOrder:Ljava/lang/String;

    return-void
.end method

.method public setSortResults(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/SortResultModel;",
            ">;)V"
        }
    .end annotation

    .line 600
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->sortResults:Ljava/util/List;

    return-void
.end method

.method public setStores(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Store;",
            ">;)V"
        }
    .end annotation

    .line 748
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->stores:Ljava/util/List;

    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .line 618
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->url:Ljava/lang/String;

    return-void
.end method

.method public setVerificationType(Ljava/lang/String;)V
    .locals 0

    .line 627
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->verificationType:Ljava/lang/String;

    const/4 p1, 0x0

    .line 628
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->verificationTypeEnum:Lcom/ibotta/api/model/common/VerificationType;

    return-void
.end method

.method public setVerificationTypeEnum(Lcom/ibotta/api/model/common/VerificationType;)V
    .locals 0

    .line 641
    iput-object p1, p0, Lcom/ibotta/api/model/content/RetailerContent;->verificationTypeEnum:Lcom/ibotta/api/model/common/VerificationType;

    return-void
.end method
