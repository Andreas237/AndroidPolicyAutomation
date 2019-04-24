.class public final Lcom/ibotta/android/di/ApolloModule_ProvideCustomerNodeMapperFactory;
.super Ljava/lang/Object;
.source "ApolloModule_ProvideCustomerNodeMapperFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;",
        ">;"
    }
.end annotation


# instance fields
.field private final customerFavoriteRetailerMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/CustomerFavoriteRetailerMapper;",
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
            "Lcom/ibotta/android/graphql/mapper/CustomerFavoriteRetailerMapper;",
            ">;)V"
        }
    .end annotation

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/di/ApolloModule_ProvideCustomerNodeMapperFactory;->formattingProvider:Ljavax/inject/Provider;

    .line 25
    iput-object p2, p0, Lcom/ibotta/android/di/ApolloModule_ProvideCustomerNodeMapperFactory;->customerFavoriteRetailerMapperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideCustomerNodeMapperFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/CustomerFavoriteRetailerMapper;",
            ">;)",
            "Lcom/ibotta/android/di/ApolloModule_ProvideCustomerNodeMapperFactory;"
        }
    .end annotation

    .line 43
    new-instance v0, Lcom/ibotta/android/di/ApolloModule_ProvideCustomerNodeMapperFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/di/ApolloModule_ProvideCustomerNodeMapperFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/CustomerFavoriteRetailerMapper;",
            ">;)",
            "Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;"
        }
    .end annotation

    .line 37
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/util/Formatting;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/mapper/CustomerFavoriteRetailerMapper;

    .line 36
    invoke-static {p0, p1}, Lcom/ibotta/android/di/ApolloModule_ProvideCustomerNodeMapperFactory;->proxyProvideCustomerNodeMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/CustomerFavoriteRetailerMapper;)Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideCustomerNodeMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/CustomerFavoriteRetailerMapper;)Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;
    .locals 0

    .line 50
    invoke-static {p0, p1}, Lcom/ibotta/android/di/ApolloModule;->provideCustomerNodeMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/CustomerFavoriteRetailerMapper;)Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 49
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;
    .locals 2

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/di/ApolloModule_ProvideCustomerNodeMapperFactory;->formattingProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/ApolloModule_ProvideCustomerNodeMapperFactory;->customerFavoriteRetailerMapperProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/di/ApolloModule_ProvideCustomerNodeMapperFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/di/ApolloModule_ProvideCustomerNodeMapperFactory;->get()Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;

    move-result-object v0

    return-object v0
.end method
