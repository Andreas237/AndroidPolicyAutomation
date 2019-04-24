.class Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl$1;
.super Lcom/ibotta/android/service/api/job/SingleApiJob;
.source "MyOffersGalleryPresenterImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->onRemoveConfirmed()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;Lcom/ibotta/api/ApiCall;)V
    .locals 0

    .line 303
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;

    invoke-direct {p0, p2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    return-void
.end method

.method private removeVerifiedOffer()V
    .locals 3

    .line 321
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->access$000(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 322
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;

    invoke-static {v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->access$300(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;)Lcom/ibotta/android/verification/VerificationManager;

    move-result-object v2

    invoke-interface {v2, v1}, Lcom/ibotta/android/verification/VerificationManager;->deleteByOfferId(Ljava/lang/Integer;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private updateOffersCache()V
    .locals 3

    .line 314
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl$1;->getOutcome()Lcom/ibotta/android/service/api/Outcome;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/service/api/Outcome;->SUCCESS:Lcom/ibotta/android/service/api/Outcome;

    if-ne v0, v1, :cond_0

    .line 315
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->access$100(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;)Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;

    invoke-static {v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->access$000(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;)Ljava/util/Set;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/graphql/cache/IbottaApolloCache;->updateOffersAsUnlocked(Ljava/util/Collection;Z)V

    .line 316
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;)Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearMyRebates()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    :cond_0
    return-void
.end method


# virtual methods
.method protected onAfterApiCall()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 306
    invoke-super {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->onAfterApiCall()V

    .line 308
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl$1;->updateOffersCache()V

    .line 309
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl$1;->removeVerifiedOffer()V

    .line 310
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->access$000(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method
