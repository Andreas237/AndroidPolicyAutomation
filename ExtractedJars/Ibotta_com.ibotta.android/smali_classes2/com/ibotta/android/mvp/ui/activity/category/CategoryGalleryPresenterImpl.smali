.class public Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "CategoryGalleryPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenter;"
    }
.end annotation


# instance fields
.field private final accountTracking:Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;

.field private apiJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private final categoryGalleryReducer:Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;

.field private final categoryHelper:Lcom/ibotta/api/helper/retailer/CategoryHelper;

.field private final contentMapper:Lcom/ibotta/android/mappers/ContentMapper;

.field private favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final favoriteRetailersManagerFactory:Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

.field private final loadRetailerCategoriesVariant:Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;

.field private final loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

.field private retailerCategoryParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/retailer/CategoryHelper;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;Lcom/ibotta/android/mappers/ContentMapper;Lcom/ibotta/android/state/user/UserState;)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 64
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->categoryHelper:Lcom/ibotta/api/helper/retailer/CategoryHelper;

    .line 65
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->favoriteRetailersManagerFactory:Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

    .line 66
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    .line 67
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->loadRetailerCategoriesVariant:Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;

    .line 68
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->accountTracking:Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;

    .line 69
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->categoryGalleryReducer:Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;

    .line 70
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->contentMapper:Lcom/ibotta/android/mappers/ContentMapper;

    .line 71
    iput-object p9, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    return-void
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

    .line 82
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 84
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->apiJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 85
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->loadRetailerCategoriesVariant:Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 86
    invoke-interface {v2}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->retailerCategoryParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    invoke-virtual {v3}, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->getId()I

    move-result v3

    .line 85
    invoke-interface {v1, v2, v3}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;->getRetailerCategoryJob(II)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->apiJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 89
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->apiJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 96
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->apiJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onContentActionClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 1

    .line 144
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    if-eqz v0, :cond_0

    .line 145
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->onFavoriteClicked(Lcom/ibotta/android/apiandroid/content/ContentId;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;)V

    .line 148
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->onFetchFinishedSuccessfully()V

    return-void
.end method

.method public onFeatureClicked(Lcom/ibotta/api/model/base/Routable;)V
    .locals 1

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryView;

    invoke-interface {p1}, Lcom/ibotta/api/model/base/Routable;->getLink()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryView;->launchRoute(Ljava/lang/String;)V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 6

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->apiJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    .line 103
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->retailerCategoryParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    invoke-virtual {v1}, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->getId()I

    move-result v1

    .line 104
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->loadRetailerCategoriesVariant:Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;

    .line 105
    invoke-interface {v2, v0, v1}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;->getCategoryById(Lcom/ibotta/api/ApiResponse;I)Lcom/ibotta/api/model/retailer/Category;

    move-result-object v2

    if-nez v2, :cond_0

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryView;->finish()V

    return-void

    .line 112
    :cond_0
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v3, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryView;

    invoke-virtual {v2}, Lcom/ibotta/api/model/retailer/Category;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryView;->setTitle(Ljava/lang/CharSequence;)V

    .line 114
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->loadRetailerCategoriesVariant:Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;

    invoke-interface {v2, v0}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;->getFavoriteRetailers(Lcom/ibotta/api/ApiResponse;)Ljava/util/List;

    move-result-object v2

    .line 115
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->favoriteRetailersManagerFactory:Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

    invoke-virtual {v3, v2}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;->newInstance(Ljava/util/List;)Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    move-result-object v2

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    .line 117
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryView;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->loadRetailerCategoriesVariant:Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->categoryGalleryReducer:Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;

    invoke-interface {v3, v0, v1, v4, v5}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;->getRetailerCategoryTabs(Lcom/ibotta/api/ApiResponse;ILcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v2, v0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryView;->setDataMap(Ljava/util/Map;)V

    return-void
.end method

.method protected onFetchFinishedWithFailures()V
    .locals 1

    .line 123
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onFetchFinishedWithFailures()V

    .line 124
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryView;->setTitleForLoadFailure()V

    return-void
.end method

.method public onNavAccountClicked()V
    .locals 1

    .line 153
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->accountTracking:Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;->trackAccountNavClick()V

    .line 154
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onNavAccountClicked()V

    return-void
.end method

.method public onRetailerClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 2

    .line 134
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->loadRetailerCategoriesVariant:Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->apiJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 135
    invoke-virtual {v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;->getRetailerContentModelByContentId(Lcom/ibotta/api/ApiResponse;Lcom/ibotta/android/apiandroid/content/ContentId;)Lcom/ibotta/api/model/ContentModel;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 138
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->retailerCategoryParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    invoke-virtual {p0, p1, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;)V

    :cond_0
    return-void
.end method

.method public setRetailerCategoryParcel(Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;)V
    .locals 1

    .line 76
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->retailerCategoryParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryView;

    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryView;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method
