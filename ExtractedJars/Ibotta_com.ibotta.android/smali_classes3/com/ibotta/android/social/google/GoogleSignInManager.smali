.class public interface abstract Lcom/ibotta/android/social/google/GoogleSignInManager;
.super Ljava/lang/Object;
.source "GoogleSignInManager.java"


# virtual methods
.method public abstract getSignInIntent()Landroid/content/Intent;
.end method

.method public abstract linkGoogleToIbotta()V
.end method

.method public abstract onActivityResult(IILandroid/content/Intent;)V
.end method

.method public abstract setGoogleLinkListener(Lcom/ibotta/android/social/google/GoogleLinkListener;)V
    .param p1    # Lcom/ibotta/android/social/google/GoogleLinkListener;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setGoogleSignInListener(Lcom/ibotta/android/social/google/GoogleSignInListener;)V
    .param p1    # Lcom/ibotta/android/social/google/GoogleSignInListener;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract unlinkGoogleFromIbotta(I)V
.end method
