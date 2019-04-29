.class final Lcom/google/android/gms/internal/measurement/zzeb;
.super Lcom/google/android/gms/internal/measurement/zzjr;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzjs;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzjr;-><init>(Lcom/google/android/gms/internal/measurement/zzjs;)V

    return-void
.end method

.method private final zza(DLcom/google/android/gms/internal/measurement/zzki;)Ljava/lang/Boolean;
    .locals 1

    :try_start_0
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, p1, p2}, Ljava/math/BigDecimal;-><init>(D)V

    invoke-static {p1, p2}, Ljava/lang/Math;->ulp(D)D

    move-result-wide p1

    invoke-static {v0, p3, p1, p2}, Lcom/google/android/gms/internal/measurement/zzeb;->zza(Ljava/math/BigDecimal;Lcom/google/android/gms/internal/measurement/zzki;D)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final zza(JLcom/google/android/gms/internal/measurement/zzki;)Ljava/lang/Boolean;
    .locals 1

    :try_start_0
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, p1, p2}, Ljava/math/BigDecimal;-><init>(J)V

    const-wide/16 p1, 0x0

    invoke-static {v0, p3, p1, p2}, Lcom/google/android/gms/internal/measurement/zzeb;->zza(Ljava/math/BigDecimal;Lcom/google/android/gms/internal/measurement/zzki;D)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private static zza(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;
    .locals 0
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

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

    :cond_4
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p1, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    :cond_5
    :goto_0
    packed-switch p2, :pswitch_data_0

    return-object v0

    :pswitch_0
    invoke-interface {p5, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p1, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_1

    :pswitch_2
    invoke-virtual {p1, p4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    goto :goto_1

    :pswitch_3
    invoke-virtual {p1, p4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    goto :goto_1

    :pswitch_4
    invoke-virtual {p1, p4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    goto :goto_1

    :pswitch_5
    if-eqz p3, :cond_6

    const/4 p2, 0x0

    goto :goto_2

    :cond_6
    const/16 p2, 0x42

    :goto_2
    :try_start_0
    invoke-static {p6, p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_0
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p1

    const-string p2, "Invalid regular expression in REGEXP audience filter. expression"

    invoke-virtual {p1, p2, p6}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

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

.method private final zza(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzki;)Ljava/lang/Boolean;
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzkc;->zzcj(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    :try_start_0
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, p1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    const-wide/16 v2, 0x0

    invoke-static {v0, p2, v2, v3}, Lcom/google/android/gms/internal/measurement/zzeb;->zza(Ljava/math/BigDecimal;Lcom/google/android/gms/internal/measurement/zzki;D)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    return-object v1
.end method

.method private final zza(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzkk;)Ljava/lang/Boolean;
    .locals 10
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p2, Lcom/google/android/gms/internal/measurement/zzkk;->zzast:Ljava/lang/Integer;

    if-eqz v1, :cond_c

    iget-object v1, p2, Lcom/google/android/gms/internal/measurement/zzkk;->zzast:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    iget-object v1, p2, Lcom/google/android/gms/internal/measurement/zzkk;->zzast:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x6

    if-ne v1, v2, :cond_3

    iget-object v1, p2, Lcom/google/android/gms/internal/measurement/zzkk;->zzasw:[Ljava/lang/String;

    if-eqz v1, :cond_2

    iget-object v1, p2, Lcom/google/android/gms/internal/measurement/zzkk;->zzasw:[Ljava/lang/String;

    array-length v1, v1

    if-nez v1, :cond_4

    :cond_2
    return-object v0

    :cond_3
    iget-object v1, p2, Lcom/google/android/gms/internal/measurement/zzkk;->zzasu:Ljava/lang/String;

    if-nez v1, :cond_4

    return-object v0

    :cond_4
    iget-object v1, p2, Lcom/google/android/gms/internal/measurement/zzkk;->zzast:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v1, p2, Lcom/google/android/gms/internal/measurement/zzkk;->zzasv:Ljava/lang/Boolean;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_5

    iget-object v1, p2, Lcom/google/android/gms/internal/measurement/zzkk;->zzasv:Ljava/lang/Boolean;

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

    :cond_6
    iget-object v1, p2, Lcom/google/android/gms/internal/measurement/zzkk;->zzasu:Ljava/lang/String;

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_7
    :goto_1
    iget-object v1, p2, Lcom/google/android/gms/internal/measurement/zzkk;->zzasu:Ljava/lang/String;

    :goto_2
    move-object v7, v1

    iget-object v1, p2, Lcom/google/android/gms/internal/measurement/zzkk;->zzasw:[Ljava/lang/String;

    if-nez v1, :cond_8

    move-object v8, v0

    goto :goto_4

    :cond_8
    iget-object p2, p2, Lcom/google/android/gms/internal/measurement/zzkk;->zzasw:[Ljava/lang/String;

    if-eqz v6, :cond_9

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    move-object v8, p2

    goto :goto_4

    :cond_9
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v2, p2

    :goto_3
    if-ge v3, v2, :cond_a

    aget-object v8, p2, v3

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

    invoke-direct/range {v3 .. v9}, Lcom/google/android/gms/internal/measurement/zzeb;->zza(Ljava/lang/String;IZLjava/lang/String;Ljava/util/List;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_c
    return-object v0
.end method

.method private static zza(Ljava/math/BigDecimal;Lcom/google/android/gms/internal/measurement/zzki;D)Ljava/lang/Boolean;
    .locals 7
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzki;->zzasl:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-eqz v0, :cond_10

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzki;->zzasl:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzki;->zzasl:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v2, 0x4

    if-ne v0, v2, :cond_2

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzki;->zzaso:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzki;->zzasp:Ljava/lang/String;

    if-nez v0, :cond_3

    :cond_1
    return-object v1

    :cond_2
    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzki;->zzasn:Ljava/lang/String;

    if-nez v0, :cond_3

    return-object v1

    :cond_3
    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzki;->zzasl:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzki;->zzasl:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne v3, v2, :cond_6

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzki;->zzaso:Ljava/lang/String;

    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/zzkc;->zzcj(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzki;->zzasp:Ljava/lang/String;

    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/zzkc;->zzcj(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_4

    return-object v1

    :cond_4
    :try_start_0
    new-instance v3, Ljava/math/BigDecimal;

    iget-object v4, p1, Lcom/google/android/gms/internal/measurement/zzki;->zzaso:Ljava/lang/String;

    invoke-direct {v3, v4}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    new-instance v4, Ljava/math/BigDecimal;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzki;->zzasp:Ljava/lang/String;

    invoke-direct {v4, p1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-object p1, v3

    move-object v3, v1

    goto :goto_0

    :catch_0
    :cond_5
    return-object v1

    :cond_6
    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzki;->zzasn:Ljava/lang/String;

    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/zzkc;->zzcj(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_7

    return-object v1

    :cond_7
    :try_start_1
    new-instance v3, Ljava/math/BigDecimal;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzki;->zzasn:Ljava/lang/String;

    invoke-direct {v3, p1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    move-object p1, v1

    move-object v4, p1

    :goto_0
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

    return-object v1

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

    new-instance p1, Ljava/math/BigDecimal;

    invoke-direct {p1, p2, p3}, Ljava/math/BigDecimal;-><init>(D)V

    new-instance v0, Ljava/math/BigDecimal;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(I)V

    invoke-virtual {p1, v0}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result p1

    if-ne p1, v6, :cond_b

    new-instance p1, Ljava/math/BigDecimal;

    invoke-direct {p1, p2, p3}, Ljava/math/BigDecimal;-><init>(D)V

    new-instance p2, Ljava/math/BigDecimal;

    invoke-direct {p2, v1}, Ljava/math/BigDecimal;-><init>(I)V

    invoke-virtual {p1, p2}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result p0

    if-ne p0, v2, :cond_b

    move v5, v6

    :cond_b
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_c
    invoke-virtual {p0, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result p0

    if-nez p0, :cond_d

    move v5, v6

    :cond_d
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :pswitch_2
    invoke-virtual {p0, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result p0

    if-ne p0, v6, :cond_e

    move v5, v6

    :cond_e
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :pswitch_3
    invoke-virtual {p0, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result p0

    if-ne p0, v2, :cond_f

    move v5, v6

    :cond_f
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :catch_1
    :cond_10
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method final zza(Ljava/lang/String;[Lcom/google/android/gms/internal/measurement/zzkp;[Lcom/google/android/gms/internal/measurement/zzku;)[Lcom/google/android/gms/internal/measurement/zzko;
    .locals 60
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v15, p1

    move-object/from16 v14, p2

    move-object/from16 v13, p3

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    new-instance v11, Ljava/util/HashSet;

    invoke-direct {v11}, Ljava/util/HashSet;-><init>()V

    new-instance v12, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v12}, Landroid/support/v4/util/ArrayMap;-><init>()V

    new-instance v9, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v9}, Landroid/support/v4/util/ArrayMap;-><init>()V

    new-instance v10, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v10}, Landroid/support/v4/util/ArrayMap;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjq;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    invoke-virtual {v2, v15}, Lcom/google/android/gms/internal/measurement/zzej;->zzbe(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/zzkt;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/BitSet;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v10, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/BitSet;

    if-nez v6, :cond_0

    new-instance v6, Ljava/util/BitSet;

    invoke-direct {v6}, Ljava/util/BitSet;-><init>()V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v9, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v7, Ljava/util/BitSet;

    invoke-direct {v7}, Ljava/util/BitSet;-><init>()V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v10, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    move-object/from16 v17, v2

    const/4 v8, 0x0

    :goto_1
    iget-object v2, v5, Lcom/google/android/gms/internal/measurement/zzkt;->zzauw:[J

    array-length v2, v2

    shl-int/lit8 v2, v2, 0x6

    if-ge v8, v2, :cond_3

    iget-object v2, v5, Lcom/google/android/gms/internal/measurement/zzkt;->zzauw:[J

    invoke-static {v2, v8}, Lcom/google/android/gms/internal/measurement/zzkc;->zza([JI)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    move-object/from16 v18, v3

    const-string v3, "Filter already evaluated. audience ID, filter ID"

    move-object/from16 v19, v9

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    move-object/from16 v20, v10

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v2, v3, v9, v10}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v8}, Ljava/util/BitSet;->set(I)V

    iget-object v2, v5, Lcom/google/android/gms/internal/measurement/zzkt;->zzaux:[J

    invoke-static {v2, v8}, Lcom/google/android/gms/internal/measurement/zzkc;->zza([JI)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v6, v8}, Ljava/util/BitSet;->set(I)V

    goto :goto_2

    :cond_1
    move-object/from16 v18, v3

    move-object/from16 v19, v9

    move-object/from16 v20, v10

    :cond_2
    :goto_2
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v3, v18

    move-object/from16 v9, v19

    move-object/from16 v10, v20

    goto :goto_1

    :cond_3
    move-object/from16 v18, v3

    move-object/from16 v19, v9

    move-object/from16 v20, v10

    new-instance v2, Lcom/google/android/gms/internal/measurement/zzko;

    invoke-direct {v2}, Lcom/google/android/gms/internal/measurement/zzko;-><init>()V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v12, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iput-object v4, v2, Lcom/google/android/gms/internal/measurement/zzko;->zzatk:Ljava/lang/Boolean;

    iput-object v5, v2, Lcom/google/android/gms/internal/measurement/zzko;->zzatj:Lcom/google/android/gms/internal/measurement/zzkt;

    new-instance v3, Lcom/google/android/gms/internal/measurement/zzkt;

    invoke-direct {v3}, Lcom/google/android/gms/internal/measurement/zzkt;-><init>()V

    iput-object v3, v2, Lcom/google/android/gms/internal/measurement/zzko;->zzati:Lcom/google/android/gms/internal/measurement/zzkt;

    iget-object v3, v2, Lcom/google/android/gms/internal/measurement/zzko;->zzati:Lcom/google/android/gms/internal/measurement/zzkt;

    invoke-static {v6}, Lcom/google/android/gms/internal/measurement/zzkc;->zza(Ljava/util/BitSet;)[J

    move-result-object v4

    iput-object v4, v3, Lcom/google/android/gms/internal/measurement/zzkt;->zzaux:[J

    iget-object v2, v2, Lcom/google/android/gms/internal/measurement/zzko;->zzati:Lcom/google/android/gms/internal/measurement/zzkt;

    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/zzkc;->zza(Ljava/util/BitSet;)[J

    move-result-object v3

    iput-object v3, v2, Lcom/google/android/gms/internal/measurement/zzkt;->zzauw:[J

    move-object/from16 v2, v17

    move-object/from16 v3, v18

    goto/16 :goto_0

    :cond_4
    move-object/from16 v19, v9

    move-object/from16 v20, v10

    if-eqz v14, :cond_3e

    new-instance v5, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v5}, Landroid/support/v4/util/ArrayMap;-><init>()V

    array-length v6, v14

    const/4 v2, 0x0

    const/4 v8, 0x0

    const/16 v17, 0x0

    const-wide/16 v21, 0x0

    :goto_3
    if-ge v2, v6, :cond_3e

    aget-object v9, v14, v2

    iget-object v10, v9, Lcom/google/android/gms/internal/measurement/zzkp;->name:Ljava/lang/String;

    iget-object v7, v9, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgh()Lcom/google/android/gms/internal/measurement/zzeg;

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/internal/measurement/zzey;->zzaic:Lcom/google/android/gms/internal/measurement/zzey$zza;

    invoke-virtual {v3, v15, v4}, Lcom/google/android/gms/internal/measurement/zzeg;->zzd(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzey$zza;)Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjq;->zzjc()Lcom/google/android/gms/internal/measurement/zzjy;

    const-string v3, "_eid"

    invoke-static {v9, v3}, Lcom/google/android/gms/internal/measurement/zzjy;->zzb(Lcom/google/android/gms/internal/measurement/zzkp;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/Long;

    if-eqz v4, :cond_5

    const/4 v3, 0x1

    goto :goto_4

    :cond_5
    const/4 v3, 0x0

    :goto_4
    if-eqz v3, :cond_6

    move/from16 v26, v2

    const-string v2, "_ep"

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    const/4 v2, 0x1

    goto :goto_5

    :cond_6
    move/from16 v26, v2

    :cond_7
    const/4 v2, 0x0

    :goto_5
    if-eqz v2, :cond_13

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjq;->zzjc()Lcom/google/android/gms/internal/measurement/zzjy;

    const-string v2, "_en"

    invoke-static {v9, v2}, Lcom/google/android/gms/internal/measurement/zzjy;->zzb(Lcom/google/android/gms/internal/measurement/zzkp;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Ljava/lang/String;

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v3, "Extra parameter without an event name. eventId"

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v31, v5

    move/from16 v23, v6

    move/from16 v18, v26

    const/16 v16, 0x0

    goto/16 :goto_12

    :cond_8
    if-eqz v17, :cond_a

    if-eqz v8, :cond_a

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v27

    cmp-long v18, v2, v27

    if-eqz v18, :cond_9

    goto :goto_6

    :cond_9
    move-object/from16 v59, v17

    move-object/from16 v17, v8

    move-object/from16 v8, v59

    goto :goto_7

    :cond_a
    :goto_6
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjq;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    invoke-virtual {v2, v15, v4}, Lcom/google/android/gms/internal/measurement/zzej;->zza(Ljava/lang/String;Ljava/lang/Long;)Landroid/util/Pair;

    move-result-object v2

    if-eqz v2, :cond_12

    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    if-nez v3, :cond_b

    goto/16 :goto_11

    :cond_b
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzkp;

    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v21

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjq;->zzjc()Lcom/google/android/gms/internal/measurement/zzjy;

    const-string v2, "_eid"

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/zzjy;->zzb(Lcom/google/android/gms/internal/measurement/zzkp;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    move-object/from16 v17, v2

    move-object v8, v3

    :goto_7
    const-wide/16 v2, 0x1

    sub-long v27, v21, v2

    const-wide/16 v21, 0x0

    cmp-long v2, v27, v21

    if-gtz v2, :cond_c

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjq;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v3

    const-string v4, "Clearing complex main event info. appId"

    invoke-virtual {v3, v4, v15}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_0
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzej;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    const-string v4, "delete from main_event_params where app_id=?"
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_2

    move-object/from16 v30, v5

    move-object/from16 v29, v7

    const/4 v7, 0x1

    :try_start_1
    new-array v5, v7, [Ljava/lang/String;
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1

    const/16 v16, 0x0

    :try_start_2
    aput-object v15, v5, v16

    invoke-virtual {v3, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_a

    :catch_0
    move-exception v0

    goto :goto_9

    :catch_1
    move-exception v0

    goto :goto_8

    :catch_2
    move-exception v0

    move-object/from16 v30, v5

    move-object/from16 v29, v7

    const/4 v7, 0x1

    :goto_8
    const/16 v16, 0x0

    :goto_9
    move-object v3, v0

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v4, "Error clearing complex main event"

    invoke-virtual {v2, v4, v3}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_a
    move/from16 v23, v6

    move v14, v7

    move/from16 v18, v26

    move-object/from16 v13, v29

    move-object/from16 v31, v30

    goto :goto_b

    :cond_c
    move-object/from16 v30, v5

    move-object/from16 v29, v7

    const/4 v7, 0x1

    const/16 v16, 0x0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjq;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    move/from16 v18, v26

    move-wide/from16 v13, v21

    move-object v3, v15

    move/from16 v23, v6

    move-object/from16 v31, v30

    move-wide/from16 v5, v27

    move v14, v7

    move-object/from16 v13, v29

    move-object v7, v8

    invoke-virtual/range {v2 .. v7}, Lcom/google/android/gms/internal/measurement/zzej;->zza(Ljava/lang/String;Ljava/lang/Long;JLcom/google/android/gms/internal/measurement/zzkp;)Z

    :goto_b
    iget-object v2, v8, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    array-length v2, v2

    array-length v3, v13

    add-int/2addr v2, v3

    new-array v2, v2, [Lcom/google/android/gms/internal/measurement/zzkq;

    iget-object v3, v8, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    array-length v4, v3

    move/from16 v5, v16

    move v6, v5

    :goto_c
    if-ge v5, v4, :cond_e

    aget-object v7, v3, v5

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjq;->zzjc()Lcom/google/android/gms/internal/measurement/zzjy;

    iget-object v14, v7, Lcom/google/android/gms/internal/measurement/zzkq;->name:Ljava/lang/String;

    invoke-static {v9, v14}, Lcom/google/android/gms/internal/measurement/zzjy;->zza(Lcom/google/android/gms/internal/measurement/zzkp;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzkq;

    move-result-object v14

    if-nez v14, :cond_d

    add-int/lit8 v14, v6, 0x1

    aput-object v7, v2, v6

    move v6, v14

    :cond_d
    add-int/lit8 v5, v5, 0x1

    const/4 v14, 0x1

    goto :goto_c

    :cond_e
    if-lez v6, :cond_11

    array-length v3, v13

    move/from16 v4, v16

    :goto_d
    if-ge v4, v3, :cond_f

    aget-object v5, v13, v4

    add-int/lit8 v7, v6, 0x1

    aput-object v5, v2, v6

    add-int/lit8 v4, v4, 0x1

    move v6, v7

    goto :goto_d

    :cond_f
    array-length v3, v2

    if-ne v6, v3, :cond_10

    :goto_e
    move-object v7, v2

    goto :goto_f

    :cond_10
    invoke-static {v2, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lcom/google/android/gms/internal/measurement/zzkq;

    goto :goto_e

    :goto_f
    move-object v13, v7

    goto :goto_10

    :cond_11
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v3, "No unique parameters in main event. eventName"

    invoke-virtual {v2, v3, v10}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_10
    move-object v14, v10

    move-object/from16 v21, v17

    const-wide/16 v24, 0x0

    move-object/from16 v17, v8

    goto/16 :goto_14

    :cond_12
    :goto_11
    move-object/from16 v31, v5

    move/from16 v23, v6

    move/from16 v18, v26

    const/16 v16, 0x0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v3, "Extra parameter without existing main event. eventName, eventId"

    invoke-virtual {v2, v3, v10, v4}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_12
    move-object/from16 v46, v12

    move-object v4, v15

    move-object/from16 v45, v19

    move-object/from16 v44, v20

    move-object/from16 v40, v31

    const-wide/16 v19, 0x0

    goto/16 :goto_2d

    :cond_13
    move-object/from16 v31, v5

    move/from16 v23, v6

    move-object v13, v7

    move/from16 v18, v26

    const/16 v16, 0x0

    if-eqz v3, :cond_17

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjq;->zzjc()Lcom/google/android/gms/internal/measurement/zzjy;

    const-string v2, "_epc"

    const-wide/16 v7, 0x0

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v9, v2}, Lcom/google/android/gms/internal/measurement/zzjy;->zzb(Lcom/google/android/gms/internal/measurement/zzkp;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_14

    move-object v2, v3

    :cond_14
    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v21

    cmp-long v2, v21, v7

    if-gtz v2, :cond_15

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v3, "Complex event with zero extra param count. eventName"

    invoke-virtual {v2, v3, v10}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    move-object v14, v4

    move-wide/from16 v24, v7

    goto :goto_13

    :cond_15
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjq;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    move-object v3, v15

    move-object v14, v4

    move-wide/from16 v5, v21

    move-wide/from16 v24, v7

    move-object v7, v9

    invoke-virtual/range {v2 .. v7}, Lcom/google/android/gms/internal/measurement/zzej;->zza(Ljava/lang/String;Ljava/lang/Long;JLcom/google/android/gms/internal/measurement/zzkp;)Z

    :goto_13
    move-object/from16 v17, v9

    move-wide/from16 v27, v21

    move-object/from16 v21, v14

    move-object v14, v10

    goto :goto_14

    :cond_16
    move/from16 v18, v2

    move-object/from16 v31, v5

    move/from16 v23, v6

    move-object v13, v7

    const/16 v16, 0x0

    :cond_17
    const-wide/16 v24, 0x0

    move-object v14, v10

    move-wide/from16 v27, v21

    move-object/from16 v21, v8

    :goto_14
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjq;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    iget-object v3, v9, Lcom/google/android/gms/internal/measurement/zzkp;->name:Ljava/lang/String;

    invoke-virtual {v2, v15, v3}, Lcom/google/android/gms/internal/measurement/zzej;->zzf(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzes;

    move-result-object v2

    if-nez v2, :cond_18

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v3, "Event aggregate wasn\'t created during raw event logging. appId, event"

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v5

    invoke-virtual {v5, v14}, Lcom/google/android/gms/internal/measurement/zzff;->zzbi(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v3, v4, v5}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v22, Lcom/google/android/gms/internal/measurement/zzes;

    iget-object v4, v9, Lcom/google/android/gms/internal/measurement/zzkp;->name:Ljava/lang/String;

    const-wide/16 v5, 0x1

    const-wide/16 v7, 0x1

    iget-object v2, v9, Lcom/google/android/gms/internal/measurement/zzkp;->zzatn:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    const-wide/16 v29, 0x0

    const/16 v26, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    move-object/from16 v2, v22

    move-object v3, v15

    move-object/from16 v34, v19

    move-object/from16 v35, v20

    move-object/from16 v36, v11

    move-object/from16 v37, v12

    move-wide/from16 v11, v29

    move-object/from16 v38, v13

    move-wide/from16 v19, v24

    move-object/from16 v13, v26

    move-object/from16 v39, v14

    move-object/from16 v14, v32

    move-object/from16 v15, v33

    invoke-direct/range {v2 .. v15}, Lcom/google/android/gms/internal/measurement/zzes;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    goto :goto_15

    :cond_18
    move-object/from16 v36, v11

    move-object/from16 v37, v12

    move-object/from16 v38, v13

    move-object/from16 v39, v14

    move-object/from16 v34, v19

    move-object/from16 v35, v20

    move-wide/from16 v19, v24

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzes;->zzii()Lcom/google/android/gms/internal/measurement/zzes;

    move-result-object v22

    move-object/from16 v2, v22

    :goto_15
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjq;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/measurement/zzej;->zza(Lcom/google/android/gms/internal/measurement/zzes;)V

    iget-wide v2, v2, Lcom/google/android/gms/internal/measurement/zzes;->zzafs:J

    move-object/from16 v4, v31

    move-object/from16 v10, v39

    invoke-interface {v4, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map;

    if-nez v5, :cond_1a

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjq;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v5

    move-object/from16 v6, p1

    invoke-virtual {v5, v6, v10}, Lcom/google/android/gms/internal/measurement/zzej;->zzk(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    if-nez v5, :cond_19

    new-instance v5, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v5}, Landroid/support/v4/util/ArrayMap;-><init>()V

    :cond_19
    invoke-interface {v4, v10, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_16

    :cond_1a
    move-object/from16 v6, p1

    :goto_16
    invoke-interface {v5}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_17
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3d

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    move-object/from16 v11, v36

    invoke-interface {v11, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1b

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v9

    const-string v12, "Skipping failed audience ID"

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v9, v12, v8}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v36, v11

    goto :goto_17

    :cond_1b
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    move-object/from16 v12, v37

    invoke-interface {v12, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/zzko;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    move-object/from16 v14, v34

    invoke-interface {v14, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/BitSet;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    move-object/from16 v40, v4

    move-object/from16 v4, v35

    invoke-interface {v4, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/util/BitSet;

    if-nez v9, :cond_1c

    new-instance v9, Lcom/google/android/gms/internal/measurement/zzko;

    invoke-direct {v9}, Lcom/google/android/gms/internal/measurement/zzko;-><init>()V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v12, v13, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v13, 0x1

    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    iput-object v15, v9, Lcom/google/android/gms/internal/measurement/zzko;->zzatk:Ljava/lang/Boolean;

    new-instance v9, Ljava/util/BitSet;

    invoke-direct {v9}, Ljava/util/BitSet;-><init>()V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v14, v15, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v15, Ljava/util/BitSet;

    invoke-direct {v15}, Ljava/util/BitSet;-><init>()V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v4, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v13, v9

    :cond_1c
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v5, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_18
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_3c

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v41, v5

    move-object/from16 v5, v16

    check-cast v5, Lcom/google/android/gms/internal/measurement/zzkg;

    move-object/from16 v42, v7

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v7

    move-object/from16 v43, v9

    const/4 v9, 0x2

    invoke-virtual {v7, v9}, Lcom/google/android/gms/internal/measurement/zzfh;->isLoggable(I)Z

    move-result v7

    if-eqz v7, :cond_1d

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v7

    const-string v9, "Evaluating filter. audience, filter, event"

    move-object/from16 v44, v4

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v45, v14

    iget-object v14, v5, Lcom/google/android/gms/internal/measurement/zzkg;->zzasb:Ljava/lang/Integer;

    move-object/from16 v46, v12

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v12

    iget-object v6, v5, Lcom/google/android/gms/internal/measurement/zzkg;->zzasc:Ljava/lang/String;

    invoke-virtual {v12, v6}, Lcom/google/android/gms/internal/measurement/zzff;->zzbi(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v9, v4, v14, v6}, Lcom/google/android/gms/internal/measurement/zzfj;->zzd(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v4

    const-string v6, "Filter definition"

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjq;->zzjc()Lcom/google/android/gms/internal/measurement/zzjy;

    move-result-object v7

    invoke-virtual {v7, v5}, Lcom/google/android/gms/internal/measurement/zzjy;->zza(Lcom/google/android/gms/internal/measurement/zzkg;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v6, v7}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_19

    :cond_1d
    move-object/from16 v44, v4

    move-object/from16 v46, v12

    move-object/from16 v45, v14

    :goto_19
    iget-object v4, v5, Lcom/google/android/gms/internal/measurement/zzkg;->zzasb:Ljava/lang/Integer;

    if-eqz v4, :cond_3b

    iget-object v4, v5, Lcom/google/android/gms/internal/measurement/zzkg;->zzasb:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/16 v6, 0x100

    if-le v4, v6, :cond_1e

    goto/16 :goto_2c

    :cond_1e
    iget-object v4, v5, Lcom/google/android/gms/internal/measurement/zzkg;->zzasb:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v13, v4}, Ljava/util/BitSet;->get(I)Z

    move-result v4

    if-eqz v4, :cond_1f

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v4

    const-string v7, "Event filter already evaluated true. audience ID, filter ID"

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    iget-object v5, v5, Lcom/google/android/gms/internal/measurement/zzkg;->zzasb:Ljava/lang/Integer;

    invoke-virtual {v4, v7, v9, v5}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v5, v41

    move-object/from16 v7, v42

    move-object/from16 v9, v43

    move-object/from16 v4, v44

    move-object/from16 v14, v45

    move-object/from16 v12, v46

    :goto_1a
    move-object/from16 v6, p1

    goto/16 :goto_18

    :cond_1f
    iget-object v4, v5, Lcom/google/android/gms/internal/measurement/zzkg;->zzasf:Lcom/google/android/gms/internal/measurement/zzki;

    if-eqz v4, :cond_21

    iget-object v4, v5, Lcom/google/android/gms/internal/measurement/zzkg;->zzasf:Lcom/google/android/gms/internal/measurement/zzki;

    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/gms/internal/measurement/zzeb;->zza(JLcom/google/android/gms/internal/measurement/zzki;)Ljava/lang/Boolean;

    move-result-object v4

    if-nez v4, :cond_20

    :goto_1b
    move-wide/from16 v47, v2

    move-object/from16 v6, v38

    :goto_1c
    const/4 v3, 0x0

    goto/16 :goto_29

    :cond_20
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_21

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    move-wide/from16 v47, v2

    move-object v3, v7

    move-object/from16 v6, v38

    goto/16 :goto_29

    :cond_21
    const/4 v4, 0x0

    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    iget-object v9, v5, Lcom/google/android/gms/internal/measurement/zzkg;->zzasd:[Lcom/google/android/gms/internal/measurement/zzkh;

    array-length v12, v9

    move v14, v4

    :goto_1d
    if-ge v14, v12, :cond_23

    aget-object v6, v9, v14

    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/zzkh;->zzask:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_22

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v4

    const-string v6, "null or empty param name in filter. event"

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v7

    invoke-virtual {v7, v10}, Lcom/google/android/gms/internal/measurement/zzff;->zzbi(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v6, v7}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1b

    :cond_22
    iget-object v4, v6, Lcom/google/android/gms/internal/measurement/zzkh;->zzask:Ljava/lang/String;

    invoke-interface {v7, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v14, v14, 0x1

    const/4 v4, 0x0

    const/16 v6, 0x100

    goto :goto_1d

    :cond_23
    new-instance v4, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v4}, Landroid/support/v4/util/ArrayMap;-><init>()V

    move-object/from16 v6, v38

    array-length v9, v6

    const/4 v12, 0x0

    :goto_1e
    if-ge v12, v9, :cond_28

    aget-object v14, v6, v12

    move-wide/from16 v47, v2

    iget-object v2, v14, Lcom/google/android/gms/internal/measurement/zzkq;->name:Ljava/lang/String;

    invoke-interface {v7, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_27

    iget-object v2, v14, Lcom/google/android/gms/internal/measurement/zzkq;->zzatq:Ljava/lang/Long;

    if-eqz v2, :cond_24

    iget-object v2, v14, Lcom/google/android/gms/internal/measurement/zzkq;->name:Ljava/lang/String;

    iget-object v3, v14, Lcom/google/android/gms/internal/measurement/zzkq;->zzatq:Ljava/lang/Long;

    :goto_1f
    invoke-interface {v4, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_21

    :cond_24
    iget-object v2, v14, Lcom/google/android/gms/internal/measurement/zzkq;->zzaro:Ljava/lang/Double;

    if-eqz v2, :cond_25

    iget-object v2, v14, Lcom/google/android/gms/internal/measurement/zzkq;->name:Ljava/lang/String;

    iget-object v3, v14, Lcom/google/android/gms/internal/measurement/zzkq;->zzaro:Ljava/lang/Double;

    goto :goto_1f

    :cond_25
    iget-object v2, v14, Lcom/google/android/gms/internal/measurement/zzkq;->zzajo:Ljava/lang/String;

    if-eqz v2, :cond_26

    iget-object v2, v14, Lcom/google/android/gms/internal/measurement/zzkq;->name:Ljava/lang/String;

    iget-object v3, v14, Lcom/google/android/gms/internal/measurement/zzkq;->zzajo:Ljava/lang/String;

    goto :goto_1f

    :cond_26
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v3, "Unknown value for param. event, param"

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v4

    invoke-virtual {v4, v10}, Lcom/google/android/gms/internal/measurement/zzff;->zzbi(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v7

    iget-object v9, v14, Lcom/google/android/gms/internal/measurement/zzkq;->name:Ljava/lang/String;

    invoke-virtual {v7, v9}, Lcom/google/android/gms/internal/measurement/zzff;->zzbj(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    :goto_20
    invoke-virtual {v2, v3, v4, v7}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1c

    :cond_27
    :goto_21
    add-int/lit8 v12, v12, 0x1

    move-wide/from16 v2, v47

    goto :goto_1e

    :cond_28
    move-wide/from16 v47, v2

    iget-object v2, v5, Lcom/google/android/gms/internal/measurement/zzkg;->zzasd:[Lcom/google/android/gms/internal/measurement/zzkh;

    array-length v3, v2

    const/4 v7, 0x0

    :goto_22
    if-ge v7, v3, :cond_37

    aget-object v9, v2, v7

    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v14, v9, Lcom/google/android/gms/internal/measurement/zzkh;->zzasj:Ljava/lang/Boolean;

    invoke-virtual {v12, v14}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v12

    iget-object v14, v9, Lcom/google/android/gms/internal/measurement/zzkh;->zzask:Ljava/lang/String;

    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v16

    if-eqz v16, :cond_29

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v3, "Event has empty param name. event"

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v4

    invoke-virtual {v4, v10}, Lcom/google/android/gms/internal/measurement/zzff;->zzbi(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_1c

    :cond_29
    move-object/from16 v49, v2

    invoke-interface {v4, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move/from16 v50, v3

    instance-of v3, v2, Ljava/lang/Long;

    if-eqz v3, :cond_2c

    iget-object v3, v9, Lcom/google/android/gms/internal/measurement/zzkh;->zzasi:Lcom/google/android/gms/internal/measurement/zzki;

    if-nez v3, :cond_2a

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v3, "No number filter for long param. event, param"

    :goto_23
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v4

    invoke-virtual {v4, v10}, Lcom/google/android/gms/internal/measurement/zzff;->zzbi(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v7

    invoke-virtual {v7, v14}, Lcom/google/android/gms/internal/measurement/zzff;->zzbj(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    goto :goto_20

    :cond_2a
    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iget-object v9, v9, Lcom/google/android/gms/internal/measurement/zzkh;->zzasi:Lcom/google/android/gms/internal/measurement/zzki;

    invoke-direct {v1, v2, v3, v9}, Lcom/google/android/gms/internal/measurement/zzeb;->zza(JLcom/google/android/gms/internal/measurement/zzki;)Ljava/lang/Boolean;

    move-result-object v2

    if-nez v2, :cond_2b

    :goto_24
    goto/16 :goto_1c

    :cond_2b
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    xor-int/2addr v2, v12

    if-eqz v2, :cond_32

    :goto_25
    goto/16 :goto_27

    :cond_2c
    instance-of v3, v2, Ljava/lang/Double;

    if-eqz v3, :cond_2f

    iget-object v3, v9, Lcom/google/android/gms/internal/measurement/zzkh;->zzasi:Lcom/google/android/gms/internal/measurement/zzki;

    if-nez v3, :cond_2d

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v3, "No number filter for double param. event, param"

    goto :goto_23

    :cond_2d
    check-cast v2, Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    iget-object v9, v9, Lcom/google/android/gms/internal/measurement/zzkh;->zzasi:Lcom/google/android/gms/internal/measurement/zzki;

    invoke-direct {v1, v2, v3, v9}, Lcom/google/android/gms/internal/measurement/zzeb;->zza(DLcom/google/android/gms/internal/measurement/zzki;)Ljava/lang/Boolean;

    move-result-object v2

    if-nez v2, :cond_2e

    goto :goto_24

    :cond_2e
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    xor-int/2addr v2, v12

    if-eqz v2, :cond_32

    goto :goto_25

    :cond_2f
    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_35

    iget-object v3, v9, Lcom/google/android/gms/internal/measurement/zzkh;->zzash:Lcom/google/android/gms/internal/measurement/zzkk;

    if-eqz v3, :cond_30

    check-cast v2, Ljava/lang/String;

    iget-object v3, v9, Lcom/google/android/gms/internal/measurement/zzkh;->zzash:Lcom/google/android/gms/internal/measurement/zzkk;

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzeb;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzkk;)Ljava/lang/Boolean;

    move-result-object v2

    goto :goto_26

    :cond_30
    iget-object v3, v9, Lcom/google/android/gms/internal/measurement/zzkh;->zzasi:Lcom/google/android/gms/internal/measurement/zzki;

    if-eqz v3, :cond_34

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/zzkc;->zzcj(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_33

    iget-object v3, v9, Lcom/google/android/gms/internal/measurement/zzkh;->zzasi:Lcom/google/android/gms/internal/measurement/zzki;

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzeb;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzki;)Ljava/lang/Boolean;

    move-result-object v2

    :goto_26
    if-nez v2, :cond_31

    goto :goto_24

    :cond_31
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    xor-int/2addr v2, v12

    if-eqz v2, :cond_32

    goto :goto_25

    :cond_32
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v2, v49

    move/from16 v3, v50

    goto/16 :goto_22

    :cond_33
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v3, "Invalid param value for number filter. event, param"

    goto/16 :goto_23

    :cond_34
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v3, "No filter for String param. event, param"

    goto/16 :goto_23

    :cond_35
    if-nez v2, :cond_36

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v3, "Missing param for filter. event, param"

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v4

    invoke-virtual {v4, v10}, Lcom/google/android/gms/internal/measurement/zzff;->zzbi(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v7

    invoke-virtual {v7, v14}, Lcom/google/android/gms/internal/measurement/zzff;->zzbj(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v3, v4, v7}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_27
    const/4 v2, 0x0

    goto :goto_28

    :cond_36
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v3, "Unknown param type. event, param"

    goto/16 :goto_23

    :cond_37
    const/4 v2, 0x1

    :goto_28
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    :goto_29
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v4, "Event filter result"

    if-nez v3, :cond_38

    const-string v7, "null"

    goto :goto_2a

    :cond_38
    move-object v7, v3

    :goto_2a
    invoke-virtual {v2, v4, v7}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    if-nez v3, :cond_3a

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v11, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_39
    :goto_2b
    move-object/from16 v38, v6

    move-object/from16 v5, v41

    move-object/from16 v7, v42

    move-object/from16 v9, v43

    move-object/from16 v4, v44

    move-object/from16 v14, v45

    move-object/from16 v12, v46

    move-wide/from16 v2, v47

    goto/16 :goto_1a

    :cond_3a
    iget-object v2, v5, Lcom/google/android/gms/internal/measurement/zzkg;->zzasb:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v15, v2}, Ljava/util/BitSet;->set(I)V

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_39

    iget-object v2, v5, Lcom/google/android/gms/internal/measurement/zzkg;->zzasb:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v13, v2}, Ljava/util/BitSet;->set(I)V

    goto :goto_2b

    :cond_3b
    :goto_2c
    move-wide/from16 v47, v2

    move-object/from16 v6, v38

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v3, "Invalid event filter ID. appId, id"

    move-object/from16 v4, p1

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    iget-object v5, v5, Lcom/google/android/gms/internal/measurement/zzkg;->zzasb:Ljava/lang/Integer;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v3, v7, v5}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v38, v6

    move-object/from16 v5, v41

    move-object/from16 v7, v42

    move-object/from16 v9, v43

    move-object/from16 v14, v45

    move-object/from16 v12, v46

    move-wide/from16 v2, v47

    move-object v6, v4

    move-object/from16 v4, v44

    goto/16 :goto_18

    :cond_3c
    move-object/from16 v44, v4

    move-object v4, v6

    move-object/from16 v36, v11

    move-object/from16 v37, v12

    move-object/from16 v34, v14

    move-object/from16 v4, v40

    move-object/from16 v35, v44

    goto/16 :goto_17

    :cond_3d
    move-object/from16 v40, v4

    move-object v4, v6

    move-object/from16 v45, v34

    move-object/from16 v44, v35

    move-object/from16 v11, v36

    move-object/from16 v46, v37

    move-object/from16 v8, v21

    move-wide/from16 v21, v27

    :goto_2d
    add-int/lit8 v2, v18, 0x1

    move-object/from16 v14, p2

    move-object v15, v4

    move/from16 v6, v23

    move-object/from16 v5, v40

    move-object/from16 v20, v44

    move-object/from16 v19, v45

    move-object/from16 v12, v46

    move-object/from16 v13, p3

    goto/16 :goto_3

    :cond_3e
    move-object/from16 v46, v12

    move-object v4, v15

    move-object/from16 v45, v19

    move-object/from16 v44, v20

    move-object v2, v13

    if-eqz v2, :cond_55

    new-instance v3, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v3}, Landroid/support/v4/util/ArrayMap;-><init>()V

    array-length v5, v2

    const/4 v6, 0x0

    :goto_2e
    if-ge v6, v5, :cond_55

    aget-object v7, v2, v6

    iget-object v8, v7, Lcom/google/android/gms/internal/measurement/zzku;->name:Ljava/lang/String;

    invoke-interface {v3, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map;

    if-nez v8, :cond_40

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjq;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v8

    iget-object v9, v7, Lcom/google/android/gms/internal/measurement/zzku;->name:Ljava/lang/String;

    invoke-virtual {v8, v4, v9}, Lcom/google/android/gms/internal/measurement/zzej;->zzl(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v8

    if-nez v8, :cond_3f

    new-instance v8, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v8}, Landroid/support/v4/util/ArrayMap;-><init>()V

    :cond_3f
    iget-object v9, v7, Lcom/google/android/gms/internal/measurement/zzku;->name:Ljava/lang/String;

    invoke-interface {v3, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_40
    invoke-interface {v8}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_2f
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_54

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_41

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v12

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v12

    const-string v13, "Skipping failed audience ID"

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v12, v13, v10}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2f

    :cond_41
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    move-object/from16 v13, v46

    invoke-interface {v13, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/google/android/gms/internal/measurement/zzko;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    move-object/from16 v15, v45

    invoke-interface {v15, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/BitSet;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v51, v3

    move-object/from16 v3, v44

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/BitSet;

    if-nez v12, :cond_42

    new-instance v2, Lcom/google/android/gms/internal/measurement/zzko;

    invoke-direct {v2}, Lcom/google/android/gms/internal/measurement/zzko;-><init>()V

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v13, v12, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v12, 0x1

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v14

    iput-object v14, v2, Lcom/google/android/gms/internal/measurement/zzko;->zzatk:Ljava/lang/Boolean;

    new-instance v14, Ljava/util/BitSet;

    invoke-direct {v14}, Ljava/util/BitSet;-><init>()V

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v15, v2, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/util/BitSet;

    invoke-direct {v2}, Ljava/util/BitSet;-><init>()V

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v3, v12, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_42
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v8, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/List;

    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_30
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_53

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move/from16 v52, v5

    move-object/from16 v5, v16

    check-cast v5, Lcom/google/android/gms/internal/measurement/zzkj;

    move-object/from16 v53, v8

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v8

    move-object/from16 v54, v9

    const/4 v9, 0x2

    invoke-virtual {v8, v9}, Lcom/google/android/gms/internal/measurement/zzfh;->isLoggable(I)Z

    move-result v8

    if-eqz v8, :cond_43

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v8

    const-string v9, "Evaluating filter. audience, filter, property"

    move-object/from16 v55, v12

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    move-object/from16 v56, v3

    iget-object v3, v5, Lcom/google/android/gms/internal/measurement/zzkj;->zzasb:Ljava/lang/Integer;

    move-object/from16 v57, v13

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v13

    move-object/from16 v58, v15

    iget-object v15, v5, Lcom/google/android/gms/internal/measurement/zzkj;->zzasr:Ljava/lang/String;

    invoke-virtual {v13, v15}, Lcom/google/android/gms/internal/measurement/zzff;->zzbk(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v8, v9, v12, v3, v13}, Lcom/google/android/gms/internal/measurement/zzfj;->zzd(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v3

    const-string v8, "Filter definition"

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjq;->zzjc()Lcom/google/android/gms/internal/measurement/zzjy;

    move-result-object v9

    invoke-virtual {v9, v5}, Lcom/google/android/gms/internal/measurement/zzjy;->zza(Lcom/google/android/gms/internal/measurement/zzkj;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v8, v9}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_31

    :cond_43
    move-object/from16 v56, v3

    move-object/from16 v55, v12

    move-object/from16 v57, v13

    move-object/from16 v58, v15

    :goto_31
    iget-object v3, v5, Lcom/google/android/gms/internal/measurement/zzkj;->zzasb:Ljava/lang/Integer;

    if-eqz v3, :cond_52

    iget-object v3, v5, Lcom/google/android/gms/internal/measurement/zzkj;->zzasb:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v8, 0x100

    if-le v3, v8, :cond_44

    goto/16 :goto_38

    :cond_44
    iget-object v3, v5, Lcom/google/android/gms/internal/measurement/zzkj;->zzasb:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v14, v3}, Ljava/util/BitSet;->get(I)Z

    move-result v3

    if-eqz v3, :cond_46

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v3

    const-string v9, "Property filter already evaluated true. audience ID, filter ID"

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    iget-object v5, v5, Lcom/google/android/gms/internal/measurement/zzkj;->zzasb:Ljava/lang/Integer;

    invoke-virtual {v3, v9, v12, v5}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_45
    :goto_32
    move/from16 v5, v52

    move-object/from16 v8, v53

    move-object/from16 v9, v54

    move-object/from16 v12, v55

    move-object/from16 v3, v56

    move-object/from16 v13, v57

    move-object/from16 v15, v58

    goto/16 :goto_30

    :cond_46
    iget-object v3, v5, Lcom/google/android/gms/internal/measurement/zzkj;->zzass:Lcom/google/android/gms/internal/measurement/zzkh;

    if-nez v3, :cond_47

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v3

    const-string v9, "Missing property filter. property"

    :goto_33
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v12

    iget-object v13, v7, Lcom/google/android/gms/internal/measurement/zzku;->name:Ljava/lang/String;

    invoke-virtual {v12, v13}, Lcom/google/android/gms/internal/measurement/zzff;->zzbk(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v9, v12}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_34
    const/4 v3, 0x0

    goto/16 :goto_36

    :cond_47
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v12, v3, Lcom/google/android/gms/internal/measurement/zzkh;->zzasj:Ljava/lang/Boolean;

    invoke-virtual {v9, v12}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v9

    iget-object v12, v7, Lcom/google/android/gms/internal/measurement/zzku;->zzatq:Ljava/lang/Long;

    if-eqz v12, :cond_49

    iget-object v12, v3, Lcom/google/android/gms/internal/measurement/zzkh;->zzasi:Lcom/google/android/gms/internal/measurement/zzki;

    if-nez v12, :cond_48

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v3

    const-string v9, "No number filter for long property. property"

    goto :goto_33

    :cond_48
    iget-object v12, v7, Lcom/google/android/gms/internal/measurement/zzku;->zzatq:Ljava/lang/Long;

    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    iget-object v3, v3, Lcom/google/android/gms/internal/measurement/zzkh;->zzasi:Lcom/google/android/gms/internal/measurement/zzki;

    invoke-direct {v1, v12, v13, v3}, Lcom/google/android/gms/internal/measurement/zzeb;->zza(JLcom/google/android/gms/internal/measurement/zzki;)Ljava/lang/Boolean;

    move-result-object v3

    :goto_35
    invoke-static {v3, v9}, Lcom/google/android/gms/internal/measurement/zzeb;->zza(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;

    move-result-object v3

    goto/16 :goto_36

    :cond_49
    iget-object v12, v7, Lcom/google/android/gms/internal/measurement/zzku;->zzaro:Ljava/lang/Double;

    if-eqz v12, :cond_4b

    iget-object v12, v3, Lcom/google/android/gms/internal/measurement/zzkh;->zzasi:Lcom/google/android/gms/internal/measurement/zzki;

    if-nez v12, :cond_4a

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v3

    const-string v9, "No number filter for double property. property"

    goto :goto_33

    :cond_4a
    iget-object v12, v7, Lcom/google/android/gms/internal/measurement/zzku;->zzaro:Ljava/lang/Double;

    invoke-virtual {v12}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v12

    iget-object v3, v3, Lcom/google/android/gms/internal/measurement/zzkh;->zzasi:Lcom/google/android/gms/internal/measurement/zzki;

    invoke-direct {v1, v12, v13, v3}, Lcom/google/android/gms/internal/measurement/zzeb;->zza(DLcom/google/android/gms/internal/measurement/zzki;)Ljava/lang/Boolean;

    move-result-object v3

    goto :goto_35

    :cond_4b
    iget-object v12, v7, Lcom/google/android/gms/internal/measurement/zzku;->zzajo:Ljava/lang/String;

    if-eqz v12, :cond_4f

    iget-object v12, v3, Lcom/google/android/gms/internal/measurement/zzkh;->zzash:Lcom/google/android/gms/internal/measurement/zzkk;

    if-nez v12, :cond_4e

    iget-object v12, v3, Lcom/google/android/gms/internal/measurement/zzkh;->zzasi:Lcom/google/android/gms/internal/measurement/zzki;

    if-nez v12, :cond_4c

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v3

    const-string v9, "No string or number filter defined. property"

    goto :goto_33

    :cond_4c
    iget-object v12, v7, Lcom/google/android/gms/internal/measurement/zzku;->zzajo:Ljava/lang/String;

    invoke-static {v12}, Lcom/google/android/gms/internal/measurement/zzkc;->zzcj(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_4d

    iget-object v12, v7, Lcom/google/android/gms/internal/measurement/zzku;->zzajo:Ljava/lang/String;

    iget-object v3, v3, Lcom/google/android/gms/internal/measurement/zzkh;->zzasi:Lcom/google/android/gms/internal/measurement/zzki;

    invoke-direct {v1, v12, v3}, Lcom/google/android/gms/internal/measurement/zzeb;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzki;)Ljava/lang/Boolean;

    move-result-object v3

    goto :goto_35

    :cond_4d
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v3

    const-string v9, "Invalid user property value for Numeric number filter. property, value"

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v12

    iget-object v13, v7, Lcom/google/android/gms/internal/measurement/zzku;->name:Ljava/lang/String;

    invoke-virtual {v12, v13}, Lcom/google/android/gms/internal/measurement/zzff;->zzbk(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    iget-object v13, v7, Lcom/google/android/gms/internal/measurement/zzku;->zzajo:Ljava/lang/String;

    invoke-virtual {v3, v9, v12, v13}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_34

    :cond_4e
    iget-object v12, v7, Lcom/google/android/gms/internal/measurement/zzku;->zzajo:Ljava/lang/String;

    iget-object v3, v3, Lcom/google/android/gms/internal/measurement/zzkh;->zzash:Lcom/google/android/gms/internal/measurement/zzkk;

    invoke-direct {v1, v12, v3}, Lcom/google/android/gms/internal/measurement/zzeb;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzkk;)Ljava/lang/Boolean;

    move-result-object v3

    goto :goto_35

    :cond_4f
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v3

    const-string v9, "User property has no value, property"

    goto/16 :goto_33

    :goto_36
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v9

    const-string v12, "Property filter result"

    if-nez v3, :cond_50

    const-string v13, "null"

    goto :goto_37

    :cond_50
    move-object v13, v3

    :goto_37
    invoke-virtual {v9, v12, v13}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    if-nez v3, :cond_51

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v11, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_32

    :cond_51
    iget-object v9, v5, Lcom/google/android/gms/internal/measurement/zzkj;->zzasb:Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-virtual {v2, v9}, Ljava/util/BitSet;->set(I)V

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_45

    iget-object v3, v5, Lcom/google/android/gms/internal/measurement/zzkj;->zzasb:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v14, v3}, Ljava/util/BitSet;->set(I)V

    goto/16 :goto_32

    :cond_52
    const/16 v8, 0x100

    :goto_38
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v3, "Invalid property filter ID. appId, id"

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    iget-object v5, v5, Lcom/google/android/gms/internal/measurement/zzkj;->zzasb:Ljava/lang/Integer;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v3, v9, v5}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v11, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-object/from16 v3, v51

    move/from16 v5, v52

    move-object/from16 v8, v53

    move-object/from16 v9, v54

    move-object/from16 v44, v56

    move-object/from16 v46, v57

    move-object/from16 v45, v58

    goto :goto_39

    :cond_53
    move-object/from16 v53, v8

    move-object/from16 v44, v3

    move-object/from16 v46, v13

    move-object/from16 v45, v15

    move-object/from16 v3, v51

    :goto_39
    move-object/from16 v2, p3

    goto/16 :goto_2f

    :cond_54
    move-object/from16 v51, v3

    move/from16 v52, v5

    move-object/from16 v56, v44

    move-object/from16 v58, v45

    move-object/from16 v57, v46

    const/16 v8, 0x100

    add-int/lit8 v6, v6, 0x1

    move-object/from16 v2, p3

    goto/16 :goto_2e

    :cond_55
    move-object/from16 v56, v44

    move-object/from16 v57, v46

    move-object/from16 v2, v45

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v3

    new-array v3, v3, [Lcom/google/android/gms/internal/measurement/zzko;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v8, 0x0

    :cond_56
    :goto_3a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_59

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v11, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_56

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    move-object/from16 v9, v57

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/zzko;

    if-nez v7, :cond_57

    new-instance v7, Lcom/google/android/gms/internal/measurement/zzko;

    invoke-direct {v7}, Lcom/google/android/gms/internal/measurement/zzko;-><init>()V

    :cond_57
    add-int/lit8 v10, v8, 0x1

    aput-object v7, v3, v8

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    iput-object v8, v7, Lcom/google/android/gms/internal/measurement/zzko;->zzarx:Ljava/lang/Integer;

    new-instance v8, Lcom/google/android/gms/internal/measurement/zzkt;

    invoke-direct {v8}, Lcom/google/android/gms/internal/measurement/zzkt;-><init>()V

    iput-object v8, v7, Lcom/google/android/gms/internal/measurement/zzko;->zzati:Lcom/google/android/gms/internal/measurement/zzkt;

    iget-object v8, v7, Lcom/google/android/gms/internal/measurement/zzko;->zzati:Lcom/google/android/gms/internal/measurement/zzkt;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v2, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/BitSet;

    invoke-static {v12}, Lcom/google/android/gms/internal/measurement/zzkc;->zza(Ljava/util/BitSet;)[J

    move-result-object v12

    iput-object v12, v8, Lcom/google/android/gms/internal/measurement/zzkt;->zzaux:[J

    iget-object v8, v7, Lcom/google/android/gms/internal/measurement/zzko;->zzati:Lcom/google/android/gms/internal/measurement/zzkt;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    move-object/from16 v13, v56

    invoke-interface {v13, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/BitSet;

    invoke-static {v12}, Lcom/google/android/gms/internal/measurement/zzkc;->zza(Ljava/util/BitSet;)[J

    move-result-object v12

    iput-object v12, v8, Lcom/google/android/gms/internal/measurement/zzkt;->zzauw:[J

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjq;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v8

    iget-object v7, v7, Lcom/google/android/gms/internal/measurement/zzko;->zzati:Lcom/google/android/gms/internal/measurement/zzkt;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzjr;->zzch()V

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v7}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_3
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzacg;->zzvv()I

    move-result v12

    new-array v12, v12, [B

    array-length v14, v12

    const/4 v15, 0x0

    invoke-static {v12, v15, v14}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb([BII)Lcom/google/android/gms/internal/measurement/zzaby;

    move-result-object v14

    invoke-virtual {v7, v14}, Lcom/google/android/gms/internal/measurement/zzacg;->zza(Lcom/google/android/gms/internal/measurement/zzaby;)V

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzaby;->zzvn()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5

    new-instance v7, Landroid/content/ContentValues;

    invoke-direct {v7}, Landroid/content/ContentValues;-><init>()V

    const-string v14, "app_id"

    invoke-virtual {v7, v14, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v14, "audience_id"

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v7, v14, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v6, "current_results"

    invoke-virtual {v7, v6, v12}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    :try_start_4
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzej;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v6

    const-string v12, "audience_filter_values"
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_4

    const/4 v14, 0x5

    const/4 v15, 0x0

    :try_start_5
    invoke-virtual {v6, v12, v15, v7, v14}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    move-result-wide v6

    const-wide/16 v16, -0x1

    cmp-long v12, v6, v16

    if-nez v12, :cond_58

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v6

    const-string v7, "Failed to insert filter results (got -1). appId"

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v6, v7, v12}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_3d

    :catch_3
    move-exception v0

    goto :goto_3b

    :catch_4
    move-exception v0

    const/4 v15, 0x0

    :goto_3b
    move-object v6, v0

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v7

    const-string v8, "Error storing filter results. appId"

    goto :goto_3c

    :catch_5
    move-exception v0

    const/4 v15, 0x0

    move-object v6, v0

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v7

    const-string v8, "Configuration loss. Failed to serialize filter results. appId"

    :goto_3c
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v7, v8, v12, v6}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_58
    :goto_3d
    move-object/from16 v57, v9

    move v8, v10

    move-object/from16 v56, v13

    goto/16 :goto_3a

    :cond_59
    invoke-static {v3, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lcom/google/android/gms/internal/measurement/zzko;

    return-object v2
.end method

.method protected final zzhh()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
