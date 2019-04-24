.class public final Lcom/google/android/gms/internal/measurement/zzby;
.super Lcom/google/android/gms/internal/measurement/zzar;


# annotations
.annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
.end annotation


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzat;)V
    .locals 0
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzar;-><init>(Lcom/google/android/gms/internal/measurement/zzat;)V

    return-void
.end method


# virtual methods
.method protected final zzac()V
    .locals 0

    return-void
.end method

.method public final zzeg()Lcom/google/android/gms/internal/measurement/zzz;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzar;->zzch()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzbw()Lcom/google/android/gms/analytics/zzk;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/zzk;->zzaa()Lcom/google/android/gms/internal/measurement/zzz;

    move-result-object v0

    return-object v0
.end method

.method public final zzeh()Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzar;->zzch()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzby;->zzeg()Lcom/google/android/gms/internal/measurement/zzz;

    move-result-object v0

    iget v1, v0, Lcom/google/android/gms/internal/measurement/zzz;->zztw:I

    iget v0, v0, Lcom/google/android/gms/internal/measurement/zzz;->zztx:I

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x17

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "x"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
