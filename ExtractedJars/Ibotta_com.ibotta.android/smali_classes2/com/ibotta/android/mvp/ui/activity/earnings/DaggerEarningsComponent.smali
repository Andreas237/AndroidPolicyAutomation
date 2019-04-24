.class public final Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;
.super Ljava/lang/Object;
.source "DaggerEarningsComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;,
        Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getEarningsHelper;,
        Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getTracker;,
        Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;,
        Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getUserState;,
        Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;

.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

.field private getEarningsHelperProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getEarningsHelper;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getTrackerProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getTracker;

.field private getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getUserState;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$1;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;
    .locals 2

    .line 67
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;)V
    .locals 11

    .line 74
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 73
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 75
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 76
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 77
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 78
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 79
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 80
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getUserState;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getUserState;

    .line 81
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;

    .line 82
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->getApiCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;

    .line 83
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 84
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 85
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getTracker;

    .line 86
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getTracker;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->getTrackerProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getTracker;

    .line 87
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getEarningsHelper;

    .line 88
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getEarningsHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->getEarningsHelperProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getEarningsHelper;

    .line 89
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 90
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 94
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->getUserStateProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getUserState;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->getApiCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getApiCallFactory;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->getTrackerProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getTracker;

    iget-object v9, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->getEarningsHelperProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getEarningsHelper;

    iget-object v10, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->getCacheClearJobFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;

    .line 93
    invoke-static/range {v2 .. v10}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 92
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 103
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 104
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 105
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 106
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 107
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 108
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 112
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 111
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 110
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 118
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectEarningsActivity(Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;)Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 149
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 148
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 146
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 154
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 153
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 151
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 156
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 159
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 158
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 156
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 161
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 164
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 163
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 161
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 169
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 168
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 166
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 174
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 173
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 171
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 176
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 179
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 178
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 176
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 181
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 184
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 183
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 181
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 186
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 189
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 188
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 186
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 194
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 193
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 191
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 196
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 199
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 198
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 196
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 201
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 204
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 203
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 201
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 206
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 209
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 208
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 206
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 211
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 214
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 213
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 211
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 216
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 219
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 218
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 216
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;Lcom/ibotta/android/tracking/Tracker;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 26
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenter;
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 26
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 26
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;)V
    .locals 0

    .line 141
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earnings/DaggerEarningsComponent;->injectEarningsActivity(Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;)Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsView;)V
    .locals 0

    return-void
.end method
