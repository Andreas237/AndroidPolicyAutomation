.class public Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;
.super Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;
.source "AppPendingDetail.java"


# instance fields
.field private final apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

.field private final digitalProductHelper:Lcom/ibotta/api/helper/offer/DigitalProductHelper;

.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

.field private final imageCache:Lcom/ibotta/android/images/ImageCache;

.field private ivIcon:Landroid/widget/ImageView;

.field private final loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

.field private offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

.field private retailerName:Ljava/lang/String;

.field private tvDescription:Landroid/widget/TextView;

.field private tvExpiration:Landroid/widget/TextView;

.field private tvName:Landroid/widget/TextView;

.field private tvTerms:Landroid/widget/TextView;

.field private tvTransactionAmount:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/images/ImageCache;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/api/helper/offer/DigitalProductHelper;)V
    .locals 0

    .line 63
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;-><init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/util/Formatting;)V

    .line 64
    iput-object p3, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 65
    iput-object p4, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->imageCache:Lcom/ibotta/android/images/ImageCache;

    .line 66
    iput-object p5, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 67
    iput-object p6, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    .line 68
    iput-object p7, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 69
    iput-object p8, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    .line 70
    iput-object p9, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->digitalProductHelper:Lcom/ibotta/api/helper/offer/DigitalProductHelper;

    return-void
.end method


# virtual methods
.method public getActionBarSubtitle()Ljava/lang/String;
    .locals 1

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->retailerName:Ljava/lang/String;

    return-object v0
.end method

.method public getActionBarTitle()Ljava/lang/String;
    .locals 2

    .line 153
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->context:Landroid/content/Context;

    const v1, 0x7f110456

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

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 91
    new-instance v0, Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-direct {v0, v1}, Lcom/ibotta/android/service/api/job/HomeApiJob;-><init>(I)V

    iput-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 94
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v0, :cond_1

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v0}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createOfferCall()Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;

    move-result-object v0

    .line 96
    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v2}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getDisplayId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->setOfferId(Ljava/lang/Integer;)V

    const/4 v2, 0x1

    .line 97
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->setIgnoreTargeting(Ljava/lang/Boolean;)V

    .line 98
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->setProducts(Ljava/lang/Boolean;)V

    .line 100
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    invoke-interface {v1, v0}, Lcom/ibotta/android/service/api/job/ApiJobFactory;->createSingleApiJob(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 103
    :cond_1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 104
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 105
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c0125

    return v0
.end method

.method protected initView()V
    .locals 2

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->v:Landroid/view/View;

    const v1, 0x7f0902af

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->ivIcon:Landroid/widget/ImageView;

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->v:Landroid/view/View;

    const v1, 0x7f09054d

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->tvName:Landroid/widget/TextView;

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->v:Landroid/view/View;

    const v1, 0x7f090515

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->tvDescription:Landroid/widget/TextView;

    .line 78
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->v:Landroid/view/View;

    const v1, 0x7f090520

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->tvExpiration:Landroid/widget/TextView;

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->v:Landroid/view/View;

    const v1, 0x7f090584

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->tvTerms:Landroid/widget/TextView;

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->v:Landroid/view/View;

    const v1, 0x7f09058d

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->tvTransactionAmount:Landroid/widget/TextView;

    return-void
.end method

.method public isReportIssue()Z
    .locals 1

    const/4 v0, 0x1

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
    .locals 7

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->isSuccessfullyLoaded()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/android/graphql/offer/OfferGraphQLResponse;

    if-eqz v0, :cond_0

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/offer/OfferGraphQLResponse;

    .line 115
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/offer/OfferGraphQLResponse;->getOfferAsModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    .line 119
    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-virtual {v2}, Lcom/ibotta/android/service/api/job/HomeApiJob;->isSuccessfullyLoaded()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 120
    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-virtual {v2}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/call/home/HomeResponse;

    .line 121
    iget-object v3, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->digitalProductHelper:Lcom/ibotta/api/helper/offer/DigitalProductHelper;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getDigitalProducts()Ljava/util/List;

    move-result-object v4

    invoke-interface {v3, v4}, Lcom/ibotta/api/helper/offer/DigitalProductHelper;->findWithUri(Ljava/util/List;)Lcom/ibotta/api/model/offer/DigitalProduct;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 123
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 124
    invoke-virtual {v2}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v3}, Lcom/ibotta/api/model/offer/DigitalProduct;->getRetailerId()I

    move-result v3

    .line 123
    invoke-interface {v1, v2, v3}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object v1

    :cond_1
    if-eqz v0, :cond_4

    if-eqz v1, :cond_4

    .line 129
    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getLargeUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 130
    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->imageCache:Lcom/ibotta/android/images/ImageCache;

    iget-object v3, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->context:Landroid/content/Context;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getLargeUrl()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->ivIcon:Landroid/widget/ImageView;

    sget-object v6, Lcom/ibotta/android/views/images/Sizes;->SPOTLIGHT:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v2, v3, v4, v5, v6}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    goto :goto_1

    .line 131
    :cond_2
    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 132
    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->imageCache:Lcom/ibotta/android/images/ImageCache;

    iget-object v3, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->context:Landroid/content/Context;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getUrl()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->ivIcon:Landroid/widget/ImageView;

    sget-object v6, Lcom/ibotta/android/views/images/Sizes;->SPOTLIGHT:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v2, v3, v4, v5, v6}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    .line 134
    :cond_3
    :goto_1
    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->tvName:Landroid/widget/TextView;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 135
    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->tvDescription:Landroid/widget/TextView;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 137
    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getExpiration()Ljava/util/Date;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/ibotta/android/util/Formatting;->getAppConfigExpiration(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    .line 138
    iget-object v3, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->tvExpiration:Landroid/widget/TextView;

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 140
    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->tvTerms:Landroid/widget/TextView;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getTerms()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 141
    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->tvTransactionAmount:Landroid/widget/TextView;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getCurrentValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 143
    :cond_4
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->tvTransactionAmount:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->formatting:Lcom/ibotta/android/util/Formatting;

    const-wide/16 v3, 0x0

    invoke-interface {v2, v3, v4}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_2
    if-eqz v1, :cond_5

    .line 147
    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;->retailerName:Ljava/lang/String;

    :cond_5
    return-void
.end method
