.class final Lcom/google/android/gms/internal/measurement/zzip;
.super Lcom/google/android/gms/internal/measurement/zzeo;


# instance fields
.field private final synthetic zzapn:Lcom/google/android/gms/internal/measurement/zzij;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzij;Lcom/google/android/gms/internal/measurement/zzhj;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzip;->zzapn:Lcom/google/android/gms/internal/measurement/zzij;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/measurement/zzeo;-><init>(Lcom/google/android/gms/internal/measurement/zzhj;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzip;->zzapn:Lcom/google/android/gms/internal/measurement/zzij;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Tasks have been queued for a long time"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    return-void
.end method
