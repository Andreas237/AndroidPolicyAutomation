.class public Lcom/ibotta/android/view/earnings/TxLedgerView;
.super Landroid/widget/LinearLayout;
.source "TxLedgerView.java"


# instance fields
.field formatting:Lcom/ibotta/android/util/Formatting;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ivTxLogo:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902d1
    .end annotation
.end field

.field protected llOtherRewards:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09031c
    .end annotation
.end field

.field protected tlrvOfferEarnings:Lcom/ibotta/android/view/earnings/TxLedgerRowView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090488
    .end annotation
.end field

.field protected tlrvOffersMatched:Lcom/ibotta/android/view/earnings/TxLedgerRowView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090489
    .end annotation
.end field

.field protected tlrvPendingEarnings:Lcom/ibotta/android/view/earnings/TxLedgerRowView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09048a
    .end annotation
.end field

.field protected tlrvPendingPeriod:Lcom/ibotta/android/view/earnings/TxLedgerRowView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09048b
    .end annotation
.end field

.field protected tlrvPurchaseDate:Lcom/ibotta/android/view/earnings/TxLedgerRowView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09048c
    .end annotation
.end field

.field protected tlrvTotalEarnings:Lcom/ibotta/android/view/earnings/TxLedgerRowView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09048d
    .end annotation
.end field

.field protected tvOtherRewardsValue:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090559
    .end annotation
.end field

.field protected tvTxTitle:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090591
    .end annotation
.end field

.field private txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

.field protected vDivider1:Landroid/view/View;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0905af
    .end annotation
.end field

.field protected vDivider2:Landroid/view/View;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0905b0
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 52
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/view/earnings/TxLedgerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 56
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/view/earnings/TxLedgerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 60
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/view/earnings/TxLedgerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 64
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 65
    invoke-direct {p0}, Lcom/ibotta/android/view/earnings/TxLedgerView;->initLayout()V

    return-void
.end method

.method private initDividers()V
    .locals 5

    .line 211
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvPurchaseDate:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->getVisibility()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvPendingPeriod:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    .line 212
    invoke-virtual {v0}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 214
    :goto_1
    iget-object v3, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvOffersMatched:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    invoke-virtual {v3}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->getVisibility()I

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvOfferEarnings:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    .line 215
    invoke-virtual {v3}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->getVisibility()I

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v3, 0x1

    .line 217
    :goto_3
    iget-object v4, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvPendingEarnings:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    invoke-virtual {v4}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->getVisibility()I

    move-result v4

    if-eqz v4, :cond_5

    iget-object v4, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvTotalEarnings:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    .line 218
    invoke-virtual {v4}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->getVisibility()I

    move-result v4

    if-nez v4, :cond_4

    goto :goto_4

    :cond_4
    const/4 v1, 0x0

    :cond_5
    :goto_4
    const/16 v4, 0x8

    if-eqz v0, :cond_7

    if-nez v3, :cond_6

    if-eqz v1, :cond_7

    .line 221
    :cond_6
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->vDivider1:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_5

    .line 223
    :cond_7
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->vDivider1:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    :goto_5
    if-eqz v3, :cond_8

    if-eqz v1, :cond_8

    .line 227
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->vDivider2:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_6

    .line 229
    :cond_8
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->vDivider2:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    :goto_6
    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 69
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/view/earnings/TxLedgerView;)V

    const/4 v0, 0x1

    .line 71
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/earnings/TxLedgerView;->setOrientation(I)V

    .line 73
    invoke-virtual {p0}, Lcom/ibotta/android/view/earnings/TxLedgerView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c01ec

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 74
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private initLogo()V
    .locals 5

    .line 101
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/view/earnings/TxLedgerView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    invoke-virtual {v2}, Lcom/ibotta/android/earnings/TxLedgerData;->getIconUrl()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->ivTxLogo:Landroid/widget/ImageView;

    sget-object v4, Lcom/ibotta/android/views/images/Sizes;->RETAILER_LOGO:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    return-void
.end method

.method private initOfferEarnings()V
    .locals 4

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    invoke-virtual {v0}, Lcom/ibotta/android/earnings/TxLedgerData;->getOfferEarnings()Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    invoke-virtual {v0}, Lcom/ibotta/android/earnings/TxLedgerData;->isProcessing()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 148
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvOfferEarnings:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->setVisibility(I)V

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v1, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    invoke-virtual {v1}, Lcom/ibotta/android/earnings/TxLedgerData;->getOfferEarnings()Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    float-to-double v1, v1

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object v0

    .line 151
    iget-object v1, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvOfferEarnings:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    const v2, 0x7f080258

    const v3, 0x7f1103fb

    invoke-virtual {v1, v2, v3, v0}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->setup(IILjava/lang/String;)V

    goto :goto_1

    .line 146
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvOfferEarnings:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->setVisibility(I)V

    :goto_1
    return-void
.end method

.method private initOffersMatched()V
    .locals 4

    .line 134
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    invoke-virtual {v0}, Lcom/ibotta/android/earnings/TxLedgerData;->getOfferMatches()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    invoke-virtual {v0}, Lcom/ibotta/android/earnings/TxLedgerData;->isProcessing()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 137
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvOffersMatched:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->setVisibility(I)V

    .line 139
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvOffersMatched:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    const v1, 0x7f08027f

    const v2, 0x7f1103fc

    iget-object v3, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    .line 140
    invoke-virtual {v3}, Lcom/ibotta/android/earnings/TxLedgerData;->getOfferMatches()Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 139
    invoke-virtual {v0, v1, v2, v3}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->setup(IILjava/lang/String;)V

    goto :goto_1

    .line 135
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvOffersMatched:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->setVisibility(I)V

    :goto_1
    return-void
.end method

.method private initOtherRewards()V
    .locals 2

    .line 201
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    invoke-virtual {v0}, Lcom/ibotta/android/earnings/TxLedgerData;->getAlternateText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 202
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->llOtherRewards:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 204
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->llOtherRewards:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 206
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tvOtherRewardsValue:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    invoke-virtual {v1}, Lcom/ibotta/android/earnings/TxLedgerData;->getAlternateText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method private initPendingEarnings()V
    .locals 6

    .line 176
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    invoke-virtual {v0}, Lcom/ibotta/android/earnings/TxLedgerData;->isProcessing()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const v1, 0x7f06010d

    const v2, 0x7f1103f8

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    .line 177
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvPendingEarnings:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    invoke-virtual {v0, v3}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->setVisibility(I)V

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvPendingEarnings:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    .line 179
    invoke-virtual {p0}, Lcom/ibotta/android/view/earnings/TxLedgerView;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f1101d7

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 178
    invoke-virtual {v0, v3, v2, v4}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->setup(IILjava/lang/String;)V

    .line 180
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvPendingEarnings:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    invoke-virtual {p0}, Lcom/ibotta/android/view/earnings/TxLedgerView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->setTextColor(I)V

    goto :goto_2

    .line 181
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    invoke-virtual {v0}, Lcom/ibotta/android/earnings/TxLedgerData;->getTotalPendingEarnings()Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    .line 182
    invoke-virtual {v0}, Lcom/ibotta/android/earnings/TxLedgerData;->getTxState()Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    move-result-object v0

    sget-object v4, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->COMPLETE:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    if-eq v0, v4, :cond_3

    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    .line 183
    invoke-virtual {v0}, Lcom/ibotta/android/earnings/TxLedgerData;->getTxState()Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    move-result-object v0

    sget-object v4, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->CANCELED:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    if-ne v0, v4, :cond_1

    goto :goto_1

    .line 186
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvPendingEarnings:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    invoke-virtual {v0, v3}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->setVisibility(I)V

    .line 187
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v4, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    invoke-virtual {v4}, Lcom/ibotta/android/earnings/TxLedgerData;->getTotalPendingEarnings()Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    float-to-double v4, v4

    invoke-interface {v0, v4, v5}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object v0

    .line 190
    iget-object v4, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    invoke-virtual {v4}, Lcom/ibotta/android/earnings/TxLedgerData;->getTotalEarnings()Ljava/lang/Float;

    move-result-object v4

    if-nez v4, :cond_2

    .line 191
    iget-object v2, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvPendingEarnings:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    const v4, 0x7f1103fe

    invoke-virtual {v2, v3, v4, v0}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->setup(IILjava/lang/String;)V

    goto :goto_0

    .line 193
    :cond_2
    iget-object v4, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvPendingEarnings:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    invoke-virtual {v4, v3, v2, v0}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->setup(IILjava/lang/String;)V

    .line 196
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvPendingEarnings:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    invoke-virtual {p0}, Lcom/ibotta/android/view/earnings/TxLedgerView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->setTextColor(I)V

    goto :goto_2

    .line 184
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvPendingEarnings:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->setVisibility(I)V

    :goto_2
    return-void
.end method

.method private initPendingPeriod()V
    .locals 4

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    invoke-virtual {v0}, Lcom/ibotta/android/earnings/TxLedgerData;->getPendingPeriod()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 124
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvPendingPeriod:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->setVisibility(I)V

    goto :goto_0

    .line 126
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvPendingPeriod:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->setVisibility(I)V

    .line 128
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvPendingPeriod:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    const v1, 0x7f080280

    const v2, 0x7f1103f9

    iget-object v3, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    .line 129
    invoke-virtual {v3}, Lcom/ibotta/android/earnings/TxLedgerData;->getPendingPeriod()Ljava/lang/String;

    move-result-object v3

    .line 128
    invoke-virtual {v0, v1, v2, v3}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->setup(IILjava/lang/String;)V

    :goto_0
    return-void
.end method

.method private initPurchaseDate()V
    .locals 4

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    invoke-virtual {v0}, Lcom/ibotta/android/earnings/TxLedgerData;->getPurchaseTime()Ljava/util/Date;

    move-result-object v0

    const v1, 0x7f080271

    const/4 v2, 0x0

    if-nez v0, :cond_1

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    invoke-virtual {v0}, Lcom/ibotta/android/earnings/TxLedgerData;->getSubmissionTime()Ljava/util/Date;

    move-result-object v0

    if-nez v0, :cond_0

    .line 107
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvPurchaseDate:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->setVisibility(I)V

    goto :goto_0

    .line 109
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvPurchaseDate:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    invoke-virtual {v0, v2}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->setVisibility(I)V

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v2, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    invoke-virtual {v2}, Lcom/ibotta/android/earnings/TxLedgerData;->getSubmissionTime()Ljava/util/Date;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/ibotta/android/util/Formatting;->date(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    .line 112
    iget-object v2, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvPurchaseDate:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    const v3, 0x7f11064a

    invoke-virtual {v2, v1, v3, v0}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->setup(IILjava/lang/String;)V

    goto :goto_0

    .line 115
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvPurchaseDate:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    invoke-virtual {v0, v2}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->setVisibility(I)V

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v2, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    invoke-virtual {v2}, Lcom/ibotta/android/earnings/TxLedgerData;->getPurchaseTime()Ljava/util/Date;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/ibotta/android/util/Formatting;->date(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    .line 118
    iget-object v2, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvPurchaseDate:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    const v3, 0x7f1103ff

    invoke-virtual {v2, v1, v3, v0}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->setup(IILjava/lang/String;)V

    :goto_0
    return-void
.end method

.method private initTitle()V
    .locals 2

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tvTxTitle:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    invoke-virtual {v1}, Lcom/ibotta/android/earnings/TxLedgerData;->getLedgerTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initTotalEarnings()V
    .locals 4

    .line 156
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    invoke-virtual {v0}, Lcom/ibotta/android/earnings/TxLedgerData;->getTotalEarnings()Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    .line 157
    invoke-virtual {v0}, Lcom/ibotta/android/earnings/TxLedgerData;->getTxState()Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->PENDING:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    if-ne v0, v1, :cond_0

    goto :goto_1

    .line 160
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvTotalEarnings:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->setVisibility(I)V

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v2, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    invoke-virtual {v2}, Lcom/ibotta/android/earnings/TxLedgerData;->getTotalEarnings()Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    float-to-double v2, v2

    invoke-interface {v0, v2, v3}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object v0

    .line 164
    iget-object v2, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvTotalEarnings:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    const v3, 0x7f110401

    invoke-virtual {v2, v1, v3, v0}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->setup(IILjava/lang/String;)V

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    invoke-virtual {v0}, Lcom/ibotta/android/earnings/TxLedgerData;->getTxState()Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->COMPLETE:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    .line 167
    invoke-virtual {v0}, Lcom/ibotta/android/earnings/TxLedgerData;->getTxState()Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->CANCELED:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    if-ne v0, v1, :cond_1

    goto :goto_0

    .line 170
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvTotalEarnings:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    invoke-virtual {p0}, Lcom/ibotta/android/view/earnings/TxLedgerView;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f060022

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->setTextColor(I)V

    goto :goto_2

    .line 168
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvTotalEarnings:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    invoke-virtual {p0}, Lcom/ibotta/android/view/earnings/TxLedgerView;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f060027

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->setTextColor(I)V

    goto :goto_2

    .line 158
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvTotalEarnings:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->setVisibility(I)V

    :goto_2
    return-void
.end method

.method private onSetup()V
    .locals 0

    .line 84
    invoke-direct {p0}, Lcom/ibotta/android/view/earnings/TxLedgerView;->initTitle()V

    .line 85
    invoke-direct {p0}, Lcom/ibotta/android/view/earnings/TxLedgerView;->initLogo()V

    .line 86
    invoke-direct {p0}, Lcom/ibotta/android/view/earnings/TxLedgerView;->initPurchaseDate()V

    .line 87
    invoke-direct {p0}, Lcom/ibotta/android/view/earnings/TxLedgerView;->initPendingPeriod()V

    .line 88
    invoke-direct {p0}, Lcom/ibotta/android/view/earnings/TxLedgerView;->initOffersMatched()V

    .line 89
    invoke-direct {p0}, Lcom/ibotta/android/view/earnings/TxLedgerView;->initOfferEarnings()V

    .line 90
    invoke-direct {p0}, Lcom/ibotta/android/view/earnings/TxLedgerView;->initTotalEarnings()V

    .line 91
    invoke-direct {p0}, Lcom/ibotta/android/view/earnings/TxLedgerView;->initPendingEarnings()V

    .line 92
    invoke-direct {p0}, Lcom/ibotta/android/view/earnings/TxLedgerView;->initOtherRewards()V

    .line 93
    invoke-direct {p0}, Lcom/ibotta/android/view/earnings/TxLedgerView;->initDividers()V

    return-void
.end method


# virtual methods
.method public setup(Lcom/ibotta/android/earnings/TxLedgerData;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/ibotta/android/view/earnings/TxLedgerView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    .line 80
    invoke-direct {p0}, Lcom/ibotta/android/view/earnings/TxLedgerView;->onSetup()V

    return-void
.end method
