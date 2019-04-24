.class public final Lcom/ibotta/android/di/ApolloModule_ProvideEngagementMapperFactory;
.super Ljava/lang/Object;
.source "ApolloModule_ProvideEngagementMapperFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/graphql/mapper/EngagementMapper;",
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

.field private final offerRewardQuestionMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;",
            ">;"
        }
    .end annotation
.end field

.field private final optionMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/OptionMapper;",
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
            "Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/OptionMapper;",
            ">;)V"
        }
    .end annotation

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/di/ApolloModule_ProvideEngagementMapperFactory;->formattingProvider:Ljavax/inject/Provider;

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/di/ApolloModule_ProvideEngagementMapperFactory;->offerRewardQuestionMapperProvider:Ljavax/inject/Provider;

    .line 30
    iput-object p3, p0, Lcom/ibotta/android/di/ApolloModule_ProvideEngagementMapperFactory;->optionMapperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideEngagementMapperFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/OptionMapper;",
            ">;)",
            "Lcom/ibotta/android/di/ApolloModule_ProvideEngagementMapperFactory;"
        }
    .end annotation

    .line 53
    new-instance v0, Lcom/ibotta/android/di/ApolloModule_ProvideEngagementMapperFactory;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/di/ApolloModule_ProvideEngagementMapperFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/graphql/mapper/EngagementMapper;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/OptionMapper;",
            ">;)",
            "Lcom/ibotta/android/graphql/mapper/EngagementMapper;"
        }
    .end annotation

    .line 44
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/util/Formatting;

    .line 45
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;

    .line 46
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/graphql/mapper/OptionMapper;

    .line 43
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/ApolloModule_ProvideEngagementMapperFactory;->proxyProvideEngagementMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;Lcom/ibotta/android/graphql/mapper/OptionMapper;)Lcom/ibotta/android/graphql/mapper/EngagementMapper;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideEngagementMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;Lcom/ibotta/android/graphql/mapper/OptionMapper;)Lcom/ibotta/android/graphql/mapper/EngagementMapper;
    .locals 0

    .line 62
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/ApolloModule;->provideEngagementMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/OfferRewardQuestionMapper;Lcom/ibotta/android/graphql/mapper/OptionMapper;)Lcom/ibotta/android/graphql/mapper/EngagementMapper;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 61
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/graphql/mapper/EngagementMapper;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/graphql/mapper/EngagementMapper;
    .locals 3

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/di/ApolloModule_ProvideEngagementMapperFactory;->formattingProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/ApolloModule_ProvideEngagementMapperFactory;->offerRewardQuestionMapperProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/ApolloModule_ProvideEngagementMapperFactory;->optionMapperProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/di/ApolloModule_ProvideEngagementMapperFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/graphql/mapper/EngagementMapper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/android/di/ApolloModule_ProvideEngagementMapperFactory;->get()Lcom/ibotta/android/graphql/mapper/EngagementMapper;

    move-result-object v0

    return-object v0
.end method
