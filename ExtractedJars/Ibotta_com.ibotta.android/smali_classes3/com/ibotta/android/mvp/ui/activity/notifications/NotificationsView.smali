.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;
.super Ljava/lang/Object;
.source "NotificationsView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract canShowDetailsFor(Lcom/ibotta/android/notification/model/Notification;)Z
.end method

.method public abstract hideLoadingNotifications(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;)V
.end method

.method public abstract onNotificationsLoadFailed(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;)V
.end method

.method public abstract selectTab(I)V
.end method

.method public abstract setRows(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract showInviteFriends()V
.end method

.method public abstract showLoadingNotifications(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;Z)V
.end method

.method public abstract showNotificationDetails(Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;)V
.end method

.method public abstract updateListViewVisibility()V
.end method
