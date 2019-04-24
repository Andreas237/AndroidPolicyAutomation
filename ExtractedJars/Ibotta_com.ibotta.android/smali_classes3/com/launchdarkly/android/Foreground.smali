.class Lcom/launchdarkly/android/Foreground;
.super Ljava/lang/Object;
.source "Foreground.java"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/launchdarkly/android/Foreground$Listener;
    }
.end annotation


# static fields
.field static final CHECK_DELAY:J = 0x1f4L

.field private static instance:Lcom/launchdarkly/android/Foreground;


# instance fields
.field private check:Ljava/lang/Runnable;

.field private foreground:Z

.field private handler:Landroid/os/Handler;

.field private listeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/launchdarkly/android/Foreground$Listener;",
            ">;"
        }
    .end annotation
.end field

.field private paused:Z


# direct methods
.method constructor <init>()V
    .locals 2

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 63
    iput-boolean v0, p0, Lcom/launchdarkly/android/Foreground;->foreground:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/launchdarkly/android/Foreground;->paused:Z

    .line 64
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/launchdarkly/android/Foreground;->handler:Landroid/os/Handler;

    .line 65
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/launchdarkly/android/Foreground;->listeners:Ljava/util/List;

    return-void
.end method

.method static synthetic access$000(Lcom/launchdarkly/android/Foreground;)Z
    .locals 0

    .line 49
    iget-boolean p0, p0, Lcom/launchdarkly/android/Foreground;->foreground:Z

    return p0
.end method

.method static synthetic access$002(Lcom/launchdarkly/android/Foreground;Z)Z
    .locals 0

    .line 49
    iput-boolean p1, p0, Lcom/launchdarkly/android/Foreground;->foreground:Z

    return p1
.end method

.method static synthetic access$100(Lcom/launchdarkly/android/Foreground;)Z
    .locals 0

    .line 49
    iget-boolean p0, p0, Lcom/launchdarkly/android/Foreground;->paused:Z

    return p0
.end method

.method static synthetic access$200(Lcom/launchdarkly/android/Foreground;)Ljava/util/List;
    .locals 0

    .line 49
    iget-object p0, p0, Lcom/launchdarkly/android/Foreground;->listeners:Ljava/util/List;

    return-object p0
.end method

.method static get()Lcom/launchdarkly/android/Foreground;
    .locals 2

    .line 106
    sget-object v0, Lcom/launchdarkly/android/Foreground;->instance:Lcom/launchdarkly/android/Foreground;

    if-eqz v0, :cond_0

    return-object v0

    .line 107
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Foreground is not initialised - invoke at least once with parameterised init/get"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static get(Landroid/app/Application;)Lcom/launchdarkly/android/Foreground;
    .locals 1

    .line 86
    sget-object v0, Lcom/launchdarkly/android/Foreground;->instance:Lcom/launchdarkly/android/Foreground;

    if-nez v0, :cond_0

    .line 87
    invoke-static {p0}, Lcom/launchdarkly/android/Foreground;->init(Landroid/app/Application;)Lcom/launchdarkly/android/Foreground;

    .line 89
    :cond_0
    sget-object p0, Lcom/launchdarkly/android/Foreground;->instance:Lcom/launchdarkly/android/Foreground;

    return-object p0
.end method

.method static get(Landroid/content/Context;)Lcom/launchdarkly/android/Foreground;
    .locals 1

    .line 93
    sget-object v0, Lcom/launchdarkly/android/Foreground;->instance:Lcom/launchdarkly/android/Foreground;

    if-nez v0, :cond_1

    .line 94
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 95
    instance-of v0, p0, Landroid/app/Application;

    if-eqz v0, :cond_0

    .line 96
    check-cast p0, Landroid/app/Application;

    invoke-static {p0}, Lcom/launchdarkly/android/Foreground;->init(Landroid/app/Application;)Lcom/launchdarkly/android/Foreground;

    .line 98
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Foreground is not initialised and cannot obtain the Application object"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-object v0
.end method

.method static init(Landroid/app/Application;)Lcom/launchdarkly/android/Foreground;
    .locals 1

    .line 78
    sget-object v0, Lcom/launchdarkly/android/Foreground;->instance:Lcom/launchdarkly/android/Foreground;

    if-nez v0, :cond_0

    .line 79
    new-instance v0, Lcom/launchdarkly/android/Foreground;

    invoke-direct {v0}, Lcom/launchdarkly/android/Foreground;-><init>()V

    sput-object v0, Lcom/launchdarkly/android/Foreground;->instance:Lcom/launchdarkly/android/Foreground;

    .line 80
    sget-object v0, Lcom/launchdarkly/android/Foreground;->instance:Lcom/launchdarkly/android/Foreground;

    invoke-virtual {p0, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 82
    :cond_0
    sget-object p0, Lcom/launchdarkly/android/Foreground;->instance:Lcom/launchdarkly/android/Foreground;

    return-object p0
.end method


# virtual methods
.method addListener(Lcom/launchdarkly/android/Foreground$Listener;)V
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/launchdarkly/android/Foreground;->listeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method isBackground()Z
    .locals 1

    .line 119
    iget-boolean v0, p0, Lcom/launchdarkly/android/Foreground;->foreground:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method isForeground()Z
    .locals 1

    .line 115
    iget-boolean v0, p0, Lcom/launchdarkly/android/Foreground;->foreground:Z

    return v0
.end method

.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 3

    const/4 p1, 0x1

    .line 155
    iput-boolean p1, p0, Lcom/launchdarkly/android/Foreground;->paused:Z

    .line 157
    iget-object p1, p0, Lcom/launchdarkly/android/Foreground;->check:Ljava/lang/Runnable;

    if-eqz p1, :cond_0

    .line 158
    iget-object v0, p0, Lcom/launchdarkly/android/Foreground;->handler:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 160
    :cond_0
    iget-object p1, p0, Lcom/launchdarkly/android/Foreground;->handler:Landroid/os/Handler;

    new-instance v0, Lcom/launchdarkly/android/Foreground$1;

    invoke-direct {v0, p0}, Lcom/launchdarkly/android/Foreground$1;-><init>(Lcom/launchdarkly/android/Foreground;)V

    iput-object v0, p0, Lcom/launchdarkly/android/Foreground;->check:Ljava/lang/Runnable;

    const-wide/16 v1, 0x1f4

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 4

    const/4 p1, 0x0

    .line 132
    iput-boolean p1, p0, Lcom/launchdarkly/android/Foreground;->paused:Z

    .line 133
    iget-boolean v0, p0, Lcom/launchdarkly/android/Foreground;->foreground:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    .line 134
    iput-boolean v1, p0, Lcom/launchdarkly/android/Foreground;->foreground:Z

    .line 136
    iget-object v1, p0, Lcom/launchdarkly/android/Foreground;->check:Ljava/lang/Runnable;

    if-eqz v1, :cond_0

    .line 137
    iget-object v2, p0, Lcom/launchdarkly/android/Foreground;->handler:Landroid/os/Handler;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    if-eqz v0, :cond_1

    const-string v0, "went foreground"

    .line 140
    new-array v1, p1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    iget-object v0, p0, Lcom/launchdarkly/android/Foreground;->listeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/launchdarkly/android/Foreground$Listener;

    .line 143
    :try_start_0
    invoke-interface {v1}, Lcom/launchdarkly/android/Foreground$Listener;->onBecameForeground()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Listener threw exception!"

    .line 145
    new-array v3, p1, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const-string v0, "still foreground"

    .line 149
    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {v0, p1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method removeListener(Lcom/launchdarkly/android/Foreground$Listener;)V
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/launchdarkly/android/Foreground;->listeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method
