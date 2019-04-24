.class public Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;
.super Landroid/support/v7/widget/CardView;
.source "ProductSpotlightTopContentView.java"


# instance fields
.field protected appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected clWrapper:Landroid/support/constraint/ConstraintLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900fb
    .end annotation
.end field

.field protected formatting:Lcom/ibotta/android/util/Formatting;
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

.field protected ivImage:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902ad
    .end annotation
.end field

.field protected obvBadgeView:Lcom/ibotta/android/views/offer/badge/BadgeView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900de
    .end annotation
.end field

.field private productImageCardListener:Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardListener;

.field private spotlightUnlockListener:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockListener;

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
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 56
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

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

    .line 60
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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

    .line 64
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 65
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->initLayout()V

    return-void
.end method

.method private initAmount()V
    .locals 2

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->tvAmount:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method private initBadgeViewBottomMargin()V
    .locals 3

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->obvBadgeView:Lcom/ibotta/android/views/offer/badge/BadgeView;

    invoke-virtual {v0}, Lcom/ibotta/android/views/offer/badge/BadgeView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 96
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0701bb

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    return-void
.end method

.method private initCardViewAttributes()V
    .locals 2

    const v0, 0x7f060171

    .line 137
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->setBackgroundResource(I)V

    const/4 v0, 0x0

    .line 138
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->setUseCompatPadding(Z)V

    .line 139
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f070199

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->setCardElevation(F)V

    const/4 v0, 0x0

    .line 140
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->setRadius(F)V

    return-void
.end method

.method private initClBackground()V
    .locals 2

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->clWrapper:Landroid/support/constraint/ConstraintLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/constraint/ConstraintLayout;->setBackgroundResource(I)V

    return-void
.end method

.method private initConstraints()V
    .locals 7

    .line 100
    new-instance v6, Landroid/support/constraint/ConstraintSet;

    invoke-direct {v6}, Landroid/support/constraint/ConstraintSet;-><init>()V

    .line 101
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->clWrapper:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v6, v0}, Landroid/support/constraint/ConstraintSet;->clone(Landroid/support/constraint/ConstraintLayout;)V

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->tvDescription:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getId()I

    move-result v1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->iibIbottaImageButton:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    invoke-virtual {v0}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->getId()I

    move-result v3

    const/4 v2, 0x7

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, v6

    invoke-virtual/range {v0 .. v5}, Landroid/support/constraint/ConstraintSet;->connect(IIIII)V

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->tvDescription:Landroid/widget/TextView;

    .line 105
    invoke-virtual {v0}, Landroid/widget/TextView;->getId()I

    move-result v1

    const/4 v2, 0x6

    const/4 v3, 0x0

    move-object v0, v6

    .line 104
    invoke-virtual/range {v0 .. v5}, Landroid/support/constraint/ConstraintSet;->connect(IIIII)V

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->tvDescription:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getId()I

    move-result v1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->tvAmount:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getId()I

    move-result v3

    const/4 v2, 0x3

    const/4 v4, 0x4

    move-object v0, v6

    invoke-virtual/range {v0 .. v5}, Landroid/support/constraint/ConstraintSet;->connect(IIIII)V

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->iibIbottaImageButton:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    invoke-virtual {v0}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->getId()I

    move-result v1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->tvDescription:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getId()I

    move-result v3

    const/4 v2, 0x4

    move-object v0, v6

    invoke-virtual/range {v0 .. v5}, Landroid/support/constraint/ConstraintSet;->connect(IIIII)V

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->iibIbottaImageButton:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    invoke-virtual {v0}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->getId()I

    move-result v1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->tvType:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getId()I

    move-result v3

    const/4 v2, 0x3

    const/4 v4, 0x3

    move-object v0, v6

    invoke-virtual/range {v0 .. v5}, Landroid/support/constraint/ConstraintSet;->connect(IIIII)V

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->iibIbottaImageButton:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    invoke-virtual {v0}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->getId()I

    move-result v1

    const/4 v2, 0x7

    const/4 v3, 0x0

    const/4 v4, 0x7

    move-object v0, v6

    invoke-virtual/range {v0 .. v5}, Landroid/support/constraint/ConstraintSet;->connect(IIIII)V

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->clWrapper:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v6, v0}, Landroid/support/constraint/ConstraintSet;->applyTo(Landroid/support/constraint/ConstraintLayout;)V

    return-void
.end method

.method private initDescription()V
    .locals 4

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->tvDescription:Landroid/widget/TextView;

    new-instance v1, Landroid/support/constraint/ConstraintLayout$LayoutParams;

    const/4 v2, 0x0

    const/4 v3, -0x1

    invoke-direct {v1, v2, v3}, Landroid/support/constraint/ConstraintLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->tvDescription:Landroid/widget/TextView;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 69
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;)V

    .line 70
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c0135

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 71
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 72
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->iibIbottaImageButton:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->ivImage:Landroid/widget/ImageView;

    invoke-static {v0, v1}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    .line 76
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->initCardViewAttributes()V

    .line 77
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->initClBackground()V

    .line 78
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->initBadgeViewBottomMargin()V

    .line 79
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->initDescription()V

    .line 80
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->initAmount()V

    .line 81
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->initConstraints()V

    .line 82
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->initImageView()V

    return-void
.end method

.method private updateDescription(Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentViewState;)V
    .locals 1

    .line 174
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->tvDescription:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentViewState;->getDescription()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private updateImageAttributes(Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentViewState;)V
    .locals 4

    .line 164
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->ivImage:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentViewState;->getImageUrl()Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->ivImage:Landroid/widget/ImageView;

    sget-object v3, Lcom/ibotta/android/views/images/Sizes;->OFFER_FULL_WIDTH:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v0, v1, p1, v2, v3}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    return-void
.end method

.method private updateType()V
    .locals 3

    .line 170
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->tvType:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f1101c9

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private updateUnlockOrShopbutton()V
    .locals 3

    .line 144
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->iibIbottaImageButton:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f1101ea

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->iibIbottaImageButton:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    const v1, 0x7f080213

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->setImageResource(I)V

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->iibIbottaImageButton:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public initImageView()V
    .locals 6

    .line 123
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f070165

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 125
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->ivImage:Landroid/widget/ImageView;

    sget-object v2, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 126
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->ivImage:Landroid/widget/ImageView;

    new-instance v2, Landroid/support/constraint/ConstraintLayout$LayoutParams;

    sget-object v3, Lcom/ibotta/android/views/util/CardHelper;->INSTANCE:Lcom/ibotta/android/views/util/CardHelper;

    sget-object v4, Lcom/ibotta/android/views/content/ContentStyle;->SPOTLIGHT:Lcom/ibotta/android/views/content/ContentStyle;

    .line 128
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/ibotta/android/views/util/CardHelper;->getImageHeight(Lcom/ibotta/android/views/content/ContentStyle;Landroid/content/res/Resources;)I

    move-result v3

    const/4 v4, -0x1

    invoke-direct {v2, v4, v3}, Landroid/support/constraint/ConstraintLayout$LayoutParams;-><init>(II)V

    .line 126
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 129
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->ivImage:Landroid/widget/ImageView;

    .line 131
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f07018d

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    .line 129
    invoke-virtual {v1, v0, v2, v0, v0}, Landroid/widget/ImageView;->setPadding(IIII)V

    return-void
.end method

.method protected onCtaClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090246
        }
    .end annotation

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->spotlightUnlockListener:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockListener;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockListener;->onShopClicked()V

    return-void
.end method

.method protected onImageClicked()V
    .locals 2
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0902ad
        }
    .end annotation

    .line 156
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->productImageCardListener:Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardListener;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardListener;->onProductImageClicked(Lcom/ibotta/api/model/ProductModel;)V

    return-void
.end method

.method public setListeners(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockListener;Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardListener;)V
    .locals 0

    .line 118
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->spotlightUnlockListener:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockListener;

    .line 119
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->productImageCardListener:Lcom/ibotta/android/mvp/ui/view/product/ProductImageCardListener;

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentViewState;)V
    .locals 0

    .line 178
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->updateImageAttributes(Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentViewState;)V

    .line 179
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->updateDescription(Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentViewState;)V

    .line 182
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->updateUnlockOrShopbutton()V

    .line 183
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->updateType()V

    return-void
.end method
