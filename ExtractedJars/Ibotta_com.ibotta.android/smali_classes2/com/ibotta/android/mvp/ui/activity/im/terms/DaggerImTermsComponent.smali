.class public final Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;
.super Ljava/lang/Object;
.source "DaggerImTermsComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;,
        Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getUserState;,
        Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getImTextHelper;,
        Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getAppHelper;,
        Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;,
        Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;,
        Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getAppHelper;

.field private getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getImTextHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

.field private getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

.field private getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getUserState;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private imTermsReducerProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer_Factory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsView;",
            ">;"
        }
    .end annotation
.end field

.field private providePresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenter;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$1;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;
    .locals 2

    .line 73
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;)V
    .locals 9

    .line 79
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 80
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 81
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 82
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    .line 83
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    .line 84
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    .line 85
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    .line 86
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 87
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getAppHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 88
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

    .line 89
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getImTextHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->getImTextHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->getImTextHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

    .line 91
    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer_Factory;->create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer_Factory;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->imTermsReducerProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer_Factory;

    .line 92
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 93
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 94
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 95
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 99
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->imTermsReducerProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer_Factory;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 98
    invoke-static/range {v2 .. v8}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsModule_ProvidePresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsModule_ProvidePresenterFactory;

    move-result-object v0

    .line 97
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->providePresenterProvider:Ljavax/inject/Provider;

    .line 106
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 107
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 108
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 109
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 110
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 111
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 112
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 113
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 114
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 115
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 119
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 118
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 117
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 125
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectImTermsActivity(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;)Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 153
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 156
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 155
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 153
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 161
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 160
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 158
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 163
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 166
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 165
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 163
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 168
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 171
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 170
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 168
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 173
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 176
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 175
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 173
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 181
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 180
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 178
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 183
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 186
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 185
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 183
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 188
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 191
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 190
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 188
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 193
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 196
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 195
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 193
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 198
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 201
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 200
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 198
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 203
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 206
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 205
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 203
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 208
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 211
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 210
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 208
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 213
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 216
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 215
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 213
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 218
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 221
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 220
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 218
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 223
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 226
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getImageCache()Lcom/ibotta/android/images/ImageCache;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 225
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    .line 223
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 27
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenter;
    .locals 1

    .line 138
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->providePresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 27
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsView;
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 27
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;)V
    .locals 0

    .line 148
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->injectImTermsActivity(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;)Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsView;)V
    .locals 0

    return-void
.end method
