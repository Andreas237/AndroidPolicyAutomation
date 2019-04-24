.class public Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "TeamworkPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;"
    }
.end annotation


# instance fields
.field private final appCache:Lcom/ibotta/android/appcache/AppCache;

.field private final cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

.field private customer:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;

.field private friendItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/FriendItem;",
            ">;"
        }
    .end annotation
.end field

.field private final teamworkLoadStrategy:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;

.field private final teamworkReducer:Lcom/ibotta/android/account/teamwork/TeamworkReducer;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;Lcom/ibotta/android/account/teamwork/TeamworkReducer;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 65
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    .line 66
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 67
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->teamworkLoadStrategy:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;

    .line 68
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->teamworkReducer:Lcom/ibotta/android/account/teamwork/TeamworkReducer;

    .line 69
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;)Lcom/ibotta/android/appcache/AppCache;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;)Lcom/ibotta/android/mvp/base/MvpView;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;)Lcom/ibotta/android/mvp/base/MvpView;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    return-object p0
.end method

.method static synthetic access$300(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;)Lcom/ibotta/android/mvp/base/MvpView;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    return-object p0
.end method

.method static synthetic access$400(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;)V
    .locals 0

    .line 45
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->reload()V

    return-void
.end method

.method private doFacebookShare()V
    .locals 3

    .line 252
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->isLoading()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->customer:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->isSuccessfullyLoaded()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 256
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->customer:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/customer/CustomerByIdResponse;

    .line 257
    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerByIdResponse;->getCustomer()Lcom/ibotta/api/model/customer/Customer;

    move-result-object v0

    .line 258
    invoke-virtual {v0}, Lcom/ibotta/api/model/customer/Customer;->getInviteMessaging()Lcom/ibotta/api/model/customer/Customer$InviteMessaging;

    move-result-object v0

    .line 260
    new-instance v1, Lcom/ibotta/android/FacebookFeed;

    invoke-direct {v1}, Lcom/ibotta/android/FacebookFeed;-><init>()V

    .line 261
    invoke-virtual {v0}, Lcom/ibotta/api/model/customer/Customer$InviteMessaging;->getFacebookUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/FacebookFeed;->setLink(Ljava/lang/String;)V

    .line 262
    invoke-virtual {v0}, Lcom/ibotta/api/model/customer/Customer$InviteMessaging;->getShortMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/ibotta/android/FacebookFeed;->setName(Ljava/lang/String;)V

    .line 264
    invoke-virtual {v1}, Lcom/ibotta/android/FacebookFeed;->toShareFeedContent()Lcom/facebook/share/internal/ShareFeedContent;

    move-result-object v0

    .line 265
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;->doFacebookShare(Lcom/facebook/share/internal/ShareFeedContent;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method private initBonusDetail()V
    .locals 3

    .line 135
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->teamworkLoadStrategy:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;->getCurrentLevel()Lcom/ibotta/api/model/BonusModel;

    move-result-object v0

    .line 136
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->teamworkReducer:Lcom/ibotta/android/account/teamwork/TeamworkReducer;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/account/teamwork/TeamworkReducer;->createBonusDetailTitle(Lcom/ibotta/api/model/BonusModel;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v1

    .line 137
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;

    invoke-interface {v2, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;->setBonusDetail(Lcom/ibotta/api/model/BonusModel;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    return-void
.end method

.method private initBonuses()V
    .locals 6

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->teamworkLoadStrategy:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;->getLevels()Ljava/util/List;

    move-result-object v0

    .line 112
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;->setBonuses(Ljava/util/List;Ljava/lang/Boolean;)V

    return-void

    .line 117
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 118
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 119
    new-instance v3, Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    invoke-direct {v3}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;-><init>()V

    .line 121
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/api/model/BonusModel;

    .line 122
    new-instance v5, Lcom/ibotta/android/view/model/content/BonusItem;

    invoke-direct {v5, v3, v4}, Lcom/ibotta/android/view/model/content/BonusItem;-><init>(Lcom/ibotta/android/tracking/proprietary/event/EventChain;Lcom/ibotta/api/model/BonusModel;)V

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 125
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 126
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/TeamworkBonusRow;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->teamworkReducer:Lcom/ibotta/android/account/teamwork/TeamworkReducer;

    invoke-virtual {v3}, Lcom/ibotta/android/account/teamwork/TeamworkReducer;->getTeamworkLevelsTitle()Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v3

    invoke-direct {v0, v3}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/TeamworkBonusRow;-><init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 127
    invoke-virtual {v0, v2}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/TeamworkBonusRow;->setBonusItems(Ljava/util/List;)V

    .line 128
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 131
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;->setBonuses(Ljava/util/List;Ljava/lang/Boolean;)V

    return-void
.end method

.method private initEmptyBonuses()V
    .locals 2

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->teamworkLoadStrategy:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;->isShowEmptyBonuses()Z

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;->showEmptyBonuses(Z)V

    return-void
.end method

.method private initFriendItems()Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/FriendItem;",
            ">;"
        }
    .end annotation

    .line 141
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->teamworkLoadStrategy:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;->getFriends()Ljava/util/List;

    move-result-object v0

    .line 142
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->teamworkLoadStrategy:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;->getCurrentLevel()Lcom/ibotta/api/model/BonusModel;

    move-result-object v1

    .line 144
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 146
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/api/model/friend/Friend;

    .line 147
    new-instance v5, Lcom/ibotta/android/view/model/FriendItem;

    invoke-direct {v5}, Lcom/ibotta/android/view/model/FriendItem;-><init>()V

    .line 148
    invoke-virtual {v3}, Lcom/ibotta/api/model/friend/Friend;->getId()I

    move-result v6

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v7}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v7

    const/4 v8, 0x0

    if-ne v6, v7, :cond_0

    const/4 v6, 0x1

    goto :goto_1

    :cond_0
    const/4 v6, 0x0

    :goto_1
    invoke-virtual {v5, v6}, Lcom/ibotta/android/view/model/FriendItem;->setMe(Z)V

    if-eqz v1, :cond_1

    goto :goto_2

    :cond_1
    const/4 v4, 0x0

    .line 149
    :goto_2
    invoke-virtual {v5, v4}, Lcom/ibotta/android/view/model/FriendItem;->setShowEarnings(Z)V

    .line 150
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v4, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;

    invoke-interface {v4, v5, v3}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;->getFriendName(Lcom/ibotta/android/view/model/FriendItem;Lcom/ibotta/api/model/friend/Friend;)Lcom/ibotta/android/view/model/FriendItem;

    move-result-object v4

    .line 152
    invoke-virtual {v4, v3}, Lcom/ibotta/android/view/model/FriendItem;->setFriend(Lcom/ibotta/api/model/friend/Friend;)V

    .line 153
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    .line 157
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v4, :cond_3

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;

    invoke-interface {v1}, Lcom/ibotta/api/model/BonusModel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;->initAdapter(Ljava/util/List;Ljava/lang/String;)V

    :cond_3
    return-object v2
.end method

.method private initSocialVisibility()V
    .locals 2

    .line 165
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->getFacebookId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;->initSocialViewVisibility(Ljava/lang/Boolean;)V

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->friendItems:Ljava/util/List;

    new-instance v1, Lcom/ibotta/android/fragment/activity/FriendItemsBonusEarningsComparator;

    invoke-direct {v1}, Lcom/ibotta/android/fragment/activity/FriendItemsBonusEarningsComparator;-><init>()V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    goto :goto_0

    .line 169
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;->initSocialViewVisibility(Ljava/lang/Boolean;)V

    .line 170
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->friendItems:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :goto_0
    return-void
.end method


# virtual methods
.method protected getFetchJobs()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 74
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 76
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->customer:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 77
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/api/call/customer/CustomerByIdCall;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v3}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/ibotta/api/call/customer/CustomerByIdCall;-><init>(I)V

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->customer:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 80
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->customer:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 81
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->teamworkLoadStrategy:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;->getFetchJobs()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 88
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->customer:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->teamworkLoadStrategy:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;->onAbandonFetchJobs()V

    return-void
.end method

.method public onBonusClicked(Lcom/ibotta/api/model/BonusModel;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 185
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->isLocked()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 189
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;->launchBonus(Lcom/ibotta/api/model/BonusModel;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public onFacebookAuthFailed()V
    .locals 2

    const-string v0, "onFacebookAuthFail"

    const/4 v1, 0x0

    .line 222
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->deleteFacebookAuth()V

    return-void
.end method

.method public onFacebookAuthSuccess()V
    .locals 2

    const-string v0, "onFacebookLoginSuccess"

    const/4 v1, 0x0

    .line 228
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-virtual {v0}, Lcom/ibotta/android/social/facebook/FacebookManager;->fetchInfo()V

    return-void
.end method

.method public onFacebookClicked()V
    .locals 1

    .line 215
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-virtual {v0}, Lcom/ibotta/android/social/facebook/FacebookManager;->ensureFacebookSession()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 216
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-virtual {v0}, Lcom/ibotta/android/social/facebook/FacebookManager;->fetchInfo()V

    :cond_0
    return-void
.end method

.method public onFacebookInfoSuccess()V
    .locals 2

    const-string v0, "onFacebookInfoSuccess"

    const/4 v1, 0x0

    .line 239
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-virtual {v0}, Lcom/ibotta/android/social/facebook/FacebookManager;->linkFacebookToIbotta()V

    return-void
.end method

.method public onFacebookLinkSuccess()V
    .locals 2

    const-string v0, "onFacebookLinkSuccess"

    const/4 v1, 0x0

    .line 245
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->doFacebookShare()V

    .line 247
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearCustomer(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    .line 248
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->reload()V

    return-void
.end method

.method public onFacebookLoginSuccess()V
    .locals 2

    const-string v0, "onFacebookLoginSuccess"

    const/4 v1, 0x0

    .line 234
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->teamworkLoadStrategy:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;->onFetchFinishedSuccessfully()V

    .line 96
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->initEmptyBonuses()V

    .line 97
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->initBonuses()V

    .line 98
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->initBonusDetail()V

    .line 100
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->initFriendItems()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->friendItems:Ljava/util/List;

    .line 102
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->initSocialVisibility()V

    return-void
.end method

.method public onFriendClicked(I)V
    .locals 1

    .line 199
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->friendItems:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/view/model/FriendItem;

    .line 200
    invoke-virtual {p1}, Lcom/ibotta/android/view/model/FriendItem;->isMe()Z

    move-result v0

    if-nez v0, :cond_0

    .line 201
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;

    invoke-virtual {p1}, Lcom/ibotta/android/view/model/FriendItem;->getFriend()Lcom/ibotta/api/model/friend/Friend;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/api/model/friend/Friend;->getId()I

    move-result p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;->launchFriendScreen(I)V

    :cond_0
    return-void
.end method

.method public onFriendLongClicked(I)V
    .locals 1

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->friendItems:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/view/model/FriendItem;

    .line 208
    invoke-virtual {p1}, Lcom/ibotta/android/view/model/FriendItem;->isMe()Z

    move-result v0

    if-nez v0, :cond_0

    .line 209
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;->showRemoveConfirmation(Lcom/ibotta/android/view/model/FriendItem;)V

    :cond_0
    return-void
.end method

.method public onRefresh()V
    .locals 1

    .line 176
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->isLoading()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 177
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearCustomerFriends()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    .line 180
    :cond_0
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onRefresh()V

    return-void
.end method

.method public onRemoveCanceled()V
    .locals 0

    return-void
.end method

.method public onRemoveConfirmed(Lcom/ibotta/android/view/model/FriendItem;)V
    .locals 2

    .line 275
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v0

    .line 276
    new-instance v1, Lcom/ibotta/api/call/customer/friends/CustomerFriendsDeleteCall;

    invoke-virtual {p1}, Lcom/ibotta/android/view/model/FriendItem;->getFriend()Lcom/ibotta/api/model/friend/Friend;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/api/model/friend/Friend;->getId()I

    move-result p1

    invoke-direct {v1, v0, p1}, Lcom/ibotta/api/call/customer/friends/CustomerFriendsDeleteCall;-><init>(II)V

    .line 278
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl$1;

    invoke-direct {p1, p0, v1, v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;Lcom/ibotta/api/ApiCall;I)V

    .line 294
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl$2;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;)V

    invoke-virtual {p1, v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->addListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    .line 308
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->submitApiJob(Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method

.method public setFacebookManager(Lcom/ibotta/android/social/facebook/FacebookManager;)V
    .locals 0

    .line 194
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    return-void
.end method
