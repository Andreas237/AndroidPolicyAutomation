.class public final Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;
.super Ljava/lang/Object;
.source "DaggerRegistrationComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/register/RegistrationComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;,
        Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getAppConfig;,
        Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getPartnerAppChecker;,
        Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getUserState;,
        Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getValidation;,
        Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity;,
        Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getAppHelper;,
        Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getAppConfig;

.field private getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getAppHelper;

.field private getDeviceSecurityProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getPartnerAppCheckerProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getPartnerAppChecker;

.field private getPostAuthWorkJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;

.field private getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getUserState;

.field private getValidationProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getValidation;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$1;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;
    .locals 2

    .line 73
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;)V
    .locals 12

    .line 80
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 79
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 81
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 82
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 83
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 84
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getAppHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 85
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity;

    .line 86
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->getDeviceSecurityProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity;

    .line 87
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 88
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 89
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getValidation;

    .line 90
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getValidation;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->getValidationProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getValidation;

    .line 91
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 92
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 93
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getPartnerAppChecker;

    .line 94
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getPartnerAppChecker;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->getPartnerAppCheckerProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getPartnerAppChecker;

    .line 95
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    .line 96
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getAppConfig;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    .line 97
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;

    .line 98
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->getPostAuthWorkJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;

    .line 102
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->getDeviceSecurityProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getDeviceSecurity;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->getValidationProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getValidation;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v9, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->getPartnerAppCheckerProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getPartnerAppChecker;

    iget-object v10, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    iget-object v11, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->getPostAuthWorkJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getPostAuthWorkJobFactory;

    .line 101
    invoke-static/range {v2 .. v11}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 100
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 112
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 113
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 114
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 115
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 116
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 117
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 118
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 119
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 123
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 122
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 121
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 129
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectRegistrationActivity(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 160
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 159
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 157
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 165
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 164
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 162
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 170
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 169
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 167
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 172
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 175
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 174
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 172
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 177
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 180
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 179
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 177
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 182
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 185
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 184
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 182
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 187
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 190
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 189
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 187
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 192
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 195
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 194
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 192
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 197
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 200
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 199
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 197
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 202
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 205
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 204
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 202
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 210
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 209
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 207
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 212
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 215
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 214
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 212
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 217
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 220
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 219
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 217
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 222
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 225
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 224
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 222
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 227
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 230
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 229
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 227
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 232
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 235
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingQueue()Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 234
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    .line 232
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_MembersInjector;->injectTrackingQueue(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 28
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;
    .locals 1

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 28
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;
    .locals 1

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 28
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)V
    .locals 0

    .line 152
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->injectRegistrationActivity(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;)V
    .locals 0

    return-void
.end method
