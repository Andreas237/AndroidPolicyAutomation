.class public Lcom/microblink/internal/view/presenter/CameraScanPresenter;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/view/presenter/CameraScanContract$Presenter;


# static fields
.field private static final CAPTURE_MODE:I = 0x1

.field private static final SCAN_MODE:I


# instance fields
.field private captureCancelText:Ljava/lang/String;

.field private captureScanningHint:Ljava/lang/String;

.field private capturedFrameTip:Ljava/lang/String;

.field private finishScanText:Ljava/lang/String;

.field private framesCapturedCount:I

.field private initialCapturedFrameTip:Ljava/lang/String;

.field private isFinishingScan:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private isTorchOn:Z

.field private scanningCancelText:Ljava/lang/String;

.field private scanningHint:Ljava/lang/String;

.field private state:I

.field private view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/Intent;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->framesCapturedCount:I

    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v1, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->isFinishingScan:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->state:I

    const-string v0, "bottomHintExtra"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "bottomHintExtra"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/microblink/library/R$string;->camera_bottom_scanning_hint:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->initialCapturedFrameTip:Ljava/lang/String;

    const-string v0, "bottomScannedHintExtra"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "bottomScannedHintExtra"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    sget v0, Lcom/microblink/library/R$string;->camera_bottom_scanned_hint:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->capturedFrameTip:Ljava/lang/String;

    const-string v0, "topScanningHintExtra"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "topScanningHintExtra"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_2
    sget v0, Lcom/microblink/library/R$string;->camera_top_scanning_hint:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_2
    iput-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->scanningHint:Ljava/lang/String;

    const-string v0, "topScannedHintExtra"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "topScannedHintExtra"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_3
    sget v0, Lcom/microblink/library/R$string;->camera_top_scanned_hint:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_3
    iput-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->captureScanningHint:Ljava/lang/String;

    const-string v0, "scanningCancelExtra"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "scanningCancelExtra"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_4
    sget v0, Lcom/microblink/library/R$string;->camera_scanning_cancel:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_4
    iput-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->scanningCancelText:Ljava/lang/String;

    const-string v0, "scannedCancelExtra"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "scannedCancelExtra"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :cond_5
    sget v0, Lcom/microblink/library/R$string;->camera_scanned_cancel:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_5
    iput-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->captureCancelText:Ljava/lang/String;

    const-string v0, "finishScannedExtra"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string p1, "finishScannedExtra"

    invoke-virtual {p2, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_6
    iput-object p1, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->finishScanText:Ljava/lang/String;

    return-void

    :cond_6
    sget p2, Lcom/microblink/library/R$string;->camera_scanned_finish:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_6
.end method

.method static synthetic access$000(Lcom/microblink/internal/view/presenter/CameraScanPresenter;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->isTorchOn:Z

    return p0
.end method

.method static synthetic access$002(Lcom/microblink/internal/view/presenter/CameraScanPresenter;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->isTorchOn:Z

    return p1
.end method


# virtual methods
.method public isFinishingScan()Z
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->isFinishingScan:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public onCancelScanPressed()V
    .locals 3

    iget v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->state:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    invoke-interface {v0}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->cancelScan()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->setEnableCaptureFrameBtn(Z)V

    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    iget-object v1, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->scanningHint:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->setHintMsg(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    iget-object v1, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->scanningCancelText:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->setCancelButtonText(Ljava/lang/String;)V

    iget v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->framesCapturedCount:I

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    invoke-interface {v0}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->disableDoneButton()V

    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->setDoneButtonText(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    invoke-interface {v0, v1}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->displayDoneButton(Z)V

    :goto_0
    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    invoke-interface {v0, v1}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->displayTip(Z)V

    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    invoke-interface {v0}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->discardCapturedFrame()V

    iput v1, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->state:I

    return-void
.end method

.method public onCaptureFrameButtonClicked()V
    .locals 3

    iget v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->state:I

    const/4 v1, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    invoke-interface {v0}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->enableDoneButton()V

    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->setEnableCaptureFrameBtn(Z)V

    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    invoke-interface {v0}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->captureFrame()V

    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    invoke-interface {v0, v1}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->displayDoneButton(Z)V

    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    iget-object v2, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->captureScanningHint:Ljava/lang/String;

    invoke-interface {v0, v2}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->setHintMsg(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    invoke-interface {v0, v1}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->displayHint(Z)V

    iget v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->framesCapturedCount:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    iget-object v2, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->initialCapturedFrameTip:Ljava/lang/String;

    invoke-interface {v0, v2}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->setTipMsg(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    invoke-interface {v0, v1}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->displayTip(Z)V

    :cond_0
    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    iget-object v2, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->captureCancelText:Ljava/lang/String;

    invoke-interface {v0, v2}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->setCancelButtonText(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    iget-object v2, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->finishScanText:Ljava/lang/String;

    invoke-interface {v0, v2}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->setDoneButtonText(Ljava/lang/String;)V

    iput v1, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->state:I

    return-void

    :cond_1
    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    invoke-interface {v0, v1}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->confirmPhoto(Z)V

    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    iget-object v1, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->scanningCancelText:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->setCancelButtonText(Ljava/lang/String;)V

    iget v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->framesCapturedCount:I

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->setDoneButtonText(Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    iget-object v1, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->capturedFrameTip:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->setTipMsg(Ljava/lang/String;)V

    return-void
.end method

.method public onFinishedScanPressed()V
    .locals 3

    iget v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->state:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->confirmPhoto(Z)V

    :cond_0
    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->isFinishingScan:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    invoke-interface {v0}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->finishScan()V

    return-void
.end method

.method public onPhotoCaptured()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->setEnableCaptureFrameBtn(Z)V

    return-void
.end method

.method public onPhotoConfirmed()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    iget-object v1, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->scanningCancelText:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->setCancelButtonText(Ljava/lang/String;)V

    iget v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->framesCapturedCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->framesCapturedCount:I

    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    iget v1, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->framesCapturedCount:I

    invoke-interface {v0, v1}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->setCapturedFrameCount(I)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->state:I

    return-void
.end method

.method public onRecognizerException()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    invoke-interface {v0}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->cancelScan()V

    return-void
.end method

.method public onTorchAvailable(Z)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    invoke-interface {v0, p1}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->displayTorch(Z)V

    return-void
.end method

.method public onTorchButtonPressed()V
    .locals 3

    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    iget-boolean v1, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->isTorchOn:Z

    xor-int/lit8 v1, v1, 0x1

    new-instance v2, Lcom/microblink/internal/view/presenter/CameraScanPresenter$1;

    invoke-direct {v2, p0}, Lcom/microblink/internal/view/presenter/CameraScanPresenter$1;-><init>(Lcom/microblink/internal/view/presenter/CameraScanPresenter;)V

    invoke-interface {v0, v1, v2}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->toggleTorch(ZLcom/microblink/camera/hardware/SuccessCallback;)V

    return-void
.end method

.method public bridge synthetic onViewAttached(Lcom/microblink/internal/view/View;)V
    .locals 0

    check-cast p1, Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->onViewAttached(Lcom/microblink/internal/view/presenter/CameraScanContract$View;)V

    return-void
.end method

.method public onViewAttached(Lcom/microblink/internal/view/presenter/CameraScanContract$View;)V
    .locals 1

    iput-object p1, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->view:Lcom/microblink/internal/view/presenter/CameraScanContract$View;

    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->capturedFrameTip:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->setTipMsg(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->scanningHint:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->setHintMsg(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/microblink/internal/view/presenter/CameraScanPresenter;->scanningCancelText:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/microblink/internal/view/presenter/CameraScanContract$View;->setCancelButtonText(Ljava/lang/String;)V

    return-void
.end method

.method public onViewDetached()V
    .locals 0

    return-void
.end method
