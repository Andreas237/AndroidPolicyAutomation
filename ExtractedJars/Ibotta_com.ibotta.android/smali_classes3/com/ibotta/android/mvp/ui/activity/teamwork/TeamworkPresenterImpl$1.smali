.class Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl$1;
.super Lcom/ibotta/android/service/api/job/SingleApiJob;
.source "TeamworkPresenterImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->onRemoveConfirmed(Lcom/ibotta/android/view/model/FriendItem;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;

.field final synthetic val$customerId:I


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;Lcom/ibotta/api/ApiCall;I)V
    .locals 0

    .line 278
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;

    iput p3, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl$1;->val$customerId:I

    invoke-direct {p0, p2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    return-void
.end method

.method private updateFriendsCache()V
    .locals 4

    .line 286
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl$1;->getOutcome()Lcom/ibotta/android/service/api/Outcome;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/service/api/Outcome;->SUCCESS:Lcom/ibotta/android/service/api/Outcome;

    if-ne v0, v1, :cond_0

    .line 287
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl$1;->apiResponse:Lcom/ibotta/api/ApiResponse;

    check-cast v0, Lcom/ibotta/api/call/customer/friends/CustomerFriendsResponse;

    .line 288
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;

    invoke-static {v1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->access$000(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;)Lcom/ibotta/android/appcache/AppCache;

    move-result-object v1

    new-instance v2, Lcom/ibotta/api/call/customer/friends/CustomerFriendsCall;

    iget v3, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl$1;->val$customerId:I

    invoke-direct {v2, v3}, Lcom/ibotta/api/call/customer/friends/CustomerFriendsCall;-><init>(I)V

    invoke-interface {v1, v2, v0}, Lcom/ibotta/android/appcache/AppCache;->put(Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;)V

    .line 289
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;->access$000(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl;)Lcom/ibotta/android/appcache/AppCache;

    move-result-object v0

    new-instance v1, Lcom/ibotta/api/call/customer/CustomerByIdCall;

    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl$1;->val$customerId:I

    invoke-direct {v1, v2}, Lcom/ibotta/api/call/customer/CustomerByIdCall;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/ibotta/android/appcache/AppCache;->remove(Lcom/ibotta/api/CacheableApiCall;)V

    :cond_0
    return-void
.end method


# virtual methods
.method protected onAfterApiCall()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 281
    invoke-super {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->onAfterApiCall()V

    .line 282
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenterImpl$1;->updateFriendsCache()V

    return-void
.end method
