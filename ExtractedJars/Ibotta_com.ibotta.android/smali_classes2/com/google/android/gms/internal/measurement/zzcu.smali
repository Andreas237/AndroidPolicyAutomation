.class public final Lcom/google/android/gms/internal/measurement/zzcu;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroid/content/Context;",
        ":",
        "Lcom/google/android/gms/internal/measurement/zzcy;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static zzabn:Ljava/lang/Boolean;


# instance fields
.field private final handler:Landroid/os/Handler;

.field private final zzabm:Landroid/content/Context;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzcu;->zzabm:Landroid/content/Context;

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzcu;->handler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/measurement/zzcu;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zzcu;->handler:Landroid/os/Handler;

    return-object p0
.end method

.method private final zzb(Ljava/lang/Runnable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzcu;->zzabm:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zzc(Landroid/content/Context;)Lcom/google/android/gms/internal/measurement/zzat;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zzby()Lcom/google/android/gms/internal/measurement/zzai;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzcx;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/measurement/zzcx;-><init>(Lcom/google/android/gms/internal/measurement/zzcu;Ljava/lang/Runnable;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzai;->zza(Lcom/google/android/gms/internal/measurement/zzca;)V

    return-void
.end method

.method public static zze(Landroid/content/Context;)Z
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzcu;->zzabn:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0

    :cond_0
    const-string v0, "com.google.android.gms.analytics.AnalyticsService"

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/measurement/zzdd;->zzc(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzcu;->zzabn:Ljava/lang/Boolean;

    return p0
.end method


# virtual methods
.method public final onCreate()V
    .locals 2
    .annotation build Landroid/support/annotation/RequiresPermission;
        allOf = {
            "android.permission.INTERNET",
            "android.permission.ACCESS_NETWORK_STATE"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzcu;->zzabm:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zzc(Landroid/content/Context;)Lcom/google/android/gms/internal/measurement/zzat;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zzbu()Lcom/google/android/gms/internal/measurement/zzcm;

    move-result-object v0

    const-string v1, "Local AnalyticsService is starting up"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzaq;->zzq(Ljava/lang/String;)V

    return-void
.end method

.method public final onDestroy()V
    .locals 2
    .annotation build Landroid/support/annotation/RequiresPermission;
        allOf = {
            "android.permission.INTERNET",
            "android.permission.ACCESS_NETWORK_STATE"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzcu;->zzabm:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zzc(Landroid/content/Context;)Lcom/google/android/gms/internal/measurement/zzat;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zzbu()Lcom/google/android/gms/internal/measurement/zzcm;

    move-result-object v0

    const-string v1, "Local AnalyticsService is shutting down"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzaq;->zzq(Ljava/lang/String;)V

    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 3
    .annotation build Landroid/support/annotation/RequiresPermission;
        allOf = {
            "android.permission.INTERNET",
            "android.permission.ACCESS_NETWORK_STATE"
        }
    .end annotation

    :try_start_0
    sget-object p2, Lcom/google/android/gms/internal/measurement/zzct;->lock:Ljava/lang/Object;

    monitor-enter p2
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzct;->zzabl:Lcom/google/android/gms/stats/WakeLock;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/stats/WakeLock;->isHeld()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/stats/WakeLock;->release()V

    :cond_0
    monitor-exit p2

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :goto_0
    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzcu;->zzabm:Landroid/content/Context;

    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzat;->zzc(Landroid/content/Context;)Lcom/google/android/gms/internal/measurement/zzat;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzat;->zzbu()Lcom/google/android/gms/internal/measurement/zzcm;

    move-result-object p2

    const/4 v0, 0x2

    if-nez p1, :cond_1

    const-string p1, "AnalyticsService started with null intent"

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zzt(Ljava/lang/String;)V

    return v0

    :cond_1
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Local AnalyticsService called. startId, action"

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p2, v1, v2, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zza(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "com.google.android.gms.analytics.ANALYTICS_DISPATCH"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Lcom/google/android/gms/internal/measurement/zzcv;

    invoke-direct {p1, p0, p3, p2}, Lcom/google/android/gms/internal/measurement/zzcv;-><init>(Lcom/google/android/gms/internal/measurement/zzcu;ILcom/google/android/gms/internal/measurement/zzcm;)V

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzcu;->zzb(Ljava/lang/Runnable;)V

    :cond_2
    return v0
.end method

.method public final onStartJob(Landroid/app/job/JobParameters;)Z
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x18
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzcu;->zzabm:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zzc(Landroid/content/Context;)Lcom/google/android/gms/internal/measurement/zzat;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zzbu()Lcom/google/android/gms/internal/measurement/zzcm;

    move-result-object v0

    invoke-virtual {p1}, Landroid/app/job/JobParameters;->getExtras()Landroid/os/PersistableBundle;

    move-result-object v1

    const-string v2, "action"

    invoke-virtual {v1, v2}, Landroid/os/PersistableBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Local AnalyticsJobService called. action"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/measurement/zzaq;->zza(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "com.google.android.gms.analytics.ANALYTICS_DISPATCH"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzcw;

    invoke-direct {v1, p0, v0, p1}, Lcom/google/android/gms/internal/measurement/zzcw;-><init>(Lcom/google/android/gms/internal/measurement/zzcu;Lcom/google/android/gms/internal/measurement/zzcm;Landroid/app/job/JobParameters;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/measurement/zzcu;->zzb(Ljava/lang/Runnable;)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method final synthetic zza(ILcom/google/android/gms/internal/measurement/zzcm;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzcu;->zzabm:Landroid/content/Context;

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzcy;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/measurement/zzcy;->callServiceStopSelfResult(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "Local AnalyticsService processed last dispatch request"

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zzq(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method final synthetic zza(Lcom/google/android/gms/internal/measurement/zzcm;Landroid/app/job/JobParameters;)V
    .locals 1

    const-string v0, "AnalyticsJobService processed last dispatch request"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzq(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzcu;->zzabm:Landroid/content/Context;

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzcy;

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lcom/google/android/gms/internal/measurement/zzcy;->zza(Landroid/app/job/JobParameters;Z)V

    return-void
.end method
