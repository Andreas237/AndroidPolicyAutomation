.class final Lcom/google/android/gms/internal/auth/zzl;
.super Lcom/google/android/gms/common/api/internal/BaseImplementation$ApiMethodImpl;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/api/internal/BaseImplementation$ApiMethodImpl<",
        "Lcom/google/android/gms/common/api/Result;",
        "Lcom/google/android/gms/internal/auth/zzu;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zzag:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/auth/zzk;Lcom/google/android/gms/common/api/Api;Lcom/google/android/gms/common/api/GoogleApiClient;Z)V
    .locals 0

    iput-boolean p4, p0, Lcom/google/android/gms/internal/auth/zzl;->zzag:Z

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/common/api/internal/BaseImplementation$ApiMethodImpl;-><init>(Lcom/google/android/gms/common/api/Api;Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected final createFailedResult(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/auth/zzs;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/auth/zzs;-><init>(Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method protected final synthetic doExecute(Lcom/google/android/gms/common/api/Api$AnyClient;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/internal/auth/zzu;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/auth/zzu;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/auth/account/zzf;

    iget-boolean v0, p0, Lcom/google/android/gms/internal/auth/zzl;->zzag:Z

    invoke-interface {p1, v0}, Lcom/google/android/gms/auth/account/zzf;->zze(Z)V

    new-instance p1, Lcom/google/android/gms/internal/auth/zzs;

    sget-object v0, Lcom/google/android/gms/common/api/Status;->RESULT_SUCCESS:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/auth/zzs;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/auth/zzl;->setResult(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
