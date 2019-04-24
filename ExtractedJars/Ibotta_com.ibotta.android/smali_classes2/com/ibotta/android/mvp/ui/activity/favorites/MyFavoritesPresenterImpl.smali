.class public Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "MyFavoritesPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenter;"
    }
.end annotation


# instance fields
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

.field private favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

.field private final favoriteRetailersManagerFactory:Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

.field protected homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

.field private final loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

.field private final myFavoritesReducer:Lcom/ibotta/android/account/myfavorites/MyFavoritesReducer;

.field private final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

.field private final retailerHorizListReducer:Lcom/ibotta/android/horiz/RetailerHorizListReducer;

.field private retailerModels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end field

.field private retailerModelsWithinReach:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end field

.field private rows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/favorites/row/FavoriteRow;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/retailer/CategoryHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/account/myfavorites/MyFavoritesReducer;Lcom/ibotta/android/horiz/RetailerHorizListReducer;)V
    .locals 0

    .line 56
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 43
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->retailerModels:Ljava/util/List;

    .line 44
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->retailerModelsWithinReach:Ljava/util/List;

    .line 45
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->categories:Ljava/util/List;

    .line 46
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->rows:Ljava/util/List;

    .line 57
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->categoryHelper:Lcom/ibotta/api/helper/retailer/CategoryHelper;

    .line 58
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 59
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->favoriteRetailersManagerFactory:Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

    .line 60
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    .line 61
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->myFavoritesReducer:Lcom/ibotta/android/account/myfavorites/MyFavoritesReducer;

    .line 62
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->retailerHorizListReducer:Lcom/ibotta/android/horiz/RetailerHorizListReducer;

    return-void
.end method

.method private generateMyFavoritesRows()V
    .locals 5

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->rows:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    invoke-interface {v0}, Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;->getFavoriteRetailerIds()Ljava/util/Set;

    move-result-object v0

    .line 115
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->retailerModels:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 118
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 120
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->retailerModels:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v2, v3, v1}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 124
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->categoryHelper:Lcom/ibotta/api/helper/retailer/CategoryHelper;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->categories:Ljava/util/List;

    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getPrimaryCategoryId()I

    move-result v4

    invoke-interface {v2, v3, v4}, Lcom/ibotta/api/helper/retailer/CategoryHelper;->findById(Ljava/util/List;I)Lcom/ibotta/api/model/retailer/Category;

    move-result-object v2

    .line 125
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->rows:Ljava/util/List;

    new-instance v4, Lcom/ibotta/android/mvp/ui/activity/favorites/row/FavoriteRow;

    invoke-direct {v4, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/favorites/row/FavoriteRow;-><init>(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/retailer/Category;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 131
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->rows:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->retailerHorizListReducer:Lcom/ibotta/android/horiz/RetailerHorizListReducer;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->retailerModelsWithinReach:Ljava/util/List;

    .line 133
    invoke-virtual {v1, v2}, Lcom/ibotta/android/horiz/RetailerHorizListReducer;->create(Ljava/util/List;)Lcom/ibotta/android/horiz/RetailerSSCardListViewState;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->myFavoritesReducer:Lcom/ibotta/android/account/myfavorites/MyFavoritesReducer;

    invoke-virtual {v2}, Lcom/ibotta/android/account/myfavorites/MyFavoritesReducer;->getEmptyStateTitle()Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v2

    .line 132
    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesView;->setEmptyState(Lcom/ibotta/android/horiz/RetailerSSCardListViewState;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    goto :goto_1

    .line 135
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->rows:Ljava/util/List;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesView;->setRows(Ljava/util/List;)V

    :goto_1
    return-void
.end method

.method private initFavoriteStoresManager(Lcom/ibotta/api/call/home/HomeResponse;)V
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->favoriteRetailersManagerFactory:Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

    .line 107
    invoke-virtual {p1}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;->newInstance(Ljava/util/List;)Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    return-void
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

    .line 67
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 69
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-nez v1, :cond_0

    .line 70
    new-instance v1, Lcom/ibotta/android/service/api/job/HomeApiJob;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/HomeApiJob;-><init>(I)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 73
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 80
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 3

    .line 85
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/home/HomeResponse;

    .line 87
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->retailerModels:Ljava/util/List;

    invoke-virtual {v0}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 88
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->retailerModelsWithinReach:Ljava/util/List;

    .line 91
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->retailerModelsWithinReach:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 92
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 93
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/RetailerModel;

    .line 94
    invoke-interface {v2}, Lcom/ibotta/api/model/RetailerModel;->getDistance()Ljava/lang/Float;

    move-result-object v2

    if-nez v2, :cond_0

    .line 95
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 99
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->categories:Ljava/util/List;

    invoke-virtual {v0}, Lcom/ibotta/api/call/home/HomeResponse;->getCategories()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 101
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->initFavoriteStoresManager(Lcom/ibotta/api/call/home/HomeResponse;)V

    .line 102
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->generateMyFavoritesRows()V

    return-void
.end method

.method public onMyFavoritesSwapped()V
    .locals 3

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    invoke-interface {v0}, Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;->deleteAllRecords()V

    .line 149
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->rows:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/favorites/row/FavoriteRow;

    .line 150
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/favorites/row/FavoriteRow;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v1

    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v1

    invoke-interface {v2, v1}, Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;->favorite(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onRetailerAdded(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/content/ContentId;->getIntId()I

    move-result p1

    invoke-interface {v0, p1}, Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;->favorite(I)V

    .line 142
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->generateMyFavoritesRows()V

    return-void
.end method

.method public onRetailerRemoved(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/content/ContentId;->getIntId()I

    move-result p1

    invoke-interface {v0, p1}, Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;->unfavorite(I)V

    .line 158
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;->generateMyFavoritesRows()V

    return-void
.end method
