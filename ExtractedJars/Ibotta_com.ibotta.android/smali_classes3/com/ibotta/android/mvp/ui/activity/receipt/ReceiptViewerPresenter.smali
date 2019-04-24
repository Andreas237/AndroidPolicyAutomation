.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenter;
.super Ljava/lang/Object;
.source "ReceiptViewerPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract getReceiptImgUrls()[Ljava/lang/String;
.end method

.method public abstract onLeftClicked()V
.end method

.method public abstract onReceiptLoadError()V
.end method

.method public abstract onReceiptLoadFinished()V
.end method

.method public abstract onReceiptLoadStarted()V
.end method

.method public abstract onRightClicked()V
.end method

.method public abstract setParameters(Ljava/lang/Integer;[Ljava/lang/String;)V
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # [Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method
