.class public Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "CantFindItRetailerModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerView;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/retailer/ContentWithInfoRowReducer;Lcom/ibotta/android/mappers/ContentMapper;)Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenter;
    .locals 9
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 35
    new-instance v8, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;

    move-object v0, v8

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/retailer/ContentWithInfoRowReducer;Lcom/ibotta/android/mappers/ContentMapper;)V

    return-object v8
.end method
