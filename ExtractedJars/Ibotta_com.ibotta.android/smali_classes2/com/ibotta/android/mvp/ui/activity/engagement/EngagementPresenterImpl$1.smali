.class Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl$1;
.super Lcom/ibotta/android/service/api/job/SingleApiJob;
.source "EngagementPresenterImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->submitResponses()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;Lcom/ibotta/api/ApiCall;)V
    .locals 0

    .line 602
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;

    invoke-direct {p0, p2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    return-void
.end method


# virtual methods
.method protected onAfterApiCall()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 605
    invoke-super {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->onAfterApiCall()V

    .line 607
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->access$000(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;)V

    .line 609
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl$1;->isSuccessfullyLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 612
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->access$200(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;)Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;

    invoke-static {v1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->access$100(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->getOfferId()I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/graphql/cache/IbottaApolloCache;->updateOfferAsUnlocked(IZ)V

    .line 613
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->access$300(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;)Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearMyRebates()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    :cond_0
    return-void
.end method
