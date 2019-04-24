.class final Lcom/google/android/gms/internal/wallet/zzag;
.super Lcom/google/android/gms/internal/wallet/zzaf;


# instance fields
.field private final zzgj:Lcom/google/android/gms/tasks/TaskCompletionSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/wallet/zzaf;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/wallet/zzag;->zzgj:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final zza(IZLandroid/os/Bundle;)V
    .locals 0

    new-instance p3, Lcom/google/android/gms/common/api/Status;

    invoke-direct {p3, p1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/gms/internal/wallet/zzag;->zzgj:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {p3, p1, p2}, Lcom/google/android/gms/common/api/internal/TaskUtil;->setResultOrApiException(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/common/api/Status;ZLandroid/os/Bundle;)V
    .locals 0

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    iget-object p3, p0, Lcom/google/android/gms/internal/wallet/zzag;->zzgj:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/common/api/internal/TaskUtil;->setResultOrApiException(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
