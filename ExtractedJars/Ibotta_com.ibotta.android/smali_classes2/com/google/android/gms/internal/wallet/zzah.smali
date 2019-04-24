.class final Lcom/google/android/gms/internal/wallet/zzah;
.super Lcom/google/android/gms/internal/wallet/zzaf;


# instance fields
.field private final zzgj:Lcom/google/android/gms/tasks/TaskCompletionSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Lcom/google/android/gms/wallet/AutoResolvableVoidResult;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Lcom/google/android/gms/wallet/AutoResolvableVoidResult;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/wallet/zzaf;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/wallet/zzah;->zzgj:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final zza(ILandroid/os/Bundle;)V
    .locals 2

    const-string v0, "com.google.android.gms.wallet.EXTRA_PENDING_INTENT"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Landroid/app/PendingIntent;

    if-eqz p2, :cond_0

    const/4 v0, 0x6

    if-ne p1, v0, :cond_0

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const-string v1, "Need to resolve PendingIntent"

    invoke-direct {v0, p1, v1, p2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    invoke-direct {v0, p1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    :goto_0
    new-instance p1, Lcom/google/android/gms/wallet/AutoResolvableVoidResult;

    invoke-direct {p1}, Lcom/google/android/gms/wallet/AutoResolvableVoidResult;-><init>()V

    iget-object p2, p0, Lcom/google/android/gms/internal/wallet/zzah;->zzgj:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/wallet/AutoResolveHelper;->zza(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
