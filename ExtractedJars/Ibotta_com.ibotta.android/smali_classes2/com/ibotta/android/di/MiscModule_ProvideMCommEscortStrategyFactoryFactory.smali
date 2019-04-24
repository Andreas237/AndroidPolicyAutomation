.class public final Lcom/ibotta/android/di/MiscModule_ProvideMCommEscortStrategyFactoryFactory;
.super Ljava/lang/Object;
.source "MiscModule_ProvideMCommEscortStrategyFactoryFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;",
        ">;"
    }
.end annotation


# instance fields
.field private final appProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;"
        }
    .end annotation
.end field

.field private final formattingProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;"
        }
    .end annotation
.end field

.field private final graphQLCallFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final loadRetailersVariantProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;",
            ">;"
        }
    .end annotation
.end field

.field private final offerHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final retailerHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final retailerParcelHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final userStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
            ">;)V"
        }
    .end annotation

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lcom/ibotta/android/di/MiscModule_ProvideMCommEscortStrategyFactoryFactory;->appProvider:Ljavax/inject/Provider;

    .line 49
    iput-object p2, p0, Lcom/ibotta/android/di/MiscModule_ProvideMCommEscortStrategyFactoryFactory;->userStateProvider:Ljavax/inject/Provider;

    .line 50
    iput-object p3, p0, Lcom/ibotta/android/di/MiscModule_ProvideMCommEscortStrategyFactoryFactory;->retailerHelperProvider:Ljavax/inject/Provider;

    .line 51
    iput-object p4, p0, Lcom/ibotta/android/di/MiscModule_ProvideMCommEscortStrategyFactoryFactory;->offerHelperProvider:Ljavax/inject/Provider;

    .line 52
    iput-object p5, p0, Lcom/ibotta/android/di/MiscModule_ProvideMCommEscortStrategyFactoryFactory;->formattingProvider:Ljavax/inject/Provider;

    .line 53
    iput-object p6, p0, Lcom/ibotta/android/di/MiscModule_ProvideMCommEscortStrategyFactoryFactory;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    .line 54
    iput-object p7, p0, Lcom/ibotta/android/di/MiscModule_ProvideMCommEscortStrategyFactoryFactory;->loadRetailersVariantProvider:Ljavax/inject/Provider;

    .line 55
    iput-object p8, p0, Lcom/ibotta/android/di/MiscModule_ProvideMCommEscortStrategyFactoryFactory;->retailerParcelHelperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MiscModule_ProvideMCommEscortStrategyFactoryFactory;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
            ">;)",
            "Lcom/ibotta/android/di/MiscModule_ProvideMCommEscortStrategyFactoryFactory;"
        }
    .end annotation

    .line 100
    new-instance v9, Lcom/ibotta/android/di/MiscModule_ProvideMCommEscortStrategyFactoryFactory;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/di/MiscModule_ProvideMCommEscortStrategyFactoryFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v9
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;"
        }
    .end annotation

    .line 81
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/App;

    .line 82
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Lcom/ibotta/android/state/user/UserState;

    .line 83
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 84
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 85
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lcom/ibotta/android/util/Formatting;

    .line 86
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 87
    invoke-interface {p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    .line 88
    invoke-interface {p7}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v7, p0

    check-cast v7, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 80
    invoke-static/range {v0 .. v7}, Lcom/ibotta/android/di/MiscModule_ProvideMCommEscortStrategyFactoryFactory;->proxyProvideMCommEscortStrategyFactory(Lcom/ibotta/android/App;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideMCommEscortStrategyFactory(Lcom/ibotta/android/App;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;
    .locals 0

    .line 121
    invoke-static/range {p0 .. p7}, Lcom/ibotta/android/di/MiscModule;->provideMCommEscortStrategyFactory(Lcom/ibotta/android/App;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 120
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;
    .locals 8

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/di/MiscModule_ProvideMCommEscortStrategyFactoryFactory;->appProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/MiscModule_ProvideMCommEscortStrategyFactoryFactory;->userStateProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/MiscModule_ProvideMCommEscortStrategyFactoryFactory;->retailerHelperProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/MiscModule_ProvideMCommEscortStrategyFactoryFactory;->offerHelperProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/MiscModule_ProvideMCommEscortStrategyFactoryFactory;->formattingProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/MiscModule_ProvideMCommEscortStrategyFactoryFactory;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/MiscModule_ProvideMCommEscortStrategyFactoryFactory;->loadRetailersVariantProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/di/MiscModule_ProvideMCommEscortStrategyFactoryFactory;->retailerParcelHelperProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v7}, Lcom/ibotta/android/di/MiscModule_ProvideMCommEscortStrategyFactoryFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 17
    invoke-virtual {p0}, Lcom/ibotta/android/di/MiscModule_ProvideMCommEscortStrategyFactoryFactory;->get()Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/MCommEscortStrategyFactory;

    move-result-object v0

    return-object v0
.end method
