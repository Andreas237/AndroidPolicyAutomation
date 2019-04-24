.class final Lcom/google/android/gms/measurement/internal/zzfl;
.super Lcom/google/android/gms/measurement/internal/zzy;


# instance fields
.field private final synthetic zzasx:Lcom/google/android/gms/measurement/internal/zzfo;

.field private final synthetic zzatf:Lcom/google/android/gms/measurement/internal/zzfk;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzfk;Lcom/google/android/gms/measurement/internal/zzct;Lcom/google/android/gms/measurement/internal/zzfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzfl;->zzatf:Lcom/google/android/gms/measurement/internal/zzfk;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/zzfl;->zzasx:Lcom/google/android/gms/measurement/internal/zzfo;

    invoke-direct {p0, p2}, Lcom/google/android/gms/measurement/internal/zzy;-><init>(Lcom/google/android/gms/measurement/internal/zzct;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzfl;->zzatf:Lcom/google/android/gms/measurement/internal/zzfk;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfk;->cancel()V

    .line 3
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzfl;->zzatf:Lcom/google/android/gms/measurement/internal/zzfk;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzas;->zzjo()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v0

    const-string v1, "Starting upload from DelayedRunnable"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzau;->zzby(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzfl;->zzasx:Lcom/google/android/gms/measurement/internal/zzfo;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfo;->zzlz()V

    return-void
.end method
