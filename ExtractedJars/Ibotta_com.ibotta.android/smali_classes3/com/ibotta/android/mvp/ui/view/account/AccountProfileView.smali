.class public Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;
.super Landroid/widget/LinearLayout;
.source "AccountProfileView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView$ProfileImageListener;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView$AccountProfileListener;
    }
.end annotation


# instance fields
.field private customer:Lcom/ibotta/api/model/customer/Customer;

.field protected flWithdrawCashAvailable:Landroid/widget/FrameLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901ff
    .end annotation
.end field

.field formatting:Lcom/ibotta/android/util/Formatting;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView$AccountProfileListener;

.field protected llWithdrawCashUnavailable:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090334
    .end annotation
.end field

.field protected pepvPendingEarningsProgress:Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0905c0
    .end annotation
.end field

.field protected pivProfileImage:Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903a0
    .end annotation
.end field

.field protected prvPendingReceipts:Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903b7
    .end annotation
.end field

.field protected tvAvailableCash:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0904f9
    .end annotation
.end field

.field protected tvLifetimeEarnings:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09053f
    .end annotation
.end field

.field protected tvName:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09054d
    .end annotation
.end field

.field protected tvUnavailableCash:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090593
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 55
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

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
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 67
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 68
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->initLayout()V

    return-void
.end method

.method private initAvailableCash()V
    .locals 5

    .line 131
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/Customer;->getBalance()F

    move-result v1

    float-to-double v1, v1

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/util/Formatting;->currencyPositiveOrZeroLeadingZero(D)Ljava/lang/String;

    move-result-object v0

    .line 132
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->tvAvailableCash:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const v0, 0x7f110033

    invoke-virtual {v2, v0, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 82
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;)V

    const/4 v0, 0x1

    .line 84
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->setOrientation(I)V

    const v1, 0x7f0600fc

    .line 85
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->setBackgroundResource(I)V

    .line 87
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c0121

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 88
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private initLifetimeEarnings()V
    .locals 4

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->tvLifetimeEarnings:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v2}, Lcom/ibotta/api/model/customer/Customer;->getLifetimeEarnings()F

    move-result v2

    float-to-double v2, v2

    invoke-interface {v1, v2, v3}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initName()V
    .locals 2

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->tvName:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/Customer;->getFirstName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initPendingEarningsProgress()V
    .locals 4

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->pepvPendingEarningsProgress:Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/Customer;->getBalance()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->setText(F)V

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->pepvPendingEarningsProgress:Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/Customer;->getBalance()F

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v2}, Lcom/ibotta/api/model/customer/Customer;->getTotalAmountPending()F

    move-result v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v3}, Lcom/ibotta/api/model/customer/Customer;->getMinimumWithdrawalAmountAvailable()F

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->setProgress(FFF)V

    return-void
.end method

.method private initPendingReceipts()V
    .locals 3

    .line 141
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->prvPendingReceipts:Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;->setCustomer(Lcom/ibotta/api/model/customer/Customer;)V

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->prvPendingReceipts:Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/account/-$$Lambda$AccountProfileView$yphJX05jRAU8Yt71BBL0R5DRKY0;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/view/account/-$$Lambda$AccountProfileView$yphJX05jRAU8Yt71BBL0R5DRKY0;-><init>(Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/account/PendingReceiptsView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method private initProfileImage()V
    .locals 2

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->pivProfileImage:Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->setListener(Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView$ProfileImageListener;)V

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->pivProfileImage:Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->setCustomer(Lcom/ibotta/api/model/customer/Customer;)V

    return-void
.end method

.method private initUnavailableCash()V
    .locals 5

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/Customer;->getMinimumWithdrawalAmountAvailable()F

    move-result v1

    float-to-double v1, v1

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/util/Formatting;->currencyNoDecimal(D)Ljava/lang/String;

    move-result-object v0

    .line 137
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->tvUnavailableCash:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const v0, 0x7f110035

    invoke-virtual {v2, v0, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initWithdrawCash()V
    .locals 4

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v0}, Lcom/ibotta/api/model/customer/Customer;->getBalance()F

    move-result v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/Customer;->getMinimumWithdrawalAmountAvailable()F

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x8

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->flWithdrawCashAvailable:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->llWithdrawCashUnavailable:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 120
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->flWithdrawCashAvailable:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v3}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->llWithdrawCashUnavailable:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public static synthetic lambda$initPendingReceipts$0(Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;Landroid/view/View;)V
    .locals 0

    .line 143
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->listener:Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView$AccountProfileListener;

    if-eqz p1, :cond_0

    .line 144
    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView$AccountProfileListener;->onPendingReceiptsClicked()V

    :cond_0
    return-void
.end method

.method private onCustomerSet()V
    .locals 0

    .line 92
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->initProfileImage()V

    .line 93
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->initName()V

    .line 94
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->initLifetimeEarnings()V

    .line 95
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->initWithdrawCash()V

    .line 96
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->initAvailableCash()V

    .line 97
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->initUnavailableCash()V

    .line 98
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->initPendingReceipts()V

    .line 99
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->initPendingEarningsProgress()V

    return-void
.end method


# virtual methods
.method protected onEarningsProgressBarClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0905c0
        }
    .end annotation

    .line 184
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->listener:Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView$AccountProfileListener;

    if-eqz v0, :cond_0

    .line 185
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView$AccountProfileListener;->onEarningsProgressBarClicked()V

    :cond_0
    return-void
.end method

.method public onLinkAccountClicked()V
    .locals 1

    .line 163
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->listener:Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView$AccountProfileListener;

    if-eqz v0, :cond_0

    .line 164
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView$AccountProfileListener;->onLinkAccountClicked()V

    :cond_0
    return-void
.end method

.method public onProfileImageClicked()V
    .locals 1

    .line 170
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->listener:Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView$AccountProfileListener;

    if-eqz v0, :cond_0

    .line 171
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView$AccountProfileListener;->onProfileImageClicked()V

    :cond_0
    return-void
.end method

.method protected onQuestionMarkClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f09008a
        }
    .end annotation

    .line 177
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->listener:Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView$AccountProfileListener;

    if-eqz v0, :cond_0

    .line 178
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView$AccountProfileListener;->onQuestionMarkClicked()V

    :cond_0
    return-void
.end method

.method protected onWithdrawAvailableClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0901ff
        }
    .end annotation

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->listener:Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView$AccountProfileListener;

    if-eqz v0, :cond_0

    .line 152
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView$AccountProfileListener;->onWithdrawCashClicked()V

    :cond_0
    return-void
.end method

.method protected onWithdrawUnavailableClicked()V
    .locals 0
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090334
        }
    .end annotation

    return-void
.end method

.method public setCustomer(Lcom/ibotta/api/model/customer/Customer;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->customer:Lcom/ibotta/api/model/customer/Customer;

    .line 78
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->onCustomerSet()V

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView$AccountProfileListener;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView;->listener:Lcom/ibotta/android/mvp/ui/view/account/AccountProfileView$AccountProfileListener;

    return-void
.end method
