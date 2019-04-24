.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureView;
.super Ljava/lang/Object;
.source "PostCaptureView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/MvpView;


# virtual methods
.method public abstract confirmFinish(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract finishWithResult(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;)V
.end method

.method public abstract releaseCapturedReceiptImage()V
.end method

.method public abstract setCanSubmit(Z)V
.end method

.method public abstract setMode(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;)V
.end method

.method public abstract showCapturedReceiptImage(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract showMaxReceiptImagesReached()V
.end method
