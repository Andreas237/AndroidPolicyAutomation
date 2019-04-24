.class public Lcom/ibotta/api/model/offer/SocialOffer;
.super Ljava/lang/Object;
.source "SocialOffer.java"

# interfaces
.implements Lcom/ibotta/api/Likable;
.implements Lcom/ibotta/api/model/OfferModel;


# instance fields
.field private alternateText:Ljava/lang/String;

.field private caption:Ljava/lang/String;

.field private currentValue:Ljava/lang/String;

.field private description:Ljava/lang/String;

.field private expiringSoon:Z

.field private friendObjects:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/friend/Friend;",
            ">;"
        }
    .end annotation
.end field

.field private id:I

.field private idString:Ljava/lang/String;

.field private largeUrl:Ljava/lang/String;

.field private liked:Z

.field private name:Ljava/lang/String;

.field private oldValue:Ljava/lang/String;

.field private totalLikes:J

.field private url:Ljava/lang/String;

.field private viewable:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/offer/SocialOffer;->friendObjects:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getAbout()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getAboutTitle()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getAlternateText()Ljava/lang/String;
    .locals 1

    .line 541
    iget-object v0, p0, Lcom/ibotta/api/model/offer/SocialOffer;->alternateText:Ljava/lang/String;

    return-object v0
.end method

.method public getAmount()F
    .locals 1

    const/4 v0, 0x0

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

    .line 492
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

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

    .line 435
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

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

.method public getCaption()Ljava/lang/String;
    .locals 1

    .line 505
    iget-object v0, p0, Lcom/ibotta/api/model/offer/SocialOffer;->caption:Ljava/lang/String;

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

    .line 441
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public getContextSortData()Lcom/ibotta/api/model/offer/ContextSortData;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCurrentValue()Ljava/lang/String;
    .locals 1

    .line 523
    iget-object v0, p0, Lcom/ibotta/api/model/offer/SocialOffer;->currentValue:Ljava/lang/String;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/ibotta/api/model/offer/SocialOffer;->description:Ljava/lang/String;

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

    .line 452
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public getEarnedAmount()F
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getExpiration()Ljava/util/Date;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getFriendObjects()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/friend/Friend;",
            ">;"
        }
    .end annotation

    .line 116
    iget-object v0, p0, Lcom/ibotta/api/model/offer/SocialOffer;->friendObjects:Ljava/util/List;

    return-object v0
.end method

.method public getHotness()Ljava/lang/Float;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 43
    iget v0, p0, Lcom/ibotta/api/model/offer/SocialOffer;->id:I

    return v0
.end method

.method public getIdString()Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/ibotta/api/model/offer/SocialOffer;->idString:Ljava/lang/String;

    return-object v0
.end method

.method public getLargeUrl()Ljava/lang/String;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/ibotta/api/model/offer/SocialOffer;->largeUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getLegal()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getLink()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getMultiplesCount()S
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/ibotta/api/model/offer/SocialOffer;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getNonItemTotal()F
    .locals 1

    const/4 v0, 0x0

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

.method public getOfferSegmentId()I
    .locals 1

    const/4 v0, 0x0

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

    .line 458
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public getOfferType()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getOfferTypeEnum()Lcom/ibotta/api/model/offer/OfferType;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getOldValue()Ljava/lang/String;
    .locals 1

    .line 532
    iget-object v0, p0, Lcom/ibotta/api/model/offer/SocialOffer;->oldValue:Ljava/lang/String;

    return-object v0
.end method

.method public getPercentBack()Ljava/lang/Float;
    .locals 1

    const/4 v0, 0x0

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

    .line 464
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

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

    const/4 v0, 0x0

    return-object v0
.end method

.method public getPurchaseType()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getPurchaseTypeEnum()Lcom/ibotta/api/model/common/VerificationType;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getRandomWeightTotal()F
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getReceiptTotal()F
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getRecommendationScore()F
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getRedemptionMax()S
    .locals 1

    const/4 v0, 0x0

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

    .line 480
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

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

    .line 486
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

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

    .line 498
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public getSegmentId()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getShareUrl()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getSortOrder()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getTerms()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getThumbUrl()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getTotalLikes()J
    .locals 2

    .line 108
    iget-wide v0, p0, Lcom/ibotta/api/model/offer/SocialOffer;->totalLikes:J

    return-wide v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getTypeEnum()Lcom/ibotta/api/model/ContentModel$Type;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 407
    sget-object v0, Lcom/ibotta/api/model/ContentModel$Type;->NO_OP:Lcom/ibotta/api/model/ContentModel$Type;

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

    .line 76
    iget-object v0, p0, Lcom/ibotta/api/model/offer/SocialOffer;->url:Ljava/lang/String;

    return-object v0
.end method

.method public getVariablePercentBack()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getVerifiedCount()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public hasBonuses()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isActivated()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isBlockCustomerSubmittedUpcs()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isCombo()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isExpiringSoon()Z
    .locals 1

    .line 514
    iget-boolean v0, p0, Lcom/ibotta/api/model/offer/SocialOffer;->expiringSoon:Z

    return v0
.end method

.method public isHideAvailableAt()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isIgnoreBarcode()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isLiked()Z
    .locals 1

    .line 99
    iget-boolean v0, p0, Lcom/ibotta/api/model/offer/SocialOffer;->liked:Z

    return v0
.end method

.method public isMultipleRedemptions()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isMultiples()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isMultiplesUnique()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isNewFlag()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isNonItem()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isPreselect()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isRandomWeight()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isSelfFunded()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isStandard()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isVerified()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isViewable()Z
    .locals 1

    .line 124
    iget-boolean v0, p0, Lcom/ibotta/api/model/offer/SocialOffer;->viewable:Z

    return v0
.end method

.method public setActivated(Z)V
    .locals 0

    return-void
.end method

.method public setAlternateText(Ljava/lang/String;)V
    .locals 0

    .line 546
    iput-object p1, p0, Lcom/ibotta/api/model/offer/SocialOffer;->alternateText:Ljava/lang/String;

    return-void
.end method

.method public setAmount(F)V
    .locals 0

    return-void
.end method

.method public setCaption(Ljava/lang/String;)V
    .locals 0

    .line 509
    iput-object p1, p0, Lcom/ibotta/api/model/offer/SocialOffer;->caption:Ljava/lang/String;

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

    return-void
.end method

.method public setCurrentValue(Ljava/lang/String;)V
    .locals 0

    .line 527
    iput-object p1, p0, Lcom/ibotta/api/model/offer/SocialOffer;->currentValue:Ljava/lang/String;

    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/ibotta/api/model/offer/SocialOffer;->description:Ljava/lang/String;

    return-void
.end method

.method public setExpiringSoon(Z)V
    .locals 0

    .line 518
    iput-boolean p1, p0, Lcom/ibotta/api/model/offer/SocialOffer;->expiringSoon:Z

    return-void
.end method

.method public setFriendObjects(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/friend/Friend;",
            ">;)V"
        }
    .end annotation

    .line 120
    iput-object p1, p0, Lcom/ibotta/api/model/offer/SocialOffer;->friendObjects:Ljava/util/List;

    return-void
.end method

.method public setHotness(Ljava/lang/Float;)V
    .locals 0

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 47
    iput p1, p0, Lcom/ibotta/api/model/offer/SocialOffer;->id:I

    return-void
.end method

.method public setIdString(Ljava/lang/String;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/ibotta/api/model/offer/SocialOffer;->idString:Ljava/lang/String;

    return-void
.end method

.method public setLargeUrl(Ljava/lang/String;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/ibotta/api/model/offer/SocialOffer;->largeUrl:Ljava/lang/String;

    return-void
.end method

.method public setLiked(Z)V
    .locals 0

    .line 103
    iput-boolean p1, p0, Lcom/ibotta/api/model/offer/SocialOffer;->liked:Z

    return-void
.end method

.method public setLink(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/ibotta/api/model/offer/SocialOffer;->name:Ljava/lang/String;

    return-void
.end method

.method public setOfferType(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public setOldValue(Ljava/lang/String;)V
    .locals 0

    .line 536
    iput-object p1, p0, Lcom/ibotta/api/model/offer/SocialOffer;->oldValue:Ljava/lang/String;

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

    return-void
.end method

.method public setTotalLikes(J)V
    .locals 0

    .line 112
    iput-wide p1, p0, Lcom/ibotta/api/model/offer/SocialOffer;->totalLikes:J

    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/ibotta/api/model/offer/SocialOffer;->url:Ljava/lang/String;

    return-void
.end method

.method public setViewable(Z)V
    .locals 0

    .line 128
    iput-boolean p1, p0, Lcom/ibotta/api/model/offer/SocialOffer;->viewable:Z

    return-void
.end method
