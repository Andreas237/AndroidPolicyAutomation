.class public interface abstract Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLinkListener;
.super Ljava/lang/Object;
.source "FacebookManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/social/facebook/FacebookManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "FacebookLinkListener"
.end annotation


# virtual methods
.method public abstract onFacebookLinkFailed()V
.end method

.method public abstract onFacebookLinkSuccess()V
.end method

.method public abstract onFacebookUnlinkFailed()V
.end method

.method public abstract onFacebookUnlinkSuccess()V
.end method
