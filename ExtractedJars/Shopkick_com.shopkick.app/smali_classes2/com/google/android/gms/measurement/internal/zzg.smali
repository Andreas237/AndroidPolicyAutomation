.class final Lcom/google/android/gms/measurement/internal/zzg;
.super Ljava/lang/Object;


# instance fields
.field private final zzada:Lcom/google/android/gms/measurement/internal/zzbw;

.field private zzade:J

.field private zzafh:Ljava/lang/String;

.field private zzafi:Ljava/lang/String;

.field private zzafj:Ljava/lang/String;

.field private zzafk:Ljava/lang/String;

.field private zzafl:J

.field private zzafm:J

.field private zzafn:J

.field private zzafo:J

.field private zzafp:Ljava/lang/String;

.field private zzafq:J

.field private zzafr:Z

.field private zzafs:J

.field private zzaft:Z

.field private zzafu:Z

.field private zzafv:Ljava/lang/String;

.field private zzafw:J

.field private zzafx:J

.field private zzafy:J

.field private zzafz:J

.field private zzaga:J

.field private zzagb:J

.field private zzagc:Ljava/lang/String;

.field private zzagd:Z

.field private zzage:J

.field private zzagf:J

.field private zzts:Ljava/lang/String;

.field private final zztt:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzbw;Ljava/lang/String;)V
    .locals 0
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 5
    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzg;->zztt:Ljava/lang/String;

    .line 6
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    return-void
.end method


# virtual methods
.method public final getAppInstanceId()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 16
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 17
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 18
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafh:Ljava/lang/String;

    return-object v0
.end method

.method public final getFirebaseInstanceId()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 50
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 51
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 52
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafk:Ljava/lang/String;

    return-object v0
.end method

.method public final getGmpAppId()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 25
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 26
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafi:Ljava/lang/String;

    return-object v0
.end method

.method public final isMeasurementEnabled()Z
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 114
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 115
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 116
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafr:Z

    return v0
.end method

.method public final setAppVersion(Ljava/lang/String;)V
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 77
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 78
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 79
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzts:Ljava/lang/String;

    invoke-static {v1, p1}, Lcom/google/android/gms/measurement/internal/zzfy;->zzv(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    .line 80
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzts:Ljava/lang/String;

    return-void
.end method

.method public final setMeasurementEnabled(Z)V
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 117
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 118
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 119
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    iget-boolean v1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafr:Z

    if-eq v1, p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    .line 120
    iput-boolean p1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafr:Z

    return-void
.end method

.method public final zzaa(J)V
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 191
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 192
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 193
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagb:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    .line 194
    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagb:J

    return-void
.end method

.method public final zzab(J)V
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 199
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 200
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 201
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzaga:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    .line 202
    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzaga:J

    return-void
.end method

.method public final zzac(J)V
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 220
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 221
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 222
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafs:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    .line 223
    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafs:J

    return-void
.end method

.method public final zzaj(Ljava/lang/String;)V
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 19
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 20
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 21
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafh:Ljava/lang/String;

    invoke-static {v1, p1}, Lcom/google/android/gms/measurement/internal/zzfy;->zzv(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    .line 22
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafh:Ljava/lang/String;

    return-void
.end method

.method public final zzak()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 74
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 75
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 76
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzts:Ljava/lang/String;

    return-object v0
.end method

.method public final zzak(Ljava/lang/String;)V
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 27
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 28
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 29
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    .line 30
    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafi:Ljava/lang/String;

    invoke-static {v1, p1}, Lcom/google/android/gms/measurement/internal/zzfy;->zzv(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    .line 31
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafi:Ljava/lang/String;

    return-void
.end method

.method public final zzal()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 13
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 14
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 15
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zztt:Ljava/lang/String;

    return-object v0
.end method

.method public final zzal(Ljava/lang/String;)V
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 37
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 38
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    .line 39
    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafv:Ljava/lang/String;

    invoke-static {v1, p1}, Lcom/google/android/gms/measurement/internal/zzfy;->zzv(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    .line 40
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafv:Ljava/lang/String;

    return-void
.end method

.method public final zzam(Ljava/lang/String;)V
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 45
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 46
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 47
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafj:Ljava/lang/String;

    invoke-static {v1, p1}, Lcom/google/android/gms/measurement/internal/zzfy;->zzv(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    .line 48
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafj:Ljava/lang/String;

    return-void
.end method

.method public final zzan(Ljava/lang/String;)V
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 53
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 54
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 55
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafk:Ljava/lang/String;

    invoke-static {v1, p1}, Lcom/google/android/gms/measurement/internal/zzfy;->zzv(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    .line 56
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafk:Ljava/lang/String;

    return-void
.end method

.method public final zzao(Ljava/lang/String;)V
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 93
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 94
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 95
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafp:Ljava/lang/String;

    invoke-static {v1, p1}, Lcom/google/android/gms/measurement/internal/zzfy;->zzv(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    .line 96
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafp:Ljava/lang/String;

    return-void
.end method

.method public final zzap(Ljava/lang/String;)V
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 212
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 213
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 214
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagc:Ljava/lang/String;

    invoke-static {v1, p1}, Lcom/google/android/gms/measurement/internal/zzfy;->zzv(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    .line 215
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagc:Ljava/lang/String;

    return-void
.end method

.method public final zze(Z)V
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 228
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 229
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 230
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzaft:Z

    if-eq v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    .line 231
    iput-boolean p1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzaft:Z

    return-void
.end method

.method public final zzf(Z)V
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 236
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 237
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 238
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafu:Z

    if-eq v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    .line 239
    iput-boolean p1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafu:Z

    return-void
.end method

.method public final zzha()V
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 9
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 10
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    return-void
.end method

.method public final zzhb()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 34
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 35
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafv:Ljava/lang/String;

    return-object v0
.end method

.method public final zzhc()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 42
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 43
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 44
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafj:Ljava/lang/String;

    return-object v0
.end method

.method public final zzhd()J
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 58
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 59
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 60
    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafm:J

    return-wide v0
.end method

.method public final zzhe()J
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 66
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 67
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 68
    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafn:J

    return-wide v0
.end method

.method public final zzhf()J
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 82
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 83
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 84
    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafo:J

    return-wide v0
.end method

.method public final zzhg()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 90
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 91
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 92
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafp:Ljava/lang/String;

    return-object v0
.end method

.method public final zzhh()J
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 98
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 99
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 100
    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzade:J

    return-wide v0
.end method

.method public final zzhi()J
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 106
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 107
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 108
    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafq:J

    return-wide v0
.end method

.method public final zzhj()J
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 128
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 129
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 130
    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafl:J

    return-wide v0
.end method

.method public final zzhk()J
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 131
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 132
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 133
    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzage:J

    return-wide v0
.end method

.method public final zzhl()J
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 139
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 140
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 141
    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagf:J

    return-wide v0
.end method

.method public final zzhm()V
    .locals 4
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 147
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 148
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 149
    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafl:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    const-wide/32 v2, 0x7fffffff

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    .line 151
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzas;->zzjj()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v0

    const-string v1, "Bundle index overflow. appId"

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzg;->zztt:Ljava/lang/String;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/zzas;->zzbw(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    const-wide/16 v0, 0x0

    :cond_0
    const/4 v2, 0x1

    .line 153
    iput-boolean v2, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    .line 154
    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafl:J

    return-void
.end method

.method public final zzhn()J
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 156
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 157
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 158
    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafw:J

    return-wide v0
.end method

.method public final zzho()J
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 164
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 165
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 166
    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafx:J

    return-wide v0
.end method

.method public final zzhp()J
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 172
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 173
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 174
    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafy:J

    return-wide v0
.end method

.method public final zzhq()J
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 180
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 181
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 182
    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafz:J

    return-wide v0
.end method

.method public final zzhr()J
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 188
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 189
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 190
    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagb:J

    return-wide v0
.end method

.method public final zzhs()J
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 196
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 197
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 198
    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzaga:J

    return-wide v0
.end method

.method public final zzht()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 204
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 205
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 206
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagc:Ljava/lang/String;

    return-object v0
.end method

.method public final zzhu()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 207
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 208
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 209
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagc:Ljava/lang/String;

    const/4 v1, 0x0

    .line 210
    invoke-virtual {p0, v1}, Lcom/google/android/gms/measurement/internal/zzg;->zzap(Ljava/lang/String;)V

    return-object v0
.end method

.method public final zzhv()J
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 217
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 218
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 219
    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafs:J

    return-wide v0
.end method

.method public final zzhw()Z
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 225
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 226
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 227
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzaft:Z

    return v0
.end method

.method public final zzhx()Z
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 233
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 234
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 235
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafu:Z

    return v0
.end method

.method public final zzo(J)V
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 61
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 62
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 63
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafm:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    .line 64
    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafm:J

    return-void
.end method

.method public final zzp(J)V
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 69
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 70
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 71
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafn:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    .line 72
    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafn:J

    return-void
.end method

.method public final zzq(J)V
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 85
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 86
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 87
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafo:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    .line 88
    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafo:J

    return-void
.end method

.method public final zzr(J)V
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 101
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 102
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 103
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzade:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    .line 104
    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzade:J

    return-void
.end method

.method public final zzs(J)V
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 109
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 110
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 111
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafq:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    .line 112
    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafq:J

    return-void
.end method

.method public final zzt(J)V
    .locals 5
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ltz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    .line 122
    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(Z)V

    .line 123
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 124
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 125
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    iget-wide v3, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafl:J

    cmp-long v3, v3, p1

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    .line 126
    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafl:J

    return-void
.end method

.method public final zzu(J)V
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 134
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 135
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 136
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzage:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    .line 137
    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzage:J

    return-void
.end method

.method public final zzv(J)V
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 142
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 143
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 144
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagf:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    .line 145
    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagf:J

    return-void
.end method

.method public final zzw(J)V
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 159
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 160
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 161
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafw:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    .line 162
    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafw:J

    return-void
.end method

.method public final zzx(J)V
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 167
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 168
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 169
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafx:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    .line 170
    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafx:J

    return-void
.end method

.method public final zzy(J)V
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 175
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 176
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 177
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafy:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    .line 178
    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafy:J

    return-void
.end method

.method public final zzz(J)V
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 183
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    .line 184
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 185
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafz:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzagd:Z

    .line 186
    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/zzg;->zzafz:J

    return-void
.end method
