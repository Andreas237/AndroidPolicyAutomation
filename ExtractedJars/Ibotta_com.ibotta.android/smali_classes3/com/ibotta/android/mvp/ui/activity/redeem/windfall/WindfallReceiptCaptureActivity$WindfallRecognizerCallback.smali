.class Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity$WindfallRecognizerCallback;
.super Lcom/microblink/SimpleCameraRecognizerCallback;
.source "WindfallReceiptCaptureActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "WindfallRecognizerCallback"
.end annotation


# instance fields
.field private lastEdgeDetectionState:I

.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;


# direct methods
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;)V
    .locals 0

    .line 416
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity$WindfallRecognizerCallback;->this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;

    invoke-direct {p0}, Lcom/microblink/SimpleCameraRecognizerCallback;-><init>()V

    const/4 p1, -0x1

    .line 417
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity$WindfallRecognizerCallback;->lastEdgeDetectionState:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity$1;)V
    .locals 0

    .line 416
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity$WindfallRecognizerCallback;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;)V

    return-void
.end method

.method public static synthetic lambda$processEdgeDetectionResult$0(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity$WindfallRecognizerCallback;)V
    .locals 1

    .line 475
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity$WindfallRecognizerCallback;->this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->access$800(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;->onReceiptImageTooFarAway()V

    return-void
.end method

.method public static synthetic lambda$processEdgeDetectionResult$1(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity$WindfallRecognizerCallback;)V
    .locals 1

    .line 480
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity$WindfallRecognizerCallback;->this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->access$700(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;->onReceiptImageSufficientlyClose()V

    return-void
.end method

.method private processEdgeDetectionResult(Lcom/microblink/EdgeDetectionState;)V
    .locals 1

    .line 472
    invoke-virtual {p1}, Lcom/microblink/EdgeDetectionState;->state()I

    move-result p1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    goto :goto_0

    .line 475
    :pswitch_0
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/-$$Lambda$WindfallReceiptCaptureActivity$WindfallRecognizerCallback$cCc3REiSDK6kz_fFmb_wcbvQUX8;

    invoke-direct {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/-$$Lambda$WindfallReceiptCaptureActivity$WindfallRecognizerCallback$cCc3REiSDK6kz_fFmb_wcbvQUX8;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity$WindfallRecognizerCallback;)V

    goto :goto_0

    .line 480
    :cond_0
    :pswitch_1
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/-$$Lambda$WindfallReceiptCaptureActivity$WindfallRecognizerCallback$qUHLeq-7OeKb-QunkQ5tgO8tMqU;

    invoke-direct {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/-$$Lambda$WindfallReceiptCaptureActivity$WindfallRecognizerCallback$qUHLeq-7OeKb-QunkQ5tgO8tMqU;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity$WindfallRecognizerCallback;)V

    :goto_0
    if-eqz p1, :cond_1

    .line 490
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity$WindfallRecognizerCallback;->this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public onPreviewStarted()V
    .locals 2

    .line 429
    invoke-super {p0}, Lcom/microblink/SimpleCameraRecognizerCallback;->onPreviewStarted()V

    const-string v0, "onPreviewStarted"

    const/4 v1, 0x0

    .line 431
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 433
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity$WindfallRecognizerCallback;->this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->access$400(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;->onPreviewStarted()V

    .line 435
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity$WindfallRecognizerCallback;->this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->access$500(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;)Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 436
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity$WindfallRecognizerCallback;->this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->access$500(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;)Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->previewStarted(Z)V

    :cond_0
    return-void
.end method

.method public onRecognizerDone(Lcom/microblink/ScanResults;Lcom/microblink/Media;)V
    .locals 2
    .param p1    # Lcom/microblink/ScanResults;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 421
    invoke-super {p0, p1, p2}, Lcom/microblink/SimpleCameraRecognizerCallback;->onRecognizerDone(Lcom/microblink/ScanResults;Lcom/microblink/Media;)V

    const-string v0, "onRecognizerDone"

    const/4 v1, 0x0

    .line 423
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 424
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity$WindfallRecognizerCallback;->this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->access$300(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;

    invoke-interface {v0, p2, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;->onScanSuccess(Lcom/microblink/Media;Lcom/microblink/ScanResults;)V

    return-void
.end method

.method public onRecognizerException(Ljava/lang/Throwable;)V
    .locals 2
    .param p1    # Ljava/lang/Throwable;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 442
    invoke-super {p0, p1}, Lcom/microblink/SimpleCameraRecognizerCallback;->onRecognizerException(Ljava/lang/Throwable;)V

    const-string v0, "onRecognizerException: Windfall scan failed."

    const/4 v1, 0x0

    .line 444
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 445
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity$WindfallRecognizerCallback;->this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->access$600(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;->onScanFailed(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onRecognizerResultsChanged(Lcom/microblink/RecognizerResult;)V
    .locals 2
    .param p1    # Lcom/microblink/RecognizerResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 450
    invoke-super {p0, p1}, Lcom/microblink/SimpleCameraRecognizerCallback;->onRecognizerResultsChanged(Lcom/microblink/RecognizerResult;)V

    .line 452
    instance-of v0, p1, Lcom/microblink/EdgeDetectionResult;

    if-nez v0, :cond_0

    return-void

    .line 457
    :cond_0
    check-cast p1, Lcom/microblink/EdgeDetectionResult;

    .line 458
    invoke-virtual {p1}, Lcom/microblink/EdgeDetectionResult;->state()Lcom/microblink/EdgeDetectionState;

    move-result-object p1

    .line 460
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity$WindfallRecognizerCallback;->lastEdgeDetectionState:I

    invoke-virtual {p1}, Lcom/microblink/EdgeDetectionState;->state()I

    move-result v1

    if-ne v0, v1, :cond_1

    return-void

    .line 465
    :cond_1
    invoke-virtual {p1}, Lcom/microblink/EdgeDetectionState;->state()I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity$WindfallRecognizerCallback;->lastEdgeDetectionState:I

    .line 466
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity$WindfallRecognizerCallback;->processEdgeDetectionResult(Lcom/microblink/EdgeDetectionState;)V

    return-void
.end method
