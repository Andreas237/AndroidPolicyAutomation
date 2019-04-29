.class final Lcom/google/android/gms/internal/measurement/zzhu;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzanr:Ljava/lang/String;

.field private final synthetic zzans:Ljava/lang/String;

.field private final synthetic zzant:Ljava/lang/String;

.field private final synthetic zzaof:Ljava/util/concurrent/atomic/AtomicReference;

.field private final synthetic zzaog:Lcom/google/android/gms/internal/measurement/zzhl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzhl;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzaof:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzant:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzanr:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzans:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzhl;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzfy()Lcom/google/android/gms/internal/measurement/zzij;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzaof:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzant:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzanr:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzans:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/measurement/zzij;->zza(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
