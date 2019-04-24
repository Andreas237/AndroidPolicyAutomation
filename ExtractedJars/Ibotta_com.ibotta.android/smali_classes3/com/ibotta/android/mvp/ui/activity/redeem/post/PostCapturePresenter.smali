.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenter;
.super Ljava/lang/Object;
.source "PostCapturePresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/MvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract getCaptureCount()I
.end method

.method public abstract getMaxReceiptImages()I
.end method

.method public abstract getReceiptPath()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getRetailer()Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract onBackPressed()V
.end method

.method public abstract onFinishConfirmed()V
.end method

.method public abstract onReceiptCaptureButtonClicked(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;)V
.end method

.method public abstract onViewReady()V
.end method

.method public abstract setData(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/lang/String;I)V
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method
