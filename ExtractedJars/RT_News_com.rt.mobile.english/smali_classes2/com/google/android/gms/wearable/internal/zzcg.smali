.class public final Lcom/google/android/gms/wearable/internal/zzcg;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/wearable/DataApi$DataItemResult;


# instance fields
.field private final zzdg:Lcom/google/android/gms/wearable/DataItem;

.field private final zzp:Lcom/google/android/gms/common/api/Status;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/wearable/DataItem;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/zzcg;->zzp:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lcom/google/android/gms/wearable/internal/zzcg;->zzdg:Lcom/google/android/gms/wearable/DataItem;

    return-void
.end method


# virtual methods
.method public final getDataItem()Lcom/google/android/gms/wearable/DataItem;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzcg;->zzdg:Lcom/google/android/gms/wearable/DataItem;

    return-object v0
.end method

.method public final getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzcg;->zzp:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method
