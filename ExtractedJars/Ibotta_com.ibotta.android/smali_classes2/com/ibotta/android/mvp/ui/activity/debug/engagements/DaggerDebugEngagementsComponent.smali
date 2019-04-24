.class public final Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;
.super Ljava/lang/Object;
.source "DaggerDebugEngagementsComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;,
        Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsView;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$1;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;
    .locals 2

    .line 54
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;)V
    .locals 8

    .line 61
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 60
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 62
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 63
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 64
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 65
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 69
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsModule;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 68
    invoke-static {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 67
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 72
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 73
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 74
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 75
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 76
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 77
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 78
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 79
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 80
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 81
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 85
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 84
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 83
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 91
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectDebugEngagementsActivity(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;)Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 120
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 123
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 122
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 120
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 125
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 128
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 127
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 125
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 133
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 132
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 130
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 135
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 138
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 137
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 135
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 140
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 143
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 142
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 140
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 148
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 147
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 145
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 153
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 152
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 150
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 158
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 157
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 155
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 163
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 162
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 160
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 165
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 168
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 167
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 165
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 170
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 173
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 172
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 170
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 175
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 178
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 177
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 175
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 180
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 183
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 182
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 180
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 185
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 188
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 187
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 185
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 22
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenter;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 22
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsView;
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 22
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;)V
    .locals 0

    .line 114
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->injectDebugEngagementsActivity(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;)Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsView;)V
    .locals 0

    return-void
.end method
