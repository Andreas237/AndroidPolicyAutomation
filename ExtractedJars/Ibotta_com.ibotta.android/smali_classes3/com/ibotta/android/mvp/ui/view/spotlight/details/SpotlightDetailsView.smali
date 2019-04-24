.class public Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;
.super Landroid/widget/LinearLayout;
.source "SpotlightDetailsView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView$SpotlightDetailsListener;
    }
.end annotation


# instance fields
.field protected appConfig:Lcom/ibotta/android/state/app/config/AppConfig;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected civBonusIndicator:Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900f4
    .end annotation
.end field

.field protected formatting:Lcom/ibotta/android/util/Formatting;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected hbvCheckProduct:Lcom/ibotta/android/mvp/ui/view/button/HybridButtonView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09021b
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView$SpotlightDetailsListener;

.field protected llBonus:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902ff
    .end annotation
.end field

.field protected llMultipleCombo:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090319
    .end annotation
.end field

.field protected rivIndicator:Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903ca
    .end annotation
.end field

.field protected tvDetails:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090518
    .end annotation
.end field

.field protected tvMultipleCombo:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09054a
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 61
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 62
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 66
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 67
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 71
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 72
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 77
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 78
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->initLayout()V

    return-void
.end method

.method private getHtmlFormattedText(Ljava/lang/String;)Landroid/text/Spanned;
    .locals 2

    const-string v0, "\\r\\n"

    const-string v1, "<br/>"

    .line 175
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 176
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    .line 177
    invoke-static {p1, v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object p1

    return-object p1

    .line 179
    :cond_0
    invoke-static {p1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p1

    return-object p1
.end method

.method private initCombo()V
    .locals 2

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->llMultipleCombo:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->tvMultipleCombo:Landroid/widget/TextView;

    const v1, 0x7f1105ee

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 141
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->injectThis()V

    const/4 v0, 0x1

    .line 143
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->setOrientation(I)V

    .line 144
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c01cd

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 146
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private initMultiple(S)V
    .locals 3

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->llMultipleCombo:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 157
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    aput-object p1, v2, v1

    const p1, 0x7f1105f1

    invoke-virtual {v0, p1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->tvMultipleCombo:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initMultipleRedemptions(S)V
    .locals 4

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->llMultipleCombo:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 163
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->tvMultipleCombo:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    .line 164
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    aput-object p1, v3, v1

    const p1, 0x7f1105f0

    .line 163
    invoke-virtual {v2, p1, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private injectThis()V
    .locals 1

    .line 184
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;)V

    return-void
.end method


# virtual methods
.method protected onCheckProductClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f09021b
        }
    .end annotation

    .line 169
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->listener:Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView$SpotlightDetailsListener;

    if-eqz v0, :cond_0

    .line 170
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView$SpotlightDetailsListener;->onCheckProductClicked()V

    :cond_0
    return-void
.end method

.method public setBadge(Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;)V
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->rivIndicator:Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;->setup(Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;)V

    .line 99
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->isCombo()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 100
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->initCombo()V

    goto :goto_0

    .line 101
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->isMultiples()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 102
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->getMultiplesCount()S

    move-result p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->initMultiple(S)V

    goto :goto_0

    .line 103
    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->isMultipleRedemptions()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 104
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView$BadgeStatus;->getRedemptionMax()S

    move-result p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->initMultipleRedemptions(S)V

    goto :goto_0

    .line 106
    :cond_2
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->llMultipleCombo:Landroid/widget/LinearLayout;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public setCheckProductVisible(Z)V
    .locals 1

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->hbvCheckProduct:Lcom/ibotta/android/mvp/ui/view/button/HybridButtonView;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/button/HybridButtonView;->setVisibility(I)V

    return-void
.end method

.method public setHasBonuses(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 87
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->llBonus:Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 88
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->civBonusIndicator:Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->setVisibility(I)V

    .line 89
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->civBonusIndicator:Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;

    const v0, 0x7f08021f

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->setImage(I)V

    goto :goto_0

    .line 91
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->llBonus:Landroid/widget/LinearLayout;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 92
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->civBonusIndicator:Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView$SpotlightDetailsListener;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->listener:Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView$SpotlightDetailsListener;

    return-void
.end method

.method public setTerms(Ljava/lang/CharSequence;)V
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->tvDetails:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTerms(Ljava/lang/String;)V
    .locals 0

    .line 115
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->getHtmlFormattedText(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->setTerms(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTerms(Ljava/lang/String;Ljava/util/Date;)V
    .locals 4

    .line 119
    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->getHtmlFormattedText(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p1

    invoke-direct {v0, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 121
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {p1, p2}, Lcom/ibotta/android/util/Formatting;->getExpirationAtTime(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    .line 122
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 123
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v1, 0x7f110498

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {p2, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 126
    new-instance p2, Landroid/text/SpannableString;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->getHtmlFormattedText(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p1

    invoke-direct {p2, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 127
    new-instance p1, Landroid/text/style/ForegroundColorSpan;

    .line 128
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f06010d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-direct {p1, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-interface {p2}, Landroid/text/Spannable;->length()I

    move-result v1

    .line 127
    invoke-interface {p2, p1, v3, v1, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 130
    invoke-virtual {v0, p2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 133
    :cond_0
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->setTerms(Ljava/lang/CharSequence;)V

    return-void
.end method
