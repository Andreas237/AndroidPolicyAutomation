.class public final Lcom/ibotta/android/di/ApolloModule_ProvideRetailerMapperFactory;
.super Ljava/lang/Object;
.source "ApolloModule_ProvideRetailerMapperFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/graphql/mapper/RetailerMapper;",
        ">;"
    }
.end annotation


# instance fields
.field private final buttonInfoMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;",
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

.field private final formattingProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;"
        }
    .end annotation
.end field

.field private final retailerBarcodeConfigurationMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/RetailerBarcodeConfigurationMapper;",
            ">;"
        }
    .end annotation
.end field

.field private final retailerRedemptionMetaMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;",
            ">;"
        }
    .end annotation
.end field

.field private final sortResultMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/SortResultMapper;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/FeatureMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/RetailerBarcodeConfigurationMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/SortResultMapper;",
            ">;)V"
        }
    .end annotation

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerMapperFactory;->formattingProvider:Ljavax/inject/Provider;

    .line 41
    iput-object p2, p0, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerMapperFactory;->buttonInfoMapperProvider:Ljavax/inject/Provider;

    .line 42
    iput-object p3, p0, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerMapperFactory;->featureMapperProvider:Ljavax/inject/Provider;

    .line 43
    iput-object p4, p0, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerMapperFactory;->retailerBarcodeConfigurationMapperProvider:Ljavax/inject/Provider;

    .line 44
    iput-object p5, p0, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerMapperFactory;->retailerRedemptionMetaMapperProvider:Ljavax/inject/Provider;

    .line 45
    iput-object p6, p0, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerMapperFactory;->sortResultMapperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideRetailerMapperFactory;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/FeatureMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/RetailerBarcodeConfigurationMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/SortResultMapper;",
            ">;)",
            "Lcom/ibotta/android/di/ApolloModule_ProvideRetailerMapperFactory;"
        }
    .end annotation

    .line 82
    new-instance v7, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerMapperFactory;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerMapperFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v7
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/graphql/mapper/RetailerMapper;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/FeatureMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/RetailerBarcodeConfigurationMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/SortResultMapper;",
            ">;)",
            "Lcom/ibotta/android/graphql/mapper/RetailerMapper;"
        }
    .end annotation

    .line 67
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    .line 68
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;

    .line 69
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Lcom/ibotta/android/graphql/mapper/FeatureMapper;

    .line 70
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lcom/ibotta/android/graphql/mapper/RetailerBarcodeConfigurationMapper;

    .line 71
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;

    .line 72
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lcom/ibotta/android/graphql/mapper/SortResultMapper;

    .line 66
    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerMapperFactory;->proxyProvideRetailerMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;Lcom/ibotta/android/graphql/mapper/FeatureMapper;Lcom/ibotta/android/graphql/mapper/RetailerBarcodeConfigurationMapper;Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;Lcom/ibotta/android/graphql/mapper/SortResultMapper;)Lcom/ibotta/android/graphql/mapper/RetailerMapper;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideRetailerMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;Lcom/ibotta/android/graphql/mapper/FeatureMapper;Lcom/ibotta/android/graphql/mapper/RetailerBarcodeConfigurationMapper;Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;Lcom/ibotta/android/graphql/mapper/SortResultMapper;)Lcom/ibotta/android/graphql/mapper/RetailerMapper;
    .locals 0

    .line 99
    invoke-static/range {p0 .. p5}, Lcom/ibotta/android/di/ApolloModule;->provideRetailerMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;Lcom/ibotta/android/graphql/mapper/FeatureMapper;Lcom/ibotta/android/graphql/mapper/RetailerBarcodeConfigurationMapper;Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;Lcom/ibotta/android/graphql/mapper/SortResultMapper;)Lcom/ibotta/android/graphql/mapper/RetailerMapper;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 98
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/graphql/mapper/RetailerMapper;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/graphql/mapper/RetailerMapper;
    .locals 6

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerMapperFactory;->formattingProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerMapperFactory;->buttonInfoMapperProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerMapperFactory;->featureMapperProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerMapperFactory;->retailerBarcodeConfigurationMapperProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerMapperFactory;->retailerRedemptionMetaMapperProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerMapperFactory;->sortResultMapperProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerMapperFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/graphql/mapper/RetailerMapper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 15
    invoke-virtual {p0}, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerMapperFactory;->get()Lcom/ibotta/android/graphql/mapper/RetailerMapper;

    move-result-object v0

    return-object v0
.end method
