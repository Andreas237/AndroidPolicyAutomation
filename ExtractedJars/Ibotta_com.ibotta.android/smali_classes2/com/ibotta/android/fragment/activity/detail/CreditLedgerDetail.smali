.class public Lcom/ibotta/android/fragment/activity/detail/CreditLedgerDetail;
.super Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;
.source "CreditLedgerDetail.java"


# instance fields
.field private final apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

.field private custById:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private tvAmount:Landroid/widget/TextView;

.field private tvTip:Landroid/widget/TextView;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/service/api/job/ApiJobFactory;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2, p4}, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;-><init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/util/Formatting;)V

    .line 34
    iput-object p3, p0, Lcom/ibotta/android/fragment/activity/detail/CreditLedgerDetail;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 35
    iput-object p5, p0, Lcom/ibotta/android/fragment/activity/detail/CreditLedgerDetail;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    return-void
.end method

.method private onCustomerLoaded(Lcom/ibotta/api/model/customer/Customer;)V
    .locals 2

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/CreditLedgerDetail;->tvAmount:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/CreditLedgerDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v1}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getAmount()F

    move-result v1

    float-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/CreditLedgerDetail;->tvTip:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getCreditConversionRatioMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public getActionBarTitle()Ljava/lang/String;
    .locals 2

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/CreditLedgerDetail;->context:Landroid/content/Context;

    const v1, 0x7f11045a

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getApiJobs()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/CreditLedgerDetail;->custById:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v0, :cond_0

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/CreditLedgerDetail;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/CreditLedgerDetail;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/service/api/job/ApiJobFactory;->createCustomerByIdJob(I)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/CreditLedgerDetail;->custById:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 74
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 75
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/CreditLedgerDetail;->custById:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c0126

    return v0
.end method

.method protected initView()V
    .locals 2

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/CreditLedgerDetail;->v:Landroid/view/View;

    const v1, 0x7f0904ee

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/CreditLedgerDetail;->tvAmount:Landroid/widget/TextView;

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/CreditLedgerDetail;->v:Landroid/view/View;

    const v1, 0x7f090586

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/CreditLedgerDetail;->tvTip:Landroid/widget/TextView;

    return-void
.end method

.method public isCustomContainer()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isReportIssue()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected isStatusSelfManaged()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isVisitSupport()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public onApiJobsFinished()V
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/CreditLedgerDetail;->custById:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/customer/CustomerByIdResponse;

    if-eqz v0, :cond_0

    .line 83
    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerByIdResponse;->getCustomer()Lcom/ibotta/api/model/customer/Customer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 84
    :goto_0
    invoke-direct {p0, v0}, Lcom/ibotta/android/fragment/activity/detail/CreditLedgerDetail;->onCustomerLoaded(Lcom/ibotta/api/model/customer/Customer;)V

    return-void
.end method
