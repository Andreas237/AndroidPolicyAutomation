.class public Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;
.super Landroid/widget/FrameLayout;
.source "PendingReceiptsView.java"


# instance fields
.field private customer:Lcom/ibotta/api/model/customer/Customer;

.field formatting:Lcom/ibotta/android/util/Formatting;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected tvPendingEarnings:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09055a
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

    .line 39
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

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

    .line 43
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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

    .line 47
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

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

    .line 55
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 56
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 65
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;)V

    const/4 v0, 0x1

    .line 67
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;->setClickable(Z)V

    const/4 v1, 0x0

    .line 68
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;->setFocusable(Z)V

    const v2, 0x7f06010d

    .line 69
    invoke-virtual {p0, v2}, Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;->setBackgroundResource(I)V

    .line 71
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;->isInEditMode()Z

    move-result v2

    if-nez v2, :cond_0

    .line 72
    invoke-static {p0, v1}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableForegroundRipple(Landroid/view/View;Z)V

    .line 75
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c018d

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 76
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private initPendingAmount()V
    .locals 4

    const/4 v0, 0x0

    .line 95
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;->setVisibility(I)V

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;->tvPendingEarnings:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v2}, Lcom/ibotta/api/model/customer/Customer;->getTotalAmountPending()F

    move-result v2

    float-to-double v2, v2

    invoke-interface {v1, v2, v3}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initProcessing()V
    .locals 3

    const/4 v0, 0x0

    .line 90
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;->setVisibility(I)V

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;->tvPendingEarnings:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f1101d7

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private onCustomerSet()V
    .locals 2

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v0}, Lcom/ibotta/api/model/customer/Customer;->getProcessingReceiptCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 81
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;->initProcessing()V

    goto :goto_0

    .line 82
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v0}, Lcom/ibotta/api/model/customer/Customer;->getTotalAmountPending()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 83
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;->initPendingAmount()V

    goto :goto_0

    :cond_1
    const/16 v0, 0x8

    .line 85
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;->setVisibility(I)V

    :goto_0
    return-void
.end method


# virtual methods
.method public setCustomer(Lcom/ibotta/api/model/customer/Customer;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;->customer:Lcom/ibotta/api/model/customer/Customer;

    .line 61
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;->onCustomerSet()V

    return-void
.end method
