.class public Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "SeasonalPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenter;"
    }
.end annotation


# instance fields
.field private categoryGraphQLJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private categoryModel:Lcom/ibotta/api/model/OfferCategoryModel;

.field private final eventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

.field private final loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

.field private retailerCategoryParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

.field private final retailerIconOnOfferVariant:Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;)V
    .locals 0

    .line 61
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 62
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 63
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    .line 64
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->eventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;

    .line 65
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->retailerIconOnOfferVariant:Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;

    return-void
.end method

.method private addBannersRow(Ljava/util/List;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/FeatureModel;",
            ">;)V"
        }
    .end annotation

    .line 153
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 157
    :cond_0
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;-><init>()V

    .line 158
    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->FEATURED_CATEGORY:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    .line 159
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->retailerCategoryParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    invoke-virtual {v1}, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;->setRetailerCategoryId(I)V

    .line 160
    invoke-virtual {v0, p2}, Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;->setFeatures(Ljava/util/List;)V

    .line 162
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private addRebateRows(Ljava/util/List;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;",
            ">;)V"
        }
    .end annotation

    .line 166
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 168
    new-instance v1, Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    invoke-direct {v1}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;-><init>()V

    .line 169
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->eventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Lcom/ibotta/android/mvp/ui/activity/seasonal/-$$Lambda$7xOcmki2BnLqp96YJVftr9W7_Q0;

    invoke-direct {v3, v2}, Lcom/ibotta/android/mvp/ui/activity/seasonal/-$$Lambda$7xOcmki2BnLqp96YJVftr9W7_Q0;-><init>(Lcom/ibotta/android/tracking/EventContextProvider;)V

    invoke-virtual {v1, v3}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->setEventContributor(Lcom/ibotta/android/tracking/proprietary/event/EventContributor;)V

    const/4 v2, 0x0

    .line 171
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 172
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/api/model/OfferModel;

    .line 174
    new-instance v4, Lcom/ibotta/android/view/model/content/OfferItem;

    invoke-direct {v4, v3}, Lcom/ibotta/android/view/model/content/OfferItem;-><init>(Lcom/ibotta/api/model/OfferModel;)V

    .line 175
    invoke-virtual {v4, v1}, Lcom/ibotta/android/view/model/content/OfferItem;->setEventChain(Lcom/ibotta/android/tracking/proprietary/event/EventChain;)V

    .line 176
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/ibotta/android/view/model/content/OfferItem;->setIndex(Ljava/lang/Integer;)V

    .line 178
    invoke-interface {v3}, Lcom/ibotta/api/model/OfferModel;->getOfferTypeEnum()Lcom/ibotta/api/model/offer/OfferType;

    move-result-object v3

    sget-object v5, Lcom/ibotta/api/model/offer/OfferType;->HERO:Lcom/ibotta/api/model/offer/OfferType;

    if-ne v3, v5, :cond_0

    .line 179
    sget-object v3, Lcom/ibotta/android/views/content/ContentStyle;->HERO:Lcom/ibotta/android/views/content/ContentStyle;

    invoke-virtual {v4, v3}, Lcom/ibotta/android/view/model/content/OfferItem;->setStyle(Lcom/ibotta/android/views/content/ContentStyle;)V

    goto :goto_1

    .line 181
    :cond_0
    sget-object v3, Lcom/ibotta/android/views/content/ContentStyle;->MEDIUM:Lcom/ibotta/android/views/content/ContentStyle;

    invoke-virtual {v4, v3}, Lcom/ibotta/android/view/model/content/OfferItem;->setStyle(Lcom/ibotta/android/views/content/ContentStyle;)V

    .line 184
    :goto_1
    new-instance v3, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;

    invoke-direct {v3}, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;-><init>()V

    const/4 v5, 0x0

    .line 185
    invoke-virtual {v3, v5}, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;->setRetailerModel(Lcom/ibotta/api/model/RetailerModel;)V

    .line 186
    invoke-virtual {v3, v2}, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;->setIndex(I)V

    .line 187
    invoke-virtual {v3, v4}, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;->setOfferCategoryItem(Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;)V

    .line 189
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 192
    :cond_1
    invoke-interface {p2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method private initRetailerCategoryParcel()V
    .locals 2

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->categoryModel:Lcom/ibotta/api/model/OfferCategoryModel;

    if-eqz v0, :cond_0

    .line 138
    invoke-static {v0}, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->fromCategoryModel(Lcom/ibotta/api/model/OfferCategoryModel;)Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->retailerCategoryParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    .line 141
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->retailerCategoryParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;->setRetailerCategoryParcel(Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;)V

    return-void
.end method

.method private initRows(Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/FeatureModel;",
            ">;)V"
        }
    .end annotation

    .line 145
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 146
    invoke-direct {p0, v0, p2}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->addBannersRow(Ljava/util/List;Ljava/util/List;)V

    .line 147
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->addRebateRows(Ljava/util/List;Ljava/util/List;)V

    .line 149
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;->setRows(Ljava/util/List;)V

    return-void
.end method

.method private isRetailerCategoryValid()Z
    .locals 3

    .line 125
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->retailerCategoryParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 127
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->getCategoryType()Lcom/ibotta/api/model/retailer/CategoryType;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 130
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->categoryModel:Lcom/ibotta/api/model/OfferCategoryModel;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public static synthetic lambda$onFetchFinishedSuccessfully$0(Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;Lcom/ibotta/api/model/retailer/Category;)Z
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->categoryModel:Lcom/ibotta/api/model/OfferCategoryModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferCategoryModel;->getId()I

    move-result v0

    invoke-virtual {p1}, Lcom/ibotta/api/model/retailer/Category;->getId()I

    move-result p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method static synthetic lambda$onFetchFinishedSuccessfully$1(Lcom/ibotta/api/model/retailer/Category;)Z
    .locals 1

    .line 108
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/Category;->getFeatures()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/Category;->getFeatures()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method static synthetic lambda$onFetchFinishedSuccessfully$2(Lcom/ibotta/api/model/retailer/Category;)Ljava9/util/stream/Stream;
    .locals 0

    .line 109
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/Category;->getFeatures()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected getFetchJobs()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 70
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 72
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-nez v1, :cond_0

    .line 73
    new-instance v1, Lcom/ibotta/android/service/api/job/HomeApiJob;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/HomeApiJob;-><init>(I)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 76
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->categoryGraphQLJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_1

    .line 77
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createCategoryCall()Lcom/ibotta/android/graphql/category/CategoryGraphQLCall;

    move-result-object v1

    .line 78
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->retailerCategoryParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    invoke-virtual {v2}, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/category/CategoryGraphQLCall;->setCategoryId(Ljava/lang/Integer;)V

    .line 79
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->retailerIconOnOfferVariant:Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;

    invoke-interface {v2}, Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;->shouldShowRetailerStackView()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/category/CategoryGraphQLCall;->setIncludeAvailableRetailers(Ljava/lang/Boolean;)V

    .line 80
    new-instance v2, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {v2, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->categoryGraphQLJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 83
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 84
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->categoryGraphQLJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 91
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 92
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->categoryGraphQLJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onFailedToLoadDismissed()V
    .locals 1

    .line 202
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;->finish()V

    return-void
.end method

.method public onFeatureClicked(Lcom/ibotta/api/model/base/Routable;)V
    .locals 1

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;

    invoke-interface {p1}, Lcom/ibotta/api/model/base/Routable;->getLink()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;->launchRoute(Ljava/lang/String;)V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 2

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/home/HomeResponse;

    .line 98
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->categoryGraphQLJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/graphql/category/CategoryGraphQLResponse;

    .line 99
    invoke-virtual {v1}, Lcom/ibotta/android/graphql/category/CategoryGraphQLResponse;->getCategoryAsModel()Lcom/ibotta/api/model/OfferCategoryModel;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->categoryModel:Lcom/ibotta/api/model/OfferCategoryModel;

    .line 101
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->isRetailerCategoryValid()Z

    move-result v1

    if-nez v1, :cond_0

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;->showFailedToLoad()V

    return-void

    .line 106
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/api/call/home/HomeResponse;->getCategories()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/seasonal/-$$Lambda$SeasonalPresenterImpl$zC3egeLcgD9hcG3l7p_aCKCObsI;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/seasonal/-$$Lambda$SeasonalPresenterImpl$zC3egeLcgD9hcG3l7p_aCKCObsI;-><init>(Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;)V

    .line 107
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/seasonal/-$$Lambda$SeasonalPresenterImpl$LHMvEbmOgkp9cWp0xcg5npnFeLQ;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/seasonal/-$$Lambda$SeasonalPresenterImpl$LHMvEbmOgkp9cWp0xcg5npnFeLQ;

    .line 108
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/seasonal/-$$Lambda$SeasonalPresenterImpl$bqrPVzklOP0qNGNSpwgzMxbUsCw;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/seasonal/-$$Lambda$SeasonalPresenterImpl$bqrPVzklOP0qNGNSpwgzMxbUsCw;

    .line 109
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->flatMap(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v0

    .line 110
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 112
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->initRetailerCategoryParcel()V

    .line 113
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->categoryModel:Lcom/ibotta/api/model/OfferCategoryModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferCategoryModel;->getOffers()Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, v1, v0}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->initRows(Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method protected onFetchFinishedWithFailures()V
    .locals 1

    .line 118
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onFetchFinishedWithFailures()V

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;->setTitleForLoadFailure()V

    return-void
.end method

.method public onSpecialConditionsLearnMoreClicked(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    return-void
.end method

.method public onUnlockCompleted()V
    .locals 1

    .line 217
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->reload()V

    .line 218
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;->showUnlockAnimation()V

    return-void
.end method

.method public setRetailerCategoryParcel(Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;)V
    .locals 0

    .line 197
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;->retailerCategoryParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    return-void
.end method
