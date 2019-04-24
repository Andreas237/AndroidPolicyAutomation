.class public final Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;
.super Ljava/lang/Object;
.source "DaggerHelpCenterComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterView;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$1;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;
    .locals 2

    .line 51
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;)V
    .locals 8

    .line 58
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 57
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 59
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 60
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 64
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 63
    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 62
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 65
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 66
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 67
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 68
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 69
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 70
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 71
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 72
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 73
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 74
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 78
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 77
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 76
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 84
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectHelpCenterActivity(Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterActivity;)Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 115
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 114
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 112
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 120
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 119
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 117
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 125
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 124
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 122
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 130
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 129
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 127
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 135
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 134
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 132
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 140
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 139
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 137
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 145
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 144
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 142
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 150
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 149
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 147
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 155
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 154
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 152
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 160
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 159
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 157
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 165
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 164
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 162
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 170
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 169
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 167
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 172
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 175
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 174
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 172
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 177
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 180
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 179
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 177
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 182
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 185
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 184
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 182
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterActivity;Lcom/ibotta/android/util/AppHelper;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 21
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterPresenter;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 21
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterView;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 21
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterActivity;)V
    .locals 0

    .line 107
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/help/DaggerHelpCenterComponent;->injectHelpCenterActivity(Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterActivity;)Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/help/HelpCenterView;)V
    .locals 0

    return-void
.end method
