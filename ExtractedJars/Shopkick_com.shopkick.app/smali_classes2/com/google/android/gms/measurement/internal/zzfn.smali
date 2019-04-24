.class abstract Lcom/google/android/gms/measurement/internal/zzfn;
.super Lcom/google/android/gms/measurement/internal/zzfm;


# instance fields
.field private zzvz:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzfo;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/zzfm;-><init>(Lcom/google/android/gms/measurement/internal/zzfo;)V

    .line 2
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/zzfn;->zzamv:Lcom/google/android/gms/measurement/internal/zzfo;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/measurement/internal/zzfo;->zzb(Lcom/google/android/gms/measurement/internal/zzfn;)V

    return-void
.end method


# virtual methods
.method final isInitialized()Z
    .locals 1

    .line 4
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzfn;->zzvz:Z

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
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzfn;->isInitialized()Z

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

.method protected abstract zzgy()Z
.end method

.method public final zzq()V
    .locals 2

    .line 8
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzfn;->zzvz:Z

    if-nez v0, :cond_0

    .line 10
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzfn;->zzgy()Z

    .line 11
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzfn;->zzamv:Lcom/google/android/gms/measurement/internal/zzfo;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfo;->zzmg()V

    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzfn;->zzvz:Z

    return-void

    .line 9
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t initialize twice"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
