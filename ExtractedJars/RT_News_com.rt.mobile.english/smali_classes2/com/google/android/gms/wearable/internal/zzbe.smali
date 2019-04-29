.class final Lcom/google/android/gms/wearable/internal/zzbe;
.super Lcom/google/android/gms/wearable/internal/zzn;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wearable/internal/zzn<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zzcm:Lcom/google/android/gms/wearable/internal/zzay;

.field private final synthetic zzco:Landroid/net/Uri;

.field private final synthetic zzcq:J

.field private final synthetic zzcr:J


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/internal/zzay;Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/net/Uri;JJ)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/zzbe;->zzcm:Lcom/google/android/gms/wearable/internal/zzay;

    iput-object p3, p0, Lcom/google/android/gms/wearable/internal/zzbe;->zzco:Landroid/net/Uri;

    iput-wide p4, p0, Lcom/google/android/gms/wearable/internal/zzbe;->zzcq:J

    iput-wide p6, p0, Lcom/google/android/gms/wearable/internal/zzbe;->zzcr:J

    invoke-direct {p0, p2}, Lcom/google/android/gms/wearable/internal/zzn;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method public final synthetic createFailedResult(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 0

    return-object p1
.end method

.method protected final synthetic doExecute(Lcom/google/android/gms/common/api/Api$AnyClient;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/wearable/internal/zzhg;

    iget-object p1, p0, Lcom/google/android/gms/wearable/internal/zzbe;->zzcm:Lcom/google/android/gms/wearable/internal/zzay;

    invoke-static {p1}, Lcom/google/android/gms/wearable/internal/zzay;->zza(Lcom/google/android/gms/wearable/internal/zzay;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/wearable/internal/zzbe;->zzco:Landroid/net/Uri;

    iget-wide v4, p0, Lcom/google/android/gms/wearable/internal/zzbe;->zzcq:J

    iget-wide v6, p0, Lcom/google/android/gms/wearable/internal/zzbe;->zzcr:J

    move-object v1, p0

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/wearable/internal/zzhg;->zza(Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;Ljava/lang/String;Landroid/net/Uri;JJ)V

    return-void
.end method
