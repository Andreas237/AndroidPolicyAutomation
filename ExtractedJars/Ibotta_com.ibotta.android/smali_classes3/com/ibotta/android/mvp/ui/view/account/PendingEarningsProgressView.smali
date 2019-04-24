.class public Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;
.super Landroid/widget/LinearLayout;
.source "PendingEarningsProgressView.java"


# instance fields
.field formatting:Lcom/ibotta/android/util/Formatting;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field handler:Landroid/os/Handler;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ivBottomArrow:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09029a
    .end annotation
.end field

.field protected llProgressPointerContainer:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090322
    .end annotation
.end field

.field protected pbPendingEarnings:Landroid/widget/ProgressBar;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090398
    .end annotation
.end field

.field protected tvAmountEarned:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0904f2
    .end annotation
.end field

.field protected tvPendingEarningsText:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09055b
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 37
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 41
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 45
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 49
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 50
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->initLayout(Landroid/content/Context;)V

    return-void
.end method

.method private getPendingEarningsProgressViewParams()Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressViewParams;
    .locals 2

    .line 163
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressViewParams;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressViewParams;-><init>()V

    .line 164
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->getProgressBarStartMarginParam()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressViewParams;->setProgressBarStartMargin(I)V

    .line 165
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->getProgressBarEndMarginParam()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressViewParams;->setProgressBarEndMargin(I)V

    .line 166
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressViewParams;->setDeviceWidth(I)V

    .line 167
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->ivBottomArrow:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getWidth()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressViewParams;->setBottomArrowWidth(I)V

    .line 168
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->llProgressPointerContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressViewParams;->setProgressPointerContainerWidth(I)V

    .line 170
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->getPendingEarningsTextViewEndMarginParam()I

    move-result v1

    .line 169
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressViewParams;->setPendingEarningsTextViewEndMargin(I)V

    return-object v0
.end method

.method private getPendingEarningsTextViewEndMarginParam()I
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->tvPendingEarningsText:Landroid/widget/TextView;

    .line 129
    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 131
    invoke-virtual {v0}, Landroid/widget/LinearLayout$LayoutParams;->getMarginEnd()I

    move-result v0

    return v0
.end method

.method private getProgressBarEndMarginParam()I
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->pbPendingEarnings:Landroid/widget/ProgressBar;

    .line 153
    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 155
    invoke-virtual {v0}, Landroid/widget/LinearLayout$LayoutParams;->getMarginEnd()I

    move-result v0

    return v0
.end method

.method private getProgressBarStartMarginParam()I
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->pbPendingEarnings:Landroid/widget/ProgressBar;

    .line 141
    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 143
    invoke-virtual {v0}, Landroid/widget/LinearLayout$LayoutParams;->getMarginStart()I

    move-result v0

    return v0
.end method

.method public static synthetic lambda$setProgress$0(Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;FFF)V
    .locals 0

    .line 90
    invoke-virtual {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->calculateProgression(FFF)V

    return-void
.end method


# virtual methods
.method public calculateProgression(FFF)V
    .locals 3

    .line 101
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressCalculator;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressCalculator;-><init>()V

    .line 102
    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressCalculator;->setAmounts(FF)V

    float-to-int p1, p3

    .line 104
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressCalculator;->calculateAmountToEarn(I)I

    move-result p1

    .line 105
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v1, 0x7f110154

    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 107
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->getPendingEarningsProgressViewParams()Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressViewParams;

    move-result-object p3

    invoke-virtual {v0, p1, p3}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressCalculator;->calculateXValue(ILcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressViewParams;)F

    move-result p3

    .line 109
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->ivBottomArrow:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 110
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressCalculator;->getBottomArrowGravity()I

    move-result v2

    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 112
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->pbPendingEarnings:Landroid/widget/ProgressBar;

    invoke-virtual {v2, p1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 113
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->tvAmountEarned:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 114
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->pbPendingEarnings:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressCalculator;->getProgress()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 115
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->pbPendingEarnings:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressCalculator;->getSecondaryProgress()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/ProgressBar;->setSecondaryProgress(I)V

    .line 116
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->ivBottomArrow:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 117
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->llProgressPointerContainer:Landroid/widget/LinearLayout;

    invoke-virtual {p1, p3}, Landroid/widget/LinearLayout;->setTranslationX(F)V

    .line 118
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->llProgressPointerContainer:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->bringToFront()V

    .line 119
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->llProgressPointerContainer:Landroid/widget/LinearLayout;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method public initLayout(Landroid/content/Context;)V
    .locals 2

    .line 59
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;)V

    .line 61
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0c018b

    const/4 v1, 0x1

    invoke-virtual {p1, v0, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 62
    invoke-static {p0, p0}, Lbutterknife/ButterKnife;->bind(Ljava/lang/Object;Landroid/view/View;)Lbutterknife/Unbinder;

    const/4 p1, 0x0

    .line 63
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->setFocusable(Z)V

    return-void
.end method

.method public setProgress(FFF)V
    .locals 2

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/account/-$$Lambda$PendingEarningsProgressView$WWAqwnneCgLZMlZKtes0qqC_JPo;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/view/account/-$$Lambda$PendingEarningsProgressView$WWAqwnneCgLZMlZKtes0qqC_JPo;-><init>(Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;FFF)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public setText(F)V
    .locals 5

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->formatting:Lcom/ibotta/android/util/Formatting;

    float-to-double v1, p1

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 76
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f110154

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "0"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 78
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->tvPendingEarningsText:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->tvPendingEarningsText:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f11002b

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method
