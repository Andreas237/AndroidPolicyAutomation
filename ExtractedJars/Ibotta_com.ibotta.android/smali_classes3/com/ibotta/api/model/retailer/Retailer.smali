.class public Lcom/ibotta/api/model/retailer/Retailer;
.super Ljava/lang/Object;
.source "Retailer.java"

# interfaces
.implements Lcom/ibotta/api/model/RetailerModel;


# instance fields
.field private active:Z

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

.field private cardBackgroundColor:Ljava/lang/String;

.field private cardDescription:Ljava/lang/String;

.field private cardDisplayBarcodeType:Ljava/lang/String;

.field private cardEntryDesc:Ljava/lang/String;

.field private cardExample:Ljava/lang/String;

.field private cardForegroundColor:Ljava/lang/String;

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

.field private cardTheme:Ljava/lang/String;

.field private transient cardThemeEnum:Lcom/ibotta/api/model/RetailerModel$CardThemeType;

.field private cardValidationRegex:Ljava/lang/String;

.field private categoryIds:Ljava/util/Set;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonIgnore;
    .end annotation

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

.field private deviceOcrPreverify:Z

.field private distance:Ljava/lang/Float;

.field private dynamicContentId:Ljava/lang/Integer;

.field private exclusiveImageUrl:Ljava/lang/String;

.field private favorite:Lcom/ibotta/api/model/customer/FavoriteRetailer;

.field private featured:Z

.field private galleryFeatures:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
        contentAs = Lcom/ibotta/api/model/feature/Feature;
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

.field private iconUrl:Ljava/lang/String;

.field private id:I

.field private idString:Ljava/lang/String;

.field private largeCardLogoUrl:Ljava/lang/String;

.field private largeIconUrl:Ljava/lang/String;

.field private menuActions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/Action;",
            ">;"
        }
    .end annotation
.end field

.field private modelCRetailer:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "model_c_retailer"
    .end annotation
.end field

.field private moreAction:Lcom/ibotta/api/model/content/Action;

.field private name:Ljava/lang/String;

.field private percentCashBack:Ljava/lang/String;

.field private primaryCategoryId:I

.field private pwiHomeBannerImageUrl:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "pwi_home_banner_image"
    .end annotation

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

.field private recommended:Z

.field private redemptionMeta:Lcom/ibotta/api/model/retailer/RedemptionMeta;

.field private resolvedCoords:Lcom/ibotta/api/model/retailer/ResolvedCoords;

.field private retailerBarcodeConfiguration:Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;

.field private retailerTerms:Ljava/lang/String;

.field private secondaryCategoryId:I

.field private shortDescription:Ljava/lang/String;

.field private shortName:Ljava/lang/String;

.field private sortData:Ljava/lang/String;

.field private sortOrder:Ljava/lang/String;

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

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 138
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->receiptFormats:Ljava/util/Set;

    .line 139
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->receiptFormatEnums:Ljava/util/Set;

    .line 140
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->allowedViewportEnums:Ljava/util/Set;

    .line 142
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->allowedViewports:Ljava/util/Set;

    .line 143
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->stores:Ljava/util/List;

    .line 147
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->galleryFeatures:Ljava/util/List;

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

    .line 806
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->allowedViewportEnums:Ljava/util/Set;

    if-eqz v0, :cond_0

    return-object v0

    .line 810
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->allowedViewports:Ljava/util/Set;

    invoke-static {v0}, Lcom/ibotta/api/model/RetailerModel$AllowedViewport;->toSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->allowedViewportEnums:Ljava/util/Set;

    .line 811
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->allowedViewportEnums:Ljava/util/Set;

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

    .line 797
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->allowedViewports:Ljava/util/Set;

    return-object v0
.end method

.method public getAnyBrandFullUrl()Ljava/lang/String;
    .locals 1

    .line 501
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->anyBrandFullUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getAnyBrandIconUrl()Ljava/lang/String;
    .locals 1

    .line 493
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->anyBrandIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getButtonId(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 720
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/Retailer;->getButtonInfo()Lcom/ibotta/api/model/retailer/ButtonInfo;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/Retailer;->getButtonInfo()Lcom/ibotta/api/model/retailer/ButtonInfo;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/retailer/ButtonInfo;->getButtonId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public getButtonInfo()Lcom/ibotta/api/model/retailer/ButtonInfo;
    .locals 1

    .line 708
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->buttonInfo:Lcom/ibotta/api/model/retailer/ButtonInfo;

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCardBackgroundColor()Ljava/lang/String;
    .locals 1

    .line 427
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardBackgroundColor:Ljava/lang/String;

    return-object v0
.end method

.method public getCardDescription()Ljava/lang/String;
    .locals 1

    .line 285
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardDescription:Ljava/lang/String;

    return-object v0
.end method

.method public getCardDisplayBarcodeType()Ljava/lang/String;
    .locals 1

    .line 355
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardDisplayBarcodeType:Ljava/lang/String;

    return-object v0
.end method

.method public getCardEntryDesc()Ljava/lang/String;
    .locals 1

    .line 363
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardEntryDesc:Ljava/lang/String;

    return-object v0
.end method

.method public getCardExample()Ljava/lang/String;
    .locals 1

    .line 453
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardExample:Ljava/lang/String;

    return-object v0
.end method

.method public getCardForegroundColor()Ljava/lang/String;
    .locals 1

    .line 419
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardForegroundColor:Ljava/lang/String;

    return-object v0
.end method

.method public getCardHelpDescription()Ljava/lang/String;
    .locals 1

    .line 664
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardHelpDescription:Ljava/lang/String;

    return-object v0
.end method

.method public getCardHelpTitle()Ljava/lang/String;
    .locals 1

    .line 656
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardHelpTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getCardIdType()Ljava/lang/String;
    .locals 1

    .line 326
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardIdType:Ljava/lang/String;

    return-object v0
.end method

.method public getCardIdTypeEnum()Lcom/ibotta/api/model/RetailerModel$CardIdType;
    .locals 1

    .line 330
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardIdTypeEnum:Lcom/ibotta/api/model/RetailerModel$CardIdType;

    if-eqz v0, :cond_0

    return-object v0

    .line 333
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardIdType:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/RetailerModel$CardIdType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/RetailerModel$CardIdType;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardIdTypeEnum:Lcom/ibotta/api/model/RetailerModel$CardIdType;

    .line 334
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardIdTypeEnum:Lcom/ibotta/api/model/RetailerModel$CardIdType;

    return-object v0
.end method

.method public getCardInputType()Ljava/lang/String;
    .locals 1

    .line 301
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardInputType:Ljava/lang/String;

    return-object v0
.end method

.method public getCardInputTypeEnum()Lcom/ibotta/api/model/RetailerModel$CardInputType;
    .locals 1

    .line 310
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardInputTypeEnum:Lcom/ibotta/api/model/RetailerModel$CardInputType;

    if-eqz v0, :cond_0

    return-object v0

    .line 313
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardInputType:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/RetailerModel$CardInputType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/RetailerModel$CardInputType;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardInputTypeEnum:Lcom/ibotta/api/model/RetailerModel$CardInputType;

    .line 314
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardInputTypeEnum:Lcom/ibotta/api/model/RetailerModel$CardInputType;

    return-object v0
.end method

.method public getCardLinkButtonText()Ljava/lang/String;
    .locals 1

    .line 477
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardLinkButtonText:Ljava/lang/String;

    return-object v0
.end method

.method public getCardLinkText()Ljava/lang/String;
    .locals 1

    .line 469
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardLinkText:Ljava/lang/String;

    return-object v0
.end method

.method public getCardLinkTitle()Ljava/lang/String;
    .locals 1

    .line 461
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardLinkTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getCardName()Ljava/lang/String;
    .locals 1

    .line 277
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardName:Ljava/lang/String;

    return-object v0
.end method

.method public getCardNumberName()Ljava/lang/String;
    .locals 1

    .line 293
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardNumberName:Ljava/lang/String;

    return-object v0
.end method

.method public getCardScanBarcodeType()Ljava/lang/String;
    .locals 1

    .line 343
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardScanBarcodeType:Ljava/lang/String;

    return-object v0
.end method

.method public getCardScanBarcodeTypeEnum()Lcom/ibotta/api/model/common/BarcodeType;
    .locals 1

    .line 351
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardScanBarcodeType:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/common/BarcodeType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/common/BarcodeType;

    move-result-object v0

    return-object v0
.end method

.method public getCardSignupCompletionUrl()Ljava/lang/String;
    .locals 1

    .line 380
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardSignupCompletionUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getCardSignupUrl()Ljava/lang/String;
    .locals 1

    .line 372
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardSignupUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getCardTheme()Ljava/lang/String;
    .locals 1

    .line 436
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardTheme:Ljava/lang/String;

    return-object v0
.end method

.method public getCardThemeEnum()Lcom/ibotta/api/model/RetailerModel$CardThemeType;
    .locals 1

    .line 445
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardThemeEnum:Lcom/ibotta/api/model/RetailerModel$CardThemeType;

    if-eqz v0, :cond_0

    return-object v0

    .line 448
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardTheme:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/RetailerModel$CardThemeType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/RetailerModel$CardThemeType;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardThemeEnum:Lcom/ibotta/api/model/RetailerModel$CardThemeType;

    .line 449
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardThemeEnum:Lcom/ibotta/api/model/RetailerModel$CardThemeType;

    return-object v0
.end method

.method public getCardValidationRegex()Ljava/lang/String;
    .locals 1

    .line 318
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardValidationRegex:Ljava/lang/String;

    return-object v0
.end method

.method public getCategoryIds()Ljava/util/Set;
    .locals 2
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonIgnore;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 824
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->categoryIds:Ljava/util/Set;

    if-nez v0, :cond_1

    .line 825
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->categoryIds:Ljava/util/Set;

    .line 827
    iget v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->primaryCategoryId:I

    if-lez v0, :cond_0

    .line 828
    iget-object v1, p0, Lcom/ibotta/api/model/retailer/Retailer;->categoryIds:Ljava/util/Set;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 831
    :cond_0
    iget v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->secondaryCategoryId:I

    if-lez v0, :cond_1

    .line 832
    iget-object v1, p0, Lcom/ibotta/api/model/retailer/Retailer;->categoryIds:Ljava/util/Set;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 836
    :cond_1
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->categoryIds:Ljava/util/Set;

    return-object v0
.end method

.method public getCreditPendingPeriod()Ljava/lang/String;
    .locals 1

    .line 632
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->creditPendingPeriod:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomerLoyalty()Lcom/ibotta/api/model/customer/CustomerLoyalty;
    .locals 1

    .line 509
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->customerLoyalty:Lcom/ibotta/api/model/customer/CustomerLoyalty;

    return-object v0
.end method

.method public getDasherizedName()Ljava/lang/String;
    .locals 1

    .line 611
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->dasherizedName:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 613
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->name:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/util/Dasherize;->dasherize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->dasherizedName:Ljava/lang/String;

    .line 616
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->dasherizedName:Ljava/lang/String;

    return-object v0
.end method

.method public getDistance()Ljava/lang/Float;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 238
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->distance:Ljava/lang/Float;

    return-object v0
.end method

.method public getDynamicContentId()Ljava/lang/Integer;
    .locals 1

    .line 727
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->dynamicContentId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getExclusiveImageUrl()Ljava/lang/String;
    .locals 1

    .line 246
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->exclusiveImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getFavorite()Lcom/ibotta/api/model/customer/FavoriteRetailer;
    .locals 1

    .line 575
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->favorite:Lcom/ibotta/api/model/customer/FavoriteRetailer;

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

    .line 840
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->galleryFeatures:Ljava/util/List;

    return-object v0
.end method

.method public getHomeSortOrder()I
    .locals 1

    .line 583
    iget v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->homeSortOrder:I

    return v0
.end method

.method public getHotness()D
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getIconUrl()Ljava/lang/String;
    .locals 1

    .line 205
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 157
    iget v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->id:I

    return v0
.end method

.method public getIdString()Ljava/lang/String;
    .locals 1

    .line 166
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->idString:Ljava/lang/String;

    return-object v0
.end method

.method public getLargeCardLogoUrl()Ljava/lang/String;
    .locals 1

    .line 411
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->largeCardLogoUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getLargeIconUrl()Ljava/lang/String;
    .locals 1

    .line 599
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->largeIconUrl:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 603
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->largeIconUrl:Ljava/lang/String;

    return-object v0

    .line 600
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getLink()Ljava/lang/String;
    .locals 4
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonIgnore;
    .end annotation

    const-string v0, "retailer/%1$d"

    const/4 v1, 0x1

    .line 201
    new-array v1, v1, [Ljava/lang/Object;

    iget v2, p0, Lcom/ibotta/api/model/retailer/Retailer;->id:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

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

    .line 762
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->menuActions:Ljava/util/List;

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

    .line 754
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->menuActions:Ljava/util/List;

    if-nez v0, :cond_0

    .line 755
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 757
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v1
.end method

.method public getModelCImageUrl()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 687
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->modelCRetailer:Ljava/lang/String;

    return-object v0
.end method

.method public getMoreAction()Lcom/ibotta/api/model/content/Action;
    .locals 1

    .line 736
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->moreAction:Lcom/ibotta/api/model/content/Action;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 174
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->name:Ljava/lang/String;

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

    .line 853
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->percentCashBack:Ljava/lang/String;

    return-object v0
.end method

.method public getPrimaryCategoryId()I
    .locals 1

    .line 533
    iget v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->primaryCategoryId:I

    return v0
.end method

.method public getPwiHomeBannerImageUrl()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 696
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->pwiHomeBannerImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getReceiptFormatEnums()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/api/model/receipt/ReceiptFormat;",
            ">;"
        }
    .end annotation

    .line 781
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->receiptFormatEnums:Ljava/util/Set;

    if-eqz v0, :cond_0

    return-object v0

    .line 785
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->receiptFormatEnums:Ljava/util/Set;

    .line 787
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->receiptFormats:Ljava/util/Set;

    if-eqz v0, :cond_1

    .line 788
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 789
    iget-object v2, p0, Lcom/ibotta/api/model/retailer/Retailer;->receiptFormatEnums:Ljava/util/Set;

    invoke-static {v1}, Lcom/ibotta/api/model/receipt/ReceiptFormat;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/receipt/ReceiptFormat;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 793
    :cond_1
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->receiptFormatEnums:Ljava/util/Set;

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

    .line 772
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->receiptFormats:Ljava/util/Set;

    return-object v0
.end method

.method public getRedemptionMeta()Lcom/ibotta/api/model/retailer/RedemptionMeta;
    .locals 1

    .line 559
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->redemptionMeta:Lcom/ibotta/api/model/retailer/RedemptionMeta;

    return-object v0
.end method

.method public getResolvedCoords()Lcom/ibotta/api/model/retailer/ResolvedCoords;
    .locals 1

    .line 551
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->resolvedCoords:Lcom/ibotta/api/model/retailer/ResolvedCoords;

    return-object v0
.end method

.method public getRetailerBarcodeConfiguration()Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;
    .locals 1

    .line 567
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->retailerBarcodeConfiguration:Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;

    return-object v0
.end method

.method public getRetailerTerms()Ljava/lang/String;
    .locals 1

    .line 648
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->retailerTerms:Ljava/lang/String;

    return-object v0
.end method

.method public getSecondaryCategoryId()I
    .locals 1

    .line 542
    iget v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->secondaryCategoryId:I

    return v0
.end method

.method public getShortDescription()Ljava/lang/String;
    .locals 1

    .line 624
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->shortDescription:Ljava/lang/String;

    return-object v0
.end method

.method public getShortName()Ljava/lang/String;
    .locals 1

    .line 213
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->shortName:Ljava/lang/String;

    return-object v0
.end method

.method public getSortData()Ljava/lang/String;
    .locals 1

    .line 591
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->sortData:Ljava/lang/String;

    return-object v0
.end method

.method public getSortOrder()Ljava/lang/String;
    .locals 1

    .line 254
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->sortOrder:Ljava/lang/String;

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

    .line 864
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

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

    .line 815
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->stores:Ljava/util/List;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 259
    sget-object v0, Lcom/ibotta/api/model/ContentModel$Type;->RETAILER:Lcom/ibotta/api/model/ContentModel$Type;

    invoke-virtual {v0}, Lcom/ibotta/api/model/ContentModel$Type;->getApiName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTypeEnum()Lcom/ibotta/api/model/ContentModel$Type;
    .locals 1

    .line 269
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

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 745
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->url:Ljava/lang/String;

    return-object v0
.end method

.method public getVerificationType()Ljava/lang/String;
    .locals 1

    .line 182
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->verificationType:Ljava/lang/String;

    return-object v0
.end method

.method public getVerificationTypeEnum()Lcom/ibotta/api/model/common/VerificationType;
    .locals 1

    .line 191
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->verificationTypeEnum:Lcom/ibotta/api/model/common/VerificationType;

    if-eqz v0, :cond_0

    return-object v0

    .line 194
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->verificationType:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/common/VerificationType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->verificationTypeEnum:Lcom/ibotta/api/model/common/VerificationType;

    .line 195
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->verificationTypeEnum:Lcom/ibotta/api/model/common/VerificationType;

    return-object v0
.end method

.method public isActive()Z
    .locals 1

    .line 221
    iget-boolean v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->active:Z

    return v0
.end method

.method public isAnyBrand()Z
    .locals 1

    .line 485
    iget-boolean v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->anyBrand:Z

    return v0
.end method

.method public isAuxiliaryLoyaltyEnabled()Z
    .locals 1

    .line 398
    iget-boolean v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->auxiliaryLoyaltyEnabled:Z

    return v0
.end method

.method public isBarcode()Z
    .locals 1

    .line 229
    iget-boolean v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->barcode:Z

    return v0
.end method

.method public isCredentialIntegration()Z
    .locals 1

    .line 389
    iget-boolean v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->credentialIntegration:Z

    return v0
.end method

.method public isDeviceOcrEnabled()Z
    .locals 1

    .line 673
    iget-boolean v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->deviceOcrEnabled:Z

    return v0
.end method

.method public isDeviceOcrPreverify()Z
    .locals 1

    .line 682
    iget-boolean v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->deviceOcrPreverify:Z

    return v0
.end method

.method public isFeatured()Z
    .locals 1

    .line 517
    iget-boolean v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->featured:Z

    return v0
.end method

.method public isHomeFeatured()Z
    .locals 1

    .line 525
    iget-boolean v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->homeFeatured:Z

    return v0
.end method

.method public isNearby()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isReceiptFallbackEnabled()Z
    .locals 1

    .line 407
    iget-boolean v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->receiptFallbackEnabled:Z

    return v0
.end method

.method public isRecommended()Z
    .locals 1

    .line 640
    iget-boolean v0, p0, Lcom/ibotta/api/model/retailer/Retailer;->recommended:Z

    return v0
.end method

.method public setActive(Z)V
    .locals 0

    .line 225
    iput-boolean p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->active:Z

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

    .line 801
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->allowedViewports:Ljava/util/Set;

    const/4 p1, 0x0

    .line 802
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->allowedViewportEnums:Ljava/util/Set;

    return-void
.end method

.method public setAnyBrand(Z)V
    .locals 0

    .line 489
    iput-boolean p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->anyBrand:Z

    return-void
.end method

.method public setAnyBrandFullUrl(Ljava/lang/String;)V
    .locals 0

    .line 505
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->anyBrandFullUrl:Ljava/lang/String;

    return-void
.end method

.method public setAnyBrandIconUrl(Ljava/lang/String;)V
    .locals 0

    .line 497
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->anyBrandIconUrl:Ljava/lang/String;

    return-void
.end method

.method public setAuxiliaryLoyaltyEnabled(Z)V
    .locals 0

    .line 402
    iput-boolean p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->auxiliaryLoyaltyEnabled:Z

    return-void
.end method

.method public setBarcode(Z)V
    .locals 0

    .line 233
    iput-boolean p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->barcode:Z

    return-void
.end method

.method public setButtonInfo(Lcom/ibotta/api/model/retailer/ButtonInfo;)V
    .locals 0

    .line 712
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->buttonInfo:Lcom/ibotta/api/model/retailer/ButtonInfo;

    return-void
.end method

.method public setCardBackgroundColor(Ljava/lang/String;)V
    .locals 0

    .line 431
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardBackgroundColor:Ljava/lang/String;

    return-void
.end method

.method public setCardDescription(Ljava/lang/String;)V
    .locals 0

    .line 289
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardDescription:Ljava/lang/String;

    return-void
.end method

.method public setCardDisplayBarcodeType(Ljava/lang/String;)V
    .locals 0

    .line 359
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardDisplayBarcodeType:Ljava/lang/String;

    return-void
.end method

.method public setCardEntryDesc(Ljava/lang/String;)V
    .locals 0

    .line 367
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardEntryDesc:Ljava/lang/String;

    return-void
.end method

.method public setCardExample(Ljava/lang/String;)V
    .locals 0

    .line 457
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardExample:Ljava/lang/String;

    return-void
.end method

.method public setCardForegroundColor(Ljava/lang/String;)V
    .locals 0

    .line 423
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardForegroundColor:Ljava/lang/String;

    return-void
.end method

.method public setCardHelpDescription(Ljava/lang/String;)V
    .locals 0

    .line 668
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardHelpDescription:Ljava/lang/String;

    return-void
.end method

.method public setCardHelpTitle(Ljava/lang/String;)V
    .locals 0

    .line 660
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardHelpTitle:Ljava/lang/String;

    return-void
.end method

.method public setCardIdType(Ljava/lang/String;)V
    .locals 0

    .line 338
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardIdType:Ljava/lang/String;

    const/4 p1, 0x0

    .line 339
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardIdTypeEnum:Lcom/ibotta/api/model/RetailerModel$CardIdType;

    return-void
.end method

.method public setCardInputType(Ljava/lang/String;)V
    .locals 0

    .line 305
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardInputType:Ljava/lang/String;

    const/4 p1, 0x0

    .line 306
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardInputTypeEnum:Lcom/ibotta/api/model/RetailerModel$CardInputType;

    return-void
.end method

.method public setCardLinkButtonText(Ljava/lang/String;)V
    .locals 0

    .line 481
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardLinkButtonText:Ljava/lang/String;

    return-void
.end method

.method public setCardLinkText(Ljava/lang/String;)V
    .locals 0

    .line 473
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardLinkText:Ljava/lang/String;

    return-void
.end method

.method public setCardLinkTitle(Ljava/lang/String;)V
    .locals 0

    .line 465
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardLinkTitle:Ljava/lang/String;

    return-void
.end method

.method public setCardName(Ljava/lang/String;)V
    .locals 0

    .line 281
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardName:Ljava/lang/String;

    return-void
.end method

.method public setCardNumberName(Ljava/lang/String;)V
    .locals 0

    .line 297
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardNumberName:Ljava/lang/String;

    return-void
.end method

.method public setCardScanBarcodeType(Ljava/lang/String;)V
    .locals 0

    .line 347
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardScanBarcodeType:Ljava/lang/String;

    return-void
.end method

.method public setCardSignupCompletionUrl(Ljava/lang/String;)V
    .locals 0

    .line 384
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardSignupCompletionUrl:Ljava/lang/String;

    return-void
.end method

.method public setCardSignupUrl(Ljava/lang/String;)V
    .locals 0

    .line 376
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardSignupUrl:Ljava/lang/String;

    return-void
.end method

.method public setCardTheme(Ljava/lang/String;)V
    .locals 0

    .line 440
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardTheme:Ljava/lang/String;

    const/4 p1, 0x0

    .line 441
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardThemeEnum:Lcom/ibotta/api/model/RetailerModel$CardThemeType;

    return-void
.end method

.method public setCardValidationRegex(Ljava/lang/String;)V
    .locals 0

    .line 322
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->cardValidationRegex:Ljava/lang/String;

    return-void
.end method

.method public setCredentialIntegration(Z)V
    .locals 0

    .line 393
    iput-boolean p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->credentialIntegration:Z

    return-void
.end method

.method public setCreditPendingPeriod(Ljava/lang/String;)V
    .locals 0

    .line 636
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->creditPendingPeriod:Ljava/lang/String;

    return-void
.end method

.method public setCustomerLoyalty(Lcom/ibotta/api/model/customer/CustomerLoyalty;)V
    .locals 0

    .line 513
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->customerLoyalty:Lcom/ibotta/api/model/customer/CustomerLoyalty;

    return-void
.end method

.method public setDasherizedName(Ljava/lang/String;)V
    .locals 0

    .line 620
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->dasherizedName:Ljava/lang/String;

    return-void
.end method

.method public setDeviceOcrEnabled(Z)V
    .locals 0

    .line 677
    iput-boolean p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->deviceOcrEnabled:Z

    return-void
.end method

.method public setDeviceOcrPreverify(Z)V
    .locals 0

    .line 704
    iput-boolean p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->deviceOcrPreverify:Z

    return-void
.end method

.method public setDistance(Ljava/lang/Float;)V
    .locals 0
    .param p1    # Ljava/lang/Float;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 242
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->distance:Ljava/lang/Float;

    return-void
.end method

.method public setDynamicContentId(Ljava/lang/Integer;)V
    .locals 0

    .line 731
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->dynamicContentId:Ljava/lang/Integer;

    return-void
.end method

.method public setExclusiveImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 250
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->exclusiveImageUrl:Ljava/lang/String;

    return-void
.end method

.method public setFavorite(Lcom/ibotta/api/model/customer/FavoriteRetailer;)V
    .locals 0

    .line 579
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->favorite:Lcom/ibotta/api/model/customer/FavoriteRetailer;

    return-void
.end method

.method public setFeatured(Z)V
    .locals 0

    .line 521
    iput-boolean p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->featured:Z

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

    .line 844
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->galleryFeatures:Ljava/util/List;

    return-void
.end method

.method public setHomeFeatured(Z)V
    .locals 0

    .line 529
    iput-boolean p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->homeFeatured:Z

    return-void
.end method

.method public setHomeSortOrder(I)V
    .locals 0

    .line 587
    iput p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->homeSortOrder:I

    return-void
.end method

.method public setIconUrl(Ljava/lang/String;)V
    .locals 0

    .line 209
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->iconUrl:Ljava/lang/String;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 161
    iput p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->id:I

    return-void
.end method

.method public setIdString(Ljava/lang/String;)V
    .locals 0

    .line 170
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->idString:Ljava/lang/String;

    return-void
.end method

.method public setLargeCardLogoUrl(Ljava/lang/String;)V
    .locals 0

    .line 415
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->largeCardLogoUrl:Ljava/lang/String;

    return-void
.end method

.method public setLargeIconUrl(Ljava/lang/String;)V
    .locals 0

    .line 607
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->largeIconUrl:Ljava/lang/String;

    return-void
.end method

.method public setLink(Ljava/lang/String;)V
    .locals 0

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

    .line 766
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->menuActions:Ljava/util/List;

    return-void
.end method

.method public setModelCRetailer(Ljava/lang/String;)V
    .locals 0

    .line 691
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->modelCRetailer:Ljava/lang/String;

    return-void
.end method

.method public setMoreAction(Lcom/ibotta/api/model/content/Action;)V
    .locals 0

    .line 740
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->moreAction:Lcom/ibotta/api/model/content/Action;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 178
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->name:Ljava/lang/String;

    return-void
.end method

.method public setPercentCashBack(Ljava/lang/String;)V
    .locals 0

    .line 848
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->percentCashBack:Ljava/lang/String;

    return-void
.end method

.method public setPrimaryCategoryId(I)V
    .locals 0

    .line 537
    iput p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->primaryCategoryId:I

    const/4 p1, 0x0

    .line 538
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->categoryIds:Ljava/util/Set;

    return-void
.end method

.method public setPwiHomeBannerImageUrl(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 700
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->pwiHomeBannerImageUrl:Ljava/lang/String;

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

    .line 776
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->receiptFormats:Ljava/util/Set;

    const/4 p1, 0x0

    .line 777
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->receiptFormatEnums:Ljava/util/Set;

    return-void
.end method

.method public setRecommended(Z)V
    .locals 0

    .line 644
    iput-boolean p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->recommended:Z

    return-void
.end method

.method public setRedemptionMeta(Lcom/ibotta/api/model/retailer/RedemptionMeta;)V
    .locals 0

    .line 563
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->redemptionMeta:Lcom/ibotta/api/model/retailer/RedemptionMeta;

    return-void
.end method

.method public setResolvedCoords(Lcom/ibotta/api/model/retailer/ResolvedCoords;)V
    .locals 0

    .line 555
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->resolvedCoords:Lcom/ibotta/api/model/retailer/ResolvedCoords;

    return-void
.end method

.method public setRetailerBarcodeConfiguration(Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;)V
    .locals 0

    .line 571
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->retailerBarcodeConfiguration:Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;

    return-void
.end method

.method public setRetailerTerms(Ljava/lang/String;)V
    .locals 0

    .line 652
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->retailerTerms:Ljava/lang/String;

    return-void
.end method

.method public setSecondaryCategoryId(I)V
    .locals 0

    .line 546
    iput p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->secondaryCategoryId:I

    const/4 p1, 0x0

    .line 547
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->categoryIds:Ljava/util/Set;

    return-void
.end method

.method public setShortDescription(Ljava/lang/String;)V
    .locals 0

    .line 628
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->shortDescription:Ljava/lang/String;

    return-void
.end method

.method public setShortName(Ljava/lang/String;)V
    .locals 0

    .line 217
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->shortName:Ljava/lang/String;

    return-void
.end method

.method public setSortData(Ljava/lang/String;)V
    .locals 0

    .line 595
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->sortData:Ljava/lang/String;

    return-void
.end method

.method public setSortOrder(Ljava/lang/String;)V
    .locals 0

    .line 273
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->sortOrder:Ljava/lang/String;

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

    .line 819
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->stores:Ljava/util/List;

    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .line 749
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->url:Ljava/lang/String;

    return-void
.end method

.method public setVerificationType(Ljava/lang/String;)V
    .locals 0

    .line 186
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->verificationType:Ljava/lang/String;

    const/4 p1, 0x0

    .line 187
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Retailer;->verificationTypeEnum:Lcom/ibotta/api/model/common/VerificationType;

    return-void
.end method
