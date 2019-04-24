.class public final Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideAggregateCriticalDependencyFactory;
.super Ljava/lang/Object;
.source "MainLifecycleTrackerModule_ProvideAggregateCriticalDependencyFactory.java"

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

.field private final appConfigCriticalDependencyProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ">;"
        }
    .end annotation
.end field

.field private final flagsCriticalDependencyProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ">;"
        }
    .end annotation
.end field

.field private final mvtCriticalDependencyProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ">;"
        }
    .end annotation
.end field

.field private final pwiCriticalDependencyProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ">;)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideAggregateCriticalDependencyFactory;->appCacheProvider:Ljavax/inject/Provider;

    .line 33
    iput-object p2, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideAggregateCriticalDependencyFactory;->mvtCriticalDependencyProvider:Ljavax/inject/Provider;

    .line 34
    iput-object p3, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideAggregateCriticalDependencyFactory;->appConfigCriticalDependencyProvider:Ljavax/inject/Provider;

    .line 35
    iput-object p4, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideAggregateCriticalDependencyFactory;->pwiCriticalDependencyProvider:Ljavax/inject/Provider;

    .line 36
    iput-object p5, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideAggregateCriticalDependencyFactory;->flagsCriticalDependencyProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideAggregateCriticalDependencyFactory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ">;)",
            "Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideAggregateCriticalDependencyFactory;"
        }
    .end annotation

    .line 69
    new-instance v6, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideAggregateCriticalDependencyFactory;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideAggregateCriticalDependencyFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v6
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/api/critical/CriticalDependency;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ">;)",
            "Lcom/ibotta/android/api/critical/CriticalDependency;"
        }
    .end annotation

    .line 56
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/appcache/AppCache;

    .line 57
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/api/critical/CriticalDependency;

    .line 58
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/api/critical/CriticalDependency;

    .line 59
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ibotta/android/api/critical/CriticalDependency;

    .line 60
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/ibotta/android/api/critical/CriticalDependency;

    .line 55
    invoke-static {p0, p1, p2, p3, p4}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideAggregateCriticalDependencyFactory;->proxyProvideAggregateCriticalDependency(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/api/critical/CriticalDependency;Lcom/ibotta/android/api/critical/CriticalDependency;Lcom/ibotta/android/api/critical/CriticalDependency;Lcom/ibotta/android/api/critical/CriticalDependency;)Lcom/ibotta/android/api/critical/CriticalDependency;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideAggregateCriticalDependency(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/api/critical/CriticalDependency;Lcom/ibotta/android/api/critical/CriticalDependency;Lcom/ibotta/android/api/critical/CriticalDependency;Lcom/ibotta/android/api/critical/CriticalDependency;)Lcom/ibotta/android/api/critical/CriticalDependency;
    .locals 0

    .line 84
    invoke-static {p0, p1, p2, p3, p4}, Lcom/ibotta/android/di/MainLifecycleTrackerModule;->provideAggregateCriticalDependency(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/api/critical/CriticalDependency;Lcom/ibotta/android/api/critical/CriticalDependency;Lcom/ibotta/android/api/critical/CriticalDependency;Lcom/ibotta/android/api/critical/CriticalDependency;)Lcom/ibotta/android/api/critical/CriticalDependency;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 83
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/api/critical/CriticalDependency;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/api/critical/CriticalDependency;
    .locals 5

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideAggregateCriticalDependencyFactory;->appCacheProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideAggregateCriticalDependencyFactory;->mvtCriticalDependencyProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideAggregateCriticalDependencyFactory;->appConfigCriticalDependencyProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideAggregateCriticalDependencyFactory;->pwiCriticalDependencyProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideAggregateCriticalDependencyFactory;->flagsCriticalDependencyProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideAggregateCriticalDependencyFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/api/critical/CriticalDependency;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideAggregateCriticalDependencyFactory;->get()Lcom/ibotta/android/api/critical/CriticalDependency;

    move-result-object v0

    return-object v0
.end method
