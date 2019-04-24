.class public Lcom/ibotta/android/receiver/work/ScheduledWorkManager;
.super Ljava/lang/Object;
.source "ScheduledWorkManager.java"


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final context:Landroid/content/Context;

.field private final prefs:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Landroid/content/Context;Landroid/content/SharedPreferences;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 28
    iput-object p2, p0, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;->context:Landroid/content/Context;

    .line 29
    iput-object p3, p0, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;->prefs:Landroid/content/SharedPreferences;

    return-void
.end method

.method private isExpired(Ljava/lang/String;)Z
    .locals 5

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    .line 114
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;->prefs:Landroid/content/SharedPreferences;

    const-wide/16 v2, 0x0

    invoke-interface {v1, p1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v1

    .line 115
    iget-object p1, p0, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {p1}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v3

    cmp-long p1, v1, v3

    if-gez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private newIntent(Lcom/ibotta/android/receiver/work/ScheduledWork;)Landroid/content/Intent;
    .locals 4

    .line 86
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/receiver/work/ScheduledWorkReceiver;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 87
    invoke-virtual {p1}, Lcom/ibotta/android/receiver/work/ScheduledWork;->getWorkId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "work_id"

    .line 88
    invoke-virtual {p1}, Lcom/ibotta/android/receiver/work/ScheduledWork;->getWorkId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "work"

    .line 89
    invoke-virtual {p1}, Lcom/ibotta/android/receiver/work/ScheduledWork;->getWork()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    const-string v1, "event_time"

    .line 90
    invoke-virtual {p1}, Lcom/ibotta/android/receiver/work/ScheduledWork;->getEventTime()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    return-object v0
.end method

.method private setCancelled(Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 107
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method private setScheduled(Ljava/lang/String;J)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 99
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method


# virtual methods
.method public cancelAlarms(Lcom/ibotta/android/receiver/work/ScheduledWork;)V
    .locals 5

    const-string v0, "cancelAlarms"

    const/4 v1, 0x0

    .line 49
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;->context:Landroid/content/Context;

    const-string v2, "alarm"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    if-eqz v0, :cond_1

    .line 52
    iget-object v2, p0, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;->context:Landroid/content/Context;

    .line 53
    invoke-direct {p0, p1}, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;->newIntent(Lcom/ibotta/android/receiver/work/ScheduledWork;)Landroid/content/Intent;

    move-result-object v3

    const/high16 v4, 0x20000000

    .line 52
    invoke-static {v2, v1, v3, v4}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v3, "Found and cancelling"

    .line 55
    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    invoke-virtual {v0, v2}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 57
    invoke-virtual {v2}, Landroid/app/PendingIntent;->cancel()V

    .line 59
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/receiver/work/ScheduledWork;->getWorkId()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;->setCancelled(Ljava/lang/String;)V

    :cond_1
    const-string v0, "isScheduled after cancel: %1$b"

    const/4 v2, 0x1

    .line 62
    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;->isScheduled(Lcom/ibotta/android/receiver/work/ScheduledWork;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    aput-object p1, v2, v1

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public isScheduled(Lcom/ibotta/android/receiver/work/ScheduledWork;)Z
    .locals 4

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;->context:Landroid/content/Context;

    .line 68
    invoke-direct {p0, p1}, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;->newIntent(Lcom/ibotta/android/receiver/work/ScheduledWork;)Landroid/content/Intent;

    move-result-object v1

    const/4 v2, 0x0

    const/high16 v3, 0x20000000

    .line 67
    invoke-static {v0, v2, v1, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 70
    invoke-virtual {p1}, Lcom/ibotta/android/receiver/work/ScheduledWork;->getWorkId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;->isExpired(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 v2, 0x1

    :cond_0
    return v2
.end method

.method public newPendingIntent(Lcom/ibotta/android/receiver/work/ScheduledWork;)Landroid/app/PendingIntent;
    .locals 3

    .line 78
    iget-object v0, p0, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;->context:Landroid/content/Context;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/4 v1, 0x0

    .line 82
    invoke-direct {p0, p1}, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;->newIntent(Lcom/ibotta/android/receiver/work/ScheduledWork;)Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {p1}, Lcom/ibotta/android/receiver/work/ScheduledWork;->getFlags()I

    move-result p1

    invoke-static {v0, v1, v2, p1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method public scheduleAlarm(Lcom/ibotta/android/receiver/work/ScheduledWork;)V
    .locals 8

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "ScheduledWork is null, nothing to schedule."

    .line 34
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 38
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;->context:Landroid/content/Context;

    const-string v2, "alarm"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/AlarmManager;

    if-eqz v1, :cond_1

    .line 40
    invoke-virtual {p0, p1}, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;->newPendingIntent(Lcom/ibotta/android/receiver/work/ScheduledWork;)Landroid/app/PendingIntent;

    move-result-object v2

    .line 41
    invoke-virtual {p1}, Lcom/ibotta/android/receiver/work/ScheduledWork;->getEventTime()J

    move-result-wide v3

    const-string v5, "Scheduled work alarm set for: %1$s"

    const/4 v6, 0x1

    .line 42
    new-array v6, v6, [Ljava/lang/Object;

    new-instance v7, Ljava/util/Date;

    invoke-direct {v7, v3, v4}, Ljava/util/Date;-><init>(J)V

    aput-object v7, v6, v0

    invoke-static {v5, v6}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    invoke-virtual {v1, v0, v3, v4, v2}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    .line 44
    invoke-virtual {p1}, Lcom/ibotta/android/receiver/work/ScheduledWork;->getWorkId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, v3, v4}, Lcom/ibotta/android/receiver/work/ScheduledWorkManager;->setScheduled(Ljava/lang/String;J)V

    :cond_1
    return-void
.end method
