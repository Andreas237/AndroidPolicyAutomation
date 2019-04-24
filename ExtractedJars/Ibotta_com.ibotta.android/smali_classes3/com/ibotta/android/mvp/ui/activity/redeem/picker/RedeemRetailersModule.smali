.class public Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "RedeemRetailersModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method

.method public static provideRedeemRetailersReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/redeem/RedeemRetailersReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 53
    new-instance v0, Lcom/ibotta/android/redeem/RedeemRetailersReducer;

    invoke-direct {v0, p0}, Lcom/ibotta/android/redeem/RedeemRetailersReducer;-><init>(Landroid/content/res/Resources;)V

    return-object v0
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionAction;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/redeem/RedeemRetailersReducer;)Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenter;
    .locals 10
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 40
    new-instance v9, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;

    move-object v0, v9

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionAction;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/redeem/RedeemRetailersReducer;)V

    return-object v9
.end method
