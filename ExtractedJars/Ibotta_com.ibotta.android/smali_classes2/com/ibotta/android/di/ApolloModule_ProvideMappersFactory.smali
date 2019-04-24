.class public final Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;
.super Ljava/lang/Object;
.source "ApolloModule_ProvideMappersFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/graphql/mapper/Mappers;",
        ">;"
    }
.end annotation


# instance fields
.field private final bonusMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/BonusMapper;",
            ">;"
        }
    .end annotation
.end field

.field private final buyableGiftCardMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;",
            ">;"
        }
    .end annotation
.end field

.field private final buyableGiftCardRetailerMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/BuyableGiftCardRetailerMapper;",
            ">;"
        }
    .end annotation
.end field

.field private final customerNodeMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;",
            ">;"
        }
    .end annotation
.end field

.field private final dealMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/DealMapper;",
            ">;"
        }
    .end annotation
.end field

.field private final engagementMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/EngagementMapper;",
            ">;"
        }
    .end annotation
.end field

.field private final featureMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/FeatureMapper;",
            ">;"
        }
    .end annotation
.end field

.field private final moduleMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/ModuleMapper;",
            ">;"
        }
    .end annotation
.end field

.field private final offerCategoryMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;",
            ">;"
        }
    .end annotation
.end field

.field private final offerCategoryWithReferencesMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;",
            ">;"
        }
    .end annotation
.end field

.field private final offerMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/OfferMapper;",
            ">;"
        }
    .end annotation
.end field

.field private final productMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/ProductMapper;",
            ">;"
        }
    .end annotation
.end field

.field private final retailerCategoryNodeMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;",
            ">;"
        }
    .end annotation
.end field

.field private final retailerMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/RetailerMapper;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/RetailerMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/OfferMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/BonusMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/FeatureMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/ModuleMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/ProductMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/BuyableGiftCardRetailerMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/DealMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/EngagementMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;",
            ">;)V"
        }
    .end annotation

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    iput-object p1, p0, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->retailerMapperProvider:Ljavax/inject/Provider;

    .line 73
    iput-object p2, p0, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->offerMapperProvider:Ljavax/inject/Provider;

    .line 74
    iput-object p3, p0, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->bonusMapperProvider:Ljavax/inject/Provider;

    .line 75
    iput-object p4, p0, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->offerCategoryMapperProvider:Ljavax/inject/Provider;

    .line 76
    iput-object p5, p0, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->offerCategoryWithReferencesMapperProvider:Ljavax/inject/Provider;

    .line 77
    iput-object p6, p0, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->featureMapperProvider:Ljavax/inject/Provider;

    .line 78
    iput-object p7, p0, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->moduleMapperProvider:Ljavax/inject/Provider;

    .line 79
    iput-object p8, p0, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->productMapperProvider:Ljavax/inject/Provider;

    .line 80
    iput-object p9, p0, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->buyableGiftCardMapperProvider:Ljavax/inject/Provider;

    .line 81
    iput-object p10, p0, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->buyableGiftCardRetailerMapperProvider:Ljavax/inject/Provider;

    .line 82
    iput-object p11, p0, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->dealMapperProvider:Ljavax/inject/Provider;

    .line 83
    iput-object p12, p0, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->engagementMapperProvider:Ljavax/inject/Provider;

    .line 84
    iput-object p13, p0, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->customerNodeMapperProvider:Ljavax/inject/Provider;

    .line 85
    iput-object p14, p0, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->retailerCategoryNodeMapperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/RetailerMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/OfferMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/BonusMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/FeatureMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/ModuleMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/ProductMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/BuyableGiftCardRetailerMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/DealMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/EngagementMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;",
            ">;)",
            "Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;"
        }
    .end annotation

    .line 154
    new-instance v15, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;

    move-object v0, v15

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    invoke-direct/range {v0 .. v14}, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v15
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/graphql/mapper/Mappers;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/RetailerMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/OfferMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/BonusMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/FeatureMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/ModuleMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/ProductMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/BuyableGiftCardRetailerMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/DealMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/EngagementMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;",
            ">;)",
            "Lcom/ibotta/android/graphql/mapper/Mappers;"
        }
    .end annotation

    .line 123
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/mapper/RetailerMapper;

    .line 124
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/graphql/mapper/OfferMapper;

    .line 125
    invoke-interface/range {p2 .. p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/graphql/mapper/BonusMapper;

    .line 126
    invoke-interface/range {p3 .. p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;

    .line 127
    invoke-interface/range {p4 .. p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;

    .line 128
    invoke-interface/range {p5 .. p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ibotta/android/graphql/mapper/FeatureMapper;

    .line 129
    invoke-interface/range {p6 .. p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ibotta/android/graphql/mapper/ModuleMapper;

    .line 130
    invoke-interface/range {p7 .. p7}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ibotta/android/graphql/mapper/ProductMapper;

    .line 131
    invoke-interface/range {p8 .. p8}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;

    .line 132
    invoke-interface/range {p9 .. p9}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/ibotta/android/graphql/mapper/BuyableGiftCardRetailerMapper;

    .line 133
    invoke-interface/range {p10 .. p10}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/ibotta/android/graphql/mapper/DealMapper;

    .line 134
    invoke-interface/range {p11 .. p11}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/ibotta/android/graphql/mapper/EngagementMapper;

    .line 135
    invoke-interface/range {p12 .. p12}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;

    .line 136
    invoke-interface/range {p13 .. p13}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;

    move-object p0, v0

    move-object p1, v1

    move-object/from16 p2, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    .line 122
    invoke-static/range {p0 .. p13}, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->proxyProvideMappers(Lcom/ibotta/android/graphql/mapper/RetailerMapper;Lcom/ibotta/android/graphql/mapper/OfferMapper;Lcom/ibotta/android/graphql/mapper/BonusMapper;Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;Lcom/ibotta/android/graphql/mapper/FeatureMapper;Lcom/ibotta/android/graphql/mapper/ModuleMapper;Lcom/ibotta/android/graphql/mapper/ProductMapper;Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;Lcom/ibotta/android/graphql/mapper/BuyableGiftCardRetailerMapper;Lcom/ibotta/android/graphql/mapper/DealMapper;Lcom/ibotta/android/graphql/mapper/EngagementMapper;Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;)Lcom/ibotta/android/graphql/mapper/Mappers;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideMappers(Lcom/ibotta/android/graphql/mapper/RetailerMapper;Lcom/ibotta/android/graphql/mapper/OfferMapper;Lcom/ibotta/android/graphql/mapper/BonusMapper;Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;Lcom/ibotta/android/graphql/mapper/FeatureMapper;Lcom/ibotta/android/graphql/mapper/ModuleMapper;Lcom/ibotta/android/graphql/mapper/ProductMapper;Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;Lcom/ibotta/android/graphql/mapper/BuyableGiftCardRetailerMapper;Lcom/ibotta/android/graphql/mapper/DealMapper;Lcom/ibotta/android/graphql/mapper/EngagementMapper;Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;)Lcom/ibotta/android/graphql/mapper/Mappers;
    .locals 0

    .line 187
    invoke-static/range {p0 .. p13}, Lcom/ibotta/android/di/ApolloModule;->provideMappers(Lcom/ibotta/android/graphql/mapper/RetailerMapper;Lcom/ibotta/android/graphql/mapper/OfferMapper;Lcom/ibotta/android/graphql/mapper/BonusMapper;Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;Lcom/ibotta/android/graphql/mapper/FeatureMapper;Lcom/ibotta/android/graphql/mapper/ModuleMapper;Lcom/ibotta/android/graphql/mapper/ProductMapper;Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;Lcom/ibotta/android/graphql/mapper/BuyableGiftCardRetailerMapper;Lcom/ibotta/android/graphql/mapper/DealMapper;Lcom/ibotta/android/graphql/mapper/EngagementMapper;Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;)Lcom/ibotta/android/graphql/mapper/Mappers;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 186
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/graphql/mapper/Mappers;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/graphql/mapper/Mappers;
    .locals 14

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->retailerMapperProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->offerMapperProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->bonusMapperProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->offerCategoryMapperProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->offerCategoryWithReferencesMapperProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->featureMapperProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->moduleMapperProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->productMapperProvider:Ljavax/inject/Provider;

    iget-object v8, p0, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->buyableGiftCardMapperProvider:Ljavax/inject/Provider;

    iget-object v9, p0, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->buyableGiftCardRetailerMapperProvider:Ljavax/inject/Provider;

    iget-object v10, p0, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->dealMapperProvider:Ljavax/inject/Provider;

    iget-object v11, p0, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->engagementMapperProvider:Ljavax/inject/Provider;

    iget-object v12, p0, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->customerNodeMapperProvider:Ljavax/inject/Provider;

    iget-object v13, p0, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->retailerCategoryNodeMapperProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v13}, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/graphql/mapper/Mappers;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 23
    invoke-virtual {p0}, Lcom/ibotta/android/di/ApolloModule_ProvideMappersFactory;->get()Lcom/ibotta/android/graphql/mapper/Mappers;

    move-result-object v0

    return-object v0
.end method
