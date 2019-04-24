.class public Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "MyFavoritesModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesView;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method

.method public static provideMyFavoritesReducer(Lcom/ibotta/android/title/TitleBarReducer;)Lcom/ibotta/android/account/myfavorites/MyFavoritesReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 30
    new-instance v0, Lcom/ibotta/android/account/myfavorites/MyFavoritesReducer;

    invoke-direct {v0, p0}, Lcom/ibotta/android/account/myfavorites/MyFavoritesReducer;-><init>(Lcom/ibotta/android/title/TitleBarReducer;)V

    return-object v0
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/retailer/CategoryHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/account/myfavorites/MyFavoritesReducer;Lcom/ibotta/android/horiz/RetailerHorizListReducer;)Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenter;
    .locals 9
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 43
    new-instance v8, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;

    move-object v0, v8

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/retailer/CategoryHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/account/myfavorites/MyFavoritesReducer;Lcom/ibotta/android/horiz/RetailerHorizListReducer;)V

    return-object v8
.end method
