.class final Lcom/google/android/gms/internal/measurement/zziv;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzano:Lcom/google/android/gms/internal/measurement/zzdz;

.field private final synthetic zzanv:Lcom/google/android/gms/internal/measurement/zzjz;

.field private final synthetic zzapn:Lcom/google/android/gms/internal/measurement/zzij;

.field private final synthetic zzapq:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzij;ZLcom/google/android/gms/internal/measurement/zzjz;Lcom/google/android/gms/internal/measurement/zzdz;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zziv;->zzapn:Lcom/google/android/gms/internal/measurement/zzij;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/measurement/zziv;->zzapq:Z

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/zziv;->zzanv:Lcom/google/android/gms/internal/measurement/zzjz;

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/zziv;->zzano:Lcom/google/android/gms/internal/measurement/zzdz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zziv;->zzapn:Lcom/google/android/gms/internal/measurement/zzij;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzij;->zzd(Lcom/google/android/gms/internal/measurement/zzij;)Lcom/google/android/gms/internal/measurement/zzez;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zziv;->zzapn:Lcom/google/android/gms/internal/measurement/zzij;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Discarding data. Failed to set user attribute"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zziv;->zzapn:Lcom/google/android/gms/internal/measurement/zzij;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/measurement/zziv;->zzapq:Z

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zziv;->zzanv:Lcom/google/android/gms/internal/measurement/zzjz;

    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zziv;->zzano:Lcom/google/android/gms/internal/measurement/zzdz;

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/internal/measurement/zzij;->zza(Lcom/google/android/gms/internal/measurement/zzez;Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;Lcom/google/android/gms/internal/measurement/zzdz;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zziv;->zzapn:Lcom/google/android/gms/internal/measurement/zzij;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzij;->zze(Lcom/google/android/gms/internal/measurement/zzij;)V

    return-void
.end method
