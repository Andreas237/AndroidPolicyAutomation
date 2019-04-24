.class public Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "NotificationsPresenterImplV1.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenter;
.implements Lcom/ibotta/android/notification/networking/MvpDataSourceCallback;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenter;",
        "Lcom/ibotta/android/notification/networking/MvpDataSourceCallback<",
        "Lcom/ibotta/android/notification/networking/model/NotificationsViewState;",
        ">;"
    }
.end annotation


# static fields
.field private static final NOTIFICATIONS_NETWORKING_LOAD_ERROR:Ljava/lang/String; = "Notifications Networking load error"


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private notificationsDataSource:Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSource;

.field private tabSelection:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;)V
    .locals 0

    .line 46
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 47
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 48
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->userState:Lcom/ibotta/android/state/user/UserState;

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

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-eqz p1, :cond_0

    .line 205
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 206
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 207
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private getNotificationsDataSource()Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSource;
    .locals 2

    .line 215
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->notificationsDataSource:Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSource;

    if-nez v0, :cond_0

    .line 216
    new-instance v0, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSourceImpl;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->notificationsDataSource:Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSource;

    .line 218
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->notificationsDataSource:Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSource;

    return-object v0
.end method

.method private onDataLoadFailed(Lcom/ibotta/android/notification/networking/model/NotificationsViewStateFailure;)V
    .locals 2

    .line 234
    invoke-virtual {p1}, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateFailure;->getThrowable()Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "Notifications Networking load error"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private onDataLoaded(Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;)V
    .locals 1

    .line 222
    new-instance v0, Lcom/ibotta/android/notification/networking/mapper/NotificationsMapper;

    invoke-direct {v0}, Lcom/ibotta/android/notification/networking/mapper/NotificationsMapper;-><init>()V

    .line 223
    invoke-virtual {p1}, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;->getNotifications()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/notification/networking/mapper/NotificationsMapper;->map(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 226
    sget-object v0, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;->ME:Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    .line 227
    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->onNotificationsLoaded(Ljava/util/Set;Ljava/util/List;)V

    .line 229
    sget-object v0, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;->FRIEND:Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    .line 230
    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->onNotificationsLoaded(Ljava/util/Set;Ljava/util/List;)V

    return-void
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

    .line 89
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->getNotificationsDataSource()Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSource;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSource;->cancelNotificationsCall()V

    .line 90
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onDetach()V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 2

    .line 61
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->onLoadingStopped()V

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->tabSelection:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    if-eqz v0, :cond_0

    .line 64
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->tabSelection:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;->selectTab(I)V

    const/4 v0, 0x0

    .line 65
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->tabSelection:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    :cond_0
    return-void
.end method

.method public onFindRebatesClicked()V
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;->showFindRebates()V

    return-void
.end method

.method public onInviteFriendsClicked()V
    .locals 1

    .line 184
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;->showInviteFriends()V

    return-void
.end method

.method public onLastRowDisplayed(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;)V
    .locals 0

    return-void
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

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    if-nez v0, :cond_0

    return-void

    .line 155
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->onLoadingStopped()V

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->mvpPresenterActions:Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/base/MvpPresenterActions;->isNetworkConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 159
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->getFirstFilter(Ljava/util/Set;)Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    move-result-object p1

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;->onNotificationsLoadFailed(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;)V

    .line 161
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;->updateListViewVisibility()V

    goto :goto_0

    .line 163
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;->showNetworkConnectionError()V

    :goto_0
    return-void
.end method

.method public onLoadFinished(Lcom/ibotta/android/notification/networking/model/NotificationsViewState;)V
    .locals 1

    .line 194
    instance-of v0, p1, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;

    if-eqz v0, :cond_0

    .line 195
    check-cast p1, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->onDataLoaded(Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;)V

    goto :goto_0

    .line 197
    :cond_0
    check-cast p1, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateFailure;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->onDataLoadFailed(Lcom/ibotta/android/notification/networking/model/NotificationsViewStateFailure;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic onLoadFinished(Ljava/lang/Object;)V
    .locals 0

    .line 32
    check-cast p1, Lcom/ibotta/android/notification/networking/model/NotificationsViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->onLoadFinished(Lcom/ibotta/android/notification/networking/model/NotificationsViewState;)V

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

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    if-nez v0, :cond_0

    return-void

    .line 100
    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->getFirstFilter(Ljava/util/Set;)Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    move-result-object p1

    .line 101
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;->showLoadingNotifications(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;Z)V

    return-void
.end method

.method public onNotificationRowClicked(Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;)V
    .locals 1

    .line 189
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

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

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    if-nez v0, :cond_0

    return-void

    .line 122
    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->getFirstFilter(Ljava/util/Set;)Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    move-result-object p1

    .line 124
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 126
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x0

    .line 127
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 128
    new-instance v2, Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;

    invoke-direct {v2}, Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;-><init>()V

    .line 129
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/notification/model/Notification;

    invoke-virtual {v2, v3}, Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;->setNotification(Lcom/ibotta/android/notification/model/Notification;)V

    .line 130
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v3, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/android/notification/model/Notification;

    invoke-interface {v3, v4}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;->canShowDetailsFor(Lcom/ibotta/android/notification/model/Notification;)Z

    move-result v3

    invoke-virtual {v2, v3}, Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;->setEnabled(Z)V

    .line 131
    invoke-virtual {v2, v1}, Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;->setListIndex(I)V

    .line 132
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    .line 135
    sget-object p2, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1$1;->$SwitchMap$com$ibotta$android$notification$call$BaseNotificationsCall$NotificationFilter:[I

    invoke-virtual {p1}, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;->ordinal()I

    move-result v1

    aget p2, p2, v1

    packed-switch p2, :pswitch_data_0

    goto :goto_1

    .line 140
    :pswitch_0
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/notifications/row/EmptyTeammatesRow;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/config/AppConfig;->getInviteFriendsCopy()Lcom/ibotta/android/state/app/config/invitefriends/InviteFriendsCopyConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/state/app/config/invitefriends/InviteFriendsCopyConfig;->getCta()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v1}, Lcom/ibotta/android/mvp/ui/view/notifications/row/EmptyTeammatesRow;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 137
    :pswitch_1
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/notifications/row/EmptyMineRow;

    invoke-direct {p2}, Lcom/ibotta/android/mvp/ui/view/notifications/row/EmptyMineRow;-><init>()V

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 145
    :cond_2
    :goto_1
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;

    invoke-interface {p2, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;->setRows(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;Ljava/util/List;)V

    .line 146
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

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
    .locals 3

    .line 71
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onRefresh()V

    .line 72
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->getNotificationsDataSource()Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSource;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    int-to-long v1, v1

    invoke-interface {v0, v1, v2, p0}, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSource;->fetchNotifications(JLcom/ibotta/android/notification/networking/MvpDataSourceCallback;)V

    return-void
.end method

.method public onStart()V
    .locals 3

    .line 77
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onStart()V

    .line 78
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->getNotificationsDataSource()Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSource;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    int-to-long v1, v1

    invoke-interface {v0, v1, v2, p0}, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSource;->fetchNotifications(JLcom/ibotta/android/notification/networking/MvpDataSourceCallback;)V

    return-void
.end method

.method public onStop()V
    .locals 1

    .line 83
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->getNotificationsDataSource()Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSource;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/notification/networking/datasource/NotificationsDataSource;->cancelNotificationsCall()V

    .line 84
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

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    if-nez v0, :cond_0

    return-void

    .line 111
    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->getFirstFilter(Ljava/util/Set;)Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    move-result-object p1

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;->hideLoadingNotifications(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;)V

    return-void
.end method

.method public setTabSelection(Ljava/lang/String;)V
    .locals 0

    .line 174
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->fromString(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImplV1;->tabSelection:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    return-void
.end method
