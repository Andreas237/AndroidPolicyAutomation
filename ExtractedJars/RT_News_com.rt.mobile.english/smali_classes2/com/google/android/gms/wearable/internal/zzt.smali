.class final Lcom/google/android/gms/wearable/internal/zzt;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/wearable/internal/zzc;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/wearable/internal/zzc<",
        "Lcom/google/android/gms/wearable/CapabilityApi$CapabilityListener;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zzbr:[Landroid/content/IntentFilter;


# direct methods
.method constructor <init>([Landroid/content/IntentFilter;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/zzt;->zzbr:[Landroid/content/IntentFilter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/wearable/internal/zzhg;Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;Ljava/lang/Object;Lcom/google/android/gms/common/api/internal/ListenerHolder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p3, Lcom/google/android/gms/wearable/CapabilityApi$CapabilityListener;

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzt;->zzbr:[Landroid/content/IntentFilter;

    invoke-virtual {p1, p2, p3, p4, v0}, Lcom/google/android/gms/wearable/internal/zzhg;->zza(Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;Lcom/google/android/gms/wearable/CapabilityApi$CapabilityListener;Lcom/google/android/gms/common/api/internal/ListenerHolder;[Landroid/content/IntentFilter;)V

    return-void
.end method
