.class public Lcom/ibotta/api/model/content/OfferContent;
.super Lcom/ibotta/api/model/base/BaseContent;
.source "OfferContent.java"

# interfaces
.implements Lcom/ibotta/api/model/OfferModel;


# instance fields
.field private about:Ljava/lang/String;

.field private aboutTitle:Ljava/lang/String;

.field private activated:Z

.field private alternateText:Ljava/lang/String;

.field private amount:F

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
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bonuses"
    .end annotation

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
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonIgnore;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/Category;",
            ">;"
        }
    .end annotation
.end field

.field private categoryIds:Ljava/util/Set;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "categories"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private combo:Z

.field private contextSortData:Lcom/ibotta/api/model/offer/ContextSortData;

.field private currentValue:Ljava/lang/String;

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

.field private expiration:Ljava/util/Date;

.field private expiringSoon:Z

.field private hideAvailableAt:Z

.field private hotness:Ljava/lang/Float;

.field private ignoreBarcode:Z

.field private largeUrl:Ljava/lang/String;

.field private legal:Ljava/lang/String;

.field private liked:Z

.field private multiples:Ljava/lang/String;

.field private multiplesCount:S

.field private transient multiplesEnum:Lcom/ibotta/api/model/offer/Multiples;

.field private newFlag:Z

.field private nonItem:Z

.field private nonItemTotal:F

.field private offerGroupId:Ljava/lang/Integer;

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

.field private offerTypeEnum:Lcom/ibotta/api/model/offer/OfferType;

.field private oldValue:Ljava/lang/String;

.field private percentBack:Ljava/lang/Float;

.field private preselect:Z

.field private productGroups:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/ProductGroup;",
            ">;"
        }
    .end annotation
.end field

.field private products:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
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

.field private retailerCategories:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

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
        contentAs = Lcom/ibotta/api/model/content/RewardContent;
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

.field private terms:Ljava/lang/String;

.field private thumbUrl:Ljava/lang/String;

.field private totalLikes:J

.field private url:Ljava/lang/String;

.field private variablePercentBack:Ljava/lang/String;

.field private verified:Z

.field private verifiedCount:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Lcom/ibotta/api/model/base/BaseContent;-><init>()V

    .line 93
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->bonusIds:Ljava/util/Set;

    .line 95
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->categoryIds:Ljava/util/Set;

    .line 97
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->categories:Ljava/util/List;

    .line 99
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->digitalProducts:Ljava/util/List;

    .line 100
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->offerTags:Ljava/util/List;

    .line 101
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->productGroups:Ljava/util/List;

    .line 102
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->products:Ljava/util/Set;

    .line 103
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->retailerCategories:Ljava/util/Set;

    .line 104
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->retailers:Ljava/util/Set;

    .line 105
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->availableAtRetailers:Ljava/util/List;

    .line 107
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->rewards:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getAbout()Ljava/lang/String;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->about:Ljava/lang/String;

    return-object v0
.end method

.method public getAboutTitle()Ljava/lang/String;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->aboutTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getAlternateText()Ljava/lang/String;
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->alternateText:Ljava/lang/String;

    return-object v0
.end method

.method public getAmount()F
    .locals 1

    .line 150
    iget v0, p0, Lcom/ibotta/api/model/content/OfferContent;->amount:F

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

    .line 688
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->availableAtRetailers:Ljava/util/List;

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

    .line 605
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->bonusIds:Ljava/util/Set;

    return-object v0
.end method

.method public getButtonInfo()Lcom/ibotta/api/model/retailer/ButtonInfo;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 173
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->buttonInfo:Lcom/ibotta/api/model/retailer/ButtonInfo;

    return-object v0
.end method

.method public getCaption()Ljava/lang/String;
    .locals 1

    .line 182
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->caption:Ljava/lang/String;

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

    .line 622
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->categories:Ljava/util/List;

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

    .line 613
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->categoryIds:Ljava/util/Set;

    return-object v0
.end method

.method public getContextSortData()Lcom/ibotta/api/model/offer/ContextSortData;
    .locals 1

    .line 200
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->contextSortData:Lcom/ibotta/api/model/offer/ContextSortData;

    return-object v0
.end method

.method public getCurrentValue()Ljava/lang/String;
    .locals 1

    .line 209
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->currentValue:Ljava/lang/String;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 218
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->description:Ljava/lang/String;

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

    .line 632
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->digitalProducts:Ljava/util/List;

    return-object v0
.end method

.method public getEarnedAmount()F
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getExpiration()Ljava/util/Date;
    .locals 1

    .line 227
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->expiration:Ljava/util/Date;

    return-object v0
.end method

.method public getHotness()Ljava/lang/Float;
    .locals 1

    .line 254
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->hotness:Ljava/lang/Float;

    return-object v0
.end method

.method public getLargeUrl()Ljava/lang/String;
    .locals 1

    .line 273
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->largeUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getLegal()Ljava/lang/String;
    .locals 1

    .line 291
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->legal:Ljava/lang/String;

    return-object v0
.end method

.method public getMultiples()Ljava/lang/String;
    .locals 1

    .line 499
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->multiples:Ljava/lang/String;

    return-object v0
.end method

.method public getMultiplesCount()S
    .locals 1

    .line 300
    iget-short v0, p0, Lcom/ibotta/api/model/content/OfferContent;->multiplesCount:S

    return v0
.end method

.method public getMultiplesEnum()Lcom/ibotta/api/model/offer/Multiples;
    .locals 1

    .line 507
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->multiplesEnum:Lcom/ibotta/api/model/offer/Multiples;

    if-eqz v0, :cond_0

    return-object v0

    .line 510
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->multiples:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/offer/Multiples;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/offer/Multiples;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->multiplesEnum:Lcom/ibotta/api/model/offer/Multiples;

    .line 511
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->multiplesEnum:Lcom/ibotta/api/model/offer/Multiples;

    return-object v0
.end method

.method public getNonItemTotal()F
    .locals 1

    .line 327
    iget v0, p0, Lcom/ibotta/api/model/content/OfferContent;->nonItemTotal:F

    return v0
.end method

.method public getOfferAmountType()Lcom/ibotta/api/model/offer/OfferAmountType;
    .locals 2

    .line 355
    invoke-virtual {p0}, Lcom/ibotta/api/model/content/OfferContent;->isCombo()Z

    move-result v0

    invoke-virtual {p0}, Lcom/ibotta/api/model/content/OfferContent;->isMultiples()Z

    move-result v1

    invoke-static {v0, v1}, Lcom/ibotta/api/model/offer/OfferAmountType;->create(ZZ)Lcom/ibotta/api/model/offer/OfferAmountType;

    move-result-object v0

    return-object v0
.end method

.method public getOfferGroupId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 579
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->offerGroupId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getOfferSegmentId()I
    .locals 1

    .line 596
    iget v0, p0, Lcom/ibotta/api/model/content/OfferContent;->offerSegmentId:I

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

    .line 641
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->offerTags:Ljava/util/List;

    return-object v0
.end method

.method public getOfferType()Ljava/lang/String;
    .locals 1

    .line 336
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->offerType:Ljava/lang/String;

    return-object v0
.end method

.method public getOfferTypeEnum()Lcom/ibotta/api/model/offer/OfferType;
    .locals 1

    .line 346
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->offerTypeEnum:Lcom/ibotta/api/model/offer/OfferType;

    if-eqz v0, :cond_0

    return-object v0

    .line 349
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->offerType:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/offer/OfferType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/offer/OfferType;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->offerTypeEnum:Lcom/ibotta/api/model/offer/OfferType;

    .line 350
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->offerTypeEnum:Lcom/ibotta/api/model/offer/OfferType;

    return-object v0
.end method

.method public getOldValue()Ljava/lang/String;
    .locals 1

    .line 364
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->oldValue:Ljava/lang/String;

    return-object v0
.end method

.method public getPercentBack()Ljava/lang/Float;
    .locals 1

    .line 373
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->percentBack:Ljava/lang/Float;

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

    .line 650
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->productGroups:Ljava/util/List;

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

    .line 660
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->products:Ljava/util/Set;

    return-object v0
.end method

.method public getPurchaseType()Ljava/lang/String;
    .locals 1

    .line 391
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->purchaseType:Ljava/lang/String;

    return-object v0
.end method

.method public getPurchaseTypeEnum()Lcom/ibotta/api/model/common/VerificationType;
    .locals 1

    .line 400
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->purchaseTypeEnum:Lcom/ibotta/api/model/common/VerificationType;

    if-eqz v0, :cond_0

    return-object v0

    .line 403
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->purchaseType:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/common/VerificationType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->purchaseTypeEnum:Lcom/ibotta/api/model/common/VerificationType;

    .line 404
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->purchaseTypeEnum:Lcom/ibotta/api/model/common/VerificationType;

    return-object v0
.end method

.method public getRandomWeightTotal()F
    .locals 1

    .line 540
    iget v0, p0, Lcom/ibotta/api/model/content/OfferContent;->randomWeightTotal:F

    return v0
.end method

.method public getReceiptTotal()F
    .locals 1

    .line 413
    iget v0, p0, Lcom/ibotta/api/model/content/OfferContent;->receiptTotal:F

    return v0
.end method

.method public getRecommendationScore()F
    .locals 1

    .line 422
    iget v0, p0, Lcom/ibotta/api/model/content/OfferContent;->recommendationScore:F

    return v0
.end method

.method public getRedemptionMax()S
    .locals 1

    .line 549
    iget-short v0, p0, Lcom/ibotta/api/model/content/OfferContent;->redemptionMax:S

    return v0
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

    .line 670
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->retailerCategories:Ljava/util/Set;

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

    .line 679
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->retailers:Ljava/util/Set;

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

    .line 697
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->rewards:Ljava/util/List;

    return-object v0
.end method

.method public getSegmentId()I
    .locals 1

    .line 588
    iget v0, p0, Lcom/ibotta/api/model/content/OfferContent;->segmentId:I

    return v0
.end method

.method public getShareUrl()Ljava/lang/String;
    .locals 1

    .line 440
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->shareUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getTerms()Ljava/lang/String;
    .locals 1

    .line 449
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->terms:Ljava/lang/String;

    return-object v0
.end method

.method public getThumbUrl()Ljava/lang/String;
    .locals 1

    .line 282
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->thumbUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getTotalLikes()J
    .locals 2

    .line 561
    iget-wide v0, p0, Lcom/ibotta/api/model/content/OfferContent;->totalLikes:J

    return-wide v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 458
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->url:Ljava/lang/String;

    return-object v0
.end method

.method public getVariablePercentBack()Ljava/lang/String;
    .locals 1

    .line 467
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferContent;->variablePercentBack:Ljava/lang/String;

    return-object v0
.end method

.method public getVerifiedCount()I
    .locals 1

    .line 476
    iget v0, p0, Lcom/ibotta/api/model/content/OfferContent;->verifiedCount:I

    return v0
.end method

.method public hasBonuses()Z
    .locals 1

    .line 168
    invoke-virtual {p0}, Lcom/ibotta/api/model/content/OfferContent;->getBonusIds()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/api/model/content/OfferContent;->getBonusIds()Ljava/util/Set;

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

.method public isActivated()Z
    .locals 1

    .line 130
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/OfferContent;->activated:Z

    return v0
.end method

.method public isBlockCustomerSubmittedUpcs()Z
    .locals 1

    .line 160
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/OfferContent;->blockCustomerSubmittedUpcs:Z

    return v0
.end method

.method public isCombo()Z
    .locals 1

    .line 191
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/OfferContent;->combo:Z

    return v0
.end method

.method public isExpiringSoon()Z
    .locals 1

    .line 236
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/OfferContent;->expiringSoon:Z

    return v0
.end method

.method public isHideAvailableAt()Z
    .locals 1

    .line 245
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/OfferContent;->hideAvailableAt:Z

    return v0
.end method

.method public isIgnoreBarcode()Z
    .locals 1

    .line 264
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/OfferContent;->ignoreBarcode:Z

    return v0
.end method

.method public isLiked()Z
    .locals 1

    .line 570
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/OfferContent;->liked:Z

    return v0
.end method

.method public isMultipleRedemptions()Z
    .locals 2

    .line 521
    invoke-virtual {p0}, Lcom/ibotta/api/model/content/OfferContent;->isCombo()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/api/model/content/OfferContent;->isMultiples()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/api/model/content/OfferContent;->getRedemptionMax()S

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

    .line 495
    invoke-virtual {p0}, Lcom/ibotta/api/model/content/OfferContent;->getMultiplesEnum()Lcom/ibotta/api/model/offer/Multiples;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/offer/Multiples;->NONE:Lcom/ibotta/api/model/offer/Multiples;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/api/model/content/OfferContent;->getMultiplesCount()S

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

    .line 516
    invoke-virtual {p0}, Lcom/ibotta/api/model/content/OfferContent;->getMultiplesEnum()Lcom/ibotta/api/model/offer/Multiples;

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

    .line 309
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/OfferContent;->newFlag:Z

    return v0
.end method

.method public isNonItem()Z
    .locals 1

    .line 318
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/OfferContent;->nonItem:Z

    return v0
.end method

.method public isPreselect()Z
    .locals 1

    .line 382
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/OfferContent;->preselect:Z

    return v0
.end method

.method public isRandomWeight()Z
    .locals 1

    .line 531
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/OfferContent;->randomWeight:Z

    return v0
.end method

.method public isSelfFunded()Z
    .locals 1

    .line 431
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/OfferContent;->selfFunded:Z

    return v0
.end method

.method public isStandard()Z
    .locals 1

    .line 526
    invoke-virtual {p0}, Lcom/ibotta/api/model/content/OfferContent;->isCombo()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/api/model/content/OfferContent;->isMultiples()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/api/model/content/OfferContent;->isMultipleRedemptions()Z

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

    .line 484
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/OfferContent;->verified:Z

    return v0
.end method

.method public setAbout(Ljava/lang/String;)V
    .locals 0

    .line 116
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->about:Ljava/lang/String;

    return-void
.end method

.method public setAboutTitle(Ljava/lang/String;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->aboutTitle:Ljava/lang/String;

    return-void
.end method

.method public setActivated(Z)V
    .locals 0

    .line 135
    iput-boolean p1, p0, Lcom/ibotta/api/model/content/OfferContent;->activated:Z

    return-void
.end method

.method public setAlternateText(Ljava/lang/String;)V
    .locals 0

    .line 145
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->alternateText:Ljava/lang/String;

    return-void
.end method

.method public setAmount(F)V
    .locals 0

    .line 155
    iput p1, p0, Lcom/ibotta/api/model/content/OfferContent;->amount:F

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

    .line 692
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->availableAtRetailers:Ljava/util/List;

    return-void
.end method

.method public setBlockCustomerSubmittedUpcs(Z)V
    .locals 0

    .line 164
    iput-boolean p1, p0, Lcom/ibotta/api/model/content/OfferContent;->blockCustomerSubmittedUpcs:Z

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

    .line 609
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->bonusIds:Ljava/util/Set;

    return-void
.end method

.method public setButtonInfo(Lcom/ibotta/api/model/retailer/ButtonInfo;)V
    .locals 0
    .param p1    # Lcom/ibotta/api/model/retailer/ButtonInfo;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 177
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->buttonInfo:Lcom/ibotta/api/model/retailer/ButtonInfo;

    return-void
.end method

.method public setCaption(Ljava/lang/String;)V
    .locals 0

    .line 186
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->caption:Ljava/lang/String;

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

    .line 627
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->categories:Ljava/util/List;

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

    .line 617
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->categoryIds:Ljava/util/Set;

    return-void
.end method

.method public setCombo(Z)V
    .locals 0

    .line 195
    iput-boolean p1, p0, Lcom/ibotta/api/model/content/OfferContent;->combo:Z

    return-void
.end method

.method public setContextSortData(Lcom/ibotta/api/model/offer/ContextSortData;)V
    .locals 0

    .line 204
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->contextSortData:Lcom/ibotta/api/model/offer/ContextSortData;

    return-void
.end method

.method public setCurrentValue(Ljava/lang/String;)V
    .locals 0

    .line 213
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->currentValue:Ljava/lang/String;

    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 222
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->description:Ljava/lang/String;

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

    .line 636
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->digitalProducts:Ljava/util/List;

    return-void
.end method

.method public setExpiration(Ljava/util/Date;)V
    .locals 0

    .line 231
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->expiration:Ljava/util/Date;

    return-void
.end method

.method public setExpiringSoon(Z)V
    .locals 0

    .line 240
    iput-boolean p1, p0, Lcom/ibotta/api/model/content/OfferContent;->expiringSoon:Z

    return-void
.end method

.method public setHideAvailableAt(Z)V
    .locals 0

    .line 249
    iput-boolean p1, p0, Lcom/ibotta/api/model/content/OfferContent;->hideAvailableAt:Z

    return-void
.end method

.method public setHotness(Ljava/lang/Float;)V
    .locals 0

    .line 259
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->hotness:Ljava/lang/Float;

    return-void
.end method

.method public setIgnoreBarcode(Z)V
    .locals 0

    .line 268
    iput-boolean p1, p0, Lcom/ibotta/api/model/content/OfferContent;->ignoreBarcode:Z

    return-void
.end method

.method public setLargeUrl(Ljava/lang/String;)V
    .locals 0

    .line 277
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->largeUrl:Ljava/lang/String;

    return-void
.end method

.method public setLegal(Ljava/lang/String;)V
    .locals 0

    .line 295
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->legal:Ljava/lang/String;

    return-void
.end method

.method public setLiked(Z)V
    .locals 0

    .line 574
    iput-boolean p1, p0, Lcom/ibotta/api/model/content/OfferContent;->liked:Z

    return-void
.end method

.method public setMultiples(Ljava/lang/String;)V
    .locals 0

    .line 503
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->multiples:Ljava/lang/String;

    return-void
.end method

.method public setMultiplesCount(S)V
    .locals 0

    .line 304
    iput-short p1, p0, Lcom/ibotta/api/model/content/OfferContent;->multiplesCount:S

    return-void
.end method

.method public setNewFlag(Z)V
    .locals 0

    .line 313
    iput-boolean p1, p0, Lcom/ibotta/api/model/content/OfferContent;->newFlag:Z

    return-void
.end method

.method public setNonItem(Z)V
    .locals 0

    .line 322
    iput-boolean p1, p0, Lcom/ibotta/api/model/content/OfferContent;->nonItem:Z

    return-void
.end method

.method public setNonItemTotal(F)V
    .locals 0

    .line 331
    iput p1, p0, Lcom/ibotta/api/model/content/OfferContent;->nonItemTotal:F

    return-void
.end method

.method public setOfferGroupId(Ljava/lang/Integer;)V
    .locals 0

    .line 583
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->offerGroupId:Ljava/lang/Integer;

    return-void
.end method

.method public setOfferSegmentId(I)V
    .locals 0

    .line 600
    iput p1, p0, Lcom/ibotta/api/model/content/OfferContent;->offerSegmentId:I

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

    .line 645
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->offerTags:Ljava/util/List;

    return-void
.end method

.method public setOfferType(Ljava/lang/String;)V
    .locals 0

    .line 340
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->offerType:Ljava/lang/String;

    const/4 p1, 0x0

    .line 341
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->offerTypeEnum:Lcom/ibotta/api/model/offer/OfferType;

    return-void
.end method

.method public setOfferTypeEnum(Lcom/ibotta/api/model/offer/OfferType;)V
    .locals 0

    .line 359
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->offerTypeEnum:Lcom/ibotta/api/model/offer/OfferType;

    return-void
.end method

.method public setOldValue(Ljava/lang/String;)V
    .locals 0

    .line 368
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->oldValue:Ljava/lang/String;

    return-void
.end method

.method public setPercentBack(Ljava/lang/Float;)V
    .locals 0

    .line 377
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->percentBack:Ljava/lang/Float;

    return-void
.end method

.method public setPreselect(Z)V
    .locals 0

    .line 386
    iput-boolean p1, p0, Lcom/ibotta/api/model/content/OfferContent;->preselect:Z

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

    .line 655
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->productGroups:Ljava/util/List;

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

    .line 665
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->products:Ljava/util/Set;

    return-void
.end method

.method public setPurchaseType(Ljava/lang/String;)V
    .locals 0

    .line 395
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->purchaseType:Ljava/lang/String;

    return-void
.end method

.method public setPurchaseTypeEnum(Lcom/ibotta/api/model/common/VerificationType;)V
    .locals 0

    .line 408
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->purchaseTypeEnum:Lcom/ibotta/api/model/common/VerificationType;

    return-void
.end method

.method public setRandomWeight(Z)V
    .locals 0

    .line 535
    iput-boolean p1, p0, Lcom/ibotta/api/model/content/OfferContent;->randomWeight:Z

    return-void
.end method

.method public setRandomWeightTotal(F)V
    .locals 0

    .line 544
    iput p1, p0, Lcom/ibotta/api/model/content/OfferContent;->randomWeightTotal:F

    return-void
.end method

.method public setReceiptTotal(F)V
    .locals 0

    .line 417
    iput p1, p0, Lcom/ibotta/api/model/content/OfferContent;->receiptTotal:F

    return-void
.end method

.method public setRecommendationScore(F)V
    .locals 0

    .line 426
    iput p1, p0, Lcom/ibotta/api/model/content/OfferContent;->recommendationScore:F

    return-void
.end method

.method public setRedemptionMax(S)V
    .locals 0

    .line 553
    iput-short p1, p0, Lcom/ibotta/api/model/content/OfferContent;->redemptionMax:S

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

    .line 674
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->retailerCategories:Ljava/util/Set;

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

    .line 683
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->retailers:Ljava/util/Set;

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

    .line 701
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->rewards:Ljava/util/List;

    return-void
.end method

.method public setSegmentId(I)V
    .locals 0

    .line 592
    iput p1, p0, Lcom/ibotta/api/model/content/OfferContent;->segmentId:I

    return-void
.end method

.method public setSelfFunded(Z)V
    .locals 0

    .line 435
    iput-boolean p1, p0, Lcom/ibotta/api/model/content/OfferContent;->selfFunded:Z

    return-void
.end method

.method public setShareUrl(Ljava/lang/String;)V
    .locals 0

    .line 444
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->shareUrl:Ljava/lang/String;

    return-void
.end method

.method public setTerms(Ljava/lang/String;)V
    .locals 0

    .line 453
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->terms:Ljava/lang/String;

    return-void
.end method

.method public setThumbUrl(Ljava/lang/String;)V
    .locals 0

    .line 286
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->thumbUrl:Ljava/lang/String;

    return-void
.end method

.method public setTotalLikes(J)V
    .locals 0

    .line 565
    iput-wide p1, p0, Lcom/ibotta/api/model/content/OfferContent;->totalLikes:J

    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .line 462
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->url:Ljava/lang/String;

    return-void
.end method

.method public setVariablePercentBack(Ljava/lang/String;)V
    .locals 0

    .line 471
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferContent;->variablePercentBack:Ljava/lang/String;

    return-void
.end method

.method public setVerified(Z)V
    .locals 0

    .line 488
    iput-boolean p1, p0, Lcom/ibotta/api/model/content/OfferContent;->verified:Z

    return-void
.end method

.method public setVerifiedCount(I)V
    .locals 0

    .line 480
    iput p1, p0, Lcom/ibotta/api/model/content/OfferContent;->verifiedCount:I

    return-void
.end method
