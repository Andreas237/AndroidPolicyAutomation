.class public final Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;
.super Ljava/lang/Object;
.source "DaggerPersonalStoresComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;,
        Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getAppConfig;,
        Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getApiJobFactory;,
        Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;,
        Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;,
        Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getTracker;,
        Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getAppCache;,
        Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getUserState;,
        Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailerSettingsFlushWorker;,
        Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;,
        Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getApiJobFactory;

.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppCacheProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getAppCache;

.field private getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getAppConfig;

.field private getFavoriteRetailerSettingsFlushWorkerProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailerSettingsFlushWorker;

.field private getFavoriteRetailersManagerFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

.field private getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

.field private getTrackerProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getTracker;

.field private getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getUserState;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;",
            ">;"
        }
    .end annotation
.end field

.field private providePersonalRetailerFinderFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactory;",
            ">;"
        }
    .end annotation
.end field

.field private providePersonalStoresReducerProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvidePersonalStoresReducerFactory;

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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;)V
    .locals 0

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$1;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;
    .locals 2

    .line 90
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;)V
    .locals 12

    .line 97
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 96
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 98
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 99
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 100
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;

    .line 102
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getFavoriteRetailersManagerFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;

    .line 103
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailerSettingsFlushWorker;

    .line 105
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailerSettingsFlushWorker;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getFavoriteRetailerSettingsFlushWorkerProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailerSettingsFlushWorker;

    .line 106
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 107
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 108
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getAppCache;

    .line 109
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getAppCache;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getAppCacheProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getAppCache;

    .line 110
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getTracker;

    .line 111
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getTracker;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getTrackerProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getTracker;

    .line 112
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    .line 113
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    .line 114
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 115
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 117
    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvidePersonalStoresReducerFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvidePersonalStoresReducerFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->providePersonalStoresReducerProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvidePersonalStoresReducerFactory;

    .line 118
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getApiJobFactory;

    .line 119
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getApiJobFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getApiJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getApiJobFactory;

    .line 120
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    .line 121
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getAppConfig;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    .line 122
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    .line 123
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    .line 127
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    .line 126
    invoke-static {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvidePersonalRetailerFinderFactoryFactory;->create(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvidePersonalRetailerFinderFactoryFactory;

    move-result-object v0

    .line 125
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->providePersonalRetailerFinderFactoryProvider:Ljavax/inject/Provider;

    .line 131
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getFavoriteRetailersManagerFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getFavoriteRetailerSettingsFlushWorkerProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailerSettingsFlushWorker;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getAppCacheProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getAppCache;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getTrackerProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getTracker;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    iget-object v9, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->providePersonalStoresReducerProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvidePersonalStoresReducerFactory;

    iget-object v10, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getApiJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getApiJobFactory;

    iget-object v11, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->providePersonalRetailerFinderFactoryProvider:Ljavax/inject/Provider;

    .line 130
    invoke-static/range {v1 .. v11}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 129
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 142
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 143
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 144
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 145
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 146
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 147
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 148
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 149
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 150
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 151
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 155
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 154
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 153
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 161
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectPersonalStoresActivity(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;)Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 189
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 192
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 191
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 189
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 194
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 197
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 196
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 194
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 199
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 202
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 201
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 199
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 204
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 207
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 206
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 204
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 209
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 212
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 211
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 209
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 214
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 217
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 216
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 214
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 219
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 222
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 221
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 219
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 224
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 227
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 226
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 224
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 229
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 232
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 231
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 229
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 234
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 237
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 236
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 234
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 239
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 242
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 241
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 239
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 244
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 247
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 246
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 244
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 249
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 252
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 251
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 249
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 254
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 257
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 256
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 254
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 259
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 262
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 261
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 259
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;Landroid/os/Handler;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 32
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;
    .locals 1

    .line 174
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 32
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;
    .locals 1

    .line 169
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 32
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;)V
    .locals 0

    .line 184
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->injectPersonalStoresActivity(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;)Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;)V
    .locals 0

    return-void
.end method
