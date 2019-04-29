.class public final Lcom/google/android/gms/tagmanager/zzgf;
.super Ljava/lang/Object;


# instance fields
.field private zzqw:Lcom/google/android/gms/analytics/Tracker;

.field private zzqx:Landroid/content/Context;

.field private zzqz:Lcom/google/android/gms/analytics/GoogleAnalytics;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzgf;->zzqx:Landroid/content/Context;

    return-void
.end method

.method private final declared-synchronized zzdn(Ljava/lang/String;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzgf;->zzqz:Lcom/google/android/gms/analytics/GoogleAnalytics;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzgf;->zzqx:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/android/gms/analytics/GoogleAnalytics;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/zzgf;->zzqz:Lcom/google/android/gms/analytics/GoogleAnalytics;

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzgf;->zzqz:Lcom/google/android/gms/analytics/GoogleAnalytics;

    new-instance v1, Lcom/google/android/gms/tagmanager/zzgg;

    invoke-direct {v1}, Lcom/google/android/gms/tagmanager/zzgg;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/GoogleAnalytics;->setLogger(Lcom/google/android/gms/analytics/Logger;)V

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzgf;->zzqz:Lcom/google/android/gms/analytics/GoogleAnalytics;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/analytics/GoogleAnalytics;->newTracker(Ljava/lang/String;)Lcom/google/android/gms/analytics/Tracker;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzgf;->zzqw:Lcom/google/android/gms/analytics/Tracker;
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


# virtual methods
.method public final zzdm(Ljava/lang/String;)Lcom/google/android/gms/analytics/Tracker;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/tagmanager/zzgf;->zzdn(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/tagmanager/zzgf;->zzqw:Lcom/google/android/gms/analytics/Tracker;

    return-object p1
.end method
