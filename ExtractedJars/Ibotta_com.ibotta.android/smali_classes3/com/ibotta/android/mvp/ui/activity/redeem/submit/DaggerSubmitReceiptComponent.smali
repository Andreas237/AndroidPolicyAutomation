.class public final Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;
.super Ljava/lang/Object;
.source "DaggerSubmitReceiptComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getUserState;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getAppTimingTracker;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getBuildProfile;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getIbottaApolloCache;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getBrazeTracking;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getReceiptSubmissionHelper;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getHandler;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getVerificationManager;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getAppHelper;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getAppHelper;

.field private getAppTimingTrackerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getAppTimingTracker;

.field private getBrazeTrackingProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getBrazeTracking;

.field private getBuildProfileProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getBuildProfile;

.field private getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

.field private getHandlerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getHandler;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getIbottaApolloCacheProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getIbottaApolloCache;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getReceiptSubmissionHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getReceiptSubmissionHelper;

.field private getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getUserState;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private getVerificationManagerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;)V
    .locals 0

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$1;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;
    .locals 2

    .line 86
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;)V
    .locals 17

    move-object/from16 v0, p0

    .line 93
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule;

    move-result-object v1

    invoke-static {v1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v1

    .line 92
    invoke-static {v1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 94
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 95
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 96
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 97
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getAppHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 98
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 99
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 100
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

    .line 101
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getVerificationManager;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getVerificationManagerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

    .line 102
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getHandler;

    .line 103
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getHandler;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getHandlerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getHandler;

    .line 104
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getReceiptSubmissionHelper;

    .line 105
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getReceiptSubmissionHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getReceiptSubmissionHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getReceiptSubmissionHelper;

    .line 106
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getBrazeTracking;

    .line 107
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getBrazeTracking;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getBrazeTrackingProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getBrazeTracking;

    .line 108
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getIbottaApolloCache;

    .line 109
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getIbottaApolloCache;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getIbottaApolloCacheProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getIbottaApolloCache;

    .line 110
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 111
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 112
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getBuildProfile;

    .line 113
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getBuildProfile;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getBuildProfileProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getBuildProfile;

    .line 114
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getAppTimingTracker;

    .line 115
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getAppTimingTracker;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getAppTimingTrackerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getAppTimingTracker;

    .line 116
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 117
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 118
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 119
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 123
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule;

    move-result-object v3

    iget-object v4, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v5, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    iget-object v6, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v7, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getVerificationManagerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

    iget-object v8, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getHandlerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getHandler;

    iget-object v9, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getReceiptSubmissionHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getReceiptSubmissionHelper;

    iget-object v10, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getBrazeTrackingProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getBrazeTracking;

    iget-object v11, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getIbottaApolloCacheProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getIbottaApolloCache;

    iget-object v12, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    iget-object v13, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getBuildProfileProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getBuildProfile;

    iget-object v14, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getAppTimingTrackerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getAppTimingTracker;

    iget-object v15, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    move-object/from16 v16, v1

    .line 122
    invoke-static/range {v3 .. v16}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule_ProvideMvpPresenterFactory;

    move-result-object v1

    .line 121
    invoke-static {v1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 137
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 138
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 139
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 140
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 141
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 142
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 143
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 144
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 148
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule;

    move-result-object v3

    iget-object v4, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v5, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v6, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v7, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v8, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 147
    invoke-static/range {v3 .. v8}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v1

    .line 146
    invoke-static {v1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 154
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectSubmitReceiptActivity(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;)Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 182
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 185
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 184
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 182
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 187
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 190
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 189
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 187
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 192
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 195
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 194
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 192
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 197
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 200
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 199
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 197
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 202
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 205
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 204
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 202
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 210
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 209
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 207
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 212
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 215
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 214
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 212
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 217
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 220
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 219
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 217
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 222
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 225
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 224
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 222
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 227
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 230
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 229
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 227
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 232
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 235
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 234
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 232
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 237
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 240
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 239
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 237
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 242
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 245
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 244
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 242
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 247
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 250
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 249
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 247
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 252
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 255
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getStorageSiloState()Lcom/ibotta/android/state/xprocess/StorageSiloState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 254
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/xprocess/StorageSiloState;

    .line 252
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_MembersInjector;->injectStorageSiloState(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;Lcom/ibotta/android/state/xprocess/StorageSiloState;)V

    .line 257
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 260
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getFormatting()Lcom/ibotta/android/util/Formatting;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 259
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    .line 257
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;Lcom/ibotta/android/util/Formatting;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 32
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;
    .locals 1

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 32
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 172
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 32
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;)V
    .locals 0

    .line 177
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->injectSubmitReceiptActivity(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;)Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;)V
    .locals 0

    return-void
.end method
