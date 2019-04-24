.class public final Lcom/tencent/map/b/e;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/map/b/e$c;,
        Lcom/tencent/map/b/e$b;,
        Lcom/tencent/map/b/e$a;
    }
.end annotation


# static fields
.field private static b:Landroid/location/LocationManager;

.field private static d:F


# instance fields
.field private a:Landroid/content/Context;

.field private c:Lcom/tencent/map/b/e$a;

.field private e:Lcom/tencent/map/b/e$c;

.field private f:Lcom/tencent/map/b/e$b;

.field private g:Z

.field private h:[B

.field private i:I

.field private j:J

.field private k:Z

.field private l:I

.field private m:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-object v0, Lcom/tencent/map/b/e;->b:Landroid/location/LocationManager;

    const/4 v0, 0x0

    sput v0, Lcom/tencent/map/b/e;->d:F

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/e;->a:Landroid/content/Context;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/e;->c:Lcom/tencent/map/b/e$a;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/e;->e:Lcom/tencent/map/b/e$c;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/e;->f:Lcom/tencent/map/b/e$b;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/map/b/e;->g:Z

    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/tencent/map/b/e;->h:[B

    const/16 v0, 0x400

    iput v0, p0, Lcom/tencent/map/b/e;->i:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/tencent/map/b/e;->j:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/map/b/e;->k:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/map/b/e;->l:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/map/b/e;->m:I

    return-void
.end method

.method static synthetic a(Lcom/tencent/map/b/e;I)I
    .locals 1

    iget v0, p0, Lcom/tencent/map/b/e;->i:I

    or-int/2addr v0, p1

    iput v0, p0, Lcom/tencent/map/b/e;->i:I

    return v0
.end method

.method static synthetic a(Lcom/tencent/map/b/e;J)J
    .locals 0

    iput-wide p1, p0, Lcom/tencent/map/b/e;->j:J

    return-wide p1
.end method

.method static synthetic a(Lcom/tencent/map/b/e;Lcom/tencent/map/b/e$b;)Lcom/tencent/map/b/e$b;
    .locals 0

    iput-object p1, p0, Lcom/tencent/map/b/e;->f:Lcom/tencent/map/b/e$b;

    return-object p1
.end method

.method static synthetic a(Lcom/tencent/map/b/e;)V
    .locals 0

    invoke-direct {p0}, Lcom/tencent/map/b/e;->b()V

    return-void
.end method

.method static synthetic b(Lcom/tencent/map/b/e;)I
    .locals 1

    iget v0, p0, Lcom/tencent/map/b/e;->l:I

    return v0
.end method

.method static synthetic b(Lcom/tencent/map/b/e;I)I
    .locals 0

    iput p1, p0, Lcom/tencent/map/b/e;->l:I

    return p1
.end method

.method private b()V
    .locals 4

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/map/b/e;->m:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/map/b/e;->l:I

    sget-object v0, Lcom/tencent/map/b/e;->b:Landroid/location/LocationManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->getGpsStatus(Landroid/location/GpsStatus;)Landroid/location/GpsStatus;

    move-result-object v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    invoke-virtual {v2}, Landroid/location/GpsStatus;->getMaxSatellites()I

    move-result v3

    invoke-virtual {v2}, Landroid/location/GpsStatus;->getSatellites()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    if-nez v2, :cond_1

    return-void

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/tencent/map/b/e;->l:I

    if-gt v0, v3, :cond_2

    iget v0, p0, Lcom/tencent/map/b/e;->l:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/tencent/map/b/e;->l:I

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/GpsSatellite;

    invoke-virtual {v0}, Landroid/location/GpsSatellite;->usedInFix()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/tencent/map/b/e;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/tencent/map/b/e;->m:I

    goto :goto_0

    :cond_2
    return-void
.end method

.method static synthetic c(Lcom/tencent/map/b/e;)I
    .locals 1

    iget v0, p0, Lcom/tencent/map/b/e;->m:I

    return v0
.end method

.method static synthetic c(Lcom/tencent/map/b/e;I)I
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/map/b/e;->m:I

    const/4 v0, 0x0

    return v0
.end method

.method static synthetic d(Lcom/tencent/map/b/e;)I
    .locals 1

    iget v0, p0, Lcom/tencent/map/b/e;->i:I

    return v0
.end method

.method static synthetic d(Lcom/tencent/map/b/e;I)I
    .locals 0

    iput p1, p0, Lcom/tencent/map/b/e;->i:I

    return p1
.end method

.method static synthetic e(Lcom/tencent/map/b/e;)J
    .locals 2

    iget-wide v0, p0, Lcom/tencent/map/b/e;->j:J

    return-wide v0
.end method

.method static synthetic f(Lcom/tencent/map/b/e;)Lcom/tencent/map/b/e$c;
    .locals 1

    iget-object v0, p0, Lcom/tencent/map/b/e;->e:Lcom/tencent/map/b/e$c;

    return-object v0
.end method

.method static synthetic g(Lcom/tencent/map/b/e;)Lcom/tencent/map/b/e$b;
    .locals 1

    iget-object v0, p0, Lcom/tencent/map/b/e;->f:Lcom/tencent/map/b/e$b;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v2, p0, Lcom/tencent/map/b/e;->h:[B

    monitor-enter v2

    :try_start_0
    iget-boolean v0, p0, Lcom/tencent/map/b/e;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit v2

    return-void

    :cond_0
    :try_start_1
    sget-object v0, Lcom/tencent/map/b/e;->b:Landroid/location/LocationManager;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/map/b/e;->c:Lcom/tencent/map/b/e$a;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/tencent/map/b/e;->b:Landroid/location/LocationManager;

    iget-object v1, p0, Lcom/tencent/map/b/e;->c:Lcom/tencent/map/b/e$a;

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeGpsStatusListener(Landroid/location/GpsStatus$Listener;)V

    sget-object v0, Lcom/tencent/map/b/e;->b:Landroid/location/LocationManager;

    iget-object v1, p0, Lcom/tencent/map/b/e;->c:Lcom/tencent/map/b/e$a;

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/map/b/e;->g:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v2

    return-void

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method public final a(Lcom/tencent/map/b/e$c;Landroid/content/Context;)Z
    .locals 7

    iget-object v6, p0, Lcom/tencent/map/b/e;->h:[B

    monitor-enter v6

    :try_start_0
    iget-boolean v0, p0, Lcom/tencent/map/b/e;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit v6

    const/4 v0, 0x1

    return v0

    :cond_0
    if-eqz p2, :cond_1

    if-nez p1, :cond_2

    :cond_1
    monitor-exit v6

    const/4 v0, 0x0

    return v0

    :cond_2
    :try_start_1
    iput-object p2, p0, Lcom/tencent/map/b/e;->a:Landroid/content/Context;

    iput-object p1, p0, Lcom/tencent/map/b/e;->e:Lcom/tencent/map/b/e$c;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v0, p0, Lcom/tencent/map/b/e;->a:Landroid/content/Context;

    const-string v1, "location"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    sput-object v0, Lcom/tencent/map/b/e;->b:Landroid/location/LocationManager;

    new-instance v0, Lcom/tencent/map/b/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/tencent/map/b/e$a;-><init>(Lcom/tencent/map/b/e;B)V

    iput-object v0, p0, Lcom/tencent/map/b/e;->c:Lcom/tencent/map/b/e$a;

    sget-object v0, Lcom/tencent/map/b/e;->b:Landroid/location/LocationManager;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/tencent/map/b/e;->c:Lcom/tencent/map/b/e$a;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v0, :cond_4

    :cond_3
    monitor-exit v6

    const/4 v0, 0x0

    return v0

    :cond_4
    goto :goto_0

    :catch_0
    monitor-exit v6

    const/4 v0, 0x0

    return v0

    :goto_0
    :try_start_3
    sget-object v0, Lcom/tencent/map/b/e;->b:Landroid/location/LocationManager;

    const-string v1, "gps"

    iget-object v5, p0, Lcom/tencent/map/b/e;->c:Lcom/tencent/map/b/e$a;

    const-wide/16 v2, 0x3e8

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V

    sget-object v0, Lcom/tencent/map/b/e;->b:Landroid/location/LocationManager;

    iget-object v1, p0, Lcom/tencent/map/b/e;->c:Lcom/tencent/map/b/e$a;

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->addGpsStatusListener(Landroid/location/GpsStatus$Listener;)Z

    sget-object v0, Lcom/tencent/map/b/e;->b:Landroid/location/LocationManager;

    const-string v1, "gps"

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x4

    iput v0, p0, Lcom/tencent/map/b/e;->i:I

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/map/b/e;->i:I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :catch_1
    monitor-exit v6

    const/4 v0, 0x0

    return v0

    :goto_1
    const/4 v0, 0x1

    :try_start_4
    iput-boolean v0, p0, Lcom/tencent/map/b/e;->g:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit v6

    goto :goto_2

    :catchall_0
    move-exception p1

    monitor-exit v6

    throw p1

    :goto_2
    iget-boolean v0, p0, Lcom/tencent/map/b/e;->g:Z

    return v0
.end method
