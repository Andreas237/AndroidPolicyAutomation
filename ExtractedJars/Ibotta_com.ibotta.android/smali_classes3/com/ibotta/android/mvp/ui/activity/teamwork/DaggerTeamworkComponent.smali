.class public final Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;
.super Ljava/lang/Object;
.source "DaggerTeamworkComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getAuthManager;,
        Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;,
        Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;,
        Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity;,
        Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;,
        Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;,
        Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;,
        Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getUserState;,
        Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getAppCache;,
        Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;

.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppCacheProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getAppCache;

.field private getAuthManagerProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getAuthManager;

.field private getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

.field private getDeviceSecurityProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getPostAuthWorkJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;

.field private getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

.field private getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getUserState;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideCallbackManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/facebook/CallbackManager;",
            ">;"
        }
    .end annotation
.end field

.field private provideFacebookManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/social/facebook/FacebookManager;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;",
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

.field private provideTeamworkLoadStrategyProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;",
            ">;"
        }
    .end annotation
.end field

.field private provideTeamworkReducerProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideTeamworkReducerFactory;


# direct methods
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;)V
    .locals 0

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$1;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;
    .locals 2

    .line 90
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;)V
    .locals 10

    .line 97
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 96
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 98
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 99
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 100
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getAppCache;

    .line 101
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getAppCache;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getAppCacheProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getAppCache;

    .line 102
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 103
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 104
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 105
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 109
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 108
    invoke-static {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideTeamworkLoadStrategyFactory;->create(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideTeamworkLoadStrategyFactory;

    move-result-object v0

    .line 107
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->provideTeamworkLoadStrategyProvider:Ljavax/inject/Provider;

    .line 110
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 111
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 113
    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideTeamworkReducerFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideTeamworkReducerFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->provideTeamworkReducerProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideTeamworkReducerFactory;

    .line 114
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 115
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 119
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getAppCacheProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getAppCache;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->provideTeamworkLoadStrategyProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->provideTeamworkReducerProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideTeamworkReducerFactory;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 118
    invoke-static/range {v2 .. v8}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 117
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 126
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 127
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 128
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 129
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 130
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 131
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 132
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 133
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 134
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 135
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 139
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 138
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 137
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 145
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 146
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity;

    .line 147
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getDeviceSecurityProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity;

    .line 148
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;

    .line 149
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getPostAuthWorkJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;

    .line 150
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;

    .line 151
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getApiCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;

    .line 152
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getAuthManager;

    .line 153
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getAuthManager;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getAuthManagerProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getAuthManager;

    .line 157
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getDeviceSecurityProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getPostAuthWorkJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getApiCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getAuthManagerProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getAuthManager;

    iget-object v9, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 156
    invoke-static/range {v2 .. v9}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideFacebookManagerFactory;->create(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideFacebookManagerFactory;

    move-result-object v0

    .line 155
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->provideFacebookManagerProvider:Ljavax/inject/Provider;

    .line 167
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;

    move-result-object p1

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideCallbackManagerFactory;->create(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;)Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideCallbackManagerFactory;

    move-result-object p1

    .line 166
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->provideCallbackManagerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method private injectTeamworkActivity(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;)Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 195
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 198
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 197
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 195
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 200
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 203
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 202
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 200
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 205
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 208
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 207
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 205
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 210
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 213
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 212
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 210
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 215
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 218
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 217
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 215
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 220
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 223
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 222
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 220
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 225
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 228
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 227
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 225
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 230
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 233
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 232
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 230
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 235
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 238
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 237
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 235
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 240
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 243
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 242
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 240
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 245
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 248
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 247
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 245
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 250
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 253
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 252
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 250
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 255
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 258
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 257
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 255
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 260
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 263
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 262
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 260
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 265
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 268
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppConfig()Lcom/ibotta/android/state/app/config/AppConfig;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 267
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/AppConfig;

    .line 265
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity_MembersInjector;->injectAppConfig(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;Lcom/ibotta/android/state/app/config/AppConfig;)V

    .line 270
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->provideFacebookManagerProvider:Ljavax/inject/Provider;

    .line 271
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/social/facebook/FacebookManager;

    .line 270
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity_MembersInjector;->injectFbManager(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;Lcom/ibotta/android/social/facebook/FacebookManager;)V

    .line 272
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->provideCallbackManagerProvider:Ljavax/inject/Provider;

    .line 273
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/CallbackManager;

    .line 272
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity_MembersInjector;->injectFbCallbackManager(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;Lcom/facebook/CallbackManager;)V

    .line 274
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 277
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getFormatting()Lcom/ibotta/android/util/Formatting;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 276
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    .line 274
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;Lcom/ibotta/android/util/Formatting;)V

    .line 279
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 282
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getImageCache()Lcom/ibotta/android/images/ImageCache;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 281
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    .line 279
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 32
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;
    .locals 1

    .line 180
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 32
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;
    .locals 1

    .line 175
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 185
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 32
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;)V
    .locals 0

    .line 190
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/DaggerTeamworkComponent;->injectTeamworkActivity(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;)Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;)V
    .locals 0

    return-void
.end method
