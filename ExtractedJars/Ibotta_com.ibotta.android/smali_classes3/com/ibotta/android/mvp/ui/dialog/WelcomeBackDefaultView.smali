.class public Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;
.super Landroid/support/constraint/ConstraintLayout;
.source "WelcomeBackDefaultView.java"


# instance fields
.field protected imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ivRetailerLogo:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902b4
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

.field protected tvDescription:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090515
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

    .line 37
    invoke-direct {p0, p1}, Landroid/support/constraint/ConstraintLayout;-><init>(Landroid/content/Context;)V

    .line 38
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1, p2}, Landroid/support/constraint/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 43
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 47
    invoke-direct {p0, p1, p2, p3}, Landroid/support/constraint/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 48
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;->initLayout()V

    return-void
.end method

.method private initDescription(Ljava/lang/String;)V
    .locals 3

    .line 76
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const p1, 0x7f11028a

    invoke-virtual {v0, p1, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;->tvDescription:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 52
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    .line 53
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;)V

    .line 56
    :cond_0
    new-instance v0, Landroid/support/constraint/ConstraintLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/support/constraint/ConstraintLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 58
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c01f9

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 59
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 61
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;->onSetup()V

    return-void
.end method

.method private initLogo(Ljava/lang/String;)V
    .locals 4

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;->ivRetailerLogo:Landroid/widget/ImageView;

    sget-object v3, Lcom/ibotta/android/views/images/Sizes;->RETAILER_LOGO:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v0, v1, p1, v2, v3}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    return-void
.end method

.method private onSetup()V
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;->storage:Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    if-eqz v0, :cond_0

    .line 66
    invoke-virtual {v0}, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->getRetailerName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;->initDescription(Ljava/lang/String;)V

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;->storage:Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    invoke-virtual {v0}, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->getRetailerIconUrl()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;->initLogo(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
