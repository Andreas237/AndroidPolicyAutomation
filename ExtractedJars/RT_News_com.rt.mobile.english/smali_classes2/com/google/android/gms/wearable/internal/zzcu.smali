.class final Lcom/google/android/gms/wearable/internal/zzcu;
.super Lcom/google/android/gms/wearable/DataClient$GetFdForAssetResponse;

# interfaces
.implements Lcom/google/android/gms/common/api/Releasable;


# instance fields
.field private final zzdj:Lcom/google/android/gms/wearable/DataApi$GetFdForAssetResult;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/DataApi$GetFdForAssetResult;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/wearable/DataClient$GetFdForAssetResponse;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/zzcu;->zzdj:Lcom/google/android/gms/wearable/DataApi$GetFdForAssetResult;

    return-void
.end method


# virtual methods
.method public final getFdForAsset()Landroid/os/ParcelFileDescriptor;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzcu;->zzdj:Lcom/google/android/gms/wearable/DataApi$GetFdForAssetResult;

    invoke-interface {v0}, Lcom/google/android/gms/wearable/DataApi$GetFdForAssetResult;->getFd()Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    return-object v0
.end method

.method public final getInputStream()Ljava/io/InputStream;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzcu;->zzdj:Lcom/google/android/gms/wearable/DataApi$GetFdForAssetResult;

    invoke-interface {v0}, Lcom/google/android/gms/wearable/DataApi$GetFdForAssetResult;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public final release()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzcu;->zzdj:Lcom/google/android/gms/wearable/DataApi$GetFdForAssetResult;

    invoke-interface {v0}, Lcom/google/android/gms/wearable/DataApi$GetFdForAssetResult;->release()V

    return-void
.end method
