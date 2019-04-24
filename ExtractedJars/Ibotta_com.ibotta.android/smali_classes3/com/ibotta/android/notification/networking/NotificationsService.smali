.class public interface abstract Lcom/ibotta/android/notification/networking/NotificationsService;
.super Ljava/lang/Object;
.source "NotificationsService.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\u0008\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u00040\u00032\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\n\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/ibotta/android/notification/networking/NotificationsService;",
        "",
        "getNotifications",
        "Lretrofit2/Call;",
        "Lio/github/wax911/library/model/body/GraphContainer;",
        "Lcom/ibotta/android/notification/networking/wrapper/NotificationsWrapper;",
        "request",
        "Lio/github/wax911/library/model/request/QueryContainerBuilder;",
        "getNotificationsCount",
        "Lcom/ibotta/android/notification/networking/wrapper/NotificationsCountWrapper;",
        "getShopperNotificationById",
        "Lcom/ibotta/android/notification/networking/wrapper/NotificationWrapper;",
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
.method public abstract getNotifications(Lio/github/wax911/library/model/request/QueryContainerBuilder;)Lretrofit2/Call;
    .param p1    # Lio/github/wax911/library/model/request/QueryContainerBuilder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/github/wax911/library/model/request/QueryContainerBuilder;",
            ")",
            "Lretrofit2/Call<",
            "Lio/github/wax911/library/model/body/GraphContainer<",
            "Lcom/ibotta/android/notification/networking/wrapper/NotificationsWrapper;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lio/github/wax911/library/annotation/GraphQuery;
        value = "NotificationsQuery"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/Headers;
        value = {
            "Content-Type: application/json"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "graphql"
    .end annotation
.end method

.method public abstract getNotificationsCount(Lio/github/wax911/library/model/request/QueryContainerBuilder;)Lretrofit2/Call;
    .param p1    # Lio/github/wax911/library/model/request/QueryContainerBuilder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/github/wax911/library/model/request/QueryContainerBuilder;",
            ")",
            "Lretrofit2/Call<",
            "Lio/github/wax911/library/model/body/GraphContainer<",
            "Lcom/ibotta/android/notification/networking/wrapper/NotificationsCountWrapper;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lio/github/wax911/library/annotation/GraphQuery;
        value = "NotificationsCountQuery"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/Headers;
        value = {
            "Content-Type: application/json"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "graphql"
    .end annotation
.end method

.method public abstract getShopperNotificationById(Lio/github/wax911/library/model/request/QueryContainerBuilder;)Lretrofit2/Call;
    .param p1    # Lio/github/wax911/library/model/request/QueryContainerBuilder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/github/wax911/library/model/request/QueryContainerBuilder;",
            ")",
            "Lretrofit2/Call<",
            "Lio/github/wax911/library/model/body/GraphContainer<",
            "Lcom/ibotta/android/notification/networking/wrapper/NotificationWrapper;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lio/github/wax911/library/annotation/GraphQuery;
        value = "NotificationByIdQuery"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/Headers;
        value = {
            "Content-Type: application/json"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "graphql"
    .end annotation
.end method
