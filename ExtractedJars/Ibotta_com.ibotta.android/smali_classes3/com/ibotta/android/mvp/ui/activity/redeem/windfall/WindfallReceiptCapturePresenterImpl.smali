.class public Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "WindfallReceiptCapturePresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/async/image/ImageSaveAsyncListener;
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;",
        ">;",
        "Lcom/ibotta/android/async/image/ImageSaveAsyncListener;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;"
    }
.end annotation


# static fields
.field private static final RECEIPT_IMG_FILENAME:Ljava/lang/String; = "receipt_image%1$d.jpg"


# instance fields
.field private final appCache:Lcom/ibotta/android/appcache/AppCache;

.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private bitmapResult:Lcom/microblink/BitmapResult;

.field private final breadcrumbStorage:Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;

.field private captureCount:I

.field private imageSaveAsyncRequest:Lcom/ibotta/android/async/image/ImageSaveAsyncRequest;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private rebatesFound:I

.field private final receiptCaptureStorage:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

.field private scanSuccessProcessed:Z

.field private final verificationManager:Lcom/ibotta/android/verification/VerificationManager;

.field private final windfallHelper:Lcom/ibotta/android/windfall/helper/WindfallHelper;

.field private final windfallReceiptImageSaver:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptImageSaver;

.field private final windfallRetailerSupport:Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupport;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptImageSaver;Lcom/ibotta/android/windfall/helper/WindfallHelper;Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupport;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;)V
    .locals 0

    .line 81
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 68
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/NoBitmapResult;

    invoke-direct {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/NoBitmapResult;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->bitmapResult:Lcom/microblink/BitmapResult;

    .line 83
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 84
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    .line 85
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->receiptCaptureStorage:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

    .line 86
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->windfallReceiptImageSaver:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptImageSaver;

    .line 87
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->windfallHelper:Lcom/ibotta/android/windfall/helper/WindfallHelper;

    .line 88
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->windfallRetailerSupport:Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupport;

    .line 89
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    .line 90
    iput-object p9, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->breadcrumbStorage:Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;

    return-void
.end method

.method private createBreadcrumb()Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;
    .locals 2

    .line 414
    new-instance v0, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;

    invoke-direct {v0}, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;-><init>()V

    const/4 v1, 0x1

    .line 415
    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;->setWindfall(Z)V

    const/4 v1, 0x0

    .line 416
    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;->setPictureCount(I)V

    .line 418
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->breadcrumbStorage:Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;

    invoke-interface {v1, v0}, Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;->saveBreadcrumb(Lcom/ibotta/android/state/app/breadcrumb/Breadcrumb;)V

    return-object v0
.end method

.method private deleteBreadcrumb()V
    .locals 2

    .line 424
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->breadcrumbStorage:Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;

    sget-object v1, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;->BREADCRUMB_RECEIPT_CAPTURE:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;->deleteBreadcrumb(Ljava/lang/String;)V

    return-void
.end method

.method private getBreadcrumb()Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;
    .locals 3

    .line 442
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->breadcrumbStorage:Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;

    sget-object v1, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;->BREADCRUMB_RECEIPT_CAPTURE:Ljava/lang/String;

    const-class v2, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;->getBreadcrumb(Ljava/lang/String;Ljava/lang/Class;)Lcom/ibotta/android/state/app/breadcrumb/Breadcrumb;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;

    if-nez v0, :cond_0

    .line 447
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->createBreadcrumb()Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method private onAddClicked()V
    .locals 2

    .line 399
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->captureCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->captureCount:I

    .line 401
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->bitmapResult:Lcom/microblink/BitmapResult;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->confirmCapture(Lcom/microblink/BitmapResult;)V

    .line 402
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->captureCount:I

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->setCaptureCount(I)V

    .line 403
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    sget-object v1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;->PRE_CAPTURE:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->setButtonCaptureMode(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;)V

    .line 404
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->bitmapResult:Lcom/microblink/BitmapResult;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->showPreviousReceipt(Lcom/microblink/BitmapResult;)V

    return-void
.end method

.method private onBitmapCaptureFailed()V
    .locals 1

    .line 324
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->showCaptureFailed()V

    return-void
.end method

.method private onBitmapCaptureSuccess()V
    .locals 2

    .line 317
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->saveCurrentReceiptImage()V

    .line 318
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->bitmapResult:Lcom/microblink/BitmapResult;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->setCapturedReceiptBitmap(Lcom/microblink/BitmapResult;)V

    .line 319
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->setCanSubmit(Z)V

    .line 320
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->setCaptureAllowed(Z)V

    return-void
.end method

.method private onCancelClicked()V
    .locals 1

    .line 384
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->finishWithFailure()V

    return-void
.end method

.method private onCaptureClicked()V
    .locals 2

    .line 393
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    sget-object v1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;->PROCESSING:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->setButtonCaptureMode(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;)V

    .line 394
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->setCaptureAllowed(Z)V

    .line 395
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->capturePhoto()V

    return-void
.end method

.method private onFailedToAcquireReceiptStorage(Lcom/ibotta/android/commons/disk/StorageException;)V
    .locals 2

    const-string v0, "Failed to acquire receipt silo."

    const/4 v1, 0x0

    .line 162
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 164
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->finishWithFailure()V

    return-void
.end method

.method private onFinishClicked()V
    .locals 2

    .line 388
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->bitmapResult:Lcom/microblink/BitmapResult;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->confirmCapture(Lcom/microblink/BitmapResult;)V

    .line 389
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->finishScan()V

    return-void
.end method

.method private onRetakeClicked()V
    .locals 2

    .line 408
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->receiptCaptureStorage:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;->prepareForRetake()V

    .line 409
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->releaseCapturedPhoto()V

    .line 410
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    sget-object v1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;->PRE_CAPTURE:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->setButtonCaptureMode(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;)V

    return-void
.end method

.method private saveCurrentReceiptImage()V
    .locals 5

    .line 454
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->receiptCaptureStorage:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

    const-string v1, "receipt_image%1$d.jpg"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->captureCount:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;->startNewWorkingFile(Ljava/lang/String;)Ljava/io/File;

    .line 455
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->windfallReceiptImageSaver:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptImageSaver;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->bitmapResult:Lcom/microblink/BitmapResult;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->receiptCaptureStorage:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

    .line 456
    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;->getWorkingReceiptImage()Ljava/io/File;

    move-result-object v2

    .line 455
    invoke-interface {v0, v1, v2, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptImageSaver;->save(Lcom/microblink/BitmapResult;Ljava/io/File;Lcom/ibotta/android/async/image/ImageSaveAsyncListener;)Lcom/ibotta/android/async/image/ImageSaveAsyncRequest;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->imageSaveAsyncRequest:Lcom/ibotta/android/async/image/ImageSaveAsyncRequest;

    return-void
.end method

.method private setBreadcrumbPictureCount(I)V
    .locals 1

    .line 435
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->getBreadcrumb()Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;

    move-result-object v0

    .line 436
    invoke-virtual {v0, p1}, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;->setPictureCount(I)V

    .line 438
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->breadcrumbStorage:Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;

    invoke-interface {p1, v0}, Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;->saveBreadcrumb(Lcom/ibotta/android/state/app/breadcrumb/Breadcrumb;)V

    return-void
.end method

.method private setBreadcrumbRetailerId(I)V
    .locals 1

    .line 428
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->getBreadcrumb()Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;

    move-result-object v0

    .line 429
    invoke-virtual {v0, p1}, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;->setRetailerId(I)V

    .line 431
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->breadcrumbStorage:Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;

    invoke-interface {p1, v0}, Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;->saveBreadcrumb(Lcom/ibotta/android/state/app/breadcrumb/Breadcrumb;)V

    return-void
.end method

.method private setStorageSilo(Z)V
    .locals 2

    .line 148
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->getReceiptSilo()Lcom/ibotta/android/commons/disk/StorageSilo;

    move-result-object v0

    .line 149
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->receiptCaptureStorage:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;->setStorageSilo(Lcom/ibotta/android/commons/disk/StorageSilo;)V

    if-eqz p1, :cond_0

    .line 152
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->receiptCaptureStorage:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;->clean()V

    const/4 p1, 0x0

    .line 153
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->captureCount:I

    .line 154
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    new-instance v0, Lcom/ibotta/android/api/windfall/WindfallResultsCall;

    invoke-direct {v0}, Lcom/ibotta/android/api/windfall/WindfallResultsCall;-><init>()V

    invoke-interface {p1, v0}, Lcom/ibotta/android/appcache/AppCache;->remove(Lcom/ibotta/api/CacheableApiCall;)V
    :try_end_0
    .catch Lcom/ibotta/android/commons/disk/StorageException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 157
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->onFailedToAcquireReceiptStorage(Lcom/ibotta/android/commons/disk/StorageException;)V

    :cond_0
    :goto_0
    return-void
.end method


# virtual methods
.method public getCaptureCount()I
    .locals 1

    .line 174
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->captureCount:I

    return v0
.end method

.method protected getFetchJobs()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .locals 1

    .line 169
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 0

    return-void
.end method

.method public bridge synthetic onAttach(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 50
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->onAttach(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;)V

    return-void
.end method

.method public onAttach(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;)V
    .locals 0

    .line 95
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onAttach(Lcom/ibotta/android/mvp/base/MvpView;)V

    .line 97
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->createBreadcrumb()Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;

    return-void
.end method

.method public onBitmapResultReceived(Lcom/microblink/BitmapResult;)V
    .locals 0

    .line 307
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->bitmapResult:Lcom/microblink/BitmapResult;

    .line 309
    invoke-interface {p1}, Lcom/microblink/BitmapResult;->bitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 310
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->onBitmapCaptureSuccess()V

    goto :goto_0

    .line 312
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->onBitmapCaptureFailed()V

    :goto_0
    return-void
.end method

.method public onCameraFrameFailed()V
    .locals 1

    .line 329
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->showCaptureFailed()V

    return-void
.end method

.method public onCaptureFailedDisplayed()V
    .locals 1

    .line 235
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->finishWithFailure()V

    return-void
.end method

.method public onDetach()V
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->destroyRecognizer()V

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->destroyReceiptGuide()V

    .line 105
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->deleteBreadcrumb()V

    .line 107
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->imageSaveAsyncRequest:Lcom/ibotta/android/async/image/ImageSaveAsyncRequest;

    if-eqz v0, :cond_0

    .line 108
    invoke-virtual {v0}, Lcom/ibotta/android/async/image/ImageSaveAsyncRequest;->disconnect()V

    .line 111
    :cond_0
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onDetach()V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 0

    return-void
.end method

.method public onImageFileSaveFailed()V
    .locals 2

    const/4 v0, 0x0

    .line 468
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->imageSaveAsyncRequest:Lcom/ibotta/android/async/image/ImageSaveAsyncRequest;

    .line 470
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->showReceiptImageSaveFailed()V

    .line 471
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    sget-object v1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;->PRE_CAPTURE:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->setButtonCaptureMode(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;)V

    return-void
.end method

.method public onImageFileSavedSuccessfully()V
    .locals 2

    const/4 v0, 0x0

    .line 461
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->imageSaveAsyncRequest:Lcom/ibotta/android/async/image/ImageSaveAsyncRequest;

    .line 463
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    sget-object v1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;->POST_CAPTURE:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->setButtonCaptureMode(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;)V

    return-void
.end method

.method public onInitFailed()V
    .locals 1

    .line 230
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->showInitFailed()V

    return-void
.end method

.method public onInitWithScanOptionsFailed()V
    .locals 1

    .line 278
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->showInitFailed()V

    return-void
.end method

.method public onLoadState(ZLcom/ibotta/android/fragment/retailer/RetailerParcel;I)V
    .locals 1
    .param p2    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-nez p2, :cond_0

    const-string p1, "Failed to recover state for receipt capture activity."

    .line 130
    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->finishWithFailure()V

    return-void

    .line 135
    :cond_0
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 136
    iput p3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->captureCount:I

    .line 138
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->setStorageSilo(Z)V

    .line 140
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    if-lez p3, :cond_1

    const/4 v0, 0x1

    :cond_1
    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->setCanSubmit(Z)V

    .line 142
    invoke-virtual {p2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->setBreadcrumbRetailerId(I)V

    .line 143
    invoke-direct {p0, p3}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->setBreadcrumbPictureCount(I)V

    return-void
.end method

.method public onPause()V
    .locals 1

    .line 215
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->pauseReceiptGuide()V

    .line 216
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->pauseRecognizer()V

    .line 218
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onPause()V

    return-void
.end method

.method public onPreviewStarted()V
    .locals 2

    .line 273
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->setCaptureAllowed(Z)V

    return-void
.end method

.method public onReadyForSetup()V
    .locals 4

    .line 179
    invoke-static {}, Lcom/microblink/ScanOptions;->newBuilder()Lcom/microblink/ScanOptions$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->windfallRetailerSupport:Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupport;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 180
    invoke-interface {v1, v2}, Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupport;->getWindfallRetailer(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/microblink/Retailer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/microblink/ScanOptions$Builder;->retailer(Lcom/microblink/Retailer;)Lcom/microblink/ScanOptions$Builder;

    move-result-object v0

    .line 181
    invoke-static {}, Lcom/microblink/FrameCharacteristics;->newBuilder()Lcom/microblink/FrameCharacteristics$Builder;

    move-result-object v1

    const/4 v2, 0x1

    .line 182
    invoke-virtual {v1, v2}, Lcom/microblink/FrameCharacteristics$Builder;->storeFrames(Z)Lcom/microblink/FrameCharacteristics$Builder;

    move-result-object v1

    const/4 v2, 0x0

    .line 183
    invoke-virtual {v1, v2}, Lcom/microblink/FrameCharacteristics$Builder;->externalStorage(Z)Lcom/microblink/FrameCharacteristics$Builder;

    move-result-object v1

    .line 184
    invoke-virtual {v1}, Lcom/microblink/FrameCharacteristics$Builder;->build()Lcom/microblink/FrameCharacteristics;

    move-result-object v1

    .line 181
    invoke-virtual {v0, v1}, Lcom/microblink/ScanOptions$Builder;->frameCharacteristics(Lcom/microblink/FrameCharacteristics;)Lcom/microblink/ScanOptions$Builder;

    move-result-object v0

    .line 186
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/config/AppConfig;->isOcrEdgeDetectionEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 187
    new-instance v1, Lcom/microblink/EdgeDetectionConfiguration;

    invoke-direct {v1}, Lcom/microblink/EdgeDetectionConfiguration;-><init>()V

    invoke-virtual {v0, v1}, Lcom/microblink/ScanOptions$Builder;->edgeDetectionConfiguration(Lcom/microblink/EdgeDetectionConfiguration;)Lcom/microblink/ScanOptions$Builder;

    .line 190
    :cond_0
    invoke-virtual {v0}, Lcom/microblink/ScanOptions$Builder;->build()Lcom/microblink/ScanOptions;

    move-result-object v0

    .line 192
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iget v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->captureCount:I

    invoke-interface {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->setup(Lcom/ibotta/android/fragment/retailer/RetailerParcel;I)V

    .line 193
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    sget-object v2, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;->PRE_CAPTURE:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;

    invoke-interface {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->setButtonCaptureMode(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;)V

    .line 194
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->initWithScanOptions(Lcom/microblink/ScanOptions;)V

    return-void
.end method

.method public onRebatesFoundDisplayed()V
    .locals 2

    .line 334
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->rebatesFound:I

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->finishWithSuccessResult(I)V

    return-void
.end method

.method public onReceiptCaptureButtonClicked(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;)V
    .locals 1

    .line 283
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl$1;->$SwitchMap$com$ibotta$android$view$camera$ReceiptCaptureButtonsView$ReceiptCaptureButton:[I

    invoke-virtual {p1}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 297
    :pswitch_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->onRetakeClicked()V

    goto :goto_0

    .line 294
    :pswitch_1
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->onAddClicked()V

    goto :goto_0

    .line 291
    :pswitch_2
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->onCaptureClicked()V

    goto :goto_0

    .line 288
    :pswitch_3
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->onFinishClicked()V

    goto :goto_0

    .line 285
    :pswitch_4
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->onCancelClicked()V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onReceiptImageSufficientlyClose()V
    .locals 1

    .line 348
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    if-nez v0, :cond_0

    return-void

    .line 355
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->hideMoveCloserMessage()V

    return-void
.end method

.method public onReceiptImageTooFarAway()V
    .locals 2

    .line 339
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->getButtonCaptureMode()Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;->PRE_CAPTURE:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;

    if-eq v0, v1, :cond_0

    return-void

    .line 343
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->showMoveCloserMessage()V

    return-void
.end method

.method public onResume()V
    .locals 2

    .line 206
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onResume()V

    .line 208
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->resumeRecognizer()V

    .line 210
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->setCaptureAllowed(Z)V

    return-void
.end method

.method public onScanFailed(Ljava/lang/Throwable;)V
    .locals 1
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 261
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 263
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->showScanFailed()V

    return-void
.end method

.method public onScanFailedDisplayed()V
    .locals 1

    .line 268
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->finishWithFailure()V

    return-void
.end method

.method public onScanSuccess(Lcom/microblink/Media;Lcom/microblink/ScanResults;)V
    .locals 1

    .line 240
    iget-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->scanSuccessProcessed:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    .line 245
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->scanSuccessProcessed:Z

    .line 247
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->windfallHelper:Lcom/ibotta/android/windfall/helper/WindfallHelper;

    invoke-interface {p1, p2}, Lcom/ibotta/android/windfall/helper/WindfallHelper;->saveWindfallResultsForLater(Lcom/microblink/ScanResults;)Lcom/ibotta/android/api/windfall/WindfallResultsResponse;

    move-result-object p1

    .line 248
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->windfallHelper:Lcom/ibotta/android/windfall/helper/WindfallHelper;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {p2, v0, p1}, Lcom/ibotta/android/windfall/helper/WindfallHelper;->createVerificationCallIfNeeded(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/android/api/windfall/WindfallResultsResponse;)Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall;

    move-result-object p1

    if-nez p1, :cond_1

    .line 252
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->finishWithSuccessResult(I)V

    goto :goto_0

    .line 254
    :cond_1
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->submitApiCall(Lcom/ibotta/api/ApiCall;)V

    :goto_0
    return-void
.end method

.method public onStart()V
    .locals 1

    .line 199
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onStart()V

    .line 201
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->startRecognizer()V

    return-void
.end method

.method public onStop()V
    .locals 1

    .line 223
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->stopRecognizer()V

    .line 225
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onStop()V

    return-void
.end method

.method protected onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 3

    .line 360
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 362
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall;

    if-eqz v0, :cond_3

    .line 363
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostResponse;

    .line 364
    invoke-virtual {p1}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostResponse;->getReceipt()Lcom/ibotta/api/model/receipt/Receipt;

    move-result-object p1

    .line 365
    invoke-virtual {p1}, Lcom/ibotta/api/model/receipt/Receipt;->getVerifiedOffers()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 368
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/offer/Offer;

    .line 369
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    invoke-interface {v2, v1}, Lcom/ibotta/android/verification/VerificationManager;->savePreverified(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/verification/OfferVerification;

    goto :goto_0

    .line 372
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->rebatesFound:I

    .line 375
    :cond_1
    iget p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->rebatesFound:I

    if-lez p1, :cond_2

    .line 376
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->rebatesFound:I

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->showRebatesFound(I)V

    goto :goto_1

    .line 378
    :cond_2
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;

    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;->rebatesFound:I

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;->finishWithSuccessResult(I)V

    :cond_3
    :goto_1
    return-void
.end method
