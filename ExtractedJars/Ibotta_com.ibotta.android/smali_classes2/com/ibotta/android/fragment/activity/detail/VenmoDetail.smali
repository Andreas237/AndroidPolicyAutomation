.class public Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;
.super Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;
.source "VenmoDetail.java"


# instance fields
.field private account:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private final apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field private llVenmo:Landroid/widget/LinearLayout;

.field private support:Z

.field private tvTransactionVerb:Landroid/widget/TextView;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/service/api/job/ApiJobFactory;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1, p2, p4}, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;-><init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/util/Formatting;)V

    .line 39
    iput-object p3, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 40
    iput-object p4, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 41
    iput-object p5, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    return-void
.end method

.method private onAccountLoaded(Lcom/ibotta/api/model/customer/CustomerAccount;)V
    .locals 8

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->llVenmo:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->tcvParent:Lcom/ibotta/android/view/common/TextContainerView;

    const v1, 0x7f110480

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/common/TextContainerView;->setHeader(I)V

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v1}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getAmount()F

    move-result v1

    float-to-double v1, v1

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/util/Formatting;->currency(D)Ljava/lang/String;

    move-result-object v0

    if-eqz p1, :cond_0

    .line 111
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/CustomerAccount;->getAccountNumber()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 116
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v1}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getStatus()Lcom/ibotta/android/notification/model/NotificationStatus;

    move-result-object v1

    sget-object v2, Lcom/ibotta/android/notification/model/NotificationStatus;->PENDING:Lcom/ibotta/android/notification/model/NotificationStatus;

    const/4 v3, 0x2

    const/4 v4, 0x3

    const v5, 0x7f110481

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-ne v1, v2, :cond_2

    if-eqz p1, :cond_1

    .line 118
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->context:Landroid/content/Context;

    const v2, 0x7f110482

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 119
    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->context:Landroid/content/Context;

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v0, v4, v6

    aput-object p1, v4, v7

    aput-object v1, v4, v3

    invoke-virtual {v2, v5, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 120
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->tcvParent:Lcom/ibotta/android/view/common/TextContainerView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/common/TextContainerView;->setBody(Ljava/lang/String;)V

    .line 122
    :cond_1
    iput-boolean v7, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->support:Z

    goto :goto_2

    .line 123
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v1}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getStatus()Lcom/ibotta/android/notification/model/NotificationStatus;

    move-result-object v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v1}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getStatus()Lcom/ibotta/android/notification/model/NotificationStatus;

    move-result-object v1

    sget-object v2, Lcom/ibotta/android/notification/model/NotificationStatus;->ERROR:Lcom/ibotta/android/notification/model/NotificationStatus;

    if-ne v1, v2, :cond_3

    goto :goto_1

    .line 131
    :cond_3
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->llVenmo:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->setVisibility(I)V

    if-eqz p1, :cond_4

    .line 133
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->tvTransactionVerb:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 135
    :cond_4
    iput-boolean v6, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->support:Z

    goto :goto_2

    :cond_5
    :goto_1
    if-eqz p1, :cond_6

    .line 125
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->context:Landroid/content/Context;

    const v2, 0x7f11047f

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 126
    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->context:Landroid/content/Context;

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v0, v4, v6

    aput-object p1, v4, v7

    aput-object v1, v4, v3

    invoke-virtual {v2, v5, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->tcvParent:Lcom/ibotta/android/view/common/TextContainerView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/common/TextContainerView;->setBody(Ljava/lang/String;)V

    .line 129
    :cond_6
    iput-boolean v7, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->support:Z

    :goto_2
    return-void
.end method


# virtual methods
.method public getActionBarSubtitle()Ljava/lang/String;
    .locals 2

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->context:Landroid/content/Context;

    const v1, 0x7f110483

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getActionBarTitle()Ljava/lang/String;
    .locals 2

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->context:Landroid/content/Context;

    const v1, 0x7f110484

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getApiJobs()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->account:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v0, :cond_0

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v2}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getDisplayId()I

    move-result v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/service/api/job/ApiJobFactory;->createCustomerAccountByIdJob(II)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->account:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 55
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 56
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->account:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c0130

    return v0
.end method

.method protected initView()V
    .locals 4

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->v:Landroid/view/View;

    const v1, 0x7f090333

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->llVenmo:Landroid/widget/LinearLayout;

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->v:Landroid/view/View;

    const v1, 0x7f09058d

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 98
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->v:Landroid/view/View;

    const v2, 0x7f09058f

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->tvTransactionVerb:Landroid/widget/TextView;

    .line 100
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v2}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getAmountAbsolute()F

    move-result v2

    float-to-double v2, v2

    invoke-interface {v1, v2, v3}, Lcom/ibotta/android/util/Formatting;->currencyNoDollarSign(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public isReportIssue()Z
    .locals 1

    .line 85
    iget-boolean v0, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->support:Z

    return v0
.end method

.method protected isStatusSelfManaged()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isVisitSupport()Z
    .locals 1

    .line 80
    iget-boolean v0, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->support:Z

    return v0
.end method

.method public onApiJobsFinished()V
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->account:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountByIdResponse;

    if-eqz v0, :cond_0

    .line 64
    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountByIdResponse;->getCustomerAccount()Lcom/ibotta/api/model/customer/CustomerAccount;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 65
    :goto_0
    invoke-direct {p0, v0}, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;->onAccountLoaded(Lcom/ibotta/api/model/customer/CustomerAccount;)V

    return-void
.end method
