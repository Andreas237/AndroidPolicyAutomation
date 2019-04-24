.class final Lcom/google/android/gms/internal/wallet/zzab;
.super Lcom/google/android/gms/wallet/Wallet$zza;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wallet/Wallet$zza<",
        "Lcom/google/android/gms/common/api/BooleanResult;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/wallet/zzw;Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/google/android/gms/wallet/Wallet$zza;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected final synthetic createFailedResult(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 2

    new-instance v0, Lcom/google/android/gms/common/api/BooleanResult;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/common/api/BooleanResult;-><init>(Lcom/google/android/gms/common/api/Status;Z)V

    return-object v0
.end method

.method protected final synthetic doExecute(Lcom/google/android/gms/common/api/Api$AnyClient;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/internal/wallet/zzad;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wallet/Wallet$zza;->zza(Lcom/google/android/gms/internal/wallet/zzad;)V

    return-void
.end method

.method protected final zza(Lcom/google/android/gms/internal/wallet/zzad;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/wallet/IsReadyToPayRequest;->newBuilder()Lcom/google/android/gms/wallet/IsReadyToPayRequest$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/wallet/IsReadyToPayRequest$Builder;->build()Lcom/google/android/gms/wallet/IsReadyToPayRequest;

    move-result-object v0

    invoke-virtual {p1, v0, p0}, Lcom/google/android/gms/internal/wallet/zzad;->zza(Lcom/google/android/gms/wallet/IsReadyToPayRequest;Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;)V

    return-void
.end method
