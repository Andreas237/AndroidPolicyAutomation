.class public Lcom/google/android/gms/internal/measurement/zzaq;
.super Ljava/lang/Object;


# instance fields
.field private final zzvn:Lcom/google/android/gms/internal/measurement/zzat;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/internal/measurement/zzat;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzaq;->zzvn:Lcom/google/android/gms/internal/measurement/zzat;

    return-void
.end method

.method private final zza(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaq;->zzvn:Lcom/google/android/gms/internal/measurement/zzat;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zzcj()Lcom/google/android/gms/internal/measurement/zzcm;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object v1, v0

    if-eqz v1, :cond_3

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzcc;->zzym:Lcom/google/android/gms/internal/measurement/zzcd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzcd;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p2, p3, p4, p5}, Lcom/google/android/gms/internal/measurement/zzcm;->zzc(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v0, v2}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    :cond_1
    const/4 v0, 0x5

    if-lt p1, v0, :cond_2

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/measurement/zzcm;->zzb(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-void

    :cond_3
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzcc;->zzym:Lcom/google/android/gms/internal/measurement/zzcd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzcd;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {p2, p3, p4, p5}, Lcom/google/android/gms/internal/measurement/zzaq;->zzc(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, p2}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    :cond_4
    return-void
.end method

.method private static zzb(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    if-nez p0, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_1

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_1
    instance-of v0, p0, Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    if-ne p0, v0, :cond_2

    const-string p0, "true"

    return-object p0

    :cond_2
    const-string p0, "false"

    return-object p0

    :cond_3
    instance-of v0, p0, Ljava/lang/Throwable;

    if-eqz v0, :cond_4

    check-cast p0, Ljava/lang/Throwable;

    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method protected static zzc(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    if-nez p0, :cond_0

    const-string p0, ""

    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zzb(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzaq;->zzb(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p3}, Lcom/google/android/gms/internal/measurement/zzaq;->zzb(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    :cond_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    :cond_2
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    :cond_3
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static zzcg()Z
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzcc;->zzym:Lcom/google/android/gms/internal/measurement/zzcd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzcd;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    return v0
.end method


# virtual methods
.method protected final getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaq;->zzvn:Lcom/google/android/gms/internal/measurement/zzat;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzat;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final zza(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 6

    const/4 v1, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/zzaq;->zza(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    const/4 v1, 0x2

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/zzaq;->zza(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    const/4 v1, 0x3

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/zzaq;->zza(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final zzb(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 6

    const/4 v1, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/zzaq;->zza(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final zzb(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    const/4 v1, 0x3

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/zzaq;->zza(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final zzb(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    const/4 v1, 0x5

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/zzaq;->zza(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final zzbs()Lcom/google/android/gms/internal/measurement/zzat;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaq;->zzvn:Lcom/google/android/gms/internal/measurement/zzat;

    return-object v0
.end method

.method protected final zzbt()Lcom/google/android/gms/common/util/Clock;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaq;->zzvn:Lcom/google/android/gms/internal/measurement/zzat;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    return-object v0
.end method

.method protected final zzbu()Lcom/google/android/gms/internal/measurement/zzcm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaq;->zzvn:Lcom/google/android/gms/internal/measurement/zzat;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zzbu()Lcom/google/android/gms/internal/measurement/zzcm;

    move-result-object v0

    return-object v0
.end method

.method protected final zzbv()Lcom/google/android/gms/internal/measurement/zzbu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaq;->zzvn:Lcom/google/android/gms/internal/measurement/zzat;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zzbv()Lcom/google/android/gms/internal/measurement/zzbu;

    move-result-object v0

    return-object v0
.end method

.method protected final zzbw()Lcom/google/android/gms/analytics/zzk;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaq;->zzvn:Lcom/google/android/gms/internal/measurement/zzat;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zzbw()Lcom/google/android/gms/analytics/zzk;

    move-result-object v0

    return-object v0
.end method

.method public final zzbx()Lcom/google/android/gms/analytics/GoogleAnalytics;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaq;->zzvn:Lcom/google/android/gms/internal/measurement/zzat;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zzck()Lcom/google/android/gms/analytics/GoogleAnalytics;

    move-result-object v0

    return-object v0
.end method

.method protected final zzby()Lcom/google/android/gms/internal/measurement/zzai;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaq;->zzvn:Lcom/google/android/gms/internal/measurement/zzat;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zzby()Lcom/google/android/gms/internal/measurement/zzai;

    move-result-object v0

    return-object v0
.end method

.method protected final zzbz()Lcom/google/android/gms/internal/measurement/zzbz;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaq;->zzvn:Lcom/google/android/gms/internal/measurement/zzat;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zzbz()Lcom/google/android/gms/internal/measurement/zzbz;

    move-result-object v0

    return-object v0
.end method

.method public final zzc(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 6

    const/4 v1, 0x4

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/zzaq;->zza(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final zzc(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    const/4 v1, 0x5

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/zzaq;->zza(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method protected final zzca()Lcom/google/android/gms/internal/measurement/zzde;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaq;->zzvn:Lcom/google/android/gms/internal/measurement/zzat;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zzca()Lcom/google/android/gms/internal/measurement/zzde;

    move-result-object v0

    return-object v0
.end method

.method protected final zzcb()Lcom/google/android/gms/internal/measurement/zzcq;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaq;->zzvn:Lcom/google/android/gms/internal/measurement/zzat;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zzcb()Lcom/google/android/gms/internal/measurement/zzcq;

    move-result-object v0

    return-object v0
.end method

.method protected final zzcc()Lcom/google/android/gms/internal/measurement/zzbl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaq;->zzvn:Lcom/google/android/gms/internal/measurement/zzat;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zzcn()Lcom/google/android/gms/internal/measurement/zzbl;

    move-result-object v0

    return-object v0
.end method

.method protected final zzcd()Lcom/google/android/gms/internal/measurement/zzah;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaq;->zzvn:Lcom/google/android/gms/internal/measurement/zzat;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zzcm()Lcom/google/android/gms/internal/measurement/zzah;

    move-result-object v0

    return-object v0
.end method

.method protected final zzce()Lcom/google/android/gms/internal/measurement/zzbe;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaq;->zzvn:Lcom/google/android/gms/internal/measurement/zzat;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zzce()Lcom/google/android/gms/internal/measurement/zzbe;

    move-result-object v0

    return-object v0
.end method

.method protected final zzcf()Lcom/google/android/gms/internal/measurement/zzby;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaq;->zzvn:Lcom/google/android/gms/internal/measurement/zzat;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzat;->zzcf()Lcom/google/android/gms/internal/measurement/zzby;

    move-result-object v0

    return-object v0
.end method

.method public final zzd(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 6

    const/4 v1, 0x5

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/zzaq;->zza(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final zzd(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    const/4 v1, 0x6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/zzaq;->zza(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final zze(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 6

    const/4 v1, 0x6

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/zzaq;->zza(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final zzq(Ljava/lang/String;)V
    .locals 6

    const/4 v1, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/zzaq;->zza(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final zzr(Ljava/lang/String;)V
    .locals 6

    const/4 v1, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/zzaq;->zza(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final zzs(Ljava/lang/String;)V
    .locals 6

    const/4 v1, 0x4

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/zzaq;->zza(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final zzt(Ljava/lang/String;)V
    .locals 6

    const/4 v1, 0x5

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/zzaq;->zza(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final zzu(Ljava/lang/String;)V
    .locals 6

    const/4 v1, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/zzaq;->zza(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
