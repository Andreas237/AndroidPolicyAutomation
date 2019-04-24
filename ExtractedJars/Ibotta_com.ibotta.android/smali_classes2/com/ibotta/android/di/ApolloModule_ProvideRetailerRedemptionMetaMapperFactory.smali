.class public final Lcom/ibotta/android/di/ApolloModule_ProvideRetailerRedemptionMetaMapperFactory;
.super Ljava/lang/Object;
.source "ApolloModule_ProvideRetailerRedemptionMetaMapperFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;",
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
    iput-object p1, p0, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerRedemptionMetaMapperFactory;->formattingProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideRetailerRedemptionMetaMapperFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;)",
            "Lcom/ibotta/android/di/ApolloModule_ProvideRetailerRedemptionMetaMapperFactory;"
        }
    .end annotation

    .line 35
    new-instance v0, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerRedemptionMetaMapperFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerRedemptionMetaMapperFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;)",
            "Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;"
        }
    .end annotation

    .line 30
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p0}, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerRedemptionMetaMapperFactory;->proxyProvideRetailerRedemptionMetaMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideRetailerRedemptionMetaMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;
    .locals 1

    .line 41
    invoke-static {p0}, Lcom/ibotta/android/di/ApolloModule;->provideRetailerRedemptionMetaMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 40
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerRedemptionMetaMapperFactory;->formattingProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerRedemptionMetaMapperFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/ApolloModule_ProvideRetailerRedemptionMetaMapperFactory;->get()Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;

    move-result-object v0

    return-object v0
.end method
