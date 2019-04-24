.class public final Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;
.super Ljava/lang/Object;
.source "DaggerRetailerMapComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getUserState;,
        Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getUserState;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$1;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;
    .locals 2

    .line 54
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;)V
    .locals 8

    .line 61
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 60
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 62
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 63
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 64
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 65
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 69
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapModule;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 68
    invoke-static {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 67
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 70
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 71
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 72
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 73
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 74
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 75
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 76
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 77
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 78
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 79
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 83
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 82
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 81
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 89
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectRetailerMapActivity(Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;)Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 120
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 119
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 117
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 125
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 124
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 122
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 130
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 129
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 127
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 135
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 134
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 132
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 140
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 139
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 137
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 145
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 144
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 142
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 150
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 149
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 147
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 155
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 154
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 152
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 160
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 159
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 157
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 165
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 164
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 162
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 170
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 169
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 167
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 172
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 175
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 174
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 172
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 177
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 180
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 179
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 177
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 182
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 185
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 184
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 182
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 187
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 190
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 189
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 187
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;Lcom/ibotta/android/util/AppHelper;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 22
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenter;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 22
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 22
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;)V
    .locals 0

    .line 112
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/DaggerRetailerMapComponent;->injectRetailerMapActivity(Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;)Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapView;)V
    .locals 0

    return-void
.end method
