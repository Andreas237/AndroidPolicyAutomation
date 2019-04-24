.class final Lcom/google/android/gms/measurement/internal/zzfp;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzaud:Lcom/google/android/gms/measurement/internal/zzft;

.field private final synthetic zzaue:Lcom/google/android/gms/measurement/internal/zzfo;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzfo;Lcom/google/android/gms/measurement/internal/zzft;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzfp;->zzaue:Lcom/google/android/gms/measurement/internal/zzfo;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzfp;->zzaud:Lcom/google/android/gms/measurement/internal/zzft;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzfp;->zzaue:Lcom/google/android/gms/measurement/internal/zzfo;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzfp;->zzaud:Lcom/google/android/gms/measurement/internal/zzft;

    invoke-static {v0, v1}, Lcom/google/android/gms/measurement/internal/zzfo;->zza(Lcom/google/android/gms/measurement/internal/zzfo;Lcom/google/android/gms/measurement/internal/zzft;)V

    .line 3
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzfp;->zzaue:Lcom/google/android/gms/measurement/internal/zzfo;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfo;->start()V

    return-void
.end method
