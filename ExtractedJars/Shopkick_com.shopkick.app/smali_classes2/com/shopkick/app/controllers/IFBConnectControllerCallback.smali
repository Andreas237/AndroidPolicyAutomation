.class public interface abstract Lcom/shopkick/app/controllers/IFBConnectControllerCallback;
.super Ljava/lang/Object;
.source "IFBConnectControllerCallback.java"


# virtual methods
.method public abstract onFacebookConnectCancel()V
.end method

.method public abstract onFacebookConnectFailure()V
.end method

.method public abstract onFacebookConnectSuccess(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
