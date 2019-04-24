.class public Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;
.super Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;
.source "ExpiringDetail.java"


# instance fields
.field private adapter:Lcom/ibotta/android/view/offer/OfferListAdapter;

.field private final apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private final imageCache:Lcom/ibotta/android/images/ImageCache;

.field private lvItems:Landroid/widget/ListView;

.field private final offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

.field private sectionAdapter:Landroid/widget/BaseAdapter;

.field private tvEmpty:Landroid/widget/TextView;

.field private unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/images/ImageCache;)V
    .locals 0

    .line 48
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;-><init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/util/Formatting;)V

    .line 49
    iput-object p4, p0, Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 50
    iput-object p5, p0, Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    .line 51
    iput-object p6, p0, Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 52
    iput-object p7, p0, Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;->imageCache:Lcom/ibotta/android/images/ImageCache;

    return-void
.end method

.method private onOffersLoaded(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)V"
        }
    .end annotation

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;->context:Landroid/content/Context;

    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;->imageCache:Lcom/ibotta/android/images/ImageCache;

    new-instance v2, Lcom/ibotta/android/collection/CategoryOfferExpirationComparator;

    iget-object v3, p0, Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    const/4 v4, 0x0

    invoke-direct {v2, v4, v3}, Lcom/ibotta/android/collection/CategoryOfferExpirationComparator;-><init>(Ljava/lang/Integer;Lcom/ibotta/api/helper/offer/OfferHelper;)V

    iget-object v3, p0, Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-static {v0, v1, p1, v2, v3}, Lcom/ibotta/android/view/offer/OfferListAdapter;->newInstance(Landroid/content/Context;Lcom/ibotta/android/images/ImageCache;Ljava/util/List;Ljava/util/Comparator;Lcom/ibotta/api/helper/offer/OfferHelper;)Landroid/widget/BaseAdapter;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;->sectionAdapter:Landroid/widget/BaseAdapter;

    .line 121
    iget-object p1, p0, Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;->sectionAdapter:Landroid/widget/BaseAdapter;

    invoke-static {p1}, Lcom/ibotta/android/view/offer/OfferListAdapter;->getWrappedAdapter(Landroid/widget/BaseAdapter;)Lcom/ibotta/android/view/offer/OfferListAdapter;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;->adapter:Lcom/ibotta/android/view/offer/OfferListAdapter;

    .line 122
    iget-object p1, p0, Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;->adapter:Lcom/ibotta/android/view/offer/OfferListAdapter;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/view/offer/OfferListAdapter;->setShowArrow(Z)V

    .line 124
    iget-object p1, p0, Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;->lvItems:Landroid/widget/ListView;

    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;->sectionAdapter:Landroid/widget/BaseAdapter;

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 125
    iget-object p1, p0, Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;->lvItems:Landroid/widget/ListView;

    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;->tvEmpty:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public getActionBarTitle()Ljava/lang/String;
    .locals 2

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;->context:Landroid/content/Context;

    const v1, 0x7f11045f

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

    .line 72
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 74
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;->unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 75
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createUnlockedOffersCall()Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;

    move-result-object v1

    .line 76
    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    invoke-interface {v2, v1}, Lcom/ibotta/android/service/api/job/ApiJobFactory;->createSingleApiJob(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;->unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 79
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;->unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected initView()V
    .locals 2

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;->tvEmpty:Landroid/widget/TextView;

    const v1, 0x7f11045e

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public isItemized()Z
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

.method public isViewReceipt()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onApiJobsFinished()V
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;->unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->isSuccessfullyLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;->unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 87
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLResponse;

    if-eqz v0, :cond_0

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;->unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 89
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLResponse;

    .line 90
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLResponse;->getOffersAsModels()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;->onOffersLoaded(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public setItemsView(Landroid/widget/ListView;Landroid/widget/TextView;)V
    .locals 0

    .line 106
    iput-object p1, p0, Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;->lvItems:Landroid/widget/ListView;

    .line 107
    iput-object p2, p0, Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;->tvEmpty:Landroid/widget/TextView;

    return-void
.end method
