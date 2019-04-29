.class public final Lcom/google/android/gms/wearable/internal/zzbr;
.super Lcom/google/android/gms/wearable/internal/zzej;


# instance fields
.field private final lock:Ljava/lang/Object;

.field private zzcw:Lcom/google/android/gms/wearable/internal/zzav;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field private zzda:Lcom/google/android/gms/wearable/internal/zzbs;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/wearable/internal/zzej;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbr;->lock:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final zza(II)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbr;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/wearable/internal/zzbr;->zzda:Lcom/google/android/gms/wearable/internal/zzbs;

    new-instance v2, Lcom/google/android/gms/wearable/internal/zzav;

    invoke-direct {v2, p1, p2}, Lcom/google/android/gms/wearable/internal/zzav;-><init>(II)V

    iput-object v2, p0, Lcom/google/android/gms/wearable/internal/zzbr;->zzcw:Lcom/google/android/gms/wearable/internal/zzav;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    invoke-interface {v1, v2}, Lcom/google/android/gms/wearable/internal/zzbs;->zzb(Lcom/google/android/gms/wearable/internal/zzav;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final zza(Lcom/google/android/gms/wearable/internal/zzbs;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbr;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/wearable/internal/zzbs;

    iput-object v1, p0, Lcom/google/android/gms/wearable/internal/zzbr;->zzda:Lcom/google/android/gms/wearable/internal/zzbs;

    iget-object v1, p0, Lcom/google/android/gms/wearable/internal/zzbr;->zzcw:Lcom/google/android/gms/wearable/internal/zzav;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    invoke-interface {p1, v1}, Lcom/google/android/gms/wearable/internal/zzbs;->zzb(Lcom/google/android/gms/wearable/internal/zzav;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
