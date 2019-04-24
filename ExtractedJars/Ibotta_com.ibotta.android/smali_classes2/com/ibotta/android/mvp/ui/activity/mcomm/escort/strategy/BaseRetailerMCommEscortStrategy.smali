.class public abstract Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;
.super Ljava/lang/Object;
.source "BaseRetailerMCommEscortStrategy.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategy;


# instance fields
.field private final app:Lcom/ibotta/android/App;

.field private final appActionCreator:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/AppActionCreator;

.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field protected final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

.field private final offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

.field private final offerId:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private offersByRetailerIdsGraphQLJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

.field private retailerId:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private retailerModel:Lcom/ibotta/api/model/RetailerModel;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


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

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->app:Lcom/ibotta/android/App;

    .line 80
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 81
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 82
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 83
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 84
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    .line 85
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->appActionCreator:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/AppActionCreator;

    .line 86
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 87
    iput-object p9, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 88
    iput-object p10, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->retailerId:Ljava/lang/Integer;

    .line 89
    iput-object p11, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->offerId:Ljava/lang/Integer;

    return-void
.end method

.method private createLaunchInfo(Ljava/lang/String;Ljava/util/List;)Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfo;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfoOffer;",
            ">;)",
            "Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfo;"
        }
    .end annotation

    .line 320
    new-instance v0, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfo;

    invoke-direct {v0}, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfo;-><init>()V

    .line 321
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    if-eqz v1, :cond_0

    .line 322
    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfo;->setRetailerId(I)V

    .line 324
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfo;->setSrcToken(Ljava/lang/String;)V

    .line 325
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->formatting:Lcom/ibotta/android/util/Formatting;

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-interface {p1, v1}, Lcom/ibotta/android/util/Formatting;->formatDateAsISO8601(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfo;->setLaunchedAt(Ljava/lang/String;)V

    .line 326
    invoke-virtual {v0, p2}, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfo;->setOffers(Ljava/util/List;)V

    .line 327
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->offerId:Ljava/lang/Integer;

    invoke-virtual {v0, p1}, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfo;->setClickedOfferId(Ljava/lang/Integer;)V

    return-object v0
.end method

.method private createLaunchInfoOffer(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfoOffer;
    .locals 2

    .line 307
    new-instance v0, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfoOffer;

    invoke-direct {v0}, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfoOffer;-><init>()V

    .line 308
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfoOffer;->setOfferId(I)V

    .line 310
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-interface {v1, p1}, Lcom/ibotta/api/helper/offer/OfferHelper;->isPercentBackType(Lcom/ibotta/api/model/OfferModel;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 311
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getPercentBack()Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfoOffer;->setValue(F)V

    goto :goto_0

    .line 313
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getAmount()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfoOffer;->setValue(F)V

    :goto_0
    return-object v0
.end method

.method private createLaunchInfoParam(Ljava/lang/String;Ljava/util/List;)Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfoParam;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)",
            "Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfoParam;"
        }
    .end annotation

    .line 274
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 275
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    if-eqz v1, :cond_0

    .line 276
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v1

    invoke-interface {v0, p2, v1}, Lcom/ibotta/api/helper/offer/OfferHelper;->findByRetailer(Ljava/util/List;I)Ljava/util/List;

    move-result-object v0

    .line 279
    :cond_0
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->removeNonShopNowOffers(Ljava/util/List;)V

    .line 281
    new-instance p2, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 282
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/OfferModel;

    .line 283
    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->createLaunchInfoOffer(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfoOffer;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 286
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->createLaunchInfo(Ljava/lang/String;Ljava/util/List;)Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfo;

    move-result-object p1

    .line 288
    new-instance p2, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfoParam;

    invoke-direct {p2}, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfoParam;-><init>()V

    .line 289
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfoParam;->setLaunchInfo(Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfo;)V

    return-object p2
.end method

.method private onRetailerIdSet()V
    .locals 5

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->offersByRetailerIdsGraphQLJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "onRetailerIdSet: %1$d"

    const/4 v1, 0x1

    .line 162
    new-array v2, v1, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->retailerId:Ljava/lang/Integer;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->offersByRetailerIdsGraphQLJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->isSuccessfullyLoaded()Z

    move-result v0

    xor-int/2addr v0, v1

    .line 165
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->retailerId:Ljava/lang/Integer;

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 166
    :goto_0
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->offersByRetailerIdsGraphQLJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    instance-of v3, v3, Lcom/ibotta/android/service/api/job/WaitingApiJob;

    if-eqz v0, :cond_2

    if-eqz v2, :cond_2

    if-eqz v3, :cond_2

    const-string v0, "Signalling delayed Offers load."

    .line 169
    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->offersByRetailerIdsGraphQLJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;

    .line 172
    new-array v1, v1, [Ljava/lang/Integer;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->retailerId:Ljava/lang/Integer;

    aput-object v2, v1, v4

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->setRetailerIds([Ljava/lang/Integer;)V

    .line 173
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->offersByRetailerIdsGraphQLJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    check-cast v0, Lcom/ibotta/android/service/api/job/WaitingApiJob;

    invoke-virtual {v0, v4}, Lcom/ibotta/android/service/api/job/WaitingApiJob;->signal(Z)V

    goto :goto_1

    :cond_2
    if-nez v2, :cond_3

    if-eqz v3, :cond_3

    const-string v0, "Cancelling delayed Offers load."

    .line 175
    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->offersByRetailerIdsGraphQLJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    check-cast v0, Lcom/ibotta/android/service/api/job/WaitingApiJob;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/service/api/job/WaitingApiJob;->signal(Z)V

    :cond_3
    :goto_1
    return-void
.end method

.method private removeNonShopNowOffers(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)V"
        }
    .end annotation

    .line 295
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 297
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 298
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/OfferModel;

    .line 300
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-interface {v1, v0}, Lcom/ibotta/api/helper/offer/OfferHelper;->isShopNow(Lcom/ibotta/api/model/OfferModel;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 301
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method protected getButtonSdkAction()Ljava/lang/String;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 236
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    if-eqz v0, :cond_0

    .line 237
    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getButtonInfo()Lcom/ibotta/api/model/retailer/ButtonInfo;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->getButtonSdkAction(Lcom/ibotta/api/model/retailer/ButtonInfo;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "Using Button Action from RetailerModel"

    const/4 v2, 0x0

    .line 240
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    return-object v0
.end method

.method protected getButtonSdkAction(Lcom/ibotta/api/model/retailer/ButtonInfo;)Ljava/lang/String;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 253
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/api/model/retailer/ButtonInfo;->getAndroid()Lcom/ibotta/api/model/retailer/ButtonInfoDetails;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v0

    .line 261
    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/api/model/retailer/ButtonInfoDetails;->getUrl()Ljava/lang/String;

    move-result-object v0

    .line 263
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    .line 264
    invoke-virtual {p1}, Lcom/ibotta/api/model/retailer/ButtonInfoDetails;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v1, :cond_2

    if-eqz v2, :cond_2

    .line 267
    invoke-virtual {p1}, Lcom/ibotta/api/model/retailer/ButtonInfoDetails;->getId()Ljava/lang/String;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method public getFetchJobs()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 112
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 114
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 115
    new-instance v1, Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/HomeApiJob;-><init>(I)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 118
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->offersByRetailerIdsGraphQLJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_2

    .line 119
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createOffersCall()Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;

    move-result-object v1

    .line 120
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->setProducts(Ljava/lang/Boolean;)V

    .line 122
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->retailerId:Ljava/lang/Integer;

    if-eqz v3, :cond_1

    const-string v3, "Retailer ID specified, loading Offers immediately."

    .line 123
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v3, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 125
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->retailerId:Ljava/lang/Integer;

    invoke-interface {v2, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 126
    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->setRetailerIds(Ljava/util/Set;)V

    .line 128
    new-instance v2, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {v2, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->offersByRetailerIdsGraphQLJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    goto :goto_0

    :cond_1
    const-string v3, "Retailer ID not specified. Will load Offers once the Retailer ID is specified."

    .line 130
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v3, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    new-instance v2, Lcom/ibotta/android/service/api/job/WaitingApiJob;

    invoke-direct {v2, v1}, Lcom/ibotta/android/service/api/job/WaitingApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->offersByRetailerIdsGraphQLJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 135
    :cond_2
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 136
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->offersByRetailerIdsGraphQLJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected getOfferHelper()Lcom/ibotta/api/helper/offer/OfferHelper;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    return-object v0
.end method

.method protected getOffersGraphQLResponse()Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->offersByRetailerIdsGraphQLJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->isSuccessfullyLoaded()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 107
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->offersByRetailerIdsGraphQLJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 229
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;->toRetailerParcel(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v0

    return-object v0
.end method

.method public onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 143
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 144
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->offersByRetailerIdsGraphQLJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onButtonActionAcquired(Lcom/usebutton/sdk/action/ButtonAction;)Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesPostCall;
    .locals 4
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 193
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->getOffersGraphQLResponse()Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "onButtonActionAcquired"

    const/4 v1, 0x0

    .line 197
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 200
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->getOffersGraphQLResponse()Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;->getOffersAsModels()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 202
    invoke-virtual {p1}, Lcom/usebutton/sdk/action/ButtonAction;->getAttributionToken()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->createLaunchInfoParam(Ljava/lang/String;Ljava/util/List;)Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfoParam;

    move-result-object p1

    const-string v2, "Created CustomerRetailerLaunchesPostCall with %1$d Offers."

    const/4 v3, 0x1

    .line 204
    new-array v3, v3, [Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v1

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    new-instance v0, Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesPostCall;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    invoke-direct {v0, v1, p1}, Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesPostCall;-><init>(ILcom/ibotta/api/call/customer/buttonsdk/LaunchInfoParam;)V

    return-object v0
.end method

.method public onFetchFinishedSuccessfully()V
    .locals 3

    .line 182
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->isSuccessfullyLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->retailerId:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 183
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/home/HomeResponse;

    .line 185
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-virtual {v0}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object v0

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->retailerId:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v1, v0, v2}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    .line 188
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->appActionCreator:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/AppActionCreator;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->getButtonSdkAction()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/AppActionCreator;->requestAppAction(Ljava/lang/String;)V

    return-void
.end method

.method public onFetchJobFailed(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 0

    return-void
.end method

.method public onFetchJobSuccess(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 0

    return-void
.end method

.method public onPurchasePathAcquired(Lcom/usebutton/sdk/purchasepath/PurchasePath;)Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesPostCall;
    .locals 4
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 211
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->getOffersGraphQLResponse()Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "onPurchasePathAcquired"

    const/4 v1, 0x0

    .line 215
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 218
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->getOffersGraphQLResponse()Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;->getOffersAsModels()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 220
    invoke-virtual {p1}, Lcom/usebutton/sdk/purchasepath/PurchasePath;->getAttributionToken()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->createLaunchInfoParam(Ljava/lang/String;Ljava/util/List;)Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfoParam;

    move-result-object p1

    const-string v2, "Created CustomerRetailerLaunchesPostCall with %1$d Offers."

    const/4 v3, 0x1

    .line 222
    new-array v3, v3, [Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v1

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    new-instance v0, Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesPostCall;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    invoke-direct {v0, v1, p1}, Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesPostCall;-><init>(ILcom/ibotta/api/call/customer/buttonsdk/LaunchInfoParam;)V

    return-object v0
.end method

.method protected setRetailerId(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 93
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->retailerId:Ljava/lang/Integer;

    .line 94
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->onRetailerIdSet()V

    return-void
.end method
