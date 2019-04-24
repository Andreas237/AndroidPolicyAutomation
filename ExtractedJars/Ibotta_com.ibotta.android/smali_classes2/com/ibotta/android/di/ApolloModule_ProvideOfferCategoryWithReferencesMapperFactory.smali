.class public final Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryWithReferencesMapperFactory;
.super Ljava/lang/Object;
.source "ApolloModule_ProvideOfferCategoryWithReferencesMapperFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;",
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


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryWithReferencesMapperFactory;->formattingProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryWithReferencesMapperFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;)",
            "Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryWithReferencesMapperFactory;"
        }
    .end annotation

    .line 35
    new-instance v0, Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryWithReferencesMapperFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryWithReferencesMapperFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;)",
            "Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;"
        }
    .end annotation

    .line 30
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p0}, Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryWithReferencesMapperFactory;->proxyProvideOfferCategoryWithReferencesMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideOfferCategoryWithReferencesMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;
    .locals 1

    .line 41
    invoke-static {p0}, Lcom/ibotta/android/di/ApolloModule;->provideOfferCategoryWithReferencesMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 40
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryWithReferencesMapperFactory;->formattingProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryWithReferencesMapperFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/ApolloModule_ProvideOfferCategoryWithReferencesMapperFactory;->get()Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;

    move-result-object v0

    return-object v0
.end method
