.class public Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;
.super Landroid/widget/LinearLayout;
.source "OfferSummaryView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView$RebateSummaryListener;
    }
.end annotation


# static fields
.field private static final DEFAULT_MAX_LINES:I = 0x3

.field private static final HERO_MAX_LINES:I = 0x1


# instance fields
.field appConfig:Lcom/ibotta/android/state/app/config/AppConfig;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected bShop:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900a7
    .end annotation
.end field

.field formatting:Lcom/ibotta/android/util/Formatting;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected iibIbottaImageButton:Lcom/ibotta/android/views/base/button/IbottaImageButton;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090246
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView$RebateSummaryListener;

.field protected oatvAmount:Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090385
    .end annotation
.end field

.field offerButtonReducer:Lcom/ibotta/android/button/OfferButtonReducer;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private offerModel:Lcom/ibotta/api/model/OfferModel;

.field private rebateStyle:Lcom/ibotta/android/views/content/ContentStyle;

.field private retailerModel:Lcom/ibotta/api/model/RetailerModel;

.field private shopNow:Z

.field protected tvCaption:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090503
    .end annotation
.end field

.field protected tvDetails:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090518
    .end annotation
.end field

.field protected tvExpiration:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090520
    .end annotation
.end field

.field private unlockButtonVisible:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 76
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 77
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->initLayout(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 81
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 82
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->initLayout(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 86
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 87
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->initLayout(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 92
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 93
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->initLayout(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private applyAttributes(Landroid/util/AttributeSet;)V
    .locals 3

    .line 111
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/R$styleable;->RebateSummary:[I

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 v0, 0x1

    .line 118
    :try_start_0
    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->unlockButtonVisible:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw v0
.end method

.method private initAmount()V
    .locals 4

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    if-nez v0, :cond_0

    return-void

    .line 166
    :cond_0
    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getOldValue()Ljava/lang/String;

    move-result-object v0

    .line 167
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getCurrentValue()Ljava/lang/String;

    move-result-object v1

    .line 169
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 171
    :goto_0
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->oatvAmount:Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;

    invoke-virtual {v3, v2, v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;->initText(ZLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private initCaption()V
    .locals 2

    .line 175
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getCaption()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 176
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->tvCaption:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getCaption()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 177
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->tvCaption:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 179
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->tvCaption:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private initDetails()V
    .locals 3

    .line 184
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->rebateStyle:Lcom/ibotta/android/views/content/ContentStyle;

    if-nez v0, :cond_0

    return-void

    .line 188
    :cond_0
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView$1;->$SwitchMap$com$ibotta$android$views$content$ContentStyle:[I

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->rebateStyle:Lcom/ibotta/android/views/content/ContentStyle;

    invoke-virtual {v1}, Lcom/ibotta/android/views/content/ContentStyle;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x3

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 198
    :pswitch_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->tvDetails:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 199
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->tvDetails:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    goto :goto_0

    .line 194
    :pswitch_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->tvDetails:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 195
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->tvDetails:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    goto :goto_0

    .line 190
    :pswitch_2
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->tvDetails:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->tvDetails:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 203
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->tvDetails:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private initExpiration()V
    .locals 5

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/AppHelper;->isOfferExpiring(Lcom/ibotta/api/model/OfferModel;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->isActivated()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->isExpiringSoon()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 225
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->tvExpiration:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 208
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->tvExpiration:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 209
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->tvExpiration:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v3}, Lcom/ibotta/api/model/OfferModel;->getExpiration()Ljava/util/Date;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/ibotta/android/util/Formatting;->getAppConfigExpiration(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 211
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->isExpiringSoon()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 212
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->getContext()Landroid/content/Context;

    move-result-object v0

    const v2, 0x7f06010d

    invoke-static {v0, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    .line 213
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v2}, Lcom/ibotta/android/state/app/config/AppConfig;->getExpirationDateTextColor()Ljava/lang/String;

    move-result-object v2

    .line 216
    :try_start_0
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-string v3, "Issue parsing color %s, so we are defaulting to 0x%08X"

    const/4 v4, 0x2

    .line 218
    new-array v4, v4, [Ljava/lang/Object;

    aput-object v2, v4, v1

    const/4 v1, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v4, v1

    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 220
    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->tvExpiration:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_2

    .line 222
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->tvExpiration:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f0600ef

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :goto_2
    return-void
.end method

.method private initLayout(Landroid/util/AttributeSet;)V
    .locals 3

    .line 101
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;)V

    .line 103
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 104
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c01a9

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 107
    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->applyAttributes(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private initUnlockButton()V
    .locals 3

    .line 230
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    if-nez v0, :cond_0

    return-void

    .line 234
    :cond_0
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->unlockButtonVisible:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->shopNow:Z

    if-eqz v0, :cond_1

    goto :goto_0

    .line 239
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->iibIbottaImageButton:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->setVisibility(I)V

    .line 240
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->iibIbottaImageButton:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->offerButtonReducer:Lcom/ibotta/android/button/OfferButtonReducer;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/button/OfferButtonReducer;->create(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->updateViewState(Lcom/ibotta/android/views/base/button/IbottaButtonViewState;)V

    .line 241
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->iibIbottaImageButton:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/rebate/-$$Lambda$OfferSummaryView$PMpMgkgs1uSbRCp7uLP0YZ889XQ;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/view/rebate/-$$Lambda$OfferSummaryView$PMpMgkgs1uSbRCp7uLP0YZ889XQ;-><init>(Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->bindViewEvents(Lcom/ibotta/android/views/components/ClickableViewEvent;)V

    return-void

    .line 235
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->iibIbottaImageButton:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->setVisibility(I)V

    return-void
.end method

.method public static synthetic lambda$PMpMgkgs1uSbRCp7uLP0YZ889XQ(Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;)V
    .locals 0

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->onUnlockClicked()V

    return-void
.end method

.method private onUnlockClicked()V
    .locals 3

    .line 267
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->listener:Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView$RebateSummaryListener;

    if-eqz v0, :cond_1

    .line 268
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->isActivated()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 269
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->listener:Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView$RebateSummaryListener;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView$RebateSummaryListener;->onUnlockedClicked(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;)V

    goto :goto_0

    .line 271
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->listener:Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView$RebateSummaryListener;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView$RebateSummaryListener;->onUnlockClicked(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method protected initShopButton()V
    .locals 2

    .line 245
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->unlockButtonVisible:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->shopNow:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 250
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->bShop:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    return-void

    .line 246
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->bShop:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    return-void
.end method

.method protected onSetup()V
    .locals 3

    .line 146
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->removeAllViews()V

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->rebateStyle:Lcom/ibotta/android/views/content/ContentStyle;

    sget-object v1, Lcom/ibotta/android/views/content/ContentStyle;->SMALL:Lcom/ibotta/android/views/content/ContentStyle;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    .line 149
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->setWeightSum(F)V

    .line 150
    invoke-virtual {p0, v2}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->setOrientation(I)V

    .line 151
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c01a9

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    goto :goto_0

    :cond_0
    const/high16 v0, 0x42c80000    # 100.0f

    .line 153
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->setWeightSum(F)V

    const/4 v0, 0x0

    .line 154
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->setOrientation(I)V

    .line 155
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c01aa

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 158
    :goto_0
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method public onShopClicked()V
    .locals 3
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0900a7
        }
    .end annotation

    .line 261
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->listener:Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView$RebateSummaryListener;

    if-eqz v0, :cond_0

    .line 262
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView$RebateSummaryListener;->onShopClicked(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;)V

    :cond_0
    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView$RebateSummaryListener;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->listener:Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView$RebateSummaryListener;

    return-void
.end method

.method public setTextColor(I)V
    .locals 2

    .line 254
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->oatvAmount:Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v1, p1}, Lcom/ibotta/android/util/AppHelper;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;->setTextColor(I)V

    .line 255
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->tvDetails:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v1, p1}, Lcom/ibotta/android/util/AppHelper;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 256
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->tvExpiration:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v1, p1}, Lcom/ibotta/android/util/AppHelper;->getColor(I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public setup(Lcom/ibotta/android/view/model/content/OfferItem;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 142
    invoke-virtual {p1}, Lcom/ibotta/android/view/model/content/OfferItem;->getStyle()Lcom/ibotta/android/views/content/ContentStyle;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/view/model/content/OfferItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/OfferModel;

    invoke-virtual {p0, v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->setup(Lcom/ibotta/android/views/content/ContentStyle;Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public setup(Lcom/ibotta/android/views/content/ContentStyle;Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 0

    .line 126
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->offerModel:Lcom/ibotta/api/model/OfferModel;

    .line 127
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    .line 128
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->rebateStyle:Lcom/ibotta/android/views/content/ContentStyle;

    .line 129
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-interface {p1, p2}, Lcom/ibotta/api/helper/offer/OfferHelper;->isShopNow(Lcom/ibotta/api/model/OfferModel;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->shopNow:Z

    .line 131
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->onSetup()V

    .line 133
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->initAmount()V

    .line 134
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->initDetails()V

    .line 135
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->initCaption()V

    .line 136
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->initExpiration()V

    .line 137
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->initUnlockButton()V

    .line 138
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->initShopButton()V

    return-void
.end method
