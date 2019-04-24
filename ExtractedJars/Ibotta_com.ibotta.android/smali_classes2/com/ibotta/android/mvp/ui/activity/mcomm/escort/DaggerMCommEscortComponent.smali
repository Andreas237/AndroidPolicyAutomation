.class public final Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;
.super Ljava/lang/Object;
.source "DaggerMCommEscortComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getResources;,
        Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;,
        Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getTrackingQueue;,
        Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getAppHelper;,
        Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getMCommEscortStrategyFactory;,
        Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getAppConfig;,
        Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getButtonSdkManager;,
        Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getAppConfig;

.field private getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getAppHelper;

.field private getButtonSdkManagerProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getButtonSdkManager;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getMCommEscortStrategyFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getMCommEscortStrategyFactory;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getResourcesProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getResources;

.field private getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

.field private getTrackingQueueProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getTrackingQueue;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMcommEscortReducerProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortModule_ProvideMcommEscortReducerFactory;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$1;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;
    .locals 2

    .line 75
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;)V
    .locals 9

    .line 82
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 81
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 83
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 84
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 85
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getButtonSdkManager;

    .line 86
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getButtonSdkManager;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->getButtonSdkManagerProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getButtonSdkManager;

    .line 87
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    .line 88
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getAppConfig;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    .line 89
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getMCommEscortStrategyFactory;

    .line 91
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getMCommEscortStrategyFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->getMCommEscortStrategyFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getMCommEscortStrategyFactory;

    .line 92
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 93
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getAppHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 94
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getTrackingQueue;

    .line 95
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getTrackingQueue;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->getTrackingQueueProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getTrackingQueue;

    .line 96
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 97
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 98
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getResources;

    .line 99
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getResources;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->getResourcesProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getResources;

    .line 100
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->getResourcesProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getResources;

    .line 101
    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortModule_ProvideMcommEscortReducerFactory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortModule_ProvideMcommEscortReducerFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->provideMcommEscortReducerProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortModule_ProvideMcommEscortReducerFactory;

    .line 106
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortModule;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->getButtonSdkManagerProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getButtonSdkManager;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->getMCommEscortStrategyFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getMCommEscortStrategyFactory;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->getTrackingQueueProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getTrackingQueue;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->provideMcommEscortReducerProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortModule_ProvideMcommEscortReducerFactory;

    .line 105
    invoke-static/range {v1 .. v8}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 104
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 114
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 115
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 116
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 117
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 118
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 119
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 120
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 121
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 122
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 123
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 127
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 126
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 125
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 133
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectMCommEscortActivity(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 161
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 164
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 163
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 161
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 169
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 168
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 166
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 174
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 173
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 171
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 176
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 179
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 178
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 176
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 181
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 184
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 183
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 181
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 186
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 189
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 188
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 186
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 194
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 193
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 191
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 196
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 199
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 198
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 196
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 201
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 204
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 203
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 201
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 206
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 209
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 208
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 206
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 211
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 214
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 213
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 211
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 216
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 219
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 218
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 216
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 221
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 224
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 223
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 221
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 226
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 229
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 228
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 226
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 231
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 234
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 233
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 231
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 236
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 239
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 238
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 236
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;Landroid/os/Handler;)V

    .line 241
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 244
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getImageCache()Lcom/ibotta/android/images/ImageCache;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 243
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    .line 241
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;Lcom/ibotta/android/images/ImageCache;)V

    .line 246
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 249
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getFormatting()Lcom/ibotta/android/util/Formatting;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 248
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    .line 246
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;Lcom/ibotta/android/util/Formatting;)V

    .line 251
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 254
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUserState()Lcom/ibotta/android/state/user/UserState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 253
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/UserState;

    .line 251
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity_MembersInjector;->injectUserState(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;Lcom/ibotta/android/state/user/UserState;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 28
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenter;
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 28
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 28
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;)V
    .locals 0

    .line 156
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;->injectMCommEscortActivity(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;)V
    .locals 0

    return-void
.end method
