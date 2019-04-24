.class public final Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryMapperFactory;
.super Ljava/lang/Object;
.source "ApolloModule_ProvideOfferCategoryMapperFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;",
        ">;"
    }
.end annotation


# instance fields
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


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/OfferMapper;",
            ">;)V"
        }
    .end annotation

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryMapperFactory;->formattingProvider:Ljavax/inject/Provider;

    .line 24
    iput-object p2, p0, Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryMapperFactory;->offerMapperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryMapperFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/OfferMapper;",
            ">;)",
            "Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryMapperFactory;"
        }
    .end annotation

    .line 39
    new-instance v0, Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryMapperFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryMapperFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/OfferMapper;",
            ">;)",
            "Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;"
        }
    .end annotation

    .line 34
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/util/Formatting;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/mapper/OfferMapper;

    invoke-static {p0, p1}, Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryMapperFactory;->proxyProvideOfferCategoryMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/OfferMapper;)Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideOfferCategoryMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/OfferMapper;)Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;
    .locals 0

    .line 46
    invoke-static {p0, p1}, Lcom/ibotta/android/di/ApolloModule;->provideOfferCategoryMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/OfferMapper;)Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 45
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;
    .locals 2

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryMapperFactory;->formattingProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryMapperFactory;->offerMapperProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryMapperFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryMapperFactory;->get()Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;

    move-result-object v0

    return-object v0
.end method
