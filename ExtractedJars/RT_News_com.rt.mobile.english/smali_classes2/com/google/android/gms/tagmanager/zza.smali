.class public final Lcom/google/android/gms/tagmanager/zza;
.super Ljava/lang/Object;


# annotations
.annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
.end annotation


# static fields
.field private static zzavh:Ljava/lang/Object;

.field private static zzavi:Lcom/google/android/gms/tagmanager/zza;


# instance fields
.field private volatile closed:Z

.field private volatile zzava:J

.field private volatile zzavb:J

.field private volatile zzavc:J

.field private volatile zzavd:J

.field private final zzave:Ljava/lang/Thread;

.field private final zzavf:Ljava/lang/Object;

.field private zzavg:Lcom/google/android/gms/tagmanager/zzd;

.field private final zzqx:Landroid/content/Context;

.field private final zzro:Lcom/google/android/gms/common/util/Clock;

.field private volatile zzva:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/tagmanager/zza;->zzavh:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/common/util/DefaultClock;->getInstance()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0}, Lcom/google/android/gms/tagmanager/zza;-><init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/zzd;Lcom/google/android/gms/common/util/Clock;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/zzd;Lcom/google/android/gms/common/util/Clock;)V
    .locals 2
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/32 v0, 0xdbba0

    iput-wide v0, p0, Lcom/google/android/gms/tagmanager/zza;->zzava:J

    const-wide/16 v0, 0x7530

    iput-wide v0, p0, Lcom/google/android/gms/tagmanager/zza;->zzavb:J

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/google/android/gms/tagmanager/zza;->closed:Z

    new-instance p2, Ljava/lang/Object;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/tagmanager/zza;->zzavf:Ljava/lang/Object;

    new-instance p2, Lcom/google/android/gms/tagmanager/zzb;

    invoke-direct {p2, p0}, Lcom/google/android/gms/tagmanager/zzb;-><init>(Lcom/google/android/gms/tagmanager/zza;)V

    iput-object p2, p0, Lcom/google/android/gms/tagmanager/zza;->zzavg:Lcom/google/android/gms/tagmanager/zzd;

    iput-object p3, p0, Lcom/google/android/gms/tagmanager/zza;->zzro:Lcom/google/android/gms/common/util/Clock;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zza;->zzqx:Landroid/content/Context;

    iget-object p1, p0, Lcom/google/android/gms/tagmanager/zza;->zzro:Lcom/google/android/gms/common/util/Clock;

    invoke-interface {p1}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/google/android/gms/tagmanager/zza;->zzavc:J

    new-instance p1, Ljava/lang/Thread;

    new-instance p2, Lcom/google/android/gms/tagmanager/zzc;

    invoke-direct {p2, p0}, Lcom/google/android/gms/tagmanager/zzc;-><init>(Lcom/google/android/gms/tagmanager/zza;)V

    invoke-direct {p1, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zza;->zzave:Ljava/lang/Thread;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/tagmanager/zza;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/tagmanager/zza;->zzqx:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic zzb(Lcom/google/android/gms/tagmanager/zza;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zza;->zzmc()V

    return-void
.end method

.method public static zzh(Landroid/content/Context;)Lcom/google/android/gms/tagmanager/zza;
    .locals 2

    sget-object v0, Lcom/google/android/gms/tagmanager/zza;->zzavi:Lcom/google/android/gms/tagmanager/zza;

    if-nez v0, :cond_1

    sget-object v0, Lcom/google/android/gms/tagmanager/zza;->zzavh:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/tagmanager/zza;->zzavi:Lcom/google/android/gms/tagmanager/zza;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/tagmanager/zza;

    invoke-direct {v1, p0}, Lcom/google/android/gms/tagmanager/zza;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/google/android/gms/tagmanager/zza;->zzavi:Lcom/google/android/gms/tagmanager/zza;

    iget-object p0, v1, Lcom/google/android/gms/tagmanager/zza;->zzave:Ljava/lang/Thread;

    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    sget-object p0, Lcom/google/android/gms/tagmanager/zza;->zzavi:Lcom/google/android/gms/tagmanager/zza;

    return-object p0
.end method

.method private final zzlz()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/zza;->closed:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zza;->zzma()V

    const-wide/16 v0, 0x1f4

    invoke-virtual {p0, v0, v1}, Ljava/lang/Object;->wait(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    :cond_0
    :goto_0
    :try_start_1
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private final zzma()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zza;->zzro:Lcom/google/android/gms/common/util/Clock;

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/gms/tagmanager/zza;->zzavc:J

    sub-long v4, v0, v2

    iget-wide v0, p0, Lcom/google/android/gms/tagmanager/zza;->zzavb:J

    cmp-long v2, v4, v0

    if-lez v2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zza;->zzavf:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zza;->zzavf:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zza;->zzro:Lcom/google/android/gms/common/util/Clock;

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/tagmanager/zza;->zzavc:J

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :cond_0
    return-void
.end method

.method private final zzmb()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zza;->zzro:Lcom/google/android/gms/common/util/Clock;

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/gms/tagmanager/zza;->zzavd:J

    sub-long v4, v0, v2

    const-wide/32 v0, 0x36ee80

    cmp-long v2, v4, v0

    if-lez v2, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/zza;->zzva:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    :cond_0
    return-void
.end method

.method private final zzmc()V
    .locals 4

    const/16 v0, 0xa

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    :goto_0
    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/zza;->closed:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zza;->zzavg:Lcom/google/android/gms/tagmanager/zzd;

    invoke-interface {v0}, Lcom/google/android/gms/tagmanager/zzd;->zzmd()Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    move-result-object v0

    if-eqz v0, :cond_0

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/zza;->zzva:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zza;->zzro:Lcom/google/android/gms/common/util/Clock;

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/tagmanager/zza;->zzavd:J

    const-string v0, "Obtained fresh AdvertisingId info from GmsCore."

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzdi;->zzcw(Ljava/lang/String;)V

    :cond_0
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zza;->zzavf:Ljava/lang/Object;

    monitor-enter v0
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zza;->zzavf:Ljava/lang/Object;

    iget-wide v2, p0, Lcom/google/android/gms/tagmanager/zza;->zzava:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/Object;->wait(J)V

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v1
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    const-string v0, "sleep interrupted in AdvertiserDataPoller thread; continuing"

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzdi;->zzcw(Ljava/lang/String;)V

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0

    :cond_1
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/tagmanager/zza;->closed:Z

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zza;->zzave:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method

.method public final isLimitAdTrackingEnabled()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zza;->zzva:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zza;->zzlz()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zza;->zzma()V

    :goto_0
    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zza;->zzmb()V

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zza;->zzva:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    if-nez v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zza;->zzva:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->isLimitAdTrackingEnabled()Z

    move-result v0

    return v0
.end method

.method public final zzly()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zza;->zzva:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zza;->zzlz()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zza;->zzma()V

    :goto_0
    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zza;->zzmb()V

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zza;->zzva:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zza;->zzva:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
