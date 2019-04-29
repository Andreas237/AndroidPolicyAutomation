.class public final Lcom/google/android/gms/wearable/internal/zzy;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/wearable/CapabilityApi$GetCapabilityResult;


# instance fields
.field private final zzbv:Lcom/google/android/gms/wearable/CapabilityInfo;

.field private final zzp:Lcom/google/android/gms/common/api/Status;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/wearable/CapabilityInfo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/zzy;->zzp:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lcom/google/android/gms/wearable/internal/zzy;->zzbv:Lcom/google/android/gms/wearable/CapabilityInfo;

    return-void
.end method


# virtual methods
.method public final getCapability()Lcom/google/android/gms/wearable/CapabilityInfo;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzy;->zzbv:Lcom/google/android/gms/wearable/CapabilityInfo;

    return-object v0
.end method

.method public final getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzy;->zzp:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method
