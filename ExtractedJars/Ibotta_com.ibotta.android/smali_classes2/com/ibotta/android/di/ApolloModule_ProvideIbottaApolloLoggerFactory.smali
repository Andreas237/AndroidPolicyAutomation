.class public final Lcom/ibotta/android/di/ApolloModule_ProvideIbottaApolloLoggerFactory;
.super Ljava/lang/Object;
.source "ApolloModule_ProvideIbottaApolloLoggerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/graphql/logger/IbottaApolloLogger;",
        ">;"
    }
.end annotation


# instance fields
.field private final buildProfileProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
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
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/di/ApolloModule_ProvideIbottaApolloLoggerFactory;->buildProfileProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideIbottaApolloLoggerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;)",
            "Lcom/ibotta/android/di/ApolloModule_ProvideIbottaApolloLoggerFactory;"
        }
    .end annotation

    .line 34
    new-instance v0, Lcom/ibotta/android/di/ApolloModule_ProvideIbottaApolloLoggerFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/ApolloModule_ProvideIbottaApolloLoggerFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/graphql/logger/IbottaApolloLogger;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;)",
            "Lcom/ibotta/android/graphql/logger/IbottaApolloLogger;"
        }
    .end annotation

    .line 29
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/profile/BuildProfile;

    invoke-static {p0}, Lcom/ibotta/android/di/ApolloModule_ProvideIbottaApolloLoggerFactory;->proxyProvideIbottaApolloLogger(Lcom/ibotta/android/profile/BuildProfile;)Lcom/ibotta/android/graphql/logger/IbottaApolloLogger;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideIbottaApolloLogger(Lcom/ibotta/android/profile/BuildProfile;)Lcom/ibotta/android/graphql/logger/IbottaApolloLogger;
    .locals 1

    .line 39
    invoke-static {p0}, Lcom/ibotta/android/di/ApolloModule;->provideIbottaApolloLogger(Lcom/ibotta/android/profile/BuildProfile;)Lcom/ibotta/android/graphql/logger/IbottaApolloLogger;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 38
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/graphql/logger/IbottaApolloLogger;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/graphql/logger/IbottaApolloLogger;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/di/ApolloModule_ProvideIbottaApolloLoggerFactory;->buildProfileProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/ApolloModule_ProvideIbottaApolloLoggerFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/graphql/logger/IbottaApolloLogger;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/ApolloModule_ProvideIbottaApolloLoggerFactory;->get()Lcom/ibotta/android/graphql/logger/IbottaApolloLogger;

    move-result-object v0

    return-object v0
.end method
