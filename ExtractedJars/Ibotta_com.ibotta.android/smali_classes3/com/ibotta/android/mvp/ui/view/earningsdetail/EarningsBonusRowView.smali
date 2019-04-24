.class public Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;
.super Landroid/widget/LinearLayout;
.source "EarningsBonusRowView.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView$EarningsBonusRowListener;
    }
.end annotation


# instance fields
.field bonusHelper:Lcom/ibotta/api/helper/bonus/BonusHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private bonusModel:Lcom/ibotta/api/model/BonusModel;

.field protected bpvBonusProgress:Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900c0
    .end annotation
.end field

.field formatting:Lcom/ibotta/android/util/Formatting;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView$EarningsBonusRowListener;

.field protected llContent:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090303
    .end annotation
.end field

.field private showBottomSpace:Z

.field private showTopDivider:Z

.field protected tvBonusName:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090500
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
    .locals 1

    const/4 v0, 0x0

    .line 55
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 59
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 63
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 67
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 68
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->initLayout()V

    return-void
.end method

.method private getBonusText(Lcom/ibotta/api/helper/bonus/BonusHelper;)Landroid/text/Spannable;
    .locals 7

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    invoke-interface {p1, v0}, Lcom/ibotta/api/helper/bonus/BonusHelper;->isCompleted(Lcom/ibotta/api/model/BonusModel;)Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    .line 141
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {v5}, Lcom/ibotta/android/util/Formatting;->getCurrencyFormat()Ljava/text/Format;

    move-result-object v5

    invoke-interface {p1, v4, v5}, Lcom/ibotta/api/helper/bonus/BonusHelper;->getDisplayAmount(Lcom/ibotta/api/model/BonusModel;Ljava/text/Format;)Ljava/lang/String;

    move-result-object p1

    .line 142
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f11063f

    new-array v6, v3, [Ljava/lang/Object;

    aput-object p1, v6, v2

    invoke-virtual {v4, v5, v6}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 143
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f110640

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v2

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    .line 144
    invoke-interface {v2}, Lcom/ibotta/api/model/BonusModel;->getName()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v3

    .line 143
    invoke-virtual {v4, v5, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 146
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getPercentComplete()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object p1

    .line 147
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f110648

    new-array v6, v3, [Ljava/lang/Object;

    aput-object p1, v6, v2

    invoke-virtual {v4, v5, v6}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 148
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f110649

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v2

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    .line 149
    invoke-interface {v2}, Lcom/ibotta/api/model/BonusModel;->getName()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v3

    .line 148
    invoke-virtual {v4, v5, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 152
    :goto_0
    new-instance v2, Landroid/text/SpannableString;

    invoke-direct {v2, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 153
    invoke-direct {p0, v2, v1, p1, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->styleBonusValueEarned(Landroid/text/Spannable;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 154
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v2, v1, p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->styleBonusName(Landroid/text/Spannable;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method

.method private initBottomSpace()V
    .locals 2

    .line 186
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->showBottomSpace:Z

    if-eqz v0, :cond_0

    .line 187
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->vBottomSpace:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 189
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->vBottomSpace:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 89
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;)V

    const/4 v0, 0x1

    .line 91
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->setOrientation(I)V

    .line 92
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->setClickable(Z)V

    const/4 v1, 0x0

    .line 93
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->setFocusable(Z)V

    .line 95
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->isInEditMode()Z

    move-result v2

    if-nez v2, :cond_0

    .line 96
    invoke-static {p0, v1}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    .line 99
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c0151

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 100
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 102
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->initRowClickHandler()V

    return-void
.end method

.method private initName()V
    .locals 3

    .line 131
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->bonusHelper:Lcom/ibotta/api/helper/bonus/BonusHelper;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->getBonusText(Lcom/ibotta/api/helper/bonus/BonusHelper;)Landroid/text/Spannable;

    move-result-object v0

    .line 132
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->tvBonusName:Landroid/widget/TextView;

    sget-object v2, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    invoke-virtual {v1, v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    return-void
.end method

.method private initProgressImage()V
    .locals 2

    .line 125
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0701c5

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 126
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->bpvBonusProgress:Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->setSize(I)V

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->bpvBonusProgress:Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->setViewModel(Lcom/ibotta/api/model/BonusModel;)V

    return-void
.end method

.method private initRowClickHandler()V
    .locals 2

    .line 106
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/-$$Lambda$EarningsBonusRowView$0DyarhUWS2ykNYad_M5nHQvjdW4;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/-$$Lambda$EarningsBonusRowView$0DyarhUWS2ykNYad_M5nHQvjdW4;-><init>(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;)V

    instance-of v1, p0, Landroid/view/View;

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-static {v1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method private initTopDivider()V
    .locals 2

    .line 117
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->showTopDivider:Z

    if-eqz v0, :cond_0

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->vTopDivider:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 120
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->vTopDivider:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public static synthetic lambda$initRowClickHandler$0(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;Landroid/view/View;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->onBonusRowClicked()V

    return-void
.end method

.method private onBonusRowClicked()V
    .locals 2

    .line 194
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->listener:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView$EarningsBonusRowListener;

    if-eqz v0, :cond_0

    .line 195
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView$EarningsBonusRowListener;->onBonusRowClicked(Lcom/ibotta/api/model/BonusModel;)V

    :cond_0
    return-void
.end method

.method private onSetup()V
    .locals 0

    .line 110
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->initTopDivider()V

    .line 111
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->initProgressImage()V

    .line 112
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->initName()V

    .line 113
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->initBottomSpace()V

    return-void
.end method

.method private styleBonusName(Landroid/text/Spannable;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 178
    invoke-virtual {p2, p3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p2

    .line 179
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p3

    add-int/2addr p3, p2

    .line 181
    new-instance v0, Landroid/text/style/StyleSpan;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/text/style/StyleSpan;-><init>(I)V

    const/16 v1, 0x21

    invoke-interface {p1, v0, p2, p3, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    return-void
.end method

.method private styleBonusValueEarned(Landroid/text/Spannable;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    if-eqz p4, :cond_0

    .line 163
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->getContext()Landroid/content/Context;

    move-result-object p4

    const v0, 0x7f060027

    invoke-static {p4, v0}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p4

    goto :goto_0

    .line 165
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->getContext()Landroid/content/Context;

    move-result-object p4

    const v0, 0x7f06010d

    invoke-static {p4, v0}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p4

    .line 168
    :goto_0
    invoke-virtual {p2, p3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p2

    .line 169
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p3

    add-int/2addr p3, p2

    .line 171
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v0, p4}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/16 p4, 0x21

    invoke-interface {p1, v0, p2, p3, p4}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 173
    new-instance v0, Landroid/text/style/StyleSpan;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-interface {p1, v0, p2, p3, p4}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    return-void
.end method


# virtual methods
.method public setListener(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView$EarningsBonusRowListener;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->listener:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView$EarningsBonusRowListener;

    return-void
.end method

.method public setShowBottomSpace(Z)V
    .locals 0

    .line 76
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->showBottomSpace:Z

    return-void
.end method

.method public setShowTopDivider(Z)V
    .locals 0

    .line 72
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->showTopDivider:Z

    return-void
.end method

.method public setup(Lcom/ibotta/api/model/BonusModel;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    .line 85
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsBonusRowView;->onSetup()V

    return-void
.end method
