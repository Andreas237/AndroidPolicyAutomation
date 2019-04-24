.class public final Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;
.super Ljava/lang/Object;
.source "DaggerNotificationsComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getNotificationRoutingUtil;,
        Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getNotificationDetailFactory;,
        Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getRouteHandler;,
        Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;,
        Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getUserState;,
        Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getAppConfig;,
        Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getAppConfig;

.field private getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getNotificationDetailFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getNotificationDetailFactory;

.field private getNotificationRoutingUtilProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getNotificationRoutingUtil;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getRouteHandlerProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getRouteHandler;

.field private getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getUserState;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;",
            ">;"
        }
    .end annotation
.end field

.field private provideNotificationCountManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/async/notification/NotificationCountManager;",
            ">;"
        }
    .end annotation
.end field

.field private provideNotificationIntentCreatorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/intent/NotificationIntentCreator;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$1;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;
    .locals 2

    .line 78
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;)V
    .locals 10

    .line 85
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 84
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 86
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 87
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 88
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    .line 89
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getAppConfig;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    .line 90
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 91
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 92
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 93
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 94
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 95
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 99
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 98
    invoke-static {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule_ProvideNotificationCountManagerFactory;->create(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule_ProvideNotificationCountManagerFactory;

    move-result-object v0

    .line 97
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->provideNotificationCountManagerProvider:Ljavax/inject/Provider;

    .line 102
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 103
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 107
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->provideNotificationCountManagerProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v9, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 106
    invoke-static/range {v2 .. v9}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 105
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 115
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 116
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 117
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 118
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 119
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 120
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 124
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 123
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 122
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 130
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 131
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getRouteHandler;

    .line 132
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getRouteHandler;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->getRouteHandlerProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getRouteHandler;

    .line 133
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getNotificationDetailFactory;

    .line 134
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getNotificationDetailFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->getNotificationDetailFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getNotificationDetailFactory;

    .line 135
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getNotificationRoutingUtil;

    .line 136
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getNotificationRoutingUtil;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->getNotificationRoutingUtilProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getNotificationRoutingUtil;

    .line 140
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->getRouteHandlerProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getRouteHandler;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->getNotificationDetailFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getNotificationDetailFactory;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->getNotificationRoutingUtilProvider:Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$com_ibotta_android_di_MainComponent_getNotificationRoutingUtil;

    .line 139
    invoke-static {p1, v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule_ProvideNotificationIntentCreatorFactory;->create(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule_ProvideNotificationIntentCreatorFactory;

    move-result-object p1

    .line 138
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->provideNotificationIntentCreatorProvider:Ljavax/inject/Provider;

    return-void
.end method

.method private injectNotificationsActivity(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;)Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 174
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 173
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 171
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 176
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 179
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 178
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 176
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 181
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 184
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 183
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 181
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 186
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 189
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 188
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 186
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 194
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 193
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 191
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 196
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 199
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 198
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 196
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 201
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 204
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 203
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 201
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 206
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 209
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 208
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 206
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 211
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 214
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 213
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 211
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 216
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 219
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 218
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 216
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 221
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 224
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 223
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 221
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 226
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 229
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 228
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 226
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 231
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 234
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 233
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 231
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 236
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 239
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 238
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 236
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 241
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->provideNotificationIntentCreatorProvider:Ljavax/inject/Provider;

    .line 242
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/routing/intent/NotificationIntentCreator;

    .line 241
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity_MembersInjector;->injectNotificationIntentCreator(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;Lcom/ibotta/android/routing/intent/NotificationIntentCreator;)V

    .line 243
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 246
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBrazeTracking()Lcom/ibotta/android/tracking/braze/BrazeTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 245
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/braze/BrazeTracking;

    .line 243
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity_MembersInjector;->injectBrazeTracking(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;Lcom/ibotta/android/tracking/braze/BrazeTracking;)V

    .line 248
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 251
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 250
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 248
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 29
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenter;
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 29
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;
    .locals 1

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 161
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 29
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;)V
    .locals 0

    .line 166
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->injectNotificationsActivity(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;)Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;)V
    .locals 0

    return-void
.end method
