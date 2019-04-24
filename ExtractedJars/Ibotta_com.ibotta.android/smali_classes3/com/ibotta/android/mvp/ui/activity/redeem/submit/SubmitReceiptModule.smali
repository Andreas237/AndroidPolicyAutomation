.class public Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "SubmitReceiptModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/verification/VerificationManager;Landroid/os/Handler;Lcom/ibotta/android/submission/ReceiptSubmissionHelper;Lcom/ibotta/android/tracking/braze/BrazeTracking;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;
    .locals 15
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 49
    new-instance v14, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;

    move-object v0, v14

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    invoke-direct/range {v0 .. v13}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/verification/VerificationManager;Landroid/os/Handler;Lcom/ibotta/android/submission/ReceiptSubmissionHelper;Lcom/ibotta/android/tracking/braze/BrazeTracking;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    return-object v14
.end method
