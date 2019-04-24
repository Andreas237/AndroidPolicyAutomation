.class public Lcom/ibotta/android/fragment/activity/detail/LikeDetail;
.super Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;
.source "LikeDetail.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private final apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

.field protected bSeeThisRebate:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900a5
    .end annotation
.end field

.field protected flvLikeFriends:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090200
    .end annotation
.end field

.field protected ricvRebateImageCard:Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090386
    .end annotation
.end field

.field private socialOfferJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private title:Ljava/lang/String;

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

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/service/api/job/ApiJobFactory;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2, p4}, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;-><init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/util/Formatting;)V

    .line 53
    iput-object p3, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 54
    iput-object p5, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    return-void
.end method

.method public static synthetic lambda$updateButtonLabel$0(Lcom/ibotta/android/fragment/activity/detail/LikeDetail;Landroid/view/View;)V
    .locals 4

    .line 152
    iget-object p1, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->context:Landroid/content/Context;

    new-instance v0, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;

    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    new-array v1, v1, [I

    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    .line 153
    invoke-virtual {v2}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getDisplayId()I

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    invoke-virtual {v0, v1}, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->offerIds([I)Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;

    move-result-object v0

    .line 154
    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    .line 152
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private updateButtonLabel(Lcom/ibotta/api/model/offer/SocialOffer;)V
    .locals 2

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->bSeeThisRebate:Landroid/widget/Button;

    invoke-virtual {p1}, Lcom/ibotta/api/model/offer/SocialOffer;->isViewable()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/Button;->setVisibility(I)V

    .line 152
    iget-object p1, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->bSeeThisRebate:Landroid/widget/Button;

    new-instance v0, Lcom/ibotta/android/fragment/activity/detail/-$$Lambda$LikeDetail$lOY8UHXtKWi0x0HufNYXvG2hmcc;

    invoke-direct {v0, p0}, Lcom/ibotta/android/fragment/activity/detail/-$$Lambda$LikeDetail$lOY8UHXtKWi0x0HufNYXvG2hmcc;-><init>(Lcom/ibotta/android/fragment/activity/detail/LikeDetail;)V

    instance-of v1, p1, Landroid/view/View;

    if-nez v1, :cond_1

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 156
    :goto_1
    iget-object p1, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->bSeeThisRebate:Landroid/widget/Button;

    const v0, 0x7f11046c

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setText(I)V

    return-void
.end method

.method private updateProductLabels(Lcom/ibotta/api/model/offer/SocialOffer;)V
    .locals 2

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->tvProductName:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/ibotta/api/model/offer/SocialOffer;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->tvProductDescription:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/ibotta/api/model/offer/SocialOffer;->getDescription()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private updateUI(Lcom/ibotta/api/model/offer/SocialOffer;)V
    .locals 2

    .line 136
    invoke-direct {p0, p1}, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->updateProductLabels(Lcom/ibotta/api/model/offer/SocialOffer;)V

    .line 137
    invoke-direct {p0, p1}, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->updateButtonLabel(Lcom/ibotta/api/model/offer/SocialOffer;)V

    .line 139
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->ricvRebateImageCard:Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;

    sget-object v1, Lcom/ibotta/android/views/content/ContentStyle;->HERO:Lcom/ibotta/android/views/content/ContentStyle;

    invoke-virtual {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;->setOffer(Lcom/ibotta/android/views/content/ContentStyle;Lcom/ibotta/api/model/OfferModel;)V

    .line 141
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lcom/ibotta/api/model/offer/SocialOffer;->getFriendObjects()Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 142
    iget-object p1, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->flvLikeFriends:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->setFriends(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public getActionBarTitle()Ljava/lang/String;
    .locals 2

    .line 64
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->title:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 66
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->context:Landroid/content/Context;

    const v1, 0x7f11046b

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->title:Ljava/lang/String;

    .line 69
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->title:Ljava/lang/String;

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

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v0}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getDisplayId()I

    move-result v0

    .line 95
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->socialOfferJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 96
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v2}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v2

    invoke-interface {v1, v2, v0}, Lcom/ibotta/android/service/api/job/ApiJobFactory;->createSocialOfferByIdJob(II)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->socialOfferJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 99
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 100
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->socialOfferJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c012a

    return v0
.end method

.method protected initView()V
    .locals 2

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->v:Landroid/view/View;

    invoke-static {p0, v0}, Lbutterknife/ButterKnife;->bind(Ljava/lang/Object;Landroid/view/View;)Lbutterknife/Unbinder;

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->flvLikeFriends:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;

    new-instance v1, Lcom/ibotta/android/fragment/activity/detail/LikeDetail$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/fragment/activity/detail/LikeDetail$1;-><init>(Lcom/ibotta/android/fragment/activity/detail/LikeDetail;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->setListener(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView$SpotlightFriendsLikeListener;)V

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

    const/4 v0, 0x0

    return v0
.end method

.method public onApiJobsFinished()V
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->socialOfferJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->isSuccessfullyLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->socialOfferJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/offer/SocialOfferByIdResponse;

    .line 109
    invoke-virtual {v0}, Lcom/ibotta/api/call/offer/SocialOfferByIdResponse;->getSocialOffer()Lcom/ibotta/api/model/offer/SocialOffer;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->updateUI(Lcom/ibotta/api/model/offer/SocialOffer;)V

    :cond_0
    return-void
.end method
