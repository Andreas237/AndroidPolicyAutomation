.class public Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "TeammatesPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesPresenter;"
    }
.end annotation


# instance fields
.field private customerFriends:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 32
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    return-void
.end method


# virtual methods
.method protected applyFriendRanks(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/FriendItem;",
            ">;)V"
        }
    .end annotation

    .line 83
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/view/model/FriendItem;

    if-eqz v1, :cond_1

    if-eqz v2, :cond_2

    .line 84
    invoke-virtual {v3}, Lcom/ibotta/android/view/model/FriendItem;->getFriend()Lcom/ibotta/api/model/friend/Friend;

    move-result-object v4

    invoke-virtual {v4}, Lcom/ibotta/api/model/friend/Friend;->getTotalEarnings()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/Float;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 85
    :cond_1
    invoke-virtual {v3}, Lcom/ibotta/android/view/model/FriendItem;->getFriend()Lcom/ibotta/api/model/friend/Friend;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/api/model/friend/Friend;->getTotalEarnings()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    add-int/lit8 v1, v1, 0x1

    .line 89
    :cond_2
    invoke-virtual {v3, v1}, Lcom/ibotta/android/view/model/FriendItem;->setRank(I)V

    .line 91
    invoke-virtual {v3}, Lcom/ibotta/android/view/model/FriendItem;->isMe()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 92
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v4, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesView;

    invoke-virtual {v3}, Lcom/ibotta/android/view/model/FriendItem;->getRank()I

    move-result v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    invoke-interface {v4, v3, v5}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesView;->setSubtitleValue(II)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method protected createFriendItemList(Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/friend/Friend;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/FriendItem;",
            ">;"
        }
    .end annotation

    .line 64
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 66
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/friend/Friend;

    .line 67
    new-instance v2, Lcom/ibotta/android/view/model/FriendItem;

    invoke-direct {v2}, Lcom/ibotta/android/view/model/FriendItem;-><init>()V

    .line 69
    invoke-virtual {v1}, Lcom/ibotta/api/model/friend/Friend;->getId()I

    move-result v3

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v4}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v4

    const/4 v5, 0x1

    if-ne v3, v4, :cond_0

    const/4 v3, 0x1

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    invoke-virtual {v2, v3}, Lcom/ibotta/android/view/model/FriendItem;->setMe(Z)V

    .line 70
    invoke-virtual {v2, v5}, Lcom/ibotta/android/view/model/FriendItem;->setShowEarnings(Z)V

    .line 71
    invoke-virtual {v1}, Lcom/ibotta/api/model/friend/Friend;->getFirstName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ibotta/android/view/model/FriendItem;->setName(Ljava/lang/String;)V

    .line 72
    invoke-virtual {v2, v1}, Lcom/ibotta/android/view/model/FriendItem;->setFriend(Lcom/ibotta/api/model/friend/Friend;)V

    .line 74
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

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

    .line 37
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 39
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesPresenterImpl;->customerFriends:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 40
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/api/call/customer/friends/CustomerFriendsCall;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v3}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/ibotta/api/call/customer/friends/CustomerFriendsCall;-><init>(I)V

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesPresenterImpl;->customerFriends:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 42
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesPresenterImpl;->customerFriends:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 49
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesPresenterImpl;->customerFriends:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 2

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesPresenterImpl;->customerFriends:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/customer/friends/CustomerFriendsResponse;

    .line 56
    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/friends/CustomerFriendsResponse;->getFriends()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesPresenterImpl;->createFriendItemList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 57
    new-instance v1, Lcom/ibotta/android/fragment/activity/FriendItemsLifetimeEarningsComparator;

    invoke-direct {v1}, Lcom/ibotta/android/fragment/activity/FriendItemsLifetimeEarningsComparator;-><init>()V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 59
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesPresenterImpl;->applyFriendRanks(Ljava/util/List;)V

    .line 60
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesView;

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammates/TeammatesView;->setFriends(Ljava/util/List;)V

    return-void
.end method
