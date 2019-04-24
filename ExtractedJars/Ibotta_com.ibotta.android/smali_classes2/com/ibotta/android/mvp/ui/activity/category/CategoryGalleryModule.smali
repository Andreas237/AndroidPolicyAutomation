.class public Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "CategoryGalleryModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryView;",
        ">;"
    }
.end annotation


# instance fields
.field private final categoryGalleryView:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryView;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    .line 35
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;->categoryGalleryView:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryView;

    return-void
.end method

.method public static synthetic lambda$provideCategoryGalleryEventContextProvider$0(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 0

    .line 72
    invoke-interface {p1, p2}, Lcom/ibotta/android/tracking/EventContextProvider;->provideContext(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    .line 73
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;->categoryGalleryView:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryView;->getRetailerCategoryId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setRetailerCategoryId(Ljava/lang/Integer;)V

    return-void
.end method


# virtual methods
.method provideCategoryGalleryEventContextProvider(Lcom/ibotta/android/tracking/EventContextProvider;)Lcom/ibotta/android/tracking/EventContextProvider;
    .locals 1
    .param p1    # Lcom/ibotta/android/tracking/EventContextProvider;
        .annotation runtime Ljavax/inject/Named;
            value = "CategoryEventContextProvider"
        .end annotation
    .end param
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "CategoryGalleryEventContextProvider"
    .end annotation

    .line 71
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/category/-$$Lambda$CategoryGalleryModule$jmbhE7Su8kLmOZt_7PmaJ13KclM;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/category/-$$Lambda$CategoryGalleryModule$jmbhE7Su8kLmOZt_7PmaJ13KclM;-><init>(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;Lcom/ibotta/android/tracking/EventContextProvider;)V

    return-object v0
.end method

.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/retailer/CategoryHelper;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;Lcom/ibotta/android/mappers/ContentMapper;Lcom/ibotta/android/state/user/UserState;)Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenter;
    .locals 11
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 50
    new-instance v10, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;

    move-object v0, v10

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/retailer/CategoryHelper;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;Lcom/ibotta/android/mappers/ContentMapper;Lcom/ibotta/android/state/user/UserState;)V

    return-object v10
.end method

.method public provideScrollingBottomSpace()Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 64
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;-><init>()V

    .line 65
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;->build()Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    move-result-object v0

    return-object v0
.end method

.method public providesAccountTracking(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;
    .locals 1
    .param p2    # Lcom/ibotta/android/tracking/EventContextProvider;
        .annotation runtime Ljavax/inject/Named;
            value = "CategoryGalleryEventContextProvider"
        .end annotation
    .end param
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 82
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;

    invoke-direct {v0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    return-object v0
.end method
