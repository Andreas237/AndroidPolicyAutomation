.class public final Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;
.super Ljava/lang/Object;
.source "DaggerSettingComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/settings/SettingComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;,
        Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getLogOutManager;,
        Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getTrackingFlushWorker;,
        Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailerSettingsFlushWorker;,
        Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getBuildProfile;,
        Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getAppConfig;,
        Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getUserState;,
        Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getAppConfig;

.field private getBuildProfileProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getBuildProfile;

.field private getFavoriteRetailerSettingsFlushWorkerProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailerSettingsFlushWorker;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getLogOutManagerProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getLogOutManager;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

.field private getTrackingFlushWorkerProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getTrackingFlushWorker;

.field private getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getUserState;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;",
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

.field private provideSettingReducerProvider:Lcom/ibotta/android/mvp/ui/activity/settings/SettingModule_ProvideSettingReducerFactory;


# direct methods
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$1;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;
    .locals 2

    .line 75
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;)V
    .locals 10

    .line 81
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/settings/SettingModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 82
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 83
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 84
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 85
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 86
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    .line 87
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getAppConfig;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    .line 88
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getBuildProfile;

    .line 89
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getBuildProfile;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->getBuildProfileProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getBuildProfile;

    .line 90
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailerSettingsFlushWorker;

    .line 92
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailerSettingsFlushWorker;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->getFavoriteRetailerSettingsFlushWorkerProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailerSettingsFlushWorker;

    .line 93
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getTrackingFlushWorker;

    .line 94
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getTrackingFlushWorker;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->getTrackingFlushWorkerProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getTrackingFlushWorker;

    .line 95
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getLogOutManager;

    .line 96
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getLogOutManager;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->getLogOutManagerProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getLogOutManager;

    .line 97
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 98
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 99
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 100
    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingModule_ProvideSettingReducerFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/settings/SettingModule_ProvideSettingReducerFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->provideSettingReducerProvider:Lcom/ibotta/android/mvp/ui/activity/settings/SettingModule_ProvideSettingReducerFactory;

    .line 104
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/settings/SettingModule;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->getBuildProfileProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getBuildProfile;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->getFavoriteRetailerSettingsFlushWorkerProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailerSettingsFlushWorker;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->getTrackingFlushWorkerProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getTrackingFlushWorker;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->getLogOutManagerProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getLogOutManager;

    iget-object v9, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->provideSettingReducerProvider:Lcom/ibotta/android/mvp/ui/activity/settings/SettingModule_ProvideSettingReducerFactory;

    .line 103
    invoke-static/range {v1 .. v9}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/settings/SettingModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/settings/SettingModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 102
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 113
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 114
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 115
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 116
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 117
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 118
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 119
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 120
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 121
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 122
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 126
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/settings/SettingModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 125
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 124
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 132
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectSettingActivity(Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;)Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 163
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 162
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 160
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 165
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 168
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 167
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 165
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 170
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 173
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 172
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 170
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 175
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 178
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 177
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 175
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 180
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 183
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 182
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 180
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 185
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 188
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 187
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 185
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 190
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 193
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 192
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 190
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 195
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 198
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 197
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 195
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 200
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 203
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 202
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 200
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 205
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 208
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 207
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 205
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 210
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 213
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 212
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 210
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 215
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 218
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 217
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 215
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 220
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 223
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 222
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 220
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 225
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 228
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 227
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 225
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 28
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenter;
    .locals 1

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 28
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 28
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;)V
    .locals 0

    .line 155
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerSettingComponent;->injectSettingActivity(Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;)Lcom/ibotta/android/mvp/ui/activity/settings/SettingActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;)V
    .locals 0

    return-void
.end method
