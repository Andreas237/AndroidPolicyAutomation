.class final Lcom/google/android/gms/internal/measurement/zzep;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzafl:Lcom/google/android/gms/internal/measurement/zzhj;

.field private final synthetic zzafm:Lcom/google/android/gms/internal/measurement/zzeo;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzeo;Lcom/google/android/gms/internal/measurement/zzhj;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzep;->zzafm:Lcom/google/android/gms/internal/measurement/zzeo;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzep;->zzafl:Lcom/google/android/gms/internal/measurement/zzhj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzep;->zzafl:Lcom/google/android/gms/internal/measurement/zzhj;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzhj;->zzgi()Lcom/google/android/gms/internal/measurement/zzec;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzec;->isMainThread()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzep;->zzafl:Lcom/google/android/gms/internal/measurement/zzhj;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzhj;->zzge()Lcom/google/android/gms/internal/measurement/zzgh;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/measurement/zzgh;->zzc(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzep;->zzafm:Lcom/google/android/gms/internal/measurement/zzeo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzeo;->zzef()Z

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzep;->zzafm:Lcom/google/android/gms/internal/measurement/zzeo;

    const-wide/16 v2, 0x0

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzeo;->zza(Lcom/google/android/gms/internal/measurement/zzeo;J)J

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzep;->zzafm:Lcom/google/android/gms/internal/measurement/zzeo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzeo;->run()V

    :cond_1
    return-void
.end method
