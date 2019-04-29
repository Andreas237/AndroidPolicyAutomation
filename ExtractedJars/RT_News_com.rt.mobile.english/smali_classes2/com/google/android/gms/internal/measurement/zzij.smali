.class public final Lcom/google/android/gms/internal/measurement/zzij;
.super Lcom/google/android/gms/internal/measurement/zzhi;


# annotations
.annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
.end annotation


# instance fields
.field private final zzapg:Lcom/google/android/gms/internal/measurement/zzix;

.field private zzaph:Lcom/google/android/gms/internal/measurement/zzez;

.field private volatile zzapi:Ljava/lang/Boolean;

.field private final zzapj:Lcom/google/android/gms/internal/measurement/zzeo;

.field private final zzapk:Lcom/google/android/gms/internal/measurement/zzjn;

.field private final zzapl:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private final zzapm:Lcom/google/android/gms/internal/measurement/zzeo;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/internal/measurement/zzgm;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzhi;-><init>(Lcom/google/android/gms/internal/measurement/zzgm;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzij;->zzapl:Ljava/util/List;

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzjn;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzjn;-><init>(Lcom/google/android/gms/common/util/Clock;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzij;->zzapk:Lcom/google/android/gms/internal/measurement/zzjn;

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzix;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/zzix;-><init>(Lcom/google/android/gms/internal/measurement/zzij;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzij;->zzapg:Lcom/google/android/gms/internal/measurement/zzix;

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzik;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/zzik;-><init>(Lcom/google/android/gms/internal/measurement/zzij;Lcom/google/android/gms/internal/measurement/zzhj;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzij;->zzapj:Lcom/google/android/gms/internal/measurement/zzeo;

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzip;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/zzip;-><init>(Lcom/google/android/gms/internal/measurement/zzij;Lcom/google/android/gms/internal/measurement/zzhj;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzij;->zzapm:Lcom/google/android/gms/internal/measurement/zzeo;

    return-void
.end method

.method private final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzij;->zzaph:Lcom/google/android/gms/internal/measurement/zzez;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzij;->zzaph:Lcom/google/android/gms/internal/measurement/zzez;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Disconnected from device MeasurementService"

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzij;->zzdf()V

    :cond_0
    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/measurement/zzij;Lcom/google/android/gms/internal/measurement/zzez;)Lcom/google/android/gms/internal/measurement/zzez;
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzij;->zzaph:Lcom/google/android/gms/internal/measurement/zzez;

    return-object p1
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/measurement/zzij;)Lcom/google/android/gms/internal/measurement/zzix;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zzij;->zzapg:Lcom/google/android/gms/internal/measurement/zzix;

    return-object p0
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/measurement/zzij;Landroid/content/ComponentName;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzij;->onServiceDisconnected(Landroid/content/ComponentName;)V

    return-void
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/measurement/zzij;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzij;->zzkp()V

    return-void
.end method

.method static synthetic zzc(Lcom/google/android/gms/internal/measurement/zzij;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzij;->zzcv()V

    return-void
.end method

.method private final zzcu()V
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzij;->zzapk:Lcom/google/android/gms/internal/measurement/zzjn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjn;->start()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzij;->zzapj:Lcom/google/android/gms/internal/measurement/zzeo;

    sget-object v1, Lcom/google/android/gms/internal/measurement/zzey;->zzahv:Lcom/google/android/gms/internal/measurement/zzey$zza;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzey$zza;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzeo;->zzh(J)V

    return-void
.end method

.method private final zzcv()V
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzij;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Inactivity, disconnecting from the service"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzij;->disconnect()V

    return-void
.end method

.method static synthetic zzd(Lcom/google/android/gms/internal/measurement/zzij;)Lcom/google/android/gms/internal/measurement/zzez;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zzij;->zzaph:Lcom/google/android/gms/internal/measurement/zzez;

    return-object p0
.end method

.method static synthetic zze(Lcom/google/android/gms/internal/measurement/zzij;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzij;->zzcu()V

    return-void
.end method

.method private final zzf(Ljava/lang/Runnable;)V
    .locals 5
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzij;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzij;->zzapl:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p1

    const-string v0, "Discarding data. Max runnable queue size reached"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzij;->zzapl:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzij;->zzapm:Lcom/google/android/gms/internal/measurement/zzeo;

    const-wide/32 v0, 0xea60

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/zzeo;->zzh(J)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzij;->zzdf()V

    return-void
.end method

.method private final zzk(Z)Lcom/google/android/gms/internal/measurement/zzdz;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgi()Lcom/google/android/gms/internal/measurement/zzec;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzfw()Lcom/google/android/gms/internal/measurement/zzfc;

    move-result-object v0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzjb()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzfc;->zzbh(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzdz;

    move-result-object p1

    return-object p1
.end method

.method private final zzkn()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgi()Lcom/google/android/gms/internal/measurement/zzec;

    const/4 v0, 0x1

    return v0
.end method

.method private final zzkp()V
    .locals 4
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Processing queued up service tasks"

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzij;->zzapl:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzij;->zzapl:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    :try_start_0
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v3, "Task exception while flushing queue"

    invoke-virtual {v2, v3, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzij;->zzapl:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzij;->zzapm:Lcom/google/android/gms/internal/measurement/zzeo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzeo;->cancel()V

    return-void
.end method


# virtual methods
.method public final disconnect()V
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzch()V

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/common/stats/ConnectionTracker;->getInstance()Lcom/google/android/gms/common/stats/ConnectionTracker;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzij;->zzapg:Lcom/google/android/gms/internal/measurement/zzix;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/stats/ConnectionTracker;->unbindService(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzij;->zzaph:Lcom/google/android/gms/internal/measurement/zzez;

    return-void
.end method

.method public final bridge synthetic getContext()Landroid/content/Context;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final isConnected()Z
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzch()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzij;->zzaph:Lcom/google/android/gms/internal/measurement/zzez;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected final resetAnalyticsData()V
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzfs()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzch()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzij;->zzk(Z)Lcom/google/android/gms/internal/measurement/zzdz;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzij;->zzkn()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzga()Lcom/google/android/gms/internal/measurement/zzfd;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfd;->resetAnalyticsData()V

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzil;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/measurement/zzil;-><init>(Lcom/google/android/gms/internal/measurement/zzij;Lcom/google/android/gms/internal/measurement/zzdz;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/measurement/zzij;->zzf(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected final zza(Lcom/google/android/gms/internal/measurement/zzez;)V
    .locals 0
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzij;->zzaph:Lcom/google/android/gms/internal/measurement/zzez;

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzij;->zzcu()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzij;->zzkp()V

    return-void
.end method

.method final zza(Lcom/google/android/gms/internal/measurement/zzez;Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;Lcom/google/android/gms/internal/measurement/zzdz;)V
    .locals 11
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzfs()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzch()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzij;->zzkn()Z

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x64

    move v3, v1

    move v4, v2

    :goto_0
    const/16 v5, 0x3e9

    if-ge v3, v5, :cond_6

    if-ne v4, v2, :cond_6

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzga()Lcom/google/android/gms/internal/measurement/zzfd;

    move-result-object v5

    invoke-virtual {v5, v2}, Lcom/google/android/gms/internal/measurement/zzfd;->zzp(I)Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-interface {v4, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    goto :goto_1

    :cond_0
    move v5, v1

    :goto_1
    if-eqz p2, :cond_1

    if-ge v5, v2, :cond_1

    invoke-interface {v4, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    move v7, v1

    :goto_2
    if-ge v7, v6, :cond_5

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v7, v7, 0x1

    check-cast v8, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

    instance-of v9, v8, Lcom/google/android/gms/internal/measurement/zzew;

    if-eqz v9, :cond_2

    :try_start_0
    check-cast v8, Lcom/google/android/gms/internal/measurement/zzew;

    invoke-interface {p1, v8, p3}, Lcom/google/android/gms/internal/measurement/zzez;->zza(Lcom/google/android/gms/internal/measurement/zzew;Lcom/google/android/gms/internal/measurement/zzdz;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v8

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v9

    const-string v10, "Failed to send event to the service"

    :goto_3
    invoke-virtual {v9, v10, v8}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    instance-of v9, v8, Lcom/google/android/gms/internal/measurement/zzjz;

    if-eqz v9, :cond_3

    :try_start_1
    check-cast v8, Lcom/google/android/gms/internal/measurement/zzjz;

    invoke-interface {p1, v8, p3}, Lcom/google/android/gms/internal/measurement/zzez;->zza(Lcom/google/android/gms/internal/measurement/zzjz;Lcom/google/android/gms/internal/measurement/zzdz;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v8

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v9

    const-string v10, "Failed to send attribute to the service"

    goto :goto_3

    :cond_3
    instance-of v9, v8, Lcom/google/android/gms/internal/measurement/zzee;

    if-eqz v9, :cond_4

    :try_start_2
    check-cast v8, Lcom/google/android/gms/internal/measurement/zzee;

    invoke-interface {p1, v8, p3}, Lcom/google/android/gms/internal/measurement/zzez;->zza(Lcom/google/android/gms/internal/measurement/zzee;Lcom/google/android/gms/internal/measurement/zzdz;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception v8

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v9

    const-string v10, "Failed to send conditional property to the service"

    goto :goto_3

    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v8

    const-string v9, "Discarding data. Unrecognized parcel type."

    invoke-virtual {v8, v9}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    add-int/lit8 v3, v3, 0x1

    move v4, v5

    goto/16 :goto_0

    :cond_6
    return-void
.end method

.method public final zza(Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzch()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzij;->zzk(Z)Lcom/google/android/gms/internal/measurement/zzdz;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzim;

    invoke-direct {v1, p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzim;-><init>(Lcom/google/android/gms/internal/measurement/zzij;Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/internal/measurement/zzdz;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/measurement/zzij;->zzf(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected final zza(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/measurement/zzee;",
            ">;>;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzch()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzij;->zzk(Z)Lcom/google/android/gms/internal/measurement/zzdz;

    move-result-object v7

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzit;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/measurement/zzit;-><init>(Lcom/google/android/gms/internal/measurement/zzij;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzdz;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzij;->zzf(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected final zza(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 9
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/measurement/zzjz;",
            ">;>;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzch()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzij;->zzk(Z)Lcom/google/android/gms/internal/measurement/zzdz;

    move-result-object v8

    new-instance v0, Lcom/google/android/gms/internal/measurement/zziu;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move v7, p5

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/internal/measurement/zziu;-><init>(Lcom/google/android/gms/internal/measurement/zzij;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/internal/measurement/zzdz;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzij;->zzf(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected final zza(Ljava/util/concurrent/atomic/AtomicReference;Z)V
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/measurement/zzjz;",
            ">;>;Z)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzch()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzij;->zzk(Z)Lcom/google/android/gms/internal/measurement/zzdz;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/measurement/zziw;

    invoke-direct {v1, p0, p1, v0, p2}, Lcom/google/android/gms/internal/measurement/zziw;-><init>(Lcom/google/android/gms/internal/measurement/zzij;Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/internal/measurement/zzdz;Z)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/measurement/zzij;->zzf(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final bridge synthetic zzab()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzab()V

    return-void
.end method

.method protected final zzb(Lcom/google/android/gms/internal/measurement/zzew;Ljava/lang/String;)V
    .locals 8
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzch()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzij;->zzkn()Z

    move-result v2

    const/4 v0, 0x1

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzga()Lcom/google/android/gms/internal/measurement/zzfd;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/measurement/zzfd;->zza(Lcom/google/android/gms/internal/measurement/zzew;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v3, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    move v3, v1

    :goto_0
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzij;->zzk(Z)Lcom/google/android/gms/internal/measurement/zzdz;

    move-result-object v5

    new-instance v7, Lcom/google/android/gms/internal/measurement/zzir;

    move-object v0, v7

    move-object v1, p0

    move-object v4, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/measurement/zzir;-><init>(Lcom/google/android/gms/internal/measurement/zzij;ZZLcom/google/android/gms/internal/measurement/zzew;Lcom/google/android/gms/internal/measurement/zzdz;Ljava/lang/String;)V

    invoke-direct {p0, v7}, Lcom/google/android/gms/internal/measurement/zzij;->zzf(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected final zzb(Lcom/google/android/gms/internal/measurement/zzif;)V
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzch()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzio;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/zzio;-><init>(Lcom/google/android/gms/internal/measurement/zzij;Lcom/google/android/gms/internal/measurement/zzif;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzij;->zzf(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected final zzb(Lcom/google/android/gms/internal/measurement/zzjz;)V
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzch()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzij;->zzkn()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzga()Lcom/google/android/gms/internal/measurement/zzfd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzfd;->zza(Lcom/google/android/gms/internal/measurement/zzjz;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/measurement/zzij;->zzk(Z)Lcom/google/android/gms/internal/measurement/zzdz;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/measurement/zziv;

    invoke-direct {v2, p0, v0, p1, v1}, Lcom/google/android/gms/internal/measurement/zziv;-><init>(Lcom/google/android/gms/internal/measurement/zzij;ZLcom/google/android/gms/internal/measurement/zzjz;Lcom/google/android/gms/internal/measurement/zzdz;)V

    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/measurement/zzij;->zzf(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final bridge synthetic zzbt()Lcom/google/android/gms/common/util/Clock;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    return-object v0
.end method

.method protected final zzd(Lcom/google/android/gms/internal/measurement/zzee;)V
    .locals 9
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzch()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgi()Lcom/google/android/gms/internal/measurement/zzec;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzga()Lcom/google/android/gms/internal/measurement/zzfd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzfd;->zzc(Lcom/google/android/gms/internal/measurement/zzee;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v5, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    move v5, v0

    :goto_0
    new-instance v6, Lcom/google/android/gms/internal/measurement/zzee;

    invoke-direct {v6, p1}, Lcom/google/android/gms/internal/measurement/zzee;-><init>(Lcom/google/android/gms/internal/measurement/zzee;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/measurement/zzij;->zzk(Z)Lcom/google/android/gms/internal/measurement/zzdz;

    move-result-object v7

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzis;

    const/4 v4, 0x1

    move-object v2, v0

    move-object v3, p0

    move-object v8, p1

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/measurement/zzis;-><init>(Lcom/google/android/gms/internal/measurement/zzij;ZZLcom/google/android/gms/internal/measurement/zzee;Lcom/google/android/gms/internal/measurement/zzdz;Lcom/google/android/gms/internal/measurement/zzee;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzij;->zzf(Ljava/lang/Runnable;)V

    return-void
.end method

.method final zzdf()V
    .locals 6
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzch()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzij;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzij;->zzapi:Ljava/lang/Boolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_9

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzch()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfs;->zzji()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    move v3, v2

    goto/16 :goto_9

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgi()Lcom/google/android/gms/internal/measurement/zzec;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzfw()Lcom/google/android/gms/internal/measurement/zzfc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfc;->zziq()I

    move-result v0

    if-ne v0, v2, :cond_2

    :goto_0
    move v0, v2

    :goto_1
    move v3, v0

    goto/16 :goto_8

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v3, "Checking service availability"

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailabilityLight;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailabilityLight;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->getContext()Landroid/content/Context;

    move-result-object v0

    const v4, 0xbdfcb8

    invoke-virtual {v3, v0, v4}, Lcom/google/android/gms/common/GoogleApiAvailabilityLight;->isGooglePlayServicesAvailable(Landroid/content/Context;I)I

    move-result v0

    const/16 v3, 0x9

    if-eq v0, v3, :cond_7

    const/16 v3, 0x12

    if-eq v0, v3, :cond_6

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v3

    const-string v4, "Unexpected service status"

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_2
    move v0, v1

    goto :goto_1

    :pswitch_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v3, "Service disabled"

    :goto_3
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    goto :goto_2

    :pswitch_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziy()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v3, "Service container out of date"

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzkc;->zzlm()I

    move-result v0

    const/16 v3, 0x3138

    if-ge v0, v3, :cond_3

    goto :goto_6

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfs;->zzji()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_4

    :cond_4
    move v0, v1

    goto :goto_5

    :cond_5
    :goto_4
    move v0, v2

    :goto_5
    move v3, v0

    move v0, v1

    goto :goto_8

    :pswitch_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v3, "Service missing"

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    :goto_6
    move v3, v1

    move v0, v2

    goto :goto_8

    :pswitch_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v3, "Service available"

    :goto_7
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_6
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v3, "Service updating"

    goto :goto_7

    :cond_7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v3, "Service invalid"

    goto :goto_3

    :goto_8
    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/measurement/zzfs;->zzf(Z)V

    :cond_8
    :goto_9
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzij;->zzapi:Ljava/lang/Boolean;

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzij;->zzapi:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzij;->zzapg:Lcom/google/android/gms/internal/measurement/zzix;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzix;->zzkq()V

    return-void

    :cond_a
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgi()Lcom/google/android/gms/internal/measurement/zzec;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->getContext()Landroid/content/Context;

    move-result-object v4

    const-string v5, "com.google.android.gms.measurement.AppMeasurementService"

    invoke-virtual {v3, v4, v5}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v3

    const/high16 v4, 0x10000

    invoke-virtual {v0, v3, v4}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_b

    move v1, v2

    :cond_b
    if-eqz v1, :cond_c

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.gms.measurement.START"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v1, Landroid/content/ComponentName;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgi()Lcom/google/android/gms/internal/measurement/zzec;

    const-string v3, "com.google.android.gms.measurement.AppMeasurementService"

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzij;->zzapg:Lcom/google/android/gms/internal/measurement/zzix;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/measurement/zzix;->zzc(Landroid/content/Intent;)V

    return-void

    :cond_c
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method protected final zzkj()V
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzch()V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzij;->zzk(Z)Lcom/google/android/gms/internal/measurement/zzdz;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzin;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/measurement/zzin;-><init>(Lcom/google/android/gms/internal/measurement/zzij;Lcom/google/android/gms/internal/measurement/zzdz;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/measurement/zzij;->zzf(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected final zzkm()V
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzch()V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzij;->zzk(Z)Lcom/google/android/gms/internal/measurement/zzdz;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/measurement/zziq;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/measurement/zziq;-><init>(Lcom/google/android/gms/internal/measurement/zzij;Lcom/google/android/gms/internal/measurement/zzdz;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/measurement/zzij;->zzf(Ljava/lang/Runnable;)V

    return-void
.end method

.method final zzko()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzij;->zzapi:Ljava/lang/Boolean;

    return-object v0
.end method
