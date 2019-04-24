.class public final Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;
.super Ljava/lang/Object;
.source "DaggerRedeemRetailersComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getResources;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getAppHelper;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getAppConfig;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getImTextHelper;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getUserState;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getAppConfig;

.field private getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getAppHelper;

.field private getFavoriteRetailersManagerFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getImTextHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getResourcesProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getResources;

.field private getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

.field private getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getUserState;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideImRedemptionActionCollaboratorsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionCollaborators;",
            ">;"
        }
    .end annotation
.end field

.field private provideImRedemptionDispatcherProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionAction;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;",
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

.field private provideRedeemRetailersReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/redeem/RedeemRetailersReducer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;)V
    .locals 0

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$1;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;
    .locals 2

    .line 90
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;)V
    .locals 10

    .line 97
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 96
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 98
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 99
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 100
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 101
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 102
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 103
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 104
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 105
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 106
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

    .line 107
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getImTextHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getImTextHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

    .line 108
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    .line 109
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getAppConfig;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    .line 113
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;->access$300(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;

    move-result-object v0

    .line 112
    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule_ProvideImRedemptionActionCollaboratorsFactory;->create(Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;)Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule_ProvideImRedemptionActionCollaboratorsFactory;

    move-result-object v0

    .line 111
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->provideImRedemptionActionCollaboratorsProvider:Ljavax/inject/Provider;

    .line 114
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 115
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 116
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 117
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 118
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 119
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 120
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 121
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 125
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 124
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 123
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 131
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    .line 132
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    .line 133
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 134
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getAppHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 138
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;->access$300(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getImTextHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->provideImRedemptionActionCollaboratorsProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getRetailerParcelHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getRetailerParcelHelper;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 137
    invoke-static/range {v2 .. v8}, Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule_ProvideImRedemptionDispatcherFactory;->create(Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule_ProvideImRedemptionDispatcherFactory;

    move-result-object v0

    .line 136
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->provideImRedemptionDispatcherProvider:Ljavax/inject/Provider;

    .line 145
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;

    .line 147
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getFavoriteRetailersManagerFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;

    .line 148
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getResources;

    .line 149
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getResources;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getResourcesProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getResources;

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getResourcesProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getResources;

    .line 152
    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersModule_ProvideRedeemRetailersReducerFactory;->create(Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersModule_ProvideRedeemRetailersReducerFactory;

    move-result-object v0

    .line 151
    invoke-static {v0}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->provideRedeemRetailersReducerProvider:Ljavax/inject/Provider;

    .line 157
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersModule;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->provideImRedemptionDispatcherProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getFavoriteRetailersManagerFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getFavoriteRetailersManagerFactory;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getImTextHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$com_ibotta_android_di_MainComponent_getImTextHelper;

    iget-object v9, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->provideRedeemRetailersReducerProvider:Ljavax/inject/Provider;

    .line 156
    invoke-static/range {v1 .. v9}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 155
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 166
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectRedeemRetailersActivity(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;)Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 194
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 197
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 196
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 194
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 199
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 202
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 201
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 199
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 204
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 207
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 206
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 204
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 209
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 212
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 211
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 209
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 214
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 217
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 216
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 214
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 219
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 222
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 221
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 219
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 224
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 227
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 226
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 224
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 229
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 232
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 231
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 229
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 234
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 237
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 236
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 234
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 239
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 242
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 241
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 239
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 244
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 247
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 246
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 244
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 249
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 252
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 251
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 249
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 254
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 257
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 256
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 254
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 259
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 262
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 261
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 259
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 264
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 267
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 266
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 264
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 36
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenter;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 36
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;
    .locals 1

    .line 174
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 184
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 36
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;)V
    .locals 0

    .line 189
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/DaggerRedeemRetailersComponent;->injectRedeemRetailersActivity(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;)Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;)V
    .locals 0

    return-void
.end method
