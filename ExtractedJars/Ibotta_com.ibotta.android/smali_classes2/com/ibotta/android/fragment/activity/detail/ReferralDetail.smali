.class public Lcom/ibotta/android/fragment/activity/detail/ReferralDetail;
.super Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;
.source "ReferralDetail.java"


# instance fields
.field private final apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

.field private customer:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field private tvReferralEmail:Landroid/widget/TextView;

.field private tvTransactionAmount:Landroid/widget/TextView;

.field private tvTransactionVerb:Landroid/widget/TextView;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/service/api/job/ApiJobFactory;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1, p2, p4}, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;-><init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/util/Formatting;)V

    .line 37
    iput-object p3, p0, Lcom/ibotta/android/fragment/activity/detail/ReferralDetail;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 38
    iput-object p4, p0, Lcom/ibotta/android/fragment/activity/detail/ReferralDetail;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 39
    iput-object p5, p0, Lcom/ibotta/android/fragment/activity/detail/ReferralDetail;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    return-void
.end method

.method private onCustomerLoaded(Lcom/ibotta/api/model/customer/Customer;)V
    .locals 6

    .line 95
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getFirstName()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    .line 97
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getLastName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    .line 98
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getLastName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v3}, Ljava/lang/String;->indexOf(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 100
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReferralDetail;->tvTransactionAmount:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/ReferralDetail;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/ReferralDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v2}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getAmountAbsolute()F

    move-result v2

    float-to-double v4, v2

    invoke-interface {v1, v4, v5}, Lcom/ibotta/android/util/Formatting;->currencyNoDollarSign(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReferralDetail;->tvTransactionVerb:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/ReferralDetail;->context:Landroid/content/Context;

    const v2, 0x7f11047e

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    aput-object p1, v5, v3

    invoke-virtual {v1, v2, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 105
    iget-object p1, p0, Lcom/ibotta/android/fragment/activity/detail/ReferralDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getMessageData()Ljava/util/HashMap;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 106
    iget-object p1, p0, Lcom/ibotta/android/fragment/activity/detail/ReferralDetail;->tvReferralEmail:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReferralDetail;->context:Landroid/content/Context;

    const v1, 0x7f11047c

    new-array v2, v4, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/ibotta/android/fragment/activity/detail/ReferralDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    .line 107
    invoke-virtual {v4}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getMessageData()Ljava/util/HashMap;

    move-result-object v4

    const-string v5, "email"

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    .line 106
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public getActionBarTitle()Ljava/lang/String;
    .locals 2

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReferralDetail;->context:Landroid/content/Context;

    const v1, 0x7f11047d

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

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReferralDetail;->customer:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v0, :cond_0

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReferralDetail;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/ReferralDetail;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/service/api/job/ApiJobFactory;->createCustomerByIdJob(I)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReferralDetail;->customer:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 57
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 58
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/ReferralDetail;->customer:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getLayout()I
    .locals 2

    .line 44
    invoke-super {p0}, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;->getLayout()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const v0, 0x7f0c012f

    :cond_0
    return v0
.end method

.method protected initView()V
    .locals 2

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReferralDetail;->v:Landroid/view/View;

    const v1, 0x7f09058d

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReferralDetail;->tvTransactionAmount:Landroid/widget/TextView;

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReferralDetail;->v:Landroid/view/View;

    const v1, 0x7f09058f

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReferralDetail;->tvTransactionVerb:Landroid/widget/TextView;

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReferralDetail;->v:Landroid/view/View;

    const v1, 0x7f090569

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReferralDetail;->tvReferralEmail:Landroid/widget/TextView;

    return-void
.end method

.method public isReportIssue()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isVisitSupport()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onApiJobsFinished()V
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReferralDetail;->customer:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->isSuccessfullyLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 66
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReferralDetail;->customer:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/customer/CustomerByIdResponse;

    .line 67
    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerByIdResponse;->getCustomer()Lcom/ibotta/api/model/customer/Customer;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/fragment/activity/detail/ReferralDetail;->onCustomerLoaded(Lcom/ibotta/api/model/customer/Customer;)V

    :cond_0
    return-void
.end method
