.class abstract Lcom/google/android/gms/internal/measurement/zzjr;
.super Lcom/google/android/gms/internal/measurement/zzjq;


# instance fields
.field private zzvo:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzjs;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzjq;-><init>(Lcom/google/android/gms/internal/measurement/zzjs;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjr;->zzajy:Lcom/google/android/gms/internal/measurement/zzjs;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzb(Lcom/google/android/gms/internal/measurement/zzjr;)V

    return-void
.end method


# virtual methods
.method final isInitialized()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzjr;->zzvo:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected final zzch()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->isInitialized()Z

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

.method public final zzm()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzjr;->zzvo:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t initialize twice"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->zzhh()Z

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjr;->zzajy:Lcom/google/android/gms/internal/measurement/zzjs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzli()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzjr;->zzvo:Z

    return-void
.end method
