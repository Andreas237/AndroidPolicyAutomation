.class final Lcom/google/android/gms/internal/measurement/zzfr;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzajz:Z

.field private final synthetic zzaka:Lcom/google/android/gms/internal/measurement/zzfq;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzfq;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzfr;->zzaka:Lcom/google/android/gms/internal/measurement/zzfq;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/measurement/zzfr;->zzajz:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfr;->zzaka:Lcom/google/android/gms/internal/measurement/zzfq;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzfq;->zza(Lcom/google/android/gms/internal/measurement/zzfq;)Lcom/google/android/gms/internal/measurement/zzjs;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/zzfr;->zzajz:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzjs;->zzm(Z)V

    return-void
.end method
