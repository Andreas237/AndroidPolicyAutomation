.class public final Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;
.super Ljava/lang/Object;
.source "DaggerChangeQuantityComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getAppHelper;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getVerificationManager;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getAppHelper;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private getVerificationManagerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$1;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;
    .locals 2

    .line 60
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;)V
    .locals 8

    .line 67
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 66
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 68
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 69
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 70
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

    .line 71
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getVerificationManager;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->getVerificationManagerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

    .line 72
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 73
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getAppHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 74
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 75
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 79
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityModule;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->getVerificationManagerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 78
    invoke-static {v0, v1, v2, v3, v4}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 77
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 84
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 85
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 86
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 87
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 88
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 89
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 90
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 91
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 92
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 93
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 97
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 96
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 95
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 103
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectChangeQuantityActivity(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;)Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 131
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 134
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 133
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 131
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 139
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 138
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 136
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 141
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 144
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 143
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 141
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 149
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 148
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 146
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 154
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 153
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 151
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 156
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 159
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 158
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 156
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 161
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 164
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 163
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 161
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 169
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 168
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 166
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 174
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 173
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 171
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 176
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 179
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 178
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 176
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 181
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 184
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 183
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 181
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 186
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 189
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 188
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 186
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 194
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 193
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 191
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 196
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 199
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 198
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 196
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 201
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 204
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getImageCache()Lcom/ibotta/android/images/ImageCache;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 203
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    .line 201
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;Lcom/ibotta/android/images/ImageCache;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 24
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenter;
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 24
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 24
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;)V
    .locals 0

    .line 126
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->injectChangeQuantityActivity(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;)Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;)V
    .locals 0

    return-void
.end method
