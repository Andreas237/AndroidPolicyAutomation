.class public Lcom/ibotta/android/braze/BrazeTrackingDataFactoryImpl;
.super Ljava/lang/Object;
.source "BrazeTrackingDataFactoryImpl.java"

# interfaces
.implements Lcom/ibotta/android/braze/BrazeTrackingDataFactory;


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final bonusBucketedComparator:Lcom/ibotta/android/collection/BonusBucketedComparator;

.field private final bonusHelper:Lcom/ibotta/api/helper/bonus/BonusHelper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/bonus/BonusHelper;Lcom/ibotta/android/collection/BonusBucketedComparator;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/braze/BrazeTrackingDataFactoryImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/braze/BrazeTrackingDataFactoryImpl;->bonusHelper:Lcom/ibotta/api/helper/bonus/BonusHelper;

    .line 30
    iput-object p3, p0, Lcom/ibotta/android/braze/BrazeTrackingDataFactoryImpl;->bonusBucketedComparator:Lcom/ibotta/android/collection/BonusBucketedComparator;

    return-void
.end method

.method public static synthetic lambda$createBonusTrackingData$0(Lcom/ibotta/android/braze/BrazeTrackingDataFactoryImpl;Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;Ljava/lang/Integer;)Lcom/ibotta/api/model/BonusModel;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/braze/BrazeTrackingDataFactoryImpl;->bonusHelper:Lcom/ibotta/api/helper/bonus/BonusHelper;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;->getAllBonuses()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {v0, p1, p2}, Lcom/ibotta/api/helper/bonus/BonusHelper;->findBonusById(Ljava/util/List;I)Lcom/ibotta/api/model/BonusModel;

    move-result-object p1

    return-object p1
.end method

.method static synthetic lambda$createBonusTrackingData$1(Lcom/ibotta/api/model/BonusModel;)Z
    .locals 0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public createBonusTrackingData(Lcom/ibotta/api/model/BonusModel;)Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;
    .locals 3
    .param p1    # Lcom/ibotta/api/model/BonusModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    .line 51
    sget-object p1, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->EMPTY:Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;

    return-object p1

    .line 54
    :cond_0
    invoke-static {}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->builder()Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;

    move-result-object v0

    .line 55
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;->id(I)Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;

    move-result-object v0

    .line 56
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;->name(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;

    move-result-object v0

    .line 57
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getAmount()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;->amount(F)Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;

    move-result-object v0

    .line 58
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getCompletedImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;->tokenUrl(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;

    move-result-object v0

    .line 59
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getLink()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;->route(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;

    move-result-object v0

    .line 60
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;->description(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;

    move-result-object v0

    .line 61
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getTerms()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;->details(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;

    move-result-object v0

    .line 62
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getExpiration()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;->expiration(Ljava/util/Date;)Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;

    move-result-object v0

    .line 63
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getBonusTypeEnum()Lcom/ibotta/api/model/BonusModel$Type;

    move-result-object v1

    sget-object v2, Lcom/ibotta/api/model/BonusModel$Type;->FEATURED:Lcom/ibotta/api/model/BonusModel$Type;

    if-ne v1, v2, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;->featured(Z)Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;

    move-result-object v0

    .line 64
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getOtherReward()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;->otherReward(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;

    move-result-object p1

    .line 65
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;->build()Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;

    move-result-object p1

    return-object p1
.end method

.method public createBonusTrackingData(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;)Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;
    .locals 1
    .param p1    # Lcom/ibotta/api/model/OfferModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "Provided Offer is null."

    .line 71
    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    sget-object p1, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->EMPTY:Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;

    return-object p1

    :cond_0
    if-nez p2, :cond_1

    const-string p1, "Provided Bonuses are null"

    .line 76
    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    sget-object p1, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->EMPTY:Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;

    return-object p1

    .line 81
    :cond_1
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getBonusIds()Ljava/util/Set;

    move-result-object p1

    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/braze/-$$Lambda$BrazeTrackingDataFactoryImpl$Cm0k14_QwNsT00ROilT5sQdvWjE;

    invoke-direct {v0, p0, p2}, Lcom/ibotta/android/braze/-$$Lambda$BrazeTrackingDataFactoryImpl$Cm0k14_QwNsT00ROilT5sQdvWjE;-><init>(Lcom/ibotta/android/braze/BrazeTrackingDataFactoryImpl;Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;)V

    .line 82
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object p2, Lcom/ibotta/android/braze/-$$Lambda$BrazeTrackingDataFactoryImpl$pVJCoh6wuhTHmIvtVlfUvm-JST8;->INSTANCE:Lcom/ibotta/android/braze/-$$Lambda$BrazeTrackingDataFactoryImpl$pVJCoh6wuhTHmIvtVlfUvm-JST8;

    .line 83
    invoke-interface {p1, p2}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    iget-object p2, p0, Lcom/ibotta/android/braze/BrazeTrackingDataFactoryImpl;->bonusBucketedComparator:Lcom/ibotta/android/collection/BonusBucketedComparator;

    .line 84
    invoke-interface {p1, p2}, Ljava9/util/stream/Stream;->sorted(Ljava/util/Comparator;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 85
    invoke-interface {p1}, Ljava9/util/stream/Stream;->findFirst()Ljava9/util/Optional;

    move-result-object p1

    const/4 p2, 0x0

    .line 86
    invoke-virtual {p1, p2}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/BonusModel;

    .line 80
    invoke-virtual {p0, p1}, Lcom/ibotta/android/braze/BrazeTrackingDataFactoryImpl;->createBonusTrackingData(Lcom/ibotta/api/model/BonusModel;)Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;

    move-result-object p1

    return-object p1
.end method

.method public createOfferTrackingData(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;
    .locals 2
    .param p1    # Lcom/ibotta/api/model/OfferModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    .line 92
    sget-object p1, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;->EMPTY:Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;

    return-object p1

    .line 95
    :cond_0
    invoke-static {}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;->builder()Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;

    move-result-object v0

    .line 96
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;->id(I)Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;

    move-result-object v0

    .line 97
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;->name(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;

    move-result-object v0

    .line 98
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getAmount()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;->amount(F)Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;

    move-result-object v0

    .line 99
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;->description(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;

    move-result-object v0

    .line 100
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getExpiration()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;->expiration(Ljava/util/Date;)Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;

    move-result-object v0

    .line 101
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getShareUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;->shareUrl(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/braze/BrazeTrackingDataFactoryImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 102
    invoke-interface {v1, p1}, Lcom/ibotta/android/util/AppHelper;->getBestOfferImgUrl(Lcom/ibotta/api/model/OfferModel;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;->offerImage(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;

    move-result-object v0

    .line 103
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getRedemptionMax()S

    move-result p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;->redemptionMax(S)Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;

    move-result-object p1

    .line 104
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData$Builder;->build()Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;

    move-result-object p1

    return-object p1
.end method

.method public createRetailerTrackingData(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;
    .locals 2
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    .line 36
    sget-object p1, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;->EMPTY:Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;

    return-object p1

    .line 39
    :cond_0
    invoke-static {}, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;->builder()Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;

    move-result-object v0

    .line 40
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;->id(I)Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;

    move-result-object v0

    .line 41
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;->name(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;

    move-result-object v0

    .line 42
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->isAuxiliaryLoyaltyEnabled()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;->auxiliaryLoyaltyEnabled(Z)Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;

    move-result-object v0

    .line 43
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v1

    invoke-static {v1}, Lcom/ibotta/api/model/common/VerificationType;->toApiName(Lcom/ibotta/api/model/common/VerificationType;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;->verificationTypeApiName(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;

    move-result-object v0

    .line 44
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getShortDescription()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;->shortDescription(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;

    move-result-object p1

    .line 45
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;->build()Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;

    move-result-object p1

    return-object p1
.end method
