.class public Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;
.super Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;
.source "SpotlightTopContentView.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 27
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 31
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 35
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private initCardViewAttributes()V
    .locals 2

    const/4 v0, 0x0

    .line 88
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->setRadius(F)V

    .line 89
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f070199

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->setCardElevation(F)V

    const v0, 0x7f060171

    .line 90
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->setBackgroundResource(I)V

    return-void
.end method

.method private initImageAttributes()V
    .locals 5

    .line 78
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->ivImage:Landroid/widget/ImageView;

    new-instance v1, Landroid/support/constraint/ConstraintLayout$LayoutParams;

    sget-object v2, Lcom/ibotta/android/views/util/CardHelper;->INSTANCE:Lcom/ibotta/android/views/util/CardHelper;

    sget-object v3, Lcom/ibotta/android/views/content/ContentStyle;->SPOTLIGHT:Lcom/ibotta/android/views/content/ContentStyle;

    .line 80
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/ibotta/android/views/util/CardHelper;->getImageHeight(Lcom/ibotta/android/views/content/ContentStyle;Landroid/content/res/Resources;)I

    move-result v2

    const/4 v3, -0x1

    invoke-direct {v1, v3, v2}, Landroid/support/constraint/ConstraintLayout$LayoutParams;-><init>(II)V

    .line 78
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 82
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->ivImage:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    :cond_0
    return-void
.end method

.method public static synthetic lambda$onUpdateViewState$0(Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;)V
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->lavAddButtonAnimation:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {v0}, Lcom/airbnb/lottie/LottieAnimationView;->playAnimation()V

    return-void
.end method

.method public static synthetic lambda$onUpdateViewState$1(Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;Landroid/view/View;)V
    .locals 0

    .line 63
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->onImageButtonClicked()V

    return-void
.end method

.method private setExtraBottomMarginForBadgeView(Landroid/view/View;)V
    .locals 2

    .line 71
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_0

    .line 72
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 73
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0701a1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    :cond_0
    return-void
.end method


# virtual methods
.method public initLayout()V
    .locals 0

    .line 40
    invoke-super {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->initLayout()V

    .line 42
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->initCardViewAttributes()V

    .line 43
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->initImageAttributes()V

    return-void
.end method

.method protected onImageClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0902ad
        }
    .end annotation

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->contentCardViewEvents:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;->onContentImageClicked()V

    return-void
.end method

.method protected onUpdateViewState()V
    .locals 4

    .line 48
    invoke-super {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->onUpdateViewState()V

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->contentCardViewState:Lcom/ibotta/android/content/card/ContentCardViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/content/card/ContentCardViewState;->getContentBadgeViewState()Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/views/offer/badge/BadgeViewState;->INVISIBLE:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/offer/badge/BadgeViewState;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->bvOffer:Lcom/ibotta/android/views/offer/badge/BadgeView;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->setExtraBottomMarginForBadgeView(Landroid/view/View;)V

    .line 54
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->contentCardViewState:Lcom/ibotta/android/content/card/ContentCardViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/content/card/ContentCardViewState;->getRetailerStackViewState()Lcom/ibotta/android/views/spotlight/RetailerStackViewState;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/views/spotlight/RetailerStackViewState;->GONE:Lcom/ibotta/android/views/spotlight/RetailerStackViewState;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/spotlight/RetailerStackViewState;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->ivRetailerStack:Lcom/ibotta/android/views/spotlight/RetailerStackView;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->setExtraBottomMarginForBadgeView(Landroid/view/View;)V

    .line 59
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->contentCardViewState:Lcom/ibotta/android/content/card/ContentCardViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/content/card/ContentCardViewState;->getIbottaButtonViewState()Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->getShowMicroNudge()Z

    move-result v0

    const/4 v1, 0x4

    if-eqz v0, :cond_3

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->iibIbottaImageButton:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->setVisibility(I)V

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->lavAddButtonAnimation:Lcom/airbnb/lottie/LottieAnimationView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->setVisibility(I)V

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/gallery/-$$Lambda$SpotlightTopContentView$AfNziw5u_relA7SX7TzqUlwCzZU;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/view/gallery/-$$Lambda$SpotlightTopContentView$AfNziw5u_relA7SX7TzqUlwCzZU;-><init>(Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;)V

    const-wide/16 v2, 0x190

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->lavAddButtonAnimation:Lcom/airbnb/lottie/LottieAnimationView;

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/gallery/-$$Lambda$SpotlightTopContentView$vg63c706PUtoLF-woZc_gCm5onM;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/view/gallery/-$$Lambda$SpotlightTopContentView$vg63c706PUtoLF-woZc_gCm5onM;-><init>(Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_2

    invoke-virtual {v0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_2
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 65
    :cond_3
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->lavAddButtonAnimation:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {v0}, Lcom/airbnb/lottie/LottieAnimationView;->cancelAnimation()V

    .line 66
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;->lavAddButtonAnimation:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {v0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->setVisibility(I)V

    :goto_0
    return-void
.end method
