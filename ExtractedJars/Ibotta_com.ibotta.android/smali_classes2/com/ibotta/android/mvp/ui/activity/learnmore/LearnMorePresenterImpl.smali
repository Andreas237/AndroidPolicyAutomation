.class public Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMorePresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "LearnMorePresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMorePresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMorePresenter;"
    }
.end annotation


# instance fields
.field private homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

.field private final loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

.field private final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

.field private final retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 37
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMorePresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 38
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMorePresenterImpl;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 39
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMorePresenterImpl;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    return-void
.end method


# virtual methods
.method protected getFetchJobs()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 44
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 46
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMorePresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-nez v1, :cond_0

    .line 47
    new-instance v1, Lcom/ibotta/android/service/api/job/HomeApiJob;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/HomeApiJob;-><init>(I)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMorePresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 50
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMorePresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 57
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMorePresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 3

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMorePresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/home/HomeResponse;

    .line 63
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMorePresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-virtual {v0}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object v0

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMorePresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v2

    invoke-interface {v1, v0, v2}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    .line 65
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMorePresenterImpl;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    invoke-interface {v1, v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;->toRetailerParcel(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMorePresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 66
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMorePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMorePresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreView;->setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method

.method public setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMorePresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-void
.end method
