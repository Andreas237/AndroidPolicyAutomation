.class public abstract Lcom/ibotta/android/mvp/ui/activity/teamwork/AbstractTeamworkLoadStrategy;
.super Ljava/lang/Object;
.source "AbstractTeamworkLoadStrategy.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;


# instance fields
.field protected customerFriends:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private friends:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/friend/Friend;",
            ">;"
        }
    .end annotation
.end field

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/user/UserState;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/AbstractTeamworkLoadStrategy;->userState:Lcom/ibotta/android/state/user/UserState;

    return-void
.end method


# virtual methods
.method public getFetchJobs()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/AbstractTeamworkLoadStrategy;->customerFriends:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v0, :cond_0

    .line 31
    new-instance v0, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v1, Lcom/ibotta/api/call/customer/friends/CustomerFriendsCall;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/AbstractTeamworkLoadStrategy;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v2}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v2

    invoke-direct {v1, v2}, Lcom/ibotta/api/call/customer/friends/CustomerFriendsCall;-><init>(I)V

    invoke-direct {v0, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/AbstractTeamworkLoadStrategy;->customerFriends:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 34
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 35
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/AbstractTeamworkLoadStrategy;->customerFriends:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getFriends()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/friend/Friend;",
            ">;"
        }
    .end annotation

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/AbstractTeamworkLoadStrategy;->friends:Ljava/util/List;

    return-object v0
.end method

.method public onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 42
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/AbstractTeamworkLoadStrategy;->customerFriends:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onFetchFinishedSuccessfully()V
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/AbstractTeamworkLoadStrategy;->customerFriends:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/customer/friends/CustomerFriendsResponse;

    .line 48
    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/friends/CustomerFriendsResponse;->getFriends()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/AbstractTeamworkLoadStrategy;->friends:Ljava/util/List;

    return-void
.end method
