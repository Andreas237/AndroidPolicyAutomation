.class public interface abstract Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLoginListener;
.super Ljava/lang/Object;
.source "FacebookManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/social/facebook/FacebookManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "FacebookLoginListener"
.end annotation


# virtual methods
.method public abstract onFacebookLoginFailed()V
.end method

.method public abstract onFacebookLoginSuccess(Lcom/ibotta/api/model/customer/Customer;)V
.end method
