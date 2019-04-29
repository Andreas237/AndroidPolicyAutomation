.class final Lcom/google/android/gms/internal/measurement/zzbx;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzyf:Lcom/google/android/gms/internal/measurement/zzbw;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzbw;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzbx;->zzyf:Lcom/google/android/gms/internal/measurement/zzbw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbx;->zzyf:Lcom/google/android/gms/internal/measurement/zzbw;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzbw;->zza(Lcom/google/android/gms/internal/measurement/zzbw;)Lcom/google/android/gms/internal/measurement/zzat;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zzbw()Lcom/google/android/gms/analytics/zzk;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/analytics/zzk;->zza(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbx;->zzyf:Lcom/google/android/gms/internal/measurement/zzbw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzbw;->zzef()Z

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzbx;->zzyf:Lcom/google/android/gms/internal/measurement/zzbw;

    const-wide/16 v2, 0x0

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzbw;->zza(Lcom/google/android/gms/internal/measurement/zzbw;J)J

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbx;->zzyf:Lcom/google/android/gms/internal/measurement/zzbw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzbw;->run()V

    :cond_1
    return-void
.end method
