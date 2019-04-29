.class final Lcom/google/android/gms/internal/measurement/zzir;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzano:Lcom/google/android/gms/internal/measurement/zzdz;

.field private final synthetic zzant:Ljava/lang/String;

.field private final synthetic zzanu:Lcom/google/android/gms/internal/measurement/zzew;

.field private final synthetic zzapn:Lcom/google/android/gms/internal/measurement/zzij;

.field private final synthetic zzapp:Z

.field private final synthetic zzapq:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzij;ZZLcom/google/android/gms/internal/measurement/zzew;Lcom/google/android/gms/internal/measurement/zzdz;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzir;->zzapn:Lcom/google/android/gms/internal/measurement/zzij;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/measurement/zzir;->zzapp:Z

    iput-boolean p3, p0, Lcom/google/android/gms/internal/measurement/zzir;->zzapq:Z

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/zzir;->zzanu:Lcom/google/android/gms/internal/measurement/zzew;

    iput-object p5, p0, Lcom/google/android/gms/internal/measurement/zzir;->zzano:Lcom/google/android/gms/internal/measurement/zzdz;

    iput-object p6, p0, Lcom/google/android/gms/internal/measurement/zzir;->zzant:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzir;->zzapn:Lcom/google/android/gms/internal/measurement/zzij;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzij;->zzd(Lcom/google/android/gms/internal/measurement/zzij;)Lcom/google/android/gms/internal/measurement/zzez;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzir;->zzapn:Lcom/google/android/gms/internal/measurement/zzij;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Discarding data. Failed to send event to service"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/zzir;->zzapp:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzir;->zzapn:Lcom/google/android/gms/internal/measurement/zzij;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/measurement/zzir;->zzapq:Z

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzir;->zzanu:Lcom/google/android/gms/internal/measurement/zzew;

    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzir;->zzano:Lcom/google/android/gms/internal/measurement/zzdz;

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/internal/measurement/zzij;->zza(Lcom/google/android/gms/internal/measurement/zzez;Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;Lcom/google/android/gms/internal/measurement/zzdz;)V

    goto :goto_1

    :cond_2
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzir;->zzant:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzir;->zzanu:Lcom/google/android/gms/internal/measurement/zzew;

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzir;->zzano:Lcom/google/android/gms/internal/measurement/zzdz;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzez;->zza(Lcom/google/android/gms/internal/measurement/zzew;Lcom/google/android/gms/internal/measurement/zzdz;)V

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzir;->zzanu:Lcom/google/android/gms/internal/measurement/zzew;

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzir;->zzant:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzir;->zzapn:Lcom/google/android/gms/internal/measurement/zzij;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfh;->zzjb()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzez;->zza(Lcom/google/android/gms/internal/measurement/zzew;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzir;->zzapn:Lcom/google/android/gms/internal/measurement/zzij;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v2, "Failed to send event to the service"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzir;->zzapn:Lcom/google/android/gms/internal/measurement/zzij;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzij;->zze(Lcom/google/android/gms/internal/measurement/zzij;)V

    return-void
.end method
