.class final Lcom/google/android/gms/internal/auth/zzp;
.super Lcom/google/android/gms/internal/auth/zzq;


# instance fields
.field private final synthetic zzai:Lcom/google/android/gms/internal/auth/zzo;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/auth/zzo;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/auth/zzp;->zzai:Lcom/google/android/gms/internal/auth/zzo;

    invoke-direct {p0}, Lcom/google/android/gms/internal/auth/zzq;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzd(Z)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/zzp;->zzai:Lcom/google/android/gms/internal/auth/zzo;

    new-instance v1, Lcom/google/android/gms/internal/auth/zzt;

    if-eqz p1, :cond_0

    sget-object p1, Lcom/google/android/gms/common/api/Status;->RESULT_SUCCESS:Lcom/google/android/gms/common/api/Status;

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzk;->zzf()Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    :goto_0
    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/auth/zzt;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/auth/zzo;->setResult(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
