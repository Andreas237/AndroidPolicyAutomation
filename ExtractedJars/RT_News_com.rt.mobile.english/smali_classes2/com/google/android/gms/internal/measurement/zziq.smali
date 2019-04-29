.class final Lcom/google/android/gms/internal/measurement/zziq;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzano:Lcom/google/android/gms/internal/measurement/zzdz;

.field private final synthetic zzapn:Lcom/google/android/gms/internal/measurement/zzij;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzij;Lcom/google/android/gms/internal/measurement/zzdz;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zziq;->zzapn:Lcom/google/android/gms/internal/measurement/zzij;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zziq;->zzano:Lcom/google/android/gms/internal/measurement/zzdz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zziq;->zzapn:Lcom/google/android/gms/internal/measurement/zzij;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzij;->zzd(Lcom/google/android/gms/internal/measurement/zzij;)Lcom/google/android/gms/internal/measurement/zzez;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zziq;->zzapn:Lcom/google/android/gms/internal/measurement/zzij;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Failed to send measurementEnabled to service"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    return-void

    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zziq;->zzano:Lcom/google/android/gms/internal/measurement/zzdz;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/measurement/zzez;->zzb(Lcom/google/android/gms/internal/measurement/zzdz;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zziq;->zzapn:Lcom/google/android/gms/internal/measurement/zzij;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzij;->zze(Lcom/google/android/gms/internal/measurement/zzij;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zziq;->zzapn:Lcom/google/android/gms/internal/measurement/zzij;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v2, "Failed to send measurementEnabled to the service"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
