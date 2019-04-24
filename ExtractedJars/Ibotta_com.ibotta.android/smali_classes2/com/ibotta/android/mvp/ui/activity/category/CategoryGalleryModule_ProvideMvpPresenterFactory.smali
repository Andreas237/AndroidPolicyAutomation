.class public final Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideMvpPresenterFactory;
.super Ljava/lang/Object;
.source "CategoryGalleryModule_ProvideMvpPresenterFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenter;",
        ">;"
    }
.end annotation


# instance fields
.field private final accountTrackingProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;",
            ">;"
        }
    .end annotation
.end field

.field private final categoryGalleryReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final categoryHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/CategoryHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final contentMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mappers/ContentMapper;",
            ">;"
        }
    .end annotation
.end field

.field private final favoriteRetailersManagerFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final loadRetailerCategoriesVariantProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;",
            ">;"
        }
    .end annotation
.end field

.field private final loadRetailersVariantProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;

.field private final mvpPresenterActionsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;"
        }
    .end annotation
.end field

.field private final userStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/CategoryHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mappers/ContentMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;)V"
        }
    .end annotation

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;

    .line 55
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    .line 56
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideMvpPresenterFactory;->categoryHelperProvider:Ljavax/inject/Provider;

    .line 57
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideMvpPresenterFactory;->favoriteRetailersManagerFactoryProvider:Ljavax/inject/Provider;

    .line 58
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideMvpPresenterFactory;->loadRetailersVariantProvider:Ljavax/inject/Provider;

    .line 59
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideMvpPresenterFactory;->loadRetailerCategoriesVariantProvider:Ljavax/inject/Provider;

    .line 60
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideMvpPresenterFactory;->accountTrackingProvider:Ljavax/inject/Provider;

    .line 61
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideMvpPresenterFactory;->categoryGalleryReducerProvider:Ljavax/inject/Provider;

    .line 62
    iput-object p9, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideMvpPresenterFactory;->contentMapperProvider:Ljavax/inject/Provider;

    .line 63
    iput-object p10, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideMvpPresenterFactory;->userStateProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideMvpPresenterFactory;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/CategoryHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mappers/ContentMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideMvpPresenterFactory;"
        }
    .end annotation

    .line 116
    new-instance v11, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideMvpPresenterFactory;

    move-object v0, v11

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v0 .. v10}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideMvpPresenterFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v11
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenter;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/CategoryHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mappers/ContentMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenter;"
        }
    .end annotation

    .line 94
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    .line 95
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/helper/retailer/CategoryHelper;

    .line 96
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

    .line 97
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    .line 98
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;

    .line 99
    invoke-interface {p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;

    .line 100
    invoke-interface/range {p7 .. p7}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;

    .line 101
    invoke-interface/range {p8 .. p8}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ibotta/android/mappers/ContentMapper;

    .line 102
    invoke-interface/range {p9 .. p9}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/ibotta/android/state/user/UserState;

    move-object p1, v0

    move-object p2, v1

    move-object p3, v2

    move-object p4, v3

    move-object p5, v4

    move-object p6, v5

    move-object/from16 p7, v6

    move-object/from16 p8, v7

    move-object/from16 p9, v8

    .line 92
    invoke-static/range {p0 .. p9}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideMvpPresenterFactory;->proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/retailer/CategoryHelper;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;Lcom/ibotta/android/mappers/ContentMapper;Lcom/ibotta/android/state/user/UserState;)Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenter;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/retailer/CategoryHelper;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;Lcom/ibotta/android/mappers/ContentMapper;Lcom/ibotta/android/state/user/UserState;)Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenter;
    .locals 0

    .line 141
    invoke-virtual/range {p0 .. p9}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;->provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/retailer/CategoryHelper;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;Lcom/ibotta/android/mappers/ContentMapper;Lcom/ibotta/android/state/user/UserState;)Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenter;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 140
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenter;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenter;
    .locals 10

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideMvpPresenterFactory;->categoryHelperProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideMvpPresenterFactory;->favoriteRetailersManagerFactoryProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideMvpPresenterFactory;->loadRetailersVariantProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideMvpPresenterFactory;->loadRetailerCategoriesVariantProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideMvpPresenterFactory;->accountTrackingProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideMvpPresenterFactory;->categoryGalleryReducerProvider:Ljavax/inject/Provider;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideMvpPresenterFactory;->contentMapperProvider:Ljavax/inject/Provider;

    iget-object v9, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideMvpPresenterFactory;->userStateProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v9}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideMvpPresenterFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 17
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideMvpPresenterFactory;->get()Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenter;

    move-result-object v0

    return-object v0
.end method
