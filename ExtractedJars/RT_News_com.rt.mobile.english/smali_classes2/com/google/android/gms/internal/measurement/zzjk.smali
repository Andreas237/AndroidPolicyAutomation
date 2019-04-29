.class final Lcom/google/android/gms/internal/measurement/zzjk;
.super Lcom/google/android/gms/internal/measurement/zzeo;


# instance fields
.field private final synthetic zzaqg:Lcom/google/android/gms/internal/measurement/zzji;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzji;Lcom/google/android/gms/internal/measurement/zzhj;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjk;->zzaqg:Lcom/google/android/gms/internal/measurement/zzji;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/measurement/zzeo;-><init>(Lcom/google/android/gms/internal/measurement/zzhj;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjk;->zzaqg:Lcom/google/android/gms/internal/measurement/zzji;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzji;->zza(Lcom/google/android/gms/internal/measurement/zzji;)V

    return-void
.end method
