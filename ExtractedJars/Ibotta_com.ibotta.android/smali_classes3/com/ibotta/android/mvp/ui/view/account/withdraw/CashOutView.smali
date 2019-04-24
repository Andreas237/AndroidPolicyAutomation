.class public Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;
.super Landroid/widget/LinearLayout;
.source "CashOutView.java"


# static fields
.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field private belowMinimumBalance:Ljava/lang/Boolean;

.field private customerAccount:Lcom/ibotta/api/model/customer/CustomerAccount;

.field formatting:Lcom/ibotta/android/util/Formatting;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ivLogo:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902b4
    .end annotation
.end field

.field private logoDrawableResId:I

.field private minimum:F

.field protected tvAction:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0904e8
    .end annotation
.end field

.field protected tvMinimum:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090549
    .end annotation
.end field

.field protected vDisabledOverlay:Landroid/view/View;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0905b6
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 46
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 50
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 54
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 58
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/4 p1, -0x1

    .line 40
    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->logoDrawableResId:I

    .line 59
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->initLayout()V

    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "CashOutView.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "setAccount"

    const-string v3, "com.ibotta.android.mvp.ui.view.account.withdraw.CashOutView"

    const-string v4, "com.ibotta.api.model.customer.CustomerAccount"

    const-string v5, "customerAccount"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x55

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 63
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;)V

    const/4 v0, 0x1

    .line 65
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->setOrientation(I)V

    .line 66
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->setClickable(Z)V

    const/4 v1, 0x0

    .line 67
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->setFocusable(Z)V

    .line 69
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c013a

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 70
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private initLinkAccount()V
    .locals 2

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->customerAccount:Lcom/ibotta/api/model/customer/CustomerAccount;

    if-nez v0, :cond_0

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->tvAction:Landroid/widget/TextView;

    const v1, 0x7f1101a5

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 117
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/api/model/customer/CustomerAccount;->isServiceEnabled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->tvAction:Landroid/widget/TextView;

    const v1, 0x7f1101f8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 120
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->tvAction:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->customerAccount:Lcom/ibotta/api/model/customer/CustomerAccount;

    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/CustomerAccount;->getAccountNumber()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method private initLogo()V
    .locals 5

    .line 100
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->logoDrawableResId:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 101
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->belowMinimumBalance:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget v2, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->logoDrawableResId:I

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->ivLogo:Landroid/widget/ImageView;

    sget-object v4, Lcom/ibotta/android/views/images/Sizes;->ACCOUNT_LARGE_DISABLED:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;ILandroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    goto :goto_0

    .line 104
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget v2, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->logoDrawableResId:I

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->ivLogo:Landroid/widget/ImageView;

    sget-object v4, Lcom/ibotta/android/views/images/Sizes;->ACCOUNT_LARGE:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;ILandroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    :cond_1
    :goto_0
    return-void
.end method

.method private initMinimum()V
    .locals 5

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->formatting:Lcom/ibotta/android/util/Formatting;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->minimum:F

    float-to-double v1, v1

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/util/Formatting;->currency(D)Ljava/lang/String;

    move-result-object v0

    .line 111
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->tvMinimum:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const v0, 0x7f1100f0

    invoke-virtual {v2, v0, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public setAccount(Lcom/ibotta/api/model/customer/CustomerAccount;)V
    .locals 2
    .annotation runtime Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingBefore;
        value = .enum Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;->CASH_OUT_OPTION_DISABLED:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 85
    invoke-static {}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;->before(Lorg/aspectj/lang/JoinPoint;)V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->customerAccount:Lcom/ibotta/api/model/customer/CustomerAccount;

    .line 86
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->initLinkAccount()V

    return-void
.end method

.method public setBelowMinimumBalance(Z)V
    .locals 1

    .line 90
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->belowMinimumBalance:Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    .line 92
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->vDisabledOverlay:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 94
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->vDisabledOverlay:Landroid/view/View;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 96
    :goto_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->initLogo()V

    return-void
.end method

.method public setLogo(I)V
    .locals 0

    .line 74
    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->logoDrawableResId:I

    .line 75
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->initLogo()V

    return-void
.end method

.method public setMinimum(F)V
    .locals 0

    .line 79
    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->minimum:F

    .line 80
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/CashOutView;->initMinimum()V

    return-void
.end method
