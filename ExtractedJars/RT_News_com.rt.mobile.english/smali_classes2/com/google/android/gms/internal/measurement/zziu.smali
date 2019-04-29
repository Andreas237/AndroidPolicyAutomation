.class final Lcom/google/android/gms/internal/measurement/zziu;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzano:Lcom/google/android/gms/internal/measurement/zzdz;

.field private final synthetic zzanr:Ljava/lang/String;

.field private final synthetic zzans:Ljava/lang/String;

.field private final synthetic zzant:Ljava/lang/String;

.field private final synthetic zzaoj:Z

.field private final synthetic zzapn:Lcom/google/android/gms/internal/measurement/zzij;

.field private final synthetic zzapo:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzij;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/internal/measurement/zzdz;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzapn:Lcom/google/android/gms/internal/measurement/zzij;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzapo:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzant:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzanr:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzans:Ljava/lang/String;

    iput-boolean p6, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzaoj:Z

    iput-object p7, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzano:Lcom/google/android/gms/internal/measurement/zzdz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzapo:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzapn:Lcom/google/android/gms/internal/measurement/zzij;

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/zzij;->zzd(Lcom/google/android/gms/internal/measurement/zzij;)Lcom/google/android/gms/internal/measurement/zzez;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzapn:Lcom/google/android/gms/internal/measurement/zzij;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v2, "Failed to get user properties"

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzant:Ljava/lang/String;

    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzanr:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzans:Ljava/lang/String;

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/google/android/gms/internal/measurement/zzfj;->zzd(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzapo:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzapo:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-void

    :cond_0
    :try_start_2
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzant:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzapo:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzanr:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzans:Ljava/lang/String;

    iget-boolean v5, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzaoj:Z

    iget-object v6, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzano:Lcom/google/android/gms/internal/measurement/zzdz;

    invoke-interface {v1, v3, v4, v5, v6}, Lcom/google/android/gms/internal/measurement/zzez;->zza(Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/internal/measurement/zzdz;)Ljava/util/List;

    move-result-object v1

    :goto_0
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzapo:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzant:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzanr:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzans:Ljava/lang/String;

    iget-boolean v6, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzaoj:Z

    invoke-interface {v1, v3, v4, v5, v6}, Lcom/google/android/gms/internal/measurement/zzez;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzapn:Lcom/google/android/gms/internal/measurement/zzij;

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/zzij;->zze(Lcom/google/android/gms/internal/measurement/zzij;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzapo:Ljava/util/concurrent/atomic/AtomicReference;

    :goto_2
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    :catchall_0
    move-exception v1

    goto :goto_4

    :catch_0
    move-exception v1

    :try_start_4
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzapn:Lcom/google/android/gms/internal/measurement/zzij;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v3, "Failed to get user properties"

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzant:Ljava/lang/String;

    invoke-static {v4}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzanr:Ljava/lang/String;

    invoke-virtual {v2, v3, v4, v5, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->zzd(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzapo:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzapo:Ljava/util/concurrent/atomic/AtomicReference;

    goto :goto_2

    :goto_3
    monitor-exit v0

    return-void

    :goto_4
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zziu;->zzapo:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    throw v1

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v1
.end method
