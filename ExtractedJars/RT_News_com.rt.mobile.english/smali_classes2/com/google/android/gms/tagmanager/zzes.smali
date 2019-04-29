.class final Lcom/google/android/gms/tagmanager/zzes;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/zzag;


# instance fields
.field private closed:Z

.field private final zzavt:Ljava/lang/String;

.field private zzawt:Ljava/lang/String;

.field private zzbau:Lcom/google/android/gms/tagmanager/zzdh;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tagmanager/zzdh<",
            "Lcom/google/android/gms/internal/measurement/zzl;",
            ">;"
        }
    .end annotation
.end field

.field private zzbav:Lcom/google/android/gms/tagmanager/zzal;

.field private final zzbax:Ljava/util/concurrent/ScheduledExecutorService;

.field private final zzbay:Lcom/google/android/gms/tagmanager/zzev;

.field private zzbaz:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field private final zzqx:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/tagmanager/zzal;)V
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/tagmanager/zzes;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/tagmanager/zzal;Lcom/google/android/gms/tagmanager/zzew;Lcom/google/android/gms/tagmanager/zzev;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/tagmanager/zzal;Lcom/google/android/gms/tagmanager/zzew;Lcom/google/android/gms/tagmanager/zzev;)V
    .locals 0
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lcom/google/android/gms/tagmanager/zzes;->zzbav:Lcom/google/android/gms/tagmanager/zzal;

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzes;->zzqx:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/tagmanager/zzes;->zzavt:Ljava/lang/String;

    new-instance p1, Lcom/google/android/gms/tagmanager/zzet;

    invoke-direct {p1, p0}, Lcom/google/android/gms/tagmanager/zzet;-><init>(Lcom/google/android/gms/tagmanager/zzes;)V

    invoke-interface {p1}, Lcom/google/android/gms/tagmanager/zzew;->zzoj()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzes;->zzbax:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance p1, Lcom/google/android/gms/tagmanager/zzeu;

    invoke-direct {p1, p0}, Lcom/google/android/gms/tagmanager/zzeu;-><init>(Lcom/google/android/gms/tagmanager/zzes;)V

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzes;->zzbay:Lcom/google/android/gms/tagmanager/zzev;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/tagmanager/zzes;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/tagmanager/zzes;->zzqx:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic zzb(Lcom/google/android/gms/tagmanager/zzes;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/tagmanager/zzes;->zzavt:Ljava/lang/String;

    return-object p0
.end method

.method private final declared-synchronized zzoi()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzes;->closed:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "called method after closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public final declared-synchronized release()V
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zzes;->zzoi()V

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzes;->zzbaz:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzes;->zzbaz:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzes;->zzbax:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzes;->closed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized zza(JLjava/lang/String;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzes;->zzavt:Ljava/lang/String;

    const/16 v1, 0x37

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v1, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "loadAfterDelay: containerId="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " delay="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzdi;->v(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zzes;->zzoi()V

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzes;->zzbau:Lcom/google/android/gms/tagmanager/zzdh;

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "callback must be set before loadAfterDelay() is called."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzes;->zzbaz:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzes;->zzbaz:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzes;->zzbax:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzes;->zzbay:Lcom/google/android/gms/tagmanager/zzev;

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/zzes;->zzbav:Lcom/google/android/gms/tagmanager/zzal;

    invoke-interface {v1, v2}, Lcom/google/android/gms/tagmanager/zzev;->zza(Lcom/google/android/gms/tagmanager/zzal;)Lcom/google/android/gms/tagmanager/zzer;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/zzes;->zzbau:Lcom/google/android/gms/tagmanager/zzdh;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/tagmanager/zzer;->zza(Lcom/google/android/gms/tagmanager/zzdh;)V

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/zzes;->zzawt:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/tagmanager/zzer;->zzcq(Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Lcom/google/android/gms/tagmanager/zzer;->zzdi(Ljava/lang/String;)V

    sget-object p3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, p1, p2, p3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzes;->zzbaz:Ljava/util/concurrent/ScheduledFuture;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized zza(Lcom/google/android/gms/tagmanager/zzdh;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tagmanager/zzdh<",
            "Lcom/google/android/gms/internal/measurement/zzl;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zzes;->zzoi()V

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzes;->zzbau:Lcom/google/android/gms/tagmanager/zzdh;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized zzcq(Ljava/lang/String;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zzes;->zzoi()V

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzes;->zzawt:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
