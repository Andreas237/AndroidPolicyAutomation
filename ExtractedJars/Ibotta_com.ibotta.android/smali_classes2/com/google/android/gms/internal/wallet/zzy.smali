.class final Lcom/google/android/gms/internal/wallet/zzy;
.super Lcom/google/android/gms/wallet/Wallet$zzb;


# instance fields
.field private final synthetic val$requestCode:I

.field private final synthetic zzgd:Lcom/google/android/gms/wallet/MaskedWalletRequest;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/wallet/zzw;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wallet/MaskedWalletRequest;I)V
    .locals 0

    iput-object p3, p0, Lcom/google/android/gms/internal/wallet/zzy;->zzgd:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iput p4, p0, Lcom/google/android/gms/internal/wallet/zzy;->val$requestCode:I

    invoke-direct {p0, p2}, Lcom/google/android/gms/wallet/Wallet$zzb;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
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
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/wallet/zzy;->zzgd:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iget v1, p0, Lcom/google/android/gms/internal/wallet/zzy;->val$requestCode:I

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/wallet/zzad;->zza(Lcom/google/android/gms/wallet/MaskedWalletRequest;I)V

    sget-object p1, Lcom/google/android/gms/common/api/Status;->RESULT_SUCCESS:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/wallet/zzy;->setResult(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
