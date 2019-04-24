.class public Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;
.super Landroid/widget/LinearLayout;
.source "BonusView.java"


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

.field protected tvAmount:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0904ee
    .end annotation
.end field

.field protected tvName:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09054d
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

    .line 44
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

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

    .line 48
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Landroid/support/annotation/AttrRes;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 52
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Landroid/support/annotation/AttrRes;
        .end annotation
    .end param
    .param p4    # I
        .annotation build Landroid/support/annotation/StyleRes;
        .end annotation
    .end param

    .line 60
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 61
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->initLayout()V

    return-void
.end method

.method private initAmount()V
    .locals 3

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/BonusModel;->isLocked()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->tvAmount:Landroid/widget/TextView;

    const v1, 0x7f1101a8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->tvAmount:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f06010d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_1

    .line 121
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->bonusHelper:Lcom/ibotta/api/helper/bonus/BonusHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {v2}, Lcom/ibotta/android/util/Formatting;->getCurrencyFormat()Ljava/text/Format;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/helper/bonus/BonusHelper;->getAmountString(Lcom/ibotta/api/model/BonusModel;Ljava/text/Format;)Ljava/lang/String;

    move-result-object v0

    .line 122
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->tvAmount:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 123
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->tvAmount:Landroid/widget/TextView;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x8

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_1
    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 90
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;)V

    const/4 v0, 0x1

    .line 92
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->setClickable(Z)V

    .line 93
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->setFocusable(Z)V

    .line 94
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->setOrientation(I)V

    .line 96
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->isInEditMode()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 97
    invoke-static {p0, v1}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    .line 100
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c0136

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 101
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private initName()V
    .locals 2

    .line 128
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->tvName:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/BonusModel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initProgress()V
    .locals 2

    .line 111
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0701d6

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 112
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->bpvBonusProgress:Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->setSize(I)V

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->bpvBonusProgress:Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->setViewModel(Lcom/ibotta/api/model/BonusModel;)V

    return-void
.end method

.method private onViewModelSet()V
    .locals 0

    .line 105
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->initProgress()V

    .line 106
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->initAmount()V

    .line 107
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->initName()V

    return-void
.end method


# virtual methods
.method public setAmountFontSize(F)V
    .locals 2

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->tvAmount:Landroid/widget/TextView;

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p1}, Landroid/widget/TextView;->setTextSize(IF)V

    return-void
.end method

.method public setBonusModel(Lcom/ibotta/api/model/BonusModel;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    .line 66
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->onViewModelSet()V

    return-void
.end method

.method public setProgressBackgroundColor(I)V
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->bpvBonusProgress:Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->setProgressBackgroundColor(I)V

    return-void
.end method

.method public setSize(I)V
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->bpvBonusProgress:Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->setSize(I)V

    return-void
.end method

.method public toggleNameVisibility(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 83
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->tvName:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 85
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusView;->tvName:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method
