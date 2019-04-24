.class Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl$2;
.super Ljava/lang/Object;
.source "MyOffersGalleryPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/service/api/job/ApiJobListener;


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

.field final synthetic val$allRebatesRemoved:Z


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;Z)V
    .locals 0

    .line 327
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;

    iput-boolean p2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl$2;->val$allRebatesRemoved:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onApiJobFinished(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 0

    .line 335
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->access$500(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;)Lcom/ibotta/android/mvp/base/MvpView;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;->hideRemovingRebatesMessage()V

    .line 337
    iget-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl$2;->val$allRebatesRemoved:Z

    if-nez p1, :cond_0

    .line 338
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->access$600(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;)Lcom/ibotta/android/mvp/base/MvpView;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;->showRemovedRebatesSuccess()V

    .line 339
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->access$700(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;)V

    goto :goto_0

    .line 341
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->access$800(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;)Lcom/ibotta/android/mvp/base/MvpView;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;->finishWithAllRebatesRemoved()V

    :goto_0
    return-void
.end method

.method public onApiJobLongTask(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 0

    .line 330
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->access$400(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;)Lcom/ibotta/android/mvp/base/MvpView;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;->showRemovingRebatesMessage()V

    return-void
.end method
