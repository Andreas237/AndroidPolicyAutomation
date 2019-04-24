.class public Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;
.super Lcom/ibotta/android/mvp/base/loading/pagination/AbstractPaginationLoader;
.source "NotificationsLoaderImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/pagination/AbstractPaginationLoader<",
        "Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;",
        "Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderListener;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;"
    }
.end annotation


# instance fields
.field private final cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

.field private final countManager:Lcom/ibotta/android/async/notification/NotificationCountManager;

.field private notifications:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/notification/model/Notification;",
            ">;"
        }
    .end annotation
.end field

.field private notificationsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/service/api/ApiWorkSubmitter;Ljava/util/Set;Lcom/ibotta/android/async/notification/NotificationCountManager;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;",
            ">;",
            "Lcom/ibotta/android/async/notification/NotificationCountManager;",
            "Lcom/ibotta/android/service/api/job/CacheClearJobFactory;",
            ")V"
        }
    .end annotation

    .line 36
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/pagination/AbstractPaginationLoader;-><init>(Lcom/ibotta/android/service/api/ApiWorkSubmitter;)V

    .line 29
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->notifications:Ljava/util/List;

    .line 37
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->countManager:Lcom/ibotta/android/async/notification/NotificationCountManager;

    .line 38
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 40
    invoke-virtual {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->setFilters(Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method protected clearAndReload()V
    .locals 1

    .line 104
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/pagination/AbstractPaginationLoader;->clearAndReload()V

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->notificationsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v0, :cond_0

    .line 107
    invoke-virtual {v0, p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->removeListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    const/4 v0, 0x0

    .line 108
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->notificationsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 111
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->notifications:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearNotifications()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    .line 115
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->loadNextBatch()V

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->countManager:Lcom/ibotta/android/async/notification/NotificationCountManager;

    invoke-virtual {v0}, Lcom/ibotta/android/async/notification/NotificationCountManager;->doNotificationsClear()V

    return-void
.end method

.method protected createNextLoadJob()Lcom/ibotta/android/service/api/job/ApiJob;
    .locals 5

    .line 129
    new-instance v0, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v1, Lcom/ibotta/android/notification/call/NotificationsCall;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->filters:Ljava/util/Set;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->lastLoad:Ljava/lang/Long;

    const/16 v4, 0x32

    invoke-direct {v1, v2, v3, v4}, Lcom/ibotta/android/notification/call/NotificationsCall;-><init>(Ljava/util/Set;Ljava/lang/Long;I)V

    invoke-direct {v0, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->notificationsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->notificationsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->addListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    .line 131
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->notificationsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-object v0
.end method

.method protected loadNextBatch()V
    .locals 3

    .line 121
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/pagination/AbstractPaginationLoader;->loadNextBatch()V

    .line 122
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->allLoaded:Z

    if-eqz v0, :cond_0

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->listener:Lcom/ibotta/android/mvp/base/loading/pagination/PaginationLoaderListener;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderListener;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->filters:Ljava/util/Set;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->notifications:Ljava/util/List;

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderListener;->onNotificationsLoaded(Ljava/util/Set;Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public onApiJobFinished(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 4

    .line 45
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/pagination/AbstractPaginationLoader;->onApiJobFinished(Lcom/ibotta/android/service/api/job/ApiJob;)V

    .line 47
    invoke-interface {p1}, Lcom/ibotta/android/service/api/job/ApiJob;->isSuccessfullyLoaded()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 51
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->notificationsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 52
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/notification/call/BaseNotificationsResponse;

    .line 53
    invoke-virtual {p1}, Lcom/ibotta/android/notification/call/BaseNotificationsResponse;->getNotifications()Ljava/util/List;

    move-result-object p1

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->notifications:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 57
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->notifications:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->notifications:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/notification/model/Notification;

    .line 61
    invoke-virtual {v0}, Lcom/ibotta/android/notification/model/Notification;->getDate()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->lastLoad:Ljava/lang/Long;

    .line 64
    :cond_1
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->isAllLoaded(I)Z

    move-result p1

    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->allLoaded:Z

    .line 66
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearBonuses()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    .line 68
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->finishedLoading()V

    .line 69
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->listener:Lcom/ibotta/android/mvp/base/loading/pagination/PaginationLoaderListener;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderListener;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->filters:Ljava/util/Set;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->notifications:Ljava/util/List;

    invoke-interface {p1, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderListener;->onNotificationsLoaded(Ljava/util/Set;Ljava/util/List;)V

    return-void
.end method

.method public onDetach()V
    .locals 1

    .line 92
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/pagination/AbstractPaginationLoader;->onDetach()V

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->notificationsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v0, :cond_0

    .line 95
    invoke-virtual {v0, p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->removeListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    const/4 v0, 0x0

    .line 96
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->notificationsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 99
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->notifications:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public onStart()V
    .locals 3

    .line 74
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/pagination/AbstractPaginationLoader;->onStart()V

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->countManager:Lcom/ibotta/android/async/notification/NotificationCountManager;

    invoke-virtual {v0}, Lcom/ibotta/android/async/notification/NotificationCountManager;->checkNotificationCount()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 77
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->clearAndReload()V

    goto :goto_0

    .line 78
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->lastLoad:Ljava/lang/Long;

    if-nez v0, :cond_1

    .line 79
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->loadNextBatch()V

    goto :goto_0

    .line 81
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->listener:Lcom/ibotta/android/mvp/base/loading/pagination/PaginationLoaderListener;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderListener;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->filters:Ljava/util/Set;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderImpl;->notifications:Ljava/util/List;

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoaderListener;->onNotificationsLoaded(Ljava/util/Set;Ljava/util/List;)V

    :goto_0
    return-void
.end method

.method public onStop()V
    .locals 0

    .line 87
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/pagination/AbstractPaginationLoader;->onStop()V

    return-void
.end method
