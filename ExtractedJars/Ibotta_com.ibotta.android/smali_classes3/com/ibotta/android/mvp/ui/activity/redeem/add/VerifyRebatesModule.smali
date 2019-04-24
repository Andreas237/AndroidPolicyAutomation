.class public Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "VerifyRebatesModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/helper/offer/OfferCategoryHelper;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/api/rules/ScanRules;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/title/TitleBarReducer;)Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;
    .locals 10
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 37
    new-instance v9, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;

    move-object v0, v9

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/helper/offer/OfferCategoryHelper;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/api/rules/ScanRules;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/title/TitleBarReducer;)V

    return-object v9
.end method
