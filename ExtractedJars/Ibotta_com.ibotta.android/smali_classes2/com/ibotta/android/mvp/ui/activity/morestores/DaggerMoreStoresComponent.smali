.class public final Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;
.super Ljava/lang/Object;
.source "DaggerMoreStoresComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;,
        Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;,
        Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getCategoryHelper;,
        Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getCategoryHelperProvider:Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getCategoryHelper;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresView;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;)V
    .locals 0

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$1;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;
    .locals 2

    .line 61
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;)V
    .locals 8

    .line 68
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 67
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 69
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 70
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 71
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 72
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 73
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getCategoryHelper;

    .line 74
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getCategoryHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->getCategoryHelperProvider:Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getCategoryHelper;

    .line 75
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 76
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 77
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    .line 78
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    .line 82
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->getCategoryHelperProvider:Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getCategoryHelper;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->getLoadRetailersVariantProvider:Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getLoadRetailersVariant;

    .line 81
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 80
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 88
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 89
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 90
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 91
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 92
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 93
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 94
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 95
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 99
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 98
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 97
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 105
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectMoreStoresActivity(Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresActivity;)Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 133
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 136
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 135
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 133
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 138
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 141
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 140
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 138
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 143
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 146
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 145
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 143
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 151
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 150
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 148
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 153
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 156
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 155
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 153
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 161
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 160
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 158
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 163
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 166
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 165
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 163
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 168
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 171
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 170
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 168
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 173
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 176
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 175
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 173
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 181
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 180
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 178
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 183
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 186
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 185
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 183
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 188
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 191
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 190
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 188
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 193
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 196
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 195
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 193
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 198
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 201
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 200
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 198
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 24
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenter;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 24
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresView;
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 24
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresActivity;)V
    .locals 0

    .line 128
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/morestores/DaggerMoreStoresComponent;->injectMoreStoresActivity(Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresActivity;)Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresView;)V
    .locals 0

    return-void
.end method
