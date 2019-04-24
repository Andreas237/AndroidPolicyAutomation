.class public Lcom/google/android/gms/measurement/internal/zzbw;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/measurement/internal/zzct;


# static fields
.field private static volatile zzapg:Lcom/google/android/gms/measurement/internal/zzbw;


# instance fields
.field private final zzadg:Z

.field private final zzadi:Ljava/lang/String;

.field private final zzago:J

.field private final zzaih:Lcom/google/android/gms/measurement/internal/zzn;

.field private final zzaph:Ljava/lang/String;

.field private final zzapi:Ljava/lang/String;

.field private final zzapj:Lcom/google/android/gms/measurement/internal/zzq;

.field private final zzapk:Lcom/google/android/gms/measurement/internal/zzbd;

.field private final zzapl:Lcom/google/android/gms/measurement/internal/zzas;

.field private final zzapm:Lcom/google/android/gms/measurement/internal/zzbr;

.field private final zzapn:Lcom/google/android/gms/measurement/internal/zzfd;

.field private final zzapo:Lcom/google/android/gms/measurement/AppMeasurement;

.field private final zzapp:Lcom/google/android/gms/measurement/internal/zzfy;

.field private final zzapq:Lcom/google/android/gms/measurement/internal/zzaq;

.field private final zzapr:Lcom/google/android/gms/measurement/internal/zzdy;

.field private final zzaps:Lcom/google/android/gms/measurement/internal/zzda;

.field private final zzapt:Lcom/google/android/gms/measurement/internal/zza;

.field private zzapu:Lcom/google/android/gms/measurement/internal/zzao;

.field private zzapv:Lcom/google/android/gms/measurement/internal/zzeb;

.field private zzapw:Lcom/google/android/gms/measurement/internal/zzaa;

.field private zzapx:Lcom/google/android/gms/measurement/internal/zzam;

.field private zzapy:Lcom/google/android/gms/measurement/internal/zzbj;

.field private zzapz:Ljava/lang/Boolean;

.field private zzaqa:J

.field private volatile zzaqb:Ljava/lang/Boolean;

.field private zzaqc:Ljava/lang/Boolean;
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation
.end field

.field private zzaqd:Ljava/lang/Boolean;
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation
.end field

.field private zzaqe:I

.field private zzaqf:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final zzri:Landroid/content/Context;

.field private final zzrz:Lcom/google/android/gms/common/util/Clock;

.field private zzvz:Z


# direct methods
.method private constructor <init>(Lcom/google/android/gms/measurement/internal/zzcz;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzvz:Z

    .line 3
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v1, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaqf:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 4
    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzcz;->zzri:Landroid/content/Context;

    .line 6
    new-instance v1, Lcom/google/android/gms/measurement/internal/zzn;

    invoke-direct {v1, v0}, Lcom/google/android/gms/measurement/internal/zzn;-><init>(Landroid/content/Context;)V

    .line 7
    iput-object v1, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaih:Lcom/google/android/gms/measurement/internal/zzn;

    .line 8
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaih:Lcom/google/android/gms/measurement/internal/zzn;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzai;->zza(Lcom/google/android/gms/measurement/internal/zzn;)V

    .line 9
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzcz;->zzri:Landroid/content/Context;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzri:Landroid/content/Context;

    .line 10
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzcz;->zzadi:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzadi:Ljava/lang/String;

    .line 11
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzcz;->zzaph:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaph:Ljava/lang/String;

    .line 12
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzcz;->zzapi:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapi:Ljava/lang/String;

    .line 13
    iget-boolean v0, p1, Lcom/google/android/gms/measurement/internal/zzcz;->zzadg:Z

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzadg:Z

    .line 14
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzcz;->zzaqb:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaqb:Ljava/lang/Boolean;

    .line 15
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzcz;->zzaqw:Lcom/google/android/gms/measurement/internal/zzan;

    if-eqz v0, :cond_1

    .line 16
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzan;->zzadj:Landroid/os/Bundle;

    if-eqz v1, :cond_1

    .line 17
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzan;->zzadj:Landroid/os/Bundle;

    const-string v2, "measurementEnabled"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 18
    instance-of v2, v1, Ljava/lang/Boolean;

    if-eqz v2, :cond_0

    .line 19
    check-cast v1, Ljava/lang/Boolean;

    iput-object v1, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaqc:Ljava/lang/Boolean;

    .line 20
    :cond_0
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzan;->zzadj:Landroid/os/Bundle;

    const-string v1, "measurementDeactivated"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 21
    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_1

    .line 22
    check-cast v0, Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaqd:Ljava/lang/Boolean;

    .line 23
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzri:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzsi;->zzae(Landroid/content/Context;)V

    .line 25
    invoke-static {}, Lcom/google/android/gms/common/util/DefaultClock;->getInstance()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    .line 26
    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzrz:Lcom/google/android/gms/common/util/Clock;

    .line 27
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzrz:Lcom/google/android/gms/common/util/Clock;

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzago:J

    .line 29
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzq;

    invoke-direct {v0, p0}, Lcom/google/android/gms/measurement/internal/zzq;-><init>(Lcom/google/android/gms/measurement/internal/zzbw;)V

    .line 30
    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapj:Lcom/google/android/gms/measurement/internal/zzq;

    .line 32
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzbd;

    invoke-direct {v0, p0}, Lcom/google/android/gms/measurement/internal/zzbd;-><init>(Lcom/google/android/gms/measurement/internal/zzbw;)V

    .line 34
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcs;->zzq()V

    .line 35
    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapk:Lcom/google/android/gms/measurement/internal/zzbd;

    .line 37
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzas;

    invoke-direct {v0, p0}, Lcom/google/android/gms/measurement/internal/zzas;-><init>(Lcom/google/android/gms/measurement/internal/zzbw;)V

    .line 39
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcs;->zzq()V

    .line 40
    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapl:Lcom/google/android/gms/measurement/internal/zzas;

    .line 42
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzfy;

    invoke-direct {v0, p0}, Lcom/google/android/gms/measurement/internal/zzfy;-><init>(Lcom/google/android/gms/measurement/internal/zzbw;)V

    .line 44
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcs;->zzq()V

    .line 45
    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapp:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 47
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzaq;

    invoke-direct {v0, p0}, Lcom/google/android/gms/measurement/internal/zzaq;-><init>(Lcom/google/android/gms/measurement/internal/zzbw;)V

    .line 49
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcs;->zzq()V

    .line 50
    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapq:Lcom/google/android/gms/measurement/internal/zzaq;

    .line 52
    new-instance v0, Lcom/google/android/gms/measurement/internal/zza;

    invoke-direct {v0, p0}, Lcom/google/android/gms/measurement/internal/zza;-><init>(Lcom/google/android/gms/measurement/internal/zzbw;)V

    .line 53
    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapt:Lcom/google/android/gms/measurement/internal/zza;

    .line 55
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzdy;

    invoke-direct {v0, p0}, Lcom/google/android/gms/measurement/internal/zzdy;-><init>(Lcom/google/android/gms/measurement/internal/zzbw;)V

    .line 57
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzf;->zzq()V

    .line 58
    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapr:Lcom/google/android/gms/measurement/internal/zzdy;

    .line 60
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzda;

    invoke-direct {v0, p0}, Lcom/google/android/gms/measurement/internal/zzda;-><init>(Lcom/google/android/gms/measurement/internal/zzbw;)V

    .line 62
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzf;->zzq()V

    .line 63
    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaps:Lcom/google/android/gms/measurement/internal/zzda;

    .line 65
    new-instance v0, Lcom/google/android/gms/measurement/AppMeasurement;

    invoke-direct {v0, p0}, Lcom/google/android/gms/measurement/AppMeasurement;-><init>(Lcom/google/android/gms/measurement/internal/zzbw;)V

    .line 66
    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapo:Lcom/google/android/gms/measurement/AppMeasurement;

    .line 68
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzfd;

    invoke-direct {v0, p0}, Lcom/google/android/gms/measurement/internal/zzfd;-><init>(Lcom/google/android/gms/measurement/internal/zzbw;)V

    .line 70
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzf;->zzq()V

    .line 71
    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapn:Lcom/google/android/gms/measurement/internal/zzfd;

    .line 73
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzbr;

    invoke-direct {v0, p0}, Lcom/google/android/gms/measurement/internal/zzbr;-><init>(Lcom/google/android/gms/measurement/internal/zzbw;)V

    .line 75
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcs;->zzq()V

    .line 76
    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapm:Lcom/google/android/gms/measurement/internal/zzbr;

    .line 79
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaih:Lcom/google/android/gms/measurement/internal/zzn;

    .line 81
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzri:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Landroid/app/Application;

    if-eqz v0, :cond_3

    .line 82
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgj()Lcom/google/android/gms/measurement/internal/zzda;

    move-result-object v0

    .line 83
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    instance-of v1, v1, Landroid/app/Application;

    if-eqz v1, :cond_4

    .line 84
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    check-cast v1, Landroid/app/Application;

    .line 85
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzda;->zzaqx:Lcom/google/android/gms/measurement/internal/zzdu;

    if-nez v2, :cond_2

    .line 86
    new-instance v2, Lcom/google/android/gms/measurement/internal/zzdu;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lcom/google/android/gms/measurement/internal/zzdu;-><init>(Lcom/google/android/gms/measurement/internal/zzda;Lcom/google/android/gms/measurement/internal/zzdb;)V

    iput-object v2, v0, Lcom/google/android/gms/measurement/internal/zzda;->zzaqx:Lcom/google/android/gms/measurement/internal/zzdu;

    .line 87
    :cond_2
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzda;->zzaqx:Lcom/google/android/gms/measurement/internal/zzdu;

    .line 88
    invoke-virtual {v1, v2}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 89
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzda;->zzaqx:Lcom/google/android/gms/measurement/internal/zzdu;

    .line 90
    invoke-virtual {v1, v2}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 91
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzas;->zzjo()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v0

    const-string v1, "Registered activity lifecycle callback"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzau;->zzby(Ljava/lang/String;)V

    goto :goto_0

    .line 93
    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzas;->zzjj()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v0

    const-string v1, "Application context is not an Application"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzau;->zzby(Ljava/lang/String;)V

    .line 94
    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapm:Lcom/google/android/gms/measurement/internal/zzbr;

    new-instance v1, Lcom/google/android/gms/measurement/internal/zzbx;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/measurement/internal/zzbx;-><init>(Lcom/google/android/gms/measurement/internal/zzbw;Lcom/google/android/gms/measurement/internal/zzcz;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzbr;->zzc(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static zza(Landroid/content/Context;Lcom/google/android/gms/measurement/internal/zzan;)Lcom/google/android/gms/measurement/internal/zzbw;
    .locals 11

    if-eqz p1, :cond_1

    .line 270
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzan;->origin:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzan;->zzadi:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 271
    :cond_0
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzan;

    iget-wide v2, p1, Lcom/google/android/gms/measurement/internal/zzan;->zzade:J

    iget-wide v4, p1, Lcom/google/android/gms/measurement/internal/zzan;->zzadf:J

    iget-boolean v6, p1, Lcom/google/android/gms/measurement/internal/zzan;->zzadg:Z

    iget-object v7, p1, Lcom/google/android/gms/measurement/internal/zzan;->zzadh:Ljava/lang/String;

    const/4 v8, 0x0

    const/4 v9, 0x0

    iget-object v10, p1, Lcom/google/android/gms/measurement/internal/zzan;->zzadj:Landroid/os/Bundle;

    move-object v1, v0

    invoke-direct/range {v1 .. v10}, Lcom/google/android/gms/measurement/internal/zzan;-><init>(JJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    move-object p1, v0

    .line 272
    :cond_1
    invoke-static {p0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    sget-object v0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapg:Lcom/google/android/gms/measurement/internal/zzbw;

    if-nez v0, :cond_3

    .line 275
    const-class v0, Lcom/google/android/gms/measurement/internal/zzbw;

    monitor-enter v0

    .line 276
    :try_start_0
    sget-object v1, Lcom/google/android/gms/measurement/internal/zzbw;->zzapg:Lcom/google/android/gms/measurement/internal/zzbw;

    if-nez v1, :cond_2

    .line 277
    new-instance v1, Lcom/google/android/gms/measurement/internal/zzcz;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/measurement/internal/zzcz;-><init>(Landroid/content/Context;Lcom/google/android/gms/measurement/internal/zzan;)V

    .line 279
    new-instance p0, Lcom/google/android/gms/measurement/internal/zzbw;

    invoke-direct {p0, v1}, Lcom/google/android/gms/measurement/internal/zzbw;-><init>(Lcom/google/android/gms/measurement/internal/zzcz;)V

    .line 280
    sput-object p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapg:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 281
    :cond_2
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_3
    if-eqz p1, :cond_4

    .line 282
    iget-object p0, p1, Lcom/google/android/gms/measurement/internal/zzan;->zzadj:Landroid/os/Bundle;

    if-eqz p0, :cond_4

    iget-object p0, p1, Lcom/google/android/gms/measurement/internal/zzan;->zzadj:Landroid/os/Bundle;

    const-string v0, "dataCollectionDefaultEnabled"

    .line 283
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_4

    .line 284
    sget-object p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapg:Lcom/google/android/gms/measurement/internal/zzbw;

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzan;->zzadj:Landroid/os/Bundle;

    const-string v0, "dataCollectionDefaultEnabled"

    .line 285
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    .line 286
    invoke-virtual {p0, p1}, Lcom/google/android/gms/measurement/internal/zzbw;->zzd(Z)V

    .line 287
    :cond_4
    :goto_0
    sget-object p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapg:Lcom/google/android/gms/measurement/internal/zzbw;

    return-object p0
.end method

.method static synthetic zza(Lcom/google/android/gms/measurement/internal/zzbw;Lcom/google/android/gms/measurement/internal/zzcz;)V
    .locals 0

    .line 405
    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/zzbw;->zza(Lcom/google/android/gms/measurement/internal/zzcz;)V

    return-void
.end method

.method private static zza(Lcom/google/android/gms/measurement/internal/zzcr;)V
    .locals 1

    if-eqz p0, :cond_0

    return-void

    .line 302
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Component not created"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static zza(Lcom/google/android/gms/measurement/internal/zzcs;)V
    .locals 3

    if-eqz p0, :cond_1

    .line 293
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcs;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 294
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x1b

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Component not initialized: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 292
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Component not created"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final zza(Lcom/google/android/gms/measurement/internal/zzcz;)V
    .locals 5
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 97
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 98
    invoke-static {}, Lcom/google/android/gms/measurement/internal/zzq;->zzhy()Ljava/lang/String;

    .line 100
    new-instance p1, Lcom/google/android/gms/measurement/internal/zzaa;

    invoke-direct {p1, p0}, Lcom/google/android/gms/measurement/internal/zzaa;-><init>(Lcom/google/android/gms/measurement/internal/zzbw;)V

    .line 102
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzcs;->zzq()V

    .line 103
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapw:Lcom/google/android/gms/measurement/internal/zzaa;

    .line 105
    new-instance p1, Lcom/google/android/gms/measurement/internal/zzam;

    invoke-direct {p1, p0}, Lcom/google/android/gms/measurement/internal/zzam;-><init>(Lcom/google/android/gms/measurement/internal/zzbw;)V

    .line 107
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzf;->zzq()V

    .line 108
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapx:Lcom/google/android/gms/measurement/internal/zzam;

    .line 110
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzao;

    invoke-direct {v0, p0}, Lcom/google/android/gms/measurement/internal/zzao;-><init>(Lcom/google/android/gms/measurement/internal/zzbw;)V

    .line 112
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzf;->zzq()V

    .line 113
    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapu:Lcom/google/android/gms/measurement/internal/zzao;

    .line 115
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzeb;

    invoke-direct {v0, p0}, Lcom/google/android/gms/measurement/internal/zzeb;-><init>(Lcom/google/android/gms/measurement/internal/zzbw;)V

    .line 117
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzf;->zzq()V

    .line 118
    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapv:Lcom/google/android/gms/measurement/internal/zzeb;

    .line 119
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapp:Lcom/google/android/gms/measurement/internal/zzfy;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcs;->zzgx()V

    .line 120
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapk:Lcom/google/android/gms/measurement/internal/zzbd;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcs;->zzgx()V

    .line 122
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzbj;

    invoke-direct {v0, p0}, Lcom/google/android/gms/measurement/internal/zzbj;-><init>(Lcom/google/android/gms/measurement/internal/zzbw;)V

    .line 123
    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapy:Lcom/google/android/gms/measurement/internal/zzbj;

    .line 124
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapx:Lcom/google/android/gms/measurement/internal/zzam;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzf;->zzgx()V

    .line 125
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzas;->zzjm()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v0

    const-string v1, "App measurement is starting up, version"

    .line 126
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapj:Lcom/google/android/gms/measurement/internal/zzq;

    .line 127
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzq;->zzhh()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    .line 129
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaih:Lcom/google/android/gms/measurement/internal/zzn;

    .line 131
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzas;->zzjm()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v0

    const-string v1, "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzau;->zzby(Ljava/lang/String;)V

    .line 133
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaih:Lcom/google/android/gms/measurement/internal/zzn;

    .line 135
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzam;->zzal()Ljava/lang/String;

    move-result-object p1

    .line 137
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzadi:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 139
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgr()Lcom/google/android/gms/measurement/internal/zzfy;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/measurement/internal/zzfy;->zzcz(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 140
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object p1

    .line 141
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjm()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object p1

    const-string v0, "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none."

    move-object v4, v0

    move-object v0, p1

    move-object p1, v4

    goto :goto_0

    .line 143
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v0

    .line 144
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzas;->zzjm()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v0

    const-string v1, "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 145
    :goto_0
    invoke-virtual {v0, p1}, Lcom/google/android/gms/measurement/internal/zzau;->zzby(Ljava/lang/String;)V

    .line 146
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjn()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object p1

    const-string v0, "Debug-level message logging enabled"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/measurement/internal/zzau;->zzby(Ljava/lang/String;)V

    .line 147
    iget p1, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaqe:I

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaqf:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-eq p1, v0, :cond_3

    .line 148
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object p1

    .line 149
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjg()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object p1

    const-string v0, "Not all components initialized"

    iget v1, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaqe:I

    .line 150
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaqf:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzau;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_3
    const/4 p1, 0x1

    .line 151
    iput-boolean p1, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzvz:Z

    return-void
.end method

.method private static zza(Lcom/google/android/gms/measurement/internal/zzf;)V
    .locals 3

    if-eqz p0, :cond_1

    .line 298
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzf;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 299
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x1b

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Component not initialized: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 297
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Component not created"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final zzcl()V
    .locals 2

    .line 288
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzvz:Z

    if-eqz v0, :cond_0

    return-void

    .line 289
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "AppMeasurement is not initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final getContext()Landroid/content/Context;
    .locals 1

    .line 251
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzri:Landroid/content/Context;

    return-object v0
.end method

.method public final isEnabled()Z
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 308
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 309
    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzcl()V

    .line 311
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapj:Lcom/google/android/gms/measurement/internal/zzq;

    .line 312
    sget-object v1, Lcom/google/android/gms/measurement/internal/zzai;->zzalc:Lcom/google/android/gms/measurement/internal/zzai$zza;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzq;->zza(Lcom/google/android/gms/measurement/internal/zzai$zza;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_7

    .line 314
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapj:Lcom/google/android/gms/measurement/internal/zzq;

    .line 315
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzq;->zzhz()Z

    move-result v0

    if-eqz v0, :cond_0

    return v2

    .line 317
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaqd:Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    .line 318
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    return v2

    .line 320
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgu()Lcom/google/android/gms/measurement/internal/zzbd;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbd;->zzjz()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 322
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 324
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapj:Lcom/google/android/gms/measurement/internal/zzq;

    .line 325
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzq;->zzia()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 327
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 328
    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaqc:Ljava/lang/Boolean;

    if-eqz v0, :cond_4

    .line 329
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 330
    :cond_4
    invoke-static {}, Lcom/google/android/gms/common/api/internal/GoogleServices;->isMeasurementExplicitlyDisabled()Z

    move-result v0

    if-eqz v0, :cond_5

    return v2

    .line 334
    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapj:Lcom/google/android/gms/measurement/internal/zzq;

    .line 335
    sget-object v2, Lcom/google/android/gms/measurement/internal/zzai;->zzaky:Lcom/google/android/gms/measurement/internal/zzai$zza;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/zzq;->zza(Lcom/google/android/gms/measurement/internal/zzai$zza;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaqb:Ljava/lang/Boolean;

    if-eqz v0, :cond_6

    .line 336
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaqb:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_6
    return v1

    .line 339
    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapj:Lcom/google/android/gms/measurement/internal/zzq;

    .line 340
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzq;->zzhz()Z

    move-result v0

    if-eqz v0, :cond_8

    return v2

    .line 343
    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapj:Lcom/google/android/gms/measurement/internal/zzq;

    .line 344
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzq;->zzia()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 346
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    .line 347
    :cond_9
    invoke-static {}, Lcom/google/android/gms/common/api/internal/GoogleServices;->isMeasurementExplicitlyDisabled()Z

    move-result v0

    xor-int/2addr v0, v1

    if-eqz v0, :cond_a

    .line 349
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaqb:Ljava/lang/Boolean;

    if-eqz v1, :cond_a

    .line 350
    sget-object v1, Lcom/google/android/gms/measurement/internal/zzai;->zzaky:Lcom/google/android/gms/measurement/internal/zzai$zza;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzai$zza;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_a

    .line 352
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaqb:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 353
    :cond_a
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgu()Lcom/google/android/gms/measurement/internal/zzbd;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/measurement/internal/zzbd;->zzh(Z)Z

    move-result v0

    return v0
.end method

.method protected final start()V
    .locals 6
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 154
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 155
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgu()Lcom/google/android/gms/measurement/internal/zzbd;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzbd;->zzana:Lcom/google/android/gms/measurement/internal/zzbg;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbg;->get()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 156
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgu()Lcom/google/android/gms/measurement/internal/zzbd;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzbd;->zzana:Lcom/google/android/gms/measurement/internal/zzbg;

    .line 157
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzrz:Lcom/google/android/gms/common/util/Clock;

    .line 158
    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/measurement/internal/zzbg;->set(J)V

    .line 159
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgu()Lcom/google/android/gms/measurement/internal/zzbd;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzbd;->zzanf:Lcom/google/android/gms/measurement/internal/zzbg;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbg;->get()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 160
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 161
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzas;->zzjo()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v0

    const-string v1, "Persisting first open"

    iget-wide v2, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzago:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    .line 162
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgu()Lcom/google/android/gms/measurement/internal/zzbd;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzbd;->zzanf:Lcom/google/android/gms/measurement/internal/zzbg;

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzago:J

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzbg;->set(J)V

    .line 163
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzkv()Z

    move-result v0

    if-nez v0, :cond_6

    .line 164
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 165
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgr()Lcom/google/android/gms/measurement/internal/zzfy;

    move-result-object v0

    const-string v1, "android.permission.INTERNET"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzfy;->zzx(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 166
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzas;->zzjg()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v0

    const-string v1, "App is missing INTERNET permission"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzau;->zzby(Ljava/lang/String;)V

    .line 167
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgr()Lcom/google/android/gms/measurement/internal/zzfy;

    move-result-object v0

    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzfy;->zzx(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 168
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzas;->zzjg()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v0

    const-string v1, "App is missing ACCESS_NETWORK_STATE permission"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzau;->zzby(Ljava/lang/String;)V

    .line 170
    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaih:Lcom/google/android/gms/measurement/internal/zzn;

    .line 173
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzri:Landroid/content/Context;

    .line 174
    invoke-static {v0}, Lcom/google/android/gms/common/wrappers/Wrappers;->packageManager(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;->isCallerInstantApp()Z

    move-result v0

    if-nez v0, :cond_5

    .line 175
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapj:Lcom/google/android/gms/measurement/internal/zzq;

    .line 176
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzq;->zzif()Z

    move-result v0

    if-nez v0, :cond_5

    .line 178
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzri:Landroid/content/Context;

    .line 179
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzbm;->zza(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 180
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzas;->zzjg()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v0

    const-string v1, "AppMeasurementReceiver not registered/enabled"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzau;->zzby(Ljava/lang/String;)V

    .line 182
    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzri:Landroid/content/Context;

    const/4 v1, 0x0

    .line 183
    invoke-static {v0, v1}, Lcom/google/android/gms/measurement/internal/zzfy;->zza(Landroid/content/Context;Z)Z

    move-result v0

    if-nez v0, :cond_5

    .line 184
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzas;->zzjg()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v0

    const-string v1, "AppMeasurementService not registered/enabled"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzau;->zzby(Ljava/lang/String;)V

    .line 185
    :cond_5
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzas;->zzjg()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v0

    const-string v1, "Uploading is not possible. App measurement disabled"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzau;->zzby(Ljava/lang/String;)V

    return-void

    .line 187
    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaih:Lcom/google/android/gms/measurement/internal/zzn;

    .line 190
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgk()Lcom/google/android/gms/measurement/internal/zzam;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzam;->getGmpAppId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 191
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgk()Lcom/google/android/gms/measurement/internal/zzam;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzam;->zzhb()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 192
    :cond_7
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgr()Lcom/google/android/gms/measurement/internal/zzfy;

    .line 193
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgk()Lcom/google/android/gms/measurement/internal/zzam;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzam;->getGmpAppId()Ljava/lang/String;

    move-result-object v0

    .line 194
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgu()Lcom/google/android/gms/measurement/internal/zzbd;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzbd;->zzjv()Ljava/lang/String;

    move-result-object v1

    .line 195
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgk()Lcom/google/android/gms/measurement/internal/zzam;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzam;->zzhb()Ljava/lang/String;

    move-result-object v2

    .line 196
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgu()Lcom/google/android/gms/measurement/internal/zzbd;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzbd;->zzjw()Ljava/lang/String;

    move-result-object v3

    .line 197
    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/zzfy;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 198
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzas;->zzjm()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v0

    const-string v1, "Rechecking which service to use due to a GMP App Id change"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzau;->zzby(Ljava/lang/String;)V

    .line 199
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgu()Lcom/google/android/gms/measurement/internal/zzbd;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbd;->zzjy()V

    .line 200
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgn()Lcom/google/android/gms/measurement/internal/zzao;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzao;->resetAnalyticsData()V

    .line 201
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapv:Lcom/google/android/gms/measurement/internal/zzeb;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzeb;->disconnect()V

    .line 202
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapv:Lcom/google/android/gms/measurement/internal/zzeb;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzeb;->zzdj()V

    .line 203
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgu()Lcom/google/android/gms/measurement/internal/zzbd;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzbd;->zzanf:Lcom/google/android/gms/measurement/internal/zzbg;

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzago:J

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzbg;->set(J)V

    .line 204
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgu()Lcom/google/android/gms/measurement/internal/zzbd;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzbd;->zzanh:Lcom/google/android/gms/measurement/internal/zzbi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzbi;->zzcd(Ljava/lang/String;)V

    .line 205
    :cond_8
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgu()Lcom/google/android/gms/measurement/internal/zzbd;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgk()Lcom/google/android/gms/measurement/internal/zzam;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzam;->getGmpAppId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzbd;->zzcb(Ljava/lang/String;)V

    .line 206
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgu()Lcom/google/android/gms/measurement/internal/zzbd;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgk()Lcom/google/android/gms/measurement/internal/zzam;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzam;->zzhb()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzbd;->zzcc(Ljava/lang/String;)V

    .line 208
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapj:Lcom/google/android/gms/measurement/internal/zzq;

    .line 209
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgk()Lcom/google/android/gms/measurement/internal/zzam;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzam;->zzal()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzq;->zzbi(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 210
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapn:Lcom/google/android/gms/measurement/internal/zzfd;

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzago:J

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzfd;->zzaj(J)V

    .line 211
    :cond_9
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgj()Lcom/google/android/gms/measurement/internal/zzda;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgu()Lcom/google/android/gms/measurement/internal/zzbd;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzbd;->zzanh:Lcom/google/android/gms/measurement/internal/zzbi;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzbi;->zzkd()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzda;->zzcp(Ljava/lang/String;)V

    .line 213
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaih:Lcom/google/android/gms/measurement/internal/zzn;

    .line 215
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgk()Lcom/google/android/gms/measurement/internal/zzam;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzam;->getGmpAppId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 216
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgk()Lcom/google/android/gms/measurement/internal/zzam;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzam;->zzhb()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_e

    .line 217
    :cond_a
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->isEnabled()Z

    move-result v0

    .line 218
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgu()Lcom/google/android/gms/measurement/internal/zzbd;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzbd;->zzkc()Z

    move-result v1

    if-nez v1, :cond_b

    .line 219
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapj:Lcom/google/android/gms/measurement/internal/zzq;

    .line 220
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzq;->zzhz()Z

    move-result v1

    if-nez v1, :cond_b

    .line 221
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgu()Lcom/google/android/gms/measurement/internal/zzbd;

    move-result-object v1

    xor-int/lit8 v2, v0, 0x1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/zzbd;->zzi(Z)V

    .line 223
    :cond_b
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapj:Lcom/google/android/gms/measurement/internal/zzq;

    .line 224
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgk()Lcom/google/android/gms/measurement/internal/zzam;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzam;->zzal()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/zzq;->zzba(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    if-eqz v0, :cond_d

    .line 226
    :cond_c
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgj()Lcom/google/android/gms/measurement/internal/zzda;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzda;->zzld()V

    .line 227
    :cond_d
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgl()Lcom/google/android/gms/measurement/internal/zzeb;

    move-result-object v0

    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzeb;->zza(Ljava/util/concurrent/atomic/AtomicReference;)V

    :cond_e
    return-void
.end method

.method final zzb(Lcom/google/android/gms/measurement/internal/zzcs;)V
    .locals 0

    .line 367
    iget p1, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaqe:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaqe:I

    return-void
.end method

.method final zzb(Lcom/google/android/gms/measurement/internal/zzf;)V
    .locals 0

    .line 369
    iget p1, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaqe:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaqe:I

    return-void
.end method

.method public final zzbx()Lcom/google/android/gms/common/util/Clock;
    .locals 1

    .line 257
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzrz:Lcom/google/android/gms/common/util/Clock;

    return-object v0
.end method

.method final zzd(Z)V
    .locals 0
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 304
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaqb:Ljava/lang/Boolean;

    return-void
.end method

.method final zzgf()V
    .locals 2

    .line 364
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaih:Lcom/google/android/gms/measurement/internal/zzn;

    .line 366
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unexpected call on client side"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method final zzgg()V
    .locals 1

    .line 359
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaih:Lcom/google/android/gms/measurement/internal/zzn;

    return-void
.end method

.method public final zzgi()Lcom/google/android/gms/measurement/internal/zza;
    .locals 2

    .line 266
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapt:Lcom/google/android/gms/measurement/internal/zza;

    if-eqz v0, :cond_0

    return-object v0

    .line 268
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Component not created"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final zzgj()Lcom/google/android/gms/measurement/internal/zzda;
    .locals 1

    .line 242
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaps:Lcom/google/android/gms/measurement/internal/zzda;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zza(Lcom/google/android/gms/measurement/internal/zzf;)V

    .line 243
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaps:Lcom/google/android/gms/measurement/internal/zzda;

    return-object v0
.end method

.method public final zzgk()Lcom/google/android/gms/measurement/internal/zzam;
    .locals 1

    .line 264
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapx:Lcom/google/android/gms/measurement/internal/zzam;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zza(Lcom/google/android/gms/measurement/internal/zzf;)V

    .line 265
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapx:Lcom/google/android/gms/measurement/internal/zzam;

    return-object v0
.end method

.method public final zzgl()Lcom/google/android/gms/measurement/internal/zzeb;
    .locals 1

    .line 260
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapv:Lcom/google/android/gms/measurement/internal/zzeb;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zza(Lcom/google/android/gms/measurement/internal/zzf;)V

    .line 261
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapv:Lcom/google/android/gms/measurement/internal/zzeb;

    return-object v0
.end method

.method public final zzgm()Lcom/google/android/gms/measurement/internal/zzdy;
    .locals 1

    .line 258
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapr:Lcom/google/android/gms/measurement/internal/zzdy;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zza(Lcom/google/android/gms/measurement/internal/zzf;)V

    .line 259
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapr:Lcom/google/android/gms/measurement/internal/zzdy;

    return-object v0
.end method

.method public final zzgn()Lcom/google/android/gms/measurement/internal/zzao;
    .locals 1

    .line 249
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapu:Lcom/google/android/gms/measurement/internal/zzao;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zza(Lcom/google/android/gms/measurement/internal/zzf;)V

    .line 250
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapu:Lcom/google/android/gms/measurement/internal/zzao;

    return-object v0
.end method

.method public final zzgo()Lcom/google/android/gms/measurement/internal/zzfd;
    .locals 1

    .line 238
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapn:Lcom/google/android/gms/measurement/internal/zzfd;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zza(Lcom/google/android/gms/measurement/internal/zzf;)V

    .line 239
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapn:Lcom/google/android/gms/measurement/internal/zzfd;

    return-object v0
.end method

.method public final zzgp()Lcom/google/android/gms/measurement/internal/zzaa;
    .locals 1

    .line 262
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapw:Lcom/google/android/gms/measurement/internal/zzaa;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zza(Lcom/google/android/gms/measurement/internal/zzcs;)V

    .line 263
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapw:Lcom/google/android/gms/measurement/internal/zzaa;

    return-object v0
.end method

.method public final zzgq()Lcom/google/android/gms/measurement/internal/zzaq;
    .locals 1

    .line 247
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapq:Lcom/google/android/gms/measurement/internal/zzaq;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zza(Lcom/google/android/gms/measurement/internal/zzcr;)V

    .line 248
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapq:Lcom/google/android/gms/measurement/internal/zzaq;

    return-object v0
.end method

.method public final zzgr()Lcom/google/android/gms/measurement/internal/zzfy;
    .locals 1

    .line 245
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapp:Lcom/google/android/gms/measurement/internal/zzfy;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zza(Lcom/google/android/gms/measurement/internal/zzcr;)V

    .line 246
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapp:Lcom/google/android/gms/measurement/internal/zzfy;

    return-object v0
.end method

.method public final zzgs()Lcom/google/android/gms/measurement/internal/zzbr;
    .locals 1

    .line 236
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapm:Lcom/google/android/gms/measurement/internal/zzbr;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zza(Lcom/google/android/gms/measurement/internal/zzcs;)V

    .line 237
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapm:Lcom/google/android/gms/measurement/internal/zzbr;

    return-object v0
.end method

.method public final zzgt()Lcom/google/android/gms/measurement/internal/zzas;
    .locals 1

    .line 233
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapl:Lcom/google/android/gms/measurement/internal/zzas;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zza(Lcom/google/android/gms/measurement/internal/zzcs;)V

    .line 234
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapl:Lcom/google/android/gms/measurement/internal/zzas;

    return-object v0
.end method

.method public final zzgu()Lcom/google/android/gms/measurement/internal/zzbd;
    .locals 1

    .line 231
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapk:Lcom/google/android/gms/measurement/internal/zzbd;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zza(Lcom/google/android/gms/measurement/internal/zzcr;)V

    .line 232
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapk:Lcom/google/android/gms/measurement/internal/zzbd;

    return-object v0
.end method

.method public final zzgv()Lcom/google/android/gms/measurement/internal/zzq;
    .locals 1

    .line 230
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapj:Lcom/google/android/gms/measurement/internal/zzq;

    return-object v0
.end method

.method public final zzgw()Lcom/google/android/gms/measurement/internal/zzn;
    .locals 1

    .line 229
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaih:Lcom/google/android/gms/measurement/internal/zzn;

    return-object v0
.end method

.method public final zzkj()Lcom/google/android/gms/measurement/internal/zzas;
    .locals 1

    .line 235
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapl:Lcom/google/android/gms/measurement/internal/zzas;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcs;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapl:Lcom/google/android/gms/measurement/internal/zzas;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzkk()Lcom/google/android/gms/measurement/internal/zzbj;
    .locals 1

    .line 240
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapy:Lcom/google/android/gms/measurement/internal/zzbj;

    return-object v0
.end method

.method final zzkl()Lcom/google/android/gms/measurement/internal/zzbr;
    .locals 1

    .line 241
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapm:Lcom/google/android/gms/measurement/internal/zzbr;

    return-object v0
.end method

.method public final zzkm()Lcom/google/android/gms/measurement/AppMeasurement;
    .locals 1

    .line 244
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapo:Lcom/google/android/gms/measurement/AppMeasurement;

    return-object v0
.end method

.method public final zzkn()Z
    .locals 1

    .line 252
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzadi:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    return v0
.end method

.method public final zzko()Ljava/lang/String;
    .locals 1

    .line 253
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzadi:Ljava/lang/String;

    return-object v0
.end method

.method public final zzkp()Ljava/lang/String;
    .locals 1

    .line 254
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaph:Ljava/lang/String;

    return-object v0
.end method

.method public final zzkq()Ljava/lang/String;
    .locals 1

    .line 255
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapi:Ljava/lang/String;

    return-object v0
.end method

.method public final zzkr()Z
    .locals 1

    .line 256
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzadg:Z

    return v0
.end method

.method public final zzks()Z
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 306
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaqb:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaqb:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method final zzkt()J
    .locals 5

    .line 354
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgu()Lcom/google/android/gms/measurement/internal/zzbd;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzbd;->zzanf:Lcom/google/android/gms/measurement/internal/zzbg;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbg;->get()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 355
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    .line 356
    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzago:J

    return-wide v0

    .line 357
    :cond_0
    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzago:J

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method final zzku()V
    .locals 1

    .line 371
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaqf:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-void
.end method

.method protected final zzkv()Z
    .locals 5
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 373
    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzcl()V

    .line 375
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 376
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapz:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaqa:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-eqz v1, :cond_0

    if-eqz v0, :cond_5

    .line 377
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_5

    .line 378
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzrz:Lcom/google/android/gms/common/util/Clock;

    .line 379
    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaqa:J

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-lez v0, :cond_5

    .line 381
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzrz:Lcom/google/android/gms/common/util/Clock;

    .line 382
    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaqa:J

    .line 384
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzaih:Lcom/google/android/gms/measurement/internal/zzn;

    .line 388
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgr()Lcom/google/android/gms/measurement/internal/zzfy;

    move-result-object v0

    const-string v1, "android.permission.INTERNET"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzfy;->zzx(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    .line 389
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgr()Lcom/google/android/gms/measurement/internal/zzfy;

    move-result-object v0

    const-string v3, "android.permission.ACCESS_NETWORK_STATE"

    invoke-virtual {v0, v3}, Lcom/google/android/gms/measurement/internal/zzfy;->zzx(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 390
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzri:Landroid/content/Context;

    .line 391
    invoke-static {v0}, Lcom/google/android/gms/common/wrappers/Wrappers;->packageManager(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;->isCallerInstantApp()Z

    move-result v0

    if-nez v0, :cond_1

    .line 392
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapj:Lcom/google/android/gms/measurement/internal/zzq;

    .line 393
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzq;->zzif()Z

    move-result v0

    if-nez v0, :cond_1

    .line 394
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzri:Landroid/content/Context;

    .line 395
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzbm;->zza(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 396
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzri:Landroid/content/Context;

    .line 397
    invoke-static {v0, v2}, Lcom/google/android/gms/measurement/internal/zzfy;->zza(Landroid/content/Context;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    move v0, v1

    goto :goto_0

    :cond_2
    move v0, v2

    .line 398
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapz:Ljava/lang/Boolean;

    .line 399
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapz:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 401
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgr()Lcom/google/android/gms/measurement/internal/zzfy;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgk()Lcom/google/android/gms/measurement/internal/zzam;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzam;->getGmpAppId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgk()Lcom/google/android/gms/measurement/internal/zzam;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzam;->zzhb()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/measurement/internal/zzfy;->zzu(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 402
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgk()Lcom/google/android/gms/measurement/internal/zzam;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzam;->zzhb()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    move v1, v2

    .line 403
    :cond_4
    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapz:Ljava/lang/Boolean;

    .line 404
    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbw;->zzapz:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
