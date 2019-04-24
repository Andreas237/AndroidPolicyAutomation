.class final Lcom/google/android/gms/measurement/internal/zzm;
.super Lcom/google/android/gms/measurement/internal/zzfn;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzfo;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/zzfn;-><init>(Lcom/google/android/gms/measurement/internal/zzfo;)V

    return-void
.end method

.method private final zza(DLcom/google/android/gms/internal/measurement/zzfl;)Ljava/lang/Boolean;
    .locals 1

    .line 670
    :try_start_0
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, p1, p2}, Ljava/math/BigDecimal;-><init>(D)V

    invoke-static {p1, p2}, Ljava/lang/Math;->ulp(D)D

    move-result-wide p1

    invoke-static {v0, p3, p1, p2}, Lcom/google/android/gms/measurement/internal/zzm;->zza(Ljava/math/BigDecimal;Lcom/google/android/gms/internal/measurement/zzfl;D)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final zza(JLcom/google/android/gms/internal/measurement/zzfl;)Ljava/lang/Boolean;
    .locals 1

    .line 667
    :try_start_0
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, p1, p2}, Ljava/math/BigDecimal;-><init>(J)V

    const-wide/16 p1, 0x0

    invoke-static {v0, p3, p1, p2}, Lcom/google/android/gms/measurement/internal/zzm;->zza(Ljava/math/BigDecimal;Lcom/google/android/gms/internal/measurement/zzfl;D)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final zza(Lcom/google/android/gms/internal/measurement/zzfj;Ljava/lang/String;[Lcom/google/android/gms/internal/measurement/zzfu;J)Ljava/lang/Boolean;
    .locals 8

    .line 454
    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzfj;->zzavo:Lcom/google/android/gms/internal/measurement/zzfl;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 455
    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzfj;->zzavo:Lcom/google/android/gms/internal/measurement/zzfl;

    invoke-direct {p0, p4, p5, v0}, Lcom/google/android/gms/measurement/internal/zzm;->zza(JLcom/google/android/gms/internal/measurement/zzfl;)Ljava/lang/Boolean;

    move-result-object p4

    if-nez p4, :cond_0

    return-object v2

    .line 458
    :cond_0
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    if-nez p4, :cond_1

    .line 459
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 460
    :cond_1
    new-instance p4, Ljava/util/HashSet;

    invoke-direct {p4}, Ljava/util/HashSet;-><init>()V

    .line 461
    iget-object p5, p1, Lcom/google/android/gms/internal/measurement/zzfj;->zzavm:[Lcom/google/android/gms/internal/measurement/zzfk;

    array-length v0, p5

    move v3, v1

    :goto_0
    if-ge v3, v0, :cond_3

    aget-object v4, p5, v3

    .line 462
    iget-object v5, v4, Lcom/google/android/gms/internal/measurement/zzfk;->zzavt:Ljava/lang/String;

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 463
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object p1

    .line 464
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjj()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object p1

    const-string p3, "null or empty param name in filter. event"

    .line 465
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object p4

    invoke-virtual {p4, p2}, Lcom/google/android/gms/measurement/internal/zzaq;->zzbt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 466
    invoke-virtual {p1, p3, p2}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v2

    .line 468
    :cond_2
    iget-object v4, v4, Lcom/google/android/gms/internal/measurement/zzfk;->zzavt:Ljava/lang/String;

    invoke-interface {p4, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 470
    :cond_3
    new-instance p5, Landroid/support/v4/util/ArrayMap;

    invoke-direct {p5}, Landroid/support/v4/util/ArrayMap;-><init>()V

    .line 471
    array-length v0, p3

    move v3, v1

    :goto_1
    if-ge v3, v0, :cond_8

    aget-object v4, p3, v3

    .line 472
    iget-object v5, v4, Lcom/google/android/gms/internal/measurement/zzfu;->name:Ljava/lang/String;

    invoke-interface {p4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 473
    iget-object v5, v4, Lcom/google/android/gms/internal/measurement/zzfu;->zzaxe:Ljava/lang/Long;

    if-eqz v5, :cond_4

    .line 474
    iget-object v5, v4, Lcom/google/android/gms/internal/measurement/zzfu;->name:Ljava/lang/String;

    iget-object v4, v4, Lcom/google/android/gms/internal/measurement/zzfu;->zzaxe:Ljava/lang/Long;

    invoke-interface {p5, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 475
    :cond_4
    iget-object v5, v4, Lcom/google/android/gms/internal/measurement/zzfu;->zzaun:Ljava/lang/Double;

    if-eqz v5, :cond_5

    .line 476
    iget-object v5, v4, Lcom/google/android/gms/internal/measurement/zzfu;->name:Ljava/lang/String;

    iget-object v4, v4, Lcom/google/android/gms/internal/measurement/zzfu;->zzaun:Ljava/lang/Double;

    invoke-interface {p5, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 477
    :cond_5
    iget-object v5, v4, Lcom/google/android/gms/internal/measurement/zzfu;->zzaml:Ljava/lang/String;

    if-eqz v5, :cond_6

    .line 478
    iget-object v5, v4, Lcom/google/android/gms/internal/measurement/zzfu;->name:Ljava/lang/String;

    iget-object v4, v4, Lcom/google/android/gms/internal/measurement/zzfu;->zzaml:Ljava/lang/String;

    invoke-interface {p5, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 479
    :cond_6
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object p1

    .line 480
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjj()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object p1

    const-string p3, "Unknown value for param. event, param"

    .line 481
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object p4

    invoke-virtual {p4, p2}, Lcom/google/android/gms/measurement/internal/zzaq;->zzbt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 482
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object p4

    iget-object p5, v4, Lcom/google/android/gms/internal/measurement/zzfu;->name:Ljava/lang/String;

    invoke-virtual {p4, p5}, Lcom/google/android/gms/measurement/internal/zzaq;->zzbu(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    .line 483
    invoke-virtual {p1, p3, p2, p4}, Lcom/google/android/gms/measurement/internal/zzau;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2

    :cond_7
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 486
    :cond_8
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzfj;->zzavm:[Lcom/google/android/gms/internal/measurement/zzfk;

    array-length p3, p1

    move p4, v1

    :goto_3
    const/4 v0, 0x1

    if-ge p4, p3, :cond_17

    aget-object v3, p1, p4

    .line 487
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v5, v3, Lcom/google/android/gms/internal/measurement/zzfk;->zzavs:Ljava/lang/Boolean;

    invoke-virtual {v4, v5}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v4

    .line 488
    iget-object v5, v3, Lcom/google/android/gms/internal/measurement/zzfk;->zzavt:Ljava/lang/String;

    .line 489
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_9

    .line 490
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object p1

    .line 491
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjj()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object p1

    const-string p3, "Event has empty param name. event"

    .line 492
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object p4

    invoke-virtual {p4, p2}, Lcom/google/android/gms/measurement/internal/zzaq;->zzbt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 493
    invoke-virtual {p1, p3, p2}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v2

    .line 495
    :cond_9
    invoke-interface {p5, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 496
    instance-of v7, v6, Ljava/lang/Long;

    if-eqz v7, :cond_c

    .line 497
    iget-object v7, v3, Lcom/google/android/gms/internal/measurement/zzfk;->zzavr:Lcom/google/android/gms/internal/measurement/zzfl;

    if-nez v7, :cond_a

    .line 498
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object p1

    .line 499
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjj()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object p1

    const-string p3, "No number filter for long param. event, param"

    .line 500
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object p4

    invoke-virtual {p4, p2}, Lcom/google/android/gms/measurement/internal/zzaq;->zzbt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 501
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object p4

    invoke-virtual {p4, v5}, Lcom/google/android/gms/measurement/internal/zzaq;->zzbu(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    .line 502
    invoke-virtual {p1, p3, p2, p4}, Lcom/google/android/gms/measurement/internal/zzau;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2

    .line 504
    :cond_a
    check-cast v6, Ljava/lang/Long;

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    iget-object v3, v3, Lcom/google/android/gms/internal/measurement/zzfk;->zzavr:Lcom/google/android/gms/internal/measurement/zzfl;

    invoke-direct {p0, v5, v6, v3}, Lcom/google/android/gms/measurement/internal/zzm;->zza(JLcom/google/android/gms/internal/measurement/zzfl;)Ljava/lang/Boolean;

    move-result-object v3

    if-nez v3, :cond_b

    return-object v2

    .line 507
    :cond_b
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    xor-int/2addr v0, v3

    xor-int/2addr v0, v4

    if-eqz v0, :cond_12

    .line 508
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 509
    :cond_c
    instance-of v7, v6, Ljava/lang/Double;

    if-eqz v7, :cond_f

    .line 510
    iget-object v7, v3, Lcom/google/android/gms/internal/measurement/zzfk;->zzavr:Lcom/google/android/gms/internal/measurement/zzfl;

    if-nez v7, :cond_d

    .line 511
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object p1

    .line 512
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjj()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object p1

    const-string p3, "No number filter for double param. event, param"

    .line 513
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object p4

    invoke-virtual {p4, p2}, Lcom/google/android/gms/measurement/internal/zzaq;->zzbt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 514
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object p4

    invoke-virtual {p4, v5}, Lcom/google/android/gms/measurement/internal/zzaq;->zzbu(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    .line 515
    invoke-virtual {p1, p3, p2, p4}, Lcom/google/android/gms/measurement/internal/zzau;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2

    .line 517
    :cond_d
    check-cast v6, Ljava/lang/Double;

    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    iget-object v3, v3, Lcom/google/android/gms/internal/measurement/zzfk;->zzavr:Lcom/google/android/gms/internal/measurement/zzfl;

    invoke-direct {p0, v5, v6, v3}, Lcom/google/android/gms/measurement/internal/zzm;->zza(DLcom/google/android/gms/internal/measurement/zzfl;)Ljava/lang/Boolean;

    move-result-object v3

    if-nez v3, :cond_e

    return-object v2

    .line 520
    :cond_e
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    xor-int/2addr v0, v3

    xor-int/2addr v0, v4

    if-eqz v0, :cond_12

    .line 521
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 522
    :cond_f
    instance-of v7, v6, Ljava/lang/String;

    if-eqz v7, :cond_15

    .line 523
    iget-object v7, v3, Lcom/google/android/gms/internal/measurement/zzfk;->zzavq:Lcom/google/android/gms/internal/measurement/zzfn;

    if-eqz v7, :cond_10

    .line 524
    check-cast v6, Ljava/lang/String;

    iget-object v3, v3, Lcom/google/android/gms/internal/measurement/zzfk;->zzavq:Lcom/google/android/gms/internal/measurement/zzfn;

    invoke-direct {p0, v6, v3}, Lcom/google/android/gms/measurement/internal/zzm;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzfn;)Ljava/lang/Boolean;

    move-result-object v3

    goto :goto_4

    .line 525
    :cond_10
    iget-object v7, v3, Lcom/google/android/gms/internal/measurement/zzfk;->zzavr:Lcom/google/android/gms/internal/measurement/zzfl;

    if-eqz v7, :cond_14

    .line 526
    check-cast v6, Ljava/lang/String;

    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/zzfu;->zzcs(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_13

    .line 527
    iget-object v3, v3, Lcom/google/android/gms/internal/measurement/zzfk;->zzavr:Lcom/google/android/gms/internal/measurement/zzfl;

    invoke-direct {p0, v6, v3}, Lcom/google/android/gms/measurement/internal/zzm;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzfl;)Ljava/lang/Boolean;

    move-result-object v3

    :goto_4
    if-nez v3, :cond_11

    return-object v2

    .line 542
    :cond_11
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    xor-int/2addr v0, v3

    xor-int/2addr v0, v4

    if-eqz v0, :cond_12

    .line 543
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_12
    add-int/lit8 p4, p4, 0x1

    goto/16 :goto_3

    .line 528
    :cond_13
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object p1

    .line 529
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjj()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object p1

    const-string p3, "Invalid param value for number filter. event, param"

    .line 530
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object p4

    invoke-virtual {p4, p2}, Lcom/google/android/gms/measurement/internal/zzaq;->zzbt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 531
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object p4

    invoke-virtual {p4, v5}, Lcom/google/android/gms/measurement/internal/zzaq;->zzbu(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    .line 532
    invoke-virtual {p1, p3, p2, p4}, Lcom/google/android/gms/measurement/internal/zzau;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2

    .line 534
    :cond_14
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object p1

    .line 535
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjj()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object p1

    const-string p3, "No filter for String param. event, param"

    .line 536
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object p4

    invoke-virtual {p4, p2}, Lcom/google/android/gms/measurement/internal/zzaq;->zzbt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 537
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object p4

    invoke-virtual {p4, v5}, Lcom/google/android/gms/measurement/internal/zzaq;->zzbu(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    .line 538
    invoke-virtual {p1, p3, p2, p4}, Lcom/google/android/gms/measurement/internal/zzau;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2

    :cond_15
    if-nez v6, :cond_16

    .line 545
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object p1

    .line 546
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjo()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object p1

    const-string p3, "Missing param for filter. event, param"

    .line 547
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object p4

    invoke-virtual {p4, p2}, Lcom/google/android/gms/measurement/internal/zzaq;->zzbt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 548
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object p4

    invoke-virtual {p4, v5}, Lcom/google/android/gms/measurement/internal/zzaq;->zzbu(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    .line 549
    invoke-virtual {p1, p3, p2, p4}, Lcom/google/android/gms/measurement/internal/zzau;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 550
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 551
    :cond_16
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object p1

    .line 552
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjj()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object p1

    const-string p3, "Unknown param type. event, param"

    .line 553
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object p4

    invoke-virtual {p4, p2}, Lcom/google/android/gms/measurement/internal/zzaq;->zzbt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 554
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object p4

    invoke-virtual {p4, v5}, Lcom/google/android/gms/measurement/internal/zzaq;->zzbu(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    .line 555
    invoke-virtual {p1, p3, p2, p4}, Lcom/google/android/gms/measurement/internal/zzau;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2

    .line 558
    :cond_17
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private final zza(Lcom/google/android/gms/internal/measurement/zzfm;Lcom/google/android/gms/internal/measurement/zzfz;)Ljava/lang/Boolean;
    .locals 4

    .line 559
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzfm;->zzawb:Lcom/google/android/gms/internal/measurement/zzfk;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 561
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object p1

    .line 562
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjj()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object p1

    const-string v1, "Missing property filter. property"

    .line 563
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object v2

    iget-object p2, p2, Lcom/google/android/gms/internal/measurement/zzfz;->name:Ljava/lang/String;

    invoke-virtual {v2, p2}, Lcom/google/android/gms/measurement/internal/zzaq;->zzbv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 564
    invoke-virtual {p1, v1, p2}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0

    .line 566
    :cond_0
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v2, p1, Lcom/google/android/gms/internal/measurement/zzfk;->zzavs:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    .line 567
    iget-object v2, p2, Lcom/google/android/gms/internal/measurement/zzfz;->zzaxe:Ljava/lang/Long;

    if-eqz v2, :cond_2

    .line 568
    iget-object v2, p1, Lcom/google/android/gms/internal/measurement/zzfk;->zzavr:Lcom/google/android/gms/internal/measurement/zzfl;

    if-nez v2, :cond_1

    .line 569
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object p1

    .line 570
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjj()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object p1

    const-string v1, "No number filter for long property. property"

    .line 571
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object v2

    iget-object p2, p2, Lcom/google/android/gms/internal/measurement/zzfz;->name:Ljava/lang/String;

    invoke-virtual {v2, p2}, Lcom/google/android/gms/measurement/internal/zzaq;->zzbv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 572
    invoke-virtual {p1, v1, p2}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0

    .line 574
    :cond_1
    iget-object p2, p2, Lcom/google/android/gms/internal/measurement/zzfz;->zzaxe:Ljava/lang/Long;

    .line 575
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzfk;->zzavr:Lcom/google/android/gms/internal/measurement/zzfl;

    invoke-direct {p0, v2, v3, p1}, Lcom/google/android/gms/measurement/internal/zzm;->zza(JLcom/google/android/gms/internal/measurement/zzfl;)Ljava/lang/Boolean;

    move-result-object p1

    .line 576
    invoke-static {p1, v1}, Lcom/google/android/gms/measurement/internal/zzm;->zza(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 577
    :cond_2
    iget-object v2, p2, Lcom/google/android/gms/internal/measurement/zzfz;->zzaun:Ljava/lang/Double;

    if-eqz v2, :cond_4

    .line 578
    iget-object v2, p1, Lcom/google/android/gms/internal/measurement/zzfk;->zzavr:Lcom/google/android/gms/internal/measurement/zzfl;

    if-nez v2, :cond_3

    .line 579
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object p1

    .line 580
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjj()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object p1

    const-string v1, "No number filter for double property. property"

    .line 581
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object v2

    iget-object p2, p2, Lcom/google/android/gms/internal/measurement/zzfz;->name:Ljava/lang/String;

    invoke-virtual {v2, p2}, Lcom/google/android/gms/measurement/internal/zzaq;->zzbv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 582
    invoke-virtual {p1, v1, p2}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0

    .line 584
    :cond_3
    iget-object p2, p2, Lcom/google/android/gms/internal/measurement/zzfz;->zzaun:Ljava/lang/Double;

    .line 585
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzfk;->zzavr:Lcom/google/android/gms/internal/measurement/zzfl;

    invoke-direct {p0, v2, v3, p1}, Lcom/google/android/gms/measurement/internal/zzm;->zza(DLcom/google/android/gms/internal/measurement/zzfl;)Ljava/lang/Boolean;

    move-result-object p1

    .line 586
    invoke-static {p1, v1}, Lcom/google/android/gms/measurement/internal/zzm;->zza(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 587
    :cond_4
    iget-object v2, p2, Lcom/google/android/gms/internal/measurement/zzfz;->zzaml:Ljava/lang/String;

    if-eqz v2, :cond_8

    .line 588
    iget-object v2, p1, Lcom/google/android/gms/internal/measurement/zzfk;->zzavq:Lcom/google/android/gms/internal/measurement/zzfn;

    if-nez v2, :cond_7

    .line 589
    iget-object v2, p1, Lcom/google/android/gms/internal/measurement/zzfk;->zzavr:Lcom/google/android/gms/internal/measurement/zzfl;

    if-nez v2, :cond_5

    .line 590
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object p1

    .line 591
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjj()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object p1

    const-string v1, "No string or number filter defined. property"

    .line 592
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object v2

    iget-object p2, p2, Lcom/google/android/gms/internal/measurement/zzfz;->name:Ljava/lang/String;

    invoke-virtual {v2, p2}, Lcom/google/android/gms/measurement/internal/zzaq;->zzbv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 593
    invoke-virtual {p1, v1, p2}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 594
    :cond_5
    iget-object v2, p2, Lcom/google/android/gms/internal/measurement/zzfz;->zzaml:Ljava/lang/String;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/zzfu;->zzcs(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 595
    iget-object p2, p2, Lcom/google/android/gms/internal/measurement/zzfz;->zzaml:Ljava/lang/String;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzfk;->zzavr:Lcom/google/android/gms/internal/measurement/zzfl;

    .line 596
    invoke-direct {p0, p2, p1}, Lcom/google/android/gms/measurement/internal/zzm;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzfl;)Ljava/lang/Boolean;

    move-result-object p1

    .line 597
    invoke-static {p1, v1}, Lcom/google/android/gms/measurement/internal/zzm;->zza(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 598
    :cond_6
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object p1

    .line 599
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjj()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object p1

    const-string v1, "Invalid user property value for Numeric number filter. property, value"

    .line 600
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object v2

    iget-object v3, p2, Lcom/google/android/gms/internal/measurement/zzfz;->name:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/zzaq;->zzbv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object p2, p2, Lcom/google/android/gms/internal/measurement/zzfz;->zzaml:Ljava/lang/String;

    .line 601
    invoke-virtual {p1, v1, v2, p2}, Lcom/google/android/gms/measurement/internal/zzau;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    return-object v0

    .line 603
    :cond_7
    iget-object p2, p2, Lcom/google/android/gms/internal/measurement/zzfz;->zzaml:Ljava/lang/String;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzfk;->zzavq:Lcom/google/android/gms/internal/measurement/zzfn;

    .line 604
    invoke-direct {p0, p2, p1}, Lcom/google/android/gms/measurement/internal/zzm;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzfn;)Ljava/lang/Boolean;

    move-result-object p1

    .line 605
    invoke-static {p1, v1}, Lcom/google/android/gms/measurement/internal/zzm;->zza(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 606
    :cond_8
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object p1

    .line 607
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjj()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object p1

    const-string v1, "User property has no value, property"

    .line 608
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object v2

    iget-object p2, p2, Lcom/google/android/gms/internal/measurement/zzfz;->name:Ljava/lang/String;

    invoke-virtual {v2, p2}, Lcom/google/android/gms/measurement/internal/zzaq;->zzbv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 609
    invoke-virtual {p1, v1, p2}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static zza(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;
    .locals 0
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 613
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    xor-int/2addr p0, p1

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private final zza(Ljava/lang/String;IZLjava/lang/String;Ljava/util/List;Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "IZ",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    const/4 v1, 0x6

    if-ne p2, v1, :cond_2

    if-eqz p5, :cond_1

    .line 647
    invoke-interface {p5}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_3

    :cond_1
    return-object v0

    :cond_2
    if-nez p4, :cond_3

    return-object v0

    :cond_3
    if-nez p3, :cond_5

    const/4 v1, 0x1

    if-ne p2, v1, :cond_4

    goto :goto_0

    .line 651
    :cond_4
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p1, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    :cond_5
    :goto_0
    packed-switch p2, :pswitch_data_0

    return-object v0

    .line 665
    :pswitch_0
    invoke-interface {p5, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 664
    :pswitch_1
    invoke-virtual {p1, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 663
    :pswitch_2
    invoke-virtual {p1, p4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 662
    :pswitch_3
    invoke-virtual {p1, p4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 661
    :pswitch_4
    invoke-virtual {p1, p4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_5
    if-eqz p3, :cond_6

    const/4 p2, 0x0

    goto :goto_1

    :cond_6
    const/16 p2, 0x42

    .line 654
    :goto_1
    :try_start_0
    invoke-static {p6, p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object p2

    .line 655
    invoke-virtual {p2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_0
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 657
    :catch_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object p1

    .line 658
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjj()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object p1

    const-string p2, "Invalid regular expression in REGEXP audience filter. expression"

    .line 659
    invoke-virtual {p1, p2, p6}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final zza(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzfl;)Ljava/lang/Boolean;
    .locals 4

    .line 673
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/zzfu;->zzcs(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 675
    :cond_0
    :try_start_0
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, p1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    const-wide/16 v2, 0x0

    invoke-static {v0, p2, v2, v3}, Lcom/google/android/gms/measurement/internal/zzm;->zza(Ljava/math/BigDecimal;Lcom/google/android/gms/internal/measurement/zzfl;D)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    return-object v1
.end method

.method private final zza(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzfn;)Ljava/lang/Boolean;
    .locals 10
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    .line 614
    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 617
    :cond_0
    iget-object v1, p2, Lcom/google/android/gms/internal/measurement/zzfn;->zzawc:Ljava/lang/Integer;

    if-eqz v1, :cond_c

    iget-object v1, p2, Lcom/google/android/gms/internal/measurement/zzfn;->zzawc:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-nez v1, :cond_1

    goto/16 :goto_6

    .line 619
    :cond_1
    iget-object v1, p2, Lcom/google/android/gms/internal/measurement/zzfn;->zzawc:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x6

    if-ne v1, v2, :cond_3

    .line 620
    iget-object v1, p2, Lcom/google/android/gms/internal/measurement/zzfn;->zzawf:[Ljava/lang/String;

    if-eqz v1, :cond_2

    iget-object v1, p2, Lcom/google/android/gms/internal/measurement/zzfn;->zzawf:[Ljava/lang/String;

    array-length v1, v1

    if-nez v1, :cond_4

    :cond_2
    return-object v0

    .line 622
    :cond_3
    iget-object v1, p2, Lcom/google/android/gms/internal/measurement/zzfn;->zzawd:Ljava/lang/String;

    if-nez v1, :cond_4

    return-object v0

    .line 624
    :cond_4
    iget-object v1, p2, Lcom/google/android/gms/internal/measurement/zzfn;->zzawc:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 625
    iget-object v1, p2, Lcom/google/android/gms/internal/measurement/zzfn;->zzawe:Ljava/lang/Boolean;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_5

    iget-object v1, p2, Lcom/google/android/gms/internal/measurement/zzfn;->zzawe:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_5

    move v6, v4

    goto :goto_0

    :cond_5
    move v6, v3

    :goto_0
    if-nez v6, :cond_7

    if-eq v5, v4, :cond_7

    if-ne v5, v2, :cond_6

    goto :goto_1

    .line 628
    :cond_6
    iget-object v1, p2, Lcom/google/android/gms/internal/measurement/zzfn;->zzawd:Ljava/lang/String;

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    move-object v7, v1

    goto :goto_2

    .line 627
    :cond_7
    :goto_1
    iget-object v1, p2, Lcom/google/android/gms/internal/measurement/zzfn;->zzawd:Ljava/lang/String;

    move-object v7, v1

    .line 629
    :goto_2
    iget-object v1, p2, Lcom/google/android/gms/internal/measurement/zzfn;->zzawf:[Ljava/lang/String;

    if-nez v1, :cond_8

    move-object v8, v0

    goto :goto_4

    .line 631
    :cond_8
    iget-object p2, p2, Lcom/google/android/gms/internal/measurement/zzfn;->zzawf:[Ljava/lang/String;

    if-eqz v6, :cond_9

    .line 633
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    move-object v8, p2

    goto :goto_4

    .line 634
    :cond_9
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 635
    array-length v2, p2

    :goto_3
    if-ge v3, v2, :cond_a

    aget-object v8, p2, v3

    .line 636
    sget-object v9, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v8, v9}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v1, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_a
    move-object v8, v1

    :goto_4
    if-ne v5, v4, :cond_b

    move-object v9, v7

    goto :goto_5

    :cond_b
    move-object v9, v0

    :goto_5
    move-object v3, p0

    move-object v4, p1

    .line 643
    invoke-direct/range {v3 .. v9}, Lcom/google/android/gms/measurement/internal/zzm;->zza(Ljava/lang/String;IZLjava/lang/String;Ljava/util/List;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_c
    :goto_6
    return-object v0
.end method

.method private static zza(Ljava/math/BigDecimal;Lcom/google/android/gms/internal/measurement/zzfl;D)Ljava/lang/Boolean;
    .locals 7
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    .line 678
    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 679
    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzfl;->zzavu:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-eqz v0, :cond_11

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzfl;->zzavu:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    .line 681
    :cond_0
    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzfl;->zzavu:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v2, 0x4

    if-ne v0, v2, :cond_2

    .line 682
    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzfl;->zzavx:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzfl;->zzavy:Ljava/lang/String;

    if-nez v0, :cond_3

    :cond_1
    return-object v1

    .line 684
    :cond_2
    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzfl;->zzavw:Ljava/lang/String;

    if-nez v0, :cond_3

    return-object v1

    .line 686
    :cond_3
    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzfl;->zzavu:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 690
    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzfl;->zzavu:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne v3, v2, :cond_6

    .line 691
    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzfl;->zzavx:Ljava/lang/String;

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/zzfu;->zzcs(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzfl;->zzavy:Ljava/lang/String;

    .line 692
    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/zzfu;->zzcs(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_0

    .line 694
    :cond_4
    :try_start_0
    new-instance v3, Ljava/math/BigDecimal;

    iget-object v4, p1, Lcom/google/android/gms/internal/measurement/zzfl;->zzavx:Ljava/lang/String;

    invoke-direct {v3, v4}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 695
    new-instance v4, Ljava/math/BigDecimal;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzfl;->zzavy:Ljava/lang/String;

    invoke-direct {v4, p1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-object p1, v3

    move-object v3, v1

    goto :goto_1

    :catch_0
    return-object v1

    :cond_5
    :goto_0
    return-object v1

    .line 699
    :cond_6
    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzfl;->zzavw:Ljava/lang/String;

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/zzfu;->zzcs(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_7

    return-object v1

    .line 701
    :cond_7
    :try_start_1
    new-instance v3, Ljava/math/BigDecimal;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzfl;->zzavw:Ljava/lang/String;

    invoke-direct {v3, p1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    move-object p1, v1

    move-object v4, p1

    :goto_1
    if-ne v0, v2, :cond_8

    if-nez p1, :cond_9

    return-object v1

    :cond_8
    if-eqz v3, :cond_10

    :cond_9
    const/4 v2, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_2

    .line 722
    :pswitch_0
    invoke-virtual {p0, p1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result p1

    if-eq p1, v2, :cond_a

    invoke-virtual {p0, v4}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result p0

    if-eq p0, v6, :cond_a

    move v5, v6

    :cond_a
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :pswitch_1
    const-wide/16 v0, 0x0

    cmpl-double p1, p2, v0

    if-eqz p1, :cond_c

    .line 715
    new-instance p1, Ljava/math/BigDecimal;

    invoke-direct {p1, p2, p3}, Ljava/math/BigDecimal;-><init>(D)V

    new-instance v0, Ljava/math/BigDecimal;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(I)V

    .line 716
    invoke-virtual {p1, v0}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object p1

    .line 717
    invoke-virtual {p0, p1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result p1

    if-ne p1, v6, :cond_b

    new-instance p1, Ljava/math/BigDecimal;

    invoke-direct {p1, p2, p3}, Ljava/math/BigDecimal;-><init>(D)V

    new-instance p2, Ljava/math/BigDecimal;

    invoke-direct {p2, v1}, Ljava/math/BigDecimal;-><init>(I)V

    .line 718
    invoke-virtual {p1, p2}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object p1

    .line 719
    invoke-virtual {p0, p1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result p0

    if-ne p0, v2, :cond_b

    move v5, v6

    .line 720
    :cond_b
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    .line 721
    :cond_c
    invoke-virtual {p0, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result p0

    if-nez p0, :cond_d

    move v5, v6

    :cond_d
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    .line 713
    :pswitch_2
    invoke-virtual {p0, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result p0

    if-ne p0, v6, :cond_e

    move v5, v6

    :cond_e
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    .line 712
    :pswitch_3
    invoke-virtual {p0, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result p0

    if-ne p0, v2, :cond_f

    move v5, v6

    :cond_f
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_10
    :goto_2
    return-object v1

    :catch_1
    return-object v1

    :cond_11
    :goto_3
    return-object v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static zza(Ljava/util/Map;IJ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Long;",
            ">;IJ)V"
        }
    .end annotation

    .line 737
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    const-wide/16 v1, 0x3e8

    .line 738
    div-long/2addr p2, v1

    if-eqz v0, :cond_0

    .line 740
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    cmp-long v0, p2, v0

    if-lez v0, :cond_1

    .line 741
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method private static zzb(Ljava/util/Map;IJ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;IJ)V"
        }
    .end annotation

    .line 743
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    .line 745
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 746
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const-wide/16 p0, 0x3e8

    .line 747
    div-long/2addr p2, p0

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private static zzb(Ljava/util/Map;)[Lcom/google/android/gms/internal/measurement/zzfs;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Long;",
            ">;)[",
            "Lcom/google/android/gms/internal/measurement/zzfs;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    .line 729
    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v1

    new-array v1, v1, [Lcom/google/android/gms/internal/measurement/zzfs;

    .line 730
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    .line 731
    new-instance v4, Lcom/google/android/gms/internal/measurement/zzfs;

    invoke-direct {v4}, Lcom/google/android/gms/internal/measurement/zzfs;-><init>()V

    .line 732
    iput-object v3, v4, Lcom/google/android/gms/internal/measurement/zzfs;->zzawx:Ljava/lang/Integer;

    .line 733
    invoke-interface {p0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    iput-object v3, v4, Lcom/google/android/gms/internal/measurement/zzfs;->zzawy:Ljava/lang/Long;

    add-int/lit8 v3, v0, 0x1

    .line 734
    aput-object v4, v1, v0

    move v0, v3

    goto :goto_0

    :cond_1
    return-object v1
.end method


# virtual methods
.method final zza(Ljava/lang/String;[Lcom/google/android/gms/internal/measurement/zzft;[Lcom/google/android/gms/internal/measurement/zzfz;)[Lcom/google/android/gms/internal/measurement/zzfr;
    .locals 65
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    move-object/from16 v7, p0

    move-object/from16 v15, p1

    move-object/from16 v13, p2

    move-object/from16 v14, p3

    .line 4
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    new-instance v11, Ljava/util/HashSet;

    invoke-direct {v11}, Ljava/util/HashSet;-><init>()V

    .line 6
    new-instance v12, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v12}, Landroid/support/v4/util/ArrayMap;-><init>()V

    .line 7
    new-instance v10, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v10}, Landroid/support/v4/util/ArrayMap;-><init>()V

    .line 8
    new-instance v9, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v9}, Landroid/support/v4/util/ArrayMap;-><init>()V

    .line 9
    new-instance v8, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v8}, Landroid/support/v4/util/ArrayMap;-><init>()V

    .line 10
    new-instance v6, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v6}, Landroid/support/v4/util/ArrayMap;-><init>()V

    .line 11
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgv()Lcom/google/android/gms/measurement/internal/zzq;

    move-result-object v0

    invoke-virtual {v0, v15}, Lcom/google/android/gms/measurement/internal/zzq;->zzbb(Ljava/lang/String;)Z

    move-result v23

    .line 13
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjt()Lcom/google/android/gms/measurement/internal/zzt;

    move-result-object v0

    invoke-virtual {v0, v15}, Lcom/google/android/gms/measurement/internal/zzt;->zzbp(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_c

    .line 15
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 16
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/zzfx;

    .line 17
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v10, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/BitSet;

    .line 18
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v9, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/BitSet;

    if-eqz v23, :cond_4

    move-object/from16 v19, v0

    .line 23
    new-instance v0, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v0}, Landroid/support/v4/util/ArrayMap;-><init>()V

    if-eqz v4, :cond_2

    move-object/from16 v20, v1

    .line 24
    iget-object v1, v4, Lcom/google/android/gms/internal/measurement/zzfx;->zzayp:[Lcom/google/android/gms/internal/measurement/zzfs;

    if-nez v1, :cond_0

    goto :goto_2

    .line 26
    :cond_0
    iget-object v1, v4, Lcom/google/android/gms/internal/measurement/zzfx;->zzayp:[Lcom/google/android/gms/internal/measurement/zzfs;

    move-object/from16 v21, v3

    array-length v3, v1

    move-object/from16 v22, v11

    const/4 v11, 0x0

    :goto_1
    if-ge v11, v3, :cond_3

    move/from16 v24, v3

    aget-object v3, v1, v11

    move-object/from16 v25, v1

    .line 27
    iget-object v1, v3, Lcom/google/android/gms/internal/measurement/zzfs;->zzawx:Ljava/lang/Integer;

    if-eqz v1, :cond_1

    .line 28
    iget-object v1, v3, Lcom/google/android/gms/internal/measurement/zzfs;->zzawx:Ljava/lang/Integer;

    iget-object v3, v3, Lcom/google/android/gms/internal/measurement/zzfs;->zzawy:Ljava/lang/Long;

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v11, v11, 0x1

    move/from16 v3, v24

    move-object/from16 v1, v25

    goto :goto_1

    :cond_2
    move-object/from16 v20, v1

    :goto_2
    move-object/from16 v21, v3

    move-object/from16 v22, v11

    .line 33
    :cond_3
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 34
    invoke-interface {v8, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_4
    move-object/from16 v19, v0

    move-object/from16 v20, v1

    move-object/from16 v21, v3

    move-object/from16 v22, v11

    const/4 v0, 0x0

    :goto_3
    if-nez v5, :cond_5

    .line 36
    new-instance v5, Ljava/util/BitSet;

    invoke-direct {v5}, Ljava/util/BitSet;-><init>()V

    .line 37
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v10, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    new-instance v3, Ljava/util/BitSet;

    invoke-direct {v3}, Ljava/util/BitSet;-><init>()V

    .line 39
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_5
    move-object/from16 v3, v21

    :goto_4
    const/4 v1, 0x0

    .line 40
    :goto_5
    iget-object v11, v4, Lcom/google/android/gms/internal/measurement/zzfx;->zzayn:[J

    array-length v11, v11

    shl-int/lit8 v11, v11, 0x6

    if-ge v1, v11, :cond_9

    .line 42
    iget-object v11, v4, Lcom/google/android/gms/internal/measurement/zzfx;->zzayn:[J

    invoke-static {v11, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza([JI)Z

    move-result v11

    if-eqz v11, :cond_6

    .line 43
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v11

    .line 44
    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/zzas;->zzjo()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v11

    move-object/from16 v21, v8

    const-string v8, "Filter already evaluated. audience ID, filter ID"

    move-object/from16 v24, v9

    .line 45
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    move-object/from16 v25, v10

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v11, v8, v9, v10}, Lcom/google/android/gms/measurement/internal/zzau;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 46
    invoke-virtual {v3, v1}, Ljava/util/BitSet;->set(I)V

    .line 47
    iget-object v8, v4, Lcom/google/android/gms/internal/measurement/zzfx;->zzayo:[J

    invoke-static {v8, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza([JI)Z

    move-result v8

    if-eqz v8, :cond_7

    .line 48
    invoke-virtual {v5, v1}, Ljava/util/BitSet;->set(I)V

    const/4 v8, 0x1

    goto :goto_6

    :cond_6
    move-object/from16 v21, v8

    move-object/from16 v24, v9

    move-object/from16 v25, v10

    :cond_7
    const/4 v8, 0x0

    :goto_6
    if-eqz v0, :cond_8

    if-nez v8, :cond_8

    .line 51
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v0, v8}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    add-int/lit8 v1, v1, 0x1

    move-object/from16 v8, v21

    move-object/from16 v9, v24

    move-object/from16 v10, v25

    goto :goto_5

    :cond_9
    move-object/from16 v21, v8

    move-object/from16 v24, v9

    move-object/from16 v25, v10

    .line 53
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzfr;

    invoke-direct {v1}, Lcom/google/android/gms/internal/measurement/zzfr;-><init>()V

    .line 54
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v12, v8, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v8, 0x0

    .line 55
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    iput-object v9, v1, Lcom/google/android/gms/internal/measurement/zzfr;->zzawv:Ljava/lang/Boolean;

    .line 56
    iput-object v4, v1, Lcom/google/android/gms/internal/measurement/zzfr;->zzawu:Lcom/google/android/gms/internal/measurement/zzfx;

    .line 57
    new-instance v4, Lcom/google/android/gms/internal/measurement/zzfx;

    invoke-direct {v4}, Lcom/google/android/gms/internal/measurement/zzfx;-><init>()V

    iput-object v4, v1, Lcom/google/android/gms/internal/measurement/zzfr;->zzawt:Lcom/google/android/gms/internal/measurement/zzfx;

    .line 58
    iget-object v4, v1, Lcom/google/android/gms/internal/measurement/zzfr;->zzawt:Lcom/google/android/gms/internal/measurement/zzfx;

    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/util/BitSet;)[J

    move-result-object v5

    iput-object v5, v4, Lcom/google/android/gms/internal/measurement/zzfx;->zzayo:[J

    .line 59
    iget-object v4, v1, Lcom/google/android/gms/internal/measurement/zzfr;->zzawt:Lcom/google/android/gms/internal/measurement/zzfx;

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/util/BitSet;)[J

    move-result-object v3

    iput-object v3, v4, Lcom/google/android/gms/internal/measurement/zzfx;->zzayn:[J

    if-eqz v23, :cond_a

    .line 61
    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/zzfr;->zzawt:Lcom/google/android/gms/internal/measurement/zzfx;

    .line 62
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzm;->zzb(Ljava/util/Map;)[Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v0

    iput-object v0, v1, Lcom/google/android/gms/internal/measurement/zzfx;->zzayp:[Lcom/google/android/gms/internal/measurement/zzfs;

    .line 63
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v1}, Landroid/support/v4/util/ArrayMap;-><init>()V

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    move-object/from16 v0, v19

    move-object/from16 v1, v20

    move-object/from16 v8, v21

    move-object/from16 v11, v22

    move-object/from16 v9, v24

    move-object/from16 v10, v25

    goto/16 :goto_0

    :cond_b
    move-object/from16 v21, v8

    move-object/from16 v24, v9

    move-object/from16 v25, v10

    move-object/from16 v22, v11

    goto :goto_7

    :cond_c
    move-object/from16 v21, v8

    move-object/from16 v24, v9

    move-object/from16 v25, v10

    move-object/from16 v22, v11

    :goto_7
    if-eqz v13, :cond_3b

    .line 69
    new-instance v9, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v9}, Landroid/support/v4/util/ArrayMap;-><init>()V

    .line 70
    array-length v8, v13

    const-wide/16 v26, 0x0

    move-wide/from16 v2, v26

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v4, 0x0

    :goto_8
    if-ge v4, v8, :cond_3a

    aget-object v5, v13, v4

    .line 71
    iget-object v10, v5, Lcom/google/android/gms/internal/measurement/zzft;->name:Ljava/lang/String;

    .line 72
    iget-object v11, v5, Lcom/google/android/gms/internal/measurement/zzft;->zzaxa:[Lcom/google/android/gms/internal/measurement/zzfu;

    move-wide/from16 v28, v2

    .line 73
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgv()Lcom/google/android/gms/measurement/internal/zzq;

    move-result-object v2

    .line 74
    sget-object v3, Lcom/google/android/gms/measurement/internal/zzai;->zzaki:Lcom/google/android/gms/measurement/internal/zzai$zza;

    invoke-virtual {v2, v15, v3}, Lcom/google/android/gms/measurement/internal/zzq;->zzd(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzai$zza;)Z

    move-result v2

    const-wide/16 v30, 0x1

    if-eqz v2, :cond_1e

    .line 76
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjr()Lcom/google/android/gms/measurement/internal/zzfu;

    const-string v2, "_eid"

    invoke-static {v5, v2}, Lcom/google/android/gms/measurement/internal/zzfu;->zzb(Lcom/google/android/gms/internal/measurement/zzft;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/Long;

    if-eqz v3, :cond_d

    const/4 v2, 0x1

    goto :goto_9

    :cond_d
    const/4 v2, 0x0

    :goto_9
    if-eqz v2, :cond_e

    move/from16 v32, v4

    const-string v4, "_ep"

    .line 79
    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_f

    const/4 v4, 0x1

    goto :goto_a

    :cond_e
    move/from16 v32, v4

    :cond_f
    const/4 v4, 0x0

    :goto_a
    if-eqz v4, :cond_1b

    .line 82
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjr()Lcom/google/android/gms/measurement/internal/zzfu;

    const-string v2, "_en"

    invoke-static {v5, v2}, Lcom/google/android/gms/measurement/internal/zzfu;->zzb(Lcom/google/android/gms/internal/measurement/zzft;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Ljava/lang/String;

    .line 83
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_10

    .line 84
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzas;->zzjg()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v2

    const-string v4, "Extra parameter without an event name. eventId"

    invoke-virtual {v2, v4, v3}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v37, v6

    const/16 v34, 0x1

    goto/16 :goto_14

    :cond_10
    if-eqz v0, :cond_12

    if-eqz v1, :cond_12

    .line 86
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v33

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v35

    cmp-long v2, v33, v35

    if-eqz v2, :cond_11

    goto :goto_b

    :cond_11
    move-object v4, v0

    move-object/from16 v33, v1

    goto :goto_c

    .line 88
    :cond_12
    :goto_b
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjt()Lcom/google/android/gms/measurement/internal/zzt;

    move-result-object v2

    invoke-virtual {v2, v15, v3}, Lcom/google/android/gms/measurement/internal/zzt;->zza(Ljava/lang/String;Ljava/lang/Long;)Landroid/util/Pair;

    move-result-object v2

    if-eqz v2, :cond_1a

    .line 89
    iget-object v4, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    if-nez v4, :cond_13

    goto/16 :goto_13

    .line 94
    :cond_13
    iget-object v0, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzft;

    .line 95
    iget-object v1, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    .line 97
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjr()Lcom/google/android/gms/measurement/internal/zzfu;

    const-string v4, "_eid"

    invoke-static {v0, v4}, Lcom/google/android/gms/measurement/internal/zzfu;->zzb(Lcom/google/android/gms/internal/measurement/zzft;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    move-wide/from16 v28, v1

    move-object/from16 v33, v4

    move-object v4, v0

    :goto_c
    sub-long v28, v28, v30

    cmp-long v0, v28, v26

    if-gtz v0, :cond_14

    .line 100
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjt()Lcom/google/android/gms/measurement/internal/zzt;

    move-result-object v1

    .line 101
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 102
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzas;->zzjo()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v0

    const-string v2, "Clearing complex main event info. appId"

    invoke-virtual {v0, v2, v15}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    .line 103
    :try_start_0
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzt;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v2, "delete from main_event_params where app_id=?"
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_2

    move-object/from16 v17, v4

    const/4 v3, 0x1

    .line 104
    :try_start_1
    new-array v4, v3, [Ljava/lang/String;
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1

    const/16 v18, 0x0

    :try_start_2
    aput-object v15, v4, v18

    invoke-virtual {v0, v2, v4}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0

    move/from16 v34, v3

    move-object v13, v5

    move-object/from16 v37, v6

    move-object/from16 v1, v17

    goto :goto_f

    :catch_0
    move-exception v0

    goto :goto_e

    :catch_1
    move-exception v0

    goto :goto_d

    :catch_2
    move-exception v0

    move-object/from16 v17, v4

    const/4 v3, 0x1

    :goto_d
    const/16 v18, 0x0

    .line 107
    :goto_e
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjg()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v1

    const-string v2, "Error clearing complex main event"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    move/from16 v34, v3

    move-object v13, v5

    move-object/from16 v37, v6

    move-object/from16 v1, v17

    goto :goto_f

    :cond_14
    move-object/from16 v17, v4

    const/4 v4, 0x1

    const/16 v18, 0x0

    .line 109
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjt()Lcom/google/android/gms/measurement/internal/zzt;

    move-result-object v1

    move-object/from16 v2, p1

    move/from16 v34, v4

    move-object v13, v5

    move-wide/from16 v4, v28

    move-object/from16 v37, v6

    move-object/from16 v6, v17

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/measurement/internal/zzt;->zza(Ljava/lang/String;Ljava/lang/Long;JLcom/google/android/gms/internal/measurement/zzft;)Z

    move-object/from16 v1, v17

    .line 110
    :goto_f
    iget-object v0, v1, Lcom/google/android/gms/internal/measurement/zzft;->zzaxa:[Lcom/google/android/gms/internal/measurement/zzfu;

    array-length v0, v0

    array-length v2, v11

    add-int/2addr v0, v2

    new-array v0, v0, [Lcom/google/android/gms/internal/measurement/zzfu;

    .line 112
    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/zzft;->zzaxa:[Lcom/google/android/gms/internal/measurement/zzfu;

    array-length v3, v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_10
    if-ge v4, v3, :cond_16

    aget-object v6, v2, v4

    .line 114
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjr()Lcom/google/android/gms/measurement/internal/zzfu;

    move-object/from16 v17, v1

    iget-object v1, v6, Lcom/google/android/gms/internal/measurement/zzfu;->name:Ljava/lang/String;

    invoke-static {v13, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Lcom/google/android/gms/internal/measurement/zzft;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfu;

    move-result-object v1

    if-nez v1, :cond_15

    add-int/lit8 v1, v5, 0x1

    .line 116
    aput-object v6, v0, v5

    move v5, v1

    :cond_15
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v1, v17

    goto :goto_10

    :cond_16
    move-object/from16 v17, v1

    if-lez v5, :cond_19

    .line 119
    array-length v1, v11

    const/4 v2, 0x0

    :goto_11
    if-ge v2, v1, :cond_17

    aget-object v3, v11, v2

    add-int/lit8 v4, v5, 0x1

    .line 120
    aput-object v3, v0, v5

    add-int/lit8 v2, v2, 0x1

    move v5, v4

    goto :goto_11

    .line 122
    :cond_17
    array-length v1, v0

    if-ne v5, v1, :cond_18

    goto :goto_12

    .line 124
    :cond_18
    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/measurement/zzfu;

    :goto_12
    move-wide/from16 v35, v28

    move-object/from16 v29, v0

    move-object v0, v10

    move-object/from16 v28, v17

    goto/16 :goto_16

    .line 125
    :cond_19
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzas;->zzjj()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v0

    const-string v1, "No unique parameters in main event. eventName"

    invoke-virtual {v0, v1, v10}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    move-object v0, v10

    move-wide/from16 v35, v28

    move-object/from16 v29, v11

    move-object/from16 v28, v17

    goto/16 :goto_16

    :cond_1a
    :goto_13
    move-object/from16 v37, v6

    const/16 v34, 0x1

    .line 90
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v2

    .line 91
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzas;->zzjg()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v2

    const-string v4, "Extra parameter without existing main event. eventName, eventId"

    .line 92
    invoke-virtual {v2, v4, v10, v3}, Lcom/google/android/gms/measurement/internal/zzau;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_14
    move/from16 v41, v8

    move-object/from16 v43, v9

    move-object/from16 v46, v12

    move-object/from16 v47, v21

    move-object/from16 v14, v22

    move-object/from16 v42, v24

    move-object/from16 v63, v25

    move-wide/from16 v2, v28

    goto/16 :goto_23

    :cond_1b
    move-object v13, v5

    move-object/from16 v37, v6

    const/16 v34, 0x1

    if-eqz v2, :cond_1f

    .line 130
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjr()Lcom/google/android/gms/measurement/internal/zzfu;

    const-string v0, "_epc"

    invoke-static/range {v26 .. v27}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 131
    invoke-static {v13, v0}, Lcom/google/android/gms/measurement/internal/zzfu;->zzb(Lcom/google/android/gms/internal/measurement/zzft;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1c

    move-object v0, v1

    .line 133
    :cond_1c
    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v16

    cmp-long v0, v16, v26

    if-gtz v0, :cond_1d

    .line 135
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v0

    .line 136
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzas;->zzjj()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v0

    const-string v1, "Complex event with zero extra param count. eventName"

    .line 137
    invoke-virtual {v0, v1, v10}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    move-object v0, v3

    goto :goto_15

    .line 138
    :cond_1d
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjt()Lcom/google/android/gms/measurement/internal/zzt;

    move-result-object v1

    move-object/from16 v2, p1

    move-object v0, v3

    move-wide/from16 v4, v16

    move-object v6, v13

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/measurement/internal/zzt;->zza(Ljava/lang/String;Ljava/lang/Long;JLcom/google/android/gms/internal/measurement/zzft;)Z

    :goto_15
    move-object/from16 v33, v0

    move-object v0, v10

    move-object/from16 v29, v11

    move-object/from16 v28, v13

    move-wide/from16 v35, v16

    goto :goto_16

    :cond_1e
    move/from16 v32, v4

    move-object v13, v5

    move-object/from16 v37, v6

    const/16 v34, 0x1

    :cond_1f
    move-object/from16 v33, v1

    move-wide/from16 v35, v28

    move-object/from16 v28, v0

    move-object v0, v10

    move-object/from16 v29, v11

    .line 139
    :goto_16
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjt()Lcom/google/android/gms/measurement/internal/zzt;

    move-result-object v1

    iget-object v2, v13, Lcom/google/android/gms/internal/measurement/zzft;->name:Ljava/lang/String;

    invoke-virtual {v1, v15, v2}, Lcom/google/android/gms/measurement/internal/zzt;->zzg(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzac;

    move-result-object v1

    if-nez v1, :cond_20

    .line 141
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v1

    .line 142
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjj()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v1

    const-string v2, "Event aggregate wasn\'t created during raw event logging. appId, event"

    .line 143
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/measurement/internal/zzas;->zzbw(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    .line 144
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object v4

    invoke-virtual {v4, v0}, Lcom/google/android/gms/measurement/internal/zzaq;->zzbt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 145
    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/measurement/internal/zzau;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 146
    new-instance v1, Lcom/google/android/gms/measurement/internal/zzac;

    iget-object v10, v13, Lcom/google/android/gms/internal/measurement/zzft;->name:Ljava/lang/String;

    const-wide/16 v2, 0x1

    const-wide/16 v4, 0x1

    iget-object v6, v13, Lcom/google/android/gms/internal/measurement/zzft;->zzaxb:Ljava/lang/Long;

    .line 147
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v16

    const-wide/16 v30, 0x0

    const/4 v6, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    move/from16 v41, v8

    move-object/from16 v11, v21

    move-object v8, v1

    move-object/from16 v43, v9

    move-object/from16 v42, v24

    move-object/from16 v9, p1

    move-object/from16 v44, v25

    move-object/from16 v47, v11

    move-object/from16 v46, v12

    move-object/from16 v45, v22

    move-wide v11, v2

    move-object v2, v13

    move-object v3, v14

    move-wide v13, v4

    move-object v5, v15

    move-wide/from16 v15, v16

    move-wide/from16 v17, v30

    move-object/from16 v19, v6

    move-object/from16 v20, v38

    move-object/from16 v21, v39

    move-object/from16 v22, v40

    invoke-direct/range {v8 .. v22}, Lcom/google/android/gms/measurement/internal/zzac;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    goto :goto_17

    :cond_20
    move/from16 v41, v8

    move-object/from16 v43, v9

    move-object/from16 v46, v12

    move-object v2, v13

    move-object v3, v14

    move-object v5, v15

    move-object/from16 v47, v21

    move-object/from16 v45, v22

    move-object/from16 v42, v24

    move-object/from16 v44, v25

    .line 149
    new-instance v4, Lcom/google/android/gms/measurement/internal/zzac;

    iget-object v6, v1, Lcom/google/android/gms/measurement/internal/zzac;->zztt:Ljava/lang/String;

    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/zzac;->name:Ljava/lang/String;

    iget-wide v9, v1, Lcom/google/android/gms/measurement/internal/zzac;->zzahv:J

    add-long v51, v9, v30

    iget-wide v9, v1, Lcom/google/android/gms/measurement/internal/zzac;->zzahw:J

    add-long v53, v9, v30

    iget-wide v9, v1, Lcom/google/android/gms/measurement/internal/zzac;->zzahx:J

    iget-wide v11, v1, Lcom/google/android/gms/measurement/internal/zzac;->zzahy:J

    iget-object v13, v1, Lcom/google/android/gms/measurement/internal/zzac;->zzahz:Ljava/lang/Long;

    iget-object v14, v1, Lcom/google/android/gms/measurement/internal/zzac;->zzaia:Ljava/lang/Long;

    iget-object v15, v1, Lcom/google/android/gms/measurement/internal/zzac;->zzaib:Ljava/lang/Long;

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzac;->zzaic:Ljava/lang/Boolean;

    move-object/from16 v48, v4

    move-object/from16 v49, v6

    move-object/from16 v50, v8

    move-wide/from16 v55, v9

    move-wide/from16 v57, v11

    move-object/from16 v59, v13

    move-object/from16 v60, v14

    move-object/from16 v61, v15

    move-object/from16 v62, v1

    invoke-direct/range {v48 .. v62}, Lcom/google/android/gms/measurement/internal/zzac;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    move-object v1, v4

    .line 151
    :goto_17
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjt()Lcom/google/android/gms/measurement/internal/zzt;

    move-result-object v4

    invoke-virtual {v4, v1}, Lcom/google/android/gms/measurement/internal/zzt;->zza(Lcom/google/android/gms/measurement/internal/zzac;)V

    .line 152
    iget-wide v8, v1, Lcom/google/android/gms/measurement/internal/zzac;->zzahv:J

    move-object/from16 v10, v43

    .line 154
    invoke-interface {v10, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    if-nez v1, :cond_22

    .line 156
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjt()Lcom/google/android/gms/measurement/internal/zzt;

    move-result-object v1

    invoke-virtual {v1, v5, v0}, Lcom/google/android/gms/measurement/internal/zzt;->zzl(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    if-nez v1, :cond_21

    .line 158
    new-instance v1, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v1}, Landroid/support/v4/util/ArrayMap;-><init>()V

    .line 159
    :cond_21
    invoke-interface {v10, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v11, v1

    goto :goto_18

    :cond_22
    move-object v11, v1

    .line 160
    :goto_18
    invoke-interface {v11}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_19
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_39

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    .line 161
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v14, v45

    invoke-interface {v14, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_23

    .line 162
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjo()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v1

    const-string v4, "Skipping failed audience ID"

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v1, v4, v6}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v45, v14

    goto :goto_19

    .line 165
    :cond_23
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v15, v46

    invoke-interface {v15, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/zzfr;

    .line 166
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v6, v44

    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/BitSet;

    move-object/from16 v16, v2

    .line 167
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v43, v10

    move-object/from16 v10, v42

    invoke-interface {v10, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/BitSet;

    if-eqz v23, :cond_24

    move-object/from16 v17, v2

    .line 172
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v18, v12

    move-object/from16 v12, v47

    invoke-interface {v12, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    move-object/from16 v19, v2

    .line 174
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v7, v37

    invoke-interface {v7, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    goto :goto_1a

    :cond_24
    move-object/from16 v17, v2

    move-object/from16 v18, v12

    move-object/from16 v7, v37

    move-object/from16 v12, v47

    const/4 v2, 0x0

    const/16 v19, 0x0

    :goto_1a
    if-nez v1, :cond_26

    .line 176
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzfr;

    invoke-direct {v1}, Lcom/google/android/gms/internal/measurement/zzfr;-><init>()V

    .line 177
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v15, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    invoke-static/range {v34 .. v34}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iput-object v4, v1, Lcom/google/android/gms/internal/measurement/zzfr;->zzawv:Ljava/lang/Boolean;

    .line 179
    new-instance v4, Ljava/util/BitSet;

    invoke-direct {v4}, Ljava/util/BitSet;-><init>()V

    .line 180
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    new-instance v1, Ljava/util/BitSet;

    invoke-direct {v1}, Ljava/util/BitSet;-><init>()V

    move-object/from16 v20, v2

    .line 182
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v10, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v23, :cond_25

    .line 184
    new-instance v2, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v2}, Landroid/support/v4/util/ArrayMap;-><init>()V

    move-object/from16 v17, v1

    .line 186
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 187
    invoke-interface {v12, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    new-instance v1, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v1}, Landroid/support/v4/util/ArrayMap;-><init>()V

    move-object/from16 v19, v2

    .line 190
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 191
    invoke-interface {v7, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v37, v7

    move-object/from16 v2, v17

    move-object/from16 v17, v19

    move-object v7, v1

    goto :goto_1b

    :cond_25
    move-object/from16 v17, v1

    move-object/from16 v37, v7

    move-object/from16 v2, v17

    move-object/from16 v17, v19

    move-object/from16 v7, v20

    goto :goto_1b

    :cond_26
    move-object/from16 v20, v2

    move-object/from16 v37, v7

    move-object/from16 v2, v17

    move-object/from16 v17, v19

    move-object/from16 v7, v20

    .line 192
    :goto_1b
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v11, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 193
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_1c
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_38

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/zzfj;

    move-object/from16 v20, v2

    .line 194
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v2

    move-object/from16 v21, v11

    const/4 v11, 0x2

    invoke-virtual {v2, v11}, Lcom/google/android/gms/measurement/internal/zzas;->isLoggable(I)Z

    move-result v2

    if-eqz v2, :cond_27

    .line 195
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v2

    .line 196
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzas;->zzjo()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v2

    const-string v11, "Evaluating filter. audience, filter, event"

    .line 197
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzfj;->zzavk:Ljava/lang/Integer;

    move-object/from16 v44, v6

    .line 198
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object v6

    move-object/from16 v47, v12

    iget-object v12, v1, Lcom/google/android/gms/internal/measurement/zzfj;->zzavl:Ljava/lang/String;

    invoke-virtual {v6, v12}, Lcom/google/android/gms/measurement/internal/zzaq;->zzbt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 199
    invoke-virtual {v2, v11, v3, v5, v6}, Lcom/google/android/gms/measurement/internal/zzau;->zzd(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 200
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v2

    .line 201
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzas;->zzjo()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v2

    const-string v3, "Filter definition"

    .line 202
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjr()Lcom/google/android/gms/measurement/internal/zzfu;

    move-result-object v5

    invoke-virtual {v5, v1}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Lcom/google/android/gms/internal/measurement/zzfj;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v3, v5}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1d

    :cond_27
    move-object/from16 v44, v6

    move-object/from16 v47, v12

    .line 203
    :goto_1d
    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/zzfj;->zzavk:Ljava/lang/Integer;

    if-eqz v2, :cond_37

    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/zzfj;->zzavk:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v11, 0x100

    if-le v2, v11, :cond_28

    goto/16 :goto_22

    :cond_28
    if-eqz v23, :cond_32

    if-eqz v1, :cond_29

    .line 212
    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/zzfj;->zzavh:Ljava/lang/Boolean;

    if-eqz v2, :cond_29

    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/zzfj;->zzavh:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_29

    move/from16 v12, v34

    goto :goto_1e

    :cond_29
    const/4 v12, 0x0

    :goto_1e
    if-eqz v1, :cond_2a

    .line 215
    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/zzfj;->zzavi:Ljava/lang/Boolean;

    if-eqz v2, :cond_2a

    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/zzfj;->zzavi:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_2a

    move/from16 v22, v34

    goto :goto_1f

    :cond_2a
    const/16 v22, 0x0

    .line 217
    :goto_1f
    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/zzfj;->zzavk:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v4, v2}, Ljava/util/BitSet;->get(I)Z

    move-result v2

    if-eqz v2, :cond_2b

    if-nez v12, :cond_2b

    if-nez v22, :cond_2b

    .line 218
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v2

    .line 219
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzas;->zzjo()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v2

    const-string v3, "Event filter already evaluated true and it is not associated with a dynamic audience. audience ID, filter ID"

    .line 220
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/zzfj;->zzavk:Ljava/lang/Integer;

    .line 221
    invoke-virtual {v2, v3, v5, v1}, Lcom/google/android/gms/measurement/internal/zzau;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v2, v20

    move-object/from16 v11, v21

    move-object/from16 v6, v44

    move-object/from16 v12, v47

    move-object/from16 v3, p3

    move-object/from16 v5, p1

    goto/16 :goto_1c

    :cond_2b
    move-object v5, v1

    move-object/from16 v6, v17

    move-object/from16 v1, p0

    move-object/from16 v3, v16

    move-object/from16 v11, v20

    move-object v2, v5

    move-object/from16 v42, v10

    move-object/from16 v46, v15

    move-object/from16 v10, p3

    move-object v15, v3

    move-object v3, v0

    move-object v10, v4

    move-object/from16 v4, v29

    move-object/from16 v16, v0

    move-object v0, v5

    move-object/from16 v64, v6

    move-object/from16 v63, v44

    move-wide v5, v8

    .line 224
    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/measurement/internal/zzm;->zza(Lcom/google/android/gms/internal/measurement/zzfj;Ljava/lang/String;[Lcom/google/android/gms/internal/measurement/zzfu;J)Ljava/lang/Boolean;

    move-result-object v1

    .line 225
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v2

    .line 226
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzas;->zzjo()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v2

    const-string v3, "Event filter result"

    if-nez v1, :cond_2c

    const-string v4, "null"

    goto :goto_20

    :cond_2c
    move-object v4, v1

    .line 227
    :goto_20
    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    if-nez v1, :cond_2d

    .line 229
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v14, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-object v4, v10

    move-object v2, v11

    move-object/from16 v0, v16

    move-object/from16 v11, v21

    move-object/from16 v10, v42

    move-object/from16 v12, v47

    move-object/from16 v6, v63

    move-object/from16 v17, v64

    move-object/from16 v3, p3

    move-object/from16 v5, p1

    move-object/from16 v16, v15

    move-object/from16 v15, v46

    goto/16 :goto_1c

    .line 231
    :cond_2d
    iget-object v2, v0, Lcom/google/android/gms/internal/measurement/zzfj;->zzavk:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v11, v2}, Ljava/util/BitSet;->set(I)V

    .line 232
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_31

    .line 233
    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzfj;->zzavk:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v10, v1}, Ljava/util/BitSet;->set(I)V

    if-nez v12, :cond_2e

    if-eqz v22, :cond_30

    .line 234
    :cond_2e
    iget-object v1, v15, Lcom/google/android/gms/internal/measurement/zzft;->zzaxb:Ljava/lang/Long;

    if-eqz v1, :cond_30

    if-eqz v22, :cond_2f

    .line 236
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzfj;->zzavk:Ljava/lang/Integer;

    .line 237
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, v15, Lcom/google/android/gms/internal/measurement/zzft;->zzaxb:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    .line 238
    invoke-static {v7, v0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzm;->zzb(Ljava/util/Map;IJ)V

    move-object v4, v10

    move-object v2, v11

    move-object/from16 v0, v16

    move-object/from16 v11, v21

    move-object/from16 v10, v42

    move-object/from16 v12, v47

    move-object/from16 v6, v63

    move-object/from16 v17, v64

    move-object/from16 v3, p3

    move-object/from16 v5, p1

    move-object/from16 v16, v15

    move-object/from16 v15, v46

    goto/16 :goto_1c

    .line 239
    :cond_2f
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzfj;->zzavk:Ljava/lang/Integer;

    .line 240
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, v15, Lcom/google/android/gms/internal/measurement/zzft;->zzaxb:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    move-object/from16 v12, v64

    .line 241
    invoke-static {v12, v0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzm;->zza(Ljava/util/Map;IJ)V

    move-object v4, v10

    move-object v2, v11

    move-object/from16 v17, v12

    move-object/from16 v0, v16

    move-object/from16 v11, v21

    move-object/from16 v10, v42

    move-object/from16 v12, v47

    move-object/from16 v6, v63

    move-object/from16 v3, p3

    move-object/from16 v5, p1

    move-object/from16 v16, v15

    move-object/from16 v15, v46

    goto/16 :goto_1c

    :cond_30
    move-object v4, v10

    move-object v2, v11

    move-object/from16 v0, v16

    move-object/from16 v11, v21

    move-object/from16 v10, v42

    move-object/from16 v12, v47

    move-object/from16 v6, v63

    move-object/from16 v17, v64

    move-object/from16 v3, p3

    move-object/from16 v5, p1

    move-object/from16 v16, v15

    move-object/from16 v15, v46

    goto/16 :goto_1c

    :cond_31
    move-object v4, v10

    move-object v2, v11

    move-object/from16 v0, v16

    move-object/from16 v11, v21

    move-object/from16 v10, v42

    move-object/from16 v12, v47

    move-object/from16 v6, v63

    move-object/from16 v17, v64

    move-object/from16 v3, p3

    move-object/from16 v5, p1

    move-object/from16 v16, v15

    move-object/from16 v15, v46

    goto/16 :goto_1c

    :cond_32
    move-object/from16 v42, v10

    move-object/from16 v46, v15

    move-object/from16 v15, v16

    move-object/from16 v12, v17

    move-object/from16 v11, v20

    move-object/from16 v63, v44

    move-object/from16 v16, v0

    move-object v0, v1

    move-object v10, v4

    .line 243
    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzfj;->zzavk:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v10, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_33

    .line 244
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v1

    .line 245
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjo()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v1

    const-string v2, "Event filter already evaluated true. audience ID, filter ID"

    .line 246
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzfj;->zzavk:Ljava/lang/Integer;

    .line 247
    invoke-virtual {v1, v2, v3, v0}, Lcom/google/android/gms/measurement/internal/zzau;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v4, v10

    move-object v2, v11

    move-object/from16 v17, v12

    move-object/from16 v0, v16

    move-object/from16 v11, v21

    move-object/from16 v10, v42

    move-object/from16 v12, v47

    move-object/from16 v6, v63

    move-object/from16 v3, p3

    move-object/from16 v5, p1

    move-object/from16 v16, v15

    move-object/from16 v15, v46

    goto/16 :goto_1c

    :cond_33
    move-object/from16 v1, p0

    move-object v2, v0

    move-object/from16 v3, v16

    move-object/from16 v4, v29

    move-wide v5, v8

    .line 250
    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/measurement/internal/zzm;->zza(Lcom/google/android/gms/internal/measurement/zzfj;Ljava/lang/String;[Lcom/google/android/gms/internal/measurement/zzfu;J)Ljava/lang/Boolean;

    move-result-object v1

    .line 251
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v2

    .line 252
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzas;->zzjo()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v2

    const-string v3, "Event filter result"

    if-nez v1, :cond_34

    const-string v4, "null"

    goto :goto_21

    :cond_34
    move-object v4, v1

    .line 253
    :goto_21
    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    if-nez v1, :cond_35

    .line 255
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v14, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-object v4, v10

    move-object v2, v11

    move-object/from16 v17, v12

    move-object/from16 v0, v16

    move-object/from16 v11, v21

    move-object/from16 v10, v42

    move-object/from16 v12, v47

    move-object/from16 v6, v63

    move-object/from16 v3, p3

    move-object/from16 v5, p1

    move-object/from16 v16, v15

    move-object/from16 v15, v46

    goto/16 :goto_1c

    .line 257
    :cond_35
    iget-object v2, v0, Lcom/google/android/gms/internal/measurement/zzfj;->zzavk:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v11, v2}, Ljava/util/BitSet;->set(I)V

    .line 258
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_36

    .line 259
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzfj;->zzavk:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v10, v0}, Ljava/util/BitSet;->set(I)V

    :cond_36
    move-object v4, v10

    move-object v2, v11

    move-object/from16 v17, v12

    move-object/from16 v0, v16

    move-object/from16 v11, v21

    move-object/from16 v10, v42

    move-object/from16 v12, v47

    move-object/from16 v6, v63

    move-object/from16 v3, p3

    move-object/from16 v5, p1

    move-object/from16 v16, v15

    move-object/from16 v15, v46

    goto/16 :goto_1c

    :cond_37
    :goto_22
    move-object/from16 v42, v10

    move-object/from16 v46, v15

    move-object/from16 v15, v16

    move-object/from16 v12, v17

    move-object/from16 v11, v20

    move-object/from16 v63, v44

    move-object/from16 v16, v0

    move-object v0, v1

    move-object v10, v4

    .line 204
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v1

    .line 205
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjj()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v1

    const-string v2, "Invalid event filter ID. appId, id"

    .line 206
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/measurement/internal/zzas;->zzbw(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzfj;->zzavk:Ljava/lang/Integer;

    .line 207
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 208
    invoke-virtual {v1, v2, v3, v0}, Lcom/google/android/gms/measurement/internal/zzau;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v4, v10

    move-object v2, v11

    move-object/from16 v17, v12

    move-object/from16 v0, v16

    move-object/from16 v11, v21

    move-object/from16 v10, v42

    move-object/from16 v12, v47

    move-object/from16 v6, v63

    move-object/from16 v3, p3

    move-object/from16 v5, p1

    move-object/from16 v16, v15

    move-object/from16 v15, v46

    goto/16 :goto_1c

    :cond_38
    move-object/from16 v46, v15

    move-object/from16 v15, v16

    move-object/from16 v44, v6

    move-object/from16 v42, v10

    move-object/from16 v47, v12

    move-object/from16 v45, v14

    move-object v2, v15

    move-object/from16 v12, v18

    move-object/from16 v10, v43

    move-object/from16 v3, p3

    move-object/from16 v5, p1

    move-object/from16 v7, p0

    goto/16 :goto_19

    :cond_39
    move-object/from16 v43, v10

    move-object/from16 v63, v44

    move-object/from16 v14, v45

    move-object/from16 v0, v28

    move-object/from16 v1, v33

    move-wide/from16 v2, v35

    :goto_23
    add-int/lit8 v4, v32, 0x1

    move-object/from16 v13, p2

    move-object/from16 v22, v14

    move-object/from16 v6, v37

    move/from16 v8, v41

    move-object/from16 v24, v42

    move-object/from16 v9, v43

    move-object/from16 v12, v46

    move-object/from16 v21, v47

    move-object/from16 v25, v63

    move-object/from16 v7, p0

    move-object/from16 v14, p3

    move-object/from16 v15, p1

    goto/16 :goto_8

    :cond_3a
    move-object/from16 v37, v6

    move-object/from16 v46, v12

    move-object/from16 v47, v21

    move-object/from16 v14, v22

    move-object/from16 v42, v24

    move-object/from16 v63, v25

    const/16 v34, 0x1

    move-object/from16 v1, p3

    goto :goto_24

    :cond_3b
    move-object/from16 v37, v6

    move-object/from16 v46, v12

    move-object/from16 v47, v21

    move-object/from16 v14, v22

    move-object/from16 v42, v24

    move-object/from16 v63, v25

    const/16 v34, 0x1

    move-object/from16 v1, p3

    :goto_24
    if-eqz v1, :cond_55

    .line 264
    new-instance v0, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v0}, Landroid/support/v4/util/ArrayMap;-><init>()V

    .line 265
    array-length v2, v1

    const/4 v3, 0x0

    :goto_25
    if-ge v3, v2, :cond_54

    aget-object v4, v1, v3

    .line 266
    iget-object v5, v4, Lcom/google/android/gms/internal/measurement/zzfz;->name:Ljava/lang/String;

    .line 267
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map;

    if-nez v5, :cond_3d

    .line 269
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjt()Lcom/google/android/gms/measurement/internal/zzt;

    move-result-object v5

    iget-object v6, v4, Lcom/google/android/gms/internal/measurement/zzfz;->name:Ljava/lang/String;

    move-object/from16 v7, p1

    invoke-virtual {v5, v7, v6}, Lcom/google/android/gms/measurement/internal/zzt;->zzm(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    if-nez v5, :cond_3c

    .line 271
    new-instance v5, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v5}, Landroid/support/v4/util/ArrayMap;-><init>()V

    .line 272
    :cond_3c
    iget-object v6, v4, Lcom/google/android/gms/internal/measurement/zzfz;->name:Ljava/lang/String;

    invoke-interface {v0, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_26

    :cond_3d
    move-object/from16 v7, p1

    .line 273
    :goto_26
    invoke-interface {v5}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_27
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_53

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 274
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v14, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3e

    .line 275
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/zzas;->zzjo()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v9

    const-string v10, "Skipping failed audience ID"

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v9, v10, v8}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_27

    .line 278
    :cond_3e
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    move-object/from16 v10, v46

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/zzfr;

    .line 279
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    move-object/from16 v12, v63

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/BitSet;

    .line 280
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    move-object/from16 v15, v42

    invoke-interface {v15, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/BitSet;

    if-eqz v23, :cond_3f

    move-object/from16 p2, v0

    .line 285
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v1, v47

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    move-object/from16 v16, v0

    .line 287
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move/from16 v17, v2

    move-object/from16 v2, v37

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    goto :goto_28

    :cond_3f
    move-object/from16 p2, v0

    move/from16 v17, v2

    move-object/from16 v2, v37

    move-object/from16 v1, v47

    const/4 v0, 0x0

    const/16 v16, 0x0

    :goto_28
    if-nez v9, :cond_41

    .line 289
    new-instance v9, Lcom/google/android/gms/internal/measurement/zzfr;

    invoke-direct {v9}, Lcom/google/android/gms/internal/measurement/zzfr;-><init>()V

    .line 290
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v10, v11, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    invoke-static/range {v34 .. v34}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    iput-object v11, v9, Lcom/google/android/gms/internal/measurement/zzfr;->zzawv:Ljava/lang/Boolean;

    .line 292
    new-instance v11, Ljava/util/BitSet;

    invoke-direct {v11}, Ljava/util/BitSet;-><init>()V

    .line 293
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v12, v9, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    new-instance v13, Ljava/util/BitSet;

    invoke-direct {v13}, Ljava/util/BitSet;-><init>()V

    .line 295
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v15, v9, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v23, :cond_40

    .line 297
    new-instance v0, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v0}, Landroid/support/v4/util/ArrayMap;-><init>()V

    .line 299
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    .line 300
    invoke-interface {v1, v9, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    new-instance v9, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v9}, Landroid/support/v4/util/ArrayMap;-><init>()V

    move-object/from16 v16, v0

    .line 303
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 304
    invoke-interface {v2, v0, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v37, v2

    move-object/from16 v0, v16

    goto :goto_29

    :cond_40
    move-object v9, v0

    move-object/from16 v37, v2

    move-object/from16 v0, v16

    goto :goto_29

    :cond_41
    move-object v9, v0

    move-object/from16 v37, v2

    move-object/from16 v0, v16

    .line 305
    :goto_29
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v5, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 306
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_52

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v18, v2

    move-object/from16 v2, v16

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzfm;

    move-object/from16 v16, v5

    .line 307
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v5

    move-object/from16 v19, v6

    const/4 v6, 0x2

    invoke-virtual {v5, v6}, Lcom/google/android/gms/measurement/internal/zzas;->isLoggable(I)Z

    move-result v5

    if-eqz v5, :cond_42

    .line 308
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v5

    .line 309
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/zzas;->zzjo()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v5

    const-string v6, "Evaluating filter. audience, filter, property"

    .line 310
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    move-object/from16 v21, v1

    iget-object v1, v2, Lcom/google/android/gms/internal/measurement/zzfm;->zzavk:Ljava/lang/Integer;

    move-object/from16 v42, v15

    .line 311
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgq()Lcom/google/android/gms/measurement/internal/zzaq;

    move-result-object v15

    move-object/from16 v46, v10

    iget-object v10, v2, Lcom/google/android/gms/internal/measurement/zzfm;->zzawa:Ljava/lang/String;

    invoke-virtual {v15, v10}, Lcom/google/android/gms/measurement/internal/zzaq;->zzbv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 312
    invoke-virtual {v5, v6, v7, v1, v10}, Lcom/google/android/gms/measurement/internal/zzau;->zzd(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 313
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v1

    .line 314
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjo()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v1

    const-string v5, "Filter definition"

    .line 315
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjr()Lcom/google/android/gms/measurement/internal/zzfu;

    move-result-object v6

    invoke-virtual {v6, v2}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Lcom/google/android/gms/internal/measurement/zzfm;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2b

    :cond_42
    move-object/from16 v21, v1

    move-object/from16 v46, v10

    move-object/from16 v42, v15

    .line 316
    :goto_2b
    iget-object v1, v2, Lcom/google/android/gms/internal/measurement/zzfm;->zzavk:Ljava/lang/Integer;

    if-eqz v1, :cond_51

    iget-object v1, v2, Lcom/google/android/gms/internal/measurement/zzfm;->zzavk:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v5, 0x100

    if-le v1, v5, :cond_43

    goto/16 :goto_30

    :cond_43
    if-eqz v23, :cond_4c

    if-eqz v2, :cond_44

    .line 326
    iget-object v1, v2, Lcom/google/android/gms/internal/measurement/zzfm;->zzavh:Ljava/lang/Boolean;

    if-eqz v1, :cond_44

    iget-object v1, v2, Lcom/google/android/gms/internal/measurement/zzfm;->zzavh:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_44

    move/from16 v1, v34

    goto :goto_2c

    :cond_44
    const/4 v1, 0x0

    :goto_2c
    if-eqz v2, :cond_45

    .line 329
    iget-object v6, v2, Lcom/google/android/gms/internal/measurement/zzfm;->zzavi:Ljava/lang/Boolean;

    if-eqz v6, :cond_45

    iget-object v6, v2, Lcom/google/android/gms/internal/measurement/zzfm;->zzavi:Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_45

    move/from16 v6, v34

    goto :goto_2d

    :cond_45
    const/4 v6, 0x0

    .line 331
    :goto_2d
    iget-object v7, v2, Lcom/google/android/gms/internal/measurement/zzfm;->zzavk:Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-virtual {v11, v7}, Ljava/util/BitSet;->get(I)Z

    move-result v7

    if-eqz v7, :cond_46

    if-nez v1, :cond_46

    if-nez v6, :cond_46

    .line 332
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v1

    .line 333
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjo()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v1

    const-string v6, "Property filter already evaluated true and it is not associated with a dynamic audience. audience ID, filter ID"

    .line 334
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iget-object v2, v2, Lcom/google/android/gms/internal/measurement/zzfm;->zzavk:Ljava/lang/Integer;

    .line 335
    invoke-virtual {v1, v6, v7, v2}, Lcom/google/android/gms/measurement/internal/zzau;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v5, v16

    move-object/from16 v2, v18

    move-object/from16 v6, v19

    move-object/from16 v1, v21

    move-object/from16 v15, v42

    move-object/from16 v10, v46

    move-object/from16 v7, p1

    goto/16 :goto_2a

    :cond_46
    move-object/from16 v10, v37

    move-object/from16 v7, p0

    .line 337
    invoke-direct {v7, v2, v4}, Lcom/google/android/gms/measurement/internal/zzm;->zza(Lcom/google/android/gms/internal/measurement/zzfm;Lcom/google/android/gms/internal/measurement/zzfz;)Ljava/lang/Boolean;

    move-result-object v15

    .line 338
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v20

    .line 339
    invoke-virtual/range {v20 .. v20}, Lcom/google/android/gms/measurement/internal/zzas;->zzjo()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v5

    move-object/from16 v37, v10

    const-string v10, "Property filter result"

    if-nez v15, :cond_47

    const-string v20, "null"

    move-object/from16 v44, v12

    move-object/from16 v12, v20

    goto :goto_2e

    :cond_47
    move-object/from16 v44, v12

    move-object v12, v15

    .line 340
    :goto_2e
    invoke-virtual {v5, v10, v12}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    if-nez v15, :cond_48

    .line 342
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v14, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-object/from16 v5, v16

    move-object/from16 v2, v18

    move-object/from16 v6, v19

    move-object/from16 v1, v21

    move-object/from16 v15, v42

    move-object/from16 v12, v44

    move-object/from16 v10, v46

    move-object/from16 v7, p1

    goto/16 :goto_2a

    .line 344
    :cond_48
    iget-object v5, v2, Lcom/google/android/gms/internal/measurement/zzfm;->zzavk:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v13, v5}, Ljava/util/BitSet;->set(I)V

    .line 345
    iget-object v5, v2, Lcom/google/android/gms/internal/measurement/zzfm;->zzavk:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    invoke-virtual {v11, v5, v10}, Ljava/util/BitSet;->set(IZ)V

    .line 346
    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_4b

    if-nez v1, :cond_49

    if-eqz v6, :cond_4b

    :cond_49
    iget-object v1, v4, Lcom/google/android/gms/internal/measurement/zzfz;->zzayu:Ljava/lang/Long;

    if-eqz v1, :cond_4b

    if-eqz v6, :cond_4a

    .line 348
    iget-object v1, v2, Lcom/google/android/gms/internal/measurement/zzfm;->zzavk:Ljava/lang/Integer;

    .line 349
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, v4, Lcom/google/android/gms/internal/measurement/zzfz;->zzayu:Ljava/lang/Long;

    .line 350
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    .line 351
    invoke-static {v9, v1, v5, v6}, Lcom/google/android/gms/measurement/internal/zzm;->zzb(Ljava/util/Map;IJ)V

    move-object/from16 v5, v16

    move-object/from16 v2, v18

    move-object/from16 v6, v19

    move-object/from16 v1, v21

    move-object/from16 v15, v42

    move-object/from16 v12, v44

    move-object/from16 v10, v46

    move-object/from16 v7, p1

    goto/16 :goto_2a

    .line 352
    :cond_4a
    iget-object v1, v2, Lcom/google/android/gms/internal/measurement/zzfm;->zzavk:Ljava/lang/Integer;

    .line 353
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, v4, Lcom/google/android/gms/internal/measurement/zzfz;->zzayu:Ljava/lang/Long;

    .line 354
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    .line 355
    invoke-static {v0, v1, v5, v6}, Lcom/google/android/gms/measurement/internal/zzm;->zza(Ljava/util/Map;IJ)V

    move-object/from16 v5, v16

    move-object/from16 v2, v18

    move-object/from16 v6, v19

    move-object/from16 v1, v21

    move-object/from16 v15, v42

    move-object/from16 v12, v44

    move-object/from16 v10, v46

    move-object/from16 v7, p1

    goto/16 :goto_2a

    :cond_4b
    move-object/from16 v5, v16

    move-object/from16 v2, v18

    move-object/from16 v6, v19

    move-object/from16 v1, v21

    move-object/from16 v15, v42

    move-object/from16 v12, v44

    move-object/from16 v10, v46

    move-object/from16 v7, p1

    goto/16 :goto_2a

    :cond_4c
    move-object/from16 v44, v12

    move-object/from16 v7, p0

    .line 357
    iget-object v1, v2, Lcom/google/android/gms/internal/measurement/zzfm;->zzavk:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v11, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_4d

    .line 358
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v1

    .line 359
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjo()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v1

    const-string v5, "Property filter already evaluated true. audience ID, filter ID"

    .line 360
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    iget-object v2, v2, Lcom/google/android/gms/internal/measurement/zzfm;->zzavk:Ljava/lang/Integer;

    .line 361
    invoke-virtual {v1, v5, v6, v2}, Lcom/google/android/gms/measurement/internal/zzau;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v5, v16

    move-object/from16 v2, v18

    move-object/from16 v6, v19

    move-object/from16 v1, v21

    move-object/from16 v15, v42

    move-object/from16 v12, v44

    move-object/from16 v10, v46

    move-object/from16 v7, p1

    goto/16 :goto_2a

    .line 363
    :cond_4d
    invoke-direct {v7, v2, v4}, Lcom/google/android/gms/measurement/internal/zzm;->zza(Lcom/google/android/gms/internal/measurement/zzfm;Lcom/google/android/gms/internal/measurement/zzfz;)Ljava/lang/Boolean;

    move-result-object v1

    .line 364
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v5

    .line 365
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/zzas;->zzjo()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v5

    const-string v6, "Property filter result"

    if-nez v1, :cond_4e

    const-string v10, "null"

    goto :goto_2f

    :cond_4e
    move-object v10, v1

    .line 366
    :goto_2f
    invoke-virtual {v5, v6, v10}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    if-nez v1, :cond_4f

    .line 368
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v14, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-object/from16 v5, v16

    move-object/from16 v2, v18

    move-object/from16 v6, v19

    move-object/from16 v1, v21

    move-object/from16 v15, v42

    move-object/from16 v12, v44

    move-object/from16 v10, v46

    move-object/from16 v7, p1

    goto/16 :goto_2a

    .line 370
    :cond_4f
    iget-object v5, v2, Lcom/google/android/gms/internal/measurement/zzfm;->zzavk:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v13, v5}, Ljava/util/BitSet;->set(I)V

    .line 371
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_50

    .line 372
    iget-object v1, v2, Lcom/google/android/gms/internal/measurement/zzfm;->zzavk:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v11, v1}, Ljava/util/BitSet;->set(I)V

    :cond_50
    move-object/from16 v5, v16

    move-object/from16 v2, v18

    move-object/from16 v6, v19

    move-object/from16 v1, v21

    move-object/from16 v15, v42

    move-object/from16 v12, v44

    move-object/from16 v10, v46

    move-object/from16 v7, p1

    goto/16 :goto_2a

    :cond_51
    :goto_30
    move-object/from16 v44, v12

    move-object/from16 v7, p0

    .line 317
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v0

    .line 318
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzas;->zzjj()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v0

    const-string v1, "Invalid property filter ID. appId, id"

    .line 319
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/measurement/internal/zzas;->zzbw(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    iget-object v2, v2, Lcom/google/android/gms/internal/measurement/zzfm;->zzavk:Ljava/lang/Integer;

    .line 320
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 321
    invoke-virtual {v0, v1, v5, v2}, Lcom/google/android/gms/measurement/internal/zzau;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 322
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v14, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p2

    move-object/from16 v5, v16

    move/from16 v2, v17

    move-object/from16 v6, v19

    move-object/from16 v47, v21

    move-object/from16 v63, v44

    move-object/from16 v1, p3

    move-object/from16 v7, p1

    goto/16 :goto_27

    :cond_52
    move-object/from16 v7, p0

    move-object/from16 v0, p2

    move-object/from16 v47, v1

    move-object/from16 v46, v10

    move-object/from16 v63, v12

    move-object/from16 v42, v15

    move/from16 v2, v17

    move-object/from16 v1, p3

    move-object/from16 v7, p1

    goto/16 :goto_27

    :cond_53
    move-object/from16 p2, v0

    move/from16 v17, v2

    move-object/from16 v21, v47

    move-object/from16 v44, v63

    move-object/from16 v7, p0

    add-int/lit8 v3, v3, 0x1

    move-object/from16 v1, p3

    goto/16 :goto_25

    :cond_54
    move-object/from16 v21, v47

    move-object/from16 v44, v63

    move-object/from16 v7, p0

    goto :goto_31

    :cond_55
    move-object/from16 v21, v47

    move-object/from16 v44, v63

    move-object/from16 v7, p0

    .line 377
    :goto_31
    invoke-interface/range {v44 .. v44}, Ljava/util/Map;->size()I

    move-result v0

    new-array v1, v0, [Lcom/google/android/gms/internal/measurement/zzfr;

    .line 379
    invoke-interface/range {v44 .. v44}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_32
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 380
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v14, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5d

    .line 381
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v5, v46

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/zzfr;

    if-nez v4, :cond_56

    .line 383
    new-instance v4, Lcom/google/android/gms/internal/measurement/zzfr;

    invoke-direct {v4}, Lcom/google/android/gms/internal/measurement/zzfr;-><init>()V

    :cond_56
    add-int/lit8 v6, v3, 0x1

    .line 384
    aput-object v4, v1, v3

    .line 385
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v4, Lcom/google/android/gms/internal/measurement/zzfr;->zzave:Ljava/lang/Integer;

    .line 386
    new-instance v3, Lcom/google/android/gms/internal/measurement/zzfx;

    invoke-direct {v3}, Lcom/google/android/gms/internal/measurement/zzfx;-><init>()V

    iput-object v3, v4, Lcom/google/android/gms/internal/measurement/zzfr;->zzawt:Lcom/google/android/gms/internal/measurement/zzfx;

    .line 387
    iget-object v3, v4, Lcom/google/android/gms/internal/measurement/zzfr;->zzawt:Lcom/google/android/gms/internal/measurement/zzfx;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    move-object/from16 v9, v44

    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/BitSet;

    invoke-static {v8}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/util/BitSet;)[J

    move-result-object v8

    iput-object v8, v3, Lcom/google/android/gms/internal/measurement/zzfx;->zzayo:[J

    .line 388
    iget-object v3, v4, Lcom/google/android/gms/internal/measurement/zzfr;->zzawt:Lcom/google/android/gms/internal/measurement/zzfx;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    move-object/from16 v10, v42

    invoke-interface {v10, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/BitSet;

    invoke-static {v8}, Lcom/google/android/gms/measurement/internal/zzfu;->zza(Ljava/util/BitSet;)[J

    move-result-object v8

    iput-object v8, v3, Lcom/google/android/gms/internal/measurement/zzfx;->zzayn:[J

    if-eqz v23, :cond_5b

    .line 390
    iget-object v3, v4, Lcom/google/android/gms/internal/measurement/zzfr;->zzawt:Lcom/google/android/gms/internal/measurement/zzfx;

    .line 391
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    move-object/from16 v11, v21

    invoke-interface {v11, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map;

    .line 392
    invoke-static {v8}, Lcom/google/android/gms/measurement/internal/zzm;->zzb(Ljava/util/Map;)[Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v8

    iput-object v8, v3, Lcom/google/android/gms/internal/measurement/zzfx;->zzayp:[Lcom/google/android/gms/internal/measurement/zzfs;

    .line 393
    iget-object v3, v4, Lcom/google/android/gms/internal/measurement/zzfr;->zzawt:Lcom/google/android/gms/internal/measurement/zzfx;

    .line 394
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    move-object/from16 v12, v37

    invoke-interface {v12, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map;

    if-nez v8, :cond_57

    const/4 v13, 0x0

    .line 397
    new-array v8, v13, [Lcom/google/android/gms/internal/measurement/zzfy;

    move-object/from16 p2, v2

    move-object/from16 v46, v5

    move-object v15, v8

    goto/16 :goto_36

    :cond_57
    const/4 v13, 0x0

    .line 400
    invoke-interface {v8}, Ljava/util/Map;->size()I

    move-result v15

    new-array v15, v15, [Lcom/google/android/gms/internal/measurement/zzfy;

    .line 401
    invoke-interface {v8}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v16

    invoke-interface/range {v16 .. v16}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v16

    move/from16 v17, v13

    :goto_33
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_5a

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v13, v18

    check-cast v13, Ljava/lang/Integer;

    move-object/from16 p2, v2

    .line 402
    new-instance v2, Lcom/google/android/gms/internal/measurement/zzfy;

    invoke-direct {v2}, Lcom/google/android/gms/internal/measurement/zzfy;-><init>()V

    .line 403
    iput-object v13, v2, Lcom/google/android/gms/internal/measurement/zzfy;->zzawx:Ljava/lang/Integer;

    .line 404
    invoke-interface {v8, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/List;

    if-eqz v13, :cond_59

    .line 406
    invoke-static {v13}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    move-object/from16 v46, v5

    .line 407
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v5

    new-array v5, v5, [J

    .line 409
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    const/16 v18, 0x0

    :goto_34
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_58

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Ljava/lang/Long;

    add-int/lit8 v20, v18, 0x1

    .line 410
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Long;->longValue()J

    move-result-wide v21

    aput-wide v21, v5, v18

    move/from16 v18, v20

    goto :goto_34

    .line 412
    :cond_58
    iput-object v5, v2, Lcom/google/android/gms/internal/measurement/zzfy;->zzays:[J

    goto :goto_35

    :cond_59
    move-object/from16 v46, v5

    :goto_35
    add-int/lit8 v5, v17, 0x1

    .line 413
    aput-object v2, v15, v17

    move-object/from16 v2, p2

    move/from16 v17, v5

    move-object/from16 v5, v46

    const/4 v13, 0x0

    goto :goto_33

    :cond_5a
    move-object/from16 p2, v2

    move-object/from16 v46, v5

    .line 416
    :goto_36
    iput-object v15, v3, Lcom/google/android/gms/internal/measurement/zzfx;->zzayq:[Lcom/google/android/gms/internal/measurement/zzfy;

    goto :goto_37

    :cond_5b
    move-object/from16 p2, v2

    move-object/from16 v46, v5

    move-object/from16 v11, v21

    move-object/from16 v12, v37

    .line 417
    :goto_37
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/zzfm;->zzjt()Lcom/google/android/gms/measurement/internal/zzt;

    move-result-object v2

    iget-object v3, v4, Lcom/google/android/gms/internal/measurement/zzfr;->zzawt:Lcom/google/android/gms/internal/measurement/zzfx;

    .line 418
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzfn;->zzcl()V

    .line 419
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzcr;->zzaf()V

    .line 420
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    .line 421
    invoke-static {v3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 422
    :try_start_3
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzyi;->zzvx()I

    move-result v4

    .line 423
    new-array v4, v4, [B

    .line 425
    array-length v5, v4
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_6

    const/4 v8, 0x0

    :try_start_4
    invoke-static {v4, v8, v5}, Lcom/google/android/gms/internal/measurement/zzya;->zzk([BII)Lcom/google/android/gms/internal/measurement/zzya;

    move-result-object v5

    .line 427
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/measurement/zzyi;->zza(Lcom/google/android/gms/internal/measurement/zzya;)V

    .line 428
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzya;->zzza()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_5

    .line 436
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    const-string v5, "app_id"

    move-object/from16 v13, p1

    .line 437
    invoke-virtual {v3, v5, v13}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "audience_id"

    .line 438
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v5, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v0, "current_results"

    .line 439
    invoke-virtual {v3, v0, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 440
    :try_start_5
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzt;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v4, "audience_filter_values"
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_4

    const/4 v5, 0x5

    const/4 v15, 0x0

    .line 442
    :try_start_6
    invoke-virtual {v0, v4, v15, v3, v5}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    move-result-wide v3

    const-wide/16 v16, -0x1

    cmp-long v0, v3, v16

    if-nez v0, :cond_5c

    .line 444
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v0

    .line 445
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzas;->zzjg()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v0

    const-string v3, "Failed to insert filter results (got -1). appId"

    .line 446
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/measurement/internal/zzas;->zzbw(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_3a

    :catch_3
    move-exception v0

    goto :goto_38

    :catch_4
    move-exception v0

    const/4 v15, 0x0

    .line 449
    :goto_38
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v2

    .line 450
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzas;->zzjg()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v2

    const-string v3, "Error storing filter results. appId"

    .line 451
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/measurement/internal/zzas;->zzbw(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4, v0}, Lcom/google/android/gms/measurement/internal/zzau;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3a

    :catch_5
    move-exception v0

    goto :goto_39

    :catch_6
    move-exception v0

    const/4 v8, 0x0

    :goto_39
    move-object/from16 v13, p1

    const/4 v15, 0x0

    .line 431
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v2

    .line 432
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzas;->zzjg()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v2

    const-string v3, "Configuration loss. Failed to serialize filter results. appId"

    .line 433
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/measurement/internal/zzas;->zzbw(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    .line 434
    invoke-virtual {v2, v3, v4, v0}, Lcom/google/android/gms/measurement/internal/zzau;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_5c
    :goto_3a
    move-object/from16 v2, p2

    move v3, v6

    move-object/from16 v44, v9

    move-object/from16 v42, v10

    move-object/from16 v21, v11

    move-object/from16 v37, v12

    goto/16 :goto_32

    :cond_5d
    move-object/from16 v13, p1

    goto/16 :goto_32

    .line 453
    :cond_5e
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/measurement/zzfr;

    return-object v0
.end method

.method protected final zzgy()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
