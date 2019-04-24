.class public final Lcom/ibotta/android/di/ApolloModule_ProvideFeaturedNodeMapperFactory;
.super Ljava/lang/Object;
.source "ApolloModule_ProvideFeaturedNodeMapperFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;",
        ">;"
    }
.end annotation


# instance fields
.field private final featuredBannerNodeMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/FeaturedBannerNodeMapper;",
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

.field private final retailerNodeMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/FeaturedBannerNodeMapper;",
            ">;)V"
        }
    .end annotation

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/di/ApolloModule_ProvideFeaturedNodeMapperFactory;->formattingProvider:Ljavax/inject/Provider;

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/di/ApolloModule_ProvideFeaturedNodeMapperFactory;->retailerNodeMapperProvider:Ljavax/inject/Provider;

    .line 30
    iput-object p3, p0, Lcom/ibotta/android/di/ApolloModule_ProvideFeaturedNodeMapperFactory;->featuredBannerNodeMapperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideFeaturedNodeMapperFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/FeaturedBannerNodeMapper;",
            ">;)",
            "Lcom/ibotta/android/di/ApolloModule_ProvideFeaturedNodeMapperFactory;"
        }
    .end annotation

    .line 53
    new-instance v0, Lcom/ibotta/android/di/ApolloModule_ProvideFeaturedNodeMapperFactory;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/di/ApolloModule_ProvideFeaturedNodeMapperFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/FeaturedBannerNodeMapper;",
            ">;)",
            "Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;"
        }
    .end annotation

    .line 44
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/util/Formatting;

    .line 45
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;

    .line 46
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/graphql/mapper/FeaturedBannerNodeMapper;

    .line 43
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/ApolloModule_ProvideFeaturedNodeMapperFactory;->proxyProvideFeaturedNodeMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;Lcom/ibotta/android/graphql/mapper/FeaturedBannerNodeMapper;)Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideFeaturedNodeMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;Lcom/ibotta/android/graphql/mapper/FeaturedBannerNodeMapper;)Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;
    .locals 0

    .line 62
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/ApolloModule;->provideFeaturedNodeMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RetailerNodeMapper;Lcom/ibotta/android/graphql/mapper/FeaturedBannerNodeMapper;)Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 61
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;
    .locals 3

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/di/ApolloModule_ProvideFeaturedNodeMapperFactory;->formattingProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/ApolloModule_ProvideFeaturedNodeMapperFactory;->retailerNodeMapperProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/ApolloModule_ProvideFeaturedNodeMapperFactory;->featuredBannerNodeMapperProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/di/ApolloModule_ProvideFeaturedNodeMapperFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/android/di/ApolloModule_ProvideFeaturedNodeMapperFactory;->get()Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;

    move-result-object v0

    return-object v0
.end method
