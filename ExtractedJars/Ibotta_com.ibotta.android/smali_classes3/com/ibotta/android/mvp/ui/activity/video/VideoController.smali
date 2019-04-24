.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/video/VideoController;
.super Ljava/lang/Object;
.source "VideoController.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Landroid/view/View;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract destroy()V
.end method

.method public abstract getCurrentPosition()I
.end method

.method public abstract isPlaying()Z
.end method

.method public abstract pause()V
.end method

.method public abstract setAllowSkip(Z)V
.end method

.method public abstract setListener(Lcom/ibotta/android/mvp/ui/activity/video/VideoControllerListener;)V
.end method

.method public abstract setPlayerView(Landroid/view/View;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation
.end method

.method public abstract setScrubForwardDisabled(Z)V
.end method

.method public abstract setVideoUrl(Ljava/lang/String;)V
.end method

.method public abstract start()V
.end method

.method public abstract stop()V
.end method
