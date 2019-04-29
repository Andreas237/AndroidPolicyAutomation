.class final Lcom/google/android/gms/wearable/internal/zzha;
.super Lcom/google/android/gms/wearable/internal/zzgm;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wearable/internal/zzgm<",
        "Lcom/google/android/gms/wearable/ChannelApi$OpenChannelResult;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder<",
            "Lcom/google/android/gms/wearable/ChannelApi$OpenChannelResult;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/wearable/internal/zzgm;-><init>(Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;)V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/wearable/internal/zzfq;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzam;

    iget v1, p1, Lcom/google/android/gms/wearable/internal/zzfq;->statusCode:I

    invoke-static {v1}, Lcom/google/android/gms/wearable/internal/zzgd;->zzb(I)Lcom/google/android/gms/common/api/Status;

    move-result-object v1

    iget-object p1, p1, Lcom/google/android/gms/wearable/internal/zzfq;->zzck:Lcom/google/android/gms/wearable/internal/zzay;

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/wearable/internal/zzam;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/wearable/Channel;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/internal/zzgm;->zza(Ljava/lang/Object;)V

    return-void
.end method
