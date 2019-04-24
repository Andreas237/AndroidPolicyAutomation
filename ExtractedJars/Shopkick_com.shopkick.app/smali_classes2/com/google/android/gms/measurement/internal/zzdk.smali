.class final Lcom/google/android/gms/measurement/internal/zzdk;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzads:Ljava/lang/String;

.field private final synthetic zzadz:Ljava/lang/String;

.field private final synthetic zzagj:Ljava/lang/String;

.field private final synthetic zzard:Ljava/util/concurrent/atomic/AtomicReference;

.field private final synthetic zzare:Lcom/google/android/gms/measurement/internal/zzda;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzda;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzdk;->zzare:Lcom/google/android/gms/measurement/internal/zzda;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzdk;->zzard:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/zzdk;->zzagj:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/zzdk;->zzads:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/measurement/internal/zzdk;->zzadz:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzdk;->zzare:Lcom/google/android/gms/measurement/internal/zzda;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzda;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgl()Lcom/google/android/gms/measurement/internal/zzeb;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzdk;->zzard:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzdk;->zzagj:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzdk;->zzads:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/zzdk;->zzadz:Ljava/lang/String;

    .line 4
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/measurement/internal/zzeb;->zza(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
