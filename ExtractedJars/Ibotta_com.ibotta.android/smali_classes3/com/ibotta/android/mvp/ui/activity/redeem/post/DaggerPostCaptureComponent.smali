.class public final Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;
.super Ljava/lang/Object;
.source "DaggerPostCaptureComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureView;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$1;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;
    .locals 2

    .line 50
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;)V
    .locals 8

    .line 57
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 56
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 58
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 59
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 63
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureModule;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 62
    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 61
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 64
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 65
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 66
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 67
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 68
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 69
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 70
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 71
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 72
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 73
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 77
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 76
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 75
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 83
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectPostCaptureActivity(Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;)Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 114
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 113
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 111
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 119
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 118
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 116
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 124
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 123
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 121
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 129
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 128
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 126
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 131
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 134
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 133
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 131
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 139
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 138
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 136
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 141
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 144
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 143
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 141
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 149
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 148
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 146
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 154
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 153
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 151
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 156
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 159
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 158
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 156
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 161
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 164
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 163
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 161
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 169
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 168
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 166
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 174
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 173
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 171
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 176
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 179
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getFormatting()Lcom/ibotta/android/util/Formatting;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 178
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    .line 176
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;Lcom/ibotta/android/util/Formatting;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 20
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenter;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 20
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureView;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 20
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;)V
    .locals 0

    .line 106
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->injectPostCaptureActivity(Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;)Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureView;)V
    .locals 0

    return-void
.end method
