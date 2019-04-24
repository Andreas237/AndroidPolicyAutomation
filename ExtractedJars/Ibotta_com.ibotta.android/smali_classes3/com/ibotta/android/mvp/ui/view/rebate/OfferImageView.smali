.class public Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;
.super Landroid/widget/FrameLayout;
.source "OfferImageView.java"


# instance fields
.field appConfig:Lcom/ibotta/android/state/app/config/AppConfig;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected icvImageCard:Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090241
    .end annotation
.end field

.field private offerModel:Lcom/ibotta/api/model/OfferModel;

.field protected rebateStyle:Lcom/ibotta/android/views/content/ContentStyle;

.field protected rivIndicator:Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903ca
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 45
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 49
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 50
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 55
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->initLayout()V

    return-void
.end method

.method private initRebateImage()V
    .locals 2

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->rebateStyle:Lcom/ibotta/android/views/content/ContentStyle;

    sget-object v1, Lcom/ibotta/android/views/content/ContentStyle;->HERO:Lcom/ibotta/android/views/content/ContentStyle;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getLargeUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getLargeUrl()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 119
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/AppHelper;->getBestOfferImgUrl(Lcom/ibotta/api/model/OfferModel;)Ljava/lang/String;

    move-result-object v0

    .line 122
    :goto_0
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->initRebateImage(Ljava/lang/String;)V

    return-void
.end method

.method private initRebateIndicator()V
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->initRebateIndicator(Lcom/ibotta/api/model/OfferModel;)V

    return-void
.end method

.method private onDataSet()V
    .locals 0

    .line 69
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->initRebateImagePadding()V

    .line 70
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->initRebateImage()V

    .line 71
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->initRebateIndicator()V

    return-void
.end method


# virtual methods
.method protected initLayout()V
    .locals 3

    .line 75
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;)V

    .line 77
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c01a7

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 78
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method protected initRebateImage(Ljava/lang/String;)V
    .locals 2

    .line 93
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 96
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->icvImageCard:Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;

    sget-object v1, Lcom/ibotta/android/views/images/Sizes;->OFFER_HALF_WIDTH:Lcom/ibotta/android/views/images/Sizes;

    invoke-virtual {v0, p1, v1}, Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;->setup(Ljava/lang/String;Lcom/ibotta/android/images/ImageCache$Size;)V

    return-void
.end method

.method protected initRebateImagePadding()V
    .locals 3

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->rebateStyle:Lcom/ibotta/android/views/content/ContentStyle;

    sget-object v1, Lcom/ibotta/android/views/content/ContentStyle;->HERO:Lcom/ibotta/android/views/content/ContentStyle;

    if-ne v0, v1, :cond_0

    .line 83
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f070170

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 84
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07019c

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 85
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->icvImageCard:Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;

    invoke-virtual {v2, v1, v0, v1, v0}, Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;->setPadding(IIII)V

    goto :goto_0

    .line 87
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0701bb

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 88
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->icvImageCard:Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;

    invoke-virtual {v1, v0, v0, v0, v0}, Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;->setPadding(IIII)V

    :goto_0
    return-void
.end method

.method protected initRebateIndicator(Lcom/ibotta/api/model/OfferModel;)V
    .locals 2

    .line 100
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->rivIndicator:Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;->setVisibility(I)V

    .line 102
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;-><init>()V

    .line 103
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->isMultipleRedemptions()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->setMultipleRedemptions(Z)V

    .line 104
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->isMultiples()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->setMultiples(Z)V

    .line 105
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->isCombo()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->setCombo(Z)V

    .line 106
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/config/AppConfig;->showQuantityBadge()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->setShowQuantityBadge(Z)V

    .line 107
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getMultiplesCount()S

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->setMultiplesCount(S)V

    .line 108
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getRedemptionMax()S

    move-result p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->setRedemptionMax(S)S

    .line 110
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->rivIndicator:Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;->setup(Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;)V

    return-void
.end method

.method public setData(Lcom/ibotta/android/views/content/ContentStyle;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->rebateStyle:Lcom/ibotta/android/views/content/ContentStyle;

    return-void
.end method

.method public setIndicatorVisible(Z)V
    .locals 1

    .line 144
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->rivIndicator:Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;->setVisibility(I)V

    return-void
.end method

.method public setOffer(Lcom/ibotta/android/views/content/ContentStyle;Lcom/ibotta/api/model/OfferModel;)V
    .locals 0

    .line 63
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->setData(Lcom/ibotta/android/views/content/ContentStyle;)V

    .line 64
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    .line 65
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->onDataSet()V

    return-void
.end method

.method public setRebateImageBGColorResId(I)V
    .locals 2

    .line 140
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->icvImageCard:Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v1, p1}, Lcom/ibotta/android/util/AppHelper;->getColor(I)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;->setBackgroundColor(I)V

    return-void
.end method

.method public setRebateImageHeight(I)V
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->icvImageCard:Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 135
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 136
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->icvImageCard:Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setRebateImagePadding(IIII)V
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->icvImageCard:Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/view/card/ImageCardView;->setPadding(IIII)V

    return-void
.end method
