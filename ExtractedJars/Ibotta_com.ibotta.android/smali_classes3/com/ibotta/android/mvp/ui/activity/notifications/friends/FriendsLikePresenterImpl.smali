.class public Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikePresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "FriendsLikePresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikePresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikePresenter;"
    }
.end annotation


# instance fields
.field private custOffersFriendLikes:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field private final friendsNameComparator:Lcom/ibotta/android/fragment/activity/FriendsNameComparator;

.field private offerId:I

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/fragment/activity/FriendsNameComparator;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 43
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikePresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 44
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikePresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 45
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikePresenterImpl;->friendsNameComparator:Lcom/ibotta/android/fragment/activity/FriendsNameComparator;

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

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 55
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 57
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikePresenterImpl;->custOffersFriendLikes:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 58
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/api/call/offer/CustomerOffersFriendLikesCall;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikePresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 59
    invoke-interface {v3}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/ibotta/api/call/offer/CustomerOffersFriendLikesCall;-><init>(I)V

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikePresenterImpl;->custOffersFriendLikes:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 62
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikePresenterImpl;->custOffersFriendLikes:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 69
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikePresenterImpl;->custOffersFriendLikes:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 7

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikePresenterImpl;->custOffersFriendLikes:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v0, :cond_0

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeView;->finish()V

    return-void

    .line 80
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/offer/CustomerOffersFriendLikesResponse;

    .line 82
    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikePresenterImpl;->offerId:I

    invoke-static {v0, v1}, Lcom/ibotta/api/call/offer/CustomerOffersFriendLikesResponse;->findFriendsForOffer(Lcom/ibotta/api/call/offer/CustomerOffersFriendLikesResponse;I)Ljava/util/List;

    move-result-object v0

    .line 84
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikePresenterImpl;->friendsNameComparator:Lcom/ibotta/android/fragment/activity/FriendsNameComparator;

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 85
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 87
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/friend/Friend;

    .line 88
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikePresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-virtual {v2}, Lcom/ibotta/api/model/friend/Friend;->getFirstName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lcom/ibotta/api/model/friend/Friend;->getLastName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v4, v5}, Lcom/ibotta/android/util/Formatting;->firstAndLastName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 90
    new-instance v4, Lcom/ibotta/android/view/model/FriendItem;

    invoke-direct {v4}, Lcom/ibotta/android/view/model/FriendItem;-><init>()V

    .line 91
    invoke-virtual {v2}, Lcom/ibotta/api/model/friend/Friend;->getId()I

    move-result v5

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikePresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v6}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v6

    if-ne v5, v6, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    invoke-virtual {v4, v5}, Lcom/ibotta/android/view/model/FriendItem;->setMe(Z)V

    .line 92
    invoke-virtual {v4, v2}, Lcom/ibotta/android/view/model/FriendItem;->setFriend(Lcom/ibotta/api/model/friend/Friend;)V

    .line 93
    invoke-virtual {v4, v3}, Lcom/ibotta/android/view/model/FriendItem;->setName(Ljava/lang/String;)V

    .line 95
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 98
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeView;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeView;->setFriendItems(Ljava/util/List;)V

    return-void
.end method

.method public setOfferId(I)V
    .locals 0

    .line 50
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikePresenterImpl;->offerId:I

    return-void
.end method
