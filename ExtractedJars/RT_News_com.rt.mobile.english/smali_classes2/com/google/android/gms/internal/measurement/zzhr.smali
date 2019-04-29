.class final Lcom/google/android/gms/internal/measurement/zzhr;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

.field private final synthetic zzaok:J


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzhl;J)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzhr;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    iput-wide p2, p0, Lcom/google/android/gms/internal/measurement/zzhr;->zzaok:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzhr;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    iget-wide v1, p0, Lcom/google/android/gms/internal/measurement/zzhr;->zzaok:J

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzfs()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzch()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfh;->zziy()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v3

    const-string v4, "Resetting analytics data (FE)"

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgd()Lcom/google/android/gms/internal/measurement/zzji;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzji;->zzks()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgh()Lcom/google/android/gms/internal/measurement/zzeg;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzfw()Lcom/google/android/gms/internal/measurement/zzfc;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzfc;->zzah()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/measurement/zzeg;->zzaz(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v3

    iget-object v3, v3, Lcom/google/android/gms/internal/measurement/zzfs;->zzaki:Lcom/google/android/gms/internal/measurement/zzfv;

    invoke-virtual {v3, v1, v2}, Lcom/google/android/gms/internal/measurement/zzfv;->set(J)V

    :cond_0
    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzhl;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->isEnabled()Z

    move-result v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgh()Lcom/google/android/gms/internal/measurement/zzeg;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzeg;->zzhj()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v2

    xor-int/lit8 v3, v1, 0x1

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/measurement/zzfs;->zzh(Z)V

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzfy()Lcom/google/android/gms/internal/measurement/zzij;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzij;->resetAnalyticsData()V

    xor-int/lit8 v1, v1, 0x1

    iput-boolean v1, v0, Lcom/google/android/gms/internal/measurement/zzhl;->zzaoe:Z

    return-void
.end method
