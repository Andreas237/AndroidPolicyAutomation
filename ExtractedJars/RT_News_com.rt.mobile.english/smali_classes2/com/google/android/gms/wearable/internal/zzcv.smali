.class final Lcom/google/android/gms/wearable/internal/zzcv;
.super Lcom/google/android/gms/common/api/internal/RegisterListenerMethod;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/api/internal/RegisterListenerMethod<",
        "Lcom/google/android/gms/wearable/internal/zzhg;",
        "Lcom/google/android/gms/wearable/DataClient$OnDataChangedListener;",
        ">;"
    }
.end annotation


# instance fields
.field private final zzba:[Landroid/content/IntentFilter;

.field private final zzbz:Lcom/google/android/gms/common/api/internal/ListenerHolder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/internal/ListenerHolder<",
            "Lcom/google/android/gms/wearable/DataApi$DataListener;",
            ">;"
        }
    .end annotation
.end field

.field private final zzdk:Lcom/google/android/gms/wearable/DataClient$OnDataChangedListener;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/wearable/DataClient$OnDataChangedListener;[Landroid/content/IntentFilter;Lcom/google/android/gms/common/api/internal/ListenerHolder;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/DataClient$OnDataChangedListener;",
            "[",
            "Landroid/content/IntentFilter;",
            "Lcom/google/android/gms/common/api/internal/ListenerHolder<",
            "Lcom/google/android/gms/wearable/DataClient$OnDataChangedListener;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p3}, Lcom/google/android/gms/common/api/internal/RegisterListenerMethod;-><init>(Lcom/google/android/gms/common/api/internal/ListenerHolder;)V

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/zzcv;->zzdk:Lcom/google/android/gms/wearable/DataClient$OnDataChangedListener;

    iput-object p2, p0, Lcom/google/android/gms/wearable/internal/zzcv;->zzba:[Landroid/content/IntentFilter;

    iput-object p3, p0, Lcom/google/android/gms/wearable/internal/zzcv;->zzbz:Lcom/google/android/gms/common/api/internal/ListenerHolder;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/wearable/DataClient$OnDataChangedListener;[Landroid/content/IntentFilter;Lcom/google/android/gms/common/api/internal/ListenerHolder;Lcom/google/android/gms/wearable/internal/zzct;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/wearable/internal/zzcv;-><init>(Lcom/google/android/gms/wearable/DataClient$OnDataChangedListener;[Landroid/content/IntentFilter;Lcom/google/android/gms/common/api/internal/ListenerHolder;)V

    return-void
.end method


# virtual methods
.method protected final synthetic registerListener(Lcom/google/android/gms/common/api/Api$AnyClient;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/wearable/internal/zzhg;

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzgh;

    invoke-direct {v0, p2}, Lcom/google/android/gms/wearable/internal/zzgh;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    iget-object p2, p0, Lcom/google/android/gms/wearable/internal/zzcv;->zzdk:Lcom/google/android/gms/wearable/DataClient$OnDataChangedListener;

    iget-object v1, p0, Lcom/google/android/gms/wearable/internal/zzcv;->zzbz:Lcom/google/android/gms/common/api/internal/ListenerHolder;

    iget-object v2, p0, Lcom/google/android/gms/wearable/internal/zzcv;->zzba:[Landroid/content/IntentFilter;

    invoke-virtual {p1, v0, p2, v1, v2}, Lcom/google/android/gms/wearable/internal/zzhg;->zza(Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;Lcom/google/android/gms/wearable/DataApi$DataListener;Lcom/google/android/gms/common/api/internal/ListenerHolder;[Landroid/content/IntentFilter;)V

    return-void
.end method
