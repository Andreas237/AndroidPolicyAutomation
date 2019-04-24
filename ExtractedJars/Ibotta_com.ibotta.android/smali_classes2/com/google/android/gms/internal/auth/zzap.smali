.class final Lcom/google/android/gms/internal/auth/zzap;
.super Lcom/google/android/gms/internal/auth/zzav;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/auth/zzav<",
        "Lcom/google/android/gms/auth/api/credentials/CredentialRequestResult;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zzdr:Lcom/google/android/gms/auth/api/credentials/CredentialRequest;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/auth/zzao;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/auth/api/credentials/CredentialRequest;)V
    .locals 0

    iput-object p3, p0, Lcom/google/android/gms/internal/auth/zzap;->zzdr:Lcom/google/android/gms/auth/api/credentials/CredentialRequest;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/auth/zzav;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected final synthetic createFailedResult(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/internal/auth/zzan;->zzf(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/internal/auth/zzan;

    move-result-object p1

    return-object p1
.end method

.method protected final zzd(Landroid/content/Context;Lcom/google/android/gms/internal/auth/zzbc;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance p1, Lcom/google/android/gms/internal/auth/zzaq;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/auth/zzaq;-><init>(Lcom/google/android/gms/internal/auth/zzap;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/zzap;->zzdr:Lcom/google/android/gms/auth/api/credentials/CredentialRequest;

    invoke-interface {p2, p1, v0}, Lcom/google/android/gms/internal/auth/zzbc;->zzd(Lcom/google/android/gms/internal/auth/zzba;Lcom/google/android/gms/auth/api/credentials/CredentialRequest;)V

    return-void
.end method
