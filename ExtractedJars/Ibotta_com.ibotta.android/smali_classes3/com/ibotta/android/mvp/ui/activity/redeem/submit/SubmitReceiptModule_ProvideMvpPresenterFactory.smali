.class public final Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;
.super Ljava/lang/Object;
.source "SubmitReceiptModule_ProvideMvpPresenterFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;",
        ">;"
    }
.end annotation


# instance fields
.field private final appHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final appTimingTrackerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/timing/AppTimingTracker;",
            ">;"
        }
    .end annotation
.end field

.field private final brazeTrackingProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/braze/BrazeTracking;",
            ">;"
        }
    .end annotation
.end field

.field private final buildProfileProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;"
        }
    .end annotation
.end field

.field private final cacheClearFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/CacheClearJobFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final graphQLCallFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final handlerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field

.field private final ibottaApolloCacheProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule;

.field private final mvpPresenterActionsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;"
        }
    .end annotation
.end field

.field private final offerHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final receiptSubmissionHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/submission/ReceiptSubmissionHelper;",
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

.field private final verificationManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/verification/VerificationManager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/verification/VerificationManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/submission/ReceiptSubmissionHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/braze/BrazeTracking;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/timing/AppTimingTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/CacheClearJobFactory;",
            ">;)V"
        }
    .end annotation

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule;

    .line 71
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    .line 72
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->appHelperProvider:Ljavax/inject/Provider;

    .line 73
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->offerHelperProvider:Ljavax/inject/Provider;

    .line 74
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->verificationManagerProvider:Ljavax/inject/Provider;

    .line 75
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->handlerProvider:Ljavax/inject/Provider;

    .line 76
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->receiptSubmissionHelperProvider:Ljavax/inject/Provider;

    .line 77
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->brazeTrackingProvider:Ljavax/inject/Provider;

    .line 78
    iput-object p9, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->ibottaApolloCacheProvider:Ljavax/inject/Provider;

    .line 79
    iput-object p10, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    .line 80
    iput-object p11, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->buildProfileProvider:Ljavax/inject/Provider;

    .line 81
    iput-object p12, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->appTimingTrackerProvider:Ljavax/inject/Provider;

    .line 82
    iput-object p13, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->userStateProvider:Ljavax/inject/Provider;

    .line 83
    iput-object p14, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->cacheClearFactoryProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/verification/VerificationManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/submission/ReceiptSubmissionHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/braze/BrazeTracking;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/timing/AppTimingTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/CacheClearJobFactory;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;"
        }
    .end annotation

    .line 152
    new-instance v15, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;

    move-object v0, v15

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    invoke-direct/range {v0 .. v14}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v15
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/verification/VerificationManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/submission/ReceiptSubmissionHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/braze/BrazeTracking;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/timing/AppTimingTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/CacheClearJobFactory;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;"
        }
    .end annotation

    .line 122
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    .line 123
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/util/AppHelper;

    .line 124
    invoke-interface/range {p3 .. p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 125
    invoke-interface/range {p4 .. p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/verification/VerificationManager;

    .line 126
    invoke-interface/range {p5 .. p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/os/Handler;

    .line 127
    invoke-interface/range {p6 .. p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ibotta/android/submission/ReceiptSubmissionHelper;

    .line 128
    invoke-interface/range {p7 .. p7}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ibotta/android/tracking/braze/BrazeTracking;

    .line 129
    invoke-interface/range {p8 .. p8}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    .line 130
    invoke-interface/range {p9 .. p9}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 131
    invoke-interface/range {p10 .. p10}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/ibotta/android/profile/BuildProfile;

    .line 132
    invoke-interface/range {p11 .. p11}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/ibotta/android/tracking/timing/AppTimingTracker;

    .line 133
    invoke-interface/range {p12 .. p12}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/ibotta/android/state/user/UserState;

    .line 134
    invoke-interface/range {p13 .. p13}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-object p1, v0

    move-object p2, v1

    move-object/from16 p3, v2

    move-object/from16 p4, v3

    move-object/from16 p5, v4

    move-object/from16 p6, v5

    move-object/from16 p7, v6

    move-object/from16 p8, v7

    move-object/from16 p9, v8

    move-object/from16 p10, v9

    move-object/from16 p11, v10

    move-object/from16 p12, v11

    move-object/from16 p13, v12

    .line 120
    invoke-static/range {p0 .. p13}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/verification/VerificationManager;Landroid/os/Handler;Lcom/ibotta/android/submission/ReceiptSubmissionHelper;Lcom/ibotta/android/tracking/braze/BrazeTracking;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/verification/VerificationManager;Landroid/os/Handler;Lcom/ibotta/android/submission/ReceiptSubmissionHelper;Lcom/ibotta/android/tracking/braze/BrazeTracking;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;
    .locals 0

    .line 185
    invoke-virtual/range {p0 .. p13}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule;->provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/verification/VerificationManager;Landroid/os/Handler;Lcom/ibotta/android/submission/ReceiptSubmissionHelper;Lcom/ibotta/android/tracking/braze/BrazeTracking;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 184
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;
    .locals 14

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->appHelperProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->offerHelperProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->verificationManagerProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->handlerProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->receiptSubmissionHelperProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->brazeTrackingProvider:Ljavax/inject/Provider;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->ibottaApolloCacheProvider:Ljavax/inject/Provider;

    iget-object v9, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    iget-object v10, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->buildProfileProvider:Ljavax/inject/Provider;

    iget-object v11, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->appTimingTrackerProvider:Ljavax/inject/Provider;

    iget-object v12, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->userStateProvider:Ljavax/inject/Provider;

    iget-object v13, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->cacheClearFactoryProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v13}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 21
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->get()Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;

    move-result-object v0

    return-object v0
.end method
