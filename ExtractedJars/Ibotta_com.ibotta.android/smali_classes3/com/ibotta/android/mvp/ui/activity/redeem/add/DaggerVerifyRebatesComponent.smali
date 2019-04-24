.class public final Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;
.super Ljava/lang/Object;
.source "DaggerVerifyRebatesComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getScanRules;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getVerificationManager;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getOfferCategoryHelper;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferCategoryHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getOfferCategoryHelper;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getScanRulesProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getScanRules;

.field private getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private getVerificationManagerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$1;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;
    .locals 2

    .line 66
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;)V
    .locals 11

    .line 73
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 72
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 74
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 75
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 76
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 77
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 78
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getOfferCategoryHelper;

    .line 79
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getOfferCategoryHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->getOfferCategoryHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getOfferCategoryHelper;

    .line 80
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

    .line 81
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getVerificationManager;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->getVerificationManagerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

    .line 82
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getScanRules;

    .line 83
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getScanRules;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->getScanRulesProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getScanRules;

    .line 84
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 85
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 86
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 87
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 88
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 89
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 93
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->getOfferCategoryHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getOfferCategoryHelper;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->getVerificationManagerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->getScanRulesProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getScanRules;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v9, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    iget-object v10, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->getTitleBarReducerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getTitleBarReducer;

    .line 92
    invoke-static/range {v2 .. v10}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 91
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 102
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 103
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 104
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 105
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 106
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 107
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 111
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 110
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 109
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 117
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectVerifyRebatesActivity(Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;)Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 148
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 147
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 145
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 153
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 152
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 150
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 158
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 157
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 155
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 163
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 162
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 160
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 165
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 168
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 167
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 165
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 170
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 173
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 172
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 170
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 175
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 178
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 177
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 175
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 180
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 183
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 182
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 180
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 185
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 188
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 187
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 185
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 190
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 193
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 192
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 190
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 195
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 198
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 197
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 195
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 200
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 203
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 202
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 200
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 205
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 208
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 207
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 205
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 210
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 213
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 212
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 210
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 26
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 26
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 135
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 26
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;)V
    .locals 0

    .line 140
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->injectVerifyRebatesActivity(Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;)Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;)V
    .locals 0

    return-void
.end method
