.class public Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "ReceiptCaptureModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;",
        ">;"
    }
.end annotation


# static fields
.field private static final RECEIPT_FILENAME:Ljava/lang/String; = "receipt_image%1$d.jpg"


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;
    .locals 8
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 36
    new-instance v7, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;)V

    return-object v7
.end method

.method public provideReceiptCaptureBreadcrumbManager(Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 52
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;-><init>(Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;)V

    return-object v0
.end method

.method public provideReceiptCaptureStorage()Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 42
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;-><init>()V

    return-object v0
.end method

.method public provideReceiptGuideController(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;
    .locals 2
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 47
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;

    const-string v1, "receipt_image%1$d.jpg"

    invoke-direct {v0, p1, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;Ljava/lang/String;)V

    return-object v0
.end method

.method public provideReceiptImageProcessor(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/BitmapUtil;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Lcom/ibotta/android/util/pipeline/PipelineFactory;Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;
    .locals 9
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 64
    new-instance v8, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;

    const-string v7, "receipt_image%1$d.jpg"

    move-object v0, v8

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/BitmapUtil;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Lcom/ibotta/android/util/pipeline/PipelineFactory;Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;Ljava/lang/String;)V

    return-object v8
.end method
