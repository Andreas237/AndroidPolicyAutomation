.class final Lcom/google/android/gms/wearable/internal/zzak;
.super Lcom/google/android/gms/wearable/internal/zzn;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wearable/internal/zzn<",
        "Lcom/google/android/gms/wearable/ChannelApi$OpenChannelResult;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zzcb:Ljava/lang/String;

.field private final synthetic zzcc:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/internal/zzaj;Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p3, p0, Lcom/google/android/gms/wearable/internal/zzak;->zzcb:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/wearable/internal/zzak;->zzcc:Ljava/lang/String;

    invoke-direct {p0, p2}, Lcom/google/android/gms/wearable/internal/zzn;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method public final synthetic createFailedResult(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 2

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzam;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/wearable/internal/zzam;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/wearable/Channel;)V

    return-object v0
.end method

.method protected final synthetic doExecute(Lcom/google/android/gms/common/api/Api$AnyClient;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/wearable/internal/zzhg;

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzak;->zzcb:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/wearable/internal/zzak;->zzcc:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/wearable/internal/zzhg;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/wearable/internal/zzep;

    new-instance v2, Lcom/google/android/gms/wearable/internal/zzha;

    invoke-direct {v2, p0}, Lcom/google/android/gms/wearable/internal/zzha;-><init>(Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;)V

    invoke-interface {p1, v2, v0, v1}, Lcom/google/android/gms/wearable/internal/zzep;->zza(Lcom/google/android/gms/wearable/internal/zzek;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
