.class public Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;
.super Landroid/support/v4/view/PagerAdapter;
.source "NotificationsPagerAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter$ViewHolder;
    }
.end annotation


# instance fields
.field private dataMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;",
            ">;>;"
        }
    .end annotation
.end field

.field private listViewsMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;",
            "Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;",
            ">;"
        }
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;

.field private notificationTracking:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

.field private srlSwipeRefresh:Landroid/support/v4/widget/SwipeRefreshLayout;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 30
    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    .line 33
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;->listViewsMap:Ljava/util/Map;

    .line 34
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;->dataMap:Ljava/util/Map;

    return-void
.end method

.method private initNotificationsList(ILandroid/widget/FrameLayout;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter$ViewHolder;)V
    .locals 2

    .line 74
    invoke-static {p3, p2}, Lbutterknife/ButterKnife;->bind(Ljava/lang/Object;Landroid/view/View;)Lbutterknife/Unbinder;

    .line 76
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->values()[Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    move-result-object p2

    aget-object p1, p2, p1

    .line 77
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;->listViewsMap:Ljava/util/Map;

    iget-object v0, p3, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter$ViewHolder;->nlvNotifications:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsVisibilityTrackingListener;

    iget-object v0, p3, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter$ViewHolder;->nlvNotifications:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;

    .line 80
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->getAdapter()Landroid/support/v7/widget/RecyclerView$Adapter;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;->notificationTracking:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    invoke-direct {p2, v0, p1, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsVisibilityTrackingListener;-><init>(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 84
    iget-object v0, p3, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter$ViewHolder;->nlvNotifications:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->setListener(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;)V

    .line 85
    iget-object v0, p3, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter$ViewHolder;->nlvNotifications:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->getFilter()Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->setFilter(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;)V

    .line 86
    iget-object v0, p3, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter$ViewHolder;->nlvNotifications:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;->dataMap:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->setRows(Ljava/util/List;)V

    .line 87
    iget-object p1, p3, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter$ViewHolder;->nlvNotifications:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;

    new-instance v0, Lcom/ibotta/android/mvp/ui/misc/scrolllistner/SincereSwipeRefreshScrollListener;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;->srlSwipeRefresh:Landroid/support/v4/widget/SwipeRefreshLayout;

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/misc/scrolllistner/SincereSwipeRefreshScrollListener;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->addOnScrollListener(Landroid/support/v7/widget/RecyclerView$OnScrollListener;)V

    .line 88
    iget-object p1, p3, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter$ViewHolder;->nlvNotifications:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->setVisibilityTrackingListener(Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;)V

    return-void
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    .line 93
    check-cast p1, Landroid/support/v4/view/ViewPager;

    .line 94
    check-cast p3, Landroid/widget/FrameLayout;

    .line 96
    invoke-virtual {p1, p3}, Landroid/support/v4/view/ViewPager;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public getCount()I
    .locals 1

    .line 101
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->values()[Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    move-result-object v0

    array-length v0, v0

    return v0
.end method

.method public getPageTitle(I)Ljava/lang/CharSequence;
    .locals 1

    .line 111
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->values()[Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    move-result-object v0

    aget-object p1, v0, p1

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->getName()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public hideLoading(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;)V
    .locals 1

    .line 124
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->fromFilter(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;)Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    move-result-object p1

    .line 125
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;->listViewsMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;

    if-eqz p1, :cond_0

    .line 128
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->hideLoading()V

    :cond_0
    return-void
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 4

    .line 61
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c0186

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 62
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 64
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter$ViewHolder;

    invoke-direct {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter$ViewHolder;-><init>(Landroid/view/ViewGroup;)V

    .line 66
    invoke-direct {p0, p2, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;->initNotificationsList(ILandroid/widget/FrameLayout;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter$ViewHolder;)V

    .line 68
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object v0
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;

    return-void
.end method

.method public setNotificationTracking(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;->notificationTracking:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    return-void
.end method

.method public setRows(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;",
            ">;)V"
        }
    .end annotation

    .line 46
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->fromFilter(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;)Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    move-result-object p1

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;->dataMap:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;->listViewsMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;

    if-eqz p1, :cond_0

    .line 51
    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->setRows(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public setSwipeRefresh(Landroid/support/v4/widget/SwipeRefreshLayout;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;->srlSwipeRefresh:Landroid/support/v4/widget/SwipeRefreshLayout;

    return-void
.end method

.method public showLoading(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;)V
    .locals 1

    .line 115
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->fromFilter(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;)Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    move-result-object p1

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;->listViewsMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;

    if-eqz p1, :cond_0

    .line 119
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->showLoading()V

    :cond_0
    return-void
.end method

.method public smoothScrollToTop(I)V
    .locals 1

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;->listViewsMap:Ljava/util/Map;

    if-nez p1, :cond_0

    sget-object p1, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->MINE:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->TEAMMATES:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    :goto_0
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;

    const/4 v0, 0x0

    .line 151
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->smoothScrollToPosition(I)V

    return-void
.end method

.method public updatePageVisibility(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;Z)V
    .locals 1

    .line 133
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->fromFilter(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;)Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    move-result-object p1

    .line 134
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;->listViewsMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;

    if-eqz p1, :cond_0

    .line 137
    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->onVisibilityChanged(Z)V

    :cond_0
    return-void
.end method
