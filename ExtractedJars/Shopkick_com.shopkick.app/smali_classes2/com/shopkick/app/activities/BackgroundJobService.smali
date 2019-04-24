.class public Lcom/shopkick/app/activities/BackgroundJobService;
.super Lcom/firebase/jobdispatcher/JobService;
.source "BackgroundJobService.java"


# static fields
.field public static final JOB_TAG:Ljava/lang/String; = "shopkick_backgroundservice"

.field public static SERVICE_START_SOURCE_KEY:Ljava/lang/String; = "serviceStartSource"


# instance fields
.field private context:Landroid/content/Context;

.field private logger:Lcom/shopkick/app/application/SKLogger;

.field private started:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 29
    invoke-direct {p0}, Lcom/firebase/jobdispatcher/JobService;-><init>()V

    const/4 v0, 0x0

    .line 26
    iput-boolean v0, p0, Lcom/shopkick/app/activities/BackgroundJobService;->started:Z

    return-void
.end method

.method public static startWork(Landroid/content/Context;I)V
    .locals 3

    .line 41
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 42
    new-instance v1, Lcom/firebase/jobdispatcher/FirebaseJobDispatcher;

    new-instance v2, Lcom/firebase/jobdispatcher/GooglePlayDriver;

    invoke-direct {v2, p0}, Lcom/firebase/jobdispatcher/GooglePlayDriver;-><init>(Landroid/content/Context;)V

    invoke-direct {v1, v2}, Lcom/firebase/jobdispatcher/FirebaseJobDispatcher;-><init>(Lcom/firebase/jobdispatcher/Driver;)V

    .line 43
    sget-object p0, Lcom/shopkick/app/activities/BackgroundService;->SERVICE_START_SOURCE_KEY:Ljava/lang/String;

    invoke-virtual {v0, p0, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 44
    invoke-virtual {v1}, Lcom/firebase/jobdispatcher/FirebaseJobDispatcher;->newJobBuilder()Lcom/firebase/jobdispatcher/Job$Builder;

    move-result-object p0

    const-class p1, Lcom/shopkick/app/activities/BackgroundJobService;

    .line 45
    invoke-virtual {p0, p1}, Lcom/firebase/jobdispatcher/Job$Builder;->setService(Ljava/lang/Class;)Lcom/firebase/jobdispatcher/Job$Builder;

    move-result-object p0

    const-string/jumbo p1, "shopkick_backgroundservice"

    .line 46
    invoke-virtual {p0, p1}, Lcom/firebase/jobdispatcher/Job$Builder;->setTag(Ljava/lang/String;)Lcom/firebase/jobdispatcher/Job$Builder;

    move-result-object p0

    const/4 p1, 0x0

    .line 47
    invoke-virtual {p0, p1}, Lcom/firebase/jobdispatcher/Job$Builder;->setRecurring(Z)Lcom/firebase/jobdispatcher/Job$Builder;

    move-result-object p0

    const/16 v2, 0x1e

    .line 48
    invoke-static {p1, v2}, Lcom/firebase/jobdispatcher/Trigger;->executionWindow(II)Lcom/firebase/jobdispatcher/JobTrigger$ExecutionWindowTrigger;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/firebase/jobdispatcher/Job$Builder;->setTrigger(Lcom/firebase/jobdispatcher/JobTrigger;)Lcom/firebase/jobdispatcher/Job$Builder;

    move-result-object p0

    .line 49
    invoke-virtual {p0, p1}, Lcom/firebase/jobdispatcher/Job$Builder;->setReplaceCurrent(Z)Lcom/firebase/jobdispatcher/Job$Builder;

    move-result-object p0

    .line 50
    invoke-virtual {p0, v0}, Lcom/firebase/jobdispatcher/Job$Builder;->setExtras(Landroid/os/Bundle;)Lcom/firebase/jobdispatcher/Job$Builder;

    move-result-object p0

    .line 51
    invoke-virtual {p0}, Lcom/firebase/jobdispatcher/Job$Builder;->build()Lcom/firebase/jobdispatcher/Job;

    move-result-object p0

    .line 52
    invoke-virtual {v1, p0}, Lcom/firebase/jobdispatcher/FirebaseJobDispatcher;->mustSchedule(Lcom/firebase/jobdispatcher/Job;)V

    return-void
.end method

.method public static stopWork(Landroid/content/Context;)V
    .locals 2

    .line 33
    new-instance v0, Lcom/firebase/jobdispatcher/FirebaseJobDispatcher;

    new-instance v1, Lcom/firebase/jobdispatcher/GooglePlayDriver;

    invoke-direct {v1, p0}, Lcom/firebase/jobdispatcher/GooglePlayDriver;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1}, Lcom/firebase/jobdispatcher/FirebaseJobDispatcher;-><init>(Lcom/firebase/jobdispatcher/Driver;)V

    .line 34
    invoke-virtual {v0}, Lcom/firebase/jobdispatcher/FirebaseJobDispatcher;->cancelAll()I

    const-string/jumbo p0, "shopkick_backgroundservice"

    .line 36
    invoke-virtual {v0, p0}, Lcom/firebase/jobdispatcher/FirebaseJobDispatcher;->cancel(Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 1

    .line 57
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BackgroundJobService;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/application/SKApp;

    .line 58
    iget-object v0, v0, Lcom/shopkick/app/application/SKApp;->logger:Lcom/shopkick/app/application/SKLogger;

    iput-object v0, p0, Lcom/shopkick/app/activities/BackgroundJobService;->logger:Lcom/shopkick/app/application/SKLogger;

    .line 60
    invoke-super {p0}, Lcom/firebase/jobdispatcher/JobService;->onCreate()V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    const/4 v0, 0x0

    .line 104
    iput-boolean v0, p0, Lcom/shopkick/app/activities/BackgroundJobService;->started:Z

    .line 105
    invoke-super {p0}, Lcom/firebase/jobdispatcher/JobService;->onDestroy()V

    return-void
.end method

.method public onStartJob(Lcom/firebase/jobdispatcher/JobParameters;)Z
    .locals 5

    .line 66
    invoke-interface {p1}, Lcom/firebase/jobdispatcher/JobParameters;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    const/4 v0, 0x3

    if-eqz p1, :cond_0

    .line 69
    sget-object v1, Lcom/shopkick/app/activities/BackgroundJobService;->SERVICE_START_SOURCE_KEY:Ljava/lang/String;

    const/4 v2, -0x1

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    goto :goto_0

    :cond_0
    move p1, v0

    .line 74
    :goto_0
    iget-boolean v1, p0, Lcom/shopkick/app/activities/BackgroundJobService;->started:Z

    const/4 v2, 0x1

    if-nez v1, :cond_3

    .line 75
    invoke-virtual {p0}, Lcom/shopkick/app/activities/BackgroundJobService;->getApplication()Landroid/app/Application;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/application/SKApp;

    .line 76
    new-instance v3, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v4, 0x389

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 77
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setBackgroundServiceStartSource(Ljava/lang/Integer;)V

    .line 78
    iget-object v4, p0, Lcom/shopkick/app/activities/BackgroundJobService;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    if-eq p1, v2, :cond_2

    if-ne p1, v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    if-ne p1, v0, :cond_3

    const-string p1, "Geofencing"

    const-string v0, "Starting geofenceManager from app backgrounded event"

    .line 86
    invoke-static {p1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 87
    iget-object p1, v1, Lcom/shopkick/app/application/SKApp;->geofenceManager:Lcom/shopkick/app/geofencing/GeofenceManager;

    invoke-virtual {p1}, Lcom/shopkick/app/geofencing/GeofenceManager;->sessionEnded()V

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "Geofencing"

    const-string v0, "Starting geofenceManager from BackgroundService"

    .line 83
    invoke-static {p1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 84
    iget-object p1, v1, Lcom/shopkick/app/application/SKApp;->geofenceManager:Lcom/shopkick/app/geofencing/GeofenceManager;

    invoke-virtual {p1}, Lcom/shopkick/app/geofencing/GeofenceManager;->sessionEnded()V

    .line 91
    :cond_3
    :goto_2
    iput-boolean v2, p0, Lcom/shopkick/app/activities/BackgroundJobService;->started:Z

    const/4 p1, 0x0

    return p1
.end method

.method public onStopJob(Lcom/firebase/jobdispatcher/JobParameters;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
