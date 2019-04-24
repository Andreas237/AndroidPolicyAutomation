.class public final Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;
.super Ljava/lang/Object;
.source "DaggerWindfallReceiptCaptureComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getBreadcrumbStorage;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getVerificationManager;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getWindfallRetailerSupport;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getWindfallHelper;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getAppCache;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getAppConfig;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppCacheProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getAppCache;

.field private getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getAppConfig;

.field private getBreadcrumbStorageProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getBreadcrumbStorage;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private getVerificationManagerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

.field private getWindfallHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getWindfallHelper;

.field private getWindfallRetailerSupportProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getWindfallRetailerSupport;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;",
            ">;"
        }
    .end annotation
.end field

.field private provideReceiptCaptureStorageProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;",
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

.field private provideWindfallReceiptImageSaverProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptImageSaver;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$1;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;
    .locals 2

    .line 76
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;)V
    .locals 12

    .line 83
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 82
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 84
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 85
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 86
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    .line 87
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getAppConfig;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    .line 88
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getAppCache;

    .line 89
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getAppCache;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->getAppCacheProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getAppCache;

    .line 93
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;

    move-result-object v0

    .line 92
    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule_ProvideReceiptCaptureStorageFactory;->create(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule_ProvideReceiptCaptureStorageFactory;

    move-result-object v0

    .line 91
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->provideReceiptCaptureStorageProvider:Ljavax/inject/Provider;

    .line 97
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;

    move-result-object v0

    .line 96
    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule_ProvideWindfallReceiptImageSaverFactory;->create(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule_ProvideWindfallReceiptImageSaverFactory;

    move-result-object v0

    .line 95
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->provideWindfallReceiptImageSaverProvider:Ljavax/inject/Provider;

    .line 98
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getWindfallHelper;

    .line 99
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getWindfallHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->getWindfallHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getWindfallHelper;

    .line 100
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getWindfallRetailerSupport;

    .line 101
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getWindfallRetailerSupport;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->getWindfallRetailerSupportProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getWindfallRetailerSupport;

    .line 102
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

    .line 103
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getVerificationManager;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->getVerificationManagerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

    .line 104
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getBreadcrumbStorage;

    .line 105
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getBreadcrumbStorage;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->getBreadcrumbStorageProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getBreadcrumbStorage;

    .line 109
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->getAppConfigProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getAppConfig;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->getAppCacheProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getAppCache;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->provideReceiptCaptureStorageProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->provideWindfallReceiptImageSaverProvider:Ljavax/inject/Provider;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->getWindfallHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getWindfallHelper;

    iget-object v9, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->getWindfallRetailerSupportProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getWindfallRetailerSupport;

    iget-object v10, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->getVerificationManagerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

    iget-object v11, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->getBreadcrumbStorageProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getBreadcrumbStorage;

    .line 108
    invoke-static/range {v2 .. v11}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 107
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 119
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 120
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 121
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 122
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 123
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 124
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 125
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 126
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 127
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 128
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 132
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 131
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 130
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 138
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectWindfallReceiptCaptureActivity(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;)Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 170
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 169
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 167
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 172
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 175
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 174
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 172
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 177
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 180
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 179
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 177
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 182
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 185
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 184
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 182
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 187
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 190
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 189
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 187
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 192
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 195
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 194
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 192
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 197
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 200
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 199
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 197
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 202
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 205
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 204
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 202
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 210
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 209
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 207
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 212
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 215
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 214
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 212
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 217
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 220
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 219
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 217
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 222
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 225
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 224
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 222
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 227
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 230
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 229
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 227
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 232
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 235
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 234
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 232
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 237
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 240
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 239
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 237
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 242
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 245
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getStorageSiloState()Lcom/ibotta/android/state/xprocess/StorageSiloState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 244
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/xprocess/StorageSiloState;

    .line 242
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity_MembersInjector;->injectStorageSiloState(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;Lcom/ibotta/android/state/xprocess/StorageSiloState;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 28
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;
    .locals 1

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 28
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 28
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;)V
    .locals 0

    .line 161
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->injectWindfallReceiptCaptureActivity(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;)Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;)V
    .locals 0

    return-void
.end method
