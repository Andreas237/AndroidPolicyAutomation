.class public final Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;
.super Ljava/lang/Object;
.source "DaggerNotificationDetailComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getTracker;,
        Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getUserState;,
        Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getAppHelper;,
        Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getAppHelper;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getTrackerProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getTracker;

.field private getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getUserState;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$1;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;
    .locals 2

    .line 60
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;)V
    .locals 8

    .line 67
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 66
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 68
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 69
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 70
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 71
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getAppHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 72
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 73
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 74
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getTracker;

    .line 75
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getTracker;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->getTrackerProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getTracker;

    .line 79
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailModule;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->getTrackerProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getTracker;

    .line 78
    invoke-static {v0, v1, v2, v3, v4}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 77
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 84
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 85
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 86
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 87
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 88
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 89
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 90
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 91
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 92
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 93
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 97
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 96
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 95
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 103
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectNotificationDetailActivity(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;)Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 135
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 134
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 132
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 140
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 139
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 137
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 145
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 144
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 142
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 150
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 149
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 147
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 155
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 154
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 152
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 160
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 159
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 157
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 165
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 164
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 162
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 170
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 169
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 167
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 172
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 175
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 174
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 172
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 177
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 180
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 179
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 177
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 182
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 185
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 184
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 182
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 187
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 190
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 189
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 187
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 192
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 195
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 194
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 192
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 197
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 200
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 199
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 197
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 202
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 205
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 204
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 202
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 210
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationDetailFactory()Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 209
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactory;

    .line 207
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity_MembersInjector;->injectNotificationDetailFactory(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactory;)V

    .line 212
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 215
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 214
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 212
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 24
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 24
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 24
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;)V
    .locals 0

    .line 126
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/DaggerNotificationDetailComponent;->injectNotificationDetailActivity(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;)Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;)V
    .locals 0

    return-void
.end method
