.class public Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "MoreStoresPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenter;"
    }
.end annotation


# instance fields
.field private activeRetailerIds:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private categories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Category;",
            ">;"
        }
    .end annotation
.end field

.field private final categoryHelper:Lcom/ibotta/api/helper/retailer/CategoryHelper;

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

.field private final loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

.field private myRebatesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private final offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

.field private offerModels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation
.end field

.field private retailerModels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end field

.field private unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/helper/retailer/CategoryHelper;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 48
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->retailerModels:Ljava/util/List;

    .line 49
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->offerModels:Ljava/util/List;

    .line 50
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->activeRetailerIds:Ljava/util/LinkedHashSet;

    .line 51
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->categories:Ljava/util/List;

    .line 60
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 61
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->categoryHelper:Lcom/ibotta/api/helper/retailer/CategoryHelper;

    .line 62
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 63
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    return-void
.end method

.method private alphabetize(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;",
            ">;)V"
        }
    .end annotation

    .line 197
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;)V

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-void
.end method

.method private createDataMap()Ljava/util/LinkedHashMap;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;",
            ">;>;"
        }
    .end annotation

    .line 119
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 121
    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;->NEARBY:Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v1, v2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;->ALL:Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v1, v2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->retailerModels:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/RetailerModel;

    .line 125
    invoke-direct {p0, v2}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->makeNearbyTabRow(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;

    move-result-object v3

    .line 126
    invoke-direct {p0, v2}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->makeAllTabRow(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;

    move-result-object v2

    if-eqz v3, :cond_1

    .line 129
    sget-object v4, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;->NEARBY:Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;

    invoke-virtual {v0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    if-eqz v2, :cond_0

    .line 132
    sget-object v3, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;->ALL:Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;

    invoke-virtual {v0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 136
    :cond_2
    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;->NEARBY:Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->alphabetize(Ljava/util/List;)V

    .line 137
    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;->ALL:Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresTab;

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->alphabetize(Ljava/util/List;)V

    return-object v0
.end method

.method private makeAllTabRow(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;
    .locals 4

    .line 164
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->offerModels:Ljava/util/List;

    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/helper/offer/OfferHelper;->findByRetailer(Ljava/util/List;I)Ljava/util/List;

    move-result-object v0

    .line 165
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 166
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v2

    .line 165
    invoke-interface {v1, v0, v2}, Lcom/ibotta/api/helper/offer/OfferHelper;->findActiveByRetailer(Ljava/util/List;I)Ljava/util/List;

    move-result-object v1

    .line 170
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getVerificationTypeEnum()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v2

    sget-object v3, Lcom/ibotta/api/model/common/VerificationType;->APP:Lcom/ibotta/api/model/common/VerificationType;

    if-ne v2, v3, :cond_0

    .line 172
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->makeRowIfOffers(Lcom/ibotta/api/model/RetailerModel;I)Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;

    move-result-object p1

    goto :goto_0

    .line 173
    :cond_0
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 175
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->makeRowIfOffers(Lcom/ibotta/api/model/RetailerModel;I)Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private makeNearbyTabRow(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;
    .locals 3

    .line 145
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getVerificationTypeEnum()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/common/VerificationType;->APP:Lcom/ibotta/api/model/common/VerificationType;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->activeRetailerIds:Ljava/util/LinkedHashSet;

    .line 146
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 149
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->offerModels:Ljava/util/List;

    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/helper/offer/OfferHelper;->findByRetailer(Ljava/util/List;I)Ljava/util/List;

    move-result-object v0

    .line 150
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->makeRowIfOffers(Lcom/ibotta/api/model/RetailerModel;I)Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;

    move-result-object p1

    goto :goto_0

    .line 151
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getDistance()Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 152
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getVerificationTypeEnum()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/common/VerificationType;->APP:Lcom/ibotta/api/model/common/VerificationType;

    if-eq v0, v1, :cond_1

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->offerModels:Ljava/util/List;

    .line 156
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v2

    .line 155
    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/helper/offer/OfferHelper;->findActiveByRetailer(Ljava/util/List;I)Ljava/util/List;

    move-result-object v0

    .line 157
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->makeRowIfOffers(Lcom/ibotta/api/model/RetailerModel;I)Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private makeRowIfOffers(Lcom/ibotta/api/model/RetailerModel;I)Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;
    .locals 3

    if-gtz p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 186
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->categoryHelper:Lcom/ibotta/api/helper/retailer/CategoryHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->categories:Ljava/util/List;

    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getPrimaryCategoryId()I

    move-result v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/helper/retailer/CategoryHelper;->findById(Ljava/util/List;I)Lcom/ibotta/api/model/retailer/Category;

    move-result-object v0

    .line 188
    new-instance v1, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;

    invoke-direct {v1}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;-><init>()V

    .line 189
    invoke-virtual {v1, p2}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;->setAddedCount(I)V

    .line 190
    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;->setCategory(Lcom/ibotta/api/model/retailer/Category;)V

    .line 191
    invoke-virtual {v1, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;->setRetailerModel(Lcom/ibotta/api/model/RetailerModel;)V

    return-object v1
.end method


# virtual methods
.method protected getFetchJobs()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 68
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 70
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 71
    new-instance v1, Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/HomeApiJob;-><init>(I)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 73
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->myRebatesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_1

    .line 74
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v3, Lcom/ibotta/api/call/offer/MyRebatesCall;

    invoke-direct {v3}, Lcom/ibotta/api/call/offer/MyRebatesCall;-><init>()V

    invoke-direct {v1, v3}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->myRebatesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 76
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_2

    .line 77
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createUnlockedOffersCall()Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;

    move-result-object v1

    const v3, 0x7fffffff

    .line 78
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;->setLimit(Ljava/lang/Integer;)V

    .line 79
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;->setProducts(Ljava/lang/Boolean;)V

    .line 81
    new-instance v2, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {v2, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 84
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 85
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->myRebatesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 86
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 93
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 94
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->myRebatesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 95
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 4

    .line 100
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/home/HomeResponse;

    .line 101
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->myRebatesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/call/offer/MyRebatesResponse;

    .line 103
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->retailerModels:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 104
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->offerModels:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 105
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->activeRetailerIds:Ljava/util/LinkedHashSet;

    invoke-virtual {v2}, Ljava/util/LinkedHashSet;->clear()V

    .line 106
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->categories:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 108
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->retailerModels:Ljava/util/List;

    invoke-virtual {v0}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 109
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->activeRetailerIds:Ljava/util/LinkedHashSet;

    invoke-virtual {v1}, Lcom/ibotta/api/call/offer/MyRebatesResponse;->getActiveRetailers()Ljava/util/LinkedHashSet;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashSet;->addAll(Ljava/util/Collection;)Z

    .line 110
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->categories:Ljava/util/List;

    invoke-virtual {v0}, Lcom/ibotta/api/call/home/HomeResponse;->getCategories()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLResponse;

    .line 113
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->offerModels:Ljava/util/List;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLResponse;->getOffersAsModels()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresView;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->createDataMap()Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresView;->setDataMap(Ljava/util/LinkedHashMap;)V

    return-void
.end method

.method public onRetailerRowClicked(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 210
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresView;->showMyOffersGallery(Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method
