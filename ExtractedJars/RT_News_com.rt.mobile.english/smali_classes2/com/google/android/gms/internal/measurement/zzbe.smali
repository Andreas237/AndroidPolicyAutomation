.class public final Lcom/google/android/gms/internal/measurement/zzbe;
.super Lcom/google/android/gms/internal/measurement/zzar;


# annotations
.annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
.end annotation


# instance fields
.field private final zzsf:Lcom/google/android/gms/internal/measurement/zzu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzat;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzar;-><init>(Lcom/google/android/gms/internal/measurement/zzat;)V

    new-instance p1, Lcom/google/android/gms/internal/measurement/zzu;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/zzu;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzbe;->zzsf:Lcom/google/android/gms/internal/measurement/zzu;

    return-void
.end method


# virtual methods
.method protected final zzac()V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzbw()Lcom/google/android/gms/analytics/zzk;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/zzk;->zzz()Lcom/google/android/gms/internal/measurement/zzu;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzbe;->zzsf:Lcom/google/android/gms/internal/measurement/zzu;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzu;->zza(Lcom/google/android/gms/internal/measurement/zzu;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzca()Lcom/google/android/gms/internal/measurement/zzde;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzde;->zzaf()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzbe;->zzsf:Lcom/google/android/gms/internal/measurement/zzu;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/measurement/zzu;->setAppName(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzde;->zzag()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzbe;->zzsf:Lcom/google/android/gms/internal/measurement/zzu;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/measurement/zzu;->setAppVersion(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final zzdb()Lcom/google/android/gms/internal/measurement/zzu;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzar;->zzch()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbe;->zzsf:Lcom/google/android/gms/internal/measurement/zzu;

    return-object v0
.end method
