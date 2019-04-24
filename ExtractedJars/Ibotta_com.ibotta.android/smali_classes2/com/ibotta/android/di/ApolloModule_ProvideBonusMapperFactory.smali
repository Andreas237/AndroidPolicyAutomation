.class public final Lcom/ibotta/android/di/ApolloModule_ProvideBonusMapperFactory;
.super Ljava/lang/Object;
.source "ApolloModule_ProvideBonusMapperFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/graphql/mapper/BonusMapper;",
        ">;"
    }
.end annotation


# instance fields
.field private final bonusQualificationMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;",
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

.field private final questMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/QuestMapper;",
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
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/QuestMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/SortResultMapper;",
            ">;)V"
        }
    .end annotation

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/di/ApolloModule_ProvideBonusMapperFactory;->formattingProvider:Ljavax/inject/Provider;

    .line 32
    iput-object p2, p0, Lcom/ibotta/android/di/ApolloModule_ProvideBonusMapperFactory;->questMapperProvider:Ljavax/inject/Provider;

    .line 33
    iput-object p3, p0, Lcom/ibotta/android/di/ApolloModule_ProvideBonusMapperFactory;->bonusQualificationMapperProvider:Ljavax/inject/Provider;

    .line 34
    iput-object p4, p0, Lcom/ibotta/android/di/ApolloModule_ProvideBonusMapperFactory;->sortResultMapperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideBonusMapperFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/QuestMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/SortResultMapper;",
            ">;)",
            "Lcom/ibotta/android/di/ApolloModule_ProvideBonusMapperFactory;"
        }
    .end annotation

    .line 63
    new-instance v0, Lcom/ibotta/android/di/ApolloModule_ProvideBonusMapperFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/di/ApolloModule_ProvideBonusMapperFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/graphql/mapper/BonusMapper;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/QuestMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/SortResultMapper;",
            ">;)",
            "Lcom/ibotta/android/graphql/mapper/BonusMapper;"
        }
    .end annotation

    .line 52
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/util/Formatting;

    .line 53
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/mapper/QuestMapper;

    .line 54
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;

    .line 55
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ibotta/android/graphql/mapper/SortResultMapper;

    .line 51
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/ApolloModule_ProvideBonusMapperFactory;->proxyProvideBonusMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/QuestMapper;Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;Lcom/ibotta/android/graphql/mapper/SortResultMapper;)Lcom/ibotta/android/graphql/mapper/BonusMapper;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideBonusMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/QuestMapper;Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;Lcom/ibotta/android/graphql/mapper/SortResultMapper;)Lcom/ibotta/android/graphql/mapper/BonusMapper;
    .locals 0

    .line 76
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/ApolloModule;->provideBonusMapper(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/QuestMapper;Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;Lcom/ibotta/android/graphql/mapper/SortResultMapper;)Lcom/ibotta/android/graphql/mapper/BonusMapper;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 75
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/graphql/mapper/BonusMapper;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/graphql/mapper/BonusMapper;
    .locals 4

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/di/ApolloModule_ProvideBonusMapperFactory;->formattingProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/ApolloModule_ProvideBonusMapperFactory;->questMapperProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/ApolloModule_ProvideBonusMapperFactory;->bonusQualificationMapperProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/ApolloModule_ProvideBonusMapperFactory;->sortResultMapperProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/di/ApolloModule_ProvideBonusMapperFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/graphql/mapper/BonusMapper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/ibotta/android/di/ApolloModule_ProvideBonusMapperFactory;->get()Lcom/ibotta/android/graphql/mapper/BonusMapper;

    move-result-object v0

    return-object v0
.end method
