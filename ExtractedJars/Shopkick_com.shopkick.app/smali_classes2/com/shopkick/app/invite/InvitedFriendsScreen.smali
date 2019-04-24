.class public Lcom/shopkick/app/invite/InvitedFriendsScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "InvitedFriendsScreen.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# instance fields
.field private friendActivityList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/FriendActivity;",
            ">;"
        }
    .end annotation
.end field

.field private invitedFriendsScrollView:Landroid/support/v7/widget/RecyclerView;

.field private loadingSpinner:Landroid/widget/ProgressBar;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method private onFriendActiviyListUpdate()V
    .locals 5

    .line 69
    invoke-static {}, Lcom/shopkick/app/invite/InviteDataManager;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 70
    invoke-static {}, Lcom/shopkick/app/invite/InviteDataManager;->getInstance()Lcom/shopkick/app/invite/InviteDataManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/invite/InviteDataManager;->getFriendsActivityResponse()Lcom/shopkick/fetchers/DataResponse;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 71
    iget-boolean v1, v0, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-nez v1, :cond_0

    goto :goto_0

    .line 75
    :cond_0
    iget-object v0, v0, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/GetFriendsActivityResponse;

    .line 76
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetFriendsActivityResponse;->friendsActivityList:Ljava/util/List;

    iput-object v1, p0, Lcom/shopkick/app/invite/InvitedFriendsScreen;->friendActivityList:Ljava/util/List;

    .line 77
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetFriendsActivityResponse;->message:Ljava/lang/String;

    .line 79
    new-instance v1, Lcom/shopkick/app/invite/InvitedFriendsAdapter;

    invoke-virtual {p0}, Lcom/shopkick/app/invite/InvitedFriendsScreen;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/shopkick/app/invite/InvitedFriendsScreen;->friendActivityList:Ljava/util/List;

    iget-object v4, p0, Lcom/shopkick/app/invite/InvitedFriendsScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-direct {v1, v2, v3, v0, v4}, Lcom/shopkick/app/invite/InvitedFriendsAdapter;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Lcom/shopkick/app/logging/UserEventLogger;)V

    .line 81
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitedFriendsScreen;->invitedFriendsScrollView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 82
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitedFriendsScreen;->invitedFriendsScrollView:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/shopkick/app/invite/InvitedFriendsScreen;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 83
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitedFriendsScreen;->loadingSpinner:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_1

    :cond_1
    :goto_0
    return-void

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const/4 p3, 0x0

    const v0, 0x7f0c00ef

    .line 41
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f09034a

    .line 42
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/support/v7/widget/RecyclerView;

    iput-object p2, p0, Lcom/shopkick/app/invite/InvitedFriendsScreen;->invitedFriendsScrollView:Landroid/support/v7/widget/RecyclerView;

    const p2, 0x7f110365

    .line 43
    invoke-virtual {p0, p2}, Lcom/shopkick/app/invite/InvitedFriendsScreen;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/shopkick/app/invite/InvitedFriendsScreen;->setAppScreenTitle(Ljava/lang/String;)V

    const p2, 0x7f0600c5

    .line 44
    invoke-virtual {p0, p2}, Lcom/shopkick/app/invite/InvitedFriendsScreen;->getResourceColor(I)I

    move-result p2

    .line 45
    new-instance v0, Lcom/shopkick/app/view/SKRecyclerView/ColorDividerItemDecoration;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1}, Lcom/shopkick/app/view/SKRecyclerView/ColorDividerItemDecoration;-><init>(ILjava/util/HashSet;)V

    .line 46
    iget-object p2, p0, Lcom/shopkick/app/invite/InvitedFriendsScreen;->invitedFriendsScrollView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {p2, v0}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    const p2, 0x7f090434

    .line 47
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ProgressBar;

    iput-object p2, p0, Lcom/shopkick/app/invite/InvitedFriendsScreen;->loadingSpinner:Landroid/widget/ProgressBar;

    .line 48
    iget-object p2, p0, Lcom/shopkick/app/invite/InvitedFriendsScreen;->loadingSpinner:Landroid/widget/ProgressBar;

    invoke-virtual {p2, p3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 50
    invoke-direct {p0}, Lcom/shopkick/app/invite/InvitedFriendsScreen;->onFriendActiviyListUpdate()V

    .line 51
    iget-object p2, p0, Lcom/shopkick/app/invite/InvitedFriendsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "INVITE_SCREEN_FRIENDS_LIST_DATA_READY"

    invoke-virtual {p2, p0, v0, p3}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 36
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p1, p0, Lcom/shopkick/app/invite/InvitedFriendsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitedFriendsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 65
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string p2, "INVITE_SCREEN_FRIENDS_LIST_DATA_READY"

    if-ne p1, p2, :cond_0

    .line 58
    invoke-direct {p0}, Lcom/shopkick/app/invite/InvitedFriendsScreen;->onFriendActiviyListUpdate()V

    :cond_0
    return-void
.end method
