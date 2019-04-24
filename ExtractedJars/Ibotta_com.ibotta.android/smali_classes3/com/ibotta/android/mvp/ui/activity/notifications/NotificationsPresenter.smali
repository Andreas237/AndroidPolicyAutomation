.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenter;
.super Ljava/lang/Object;
.source "NotificationsPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;
.implements Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderListener;"
    }
.end annotation


# virtual methods
.method public abstract onFindRebatesClicked()V
.end method

.method public abstract onInviteFriendsClicked()V
.end method

.method public abstract onLastRowDisplayed(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;)V
.end method

.method public abstract onNotificationRowClicked(Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;)V
.end method

.method public abstract setTabSelection(Ljava/lang/String;)V
.end method
