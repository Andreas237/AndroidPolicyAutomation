.class public final Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;
.super Ljava/lang/Object;
.source "DaggerConnectedAccountsComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;,
        Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getAuthManager;,
        Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;,
        Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;,
        Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity;,
        Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getAppHelper;,
        Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getCustomerSocialHelper;,
        Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;,
        Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getUserState;,
        Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;

.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getAppHelper;

.field private getAuthManagerProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getAuthManager;

.field private getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

.field private getCustomerSocialHelperProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getCustomerSocialHelper;

.field private getDeviceSecurityProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getPostAuthWorkJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;

.field private getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

.field private getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getUserState;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

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

.field private provideImUiUtilProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$1;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;
    .locals 2

    .line 96
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;)V
    .locals 10

    .line 103
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 102
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 104
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 105
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 106
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 107
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 108
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    .line 109
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    .line 110
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getCustomerSocialHelper;

    .line 111
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getCustomerSocialHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getCustomerSocialHelperProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getCustomerSocialHelper;

    .line 112
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 113
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getAppHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 117
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 116
    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule_ProvideImUiUtilFactory;->create(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule_ProvideImUiUtilFactory;

    move-result-object v0

    .line 115
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->provideImUiUtilProvider:Ljavax/inject/Provider;

    .line 118
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity;

    .line 119
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getDeviceSecurityProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity;

    .line 120
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;

    .line 121
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getPostAuthWorkJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;

    .line 122
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;

    .line 123
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getApiCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;

    .line 124
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 125
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 126
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getAuthManager;

    .line 127
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getAuthManager;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getAuthManagerProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getAuthManager;

    .line 128
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 129
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 133
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getDeviceSecurityProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getPostAuthWorkJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getApiCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getAuthManagerProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getAuthManager;

    iget-object v9, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 132
    invoke-static/range {v2 .. v9}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule_ProvideFacebookManagerFactory;->create(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule_ProvideFacebookManagerFactory;

    move-result-object v0

    .line 131
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->provideFacebookManagerProvider:Ljavax/inject/Provider;

    .line 144
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;

    move-result-object v0

    .line 143
    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule_ProvidesGoogleSignInOptionsFactory;->create(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule_ProvidesGoogleSignInOptionsFactory;

    move-result-object v0

    .line 142
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->providesGoogleSignInOptionsProvider:Ljavax/inject/Provider;

    .line 148
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->providesGoogleSignInOptionsProvider:Ljavax/inject/Provider;

    .line 147
    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule_ProvideGoogleSignInClientFactory;->create(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule_ProvideGoogleSignInClientFactory;

    move-result-object v0

    .line 146
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->provideGoogleSignInClientProvider:Ljavax/inject/Provider;

    .line 152
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->provideGoogleSignInClientProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getApiCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 151
    invoke-static/range {v1 .. v6}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule_ProvideGoogleSignInManagerFactory;->create(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule_ProvideGoogleSignInManagerFactory;

    move-result-object v0

    .line 150
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->provideGoogleSignInManagerProvider:Ljavax/inject/Provider;

    .line 161
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getCustomerSocialHelperProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getCustomerSocialHelper;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->provideImUiUtilProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->provideFacebookManagerProvider:Ljavax/inject/Provider;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->provideGoogleSignInManagerProvider:Ljavax/inject/Provider;

    iget-object v9, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 160
    invoke-static/range {v1 .. v9}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 159
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 170
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 171
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 172
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 173
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 174
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 175
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 176
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 177
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 181
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 180
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 179
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 187
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectConnectedAccountsActivity(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 216
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 219
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 218
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 216
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 221
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 224
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 223
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 221
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 226
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 229
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 228
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 226
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 231
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 234
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 233
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 231
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 236
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 239
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 238
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 236
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 241
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 244
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 243
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 241
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 246
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 249
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 248
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 246
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 251
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 254
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 253
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 251
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 256
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 259
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 258
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 256
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 261
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 264
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 263
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 261
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 266
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 269
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 268
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 266
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 271
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 274
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 273
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 271
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 276
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 279
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 278
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 276
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 281
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 284
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 283
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 281
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 286
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 289
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDeviceSecurity()Lcom/ibotta/android/security/DeviceSecurity;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 288
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/security/DeviceSecurity;

    .line 286
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity_MembersInjector;->injectDeviceSecurity(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity;Lcom/ibotta/android/security/DeviceSecurity;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 35
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenter;
    .locals 1

    .line 200
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 35
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;
    .locals 1

    .line 195
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 205
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 35
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity;)V
    .locals 0

    .line 210
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;->injectConnectedAccountsActivity(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;)V
    .locals 0

    return-void
.end method
