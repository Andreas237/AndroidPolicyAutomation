.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;
.super Ljava/lang/Object;
.source "ReceiptImageProcessor.java"


# virtual methods
.method public abstract cancel()V
.end method

.method public abstract hasProcessedImages()Z
.end method

.method public abstract onImageProcessingFinished(Landroid/os/Message;)V
.end method

.method public abstract processImage([B)V
.end method

.method public abstract setCameraOrientation(I)V
.end method

.method public abstract setListener(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorListener;)V
    .param p1    # Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorListener;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setPreviewSize(Landroid/hardware/Camera$Size;)V
.end method
