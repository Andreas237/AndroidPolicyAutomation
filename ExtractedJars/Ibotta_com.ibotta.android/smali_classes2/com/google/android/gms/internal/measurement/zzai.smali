.class public final Lcom/google/android/gms/internal/measurement/zzai;
.super Lcom/google/android/gms/internal/measurement/zzar;


# instance fields
.field private final zzvf:Lcom/google/android/gms/internal/measurement/zzbf;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/zzat;Lcom/google/android/gms/internal/measurement/zzav;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzar;-><init>(Lcom/google/android/gms/internal/measurement/zzat;)V

    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzbf;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzbf;-><init>(Lcom/google/android/gms/internal/measurement/zzat;Lcom/google/android/gms/internal/measurement/zzav;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzai;->zzvf:Lcom/google/android/gms/internal/measurement/zzbf;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/measurement/zzai;)Lcom/google/android/gms/internal/measurement/zzbf;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zzai;->zzvf:Lcom/google/android/gms/internal/measurement/zzbf;

    return-object p0
.end method


# virtual methods
.method final onServiceConnected()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/analytics/zzk;->zzab()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzai;->zzvf:Lcom/google/android/gms/internal/measurement/zzbf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzbf;->onServiceConnected()V

    return-void
.end method

.method public final setLocalDispatchPeriod(I)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzar;->zzch()V

    const-string v0, "setLocalDispatchPeriod (sec)"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/measurement/zzaq;->zzb(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzbw()Lcom/google/android/gms/analytics/zzk;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzaj;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/measurement/zzaj;-><init>(Lcom/google/android/gms/internal/measurement/zzai;I)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/zzk;->zza(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final start()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzai;->zzvf:Lcom/google/android/gms/internal/measurement/zzbf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzbf;->start()V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/measurement/zzaw;)J
    .locals 5

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzar;->zzch()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/analytics/zzk;->zzab()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzai;->zzvf:Lcom/google/android/gms/internal/measurement/zzbf;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/measurement/zzbf;->zza(Lcom/google/android/gms/internal/measurement/zzaw;Z)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzai;->zzvf:Lcom/google/android/gms/internal/measurement/zzbf;

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/measurement/zzbf;->zzb(Lcom/google/android/gms/internal/measurement/zzaw;)V

    :cond_0
    return-wide v0
.end method

.method public final zza(Lcom/google/android/gms/internal/measurement/zzca;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzar;->zzch()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzbw()Lcom/google/android/gms/analytics/zzk;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzao;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/measurement/zzao;-><init>(Lcom/google/android/gms/internal/measurement/zzai;Lcom/google/android/gms/internal/measurement/zzca;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/zzk;->zza(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/measurement/zzch;)V
    .locals 2

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzar;->zzch()V

    const-string v0, "Hit delivery requested"

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zzb(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzbw()Lcom/google/android/gms/analytics/zzk;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzam;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/measurement/zzam;-><init>(Lcom/google/android/gms/internal/measurement/zzai;Lcom/google/android/gms/internal/measurement/zzch;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/zzk;->zza(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;Ljava/lang/Runnable;)V
    .locals 2

    const-string v0, "campaign param can\'t be empty"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzbw()Lcom/google/android/gms/analytics/zzk;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzal;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzal;-><init>(Lcom/google/android/gms/internal/measurement/zzai;Ljava/lang/String;Ljava/lang/Runnable;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/zzk;->zza(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected final zzac()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzai;->zzvf:Lcom/google/android/gms/internal/measurement/zzbf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzar;->zzm()V

    return-void
.end method

.method public final zzbn()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzar;->zzch()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzbw()Lcom/google/android/gms/analytics/zzk;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzan;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/measurement/zzan;-><init>(Lcom/google/android/gms/internal/measurement/zzai;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/zzk;->zza(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final zzbo()V
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzar;->zzch()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaq;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzct;->zza(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzcu;->zze(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.google.android.gms.analytics.ANALYTICS_DISPATCH"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v2, Landroid/content/ComponentName;

    const-string v3, "com.google.android.gms.analytics.AnalyticsService"

    invoke-direct {v2, v0, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/zzai;->zza(Lcom/google/android/gms/internal/measurement/zzca;)V

    return-void
.end method

.method public final zzbp()Z
    .locals 5

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzar;->zzch()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzbw()Lcom/google/android/gms/analytics/zzk;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzap;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/measurement/zzap;-><init>(Lcom/google/android/gms/internal/measurement/zzai;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/zzk;->zza(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    const-wide/16 v1, 0x4

    const/4 v3, 0x0

    :try_start_0
    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v4}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    move-exception v0

    const-string v1, "syncDispatchLocalHits timed out"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzd(Ljava/lang/String;Ljava/lang/Object;)V

    return v3

    :catch_1
    move-exception v0

    const-string v1, "syncDispatchLocalHits failed"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/measurement/zzaq;->zze(Ljava/lang/String;Ljava/lang/Object;)V

    return v3

    :catch_2
    move-exception v0

    const-string v1, "syncDispatchLocalHits interrupted"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzd(Ljava/lang/String;Ljava/lang/Object;)V

    return v3
.end method

.method public final zzbq()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzar;->zzch()V

    invoke-static {}, Lcom/google/android/gms/analytics/zzk;->zzab()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzai;->zzvf:Lcom/google/android/gms/internal/measurement/zzbf;

    invoke-static {}, Lcom/google/android/gms/analytics/zzk;->zzab()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzar;->zzch()V

    const-string v1, "Service disconnected"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzaq;->zzq(Ljava/lang/String;)V

    return-void
.end method

.method final zzbr()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/analytics/zzk;->zzab()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzai;->zzvf:Lcom/google/android/gms/internal/measurement/zzbf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzbf;->zzbr()V

    return-void
.end method
