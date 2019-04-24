.class final Lcom/google/android/gms/measurement/internal/zzdr;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzaed:Z

.field private final synthetic zzare:Lcom/google/android/gms/measurement/internal/zzda;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzda;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzdr;->zzare:Lcom/google/android/gms/measurement/internal/zzda;

    iput-boolean p2, p0, Lcom/google/android/gms/measurement/internal/zzdr;->zzaed:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzdr;->zzare:Lcom/google/android/gms/measurement/internal/zzda;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzda;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->isEnabled()Z

    move-result v0

    .line 3
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzdr;->zzare:Lcom/google/android/gms/measurement/internal/zzda;

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzda;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzbw;->zzks()Z

    move-result v1

    .line 4
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzdr;->zzare:Lcom/google/android/gms/measurement/internal/zzda;

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzda;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    iget-boolean v3, p0, Lcom/google/android/gms/measurement/internal/zzdr;->zzaed:Z

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/zzbw;->zzd(Z)V

    .line 5
    iget-boolean v2, p0, Lcom/google/android/gms/measurement/internal/zzdr;->zzaed:Z

    if-ne v1, v2, :cond_0

    .line 6
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzdr;->zzare:Lcom/google/android/gms/measurement/internal/zzda;

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzda;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 7
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v1

    .line 8
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjo()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v1

    const-string v2, "Default data collection state already set to"

    iget-boolean v3, p0, Lcom/google/android/gms/measurement/internal/zzdr;->zzaed:Z

    .line 9
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    .line 10
    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzdr;->zzare:Lcom/google/android/gms/measurement/internal/zzda;

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzda;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzbw;->isEnabled()Z

    move-result v1

    if-eq v1, v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzdr;->zzare:Lcom/google/android/gms/measurement/internal/zzda;

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzda;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 11
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzbw;->isEnabled()Z

    move-result v1

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzdr;->zzare:Lcom/google/android/gms/measurement/internal/zzda;

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzda;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzbw;->zzks()Z

    move-result v2

    if-eq v1, v2, :cond_2

    .line 12
    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzdr;->zzare:Lcom/google/android/gms/measurement/internal/zzda;

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzda;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 13
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v1

    .line 14
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjl()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v1

    const-string v2, "Default data collection is different than actual status"

    iget-boolean v3, p0, Lcom/google/android/gms/measurement/internal/zzdr;->zzaed:Z

    .line 15
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    .line 16
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 17
    invoke-virtual {v1, v2, v3, v0}, Lcom/google/android/gms/measurement/internal/zzau;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 18
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzdr;->zzare:Lcom/google/android/gms/measurement/internal/zzda;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzda;->zza(Lcom/google/android/gms/measurement/internal/zzda;)V

    return-void
.end method
