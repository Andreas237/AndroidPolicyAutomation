.class public final Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;
.super Ljava/lang/Object;
.source "DaggerEngagementComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;,
        Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;,
        Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;,
        Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getAppTimingTracker;,
        Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getIbottaApolloCache;,
        Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;,
        Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getApiJobFactory;,
        Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getBrazeTrackingUtil;,
        Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getBrazeTracking;,
        Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getRewardHelper;,
        Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;,
        Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;,
        Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getAppHelper;,
        Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getUserState;,
        Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getApiJobFactory;

.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getAppHelper;

.field private getAppTimingTrackerProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getAppTimingTracker;

.field private getBrazeTrackingProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getBrazeTracking;

.field private getBrazeTrackingUtilProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getBrazeTrackingUtil;

.field private getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

.field private getFavoriteRetailersManagerFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getIbottaApolloCacheProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getIbottaApolloCache;

.field private getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

.field private getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

.field private getRewardHelperProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getRewardHelper;

.field private getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getUserState;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;",
            ">;"
        }
    .end annotation
.end field

.field private provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;)V
    .locals 0

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 93
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$1;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;
    .locals 2

    .line 97
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;)V
    .locals 20

    move-object/from16 v0, p0

    .line 104
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule;

    move-result-object v1

    invoke-static {v1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v1

    .line 103
    invoke-static {v1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 105
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 106
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 107
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 108
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 109
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 110
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getAppHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 111
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    .line 112
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    .line 113
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    .line 114
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    .line 115
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 116
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 117
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getRewardHelper;

    .line 118
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getRewardHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getRewardHelperProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getRewardHelper;

    .line 119
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getBrazeTracking;

    .line 120
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getBrazeTracking;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getBrazeTrackingProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getBrazeTracking;

    .line 121
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getBrazeTrackingUtil;

    .line 122
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getBrazeTrackingUtil;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getBrazeTrackingUtilProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getBrazeTrackingUtil;

    .line 123
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getApiJobFactory;

    .line 124
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getApiJobFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getApiJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getApiJobFactory;

    .line 125
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 126
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 127
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getIbottaApolloCache;

    .line 128
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getIbottaApolloCache;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getIbottaApolloCacheProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getIbottaApolloCache;

    .line 129
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getAppTimingTracker;

    .line 130
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getAppTimingTracker;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getAppTimingTrackerProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getAppTimingTracker;

    .line 131
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;

    .line 133
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getFavoriteRetailersManagerFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;

    .line 134
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    .line 135
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    .line 136
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 137
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 141
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule;

    move-result-object v3

    iget-object v4, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v5, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v6, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    iget-object v7, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    iget-object v8, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    iget-object v9, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v10, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getRewardHelperProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getRewardHelper;

    iget-object v11, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getBrazeTrackingProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getBrazeTracking;

    iget-object v12, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getBrazeTrackingUtilProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getBrazeTrackingUtil;

    iget-object v13, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getApiJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getApiJobFactory;

    iget-object v14, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    iget-object v15, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getIbottaApolloCacheProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getIbottaApolloCache;

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getAppTimingTrackerProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getAppTimingTracker;

    move-object/from16 v16, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getFavoriteRetailersManagerFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;

    move-object/from16 v17, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    move-object/from16 v18, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    move-object/from16 v19, v1

    .line 140
    invoke-static/range {v3 .. v19}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule_ProvideMvpPresenterFactory;

    move-result-object v1

    .line 139
    invoke-static {v1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 158
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 159
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 160
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 161
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 162
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 163
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 164
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 165
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 169
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementModule;

    move-result-object v3

    iget-object v4, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v5, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v6, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v7, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v8, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 168
    invoke-static/range {v3 .. v8}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v1

    .line 167
    invoke-static {v1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 175
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectEngagementActivity(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 203
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 206
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 205
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 203
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 208
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 211
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 210
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 208
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 213
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 216
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 215
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 213
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 218
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 221
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 220
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 218
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 223
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 226
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 225
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 223
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 228
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 231
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 230
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 228
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 233
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 236
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 235
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 233
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 238
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 241
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 240
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 238
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 243
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 246
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 245
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 243
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 248
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 251
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 250
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 248
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 253
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 256
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 255
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 253
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 258
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 261
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 260
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 258
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 263
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 266
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 265
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 263
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 268
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 271
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 270
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 268
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 273
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 276
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getPixelTrackingManager()Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 275
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    .line 273
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity_MembersInjector;->injectPixelTrackingManager(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;)V

    .line 278
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 281
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingQueue()Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 280
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    .line 278
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity_MembersInjector;->injectTrackingQueue(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 35
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;
    .locals 1

    .line 188
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 35
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;
    .locals 1

    .line 183
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 193
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 35
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;)V
    .locals 0

    .line 198
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/DaggerEngagementComponent;->injectEngagementActivity(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;)V
    .locals 0

    return-void
.end method
