.class public final Lcom/ibotta/android/di/ApolloModule_ProvideBonusQualificationMapperFactory;
.super Ljava/lang/Object;
.source "ApolloModule_ProvideBonusQualificationMapperFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;",
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
    iput-object p1, p0, Lcom/ibotta/android/di/ApolloModule_ProvideBonusQualificationMapperFactory;->formattingProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideBonusQualificationMapperFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;)",
            "Lcom/ibotta/android/di/ApolloModule_ProvideBonusQualificationMapperFactory;"
        }
    .end annotation

    .line 34
    new-instance v0, Lcom/ibotta/android/di/ApolloModule_ProvideBonusQualificationMapperFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/ApolloModule_ProvideBonusQualificationMapperFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;)",
            "Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;"
        }
    .end annotation

    .line 29
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p0}, Lcom/ibotta/android/di/ApolloModule_ProvideBonusQualificationMapperFactory;->proxyProvideBonusQualificationMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideBonusQualificationMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;
    .locals 1

    .line 40
    invoke-static {p0}, Lcom/ibotta/android/di/ApolloModule;->provideBonusQualificationMapper(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 39
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/di/ApolloModule_ProvideBonusQualificationMapperFactory;->formattingProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/ApolloModule_ProvideBonusQualificationMapperFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/ApolloModule_ProvideBonusQualificationMapperFactory;->get()Lcom/ibotta/android/graphql/mapper/BonusQualificationMapper;

    move-result-object v0

    return-object v0
.end method
