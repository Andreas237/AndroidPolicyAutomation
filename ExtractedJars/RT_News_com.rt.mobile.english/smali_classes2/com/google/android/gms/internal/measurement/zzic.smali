.class final Lcom/google/android/gms/internal/measurement/zzic;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

.field private final synthetic zzaon:J


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzhl;J)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzic;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    iput-wide p2, p0, Lcom/google/android/gms/internal/measurement/zzic;->zzaon:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzic;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzfs;->zzaks:Lcom/google/android/gms/internal/measurement/zzfv;

    iget-wide v1, p0, Lcom/google/android/gms/internal/measurement/zzic;->zzaon:J

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzfv;->set(J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzic;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziy()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Session timeout duration set"

    iget-wide v2, p0, Lcom/google/android/gms/internal/measurement/zzic;->zzaon:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
