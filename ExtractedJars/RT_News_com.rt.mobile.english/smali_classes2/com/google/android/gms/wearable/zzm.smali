.class final Lcom/google/android/gms/wearable/zzm;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzao:Lcom/google/android/gms/wearable/WearableListenerService$zzd;

.field private final synthetic zzap:Lcom/google/android/gms/wearable/internal/zzfe;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/WearableListenerService$zzd;Lcom/google/android/gms/wearable/internal/zzfe;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/zzm;->zzao:Lcom/google/android/gms/wearable/WearableListenerService$zzd;

    iput-object p2, p0, Lcom/google/android/gms/wearable/zzm;->zzap:Lcom/google/android/gms/wearable/internal/zzfe;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wearable/zzm;->zzao:Lcom/google/android/gms/wearable/WearableListenerService$zzd;

    iget-object v0, v0, Lcom/google/android/gms/wearable/WearableListenerService$zzd;->zzak:Lcom/google/android/gms/wearable/WearableListenerService;

    iget-object v1, p0, Lcom/google/android/gms/wearable/zzm;->zzap:Lcom/google/android/gms/wearable/internal/zzfe;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wearable/WearableListenerService;->onMessageReceived(Lcom/google/android/gms/wearable/MessageEvent;)V

    return-void
.end method
