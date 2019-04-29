.class final Lcom/google/android/gms/wearable/internal/zzat;
.super Lcom/google/android/gms/common/api/internal/RegisterListenerMethod;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/api/internal/RegisterListenerMethod<",
        "Lcom/google/android/gms/wearable/internal/zzhg;",
        "Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;",
        ">;"
    }
.end annotation


# instance fields
.field private final zzba:[Landroid/content/IntentFilter;

.field private final zzce:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final zzcf:Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;

.field private final zzci:Lcom/google/android/gms/common/api/internal/ListenerHolder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/internal/ListenerHolder<",
            "Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;Ljava/lang/String;[Landroid/content/IntentFilter;Lcom/google/android/gms/common/api/internal/ListenerHolder;Lcom/google/android/gms/common/api/internal/ListenerHolder;)V
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
            "[",
            "Landroid/content/IntentFilter;",
            "Lcom/google/android/gms/common/api/internal/ListenerHolder<",
            "Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;",
            ">;",
            "Lcom/google/android/gms/common/api/internal/ListenerHolder<",
            "Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p4}, Lcom/google/android/gms/common/api/internal/RegisterListenerMethod;-><init>(Lcom/google/android/gms/common/api/internal/ListenerHolder;)V

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/zzat;->zzcf:Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;

    iput-object p3, p0, Lcom/google/android/gms/wearable/internal/zzat;->zzba:[Landroid/content/IntentFilter;

    iput-object p2, p0, Lcom/google/android/gms/wearable/internal/zzat;->zzce:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/wearable/internal/zzat;->zzci:Lcom/google/android/gms/common/api/internal/ListenerHolder;

    return-void
.end method


# virtual methods
.method protected final synthetic registerListener(Lcom/google/android/gms/common/api/Api$AnyClient;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/wearable/internal/zzhg;

    new-instance v1, Lcom/google/android/gms/wearable/internal/zzgh;

    invoke-direct {v1, p2}, Lcom/google/android/gms/wearable/internal/zzgh;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    iget-object v2, p0, Lcom/google/android/gms/wearable/internal/zzat;->zzcf:Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;

    iget-object v3, p0, Lcom/google/android/gms/wearable/internal/zzat;->zzci:Lcom/google/android/gms/common/api/internal/ListenerHolder;

    iget-object v4, p0, Lcom/google/android/gms/wearable/internal/zzat;->zzce:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/wearable/internal/zzat;->zzba:[Landroid/content/IntentFilter;

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/wearable/internal/zzhg;->zza(Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;Lcom/google/android/gms/common/api/internal/ListenerHolder;Ljava/lang/String;[Landroid/content/IntentFilter;)V

    return-void
.end method
