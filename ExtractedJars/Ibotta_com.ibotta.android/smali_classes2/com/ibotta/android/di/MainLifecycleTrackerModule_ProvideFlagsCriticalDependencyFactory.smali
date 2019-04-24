.class public final Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsCriticalDependencyFactory;
.super Ljava/lang/Object;
.source "MainLifecycleTrackerModule_ProvideFlagsCriticalDependencyFactory.java"

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

.field private final flagsApiProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/FlagsApi;",
            ">;"
        }
    .end annotation
.end field

.field private final flagsUserFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/FlagsUserFactory;",
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
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/FlagsApi;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/FlagsUserFactory;",
            ">;)V"
        }
    .end annotation

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsCriticalDependencyFactory;->appCacheProvider:Ljavax/inject/Provider;

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsCriticalDependencyFactory;->flagsApiProvider:Ljavax/inject/Provider;

    .line 30
    iput-object p3, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsCriticalDependencyFactory;->flagsUserFactoryProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsCriticalDependencyFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/FlagsApi;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/FlagsUserFactory;",
            ">;)",
            "Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsCriticalDependencyFactory;"
        }
    .end annotation

    .line 50
    new-instance v0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsCriticalDependencyFactory;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsCriticalDependencyFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/api/critical/CriticalDependency;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/FlagsApi;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/FlagsUserFactory;",
            ">;)",
            "Lcom/ibotta/android/api/critical/CriticalDependency;"
        }
    .end annotation

    .line 43
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/appcache/AppCache;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/features/FlagsApi;

    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/features/variant/FlagsUserFactory;

    .line 42
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsCriticalDependencyFactory;->proxyProvideFlagsCriticalDependency(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/features/FlagsApi;Lcom/ibotta/android/features/variant/FlagsUserFactory;)Lcom/ibotta/android/api/critical/CriticalDependency;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideFlagsCriticalDependency(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/features/FlagsApi;Lcom/ibotta/android/features/variant/FlagsUserFactory;)Lcom/ibotta/android/api/critical/CriticalDependency;
    .locals 0

    .line 57
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/MainLifecycleTrackerModule;->provideFlagsCriticalDependency(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/features/FlagsApi;Lcom/ibotta/android/features/variant/FlagsUserFactory;)Lcom/ibotta/android/api/critical/CriticalDependency;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 56
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/api/critical/CriticalDependency;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/api/critical/CriticalDependency;
    .locals 3

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsCriticalDependencyFactory;->appCacheProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsCriticalDependencyFactory;->flagsApiProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsCriticalDependencyFactory;->flagsUserFactoryProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsCriticalDependencyFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/api/critical/CriticalDependency;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideFlagsCriticalDependencyFactory;->get()Lcom/ibotta/android/api/critical/CriticalDependency;

    move-result-object v0

    return-object v0
.end method
