.class public final Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;
.super Ljava/lang/Object;
.source "DaggerDebugFeatureFlagComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;
    }
.end annotation


# instance fields
.field private debugFeatureFlagModule:Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule;

.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagView;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$1;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;
    .locals 2

    .line 47
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;)V
    .locals 8

    .line 54
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 53
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 55
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->debugFeatureFlagModule:Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule;

    .line 56
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 57
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 58
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 59
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 60
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 61
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 62
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 63
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 64
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 65
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 66
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 70
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 69
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object p1

    .line 68
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method private injectDebugFeatureFlagActivity(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;)Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 120
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 19
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenter;
    .locals 7

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->debugFeatureFlagModule:Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 91
    invoke-interface {v1}, Lcom/ibotta/android/di/MainComponent;->getMvpPresenterActions()Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    move-result-object v1

    const-string v2, "Cannot return null from a non-@Nullable component method"

    .line 90
    invoke-static {v1, v2}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 94
    invoke-interface {v2}, Lcom/ibotta/android/di/MainComponent;->getConfigRegistry()Lcom/ibotta/android/features/registry/ConfigRegistry;

    move-result-object v2

    const-string v3, "Cannot return null from a non-@Nullable component method"

    .line 93
    invoke-static {v2, v3}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/features/registry/ConfigRegistry;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 97
    invoke-interface {v3}, Lcom/ibotta/android/di/MainComponent;->getDebugFeatureFlagStorage()Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

    move-result-object v3

    const-string v4, "Cannot return null from a non-@Nullable component method"

    .line 96
    invoke-static {v3, v4}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 100
    invoke-interface {v4}, Lcom/ibotta/android/di/MainComponent;->getGeofenceCoordinator()Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    move-result-object v4

    const-string v5, "Cannot return null from a non-@Nullable component method"

    .line 99
    invoke-static {v4, v5}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 103
    invoke-interface {v5}, Lcom/ibotta/android/di/MainComponent;->getDebugFeatureFlagReducer()Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer;

    move-result-object v5

    const-string v6, "Cannot return null from a non-@Nullable component method"

    .line 102
    invoke-static {v5, v6}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer;

    .line 88
    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule_ProvidePresenterFactory;->proxyProvidePresenter(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/features/registry/ConfigRegistry;Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;Lcom/ibotta/android/location/geofence/GeofenceCoordinator;Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer;)Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 19
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagView;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 19
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;)V
    .locals 0

    .line 114
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->injectDebugFeatureFlagActivity(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;)Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagView;)V
    .locals 0

    return-void
.end method
