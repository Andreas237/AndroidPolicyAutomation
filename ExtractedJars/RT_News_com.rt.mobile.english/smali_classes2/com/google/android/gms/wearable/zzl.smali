.class final Lcom/google/android/gms/wearable/zzl;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzan:Lcom/google/android/gms/common/data/DataHolder;

.field private final synthetic zzao:Lcom/google/android/gms/wearable/WearableListenerService$zzd;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/WearableListenerService$zzd;Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/zzl;->zzao:Lcom/google/android/gms/wearable/WearableListenerService$zzd;

    iput-object p2, p0, Lcom/google/android/gms/wearable/zzl;->zzan:Lcom/google/android/gms/common/data/DataHolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/wearable/DataEventBuffer;

    iget-object v1, p0, Lcom/google/android/gms/wearable/zzl;->zzan:Lcom/google/android/gms/common/data/DataHolder;

    invoke-direct {v0, v1}, Lcom/google/android/gms/wearable/DataEventBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/wearable/zzl;->zzao:Lcom/google/android/gms/wearable/WearableListenerService$zzd;

    iget-object v1, v1, Lcom/google/android/gms/wearable/WearableListenerService$zzd;->zzak:Lcom/google/android/gms/wearable/WearableListenerService;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/wearable/WearableListenerService;->onDataChanged(Lcom/google/android/gms/wearable/DataEventBuffer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lcom/google/android/gms/wearable/DataEventBuffer;->release()V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Lcom/google/android/gms/wearable/DataEventBuffer;->release()V

    throw v1
.end method
