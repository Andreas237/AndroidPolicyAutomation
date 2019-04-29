.class final Lcom/google/android/gms/wearable/internal/zzau;
.super Lcom/google/android/gms/common/api/internal/UnregisterListenerMethod;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/api/internal/UnregisterListenerMethod<",
        "Lcom/google/android/gms/wearable/internal/zzhg;",
        "Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;",
        ">;"
    }
.end annotation


# instance fields
.field private final zzce:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final zzcf:Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;Ljava/lang/String;Lcom/google/android/gms/common/api/internal/ListenerHolder$ListenerKey;)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/common/api/internal/ListenerHolder$ListenerKey<",
            "Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p3}, Lcom/google/android/gms/common/api/internal/UnregisterListenerMethod;-><init>(Lcom/google/android/gms/common/api/internal/ListenerHolder$ListenerKey;)V

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/zzau;->zzcf:Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;

    iput-object p2, p0, Lcom/google/android/gms/wearable/internal/zzau;->zzce:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected final synthetic unregisterListener(Lcom/google/android/gms/common/api/Api$AnyClient;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/wearable/internal/zzhg;

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzgg;

    invoke-direct {v0, p2}, Lcom/google/android/gms/wearable/internal/zzgg;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    iget-object p2, p0, Lcom/google/android/gms/wearable/internal/zzau;->zzcf:Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;

    iget-object v1, p0, Lcom/google/android/gms/wearable/internal/zzau;->zzce:Ljava/lang/String;

    invoke-virtual {p1, v0, p2, v1}, Lcom/google/android/gms/wearable/internal/zzhg;->zza(Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;Ljava/lang/String;)V

    return-void
.end method
