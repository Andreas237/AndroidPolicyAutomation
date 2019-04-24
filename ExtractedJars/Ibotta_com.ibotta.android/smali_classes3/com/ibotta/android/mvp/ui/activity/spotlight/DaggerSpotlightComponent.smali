.class public final Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;
.super Ljava/lang/Object;
.source "DaggerSpotlightComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getRetailerIconOnOfferVariant;,
        Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;,
        Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getIbottaListViewStyleReducer;,
        Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getRecentlyViewedOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getIbottaApolloCache;,
        Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getTrackingQueue;,
        Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getContentListReducerUtil;,
        Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getContentCardReducer;,
        Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getAlsoBoughtViewedVariant;,
        Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;,
        Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getBrazeTrackingUtil;,
        Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getBrazeTracking;,
        Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;,
        Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getStorageSiloState;,
        Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getVerificationManager;,
        Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getAppCache;,
        Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getUserState;,
        Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getBonusBucketedComparator;,
        Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getBonusHelper;,
        Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;,
        Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getAppHelper;,
        Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getScanRules;,
        Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;
    }
.end annotation


# instance fields
.field private getAlsoBoughtViewedVariantProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getAlsoBoughtViewedVariant;

.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppCacheProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getAppCache;

.field private getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getAppHelper;

.field private getBonusBucketedComparatorProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getBonusBucketedComparator;

.field private getBonusHelperProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getBonusHelper;

.field private getBrazeTrackingProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getBrazeTracking;

.field private getBrazeTrackingUtilProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getBrazeTrackingUtil;

.field private getContentCardReducerProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getContentCardReducer;

.field private getContentListReducerUtilProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getContentListReducerUtil;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getIbottaApolloCacheProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getIbottaApolloCache;

.field private getIbottaListViewStyleReducerProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getIbottaListViewStyleReducer;

.field private getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getRecentlyViewedOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getRecentlyViewedOfferHelper;

.field private getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

.field private getRetailerIconOnOfferVariantProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getRetailerIconOnOfferVariant;

.field private getScanRulesProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getScanRules;

.field private getStorageSiloStateProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getStorageSiloState;

.field private getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

.field private getTrackingQueueProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getTrackingQueue;

.field private getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getUserState;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private getVerificationManagerProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;",
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

.field private provideSpotlightPresenterHelperProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideSpotlightPresenterHelperFactory;

.field private provideSpotlightReducerProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideSpotlightReducerFactory;


# direct methods
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)V
    .locals 0

    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 125
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$1;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;
    .locals 2

    .line 129
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)V
    .locals 25

    move-object/from16 v0, p0

    .line 136
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule;

    move-result-object v1

    invoke-static {v1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v1

    .line 135
    invoke-static {v1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 137
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 138
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 139
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getScanRules;

    .line 140
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getScanRules;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getScanRulesProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getScanRules;

    .line 141
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 142
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getAppHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 143
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    .line 144
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    .line 145
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 146
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 147
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getBonusHelper;

    .line 148
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getBonusHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getBonusHelperProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getBonusHelper;

    .line 149
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getBonusBucketedComparator;

    .line 150
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getBonusBucketedComparator;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getBonusBucketedComparatorProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getBonusBucketedComparator;

    .line 151
    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    iget-object v2, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    iget-object v3, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getBonusHelperProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getBonusHelper;

    iget-object v5, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getBonusBucketedComparatorProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getBonusBucketedComparator;

    .line 152
    invoke-static {v1, v2, v3, v4, v5}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideSpotlightPresenterHelperFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideSpotlightPresenterHelperFactory;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->provideSpotlightPresenterHelperProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideSpotlightPresenterHelperFactory;

    .line 158
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 159
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 160
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getAppCache;

    .line 161
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getAppCache;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getAppCacheProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getAppCache;

    .line 162
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

    .line 163
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getVerificationManager;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getVerificationManagerProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

    .line 164
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getStorageSiloState;

    .line 165
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getStorageSiloState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getStorageSiloStateProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getStorageSiloState;

    .line 166
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 167
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 168
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getBrazeTracking;

    .line 169
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getBrazeTracking;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getBrazeTrackingProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getBrazeTracking;

    .line 170
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getBrazeTrackingUtil;

    .line 171
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getBrazeTrackingUtil;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getBrazeTrackingUtilProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getBrazeTrackingUtil;

    .line 172
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    .line 173
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    .line 174
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getAlsoBoughtViewedVariant;

    .line 175
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getAlsoBoughtViewedVariant;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getAlsoBoughtViewedVariantProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getAlsoBoughtViewedVariant;

    .line 176
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getContentCardReducer;

    .line 177
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getContentCardReducer;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getContentCardReducerProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getContentCardReducer;

    .line 178
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getContentListReducerUtil;

    .line 179
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getContentListReducerUtil;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getContentListReducerUtilProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getContentListReducerUtil;

    .line 180
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getTrackingQueue;

    .line 181
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getTrackingQueue;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getTrackingQueueProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getTrackingQueue;

    .line 182
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getIbottaApolloCache;

    .line 183
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getIbottaApolloCache;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getIbottaApolloCacheProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getIbottaApolloCache;

    .line 184
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getRecentlyViewedOfferHelper;

    .line 185
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getRecentlyViewedOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getRecentlyViewedOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getRecentlyViewedOfferHelper;

    .line 186
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getIbottaListViewStyleReducer;

    .line 188
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getIbottaListViewStyleReducer;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getIbottaListViewStyleReducerProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getIbottaListViewStyleReducer;

    .line 189
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 190
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 191
    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 192
    invoke-static {v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideSpotlightReducerFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideSpotlightReducerFactory;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->provideSpotlightReducerProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideSpotlightReducerFactory;

    .line 193
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getRetailerIconOnOfferVariant;

    .line 195
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getRetailerIconOnOfferVariant;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getRetailerIconOnOfferVariantProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getRetailerIconOnOfferVariant;

    .line 199
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule;

    move-result-object v3

    iget-object v4, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v5, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getScanRulesProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getScanRules;

    iget-object v6, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->provideSpotlightPresenterHelperProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideSpotlightPresenterHelperFactory;

    .line 203
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideBarcodeScanHelperFactory;->create()Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideBarcodeScanHelperFactory;

    move-result-object v7

    iget-object v8, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v9, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getAppCacheProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getAppCache;

    iget-object v10, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getVerificationManagerProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

    iget-object v11, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getStorageSiloStateProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getStorageSiloState;

    iget-object v12, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    iget-object v13, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getBrazeTrackingProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getBrazeTracking;

    iget-object v14, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getBrazeTrackingUtilProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getBrazeTrackingUtil;

    iget-object v15, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getAlsoBoughtViewedVariantProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getAlsoBoughtViewedVariant;

    move-object/from16 v16, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getContentCardReducerProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getContentCardReducer;

    move-object/from16 v17, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getContentListReducerUtilProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getContentListReducerUtil;

    move-object/from16 v18, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getTrackingQueueProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getTrackingQueue;

    move-object/from16 v19, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getIbottaApolloCacheProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getIbottaApolloCache;

    move-object/from16 v20, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getRecentlyViewedOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getRecentlyViewedOfferHelper;

    move-object/from16 v21, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getIbottaListViewStyleReducerProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getIbottaListViewStyleReducer;

    move-object/from16 v22, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->provideSpotlightReducerProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideSpotlightReducerFactory;

    move-object/from16 v23, v1

    iget-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getRetailerIconOnOfferVariantProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getRetailerIconOnOfferVariant;

    move-object/from16 v24, v1

    .line 198
    invoke-static/range {v3 .. v24}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideMvpPresenterFactory;

    move-result-object v1

    .line 197
    invoke-static {v1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 221
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 222
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 223
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 224
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 225
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 226
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 227
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 228
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 232
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule;

    move-result-object v3

    iget-object v4, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v5, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v6, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v7, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v8, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 231
    invoke-static/range {v3 .. v8}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v1

    .line 230
    invoke-static {v1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 238
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectSpotlightActivity(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;)Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 266
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 269
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 268
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 266
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 271
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 274
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 273
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 271
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 276
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 279
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 278
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 276
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 281
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 284
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 283
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 281
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 286
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 289
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 288
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 286
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 291
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 294
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 293
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 291
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 296
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 299
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 298
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 296
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 301
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 304
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 303
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 301
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 306
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 309
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 308
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 306
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 311
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 314
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 313
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 311
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 316
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 319
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 318
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 316
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 321
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 324
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 323
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 321
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 326
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 329
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 328
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 326
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 331
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 334
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 333
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 331
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 336
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 339
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getFormatting()Lcom/ibotta/android/util/Formatting;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 338
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    .line 336
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/util/Formatting;)V

    .line 341
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 344
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 343
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 341
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 346
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 349
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getOfferHelper()Lcom/ibotta/api/helper/offer/OfferHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 348
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 346
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->injectOfferHelper(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/api/helper/offer/OfferHelper;)V

    .line 351
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 354
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUserState()Lcom/ibotta/android/state/user/UserState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 353
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/UserState;

    .line 351
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->injectUserState(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/state/user/UserState;)V

    .line 356
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 359
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppConfig()Lcom/ibotta/android/state/app/config/AppConfig;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 358
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/AppConfig;

    .line 356
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->injectAppConfig(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/state/app/config/AppConfig;)V

    .line 361
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 364
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getFileProviderHelper()Lcom/ibotta/android/share/FileProviderHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 363
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/share/FileProviderHelper;

    .line 361
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->injectFileProviderHelper(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/share/FileProviderHelper;)V

    .line 366
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 369
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBrazeTracking()Lcom/ibotta/android/tracking/braze/BrazeTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 368
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/braze/BrazeTracking;

    .line 366
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->injectBrazeTracking(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/tracking/braze/BrazeTracking;)V

    .line 371
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 374
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 373
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 371
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 376
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 379
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRecentlyViewedOfferHelper()Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 378
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;

    .line 376
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->injectRecentlyViewedOfferHelper(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;)V

    .line 381
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 384
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getPipelineFactory()Lcom/ibotta/android/util/pipeline/PipelineFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 383
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/pipeline/PipelineFactory;

    .line 381
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->injectPipelineFactory(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/util/pipeline/PipelineFactory;)V

    .line 386
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 389
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 388
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 386
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 43
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;
    .locals 1

    .line 251
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 43
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;
    .locals 1

    .line 246
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 256
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 43
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;)V
    .locals 0

    .line 261
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/DaggerSpotlightComponent;->injectSpotlightActivity(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;)Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;)V
    .locals 0

    return-void
.end method
