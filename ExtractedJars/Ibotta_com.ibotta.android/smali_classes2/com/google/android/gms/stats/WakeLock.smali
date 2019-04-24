.class public Lcom/google/android/gms/stats/WakeLock;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/stats/WakeLock$HeldLock;,
        Lcom/google/android/gms/stats/WakeLock$Configuration;
    }
.end annotation

.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# static fields
.field private static zzaeg:Ljava/util/concurrent/ScheduledExecutorService;

.field private static zzaeh:Lcom/google/android/gms/stats/WakeLock$Configuration;


# instance fields
.field private final zzadv:Landroid/os/PowerManager$WakeLock;

.field private zzadw:Landroid/os/WorkSource;

.field private zzadx:Ljava/lang/String;

.field private final zzady:I

.field private final zzadz:Ljava/lang/String;

.field private final zzaea:Ljava/lang/String;

.field private final zzaeb:Ljava/lang/String;

.field private zzaec:Z

.field private final zzaed:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private zzaee:I

.field private zzaef:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final zzjp:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/stats/zza;

    invoke-direct {v0}, Lcom/google/android/gms/stats/zza;-><init>()V

    sput-object v0, Lcom/google/android/gms/stats/WakeLock;->zzaeh:Lcom/google/android/gms/stats/WakeLock$Configuration;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILjava/lang/String;)V
    .locals 7
    .param p3    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    if-nez p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    :goto_0
    move-object v6, v0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/stats/WakeLock;-><init>(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;)V
    .locals 7
    .param p3    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    :goto_0
    move-object v6, v0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/stats/WakeLock;-><init>(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7
    .param p3    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnwrappedWakeLock"
        }
    .end annotation

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/stats/WakeLock;-><init>(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p3    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnwrappedWakeLock"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/stats/WakeLock;->zzaec:Z

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/stats/WakeLock;->zzaed:Ljava/util/Map;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/stats/WakeLock;->zzaef:Ljava/util/concurrent/atomic/AtomicInteger;

    const-string v0, "Wake lock name can NOT be empty"

    invoke-static {p3, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    iput p2, p0, Lcom/google/android/gms/stats/WakeLock;->zzady:I

    iput-object p4, p0, Lcom/google/android/gms/stats/WakeLock;->zzaea:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/stats/WakeLock;->zzaeb:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p4

    iput-object p4, p0, Lcom/google/android/gms/stats/WakeLock;->zzjp:Landroid/content/Context;

    const-string p4, "com.google.android.gms"

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_1

    const-string p4, "*gcore*:"

    invoke-static {p4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p4

    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p4}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object p4, v0

    :goto_0
    iput-object p4, p0, Lcom/google/android/gms/stats/WakeLock;->zzadz:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/google/android/gms/stats/WakeLock;->zzadz:Ljava/lang/String;

    :goto_1
    const-string p4, "power"

    invoke-virtual {p1, p4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/os/PowerManager;

    invoke-virtual {p4, p2, p3}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/stats/WakeLock;->zzadv:Landroid/os/PowerManager$WakeLock;

    invoke-static {p1}, Lcom/google/android/gms/common/util/WorkSourceUtil;->hasWorkSourcePermission(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-static {p5}, Lcom/google/android/gms/common/util/Strings;->isEmptyOrWhitespace(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p5

    :cond_2
    sget-object p2, Lcom/google/android/gms/stats/WakeLock;->zzaeh:Lcom/google/android/gms/stats/WakeLock$Configuration;

    invoke-interface {p2}, Lcom/google/android/gms/stats/WakeLock$Configuration;->isWorkChainsEnabled()Z

    move-result p2

    if-eqz p2, :cond_3

    if-eqz p5, :cond_3

    if-eqz p6, :cond_3

    const-string p2, "WakeLock"

    invoke-static {p5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p3

    add-int/lit8 p3, p3, 0x2a

    invoke-static {p6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result p4

    add-int/2addr p3, p4

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p3, "Using experimental Pi WorkSource chains: "

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ","

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iput-object p5, p0, Lcom/google/android/gms/stats/WakeLock;->zzadx:Ljava/lang/String;

    invoke-static {p1, p5, p6}, Lcom/google/android/gms/common/util/WorkSourceUtil;->fromPackageAndModuleExperimentalPi(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/os/WorkSource;

    move-result-object p1

    goto :goto_2

    :cond_3
    invoke-static {p1, p5}, Lcom/google/android/gms/common/util/WorkSourceUtil;->fromPackage(Landroid/content/Context;Ljava/lang/String;)Landroid/os/WorkSource;

    move-result-object p1

    :goto_2
    iput-object p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzadw:Landroid/os/WorkSource;

    iget-object p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzadw:Landroid/os/WorkSource;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/stats/WakeLock;->addWorkSource(Landroid/os/WorkSource;)V

    :cond_4
    sget-object p1, Lcom/google/android/gms/stats/WakeLock;->zzaeg:Ljava/util/concurrent/ScheduledExecutorService;

    if-nez p1, :cond_5

    invoke-static {}, Lcom/google/android/gms/common/providers/PooledExecutorsProvider;->getInstance()Lcom/google/android/gms/common/providers/PooledExecutorsProvider$PooledExecutorFactory;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/common/providers/PooledExecutorsProvider$PooledExecutorFactory;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    sput-object p1, Lcom/google/android/gms/stats/WakeLock;->zzaeg:Ljava/util/concurrent/ScheduledExecutorService;

    :cond_5
    return-void
.end method

.method public static setConfiguration(Lcom/google/android/gms/stats/WakeLock$Configuration;)V
    .locals 0

    sput-object p0, Lcom/google/android/gms/stats/WakeLock;->zzaeh:Lcom/google/android/gms/stats/WakeLock$Configuration;

    return-void
.end method

.method private final zza(Landroid/os/WorkSource;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/stats/WakeLock;->zzadv:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0, p1}, Landroid/os/PowerManager$WakeLock;->setWorkSource(Landroid/os/WorkSource;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    const-string v0, "WakeLock"

    invoke-virtual {p1}, Ljava/lang/RuntimeException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/stats/WakeLock;I)V
    .locals 0

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/google/android/gms/stats/WakeLock;->zzn(I)V

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/stats/WakeLock;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/stats/WakeLock;->zzc(Ljava/lang/String;I)V

    return-void
.end method

.method private final zza(Ljava/lang/String;J)V
    .locals 12
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WakelockTimeout"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/stats/WakeLock;->zzn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    monitor-enter p0

    :try_start_0
    iget-object p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzaed:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzaee:I

    if-lez p1, :cond_1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzadv:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {p1}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzaed:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    iput v0, p0, Lcom/google/android/gms/stats/WakeLock;->zzaee:I

    :cond_1
    iget-boolean p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzaec:Z

    const/4 v11, 0x1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzaed:Ljava/util/Map;

    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Integer;

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzaed:Ljava/util/Map;

    new-array v1, v11, [Ljava/lang/Integer;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v0

    invoke-interface {p1, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    aget-object v1, p1, v0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/2addr v1, v11

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, p1, v0

    :goto_0
    if-nez v0, :cond_4

    :cond_3
    iget-boolean p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzaec:Z

    if-nez p1, :cond_5

    iget p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzaee:I

    if-nez p1, :cond_5

    :cond_4
    invoke-static {}, Lcom/google/android/gms/common/stats/WakeLockTracker;->getInstance()Lcom/google/android/gms/common/stats/WakeLockTracker;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/stats/WakeLock;->zzjp:Landroid/content/Context;

    iget-object p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzadv:Landroid/os/PowerManager$WakeLock;

    invoke-static {p1, v5}, Lcom/google/android/gms/common/stats/StatsUtils;->getEventKey(Landroid/os/PowerManager$WakeLock;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x7

    iget-object v4, p0, Lcom/google/android/gms/stats/WakeLock;->zzadz:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/stats/WakeLock;->zzaeb:Ljava/lang/String;

    iget v7, p0, Lcom/google/android/gms/stats/WakeLock;->zzady:I

    invoke-direct {p0}, Lcom/google/android/gms/stats/WakeLock;->zzdo()Ljava/util/List;

    move-result-object v8

    move-wide v9, p2

    invoke-virtual/range {v0 .. v10}, Lcom/google/android/gms/common/stats/WakeLockTracker;->registerEvent(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;J)V

    iget p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzaee:I

    add-int/2addr p1, v11

    iput p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzaee:I

    :cond_5
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzadv:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {p1}, Landroid/os/PowerManager$WakeLock;->acquire()V

    const-wide/16 v0, 0x0

    cmp-long p1, p2, v0

    if-lez p1, :cond_7

    sget-object p1, Lcom/google/android/gms/stats/WakeLock;->zzaeg:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v0, Lcom/google/android/gms/stats/zzb;

    invoke-direct {v0, p0}, Lcom/google/android/gms/stats/zzb;-><init>(Lcom/google/android/gms/stats/WakeLock;)V

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, v0, p2, p3, v1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    invoke-static {}, Lcom/google/android/gms/common/util/PlatformVersion;->isAtLeastIceCreamSandwich()Z

    move-result p1

    if-nez p1, :cond_7

    iget-boolean p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzaec:Z

    if-eqz p1, :cond_7

    const-string p1, "WakeLock"

    const-string p2, "Do not acquire with timeout on reference counted wakeLocks before ICS. wakelock: "

    iget-object p3, p0, Lcom/google/android/gms/stats/WakeLock;->zzadz:Ljava/lang/String;

    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p2, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_6
    new-instance p3, Ljava/lang/String;

    invoke-direct {p3, p2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object p2, p3

    :goto_1
    invoke-static {p1, p2}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private final zzb(Ljava/lang/String;I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/stats/WakeLock;->zzaef:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "WakeLock"

    const-string v1, "release without a matched acquire!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/stats/WakeLock;->zzc(Ljava/lang/String;I)V

    return-void
.end method

.method private final zzc(Ljava/lang/String;I)V
    .locals 10

    invoke-direct {p0, p1}, Lcom/google/android/gms/stats/WakeLock;->zzn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    monitor-enter p0

    :try_start_0
    iget-boolean p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzaec:Z

    const/4 v9, 0x1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzaed:Ljava/util/Map;

    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Integer;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    aget-object v1, p1, v0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v9, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzaed:Ljava/util/Map;

    invoke-interface {p1, v5}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    aget-object v1, p1, v0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    sub-int/2addr v1, v9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, p1, v0

    :goto_0
    if-nez v0, :cond_3

    :cond_2
    iget-boolean p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzaec:Z

    if-nez p1, :cond_4

    iget p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzaee:I

    if-ne p1, v9, :cond_4

    :cond_3
    invoke-static {}, Lcom/google/android/gms/common/stats/WakeLockTracker;->getInstance()Lcom/google/android/gms/common/stats/WakeLockTracker;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/stats/WakeLock;->zzjp:Landroid/content/Context;

    iget-object p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzadv:Landroid/os/PowerManager$WakeLock;

    invoke-static {p1, v5}, Lcom/google/android/gms/common/stats/StatsUtils;->getEventKey(Landroid/os/PowerManager$WakeLock;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x8

    iget-object v4, p0, Lcom/google/android/gms/stats/WakeLock;->zzadz:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/stats/WakeLock;->zzaeb:Ljava/lang/String;

    iget v7, p0, Lcom/google/android/gms/stats/WakeLock;->zzady:I

    invoke-direct {p0}, Lcom/google/android/gms/stats/WakeLock;->zzdo()Ljava/util/List;

    move-result-object v8

    invoke-virtual/range {v0 .. v8}, Lcom/google/android/gms/common/stats/WakeLockTracker;->registerEvent(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V

    iget p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzaee:I

    sub-int/2addr p1, v9

    iput p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzaee:I

    :cond_4
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-direct {p0, p2}, Lcom/google/android/gms/stats/WakeLock;->zzn(I)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private final zzdo()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/stats/WakeLock;->zzadw:Landroid/os/WorkSource;

    invoke-static {v0}, Lcom/google/android/gms/common/util/WorkSourceUtil;->getNames(Landroid/os/WorkSource;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/stats/WakeLock;->zzadx:Ljava/lang/String;

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v0, p0, Lcom/google/android/gms/stats/WakeLock;->zzadx:Ljava/lang/String;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v1
.end method

.method private final zzn(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/stats/WakeLock;->zzaec:Z

    if-eqz v0, :cond_1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzaea:Ljava/lang/String;

    return-object p1

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzaea:Ljava/lang/String;

    return-object p1
.end method

.method private final zzn(I)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/stats/WakeLock;->zzadv:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    if-lez p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/stats/WakeLock;->zzadv:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0, p1}, Landroid/os/PowerManager$WakeLock;->release(I)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzadv:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {p1}, Landroid/os/PowerManager$WakeLock;->release()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "WakeLock"

    iget-object v1, p0, Lcom/google/android/gms/stats/WakeLock;->zzadz:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, " was already released!"

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void

    :cond_1
    throw p1

    :cond_2
    return-void
.end method


# virtual methods
.method public acquire()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/stats/WakeLock;->zzaef:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/stats/WakeLock;->zza(Ljava/lang/String;J)V

    return-void
.end method

.method public acquire(J)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/stats/WakeLock;->zzaef:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/stats/WakeLock;->zza(Ljava/lang/String;J)V

    return-void
.end method

.method public acquire(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/stats/WakeLock;->zzaef:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    const-wide/16 v0, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/gms/stats/WakeLock;->zza(Ljava/lang/String;J)V

    return-void
.end method

.method public acquire(Ljava/lang/String;J)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/stats/WakeLock;->zzaef:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/stats/WakeLock;->zza(Ljava/lang/String;J)V

    return-void
.end method

.method public acquireLock(JLjava/lang/String;)Lcom/google/android/gms/stats/WakeLock$HeldLock;
    .locals 3

    sget-object v0, Lcom/google/android/gms/stats/WakeLock;->zzaeh:Lcom/google/android/gms/stats/WakeLock$Configuration;

    iget-object v1, p0, Lcom/google/android/gms/stats/WakeLock;->zzadz:Ljava/lang/String;

    invoke-interface {v0, v1, p3}, Lcom/google/android/gms/stats/WakeLock$Configuration;->getMaximumTimeout(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    new-instance v0, Lcom/google/android/gms/stats/WakeLock$HeldLock;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p3, v1}, Lcom/google/android/gms/stats/WakeLock$HeldLock;-><init>(Lcom/google/android/gms/stats/WakeLock;Ljava/lang/String;Lcom/google/android/gms/stats/zza;)V

    const-wide/16 v1, 0x0

    invoke-direct {p0, p3, v1, v2}, Lcom/google/android/gms/stats/WakeLock;->zza(Ljava/lang/String;J)V

    new-instance p3, Ljava/lang/ref/WeakReference;

    invoke-direct {p3, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sget-object v1, Lcom/google/android/gms/stats/WakeLock;->zzaeg:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lcom/google/android/gms/stats/zzc;

    invoke-direct {v2, p3}, Lcom/google/android/gms/stats/zzc;-><init>(Ljava/lang/ref/WeakReference;)V

    sget-object p3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v2, p1, p2, p3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/google/android/gms/stats/WakeLock$HeldLock;->zza(Lcom/google/android/gms/stats/WakeLock$HeldLock;Ljava/util/concurrent/Future;)Ljava/util/concurrent/Future;

    return-object v0
.end method

.method public addWorkSource(Landroid/os/WorkSource;)V
    .locals 1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/stats/WakeLock;->zzjp:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/common/util/WorkSourceUtil;->hasWorkSourcePermission(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/stats/WakeLock;->zzadw:Landroid/os/WorkSource;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/os/WorkSource;->add(Landroid/os/WorkSource;)Z

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzadw:Landroid/os/WorkSource;

    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzadw:Landroid/os/WorkSource;

    invoke-direct {p0, p1}, Lcom/google/android/gms/stats/WakeLock;->zza(Landroid/os/WorkSource;)V

    :cond_1
    return-void
.end method

.method public getWakeLock()Landroid/os/PowerManager$WakeLock;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/stats/WakeLock;->zzadv:Landroid/os/PowerManager$WakeLock;

    return-object v0
.end method

.method public isHeld()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/stats/WakeLock;->zzadv:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    return v0
.end method

.method public release()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/stats/WakeLock;->zzb(Ljava/lang/String;I)V

    return-void
.end method

.method public release(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/stats/WakeLock;->zzb(Ljava/lang/String;I)V

    return-void
.end method

.method public release(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/stats/WakeLock;->zzb(Ljava/lang/String;I)V

    return-void
.end method

.method public release(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/stats/WakeLock;->zzb(Ljava/lang/String;I)V

    return-void
.end method

.method public removeWorkSource(Landroid/os/WorkSource;)V
    .locals 1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/stats/WakeLock;->zzjp:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/common/util/WorkSourceUtil;->hasWorkSourcePermission(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/stats/WakeLock;->zzadw:Landroid/os/WorkSource;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/stats/WakeLock;->zzadw:Landroid/os/WorkSource;

    invoke-virtual {v0, p1}, Landroid/os/WorkSource;->remove(Landroid/os/WorkSource;)Z

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzadw:Landroid/os/WorkSource;

    invoke-direct {p0, p1}, Lcom/google/android/gms/stats/WakeLock;->zza(Landroid/os/WorkSource;)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "WakeLock"

    invoke-virtual {p1}, Ljava/lang/ArrayIndexOutOfBoundsException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    return-void
.end method

.method public setReferenceCounted(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/stats/WakeLock;->zzadv:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0, p1}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    iput-boolean p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzaec:Z

    return-void
.end method

.method public setWorkSource(Landroid/os/WorkSource;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/stats/WakeLock;->zzjp:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/common/util/WorkSourceUtil;->hasWorkSourcePermission(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/google/android/gms/stats/WakeLock;->zza(Landroid/os/WorkSource;)V

    iput-object p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzadw:Landroid/os/WorkSource;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/stats/WakeLock;->zzadx:Ljava/lang/String;

    :cond_0
    return-void
.end method
