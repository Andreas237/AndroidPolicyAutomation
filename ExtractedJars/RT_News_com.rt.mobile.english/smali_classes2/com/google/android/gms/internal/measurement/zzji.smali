.class public final Lcom/google/android/gms/internal/measurement/zzji;
.super Lcom/google/android/gms/internal/measurement/zzhi;


# instance fields
.field private handler:Landroid/os/Handler;

.field private zzaqd:J
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation
.end field

.field private final zzaqe:Lcom/google/android/gms/internal/measurement/zzeo;

.field private final zzaqf:Lcom/google/android/gms/internal/measurement/zzeo;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzgm;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzhi;-><init>(Lcom/google/android/gms/internal/measurement/zzgm;)V

    new-instance p1, Lcom/google/android/gms/internal/measurement/zzjj;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzji;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-direct {p1, p0, v0}, Lcom/google/android/gms/internal/measurement/zzjj;-><init>(Lcom/google/android/gms/internal/measurement/zzji;Lcom/google/android/gms/internal/measurement/zzhj;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzji;->zzaqe:Lcom/google/android/gms/internal/measurement/zzeo;

    new-instance p1, Lcom/google/android/gms/internal/measurement/zzjk;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzji;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-direct {p1, p0, v0}, Lcom/google/android/gms/internal/measurement/zzjk;-><init>(Lcom/google/android/gms/internal/measurement/zzji;Lcom/google/android/gms/internal/measurement/zzhj;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzji;->zzaqf:Lcom/google/android/gms/internal/measurement/zzeo;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzji;->zzaqd:J

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/measurement/zzji;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzji;->zzkt()V

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/measurement/zzji;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzji;->zzaf(J)V

    return-void
.end method

.method private final zzaf(J)V
    .locals 7
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzji;->zzkr()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzji;->zzaqe:Lcom/google/android/gms/internal/measurement/zzeo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzeo;->cancel()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzji;->zzaqf:Lcom/google/android/gms/internal/measurement/zzeo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzeo;->cancel()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Activity resumed, time"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    iput-wide p1, p0, Lcom/google/android/gms/internal/measurement/zzji;->zzaqd:J

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide p1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzfs;->zzaks:Lcom/google/android/gms/internal/measurement/zzfv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfv;->get()J

    move-result-wide v0

    sub-long v2, p1, v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object p1

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzfs;->zzaku:Lcom/google/android/gms/internal/measurement/zzfv;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfv;->get()J

    move-result-wide p1

    cmp-long v0, v2, p1

    const-wide/16 p1, 0x0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzfs;->zzakt:Lcom/google/android/gms/internal/measurement/zzfu;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfu;->set(Z)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzfs;->zzakv:Lcom/google/android/gms/internal/measurement/zzfv;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzfv;->set(J)V

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzfs;->zzakt:Lcom/google/android/gms/internal/measurement/zzfu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfu;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzji;->zzaqe:Lcom/google/android/gms/internal/measurement/zzeo;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/zzfs;->zzakr:Lcom/google/android/gms/internal/measurement/zzfv;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfv;->get()J

    move-result-wide v1

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v3

    iget-object v3, v3, Lcom/google/android/gms/internal/measurement/zzfs;->zzakv:Lcom/google/android/gms/internal/measurement/zzfv;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfv;->get()J

    move-result-wide v3

    sub-long v5, v1, v3

    invoke-static {p1, p2, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzeo;->zzh(J)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzji;->zzaqf:Lcom/google/android/gms/internal/measurement/zzeo;

    const-wide/32 v1, 0x36ee80

    goto :goto_0
.end method

.method private final zzag(J)V
    .locals 7
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzji;->zzkr()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzji;->zzaqe:Lcom/google/android/gms/internal/measurement/zzeo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzeo;->cancel()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzji;->zzaqf:Lcom/google/android/gms/internal/measurement/zzeo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzeo;->cancel()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Activity paused, time"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzji;->zzaqd:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzfs;->zzakv:Lcom/google/android/gms/internal/measurement/zzfv;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/zzfs;->zzakv:Lcom/google/android/gms/internal/measurement/zzfv;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfv;->get()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/google/android/gms/internal/measurement/zzji;->zzaqd:J

    sub-long v5, p1, v3

    add-long p1, v1, v5

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzfv;->set(J)V

    :cond_0
    return-void
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/measurement/zzji;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzji;->zzag(J)V

    return-void
.end method

.method private final zzkr()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzji;->handler:Landroid/os/Handler;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzji;->handler:Landroid/os/Handler;

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private final zzkt()V
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/zzji;->zzl(Z)Z

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzfu()Lcom/google/android/gms/internal/measurement/zzdu;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzdu;->zzk(J)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic getContext()Landroid/content/Context;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzab()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzab()V

    return-void
.end method

.method public final bridge synthetic zzbt()Lcom/google/android/gms/common/util/Clock;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzfr()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzfr()V

    return-void
.end method

.method public final bridge synthetic zzfs()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzfs()V

    return-void
.end method

.method public final bridge synthetic zzft()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzft()V

    return-void
.end method

.method public final bridge synthetic zzfu()Lcom/google/android/gms/internal/measurement/zzdu;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzfu()Lcom/google/android/gms/internal/measurement/zzdu;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzfv()Lcom/google/android/gms/internal/measurement/zzhl;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzfv()Lcom/google/android/gms/internal/measurement/zzhl;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzfw()Lcom/google/android/gms/internal/measurement/zzfc;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzfw()Lcom/google/android/gms/internal/measurement/zzfc;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzfx()Lcom/google/android/gms/internal/measurement/zzeq;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzfx()Lcom/google/android/gms/internal/measurement/zzeq;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzfy()Lcom/google/android/gms/internal/measurement/zzij;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzfy()Lcom/google/android/gms/internal/measurement/zzij;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzfz()Lcom/google/android/gms/internal/measurement/zzig;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzfz()Lcom/google/android/gms/internal/measurement/zzig;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzga()Lcom/google/android/gms/internal/measurement/zzfd;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzga()Lcom/google/android/gms/internal/measurement/zzfd;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzgb()Lcom/google/android/gms/internal/measurement/zzff;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzgc()Lcom/google/android/gms/internal/measurement/zzkc;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzgd()Lcom/google/android/gms/internal/measurement/zzji;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzgd()Lcom/google/android/gms/internal/measurement/zzji;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzge()Lcom/google/android/gms/internal/measurement/zzgh;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzge()Lcom/google/android/gms/internal/measurement/zzgh;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzgf()Lcom/google/android/gms/internal/measurement/zzfh;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzgg()Lcom/google/android/gms/internal/measurement/zzfs;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzgh()Lcom/google/android/gms/internal/measurement/zzeg;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzgh()Lcom/google/android/gms/internal/measurement/zzeg;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzgi()Lcom/google/android/gms/internal/measurement/zzec;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzgi()Lcom/google/android/gms/internal/measurement/zzec;

    move-result-object v0

    return-object v0
.end method

.method protected final zzhh()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method final zzks()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzji;->zzaqe:Lcom/google/android/gms/internal/measurement/zzeo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzeo;->cancel()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzji;->zzaqf:Lcom/google/android/gms/internal/measurement/zzeo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzeo;->cancel()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzji;->zzaqd:J

    return-void
.end method

.method public final zzl(Z)Z
    .locals 10
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzch()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/internal/measurement/zzfs;->zzaku:Lcom/google/android/gms/internal/measurement/zzfv;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/measurement/zzfv;->set(J)V

    iget-wide v2, p0, Lcom/google/android/gms/internal/measurement/zzji;->zzaqd:J

    sub-long v4, v0, v2

    if-nez p1, :cond_0

    const-wide/16 v2, 0x3e8

    cmp-long p1, v4, v2

    if-gez p1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p1

    const-string v0, "Screen exposed for less than 1000 ms. Event not sent. time"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object p1

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzfs;->zzakv:Lcom/google/android/gms/internal/measurement/zzfv;

    invoke-virtual {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/zzfv;->set(J)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p1

    const-string v2, "Recording user engagement, ms"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "_et"

    invoke-virtual {p1, v2, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzfz()Lcom/google/android/gms/internal/measurement/zzig;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzig;->zzkk()Lcom/google/android/gms/internal/measurement/zzif;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v2, p1, v3}, Lcom/google/android/gms/internal/measurement/zzig;->zza(Lcom/google/android/gms/internal/measurement/zzif;Landroid/os/Bundle;Z)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzfv()Lcom/google/android/gms/internal/measurement/zzhl;

    move-result-object v2

    const-string v4, "auto"

    const-string v5, "_e"

    invoke-virtual {v2, v4, v5, p1}, Lcom/google/android/gms/internal/measurement/zzhl;->logEvent(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzji;->zzaqd:J

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzji;->zzaqf:Lcom/google/android/gms/internal/measurement/zzeo;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzeo;->cancel()V

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzji;->zzaqf:Lcom/google/android/gms/internal/measurement/zzeo;

    const-wide/16 v0, 0x0

    const-wide/32 v4, 0x36ee80

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/internal/measurement/zzfs;->zzakv:Lcom/google/android/gms/internal/measurement/zzfv;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfv;->get()J

    move-result-wide v6

    sub-long v8, v4, v6

    invoke-static {v0, v1, v8, v9}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/zzeo;->zzh(J)V

    return v3
.end method
