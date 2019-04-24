.class public abstract Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;
.super Landroid/support/v7/widget/CardView;
.source "BaseOfferCardView.java"

# interfaces
.implements Lcom/ibotta/android/aop/tracking/advice/RetailerAdviceField;
.implements Lcom/ibotta/android/images/ImageCacheListener;
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/CardView;",
        "Lcom/ibotta/android/aop/tracking/advice/RetailerAdviceField;",
        "Lcom/ibotta/android/images/ImageCacheListener;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/content/card/ContentCardViewState;",
        "Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field protected appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected bPayAtRetailer:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090098
    .end annotation
.end field

.field protected bvExpiringBanner:Lcom/ibotta/android/views/offer/badge/BadgeView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900e0
    .end annotation
.end field

.field protected bvOffer:Lcom/ibotta/android/views/offer/badge/BadgeView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900de
    .end annotation
.end field

.field protected clWrapper:Landroid/support/constraint/ConstraintLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900fb
    .end annotation
.end field

.field protected contentCardViewEvents:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

.field protected contentCardViewState:Lcom/ibotta/android/content/card/ContentCardViewState;

.field protected formatting:Lcom/ibotta/android/util/Formatting;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected handler:Landroid/os/Handler;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected iibIbottaImageButton:Lcom/ibotta/android/views/base/button/IbottaImageButton;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090246
    .end annotation
.end field

.field protected imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected imageLoadJob:Lcom/ibotta/android/images/ImageLoadJob;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field protected ivImage:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902ad
    .end annotation
.end field

.field protected ivRetailerStack:Lcom/ibotta/android/views/spotlight/RetailerStackView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902c3
    .end annotation
.end field

.field protected lavAddButtonAnimation:Lcom/airbnb/lottie/LottieAnimationView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902e4
    .end annotation
.end field

.field protected tvAmount:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0904ee
    .end annotation
.end field

.field protected tvDescription:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090515
    .end annotation
.end field

.field protected tvType:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090592
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 79
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

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

    .line 83
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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

    .line 87
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 88
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->initLayout()V

    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "BaseOfferCardView.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onRetailerIconClicked"

    const-string v3, "com.ibotta.android.mvp.ui.view.gallery.BaseOfferCardView"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0xb4

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private getCtaConsumer()Ljava9/util/function/BiConsumer;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava9/util/function/BiConsumer<",
            "Lcom/ibotta/api/model/ContentModel;",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation

    .line 245
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->contentCardViewState:Lcom/ibotta/android/content/card/ContentCardViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/content/card/ContentCardViewState;->getIbottaButtonViewState()Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->isCircleRipple()Z

    move-result v0

    if-nez v0, :cond_0

    .line 246
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->contentCardViewEvents:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/gallery/-$$Lambda$jBYinOi3aHq5gEXYrWgmzqCzVZE;

    invoke-direct {v1, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/-$$Lambda$jBYinOi3aHq5gEXYrWgmzqCzVZE;-><init>(Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;)V

    goto :goto_0

    .line 247
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->contentCardViewState:Lcom/ibotta/android/content/card/ContentCardViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/content/card/ContentCardViewState;->getIbottaButtonViewState()Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->getSelected()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 248
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->contentCardViewEvents:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/gallery/-$$Lambda$z6iuBQ2m6ePbUL2KMlp9CbQlMkA;

    invoke-direct {v1, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/-$$Lambda$z6iuBQ2m6ePbUL2KMlp9CbQlMkA;-><init>(Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;)V

    goto :goto_0

    .line 250
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->contentCardViewEvents:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/gallery/-$$Lambda$WdrTTMuxDR2v8yLK7Cb67rC4n8Y;

    invoke-direct {v1, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/-$$Lambda$WdrTTMuxDR2v8yLK7Cb67rC4n8Y;-><init>(Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;)V

    :goto_0
    return-object v1
.end method

.method private updateAmount()V
    .locals 2

    .line 226
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->tvAmount:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->contentCardViewState:Lcom/ibotta/android/content/card/ContentCardViewState;

    invoke-virtual {v1}, Lcom/ibotta/android/content/card/ContentCardViewState;->getSummaryContentViewState()Lcom/ibotta/android/views/content/SummaryContentViewState;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/views/content/SummaryContentViewState;->getCenterText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private updateBackgroundState()V
    .locals 2

    .line 274
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->clWrapper:Landroid/support/constraint/ConstraintLayout;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->contentCardViewState:Lcom/ibotta/android/content/card/ContentCardViewState;

    invoke-virtual {v1}, Lcom/ibotta/android/content/card/ContentCardViewState;->getBackgroundRes()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/constraint/ConstraintLayout;->setBackgroundResource(I)V

    return-void
.end method

.method private updateBadge()V
    .locals 2

    .line 170
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->bvOffer:Lcom/ibotta/android/views/offer/badge/BadgeView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->contentCardViewState:Lcom/ibotta/android/content/card/ContentCardViewState;

    invoke-virtual {v1}, Lcom/ibotta/android/content/card/ContentCardViewState;->getContentBadgeViewState()Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/offer/badge/BadgeView;->updateViewState(Lcom/ibotta/android/views/offer/badge/BadgeViewState;)V

    return-void
.end method

.method private updateExpiringBanner()V
    .locals 2

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->bvExpiringBanner:Lcom/ibotta/android/views/offer/badge/BadgeView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->contentCardViewState:Lcom/ibotta/android/content/card/ContentCardViewState;

    invoke-virtual {v1}, Lcom/ibotta/android/content/card/ContentCardViewState;->getExpiringBannerViewState()Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/offer/badge/BadgeView;->updateViewState(Lcom/ibotta/android/views/offer/badge/BadgeViewState;)V

    return-void
.end method

.method private updateImageViewAttributes()V
    .locals 0

    .line 118
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->updateImageViewHeight()V

    .line 119
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->updateImageViewScaleType()V

    .line 120
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->updateImageViewPadding()V

    .line 121
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->updateImageViewSrc()V

    return-void
.end method

.method private updateImageViewHeight()V
    .locals 2

    .line 141
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->ivImage:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->contentCardViewState:Lcom/ibotta/android/content/card/ContentCardViewState;

    invoke-virtual {v1}, Lcom/ibotta/android/content/card/ContentCardViewState;->getImageViewState()Lcom/ibotta/android/views/content/ContentImageViewState;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/views/content/ContentImageViewState;->getImageHeight()I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    return-void
.end method

.method private updateImageViewPadding()V
    .locals 4

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->contentCardViewState:Lcom/ibotta/android/content/card/ContentCardViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/content/card/ContentCardViewState;->getImageViewState()Lcom/ibotta/android/views/content/ContentImageViewState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/views/content/ContentImageViewState;->getImagePaddingRLT()I

    move-result v0

    .line 162
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->ivImage:Landroid/widget/ImageView;

    .line 166
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f070150

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    .line 162
    invoke-virtual {v1, v0, v0, v0, v2}, Landroid/widget/ImageView;->setPadding(IIII)V

    return-void
.end method

.method private updateImageViewScaleType()V
    .locals 2

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->contentCardViewState:Lcom/ibotta/android/content/card/ContentCardViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/content/card/ContentCardViewState;->getImageViewState()Lcom/ibotta/android/views/content/ContentImageViewState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/views/content/ContentImageViewState;->getImageScaleType()Lcom/ibotta/android/views/content/ScaleType;

    move-result-object v0

    .line 147
    sget-object v1, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView$1;->$SwitchMap$com$ibotta$android$views$content$ScaleType:[I

    invoke-virtual {v0}, Lcom/ibotta/android/views/content/ScaleType;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 152
    :pswitch_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->ivImage:Landroid/widget/ImageView;

    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    goto :goto_0

    .line 149
    :pswitch_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->ivImage:Landroid/widget/ImageView;

    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private updateLayout()V
    .locals 1

    .line 135
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->contentCardViewState:Lcom/ibotta/android/content/card/ContentCardViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/content/card/ContentCardViewState;->getLayoutViewState()Lcom/ibotta/android/views/generic/LayoutViewState;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->contentCardViewState:Lcom/ibotta/android/content/card/ContentCardViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/content/card/ContentCardViewState;->getLayoutViewState()Lcom/ibotta/android/views/generic/LayoutViewState;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->convertToLayoutParams(Lcom/ibotta/android/views/generic/LayoutViewState;)Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method

.method private updatePayAtRetailerButton()V
    .locals 3

    .line 278
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->contentCardViewState:Lcom/ibotta/android/content/card/ContentCardViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/content/card/ContentCardViewState;->getPayAtRetailerViewState()Lcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;

    move-result-object v0

    .line 280
    sget-object v1, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView$1;->$SwitchMap$com$ibotta$android$views$components$Visibility:[I

    invoke-virtual {v0}, Lcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;->getVisibility()Lcom/ibotta/android/views/components/Visibility;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/views/components/Visibility;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 288
    :pswitch_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->bPayAtRetailer:Landroid/widget/Button;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_0

    .line 285
    :pswitch_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->bPayAtRetailer:Landroid/widget/Button;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_0

    .line 282
    :pswitch_2
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->bPayAtRetailer:Landroid/widget/Button;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 292
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->bPayAtRetailer:Landroid/widget/Button;

    invoke-virtual {v0}, Lcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private updateRetailerStack()V
    .locals 2

    .line 174
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->ivRetailerStack:Lcom/ibotta/android/views/spotlight/RetailerStackView;

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/gallery/-$$Lambda$1lNNPx_y4xI-DiXo0d3VT8w0qYA;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/view/gallery/-$$Lambda$1lNNPx_y4xI-DiXo0d3VT8w0qYA;-><init>(Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/spotlight/RetailerStackView;->bindViewEvents(Lcom/ibotta/android/views/components/ClickableViewEvent;)V

    .line 175
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->ivRetailerStack:Lcom/ibotta/android/views/spotlight/RetailerStackView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->contentCardViewState:Lcom/ibotta/android/content/card/ContentCardViewState;

    invoke-virtual {v1}, Lcom/ibotta/android/content/card/ContentCardViewState;->getRetailerStackViewState()Lcom/ibotta/android/views/spotlight/RetailerStackViewState;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/spotlight/RetailerStackView;->updateViewState(Lcom/ibotta/android/views/spotlight/RetailerStackViewState;)V

    return-void
.end method

.method private updateType()V
    .locals 2

    .line 188
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->tvType:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->contentCardViewState:Lcom/ibotta/android/content/card/ContentCardViewState;

    invoke-virtual {v1}, Lcom/ibotta/android/content/card/ContentCardViewState;->getSummaryContentViewState()Lcom/ibotta/android/views/content/SummaryContentViewState;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/views/content/SummaryContentViewState;->getTopText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private updateTypeVisibility()V
    .locals 2

    .line 192
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->contentCardViewState:Lcom/ibotta/android/content/card/ContentCardViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/content/card/ContentCardViewState;->getSummaryContentViewState()Lcom/ibotta/android/views/content/SummaryContentViewState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/views/content/SummaryContentViewState;->getTopTextVisibility()Lcom/ibotta/android/views/components/Visibility;

    move-result-object v0

    .line 194
    sget-object v1, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView$1;->$SwitchMap$com$ibotta$android$views$components$Visibility:[I

    invoke-virtual {v0}, Lcom/ibotta/android/views/components/Visibility;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 202
    :pswitch_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->tvType:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 199
    :pswitch_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->tvType:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 196
    :pswitch_2
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->tvType:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private updateUnlockButton()V
    .locals 2

    .line 268
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->iibIbottaImageButton:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->contentCardViewState:Lcom/ibotta/android/content/card/ContentCardViewState;

    invoke-virtual {v1}, Lcom/ibotta/android/content/card/ContentCardViewState;->getIbottaButtonViewState()Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->updateViewState(Lcom/ibotta/android/views/base/button/IbottaButtonViewState;)V

    .line 269
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->iibIbottaImageButton:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->setVisibility(I)V

    .line 270
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->iibIbottaImageButton:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/gallery/-$$Lambda$PMd_jI6hcWDOwIKs4Lkm7TNrxyE;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/view/gallery/-$$Lambda$PMd_jI6hcWDOwIKs4Lkm7TNrxyE;-><init>(Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->bindViewEvents(Lcom/ibotta/android/views/components/ClickableViewEvent;)V

    return-void
.end method


# virtual methods
.method public bindViewEvents(Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;)V
    .locals 0

    .line 303
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->contentCardViewEvents:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

    return-void
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 54
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->bindViewEvents(Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;)V

    return-void
.end method

.method public cancelImageLoad()V
    .locals 2

    .line 230
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->imageLoadJob:Lcom/ibotta/android/images/ImageLoadJob;

    if-nez v0, :cond_0

    return-void

    .line 234
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/images/ImageLoadJob;->cancel(Landroid/content/Context;)V

    return-void
.end method

.method public getRetailerIdForTracking()Ljava/lang/Integer;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 184
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->contentCardViewState:Lcom/ibotta/android/content/card/ContentCardViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/content/card/ContentCardViewState;->getRetailerStackViewState()Lcom/ibotta/android/views/spotlight/RetailerStackViewState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/views/spotlight/RetailerStackViewState;->getRetailerId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected initLayout()V
    .locals 2
    .annotation runtime Ljavax/annotation/OverridingMethodsMustInvokeSuper;
    .end annotation

    .line 93
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;)V

    .line 94
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c0135

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method public onError()V
    .locals 0

    return-void
.end method

.method protected onImageButtonClicked()V
    .locals 3

    .line 238
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->getCtaConsumer()Ljava9/util/function/BiConsumer;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->contentCardViewState:Lcom/ibotta/android/content/card/ContentCardViewState;

    .line 239
    invoke-virtual {v1}, Lcom/ibotta/android/content/card/ContentCardViewState;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->contentCardViewState:Lcom/ibotta/android/content/card/ContentCardViewState;

    invoke-virtual {v2}, Lcom/ibotta/android/content/card/ContentCardViewState;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v2

    .line 238
    invoke-interface {v0, v1, v2}, Ljava9/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public onRetailerIconClicked()V
    .locals 2
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->OFFER_RETAILER_CLICKED:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 180
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    return-void
.end method

.method public onSuccess(II)V
    .locals 6

    .line 258
    sget-object v0, Lcom/ibotta/android/views/util/CardHelper;->INSTANCE:Lcom/ibotta/android/views/util/CardHelper;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->ivImage:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->contentCardViewState:Lcom/ibotta/android/content/card/ContentCardViewState;

    .line 259
    invoke-virtual {v1}, Lcom/ibotta/android/content/card/ContentCardViewState;->getImageViewState()Lcom/ibotta/android/views/content/ContentImageViewState;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/views/content/ContentImageViewState;->getGlideSize()Lcom/ibotta/android/views/images/Sizes;

    move-result-object v3

    move-object v1, p0

    move v4, p1

    move v5, p2

    .line 258
    invoke-virtual/range {v0 .. v5}, Lcom/ibotta/android/views/util/CardHelper;->updateLayoutIfFullBleed(Landroid/support/v7/widget/CardView;Landroid/widget/ImageView;Lcom/ibotta/android/views/images/Sizes;II)V

    return-void
.end method

.method protected onUpdateViewState()V
    .locals 1
    .annotation runtime Ljavax/annotation/OverridingMethodsMustInvokeSuper;
    .end annotation

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->contentCardViewState:Lcom/ibotta/android/content/card/ContentCardViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/content/card/ContentCardViewState;->getSummaryContentViewState()Lcom/ibotta/android/views/content/SummaryContentViewState;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->updateSummaryContent(Lcom/ibotta/android/views/content/SummaryContentViewState;)V

    .line 104
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->updateType()V

    .line 105
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->updateTypeVisibility()V

    .line 106
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->updateAmount()V

    .line 107
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->updateExpiringBanner()V

    .line 108
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->updateBadge()V

    .line 109
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->updateRetailerStack()V

    .line 110
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->updateUnlockButton()V

    .line 111
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->updateImageViewAttributes()V

    .line 112
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->updateBackgroundState()V

    .line 113
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->updatePayAtRetailerButton()V

    .line 114
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->updateLayout()V

    return-void
.end method

.method public updateImageViewSrc()V
    .locals 8

    .line 125
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->ivImage:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 126
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    .line 127
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->contentCardViewState:Lcom/ibotta/android/content/card/ContentCardViewState;

    .line 128
    invoke-virtual {v0}, Lcom/ibotta/android/content/card/ContentCardViewState;->getImageViewState()Lcom/ibotta/android/views/content/ContentImageViewState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/views/content/ContentImageViewState;->getImageUrl()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->ivImage:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->contentCardViewState:Lcom/ibotta/android/content/card/ContentCardViewState;

    .line 130
    invoke-virtual {v0}, Lcom/ibotta/android/content/card/ContentCardViewState;->getImageViewState()Lcom/ibotta/android/views/content/ContentImageViewState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/views/content/ContentImageViewState;->getGlideSize()Lcom/ibotta/android/views/images/Sizes;

    move-result-object v6

    move-object v7, p0

    .line 126
    invoke-interface/range {v2 .. v7}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;Lcom/ibotta/android/images/ImageCacheListener;)Lcom/ibotta/android/images/ImageLoadJob;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->imageLoadJob:Lcom/ibotta/android/images/ImageLoadJob;

    return-void
.end method

.method protected updateSummaryContent(Lcom/ibotta/android/views/content/SummaryContentViewState;)V
    .locals 2
    .annotation runtime Ljavax/annotation/OverridingMethodsMustInvokeSuper;
    .end annotation

    .line 212
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->tvDescription:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/ibotta/android/views/content/SummaryContentViewState;->getBottomText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 214
    invoke-virtual {p1}, Lcom/ibotta/android/views/content/SummaryContentViewState;->getBottomTextMaxLines()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 216
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->tvDescription:Landroid/widget/TextView;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 219
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/views/content/SummaryContentViewState;->getBottomTextLines()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 221
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->tvDescription:Landroid/widget/TextView;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setLines(I)V

    :cond_1
    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/content/card/ContentCardViewState;)V
    .locals 0

    .line 297
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->contentCardViewState:Lcom/ibotta/android/content/card/ContentCardViewState;

    .line 298
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->onUpdateViewState()V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 54
    check-cast p1, Lcom/ibotta/android/content/card/ContentCardViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->updateViewState(Lcom/ibotta/android/content/card/ContentCardViewState;)V

    return-void
.end method
