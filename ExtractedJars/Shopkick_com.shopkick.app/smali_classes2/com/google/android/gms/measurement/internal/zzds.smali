.class final Lcom/google/android/gms/measurement/internal/zzds;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzare:Lcom/google/android/gms/measurement/internal/zzda;

.field private final synthetic zzarm:J


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzda;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzds;->zzare:Lcom/google/android/gms/measurement/internal/zzda;

    iput-wide p2, p0, Lcom/google/android/gms/measurement/internal/zzds;->zzarm:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzds;->zzare:Lcom/google/android/gms/measurement/internal/zzda;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgu()Lcom/google/android/gms/measurement/internal/zzbd;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzbd;->zzanl:Lcom/google/android/gms/measurement/internal/zzbg;

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/zzds;->zzarm:J

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzbg;->set(J)V

    .line 3
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzds;->zzare:Lcom/google/android/gms/measurement/internal/zzda;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzas;->zzjn()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v0

    const-string v1, "Minimum session duration set"

    iget-wide v2, p0, Lcom/google/android/gms/measurement/internal/zzds;->zzarm:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
