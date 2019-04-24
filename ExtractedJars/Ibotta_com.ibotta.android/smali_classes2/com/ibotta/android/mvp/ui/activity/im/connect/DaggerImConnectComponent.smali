.class public final Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;
.super Ljava/lang/Object;
.source "DaggerImConnectComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;,
        Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;,
        Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getAppConfig;,
        Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getImTextHelper;,
        Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getAppHelper;,
        Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getAppConfig;

.field private getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getAppHelper;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getImTextHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

.field private getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private imConnectReducerProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer_Factory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectView;",
            ">;"
        }
    .end annotation
.end field

.field private providePresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenter;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$1;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;
    .locals 2

    .line 69
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;)V
    .locals 8

    .line 76
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 75
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 77
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 78
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 79
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 80
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getAppHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 81
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

    .line 82
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getImTextHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->getImTextHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

    .line 83
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    .line 84
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getAppConfig;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    .line 85
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 86
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 87
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->getImTextHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 88
    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer_Factory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer_Factory;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->imConnectReducerProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer_Factory;

    .line 93
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    .line 94
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    .line 95
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    .line 96
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    .line 100
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->imConnectReducerProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer_Factory;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    .line 99
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule_ProvidePresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule_ProvidePresenterFactory;

    move-result-object v0

    .line 98
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->providePresenterProvider:Ljavax/inject/Provider;

    .line 106
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 107
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 108
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 109
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 110
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 111
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 112
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 113
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 117
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 116
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 115
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 123
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectImConnectActivity(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 154
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 153
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 151
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 156
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 159
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 158
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 156
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 161
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 164
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 163
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 161
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 169
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 168
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 166
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 174
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 173
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 171
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 176
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 179
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 178
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 176
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 181
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 184
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 183
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 181
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 186
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 189
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 188
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 186
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 194
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 193
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 191
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 196
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 199
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 198
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 196
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 201
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 204
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 203
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 201
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 206
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 209
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 208
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 206
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 211
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 214
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 213
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 211
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 216
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 219
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 218
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 216
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 221
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 224
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getImageCache()Lcom/ibotta/android/images/ImageCache;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 223
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    .line 221
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;Lcom/ibotta/android/images/ImageCache;)V

    .line 226
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 229
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 228
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 226
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;Landroid/os/Handler;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 26
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenter;
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->providePresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 26
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectView;
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 26
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;)V
    .locals 0

    .line 146
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->injectImConnectActivity(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectView;)V
    .locals 0

    return-void
.end method
