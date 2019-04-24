.class public Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "ChangeQuantityPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenter;"
    }
.end annotation


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private newQuantity:I

.field private offerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private offerId:I

.field private offerModel:Lcom/ibotta/api/model/OfferModel;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private offerVerification:Lcom/ibotta/android/verification/OfferVerification;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private originalQuantity:I

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final verificationManager:Lcom/ibotta/android/verification/VerificationManager;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/graphql/GraphQLCallFactory;)V
    .locals 0

    .line 49
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 50
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    .line 51
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 52
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    return-void
.end method

.method private changeQuantity()V
    .locals 0

    .line 179
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->initDecrementButton()V

    .line 180
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->initQuantity()V

    .line 181
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->initIncrementQuantity()V

    return-void
.end method

.method private initControls()V
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;->initControls()V

    return-void
.end method

.method private initDecrementButton()V
    .locals 3

    .line 125
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->newQuantity:I

    const/4 v2, 0x1

    if-le v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;->setDecrementButtonEnabled(Z)V

    return-void
.end method

.method private initDoneButton()V
    .locals 2

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;->setDoneButtonEnabled(Z)V

    return-void
.end method

.method private initIncrementQuantity()V
    .locals 3

    .line 133
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    if-eqz v1, :cond_0

    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->newQuantity:I

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getRedemptionMax()S

    move-result v1

    if-ge v2, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;->setIncrementButtonEnabled(Z)V

    return-void
.end method

.method private initQuantity()V
    .locals 2

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->newQuantity:I

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;->setQuantity(I)V

    return-void
.end method

.method private initRebateImage()V
    .locals 3

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1, v2}, Lcom/ibotta/android/util/AppHelper;->getBestOfferImgUrl(Lcom/ibotta/api/model/OfferModel;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;->setRebateImage(Ljava/lang/String;)V

    return-void
.end method

.method private initRebateName(Lcom/ibotta/api/model/OfferModel;)V
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;->setRebateName(Ljava/lang/String;)V

    return-void
.end method

.method private initRedemptionLimit(Lcom/ibotta/api/model/OfferModel;)V
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getRedemptionMax()S

    move-result p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;->setRedemptionLimit(S)V

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

    .line 57
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 59
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->offerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 60
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createOfferCall()Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;

    move-result-object v1

    .line 61
    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->offerId:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->setOfferId(Ljava/lang/Integer;)V

    const/4 v2, 0x1

    .line 62
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->setIgnoreTargeting(Ljava/lang/Boolean;)V

    .line 63
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->setProducts(Ljava/lang/Boolean;)V

    .line 65
    new-instance v2, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {v2, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->offerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 68
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->offerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 75
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->offerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onDecrementClicked()V
    .locals 1

    .line 152
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->newQuantity:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->newQuantity:I

    .line 153
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->changeQuantity()V

    return-void
.end method

.method public onDoneClicked()V
    .locals 3

    .line 164
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->originalQuantity:I

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->newQuantity:I

    if-eq v0, v1, :cond_0

    .line 165
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->offerVerification:Lcom/ibotta/android/verification/OfferVerification;

    invoke-interface {v0, v2, v1}, Lcom/ibotta/android/verification/VerificationManager;->saveQuantity(Lcom/ibotta/android/verification/OfferVerification;I)V

    .line 168
    :cond_0
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->originalQuantity:I

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->newQuantity:I

    if-ne v0, v1, :cond_1

    .line 169
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->offerId:I

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;->finishWithNoChangeResult(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    goto :goto_0

    :cond_1
    if-le v0, v1, :cond_2

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->offerId:I

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;->finishWithDecreasedResult(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    goto :goto_0

    .line 173
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->offerId:I

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;->finishWithIncreasedResult(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    :goto_0
    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 3

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->offerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v0, :cond_0

    .line 81
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string v2, "offerByIdJob should not be null"

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;->finish()V

    return-void

    .line 86
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/offer/OfferGraphQLResponse;

    .line 87
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/offer/OfferGraphQLResponse;->getOfferAsModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/verification/VerificationManager;->getOfferVerification(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/verification/OfferVerification;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->offerVerification:Lcom/ibotta/android/verification/OfferVerification;

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->offerVerification:Lcom/ibotta/android/verification/OfferVerification;

    invoke-virtual {v0}, Lcom/ibotta/android/verification/OfferVerification;->getQuantity()I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->originalQuantity:I

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->offerVerification:Lcom/ibotta/android/verification/OfferVerification;

    invoke-virtual {v0}, Lcom/ibotta/android/verification/OfferVerification;->getQuantity()I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->newQuantity:I

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    if-nez v0, :cond_1

    .line 93
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "offerModel should not be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;->finish()V

    return-void

    .line 98
    :cond_1
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->initControls()V

    .line 99
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->initRebateImage()V

    .line 100
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->initRebateName(Lcom/ibotta/api/model/OfferModel;)V

    .line 101
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->initRedemptionLimit(Lcom/ibotta/api/model/OfferModel;)V

    .line 102
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->initDecrementButton()V

    .line 103
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->initQuantity()V

    .line 104
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->initIncrementQuantity()V

    .line 105
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->initDoneButton()V

    return-void
.end method

.method public onIncrementClicked()V
    .locals 1

    .line 158
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->newQuantity:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->newQuantity:I

    .line 159
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->changeQuantity()V

    return-void
.end method

.method public setOfferId(I)V
    .locals 0

    .line 142
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->offerId:I

    return-void
.end method

.method public setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 147
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-void
.end method
