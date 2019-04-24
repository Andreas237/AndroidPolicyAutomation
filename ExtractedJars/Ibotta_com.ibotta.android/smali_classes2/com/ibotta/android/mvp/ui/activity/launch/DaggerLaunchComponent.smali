.class public final Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;
.super Ljava/lang/Object;
.source "DaggerLaunchComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/launch/LaunchComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getAppHelper;,
        Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;,
        Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;,
        Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;,
        Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getAuthManager;,
        Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getUserState;,
        Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity;,
        Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;

.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getAppHelper;

.field private getAuthManagerProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getAuthManager;

.field private getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

.field private getDeviceSecurityProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getPostAuthWorkJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;

.field private getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getUserState;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideAppProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;"
        }
    .end annotation
.end field

.field private provideDeferredDeepLinkManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/DeferredDeepLinkManager;",
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

.field private provideGoogleSignInClientProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;",
            ">;"
        }
    .end annotation
.end field

.field private provideGoogleSignInManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/social/google/GoogleSignInManager;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;",
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

.field private providesGoogleSignInOptionsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;)V
    .locals 0

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$1;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;
    .locals 2

    .line 92
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;)V
    .locals 10

    .line 98
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 99
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 100
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 101
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity;

    .line 102
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getDeviceSecurityProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity;

    .line 103
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 104
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 105
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getAuthManager;

    .line 106
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getAuthManager;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getAuthManagerProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getAuthManager;

    .line 107
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;

    .line 108
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getPostAuthWorkJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;

    .line 109
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 110
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 114
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getDeviceSecurityProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getAuthManagerProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getAuthManager;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getPostAuthWorkJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 113
    invoke-static/range {v2 .. v8}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 112
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 121
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 122
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 123
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 124
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 125
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 126
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 127
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 128
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 132
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 131
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 130
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 138
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 140
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideAppFactory;->create(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;)Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideAppFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->provideAppProvider:Ljavax/inject/Provider;

    .line 141
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;

    .line 142
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getApiCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;

    .line 143
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 144
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 148
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getDeviceSecurityProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getPostAuthWorkJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getApiCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getAuthManagerProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getAuthManager;

    iget-object v9, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 147
    invoke-static/range {v2 .. v9}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideFacebookManagerFactory;->create(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideFacebookManagerFactory;

    move-result-object v0

    .line 146
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->provideFacebookManagerProvider:Ljavax/inject/Provider;

    .line 158
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvidesGoogleSignInOptionsFactory;->create(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;)Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvidesGoogleSignInOptionsFactory;

    move-result-object v0

    .line 157
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->providesGoogleSignInOptionsProvider:Ljavax/inject/Provider;

    .line 162
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->providesGoogleSignInOptionsProvider:Ljavax/inject/Provider;

    .line 161
    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideGoogleSignInClientFactory;->create(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideGoogleSignInClientFactory;

    move-result-object v0

    .line 160
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->provideGoogleSignInClientProvider:Ljavax/inject/Provider;

    .line 163
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 164
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getAppHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 168
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->provideGoogleSignInClientProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getApiCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 167
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideGoogleSignInManagerFactory;->create(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideGoogleSignInManagerFactory;

    move-result-object v0

    .line 166
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->provideGoogleSignInManagerProvider:Ljavax/inject/Provider;

    .line 177
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getAuthManagerProvider:Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent$com_ibotta_android_di_MainComponent_getAuthManager;

    .line 176
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideDeferredDeepLinkManagerFactory;->create(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideDeferredDeepLinkManagerFactory;

    move-result-object p1

    .line 175
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->provideDeferredDeepLinkManagerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method private injectLaunchActivity(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;)Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 205
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 208
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 207
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 205
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 210
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 213
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 212
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 210
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 215
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 218
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 217
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 215
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 220
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 223
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 222
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 220
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 225
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 228
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 227
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 225
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 230
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 233
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 232
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 230
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 235
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 238
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 237
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 235
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 240
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 243
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 242
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 240
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 245
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 248
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 247
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 245
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 250
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 253
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 252
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 250
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 255
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 258
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 257
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 255
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 260
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 263
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 262
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 260
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 265
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 268
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 267
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 265
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 270
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 273
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 272
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 270
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 275
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->provideAppProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/App;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->injectApp(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;Lcom/ibotta/android/App;)V

    .line 276
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 279
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 278
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 276
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 281
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 284
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 283
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 281
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 286
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 289
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getPushMessaging()Lcom/ibotta/android/service/push/PushMessaging;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 288
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/push/PushMessaging;

    .line 286
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->injectPushMessaging(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;Lcom/ibotta/android/service/push/PushMessaging;)V

    .line 291
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->provideFacebookManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->injectFbManager(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;Lcom/ibotta/android/social/facebook/FacebookManager;)V

    .line 292
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->provideGoogleSignInManagerProvider:Ljavax/inject/Provider;

    .line 293
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/social/google/GoogleSignInManager;

    .line 292
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->injectGoogleSignInManager(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;Lcom/ibotta/android/social/google/GoogleSignInManager;)V

    .line 294
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 297
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 296
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 294
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 299
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->provideDeferredDeepLinkManagerProvider:Ljavax/inject/Provider;

    .line 300
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/routing/DeferredDeepLinkManager;

    .line 299
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_MembersInjector;->injectDeferredDeepLinkManager(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;Lcom/ibotta/android/routing/DeferredDeepLinkManager;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 34
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;
    .locals 1

    .line 190
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 34
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;
    .locals 1

    .line 185
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 195
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 34
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;)V
    .locals 0

    .line 200
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/launch/DaggerLaunchComponent;->injectLaunchActivity(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;)Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;)V
    .locals 0

    return-void
.end method
