.class public final Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;
.super Ljava/lang/Object;
.source "DaggerVerifyScanComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getVariantFactory;,
        Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;,
        Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getFormatting;,
        Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getHardware;,
        Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getOfferHelper;,
        Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;,
        Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getVerificationManager;,
        Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getProductGroupHelper;,
        Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getAppHelper;,
        Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getTracker;,
        Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;,
        Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;
    }
.end annotation


# instance fields
.field private getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

.field private getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getAppHelper;

.field private getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getFormatting;

.field private getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

.field private getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getHardware;

.field private getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

.field private getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

.field private getProductGroupHelperProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getProductGroupHelper;

.field private getTrackerProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getTracker;

.field private getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

.field private getVerificationManagerProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private provideBarcodeMatcherProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule_ProvideBarcodeMatcherFactory;

.field private provideMvpPresenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private provideMvpViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanView;",
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
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->initialize(Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$1;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;
    .locals 2

    .line 69
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;)V
    .locals 10

    .line 76
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideMvpViewFactory;

    move-result-object v0

    .line 75
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    .line 77
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 78
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    .line 79
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getTracker;

    .line 80
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getTracker;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->getTrackerProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getTracker;

    .line 81
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 82
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getAppHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    .line 83
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getProductGroupHelper;

    .line 84
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getProductGroupHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->getProductGroupHelperProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getProductGroupHelper;

    .line 85
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

    .line 86
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getVerificationManager;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->getVerificationManagerProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

    .line 88
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule_ProvideBarcodeMatcherFactory;->create(Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule;)Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule_ProvideBarcodeMatcherFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->provideBarcodeMatcherProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule_ProvideBarcodeMatcherFactory;

    .line 89
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 90
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 94
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->getMvpPresenterActionsProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getMvpPresenterActions;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->getTrackerProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getTracker;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->getAppHelperProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getAppHelper;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->getProductGroupHelperProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getProductGroupHelper;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->getVerificationManagerProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getVerificationManager;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->provideBarcodeMatcherProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule_ProvideBarcodeMatcherFactory;

    iget-object v9, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->getGraphQLCallFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getGraphQLCallFactory;

    .line 93
    invoke-static/range {v2 .. v9}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule_ProvideMvpPresenterFactory;->create(Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule_ProvideMvpPresenterFactory;

    move-result-object v0

    .line 92
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    .line 102
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 103
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getOfferHelper;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    .line 104
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 105
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getHardware;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getHardware;

    .line 106
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 107
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getFormatting;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getFormatting;

    .line 108
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 109
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    .line 110
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 111
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getVariantFactory;-><init>(Lcom/ibotta/android/di/MainComponent;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 115
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->getOfferHelperProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getOfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->getHardwareProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getHardware;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->getFormattingProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getFormatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->getApiWorkSubmitterProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getApiWorkSubmitter;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->getVariantFactoryProvider:Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$com_ibotta_android_di_MainComponent_getVariantFactory;

    .line 114
    invoke-static/range {v2 .. v7}, Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;->create(Lcom/ibotta/android/mvp/base/AbstractMvpModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/base/AbstractMvpModule_ProvideRedeemPreflightHelperFactory;

    move-result-object v0

    .line 113
    invoke-static {v0}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    .line 121
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent$Builder;)Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method

.method private injectVerifyScanActivity(Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;)Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 149
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 152
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 151
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 149
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 154
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 157
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 156
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 154
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/base/MvpActivity;Landroid/os/Handler;)V

    .line 159
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 162
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAuthManager()Lcom/ibotta/android/state/user/auth/AuthManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 161
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 159
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 164
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 167
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getButtonSdkManager()Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 166
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkManager;

    .line 164
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectButtonSdkManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/buttonsdk/ButtonSdkManager;)V

    .line 169
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 172
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUpgradeState()Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 171
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/upgrade/UpgradeState;

    .line 169
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectUpgradeState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/upgrade/UpgradeState;)V

    .line 174
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 177
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCacheState()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 176
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    .line 174
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectAppCacheState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/cache/AppCacheState;)V

    .line 179
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 182
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 181
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 179
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectDebugState(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/debug/DebugState;)V

    .line 184
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 187
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 186
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 184
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectCacheClearFactory(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 189
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 192
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 191
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/GlobalEventManager;

    .line 189
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectGlobalEventManager(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/GlobalEventManager;)V

    .line 194
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 197
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getBuildProfile()Lcom/ibotta/android/profile/BuildProfile;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 196
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    .line 194
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 199
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 202
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 201
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 199
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 204
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 207
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTrackingFlushWorker()Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 206
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    .line 204
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectTrackingFlushWorker(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;)V

    .line 209
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 212
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getNotificationTracking()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 211
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    .line 209
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/MvpActivity_MembersInjector;->injectNotificationTracking(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 214
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 217
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerParcelHelper()Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 216
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 214
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity_MembersInjector;->injectRetailerParcelHelper(Lcom/ibotta/android/mvp/base/contentevents/ContentEventsActivity;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    .line 219
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 222
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 221
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    .line 219
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 224
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 227
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 226
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 224
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity_MembersInjector;->injectHandler(Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;Landroid/os/Handler;)V

    .line 229
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 232
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getTracker()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 231
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    .line 229
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 234
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 237
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getFcmState()Lcom/ibotta/android/state/app/fcm/FcmState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 236
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/fcm/FcmState;

    .line 234
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity_MembersInjector;->injectFcmState(Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;Lcom/ibotta/android/state/app/fcm/FcmState;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic getMvpPresenter()Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 1

    .line 27
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenter;

    move-result-object v0

    return-object v0
.end method

.method public getMvpPresenter()Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenter;
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->provideMvpPresenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenter;

    return-object v0
.end method

.method public bridge synthetic getMvpView()Lcom/ibotta/android/mvp/base/MvpView;
    .locals 1

    .line 27
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->getMvpView()Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanView;

    move-result-object v0

    return-object v0
.end method

.method public getMvpView()Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanView;
    .locals 1

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->provideMvpViewProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanView;

    return-object v0
.end method

.method public getRedeemPreflightHelper()Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
    .locals 1

    .line 139
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->provideRedeemPreflightHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    return-object v0
.end method

.method public bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 27
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanView;)V

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;)V
    .locals 0

    .line 144
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/DaggerVerifyScanComponent;->injectVerifyScanActivity(Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;)Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanActivity;

    return-void
.end method

.method public inject(Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanView;)V
    .locals 0

    return-void
.end method
