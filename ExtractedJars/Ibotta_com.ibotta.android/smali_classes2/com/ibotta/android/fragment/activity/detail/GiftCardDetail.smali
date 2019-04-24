.class public Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;
.super Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;
.source "GiftCardDetail.java"


# instance fields
.field private final apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

.field private custById:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private custGiftCardById:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field private final imageCache:Lcom/ibotta/android/images/ImageCache;

.field protected llGiftCard:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09030c
    .end annotation
.end field

.field private resendGiftCardEmail:Z

.field protected tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09044e
    .end annotation
.end field

.field private final titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

.field protected tvDescription:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090515
    .end annotation
.end field

.field protected tvTransactionAmount:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09058d
    .end annotation
.end field

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/images/ImageCache;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/android/title/TitleBarReducer;)V
    .locals 0

    .line 61
    invoke-direct {p0, p1, p2, p4}, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;-><init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/util/Formatting;)V

    .line 62
    iput-object p3, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 63
    iput-object p4, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 64
    iput-object p5, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->imageCache:Lcom/ibotta/android/images/ImageCache;

    .line 65
    iput-object p6, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    .line 66
    iput-object p7, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    return-void
.end method

.method private onDataLoaded(Lcom/ibotta/api/model/customer/Customer;Lcom/ibotta/api/model/customer/CustomerGiftCard;)V
    .locals 10

    .line 140
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->llGiftCard:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 142
    invoke-virtual {p2}, Lcom/ibotta/api/model/customer/CustomerGiftCard;->getGiftCard()Lcom/ibotta/api/model/card/GiftCard;

    move-result-object v0

    .line 143
    invoke-virtual {v0}, Lcom/ibotta/api/model/card/GiftCard;->getName()Ljava/lang/String;

    move-result-object v2

    .line 144
    iget-object v3, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-virtual {p2}, Lcom/ibotta/api/model/customer/CustomerGiftCard;->getInitialBalance()D

    move-result-wide v4

    invoke-interface {v3, v4, v5}, Lcom/ibotta/android/util/Formatting;->currencyNoDollarSign(D)Ljava/lang/String;

    move-result-object v3

    .line 146
    iget-object v4, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->tvTransactionAmount:Landroid/widget/TextView;

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 149
    invoke-virtual {v0}, Lcom/ibotta/api/model/card/GiftCard;->getLongName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-nez v4, :cond_0

    .line 150
    invoke-virtual {v0}, Lcom/ibotta/api/model/card/GiftCard;->getLongName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 152
    :cond_0
    iget-object v4, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->context:Landroid/content/Context;

    const v7, 0x7f110463

    new-array v8, v5, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/ibotta/api/model/card/GiftCard;->getName()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v8, v6

    invoke-virtual {v4, v7, v8}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 155
    :goto_0
    iget-object v4, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    iget-object v7, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    invoke-static {v0}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(Ljava/lang/String;)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v0}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getStatus()Lcom/ibotta/android/notification/model/NotificationStatus;

    move-result-object v0

    sget-object v4, Lcom/ibotta/android/notification/model/NotificationStatus;->PENDING:Lcom/ibotta/android/notification/model/NotificationStatus;

    const/4 v7, 0x2

    const/4 v8, 0x3

    const v9, 0x7f110464

    if-ne v0, v4, :cond_1

    .line 158
    iget-object p1, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->context:Landroid/content/Context;

    const p2, 0x7f110465

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 159
    iget-object p2, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {p2, v2, v6}, Lcom/ibotta/android/util/Formatting;->prefixAorAn(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p2

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->context:Landroid/content/Context;

    new-array v1, v8, [Ljava/lang/Object;

    aput-object p2, v1, v6

    aput-object v3, v1, v5

    aput-object p1, v1, v7

    invoke-virtual {v0, v9, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 162
    iget-object p2, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->tvDescription:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    .line 163
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v0}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getStatus()Lcom/ibotta/android/notification/model/NotificationStatus;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v0}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getStatus()Lcom/ibotta/android/notification/model/NotificationStatus;

    move-result-object v0

    sget-object v4, Lcom/ibotta/android/notification/model/NotificationStatus;->ERROR:Lcom/ibotta/android/notification/model/NotificationStatus;

    if-ne v0, v4, :cond_2

    goto :goto_1

    .line 170
    :cond_2
    iput-boolean v5, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->resendGiftCardEmail:Z

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->llGiftCard:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 172
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->tvDescription:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 174
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->v:Landroid/view/View;

    const v1, 0x7f090538

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 176
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->context:Landroid/content/Context;

    const v2, 0x7f110461

    new-array v3, v5, [Ljava/lang/Object;

    .line 177
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getEmail()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v3, v6

    .line 176
    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 179
    iget-object p1, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->v:Landroid/view/View;

    const v0, 0x7f0902aa

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    .line 180
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->imageCache:Lcom/ibotta/android/images/ImageCache;

    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->context:Landroid/content/Context;

    invoke-virtual {p2}, Lcom/ibotta/api/model/customer/CustomerGiftCard;->getTemplate()Lcom/ibotta/api/model/card/GiftCard$Template;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ibotta/api/model/card/GiftCard$Template;->getFrontUrl()Ljava/lang/String;

    move-result-object p2

    sget-object v2, Lcom/ibotta/android/views/images/Sizes;->CARD_LARGE:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v0, v1, p2, p1, v2}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    goto :goto_2

    .line 164
    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->context:Landroid/content/Context;

    const p2, 0x7f110462

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 165
    iget-object p2, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {p2, v2, v6}, Lcom/ibotta/android/util/Formatting;->prefixAorAn(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p2

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->context:Landroid/content/Context;

    new-array v1, v8, [Ljava/lang/Object;

    aput-object p2, v1, v6

    aput-object v3, v1, v5

    aput-object p1, v1, v7

    invoke-virtual {v0, v9, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 168
    iget-object p2, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->tvDescription:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_2
    return-void
.end method


# virtual methods
.method public getActionBarTitle()Ljava/lang/String;
    .locals 2

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->context:Landroid/content/Context;

    const v1, 0x7f110466

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

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->custById:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v0, :cond_0

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/service/api/job/ApiJobFactory;->createCustomerByIdJob(I)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->custById:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 79
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->custGiftCardById:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v0, :cond_1

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 81
    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v2}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getDisplayId()I

    move-result v2

    .line 80
    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/service/api/job/ApiJobFactory;->createCustomerGiftCardByIdJob(II)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->custGiftCardById:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 84
    :cond_1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 85
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->custById:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 86
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->custGiftCardById:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c0129

    return v0
.end method

.method protected initView()V
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->v:Landroid/view/View;

    invoke-static {p0, v0}, Lbutterknife/ButterKnife;->bind(Ljava/lang/Object;Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method public isCustomContainer()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isReportIssue()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isResendGiftCardEmail()Z
    .locals 1

    .line 111
    iget-boolean v0, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->resendGiftCardEmail:Z

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
    .locals 2

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->custById:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->isSuccessfullyLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->custGiftCardById:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->isSuccessfullyLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->custById:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/customer/CustomerByIdResponse;

    .line 95
    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerByIdResponse;->getCustomer()Lcom/ibotta/api/model/customer/Customer;

    move-result-object v0

    .line 97
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->custGiftCardById:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 98
    invoke-virtual {v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardByIdResponse;

    .line 99
    invoke-virtual {v1}, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardByIdResponse;->getCustomerGiftCard()Lcom/ibotta/api/model/customer/CustomerGiftCard;

    move-result-object v1

    .line 100
    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;->onDataLoaded(Lcom/ibotta/api/model/customer/Customer;Lcom/ibotta/api/model/customer/CustomerGiftCard;)V

    :cond_0
    return-void
.end method
