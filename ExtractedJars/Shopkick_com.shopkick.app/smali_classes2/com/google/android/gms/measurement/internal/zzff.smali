.class final Lcom/google/android/gms/measurement/internal/zzff;
.super Lcom/google/android/gms/measurement/internal/zzy;


# instance fields
.field private final synthetic zzatd:Lcom/google/android/gms/measurement/internal/zzfd;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzfd;Lcom/google/android/gms/measurement/internal/zzct;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzff;->zzatd:Lcom/google/android/gms/measurement/internal/zzfd;

    invoke-direct {p0, p2}, Lcom/google/android/gms/measurement/internal/zzy;-><init>(Lcom/google/android/gms/measurement/internal/zzct;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzff;->zzatd:Lcom/google/android/gms/measurement/internal/zzfd;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzfd;->zza(Lcom/google/android/gms/measurement/internal/zzfd;)V

    return-void
.end method
