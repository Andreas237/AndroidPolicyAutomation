.class public Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "NotificationsPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenter;"
    }
.end annotation


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final mineLoader:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;

.field private tabSelection:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

.field private final teammateLoader:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;)V
    .locals 0

    .line 37
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 39
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 41
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->mineLoader:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;

    .line 42
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->teammateLoader:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;

    .line 44
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->mineLoader:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;

    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;->setListener(Lcom/ibotta/android/mvp/base/loading/pagination/PaginationLoaderListener;)V

    .line 45
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->teammateLoader:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;

    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;->setListener(Lcom/ibotta/android/mvp/base/loading/pagination/PaginationLoaderListener;)V

    return-void
.end method

.method private getFirstFilter(Ljava/util/Set;)Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;",
            ">;)",
            "Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 207
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 208
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 209
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method


# virtual methods
.method protected getFetchJobs()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 0

    return-void
.end method

.method public onDetach()V
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->mineLoader:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;->onDetach()V

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->teammateLoader:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;->onDetach()V

    .line 92
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onDetach()V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 2

    .line 59
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->onLoadingStopped()V

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->tabSelection:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    if-eqz v0, :cond_0

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->tabSelection:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;->selectTab(I)V

    const/4 v0, 0x0

    .line 63
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->tabSelection:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    :cond_0
    return-void
.end method

.method public onFindRebatesClicked()V
    .locals 1

    .line 190
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;->showFindRebates()V

    return-void
.end method

.method public onInviteFriendsClicked()V
    .locals 1

    .line 195
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;->showInviteFriends()V

    return-void
.end method

.method public onLastRowDisplayed(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;)V
    .locals 1

    .line 173
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl$1;->$SwitchMap$com$ibotta$android$notification$call$BaseNotificationsCall$NotificationFilter:[I

    invoke-virtual {p1}, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 178
    :pswitch_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->teammateLoader:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;->loadMore()V

    goto :goto_0

    .line 175
    :pswitch_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->mineLoader:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;->loadMore()V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onLoadFailed(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;",
            ">;)V"
        }
    .end annotation

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    if-nez v0, :cond_0

    return-void

    .line 159
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->onLoadingStopped()V

    .line 161
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->mvpPresenterActions:Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/base/MvpPresenterActions;->isNetworkConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 163
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->getFirstFilter(Ljava/util/Set;)Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    move-result-object p1

    .line 164
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;->onNotificationsLoadFailed(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;)V

    .line 165
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;->updateListViewVisibility()V

    goto :goto_0

    .line 167
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;->showNetworkConnectionError()V

    :goto_0
    return-void
.end method

.method public onLoading(Ljava/util/Set;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;",
            ">;Z)V"
        }
    .end annotation

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    if-nez v0, :cond_0

    return-void

    .line 102
    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->getFirstFilter(Ljava/util/Set;)Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    move-result-object p1

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;->showLoadingNotifications(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;Z)V

    return-void
.end method

.method public onNotificationRowClicked(Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;)V
    .locals 1

    .line 200
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;->showNotificationDetails(Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;)V

    return-void
.end method

.method public onNotificationsLoaded(Ljava/util/Set;Ljava/util/List;)V
    .locals 5
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

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    if-nez v0, :cond_0

    return-void

    .line 124
    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->getFirstFilter(Ljava/util/Set;)Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    move-result-object p1

    .line 126
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 128
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x0

    .line 130
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/notification/model/Notification;

    .line 131
    new-instance v3, Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;

    invoke-direct {v3}, Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;-><init>()V

    .line 132
    invoke-virtual {v3, v2}, Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;->setNotification(Lcom/ibotta/android/notification/model/Notification;)V

    .line 133
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v4, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;

    invoke-interface {v4, v2}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;->canShowDetailsFor(Lcom/ibotta/android/notification/model/Notification;)Z

    move-result v2

    invoke-virtual {v3, v2}, Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;->setEnabled(Z)V

    .line 134
    invoke-virtual {v3, v1}, Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;->setListIndex(I)V

    .line 135
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    .line 139
    sget-object p2, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl$1;->$SwitchMap$com$ibotta$android$notification$call$BaseNotificationsCall$NotificationFilter:[I

    invoke-virtual {p1}, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;->ordinal()I

    move-result v1

    aget p2, p2, v1

    packed-switch p2, :pswitch_data_0

    goto :goto_1

    .line 144
    :pswitch_0
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/notifications/row/EmptyTeammatesRow;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/config/AppConfig;->getInviteFriendsCopy()Lcom/ibotta/android/state/app/config/invitefriends/InviteFriendsCopyConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/state/app/config/invitefriends/InviteFriendsCopyConfig;->getCta()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v1}, Lcom/ibotta/android/mvp/ui/view/notifications/row/EmptyTeammatesRow;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 141
    :pswitch_1
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/notifications/row/EmptyMineRow;

    invoke-direct {p2}, Lcom/ibotta/android/mvp/ui/view/notifications/row/EmptyMineRow;-><init>()V

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 149
    :cond_2
    :goto_1
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;

    invoke-interface {p2, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;->setRows(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;Ljava/util/List;)V

    .line 150
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;->updateListViewVisibility()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onRefresh()V
    .locals 1

    .line 69
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onRefresh()V

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->mineLoader:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;->reload()V

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->teammateLoader:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;->reload()V

    return-void
.end method

.method public onStart()V
    .locals 1

    .line 76
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onStart()V

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->mineLoader:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;->onStart()V

    .line 78
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->teammateLoader:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;->onStart()V

    return-void
.end method

.method public onStop()V
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->mineLoader:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;->onStop()V

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->teammateLoader:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsLoader;->onStop()V

    .line 85
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onStop()V

    return-void
.end method

.method public onStoppedLoading(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;",
            ">;)V"
        }
    .end annotation

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    if-nez v0, :cond_0

    return-void

    .line 113
    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->getFirstFilter(Ljava/util/Set;)Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    move-result-object p1

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;->hideLoadingNotifications(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;)V

    return-void
.end method

.method public setTabSelection(Ljava/lang/String;)V
    .locals 0

    .line 185
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->fromString(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;->tabSelection:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    return-void
.end method
