.class public Lcom/google/android/gms/wallet/WalletObjectsClient;
.super Lcom/google/android/gms/common/api/GoogleApi;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/api/GoogleApi<",
        "Lcom/google/android/gms/wallet/Wallet$WalletOptions;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Landroid/app/Activity;Lcom/google/android/gms/wallet/Wallet$WalletOptions;)V
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/wallet/Wallet$WalletOptions;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    sget-object v0, Lcom/google/android/gms/wallet/Wallet;->API:Lcom/google/android/gms/common/api/Api;

    sget-object v1, Lcom/google/android/gms/common/api/GoogleApi$Settings;->DEFAULT_SETTINGS:Lcom/google/android/gms/common/api/GoogleApi$Settings;

    invoke-direct {p0, p1, v0, p2, v1}, Lcom/google/android/gms/common/api/GoogleApi;-><init>(Landroid/app/Activity;Lcom/google/android/gms/common/api/Api;Lcom/google/android/gms/common/api/Api$ApiOptions;Lcom/google/android/gms/common/api/GoogleApi$Settings;)V

    return-void
.end method


# virtual methods
.method public createWalletObjects(Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .param p1    # Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/gms/wallet/AutoResolvableVoidResult;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/wallet/zzaq;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/wallet/zzaq;-><init>(Lcom/google/android/gms/wallet/WalletObjectsClient;Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/wallet/WalletObjectsClient;->doWrite(Lcom/google/android/gms/common/api/internal/TaskApiCall;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
