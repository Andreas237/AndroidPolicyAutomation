.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailPresenter;
.super Ljava/lang/Object;
.source "NotificationDetailPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract getDetail()Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;
.end method

.method public abstract getNotification()Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;
.end method

.method public abstract onDoubleCheckContinueClicked()V
.end method

.method public abstract onHelpClicked()V
.end method

.method public abstract onReportIssueClicked()V
.end method

.method public abstract onReportIssueSubmitClicked(Ljava/lang/String;)V
.end method

.method public abstract onResendGiftCardEmail()V
.end method

.method public abstract onSupportClicked()V
.end method

.method public abstract onViewReceiptClicked()V
.end method

.method public abstract setNotification(Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;)V
.end method
