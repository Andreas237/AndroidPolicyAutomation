.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGatePresenter;
.super Ljava/lang/Object;
.source "PermissionsGatePresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/MvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/permissions/PermissionsGateView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onLoadStateFailed()V
.end method

.method public abstract onPermissionsAccepted(I)V
.end method

.method public abstract onPermissionsDenied()V
.end method

.method public abstract onRequestPermissionsResult(I[Ljava/lang/String;[I)V
.end method

.method public abstract setPermissionsHelper(Lcom/ibotta/android/permissions/PermissionsHelper;)V
.end method

.method public abstract skipGatedDialogAndShowLocationPrompt()V
.end method
