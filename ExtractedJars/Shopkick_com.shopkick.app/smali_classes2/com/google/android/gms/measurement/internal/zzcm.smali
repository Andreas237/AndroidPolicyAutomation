.class final Lcom/google/android/gms/measurement/internal/zzcm;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzaqk:Lcom/google/android/gms/measurement/internal/zzk;

.field private final synthetic zzaql:Lcom/google/android/gms/measurement/internal/zzby;

.field private final synthetic zzaqn:Lcom/google/android/gms/measurement/internal/zzfv;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzby;Lcom/google/android/gms/measurement/internal/zzfv;Lcom/google/android/gms/measurement/internal/zzk;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzcm;->zzaql:Lcom/google/android/gms/measurement/internal/zzby;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzcm;->zzaqn:Lcom/google/android/gms/measurement/internal/zzfv;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/zzcm;->zzaqk:Lcom/google/android/gms/measurement/internal/zzk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzcm;->zzaql:Lcom/google/android/gms/measurement/internal/zzby;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzby;->zza(Lcom/google/android/gms/measurement/internal/zzby;)Lcom/google/android/gms/measurement/internal/zzfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfo;->zzme()V

    .line 3
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzcm;->zzaql:Lcom/google/android/gms/measurement/internal/zzby;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzby;->zza(Lcom/google/android/gms/measurement/internal/zzby;)Lcom/google/android/gms/measurement/internal/zzfo;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzcm;->zzaqn:Lcom/google/android/gms/measurement/internal/zzfv;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzcm;->zzaqk:Lcom/google/android/gms/measurement/internal/zzk;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzfo;->zzc(Lcom/google/android/gms/measurement/internal/zzfv;Lcom/google/android/gms/measurement/internal/zzk;)V

    return-void
.end method
