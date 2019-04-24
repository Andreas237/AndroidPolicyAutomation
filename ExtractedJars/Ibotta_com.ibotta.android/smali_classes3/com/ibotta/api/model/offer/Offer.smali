.class public Lcom/ibotta/api/model/offer/Offer;
.super Ljava/lang/Object;
.source "Offer.java"

# interfaces
.implements Lcom/ibotta/api/Likable;
.implements Lcom/ibotta/api/model/OfferModel;


# instance fields
.field private about:Ljava/lang/String;

.field private aboutTitle:Ljava/lang/String;

.field private activated:Z

.field private active:Z

.field private alternateText:Ljava/lang/String;

.field private amount:F

.field private anyBrand:Z

.field private availableAtRetailers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end field

.field private blockCustomerSubmittedUpcs:Z

.field private bonusIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private buttonInfo:Lcom/ibotta/api/model/retailer/ButtonInfo;

.field private caption:Ljava/lang/String;

.field private categories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/Category;",
            ">;"
        }
    .end annotation
.end field

.field private combo:Z

.field private comboCount:Ljava/lang/Integer;

.field private contextSortData:Lcom/ibotta/api/model/offer/ContextSortData;

.field private currentValue:Ljava/lang/String;

.field private dasherizedName:Ljava/lang/String;

.field private description:Ljava/lang/String;

.field private digitalProducts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/DigitalProduct;",
            ">;"
        }
    .end annotation
.end field

.field private discountBarcodeCode:Ljava/lang/String;

.field private discountBarcodeType:Ljava/lang/String;

.field private discountCode:Ljava/lang/String;

.field private earnedAmount:F

.field private endTime:Ljava/util/Date;

.field private expiration:Ljava/util/Date;

.field private expiringSoon:Z

.field private gameViewed:Z

.field private hideAvailableAt:Z

.field private hotness:Ljava/lang/Float;

.field private id:I

.field private idString:Ljava/lang/String;

.field private ignoreBarcode:Z

.field private inGallery:Ljava/util/Date;

.field private largeUrl:Ljava/lang/String;

.field private launchedAt:Ljava/util/Date;

.field private legal:Ljava/lang/String;

.field private liked:Z

.field private link:Ljava/lang/String;

.field private multiples:Ljava/lang/String;

.field private multiplesCount:S

.field private transient multiplesEnum:Lcom/ibotta/api/model/offer/Multiples;

.field private name:Ljava/lang/String;

.field private newFlag:Z

.field private nonItem:Z

.field private nonItemTotal:F

.field private offerImageOrientation:Ljava/lang/String;

.field private offerSegmentId:I

.field private offerTags:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/OfferTag;",
            ">;"
        }
    .end annotation
.end field

.field private offerType:Ljava/lang/String;

.field private transient offerTypeEnum:Lcom/ibotta/api/model/offer/OfferType;

.field private oldValue:Ljava/lang/String;

.field private percentBack:Ljava/lang/Float;

.field private transient productGroups:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/ProductGroup;",
            ">;"
        }
    .end annotation
.end field

.field private transient products:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private promos:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/promo/Promo;",
            ">;"
        }
    .end annotation
.end field

.field private purchaseType:Ljava/lang/String;

.field private transient purchaseTypeEnum:Lcom/ibotta/api/model/common/VerificationType;

.field private randomWeight:Z

.field private randomWeightTotal:F

.field private receiptTotal:F

.field private recommendationScore:F

.field private redemptionMax:S

.field private redemptionText:Ljava/lang/String;

.field private retailerCategories:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private retailerExclusive:Z

.field private retailers:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private rewards:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
        contentAs = Lcom/ibotta/api/model/offer/Reward;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RewardModel;",
            ">;"
        }
    .end annotation
.end field

.field private segmentId:I

.field private selfFunded:Z

.field private shareUrl:Ljava/lang/String;

.field private sortOrder:Ljava/lang/String;

.field private storeUri:Ljava/lang/String;

.field private terms:Ljava/lang/String;

.field private thumbUrl:Ljava/lang/String;

.field private totalFriendLikes:I

.field private totalLikes:J

.field private type:Ljava/lang/String;

.field private transient typeEnum:Lcom/ibotta/api/model/ContentModel$Type;

.field private url:Ljava/lang/String;

.field private variablePercentBack:Ljava/lang/String;

.field private verified:Z

.field private verifiedCount:I

.field private vote:S

.field private weight:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->retailers:Ljava/util/Set;

    .line 106
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->availableAtRetailers:Ljava/util/List;

    .line 107
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->categories:Ljava/util/List;

    .line 108
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->promos:Ljava/util/List;

    .line 109
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->products:Ljava/util/Set;

    .line 110
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->productGroups:Ljava/util/List;

    .line 112
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->rewards:Ljava/util/List;

    .line 115
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->bonusIds:Ljava/util/Set;

    .line 116
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->digitalProducts:Ljava/util/List;

    .line 117
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->offerTags:Ljava/util/List;

    .line 118
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->retailerCategories:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public getAbout()Ljava/lang/String;
    .locals 1

    .line 713
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->about:Ljava/lang/String;

    return-object v0
.end method

.method public getAboutTitle()Ljava/lang/String;
    .locals 1

    .line 705
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->aboutTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getAlternateText()Ljava/lang/String;
    .locals 1

    .line 875
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->alternateText:Ljava/lang/String;

    return-object v0
.end method

.method public getAmount()F
    .locals 1

    .line 146
    iget v0, p0, Lcom/ibotta/api/model/offer/Offer;->amount:F

    return v0
.end method

.method public getAvailableAtRetailers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation

    .line 442
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->availableAtRetailers:Ljava/util/List;

    return-object v0
.end method

.method public getBonusIds()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 501
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->bonusIds:Ljava/util/Set;

    return-object v0
.end method

.method public getButtonInfo()Lcom/ibotta/api/model/retailer/ButtonInfo;
    .locals 1

    .line 811
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->buttonInfo:Lcom/ibotta/api/model/retailer/ButtonInfo;

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCaption()Ljava/lang/String;
    .locals 1

    .line 839
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->caption:Ljava/lang/String;

    return-object v0
.end method

.method public getCategories()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/Category;",
            ">;"
        }
    .end annotation

    .line 451
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->categories:Ljava/util/List;

    return-object v0
.end method

.method public getComboCount()Ljava/lang/Integer;
    .locals 1

    .line 361
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->comboCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public getContextSortData()Lcom/ibotta/api/model/offer/ContextSortData;
    .locals 1

    .line 819
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->contextSortData:Lcom/ibotta/api/model/offer/ContextSortData;

    return-object v0
.end method

.method public getCurrentValue()Ljava/lang/String;
    .locals 1

    .line 857
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->currentValue:Ljava/lang/String;

    return-object v0
.end method

.method public getDasherizedName()Ljava/lang/String;
    .locals 1

    .line 692
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->dasherizedName:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 694
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->name:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/util/Dasherize;->dasherize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->dasherizedName:Ljava/lang/String;

    .line 697
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->dasherizedName:Ljava/lang/String;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 155
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getDigitalProducts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/DigitalProduct;",
            ">;"
        }
    .end annotation

    .line 509
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->digitalProducts:Ljava/util/List;

    return-object v0
.end method

.method public getDiscountBarcodeCode()Ljava/lang/String;
    .locals 1

    .line 757
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->discountBarcodeCode:Ljava/lang/String;

    return-object v0
.end method

.method public getDiscountBarcodeType()Ljava/lang/String;
    .locals 1

    .line 745
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->discountBarcodeType:Ljava/lang/String;

    return-object v0
.end method

.method public getDiscountBarcodeTypeEnum()Lcom/ibotta/api/model/common/BarcodeType;
    .locals 1

    .line 753
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->discountBarcodeType:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/common/BarcodeType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/common/BarcodeType;

    move-result-object v0

    return-object v0
.end method

.method public getDiscountCode()Ljava/lang/String;
    .locals 1

    .line 737
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->discountCode:Ljava/lang/String;

    return-object v0
.end method

.method public getEarnedAmount()F
    .locals 1

    .line 729
    iget v0, p0, Lcom/ibotta/api/model/offer/Offer;->earnedAmount:F

    return v0
.end method

.method public getEndTime()Ljava/util/Date;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->endTime:Ljava/util/Date;

    return-object v0
.end method

.method public getExpiration()Ljava/util/Date;
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->expiration:Ljava/util/Date;

    return-object v0
.end method

.method public getGameViewed()Z
    .locals 1

    .line 428
    iget-boolean v0, p0, Lcom/ibotta/api/model/offer/Offer;->gameViewed:Z

    return v0
.end method

.method public getHotness()Ljava/lang/Float;
    .locals 1

    .line 607
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->hotness:Ljava/lang/Float;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 128
    iget v0, p0, Lcom/ibotta/api/model/offer/Offer;->id:I

    return v0
.end method

.method public getIdString()Ljava/lang/String;
    .locals 1

    .line 137
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->idString:Ljava/lang/String;

    return-object v0
.end method

.method public getInGallery()Ljava/util/Date;
    .locals 1

    .line 583
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->inGallery:Ljava/util/Date;

    return-object v0
.end method

.method public getLargeUrl()Ljava/lang/String;
    .locals 1

    .line 195
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->largeUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getLaunchedAt()Ljava/util/Date;
    .locals 1

    .line 163
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->launchedAt:Ljava/util/Date;

    return-object v0
.end method

.method public getLegal()Ljava/lang/String;
    .locals 1

    .line 672
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->legal:Ljava/lang/String;

    return-object v0
.end method

.method public getLink()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 887
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->link:Ljava/lang/String;

    return-object v0
.end method

.method public getMultiples()Ljava/lang/String;
    .locals 1

    .line 326
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->multiples:Ljava/lang/String;

    return-object v0
.end method

.method public getMultiplesCount()S
    .locals 1

    .line 344
    iget-short v0, p0, Lcom/ibotta/api/model/offer/Offer;->multiplesCount:S

    return v0
.end method

.method public getMultiplesEnum()Lcom/ibotta/api/model/offer/Multiples;
    .locals 1

    .line 335
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->multiplesEnum:Lcom/ibotta/api/model/offer/Multiples;

    if-eqz v0, :cond_0

    return-object v0

    .line 338
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->multiples:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/offer/Multiples;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/offer/Multiples;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->multiplesEnum:Lcom/ibotta/api/model/offer/Multiples;

    .line 339
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->multiplesEnum:Lcom/ibotta/api/model/offer/Multiples;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 213
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getNonItemTotal()F
    .locals 1

    .line 282
    iget v0, p0, Lcom/ibotta/api/model/offer/Offer;->nonItemTotal:F

    return v0
.end method

.method public getOfferAmountType()Lcom/ibotta/api/model/offer/OfferAmountType;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getOfferGroupId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getOfferImageOrientation()Ljava/lang/String;
    .locals 1

    .line 773
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->offerImageOrientation:Ljava/lang/String;

    return-object v0
.end method

.method public getOfferImageOrientationEnum()Lcom/ibotta/api/model/offer/Orientation;
    .locals 1

    .line 781
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->offerImageOrientation:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/offer/Orientation;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/offer/Orientation;

    move-result-object v0

    return-object v0
.end method

.method public getOfferSegmentId()I
    .locals 1

    .line 906
    iget v0, p0, Lcom/ibotta/api/model/offer/Offer;->offerSegmentId:I

    return v0
.end method

.method public getOfferTags()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/OfferTag;",
            ">;"
        }
    .end annotation

    .line 517
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->offerTags:Ljava/util/List;

    return-object v0
.end method

.method public getOfferType()Ljava/lang/String;
    .locals 1

    .line 236
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->offerType:Ljava/lang/String;

    return-object v0
.end method

.method public getOfferTypeEnum()Lcom/ibotta/api/model/offer/OfferType;
    .locals 1

    .line 375
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->offerTypeEnum:Lcom/ibotta/api/model/offer/OfferType;

    if-eqz v0, :cond_0

    return-object v0

    .line 378
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->offerType:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/offer/OfferType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/offer/OfferType;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->offerTypeEnum:Lcom/ibotta/api/model/offer/OfferType;

    .line 379
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->offerTypeEnum:Lcom/ibotta/api/model/offer/OfferType;

    return-object v0
.end method

.method public getOldValue()Ljava/lang/String;
    .locals 1

    .line 866
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->oldValue:Ljava/lang/String;

    return-object v0
.end method

.method public getPercentBack()Ljava/lang/Float;
    .locals 1

    .line 721
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->percentBack:Ljava/lang/Float;

    return-object v0
.end method

.method public getProductGroups()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/ProductGroup;",
            ">;"
        }
    .end annotation

    .line 476
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->productGroups:Ljava/util/List;

    return-object v0
.end method

.method public getProducts()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 468
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->products:Ljava/util/Set;

    return-object v0
.end method

.method public getPromos()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/promo/Promo;",
            ">;"
        }
    .end annotation

    .line 459
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->promos:Ljava/util/List;

    return-object v0
.end method

.method public getPurchaseType()Ljava/lang/String;
    .locals 1

    .line 621
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->purchaseType:Ljava/lang/String;

    return-object v0
.end method

.method public getPurchaseTypeEnum()Lcom/ibotta/api/model/common/VerificationType;
    .locals 1

    .line 630
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->purchaseTypeEnum:Lcom/ibotta/api/model/common/VerificationType;

    if-eqz v0, :cond_0

    return-object v0

    .line 633
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->purchaseType:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/common/VerificationType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->purchaseTypeEnum:Lcom/ibotta/api/model/common/VerificationType;

    .line 634
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->purchaseTypeEnum:Lcom/ibotta/api/model/common/VerificationType;

    return-object v0
.end method

.method public getRandomWeightTotal()F
    .locals 1

    .line 648
    iget v0, p0, Lcom/ibotta/api/model/offer/Offer;->randomWeightTotal:F

    return v0
.end method

.method public getReceiptTotal()F
    .locals 1

    .line 290
    iget v0, p0, Lcom/ibotta/api/model/offer/Offer;->receiptTotal:F

    return v0
.end method

.method public getRecommendationScore()F
    .locals 1

    .line 765
    iget v0, p0, Lcom/ibotta/api/model/offer/Offer;->recommendationScore:F

    return v0
.end method

.method public getRedemptionMax()S
    .locals 1

    .line 828
    iget-short v0, p0, Lcom/ibotta/api/model/offer/Offer;->redemptionMax:S

    return v0
.end method

.method public getRedemptionText()Ljava/lang/String;
    .locals 1

    .line 298
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->redemptionText:Ljava/lang/String;

    return-object v0
.end method

.method public getRetailerCategories()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 525
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->retailerCategories:Ljava/util/Set;

    return-object v0
.end method

.method public getRetailers()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 433
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->retailers:Ljava/util/Set;

    return-object v0
.end method

.method public getRewards()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RewardModel;",
            ">;"
        }
    .end annotation

    .line 493
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->rewards:Ljava/util/List;

    return-object v0
.end method

.method public getSegmentId()I
    .locals 1

    .line 897
    iget v0, p0, Lcom/ibotta/api/model/offer/Offer;->segmentId:I

    return v0
.end method

.method public getShareUrl()Ljava/lang/String;
    .locals 1

    .line 599
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->shareUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getSortOrder()Ljava/lang/String;
    .locals 1

    .line 664
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->sortOrder:Ljava/lang/String;

    return-object v0
.end method

.method public getStoreUri()Ljava/lang/String;
    .locals 1

    .line 549
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->storeUri:Ljava/lang/String;

    return-object v0
.end method

.method public getTerms()Ljava/lang/String;
    .locals 1

    .line 221
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->terms:Ljava/lang/String;

    return-object v0
.end method

.method public getThumbUrl()Ljava/lang/String;
    .locals 1

    .line 204
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->thumbUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getTotalFriendLikes()I
    .locals 1

    .line 566
    iget v0, p0, Lcom/ibotta/api/model/offer/Offer;->totalFriendLikes:I

    return v0
.end method

.method public getTotalLikes()J
    .locals 2

    .line 558
    iget-wide v0, p0, Lcom/ibotta/api/model/offer/Offer;->totalLikes:J

    return-wide v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 241
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->type:Ljava/lang/String;

    return-object v0
.end method

.method public getTypeEnum()Lcom/ibotta/api/model/ContentModel$Type;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 246
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->typeEnum:Lcom/ibotta/api/model/ContentModel$Type;

    if-eqz v0, :cond_0

    return-object v0

    .line 249
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->type:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/ContentModel$Type;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/ContentModel$Type;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->typeEnum:Lcom/ibotta/api/model/ContentModel$Type;

    .line 250
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->typeEnum:Lcom/ibotta/api/model/ContentModel$Type;

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

    .line 187
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->url:Ljava/lang/String;

    return-object v0
.end method

.method public getVariablePercentBack()Ljava/lang/String;
    .locals 1

    .line 793
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->variablePercentBack:Ljava/lang/String;

    return-object v0
.end method

.method public getVerifiedCount()I
    .locals 1

    .line 802
    iget v0, p0, Lcom/ibotta/api/model/offer/Offer;->verifiedCount:I

    return v0
.end method

.method public getVote()S
    .locals 1

    .line 391
    iget-short v0, p0, Lcom/ibotta/api/model/offer/Offer;->vote:S

    return v0
.end method

.method public getWeight()F
    .locals 1

    .line 383
    iget v0, p0, Lcom/ibotta/api/model/offer/Offer;->weight:F

    return v0
.end method

.method public hasBonuses()Z
    .locals 1

    .line 484
    invoke-virtual {p0}, Lcom/ibotta/api/model/offer/Offer;->getBonusIds()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/api/model/offer/Offer;->getBonusIds()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasPromos()Z
    .locals 1

    .line 488
    invoke-virtual {p0}, Lcom/ibotta/api/model/offer/Offer;->getPromos()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/api/model/offer/Offer;->getPromos()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isActivated()Z
    .locals 1

    .line 416
    iget-boolean v0, p0, Lcom/ibotta/api/model/offer/Offer;->activated:Z

    return v0
.end method

.method public isActive()Z
    .locals 1

    .line 407
    iget-boolean v0, p0, Lcom/ibotta/api/model/offer/Offer;->active:Z

    return v0
.end method

.method public isAnyBrand()Z
    .locals 1

    .line 591
    iget-boolean v0, p0, Lcom/ibotta/api/model/offer/Offer;->anyBrand:Z

    return v0
.end method

.method public isAvailableAsAnyBrand()Z
    .locals 1

    .line 688
    iget-boolean v0, p0, Lcom/ibotta/api/model/offer/Offer;->anyBrand:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/api/model/offer/Offer;->inGallery:Ljava/util/Date;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isBlockCustomerSubmittedUpcs()Z
    .locals 1

    .line 680
    iget-boolean v0, p0, Lcom/ibotta/api/model/offer/Offer;->blockCustomerSubmittedUpcs:Z

    return v0
.end method

.method public isCombo()Z
    .locals 1

    .line 353
    iget-boolean v0, p0, Lcom/ibotta/api/model/offer/Offer;->combo:Z

    return v0
.end method

.method public isExpiringSoon()Z
    .locals 1

    .line 848
    iget-boolean v0, p0, Lcom/ibotta/api/model/offer/Offer;->expiringSoon:Z

    return v0
.end method

.method public isHideAvailableAt()Z
    .locals 1

    .line 656
    iget-boolean v0, p0, Lcom/ibotta/api/model/offer/Offer;->hideAvailableAt:Z

    return v0
.end method

.method public isIgnoreBarcode()Z
    .locals 1

    .line 266
    iget-boolean v0, p0, Lcom/ibotta/api/model/offer/Offer;->ignoreBarcode:Z

    return v0
.end method

.method public isLiked()Z
    .locals 1

    .line 575
    iget-boolean v0, p0, Lcom/ibotta/api/model/offer/Offer;->liked:Z

    return v0
.end method

.method public isMultipleRedemptions()Z
    .locals 2

    .line 317
    invoke-virtual {p0}, Lcom/ibotta/api/model/offer/Offer;->isCombo()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/api/model/offer/Offer;->isMultiples()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/api/model/offer/Offer;->getRedemptionMax()S

    move-result v0

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public isMultiples()Z
    .locals 2

    .line 307
    invoke-virtual {p0}, Lcom/ibotta/api/model/offer/Offer;->getMultiplesEnum()Lcom/ibotta/api/model/offer/Multiples;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/offer/Multiples;->NONE:Lcom/ibotta/api/model/offer/Multiples;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/api/model/offer/Offer;->getMultiplesCount()S

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isMultiplesUnique()Z
    .locals 2

    .line 312
    invoke-virtual {p0}, Lcom/ibotta/api/model/offer/Offer;->getMultiplesEnum()Lcom/ibotta/api/model/offer/Multiples;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/offer/Multiples;->UNIQUE:Lcom/ibotta/api/model/offer/Multiples;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isNewFlag()Z
    .locals 1

    .line 399
    iget-boolean v0, p0, Lcom/ibotta/api/model/offer/Offer;->newFlag:Z

    return v0
.end method

.method public isNonItem()Z
    .locals 1

    .line 274
    iget-boolean v0, p0, Lcom/ibotta/api/model/offer/Offer;->nonItem:Z

    return v0
.end method

.method public isPreselect()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isRandomWeight()Z
    .locals 1

    .line 639
    iget-boolean v0, p0, Lcom/ibotta/api/model/offer/Offer;->randomWeight:Z

    return v0
.end method

.method public isRetailerExclusive()Z
    .locals 1

    .line 533
    iget-boolean v0, p0, Lcom/ibotta/api/model/offer/Offer;->retailerExclusive:Z

    return v0
.end method

.method public isSelfFunded()Z
    .locals 1

    .line 785
    iget-boolean v0, p0, Lcom/ibotta/api/model/offer/Offer;->selfFunded:Z

    return v0
.end method

.method public isStandard()Z
    .locals 1

    .line 322
    invoke-virtual {p0}, Lcom/ibotta/api/model/offer/Offer;->isCombo()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/api/model/offer/Offer;->isMultiples()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/api/model/offer/Offer;->isMultipleRedemptions()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isVerified()Z
    .locals 1

    .line 541
    iget-boolean v0, p0, Lcom/ibotta/api/model/offer/Offer;->verified:Z

    return v0
.end method

.method public setAbout(Ljava/lang/String;)V
    .locals 0

    .line 717
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->about:Ljava/lang/String;

    return-void
.end method

.method public setAboutTitle(Ljava/lang/String;)V
    .locals 0

    .line 709
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->aboutTitle:Ljava/lang/String;

    return-void
.end method

.method public setActivated(Z)V
    .locals 0

    .line 420
    iput-boolean p1, p0, Lcom/ibotta/api/model/offer/Offer;->activated:Z

    return-void
.end method

.method public setActive(Z)V
    .locals 0

    .line 411
    iput-boolean p1, p0, Lcom/ibotta/api/model/offer/Offer;->active:Z

    return-void
.end method

.method public setAlternateText(Ljava/lang/String;)V
    .locals 0

    .line 880
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->alternateText:Ljava/lang/String;

    return-void
.end method

.method public setAmount(F)V
    .locals 0

    .line 151
    iput p1, p0, Lcom/ibotta/api/model/offer/Offer;->amount:F

    return-void
.end method

.method public setAnyBrand(Z)V
    .locals 0

    .line 595
    iput-boolean p1, p0, Lcom/ibotta/api/model/offer/Offer;->anyBrand:Z

    return-void
.end method

.method public setAvailableAtRetailers(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)V"
        }
    .end annotation

    .line 446
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->availableAtRetailers:Ljava/util/List;

    return-void
.end method

.method public setBlockCustomerSubmittedUpcs(Z)V
    .locals 0

    .line 684
    iput-boolean p1, p0, Lcom/ibotta/api/model/offer/Offer;->blockCustomerSubmittedUpcs:Z

    return-void
.end method

.method public setBonusIds(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 505
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->bonusIds:Ljava/util/Set;

    return-void
.end method

.method public setButtonInfo(Lcom/ibotta/api/model/retailer/ButtonInfo;)V
    .locals 0

    .line 815
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->buttonInfo:Lcom/ibotta/api/model/retailer/ButtonInfo;

    return-void
.end method

.method public setCaption(Ljava/lang/String;)V
    .locals 0

    .line 843
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->caption:Ljava/lang/String;

    return-void
.end method

.method public setCategories(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/Category;",
            ">;)V"
        }
    .end annotation

    .line 455
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->categories:Ljava/util/List;

    return-void
.end method

.method public setCombo(Z)V
    .locals 0

    .line 357
    iput-boolean p1, p0, Lcom/ibotta/api/model/offer/Offer;->combo:Z

    return-void
.end method

.method public setComboCount(Ljava/lang/Integer;)V
    .locals 0

    .line 365
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->comboCount:Ljava/lang/Integer;

    return-void
.end method

.method public setContextSortData(Lcom/ibotta/api/model/offer/ContextSortData;)V
    .locals 0

    .line 823
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->contextSortData:Lcom/ibotta/api/model/offer/ContextSortData;

    return-void
.end method

.method public setCurrentValue(Ljava/lang/String;)V
    .locals 0

    .line 861
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->currentValue:Ljava/lang/String;

    return-void
.end method

.method public setDasherizedName(Ljava/lang/String;)V
    .locals 0

    .line 701
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->dasherizedName:Ljava/lang/String;

    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 159
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->description:Ljava/lang/String;

    return-void
.end method

.method public setDigitalProducts(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/DigitalProduct;",
            ">;)V"
        }
    .end annotation

    .line 513
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->digitalProducts:Ljava/util/List;

    return-void
.end method

.method public setDiscountBarcodeCode(Ljava/lang/String;)V
    .locals 0

    .line 761
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->discountBarcodeCode:Ljava/lang/String;

    return-void
.end method

.method public setDiscountBarcodeType(Ljava/lang/String;)V
    .locals 0

    .line 749
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->discountBarcodeType:Ljava/lang/String;

    return-void
.end method

.method public setDiscountCode(Ljava/lang/String;)V
    .locals 0

    .line 741
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->discountCode:Ljava/lang/String;

    return-void
.end method

.method public setEarnedAmount(F)V
    .locals 0

    .line 733
    iput p1, p0, Lcom/ibotta/api/model/offer/Offer;->earnedAmount:F

    return-void
.end method

.method public setEndTime(Ljava/util/Date;)V
    .locals 0

    .line 183
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->endTime:Ljava/util/Date;

    return-void
.end method

.method public setExpiration(Ljava/util/Date;)V
    .locals 0

    .line 175
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->expiration:Ljava/util/Date;

    return-void
.end method

.method public setExpiringSoon(Z)V
    .locals 0

    .line 852
    iput-boolean p1, p0, Lcom/ibotta/api/model/offer/Offer;->expiringSoon:Z

    return-void
.end method

.method public setGameViewed(Z)V
    .locals 0

    .line 424
    iput-boolean p1, p0, Lcom/ibotta/api/model/offer/Offer;->gameViewed:Z

    return-void
.end method

.method public setHideAvailableAt(Z)V
    .locals 0

    .line 660
    iput-boolean p1, p0, Lcom/ibotta/api/model/offer/Offer;->hideAvailableAt:Z

    return-void
.end method

.method public setHotness(Ljava/lang/Float;)V
    .locals 0

    .line 611
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->hotness:Ljava/lang/Float;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 132
    iput p1, p0, Lcom/ibotta/api/model/offer/Offer;->id:I

    return-void
.end method

.method public setIdString(Ljava/lang/String;)V
    .locals 0

    .line 141
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->idString:Ljava/lang/String;

    return-void
.end method

.method public setIgnoreBarcode(Z)V
    .locals 0

    .line 270
    iput-boolean p1, p0, Lcom/ibotta/api/model/offer/Offer;->ignoreBarcode:Z

    return-void
.end method

.method public setInGallery(Ljava/util/Date;)V
    .locals 0

    .line 587
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->inGallery:Ljava/util/Date;

    return-void
.end method

.method public setLargeUrl(Ljava/lang/String;)V
    .locals 0

    .line 199
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->largeUrl:Ljava/lang/String;

    return-void
.end method

.method public setLaunchedAt(Ljava/util/Date;)V
    .locals 0

    .line 167
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->launchedAt:Ljava/util/Date;

    return-void
.end method

.method public setLegal(Ljava/lang/String;)V
    .locals 0

    .line 676
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->legal:Ljava/lang/String;

    return-void
.end method

.method public setLiked(Z)V
    .locals 0

    .line 579
    iput-boolean p1, p0, Lcom/ibotta/api/model/offer/Offer;->liked:Z

    return-void
.end method

.method public setLink(Ljava/lang/String;)V
    .locals 0

    .line 892
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->link:Ljava/lang/String;

    return-void
.end method

.method public setMultiples(Ljava/lang/String;)V
    .locals 0

    .line 330
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->multiples:Ljava/lang/String;

    const/4 p1, 0x0

    .line 331
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->multiplesEnum:Lcom/ibotta/api/model/offer/Multiples;

    return-void
.end method

.method public setMultiplesCount(S)V
    .locals 0

    .line 348
    iput-short p1, p0, Lcom/ibotta/api/model/offer/Offer;->multiplesCount:S

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 217
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->name:Ljava/lang/String;

    return-void
.end method

.method public setNewFlag(Z)V
    .locals 0

    .line 403
    iput-boolean p1, p0, Lcom/ibotta/api/model/offer/Offer;->newFlag:Z

    return-void
.end method

.method public setNonItem(Z)V
    .locals 0

    .line 278
    iput-boolean p1, p0, Lcom/ibotta/api/model/offer/Offer;->nonItem:Z

    return-void
.end method

.method public setNonItemTotal(F)V
    .locals 0

    .line 286
    iput p1, p0, Lcom/ibotta/api/model/offer/Offer;->nonItemTotal:F

    return-void
.end method

.method public setOfferImageOrientation(Ljava/lang/String;)V
    .locals 0

    .line 777
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->offerImageOrientation:Ljava/lang/String;

    return-void
.end method

.method public setOfferSegmentId(I)V
    .locals 0

    .line 910
    iput p1, p0, Lcom/ibotta/api/model/offer/Offer;->offerSegmentId:I

    return-void
.end method

.method public setOfferTags(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/OfferTag;",
            ">;)V"
        }
    .end annotation

    .line 521
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->offerTags:Ljava/util/List;

    return-void
.end method

.method public setOfferType(Ljava/lang/String;)V
    .locals 0

    .line 254
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->offerType:Ljava/lang/String;

    const/4 p1, 0x0

    .line 255
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->offerTypeEnum:Lcom/ibotta/api/model/offer/OfferType;

    return-void
.end method

.method public setOldValue(Ljava/lang/String;)V
    .locals 0

    .line 870
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->oldValue:Ljava/lang/String;

    return-void
.end method

.method public setPercentBack(Ljava/lang/Float;)V
    .locals 0

    .line 725
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->percentBack:Ljava/lang/Float;

    return-void
.end method

.method public setProductGroups(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/ProductGroup;",
            ">;)V"
        }
    .end annotation

    .line 480
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->productGroups:Ljava/util/List;

    return-void
.end method

.method public setProducts(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 472
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->products:Ljava/util/Set;

    return-void
.end method

.method public setPromos(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/promo/Promo;",
            ">;)V"
        }
    .end annotation

    .line 463
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->promos:Ljava/util/List;

    return-void
.end method

.method public setPurchaseType(Ljava/lang/String;)V
    .locals 0

    .line 625
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->purchaseType:Ljava/lang/String;

    const/4 p1, 0x0

    .line 626
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->purchaseTypeEnum:Lcom/ibotta/api/model/common/VerificationType;

    return-void
.end method

.method public setRandomWeight(Z)V
    .locals 0

    .line 643
    iput-boolean p1, p0, Lcom/ibotta/api/model/offer/Offer;->randomWeight:Z

    return-void
.end method

.method public setRandomWeightTotal(F)V
    .locals 0

    .line 652
    iput p1, p0, Lcom/ibotta/api/model/offer/Offer;->randomWeightTotal:F

    return-void
.end method

.method public setReceiptTotal(F)V
    .locals 0

    .line 294
    iput p1, p0, Lcom/ibotta/api/model/offer/Offer;->receiptTotal:F

    return-void
.end method

.method public setRecommendationScore(F)V
    .locals 0

    .line 769
    iput p1, p0, Lcom/ibotta/api/model/offer/Offer;->recommendationScore:F

    return-void
.end method

.method public setRedemptionMax(S)V
    .locals 0

    .line 832
    iput-short p1, p0, Lcom/ibotta/api/model/offer/Offer;->redemptionMax:S

    return-void
.end method

.method public setRedemptionText(Ljava/lang/String;)V
    .locals 0

    .line 302
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->redemptionText:Ljava/lang/String;

    return-void
.end method

.method public setRetailerCategories(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 529
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->retailerCategories:Ljava/util/Set;

    return-void
.end method

.method public setRetailerExclusive(Z)V
    .locals 0

    .line 537
    iput-boolean p1, p0, Lcom/ibotta/api/model/offer/Offer;->retailerExclusive:Z

    return-void
.end method

.method public setRetailers(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 437
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->retailers:Ljava/util/Set;

    return-void
.end method

.method public setRewards(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RewardModel;",
            ">;)V"
        }
    .end annotation

    .line 497
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->rewards:Ljava/util/List;

    return-void
.end method

.method public setSegmentId(I)V
    .locals 0

    .line 901
    iput p1, p0, Lcom/ibotta/api/model/offer/Offer;->segmentId:I

    return-void
.end method

.method public setSelfFunded(Z)V
    .locals 0

    .line 789
    iput-boolean p1, p0, Lcom/ibotta/api/model/offer/Offer;->selfFunded:Z

    return-void
.end method

.method public setShareUrl(Ljava/lang/String;)V
    .locals 0

    .line 603
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->shareUrl:Ljava/lang/String;

    return-void
.end method

.method public setSortOrder(Ljava/lang/String;)V
    .locals 0

    .line 668
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->sortOrder:Ljava/lang/String;

    return-void
.end method

.method public setStoreUri(Ljava/lang/String;)V
    .locals 0

    .line 553
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->storeUri:Ljava/lang/String;

    return-void
.end method

.method public setTerms(Ljava/lang/String;)V
    .locals 0

    .line 225
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->terms:Ljava/lang/String;

    return-void
.end method

.method public setThumbUrl(Ljava/lang/String;)V
    .locals 0

    .line 208
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->thumbUrl:Ljava/lang/String;

    return-void
.end method

.method public setTotalFriendLikes(I)V
    .locals 0

    .line 570
    iput p1, p0, Lcom/ibotta/api/model/offer/Offer;->totalFriendLikes:I

    return-void
.end method

.method public setTotalLikes(J)V
    .locals 0

    .line 562
    iput-wide p1, p0, Lcom/ibotta/api/model/offer/Offer;->totalLikes:J

    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .line 191
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->url:Ljava/lang/String;

    return-void
.end method

.method public setVariablePercentBack(Ljava/lang/String;)V
    .locals 0

    .line 797
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Offer;->variablePercentBack:Ljava/lang/String;

    return-void
.end method

.method public setVerified(Z)V
    .locals 0

    .line 545
    iput-boolean p1, p0, Lcom/ibotta/api/model/offer/Offer;->verified:Z

    return-void
.end method

.method public setVerifiedCount(I)V
    .locals 0

    .line 806
    iput p1, p0, Lcom/ibotta/api/model/offer/Offer;->verifiedCount:I

    return-void
.end method

.method public setVote(S)V
    .locals 0

    .line 395
    iput-short p1, p0, Lcom/ibotta/api/model/offer/Offer;->vote:S

    return-void
.end method

.method public setWeight(F)V
    .locals 0

    .line 387
    iput p1, p0, Lcom/ibotta/api/model/offer/Offer;->weight:F

    return-void
.end method
