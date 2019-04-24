.class public Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;
.super Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;
.source "AddUpcDetail.java"


# instance fields
.field private final apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

.field protected bSeeThisRebate:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900a5
    .end annotation
.end field

.field protected ricvRebateImageCard:Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090386
    .end annotation
.end field

.field private socialOffer:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field protected tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09044e
    .end annotation
.end field

.field private final titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

.field protected tvProductDescription:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09055d
    .end annotation
.end field

.field protected tvProductName:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09055e
    .end annotation
.end field

.field protected tvTitleDescription:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090588
    .end annotation
.end field

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/android/title/TitleBarReducer;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2, p4}, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;-><init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/util/Formatting;)V

    .line 55
    iput-object p3, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 56
    iput-object p5, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    .line 57
    iput-object p6, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    return-void
.end method

.method private onSocialOfferLoaded(Lcom/ibotta/api/model/offer/SocialOffer;)V
    .locals 3

    .line 135
    sget-object v0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail$1;->$SwitchMap$com$ibotta$android$notification$model$NotificationStatus:[I

    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v1}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getStatus()Lcom/ibotta/android/notification/model/NotificationStatus;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/notification/model/NotificationStatus;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const v1, 0x7f110201

    packed-switch v0, :pswitch_data_0

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->tvTitleDescription:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    :pswitch_0
    const v1, 0x7f110449

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->tvTitleDescription:Landroid/widget/TextView;

    const v2, 0x7f110448

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    :pswitch_1
    const v1, 0x7f11044c

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->tvTitleDescription:Landroid/widget/TextView;

    const v2, 0x7f11044b

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    :pswitch_2
    const v1, 0x7f11044f

    .line 138
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->tvTitleDescription:Landroid/widget/TextView;

    const v2, 0x7f11044e

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 153
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    invoke-static {v1}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(I)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->ricvRebateImageCard:Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;

    sget-object v1, Lcom/ibotta/android/views/content/ContentStyle;->HERO:Lcom/ibotta/android/views/content/ContentStyle;

    invoke-virtual {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->setOffer(Lcom/ibotta/android/views/content/ContentStyle;Lcom/ibotta/api/model/OfferModel;)V

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->tvProductName:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/ibotta/api/model/offer/SocialOffer;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->tvProductDescription:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/ibotta/api/model/offer/SocialOffer;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->bSeeThisRebate:Landroid/widget/Button;

    invoke-virtual {p1}, Lcom/ibotta/api/model/offer/SocialOffer;->isViewable()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    :cond_0
    const/16 p1, 0x8

    :goto_1
    invoke-virtual {v0, p1}, Landroid/widget/Button;->setVisibility(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public getActionBarTitle()Ljava/lang/String;
    .locals 2

    .line 69
    sget-object v0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail$1;->$SwitchMap$com$ibotta$android$notification$model$NotificationStatus:[I

    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v1}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getStatus()Lcom/ibotta/android/notification/model/NotificationStatus;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/notification/model/NotificationStatus;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    const v0, 0x7f110201

    goto :goto_0

    :pswitch_0
    const v0, 0x7f11044a

    goto :goto_0

    :pswitch_1
    const v0, 0x7f11044d

    goto :goto_0

    :pswitch_2
    const v0, 0x7f110450

    .line 84
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->context:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v0}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getDisplayId()I

    move-result v0

    .line 110
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->socialOffer:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 111
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v2}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v2

    invoke-interface {v1, v2, v0}, Lcom/ibotta/android/service/api/job/ApiJobFactory;->createSocialOfferByIdJob(II)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->socialOffer:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 114
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 115
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->socialOffer:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c0123

    return v0
.end method

.method protected initView()V
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->v:Landroid/view/View;

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

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->socialOffer:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->isSuccessfullyLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->socialOffer:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/offer/SocialOfferByIdResponse;

    .line 124
    invoke-virtual {v0}, Lcom/ibotta/api/call/offer/SocialOfferByIdResponse;->getSocialOffer()Lcom/ibotta/api/model/offer/SocialOffer;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->onSocialOfferLoaded(Lcom/ibotta/api/model/offer/SocialOffer;)V

    :cond_0
    return-void
.end method

.method protected onSeeThisRebate()V
    .locals 5
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0900a5
        }
    .end annotation

    .line 165
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->context:Landroid/content/Context;

    new-instance v1, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;

    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->context:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x1

    new-array v2, v2, [I

    iget-object v3, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    .line 166
    invoke-virtual {v3}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getDisplayId()I

    move-result v3

    const/4 v4, 0x0

    aput v3, v2, v4

    invoke-virtual {v1, v2}, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->offerIds([I)Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;

    move-result-object v1

    .line 167
    invoke-virtual {v1}, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->create()Landroid/content/Intent;

    move-result-object v1

    .line 165
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
