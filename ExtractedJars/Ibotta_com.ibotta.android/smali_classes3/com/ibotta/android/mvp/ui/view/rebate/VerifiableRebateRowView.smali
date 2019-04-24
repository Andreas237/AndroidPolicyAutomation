.class public Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;
.super Landroid/widget/LinearLayout;
.source "VerifiableRebateRowView.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView$VerifiableRebateRowListener;
    }
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

.field private count:I

.field protected ibCheck:Landroid/widget/ImageButton;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09022f
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

.field private listener:Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView$VerifiableRebateRowListener;

.field protected mcvCount:Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090353
    .end annotation
.end field

.field private offerModel:Lcom/ibotta/api/model/OfferModel;

.field protected rivIndicator:Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903ca
    .end annotation
.end field

.field private showMultiplesView:Z

.field protected tvAmount:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0904ee
    .end annotation
.end field

.field protected tvMultiples:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09054b
    .end annotation
.end field

.field protected tvName:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09054d
    .end annotation
.end field

.field private verified:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 60
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 61
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 65
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 66
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 70
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 71
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 76
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 77
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->initLayout()V

    return-void
.end method

.method private initAmount()V
    .locals 2

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->tvAmount:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getCurrentValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initCheck()V
    .locals 3

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->ibCheck:Landroid/widget/ImageButton;

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->verified:Z

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setSelected(Z)V

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->ibCheck:Landroid/widget/ImageButton;

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/rebate/-$$Lambda$VerifiableRebateRowView$hbYuIt_N6C-Y_VOEDmNLeDexKuQ;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/view/rebate/-$$Lambda$VerifiableRebateRowView$hbYuIt_N6C-Y_VOEDmNLeDexKuQ;-><init>(Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method private initCount()V
    .locals 2

    .line 182
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->showMultiplesView:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->isMultipleRedemptions()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 183
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->mcvCount:Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;->setVisibility(I)V

    .line 184
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->mcvCount:Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->count:I

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;->setCount(I)V

    goto :goto_0

    .line 186
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->mcvCount:Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private initCountClickHandler()V
    .locals 3

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->mcvCount:Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/rebate/-$$Lambda$VerifiableRebateRowView$OrTGCzIFqYLB21jMD1ToIYOhmgQ;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/view/rebate/-$$Lambda$VerifiableRebateRowView$OrTGCzIFqYLB21jMD1ToIYOhmgQ;-><init>(Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method private initIndicator()V
    .locals 2

    .line 147
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;-><init>()V

    .line 148
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->isMultipleRedemptions()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->setMultipleRedemptions(Z)V

    .line 149
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->isMultiples()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->setMultiples(Z)V

    .line 150
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->isCombo()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->setCombo(Z)V

    .line 151
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/config/AppConfig;->showQuantityBadge()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->setShowQuantityBadge(Z)V

    .line 152
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getMultiplesCount()S

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->setMultiplesCount(S)V

    .line 154
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->rivIndicator:Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;->setup(Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;)V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 94
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;)V

    const/4 v0, 0x0

    .line 96
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->setOrientation(I)V

    const/high16 v1, 0x42c80000    # 100.0f

    .line 97
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->setWeightSum(F)V

    .line 98
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->setFocusable(Z)V

    .line 100
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->isInEditMode()Z

    move-result v1

    if-nez v1, :cond_0

    .line 101
    invoke-static {p0, v0}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    .line 104
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c01f1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 105
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 107
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->initCountClickHandler()V

    return-void
.end method

.method private initMultiples()V
    .locals 6

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->isCombo()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->tvMultiples:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 168
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->tvMultiples:Landroid/widget/TextView;

    const v1, 0x7f11065a

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 169
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->isMultipleRedemptions()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 170
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->tvMultiples:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->tvMultiples:Landroid/widget/TextView;

    const v1, 0x7f11065b

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 172
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->isMultiples()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 173
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->tvMultiples:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 174
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getMultiplesCount()S

    move-result v0

    .line 175
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->tvMultiples:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f11065c

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v5, v1

    invoke-virtual {v3, v4, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 177
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->tvMultiples:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private initName()V
    .locals 2

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->tvName:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initProductImage()V
    .locals 5

    .line 141
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/AppHelper;->getBestOfferImgUrl(Lcom/ibotta/api/model/OfferModel;)Ljava/lang/String;

    move-result-object v0

    .line 143
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->ivProduct:Landroid/widget/ImageView;

    sget-object v4, Lcom/ibotta/android/views/images/Sizes;->OFFER_HALF_WIDTH:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v1, v2, v0, v3, v4}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    return-void
.end method

.method private initRowClickHandler(Z)V
    .locals 1

    if-eqz p1, :cond_1

    .line 129
    new-instance p1, Lcom/ibotta/android/mvp/ui/view/rebate/-$$Lambda$VerifiableRebateRowView$EEqbDaMNRYph3TATL615GOrlOyM;

    invoke-direct {p1, p0}, Lcom/ibotta/android/mvp/ui/view/rebate/-$$Lambda$VerifiableRebateRowView$EEqbDaMNRYph3TATL615GOrlOyM;-><init>(Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;)V

    instance-of v0, p0, Landroid/view/View;

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 131
    instance-of v0, p0, Landroid/view/View;

    if-nez v0, :cond_2

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_2
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method public static synthetic lambda$initCheck$2(Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;Landroid/view/View;)V
    .locals 0

    .line 137
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->onCheckClicked()V

    return-void
.end method

.method public static synthetic lambda$initCountClickHandler$0(Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;Landroid/view/View;)V
    .locals 0

    .line 111
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->onChangeQuantityClicked()V

    return-void
.end method

.method public static synthetic lambda$initRowClickHandler$1(Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;Landroid/view/View;)V
    .locals 0

    .line 129
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->onRowClicked()V

    return-void
.end method

.method private onChangeQuantityClicked()V
    .locals 2

    .line 203
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->listener:Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView$VerifiableRebateRowListener;

    if-eqz v0, :cond_0

    .line 204
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView$VerifiableRebateRowListener;->onChangeQuantityClicked(Lcom/ibotta/api/model/OfferModel;)V

    :cond_0
    return-void
.end method

.method private onCheckClicked()V
    .locals 2

    .line 197
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->listener:Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView$VerifiableRebateRowListener;

    if-eqz v0, :cond_0

    .line 198
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView$VerifiableRebateRowListener;->onCheckClicked(Lcom/ibotta/api/model/OfferModel;)V

    :cond_0
    return-void
.end method

.method private onRowClicked()V
    .locals 2

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->listener:Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView$VerifiableRebateRowListener;

    if-eqz v0, :cond_0

    .line 192
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView$VerifiableRebateRowListener;->onRowClicked(Lcom/ibotta/api/model/OfferModel;)V

    :cond_0
    return-void
.end method

.method private onSetup(Z)V
    .locals 0

    .line 115
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->initCheck()V

    .line 116
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->initProductImage()V

    .line 117
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->initIndicator()V

    .line 118
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->initAmount()V

    .line 119
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->initName()V

    .line 120
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->initMultiples()V

    .line 121
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->initCount()V

    .line 123
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->initRowClickHandler(Z)V

    .line 124
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->setClickable(Z)V

    return-void
.end method


# virtual methods
.method public setListener(Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView$VerifiableRebateRowListener;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->listener:Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView$VerifiableRebateRowListener;

    return-void
.end method

.method public setup(Lcom/ibotta/api/model/OfferModel;IZZZ)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    .line 86
    iput p2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->count:I

    .line 87
    iput-boolean p4, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->showMultiplesView:Z

    .line 88
    iput-boolean p5, p0, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->verified:Z

    .line 90
    invoke-direct {p0, p3}, Lcom/ibotta/android/mvp/ui/view/rebate/VerifiableRebateRowView;->onSetup(Z)V

    return-void
.end method
