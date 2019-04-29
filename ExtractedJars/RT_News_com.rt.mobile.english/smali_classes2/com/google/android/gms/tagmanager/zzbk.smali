.class final Lcom/google/android/gms/tagmanager/zzbk;
.super Lcom/google/android/gms/tagmanager/zzbq;


# static fields
.field private static final ID:Ljava/lang/String;

.field private static final zzayh:Ljava/lang/String;

.field private static final zzayi:Ljava/lang/String;

.field private static final zzayj:Ljava/lang/String;

.field private static final zzayk:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zza;->zzaj:Lcom/google/android/gms/internal/measurement/zza;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zza;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/tagmanager/zzbk;->ID:Ljava/lang/String;

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzb;->zzef:Lcom/google/android/gms/internal/measurement/zzb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzb;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/tagmanager/zzbk;->zzayh:Ljava/lang/String;

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzb;->zzjr:Lcom/google/android/gms/internal/measurement/zzb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzb;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/tagmanager/zzbk;->zzayi:Ljava/lang/String;

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzb;->zzik:Lcom/google/android/gms/internal/measurement/zzb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzb;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/tagmanager/zzbk;->zzayj:Ljava/lang/String;

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzb;->zzkb:Lcom/google/android/gms/internal/measurement/zzb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzb;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/tagmanager/zzbk;->zzayk:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    sget-object v0, Lcom/google/android/gms/tagmanager/zzbk;->ID:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    sget-object v2, Lcom/google/android/gms/tagmanager/zzbk;->zzayh:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/tagmanager/zzbq;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final zzd(Ljava/util/Map;)Lcom/google/android/gms/internal/measurement/zzm;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/measurement/zzm;",
            ">;)",
            "Lcom/google/android/gms/internal/measurement/zzm;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/tagmanager/zzbk;->zzayh:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzm;

    if-eqz v0, :cond_d

    invoke-static {}, Lcom/google/android/gms/tagmanager/zzgj;->zzpj()Lcom/google/android/gms/internal/measurement/zzm;

    move-result-object v1

    if-ne v0, v1, :cond_0

    goto/16 :goto_6

    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzgj;->zzc(Lcom/google/android/gms/internal/measurement/zzm;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/tagmanager/zzbk;->zzayj:Ljava/lang/String;

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/zzm;

    if-nez v1, :cond_1

    const-string v1, "text"

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lcom/google/android/gms/tagmanager/zzgj;->zzc(Lcom/google/android/gms/internal/measurement/zzm;)Ljava/lang/String;

    move-result-object v1

    :goto_0
    sget-object v2, Lcom/google/android/gms/tagmanager/zzbk;->zzayk:Ljava/lang/String;

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzm;

    if-nez v2, :cond_2

    const-string v2, "base16"

    goto :goto_1

    :cond_2
    invoke-static {v2}, Lcom/google/android/gms/tagmanager/zzgj;->zzc(Lcom/google/android/gms/internal/measurement/zzm;)Ljava/lang/String;

    move-result-object v2

    :goto_1
    const/4 v3, 0x2

    sget-object v4, Lcom/google/android/gms/tagmanager/zzbk;->zzayi:Ljava/lang/String;

    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzm;

    if-eqz p1, :cond_3

    invoke-static {p1}, Lcom/google/android/gms/tagmanager/zzgj;->zzg(Lcom/google/android/gms/internal/measurement/zzm;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 v3, 0x3

    :cond_3
    :try_start_0
    const-string p1, "text"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    goto :goto_2

    :cond_4
    const-string p1, "base16"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzo;->decode(Ljava/lang/String;)[B

    move-result-object p1

    goto :goto_2

    :cond_5
    const-string p1, "base64"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {v0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    goto :goto_2

    :cond_6
    const-string p1, "base64url"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    or-int/lit8 p1, v3, 0x8

    invoke-static {v0, p1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    const-string v0, "base16"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {p1}, Lcom/google/android/gms/tagmanager/zzo;->encode([B)Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_7
    const-string v0, "base64"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {p1, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_8
    const-string v0, "base64url"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    or-int/lit8 v0, v3, 0x8

    invoke-static {p1, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p1

    :goto_3
    invoke-static {p1}, Lcom/google/android/gms/tagmanager/zzgj;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzm;

    move-result-object p1

    return-object p1

    :cond_9
    const-string p1, "Encode: unknown output format: "

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_a

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_4

    :cond_a
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object p1, v0

    :goto_4
    invoke-static {p1}, Lcom/google/android/gms/tagmanager/zzdi;->e(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/tagmanager/zzgj;->zzpj()Lcom/google/android/gms/internal/measurement/zzm;

    move-result-object p1

    return-object p1

    :cond_b
    :try_start_1
    const-string p1, "Encode: unknown input format: "

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_c

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_5

    :cond_c
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object p1, v0

    :goto_5
    invoke-static {p1}, Lcom/google/android/gms/tagmanager/zzdi;->e(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/tagmanager/zzgj;->zzpj()Lcom/google/android/gms/internal/measurement/zzm;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :catch_0
    const-string p1, "Encode: invalid input:"

    goto :goto_4

    :cond_d
    :goto_6
    invoke-static {}, Lcom/google/android/gms/tagmanager/zzgj;->zzpj()Lcom/google/android/gms/internal/measurement/zzm;

    move-result-object p1

    return-object p1
.end method

.method public final zzme()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
