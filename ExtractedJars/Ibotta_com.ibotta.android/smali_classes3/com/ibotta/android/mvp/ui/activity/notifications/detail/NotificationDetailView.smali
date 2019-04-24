.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailView;
.super Ljava/lang/Object;
.source "NotificationDetailView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract createDetail(Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;)Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;
.end method

.method public abstract setDetailsVisible(Z)V
.end method

.method public abstract setItemsVisible(Z)V
.end method

.method public abstract showDoubleCheckDialog()V
.end method

.method public abstract showHelpCenter()V
.end method

.method public abstract showHelpDialog()V
.end method

.method public abstract showReceiptViewer([Ljava/lang/String;)V
.end method

.method public abstract showReportIssueDialog()V
.end method

.method public abstract showReportIssueError()V
.end method

.method public abstract showReportIssueSuccess()V
.end method

.method public abstract showResendGiftCardSuccess()V
.end method
