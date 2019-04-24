.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;
.super Ljava/lang/Object;
.source "VideoPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/MvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/video/VideoView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onBackPressed()V
.end method

.method public abstract onCancelClicked()V
.end method

.method public abstract onCancelConfirmed()V
.end method

.method public abstract onCancelNotConfirmed()V
.end method

.method public abstract onErrorDialogClosed()V
.end method

.method public abstract onSkipClicked()V
.end method

.method public abstract onVideoPlayClicked()V
.end method

.method public abstract onVideoTouched()V
.end method

.method public abstract setParams(Ljava/lang/String;ZZZLjava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method
