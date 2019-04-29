.class final Lcom/google/android/gms/internal/measurement/zzhq;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzaof:Ljava/util/concurrent/atomic/AtomicReference;

.field private final synthetic zzaog:Lcom/google/android/gms/internal/measurement/zzhl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzhl;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzhq;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzhq;->zzaof:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzhq;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzfy()Lcom/google/android/gms/internal/measurement/zzij;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzhq;->zzaof:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzij;->zza(Ljava/util/concurrent/atomic/AtomicReference;)V

    return-void
.end method
