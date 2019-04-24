.class public final Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;
.super Ljava/lang/Object;
.source "DaggerImConnectedComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private imConnectedModule:Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedModule;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedView;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$1;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;
    .locals 2

    .line 48
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$1;)V

    return-object v0
.end method

.method private getImConnectedReducer()Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;
    .locals 3

    .line 52
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 54
    invoke-interface {v1}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v1

    const-string v2, "Cannot return null from a non-@Nullable component method"

    .line 53
    invoke-static {v1, v2}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/util/AppHelper;

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;-><init>(Lcom/ibotta/android/util/AppHelper;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;)V
    .locals 8

    .line 62
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 61
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 63
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedModule;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->imConnectedModule:Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedModule;

    .line 64
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 65
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 66
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 67
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 68
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 69
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 70
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 71
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 72
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 73
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 74
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 78
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 77
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object p1

    .line 76
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method private injectImConnectedActivity(Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;)Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 131
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

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

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 20
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenter;
    .locals 9

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->imConnectedModule:Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 99
    invoke-interface {v1}, Lcom/ibotta/android/di/MainComponent;->getMvpPresenterActions()Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    move-result-object v1

    const-string v2, "Cannot return null from a non-@Nullable component method"

    .line 98
    invoke-static {v1, v2}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    .line 101
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->getImConnectedReducer()Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 103
    invoke-interface {v3}, Lcom/ibotta/android/di/MainComponent;->getRetailerHelper()Lcom/ibotta/api/helper/retailer/RetailerHelper;

    move-result-object v3

    const-string v4, "Cannot return null from a non-@Nullable component method"

    .line 102
    invoke-static {v3, v4}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/api/helper/retailer/RetailerHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 106
    invoke-interface {v4}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v4

    const-string v5, "Cannot return null from a non-@Nullable component method"

    .line 105
    invoke-static {v4, v5}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 109
    invoke-interface {v5}, Lcom/ibotta/android/di/MainComponent;->getAppConfig()Lcom/ibotta/android/state/app/config/AppConfig;

    move-result-object v5

    const-string v6, "Cannot return null from a non-@Nullable component method"

    .line 108
    invoke-static {v5, v6}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ibotta/android/state/app/config/AppConfig;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 112
    invoke-interface {v6}, Lcom/ibotta/android/di/MainComponent;->getGraphQLCallFactory()Lcom/ibotta/android/graphql/GraphQLCallFactory;

    move-result-object v6

    const-string v7, "Cannot return null from a non-@Nullable component method"

    .line 111
    invoke-static {v6, v7}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ibotta/android/graphql/GraphQLCallFactory;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 115
    invoke-interface {v7}, Lcom/ibotta/android/di/MainComponent;->getApiJobFactory()Lcom/ibotta/android/service/api/job/ApiJobFactory;

    move-result-object v7

    const-string v8, "Cannot return null from a non-@Nullable component method"

    .line 114
    invoke-static {v7, v8}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ibotta/android/service/api/job/ApiJobFactory;

    .line 96
    invoke-static/range {v0 .. v7}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedModule_ProvidePresenterFactory;->proxyProvidePresenter(Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/service/api/job/ApiJobFactory;)Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 20
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedView;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 20
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;)V
    .locals 0

    .line 126
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->injectImConnectedActivity(Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;)Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedView;)V
    .locals 0

    return-void
.end method
