.class final Lcom/google/android/gms/wearable/internal/zzgq;
.super Lcom/google/android/gms/wearable/internal/zzgm;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wearable/internal/zzgm<",
        "Lcom/google/android/gms/wearable/CapabilityApi$GetAllCapabilitiesResult;",
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
            "Lcom/google/android/gms/wearable/CapabilityApi$GetAllCapabilitiesResult;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/wearable/internal/zzgm;-><init>(Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;)V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/wearable/internal/zzdi;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzx;

    iget v1, p1, Lcom/google/android/gms/wearable/internal/zzdi;->statusCode:I

    invoke-static {v1}, Lcom/google/android/gms/wearable/internal/zzgd;->zzb(I)Lcom/google/android/gms/common/api/Status;

    move-result-object v1

    iget-object p1, p1, Lcom/google/android/gms/wearable/internal/zzdi;->zzdp:Ljava/util/List;

    invoke-static {p1}, Lcom/google/android/gms/wearable/internal/zzgk;->zzb(Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/wearable/internal/zzx;-><init>(Lcom/google/android/gms/common/api/Status;Ljava/util/Map;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/internal/zzgm;->zza(Ljava/lang/Object;)V

    return-void
.end method
