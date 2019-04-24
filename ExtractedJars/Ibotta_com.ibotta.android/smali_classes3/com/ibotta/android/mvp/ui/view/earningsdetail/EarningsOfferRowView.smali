.class public Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;
.super Landroid/widget/LinearLayout;
.source "EarningsOfferRowView.java"


# instance fields
.field protected appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected formatting:Lcom/ibotta/android/util/Formatting;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private isVerified:Z

.field protected ivOfferImage:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902b9
    .end annotation
.end field

.field protected offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private offerModel:Lcom/ibotta/api/model/OfferModel;

.field private showBottomSpace:Z

.field private showTopDivider:Z

.field protected tvOfferAmountEarned:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090553
    .end annotation
.end field

.field protected tvOfferTitle:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090555
    .end annotation
.end field

.field protected vBottomSpace:Landroid/view/View;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0905ad
    .end annotation
.end field

.field protected vTopDivider:Landroid/view/View;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0905bc
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 52
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 56
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 57
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 61
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 62
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 67
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 68
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->initLayout()V

    return-void
.end method

.method private initBottomSpace()V
    .locals 2

    .line 164
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->showBottomSpace:Z

    if-eqz v0, :cond_0

    .line 165
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->vBottomSpace:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 167
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->vBottomSpace:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 72
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;)V

    const/4 v0, 0x1

    .line 74
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->setOrientation(I)V

    .line 76
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c0152

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 77
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private initOfferAmount()V
    .locals 9

    .line 136
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->isVerified:Z

    if-eqz v0, :cond_0

    .line 137
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f110642

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 138
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->tvOfferAmountEarned:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->getContext()Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f060027

    invoke-static {v2, v3}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 140
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f110647

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 141
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->tvOfferAmountEarned:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->getContext()Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f06010d

    invoke-static {v2, v3}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 145
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getPercentBack()Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getPercentBack()Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const/4 v5, 0x0

    cmpl-float v1, v1, v5

    if-nez v1, :cond_1

    goto :goto_1

    .line 153
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v5}, Lcom/ibotta/api/model/OfferModel;->getEarnedAmount()F

    move-result v5

    float-to-double v5, v5

    invoke-interface {v1, v5, v6}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object v1

    .line 154
    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v5}, Lcom/ibotta/api/model/OfferModel;->getPercentBack()Ljava/lang/Float;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 156
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f110644

    const/4 v8, 0x3

    new-array v8, v8, [Ljava/lang/Object;

    aput-object v0, v8, v3

    aput-object v5, v8, v2

    aput-object v1, v8, v4

    invoke-virtual {v6, v7, v8}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    .line 147
    :cond_2
    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v5}, Lcom/ibotta/api/model/OfferModel;->getEarnedAmount()F

    move-result v5

    float-to-double v5, v5

    invoke-interface {v1, v5, v6}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object v1

    .line 149
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f110643

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v0, v4, v3

    aput-object v1, v4, v2

    invoke-virtual {v5, v6, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 160
    :goto_2
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->tvOfferAmountEarned:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initOfferImage()V
    .locals 5

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0, v1}, Lcom/ibotta/api/helper/offer/OfferHelper;->isShopNow(Lcom/ibotta/api/model/OfferModel;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getThumbUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getThumbUrl()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 118
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getUrl()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 121
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/AppHelper;->getBestOfferImgUrl(Lcom/ibotta/api/model/OfferModel;)Ljava/lang/String;

    move-result-object v0

    .line 124
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->ivOfferImage:Landroid/widget/ImageView;

    sget-object v4, Lcom/ibotta/android/views/images/Sizes;->RETAILER_LOGO:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v1, v2, v0, v3, v4}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    return-void
.end method

.method private initOfferTitle()V
    .locals 2

    .line 128
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->tvOfferTitle:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initTopDivider()V
    .locals 2

    .line 104
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->showTopDivider:Z

    if-eqz v0, :cond_0

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->vTopDivider:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 107
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->vTopDivider:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private onSetup()V
    .locals 0

    .line 96
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->initTopDivider()V

    .line 97
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->initOfferImage()V

    .line 98
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->initOfferTitle()V

    .line 99
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->initOfferAmount()V

    .line 100
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->initBottomSpace()V

    return-void
.end method


# virtual methods
.method public setShowBottomSpace(Z)V
    .locals 0

    .line 85
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->showBottomSpace:Z

    return-void
.end method

.method public setShowTopDivider(Z)V
    .locals 0

    .line 81
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->showTopDivider:Z

    return-void
.end method

.method public setup(Lcom/ibotta/api/model/OfferModel;Z)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    .line 90
    iput-boolean p2, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->isVerified:Z

    .line 92
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->onSetup()V

    return-void
.end method
