.class public final Lcom/ibotta/android/di/ApolloModule_ProvideModuleMapperFactory;
.super Ljava/lang/Object;
.source "ApolloModule_ProvideModuleMapperFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/graphql/mapper/ModuleMapper;",
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

.field private final featureMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/FeatureMapper;",
            ">;"
        }
    .end annotation
.end field

.field private final featuredRetailerMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/FeaturedRetailerMapper;",
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

.field private final retailerCategoryMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/RetailerCategoryMapper;",
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
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
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
            "Lcom/ibotta/android/graphql/mapper/FeaturedRetailerMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/FeatureMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/ProductMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/RetailerCategoryMapper;",
            ">;)V"
        }
    .end annotation

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Lcom/ibotta/android/di/ApolloModule_ProvideModuleMapperFactory;->formattingProvider:Ljavax/inject/Provider;

    .line 48
    iput-object p2, p0, Lcom/ibotta/android/di/ApolloModule_ProvideModuleMapperFactory;->retailerMapperProvider:Ljavax/inject/Provider;

    .line 49
    iput-object p3, p0, Lcom/ibotta/android/di/ApolloModule_ProvideModuleMapperFactory;->offerMapperProvider:Ljavax/inject/Provider;

    .line 50
    iput-object p4, p0, Lcom/ibotta/android/di/ApolloModule_ProvideModuleMapperFactory;->bonusMapperProvider:Ljavax/inject/Provider;

    .line 51
    iput-object p5, p0, Lcom/ibotta/android/di/ApolloModule_ProvideModuleMapperFactory;->featuredRetailerMapperProvider:Ljavax/inject/Provider;

    .line 52
    iput-object p6, p0, Lcom/ibotta/android/di/ApolloModule_ProvideModuleMapperFactory;->featureMapperProvider:Ljavax/inject/Provider;

    .line 53
    iput-object p7, p0, Lcom/ibotta/android/di/ApolloModule_ProvideModuleMapperFactory;->productMapperProvider:Ljavax/inject/Provider;

    .line 54
    iput-object p8, p0, Lcom/ibotta/android/di/ApolloModule_ProvideModuleMapperFactory;->retailerCategoryMapperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideModuleMapperFactory;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
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
            "Lcom/ibotta/android/graphql/mapper/FeaturedRetailerMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/FeatureMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/ProductMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/RetailerCategoryMapper;",
            ">;)",
            "Lcom/ibotta/android/di/ApolloModule_ProvideModuleMapperFactory;"
        }
    .end annotation

    .line 99
    new-instance v9, Lcom/ibotta/android/di/ApolloModule_ProvideModuleMapperFactory;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/di/ApolloModule_ProvideModuleMapperFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v9
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/graphql/mapper/ModuleMapper;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
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
            "Lcom/ibotta/android/graphql/mapper/FeaturedRetailerMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/FeatureMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/ProductMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/RetailerCategoryMapper;",
            ">;)",
            "Lcom/ibotta/android/graphql/mapper/ModuleMapper;"
        }
    .end annotation

    .line 80
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    .line 81
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Lcom/ibotta/android/graphql/mapper/RetailerMapper;

    .line 82
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Lcom/ibotta/android/graphql/mapper/OfferMapper;

    .line 83
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lcom/ibotta/android/graphql/mapper/BonusMapper;

    .line 84
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lcom/ibotta/android/graphql/mapper/FeaturedRetailerMapper;

    .line 85
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lcom/ibotta/android/graphql/mapper/FeatureMapper;

    .line 86
    invoke-interface {p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Lcom/ibotta/android/graphql/mapper/ProductMapper;

    .line 87
    invoke-interface {p7}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v7, p0

    check-cast v7, Lcom/ibotta/android/graphql/mapper/RetailerCategoryMapper;

    .line 79
    invoke-static/range {v0 .. v7}, Lcom/ibotta/android/di/ApolloModule_ProvideModuleMapperFactory;->proxyProvideModuleMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RetailerMapper;Lcom/ibotta/android/graphql/mapper/OfferMapper;Lcom/ibotta/android/graphql/mapper/BonusMapper;Lcom/ibotta/android/graphql/mapper/FeaturedRetailerMapper;Lcom/ibotta/android/graphql/mapper/FeatureMapper;Lcom/ibotta/android/graphql/mapper/ProductMapper;Lcom/ibotta/android/graphql/mapper/RetailerCategoryMapper;)Lcom/ibotta/android/graphql/mapper/ModuleMapper;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideModuleMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RetailerMapper;Lcom/ibotta/android/graphql/mapper/OfferMapper;Lcom/ibotta/android/graphql/mapper/BonusMapper;Lcom/ibotta/android/graphql/mapper/FeaturedRetailerMapper;Lcom/ibotta/android/graphql/mapper/FeatureMapper;Lcom/ibotta/android/graphql/mapper/ProductMapper;Lcom/ibotta/android/graphql/mapper/RetailerCategoryMapper;)Lcom/ibotta/android/graphql/mapper/ModuleMapper;
    .locals 0

    .line 120
    invoke-static/range {p0 .. p7}, Lcom/ibotta/android/di/ApolloModule;->provideModuleMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RetailerMapper;Lcom/ibotta/android/graphql/mapper/OfferMapper;Lcom/ibotta/android/graphql/mapper/BonusMapper;Lcom/ibotta/android/graphql/mapper/FeaturedRetailerMapper;Lcom/ibotta/android/graphql/mapper/FeatureMapper;Lcom/ibotta/android/graphql/mapper/ProductMapper;Lcom/ibotta/android/graphql/mapper/RetailerCategoryMapper;)Lcom/ibotta/android/graphql/mapper/ModuleMapper;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 119
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/graphql/mapper/ModuleMapper;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/graphql/mapper/ModuleMapper;
    .locals 8

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/di/ApolloModule_ProvideModuleMapperFactory;->formattingProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/ApolloModule_ProvideModuleMapperFactory;->retailerMapperProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/ApolloModule_ProvideModuleMapperFactory;->offerMapperProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/ApolloModule_ProvideModuleMapperFactory;->bonusMapperProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/ApolloModule_ProvideModuleMapperFactory;->featuredRetailerMapperProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/ApolloModule_ProvideModuleMapperFactory;->featureMapperProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/ApolloModule_ProvideModuleMapperFactory;->productMapperProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/di/ApolloModule_ProvideModuleMapperFactory;->retailerCategoryMapperProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v7}, Lcom/ibotta/android/di/ApolloModule_ProvideModuleMapperFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/graphql/mapper/ModuleMapper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 17
    invoke-virtual {p0}, Lcom/ibotta/android/di/ApolloModule_ProvideModuleMapperFactory;->get()Lcom/ibotta/android/graphql/mapper/ModuleMapper;

    move-result-object v0

    return-object v0
.end method
