.class public final Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;
.super Ljava/lang/Object;
.source "DaggerImLoginComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;,
        Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;,
        Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getAppHelper;,
        Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getImTextHelper;,
        Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getAppConfig;,
        Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getAppConfig;

.field private getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getAppHelper;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getImTextHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

.field private getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private imLoginReducerProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer_Factory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideImLoginResourcesProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;",
            ">;"
        }
    .end annotation
.end field

.field private provideImLoginValidationProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginValidation;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginView;",
            ">;"
        }
    .end annotation
.end field

.field private providePresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenter;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$1;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;
    .locals 2

    .line 73
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;)V
    .locals 9

    .line 79
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 80
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 81
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 82
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    .line 83
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getAppConfig;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    .line 84
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

    .line 85
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getImTextHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->getImTextHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

    .line 86
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 87
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getAppHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 90
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvideImLoginValidationFactory;->create(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvideImLoginValidationFactory;

    move-result-object v0

    .line 89
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->provideImLoginValidationProvider:Ljavax/inject/Provider;

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->provideImLoginValidationProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->getImTextHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    .line 92
    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer_Factory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer_Factory;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->imLoginReducerProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer_Factory;

    .line 97
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    .line 98
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    .line 99
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    .line 100
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    .line 103
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvideImLoginResourcesFactory;->create(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvideImLoginResourcesFactory;

    move-result-object v0

    .line 102
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->provideImLoginResourcesProvider:Ljavax/inject/Provider;

    .line 107
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->getImTextHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->imLoginReducerProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer_Factory;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->provideImLoginResourcesProvider:Ljavax/inject/Provider;

    .line 106
    invoke-static/range {v1 .. v8}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvidePresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvidePresenterFactory;

    move-result-object v0

    .line 105
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->providePresenterProvider:Ljavax/inject/Provider;

    .line 115
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 116
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 117
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 118
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 119
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 120
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 121
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 122
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 123
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 124
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 128
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 127
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 126
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 134
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectImLoginActivity(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 165
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 164
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 162
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 170
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 169
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 167
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 172
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 175
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 174
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 172
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 177
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 180
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 179
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 177
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 182
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 185
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 184
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 182
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 187
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 190
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 189
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 187
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 192
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 195
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 194
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 192
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 197
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 200
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 199
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 197
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 202
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 205
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 204
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 202
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 210
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 209
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 207
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 212
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 215
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 214
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 212
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 217
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 220
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 219
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 217
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 222
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 225
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 224
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 222
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 227
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 230
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 229
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 227
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 232
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 235
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getImageCache()Lcom/ibotta/android/images/ImageCache;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 234
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    .line 232
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 26
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenter;
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->providePresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 26
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginView;
    .locals 1

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 26
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;)V
    .locals 0

    .line 157
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->injectImLoginActivity(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginView;)V
    .locals 0

    return-void
.end method
