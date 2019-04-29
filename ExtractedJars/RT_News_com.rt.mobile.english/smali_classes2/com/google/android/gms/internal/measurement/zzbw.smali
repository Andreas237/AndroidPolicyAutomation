.class abstract Lcom/google/android/gms/internal/measurement/zzbw;
.super Ljava/lang/Object;


# static fields
.field private static volatile handler:Landroid/os/Handler;


# instance fields
.field private final zzvn:Lcom/google/android/gms/internal/measurement/zzat;

.field private final zzyd:Ljava/lang/Runnable;

.field private volatile zzye:J


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzat;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzbw;->zzvn:Lcom/google/android/gms/internal/measurement/zzat;

    new-instance p1, Lcom/google/android/gms/internal/measurement/zzbx;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/measurement/zzbx;-><init>(Lcom/google/android/gms/internal/measurement/zzbw;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzbw;->zzyd:Ljava/lang/Runnable;

    return-void
.end method

.method private final getHandler()Landroid/os/Handler;
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzbw;->handler:Landroid/os/Handler;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzbw;->handler:Landroid/os/Handler;

    return-object v0

    :cond_0
    const-class v0, Lcom/google/android/gms/internal/measurement/zzbw;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzbw;->handler:Landroid/os/Handler;

    if-nez v1, :cond_1

    new-instance v1, Landroid/os/Handler;

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzbw;->zzvn:Lcom/google/android/gms/internal/measurement/zzat;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzat;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v1, Lcom/google/android/gms/internal/measurement/zzbw;->handler:Landroid/os/Handler;

    :cond_1
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzbw;->handler:Landroid/os/Handler;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/measurement/zzbw;J)J
    .locals 0

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lcom/google/android/gms/internal/measurement/zzbw;->zzye:J

    return-wide p1
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/measurement/zzbw;)Lcom/google/android/gms/internal/measurement/zzat;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zzbw;->zzvn:Lcom/google/android/gms/internal/measurement/zzat;

    return-object p0
.end method


# virtual methods
.method public final cancel()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzbw;->zzye:J

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzbw;->getHandler()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzbw;->zzyd:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public abstract run()V
.end method

.method public final zzee()J
    .locals 6

    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzbw;->zzye:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-wide v2

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbw;->zzvn:Lcom/google/android/gms/internal/measurement/zzat;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/gms/internal/measurement/zzbw;->zzye:J

    sub-long v4, v0, v2

    invoke-static {v4, v5}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzef()Z
    .locals 5

    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzbw;->zzye:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzh(J)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzbw;->cancel()V

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbw;->zzvn:Lcom/google/android/gms/internal/measurement/zzat;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzbw;->zzye:J

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzbw;->getHandler()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzbw;->zzyd:Ljava/lang/Runnable;

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbw;->zzvn:Lcom/google/android/gms/internal/measurement/zzat;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zzbu()Lcom/google/android/gms/internal/measurement/zzcm;

    move-result-object v0

    const-string v1, "Failed to schedule delayed post. time"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zze(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final zzi(J)V
    .locals 8

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzbw;->zzef()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gez v2, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzbw;->cancel()V

    return-void

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzbw;->zzvn:Lcom/google/android/gms/internal/measurement/zzat;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzat;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/google/android/gms/internal/measurement/zzbw;->zzye:J

    sub-long v6, v2, v4

    invoke-static {v6, v7}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    sub-long v4, p1, v2

    cmp-long p1, v4, v0

    if-gez p1, :cond_2

    goto :goto_0

    :cond_2
    move-wide v0, v4

    :goto_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzbw;->getHandler()Landroid/os/Handler;

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzbw;->zzyd:Ljava/lang/Runnable;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzbw;->getHandler()Landroid/os/Handler;

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzbw;->zzyd:Ljava/lang/Runnable;

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzbw;->zzvn:Lcom/google/android/gms/internal/measurement/zzat;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzat;->zzbu()Lcom/google/android/gms/internal/measurement/zzcm;

    move-result-object p1

    const-string p2, "Failed to adjust delayed post. time"

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/google/android/gms/internal/measurement/zzaq;->zze(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_3
    return-void
.end method
