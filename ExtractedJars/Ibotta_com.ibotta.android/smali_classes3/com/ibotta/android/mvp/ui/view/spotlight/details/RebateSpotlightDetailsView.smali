.class public Lcom/ibotta/android/mvp/ui/view/spotlight/details/RebateSpotlightDetailsView;
.super Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;
.source "RebateSpotlightDetailsView.java"


# instance fields
.field private offerModel:Lcom/ibotta/api/model/OfferModel;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 24
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 28
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 33
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method private onOfferSet()V
    .locals 2

    .line 42
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;-><init>()V

    .line 43
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/RebateSpotlightDetailsView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->isMultipleRedemptions()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->setMultipleRedemptions(Z)V

    .line 44
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/RebateSpotlightDetailsView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->isMultiples()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->setMultiples(Z)V

    .line 45
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/RebateSpotlightDetailsView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->isCombo()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->setCombo(Z)V

    .line 46
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/RebateSpotlightDetailsView;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/config/AppConfig;->showQuantityBadge()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->setShowQuantityBadge(Z)V

    .line 47
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/RebateSpotlightDetailsView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getMultiplesCount()S

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->setMultiplesCount(S)V

    .line 48
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/RebateSpotlightDetailsView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getRedemptionMax()S

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->setRedemptionMax(S)S

    .line 50
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/RebateSpotlightDetailsView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->hasBonuses()Z

    move-result v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/RebateSpotlightDetailsView;->setHasBonuses(Z)V

    .line 51
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/RebateSpotlightDetailsView;->setBadge(Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;)V

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/RebateSpotlightDetailsView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->isExpiringSoon()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/RebateSpotlightDetailsView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getTerms()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/RebateSpotlightDetailsView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getExpiration()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/RebateSpotlightDetailsView;->setTerms(Ljava/lang/String;Ljava/util/Date;)V

    goto :goto_0

    .line 56
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/RebateSpotlightDetailsView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getTerms()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/RebateSpotlightDetailsView;->setTerms(Ljava/lang/String;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public setOfferModel(Lcom/ibotta/api/model/OfferModel;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/RebateSpotlightDetailsView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    .line 38
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/RebateSpotlightDetailsView;->onOfferSet()V

    return-void
.end method
