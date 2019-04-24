.class public Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;
.super Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;
.source "CriticalDependencyLifecycleTracker.java"


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# instance fields
.field private final activitiesToWatch:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;>;"
        }
    .end annotation
.end field

.field private final criticalDependency:Lcom/ibotta/android/api/critical/CriticalDependency;

.field private isColdStart:Z


# direct methods
.method public constructor <init>(Ljava/util/Set;Lcom/ibotta/android/api/critical/CriticalDependency;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;>;",
            "Lcom/ibotta/android/api/critical/CriticalDependency;",
            ")V"
        }
    .end annotation

    .line 30
    invoke-direct {p0}, Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;-><init>()V

    const/4 v0, 0x1

    .line 27
    iput-boolean v0, p0, Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;->isColdStart:Z

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;->activitiesToWatch:Ljava/util/Set;

    .line 32
    iput-object p2, p0, Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;->criticalDependency:Lcom/ibotta/android/api/critical/CriticalDependency;

    return-void
.end method


# virtual methods
.method public trackAppCreate(Landroid/support/v4/app/FragmentActivity;)V
    .locals 5

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;->activitiesToWatch:Ljava/util/Set;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "trackAppCreate: activity=%1$s, isColdStart=%2$b, isInWatchSet=%3$b"

    const/4 v2, 0x3

    .line 39
    new-array v2, v2, [Ljava/lang/Object;

    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    iget-boolean p1, p0, Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;->isColdStart:Z

    .line 42
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v4, 0x1

    aput-object p1, v2, v4

    .line 43
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v4, 0x2

    aput-object p1, v2, v4

    .line 39
    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    iget-object p1, p0, Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;->criticalDependency:Lcom/ibotta/android/api/critical/CriticalDependency;

    iget-boolean v1, p0, Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;->isColdStart:Z

    invoke-interface {p1, v1, v0}, Lcom/ibotta/android/api/critical/CriticalDependency;->onAppLaunched(ZZ)V

    .line 47
    iput-boolean v3, p0, Lcom/ibotta/android/tracking/sdk/CriticalDependencyLifecycleTracker;->isColdStart:Z

    return-void
.end method
