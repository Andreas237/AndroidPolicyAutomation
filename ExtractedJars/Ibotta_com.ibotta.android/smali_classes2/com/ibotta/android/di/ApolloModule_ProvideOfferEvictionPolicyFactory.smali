.class public final Lcom/ibotta/android/di/ApolloModule_ProvideOfferEvictionPolicyFactory;
.super Ljava/lang/Object;
.source "ApolloModule_ProvideOfferEvictionPolicyFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/graphql/cache/evict/OfferEvictionPolicy;",
        ">;"
    }
.end annotation


# instance fields
.field private final appHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
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

.field private final offerHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
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
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;)V"
        }
    .end annotation

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/di/ApolloModule_ProvideOfferEvictionPolicyFactory;->appHelperProvider:Ljavax/inject/Provider;

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/di/ApolloModule_ProvideOfferEvictionPolicyFactory;->offerHelperProvider:Ljavax/inject/Provider;

    .line 30
    iput-object p3, p0, Lcom/ibotta/android/di/ApolloModule_ProvideOfferEvictionPolicyFactory;->formattingProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideOfferEvictionPolicyFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;)",
            "Lcom/ibotta/android/di/ApolloModule_ProvideOfferEvictionPolicyFactory;"
        }
    .end annotation

    .line 50
    new-instance v0, Lcom/ibotta/android/di/ApolloModule_ProvideOfferEvictionPolicyFactory;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/di/ApolloModule_ProvideOfferEvictionPolicyFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/graphql/cache/evict/OfferEvictionPolicy;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;)",
            "Lcom/ibotta/android/graphql/cache/evict/OfferEvictionPolicy;"
        }
    .end annotation

    .line 43
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/util/AppHelper;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/util/Formatting;

    .line 42
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/ApolloModule_ProvideOfferEvictionPolicyFactory;->proxyProvideOfferEvictionPolicy(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/cache/evict/OfferEvictionPolicy;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideOfferEvictionPolicy(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/cache/evict/OfferEvictionPolicy;
    .locals 0

    .line 57
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/ApolloModule;->provideOfferEvictionPolicy(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/cache/evict/OfferEvictionPolicy;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 56
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/graphql/cache/evict/OfferEvictionPolicy;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/graphql/cache/evict/OfferEvictionPolicy;
    .locals 3

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/di/ApolloModule_ProvideOfferEvictionPolicyFactory;->appHelperProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/ApolloModule_ProvideOfferEvictionPolicyFactory;->offerHelperProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/ApolloModule_ProvideOfferEvictionPolicyFactory;->formattingProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/di/ApolloModule_ProvideOfferEvictionPolicyFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/graphql/cache/evict/OfferEvictionPolicy;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/android/di/ApolloModule_ProvideOfferEvictionPolicyFactory;->get()Lcom/ibotta/android/graphql/cache/evict/OfferEvictionPolicy;

    move-result-object v0

    return-object v0
.end method
