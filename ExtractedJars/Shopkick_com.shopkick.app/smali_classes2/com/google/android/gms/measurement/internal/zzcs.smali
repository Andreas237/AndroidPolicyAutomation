.class abstract Lcom/google/android/gms/measurement/internal/zzcs;
.super Lcom/google/android/gms/measurement/internal/zzcr;


# instance fields
.field private zzvz:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzbw;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/zzcr;-><init>(Lcom/google/android/gms/measurement/internal/zzbw;)V

    .line 2
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/zzcs;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzb(Lcom/google/android/gms/measurement/internal/zzcs;)V

    return-void
.end method


# virtual methods
.method final isInitialized()Z
    .locals 1

    .line 4
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzcs;->zzvz:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected final zzcl()V
    .locals 2

    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcs;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final zzgx()V
    .locals 2

    .line 14
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzcs;->zzvz:Z

    if-nez v0, :cond_0

    .line 16
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcs;->zzgz()V

    .line 17
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzcs;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzku()V

    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzcs;->zzvz:Z

    return-void

    .line 15
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t initialize twice"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected abstract zzgy()Z
.end method

.method protected zzgz()V
    .locals 0

    return-void
.end method

.method public final zzq()V
    .locals 2

    .line 8
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzcs;->zzvz:Z

    if-nez v0, :cond_1

    .line 10
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcs;->zzgy()Z

    move-result v0

    if-nez v0, :cond_0

    .line 11
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzcs;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzku()V

    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzcs;->zzvz:Z

    :cond_0
    return-void

    .line 9
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t initialize twice"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
