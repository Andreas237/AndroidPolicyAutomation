.class final Lcom/google/android/gms/wearable/internal/zzgs;
.super Lcom/google/android/gms/wearable/internal/zzgm;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wearable/internal/zzgm<",
        "Lcom/google/android/gms/wearable/Channel$GetInputStreamResult;",
        ">;"
    }
.end annotation


# instance fields
.field private final zzeu:Lcom/google/android/gms/wearable/internal/zzbr;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;Lcom/google/android/gms/wearable/internal/zzbr;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder<",
            "Lcom/google/android/gms/wearable/Channel$GetInputStreamResult;",
            ">;",
            "Lcom/google/android/gms/wearable/internal/zzbr;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/wearable/internal/zzgm;-><init>(Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;)V

    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/wearable/internal/zzbr;

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/zzgs;->zzeu:Lcom/google/android/gms/wearable/internal/zzbr;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/wearable/internal/zzdm;)V
    .locals 3

    iget-object v0, p1, Lcom/google/android/gms/wearable/internal/zzdm;->zzdr:Landroid/os/ParcelFileDescriptor;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzbj;

    new-instance v1, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;

    iget-object v2, p1, Lcom/google/android/gms/wearable/internal/zzdm;->zzdr:Landroid/os/ParcelFileDescriptor;

    invoke-direct {v1, v2}, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V

    invoke-direct {v0, v1}, Lcom/google/android/gms/wearable/internal/zzbj;-><init>(Ljava/io/InputStream;)V

    iget-object v1, p0, Lcom/google/android/gms/wearable/internal/zzgs;->zzeu:Lcom/google/android/gms/wearable/internal/zzbr;

    new-instance v2, Lcom/google/android/gms/wearable/internal/zzbk;

    invoke-direct {v2, v0}, Lcom/google/android/gms/wearable/internal/zzbk;-><init>(Lcom/google/android/gms/wearable/internal/zzbj;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/wearable/internal/zzbr;->zza(Lcom/google/android/gms/wearable/internal/zzbs;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Lcom/google/android/gms/wearable/internal/zzbg;

    new-instance v2, Lcom/google/android/gms/common/api/Status;

    iget p1, p1, Lcom/google/android/gms/wearable/internal/zzdm;->statusCode:I

    invoke-direct {v2, p1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/wearable/internal/zzbg;-><init>(Lcom/google/android/gms/common/api/Status;Ljava/io/InputStream;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/wearable/internal/zzgm;->zza(Ljava/lang/Object;)V

    return-void
.end method
