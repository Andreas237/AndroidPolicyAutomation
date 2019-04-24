.class public final Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;
.super Ljava/lang/Object;
.source "DaggerModuleComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/module/ModuleComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getRetailerIconOnOfferVariant;,
        Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getIbottaListViewStyleReducer;,
        Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;,
        Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getContentMapper;,
        Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getRetailerHorizListReducer;,
        Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getContentListReducerUtil;,
        Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;,
        Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getContentListReducerUtilProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getContentListReducerUtil;

.field private getContentMapperProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getContentMapper;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getIbottaListViewStyleReducerProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getIbottaListViewStyleReducer;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

.field private getRetailerHorizListReducerProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getRetailerHorizListReducer;

.field private getRetailerIconOnOfferVariantProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getRetailerIconOnOfferVariant;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/module/ModuleView;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$1;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;
    .locals 2

    .line 76
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;)V
    .locals 11

    .line 82
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 83
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 84
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 85
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 86
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 87
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getContentListReducerUtil;

    .line 88
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getContentListReducerUtil;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->getContentListReducerUtilProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getContentListReducerUtil;

    .line 89
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getRetailerHorizListReducer;

    .line 90
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getRetailerHorizListReducer;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->getRetailerHorizListReducerProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getRetailerHorizListReducer;

    .line 91
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getContentMapper;

    .line 92
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getContentMapper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->getContentMapperProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getContentMapper;

    .line 93
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    .line 94
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    .line 95
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getIbottaListViewStyleReducer;

    .line 97
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getIbottaListViewStyleReducer;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->getIbottaListViewStyleReducerProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getIbottaListViewStyleReducer;

    .line 98
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getRetailerIconOnOfferVariant;

    .line 100
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getRetailerIconOnOfferVariant;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->getRetailerIconOnOfferVariantProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getRetailerIconOnOfferVariant;

    .line 104
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->getContentListReducerUtilProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getContentListReducerUtil;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->getRetailerHorizListReducerProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getRetailerHorizListReducer;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->getContentMapperProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getContentMapper;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->getRetailerHelperProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getRetailerHelper;

    iget-object v9, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->getIbottaListViewStyleReducerProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getIbottaListViewStyleReducer;

    iget-object v10, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->getRetailerIconOnOfferVariantProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getRetailerIconOnOfferVariant;

    .line 103
    invoke-static/range {v2 .. v10}, Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 102
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 113
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 114
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 115
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 116
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 117
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 118
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 119
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 120
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 121
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 122
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 126
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 125
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 124
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 132
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectModuleActivity(Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;)Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 163
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 162
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 160
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 165
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 168
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 167
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 165
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 170
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 173
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 172
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 170
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 175
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 178
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 177
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 175
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 180
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 183
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 182
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 180
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 185
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 188
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 187
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 185
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 190
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 193
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 192
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 190
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 195
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 198
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 197
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 195
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 200
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 203
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 202
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 200
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 205
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 208
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 207
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 205
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 210
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 213
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 212
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 210
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 215
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 218
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 217
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 215
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 220
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 223
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 222
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 220
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 225
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 228
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 227
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 225
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 230
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 233
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppConfig()Lcom/ibotta/android/state/app/config/AppConfig;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 232
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/config/AppConfig;

    .line 230
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity_MembersInjector;->injectAppConfig(Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;Lcom/ibotta/android/state/app/config/AppConfig;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 28
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;
    .locals 1

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 28
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/module/ModuleView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/module/ModuleView;
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/module/ModuleView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 28
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/module/ModuleView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/module/ModuleView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;)V
    .locals 0

    .line 155
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;->injectModuleActivity(Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;)Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/module/ModuleView;)V
    .locals 0

    return-void
.end method
