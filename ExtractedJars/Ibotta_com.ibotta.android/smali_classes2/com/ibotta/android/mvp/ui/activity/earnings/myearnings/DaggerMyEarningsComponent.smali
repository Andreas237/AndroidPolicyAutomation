.class public final Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;
.super Ljava/lang/Object;
.source "DaggerMyEarningsComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getNotificationRoutingUtil;,
        Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getNotificationDetailFactory;,
        Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getRouteHandler;,
        Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getApiJobFactory;,
        Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getEarningsHelper;,
        Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getUserState;,
        Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getApiJobFactory;

.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getEarningsHelperProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getEarningsHelper;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getNotificationDetailFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getNotificationDetailFactory;

.field private getNotificationRoutingUtilProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getNotificationRoutingUtil;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getRouteHandlerProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getRouteHandler;

.field private getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getUserState;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsView;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$1;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;
    .locals 2

    .line 74
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;)V
    .locals 8

    .line 81
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 80
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 82
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 83
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 84
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 85
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 86
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 87
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 88
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getEarningsHelper;

    .line 89
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getEarningsHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->getEarningsHelperProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getEarningsHelper;

    .line 90
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getApiJobFactory;

    .line 91
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getApiJobFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->getApiJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getApiJobFactory;

    .line 95
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->getEarningsHelperProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getEarningsHelper;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->getApiJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getApiJobFactory;

    .line 94
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 93
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 101
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 102
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 103
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 104
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 105
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 106
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 107
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 108
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 112
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 111
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 110
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 118
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 119
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getRouteHandler;

    .line 120
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getRouteHandler;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->getRouteHandlerProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getRouteHandler;

    .line 121
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getNotificationDetailFactory;

    .line 122
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getNotificationDetailFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->getNotificationDetailFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getNotificationDetailFactory;

    .line 123
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getNotificationRoutingUtil;

    .line 124
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getNotificationRoutingUtil;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->getNotificationRoutingUtilProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getNotificationRoutingUtil;

    .line 128
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->getRouteHandlerProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getRouteHandler;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->getNotificationDetailFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getNotificationDetailFactory;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->getNotificationRoutingUtilProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent$com_ibotta_android_di_MainComponent_getNotificationRoutingUtil;

    .line 127
    invoke-static {p1, v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule_ProvideNotificationIntentCreatorFactory;->create(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule_ProvideNotificationIntentCreatorFactory;

    move-result-object p1

    .line 126
    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->provideNotificationIntentCreatorProvider:Ljavax/inject/Provider;

    return-void
.end method

.method private injectMyEarningsActivity(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;)Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 159
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 162
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 161
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 159
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 164
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 167
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 166
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 164
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 169
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 172
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 171
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 169
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 174
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 177
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 176
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 174
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 179
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 182
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 181
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 179
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 184
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 187
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 186
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 184
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 189
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 192
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 191
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 189
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 194
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 197
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 196
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 194
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 199
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 202
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 201
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 199
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 204
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 207
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 206
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 204
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 209
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 212
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 211
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 209
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 214
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 217
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 216
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 214
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 219
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 222
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 221
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 219
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 224
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 227
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 226
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 224
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 229
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->provideNotificationIntentCreatorProvider:Ljavax/inject/Provider;

    .line 230
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/routing/intent/NotificationIntentCreator;

    .line 229
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity_MembersInjector;->injectNotificationIntentCreator(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;Lcom/ibotta/android/routing/intent/NotificationIntentCreator;)V

    .line 231
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 234
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBrazeTracking()Lcom/ibotta/android/tracking/braze/BrazeTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 233
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/braze/BrazeTracking;

    .line 231
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity_MembersInjector;->injectBrazeTracking(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;Lcom/ibotta/android/tracking/braze/BrazeTracking;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 28
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenter;
    .locals 1

    .line 144
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 28
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsView;
    .locals 1

    .line 139
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 28
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;)V
    .locals 0

    .line 154
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/DaggerMyEarningsComponent;->injectMyEarningsActivity(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;)Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsView;)V
    .locals 0

    return-void
.end method
