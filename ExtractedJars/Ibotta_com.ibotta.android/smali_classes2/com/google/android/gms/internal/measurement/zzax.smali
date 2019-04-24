.class public final Lcom/google/android/gms/internal/measurement/zzax;
.super Lcom/google/android/gms/internal/measurement/zzar;


# annotations
.annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
.end annotation


# instance fields
.field private final zzwl:Lcom/google/android/gms/internal/measurement/zzaz;

.field private zzwm:Lcom/google/android/gms/internal/measurement/zzci;

.field private final zzwn:Lcom/google/android/gms/internal/measurement/zzbw;

.field private final zzwo:Lcom/google/android/gms/internal/measurement/zzcz;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/internal/measurement/zzat;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzar;-><init>(Lcom/google/android/gms/internal/measurement/zzat;)V

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzcz;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzat;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzcz;-><init>(Lcom/google/android/gms/common/util/Clock;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzax;->zzwo:Lcom/google/android/gms/internal/measurement/zzcz;

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzaz;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/zzaz;-><init>(Lcom/google/android/gms/internal/measurement/zzax;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzax;->zzwl:Lcom/google/android/gms/internal/measurement/zzaz;

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzay;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/zzay;-><init>(Lcom/google/android/gms/internal/measurement/zzax;Lcom/google/android/gms/internal/measurement/zzat;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzax;->zzwn:Lcom/google/android/gms/internal/measurement/zzbw;

    return-void
.end method

.method private final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/analytics/zzk;->zzab()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzax;->zzwm:Lcom/google/android/gms/internal/measurement/zzci;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzax;->zzwm:Lcom/google/android/gms/internal/measurement/zzci;

    const-string v0, "Disconnected from device AnalyticsService"

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zza(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzby()Lcom/google/android/gms/internal/measurement/zzai;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzai;->zzbq()V

    :cond_0
    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/measurement/zzax;)Lcom/google/android/gms/internal/measurement/zzaz;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zzax;->zzwl:Lcom/google/android/gms/internal/measurement/zzaz;

    return-object p0
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/measurement/zzax;Landroid/content/ComponentName;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzax;->onServiceDisconnected(Landroid/content/ComponentName;)V

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/measurement/zzax;Lcom/google/android/gms/internal/measurement/zzci;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzax;->zza(Lcom/google/android/gms/internal/measurement/zzci;)V

    return-void
.end method

.method private final zza(Lcom/google/android/gms/internal/measurement/zzci;)V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/analytics/zzk;->zzab()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzax;->zzwm:Lcom/google/android/gms/internal/measurement/zzci;

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzax;->zzcu()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzby()Lcom/google/android/gms/internal/measurement/zzai;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzai;->onServiceConnected()V

    return-void
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/measurement/zzax;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzax;->zzcv()V

    return-void
.end method

.method private final zzcu()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzax;->zzwo:Lcom/google/android/gms/internal/measurement/zzcz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzcz;->start()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzax;->zzwn:Lcom/google/android/gms/internal/measurement/zzbw;

    sget-object v1, Lcom/google/android/gms/internal/measurement/zzcc;->zzzu:Lcom/google/android/gms/internal/measurement/zzcd;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzcd;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzbw;->zzh(J)V

    return-void
.end method

.method private final zzcv()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/analytics/zzk;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzax;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "Inactivity, disconnecting from device AnalyticsService"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzq(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzax;->disconnect()V

    return-void
.end method


# virtual methods
.method public final connect()Z
    .locals 2

    invoke-static {}, Lcom/google/android/gms/analytics/zzk;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzar;->zzch()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzax;->zzwm:Lcom/google/android/gms/internal/measurement/zzci;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzax;->zzwl:Lcom/google/android/gms/internal/measurement/zzaz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzaz;->zzcw()Lcom/google/android/gms/internal/measurement/zzci;

    move-result-object v0

    if-eqz v0, :cond_1

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzax;->zzwm:Lcom/google/android/gms/internal/measurement/zzci;

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzax;->zzcu()V

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final disconnect()V
    .locals 3

    invoke-static {}, Lcom/google/android/gms/analytics/zzk;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzar;->zzch()V

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/common/stats/ConnectionTracker;->getInstance()Lcom/google/android/gms/common/stats/ConnectionTracker;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaq;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzax;->zzwl:Lcom/google/android/gms/internal/measurement/zzaz;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/stats/ConnectionTracker;->unbindService(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzax;->zzwm:Lcom/google/android/gms/internal/measurement/zzci;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzax;->zzwm:Lcom/google/android/gms/internal/measurement/zzci;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzby()Lcom/google/android/gms/internal/measurement/zzai;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzai;->zzbq()V

    :cond_0
    return-void
.end method

.method public final isConnected()Z
    .locals 1

    invoke-static {}, Lcom/google/android/gms/analytics/zzk;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzar;->zzch()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzax;->zzwm:Lcom/google/android/gms/internal/measurement/zzci;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected final zzac()V
    .locals 0

    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/measurement/zzch;)Z
    .locals 7

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/analytics/zzk;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzar;->zzch()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzax;->zzwm:Lcom/google/android/gms/internal/measurement/zzci;

    const/4 v6, 0x0

    if-nez v0, :cond_0

    return v6

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzch;->zzep()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzbu;->zzdz()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzbu;->zzea()Ljava/lang/String;

    move-result-object v1

    :goto_0
    move-object v4, v1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v5

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzch;->zzcs()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzch;->zzen()J

    move-result-wide v2

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/zzci;->zza(Ljava/util/Map;JLjava/lang/String;Ljava/util/List;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzax;->zzcu()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    const-string p1, "Failed to send hits to AnalyticsService"

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zzq(Ljava/lang/String;)V

    return v6
.end method

.method public final zzct()Z
    .locals 2

    invoke-static {}, Lcom/google/android/gms/analytics/zzk;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzar;->zzch()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzax;->zzwm:Lcom/google/android/gms/internal/measurement/zzci;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzci;->zzbn()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzax;->zzcu()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    const-string v0, "Failed to clear hits from AnalyticsService"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzq(Ljava/lang/String;)V

    return v1
.end method
