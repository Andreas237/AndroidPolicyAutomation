.class final Lcom/google/android/gms/internal/measurement/zzhm;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzaof:Ljava/util/concurrent/atomic/AtomicReference;

.field private final synthetic zzaog:Lcom/google/android/gms/internal/measurement/zzhl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzhl;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzhm;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzhm;->zzaof:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzhm;->zzaof:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzhm;->zzaof:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzhm;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgh()Lcom/google/android/gms/internal/measurement/zzeg;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzeg;->zzhp()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzhm;->zzaof:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzhm;->zzaof:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    throw v1

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw v1
.end method
