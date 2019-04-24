.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderListener;
.super Ljava/lang/Object;
.source "NotificationsLoaderListener.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/pagination/PaginationLoaderListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/pagination/PaginationLoaderListener<",
        "Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onNotificationsLoaded(Ljava/util/Set;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/notification/model/Notification;",
            ">;)V"
        }
    .end annotation
.end method
