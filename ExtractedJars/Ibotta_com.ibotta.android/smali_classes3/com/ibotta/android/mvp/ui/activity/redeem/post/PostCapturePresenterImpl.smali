.class public Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenterImpl;
.super Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;
.source "PostCapturePresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenter;"
    }
.end annotation


# static fields
.field private static final MAX_RECEIPT_IMAGES:I = 0xf


# instance fields
.field private captureCount:I

.field private receiptPath:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    return-void
.end method


# virtual methods
.method public getCaptureCount()I
    .locals 1

    .line 47
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenterImpl;->captureCount:I

    return v0
.end method

.method public getMaxReceiptImages()I
    .locals 1

    const/16 v0, 0xf

    return v0
.end method

.method public getReceiptPath()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenterImpl;->receiptPath:Ljava/lang/String;

    return-object v0
.end method

.method public getRetailer()Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenterImpl;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-object v0
.end method

.method public onBackPressed()V
    .locals 1

    .line 79
    sget-object v0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->RETAKE:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenterImpl;->onReceiptCaptureButtonClicked(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;)V

    return-void
.end method

.method public onFinishConfirmed()V
    .locals 2

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureView;

    sget-object v1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->FINISH:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureView;->finishWithResult(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;)V

    return-void
.end method

.method public onReceiptCaptureButtonClicked(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;)V
    .locals 2

    .line 63
    sget-object v0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->ADD:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    if-ne p1, v0, :cond_0

    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenterImpl;->captureCount:I

    add-int/lit8 v0, v0, 0x1

    const/16 v1, 0xf

    if-lt v0, v1, :cond_0

    .line 64
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureView;->showMaxReceiptImagesReached()V

    goto :goto_0

    .line 65
    :cond_0
    sget-object v0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->FINISH:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    if-ne p1, v0, :cond_1

    .line 66
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenterImpl;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureView;->confirmFinish(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    goto :goto_0

    .line 68
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureView;->finishWithResult(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;)V

    :goto_0
    return-void
.end method

.method public onStart()V
    .locals 2

    .line 84
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;->onStart()V

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenterImpl;->receiptPath:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureView;->showCapturedReceiptImage(Ljava/lang/String;)V

    return-void
.end method

.method public onStop()V
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureView;->releaseCapturedReceiptImage()V

    .line 93
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;->onStop()V

    return-void
.end method

.method public onViewReady()V
    .locals 2

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureView;

    sget-object v1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;->POST_CAPTURE:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureView;->setMode(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;)V

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureView;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureView;->setCanSubmit(Z)V

    return-void
.end method

.method public setData(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/lang/String;I)V
    .locals 0
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenterImpl;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 31
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenterImpl;->receiptPath:Ljava/lang/String;

    .line 32
    iput p3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenterImpl;->captureCount:I

    return-void
.end method
