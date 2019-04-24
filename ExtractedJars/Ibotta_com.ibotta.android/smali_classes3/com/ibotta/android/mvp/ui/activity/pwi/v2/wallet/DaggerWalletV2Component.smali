.class public final Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;
.super Ljava/lang/Object;
.source "DaggerWalletV2Component.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Component;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getGooglePayManager;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getPwiUserState;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getResources;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getUserState;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getPwiVariant;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getPwiHomeReducer;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getPwiApiManager;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getFormatting;

.field private getGooglePayManagerProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getGooglePayManager;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getHardware;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getPwiApiManagerProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getPwiApiManager;

.field private getPwiHomeReducerProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getPwiHomeReducer;

.field private getPwiUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getPwiUserState;

.field private getPwiVariantProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getPwiVariant;

.field private getResourcesProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getResources;

.field private getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getUserState;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;",
            ">;"
        }
    .end annotation
.end field

.field private providePwiWalletReducerProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module_ProvidePwiWalletReducerFactory;

.field private provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;",
            ">;"
        }
    .end annotation
.end field

.field private provideWalletV2MvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Presenter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->initialize(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$1;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;
    .locals 2

    .line 74
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;)V
    .locals 11

    .line 81
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 80
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 82
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 83
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 84
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getPwiApiManager;

    .line 85
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getPwiApiManager;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->getPwiApiManagerProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getPwiApiManager;

    .line 86
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getPwiHomeReducer;

    .line 87
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getPwiHomeReducer;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->getPwiHomeReducerProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getPwiHomeReducer;

    .line 88
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getPwiVariant;

    .line 89
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getPwiVariant;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->getPwiVariantProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getPwiVariant;

    .line 90
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getUserState;

    .line 91
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getUserState;

    .line 92
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getResources;

    .line 93
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getResources;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->getResourcesProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getResources;

    .line 96
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->getResourcesProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getResources;

    .line 95
    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module_ProvidePwiWalletReducerFactory;->create(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module_ProvidePwiWalletReducerFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->providePwiWalletReducerProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module_ProvidePwiWalletReducerFactory;

    .line 97
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getPwiUserState;

    .line 98
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getPwiUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->getPwiUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getPwiUserState;

    .line 99
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getGooglePayManager;

    .line 100
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getGooglePayManager;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->getGooglePayManagerProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getGooglePayManager;

    .line 104
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->getPwiApiManagerProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getPwiApiManager;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->getPwiHomeReducerProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getPwiHomeReducer;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->getPwiVariantProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getPwiVariant;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->providePwiWalletReducerProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module_ProvidePwiWalletReducerFactory;

    iget-object v9, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->getPwiUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getPwiUserState;

    iget-object v10, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->getGooglePayManagerProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getGooglePayManager;

    .line 103
    invoke-static/range {v2 .. v10}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module_ProvideWalletV2MvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module_ProvideWalletV2MvpPresenterFactory;

    move-result-object v0

    .line 102
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->provideWalletV2MvpPresenterProvider:Ljavax/inject/Provider;

    .line 113
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 114
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 115
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getHardware;

    .line 116
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getHardware;

    .line 117
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getFormatting;

    .line 118
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getFormatting;

    .line 119
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 120
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 121
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 122
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 126
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 125
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 124
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 132
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectWalletV2Activity(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 233
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 232
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 230
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;Landroid/os/Handler;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 28
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Presenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Presenter;
    .locals 1

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->provideWalletV2MvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Presenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 28
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 28
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->inject(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;)V
    .locals 0

    .line 155
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->injectWalletV2Activity(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;)V
    .locals 0

    return-void
.end method
