.class final Lcom/google/android/gms/wearable/internal/zzag;
.super Lcom/google/android/gms/common/api/internal/UnregisterListenerMethod;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/api/internal/UnregisterListenerMethod<",
        "Lcom/google/android/gms/wearable/internal/zzhg;",
        "Lcom/google/android/gms/wearable/CapabilityClient$OnCapabilityChangedListener;",
        ">;"
    }
.end annotation


# instance fields
.field private final zzby:Lcom/google/android/gms/wearable/CapabilityClient$OnCapabilityChangedListener;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/wearable/CapabilityClient$OnCapabilityChangedListener;Lcom/google/android/gms/common/api/internal/ListenerHolder$ListenerKey;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/CapabilityClient$OnCapabilityChangedListener;",
            "Lcom/google/android/gms/common/api/internal/ListenerHolder$ListenerKey<",
            "Lcom/google/android/gms/wearable/CapabilityClient$OnCapabilityChangedListener;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p2}, Lcom/google/android/gms/common/api/internal/UnregisterListenerMethod;-><init>(Lcom/google/android/gms/common/api/internal/ListenerHolder$ListenerKey;)V

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/zzag;->zzby:Lcom/google/android/gms/wearable/CapabilityClient$OnCapabilityChangedListener;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/wearable/CapabilityClient$OnCapabilityChangedListener;Lcom/google/android/gms/common/api/internal/ListenerHolder$ListenerKey;Lcom/google/android/gms/wearable/internal/zzad;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/wearable/internal/zzag;-><init>(Lcom/google/android/gms/wearable/CapabilityClient$OnCapabilityChangedListener;Lcom/google/android/gms/common/api/internal/ListenerHolder$ListenerKey;)V

    return-void
.end method


# virtual methods
.method protected final synthetic unregisterListener(Lcom/google/android/gms/common/api/Api$AnyClient;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/wearable/internal/zzhg;

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzgg;

    invoke-direct {v0, p2}, Lcom/google/android/gms/wearable/internal/zzgg;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    iget-object p2, p0, Lcom/google/android/gms/wearable/internal/zzag;->zzby:Lcom/google/android/gms/wearable/CapabilityClient$OnCapabilityChangedListener;

    invoke-virtual {p1, v0, p2}, Lcom/google/android/gms/wearable/internal/zzhg;->zza(Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;Lcom/google/android/gms/wearable/CapabilityApi$CapabilityListener;)V

    return-void
.end method
