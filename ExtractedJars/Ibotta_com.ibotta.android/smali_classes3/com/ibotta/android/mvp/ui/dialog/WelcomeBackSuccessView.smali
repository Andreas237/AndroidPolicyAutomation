.class public Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;
.super Landroid/support/constraint/ConstraintLayout;
.source "WelcomeBackSuccessView.java"


# instance fields
.field private buttonTx:Lcom/ibotta/api/model/buttonsdk/ButtonTx;

.field protected imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ivRetailerLogo:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902c2
    .end annotation
.end field

.field protected lavLoading:Lcom/airbnb/lottie/LottieAnimationView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902e8
    .end annotation
.end field

.field protected storage:Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected tvAmount:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0904ee
    .end annotation
.end field

.field protected tvAmountDescription:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0904f1
    .end annotation
.end field

.field protected tvDate:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090512
    .end annotation
.end field

.field protected tvWelcomeBackTitle:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09059b
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Landroid/support/constraint/ConstraintLayout;-><init>(Landroid/content/Context;)V

    .line 46
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1, p2}, Landroid/support/constraint/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 51
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 55
    invoke-direct {p0, p1, p2, p3}, Landroid/support/constraint/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 56
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->initLayout()V

    return-void
.end method

.method private initAmount(Ljava/lang/String;)V
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->tvAmount:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initAmountDescription(Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;)V
    .locals 1

    .line 107
    sget-object v0, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->COMPLETE:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    if-ne p1, v0, :cond_0

    .line 108
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->tvAmountDescription:Landroid/widget/TextView;

    const v0, 0x7f110281

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 110
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->tvAmountDescription:Landroid/widget/TextView;

    const v0, 0x7f110280

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    :goto_0
    return-void
.end method

.method private initDate(Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;Ljava/lang/String;)V
    .locals 1

    .line 115
    sget-object v0, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->COMPLETE:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    if-ne p1, v0, :cond_0

    .line 116
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->tvDate:Landroid/widget/TextView;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 118
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->tvDate:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 119
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->tvDate:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 60
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    .line 61
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;)V

    .line 64
    :cond_0
    new-instance v0, Landroid/support/constraint/ConstraintLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/support/constraint/ConstraintLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 66
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c01f8

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 67
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private initLogo(Ljava/lang/String;)V
    .locals 4

    .line 99
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->ivRetailerLogo:Landroid/widget/ImageView;

    sget-object v3, Lcom/ibotta/android/views/images/Sizes;->RETAILER_LOGO:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v0, v1, p1, v2, v3}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    return-void
.end method

.method private initWelcomeBackTitle(Ljava/lang/String;)V
    .locals 3

    .line 94
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f110287

    invoke-virtual {v0, p1, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->tvWelcomeBackTitle:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private onSetup()V
    .locals 2

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->storage:Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    if-eqz v0, :cond_0

    .line 84
    invoke-virtual {v0}, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->getRetailerName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->initWelcomeBackTitle(Ljava/lang/String;)V

    .line 85
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->storage:Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    invoke-virtual {v0}, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->getRetailerIconUrl()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->initLogo(Ljava/lang/String;)V

    .line 88
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->buttonTx:Lcom/ibotta/api/model/buttonsdk/ButtonTx;

    invoke-virtual {v0}, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->getEstimatedEarningsString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->initAmount(Ljava/lang/String;)V

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->buttonTx:Lcom/ibotta/api/model/buttonsdk/ButtonTx;

    invoke-virtual {v0}, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->getStatusEnum()Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->initAmountDescription(Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;)V

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->buttonTx:Lcom/ibotta/api/model/buttonsdk/ButtonTx;

    invoke-virtual {v0}, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->getStatusEnum()Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->buttonTx:Lcom/ibotta/api/model/buttonsdk/ButtonTx;

    invoke-virtual {v1}, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->getCreditPendingDays()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->initDate(Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public setup(Lcom/ibotta/api/model/buttonsdk/ButtonTx;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 72
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->buttonTx:Lcom/ibotta/api/model/buttonsdk/ButtonTx;

    goto :goto_0

    :cond_0
    const-string p1, "No recent Button transaction found."

    const/4 v0, 0x0

    .line 74
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    new-instance p1, Lcom/ibotta/api/model/buttonsdk/ButtonTx;

    invoke-direct {p1}, Lcom/ibotta/api/model/buttonsdk/ButtonTx;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->buttonTx:Lcom/ibotta/api/model/buttonsdk/ButtonTx;

    .line 76
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->buttonTx:Lcom/ibotta/api/model/buttonsdk/ButtonTx;

    sget-object v0, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->UNKNOWN:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    invoke-virtual {v0}, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->setStatus(Ljava/lang/String;)V

    .line 79
    :goto_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->onSetup()V

    return-void
.end method
