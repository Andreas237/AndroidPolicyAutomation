.class public Lcom/google/android/gms/internal/measurement/zzat;
.super Ljava/lang/Object;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "StaticFieldLeak"
    }
.end annotation


# static fields
.field private static volatile zzvq:Lcom/google/android/gms/internal/measurement/zzat;


# instance fields
.field private final zzqx:Landroid/content/Context;

.field private final zzro:Lcom/google/android/gms/common/util/Clock;

.field private final zzvr:Landroid/content/Context;

.field private final zzvs:Lcom/google/android/gms/internal/measurement/zzbu;

.field private final zzvt:Lcom/google/android/gms/internal/measurement/zzcm;

.field private final zzvu:Lcom/google/android/gms/analytics/zzk;

.field private final zzvv:Lcom/google/android/gms/internal/measurement/zzai;

.field private final zzvw:Lcom/google/android/gms/internal/measurement/zzbz;

.field private final zzvx:Lcom/google/android/gms/internal/measurement/zzde;

.field private final zzvy:Lcom/google/android/gms/internal/measurement/zzcq;

.field private final zzvz:Lcom/google/android/gms/analytics/GoogleAnalytics;

.field private final zzwa:Lcom/google/android/gms/internal/measurement/zzbl;

.field private final zzwb:Lcom/google/android/gms/internal/measurement/zzah;

.field private final zzwc:Lcom/google/android/gms/internal/measurement/zzbe;

.field private final zzwd:Lcom/google/android/gms/internal/measurement/zzby;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/measurement/zzav;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzav;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "Application context can\'t be null"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzav;->zzci()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzqx:Landroid/content/Context;

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvr:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/common/util/DefaultClock;->getInstance()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzro:Lcom/google/android/gms/common/util/Clock;

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzbu;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/measurement/zzbu;-><init>(Lcom/google/android/gms/internal/measurement/zzat;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvs:Lcom/google/android/gms/internal/measurement/zzbu;

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzcm;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/measurement/zzcm;-><init>(Lcom/google/android/gms/internal/measurement/zzat;)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzar;->zzm()V

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvt:Lcom/google/android/gms/internal/measurement/zzcm;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzat;->zzbu()Lcom/google/android/gms/internal/measurement/zzcm;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/measurement/zzas;->VERSION:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v4, 0x86

    add-int/2addr v4, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Google Analytics "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/measurement/zzaq;->zzr(Ljava/lang/String;)V

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzcq;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/measurement/zzcq;-><init>(Lcom/google/android/gms/internal/measurement/zzat;)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzar;->zzm()V

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvy:Lcom/google/android/gms/internal/measurement/zzcq;

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzde;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/measurement/zzde;-><init>(Lcom/google/android/gms/internal/measurement/zzat;)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzar;->zzm()V

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvx:Lcom/google/android/gms/internal/measurement/zzde;

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzai;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/measurement/zzai;-><init>(Lcom/google/android/gms/internal/measurement/zzat;Lcom/google/android/gms/internal/measurement/zzav;)V

    new-instance p1, Lcom/google/android/gms/internal/measurement/zzbl;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/measurement/zzbl;-><init>(Lcom/google/android/gms/internal/measurement/zzat;)V

    new-instance v2, Lcom/google/android/gms/internal/measurement/zzah;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/measurement/zzah;-><init>(Lcom/google/android/gms/internal/measurement/zzat;)V

    new-instance v3, Lcom/google/android/gms/internal/measurement/zzbe;

    invoke-direct {v3, p0}, Lcom/google/android/gms/internal/measurement/zzbe;-><init>(Lcom/google/android/gms/internal/measurement/zzat;)V

    new-instance v4, Lcom/google/android/gms/internal/measurement/zzby;

    invoke-direct {v4, p0}, Lcom/google/android/gms/internal/measurement/zzby;-><init>(Lcom/google/android/gms/internal/measurement/zzat;)V

    invoke-static {v0}, Lcom/google/android/gms/analytics/zzk;->zzb(Landroid/content/Context;)Lcom/google/android/gms/analytics/zzk;

    move-result-object v0

    new-instance v5, Lcom/google/android/gms/internal/measurement/zzau;

    invoke-direct {v5, p0}, Lcom/google/android/gms/internal/measurement/zzau;-><init>(Lcom/google/android/gms/internal/measurement/zzat;)V

    invoke-virtual {v0, v5}, Lcom/google/android/gms/analytics/zzk;->zza(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvu:Lcom/google/android/gms/analytics/zzk;

    new-instance v0, Lcom/google/android/gms/analytics/GoogleAnalytics;

    invoke-direct {v0, p0}, Lcom/google/android/gms/analytics/GoogleAnalytics;-><init>(Lcom/google/android/gms/internal/measurement/zzat;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzar;->zzm()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzwa:Lcom/google/android/gms/internal/measurement/zzbl;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzar;->zzm()V

    iput-object v2, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzwb:Lcom/google/android/gms/internal/measurement/zzah;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzar;->zzm()V

    iput-object v3, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzwc:Lcom/google/android/gms/internal/measurement/zzbe;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzar;->zzm()V

    iput-object v4, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzwd:Lcom/google/android/gms/internal/measurement/zzby;

    new-instance p1, Lcom/google/android/gms/internal/measurement/zzbz;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/measurement/zzbz;-><init>(Lcom/google/android/gms/internal/measurement/zzat;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzar;->zzm()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvw:Lcom/google/android/gms/internal/measurement/zzbz;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzar;->zzm()V

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvv:Lcom/google/android/gms/internal/measurement/zzai;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->zzm()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvz:Lcom/google/android/gms/analytics/GoogleAnalytics;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzai;->start()V

    return-void
.end method

.method private static zza(Lcom/google/android/gms/internal/measurement/zzar;)V
    .locals 1

    const-string v0, "Analytics service not created/initialized"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzar;->isInitialized()Z

    move-result p0

    const-string v0, "Analytics service not initialized"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    return-void
.end method

.method public static zzc(Landroid/content/Context;)Lcom/google/android/gms/internal/measurement/zzat;
    .locals 8

    invoke-static {p0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzat;->zzvq:Lcom/google/android/gms/internal/measurement/zzat;

    if-nez v0, :cond_1

    const-class v0, Lcom/google/android/gms/internal/measurement/zzat;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzat;->zzvq:Lcom/google/android/gms/internal/measurement/zzat;

    if-nez v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/common/util/DefaultClock;->getInstance()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v2

    new-instance v4, Lcom/google/android/gms/internal/measurement/zzav;

    invoke-direct {v4, p0}, Lcom/google/android/gms/internal/measurement/zzav;-><init>(Landroid/content/Context;)V

    new-instance p0, Lcom/google/android/gms/internal/measurement/zzat;

    invoke-direct {p0, v4}, Lcom/google/android/gms/internal/measurement/zzat;-><init>(Lcom/google/android/gms/internal/measurement/zzav;)V

    sput-object p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvq:Lcom/google/android/gms/internal/measurement/zzat;

    invoke-static {}, Lcom/google/android/gms/analytics/GoogleAnalytics;->zzn()V

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v4

    sub-long v6, v4, v2

    sget-object v1, Lcom/google/android/gms/internal/measurement/zzcc;->zzaaa:Lcom/google/android/gms/internal/measurement/zzcd;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzcd;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    cmp-long v3, v6, v1

    if-lez v3, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzat;->zzbu()Lcom/google/android/gms/internal/measurement/zzcm;

    move-result-object p0

    const-string v3, "Slow initialization (ms)"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v3, v4, v1}, Lcom/google/android/gms/internal/measurement/zzaq;->zzc(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

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
    sget-object p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvq:Lcom/google/android/gms/internal/measurement/zzat;

    return-object p0
.end method


# virtual methods
.method public final getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzqx:Landroid/content/Context;

    return-object v0
.end method

.method public final zzbt()Lcom/google/android/gms/common/util/Clock;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzro:Lcom/google/android/gms/common/util/Clock;

    return-object v0
.end method

.method public final zzbu()Lcom/google/android/gms/internal/measurement/zzcm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvt:Lcom/google/android/gms/internal/measurement/zzcm;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zza(Lcom/google/android/gms/internal/measurement/zzar;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvt:Lcom/google/android/gms/internal/measurement/zzcm;

    return-object v0
.end method

.method public final zzbv()Lcom/google/android/gms/internal/measurement/zzbu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvs:Lcom/google/android/gms/internal/measurement/zzbu;

    return-object v0
.end method

.method public final zzbw()Lcom/google/android/gms/analytics/zzk;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvu:Lcom/google/android/gms/analytics/zzk;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvu:Lcom/google/android/gms/analytics/zzk;

    return-object v0
.end method

.method public final zzby()Lcom/google/android/gms/internal/measurement/zzai;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvv:Lcom/google/android/gms/internal/measurement/zzai;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zza(Lcom/google/android/gms/internal/measurement/zzar;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvv:Lcom/google/android/gms/internal/measurement/zzai;

    return-object v0
.end method

.method public final zzbz()Lcom/google/android/gms/internal/measurement/zzbz;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvw:Lcom/google/android/gms/internal/measurement/zzbz;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zza(Lcom/google/android/gms/internal/measurement/zzar;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvw:Lcom/google/android/gms/internal/measurement/zzbz;

    return-object v0
.end method

.method public final zzca()Lcom/google/android/gms/internal/measurement/zzde;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvx:Lcom/google/android/gms/internal/measurement/zzde;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zza(Lcom/google/android/gms/internal/measurement/zzar;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvx:Lcom/google/android/gms/internal/measurement/zzde;

    return-object v0
.end method

.method public final zzcb()Lcom/google/android/gms/internal/measurement/zzcq;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvy:Lcom/google/android/gms/internal/measurement/zzcq;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zza(Lcom/google/android/gms/internal/measurement/zzar;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvy:Lcom/google/android/gms/internal/measurement/zzcq;

    return-object v0
.end method

.method public final zzce()Lcom/google/android/gms/internal/measurement/zzbe;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzwc:Lcom/google/android/gms/internal/measurement/zzbe;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zza(Lcom/google/android/gms/internal/measurement/zzar;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzwc:Lcom/google/android/gms/internal/measurement/zzbe;

    return-object v0
.end method

.method public final zzcf()Lcom/google/android/gms/internal/measurement/zzby;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzwd:Lcom/google/android/gms/internal/measurement/zzby;

    return-object v0
.end method

.method public final zzci()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvr:Landroid/content/Context;

    return-object v0
.end method

.method public final zzcj()Lcom/google/android/gms/internal/measurement/zzcm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvt:Lcom/google/android/gms/internal/measurement/zzcm;

    return-object v0
.end method

.method public final zzck()Lcom/google/android/gms/analytics/GoogleAnalytics;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvz:Lcom/google/android/gms/analytics/GoogleAnalytics;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvz:Lcom/google/android/gms/analytics/GoogleAnalytics;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->isInitialized()Z

    move-result v0

    const-string v1, "Analytics instance not initialized"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvz:Lcom/google/android/gms/analytics/GoogleAnalytics;

    return-object v0
.end method

.method public final zzcl()Lcom/google/android/gms/internal/measurement/zzcq;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvy:Lcom/google/android/gms/internal/measurement/zzcq;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvy:Lcom/google/android/gms/internal/measurement/zzcq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzar;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzvy:Lcom/google/android/gms/internal/measurement/zzcq;

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzcm()Lcom/google/android/gms/internal/measurement/zzah;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzwb:Lcom/google/android/gms/internal/measurement/zzah;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zza(Lcom/google/android/gms/internal/measurement/zzar;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzwb:Lcom/google/android/gms/internal/measurement/zzah;

    return-object v0
.end method

.method public final zzcn()Lcom/google/android/gms/internal/measurement/zzbl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzwa:Lcom/google/android/gms/internal/measurement/zzbl;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zza(Lcom/google/android/gms/internal/measurement/zzar;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzat;->zzwa:Lcom/google/android/gms/internal/measurement/zzbl;

    return-object v0
.end method
