.class public Lo/dhq;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dhq$b;,
        Lo/dhq$c;,
        Lo/dhq$a;,
        Lo/dhq$d;,
        Lo/dhq$e;
    }
.end annotation


# static fields
.field private static r:Lo/dhq;

.field private static final z:Ljava/lang/Object;


# instance fields
.field private A:Ljava/lang/Runnable;

.field private B:Landroid/location/GpsStatus$Listener;

.field private a:J

.field private b:J

.field private c:F

.field private d:F

.field private e:J

.field private f:Landroid/location/LocationListener;

.field private g:Z

.field private h:Z

.field private i:Landroid/location/LocationManager;

.field private j:J

.field private k:Z

.field private l:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<Ljava/lang/String;Lo/dhq$c;>;"
        }
    .end annotation
.end field

.field private m:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<Ljava/lang/String;Lo/dhq$a;>;"
        }
    .end annotation
.end field

.field private n:Landroid/location/LocationListener;

.field private o:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<Ljava/lang/String;Lo/dhq$b;>;"
        }
    .end annotation
.end field

.field private p:Landroid/location/LocationListener;

.field private q:Landroid/content/Context;

.field private s:Ljava/lang/String;

.field private t:Landroid/os/HandlerThread;

.field private u:Lo/dcy;

.field private v:I

.field private w:Z

.field private x:Landroid/location/Location;

.field private y:Lo/dhq$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 61
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dhq;->z:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    const-wide/16 v0, 0x7d0

    iput-wide v0, p0, Lo/dhq;->a:J

    .line 36
    const-wide/16 v0, 0x3e8

    iput-wide v0, p0, Lo/dhq;->b:J

    .line 37
    const/4 v0, 0x0

    iput v0, p0, Lo/dhq;->c:F

    .line 38
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/dhq;->e:J

    .line 39
    const/4 v0, 0x0

    iput v0, p0, Lo/dhq;->d:F

    .line 42
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dhq;->g:Z

    .line 43
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dhq;->k:Z

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dhq;->f:Landroid/location/LocationListener;

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dhq;->p:Landroid/location/LocationListener;

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dhq;->n:Landroid/location/LocationListener;

    .line 47
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lo/dhq;->m:Ljava/util/concurrent/ConcurrentHashMap;

    .line 48
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lo/dhq;->l:Ljava/util/concurrent/ConcurrentHashMap;

    .line 49
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lo/dhq;->o:Ljava/util/concurrent/ConcurrentHashMap;

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dhq;->t:Landroid/os/HandlerThread;

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dhq;->y:Lo/dhq$e;

    .line 59
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dhq;->w:Z

    .line 60
    const/4 v0, 0x3

    iput v0, p0, Lo/dhq;->v:I

    .line 62
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dhq;->x:Landroid/location/Location;

    .line 63
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/dhq;->j:J

    .line 506
    new-instance v0, Lo/dhq$1;

    invoke-direct {v0, p0}, Lo/dhq$1;-><init>(Lo/dhq;)V

    iput-object v0, p0, Lo/dhq;->B:Landroid/location/GpsStatus$Listener;

    .line 87
    iput-object p1, p0, Lo/dhq;->q:Landroid/content/Context;

    .line 89
    iget-object v0, p0, Lo/dhq;->t:Landroid/os/HandlerThread;

    if-nez v0, :cond_0

    .line 90
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "Track_LocationManagerUtils"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/dhq;->t:Landroid/os/HandlerThread;

    .line 91
    iget-object v0, p0, Lo/dhq;->t:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 94
    :cond_0
    iget-object v0, p0, Lo/dhq;->y:Lo/dhq$e;

    if-nez v0, :cond_1

    .line 95
    new-instance v0, Lo/dhq$e;

    iget-object v1, p0, Lo/dhq;->t:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/dhq$e;-><init>(Lo/dhq;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/dhq;->y:Lo/dhq$e;

    .line 97
    :cond_1
    invoke-direct {p0}, Lo/dhq;->r()V

    .line 98
    invoke-direct {p0}, Lo/dhq;->b()V

    .line 99
    return-void
.end method

.method public static a(Landroid/content/Context;)Lo/dhq;
    .locals 3

    .line 68
    sget-object v1, Lo/dhq;->z:Ljava/lang/Object;

    monitor-enter v1

    .line 69
    :try_start_0
    sget-object v0, Lo/dhq;->r:Lo/dhq;

    if-nez v0, :cond_0

    .line 70
    new-instance v0, Lo/dhq;

    invoke-direct {v0, p0}, Lo/dhq;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dhq;->r:Lo/dhq;

    goto :goto_0

    .line 72
    :cond_0
    sget-object v0, Lo/dhq;->r:Lo/dhq;

    invoke-virtual {v0}, Lo/dhq;->c()V

    .line 74
    :goto_0
    sget-object v0, Lo/dhq;->r:Lo/dhq;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 75
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private a(J)V
    .locals 6

    .line 304
    iget-boolean v0, p0, Lo/dhq;->h:Z

    if-eqz v0, :cond_0

    .line 305
    return-void

    .line 307
    :cond_0
    iget-object v0, p0, Lo/dhq;->i:Landroid/location/LocationManager;

    if-nez v0, :cond_1

    .line 308
    iget-object v0, p0, Lo/dhq;->q:Landroid/content/Context;

    iget-object v1, p0, Lo/dhq;->q:Landroid/content/Context;

    const-string v1, "location"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    iput-object v0, p0, Lo/dhq;->i:Landroid/location/LocationManager;

    .line 310
    :cond_1
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "changeLocationRequestTime ,time:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 311
    iget-boolean v0, p0, Lo/dhq;->w:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/dhq;->f:Landroid/location/LocationListener;

    if-eqz v0, :cond_2

    .line 312
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "changeLocationRequestTime isRequestLocation is true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 313
    iget-object v0, p0, Lo/dhq;->i:Landroid/location/LocationManager;

    const-string v1, "gps"

    move-wide v2, p1

    iget v4, p0, Lo/dhq;->c:F

    iget-object v5, p0, Lo/dhq;->f:Landroid/location/LocationListener;

    invoke-virtual/range {v0 .. v5}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V

    .line 315
    :cond_2
    iput-wide p1, p0, Lo/dhq;->a:J

    .line 316
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dhq;->g:Z

    .line 318
    return-void
.end method

.method private a(Landroid/location/GpsStatus;)V
    .locals 4

    .line 565
    iget-object v0, p0, Lo/dhq;->o:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_1

    .line 566
    iget-object v0, p0, Lo/dhq;->o:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/dhq$b;

    .line 567
    if-eqz v2, :cond_0

    .line 568
    invoke-virtual {v2}, Lo/dhq$b;->b()Lo/dhi;

    move-result-object v3

    .line 569
    if-eqz v3, :cond_0

    .line 570
    invoke-interface {v3, p1}, Lo/dhi;->b(Landroid/location/GpsStatus;)V

    .line 573
    :cond_0
    goto :goto_0

    .line 575
    :cond_1
    return-void
.end method

.method private a(Landroid/location/Location;)V
    .locals 4

    .line 362
    if-nez p1, :cond_0

    .line 363
    return-void

    .line 365
    :cond_0
    iget-object v0, p0, Lo/dhq;->m:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_2

    .line 366
    iget-object v0, p0, Lo/dhq;->m:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/dhq$a;

    .line 367
    if-eqz v2, :cond_1

    .line 368
    invoke-virtual {v2}, Lo/dhq$a;->d()Lo/dhj;

    move-result-object v3

    .line 369
    if-eqz v3, :cond_1

    .line 370
    invoke-interface {v3, p1}, Lo/dhj;->d(Landroid/location/Location;)V

    .line 373
    :cond_1
    goto :goto_0

    .line 375
    :cond_2
    return-void
.end method

.method static synthetic a(Lo/dhq;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lo/dhq;->i()V

    return-void
.end method

.method static synthetic a(Lo/dhq;Landroid/location/GpsStatus;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lo/dhq;->a(Landroid/location/GpsStatus;)V

    return-void
.end method

.method static synthetic a(Lo/dhq;Z)Z
    .locals 0

    .line 31
    iput-boolean p1, p0, Lo/dhq;->w:Z

    return p1
.end method

.method static synthetic b(Lo/dhq;J)J
    .locals 0

    .line 31
    iput-wide p1, p0, Lo/dhq;->j:J

    return-wide p1
.end method

.method private b()V
    .locals 2

    .line 102
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dhq;->s:Ljava/lang/String;

    .line 103
    new-instance v0, Lo/dcy;

    invoke-direct {v0}, Lo/dcy;-><init>()V

    iput-object v0, p0, Lo/dhq;->u:Lo/dcy;

    .line 104
    iget-object v0, p0, Lo/dhq;->u:Lo/dcy;

    const/4 v1, 0x0

    iput v1, v0, Lo/dcy;->c:I

    .line 105
    invoke-direct {p0}, Lo/dhq;->h()V

    .line 106
    return-void
.end method

.method private b(I)V
    .locals 4

    .line 550
    iput p1, p0, Lo/dhq;->v:I

    .line 551
    iget-object v0, p0, Lo/dhq;->l:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_1

    .line 552
    iget-object v0, p0, Lo/dhq;->l:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/dhq$c;

    .line 553
    if-eqz v2, :cond_0

    .line 554
    invoke-virtual {v2}, Lo/dhq$c;->c()Lo/dhl;

    move-result-object v3

    .line 555
    if-eqz v3, :cond_0

    .line 556
    invoke-interface {v3, p1}, Lo/dhl;->a(I)V

    .line 559
    :cond_0
    goto :goto_0

    .line 561
    :cond_1
    return-void
.end method

.method static synthetic b(Lo/dhq;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lo/dhq;->k()V

    return-void
.end method

.method static synthetic b(Lo/dhq;I)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lo/dhq;->d(I)V

    return-void
.end method

.method static synthetic c(Lo/dhq;J)J
    .locals 0

    .line 31
    iput-wide p1, p0, Lo/dhq;->a:J

    return-wide p1
.end method

.method static synthetic c(Lo/dhq;Landroid/location/Location;)Landroid/location/Location;
    .locals 0

    .line 31
    iput-object p1, p0, Lo/dhq;->x:Landroid/location/Location;

    return-object p1
.end method

.method static synthetic c(Lo/dhq;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lo/dhq;->g()V

    return-void
.end method

.method static synthetic c(Lo/dhq;Z)Z
    .locals 0

    .line 31
    iput-boolean p1, p0, Lo/dhq;->g:Z

    return p1
.end method

.method private d(I)V
    .locals 4

    .line 577
    iget-object v0, p0, Lo/dhq;->o:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_1

    .line 578
    iget-object v0, p0, Lo/dhq;->o:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/dhq$b;

    .line 579
    if-eqz v2, :cond_0

    .line 580
    invoke-virtual {v2}, Lo/dhq$b;->b()Lo/dhi;

    move-result-object v3

    .line 581
    if-eqz v3, :cond_0

    .line 582
    invoke-interface {v3, p1}, Lo/dhi;->d(I)V

    .line 585
    :cond_0
    goto :goto_0

    .line 587
    :cond_1
    return-void
.end method

.method static synthetic d(Lo/dhq;I)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lo/dhq;->b(I)V

    return-void
.end method

.method static synthetic d(Lo/dhq;)Z
    .locals 1

    .line 31
    iget-boolean v0, p0, Lo/dhq;->h:Z

    return v0
.end method

.method static synthetic e(Lo/dhq;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lo/dhq;->q()V

    return-void
.end method

.method static synthetic e(Lo/dhq;J)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2}, Lo/dhq;->a(J)V

    return-void
.end method

.method static synthetic e(Lo/dhq;Landroid/location/Location;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lo/dhq;->a(Landroid/location/Location;)V

    return-void
.end method

.method static synthetic e(Lo/dhq;Z)Z
    .locals 0

    .line 31
    iput-boolean p1, p0, Lo/dhq;->k:Z

    return p1
.end method

.method private f()V
    .locals 4

    .line 402
    iget-object v0, p0, Lo/dhq;->i:Landroid/location/LocationManager;

    if-nez v0, :cond_0

    .line 403
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mMylocationManager == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 404
    return-void

    .line 407
    :cond_0
    invoke-direct {p0}, Lo/dhq;->m()V

    .line 408
    invoke-direct {p0}, Lo/dhq;->n()V

    .line 409
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dhq;->i:Landroid/location/LocationManager;

    .line 410
    return-void
.end method

.method static synthetic f(Lo/dhq;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lo/dhq;->u()V

    return-void
.end method

.method static synthetic g(Lo/dhq;)Landroid/location/LocationManager;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/dhq;->i:Landroid/location/LocationManager;

    return-object v0
.end method

.method private g()V
    .locals 6

    .line 390
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " requestMockLocation."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 392
    iget-object v0, p0, Lo/dhq;->i:Landroid/location/LocationManager;

    if-nez v0, :cond_0

    .line 393
    iget-object v0, p0, Lo/dhq;->q:Landroid/content/Context;

    iget-object v1, p0, Lo/dhq;->q:Landroid/content/Context;

    const-string v1, "location"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    iput-object v0, p0, Lo/dhq;->i:Landroid/location/LocationManager;

    .line 396
    :cond_0
    new-instance v0, Lo/dhq$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/dhq$d;-><init>(Lo/dhq;Lo/dhq$1;)V

    iput-object v0, p0, Lo/dhq;->n:Landroid/location/LocationListener;

    .line 398
    iget-object v0, p0, Lo/dhq;->i:Landroid/location/LocationManager;

    const-string v1, "GpsMockProvider"

    iget-wide v2, p0, Lo/dhq;->e:J

    iget v4, p0, Lo/dhq;->d:F

    iget-object v5, p0, Lo/dhq;->n:Landroid/location/LocationListener;

    invoke-virtual/range {v0 .. v5}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V

    .line 399
    return-void
.end method

.method private h()V
    .locals 6

    .line 113
    iget-object v0, p0, Lo/dhq;->q:Landroid/content/Context;

    iget-object v1, p0, Lo/dhq;->s:Ljava/lang/String;

    const-string v2, "min_location_request_interval_time"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 115
    const-wide/16 v0, 0x7d0

    iput-wide v0, p0, Lo/dhq;->a:J

    .line 116
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 117
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lo/dhq;->a:J

    .line 120
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/dhq;->c:F

    .line 121
    iget-object v0, p0, Lo/dhq;->q:Landroid/content/Context;

    iget-object v1, p0, Lo/dhq;->s:Ljava/lang/String;

    const-string v2, "min_location_request_interval_distance"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 122
    if-eqz v5, :cond_1

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 123
    invoke-static {v5}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Lo/dhq;->c:F

    .line 126
    :cond_1
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mRequestMinTime :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/dhq;->a:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " -- mRequestMinDistance :"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lo/dhq;->c:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    return-void
.end method

.method static synthetic h(Lo/dhq;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lo/dhq;->f()V

    return-void
.end method

.method private i()V
    .locals 1

    .line 413
    iget-object v0, p0, Lo/dhq;->i:Landroid/location/LocationManager;

    if-nez v0, :cond_0

    .line 414
    return-void

    .line 417
    :cond_0
    invoke-direct {p0}, Lo/dhq;->l()V

    .line 419
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dhq;->i:Landroid/location/LocationManager;

    .line 420
    return-void
.end method

.method static synthetic i(Lo/dhq;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lo/dhq;->n()V

    return-void
.end method

.method static synthetic k(Lo/dhq;)J
    .locals 2

    .line 31
    iget-wide v0, p0, Lo/dhq;->a:J

    return-wide v0
.end method

.method private k()V
    .locals 4

    .line 379
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "regMyLocationListener."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 381
    iget-object v0, p0, Lo/dhq;->q:Landroid/content/Context;

    iget-object v1, p0, Lo/dhq;->q:Landroid/content/Context;

    const-string v1, "location"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    iput-object v0, p0, Lo/dhq;->i:Landroid/location/LocationManager;

    .line 382
    invoke-direct {p0}, Lo/dhq;->p()V

    .line 384
    iget-boolean v0, p0, Lo/dhq;->k:Z

    if-nez v0, :cond_0

    .line 385
    invoke-direct {p0}, Lo/dhq;->o()V

    .line 387
    :cond_0
    return-void
.end method

.method static synthetic l(Lo/dhq;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/dhq;->l:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method

.method private l()V
    .locals 4

    .line 462
    iget-object v0, p0, Lo/dhq;->n:Landroid/location/LocationListener;

    if-nez v0, :cond_0

    .line 463
    return-void

    .line 465
    :cond_0
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " stopMockLocation removeUpdates"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 466
    iget-object v0, p0, Lo/dhq;->i:Landroid/location/LocationManager;

    iget-object v1, p0, Lo/dhq;->n:Landroid/location/LocationListener;

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    .line 467
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dhq;->n:Landroid/location/LocationListener;

    .line 468
    return-void
.end method

.method static synthetic m(Lo/dhq;)Landroid/content/Context;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/dhq;->q:Landroid/content/Context;

    return-object v0
.end method

.method private m()V
    .locals 4

    .line 451
    iget-object v0, p0, Lo/dhq;->f:Landroid/location/LocationListener;

    if-nez v0, :cond_0

    .line 452
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " stopGpsLocation gpsListener is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 453
    return-void

    .line 455
    :cond_0
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " stopGpsLocation removeUpdates"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 456
    iget-object v0, p0, Lo/dhq;->i:Landroid/location/LocationManager;

    iget-object v1, p0, Lo/dhq;->f:Landroid/location/LocationListener;

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    .line 457
    iget-object v0, p0, Lo/dhq;->i:Landroid/location/LocationManager;

    iget-object v1, p0, Lo/dhq;->B:Landroid/location/GpsStatus$Listener;

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeGpsStatusListener(Landroid/location/GpsStatus$Listener;)V

    .line 458
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dhq;->f:Landroid/location/LocationListener;

    .line 459
    return-void
.end method

.method static synthetic n(Lo/dhq;)Lo/dhq$e;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/dhq;->y:Lo/dhq$e;

    return-object v0
.end method

.method private n()V
    .locals 4

    .line 472
    iget-object v0, p0, Lo/dhq;->p:Landroid/location/LocationListener;

    if-nez v0, :cond_0

    .line 473
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "networkListner == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 474
    return-void

    .line 476
    :cond_0
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " stopNetworkLocation removeUpdates"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 477
    iget-object v0, p0, Lo/dhq;->i:Landroid/location/LocationManager;

    iget-object v1, p0, Lo/dhq;->p:Landroid/location/LocationListener;

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    .line 478
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dhq;->p:Landroid/location/LocationListener;

    .line 479
    return-void
.end method

.method static synthetic o(Lo/dhq;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/dhq;->o:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method

.method private o()V
    .locals 7

    .line 440
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startNetworkLocation "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 443
    :try_start_0
    new-instance v0, Lo/dhq$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/dhq$d;-><init>(Lo/dhq;Lo/dhq$1;)V

    iput-object v0, p0, Lo/dhq;->p:Landroid/location/LocationListener;

    .line 444
    iget-object v0, p0, Lo/dhq;->i:Landroid/location/LocationManager;

    const-string v1, "network"

    iget-wide v2, p0, Lo/dhq;->a:J

    iget v4, p0, Lo/dhq;->c:F

    iget-object v5, p0, Lo/dhq;->p:Landroid/location/LocationListener;

    invoke-virtual/range {v0 .. v5}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 447
    goto :goto_0

    .line 445
    :catch_0
    move-exception v6

    .line 446
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Exception: provider doesn\'t exist: network"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 448
    :goto_0
    return-void
.end method

.method static synthetic p(Lo/dhq;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/dhq;->m:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method

.method private p()V
    .locals 7

    .line 424
    :try_start_0
    new-instance v0, Lo/dhq$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/dhq$d;-><init>(Lo/dhq;Lo/dhq$1;)V

    iput-object v0, p0, Lo/dhq;->f:Landroid/location/LocationListener;

    .line 425
    iget-boolean v0, p0, Lo/dhq;->g:Z

    if-eqz v0, :cond_0

    .line 426
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startGpsLocation FirstRequest"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 427
    iget-object v0, p0, Lo/dhq;->i:Landroid/location/LocationManager;

    const-string v1, "gps"

    iget-wide v2, p0, Lo/dhq;->b:J

    iget v4, p0, Lo/dhq;->c:F

    iget-object v5, p0, Lo/dhq;->f:Landroid/location/LocationListener;

    invoke-virtual/range {v0 .. v5}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V

    goto :goto_0

    .line 429
    :cond_0
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startGpsLocation "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 431
    iget-object v0, p0, Lo/dhq;->i:Landroid/location/LocationManager;

    const-string v1, "gps"

    iget-wide v2, p0, Lo/dhq;->a:J

    iget v4, p0, Lo/dhq;->c:F

    iget-object v5, p0, Lo/dhq;->f:Landroid/location/LocationListener;

    invoke-virtual/range {v0 .. v5}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V

    .line 433
    :goto_0
    iget-object v0, p0, Lo/dhq;->i:Landroid/location/LocationManager;

    iget-object v1, p0, Lo/dhq;->B:Landroid/location/GpsStatus$Listener;

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->addGpsStatusListener(Landroid/location/GpsStatus$Listener;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 436
    goto :goto_1

    .line 434
    :catch_0
    move-exception v6

    .line 435
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Exception: provider doesn\'t exist: GPS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 437
    :goto_1
    return-void
.end method

.method private q()V
    .locals 4

    .line 607
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startPrintKeyName"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 608
    iget-object v0, p0, Lo/dhq;->A:Ljava/lang/Runnable;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 610
    new-instance v0, Lo/dhq$4;

    invoke-direct {v0, p0}, Lo/dhq$4;-><init>(Lo/dhq;)V

    iput-object v0, p0, Lo/dhq;->A:Ljava/lang/Runnable;

    .line 675
    :cond_0
    iget-object v0, p0, Lo/dhq;->y:Lo/dhq$e;

    if-eqz v0, :cond_1

    .line 676
    iget-object v0, p0, Lo/dhq;->y:Lo/dhq$e;

    iget-object v1, p0, Lo/dhq;->A:Ljava/lang/Runnable;

    const-wide/32 v2, 0x1b7740

    invoke-virtual {v0, v1, v2, v3}, Lo/dhq$e;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 677
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startPrintKeyName success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 679
    :cond_1
    return-void
.end method

.method private r()V
    .locals 4

    .line 495
    iget-object v0, p0, Lo/dhq;->i:Landroid/location/LocationManager;

    if-nez v0, :cond_0

    .line 496
    iget-object v0, p0, Lo/dhq;->q:Landroid/content/Context;

    iget-object v1, p0, Lo/dhq;->q:Landroid/content/Context;

    const-string v1, "location"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    iput-object v0, p0, Lo/dhq;->i:Landroid/location/LocationManager;

    .line 499
    :cond_0
    iget-object v0, p0, Lo/dhq;->i:Landroid/location/LocationManager;

    const-string v1, "GpsMockProvider"

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lo/dhq;->h:Z

    .line 501
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " checkMockProvider isMocking:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/dhq;->h:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 502
    return-void
.end method

.method private s()Z
    .locals 4

    .line 483
    iget-object v0, p0, Lo/dhq;->q:Landroid/content/Context;

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {v0, v1}, Landroid/support/v4/app/ActivityCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/dhq;->q:Landroid/content/Context;

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    .line 485
    invoke-static {v0, v1}, Landroid/support/v4/app/ActivityCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    .line 487
    :cond_0
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkSelfPermission is false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 488
    const/4 v0, 0x0

    return v0

    .line 490
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private t()Z
    .locals 2

    .line 591
    iget-object v0, p0, Lo/dhq;->y:Lo/dhq$e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/dhq;->m:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v0

    iget-object v1, p0, Lo/dhq;->l:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lo/dhq;->o:Ljava/util/concurrent/ConcurrentHashMap;

    .line 592
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v1

    add-int/2addr v0, v1

    if-nez v0, :cond_0

    .line 593
    const/4 v0, 0x1

    return v0

    .line 595
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private u()V
    .locals 4

    .line 682
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopPrintKey"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 683
    iget-object v0, p0, Lo/dhq;->A:Ljava/lang/Runnable;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/dhq;->y:Lo/dhq$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 684
    iget-object v0, p0, Lo/dhq;->y:Lo/dhq$e;

    iget-object v1, p0, Lo/dhq;->A:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lo/dhq$e;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 685
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopPrintKey success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 687
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 188
    iget-object v0, p0, Lo/dhq;->y:Lo/dhq$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 189
    iget-object v0, p0, Lo/dhq;->y:Lo/dhq$e;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/dhq$e;->sendEmptyMessage(I)Z

    .line 191
    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 4

    .line 256
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregGpsStatusListener, keyName:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    iget-object v0, p0, Lo/dhq;->l:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 258
    iget-object v0, p0, Lo/dhq;->l:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    invoke-direct {p0}, Lo/dhq;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 260
    iget-object v0, p0, Lo/dhq;->y:Lo/dhq$e;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/dhq$e;->sendEmptyMessage(I)Z

    .line 263
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 4

    .line 289
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregOriginalGpsStatusListener, keyName:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 290
    iget-object v0, p0, Lo/dhq;->o:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 291
    iget-object v0, p0, Lo/dhq;->o:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    invoke-direct {p0}, Lo/dhq;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 293
    iget-object v0, p0, Lo/dhq;->y:Lo/dhq$e;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/dhq$e;->sendEmptyMessage(I)Z

    .line 296
    :cond_0
    return-void
.end method

.method public b(Lo/dhl;Ljava/lang/String;)V
    .locals 5

    .line 238
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "regGpsStatusListener, keyName:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    invoke-direct {p0}, Lo/dhq;->s()Z

    move-result v0

    if-nez v0, :cond_0

    .line 240
    return-void

    .line 242
    :cond_0
    iget-object v0, p0, Lo/dhq;->y:Lo/dhq$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/dhq;->l:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 243
    new-instance v4, Lo/dhq$c;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {v4, v0, v1, p1}, Lo/dhq$c;-><init>(JLo/dhl;)V

    .line 244
    iget-object v0, p0, Lo/dhq;->l:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p2, v4}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    iget-boolean v0, p0, Lo/dhq;->w:Z

    if-nez v0, :cond_1

    .line 246
    iget-object v0, p0, Lo/dhq;->y:Lo/dhq$e;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dhq$e;->sendEmptyMessage(I)Z

    .line 247
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dhq;->w:Z

    .line 250
    :cond_1
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 299
    iput-boolean p1, p0, Lo/dhq;->k:Z

    .line 300
    return-void
.end method

.method public c()V
    .locals 1

    .line 80
    iget-boolean v0, p0, Lo/dhq;->w:Z

    if-nez v0, :cond_0

    .line 81
    invoke-direct {p0}, Lo/dhq;->r()V

    .line 82
    invoke-direct {p0}, Lo/dhq;->h()V

    .line 84
    :cond_0
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 4

    .line 223
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregLocationListener, keyName:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    iget-object v0, p0, Lo/dhq;->m:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 225
    iget-object v0, p0, Lo/dhq;->m:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    invoke-direct {p0}, Lo/dhq;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 227
    iget-object v0, p0, Lo/dhq;->y:Lo/dhq$e;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/dhq$e;->sendEmptyMessage(I)Z

    .line 230
    :cond_0
    return-void
.end method

.method public c(Lo/dhj;Ljava/lang/String;)V
    .locals 5

    .line 199
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "regLocationListener, keyName:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    invoke-direct {p0}, Lo/dhq;->s()Z

    move-result v0

    if-nez v0, :cond_0

    .line 201
    return-void

    .line 203
    :cond_0
    iget-object v0, p0, Lo/dhq;->y:Lo/dhq$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lo/dhq;->m:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 204
    new-instance v4, Lo/dhq$a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {v4, v0, v1, p1}, Lo/dhq$a;-><init>(JLo/dhj;)V

    .line 205
    iget-object v0, p0, Lo/dhq;->m:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p2, v4}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    iget-boolean v0, p0, Lo/dhq;->w:Z

    if-nez v0, :cond_1

    .line 207
    iget-object v0, p0, Lo/dhq;->y:Lo/dhq$e;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dhq$e;->sendEmptyMessage(I)Z

    .line 208
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dhq;->w:Z

    goto :goto_0

    .line 210
    :cond_1
    iget-object v0, p0, Lo/dhq;->x:Landroid/location/Location;

    if-eqz v0, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lo/dhq;->j:J

    sub-long/2addr v0, v2

    const-wide/32 v2, 0xea60

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    .line 211
    iget-object v0, p0, Lo/dhq;->x:Landroid/location/Location;

    invoke-direct {p0, v0}, Lo/dhq;->a(Landroid/location/Location;)V

    .line 217
    :cond_2
    :goto_0
    return-void
.end method

.method public d()Z
    .locals 1

    .line 183
    iget-boolean v0, p0, Lo/dhq;->w:Z

    return v0
.end method

.method public e()I
    .locals 1

    .line 599
    invoke-virtual {p0}, Lo/dhq;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 600
    iget v0, p0, Lo/dhq;->v:I

    return v0

    .line 602
    :cond_0
    const/4 v0, 0x3

    return v0
.end method

.method public e(Lo/dhi;Ljava/lang/String;)V
    .locals 5

    .line 270
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "regOriginalGpsStatusListener, keyName:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    invoke-direct {p0}, Lo/dhq;->s()Z

    move-result v0

    if-nez v0, :cond_0

    .line 272
    return-void

    .line 274
    :cond_0
    iget-object v0, p0, Lo/dhq;->y:Lo/dhq$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/dhq;->o:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 275
    new-instance v4, Lo/dhq$b;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {v4, v0, v1, p1}, Lo/dhq$b;-><init>(JLo/dhi;)V

    .line 276
    iget-object v0, p0, Lo/dhq;->o:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p2, v4}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    iget-boolean v0, p0, Lo/dhq;->w:Z

    if-nez v0, :cond_1

    .line 278
    iget-object v0, p0, Lo/dhq;->y:Lo/dhq$e;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dhq$e;->sendEmptyMessage(I)Z

    .line 279
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dhq;->w:Z

    .line 283
    :cond_1
    return-void
.end method
