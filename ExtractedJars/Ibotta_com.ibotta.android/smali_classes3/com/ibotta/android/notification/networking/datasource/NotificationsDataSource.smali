.class public interface abstract Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSource;
.super Ljava/lang/Object;
.source "NotificationsDataSource.kt"

# interfaces
.implements Lcom/ibotta/android/notification/networking/MvpDataSource;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/notification/networking/MvpDataSource<",
        "Lcom/ibotta/android/notification/networking/model/NotificationsViewState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0004H&J\u0008\u0010\u0005\u001a\u00020\u0004H&J\u001e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00082\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00020\nH&J\u001e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u00082\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00020\nH&J(\u0010\r\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u00082\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00020\nH&\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSource;",
        "Lcom/ibotta/android/notification/networking/MvpDataSource;",
        "Lcom/ibotta/android/notification/networking/model/NotificationsViewState;",
        "cancelNotificationCountCall",
        "",
        "cancelNotificationsCall",
        "fetchNotificationById",
        "notificationId",
        "",
        "callback",
        "Lcom/ibotta/android/notification/networking/MvpDataSourceCallback;",
        "fetchNotifications",
        "customerID",
        "fetchNotificationsCount",
        "type",
        "Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;",
        "ibotta-notification_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# virtual methods
.method public abstract cancelNotificationCountCall()V
.end method

.method public abstract cancelNotificationsCall()V
.end method

.method public abstract fetchNotificationById(JLcom/ibotta/android/notification/networking/MvpDataSourceCallback;)V
    .param p3    # Lcom/ibotta/android/notification/networking/MvpDataSourceCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lcom/ibotta/android/notification/networking/MvpDataSourceCallback<",
            "Lcom/ibotta/android/notification/networking/model/NotificationsViewState;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract fetchNotifications(JLcom/ibotta/android/notification/networking/MvpDataSourceCallback;)V
    .param p3    # Lcom/ibotta/android/notification/networking/MvpDataSourceCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lcom/ibotta/android/notification/networking/MvpDataSourceCallback<",
            "Lcom/ibotta/android/notification/networking/model/NotificationsViewState;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract fetchNotificationsCount(JLcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;Lcom/ibotta/android/notification/networking/MvpDataSourceCallback;)V
    .param p3    # Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/notification/networking/MvpDataSourceCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;",
            "Lcom/ibotta/android/notification/networking/MvpDataSourceCallback<",
            "Lcom/ibotta/android/notification/networking/model/NotificationsViewState;",
            ">;)V"
        }
    .end annotation
.end method
