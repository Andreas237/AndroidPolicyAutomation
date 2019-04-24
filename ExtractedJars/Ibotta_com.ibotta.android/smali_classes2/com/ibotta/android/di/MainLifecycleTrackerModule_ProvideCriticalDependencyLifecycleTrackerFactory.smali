.class public final Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideCriticalDependencyLifecycleTrackerFactory;
.super Ljava/lang/Object;
.source "MainLifecycleTrackerModule_ProvideCriticalDependencyLifecycleTrackerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;",
        ">;"
    }
.end annotation


# instance fields
.field private final aggregateCriticalDependencyProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ">;"
        }
    .end annotation
.end field

.field private final frontDoorActivitiesProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;>;>;"
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
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;>;>;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ">;)V"
        }
    .end annotation

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideCriticalDependencyLifecycleTrackerFactory;->frontDoorActivitiesProvider:Ljavax/inject/Provider;

    .line 26
    iput-object p2, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideCriticalDependencyLifecycleTrackerFactory;->aggregateCriticalDependencyProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideCriticalDependencyLifecycleTrackerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;>;>;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ">;)",
            "Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideCriticalDependencyLifecycleTrackerFactory;"
        }
    .end annotation

    .line 44
    new-instance v0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideCriticalDependencyLifecycleTrackerFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideCriticalDependencyLifecycleTrackerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;>;>;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ">;)",
            "Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;"
        }
    .end annotation

    .line 38
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/api/critical/CriticalDependency;

    .line 37
    invoke-static {p0, p1}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideCriticalDependencyLifecycleTrackerFactory;->proxyProvideCriticalDependencyLifecycleTracker(Ljava/util/Set;Lcom/ibotta/android/api/critical/CriticalDependency;)Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideCriticalDependencyLifecycleTracker(Ljava/util/Set;Lcom/ibotta/android/api/critical/CriticalDependency;)Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;>;",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ")",
            "Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;"
        }
    .end annotation

    .line 52
    invoke-static {p0, p1}, Lcom/ibotta/android/di/MainLifecycleTrackerModule;->provideCriticalDependencyLifecycleTracker(Ljava/util/Set;Lcom/ibotta/android/api/critical/CriticalDependency;)Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 51
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;
    .locals 2

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideCriticalDependencyLifecycleTrackerFactory;->frontDoorActivitiesProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideCriticalDependencyLifecycleTrackerFactory;->aggregateCriticalDependencyProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideCriticalDependencyLifecycleTrackerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideCriticalDependencyLifecycleTrackerFactory;->get()Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;

    move-result-object v0

    return-object v0
.end method
