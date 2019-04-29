.class final Lcom/google/android/gms/internal/measurement/zzjj;
.super Lcom/google/android/gms/internal/measurement/zzeo;


# instance fields
.field private final synthetic zzaqg:Lcom/google/android/gms/internal/measurement/zzji;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzji;Lcom/google/android/gms/internal/measurement/zzhj;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjj;->zzaqg:Lcom/google/android/gms/internal/measurement/zzji;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/measurement/zzeo;-><init>(Lcom/google/android/gms/internal/measurement/zzhj;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjj;->zzaqg:Lcom/google/android/gms/internal/measurement/zzji;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v3

    const-string v4, "Session started, time"

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v4, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/zzfs;->zzakt:Lcom/google/android/gms/internal/measurement/zzfu;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/measurement/zzfu;->set(Z)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzfv()Lcom/google/android/gms/internal/measurement/zzhl;

    move-result-object v1

    const-string v2, "auto"

    const-string v3, "_s"

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/internal/measurement/zzhl;->zza(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/zzfs;->zzaku:Lcom/google/android/gms/internal/measurement/zzfv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzfv;->set(J)V

    return-void
.end method
