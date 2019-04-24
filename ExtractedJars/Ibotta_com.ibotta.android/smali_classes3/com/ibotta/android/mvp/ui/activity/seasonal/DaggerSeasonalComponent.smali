.class public final Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;
.super Ljava/lang/Object;
.source "DaggerSeasonalComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getRetailerIconOnOfferVariant;,
        Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getSeasonalEventContextProvider;,
        Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;,
        Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;,
        Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getRetailerIconOnOfferVariantProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getRetailerIconOnOfferVariant;

.field private getSeasonalEventContextProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getSeasonalEventContextProvider;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;",
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

.field private provideSeasonalDetailEventContextProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalModule_ProvideSeasonalDetailEventContextProviderFactory;


# direct methods
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$1;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;
    .locals 2

    .line 69
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;)V
    .locals 8

    .line 76
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 75
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 77
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 78
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 79
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 80
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 81
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    .line 82
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    .line 83
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getSeasonalEventContextProvider;

    .line 85
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getSeasonalEventContextProvider;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->getSeasonalEventContextProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getSeasonalEventContextProvider;

    .line 88
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalModule;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->getSeasonalEventContextProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getSeasonalEventContextProvider;

    .line 87
    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalModule_ProvideSeasonalDetailEventContextProviderFactory;->create(Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalModule_ProvideSeasonalDetailEventContextProviderFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->provideSeasonalDetailEventContextProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalModule_ProvideSeasonalDetailEventContextProviderFactory;

    .line 89
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getRetailerIconOnOfferVariant;

    .line 91
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getRetailerIconOnOfferVariant;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->getRetailerIconOnOfferVariantProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getRetailerIconOnOfferVariant;

    .line 95
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->provideSeasonalDetailEventContextProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalModule_ProvideSeasonalDetailEventContextProviderFactory;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->getRetailerIconOnOfferVariantProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getRetailerIconOnOfferVariant;

    .line 94
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 93
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 101
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 102
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 103
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 104
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 105
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 106
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 107
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 108
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 109
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 110
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 114
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 113
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 112
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 120
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectSeasonalActivity(Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;)Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 151
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 150
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 148
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 153
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 156
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 155
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 153
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 161
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 160
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 158
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 163
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 166
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 165
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 163
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 168
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 171
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 170
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 168
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 173
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 176
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 175
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 173
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 181
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 180
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 178
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 183
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 186
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 185
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 183
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 188
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 191
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 190
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 188
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 193
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 196
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 195
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 193
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 198
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 201
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 200
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 198
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 203
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 206
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 205
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 203
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 208
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 211
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 210
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 208
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 213
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 216
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 215
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 213
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 25
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenter;
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 25
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 138
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 25
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;)V
    .locals 0

    .line 143
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/DaggerSeasonalComponent;->injectSeasonalActivity(Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;)Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;)V
    .locals 0

    return-void
.end method
