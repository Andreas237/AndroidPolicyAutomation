.class public Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "LoyaltyCardInstructionsPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsPresenter;"
    }
.end annotation


# instance fields
.field private homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

.field private final loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

.field private final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

.field private final titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/title/TitleBarReducer;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 39
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 40
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsPresenterImpl;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    .line 41
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsPresenterImpl;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

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

    .line 46
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 48
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-nez v1, :cond_0

    .line 49
    new-instance v1, Lcom/ibotta/android/service/api/job/HomeApiJob;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/HomeApiJob;-><init>(I)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 52
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 59
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 4

    .line 64
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/home/HomeResponse;

    .line 65
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-virtual {v0}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object v0

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v2

    invoke-interface {v1, v0, v2}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 68
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsPresenterImpl;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    .line 69
    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getCardHelpTitle()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(Ljava/lang/String;)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v2

    .line 70
    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getCardHelpDescription()Ljava/lang/String;

    move-result-object v0

    .line 68
    invoke-interface {v1, v2, v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsView;->setup(Lcom/ibotta/android/views/base/title/TitleBarViewState;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onThanksClicked()V
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsView;->finish()V

    return-void
.end method

.method public setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-void
.end method
