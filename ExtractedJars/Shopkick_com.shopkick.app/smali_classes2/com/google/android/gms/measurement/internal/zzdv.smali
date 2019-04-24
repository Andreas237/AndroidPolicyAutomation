.class final Lcom/google/android/gms/measurement/internal/zzdv;
.super Lcom/google/android/gms/measurement/internal/zzfn;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/zzfo;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/zzfn;-><init>(Lcom/google/android/gms/measurement/internal/zzfo;)V

    return-void
.end method

.method private static zzr(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 186
    new-instance p0, Ljava/lang/SecurityException;

    const-string p1, "This implementation should not be used."

    invoke-direct {p0, p1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final zzb(Lcom/google/android/gms/measurement/internal/zzag;Ljava/lang/String;)[B
    .locals 31
    .param p1    # Lcom/google/android/gms/measurement/internal/zzag;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Size;
            min = 0x1L
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v15, p2

    .line 4
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 5
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/zzdv;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgf()V

    .line 6
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgv()Lcom/google/android/gms/measurement/internal/zzq;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/measurement/internal/zzai;->zzalf:Lcom/google/android/gms/measurement/internal/zzai$zza;

    invoke-virtual {v2, v15, v3}, Lcom/google/android/gms/measurement/internal/zzq;->zze(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzai$zza;)Z

    move-result v2

    const/4 v14, 0x0

    if-nez v2, :cond_0

    .line 9
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzas;->zzjn()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v0

    const-string v2, "Generating ScionPayload disabled. packageName"

    invoke-virtual {v0, v2, v15}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    .line 10
    new-array v0, v14, [B

    return-object v0

    :cond_0
    const-string v2, "_iap"

    .line 11
    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzag;->name:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v13, 0x0

    if-nez v2, :cond_1

    const-string v2, "_iapx"

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzag;->name:Ljava/lang/String;

    .line 12
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 13
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v2

    .line 14
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzas;->zzjn()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v2

    const-string v3, "Generating a payload for this event is not available. package_name, event_name"

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzag;->name:Ljava/lang/String;

    .line 15
    invoke-virtual {v2, v3, v15, v0}, Lcom/google/android/gms/measurement/internal/zzau;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v13

    .line 17
    :cond_1
    new-instance v11, Lcom/google/android/gms/internal/measurement/zzfv;

    invoke-direct {v11}, Lcom/google/android/gms/internal/measurement/zzfv;-><init>()V

    .line 18
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjt()Lcom/google/android/gms/measurement/internal/zzt;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzt;->beginTransaction()V

    .line 19
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjt()Lcom/google/android/gms/measurement/internal/zzt;

    move-result-object v2

    invoke-virtual {v2, v15}, Lcom/google/android/gms/measurement/internal/zzt;->zzbm(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzg;

    move-result-object v12

    if-nez v12, :cond_2

    .line 21
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzas;->zzjn()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v0

    const-string v2, "Log and bundle not available. package_name"

    invoke-virtual {v0, v2, v15}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    .line 22
    new-array v0, v14, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjt()Lcom/google/android/gms/measurement/internal/zzt;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzt;->endTransaction()V

    return-object v0

    .line 25
    :cond_2
    :try_start_1
    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/zzg;->isMeasurementEnabled()Z

    move-result v2

    if-nez v2, :cond_3

    .line 26
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzas;->zzjn()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v0

    const-string v2, "Log and bundle disabled. package_name"

    invoke-virtual {v0, v2, v15}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    .line 27
    new-array v0, v14, [B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjt()Lcom/google/android/gms/measurement/internal/zzt;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzt;->endTransaction()V

    return-object v0

    .line 30
    :cond_3
    :try_start_2
    new-instance v9, Lcom/google/android/gms/internal/measurement/zzfw;

    invoke-direct {v9}, Lcom/google/android/gms/internal/measurement/zzfw;-><init>()V

    const/4 v10, 0x1

    .line 31
    new-array v2, v10, [Lcom/google/android/gms/internal/measurement/zzfw;

    aput-object v9, v2, v14

    iput-object v2, v11, Lcom/google/android/gms/internal/measurement/zzfv;->zzaxf:[Lcom/google/android/gms/internal/measurement/zzfw;

    .line 32
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v9, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxh:Ljava/lang/Integer;

    const-string v2, "android"

    .line 33
    iput-object v2, v9, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxp:Ljava/lang/String;

    .line 34
    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/zzg;->zzal()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v9, Lcom/google/android/gms/internal/measurement/zzfw;->zztt:Ljava/lang/String;

    .line 35
    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/zzg;->zzhg()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v9, Lcom/google/android/gms/internal/measurement/zzfw;->zzafp:Ljava/lang/String;

    .line 36
    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/zzg;->zzak()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v9, Lcom/google/android/gms/internal/measurement/zzfw;->zzts:Ljava/lang/String;

    .line 37
    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/zzg;->zzhf()J

    move-result-wide v2

    const-wide/32 v4, -0x80000000

    cmp-long v4, v2, v4

    if-nez v4, :cond_4

    move-object v2, v13

    goto :goto_0

    :cond_4
    long-to-int v2, v2

    .line 38
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :goto_0
    iput-object v2, v9, Lcom/google/android/gms/internal/measurement/zzfw;->zzayb:Ljava/lang/Integer;

    .line 39
    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/zzg;->zzhh()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iput-object v2, v9, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxt:Ljava/lang/Long;

    .line 40
    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/zzg;->getGmpAppId()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v9, Lcom/google/android/gms/internal/measurement/zzfw;->zzafi:Ljava/lang/String;

    .line 41
    iget-object v2, v9, Lcom/google/android/gms/internal/measurement/zzfw;->zzafi:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 42
    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/zzg;->zzhb()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v9, Lcom/google/android/gms/internal/measurement/zzfw;->zzawp:Ljava/lang/String;

    .line 43
    :cond_5
    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/zzg;->zzhi()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iput-object v2, v9, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxx:Ljava/lang/Long;

    .line 44
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/zzdv;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzbw;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 45
    invoke-static {}, Lcom/google/android/gms/measurement/internal/zzq;->zzie()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 46
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgv()Lcom/google/android/gms/measurement/internal/zzq;

    move-result-object v2

    iget-object v3, v9, Lcom/google/android/gms/internal/measurement/zzfw;->zztt:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/zzq;->zzas(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 47
    iput-object v13, v9, Lcom/google/android/gms/internal/measurement/zzfw;->zzayh:Ljava/lang/String;

    .line 49
    :cond_6
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgu()Lcom/google/android/gms/measurement/internal/zzbd;

    move-result-object v2

    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/zzg;->zzal()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/zzbd;->zzbz(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v2

    .line 50
    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/zzg;->zzhw()Z

    move-result v3

    if-eqz v3, :cond_7

    if-eqz v2, :cond_7

    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Ljava/lang/CharSequence;

    .line 51
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v3, :cond_7

    .line 52
    :try_start_3
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-wide v4, v0, Lcom/google/android/gms/measurement/internal/zzag;->zzaig:J

    .line 53
    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    .line 54
    invoke-static {v3, v4}, Lcom/google/android/gms/measurement/internal/zzdv;->zzr(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v9, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxv:Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 61
    :try_start_4
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Boolean;

    iput-object v2, v9, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxw:Ljava/lang/Boolean;

    goto :goto_1

    :catch_0
    move-exception v0

    .line 57
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzas;->zzjn()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v2

    const-string v3, "Resettable device id encryption failed"

    invoke-virtual {v0}, Ljava/lang/SecurityException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    .line 58
    new-array v0, v14, [B
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 59
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjt()Lcom/google/android/gms/measurement/internal/zzt;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzt;->endTransaction()V

    return-object v0

    .line 62
    :cond_7
    :goto_1
    :try_start_5
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgp()Lcom/google/android/gms/measurement/internal/zzaa;

    move-result-object v2

    .line 63
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzcs;->zzcl()V

    .line 64
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 65
    iput-object v2, v9, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxr:Ljava/lang/String;

    .line 66
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgp()Lcom/google/android/gms/measurement/internal/zzaa;

    move-result-object v2

    .line 67
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzcs;->zzcl()V

    .line 68
    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 69
    iput-object v2, v9, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxq:Ljava/lang/String;

    .line 70
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgp()Lcom/google/android/gms/measurement/internal/zzaa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzaa;->zziw()J

    move-result-wide v2

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v9, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxs:Ljava/lang/Integer;

    .line 71
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgp()Lcom/google/android/gms/measurement/internal/zzaa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzaa;->zzix()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v9, Lcom/google/android/gms/internal/measurement/zzfw;->zzahr:Ljava/lang/String;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 73
    :try_start_6
    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/zzg;->getAppInstanceId()Ljava/lang/String;

    move-result-object v2

    iget-wide v3, v0, Lcom/google/android/gms/measurement/internal/zzag;->zzaig:J

    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    .line 74
    invoke-static {v2, v3}, Lcom/google/android/gms/measurement/internal/zzdv;->zzr(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v9, Lcom/google/android/gms/internal/measurement/zzfw;->zzafh:Ljava/lang/String;
    :try_end_6
    .catch Ljava/lang/SecurityException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 81
    :try_start_7
    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/zzg;->getFirebaseInstanceId()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v9, Lcom/google/android/gms/internal/measurement/zzfw;->zzafk:Ljava/lang/String;

    .line 82
    iget-object v2, v9, Lcom/google/android/gms/internal/measurement/zzfw;->zztt:Ljava/lang/String;

    .line 83
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjt()Lcom/google/android/gms/measurement/internal/zzt;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/measurement/internal/zzt;->zzbl(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 85
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgv()Lcom/google/android/gms/measurement/internal/zzq;

    move-result-object v4

    invoke-virtual {v4, v15}, Lcom/google/android/gms/measurement/internal/zzq;->zzau(Ljava/lang/String;)Z

    move-result v4

    const-wide/16 v23, 0x0

    if-eqz v4, :cond_b

    .line 88
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/measurement/internal/zzfx;

    const-string v6, "_lte"

    .line 89
    iget-object v7, v5, Lcom/google/android/gms/measurement/internal/zzfx;->name:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    goto :goto_2

    :cond_9
    move-object v5, v13

    :goto_2
    if-eqz v5, :cond_a

    .line 93
    iget-object v4, v5, Lcom/google/android/gms/measurement/internal/zzfx;->value:Ljava/lang/Object;

    if-nez v4, :cond_b

    .line 94
    :cond_a
    new-instance v4, Lcom/google/android/gms/measurement/internal/zzfx;

    const-string v18, "auto"

    const-string v19, "_lte"

    .line 95
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzbx()Lcom/google/android/gms/common/util/Clock;

    move-result-object v5

    invoke-interface {v5}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v20

    .line 96
    invoke-static/range {v23 .. v24}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v22

    move-object/from16 v16, v4

    move-object/from16 v17, v2

    invoke-direct/range {v16 .. v22}, Lcom/google/android/gms/measurement/internal/zzfx;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    .line 97
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 98
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjt()Lcom/google/android/gms/measurement/internal/zzt;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/measurement/internal/zzt;->zza(Lcom/google/android/gms/measurement/internal/zzfx;)Z

    .line 99
    :cond_b
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Lcom/google/android/gms/internal/measurement/zzfz;

    move v4, v14

    .line 100
    :goto_3
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    if-ge v4, v5, :cond_c

    .line 101
    new-instance v5, Lcom/google/android/gms/internal/measurement/zzfz;

    invoke-direct {v5}, Lcom/google/android/gms/internal/measurement/zzfz;-><init>()V

    .line 102
    aput-object v5, v2, v4

    .line 103
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/measurement/internal/zzfx;

    iget-object v6, v6, Lcom/google/android/gms/measurement/internal/zzfx;->name:Ljava/lang/String;

    iput-object v6, v5, Lcom/google/android/gms/internal/measurement/zzfz;->name:Ljava/lang/String;

    .line 104
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/measurement/internal/zzfx;

    iget-wide v6, v6, Lcom/google/android/gms/measurement/internal/zzfx;->zzauk:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    iput-object v6, v5, Lcom/google/android/gms/internal/measurement/zzfz;->zzayu:Ljava/lang/Long;

    .line 105
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjr()Lcom/google/android/gms/measurement/internal/zzfu;

    move-result-object v6

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/measurement/internal/zzfx;

    iget-object v7, v7, Lcom/google/android/gms/measurement/internal/zzfx;->value:Ljava/lang/Object;

    invoke-virtual {v6, v5, v7}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Lcom/google/android/gms/internal/measurement/zzfz;Ljava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 108
    :cond_c
    iput-object v2, v9, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxj:[Lcom/google/android/gms/internal/measurement/zzfz;

    .line 109
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzag;->zzahu:Lcom/google/android/gms/measurement/internal/zzad;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzad;->zziy()Landroid/os/Bundle;

    move-result-object v7

    const-string v2, "_c"

    const-wide/16 v3, 0x1

    .line 110
    invoke-virtual {v7, v2, v3, v4}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 111
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzas;->zzjn()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v2

    const-string v5, "Marking in-app purchase as real-time"

    invoke-virtual {v2, v5}, Lcom/google/android/gms/measurement/internal/zzau;->zzby(Ljava/lang/String;)V

    const-string v2, "_r"

    .line 112
    invoke-virtual {v7, v2, v3, v4}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v2, "_o"

    .line 113
    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/zzag;->origin:Ljava/lang/String;

    invoke-virtual {v7, v2, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgr()Lcom/google/android/gms/measurement/internal/zzfy;

    move-result-object v2

    iget-object v5, v9, Lcom/google/android/gms/internal/measurement/zzfw;->zztt:Ljava/lang/String;

    invoke-virtual {v2, v5}, Lcom/google/android/gms/measurement/internal/zzfy;->zzcz(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_d

    .line 115
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgr()Lcom/google/android/gms/measurement/internal/zzfy;

    move-result-object v2

    const-string v5, "_dbg"

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v2, v7, v5, v6}, Lcom/google/android/gms/measurement/internal/zzfy;->zza(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    .line 116
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgr()Lcom/google/android/gms/measurement/internal/zzfy;

    move-result-object v2

    const-string v5, "_r"

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2, v7, v5, v3}, Lcom/google/android/gms/measurement/internal/zzfy;->zza(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    .line 117
    :cond_d
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjt()Lcom/google/android/gms/measurement/internal/zzt;

    move-result-object v2

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzag;->name:Ljava/lang/String;

    invoke-virtual {v2, v15, v3}, Lcom/google/android/gms/measurement/internal/zzt;->zzg(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzac;

    move-result-object v2

    if-nez v2, :cond_e

    .line 120
    new-instance v17, Lcom/google/android/gms/measurement/internal/zzac;

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/zzag;->name:Ljava/lang/String;

    const-wide/16 v5, 0x0

    const-wide/16 v18, 0x0

    iget-wide v2, v0, Lcom/google/android/gms/measurement/internal/zzag;->zzaig:J

    const-wide/16 v20, 0x0

    const/16 v16, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-wide/from16 v27, v2

    move-object/from16 v2, v17

    move-object/from16 v3, p2

    move-object/from16 v29, v7

    move-wide/from16 v7, v18

    move-object/from16 v30, v9

    move-wide/from16 v9, v27

    move-object/from16 v18, v11

    move-object/from16 v19, v12

    move-wide/from16 v11, v20

    move-object/from16 v13, v16

    move-object/from16 v14, v22

    move-object/from16 v15, v25

    move-object/from16 v16, v26

    invoke-direct/range {v2 .. v16}, Lcom/google/android/gms/measurement/internal/zzac;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    move-object/from16 v12, v17

    move-wide/from16 v9, v23

    goto :goto_4

    :cond_e
    move-object/from16 v29, v7

    move-object/from16 v30, v9

    move-object/from16 v18, v11

    move-object/from16 v19, v12

    .line 121
    iget-wide v3, v2, Lcom/google/android/gms/measurement/internal/zzac;->zzahx:J

    .line 122
    iget-wide v5, v0, Lcom/google/android/gms/measurement/internal/zzag;->zzaig:J

    .line 123
    invoke-virtual {v2, v5, v6}, Lcom/google/android/gms/measurement/internal/zzac;->zzae(J)Lcom/google/android/gms/measurement/internal/zzac;

    move-result-object v17

    move-wide v9, v3

    move-object/from16 v12, v17

    .line 124
    :goto_4
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjt()Lcom/google/android/gms/measurement/internal/zzt;

    move-result-object v2

    invoke-virtual {v2, v12}, Lcom/google/android/gms/measurement/internal/zzt;->zza(Lcom/google/android/gms/measurement/internal/zzac;)V

    .line 125
    new-instance v13, Lcom/google/android/gms/measurement/internal/zzab;

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/zzdv;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/zzag;->origin:Ljava/lang/String;

    iget-object v6, v0, Lcom/google/android/gms/measurement/internal/zzag;->name:Ljava/lang/String;

    iget-wide v7, v0, Lcom/google/android/gms/measurement/internal/zzag;->zzaig:J

    move-object v2, v13

    move-object/from16 v5, p2

    move-object/from16 v11, v29

    invoke-direct/range {v2 .. v11}, Lcom/google/android/gms/measurement/internal/zzab;-><init>(Lcom/google/android/gms/measurement/internal/zzbw;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    .line 126
    new-instance v2, Lcom/google/android/gms/internal/measurement/zzft;

    invoke-direct {v2}, Lcom/google/android/gms/internal/measurement/zzft;-><init>()V

    const/4 v3, 0x1

    .line 127
    new-array v3, v3, [Lcom/google/android/gms/internal/measurement/zzft;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    move-object/from16 v5, v30

    iput-object v3, v5, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxi:[Lcom/google/android/gms/internal/measurement/zzft;

    .line 128
    iget-wide v6, v13, Lcom/google/android/gms/measurement/internal/zzab;->timestamp:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v2, Lcom/google/android/gms/internal/measurement/zzft;->zzaxb:Ljava/lang/Long;

    .line 129
    iget-object v3, v13, Lcom/google/android/gms/measurement/internal/zzab;->name:Ljava/lang/String;

    iput-object v3, v2, Lcom/google/android/gms/internal/measurement/zzft;->name:Ljava/lang/String;

    .line 130
    iget-wide v6, v13, Lcom/google/android/gms/measurement/internal/zzab;->zzaht:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v2, Lcom/google/android/gms/internal/measurement/zzft;->zzaxc:Ljava/lang/Long;

    .line 131
    iget-object v3, v13, Lcom/google/android/gms/measurement/internal/zzab;->zzahu:Lcom/google/android/gms/measurement/internal/zzad;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzad;->size()I

    move-result v3

    new-array v3, v3, [Lcom/google/android/gms/internal/measurement/zzfu;

    iput-object v3, v2, Lcom/google/android/gms/internal/measurement/zzft;->zzaxa:[Lcom/google/android/gms/internal/measurement/zzfu;

    .line 133
    iget-object v3, v13, Lcom/google/android/gms/measurement/internal/zzab;->zzahu:Lcom/google/android/gms/measurement/internal/zzad;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzad;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v6, v4

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 134
    new-instance v8, Lcom/google/android/gms/internal/measurement/zzfu;

    invoke-direct {v8}, Lcom/google/android/gms/internal/measurement/zzfu;-><init>()V

    .line 135
    iget-object v9, v2, Lcom/google/android/gms/internal/measurement/zzft;->zzaxa:[Lcom/google/android/gms/internal/measurement/zzfu;

    add-int/lit8 v10, v6, 0x1

    aput-object v8, v9, v6

    .line 136
    iput-object v7, v8, Lcom/google/android/gms/internal/measurement/zzfu;->name:Ljava/lang/String;

    .line 137
    iget-object v6, v13, Lcom/google/android/gms/measurement/internal/zzab;->zzahu:Lcom/google/android/gms/measurement/internal/zzad;

    invoke-virtual {v6, v7}, Lcom/google/android/gms/measurement/internal/zzad;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    .line 138
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjr()Lcom/google/android/gms/measurement/internal/zzfu;

    move-result-object v7

    invoke-virtual {v7, v8, v6}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Lcom/google/android/gms/internal/measurement/zzfu;Ljava/lang/Object;)V

    move v6, v10

    goto :goto_5

    .line 141
    :cond_f
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfe$zzb;->zzmp()Lcom/google/android/gms/internal/measurement/zzfe$zzb$zza;

    move-result-object v3

    .line 142
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfe$zza;->zzmn()Lcom/google/android/gms/internal/measurement/zzfe$zza$zza;

    move-result-object v6

    iget-wide v7, v12, Lcom/google/android/gms/measurement/internal/zzac;->zzahv:J

    .line 143
    invoke-virtual {v6, v7, v8}, Lcom/google/android/gms/internal/measurement/zzfe$zza$zza;->zzan(J)Lcom/google/android/gms/internal/measurement/zzfe$zza$zza;

    move-result-object v6

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzag;->name:Ljava/lang/String;

    .line 144
    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/measurement/zzfe$zza$zza;->zzda(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfe$zza$zza;

    move-result-object v0

    .line 145
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzuo$zza;->zzwo()Lcom/google/android/gms/internal/measurement/zzvv;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzuo;

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzfe$zza;

    .line 146
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/measurement/zzfe$zzb$zza;->zzb(Lcom/google/android/gms/internal/measurement/zzfe$zza;)Lcom/google/android/gms/internal/measurement/zzfe$zzb$zza;

    move-result-object v0

    .line 147
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzuo$zza;->zzwo()Lcom/google/android/gms/internal/measurement/zzvv;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzuo;

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzfe$zzb;

    iput-object v0, v5, Lcom/google/android/gms/internal/measurement/zzfw;->zzayk:Lcom/google/android/gms/internal/measurement/zzfe$zzb;

    .line 149
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjs()Lcom/google/android/gms/measurement/internal/zzm;

    move-result-object v0

    .line 150
    invoke-virtual/range {v19 .. v19}, Lcom/google/android/gms/measurement/internal/zzg;->zzal()Ljava/lang/String;

    move-result-object v3

    iget-object v6, v5, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxj:[Lcom/google/android/gms/internal/measurement/zzfz;

    const/4 v7, 0x0

    .line 151
    invoke-virtual {v0, v3, v7, v6}, Lcom/google/android/gms/measurement/internal/zzm;->zza(Ljava/lang/String;[Lcom/google/android/gms/internal/measurement/zzft;[Lcom/google/android/gms/internal/measurement/zzfz;)[Lcom/google/android/gms/internal/measurement/zzfr;

    move-result-object v0

    iput-object v0, v5, Lcom/google/android/gms/internal/measurement/zzfw;->zzaya:[Lcom/google/android/gms/internal/measurement/zzfr;

    .line 152
    iget-object v0, v2, Lcom/google/android/gms/internal/measurement/zzft;->zzaxb:Ljava/lang/Long;

    iput-object v0, v5, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxl:Ljava/lang/Long;

    .line 153
    iget-object v0, v2, Lcom/google/android/gms/internal/measurement/zzft;->zzaxb:Ljava/lang/Long;

    iput-object v0, v5, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxm:Ljava/lang/Long;

    .line 154
    invoke-virtual/range {v19 .. v19}, Lcom/google/android/gms/measurement/internal/zzg;->zzhe()J

    move-result-wide v2

    cmp-long v0, v2, v23

    if-eqz v0, :cond_10

    .line 155
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    goto :goto_6

    :cond_10
    move-object v13, v7

    :goto_6
    iput-object v13, v5, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxo:Ljava/lang/Long;

    .line 156
    invoke-virtual/range {v19 .. v19}, Lcom/google/android/gms/measurement/internal/zzg;->zzhd()J

    move-result-wide v8

    cmp-long v0, v8, v23

    if-nez v0, :cond_11

    goto :goto_7

    :cond_11
    move-wide v2, v8

    :goto_7
    cmp-long v0, v2, v23

    if-eqz v0, :cond_12

    .line 159
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    goto :goto_8

    :cond_12
    move-object v13, v7

    :goto_8
    iput-object v13, v5, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxn:Ljava/lang/Long;

    .line 160
    invoke-virtual/range {v19 .. v19}, Lcom/google/android/gms/measurement/internal/zzg;->zzhm()V

    .line 161
    invoke-virtual/range {v19 .. v19}, Lcom/google/android/gms/measurement/internal/zzg;->zzhj()J

    move-result-wide v2

    long-to-int v0, v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v5, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxy:Ljava/lang/Integer;

    .line 162
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgv()Lcom/google/android/gms/measurement/internal/zzq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzq;->zzhh()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, v5, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxu:Ljava/lang/Long;

    .line 163
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzbx()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, v5, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxk:Ljava/lang/Long;

    .line 164
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, v5, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxz:Ljava/lang/Boolean;

    .line 165
    iget-object v0, v5, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxl:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object/from16 v0, v19

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/measurement/internal/zzg;->zzo(J)V

    .line 166
    iget-object v2, v5, Lcom/google/android/gms/internal/measurement/zzfw;->zzaxm:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/measurement/internal/zzg;->zzp(J)V

    .line 167
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjt()Lcom/google/android/gms/measurement/internal/zzt;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/measurement/internal/zzt;->zza(Lcom/google/android/gms/measurement/internal/zzg;)V

    .line 168
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjt()Lcom/google/android/gms/measurement/internal/zzt;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzt;->setTransactionSuccessful()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 169
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjt()Lcom/google/android/gms/measurement/internal/zzt;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzt;->endTransaction()V

    .line 172
    :try_start_8
    invoke-virtual/range {v18 .. v18}, Lcom/google/android/gms/internal/measurement/zzyi;->zzvx()I

    move-result v0

    .line 173
    new-array v0, v0, [B

    .line 175
    array-length v2, v0

    invoke-static {v0, v4, v2}, Lcom/google/android/gms/internal/measurement/zzya;->zzk([BII)Lcom/google/android/gms/internal/measurement/zzya;

    move-result-object v2

    move-object/from16 v3, v18

    .line 177
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/measurement/zzyi;->zza(Lcom/google/android/gms/internal/measurement/zzya;)V

    .line 178
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzya;->zzza()V

    .line 179
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjr()Lcom/google/android/gms/measurement/internal/zzfu;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/measurement/internal/zzfu;->zzb([B)[B

    move-result-object v0
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1

    return-object v0

    :catch_1
    move-exception v0

    .line 181
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v2

    .line 182
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzas;->zzjg()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v2

    const-string v3, "Data loss. Failed to bundle and serialize. appId"

    .line 183
    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/measurement/internal/zzas;->zzbw(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    .line 184
    invoke-virtual {v2, v3, v4, v0}, Lcom/google/android/gms/measurement/internal/zzau;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v7

    :catch_2
    move-exception v0

    move v4, v14

    .line 77
    :try_start_9
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzas;->zzjn()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v2

    const-string v3, "app instance id encryption failed"

    invoke-virtual {v0}, Ljava/lang/SecurityException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    .line 78
    new-array v0, v4, [B
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 79
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjt()Lcom/google/android/gms/measurement/internal/zzt;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzt;->endTransaction()V

    return-object v0

    :catchall_0
    move-exception v0

    .line 171
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjt()Lcom/google/android/gms/measurement/internal/zzt;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzt;->endTransaction()V

    throw v0
.end method

.method protected final zzgy()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
