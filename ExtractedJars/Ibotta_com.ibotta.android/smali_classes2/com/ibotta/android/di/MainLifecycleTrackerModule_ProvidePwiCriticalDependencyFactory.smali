.class public final Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvidePwiCriticalDependencyFactory;
.super Ljava/lang/Object;
.source "MainLifecycleTrackerModule_ProvidePwiCriticalDependencyFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/api/critical/CriticalDependency;",
        ">;"
    }
.end annotation


# instance fields
.field private final appCacheProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;"
        }
    .end annotation
.end field

.field private final authManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;"
        }
    .end annotation
.end field

.field private final graphQLCallFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final pwiRetailersHolderProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;",
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
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvidePwiCriticalDependencyFactory;->appCacheProvider:Ljavax/inject/Provider;

    .line 33
    iput-object p2, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvidePwiCriticalDependencyFactory;->authManagerProvider:Ljavax/inject/Provider;

    .line 34
    iput-object p3, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvidePwiCriticalDependencyFactory;->pwiRetailersHolderProvider:Ljavax/inject/Provider;

    .line 35
    iput-object p4, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvidePwiCriticalDependencyFactory;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvidePwiCriticalDependencyFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;)",
            "Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvidePwiCriticalDependencyFactory;"
        }
    .end annotation

    .line 64
    new-instance v0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvidePwiCriticalDependencyFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvidePwiCriticalDependencyFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/api/critical/CriticalDependency;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;)",
            "Lcom/ibotta/android/api/critical/CriticalDependency;"
        }
    .end annotation

    .line 53
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/appcache/AppCache;

    .line 54
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 55
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;

    .line 56
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 52
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvidePwiCriticalDependencyFactory;->proxyProvidePwiCriticalDependency(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;Lcom/ibotta/android/graphql/GraphQLCallFactory;)Lcom/ibotta/android/api/critical/CriticalDependency;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvidePwiCriticalDependency(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;Lcom/ibotta/android/graphql/GraphQLCallFactory;)Lcom/ibotta/android/api/critical/CriticalDependency;
    .locals 0

    .line 77
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/MainLifecycleTrackerModule;->providePwiCriticalDependency(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;Lcom/ibotta/android/graphql/GraphQLCallFactory;)Lcom/ibotta/android/api/critical/CriticalDependency;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 76
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/api/critical/CriticalDependency;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/api/critical/CriticalDependency;
    .locals 4

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvidePwiCriticalDependencyFactory;->appCacheProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvidePwiCriticalDependencyFactory;->authManagerProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvidePwiCriticalDependencyFactory;->pwiRetailersHolderProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvidePwiCriticalDependencyFactory;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvidePwiCriticalDependencyFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/api/critical/CriticalDependency;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvidePwiCriticalDependencyFactory;->get()Lcom/ibotta/android/api/critical/CriticalDependency;

    move-result-object v0

    return-object v0
.end method
