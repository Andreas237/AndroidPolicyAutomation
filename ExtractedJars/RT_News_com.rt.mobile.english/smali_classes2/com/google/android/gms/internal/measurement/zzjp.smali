.class final Lcom/google/android/gms/internal/measurement/zzjp;
.super Lcom/google/android/gms/internal/measurement/zzeo;


# instance fields
.field private final synthetic zzaqc:Lcom/google/android/gms/internal/measurement/zzjs;

.field private final synthetic zzaqi:Lcom/google/android/gms/internal/measurement/zzjo;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzjo;Lcom/google/android/gms/internal/measurement/zzhj;Lcom/google/android/gms/internal/measurement/zzjs;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjp;->zzaqi:Lcom/google/android/gms/internal/measurement/zzjo;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/zzjp;->zzaqc:Lcom/google/android/gms/internal/measurement/zzjs;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/measurement/zzeo;-><init>(Lcom/google/android/gms/internal/measurement/zzhj;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjp;->zzaqi:Lcom/google/android/gms/internal/measurement/zzjo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjo;->cancel()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjp;->zzaqi:Lcom/google/android/gms/internal/measurement/zzjo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Starting upload from DelayedRunnable"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjp;->zzaqc:Lcom/google/android/gms/internal/measurement/zzjs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzlb()V

    return-void
.end method
