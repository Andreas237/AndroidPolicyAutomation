.class public Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;
.super Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;
.source "ReceiptCapturePresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;"
    }
.end annotation


# instance fields
.field private final breadcrumbManager:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;

.field private captureCount:I

.field private final guideController:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;

.field private final imageProcessor:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;

.field private retailerOptional:Ljava9/util/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava9/util/Optional<",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcel;",
            ">;"
        }
    .end annotation
.end field

.field private final storage:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

.field private final tracker:Lcom/ibotta/android/tracking/Tracker;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 35
    invoke-static {}, Ljava9/util/Optional;->empty()Ljava9/util/Optional;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->retailerOptional:Ljava9/util/Optional;

    .line 46
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->tracker:Lcom/ibotta/android/tracking/Tracker;

    .line 47
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->storage:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

    .line 48
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->guideController:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;

    .line 49
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->breadcrumbManager:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;

    .line 50
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->imageProcessor:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;

    return-void
.end method

.method private initBreadCrumbManager()V
    .locals 3

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->retailerOptional:Ljava9/util/Optional;

    invoke-virtual {v0}, Ljava9/util/Optional;->isPresent()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 143
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->breadcrumbManager:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->retailerOptional:Ljava9/util/Optional;

    invoke-virtual {v1}, Ljava9/util/Optional;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v1

    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->captureCount:I

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;->init(II)V

    :cond_0
    return-void
.end method

.method private initCapturability()V
    .locals 2

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->captureCount:I

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;->setCanSubmit(Z)V

    return-void
.end method

.method private isSuccess(Lcom/ibotta/android/fragment/retailer/RetailerParcel;IZ)Z
    .locals 0
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    .line 122
    invoke-static {p1}, Ljava9/util/Optional;->of(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava9/util/Optional;->empty()Ljava9/util/Optional;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->retailerOptional:Ljava9/util/Optional;

    .line 123
    iput p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->captureCount:I

    .line 124
    invoke-virtual {p0, p3}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->setIsExpectingActivityResult(Z)V

    .line 128
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->retailerOptional:Ljava9/util/Optional;

    invoke-virtual {p1}, Ljava9/util/Optional;->isPresent()Z

    move-result p1

    const/4 p2, 0x0

    if-nez p1, :cond_1

    const-string p1, "Failed to recover state for receipt capture activity."

    .line 129
    new-array p3, p2, [Ljava/lang/Object;

    invoke-static {p1, p3}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;->finishWithFailure()V

    goto :goto_1

    :cond_1
    const/4 p2, 0x1

    .line 134
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->initBreadCrumbManager()V

    .line 135
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->initCapturability()V

    :goto_1
    return p2
.end method

.method private onAdd()V
    .locals 3

    .line 303
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->captureCount:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->captureCount:I

    .line 304
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->captureCount:I

    if-lez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;->setCanSubmit(Z)V

    .line 309
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->guideController:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;->prepareForNewReceiptImage()V

    .line 311
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->resumeFromResult()V

    .line 313
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->retailerOptional:Ljava9/util/Optional;

    invoke-virtual {v0}, Ljava9/util/Optional;->isPresent()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 314
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->breadcrumbManager:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->retailerOptional:Ljava9/util/Optional;

    invoke-virtual {v1}, Ljava9/util/Optional;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v1

    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->captureCount:I

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;->setPictureCount(II)V

    :cond_1
    return-void
.end method

.method private onFailedToAcquireReceiptStorage(Lcom/ibotta/android/commons/disk/StorageException;)V
    .locals 2

    const-string v0, "Failed to acquire receipt silo."

    const/4 v1, 0x0

    .line 166
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 168
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;->finishWithFailure()V

    return-void
.end method

.method private onRetake()V
    .locals 1

    .line 319
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->storage:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;->prepareForRetake()V

    .line 320
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->resumeFromResult()V

    return-void
.end method

.method private resumeFromResult()V
    .locals 1

    const/4 v0, 0x0

    .line 324
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->setIsExpectingActivityResult(Z)V

    .line 325
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;->resumeCamera()V

    return-void
.end method

.method private setStorageSilo(Lcom/ibotta/android/commons/disk/StorageSilo;Z)V
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->storage:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;->setStorageSilo(Lcom/ibotta/android/commons/disk/StorageSilo;)V

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 156
    :try_start_0
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->storage:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;->clean()V

    .line 157
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->captureCount:I
    :try_end_0
    .catch Lcom/ibotta/android/commons/disk/StorageException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    const-string v0, "Failed to clean receipt storage."

    .line 159
    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {p2, v0, p1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;->finishWithFailure()V

    :cond_0
    :goto_0
    return-void
.end method

.method private tryToFinish()V
    .locals 1

    .line 293
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->storage:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;->getReceiptImages()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 295
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 296
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;->finishWithSuccess()V

    goto :goto_0

    .line 298
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;->finishWithFailure()V

    :goto_0
    return-void
.end method


# virtual methods
.method public getCaptureCount()I
    .locals 1

    .line 104
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->captureCount:I

    return v0
.end method

.method public getRetailerOptional()Ljava9/util/Optional;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava9/util/Optional<",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcel;",
            ">;"
        }
    .end annotation

    .line 99
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->retailerOptional:Ljava9/util/Optional;

    return-object v0
.end method

.method public bridge synthetic onAttach(Lcom/ibotta/android/mvp/base/MvpView;)V
    .locals 0

    .line 26
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->onAttach(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;)V

    return-void
.end method

.method public onAttach(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;)V
    .locals 0

    .line 86
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;->onAttach(Lcom/ibotta/android/mvp/base/MvpView;)V

    .line 87
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->imageProcessor:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;

    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;->setListener(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorListener;)V

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 278
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->imageProcessor:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;->cancel()V

    .line 279
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;->finishWithFailure()V

    return-void
.end method

.method public onCameraConfigured()V
    .locals 4

    .line 241
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->guideController:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->retailerOptional:Ljava9/util/Optional;

    invoke-virtual {v2}, Ljava9/util/Optional;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iget v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->captureCount:I

    invoke-interface {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;->prepareGuide(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;Lcom/ibotta/android/fragment/retailer/RetailerParcel;I)V

    .line 242
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->guideController:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->captureCount:I

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;->loadPreviousReceipt(I)V

    return-void
.end method

.method public onCameraError()V
    .locals 1

    .line 236
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;->showCameraError()V

    return-void
.end method

.method public onCameraOpened()V
    .locals 2

    .line 231
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;->setCaptureAllowed(Z)V

    return-void
.end method

.method public onCameraOpening()V
    .locals 1

    .line 226
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;->showInitializingWarning()V

    return-void
.end method

.method public onDetach()V
    .locals 2

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->breadcrumbManager:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;->destroy()V

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->imageProcessor:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;->setListener(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorListener;)V

    .line 94
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;->onDetach()V

    return-void
.end method

.method public onFailureDialogDismissed()V
    .locals 1

    .line 284
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;->finishWithFailure()V

    return-void
.end method

.method public onFinishConfirmed()V
    .locals 0

    .line 289
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->tryToFinish()V

    return-void
.end method

.method public onFocusDetermined(Z)V
    .locals 0

    return-void
.end method

.method public onFocusFail()V
    .locals 1

    .line 268
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;->showFocusFailedWarning()V

    return-void
.end method

.method public onFocusing()V
    .locals 1

    .line 263
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;->showPleaseHoldWarning()V

    return-void
.end method

.method public onLoadState(ZLcom/ibotta/android/fragment/retailer/RetailerParcel;IZ)V
    .locals 0
    .param p2    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 109
    invoke-direct {p0, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->isSuccess(Lcom/ibotta/android/fragment/retailer/RetailerParcel;IZ)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 113
    :try_start_0
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    invoke-interface {p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;->getReceiptSilo()Lcom/ibotta/android/commons/disk/StorageSilo;

    move-result-object p2

    .line 114
    invoke-direct {p0, p2, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->setStorageSilo(Lcom/ibotta/android/commons/disk/StorageSilo;Z)V
    :try_end_0
    .catch Lcom/ibotta/android/commons/disk/StorageException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 116
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->onFailedToAcquireReceiptStorage(Lcom/ibotta/android/commons/disk/StorageException;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public onManualOverride()V
    .locals 0

    return-void
.end method

.method public onOrientationDetermined(I)V
    .locals 1

    .line 221
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->imageProcessor:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;->setCameraOrientation(I)V

    return-void
.end method

.method public onPause()V
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;->pauseCamera()V

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->guideController:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;->pause()V

    .line 81
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;->onPause()V

    return-void
.end method

.method public onPictureTaken([B)V
    .locals 2

    .line 257
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;->setCaptureAllowed(Z)V

    .line 258
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->imageProcessor:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;->processImage([B)V

    return-void
.end method

.method public onPostCaptureAction(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;)V
    .locals 3

    const-string v0, "Post capture action is: %1$s"

    const/4 v1, 0x1

    .line 193
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    sget-object v1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;->PRE_CAPTURE:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;->setReceiptCaptureMode(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;)V

    .line 196
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl$1;->$SwitchMap$com$ibotta$android$view$camera$ReceiptCaptureButtonsView$ReceiptCaptureButton:[I

    invoke-virtual {p1}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 204
    :pswitch_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->onRetake()V

    goto :goto_0

    .line 201
    :pswitch_1
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->onAdd()V

    goto :goto_0

    .line 198
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->tryToFinish()V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onPreviewStarted(Z)V
    .locals 1

    .line 247
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->guideController:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;->previewStarted(Z)V

    return-void
.end method

.method public onPreviewStopped()V
    .locals 0

    return-void
.end method

.method public onProcessingFinished(Ljava/io/File;Z)V
    .locals 2
    .param p1    # Ljava/io/File;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 339
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    const/4 p2, 0x1

    .line 344
    invoke-virtual {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->setIsExpectingActivityResult(Z)V

    .line 345
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->retailerOptional:Ljava9/util/Optional;

    invoke-virtual {v0}, Ljava9/util/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->captureCount:I

    invoke-interface {p2, v0, p1, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;->showPostCapture(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/lang/String;I)V

    goto :goto_0

    :cond_1
    if-nez p2, :cond_2

    .line 347
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;->showCaptureFailedError()V

    :cond_2
    :goto_0
    return-void
.end method

.method public onProcessingStarted()V
    .locals 2

    .line 330
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    if-nez v0, :cond_0

    return-void

    .line 334
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    sget-object v1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;->PROCESSING:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;->setReceiptCaptureMode(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;)V

    return-void
.end method

.method public onReceiptCaptureButtonClicked(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;)V
    .locals 1

    .line 173
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl$1;->$SwitchMap$com$ibotta$android$view$camera$ReceiptCaptureButtonsView$ReceiptCaptureButton:[I

    invoke-virtual {p1}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 181
    :pswitch_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;->takePhoto(Z)V

    goto :goto_0

    .line 178
    :pswitch_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->retailerOptional:Ljava9/util/Optional;

    invoke-virtual {v0}, Ljava9/util/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;->confirmFinish(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    goto :goto_0

    .line 175
    :pswitch_2
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;->finishWithFailure()V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onResume()V
    .locals 2

    .line 61
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;->onResume()V

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->imageProcessor:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;->hasProcessedImages()Z

    move-result v0

    if-nez v0, :cond_0

    .line 64
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    sget-object v1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;->PRE_CAPTURE:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;->setReceiptCaptureMode(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;)V

    .line 67
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->isExpectingActivityResult()Z

    move-result v0

    if-nez v0, :cond_1

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;->resumeCamera()V

    .line 73
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;->setCaptureAllowed(Z)V

    return-void
.end method

.method public onStart()V
    .locals 2

    .line 55
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;->onStart()V

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenterImpl;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string v1, "capture_receipt"

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/Tracker;->view(Ljava/lang/String;)V

    return-void
.end method
