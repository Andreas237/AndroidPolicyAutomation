.class public final Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;
.super Ljava/lang/Object;
.source "DaggerImErrorComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;,
        Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getUserState;,
        Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;,
        Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;,
        Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getImTextHelper;,
        Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getAppHelper;,
        Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getAppHelper;

.field private getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getImTextHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

.field private getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

.field private getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getUserState;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private imErrorReducerProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorReducer_Factory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideCacheClearBatchApiJobProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule_ProvideCacheClearBatchApiJobFactory;

.field private provideImUiUtilProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorView;",
            ">;"
        }
    .end annotation
.end field

.field private providePresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenter;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$1;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;
    .locals 2

    .line 78
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;)V
    .locals 9

    .line 84
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 85
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 86
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 87
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 88
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getAppHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 89
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

    .line 90
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getImTextHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->getImTextHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->getImTextHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

    .line 92
    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorReducer_Factory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorReducer_Factory;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->imErrorReducerProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorReducer_Factory;

    .line 93
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    .line 94
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    .line 95
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    .line 96
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    .line 97
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 98
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 102
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 101
    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule_ProvideImUiUtilFactory;->create(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule_ProvideImUiUtilFactory;

    move-result-object v0

    .line 100
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->provideImUiUtilProvider:Ljavax/inject/Provider;

    .line 103
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 104
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 107
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 106
    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule_ProvideCacheClearBatchApiJobFactory;->create(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule_ProvideCacheClearBatchApiJobFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->provideCacheClearBatchApiJobProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule_ProvideCacheClearBatchApiJobFactory;

    .line 111
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->imErrorReducerProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorReducer_Factory;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->provideImUiUtilProvider:Ljavax/inject/Provider;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->provideCacheClearBatchApiJobProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule_ProvideCacheClearBatchApiJobFactory;

    .line 110
    invoke-static/range {v1 .. v8}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule_ProvidePresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule_ProvidePresenterFactory;

    move-result-object v0

    .line 109
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->providePresenterProvider:Ljavax/inject/Provider;

    .line 119
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 120
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 121
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 122
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 123
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 124
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 125
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 126
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 127
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 128
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 132
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 131
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 130
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 138
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectImErrorActivity(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;)Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 169
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 168
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 166
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 174
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 173
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 171
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 176
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 179
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 178
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 176
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 181
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 184
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 183
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 181
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 186
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 189
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 188
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 186
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 194
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 193
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 191
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 196
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 199
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 198
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 196
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 201
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 204
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 203
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 201
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 206
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 209
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 208
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 206
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 211
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 214
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 213
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 211
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 216
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 219
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 218
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 216
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 221
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 224
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 223
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 221
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 226
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 229
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 228
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 226
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 231
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 234
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 233
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 231
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 236
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 239
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getImTextHelper()Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 238
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    .line 236
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity_MembersInjector;->injectImUtil(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;)V

    .line 241
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 244
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppConfig()Lcom/ibotta/android/state/app/config/AppConfig;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 243
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/AppConfig;

    .line 241
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity_MembersInjector;->injectAppConfig(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;Lcom/ibotta/android/state/app/config/AppConfig;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 28
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenter;
    .locals 1

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->providePresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 28
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorView;
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 28
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;)V
    .locals 0

    .line 161
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->injectImErrorActivity(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;)Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorView;)V
    .locals 0

    return-void
.end method
