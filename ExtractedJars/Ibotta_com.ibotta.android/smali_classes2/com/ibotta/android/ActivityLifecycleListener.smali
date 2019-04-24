.class public Lcom/ibotta/android/ActivityLifecycleListener;
.super Ljava/lang/Object;
.source "ActivityLifecycleListener.java"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# static fields
.field private static final DELAY:J

.field private static foreground:Z


# instance fields
.field private activeCounter:Ljava/util/concurrent/atomic/AtomicInteger;

.field private delayedConfirmation:Ljava/lang/Runnable;

.field private existingCounter:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final lifecycleTracker:Lcom/ibotta/android/tracking/sdk/LifecycleTracker;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 19
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x2

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/ibotta/android/ActivityLifecycleListener;->DELAY:J

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/tracking/sdk/LifecycleTracker;)V
    .locals 2

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/ibotta/android/ActivityLifecycleListener;->activeCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 24
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/ibotta/android/ActivityLifecycleListener;->existingCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/ActivityLifecycleListener;->lifecycleTracker:Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/ActivityLifecycleListener;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 18
    iget-object p0, p0, Lcom/ibotta/android/ActivityLifecycleListener;->activeCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method static synthetic access$100()Z
    .locals 1

    .line 18
    sget-boolean v0, Lcom/ibotta/android/ActivityLifecycleListener;->foreground:Z

    return v0
.end method

.method static synthetic access$102(Z)Z
    .locals 0

    .line 18
    sput-boolean p0, Lcom/ibotta/android/ActivityLifecycleListener;->foreground:Z

    return p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/ActivityLifecycleListener;Landroid/app/Activity;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/ibotta/android/ActivityLifecycleListener;->onAppWentBackground(Landroid/app/Activity;)V

    return-void
.end method

.method static synthetic access$302(Lcom/ibotta/android/ActivityLifecycleListener;Ljava/lang/Runnable;)Ljava/lang/Runnable;
    .locals 0

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/ActivityLifecycleListener;->delayedConfirmation:Ljava/lang/Runnable;

    return-object p1
.end method

.method public static isInForeground()Z
    .locals 1

    .line 29
    sget-boolean v0, Lcom/ibotta/android/ActivityLifecycleListener;->foreground:Z

    return v0
.end method

.method private killDelayedConfirmation()V
    .locals 2

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/ActivityLifecycleListener;->delayedConfirmation:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 123
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getHandler()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/ActivityLifecycleListener;->delayedConfirmation:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    .line 124
    iput-object v0, p0, Lcom/ibotta/android/ActivityLifecycleListener;->delayedConfirmation:Ljava/lang/Runnable;

    :cond_0
    return-void
.end method

.method private onAppBecameForeground(Landroid/app/Activity;)V
    .locals 2

    const-string v0, "onAppBecameForeground"

    const/4 v1, 0x0

    .line 129
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    instance-of v0, p1, Landroid/support/v4/app/FragmentActivity;

    if-eqz v0, :cond_0

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/ActivityLifecycleListener;->lifecycleTracker:Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    check-cast p1, Landroid/support/v4/app/FragmentActivity;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;->trackAppBecameForeground(Landroid/support/v4/app/FragmentActivity;)V

    .line 133
    iget-object v0, p0, Lcom/ibotta/android/ActivityLifecycleListener;->lifecycleTracker:Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;->trackOpenReferrer(Landroid/support/v4/app/FragmentActivity;)V

    :cond_0
    return-void
.end method

.method private onAppWentBackground(Landroid/app/Activity;)V
    .locals 2

    const-string v0, "onAppWentBackground"

    const/4 v1, 0x0

    .line 138
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    instance-of v0, p1, Landroid/support/v4/app/FragmentActivity;

    if-eqz v0, :cond_0

    .line 141
    iget-object v0, p0, Lcom/ibotta/android/ActivityLifecycleListener;->lifecycleTracker:Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    check-cast p1, Landroid/support/v4/app/FragmentActivity;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;->trackAppWentBackground(Landroid/support/v4/app/FragmentActivity;)V

    :cond_0
    return-void
.end method

.method private runDelayedConfirmation(Landroid/app/Activity;)V
    .locals 3

    .line 105
    invoke-direct {p0}, Lcom/ibotta/android/ActivityLifecycleListener;->killDelayedConfirmation()V

    .line 107
    new-instance v0, Lcom/ibotta/android/ActivityLifecycleListener$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/ActivityLifecycleListener$1;-><init>(Lcom/ibotta/android/ActivityLifecycleListener;Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/ibotta/android/ActivityLifecycleListener;->delayedConfirmation:Ljava/lang/Runnable;

    .line 118
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/App;->getHandler()Landroid/os/Handler;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/ActivityLifecycleListener;->delayedConfirmation:Ljava/lang/Runnable;

    sget-wide v1, Lcom/ibotta/android/ActivityLifecycleListener;->DELAY:J

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method


# virtual methods
.method public getExistingCount()I
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/ActivityLifecycleListener;->existingCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    return v0
.end method

.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 42
    iget-object p2, p0, Lcom/ibotta/android/ActivityLifecycleListener;->existingCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 44
    instance-of p2, p1, Landroid/support/v4/app/FragmentActivity;

    if-eqz p2, :cond_0

    .line 45
    iget-object p2, p0, Lcom/ibotta/android/ActivityLifecycleListener;->lifecycleTracker:Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    check-cast p1, Landroid/support/v4/app/FragmentActivity;

    invoke-interface {p2, p1}, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;->trackAppCreate(Landroid/support/v4/app/FragmentActivity;)V

    :cond_0
    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    .line 101
    iget-object p1, p0, Lcom/ibotta/android/ActivityLifecycleListener;->existingCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    .line 75
    instance-of v0, p1, Landroid/support/v4/app/FragmentActivity;

    if-eqz v0, :cond_0

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/ActivityLifecycleListener;->lifecycleTracker:Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    check-cast p1, Landroid/support/v4/app/FragmentActivity;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;->trackAppPause(Landroid/support/v4/app/FragmentActivity;)V

    :cond_0
    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 1

    .line 67
    instance-of v0, p1, Landroid/support/v4/app/FragmentActivity;

    if-eqz v0, :cond_0

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/ActivityLifecycleListener;->lifecycleTracker:Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    check-cast p1, Landroid/support/v4/app/FragmentActivity;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;->trackAppResume(Landroid/support/v4/app/FragmentActivity;)V

    :cond_0
    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/ActivityLifecycleListener;->activeCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 53
    invoke-direct {p0}, Lcom/ibotta/android/ActivityLifecycleListener;->killDelayedConfirmation()V

    .line 55
    sget-boolean v0, Lcom/ibotta/android/ActivityLifecycleListener;->foreground:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 56
    sput-boolean v0, Lcom/ibotta/android/ActivityLifecycleListener;->foreground:Z

    .line 57
    invoke-direct {p0, p1}, Lcom/ibotta/android/ActivityLifecycleListener;->onAppBecameForeground(Landroid/app/Activity;)V

    .line 60
    :cond_0
    instance-of v0, p1, Landroid/support/v4/app/FragmentActivity;

    if-eqz v0, :cond_1

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/ActivityLifecycleListener;->lifecycleTracker:Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    check-cast p1, Landroid/support/v4/app/FragmentActivity;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;->trackAppStart(Landroid/support/v4/app/FragmentActivity;)V

    :cond_1
    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 2

    .line 83
    instance-of v0, p1, Landroid/support/v4/app/FragmentActivity;

    if-eqz v0, :cond_0

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/ActivityLifecycleListener;->lifecycleTracker:Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    move-object v1, p1

    check-cast v1, Landroid/support/v4/app/FragmentActivity;

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;->trackAppStop(Landroid/support/v4/app/FragmentActivity;)V

    .line 87
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/ActivityLifecycleListener;->activeCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-gtz v0, :cond_1

    .line 91
    invoke-direct {p0, p1}, Lcom/ibotta/android/ActivityLifecycleListener;->runDelayedConfirmation(Landroid/app/Activity;)V

    :cond_1
    return-void
.end method
