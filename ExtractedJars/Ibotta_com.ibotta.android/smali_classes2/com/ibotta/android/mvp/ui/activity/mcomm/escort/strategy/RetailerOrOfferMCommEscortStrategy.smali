.class public Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/RetailerOrOfferMCommEscortStrategy;
.super Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;
.source "RetailerOrOfferMCommEscortStrategy.java"


# instance fields
.field private final offerId:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private offerModel:Lcom/ibotta/api/model/OfferModel;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/App;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/AppActionCreator;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 0
    .param p10    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p11    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 44
    invoke-direct/range {p0 .. p11}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;-><init>(Lcom/ibotta/android/App;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/AppActionCreator;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 56
    iput-object p11, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/RetailerOrOfferMCommEscortStrategy;->offerId:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method protected getButtonSdkAction()Ljava/lang/String;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/RetailerOrOfferMCommEscortStrategy;->offerModel:Lcom/ibotta/api/model/OfferModel;

    if-eqz v0, :cond_0

    .line 78
    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getButtonInfo()Lcom/ibotta/api/model/retailer/ButtonInfo;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/RetailerOrOfferMCommEscortStrategy;->getButtonSdkAction(Lcom/ibotta/api/model/retailer/ButtonInfo;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "Using Button Action from OfferModel"

    const/4 v2, 0x0

    .line 81
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    if-nez v0, :cond_2

    .line 86
    invoke-super {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->getButtonSdkAction()Ljava/lang/String;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method public getOfferId()Ljava/lang/Integer;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/RetailerOrOfferMCommEscortStrategy;->offerId:Ljava/lang/Integer;

    return-object v0
.end method

.method public onFetchFinishedSuccessfully()V
    .locals 3

    .line 66
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/RetailerOrOfferMCommEscortStrategy;->offerId:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/RetailerOrOfferMCommEscortStrategy;->getOffersGraphQLResponse()Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 67
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/RetailerOrOfferMCommEscortStrategy;->getOfferHelper()Lcom/ibotta/api/helper/offer/OfferHelper;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/RetailerOrOfferMCommEscortStrategy;->getOffersGraphQLResponse()Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;->getOffersAsModels()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/RetailerOrOfferMCommEscortStrategy;->offerId:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/helper/offer/OfferHelper;->findOfferById(Ljava/util/List;I)Lcom/ibotta/api/model/OfferModel;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/RetailerOrOfferMCommEscortStrategy;->offerModel:Lcom/ibotta/api/model/OfferModel;

    .line 70
    :cond_0
    invoke-super {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->onFetchFinishedSuccessfully()V

    return-void
.end method
