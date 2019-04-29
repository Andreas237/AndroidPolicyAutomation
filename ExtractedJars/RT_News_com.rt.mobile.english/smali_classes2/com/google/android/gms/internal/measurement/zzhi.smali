.class abstract Lcom/google/android/gms/internal/measurement/zzhi;
.super Lcom/google/android/gms/internal/measurement/zzhh;


# instance fields
.field private zzvo:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzgm;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzhh;-><init>(Lcom/google/android/gms/internal/measurement/zzgm;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzhi;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzb(Lcom/google/android/gms/internal/measurement/zzhi;)V

    return-void
.end method


# virtual methods
.method final isInitialized()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzhi;->zzvo:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected final zzch()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method protected abstract zzhh()Z
.end method

.method protected zzin()V
    .locals 0

    return-void
.end method

.method public final zzke()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzhi;->zzvo:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t initialize twice"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzin()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzhi;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzkc()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzhi;->zzvo:Z

    return-void
.end method

.method public final zzm()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzhi;->zzvo:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t initialize twice"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhi;->zzhh()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzhi;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzkc()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzhi;->zzvo:Z

    :cond_1
    return-void
.end method
