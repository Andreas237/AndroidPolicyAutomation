.class public final Lcom/google/android/gms/tagmanager/zzgj;
.super Ljava/lang/Object;


# annotations
.annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
.end annotation


# static fields
.field private static final zzbdc:Ljava/lang/Object;

.field private static zzbdd:Ljava/lang/Long;

.field private static zzbde:Ljava/lang/Double;

.field private static zzbdf:Lcom/google/android/gms/tagmanager/zzgi;

.field private static zzbdg:Ljava/lang/String;

.field private static zzbdh:Ljava/lang/Boolean;

.field private static zzbdi:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static zzbdj:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static zzbdk:Lcom/google/android/gms/internal/measurement/zzm;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ljava/lang/Long;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Long;-><init>(J)V

    sput-object v0, Lcom/google/android/gms/tagmanager/zzgj;->zzbdd:Ljava/lang/Long;

    new-instance v0, Ljava/lang/Double;

    const-wide/16 v3, 0x0

    invoke-direct {v0, v3, v4}, Ljava/lang/Double;-><init>(D)V

    sput-object v0, Lcom/google/android/gms/tagmanager/zzgj;->zzbde:Ljava/lang/Double;

    invoke-static {v1, v2}, Lcom/google/android/gms/tagmanager/zzgi;->zzaj(J)Lcom/google/android/gms/tagmanager/zzgi;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/tagmanager/zzgj;->zzbdf:Lcom/google/android/gms/tagmanager/zzgi;

    new-instance v0, Ljava/lang/String;

    const-string v1, ""

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/tagmanager/zzgj;->zzbdg:Ljava/lang/String;

    new-instance v0, Ljava/lang/Boolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/Boolean;-><init>(Z)V

    sput-object v0, Lcom/google/android/gms/tagmanager/zzgj;->zzbdh:Ljava/lang/Boolean;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/tagmanager/zzgj;->zzbdi:Ljava/util/List;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/google/android/gms/tagmanager/zzgj;->zzbdj:Ljava/util/Map;

    sget-object v0, Lcom/google/android/gms/tagmanager/zzgj;->zzbdg:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzgj;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzm;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/tagmanager/zzgj;->zzbdk:Lcom/google/android/gms/internal/measurement/zzm;

    return-void
.end method

.method private static getDouble(Ljava/lang/Object;)D
    .locals 2

    instance-of v0, p0, Ljava/lang/Number;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    return-wide v0

    :cond_0
    const-string p0, "getDouble received non-Number"

    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzdi;->e(Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public static zzc(Lcom/google/android/gms/internal/measurement/zzm;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzgj;->zzh(Lcom/google/android/gms/internal/measurement/zzm;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzgj;->zzi(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static zzd(Lcom/google/android/gms/internal/measurement/zzm;)Lcom/google/android/gms/tagmanager/zzgi;
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzgj;->zzh(Lcom/google/android/gms/internal/measurement/zzm;)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Lcom/google/android/gms/tagmanager/zzgi;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/tagmanager/zzgi;

    return-object p0

    :cond_0
    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzgj;->zzl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzgj;->zzm(Ljava/lang/Object;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/gms/tagmanager/zzgi;->zzaj(J)Lcom/google/android/gms/tagmanager/zzgi;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzgj;->zzk(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzgj;->getDouble(Ljava/lang/Object;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzgi;->zza(Ljava/lang/Double;)Lcom/google/android/gms/tagmanager/zzgi;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzgj;->zzi(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzgj;->zzdq(Ljava/lang/String;)Lcom/google/android/gms/tagmanager/zzgi;

    move-result-object p0

    return-object p0
.end method

.method public static zzdp(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzm;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzm;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzm;-><init>()V

    const/4 v1, 0x5

    iput v1, v0, Lcom/google/android/gms/internal/measurement/zzm;->type:I

    iput-object p0, v0, Lcom/google/android/gms/internal/measurement/zzm;->zzqc:Ljava/lang/String;

    return-object v0
.end method

.method private static zzdq(Ljava/lang/String;)Lcom/google/android/gms/tagmanager/zzgi;
    .locals 2

    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzgi;->zzdo(Ljava/lang/String;)Lcom/google/android/gms/tagmanager/zzgi;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/16 v0, 0x21

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Failed to convert \'"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\' to a number."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzdi;->e(Ljava/lang/String;)V

    sget-object p0, Lcom/google/android/gms/tagmanager/zzgj;->zzbdf:Lcom/google/android/gms/tagmanager/zzgi;

    return-object p0
.end method

.method public static zze(Lcom/google/android/gms/internal/measurement/zzm;)Ljava/lang/Long;
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzgj;->zzh(Lcom/google/android/gms/internal/measurement/zzm;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzgj;->zzl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzgj;->zzm(Ljava/lang/Object;)J

    move-result-wide v0

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzgj;->zzi(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzgj;->zzdq(Ljava/lang/String;)Lcom/google/android/gms/tagmanager/zzgi;

    move-result-object p0

    sget-object v0, Lcom/google/android/gms/tagmanager/zzgj;->zzbdf:Lcom/google/android/gms/tagmanager/zzgi;

    if-ne p0, v0, :cond_1

    sget-object p0, Lcom/google/android/gms/tagmanager/zzgj;->zzbdd:Ljava/lang/Long;

    return-object p0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/zzgi;->longValue()J

    move-result-wide v0

    goto :goto_0
.end method

.method public static zzf(Lcom/google/android/gms/internal/measurement/zzm;)Ljava/lang/Double;
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzgj;->zzh(Lcom/google/android/gms/internal/measurement/zzm;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzgj;->zzk(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzgj;->getDouble(Ljava/lang/Object;)D

    move-result-wide v0

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzgj;->zzi(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzgj;->zzdq(Ljava/lang/String;)Lcom/google/android/gms/tagmanager/zzgi;

    move-result-object p0

    sget-object v0, Lcom/google/android/gms/tagmanager/zzgj;->zzbdf:Lcom/google/android/gms/tagmanager/zzgi;

    if-ne p0, v0, :cond_1

    sget-object p0, Lcom/google/android/gms/tagmanager/zzgj;->zzbde:Ljava/lang/Double;

    return-object p0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/zzgi;->doubleValue()D

    move-result-wide v0

    goto :goto_0
.end method

.method public static zzg(Lcom/google/android/gms/internal/measurement/zzm;)Ljava/lang/Boolean;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzgj;->zzh(Lcom/google/android/gms/internal/measurement/zzm;)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0

    :cond_0
    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzgj;->zzi(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "true"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0

    :cond_1
    const-string v0, "false"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    :cond_2
    sget-object p0, Lcom/google/android/gms/tagmanager/zzgj;->zzbdh:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static zzh(Lcom/google/android/gms/internal/measurement/zzm;)Ljava/lang/Object;
    .locals 6

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->type:I

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    iget p0, p0, Lcom/google/android/gms/internal/measurement/zzm;->type:I

    const/16 v1, 0x2e

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Failed to convert a value of type: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzdi;->e(Ljava/lang/String;)V

    return-object v0

    :pswitch_0
    iget-boolean p0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqe:Z

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :pswitch_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqf:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v3, p0

    :goto_1
    if-ge v2, v3, :cond_2

    aget-object v4, p0, v2

    invoke-static {v4}, Lcom/google/android/gms/tagmanager/zzgj;->zzh(Lcom/google/android/gms/internal/measurement/zzm;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/gms/tagmanager/zzgj;->zzi(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lcom/google/android/gms/tagmanager/zzgj;->zzbdg:Ljava/lang/String;

    if-ne v4, v5, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_2
    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqd:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    :pswitch_3
    const-string p0, "Trying to convert a function id to object"

    goto :goto_0

    :pswitch_4
    const-string p0, "Trying to convert a macro reference to object"

    goto :goto_0

    :pswitch_5
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpz:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v1, v1

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqa:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v3, v3

    if-eq v1, v3, :cond_4

    const-string v1, "Converting an invalid value to object: "

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzacg;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_2

    :cond_3
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_2
    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzdi;->e(Ljava/lang/String;)V

    return-object v0

    :cond_4
    new-instance v1, Ljava/util/HashMap;

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqa:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v3, v3

    invoke-direct {v1, v3}, Ljava/util/HashMap;-><init>(I)V

    :goto_3
    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpz:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v3, v3

    if-ge v2, v3, :cond_7

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpz:[Lcom/google/android/gms/internal/measurement/zzm;

    aget-object v3, v3, v2

    invoke-static {v3}, Lcom/google/android/gms/tagmanager/zzgj;->zzh(Lcom/google/android/gms/internal/measurement/zzm;)Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqa:[Lcom/google/android/gms/internal/measurement/zzm;

    aget-object v4, v4, v2

    invoke-static {v4}, Lcom/google/android/gms/tagmanager/zzgj;->zzh(Lcom/google/android/gms/internal/measurement/zzm;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v3, :cond_6

    if-nez v4, :cond_5

    return-object v0

    :cond_5
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_6
    return-object v0

    :cond_7
    return-object v1

    :pswitch_6
    new-instance v1, Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpy:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v3, v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpy:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v3, p0

    :goto_4
    if-ge v2, v3, :cond_9

    aget-object v4, p0, v2

    invoke-static {v4}, Lcom/google/android/gms/tagmanager/zzgj;->zzh(Lcom/google/android/gms/internal/measurement/zzm;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_8

    return-object v0

    :cond_8
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_9
    return-object v1

    :pswitch_7
    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zzm;->string:Ljava/lang/String;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static zzi(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    if-nez p0, :cond_0

    sget-object p0, Lcom/google/android/gms/tagmanager/zzgj;->zzbdg:Ljava/lang/String;

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzm;
    .locals 9

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzm;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzm;-><init>()V

    instance-of v1, p0, Lcom/google/android/gms/internal/measurement/zzm;

    if-eqz v1, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzm;

    return-object p0

    :cond_0
    instance-of v1, p0, Ljava/lang/String;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    iput v2, v0, Lcom/google/android/gms/internal/measurement/zzm;->type:I

    check-cast p0, Ljava/lang/String;

    :goto_0
    iput-object p0, v0, Lcom/google/android/gms/internal/measurement/zzm;->string:Ljava/lang/String;

    goto/16 :goto_8

    :cond_1
    instance-of v1, p0, Ljava/util/List;

    if-eqz v1, :cond_6

    const/4 v1, 0x2

    iput v1, v0, Lcom/google/android/gms/internal/measurement/zzm;->type:I

    check-cast p0, Ljava/util/List;

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    move v4, v3

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lcom/google/android/gms/tagmanager/zzgj;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzm;

    move-result-object v5

    sget-object v6, Lcom/google/android/gms/tagmanager/zzgj;->zzbdk:Lcom/google/android/gms/internal/measurement/zzm;

    if-ne v5, v6, :cond_2

    sget-object p0, Lcom/google/android/gms/tagmanager/zzgj;->zzbdk:Lcom/google/android/gms/internal/measurement/zzm;

    return-object p0

    :cond_2
    if-nez v4, :cond_4

    iget-boolean v4, v5, Lcom/google/android/gms/internal/measurement/zzm;->zzqh:Z

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    move v4, v3

    goto :goto_3

    :cond_4
    :goto_2
    move v4, v2

    :goto_3
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    new-array p0, v3, [Lcom/google/android/gms/internal/measurement/zzm;

    invoke-interface {v1, p0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lcom/google/android/gms/internal/measurement/zzm;

    iput-object p0, v0, Lcom/google/android/gms/internal/measurement/zzm;->zzpy:[Lcom/google/android/gms/internal/measurement/zzm;

    move v3, v4

    goto/16 :goto_8

    :cond_6
    instance-of v1, p0, Ljava/util/Map;

    if-eqz v1, :cond_c

    const/4 v1, 0x3

    iput v1, v0, Lcom/google/android/gms/internal/measurement/zzm;->type:I

    check-cast p0, Ljava/util/Map;

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    move v5, v3

    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, Lcom/google/android/gms/tagmanager/zzgj;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzm;

    move-result-object v7

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lcom/google/android/gms/tagmanager/zzgj;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzm;

    move-result-object v6

    sget-object v8, Lcom/google/android/gms/tagmanager/zzgj;->zzbdk:Lcom/google/android/gms/internal/measurement/zzm;

    if-eq v7, v8, :cond_a

    sget-object v8, Lcom/google/android/gms/tagmanager/zzgj;->zzbdk:Lcom/google/android/gms/internal/measurement/zzm;

    if-ne v6, v8, :cond_7

    goto :goto_7

    :cond_7
    if-nez v5, :cond_9

    iget-boolean v5, v7, Lcom/google/android/gms/internal/measurement/zzm;->zzqh:Z

    if-nez v5, :cond_9

    iget-boolean v5, v6, Lcom/google/android/gms/internal/measurement/zzm;->zzqh:Z

    if-eqz v5, :cond_8

    goto :goto_5

    :cond_8
    move v5, v3

    goto :goto_6

    :cond_9
    :goto_5
    move v5, v2

    :goto_6
    invoke-interface {v1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_a
    :goto_7
    sget-object p0, Lcom/google/android/gms/tagmanager/zzgj;->zzbdk:Lcom/google/android/gms/internal/measurement/zzm;

    return-object p0

    :cond_b
    new-array p0, v3, [Lcom/google/android/gms/internal/measurement/zzm;

    invoke-interface {v1, p0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lcom/google/android/gms/internal/measurement/zzm;

    iput-object p0, v0, Lcom/google/android/gms/internal/measurement/zzm;->zzpz:[Lcom/google/android/gms/internal/measurement/zzm;

    new-array p0, v3, [Lcom/google/android/gms/internal/measurement/zzm;

    invoke-interface {v4, p0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lcom/google/android/gms/internal/measurement/zzm;

    iput-object p0, v0, Lcom/google/android/gms/internal/measurement/zzm;->zzqa:[Lcom/google/android/gms/internal/measurement/zzm;

    move v3, v5

    goto :goto_8

    :cond_c
    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzgj;->zzk(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    iput v2, v0, Lcom/google/android/gms/internal/measurement/zzm;->type:I

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    goto/16 :goto_0

    :cond_d
    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzgj;->zzl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    const/4 v1, 0x6

    iput v1, v0, Lcom/google/android/gms/internal/measurement/zzm;->type:I

    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzgj;->zzm(Ljava/lang/Object;)J

    move-result-wide v1

    iput-wide v1, v0, Lcom/google/android/gms/internal/measurement/zzm;->zzqd:J

    goto :goto_8

    :cond_e
    instance-of v1, p0, Ljava/lang/Boolean;

    if-eqz v1, :cond_f

    const/16 v1, 0x8

    iput v1, v0, Lcom/google/android/gms/internal/measurement/zzm;->type:I

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    iput-boolean p0, v0, Lcom/google/android/gms/internal/measurement/zzm;->zzqe:Z

    :goto_8
    iput-boolean v3, v0, Lcom/google/android/gms/internal/measurement/zzm;->zzqh:Z

    return-object v0

    :cond_f
    const-string v0, "Converting to Value from unknown object type: "

    if-nez p0, :cond_10

    const-string p0, "null"

    goto :goto_9

    :cond_10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_9
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_11

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_a

    :cond_11
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_a
    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzdi;->e(Ljava/lang/String;)V

    sget-object p0, Lcom/google/android/gms/tagmanager/zzgj;->zzbdk:Lcom/google/android/gms/internal/measurement/zzm;

    return-object p0
.end method

.method private static zzk(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p0, Ljava/lang/Double;

    if-nez v0, :cond_1

    instance-of v0, p0, Ljava/lang/Float;

    if-nez v0, :cond_1

    instance-of v0, p0, Lcom/google/android/gms/tagmanager/zzgi;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/tagmanager/zzgi;

    invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/zzgi;->zzpb()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private static zzl(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p0, Ljava/lang/Byte;

    if-nez v0, :cond_1

    instance-of v0, p0, Ljava/lang/Short;

    if-nez v0, :cond_1

    instance-of v0, p0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    instance-of v0, p0, Ljava/lang/Long;

    if-nez v0, :cond_1

    instance-of v0, p0, Lcom/google/android/gms/tagmanager/zzgi;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/tagmanager/zzgi;

    invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/zzgi;->zzpc()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private static zzm(Ljava/lang/Object;)J
    .locals 2

    instance-of v0, p0, Ljava/lang/Number;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-string p0, "getInt64 received non-Number"

    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzdi;->e(Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public static zzpd()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public static zzpe()Ljava/lang/Long;
    .locals 1

    sget-object v0, Lcom/google/android/gms/tagmanager/zzgj;->zzbdd:Ljava/lang/Long;

    return-object v0
.end method

.method public static zzpf()Ljava/lang/Double;
    .locals 1

    sget-object v0, Lcom/google/android/gms/tagmanager/zzgj;->zzbde:Ljava/lang/Double;

    return-object v0
.end method

.method public static zzpg()Ljava/lang/Boolean;
    .locals 1

    sget-object v0, Lcom/google/android/gms/tagmanager/zzgj;->zzbdh:Ljava/lang/Boolean;

    return-object v0
.end method

.method public static zzph()Lcom/google/android/gms/tagmanager/zzgi;
    .locals 1

    sget-object v0, Lcom/google/android/gms/tagmanager/zzgj;->zzbdf:Lcom/google/android/gms/tagmanager/zzgi;

    return-object v0
.end method

.method public static zzpi()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/google/android/gms/tagmanager/zzgj;->zzbdg:Ljava/lang/String;

    return-object v0
.end method

.method public static zzpj()Lcom/google/android/gms/internal/measurement/zzm;
    .locals 1

    sget-object v0, Lcom/google/android/gms/tagmanager/zzgj;->zzbdk:Lcom/google/android/gms/internal/measurement/zzm;

    return-object v0
.end method
