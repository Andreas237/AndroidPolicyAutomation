.class final Lcom/google/android/gms/internal/auth/zzat;
.super Lcom/google/android/gms/internal/auth/zzav;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/auth/zzav<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/auth/zzao;Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/auth/zzav;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected final synthetic createFailedResult(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 0

    return-object p1
.end method

.method protected final zzd(Landroid/content/Context;Lcom/google/android/gms/internal/auth/zzbc;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance p1, Lcom/google/android/gms/internal/auth/zzau;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/auth/zzau;-><init>(Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;)V

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/auth/zzbc;->zzd(Lcom/google/android/gms/internal/auth/zzba;)V

    return-void
.end method
