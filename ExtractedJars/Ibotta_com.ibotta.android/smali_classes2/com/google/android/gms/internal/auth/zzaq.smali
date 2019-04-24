.class final Lcom/google/android/gms/internal/auth/zzaq;
.super Lcom/google/android/gms/internal/auth/zzam;


# instance fields
.field private final synthetic zzds:Lcom/google/android/gms/internal/auth/zzap;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/auth/zzap;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/auth/zzaq;->zzds:Lcom/google/android/gms/internal/auth/zzap;

    invoke-direct {p0}, Lcom/google/android/gms/internal/auth/zzam;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzd(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/auth/api/credentials/Credential;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/zzaq;->zzds:Lcom/google/android/gms/internal/auth/zzap;

    new-instance v1, Lcom/google/android/gms/internal/auth/zzan;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/auth/zzan;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/auth/api/credentials/Credential;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/auth/zzap;->setResult(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method

.method public final zze(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/zzaq;->zzds:Lcom/google/android/gms/internal/auth/zzap;

    invoke-static {p1}, Lcom/google/android/gms/internal/auth/zzan;->zzf(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/internal/auth/zzan;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/auth/zzap;->setResult(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
