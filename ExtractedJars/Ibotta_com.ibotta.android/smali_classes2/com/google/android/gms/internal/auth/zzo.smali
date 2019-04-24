.class final Lcom/google/android/gms/internal/auth/zzo;
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
.field private final synthetic zzr:Landroid/accounts/Account;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/auth/zzk;Lcom/google/android/gms/common/api/Api;Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/accounts/Account;)V
    .locals 0

    iput-object p4, p0, Lcom/google/android/gms/internal/auth/zzo;->zzr:Landroid/accounts/Account;

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/common/api/internal/BaseImplementation$ApiMethodImpl;-><init>(Lcom/google/android/gms/common/api/Api;Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected final createFailedResult(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/auth/zzt;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/auth/zzt;-><init>(Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method protected final synthetic doExecute(Lcom/google/android/gms/common/api/Api$AnyClient;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/internal/auth/zzu;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/auth/zzu;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/auth/account/zzf;

    new-instance v0, Lcom/google/android/gms/internal/auth/zzp;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/auth/zzp;-><init>(Lcom/google/android/gms/internal/auth/zzo;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/auth/zzo;->zzr:Landroid/accounts/Account;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/auth/account/zzf;->zzd(Lcom/google/android/gms/auth/account/zzd;Landroid/accounts/Account;)V

    return-void
.end method
