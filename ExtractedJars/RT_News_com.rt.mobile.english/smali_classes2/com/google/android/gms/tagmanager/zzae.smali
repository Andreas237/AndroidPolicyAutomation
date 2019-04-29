.class final Lcom/google/android/gms/tagmanager/zzae;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/zzdh;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tagmanager/zzdh<",
        "Lcom/google/android/gms/internal/measurement/zzl;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zzaww:Lcom/google/android/gms/tagmanager/zzy;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/tagmanager/zzy;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzae;->zzaww:Lcom/google/android/gms/tagmanager/zzy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/tagmanager/zzy;Lcom/google/android/gms/tagmanager/zzz;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/tagmanager/zzae;-><init>(Lcom/google/android/gms/tagmanager/zzy;)V

    return-void
.end method


# virtual methods
.method public final synthetic onSuccess(Ljava/lang/Object;)V
    .locals 5

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzl;

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzae;->zzaww:Lcom/google/android/gms/tagmanager/zzy;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzy;->zzc(Lcom/google/android/gms/tagmanager/zzy;)Lcom/google/android/gms/tagmanager/zzai;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/zzai;->zzmw()V

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzae;->zzaww:Lcom/google/android/gms/tagmanager/zzy;

    monitor-enter v0

    :try_start_0
    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzl;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzae;->zzaww:Lcom/google/android/gms/tagmanager/zzy;

    invoke-static {v1}, Lcom/google/android/gms/tagmanager/zzy;->zzf(Lcom/google/android/gms/tagmanager/zzy;)Lcom/google/android/gms/internal/measurement/zzl;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/zzl;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    if-nez v1, :cond_0

    const-string p1, "Current resource is null; network resource is also null"

    invoke-static {p1}, Lcom/google/android/gms/tagmanager/zzdi;->e(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/tagmanager/zzae;->zzaww:Lcom/google/android/gms/tagmanager/zzy;

    invoke-static {p1}, Lcom/google/android/gms/tagmanager/zzy;->zzc(Lcom/google/android/gms/tagmanager/zzy;)Lcom/google/android/gms/tagmanager/zzai;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/tagmanager/zzai;->zzmu()J

    move-result-wide v1

    iget-object p1, p0, Lcom/google/android/gms/tagmanager/zzae;->zzaww:Lcom/google/android/gms/tagmanager/zzy;

    invoke-static {p1, v1, v2}, Lcom/google/android/gms/tagmanager/zzy;->zza(Lcom/google/android/gms/tagmanager/zzy;J)V

    monitor-exit v0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzae;->zzaww:Lcom/google/android/gms/tagmanager/zzy;

    invoke-static {v1}, Lcom/google/android/gms/tagmanager/zzy;->zzf(Lcom/google/android/gms/tagmanager/zzy;)Lcom/google/android/gms/internal/measurement/zzl;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/zzl;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    iput-object v1, p1, Lcom/google/android/gms/internal/measurement/zzl;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzae;->zzaww:Lcom/google/android/gms/tagmanager/zzy;

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/zzae;->zzaww:Lcom/google/android/gms/tagmanager/zzy;

    invoke-static {v2}, Lcom/google/android/gms/tagmanager/zzy;->zzd(Lcom/google/android/gms/tagmanager/zzy;)Lcom/google/android/gms/common/util/Clock;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v2

    const/4 v4, 0x0

    invoke-static {v1, p1, v2, v3, v4}, Lcom/google/android/gms/tagmanager/zzy;->zza(Lcom/google/android/gms/tagmanager/zzy;Lcom/google/android/gms/internal/measurement/zzl;JZ)V

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzae;->zzaww:Lcom/google/android/gms/tagmanager/zzy;

    invoke-static {v1}, Lcom/google/android/gms/tagmanager/zzy;->zzg(Lcom/google/android/gms/tagmanager/zzy;)J

    move-result-wide v1

    const/16 v3, 0x3a

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "setting refresh time to current time: "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/tagmanager/zzdi;->v(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzae;->zzaww:Lcom/google/android/gms/tagmanager/zzy;

    invoke-static {v1}, Lcom/google/android/gms/tagmanager/zzy;->zzh(Lcom/google/android/gms/tagmanager/zzy;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzae;->zzaww:Lcom/google/android/gms/tagmanager/zzy;

    invoke-static {v1, p1}, Lcom/google/android/gms/tagmanager/zzy;->zza(Lcom/google/android/gms/tagmanager/zzy;Lcom/google/android/gms/internal/measurement/zzl;)V

    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final zzmr()V
    .locals 0

    return-void
.end method

.method public final zzq(I)V
    .locals 3

    sget v0, Lcom/google/android/gms/tagmanager/zzcz;->zzazl:I

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/tagmanager/zzae;->zzaww:Lcom/google/android/gms/tagmanager/zzy;

    invoke-static {p1}, Lcom/google/android/gms/tagmanager/zzy;->zzc(Lcom/google/android/gms/tagmanager/zzy;)Lcom/google/android/gms/tagmanager/zzai;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/tagmanager/zzai;->zzmv()V

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/tagmanager/zzae;->zzaww:Lcom/google/android/gms/tagmanager/zzy;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzae;->zzaww:Lcom/google/android/gms/tagmanager/zzy;

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/zzy;->isReady()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzae;->zzaww:Lcom/google/android/gms/tagmanager/zzy;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzy;->zzb(Lcom/google/android/gms/tagmanager/zzy;)Lcom/google/android/gms/tagmanager/zzv;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzae;->zzaww:Lcom/google/android/gms/tagmanager/zzy;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzae;->zzaww:Lcom/google/android/gms/tagmanager/zzy;

    invoke-static {v1}, Lcom/google/android/gms/tagmanager/zzy;->zzb(Lcom/google/android/gms/tagmanager/zzy;)Lcom/google/android/gms/tagmanager/zzv;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tagmanager/zzy;->setResult(Lcom/google/android/gms/common/api/Result;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzae;->zzaww:Lcom/google/android/gms/tagmanager/zzy;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzae;->zzaww:Lcom/google/android/gms/tagmanager/zzy;

    sget-object v2, Lcom/google/android/gms/common/api/Status;->RESULT_TIMEOUT:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/tagmanager/zzy;->a_(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/tagmanager/ContainerHolder;

    move-result-object v1

    goto :goto_0

    :cond_2
    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/google/android/gms/tagmanager/zzae;->zzaww:Lcom/google/android/gms/tagmanager/zzy;

    invoke-static {p1}, Lcom/google/android/gms/tagmanager/zzy;->zzc(Lcom/google/android/gms/tagmanager/zzy;)Lcom/google/android/gms/tagmanager/zzai;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/tagmanager/zzai;->zzmu()J

    move-result-wide v0

    iget-object p1, p0, Lcom/google/android/gms/tagmanager/zzae;->zzaww:Lcom/google/android/gms/tagmanager/zzy;

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/tagmanager/zzy;->zza(Lcom/google/android/gms/tagmanager/zzy;J)V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
