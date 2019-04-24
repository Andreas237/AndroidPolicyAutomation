.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenter;
.super Ljava/lang/Object;
.source "ImErrorPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;
.implements Lcom/ibotta/android/mvp/ui/activity/im/ImDisconnectConfirmationListener;
.implements Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewEvents;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/im/ImDisconnectConfirmationListener;",
        "Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewEvents;"
    }
.end annotation


# virtual methods
.method public abstract onSwitchBackToReceiptSubmissionTapped()V
.end method
