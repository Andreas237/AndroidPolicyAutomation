.class final Lcom/google/android/gms/measurement/internal/zzcq;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzaeb:Ljava/lang/String;

.field private final synthetic zzagj:Ljava/lang/String;

.field private final synthetic zzaql:Lcom/google/android/gms/measurement/internal/zzby;

.field private final synthetic zzaqo:Ljava/lang/String;

.field private final synthetic zzaqp:J


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzby;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzcq;->zzaql:Lcom/google/android/gms/measurement/internal/zzby;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzcq;->zzaqo:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/zzcq;->zzagj:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/zzcq;->zzaeb:Ljava/lang/String;

    iput-wide p5, p0, Lcom/google/android/gms/measurement/internal/zzcq;->zzaqp:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzcq;->zzaqo:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzcq;->zzaql:Lcom/google/android/gms/measurement/internal/zzby;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzby;->zza(Lcom/google/android/gms/measurement/internal/zzby;)Lcom/google/android/gms/measurement/internal/zzfo;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfo;->zzmh()Lcom/google/android/gms/measurement/internal/zzbw;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgm()Lcom/google/android/gms/measurement/internal/zzdy;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzcq;->zzagj:Ljava/lang/String;

    const/4 v2, 0x0

    .line 6
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzdy;->zza(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzdx;)V

    return-void

    .line 8
    :cond_0
    new-instance v1, Lcom/google/android/gms/measurement/internal/zzdx;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzcq;->zzaeb:Ljava/lang/String;

    iget-wide v3, p0, Lcom/google/android/gms/measurement/internal/zzcq;->zzaqp:J

    invoke-direct {v1, v2, v0, v3, v4}, Lcom/google/android/gms/measurement/internal/zzdx;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 9
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzcq;->zzaql:Lcom/google/android/gms/measurement/internal/zzby;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzby;->zza(Lcom/google/android/gms/measurement/internal/zzby;)Lcom/google/android/gms/measurement/internal/zzfo;

    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfo;->zzmh()Lcom/google/android/gms/measurement/internal/zzbw;

    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgm()Lcom/google/android/gms/measurement/internal/zzdy;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzcq;->zzagj:Ljava/lang/String;

    .line 12
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/measurement/internal/zzdy;->zza(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzdx;)V

    return-void
.end method
