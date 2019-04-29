.class public Lcom/google/android/gms/internal/measurement/zzgm;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzhj;


# static fields
.field private static volatile zzamn:Lcom/google/android/gms/internal/measurement/zzgm;


# instance fields
.field private final zzaem:J

.field private final zzagd:Lcom/google/android/gms/internal/measurement/zzec;

.field private final zzamo:Ljava/lang/String;

.field private final zzamp:Lcom/google/android/gms/internal/measurement/zzeg;

.field private final zzamq:Lcom/google/android/gms/internal/measurement/zzfs;

.field private final zzamr:Lcom/google/android/gms/internal/measurement/zzfh;

.field private final zzams:Lcom/google/android/gms/internal/measurement/zzgh;

.field private final zzamt:Lcom/google/android/gms/internal/measurement/zzji;

.field private final zzamu:Lcom/google/android/gms/measurement/AppMeasurement;

.field private final zzamv:Lcom/google/firebase/analytics/FirebaseAnalytics;

.field private final zzamw:Lcom/google/android/gms/internal/measurement/zzkc;

.field private final zzamx:Lcom/google/android/gms/internal/measurement/zzff;

.field private final zzamy:Lcom/google/android/gms/internal/measurement/zzig;

.field private final zzamz:Lcom/google/android/gms/internal/measurement/zzhl;

.field private final zzana:Lcom/google/android/gms/internal/measurement/zzdu;

.field private zzanb:Lcom/google/android/gms/internal/measurement/zzfd;

.field private zzanc:Lcom/google/android/gms/internal/measurement/zzij;

.field private zzand:Lcom/google/android/gms/internal/measurement/zzeq;

.field private zzane:Lcom/google/android/gms/internal/measurement/zzfc;

.field private zzanf:Lcom/google/android/gms/internal/measurement/zzfy;

.field private zzang:Ljava/lang/Boolean;

.field private zzanh:J

.field private zzani:I

.field private zzanj:I

.field private final zzqx:Landroid/content/Context;

.field private final zzro:Lcom/google/android/gms/common/util/Clock;

.field private zzvo:Z


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/measurement/zzhk;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzvo:Z

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzhk;->zzqx:Landroid/content/Context;

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzec;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/measurement/zzec;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzagd:Lcom/google/android/gms/internal/measurement/zzec;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzagd:Lcom/google/android/gms/internal/measurement/zzec;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzey;->zza(Lcom/google/android/gms/internal/measurement/zzec;)V

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzhk;->zzqx:Landroid/content/Context;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzqx:Landroid/content/Context;

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzhk;->zzamo:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamo:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzqx:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzwu;->init(Landroid/content/Context;)V

    invoke-static {}, Lcom/google/android/gms/common/util/DefaultClock;->getInstance()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzro:Lcom/google/android/gms/common/util/Clock;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzro:Lcom/google/android/gms/common/util/Clock;

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzaem:J

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzeg;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/zzeg;-><init>(Lcom/google/android/gms/internal/measurement/zzgm;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamp:Lcom/google/android/gms/internal/measurement/zzeg;

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzfs;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/zzfs;-><init>(Lcom/google/android/gms/internal/measurement/zzgm;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzm()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamq:Lcom/google/android/gms/internal/measurement/zzfs;

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzfh;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/zzfh;-><init>(Lcom/google/android/gms/internal/measurement/zzgm;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzm()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamr:Lcom/google/android/gms/internal/measurement/zzfh;

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzkc;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/zzkc;-><init>(Lcom/google/android/gms/internal/measurement/zzgm;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzm()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamw:Lcom/google/android/gms/internal/measurement/zzkc;

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzff;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/zzff;-><init>(Lcom/google/android/gms/internal/measurement/zzgm;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzm()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamx:Lcom/google/android/gms/internal/measurement/zzff;

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzdu;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/zzdu;-><init>(Lcom/google/android/gms/internal/measurement/zzgm;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzana:Lcom/google/android/gms/internal/measurement/zzdu;

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzig;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/zzig;-><init>(Lcom/google/android/gms/internal/measurement/zzgm;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzm()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamy:Lcom/google/android/gms/internal/measurement/zzig;

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzhl;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/zzhl;-><init>(Lcom/google/android/gms/internal/measurement/zzgm;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzm()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamz:Lcom/google/android/gms/internal/measurement/zzhl;

    new-instance v0, Lcom/google/android/gms/measurement/AppMeasurement;

    invoke-direct {v0, p0}, Lcom/google/android/gms/measurement/AppMeasurement;-><init>(Lcom/google/android/gms/internal/measurement/zzgm;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamu:Lcom/google/android/gms/measurement/AppMeasurement;

    new-instance v0, Lcom/google/firebase/analytics/FirebaseAnalytics;

    invoke-direct {v0, p0}, Lcom/google/firebase/analytics/FirebaseAnalytics;-><init>(Lcom/google/android/gms/internal/measurement/zzgm;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamv:Lcom/google/firebase/analytics/FirebaseAnalytics;

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzji;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/zzji;-><init>(Lcom/google/android/gms/internal/measurement/zzgm;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzm()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamt:Lcom/google/android/gms/internal/measurement/zzji;

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzgh;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/zzgh;-><init>(Lcom/google/android/gms/internal/measurement/zzgm;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzm()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzams:Lcom/google/android/gms/internal/measurement/zzgh;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzagd:Lcom/google/android/gms/internal/measurement/zzec;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzqx:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Landroid/app/Application;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzfv()Lcom/google/android/gms/internal/measurement/zzhl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    instance-of v1, v1, Landroid/app/Application;

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    check-cast v1, Landroid/app/Application;

    iget-object v2, v0, Lcom/google/android/gms/internal/measurement/zzhl;->zzanz:Lcom/google/android/gms/internal/measurement/zzie;

    if-nez v2, :cond_0

    new-instance v2, Lcom/google/android/gms/internal/measurement/zzie;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lcom/google/android/gms/internal/measurement/zzie;-><init>(Lcom/google/android/gms/internal/measurement/zzhl;Lcom/google/android/gms/internal/measurement/zzhm;)V

    iput-object v2, v0, Lcom/google/android/gms/internal/measurement/zzhl;->zzanz:Lcom/google/android/gms/internal/measurement/zzie;

    :cond_0
    iget-object v2, v0, Lcom/google/android/gms/internal/measurement/zzhl;->zzanz:Lcom/google/android/gms/internal/measurement/zzie;

    invoke-virtual {v1, v2}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object v2, v0, Lcom/google/android/gms/internal/measurement/zzhl;->zzanz:Lcom/google/android/gms/internal/measurement/zzie;

    invoke-virtual {v1, v2}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Registered activity lifecycle callback"

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Application context is not an Application"

    :goto_0
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzams:Lcom/google/android/gms/internal/measurement/zzgh;

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzgn;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/measurement/zzgn;-><init>(Lcom/google/android/gms/internal/measurement/zzgm;Lcom/google/android/gms/internal/measurement/zzhk;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzgh;->zzc(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static zza(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzgm;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lcom/google/android/gms/internal/measurement/zzgm;->zzamn:Lcom/google/android/gms/internal/measurement/zzgm;

    if-nez p1, :cond_1

    const-class p1, Lcom/google/android/gms/internal/measurement/zzgm;

    monitor-enter p1

    :try_start_0
    sget-object p2, Lcom/google/android/gms/internal/measurement/zzgm;->zzamn:Lcom/google/android/gms/internal/measurement/zzgm;

    if-nez p2, :cond_0

    new-instance p2, Lcom/google/android/gms/internal/measurement/zzhk;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, Lcom/google/android/gms/internal/measurement/zzhk;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    new-instance p0, Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/measurement/zzgm;-><init>(Lcom/google/android/gms/internal/measurement/zzhk;)V

    sput-object p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamn:Lcom/google/android/gms/internal/measurement/zzgm;

    :cond_0
    monitor-exit p1

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    sget-object p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamn:Lcom/google/android/gms/internal/measurement/zzgm;

    return-object p0
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/measurement/zzgm;Lcom/google/android/gms/internal/measurement/zzhk;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzgm;->zza(Lcom/google/android/gms/internal/measurement/zzhk;)V

    return-void
.end method

.method private static zza(Lcom/google/android/gms/internal/measurement/zzhh;)V
    .locals 1

    if-nez p0, :cond_0

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Component not created"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    return-void
.end method

.method private static zza(Lcom/google/android/gms/internal/measurement/zzhi;)V
    .locals 3

    if-nez p0, :cond_0

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Component not created"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const/16 v1, 0x1b

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v1, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Component not initialized: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method private final zza(Lcom/google/android/gms/internal/measurement/zzhk;)V
    .locals 5
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzge()Lcom/google/android/gms/internal/measurement/zzgh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzeg;->zzhi()Ljava/lang/String;

    new-instance p1, Lcom/google/android/gms/internal/measurement/zzeq;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/measurement/zzeq;-><init>(Lcom/google/android/gms/internal/measurement/zzgm;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzhi;->zzm()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzand:Lcom/google/android/gms/internal/measurement/zzeq;

    new-instance p1, Lcom/google/android/gms/internal/measurement/zzfc;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/measurement/zzfc;-><init>(Lcom/google/android/gms/internal/measurement/zzgm;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzhi;->zzm()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzane:Lcom/google/android/gms/internal/measurement/zzfc;

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzfd;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/zzfd;-><init>(Lcom/google/android/gms/internal/measurement/zzgm;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzm()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzanb:Lcom/google/android/gms/internal/measurement/zzfd;

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzij;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/zzij;-><init>(Lcom/google/android/gms/internal/measurement/zzgm;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzm()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzanc:Lcom/google/android/gms/internal/measurement/zzij;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamw:Lcom/google/android/gms/internal/measurement/zzkc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzke()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamq:Lcom/google/android/gms/internal/measurement/zzfs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzke()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzfy;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/zzfy;-><init>(Lcom/google/android/gms/internal/measurement/zzgm;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzanf:Lcom/google/android/gms/internal/measurement/zzfy;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzane:Lcom/google/android/gms/internal/measurement/zzfc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzke()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zzix()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "App measurement is starting up, version"

    const-wide/16 v2, 0x30a3

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzagd:Lcom/google/android/gms/internal/measurement/zzec;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zzix()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzagd:Lcom/google/android/gms/internal/measurement/zzec;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfc;->zzah()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzkc;->zzci(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzix()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p1

    const-string v0, "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none."

    move-object v4, v0

    move-object v0, p1

    move-object p1, v4

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zzix()Lcom/google/android/gms/internal/measurement/zzfj;

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

    :goto_0
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zziy()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p1

    const-string v0, "Debug-level message logging enabled"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    iget p1, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzani:I

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzanj:I

    if-eq p1, v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p1

    const-string v0, "Not all components initialized"

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzani:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzanj:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzvo:Z

    return-void
.end method

.method private final zzch()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzvo:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "AppMeasurement is not initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method


# virtual methods
.method public final getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzqx:Landroid/content/Context;

    return-object v0
.end method

.method public final isEnabled()Z
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzge()Lcom/google/android/gms/internal/measurement/zzgh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzch()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamp:Lcom/google/android/gms/internal/measurement/zzeg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzeg;->zzhj()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamp:Lcom/google/android/gms/internal/measurement/zzeg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzeg;->zzhk()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/common/api/internal/GoogleServices;->isMeasurementExplicitlyDisabled()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v1, 0x1

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfs;->zzg(Z)Z

    move-result v0

    return v0
.end method

.method protected final start()V
    .locals 6
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzge()Lcom/google/android/gms/internal/measurement/zzgh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzfs;->zzakd:Lcom/google/android/gms/internal/measurement/zzfv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfv;->get()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzfs;->zzakd:Lcom/google/android/gms/internal/measurement/zzfv;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzro:Lcom/google/android/gms/common/util/Clock;

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/internal/measurement/zzfv;->set(J)V

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzfs;->zzaki:Lcom/google/android/gms/internal/measurement/zzfv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfv;->get()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Persisting first open"

    iget-wide v2, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzaem:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzfs;->zzaki:Lcom/google/android/gms/internal/measurement/zzfv;

    iget-wide v1, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzaem:J

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzfv;->set(J)V

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzkd()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v0

    const-string v1, "android.permission.INTERNET"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzkc;->zzw(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "App is missing INTERNET permission"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v0

    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzkc;->zzw(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "App is missing ACCESS_NETWORK_STATE permission"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzagd:Lcom/google/android/gms/internal/measurement/zzec;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzqx:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/common/wrappers/Wrappers;->packageManager(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;->isCallerInstantApp()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzqx:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzgc;->zza(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "AppMeasurementReceiver not registered/enabled"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzqx:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/zzkc;->zza(Landroid/content/Context;Z)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "AppMeasurementService not registered/enabled"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    :cond_5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Uploading is not possible. App measurement disabled"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    return-void

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzagd:Lcom/google/android/gms/internal/measurement/zzec;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzfw()Lcom/google/android/gms/internal/measurement/zzfc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfc;->getGmpAppId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfs;->zzjg()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_7

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzfw()Lcom/google/android/gms/internal/measurement/zzfc;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfc;->getGmpAppId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfs;->zzbp(Ljava/lang/String;)V

    goto :goto_0

    :cond_7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzfw()Lcom/google/android/gms/internal/measurement/zzfc;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfc;->getGmpAppId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zzix()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Rechecking which service to use due to a GMP App Id change"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfs;->zzjj()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzanc:Lcom/google/android/gms/internal/measurement/zzij;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzij;->disconnect()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzanc:Lcom/google/android/gms/internal/measurement/zzij;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzij;->zzdf()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzfw()Lcom/google/android/gms/internal/measurement/zzfc;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfc;->getGmpAppId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfs;->zzbp(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzfs;->zzaki:Lcom/google/android/gms/internal/measurement/zzfv;

    iget-wide v1, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzaem:J

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzfv;->set(J)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzfs;->zzakk:Lcom/google/android/gms/internal/measurement/zzfx;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfx;->zzbr(Ljava/lang/String;)V

    :cond_8
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzfv()Lcom/google/android/gms/internal/measurement/zzhl;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/zzfs;->zzakk:Lcom/google/android/gms/internal/measurement/zzfx;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfx;->zzjn()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzhl;->zzbq(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzagd:Lcom/google/android/gms/internal/measurement/zzec;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzfw()Lcom/google/android/gms/internal/measurement/zzfc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfc;->getGmpAppId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_c

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->isEnabled()Z

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfs;->zzjm()Z

    move-result v1

    if-nez v1, :cond_9

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamp:Lcom/google/android/gms/internal/measurement/zzeg;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzeg;->zzhj()Z

    move-result v1

    if-nez v1, :cond_9

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v1

    xor-int/lit8 v2, v0, 0x1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/measurement/zzfs;->zzh(Z)V

    :cond_9
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamp:Lcom/google/android/gms/internal/measurement/zzeg;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzfw()Lcom/google/android/gms/internal/measurement/zzfc;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfc;->zzah()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/measurement/zzeg;->zzay(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    if-eqz v0, :cond_b

    :cond_a
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzfv()Lcom/google/android/gms/internal/measurement/zzhl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhl;->zzkj()V

    :cond_b
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzfy()Lcom/google/android/gms/internal/measurement/zzij;

    move-result-object v0

    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzij;->zza(Ljava/util/concurrent/atomic/AtomicReference;)V

    :cond_c
    return-void
.end method

.method final zzb(Lcom/google/android/gms/internal/measurement/zzhi;)V
    .locals 0

    iget p1, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzani:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzani:I

    return-void
.end method

.method public final zzbt()Lcom/google/android/gms/common/util/Clock;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzro:Lcom/google/android/gms/common/util/Clock;

    return-object v0
.end method

.method final zzfr()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzagd:Lcom/google/android/gms/internal/measurement/zzec;

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unexpected call on client side"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method final zzfs()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzagd:Lcom/google/android/gms/internal/measurement/zzec;

    return-void
.end method

.method public final zzfu()Lcom/google/android/gms/internal/measurement/zzdu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzana:Lcom/google/android/gms/internal/measurement/zzdu;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zza(Lcom/google/android/gms/internal/measurement/zzhh;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzana:Lcom/google/android/gms/internal/measurement/zzdu;

    return-object v0
.end method

.method public final zzfv()Lcom/google/android/gms/internal/measurement/zzhl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamz:Lcom/google/android/gms/internal/measurement/zzhl;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zza(Lcom/google/android/gms/internal/measurement/zzhi;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamz:Lcom/google/android/gms/internal/measurement/zzhl;

    return-object v0
.end method

.method public final zzfw()Lcom/google/android/gms/internal/measurement/zzfc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzane:Lcom/google/android/gms/internal/measurement/zzfc;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zza(Lcom/google/android/gms/internal/measurement/zzhi;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzane:Lcom/google/android/gms/internal/measurement/zzfc;

    return-object v0
.end method

.method public final zzfx()Lcom/google/android/gms/internal/measurement/zzeq;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzand:Lcom/google/android/gms/internal/measurement/zzeq;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zza(Lcom/google/android/gms/internal/measurement/zzhi;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzand:Lcom/google/android/gms/internal/measurement/zzeq;

    return-object v0
.end method

.method public final zzfy()Lcom/google/android/gms/internal/measurement/zzij;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzanc:Lcom/google/android/gms/internal/measurement/zzij;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zza(Lcom/google/android/gms/internal/measurement/zzhi;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzanc:Lcom/google/android/gms/internal/measurement/zzij;

    return-object v0
.end method

.method public final zzfz()Lcom/google/android/gms/internal/measurement/zzig;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamy:Lcom/google/android/gms/internal/measurement/zzig;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zza(Lcom/google/android/gms/internal/measurement/zzhi;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamy:Lcom/google/android/gms/internal/measurement/zzig;

    return-object v0
.end method

.method public final zzga()Lcom/google/android/gms/internal/measurement/zzfd;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzanb:Lcom/google/android/gms/internal/measurement/zzfd;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zza(Lcom/google/android/gms/internal/measurement/zzhi;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzanb:Lcom/google/android/gms/internal/measurement/zzfd;

    return-object v0
.end method

.method public final zzgb()Lcom/google/android/gms/internal/measurement/zzff;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamx:Lcom/google/android/gms/internal/measurement/zzff;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zza(Lcom/google/android/gms/internal/measurement/zzhh;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamx:Lcom/google/android/gms/internal/measurement/zzff;

    return-object v0
.end method

.method public final zzgc()Lcom/google/android/gms/internal/measurement/zzkc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamw:Lcom/google/android/gms/internal/measurement/zzkc;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zza(Lcom/google/android/gms/internal/measurement/zzhh;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamw:Lcom/google/android/gms/internal/measurement/zzkc;

    return-object v0
.end method

.method public final zzgd()Lcom/google/android/gms/internal/measurement/zzji;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamt:Lcom/google/android/gms/internal/measurement/zzji;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zza(Lcom/google/android/gms/internal/measurement/zzhi;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamt:Lcom/google/android/gms/internal/measurement/zzji;

    return-object v0
.end method

.method public final zzge()Lcom/google/android/gms/internal/measurement/zzgh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzams:Lcom/google/android/gms/internal/measurement/zzgh;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zza(Lcom/google/android/gms/internal/measurement/zzhi;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzams:Lcom/google/android/gms/internal/measurement/zzgh;

    return-object v0
.end method

.method public final zzgf()Lcom/google/android/gms/internal/measurement/zzfh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamr:Lcom/google/android/gms/internal/measurement/zzfh;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zza(Lcom/google/android/gms/internal/measurement/zzhi;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamr:Lcom/google/android/gms/internal/measurement/zzfh;

    return-object v0
.end method

.method public final zzgg()Lcom/google/android/gms/internal/measurement/zzfs;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamq:Lcom/google/android/gms/internal/measurement/zzfs;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zza(Lcom/google/android/gms/internal/measurement/zzhh;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamq:Lcom/google/android/gms/internal/measurement/zzfs;

    return-object v0
.end method

.method public final zzgh()Lcom/google/android/gms/internal/measurement/zzeg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamp:Lcom/google/android/gms/internal/measurement/zzeg;

    return-object v0
.end method

.method public final zzgi()Lcom/google/android/gms/internal/measurement/zzec;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzagd:Lcom/google/android/gms/internal/measurement/zzec;

    return-object v0
.end method

.method public final zzjv()Lcom/google/android/gms/internal/measurement/zzfh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamr:Lcom/google/android/gms/internal/measurement/zzfh;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamr:Lcom/google/android/gms/internal/measurement/zzfh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhi;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamr:Lcom/google/android/gms/internal/measurement/zzfh;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzjw()Lcom/google/android/gms/internal/measurement/zzfy;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzanf:Lcom/google/android/gms/internal/measurement/zzfy;

    return-object v0
.end method

.method final zzjx()Lcom/google/android/gms/internal/measurement/zzgh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzams:Lcom/google/android/gms/internal/measurement/zzgh;

    return-object v0
.end method

.method public final zzjy()Lcom/google/android/gms/measurement/AppMeasurement;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamu:Lcom/google/android/gms/measurement/AppMeasurement;

    return-object v0
.end method

.method public final zzjz()Lcom/google/firebase/analytics/FirebaseAnalytics;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamv:Lcom/google/firebase/analytics/FirebaseAnalytics;

    return-object v0
.end method

.method public final zzka()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzamo:Ljava/lang/String;

    return-object v0
.end method

.method final zzkb()J
    .locals 6

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzfs;->zzaki:Lcom/google/android/gms/internal/measurement/zzfv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfv;->get()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzaem:J

    return-wide v0

    :cond_0
    iget-wide v1, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzaem:J

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method final zzkc()V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzanj:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzanj:I

    return-void
.end method

.method protected final zzkd()Z
    .locals 6
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzch()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzge()Lcom/google/android/gms/internal/measurement/zzgh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzang:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzanh:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzang:Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzang:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzro:Lcom/google/android/gms/common/util/Clock;

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzanh:J

    sub-long v4, v0, v2

    invoke-static {v4, v5}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    cmp-long v4, v0, v2

    if-lez v4, :cond_3

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzro:Lcom/google/android/gms/common/util/Clock;

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzanh:J

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzagd:Lcom/google/android/gms/internal/measurement/zzec;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v0

    const-string v1, "android.permission.INTERNET"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzkc;->zzw(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v0

    const-string v2, "android.permission.ACCESS_NETWORK_STATE"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/zzkc;->zzw(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzqx:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/common/wrappers/Wrappers;->packageManager(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;->isCallerInstantApp()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzqx:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzgc;->zza(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzqx:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/zzkc;->zza(Landroid/content/Context;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzang:Ljava/lang/Boolean;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzang:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzfw()Lcom/google/android/gms/internal/measurement/zzfc;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfc;->getGmpAppId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzkc;->zzcf(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzang:Ljava/lang/Boolean;

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgm;->zzang:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
