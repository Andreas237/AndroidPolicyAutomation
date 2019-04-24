.class public Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;
.super Landroid/widget/LinearLayout;
.source "RebateRowView.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field protected appConfig:Lcom/ibotta/android/state/app/config/AppConfig;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected bShop:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900a7
    .end annotation
.end field

.field private contentCardViewEvents:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

.field protected ebvExpirationBanner:Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901a8
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

.field protected ivProduct:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902bc
    .end annotation
.end field

.field protected oatvAmount:Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090385
    .end annotation
.end field

.field protected offerButtonReducer:Lcom/ibotta/android/button/OfferButtonReducer;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private offerModel:Lcom/ibotta/api/model/OfferModel;

.field private retailerId:Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private retailerModel:Lcom/ibotta/api/model/RetailerModel;

.field protected rivIndicator:Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903ca
    .end annotation
.end field

.field private shopNow:Z

.field protected tvCaption:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090503
    .end annotation
.end field

.field protected tvExpiration:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090520
    .end annotation
.end field

.field protected tvName:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09054d
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 72
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 73
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 77
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 78
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 82
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 83
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 88
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 89
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->initLayout()V

    return-void
.end method

.method private initAmount()V
    .locals 4

    .line 195
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getOldValue()Ljava/lang/String;

    move-result-object v0

    .line 196
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getCurrentValue()Ljava/lang/String;

    move-result-object v1

    .line 198
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 200
    :goto_0
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->oatvAmount:Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;

    invoke-virtual {v3, v2, v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;->initText(ZLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private initCaption()V
    .locals 2

    .line 209
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getCaption()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 210
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->tvCaption:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getCaption()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 211
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->tvCaption:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 213
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->tvCaption:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private initExpiration()V
    .locals 5

    .line 218
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/AppHelper;->isOfferExpiring(Lcom/ibotta/api/model/OfferModel;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->isActivated()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    .line 219
    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->isExpiringSoon()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 238
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->tvExpiration:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 220
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->tvExpiration:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 221
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->tvExpiration:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    .line 222
    invoke-interface {v3}, Lcom/ibotta/api/model/OfferModel;->getExpiration()Ljava/util/Date;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/ibotta/android/util/Formatting;->getAppConfigExpiration(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    .line 221
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 224
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->isExpiringSoon()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 225
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->getContext()Landroid/content/Context;

    move-result-object v0

    const v2, 0x7f06010d

    invoke-static {v0, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    .line 226
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v2}, Lcom/ibotta/android/state/app/config/AppConfig;->getExpirationDateTextColor()Ljava/lang/String;

    move-result-object v2

    .line 229
    :try_start_0
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-string v3, "Issue parsing color %s, so we are defaulting to 0x%08X"

    const/4 v4, 0x2

    .line 231
    new-array v4, v4, [Ljava/lang/Object;

    aput-object v2, v4, v1

    const/4 v1, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v4, v1

    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->tvExpiration:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_2

    .line 235
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->tvExpiration:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f0600ef

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :goto_2
    return-void
.end method

.method private initExpirationBanner()V
    .locals 3

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->isExpiringSoon()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 172
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->ebvExpirationBanner:Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;->setVisibility(I)V

    .line 173
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->ebvExpirationBanner:Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;

    sget-object v2, Lcom/ibotta/android/views/content/ContentStyle;->SMALL:Lcom/ibotta/android/views/content/ContentStyle;

    invoke-virtual {v0, v2}, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;->setStyle(Lcom/ibotta/android/views/content/ContentStyle;)V

    .line 174
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->ebvExpirationBanner:Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;->setBannerWrappingVisibility(Z)V

    goto :goto_0

    .line 176
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->ebvExpirationBanner:Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private initIndicator()V
    .locals 2

    .line 181
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->rivIndicator:Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;->setVisibility(I)V

    .line 183
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;-><init>()V

    .line 184
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->isMultipleRedemptions()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->setMultipleRedemptions(Z)V

    .line 185
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->isMultiples()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->setMultiples(Z)V

    .line 186
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->isCombo()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->setCombo(Z)V

    .line 187
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/config/AppConfig;->showQuantityBadge()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->setShowQuantityBadge(Z)V

    .line 188
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getMultiplesCount()S

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->setMultiplesCount(S)V

    .line 190
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->rivIndicator:Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;->setup(Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;)V

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->rivIndicator:Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;->SMALL:Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;->setSize(Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;)V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 97
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;)V

    const/4 v0, 0x0

    .line 98
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->setOrientation(I)V

    const/high16 v1, 0x42c80000    # 100.0f

    .line 99
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->setWeightSum(F)V

    const/4 v1, 0x1

    .line 100
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->setClickable(Z)V

    .line 101
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->setFocusable(Z)V

    .line 103
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->isInEditMode()Z

    move-result v2

    if-nez v2, :cond_0

    .line 104
    invoke-static {p0, v0}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    .line 107
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f0c01a8

    invoke-virtual {v0, v2, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 108
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 110
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->initRowClickHandler()V

    return-void
.end method

.method private initName()V
    .locals 2

    .line 204
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->tvName:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initProductImage()V
    .locals 5

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0, v1}, Lcom/ibotta/api/helper/offer/OfferHelper;->isShopNow(Lcom/ibotta/api/model/OfferModel;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getThumbUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 159
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getThumbUrl()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 161
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getUrl()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 164
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/AppHelper;->getBestOfferImgUrl(Lcom/ibotta/api/model/OfferModel;)Ljava/lang/String;

    move-result-object v0

    .line 167
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->ivProduct:Landroid/widget/ImageView;

    sget-object v4, Lcom/ibotta/android/views/images/Sizes;->OFFER_HALF_WIDTH:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v1, v2, v0, v3, v4}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    return-void
.end method

.method private initRowClickHandler()V
    .locals 2

    .line 147
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/rebate/-$$Lambda$RebateRowView$UNRfV6mhnae7FmvUvlD5ZMIDuTQ;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/view/rebate/-$$Lambda$RebateRowView$UNRfV6mhnae7FmvUvlD5ZMIDuTQ;-><init>(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;)V

    instance-of v1, p0, Landroid/view/View;

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-static {v1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method private initShopButton()V
    .locals 2

    .line 254
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->shopNow:Z

    if-nez v0, :cond_0

    .line 255
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->bShop:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    return-void

    .line 259
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->bShop:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    return-void
.end method

.method private initUnlockButton()V
    .locals 3

    .line 243
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->shopNow:Z

    if-eqz v0, :cond_0

    .line 244
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->iibIbottaImageButton:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->setVisibility(I)V

    return-void

    .line 248
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->iibIbottaImageButton:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->setVisibility(I)V

    .line 249
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->iibIbottaImageButton:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerButtonReducer:Lcom/ibotta/android/button/OfferButtonReducer;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/button/OfferButtonReducer;->create(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->updateViewState(Lcom/ibotta/android/views/base/button/IbottaButtonViewState;)V

    .line 250
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->iibIbottaImageButton:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/rebate/-$$Lambda$RebateRowView$yfRxcy0YVNS6NPknCq2yWS6eByo;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/view/rebate/-$$Lambda$RebateRowView$yfRxcy0YVNS6NPknCq2yWS6eByo;-><init>(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->bindViewEvents(Lcom/ibotta/android/views/components/ClickableViewEvent;)V

    return-void
.end method

.method public static synthetic lambda$initRowClickHandler$0(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;Landroid/view/View;)V
    .locals 2

    .line 148
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->contentCardViewEvents:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

    if-eqz p1, :cond_0

    .line 149
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {p1, v0, v1}, Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;->onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    :cond_0
    return-void
.end method

.method public static synthetic lambda$yfRxcy0YVNS6NPknCq2yWS6eByo(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;)V
    .locals 0

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->onUnlockClicked()V

    return-void
.end method

.method private onSetup()V
    .locals 0

    .line 135
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->initProductImage()V

    .line 136
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->initExpirationBanner()V

    .line 137
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->initIndicator()V

    .line 138
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->initAmount()V

    .line 139
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->initName()V

    .line 140
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->initCaption()V

    .line 141
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->initExpiration()V

    .line 142
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->initUnlockButton()V

    .line 143
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->initShopButton()V

    return-void
.end method

.method private onUnlockClicked()V
    .locals 3

    .line 263
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->contentCardViewEvents:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

    if-eqz v0, :cond_1

    .line 264
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->isActivated()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 265
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->contentCardViewEvents:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;->onUnlockedClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    goto :goto_0

    .line 267
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->contentCardViewEvents:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;->onUnlockClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public onShopClicked()V
    .locals 3
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0900a7
        }
    .end annotation

    .line 274
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->contentCardViewEvents:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

    if-eqz v0, :cond_0

    .line 275
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;->onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    :cond_0
    return-void
.end method

.method public setContentCardViewEvents(Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->contentCardViewEvents:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

    return-void
.end method

.method public setShowUnlock(Z)V
    .locals 3

    .line 114
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->shopNow:Z

    const/4 v1, 0x0

    const/16 v2, 0x8

    if-eqz v0, :cond_1

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->bShop:Landroid/widget/Button;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_2

    .line 117
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->iibIbottaImageButton:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    const/16 v1, 0x8

    :goto_1
    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->setVisibility(I)V

    :goto_2
    return-void
.end method

.method public setup(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    const/4 v0, 0x0

    .line 122
    invoke-virtual {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->setup(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;Ljava/lang/Integer;)V

    return-void
.end method

.method public setup(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;Ljava/lang/Integer;)V
    .locals 0

    .line 126
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    .line 127
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    .line 128
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->retailerId:Ljava/lang/Integer;

    .line 129
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-interface {p2, p1}, Lcom/ibotta/api/helper/offer/OfferHelper;->isShopNow(Lcom/ibotta/api/model/OfferModel;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->shopNow:Z

    .line 131
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->onSetup()V

    return-void
.end method
