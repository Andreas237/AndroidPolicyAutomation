.class final Lcom/google/android/gms/internal/measurement/zzhv;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzanr:Ljava/lang/String;

.field private final synthetic zzans:Ljava/lang/String;

.field private final synthetic zzant:Ljava/lang/String;

.field private final synthetic zzaof:Ljava/util/concurrent/atomic/AtomicReference;

.field private final synthetic zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

.field private final synthetic zzaoj:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzhl;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzhv;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzhv;->zzaof:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/zzhv;->zzant:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/zzhv;->zzanr:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/measurement/zzhv;->zzans:Ljava/lang/String;

    iput-boolean p6, p0, Lcom/google/android/gms/internal/measurement/zzhv;->zzaoj:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzhv;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzhl;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzfy()Lcom/google/android/gms/internal/measurement/zzij;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzhv;->zzaof:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzhv;->zzant:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zzhv;->zzanr:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/internal/measurement/zzhv;->zzans:Ljava/lang/String;

    iget-boolean v6, p0, Lcom/google/android/gms/internal/measurement/zzhv;->zzaoj:Z

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/measurement/zzij;->zza(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
