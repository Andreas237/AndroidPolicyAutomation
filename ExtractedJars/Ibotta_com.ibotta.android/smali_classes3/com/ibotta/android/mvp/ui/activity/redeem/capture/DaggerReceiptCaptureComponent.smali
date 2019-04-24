.class public final Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;
.super Ljava/lang/Object;
.source "DaggerReceiptCaptureComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getPipelineFactory;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getAppTimingTracker;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getBitmapUtil;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getAppHelper;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getBreadcrumbStorage;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getTracker;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getAppHelper;

.field private getAppTimingTrackerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getAppTimingTracker;

.field private getBitmapUtilProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getBitmapUtil;

.field private getBreadcrumbStorageProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getBreadcrumbStorage;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getPipelineFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getPipelineFactory;

.field private getTrackerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getTracker;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;",
            ">;"
        }
    .end annotation
.end field

.field private provideReceiptCaptureBreadcrumbManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;",
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

.field private provideReceiptGuideControllerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;",
            ">;"
        }
    .end annotation
.end field

.field private provideReceiptImageProcessorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$1;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;
    .locals 2

    .line 76
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;)V
    .locals 9

    .line 83
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 82
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 84
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 85
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 86
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getTracker;

    .line 87
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getTracker;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->getTrackerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getTracker;

    .line 91
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;

    move-result-object v0

    .line 90
    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptCaptureStorageFactory;->create(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptCaptureStorageFactory;

    move-result-object v0

    .line 89
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->provideReceiptCaptureStorageProvider:Ljavax/inject/Provider;

    .line 95
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->provideReceiptCaptureStorageProvider:Ljavax/inject/Provider;

    .line 94
    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptGuideControllerFactory;->create(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptGuideControllerFactory;

    move-result-object v0

    .line 93
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->provideReceiptGuideControllerProvider:Ljavax/inject/Provider;

    .line 96
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getBreadcrumbStorage;

    .line 97
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getBreadcrumbStorage;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->getBreadcrumbStorageProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getBreadcrumbStorage;

    .line 101
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->getBreadcrumbStorageProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getBreadcrumbStorage;

    .line 100
    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptCaptureBreadcrumbManagerFactory;->create(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptCaptureBreadcrumbManagerFactory;

    move-result-object v0

    .line 99
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->provideReceiptCaptureBreadcrumbManagerProvider:Ljavax/inject/Provider;

    .line 102
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 103
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getAppHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 104
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getBitmapUtil;

    .line 105
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getBitmapUtil;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->getBitmapUtilProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getBitmapUtil;

    .line 106
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getAppTimingTracker;

    .line 107
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getAppTimingTracker;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->getAppTimingTrackerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getAppTimingTracker;

    .line 108
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getPipelineFactory;

    .line 109
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getPipelineFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->getPipelineFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getPipelineFactory;

    .line 113
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->getBitmapUtilProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getBitmapUtil;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->getAppTimingTrackerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getAppTimingTracker;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->getPipelineFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getPipelineFactory;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->provideReceiptCaptureStorageProvider:Ljavax/inject/Provider;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->provideReceiptGuideControllerProvider:Ljavax/inject/Provider;

    .line 112
    invoke-static/range {v2 .. v8}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptImageProcessorFactory;->create(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptImageProcessorFactory;

    move-result-object v0

    .line 111
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->provideReceiptImageProcessorProvider:Ljavax/inject/Provider;

    .line 123
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->getTrackerProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getTracker;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->provideReceiptCaptureStorageProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->provideReceiptGuideControllerProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->provideReceiptCaptureBreadcrumbManagerProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->provideReceiptImageProcessorProvider:Ljavax/inject/Provider;

    .line 122
    invoke-static/range {v1 .. v7}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 121
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 130
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 131
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 132
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 133
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 134
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 135
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 136
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 137
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 138
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 139
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 143
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 142
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 141
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 149
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectReceiptCaptureActivity(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 177
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 180
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 179
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 177
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 182
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 185
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 184
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 182
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 187
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 190
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 189
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 187
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 192
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 195
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 194
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 192
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 197
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 200
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 199
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 197
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 202
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 205
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 204
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 202
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 210
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 209
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 207
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 212
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 215
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 214
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 212
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 217
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 220
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 219
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 217
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 222
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 225
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 224
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 222
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 227
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 230
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 229
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 227
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 232
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 235
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 234
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 232
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 237
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 240
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 239
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 237
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 242
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 245
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getStorageSiloState()Lcom/ibotta/android/state/xprocess/StorageSiloState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 244
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/xprocess/StorageSiloState;

    .line 242
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity_MembersInjector;->injectStorageSiloState(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;Lcom/ibotta/android/state/xprocess/StorageSiloState;)V

    .line 247
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->provideReceiptImageProcessorProvider:Ljavax/inject/Provider;

    .line 248
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;

    .line 247
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity_MembersInjector;->injectImageProcessor(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;)V

    .line 249
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 252
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getFormatting()Lcom/ibotta/android/util/Formatting;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 251
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    .line 249
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;Lcom/ibotta/android/util/Formatting;)V

    .line 254
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 257
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 256
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 254
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;Landroid/os/Handler;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 26
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 26
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;
    .locals 1

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 26
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;)V
    .locals 0

    .line 172
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->injectReceiptCaptureActivity(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;)V
    .locals 0

    return-void
.end method
