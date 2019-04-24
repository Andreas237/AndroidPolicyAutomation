.class Lcom/moat/analytics/mobile/spck/p;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/location/LocationListener;


# static fields
.field private static a:Lcom/moat/analytics/mobile/spck/p;


# instance fields
.field private b:Ljava/util/concurrent/ScheduledExecutorService;

.field private c:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field private d:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field private e:Landroid/location/LocationManager;

.field private f:Z

.field private g:Landroid/location/Location;

.field private h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    :try_start_0
    invoke-static {}, Lcom/moat/analytics/mobile/spck/MoatAnalytics;->getInstance()Lcom/moat/analytics/mobile/spck/MoatAnalytics;

    move-result-object v0

    check-cast v0, Lcom/moat/analytics/mobile/spck/l;

    iget-boolean v0, v0, Lcom/moat/analytics/mobile/spck/l;->c:Z

    iput-boolean v0, p0, Lcom/moat/analytics/mobile/spck/p;->f:Z

    iget-boolean v0, p0, Lcom/moat/analytics/mobile/spck/p;->f:Z

    const/4 v1, 0x3

    if-eqz v0, :cond_0

    const-string v0, "LocationManager"

    const-string v2, "Moat location services disabled"

    :goto_0
    invoke-static {v1, v0, p0, v2}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/moat/analytics/mobile/spck/p;->b:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {}, Lcom/moat/analytics/mobile/spck/a;->a()Landroid/app/Application;

    move-result-object v0

    const-string v2, "location"

    invoke-virtual {v0, v2}, Landroid/app/Application;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    iput-object v0, p0, Lcom/moat/analytics/mobile/spck/p;->e:Landroid/location/LocationManager;

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/p;->e:Landroid/location/LocationManager;

    invoke-virtual {v0}, Landroid/location/LocationManager;->getAllProviders()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "LocationManager"

    const-string v2, "Device has no location providers"

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/p;->e()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-static {v0}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    :goto_1
    return-void
.end method

.method static a()Lcom/moat/analytics/mobile/spck/p;
    .locals 1

    sget-object v0, Lcom/moat/analytics/mobile/spck/p;->a:Lcom/moat/analytics/mobile/spck/p;

    if-nez v0, :cond_0

    new-instance v0, Lcom/moat/analytics/mobile/spck/p;

    invoke-direct {v0}, Lcom/moat/analytics/mobile/spck/p;-><init>()V

    sput-object v0, Lcom/moat/analytics/mobile/spck/p;->a:Lcom/moat/analytics/mobile/spck/p;

    :cond_0
    sget-object v0, Lcom/moat/analytics/mobile/spck/p;->a:Lcom/moat/analytics/mobile/spck/p;

    return-object v0
.end method

.method static synthetic a(Lcom/moat/analytics/mobile/spck/p;)V
    .locals 0

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/p;->e()V

    return-void
.end method

.method static synthetic a(Lcom/moat/analytics/mobile/spck/p;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/moat/analytics/mobile/spck/p;->a(Z)V

    return-void
.end method

.method private a(Z)V
    .locals 3

    const/4 v0, 0x3

    :try_start_0
    const-string v1, "LocationManager"

    const-string/jumbo v2, "stopping location fetch"

    invoke-static {v0, v1, p0, v2}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/p;->h()V

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/p;->i()V

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/p;->k()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/p;->j()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-static {p1}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private static a(Landroid/location/Location;)Z
    .locals 5

    const/4 v0, 0x0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmpl-double v1, v1, v3

    if-nez v1, :cond_1

    invoke-virtual {p0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v1

    cmpl-double v1, v1, v3

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/location/Location;->getAccuracy()F

    move-result v1

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    if-gez v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {p0}, Lcom/moat/analytics/mobile/spck/p;->b(Landroid/location/Location;)F

    move-result p0

    const/high16 v1, 0x44160000    # 600.0f

    cmpl-float p0, p0, v1

    if-ltz p0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method static a(Landroid/location/Location;Landroid/location/Location;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    if-eqz p0, :cond_1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/location/Location;->getTime()J

    move-result-wide v1

    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    move-result-wide p0

    cmp-long p0, v1, p0

    if-nez p0, :cond_1

    return v0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method private static a(Ljava/lang/String;)Z
    .locals 1

    invoke-static {}, Lcom/moat/analytics/mobile/spck/a;->a()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Application;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p0}, Landroid/support/v4/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static b(Landroid/location/Location;)F
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p0}, Landroid/location/Location;->getTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-float p0, v0

    return p0
.end method

.method private static b(Landroid/location/Location;Landroid/location/Location;)Landroid/location/Location;
    .locals 2

    invoke-static {p0}, Lcom/moat/analytics/mobile/spck/p;->a(Landroid/location/Location;)Z

    move-result v0

    invoke-static {p1}, Lcom/moat/analytics/mobile/spck/p;->a(Landroid/location/Location;)Z

    move-result v1

    if-nez v0, :cond_1

    if-nez v1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    return-object p1

    :cond_1
    if-nez v1, :cond_2

    return-object p0

    :cond_2
    invoke-virtual {p0}, Landroid/location/Location;->getAccuracy()F

    move-result v0

    invoke-virtual {p0}, Landroid/location/Location;->getAccuracy()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_3

    goto :goto_0

    :cond_3
    move-object p0, p1

    :goto_0
    return-object p0
.end method

.method private e()V
    .locals 5

    :try_start_0
    iget-boolean v0, p0, Lcom/moat/analytics/mobile/spck/p;->f:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/p;->e:Landroid/location/LocationManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lcom/moat/analytics/mobile/spck/p;->h:Z

    const/4 v1, 0x3

    if-eqz v0, :cond_1

    const-string v0, "LocationManager"

    const-string v2, "already updating location"

    invoke-static {v1, v0, p0, v2}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    const-string v0, "LocationManager"

    const-string/jumbo v2, "starting location fetch"

    invoke-static {v1, v0, p0, v2}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/p;->b()Landroid/location/Location;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v2, "LocationManager"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Have a valid location, won\'t fetch = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroid/location/Location;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2, p0, v0}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/p;->k()V

    return-void

    :cond_2
    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/p;->g()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_3
    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    :goto_1
    return-void
.end method

.method private f()Landroid/location/Location;
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/p;->l()Z

    move-result v1

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/p;->m()Z

    move-result v2

    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    iget-object v1, p0, Lcom/moat/analytics/mobile/spck/p;->e:Landroid/location/LocationManager;

    const-string v2, "gps"

    invoke-virtual {v1, v2}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v1

    iget-object v2, p0, Lcom/moat/analytics/mobile/spck/p;->e:Landroid/location/LocationManager;

    const-string v3, "network"

    invoke-virtual {v2, v3}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/moat/analytics/mobile/spck/p;->b(Landroid/location/Location;Landroid/location/Location;)Landroid/location/Location;

    move-result-object v0

    goto :goto_1

    :cond_0
    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/moat/analytics/mobile/spck/p;->e:Landroid/location/LocationManager;

    const-string v2, "gps"

    :goto_0
    invoke-virtual {v1, v2}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v0

    goto :goto_1

    :cond_1
    if-eqz v2, :cond_2

    iget-object v1, p0, Lcom/moat/analytics/mobile/spck/p;->e:Landroid/location/LocationManager;

    const-string v2, "network"
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-static {v1}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    :cond_2
    :goto_1
    return-object v0
.end method

.method private g()V
    .locals 11

    :try_start_0
    iget-boolean v0, p0, Lcom/moat/analytics/mobile/spck/p;->h:Z

    if-nez v0, :cond_2

    const-string v0, "LocationManager"

    const-string v1, "Attempting to start update"

    const/4 v2, 0x3

    invoke-static {v2, v0, p0, v1}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/p;->l()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const-string v0, "LocationManager"

    const-string/jumbo v3, "start updating gps location"

    invoke-static {v2, v0, p0, v3}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/moat/analytics/mobile/spck/p;->e:Landroid/location/LocationManager;

    const-string v5, "gps"

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v10

    move-object v9, p0

    invoke-virtual/range {v4 .. v10}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V

    iput-boolean v1, p0, Lcom/moat/analytics/mobile/spck/p;->h:Z

    :cond_0
    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/p;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "LocationManager"

    const-string/jumbo v3, "start updating network location"

    invoke-static {v2, v0, p0, v3}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/moat/analytics/mobile/spck/p;->e:Landroid/location/LocationManager;

    const-string v5, "network"

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v10

    move-object v9, p0

    invoke-virtual/range {v4 .. v10}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V

    iput-boolean v1, p0, Lcom/moat/analytics/mobile/spck/p;->h:Z

    :cond_1
    iget-boolean v0, p0, Lcom/moat/analytics/mobile/spck/p;->h:Z

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/p;->i()V

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/p;->b:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/moat/analytics/mobile/spck/p$1;

    invoke-direct {v1, p0}, Lcom/moat/analytics/mobile/spck/p$1;-><init>(Lcom/moat/analytics/mobile/spck/p;)V

    const-wide/16 v2, 0x3c

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/moat/analytics/mobile/spck/p;->d:Ljava/util/concurrent/ScheduledFuture;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {v0}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private h()V
    .locals 3

    const/4 v0, 0x3

    :try_start_0
    const-string v1, "LocationManager"

    const-string v2, "Stopping to update location"

    invoke-static {v0, v1, p0, v2}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/moat/analytics/mobile/spck/p;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/p;->e:Landroid/location/LocationManager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/p;->e:Landroid/location/LocationManager;

    invoke-virtual {v0, p0}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/moat/analytics/mobile/spck/p;->h:Z
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {v0}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    :cond_0
    :goto_0
    return-void
.end method

.method private i()V
    .locals 2

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/p;->d:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledFuture;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/p;->d:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/moat/analytics/mobile/spck/p;->d:Ljava/util/concurrent/ScheduledFuture;

    :cond_0
    return-void
.end method

.method private j()V
    .locals 2

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/p;->c:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledFuture;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/p;->c:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/moat/analytics/mobile/spck/p;->c:Ljava/util/concurrent/ScheduledFuture;

    :cond_0
    return-void
.end method

.method private k()V
    .locals 5

    const-string v0, "LocationManager"

    const-string v1, "Resetting fetch timer"

    const/4 v2, 0x3

    invoke-static {v2, v0, p0, v1}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/p;->j()V

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/p;->b()Landroid/location/Location;

    move-result-object v0

    const/high16 v1, 0x44160000    # 600.0f

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/moat/analytics/mobile/spck/p;->b(Landroid/location/Location;)F

    move-result v0

    sub-float/2addr v1, v0

    const/4 v0, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v1

    :cond_0
    float-to-long v0, v1

    iget-object v2, p0, Lcom/moat/analytics/mobile/spck/p;->b:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v3, Lcom/moat/analytics/mobile/spck/p$2;

    invoke-direct {v3, p0}, Lcom/moat/analytics/mobile/spck/p$2;-><init>(Lcom/moat/analytics/mobile/spck/p;)V

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v2, v3, v0, v1, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/moat/analytics/mobile/spck/p;->c:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method private l()Z
    .locals 2

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {v0}, Lcom/moat/analytics/mobile/spck/p;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/p;->e:Landroid/location/LocationManager;

    const-string v1, "gps"

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->getProvider(Ljava/lang/String;)Landroid/location/LocationProvider;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/p;->e:Landroid/location/LocationManager;

    const-string v1, "gps"

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private m()Z
    .locals 2

    invoke-static {}, Lcom/moat/analytics/mobile/spck/p;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/p;->e:Landroid/location/LocationManager;

    const-string v1, "network"

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->getProvider(Ljava/lang/String;)Landroid/location/LocationProvider;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/p;->e:Landroid/location/LocationManager;

    const-string v1, "network"

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static n()Z
    .locals 1

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {v0}, Lcom/moat/analytics/mobile/spck/p;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {v0}, Lcom/moat/analytics/mobile/spck/p;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

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


# virtual methods
.method b()Landroid/location/Location;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-boolean v0, p0, Lcom/moat/analytics/mobile/spck/p;->f:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/p;->e:Landroid/location/LocationManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/p;->g:Landroid/location/Location;

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/p;->f()Landroid/location/Location;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/moat/analytics/mobile/spck/p;->b(Landroid/location/Location;Landroid/location/Location;)Landroid/location/Location;

    move-result-object v0

    iput-object v0, p0, Lcom/moat/analytics/mobile/spck/p;->g:Landroid/location/Location;

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/p;->g:Landroid/location/Location;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    invoke-static {v0}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    :cond_1
    :goto_0
    return-object v1
.end method

.method c()V
    .locals 0

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/p;->e()V

    return-void
.end method

.method d()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/moat/analytics/mobile/spck/p;->a(Z)V

    return-void
.end method

.method public onLocationChanged(Landroid/location/Location;)V
    .locals 4

    :try_start_0
    const-string v0, "LocationManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Received an updated location = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/location/Location;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {v2, v0, p0, v1}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/moat/analytics/mobile/spck/p;->b(Landroid/location/Location;)F

    move-result v0

    invoke-virtual {p1}, Landroid/location/Location;->hasAccuracy()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result v1

    const/high16 v3, 0x42c80000    # 100.0f

    cmpg-float v1, v1, v3

    if-gtz v1, :cond_0

    const/high16 v1, 0x44160000    # 600.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/p;->g:Landroid/location/Location;

    invoke-static {v0, p1}, Lcom/moat/analytics/mobile/spck/p;->b(Landroid/location/Location;Landroid/location/Location;)Landroid/location/Location;

    move-result-object p1

    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/p;->g:Landroid/location/Location;

    const-string p1, "LocationManager"

    const-string v0, "fetchCompleted"

    invoke-static {v2, p1, p0, v0}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lcom/moat/analytics/mobile/spck/p;->a(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-static {p1}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public onProviderDisabled(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onProviderEnabled(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0

    return-void
.end method
