.class public final Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;
.super Ljava/lang/Object;
.source "DaggerPwiHomeComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getRecentlyViewedRetailersService;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getGooglePayManager;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getAppHelper;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getUserState;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getPwiVariant;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getPwiUserState;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getPwiApiManager;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getPwiHomeReducer;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getAppHelper;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getGooglePayManagerProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getGooglePayManager;

.field private getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getPwiApiManagerProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getPwiApiManager;

.field private getPwiHomeReducerProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getPwiHomeReducer;

.field private getPwiUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getPwiUserState;

.field private getPwiVariantProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getPwiVariant;

.field private getRecentlyViewedRetailersServiceProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getRecentlyViewedRetailersService;

.field private getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getUserState;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;",
            ">;"
        }
    .end annotation
.end field

.field private providePwiErrorDialogFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule_ProvidePwiErrorDialogFactoryFactory;

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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;)V
    .locals 0

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$1;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;
    .locals 2

    .line 79
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;)V
    .locals 16

    move-object/from16 v0, p0

    .line 85
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule;

    move-result-object v1

    invoke-static {v1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v1

    invoke-static {v1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 86
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 87
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 88
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 89
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 90
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getPwiHomeReducer;

    .line 91
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getPwiHomeReducer;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getPwiHomeReducerProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getPwiHomeReducer;

    .line 92
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getPwiApiManager;

    .line 93
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getPwiApiManager;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getPwiApiManagerProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getPwiApiManager;

    .line 94
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getPwiUserState;

    .line 95
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getPwiUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getPwiUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getPwiUserState;

    .line 96
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getPwiVariant;

    .line 97
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getPwiVariant;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getPwiVariantProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getPwiVariant;

    .line 98
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 99
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 100
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 101
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 102
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 103
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getAppHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 106
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule;

    move-result-object v1

    iget-object v2, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 105
    invoke-static {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule_ProvidePwiErrorDialogFactoryFactory;->create(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule_ProvidePwiErrorDialogFactoryFactory;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->providePwiErrorDialogFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule_ProvidePwiErrorDialogFactoryFactory;

    .line 107
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getGooglePayManager;

    .line 108
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getGooglePayManager;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getGooglePayManagerProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getGooglePayManager;

    .line 109
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getRecentlyViewedRetailersService;

    .line 111
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getRecentlyViewedRetailersService;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getRecentlyViewedRetailersServiceProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getRecentlyViewedRetailersService;

    .line 115
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule;

    move-result-object v3

    iget-object v4, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v5, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    iget-object v6, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getPwiHomeReducerProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getPwiHomeReducer;

    iget-object v7, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getPwiApiManagerProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getPwiApiManager;

    iget-object v8, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getPwiUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getPwiUserState;

    iget-object v9, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getPwiVariantProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getPwiVariant;

    iget-object v10, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v11, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v12, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    iget-object v13, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->providePwiErrorDialogFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule_ProvidePwiErrorDialogFactoryFactory;

    iget-object v14, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getGooglePayManagerProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getGooglePayManager;

    iget-object v15, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getRecentlyViewedRetailersServiceProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getRecentlyViewedRetailersService;

    .line 114
    invoke-static/range {v3 .. v15}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule_ProvideMvpPresenterFactory;

    move-result-object v1

    .line 113
    invoke-static {v1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 128
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 129
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 130
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 131
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 132
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 133
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 134
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 135
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 139
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule;

    move-result-object v3

    iget-object v4, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v5, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v6, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v7, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v8, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 138
    invoke-static/range {v3 .. v8}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v1

    .line 137
    invoke-static {v1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 145
    invoke-static/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectPwiHomeActivity(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 173
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 176
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 175
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 173
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 181
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 180
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 178
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 183
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 186
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 185
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 183
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 188
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 191
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 190
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 188
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 193
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 196
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 195
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 193
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 198
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 201
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 200
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 198
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 203
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 206
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 205
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 203
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 208
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 211
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 210
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 208
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 213
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 216
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 215
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 213
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 218
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 221
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 220
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 218
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 223
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 226
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 225
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 223
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 228
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 231
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 230
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 228
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 233
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 236
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 235
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 233
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 238
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 241
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 240
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 238
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 28
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;
    .locals 1

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 28
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;
    .locals 1

    .line 153
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 163
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 28
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;)V
    .locals 0

    .line 168
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->injectPwiHomeActivity(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;)V
    .locals 0

    return-void
.end method
