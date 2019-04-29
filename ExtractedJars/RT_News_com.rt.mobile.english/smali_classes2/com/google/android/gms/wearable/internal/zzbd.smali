.class final Lcom/google/android/gms/wearable/internal/zzbd;
.super Lcom/google/android/gms/wearable/internal/zzn;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wearable/internal/zzn<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zzcm:Lcom/google/android/gms/wearable/internal/zzay;

.field private final synthetic zzco:Landroid/net/Uri;

.field private final synthetic zzcp:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/internal/zzay;Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/net/Uri;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/zzbd;->zzcm:Lcom/google/android/gms/wearable/internal/zzay;

    iput-object p3, p0, Lcom/google/android/gms/wearable/internal/zzbd;->zzco:Landroid/net/Uri;

    iput-boolean p4, p0, Lcom/google/android/gms/wearable/internal/zzbd;->zzcp:Z

    invoke-direct {p0, p2}, Lcom/google/android/gms/wearable/internal/zzn;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method public final synthetic createFailedResult(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 0

    return-object p1
.end method

.method protected final synthetic doExecute(Lcom/google/android/gms/common/api/Api$AnyClient;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/wearable/internal/zzhg;

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbd;->zzcm:Lcom/google/android/gms/wearable/internal/zzay;

    invoke-static {v0}, Lcom/google/android/gms/wearable/internal/zzay;->zza(Lcom/google/android/gms/wearable/internal/zzay;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/wearable/internal/zzbd;->zzco:Landroid/net/Uri;

    iget-boolean v2, p0, Lcom/google/android/gms/wearable/internal/zzbd;->zzcp:Z

    invoke-virtual {p1, p0, v0, v1, v2}, Lcom/google/android/gms/wearable/internal/zzhg;->zza(Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;Ljava/lang/String;Landroid/net/Uri;Z)V

    return-void
.end method
