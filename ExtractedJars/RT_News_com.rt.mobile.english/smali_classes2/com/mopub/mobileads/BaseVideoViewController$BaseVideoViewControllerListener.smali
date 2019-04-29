.class public interface abstract Lcom/mopub/mobileads/BaseVideoViewController$BaseVideoViewControllerListener;
.super Ljava/lang/Object;
.source "BaseVideoViewController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/mobileads/BaseVideoViewController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "BaseVideoViewControllerListener"
.end annotation


# virtual methods
.method public abstract onFinish()V
.end method

.method public abstract onSetContentView(Landroid/view/View;)V
.end method

.method public abstract onSetRequestedOrientation(I)V
.end method

.method public abstract onStartActivityForResult(Ljava/lang/Class;ILandroid/os/Bundle;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;I",
            "Landroid/os/Bundle;",
            ")V"
        }
    .end annotation
.end method
