.class public final Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;
.super Ljava/lang/Object;
.source "DaggerVerifyCodeComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;,
        Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getAppConfig;,
        Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getUserState;,
        Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getAppCache;,
        Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppCacheProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getAppCache;

.field private getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getAppConfig;

.field private getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getUserState;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeModule_ProvideAppConfigFactory;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeView;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$1;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;
    .locals 2

    .line 66
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;)V
    .locals 8

    .line 73
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 72
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 74
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 75
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 76
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getAppCache;

    .line 77
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getAppCache;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->getAppCacheProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getAppCache;

    .line 78
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 79
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 80
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    .line 81
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getAppConfig;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    .line 84
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeModule;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    .line 83
    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeModule_ProvideAppConfigFactory;->create(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeModule_ProvideAppConfigFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->provideAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeModule_ProvideAppConfigFactory;

    .line 85
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 86
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 90
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->getAppCacheProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getAppCache;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->provideAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeModule_ProvideAppConfigFactory;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 89
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 88
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 96
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 97
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 98
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 99
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 100
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 101
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 102
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 103
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 104
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 105
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 109
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 108
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 107
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 115
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectVerifyCodeActivity(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;)Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 143
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 146
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 145
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 143
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 151
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 150
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 148
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 153
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 156
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 155
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 153
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 161
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 160
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 158
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 163
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 166
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 165
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 163
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 168
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 171
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 170
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 168
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 173
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 176
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 175
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 173
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 181
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 180
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 178
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 183
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 186
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 185
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 183
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 188
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 191
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 190
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 188
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 193
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 196
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 195
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 193
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 198
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 201
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 200
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 198
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 203
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 206
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 205
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 203
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 208
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 211
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 210
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 208
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 25
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenter;
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 25
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeView;
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 25
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;)V
    .locals 0

    .line 138
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;->injectVerifyCodeActivity(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;)Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodeView;)V
    .locals 0

    return-void
.end method
