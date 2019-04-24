.class final Lcom/google/android/gms/measurement/internal/zzde;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzaeg:Z

.field private final synthetic zzard:Ljava/util/concurrent/atomic/AtomicReference;

.field private final synthetic zzare:Lcom/google/android/gms/measurement/internal/zzda;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzda;Ljava/util/concurrent/atomic/AtomicReference;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzde;->zzare:Lcom/google/android/gms/measurement/internal/zzda;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzde;->zzard:Ljava/util/concurrent/atomic/AtomicReference;

    iput-boolean p3, p0, Lcom/google/android/gms/measurement/internal/zzde;->zzaeg:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzde;->zzare:Lcom/google/android/gms/measurement/internal/zzda;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zze;->zzgl()Lcom/google/android/gms/measurement/internal/zzeb;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzde;->zzard:Ljava/util/concurrent/atomic/AtomicReference;

    iget-boolean v2, p0, Lcom/google/android/gms/measurement/internal/zzde;->zzaeg:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzeb;->zza(Ljava/util/concurrent/atomic/AtomicReference;Z)V

    return-void
.end method
