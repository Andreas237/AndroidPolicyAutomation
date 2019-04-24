.class public Lcom/ibotta/android/tracking/sdk/BreadcrumbLifecycleTracker;
.super Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;
.source "BreadcrumbLifecycleTracker.java"


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field private static final EVENT_TYPE:Ljava/lang/String; = "breadcrumb"


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

.field private final breadcrumbStorage:Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;>;)V"
        }
    .end annotation

    .line 29
    invoke-direct {p0}, Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/tracking/sdk/BreadcrumbLifecycleTracker;->breadcrumbStorage:Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;

    .line 31
    iput-object p2, p0, Lcom/ibotta/android/tracking/sdk/BreadcrumbLifecycleTracker;->activitiesToWatch:Ljava/util/Set;

    return-void
.end method

.method private trackBreadcrumbs()V
    .locals 8

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/tracking/sdk/BreadcrumbLifecycleTracker;->breadcrumbStorage:Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;->getBreadcrumbNames()Ljava/util/Set;

    move-result-object v0

    .line 46
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const-string v0, "No breadcrumbs found to track"

    .line 47
    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 51
    :cond_0
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 53
    :try_start_0
    iget-object v3, p0, Lcom/ibotta/android/tracking/sdk/BreadcrumbLifecycleTracker;->breadcrumbStorage:Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;

    invoke-interface {v3, v1}, Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;->getBreadcrumb(Ljava/lang/String;)Lcom/ibotta/android/state/app/breadcrumb/Breadcrumb;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 56
    sget-object v4, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    const-string v5, "breadcrumb"

    invoke-virtual {v3}, Lcom/ibotta/android/state/app/breadcrumb/Breadcrumb;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Lcom/ibotta/android/state/app/breadcrumb/Breadcrumb;->getExtras()Ljava/util/Map;

    move-result-object v7

    invoke-virtual {v4, v5, v6, v7}, Lcom/ibotta/android/crash/CrashManager;->trackBreadcrumb(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    const-string v4, "Tracked breadcrumb: %1$s"

    const/4 v5, 0x1

    .line 57
    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v3}, Lcom/ibotta/android/state/app/breadcrumb/Breadcrumb;->getName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v5, v2

    invoke-static {v4, v5}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    :cond_1
    iget-object v3, p0, Lcom/ibotta/android/tracking/sdk/BreadcrumbLifecycleTracker;->breadcrumbStorage:Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;

    invoke-interface {v3, v1}, Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;->deleteBreadcrumb(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v2, p0, Lcom/ibotta/android/tracking/sdk/BreadcrumbLifecycleTracker;->breadcrumbStorage:Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;

    invoke-interface {v2, v1}, Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;->deleteBreadcrumb(Ljava/lang/String;)V

    throw v0

    :cond_2
    return-void
.end method


# virtual methods
.method public trackAppCreate(Landroid/support/v4/app/FragmentActivity;)V
    .locals 1

    .line 36
    invoke-super {p0, p1}, Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;->trackAppCreate(Landroid/support/v4/app/FragmentActivity;)V

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/tracking/sdk/BreadcrumbLifecycleTracker;->activitiesToWatch:Ljava/util/Set;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 39
    invoke-direct {p0}, Lcom/ibotta/android/tracking/sdk/BreadcrumbLifecycleTracker;->trackBreadcrumbs()V

    :cond_0
    return-void
.end method
