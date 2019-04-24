.class public Lcom/usebutton/sdk/internal/core/ApplicationHooks;
.super Ljava/lang/Object;
.source "ApplicationHooks.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/core/ApplicationHooks$OnApplicationEvent;
    }
.end annotation


# static fields
.field private static final ON_BACKGROUND_REPORT_DELAY_MILLIS:J = 0x1f4L

.field private static final TAG:Ljava/lang/String; = "ApplicationHooks"


# instance fields
.field private final backgroundRunnable:Ljava/lang/Runnable;

.field private final mApplication:Landroid/app/Application;

.field final mCallbacks:Landroid/app/Application$ActivityLifecycleCallbacks;
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field

.field private final mEventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

.field private final mFirstLaunch:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final mHandler:Landroid/os/Handler;

.field private mIsInForeground:Z

.field private mLastTopActivity:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private mPublisher:Lcom/usebutton/sdk/internal/util/Publisher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/usebutton/sdk/internal/util/Publisher<",
            "Lcom/usebutton/sdk/internal/core/ApplicationHooks$OnApplicationEvent;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Application;Lcom/usebutton/sdk/internal/events/EventTracker;)V
    .locals 2

    .line 165
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {p0, p1, p2, v0}, Lcom/usebutton/sdk/internal/core/ApplicationHooks;-><init>(Landroid/app/Application;Lcom/usebutton/sdk/internal/events/EventTracker;Landroid/os/Handler;)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;Lcom/usebutton/sdk/internal/events/EventTracker;Landroid/os/Handler;)V
    .locals 2

    .line 168
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->mFirstLaunch:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    .line 63
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->mIsInForeground:Z

    .line 70
    new-instance v0, Lcom/usebutton/sdk/internal/util/Publisher;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/util/Publisher;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->mPublisher:Lcom/usebutton/sdk/internal/util/Publisher;

    .line 75
    new-instance v0, Lcom/usebutton/sdk/internal/core/ApplicationHooks$1;

    invoke-direct {v0, p0}, Lcom/usebutton/sdk/internal/core/ApplicationHooks$1;-><init>(Lcom/usebutton/sdk/internal/core/ApplicationHooks;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->backgroundRunnable:Ljava/lang/Runnable;

    .line 92
    new-instance v0, Lcom/usebutton/sdk/internal/core/ApplicationHooks$2;

    invoke-direct {v0, p0}, Lcom/usebutton/sdk/internal/core/ApplicationHooks$2;-><init>(Lcom/usebutton/sdk/internal/core/ApplicationHooks;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->mCallbacks:Landroid/app/Application$ActivityLifecycleCallbacks;

    .line 169
    iput-object p1, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->mApplication:Landroid/app/Application;

    .line 170
    iput-object p2, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->mEventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    .line 171
    iput-object p3, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->mHandler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/internal/core/ApplicationHooks;)Z
    .locals 0

    .line 28
    iget-boolean p0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->mIsInForeground:Z

    return p0
.end method

.method static synthetic access$002(Lcom/usebutton/sdk/internal/core/ApplicationHooks;Z)Z
    .locals 0

    .line 28
    iput-boolean p1, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->mIsInForeground:Z

    return p1
.end method

.method static synthetic access$100(Lcom/usebutton/sdk/internal/core/ApplicationHooks;)Lcom/usebutton/sdk/internal/events/EventTracker;
    .locals 0

    .line 28
    iget-object p0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->mEventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    return-object p0
.end method

.method static synthetic access$200(Lcom/usebutton/sdk/internal/core/ApplicationHooks;Landroid/content/Intent;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->handleIntent(Landroid/content/Intent;)V

    return-void
.end method

.method static synthetic access$300(Lcom/usebutton/sdk/internal/core/ApplicationHooks;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 28
    iget-object p0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->mLastTopActivity:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method static synthetic access$302(Lcom/usebutton/sdk/internal/core/ApplicationHooks;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->mLastTopActivity:Ljava/lang/ref/WeakReference;

    return-object p1
.end method

.method private handleIntent(Landroid/content/Intent;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 156
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->mPublisher:Lcom/usebutton/sdk/internal/util/Publisher;

    new-instance v1, Lcom/usebutton/sdk/internal/core/ApplicationHooks$3;

    invoke-direct {v1, p0, p1}, Lcom/usebutton/sdk/internal/core/ApplicationHooks$3;-><init>(Lcom/usebutton/sdk/internal/core/ApplicationHooks;Landroid/content/Intent;)V

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/util/Publisher;->perform(Lcom/usebutton/sdk/internal/util/Publisher$Action;)V

    return-void
.end method


# virtual methods
.method public getLastForegroundedActivity()Landroid/app/Activity;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 226
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->mLastTopActivity:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getObservable()Lcom/usebutton/sdk/internal/functional/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/usebutton/sdk/internal/functional/Observable<",
            "Lcom/usebutton/sdk/internal/core/ApplicationHooks$OnApplicationEvent;",
            ">;"
        }
    .end annotation

    .line 215
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->mPublisher:Lcom/usebutton/sdk/internal/util/Publisher;

    return-object v0
.end method

.method declared-synchronized handleBackground()V
    .locals 4

    monitor-enter p0

    :try_start_0
    const-string v0, "ApplicationHooks"

    const-string v1, "Activity backgrounded."

    .line 203
    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->info(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->mIsInForeground:Z

    if-eqz v0, :cond_0

    .line 205
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->backgroundRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 206
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->backgroundRunnable:Ljava/lang/Runnable;

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 208
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized handleForeground()V
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "ApplicationHooks"

    const-string v1, "Activity foregrounded."

    .line 184
    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->info(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->backgroundRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 186
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->mIsInForeground:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 187
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->mIsInForeground:Z

    .line 188
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->mPublisher:Lcom/usebutton/sdk/internal/util/Publisher;

    new-instance v1, Lcom/usebutton/sdk/internal/core/ApplicationHooks$4;

    invoke-direct {v1, p0}, Lcom/usebutton/sdk/internal/core/ApplicationHooks$4;-><init>(Lcom/usebutton/sdk/internal/core/ApplicationHooks;)V

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/util/Publisher;->perform(Lcom/usebutton/sdk/internal/util/Publisher$Action;)V

    .line 194
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->mFirstLaunch:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 195
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->mEventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    const-string v1, "btn:app-launch"

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEvent(Ljava/lang/String;)V

    goto :goto_0

    .line 197
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->mEventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    const-string v1, "btn:app-foreground"

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEvent(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 200
    :cond_1
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized start()V
    .locals 2

    monitor-enter p0

    .line 175
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->mFirstLaunch:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 176
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->mApplication:Landroid/app/Application;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->mCallbacks:Landroid/app/Application$ActivityLifecycleCallbacks;

    invoke-virtual {v0, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 177
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized stop()V
    .locals 2

    monitor-enter p0

    .line 180
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->mApplication:Landroid/app/Application;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->mCallbacks:Landroid/app/Application$ActivityLifecycleCallbacks;

    invoke-virtual {v0, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 181
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
