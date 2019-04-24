.class public Lcom/ibotta/android/service/location/LocationUpdateManagerImpl;
.super Ljava/lang/Object;
.source "LocationUpdateManagerImpl.java"

# interfaces
.implements Lcom/ibotta/android/service/location/LocationUpdateManager;


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final context:Landroid/content/Context;

.field private final looper:Landroid/os/Looper;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Landroid/os/Looper;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/service/location/LocationUpdateManagerImpl;->context:Landroid/content/Context;

    .line 24
    iput-object p2, p0, Lcom/ibotta/android/service/location/LocationUpdateManagerImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 25
    iput-object p3, p0, Lcom/ibotta/android/service/location/LocationUpdateManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 26
    iput-object p4, p0, Lcom/ibotta/android/service/location/LocationUpdateManagerImpl;->looper:Landroid/os/Looper;

    return-void
.end method


# virtual methods
.method public requestUpdate(J)V
    .locals 3

    .line 84
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/service/location/LocationUpdateManagerImpl;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/service/location/LocationUpdateService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "max_age"

    .line 85
    invoke-virtual {v0, v1, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 87
    iget-object p1, p0, Lcom/ibotta/android/service/location/LocationUpdateManagerImpl;->context:Landroid/content/Context;

    const-class p2, Lcom/ibotta/android/service/location/LocationUpdateService;

    sget-object v1, Lcom/ibotta/android/service/JobServiceId;->LOCATION_UPDATE:Lcom/ibotta/android/service/JobServiceId;

    .line 88
    invoke-virtual {v1}, Lcom/ibotta/android/service/JobServiceId;->ordinal()I

    move-result v1

    .line 87
    invoke-static {p1, p2, v1, v0}, Lcom/ibotta/android/service/location/LocationUpdateService;->enqueueWork(Landroid/content/Context;Ljava/lang/Class;ILandroid/content/Intent;)V

    return-void
.end method

.method public waitForFreshLocation(JJJ)Landroid/location/Location;
    .locals 9
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const-string v0, "Attempting to get fresh location..."

    const/4 v1, 0x0

    .line 41
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/service/location/LocationUpdateManagerImpl;->looper:Landroid/os/Looper;

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 48
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/service/location/LocationUpdateManagerImpl;->requestUpdate(J)V

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/service/location/LocationUpdateManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->getLastLocation()Landroid/location/Location;

    move-result-object v0

    .line 51
    iget-object v2, p0, Lcom/ibotta/android/service/location/LocationUpdateManagerImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v2}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v2

    :goto_0
    if-eqz v0, :cond_0

    .line 53
    iget-object v4, p0, Lcom/ibotta/android/service/location/LocationUpdateManagerImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v4}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v4

    invoke-virtual {v0}, Landroid/location/Location;->getTime()J

    move-result-wide v6

    sub-long/2addr v4, v6

    cmp-long v6, v4, p1

    if-lez v6, :cond_1

    .line 55
    :cond_0
    iget-object v4, p0, Lcom/ibotta/android/service/location/LocationUpdateManagerImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v4}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v4

    sub-long/2addr v4, v2

    sub-long v4, p3, v4

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-lez v8, :cond_1

    .line 60
    :try_start_0
    invoke-static {v4, v5, p5, p6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    const-string v0, "Still waiting for fresh location...: %1$dms"

    const/4 v6, 0x1

    .line 61
    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    aput-object v7, v6, v1

    invoke-static {v0, v6}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v4, "Location wait interrupted."

    .line 67
    new-array v5, v1, [Ljava/lang/Object;

    invoke-static {v0, v4, v5}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    :goto_1
    iget-object v0, p0, Lcom/ibotta/android/service/location/LocationUpdateManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->getLastLocation()Landroid/location/Location;

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string p1, "Done waiting for fresh location."

    .line 73
    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0

    .line 45
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This call should not be executed from the main thread!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
