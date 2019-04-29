.class public final Lcom/google/android/gms/tagmanager/zzy;
.super Lcom/google/android/gms/common/api/internal/BasePendingResult;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/api/internal/BasePendingResult<",
        "Lcom/google/android/gms/tagmanager/ContainerHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private final zzavt:Ljava/lang/String;

.field private zzavy:J

.field private final zzawb:Landroid/os/Looper;

.field private final zzawh:Lcom/google/android/gms/tagmanager/TagManager;

.field private final zzawk:Lcom/google/android/gms/tagmanager/zzaf;

.field private final zzawl:Lcom/google/android/gms/tagmanager/zzej;

.field private final zzawm:I

.field private final zzawn:Lcom/google/android/gms/tagmanager/zzai;

.field private zzawo:Lcom/google/android/gms/tagmanager/zzah;

.field private zzawp:Lcom/google/android/gms/internal/measurement/zzwa;

.field private volatile zzawq:Lcom/google/android/gms/tagmanager/zzv;

.field private volatile zzawr:Z

.field private zzaws:Lcom/google/android/gms/internal/measurement/zzl;

.field private zzawt:Ljava/lang/String;

.field private zzawu:Lcom/google/android/gms/tagmanager/zzag;

.field private zzawv:Lcom/google/android/gms/tagmanager/zzac;

.field private final zzqx:Landroid/content/Context;

.field private final zzro:Lcom/google/android/gms/common/util/Clock;


# direct methods
.method private constructor <init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/TagManager;Landroid/os/Looper;Ljava/lang/String;ILcom/google/android/gms/tagmanager/zzah;Lcom/google/android/gms/tagmanager/zzag;Lcom/google/android/gms/internal/measurement/zzwa;Lcom/google/android/gms/common/util/Clock;Lcom/google/android/gms/tagmanager/zzej;Lcom/google/android/gms/tagmanager/zzai;)V
    .locals 1
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    if-nez p3, :cond_0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p3

    :goto_0
    invoke-direct {p0, v0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzy;->zzqx:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawh:Lcom/google/android/gms/tagmanager/TagManager;

    if-nez p3, :cond_1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p3

    :cond_1
    iput-object p3, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawb:Landroid/os/Looper;

    iput-object p4, p0, Lcom/google/android/gms/tagmanager/zzy;->zzavt:Ljava/lang/String;

    iput p5, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawm:I

    iput-object p6, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawo:Lcom/google/android/gms/tagmanager/zzah;

    iput-object p7, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawu:Lcom/google/android/gms/tagmanager/zzag;

    iput-object p8, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawp:Lcom/google/android/gms/internal/measurement/zzwa;

    new-instance p1, Lcom/google/android/gms/tagmanager/zzaf;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lcom/google/android/gms/tagmanager/zzaf;-><init>(Lcom/google/android/gms/tagmanager/zzy;Lcom/google/android/gms/tagmanager/zzz;)V

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawk:Lcom/google/android/gms/tagmanager/zzaf;

    new-instance p1, Lcom/google/android/gms/internal/measurement/zzl;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/zzl;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzy;->zzaws:Lcom/google/android/gms/internal/measurement/zzl;

    iput-object p9, p0, Lcom/google/android/gms/tagmanager/zzy;->zzro:Lcom/google/android/gms/common/util/Clock;

    iput-object p10, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawl:Lcom/google/android/gms/tagmanager/zzej;

    iput-object p11, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawn:Lcom/google/android/gms/tagmanager/zzai;

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zzy;->zzmq()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, Lcom/google/android/gms/tagmanager/zzeh;->zzof()Lcom/google/android/gms/tagmanager/zzeh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/tagmanager/zzeh;->zzoh()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/tagmanager/zzy;->zzcp(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/TagManager;Landroid/os/Looper;Ljava/lang/String;ILcom/google/android/gms/tagmanager/zzal;)V
    .locals 22

    move-object/from16 v1, p1

    move-object/from16 v4, p4

    new-instance v6, Lcom/google/android/gms/tagmanager/zzex;

    invoke-direct {v6, v1, v4}, Lcom/google/android/gms/tagmanager/zzex;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v7, Lcom/google/android/gms/tagmanager/zzes;

    move-object/from16 v12, p6

    invoke-direct {v7, v1, v4, v12}, Lcom/google/android/gms/tagmanager/zzes;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/tagmanager/zzal;)V

    new-instance v8, Lcom/google/android/gms/internal/measurement/zzwa;

    invoke-direct {v8, v1}, Lcom/google/android/gms/internal/measurement/zzwa;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcom/google/android/gms/common/util/DefaultClock;->getInstance()Lcom/google/android/gms/common/util/Clock;

    move-result-object v9

    new-instance v10, Lcom/google/android/gms/tagmanager/zzdg;

    const-string v20, "refreshing"

    invoke-static {}, Lcom/google/android/gms/common/util/DefaultClock;->getInstance()Lcom/google/android/gms/common/util/Clock;

    move-result-object v21

    const/4 v14, 0x1

    const/4 v15, 0x5

    const-wide/32 v16, 0xdbba0

    const-wide/16 v18, 0x1388

    move-object v13, v10

    invoke-direct/range {v13 .. v21}, Lcom/google/android/gms/tagmanager/zzdg;-><init>(IIJJLjava/lang/String;Lcom/google/android/gms/common/util/Clock;)V

    new-instance v11, Lcom/google/android/gms/tagmanager/zzai;

    invoke-direct {v11, v1, v4}, Lcom/google/android/gms/tagmanager/zzai;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    move-object/from16 v0, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v11}, Lcom/google/android/gms/tagmanager/zzy;-><init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/TagManager;Landroid/os/Looper;Ljava/lang/String;ILcom/google/android/gms/tagmanager/zzah;Lcom/google/android/gms/tagmanager/zzag;Lcom/google/android/gms/internal/measurement/zzwa;Lcom/google/android/gms/common/util/Clock;Lcom/google/android/gms/tagmanager/zzej;Lcom/google/android/gms/tagmanager/zzai;)V

    iget-object v1, v0, Lcom/google/android/gms/tagmanager/zzy;->zzawp:Lcom/google/android/gms/internal/measurement/zzwa;

    invoke-virtual/range {p6 .. p6}, Lcom/google/android/gms/tagmanager/zzal;->zzmy()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/measurement/zzwa;->zzer(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/tagmanager/zzy;)Lcom/google/android/gms/tagmanager/zzej;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawl:Lcom/google/android/gms/tagmanager/zzej;

    return-object p0
.end method

.method private final declared-synchronized zza(Lcom/google/android/gms/internal/measurement/zzl;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawo:Lcom/google/android/gms/tagmanager/zzah;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzvz;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzvz;-><init>()V

    iget-wide v1, p0, Lcom/google/android/gms/tagmanager/zzy;->zzavy:J

    iput-wide v1, v0, Lcom/google/android/gms/internal/measurement/zzvz;->zzbmi:J

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzi;

    invoke-direct {v1}, Lcom/google/android/gms/internal/measurement/zzi;-><init>()V

    iput-object v1, v0, Lcom/google/android/gms/internal/measurement/zzvz;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    iput-object p1, v0, Lcom/google/android/gms/internal/measurement/zzvz;->zzbmj:Lcom/google/android/gms/internal/measurement/zzl;

    iget-object p1, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawo:Lcom/google/android/gms/tagmanager/zzah;

    invoke-interface {p1, v0}, Lcom/google/android/gms/tagmanager/zzah;->zza(Lcom/google/android/gms/internal/measurement/zzvz;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private final declared-synchronized zza(Lcom/google/android/gms/internal/measurement/zzl;JZ)V
    .locals 10

    monitor-enter p0

    if-eqz p4, :cond_0

    :try_start_0
    iget-boolean p4, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawr:Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/zzy;->isReady()Z

    move-result p4

    if-eqz p4, :cond_1

    iget-object p4, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawq:Lcom/google/android/gms/tagmanager/zzv;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p4, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzy;->zzaws:Lcom/google/android/gms/internal/measurement/zzl;

    iput-wide p2, p0, Lcom/google/android/gms/tagmanager/zzy;->zzavy:J

    iget-object p4, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawn:Lcom/google/android/gms/tagmanager/zzai;

    invoke-virtual {p4}, Lcom/google/android/gms/tagmanager/zzai;->zzmt()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    iget-wide v4, p0, Lcom/google/android/gms/tagmanager/zzy;->zzavy:J

    add-long v6, v4, v0

    iget-object p4, p0, Lcom/google/android/gms/tagmanager/zzy;->zzro:Lcom/google/android/gms/common/util/Clock;

    invoke-interface {p4}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v4

    sub-long v8, v6, v4

    invoke-static {v0, v1, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/tagmanager/zzy;->zzah(J)V

    new-instance p4, Lcom/google/android/gms/tagmanager/Container;

    iget-object v3, p0, Lcom/google/android/gms/tagmanager/zzy;->zzqx:Landroid/content/Context;

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawh:Lcom/google/android/gms/tagmanager/TagManager;

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/TagManager;->getDataLayer()Lcom/google/android/gms/tagmanager/DataLayer;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/tagmanager/zzy;->zzavt:Ljava/lang/String;

    move-object v2, p4

    move-wide v6, p2

    move-object v8, p1

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/tagmanager/Container;-><init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/DataLayer;Ljava/lang/String;JLcom/google/android/gms/internal/measurement/zzl;)V

    iget-object p1, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawq:Lcom/google/android/gms/tagmanager/zzv;

    if-nez p1, :cond_2

    new-instance p1, Lcom/google/android/gms/tagmanager/zzv;

    iget-object p2, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawh:Lcom/google/android/gms/tagmanager/TagManager;

    iget-object p3, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawb:Landroid/os/Looper;

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawk:Lcom/google/android/gms/tagmanager/zzaf;

    invoke-direct {p1, p2, p3, p4, v0}, Lcom/google/android/gms/tagmanager/zzv;-><init>(Lcom/google/android/gms/tagmanager/TagManager;Landroid/os/Looper;Lcom/google/android/gms/tagmanager/Container;Lcom/google/android/gms/tagmanager/zzw;)V

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawq:Lcom/google/android/gms/tagmanager/zzv;

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawq:Lcom/google/android/gms/tagmanager/zzv;

    invoke-virtual {p1, p4}, Lcom/google/android/gms/tagmanager/zzv;->zza(Lcom/google/android/gms/tagmanager/Container;)V

    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/zzy;->isReady()Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawv:Lcom/google/android/gms/tagmanager/zzac;

    invoke-interface {p1, p4}, Lcom/google/android/gms/tagmanager/zzac;->zzb(Lcom/google/android/gms/tagmanager/Container;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawq:Lcom/google/android/gms/tagmanager/zzv;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/tagmanager/zzy;->setResult(Lcom/google/android/gms/common/api/Result;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    monitor-exit p0

    return-void

    :goto_2
    monitor-exit p0

    throw p1
.end method

.method static synthetic zza(Lcom/google/android/gms/tagmanager/zzy;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/tagmanager/zzy;->zzah(J)V

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/tagmanager/zzy;Lcom/google/android/gms/internal/measurement/zzl;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/tagmanager/zzy;->zza(Lcom/google/android/gms/internal/measurement/zzl;)V

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/tagmanager/zzy;Lcom/google/android/gms/internal/measurement/zzl;JZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/tagmanager/zzy;->zza(Lcom/google/android/gms/internal/measurement/zzl;JZ)V

    return-void
.end method

.method private final declared-synchronized zzah(J)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawu:Lcom/google/android/gms/tagmanager/zzag;

    if-nez v0, :cond_0

    const-string p1, "Refresh requested, but no network load scheduler."

    invoke-static {p1}, Lcom/google/android/gms/tagmanager/zzdi;->zzaa(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawu:Lcom/google/android/gms/tagmanager/zzag;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzy;->zzaws:Lcom/google/android/gms/internal/measurement/zzl;

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/zzl;->zzpw:Ljava/lang/String;

    invoke-interface {v0, p1, p2, v1}, Lcom/google/android/gms/tagmanager/zzag;->zza(JLjava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method static synthetic zzb(Lcom/google/android/gms/tagmanager/zzy;)Lcom/google/android/gms/tagmanager/zzv;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawq:Lcom/google/android/gms/tagmanager/zzv;

    return-object p0
.end method

.method static synthetic zzc(Lcom/google/android/gms/tagmanager/zzy;)Lcom/google/android/gms/tagmanager/zzai;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawn:Lcom/google/android/gms/tagmanager/zzai;

    return-object p0
.end method

.method static synthetic zzd(Lcom/google/android/gms/tagmanager/zzy;)Lcom/google/android/gms/common/util/Clock;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/tagmanager/zzy;->zzro:Lcom/google/android/gms/common/util/Clock;

    return-object p0
.end method

.method static synthetic zze(Lcom/google/android/gms/tagmanager/zzy;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawr:Z

    return p0
.end method

.method static synthetic zzf(Lcom/google/android/gms/tagmanager/zzy;)Lcom/google/android/gms/internal/measurement/zzl;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/tagmanager/zzy;->zzaws:Lcom/google/android/gms/internal/measurement/zzl;

    return-object p0
.end method

.method static synthetic zzg(Lcom/google/android/gms/tagmanager/zzy;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/tagmanager/zzy;->zzavy:J

    return-wide v0
.end method

.method static synthetic zzh(Lcom/google/android/gms/tagmanager/zzy;)Z
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zzy;->zzmq()Z

    move-result p0

    return p0
.end method

.method private final zzmq()Z
    .locals 3

    invoke-static {}, Lcom/google/android/gms/tagmanager/zzeh;->zzof()Lcom/google/android/gms/tagmanager/zzeh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/zzeh;->zzog()Lcom/google/android/gms/tagmanager/zzeh$zza;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/tagmanager/zzeh$zza;->zzbaj:Lcom/google/android/gms/tagmanager/zzeh$zza;

    if-eq v1, v2, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/zzeh;->zzog()Lcom/google/android/gms/tagmanager/zzeh$zza;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/tagmanager/zzeh$zza;->zzbak:Lcom/google/android/gms/tagmanager/zzeh$zza;

    if-ne v1, v2, :cond_1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzy;->zzavt:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/zzeh;->getContainerId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private final zzn(Z)V
    .locals 11

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawo:Lcom/google/android/gms/tagmanager/zzah;

    new-instance v1, Lcom/google/android/gms/tagmanager/zzad;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/tagmanager/zzad;-><init>(Lcom/google/android/gms/tagmanager/zzy;Lcom/google/android/gms/tagmanager/zzz;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/tagmanager/zzah;->zza(Lcom/google/android/gms/tagmanager/zzdh;)V

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawu:Lcom/google/android/gms/tagmanager/zzag;

    new-instance v1, Lcom/google/android/gms/tagmanager/zzae;

    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/tagmanager/zzae;-><init>(Lcom/google/android/gms/tagmanager/zzy;Lcom/google/android/gms/tagmanager/zzz;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/tagmanager/zzag;->zza(Lcom/google/android/gms/tagmanager/zzdh;)V

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawo:Lcom/google/android/gms/tagmanager/zzah;

    iget v1, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawm:I

    invoke-interface {v0, v1}, Lcom/google/android/gms/tagmanager/zzah;->zzr(I)Lcom/google/android/gms/internal/measurement/zzwf;

    move-result-object v8

    if-eqz v8, :cond_0

    new-instance v0, Lcom/google/android/gms/tagmanager/zzv;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawh:Lcom/google/android/gms/tagmanager/TagManager;

    iget-object v9, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawb:Landroid/os/Looper;

    new-instance v10, Lcom/google/android/gms/tagmanager/Container;

    iget-object v3, p0, Lcom/google/android/gms/tagmanager/zzy;->zzqx:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawh:Lcom/google/android/gms/tagmanager/TagManager;

    invoke-virtual {v2}, Lcom/google/android/gms/tagmanager/TagManager;->getDataLayer()Lcom/google/android/gms/tagmanager/DataLayer;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/tagmanager/zzy;->zzavt:Ljava/lang/String;

    const-wide/16 v6, 0x0

    move-object v2, v10

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/tagmanager/Container;-><init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/DataLayer;Ljava/lang/String;JLcom/google/android/gms/internal/measurement/zzwf;)V

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawk:Lcom/google/android/gms/tagmanager/zzaf;

    invoke-direct {v0, v1, v9, v10, v2}, Lcom/google/android/gms/tagmanager/zzv;-><init>(Lcom/google/android/gms/tagmanager/TagManager;Landroid/os/Looper;Lcom/google/android/gms/tagmanager/Container;Lcom/google/android/gms/tagmanager/zzw;)V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawq:Lcom/google/android/gms/tagmanager/zzv;

    :cond_0
    new-instance v0, Lcom/google/android/gms/tagmanager/zzab;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/tagmanager/zzab;-><init>(Lcom/google/android/gms/tagmanager/zzy;Z)V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawv:Lcom/google/android/gms/tagmanager/zzac;

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zzy;->zzmq()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawu:Lcom/google/android/gms/tagmanager/zzag;

    const-wide/16 v0, 0x0

    const-string v2, ""

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/tagmanager/zzag;->zza(JLjava/lang/String;)V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawo:Lcom/google/android/gms/tagmanager/zzah;

    invoke-interface {p1}, Lcom/google/android/gms/tagmanager/zzah;->zzms()V

    return-void
.end method


# virtual methods
.method protected final a_(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/tagmanager/ContainerHolder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawq:Lcom/google/android/gms/tagmanager/zzv;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawq:Lcom/google/android/gms/tagmanager/zzv;

    return-object p1

    :cond_0
    sget-object v0, Lcom/google/android/gms/common/api/Status;->RESULT_TIMEOUT:Lcom/google/android/gms/common/api/Status;

    if-ne p1, v0, :cond_1

    const-string v0, "timer expired: setting result to failure"

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzdi;->e(Ljava/lang/String;)V

    :cond_1
    new-instance v0, Lcom/google/android/gms/tagmanager/zzv;

    invoke-direct {v0, p1}, Lcom/google/android/gms/tagmanager/zzv;-><init>(Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method protected final synthetic createFailedResult(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/tagmanager/zzy;->a_(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/tagmanager/ContainerHolder;

    move-result-object p1

    return-object p1
.end method

.method final declared-synchronized zzcp(Ljava/lang/String;)V
    .locals 1
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawt:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawu:Lcom/google/android/gms/tagmanager/zzag;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawu:Lcom/google/android/gms/tagmanager/zzag;

    invoke-interface {v0, p1}, Lcom/google/android/gms/tagmanager/zzag;->zzcq(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method final declared-synchronized zzmk()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawt:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final zzmn()V
    .locals 9

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawo:Lcom/google/android/gms/tagmanager/zzah;

    iget v1, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawm:I

    invoke-interface {v0, v1}, Lcom/google/android/gms/tagmanager/zzah;->zzr(I)Lcom/google/android/gms/internal/measurement/zzwf;

    move-result-object v8

    const/4 v0, 0x0

    if-eqz v8, :cond_0

    new-instance v1, Lcom/google/android/gms/tagmanager/Container;

    iget-object v3, p0, Lcom/google/android/gms/tagmanager/zzy;->zzqx:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawh:Lcom/google/android/gms/tagmanager/TagManager;

    invoke-virtual {v2}, Lcom/google/android/gms/tagmanager/TagManager;->getDataLayer()Lcom/google/android/gms/tagmanager/DataLayer;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/tagmanager/zzy;->zzavt:Ljava/lang/String;

    const-wide/16 v6, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/tagmanager/Container;-><init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/DataLayer;Ljava/lang/String;JLcom/google/android/gms/internal/measurement/zzwf;)V

    new-instance v2, Lcom/google/android/gms/tagmanager/zzv;

    iget-object v3, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawh:Lcom/google/android/gms/tagmanager/TagManager;

    iget-object v4, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawb:Landroid/os/Looper;

    new-instance v5, Lcom/google/android/gms/tagmanager/zzaa;

    invoke-direct {v5, p0}, Lcom/google/android/gms/tagmanager/zzaa;-><init>(Lcom/google/android/gms/tagmanager/zzy;)V

    invoke-direct {v2, v3, v4, v1, v5}, Lcom/google/android/gms/tagmanager/zzv;-><init>(Lcom/google/android/gms/tagmanager/TagManager;Landroid/os/Looper;Lcom/google/android/gms/tagmanager/Container;Lcom/google/android/gms/tagmanager/zzw;)V

    invoke-virtual {p0, v2}, Lcom/google/android/gms/tagmanager/zzy;->setResult(Lcom/google/android/gms/common/api/Result;)V

    goto :goto_0

    :cond_0
    const-string v1, "Default was requested, but no default container was found"

    invoke-static {v1}, Lcom/google/android/gms/tagmanager/zzdi;->e(Ljava/lang/String;)V

    new-instance v2, Lcom/google/android/gms/common/api/Status;

    const/16 v3, 0xa

    invoke-direct {v2, v3, v1, v0}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    invoke-virtual {p0, v2}, Lcom/google/android/gms/tagmanager/zzy;->a_(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/tagmanager/ContainerHolder;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/google/android/gms/tagmanager/zzy;->setResult(Lcom/google/android/gms/common/api/Result;)V

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawu:Lcom/google/android/gms/tagmanager/zzag;

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/zzy;->zzawo:Lcom/google/android/gms/tagmanager/zzah;

    return-void
.end method

.method public final zzmo()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/tagmanager/zzy;->zzn(Z)V

    return-void
.end method

.method public final zzmp()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/tagmanager/zzy;->zzn(Z)V

    return-void
.end method
