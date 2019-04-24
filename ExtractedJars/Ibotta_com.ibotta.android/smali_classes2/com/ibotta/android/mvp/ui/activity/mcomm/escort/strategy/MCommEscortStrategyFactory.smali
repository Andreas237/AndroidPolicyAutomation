.class public Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;
.super Ljava/lang/Object;
.source "MCommEscortStrategyFactory.java"


# instance fields
.field private final app:Lcom/ibotta/android/App;

.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private final loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

.field private final offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

.field private final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

.field private final retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/App;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->app:Lcom/ibotta/android/App;

    .line 41
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 42
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 43
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 44
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 45
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 46
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    .line 47
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    return-void
.end method


# virtual methods
.method public createStrategy(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/AppActionCreator;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategy;
    .locals 28

    move-object/from16 v0, p0

    .line 53
    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v1

    if-eqz v1, :cond_0

    .line 54
    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 58
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getProductId()Ljava/lang/String;

    move-result-object v2

    const/4 v14, 0x2

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/4 v13, 0x3

    if-eqz v2, :cond_1

    .line 59
    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/ProductMCommEscortStrategy;

    iget-object v3, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->app:Lcom/ibotta/android/App;

    iget-object v4, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    iget-object v5, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    iget-object v6, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    iget-object v7, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v8, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    iget-object v9, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    iget-object v10, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 69
    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getProductId()Ljava/lang/String;

    move-result-object v27

    move-object/from16 v17, v2

    move-object/from16 v18, v3

    move-object/from16 v19, v4

    move-object/from16 v20, v5

    move-object/from16 v21, v6

    move-object/from16 v22, v7

    move-object/from16 v23, p2

    move-object/from16 v24, v8

    move-object/from16 v25, v9

    move-object/from16 v26, v10

    invoke-direct/range {v17 .. v27}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/ProductMCommEscortStrategy;-><init>(Lcom/ibotta/android/App;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/AppActionCreator;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 70
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getDealId()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 71
    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/DealMCommEscortStrategy;

    iget-object v3, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->app:Lcom/ibotta/android/App;

    iget-object v4, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    iget-object v5, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    iget-object v6, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    iget-object v7, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v8, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    iget-object v9, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    iget-object v10, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 81
    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getDealId()Ljava/lang/String;

    move-result-object v27

    move-object/from16 v17, v2

    move-object/from16 v18, v3

    move-object/from16 v19, v4

    move-object/from16 v20, v5

    move-object/from16 v21, v6

    move-object/from16 v22, v7

    move-object/from16 v23, p2

    move-object/from16 v24, v8

    move-object/from16 v25, v9

    move-object/from16 v26, v10

    invoke-direct/range {v17 .. v27}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/DealMCommEscortStrategy;-><init>(Lcom/ibotta/android/App;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/AppActionCreator;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Ljava/lang/String;)V

    goto :goto_1

    .line 82
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getOfferId()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_3

    if-nez v1, :cond_3

    .line 83
    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/OfferOnlyMCommEscortStrategy;

    iget-object v3, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->app:Lcom/ibotta/android/App;

    iget-object v4, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    iget-object v5, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    iget-object v6, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    iget-object v7, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v8, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    iget-object v9, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    iget-object v10, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 93
    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getOfferId()Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v27

    move-object/from16 v17, v2

    move-object/from16 v18, v3

    move-object/from16 v19, v4

    move-object/from16 v20, v5

    move-object/from16 v21, v6

    move-object/from16 v22, v7

    move-object/from16 v23, p2

    move-object/from16 v24, v8

    move-object/from16 v25, v9

    move-object/from16 v26, v10

    invoke-direct/range {v17 .. v27}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/OfferOnlyMCommEscortStrategy;-><init>(Lcom/ibotta/android/App;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/AppActionCreator;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;I)V

    goto :goto_1

    :cond_3
    if-eqz v1, :cond_4

    .line 95
    new-instance v17, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/RetailerOrOfferMCommEscortStrategy;

    iget-object v3, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->app:Lcom/ibotta/android/App;

    iget-object v4, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    iget-object v5, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    iget-object v6, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    iget-object v7, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v9, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    iget-object v10, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    iget-object v11, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 106
    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getOfferId()Ljava/lang/Integer;

    move-result-object v18

    move-object/from16 v2, v17

    move-object/from16 v8, p2

    move-object v12, v1

    move-object/from16 v13, v18

    invoke-direct/range {v2 .. v13}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/RetailerOrOfferMCommEscortStrategy;-><init>(Lcom/ibotta/android/App;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/AppActionCreator;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 116
    :goto_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "Chose %1$s for params: retailerId=%2$d, offerId=%3$d, productId=%4$s"

    const/4 v5, 0x4

    .line 117
    new-array v5, v5, [Ljava/lang/Object;

    aput-object v3, v5, v16

    aput-object v1, v5, v15

    .line 121
    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getOfferId()Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v5, v14

    .line 122
    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getProductId()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x3

    aput-object v1, v5, v3

    .line 117
    invoke-static {v4, v5}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v2

    :cond_4
    const/4 v3, 0x3

    .line 108
    new-array v2, v3, [Ljava/lang/Object;

    aput-object v1, v2, v16

    .line 111
    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getOfferId()Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v2, v15

    .line 112
    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getProductId()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v2, v14

    const-string v1, "No factory could be found for the parameters specified: retailerId=%1$d, offerId=%2$d, productId=%3$s"

    .line 108
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 113
    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
.end method
