.class public final Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;
.super Ljava/lang/Object;
.source "DaggerRedeemReqsComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getCacheKeyMatcherFactory;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getAppCache;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getIbottaApolloCache;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getWindfallHelper;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getWindfallGatekeeper;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getStorageSiloState;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getVerificationManager;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppCacheProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getAppCache;

.field private getCacheKeyMatcherFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getCacheKeyMatcherFactory;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getIbottaApolloCacheProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getIbottaApolloCache;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getStorageSiloStateProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getStorageSiloState;

.field private getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private getVerificationManagerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

.field private getWindfallGatekeeperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getWindfallGatekeeper;

.field private getWindfallHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getWindfallHelper;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;",
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

.field private provideRedeemReqsReducerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideRedeemReqsReducerFactory;

.field private provideWindfallRecognizerCallbackProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;)V
    .locals 0

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$1;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;
    .locals 2

    .line 83
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;)V
    .locals 14

    .line 90
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 89
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 91
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 92
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 93
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 94
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 95
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

    .line 96
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getVerificationManager;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getVerificationManagerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

    .line 97
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getStorageSiloState;

    .line 98
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getStorageSiloState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getStorageSiloStateProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getStorageSiloState;

    .line 99
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getWindfallGatekeeper;

    .line 100
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getWindfallGatekeeper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getWindfallGatekeeperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getWindfallGatekeeper;

    .line 101
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getWindfallHelper;

    .line 102
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getWindfallHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getWindfallHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getWindfallHelper;

    .line 103
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getIbottaApolloCache;

    .line 104
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getIbottaApolloCache;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getIbottaApolloCacheProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getIbottaApolloCache;

    .line 105
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 106
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 107
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getAppCache;

    .line 108
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getAppCache;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getAppCacheProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getAppCache;

    .line 112
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;

    move-result-object v0

    .line 111
    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideWindfallRecognizerCallbackFactory;->create(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideWindfallRecognizerCallbackFactory;

    move-result-object v0

    .line 110
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->provideWindfallRecognizerCallbackProvider:Ljavax/inject/Provider;

    .line 113
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getCacheKeyMatcherFactory;

    .line 114
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getCacheKeyMatcherFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getCacheKeyMatcherFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getCacheKeyMatcherFactory;

    .line 115
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 116
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 118
    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideRedeemReqsReducerFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideRedeemReqsReducerFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->provideRedeemReqsReducerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideRedeemReqsReducerFactory;

    .line 122
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getVerificationManagerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getStorageSiloStateProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getStorageSiloState;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getWindfallGatekeeperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getWindfallGatekeeper;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getWindfallHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getWindfallHelper;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getIbottaApolloCacheProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getIbottaApolloCache;

    iget-object v9, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    iget-object v10, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getAppCacheProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getAppCache;

    iget-object v11, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->provideWindfallRecognizerCallbackProvider:Ljavax/inject/Provider;

    iget-object v12, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getCacheKeyMatcherFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getCacheKeyMatcherFactory;

    iget-object v13, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->provideRedeemReqsReducerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideRedeemReqsReducerFactory;

    .line 121
    invoke-static/range {v1 .. v13}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 120
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 135
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 136
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 137
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 138
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 139
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 140
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 141
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 142
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 146
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 145
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 144
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 152
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectRedeemReqsActivity(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;)Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 180
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 183
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 182
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 180
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 185
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 188
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 187
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 185
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 190
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 193
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 192
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 190
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 195
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 198
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 197
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 195
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 200
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 203
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 202
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 200
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 205
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 208
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 207
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 205
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 210
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 213
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 212
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 210
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 215
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 218
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 217
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 215
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 220
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 223
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 222
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 220
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 225
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 228
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 227
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 225
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 230
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 233
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 232
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 230
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 235
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 238
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 237
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 235
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 240
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 243
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 242
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 240
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 245
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 248
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 247
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 245
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 250
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 253
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getReceiptSubmissionHelper()Lcom/ibotta/android/submission/ReceiptSubmissionHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 252
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/submission/ReceiptSubmissionHelper;

    .line 250
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity_MembersInjector;->injectReceiptSubmissionHelper(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;Lcom/ibotta/android/submission/ReceiptSubmissionHelper;)V

    .line 255
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 258
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getWindfallGatekeeper()Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 257
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;

    .line 255
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity_MembersInjector;->injectWindfallGatekeeper(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 30
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;
    .locals 1

    .line 165
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 30
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;
    .locals 1

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 170
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 30
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;)V
    .locals 0

    .line 175
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;->injectRedeemReqsActivity(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;)Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;)V
    .locals 0

    return-void
.end method
