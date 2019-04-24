.class public Lcom/shopkick/app/application/AppActivityManager;
.super Ljava/lang/Object;
.source "AppActivityManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/application/AppActivityManager$SessionStartDelayRunnable;
    }
.end annotation


# static fields
.field public static final APP_BACKGROUNDED_EVENT:Ljava/lang/String; = "AppActivityManagerAppBackgroundedEvent"

.field public static final APP_FOREGROUNDED_EVENT:Ljava/lang/String; = "AppActivityManagerAppForegroundedEvent"

.field private static final MILLIS_TO_DELAY_BACKGROUNDED_NOTIFICATION:J = 0x3e8L

.field private static final SECS_TO_DELAY_FOR_APP_SESSION_START_DELAY:J = 0xaL

.field public static final SESSION_END_EVENT:Ljava/lang/String; = "AppActivityManagerSessionEndEvent"

.field public static final SESSION_START_DELAYED_EVENT:Ljava/lang/String; = "AppActivityManagerSessionStartDelayedEvent"

.field public static final SESSION_START_EVENT:Ljava/lang/String; = "AppActivityManagerSessionStartEvent"


# instance fields
.field private final allAppActivitiesPausedDelayedRunner:Ljava/lang/Runnable;

.field private currentActivityRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/activities/BaseActivity;",
            ">;"
        }
    .end annotation
.end field

.field mIsBackgrounded:Z

.field private mNumActiveAppActivities:I

.field private mTimerHandler:Landroid/os/Handler;

.field notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private final sessionStartDelayRunnable:Lcom/shopkick/app/application/AppActivityManager$SessionStartDelayRunnable;

.field private shouldIgnoreSessionStartEvent:Z


# direct methods
.method public constructor <init>(Lcom/shopkick/app/util/NotificationCenter;)V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Lcom/shopkick/app/application/AppActivityManager$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/application/AppActivityManager$1;-><init>(Lcom/shopkick/app/application/AppActivityManager;)V

    iput-object v0, p0, Lcom/shopkick/app/application/AppActivityManager;->allAppActivitiesPausedDelayedRunner:Ljava/lang/Runnable;

    .line 42
    new-instance v0, Lcom/shopkick/app/application/AppActivityManager$SessionStartDelayRunnable;

    invoke-direct {v0, p0}, Lcom/shopkick/app/application/AppActivityManager$SessionStartDelayRunnable;-><init>(Lcom/shopkick/app/application/AppActivityManager;)V

    iput-object v0, p0, Lcom/shopkick/app/application/AppActivityManager;->sessionStartDelayRunnable:Lcom/shopkick/app/application/AppActivityManager$SessionStartDelayRunnable;

    .line 45
    iput-object p1, p0, Lcom/shopkick/app/application/AppActivityManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const/4 p1, 0x1

    .line 46
    iput-boolean p1, p0, Lcom/shopkick/app/application/AppActivityManager;->mIsBackgrounded:Z

    .line 47
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/application/AppActivityManager;->mTimerHandler:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public cancelIgnoreAppBackground()V
    .locals 1

    const/4 v0, 0x0

    .line 112
    iput-boolean v0, p0, Lcom/shopkick/app/application/AppActivityManager;->shouldIgnoreSessionStartEvent:Z

    return-void
.end method

.method public getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/shopkick/app/application/AppActivityManager;->currentActivityRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 52
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/activities/BaseActivity;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public ignoreAppBackground()V
    .locals 1

    const/4 v0, 0x1

    .line 108
    iput-boolean v0, p0, Lcom/shopkick/app/application/AppActivityManager;->shouldIgnoreSessionStartEvent:Z

    return-void
.end method

.method public isAppBackgrounded()Z
    .locals 1

    .line 104
    iget-boolean v0, p0, Lcom/shopkick/app/application/AppActivityManager;->mIsBackgrounded:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/application/AppActivityManager;->currentActivityRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public notifyAppActivityPaused(Lcom/shopkick/app/activities/BaseActivity;)V
    .locals 0

    const/4 p1, 0x0

    .line 89
    iput-object p1, p0, Lcom/shopkick/app/application/AppActivityManager;->currentActivityRef:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public notifyAppActivityResumed(Lcom/shopkick/app/activities/BaseActivity;)V
    .locals 1

    .line 58
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/application/AppActivityManager;->currentActivityRef:Ljava/lang/ref/WeakReference;

    .line 59
    iget-object p1, p0, Lcom/shopkick/app/application/AppActivityManager;->mTimerHandler:Landroid/os/Handler;

    iget-object v0, p0, Lcom/shopkick/app/application/AppActivityManager;->allAppActivitiesPausedDelayedRunner:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 60
    iget-object p1, p0, Lcom/shopkick/app/application/AppActivityManager;->mTimerHandler:Landroid/os/Handler;

    iget-object v0, p0, Lcom/shopkick/app/application/AppActivityManager;->sessionStartDelayRunnable:Lcom/shopkick/app/application/AppActivityManager$SessionStartDelayRunnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public notifyAppActivityStarted(Lcom/shopkick/app/activities/BaseActivity;)V
    .locals 5

    .line 72
    iget-boolean p1, p0, Lcom/shopkick/app/application/AppActivityManager;->mIsBackgrounded:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 73
    iput-boolean v0, p0, Lcom/shopkick/app/application/AppActivityManager;->mIsBackgrounded:Z

    .line 74
    iget-object p1, p0, Lcom/shopkick/app/application/AppActivityManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "AppActivityManagerAppForegroundedEvent"

    invoke-virtual {p1, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 75
    iget-boolean p1, p0, Lcom/shopkick/app/application/AppActivityManager;->shouldIgnoreSessionStartEvent:Z

    if-nez p1, :cond_0

    .line 76
    iget-object p1, p0, Lcom/shopkick/app/application/AppActivityManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "AppActivityManagerSessionStartEvent"

    invoke-virtual {p1, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 77
    iget-object p1, p0, Lcom/shopkick/app/application/AppActivityManager;->sessionStartDelayRunnable:Lcom/shopkick/app/application/AppActivityManager$SessionStartDelayRunnable;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/AppActivityManager$SessionStartDelayRunnable;->setKillSwitch(Z)V

    .line 78
    iget-object p1, p0, Lcom/shopkick/app/application/AppActivityManager;->mTimerHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/shopkick/app/application/AppActivityManager;->sessionStartDelayRunnable:Lcom/shopkick/app/application/AppActivityManager$SessionStartDelayRunnable;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0xa

    .line 79
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    .line 78
    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 83
    :cond_0
    iput-boolean v0, p0, Lcom/shopkick/app/application/AppActivityManager;->shouldIgnoreSessionStartEvent:Z

    .line 85
    iget p1, p0, Lcom/shopkick/app/application/AppActivityManager;->mNumActiveAppActivities:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/shopkick/app/application/AppActivityManager;->mNumActiveAppActivities:I

    return-void
.end method

.method public notifyAppActivityStopped(Lcom/shopkick/app/activities/BaseActivity;)V
    .locals 3

    .line 64
    iget p1, p0, Lcom/shopkick/app/application/AppActivityManager;->mNumActiveAppActivities:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/shopkick/app/application/AppActivityManager;->mNumActiveAppActivities:I

    .line 65
    iget p1, p0, Lcom/shopkick/app/application/AppActivityManager;->mNumActiveAppActivities:I

    if-gtz p1, :cond_0

    const/4 p1, 0x0

    .line 66
    iput p1, p0, Lcom/shopkick/app/application/AppActivityManager;->mNumActiveAppActivities:I

    .line 67
    iget-object p1, p0, Lcom/shopkick/app/application/AppActivityManager;->mTimerHandler:Landroid/os/Handler;

    iget-object v0, p0, Lcom/shopkick/app/application/AppActivityManager;->allAppActivitiesPausedDelayedRunner:Ljava/lang/Runnable;

    const-wide/16 v1, 0x3e8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public onAllAppActivitiesPaused()V
    .locals 3

    const/4 v0, 0x1

    .line 93
    iput-boolean v0, p0, Lcom/shopkick/app/application/AppActivityManager;->mIsBackgrounded:Z

    .line 94
    iget-object v1, p0, Lcom/shopkick/app/application/AppActivityManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "AppActivityManagerAppBackgroundedEvent"

    invoke-virtual {v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 95
    iget-boolean v1, p0, Lcom/shopkick/app/application/AppActivityManager;->shouldIgnoreSessionStartEvent:Z

    if-nez v1, :cond_0

    .line 96
    iget-object v1, p0, Lcom/shopkick/app/application/AppActivityManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "AppActivityManagerSessionEndEvent"

    invoke-virtual {v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 97
    iget-object v1, p0, Lcom/shopkick/app/application/AppActivityManager;->sessionStartDelayRunnable:Lcom/shopkick/app/application/AppActivityManager$SessionStartDelayRunnable;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/AppActivityManager$SessionStartDelayRunnable;->setKillSwitch(Z)V

    .line 98
    iget-object v0, p0, Lcom/shopkick/app/application/AppActivityManager;->mTimerHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/shopkick/app/application/AppActivityManager;->sessionStartDelayRunnable:Lcom/shopkick/app/application/AppActivityManager$SessionStartDelayRunnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
