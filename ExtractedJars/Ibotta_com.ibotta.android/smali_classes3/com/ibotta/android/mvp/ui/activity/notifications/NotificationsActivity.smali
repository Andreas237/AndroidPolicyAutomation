.class public Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;
.super Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;
.source "NotificationsActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;
.implements Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;",
        "Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;"
    }
.end annotation


# instance fields
.field private adapter:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;

.field protected brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected notificationIntentCreator:Lcom/ibotta/android/routing/intent/NotificationIntentCreator;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected notificationTracking:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090426
    .end annotation
.end field

.field protected tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0904a2
    .end annotation
.end field

.field protected vpPager:Landroid/support/v4/view/ViewPager;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0905cc
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;I)V
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->tabSelected(I)V

    return-void
.end method

.method private getNotificationsTabForPosition(I)Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;
    .locals 0

    if-nez p1, :cond_0

    .line 222
    sget-object p1, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->MINE:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->TEAMMATES:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    :goto_0
    return-object p1
.end method

.method private initTabSelector()V
    .locals 3

    .line 101
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;->setSwipeRefresh(Landroid/support/v4/widget/SwipeRefreshLayout;)V

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;->setListener(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;)V

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->notificationTracking:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;->setNotificationTracking(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->values()[Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/common/TabSelectorView;->setOptions(Ljava/util/List;)V

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->MINE:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->ordinal()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/common/TabSelectorView;->getTabAt(I)Landroid/support/design/widget/TabLayout$Tab;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/design/widget/TabLayout$Tab;->select()V

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/view/common/TabSelectorView;->setupWithViewPager(Landroid/support/v4/view/ViewPager;Z)V

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/common/TabSelectorView;->addOnTabSelectedListener(Landroid/support/design/widget/TabLayout$BaseOnTabSelectedListener;)V

    return-void
.end method

.method private initTitle()V
    .locals 1

    const v0, 0x7f11048f

    .line 97
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->setTitle(I)V

    return-void
.end method

.method private loadParams()V
    .locals 2

    .line 90
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 91
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "tab_selection"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 92
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenter;

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenter;->setTabSelection(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private tabSelected(I)V
    .locals 0

    .line 132
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->trackTabSelected(I)V

    .line 133
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->updateListViewVisibility()V

    return-void
.end method

.method private trackTabSelected(I)V
    .locals 1

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->notificationTracking:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->getNotificationsTabForPosition(I)Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;->onNavClicked(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;)V

    return-void
.end method


# virtual methods
.method public canShowDetailsFor(Lcom/ibotta/android/notification/model/Notification;)Z
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->notificationIntentCreator:Lcom/ibotta/android/routing/intent/NotificationIntentCreator;

    invoke-interface {v0, p0, p1}, Lcom/ibotta/android/routing/intent/NotificationIntentCreator;->createIntentFor(Landroid/content/Context;Lcom/ibotta/android/notification/model/Notification;)Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 37
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsComponent;
    .locals 1

    .line 57
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;

    move-result-object v0

    .line 58
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;)V

    .line 59
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;->notificationsModule(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule;)Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;

    move-result-object p1

    .line 60
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/DaggerNotificationsComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsComponent;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getPtrView()Landroid/support/v4/widget/SwipeRefreshLayout;
    .locals 1

    .line 37
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    move-result-object v0

    return-object v0
.end method

.method public getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    return-object v0
.end method

.method public hideLoadingNotifications(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;)V
    .locals 1

    .line 156
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->hideScreenLoading()V

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;->hideLoading(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;)V

    return-void
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 37
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsComponent;)V
    .locals 0

    .line 65
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 70
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    .line 72
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->loadParams()V

    const p1, 0x7f0c0054

    .line 74
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->setContentView(I)V

    .line 75
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 77
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->initTitle()V

    .line 78
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->initTabSelector()V

    return-void
.end method

.method public onFindRebatesClicked()V
    .locals 1

    .line 204
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenter;->onFindRebatesClicked()V

    return-void
.end method

.method public onInviteFriendsClicked()V
    .locals 1

    .line 209
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenter;->onInviteFriendsClicked()V

    return-void
.end method

.method public onLastItemDisplayed(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;)V
    .locals 1

    .line 199
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenter;->onLastRowDisplayed(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;)V

    return-void
.end method

.method public onNotificationRowClicked(Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;)V
    .locals 1

    .line 194
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenter;->onNotificationRowClicked(Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;)V

    return-void
.end method

.method public onNotificationsLoadFailed(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;)V
    .locals 2

    const p1, 0x7f11048a

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 162
    invoke-virtual {p0, p1, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->showQuickMessage(IZZ)V

    return-void
.end method

.method protected onResume()V
    .locals 1

    .line 83
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onResume()V

    .line 85
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/braze/BrazeTracking;->trackActivityFeedView()V

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->notificationTracking:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;->updateNotificationDurationStart()V

    return-void
.end method

.method public selectTab(I)V
    .locals 1

    .line 189
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/common/TabSelectorView;->getTabAt(I)Landroid/support/design/widget/TabLayout$Tab;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/design/widget/TabLayout$Tab;->select()V

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

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;->setRows(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;Ljava/util/List;)V

    return-void
.end method

.method public showInviteFriends()V
    .locals 1

    .line 184
    new-instance v0, Lcom/ibotta/android/routing/intent/InviteIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/InviteIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/InviteIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showLoadingNotifications(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;Z)V
    .locals 0

    if-eqz p2, :cond_0

    .line 148
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->showScreenLoading()V

    goto :goto_0

    .line 150
    :cond_0
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;->showLoading(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;)V

    :goto_0
    return-void
.end method

.method public showNotificationDetails(Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;)V
    .locals 4

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->notificationIntentCreator:Lcom/ibotta/android/routing/intent/NotificationIntentCreator;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;->getNotification()Lcom/ibotta/android/notification/model/Notification;

    move-result-object v1

    invoke-interface {v0, p0, v1}, Lcom/ibotta/android/routing/intent/NotificationIntentCreator;->createIntentFor(Landroid/content/Context;Lcom/ibotta/android/notification/model/Notification;)Landroid/content/Intent;

    move-result-object v0

    .line 168
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->notificationTracking:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    if-eqz v0, :cond_0

    .line 170
    invoke-virtual {v0}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    .line 171
    invoke-virtual {v3}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v3

    .line 168
    invoke-virtual {v1, p1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;->onItemClicked(Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;Ljava/lang/String;I)V

    if-eqz v0, :cond_1

    .line 173
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->startActivity(Landroid/content/Intent;)V

    :cond_1
    return-void
.end method

.method public updateListViewVisibility()V
    .locals 7

    .line 214
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->vpPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->getNotificationsTabForPosition(I)Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    move-result-object v0

    .line 215
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->values()[Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    .line 216
    invoke-virtual {v4, v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->equals(Ljava/lang/Object;)Z

    move-result v5

    .line 217
    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;

    invoke-virtual {v4}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->getFilter()Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    move-result-object v4

    invoke-virtual {v6, v4, v5}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;->updatePageVisibility(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
