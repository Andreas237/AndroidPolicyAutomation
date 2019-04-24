.class public final Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptImageProcessorFactory;
.super Ljava/lang/Object;
.source "ReceiptCaptureModule_ProvideReceiptImageProcessorFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;",
        ">;"
    }
.end annotation


# instance fields
.field private final appHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final appTimingTrackerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/timing/AppTimingTracker;",
            ">;"
        }
    .end annotation
.end field

.field private final bitmapUtilProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/BitmapUtil;",
            ">;"
        }
    .end annotation
.end field

.field private final guideControllerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;

.field private final pipelineFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/pipeline/PipelineFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final storageProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/BitmapUtil;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/timing/AppTimingTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/pipeline/PipelineFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;",
            ">;)V"
        }
    .end annotation

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptImageProcessorFactory;->module:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;

    .line 41
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptImageProcessorFactory;->appHelperProvider:Ljavax/inject/Provider;

    .line 42
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptImageProcessorFactory;->bitmapUtilProvider:Ljavax/inject/Provider;

    .line 43
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptImageProcessorFactory;->appTimingTrackerProvider:Ljavax/inject/Provider;

    .line 44
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptImageProcessorFactory;->pipelineFactoryProvider:Ljavax/inject/Provider;

    .line 45
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptImageProcessorFactory;->storageProvider:Ljavax/inject/Provider;

    .line 46
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptImageProcessorFactory;->guideControllerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptImageProcessorFactory;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/BitmapUtil;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/timing/AppTimingTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/pipeline/PipelineFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptImageProcessorFactory;"
        }
    .end annotation

    .line 87
    new-instance v8, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptImageProcessorFactory;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptImageProcessorFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v8
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/BitmapUtil;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/timing/AppTimingTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/pipeline/PipelineFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;"
        }
    .end annotation

    .line 71
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/util/AppHelper;

    .line 72
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lcom/ibotta/android/util/BitmapUtil;

    .line 73
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lcom/ibotta/android/tracking/timing/AppTimingTracker;

    .line 74
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lcom/ibotta/android/util/pipeline/PipelineFactory;

    .line 75
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

    .line 76
    invoke-interface {p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;

    move-object v0, p0

    .line 69
    invoke-static/range {v0 .. v6}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptImageProcessorFactory;->proxyProvideReceiptImageProcessor(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/BitmapUtil;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Lcom/ibotta/android/util/pipeline/PipelineFactory;Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideReceiptImageProcessor(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/BitmapUtil;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Lcom/ibotta/android/util/pipeline/PipelineFactory;Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;
    .locals 0

    .line 106
    invoke-virtual/range {p0 .. p6}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;->provideReceiptImageProcessor(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/BitmapUtil;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Lcom/ibotta/android/util/pipeline/PipelineFactory;Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 105
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;
    .locals 7

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptImageProcessorFactory;->module:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptImageProcessorFactory;->appHelperProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptImageProcessorFactory;->bitmapUtilProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptImageProcessorFactory;->appTimingTrackerProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptImageProcessorFactory;->pipelineFactoryProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptImageProcessorFactory;->storageProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptImageProcessorFactory;->guideControllerProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v6}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptImageProcessorFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptImageProcessorFactory;->get()Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;

    move-result-object v0

    return-object v0
.end method
