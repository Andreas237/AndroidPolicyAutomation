.class final Lcom/google/android/gms/wearable/zzt;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzao:Lcom/google/android/gms/wearable/WearableListenerService$zzd;

.field private final synthetic zzav:Lcom/google/android/gms/wearable/internal/zzaw;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/WearableListenerService$zzd;Lcom/google/android/gms/wearable/internal/zzaw;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/zzt;->zzao:Lcom/google/android/gms/wearable/WearableListenerService$zzd;

    iput-object p2, p0, Lcom/google/android/gms/wearable/zzt;->zzav:Lcom/google/android/gms/wearable/internal/zzaw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wearable/zzt;->zzav:Lcom/google/android/gms/wearable/internal/zzaw;

    iget-object v1, p0, Lcom/google/android/gms/wearable/zzt;->zzao:Lcom/google/android/gms/wearable/WearableListenerService$zzd;

    iget-object v1, v1, Lcom/google/android/gms/wearable/WearableListenerService$zzd;->zzak:Lcom/google/android/gms/wearable/WearableListenerService;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wearable/internal/zzaw;->zza(Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;)V

    iget-object v0, p0, Lcom/google/android/gms/wearable/zzt;->zzav:Lcom/google/android/gms/wearable/internal/zzaw;

    iget-object v1, p0, Lcom/google/android/gms/wearable/zzt;->zzao:Lcom/google/android/gms/wearable/WearableListenerService$zzd;

    iget-object v1, v1, Lcom/google/android/gms/wearable/WearableListenerService$zzd;->zzak:Lcom/google/android/gms/wearable/WearableListenerService;

    invoke-static {v1}, Lcom/google/android/gms/wearable/WearableListenerService;->zzc(Lcom/google/android/gms/wearable/WearableListenerService;)Lcom/google/android/gms/wearable/internal/zzas;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wearable/internal/zzaw;->zza(Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;)V

    return-void
.end method
