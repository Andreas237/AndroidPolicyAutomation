.class final Lcom/google/android/gms/wearable/internal/zzby;
.super Lcom/google/android/gms/wearable/internal/zzn;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wearable/internal/zzn<",
        "Lcom/google/android/gms/wearable/DataApi$DataItemResult;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zzco:Landroid/net/Uri;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/internal/zzbw;Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/net/Uri;)V
    .locals 0

    iput-object p3, p0, Lcom/google/android/gms/wearable/internal/zzby;->zzco:Landroid/net/Uri;

    invoke-direct {p0, p2}, Lcom/google/android/gms/wearable/internal/zzn;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected final synthetic createFailedResult(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 2

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzcg;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/wearable/internal/zzcg;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/wearable/DataItem;)V

    return-object v0
.end method

.method protected final synthetic doExecute(Lcom/google/android/gms/common/api/Api$AnyClient;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/wearable/internal/zzhg;

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzby;->zzco:Landroid/net/Uri;

    invoke-virtual {p1}, Lcom/google/android/gms/wearable/internal/zzhg;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/wearable/internal/zzep;

    new-instance v1, Lcom/google/android/gms/wearable/internal/zzgv;

    invoke-direct {v1, p0}, Lcom/google/android/gms/wearable/internal/zzgv;-><init>(Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;)V

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/wearable/internal/zzep;->zza(Lcom/google/android/gms/wearable/internal/zzek;Landroid/net/Uri;)V

    return-void
.end method
