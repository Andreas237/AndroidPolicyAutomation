.class public final Lcom/google/android/gms/internal/wearable/zzj;
.super Lcom/google/android/gms/internal/wearable/zzn;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/wearable/zzn<",
        "Lcom/google/android/gms/internal/wearable/zzj;",
        ">;"
    }
.end annotation


# instance fields
.field public zzgd:[B

.field public zzge:Ljava/lang/String;

.field public zzgf:D

.field public zzgg:F

.field public zzgh:J

.field public zzgi:I

.field public zzgj:I

.field public zzgk:Z

.field public zzgl:[Lcom/google/android/gms/internal/wearable/zzh;

.field public zzgm:[Lcom/google/android/gms/internal/wearable/zzi;

.field public zzgn:[Ljava/lang/String;

.field public zzgo:[J

.field public zzgp:[F

.field public zzgq:J


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/wearable/zzn;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/wearable/zzw;->zzhy:[B

    iput-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgd:[B

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzge:Ljava/lang/String;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgf:D

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgg:F

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgh:J

    const/4 v2, 0x0

    iput v2, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgi:I

    iput v2, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgj:I

    iput-boolean v2, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgk:Z

    invoke-static {}, Lcom/google/android/gms/internal/wearable/zzh;->zzh()[Lcom/google/android/gms/internal/wearable/zzh;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgl:[Lcom/google/android/gms/internal/wearable/zzh;

    invoke-static {}, Lcom/google/android/gms/internal/wearable/zzi;->zzi()[Lcom/google/android/gms/internal/wearable/zzi;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgm:[Lcom/google/android/gms/internal/wearable/zzi;

    sget-object v2, Lcom/google/android/gms/internal/wearable/zzw;->zzhw:[Ljava/lang/String;

    iput-object v2, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgn:[Ljava/lang/String;

    sget-object v2, Lcom/google/android/gms/internal/wearable/zzw;->zzhs:[J

    iput-object v2, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgo:[J

    sget-object v2, Lcom/google/android/gms/internal/wearable/zzw;->zzht:[F

    iput-object v2, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgp:[F

    iput-wide v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgq:J

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzhc:Lcom/google/android/gms/internal/wearable/zzp;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzhl:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/wearable/zzj;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/wearable/zzj;

    iget-object v1, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgd:[B

    iget-object v3, p1, Lcom/google/android/gms/internal/wearable/zzj;->zzgd:[B

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzge:Ljava/lang/String;

    if-nez v1, :cond_3

    iget-object v1, p1, Lcom/google/android/gms/internal/wearable/zzj;->zzge:Ljava/lang/String;

    if-eqz v1, :cond_4

    return v2

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzge:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/wearable/zzj;->zzge:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgf:D

    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    iget-wide v5, p1, Lcom/google/android/gms/internal/wearable/zzj;->zzgf:D

    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgg:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    iget v3, p1, Lcom/google/android/gms/internal/wearable/zzj;->zzgg:F

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgh:J

    iget-wide v5, p1, Lcom/google/android/gms/internal/wearable/zzj;->zzgh:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgi:I

    iget v3, p1, Lcom/google/android/gms/internal/wearable/zzj;->zzgi:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgj:I

    iget v3, p1, Lcom/google/android/gms/internal/wearable/zzj;->zzgj:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgk:Z

    iget-boolean v3, p1, Lcom/google/android/gms/internal/wearable/zzj;->zzgk:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgl:[Lcom/google/android/gms/internal/wearable/zzh;

    iget-object v3, p1, Lcom/google/android/gms/internal/wearable/zzj;->zzgl:[Lcom/google/android/gms/internal/wearable/zzh;

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/wearable/zzr;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgm:[Lcom/google/android/gms/internal/wearable/zzi;

    iget-object v3, p1, Lcom/google/android/gms/internal/wearable/zzj;->zzgm:[Lcom/google/android/gms/internal/wearable/zzi;

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/wearable/zzr;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgn:[Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/wearable/zzj;->zzgn:[Ljava/lang/String;

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/wearable/zzr;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgo:[J

    iget-object v3, p1, Lcom/google/android/gms/internal/wearable/zzj;->zzgo:[J

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/wearable/zzr;->equals([J[J)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgp:[F

    iget-object v3, p1, Lcom/google/android/gms/internal/wearable/zzj;->zzgp:[F

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/wearable/zzr;->equals([F[F)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-wide v3, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgq:J

    iget-wide v5, p1, Lcom/google/android/gms/internal/wearable/zzj;->zzgq:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzhc:Lcom/google/android/gms/internal/wearable/zzp;

    if-eqz v1, :cond_12

    iget-object v1, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzhc:Lcom/google/android/gms/internal/wearable/zzp;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/wearable/zzp;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_11

    goto :goto_0

    :cond_11
    iget-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzhc:Lcom/google/android/gms/internal/wearable/zzp;

    iget-object p1, p1, Lcom/google/android/gms/internal/wearable/zzj;->zzhc:Lcom/google/android/gms/internal/wearable/zzp;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/wearable/zzp;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_12
    :goto_0
    iget-object v1, p1, Lcom/google/android/gms/internal/wearable/zzj;->zzhc:Lcom/google/android/gms/internal/wearable/zzp;

    if-eqz v1, :cond_14

    iget-object p1, p1, Lcom/google/android/gms/internal/wearable/zzj;->zzhc:Lcom/google/android/gms/internal/wearable/zzp;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzp;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_13

    return v0

    :cond_13
    return v2

    :cond_14
    return v0
.end method

.method public final hashCode()I
    .locals 9

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgd:[B

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzge:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzge:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    iget-wide v3, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgf:D

    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    mul-int/lit8 v1, v1, 0x1f

    const/16 v0, 0x20

    ushr-long v5, v3, v0

    xor-long v7, v3, v5

    long-to-int v3, v7

    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x1f

    iget v3, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgg:F

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v3, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgh:J

    iget-wide v5, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgh:J

    ushr-long/2addr v5, v0

    xor-long v7, v3, v5

    long-to-int v3, v7

    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x1f

    iget v3, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgi:I

    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x1f

    iget v3, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgj:I

    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v3, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgk:Z

    if-eqz v3, :cond_1

    const/16 v3, 0x4cf

    goto :goto_1

    :cond_1
    const/16 v3, 0x4d5

    :goto_1
    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x1f

    iget-object v3, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgl:[Lcom/google/android/gms/internal/wearable/zzh;

    invoke-static {v3}, Lcom/google/android/gms/internal/wearable/zzr;->hashCode([Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x1f

    iget-object v3, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgm:[Lcom/google/android/gms/internal/wearable/zzi;

    invoke-static {v3}, Lcom/google/android/gms/internal/wearable/zzr;->hashCode([Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x1f

    iget-object v3, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgn:[Ljava/lang/String;

    invoke-static {v3}, Lcom/google/android/gms/internal/wearable/zzr;->hashCode([Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x1f

    iget-object v3, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgo:[J

    invoke-static {v3}, Lcom/google/android/gms/internal/wearable/zzr;->hashCode([J)I

    move-result v3

    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x1f

    iget-object v3, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgp:[F

    invoke-static {v3}, Lcom/google/android/gms/internal/wearable/zzr;->hashCode([F)I

    move-result v3

    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v3, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgq:J

    iget-wide v5, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgq:J

    ushr-long/2addr v5, v0

    xor-long v7, v3, v5

    long-to-int v0, v7

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzhc:Lcom/google/android/gms/internal/wearable/zzp;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzhc:Lcom/google/android/gms/internal/wearable/zzp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/wearable/zzp;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzhc:Lcom/google/android/gms/internal/wearable/zzp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/wearable/zzp;->hashCode()I

    move-result v2

    :cond_3
    :goto_2
    add-int/2addr v1, v2

    return v1
.end method

.method public final synthetic zza(Lcom/google/android/gms/internal/wearable/zzk;)Lcom/google/android/gms/internal/wearable/zzt;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzk;->zzj()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    sparse-switch v0, :sswitch_data_0

    invoke-super {p0, p1, v0}, Lcom/google/android/gms/internal/wearable/zzn;->zza(Lcom/google/android/gms/internal/wearable/zzk;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :sswitch_0
    const/16 v0, 0x75

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/wearable/zzw;->zzb(Lcom/google/android/gms/internal/wearable/zzk;I)I

    move-result v0

    iget-object v3, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgp:[F

    if-nez v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    iget-object v3, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgp:[F

    array-length v3, v3

    :goto_1
    add-int/2addr v0, v3

    new-array v0, v0, [F

    if-eqz v3, :cond_2

    iget-object v4, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgp:[F

    invoke-static {v4, v2, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_2
    :goto_2
    array-length v2, v0

    sub-int/2addr v2, v1

    if-ge v3, v2, :cond_3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzk;->zzm()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    aput v2, v0, v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzk;->zzj()I

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzk;->zzm()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    aput v1, v0, v3

    iput-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgp:[F

    goto :goto_0

    :sswitch_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzk;->zzk()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/wearable/zzk;->zze(I)I

    move-result v1

    div-int/lit8 v0, v0, 0x4

    iget-object v3, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgp:[F

    if-nez v3, :cond_4

    move v3, v2

    goto :goto_3

    :cond_4
    iget-object v3, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgp:[F

    array-length v3, v3

    :goto_3
    add-int/2addr v0, v3

    new-array v0, v0, [F

    if-eqz v3, :cond_5

    iget-object v4, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgp:[F

    invoke-static {v4, v2, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_5
    :goto_4
    array-length v2, v0

    if-ge v3, v2, :cond_6

    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzk;->zzm()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    aput v2, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_6
    iput-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgp:[F

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/wearable/zzk;->zzf(I)V

    goto :goto_0

    :sswitch_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzk;->zzl()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgq:J

    goto/16 :goto_0

    :sswitch_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzk;->zzk()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/wearable/zzk;->zze(I)I

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzk;->getPosition()I

    move-result v1

    move v3, v2

    :goto_5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzk;->zzp()I

    move-result v4

    if-lez v4, :cond_7

    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzk;->zzl()J

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_7
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/wearable/zzk;->zzg(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgo:[J

    if-nez v1, :cond_8

    move v1, v2

    goto :goto_6

    :cond_8
    iget-object v1, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgo:[J

    array-length v1, v1

    :goto_6
    add-int/2addr v3, v1

    new-array v3, v3, [J

    if-eqz v1, :cond_9

    iget-object v4, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgo:[J

    invoke-static {v4, v2, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_9
    :goto_7
    array-length v2, v3

    if-ge v1, v2, :cond_a

    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzk;->zzl()J

    move-result-wide v4

    aput-wide v4, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_a
    iput-object v3, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgo:[J

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/wearable/zzk;->zzf(I)V

    goto/16 :goto_0

    :sswitch_4
    const/16 v0, 0x60

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/wearable/zzw;->zzb(Lcom/google/android/gms/internal/wearable/zzk;I)I

    move-result v0

    iget-object v3, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgo:[J

    if-nez v3, :cond_b

    move v3, v2

    goto :goto_8

    :cond_b
    iget-object v3, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgo:[J

    array-length v3, v3

    :goto_8
    add-int/2addr v0, v3

    new-array v0, v0, [J

    if-eqz v3, :cond_c

    iget-object v4, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgo:[J

    invoke-static {v4, v2, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_c
    :goto_9
    array-length v2, v0

    sub-int/2addr v2, v1

    if-ge v3, v2, :cond_d

    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzk;->zzl()J

    move-result-wide v4

    aput-wide v4, v0, v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzk;->zzj()I

    add-int/lit8 v3, v3, 0x1

    goto :goto_9

    :cond_d
    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzk;->zzl()J

    move-result-wide v1

    aput-wide v1, v0, v3

    iput-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgo:[J

    goto/16 :goto_0

    :sswitch_5
    const/16 v0, 0x5a

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/wearable/zzw;->zzb(Lcom/google/android/gms/internal/wearable/zzk;I)I

    move-result v0

    iget-object v3, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgn:[Ljava/lang/String;

    if-nez v3, :cond_e

    move v3, v2

    goto :goto_a

    :cond_e
    iget-object v3, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgn:[Ljava/lang/String;

    array-length v3, v3

    :goto_a
    add-int/2addr v0, v3

    new-array v0, v0, [Ljava/lang/String;

    if-eqz v3, :cond_f

    iget-object v4, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgn:[Ljava/lang/String;

    invoke-static {v4, v2, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_f
    :goto_b
    array-length v2, v0

    sub-int/2addr v2, v1

    if-ge v3, v2, :cond_10

    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzk;->readString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzk;->zzj()I

    add-int/lit8 v3, v3, 0x1

    goto :goto_b

    :cond_10
    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzk;->readString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v3

    iput-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgn:[Ljava/lang/String;

    goto/16 :goto_0

    :sswitch_6
    const/16 v0, 0x52

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/wearable/zzw;->zzb(Lcom/google/android/gms/internal/wearable/zzk;I)I

    move-result v0

    iget-object v3, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgm:[Lcom/google/android/gms/internal/wearable/zzi;

    if-nez v3, :cond_11

    move v3, v2

    goto :goto_c

    :cond_11
    iget-object v3, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgm:[Lcom/google/android/gms/internal/wearable/zzi;

    array-length v3, v3

    :goto_c
    add-int/2addr v0, v3

    new-array v0, v0, [Lcom/google/android/gms/internal/wearable/zzi;

    if-eqz v3, :cond_12

    iget-object v4, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgm:[Lcom/google/android/gms/internal/wearable/zzi;

    invoke-static {v4, v2, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_12
    :goto_d
    array-length v2, v0

    sub-int/2addr v2, v1

    if-ge v3, v2, :cond_13

    new-instance v2, Lcom/google/android/gms/internal/wearable/zzi;

    invoke-direct {v2}, Lcom/google/android/gms/internal/wearable/zzi;-><init>()V

    aput-object v2, v0, v3

    aget-object v2, v0, v3

    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/wearable/zzk;->zza(Lcom/google/android/gms/internal/wearable/zzt;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzk;->zzj()I

    add-int/lit8 v3, v3, 0x1

    goto :goto_d

    :cond_13
    new-instance v1, Lcom/google/android/gms/internal/wearable/zzi;

    invoke-direct {v1}, Lcom/google/android/gms/internal/wearable/zzi;-><init>()V

    aput-object v1, v0, v3

    aget-object v1, v0, v3

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/wearable/zzk;->zza(Lcom/google/android/gms/internal/wearable/zzt;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgm:[Lcom/google/android/gms/internal/wearable/zzi;

    goto/16 :goto_0

    :sswitch_7
    const/16 v0, 0x4a

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/wearable/zzw;->zzb(Lcom/google/android/gms/internal/wearable/zzk;I)I

    move-result v0

    iget-object v3, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgl:[Lcom/google/android/gms/internal/wearable/zzh;

    if-nez v3, :cond_14

    move v3, v2

    goto :goto_e

    :cond_14
    iget-object v3, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgl:[Lcom/google/android/gms/internal/wearable/zzh;

    array-length v3, v3

    :goto_e
    add-int/2addr v0, v3

    new-array v0, v0, [Lcom/google/android/gms/internal/wearable/zzh;

    if-eqz v3, :cond_15

    iget-object v4, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgl:[Lcom/google/android/gms/internal/wearable/zzh;

    invoke-static {v4, v2, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_15
    :goto_f
    array-length v2, v0

    sub-int/2addr v2, v1

    if-ge v3, v2, :cond_16

    new-instance v2, Lcom/google/android/gms/internal/wearable/zzh;

    invoke-direct {v2}, Lcom/google/android/gms/internal/wearable/zzh;-><init>()V

    aput-object v2, v0, v3

    aget-object v2, v0, v3

    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/wearable/zzk;->zza(Lcom/google/android/gms/internal/wearable/zzt;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzk;->zzj()I

    add-int/lit8 v3, v3, 0x1

    goto :goto_f

    :cond_16
    new-instance v1, Lcom/google/android/gms/internal/wearable/zzh;

    invoke-direct {v1}, Lcom/google/android/gms/internal/wearable/zzh;-><init>()V

    aput-object v1, v0, v3

    aget-object v1, v0, v3

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/wearable/zzk;->zza(Lcom/google/android/gms/internal/wearable/zzt;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgl:[Lcom/google/android/gms/internal/wearable/zzh;

    goto/16 :goto_0

    :sswitch_8
    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzk;->zzk()I

    move-result v0

    if-eqz v0, :cond_17

    goto :goto_10

    :cond_17
    move v1, v2

    :goto_10
    iput-boolean v1, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgk:Z

    goto/16 :goto_0

    :sswitch_9
    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzk;->zzk()I

    move-result v0

    ushr-int/lit8 v2, v0, 0x1

    and-int/2addr v0, v1

    neg-int v0, v0

    xor-int/2addr v0, v2

    iput v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgj:I

    goto/16 :goto_0

    :sswitch_a
    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzk;->zzk()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgi:I

    goto/16 :goto_0

    :sswitch_b
    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzk;->zzl()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgh:J

    goto/16 :goto_0

    :sswitch_c
    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzk;->zzm()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgg:F

    goto/16 :goto_0

    :sswitch_d
    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzk;->zzn()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgf:D

    goto/16 :goto_0

    :sswitch_e
    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzk;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzge:Ljava/lang/String;

    goto/16 :goto_0

    :sswitch_f
    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzk;->readBytes()[B

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgd:[B

    goto/16 :goto_0

    :sswitch_10
    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_10
        0xa -> :sswitch_f
        0x12 -> :sswitch_e
        0x19 -> :sswitch_d
        0x25 -> :sswitch_c
        0x28 -> :sswitch_b
        0x30 -> :sswitch_a
        0x38 -> :sswitch_9
        0x40 -> :sswitch_8
        0x4a -> :sswitch_7
        0x52 -> :sswitch_6
        0x5a -> :sswitch_5
        0x60 -> :sswitch_4
        0x62 -> :sswitch_3
        0x68 -> :sswitch_2
        0x72 -> :sswitch_1
        0x75 -> :sswitch_0
    .end sparse-switch
.end method

.method public final zza(Lcom/google/android/gms/internal/wearable/zzl;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgd:[B

    sget-object v1, Lcom/google/android/gms/internal/wearable/zzw;->zzhy:[B

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgd:[B

    invoke-virtual {p1, v2, v1}, Lcom/google/android/gms/internal/wearable/zzl;->zzf(II)V

    array-length v3, v0

    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/wearable/zzl;->zzl(I)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/wearable/zzl;->zzc([B)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzge:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzge:Ljava/lang/String;

    const-string v3, ""

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzge:Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/wearable/zzl;->zza(ILjava/lang/String;)V

    :cond_1
    iget-wide v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgf:D

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    const-wide/16 v3, 0x0

    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    cmp-long v5, v0, v3

    if-eqz v5, :cond_2

    iget-wide v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgf:D

    const/4 v3, 0x3

    invoke-virtual {p1, v3, v2}, Lcom/google/android/gms/internal/wearable/zzl;->zzf(II)V

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/wearable/zzl;->zzb(J)V

    :cond_2
    iget v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgg:F

    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    if-eq v0, v1, :cond_3

    const/4 v0, 0x4

    iget v1, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgg:F

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/wearable/zzl;->zza(IF)V

    :cond_3
    iget-wide v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgh:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_4

    const/4 v0, 0x5

    iget-wide v4, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgh:J

    invoke-virtual {p1, v0, v4, v5}, Lcom/google/android/gms/internal/wearable/zzl;->zza(IJ)V

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgi:I

    if-eqz v0, :cond_5

    const/4 v0, 0x6

    iget v1, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgi:I

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/wearable/zzl;->zzd(II)V

    :cond_5
    iget v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgj:I

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    iget v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgj:I

    const/4 v4, 0x7

    invoke-virtual {p1, v4, v1}, Lcom/google/android/gms/internal/wearable/zzl;->zzf(II)V

    invoke-static {v0}, Lcom/google/android/gms/internal/wearable/zzl;->zzn(I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/wearable/zzl;->zzl(I)V

    :cond_6
    iget-boolean v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgk:Z

    if-eqz v0, :cond_7

    iget-boolean v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgk:Z

    const/16 v4, 0x8

    invoke-virtual {p1, v4, v1}, Lcom/google/android/gms/internal/wearable/zzl;->zzf(II)V

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/wearable/zzl;->zza(B)V

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgl:[Lcom/google/android/gms/internal/wearable/zzh;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgl:[Lcom/google/android/gms/internal/wearable/zzh;

    array-length v0, v0

    if-lez v0, :cond_9

    move v0, v1

    :goto_0
    iget-object v4, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgl:[Lcom/google/android/gms/internal/wearable/zzh;

    array-length v4, v4

    if-ge v0, v4, :cond_9

    iget-object v4, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgl:[Lcom/google/android/gms/internal/wearable/zzh;

    aget-object v4, v4, v0

    if-eqz v4, :cond_8

    const/16 v5, 0x9

    invoke-virtual {p1, v5, v4}, Lcom/google/android/gms/internal/wearable/zzl;->zza(ILcom/google/android/gms/internal/wearable/zzt;)V

    :cond_8
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgm:[Lcom/google/android/gms/internal/wearable/zzi;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgm:[Lcom/google/android/gms/internal/wearable/zzi;

    array-length v0, v0

    if-lez v0, :cond_b

    move v0, v1

    :goto_1
    iget-object v4, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgm:[Lcom/google/android/gms/internal/wearable/zzi;

    array-length v4, v4

    if-ge v0, v4, :cond_b

    iget-object v4, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgm:[Lcom/google/android/gms/internal/wearable/zzi;

    aget-object v4, v4, v0

    if-eqz v4, :cond_a

    const/16 v5, 0xa

    invoke-virtual {p1, v5, v4}, Lcom/google/android/gms/internal/wearable/zzl;->zza(ILcom/google/android/gms/internal/wearable/zzt;)V

    :cond_a
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_b
    iget-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgn:[Ljava/lang/String;

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgn:[Ljava/lang/String;

    array-length v0, v0

    if-lez v0, :cond_d

    move v0, v1

    :goto_2
    iget-object v4, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgn:[Ljava/lang/String;

    array-length v4, v4

    if-ge v0, v4, :cond_d

    iget-object v4, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgn:[Ljava/lang/String;

    aget-object v4, v4, v0

    if-eqz v4, :cond_c

    const/16 v5, 0xb

    invoke-virtual {p1, v5, v4}, Lcom/google/android/gms/internal/wearable/zzl;->zza(ILjava/lang/String;)V

    :cond_c
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_d
    iget-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgo:[J

    if-eqz v0, :cond_e

    iget-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgo:[J

    array-length v0, v0

    if-lez v0, :cond_e

    move v0, v1

    :goto_3
    iget-object v4, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgo:[J

    array-length v4, v4

    if-ge v0, v4, :cond_e

    const/16 v4, 0xc

    iget-object v5, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgo:[J

    aget-wide v6, v5, v0

    invoke-virtual {p1, v4, v6, v7}, Lcom/google/android/gms/internal/wearable/zzl;->zza(IJ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_e
    iget-wide v4, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgq:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_f

    const/16 v0, 0xd

    iget-wide v2, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgq:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/wearable/zzl;->zza(IJ)V

    :cond_f
    iget-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgp:[F

    if-eqz v0, :cond_10

    iget-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgp:[F

    array-length v0, v0

    if-lez v0, :cond_10

    :goto_4
    iget-object v0, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgp:[F

    array-length v0, v0

    if-ge v1, v0, :cond_10

    const/16 v0, 0xe

    iget-object v2, p0, Lcom/google/android/gms/internal/wearable/zzj;->zzgp:[F

    aget v2, v2, v1

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/wearable/zzl;->zza(IF)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_10
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/wearable/zzn;->zza(Lcom/google/android/gms/internal/wearable/zzl;)V

    return-void
.end method

.method protected final zzg()I
    .locals 21

    move-object/from16 v0, p0

    invoke-super/range {p0 .. p0}, Lcom/google/android/gms/internal/wearable/zzn;->zzg()I

    move-result v1

    iget-object v2, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgd:[B

    sget-object v3, Lcom/google/android/gms/internal/wearable/zzw;->zzhy:[B

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    const/4 v3, 0x1

    if-nez v2, :cond_0

    iget-object v2, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgd:[B

    invoke-static {v3}, Lcom/google/android/gms/internal/wearable/zzl;->zzk(I)I

    move-result v4

    array-length v5, v2

    invoke-static {v5}, Lcom/google/android/gms/internal/wearable/zzl;->zzm(I)I

    move-result v5

    array-length v2, v2

    add-int/2addr v5, v2

    add-int/2addr v4, v5

    add-int/2addr v1, v4

    :cond_0
    iget-object v2, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzge:Ljava/lang/String;

    const/4 v4, 0x2

    if-eqz v2, :cond_1

    iget-object v2, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzge:Ljava/lang/String;

    const-string v5, ""

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzge:Ljava/lang/String;

    invoke-static {v4, v2}, Lcom/google/android/gms/internal/wearable/zzl;->zzb(ILjava/lang/String;)I

    move-result v2

    add-int/2addr v1, v2

    :cond_1
    iget-wide v5, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgf:D

    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v5

    const-wide/16 v7, 0x0

    invoke-static {v7, v8}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v7

    cmp-long v2, v5, v7

    const/4 v5, 0x3

    const/16 v6, 0x8

    if-eqz v2, :cond_2

    invoke-static {v5}, Lcom/google/android/gms/internal/wearable/zzl;->zzk(I)I

    move-result v2

    add-int/2addr v2, v6

    add-int/2addr v1, v2

    :cond_2
    iget v2, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgg:F

    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v2

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v7

    const/4 v8, 0x4

    if-eq v2, v7, :cond_3

    invoke-static {v8}, Lcom/google/android/gms/internal/wearable/zzl;->zzk(I)I

    move-result v2

    add-int/2addr v2, v8

    add-int/2addr v1, v2

    :cond_3
    iget-wide v9, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgh:J

    const-wide/16 v11, 0x0

    cmp-long v2, v9, v11

    const/4 v7, 0x5

    if-eqz v2, :cond_4

    iget-wide v9, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgh:J

    invoke-static {v7, v9, v10}, Lcom/google/android/gms/internal/wearable/zzl;->zzb(IJ)I

    move-result v2

    add-int/2addr v1, v2

    :cond_4
    iget v2, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgi:I

    const/4 v9, 0x6

    if-eqz v2, :cond_5

    iget v2, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgi:I

    invoke-static {v9, v2}, Lcom/google/android/gms/internal/wearable/zzl;->zze(II)I

    move-result v2

    add-int/2addr v1, v2

    :cond_5
    iget v2, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgj:I

    const/4 v10, 0x7

    if-eqz v2, :cond_6

    iget v2, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgj:I

    invoke-static {v10}, Lcom/google/android/gms/internal/wearable/zzl;->zzk(I)I

    move-result v13

    invoke-static {v2}, Lcom/google/android/gms/internal/wearable/zzl;->zzn(I)I

    move-result v2

    invoke-static {v2}, Lcom/google/android/gms/internal/wearable/zzl;->zzm(I)I

    move-result v2

    add-int/2addr v13, v2

    add-int/2addr v1, v13

    :cond_6
    iget-boolean v2, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgk:Z

    if-eqz v2, :cond_7

    invoke-static {v6}, Lcom/google/android/gms/internal/wearable/zzl;->zzk(I)I

    move-result v2

    add-int/2addr v2, v3

    add-int/2addr v1, v2

    :cond_7
    iget-object v2, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgl:[Lcom/google/android/gms/internal/wearable/zzh;

    const/16 v13, 0x9

    const/4 v14, 0x0

    if-eqz v2, :cond_a

    iget-object v2, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgl:[Lcom/google/android/gms/internal/wearable/zzh;

    array-length v2, v2

    if-lez v2, :cond_a

    move v2, v1

    move v1, v14

    :goto_0
    iget-object v15, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgl:[Lcom/google/android/gms/internal/wearable/zzh;

    array-length v15, v15

    if-ge v1, v15, :cond_9

    iget-object v15, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgl:[Lcom/google/android/gms/internal/wearable/zzh;

    aget-object v15, v15, v1

    if-eqz v15, :cond_8

    invoke-static {v13, v15}, Lcom/google/android/gms/internal/wearable/zzl;->zzb(ILcom/google/android/gms/internal/wearable/zzt;)I

    move-result v15

    add-int/2addr v2, v15

    :cond_8
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_9
    move v1, v2

    :cond_a
    iget-object v2, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgm:[Lcom/google/android/gms/internal/wearable/zzi;

    const/16 v15, 0xa

    if-eqz v2, :cond_d

    iget-object v2, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgm:[Lcom/google/android/gms/internal/wearable/zzi;

    array-length v2, v2

    if-lez v2, :cond_d

    move v2, v1

    move v1, v14

    :goto_1
    iget-object v4, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgm:[Lcom/google/android/gms/internal/wearable/zzi;

    array-length v4, v4

    if-ge v1, v4, :cond_c

    iget-object v4, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgm:[Lcom/google/android/gms/internal/wearable/zzi;

    aget-object v4, v4, v1

    if-eqz v4, :cond_b

    invoke-static {v15, v4}, Lcom/google/android/gms/internal/wearable/zzl;->zzb(ILcom/google/android/gms/internal/wearable/zzt;)I

    move-result v4

    add-int/2addr v2, v4

    :cond_b
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_c
    move v1, v2

    :cond_d
    iget-object v2, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgn:[Ljava/lang/String;

    if-eqz v2, :cond_10

    iget-object v2, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgn:[Ljava/lang/String;

    array-length v2, v2

    if-lez v2, :cond_10

    move v2, v14

    move v4, v2

    move/from16 v16, v4

    :goto_2
    iget-object v5, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgn:[Ljava/lang/String;

    array-length v5, v5

    if-ge v2, v5, :cond_f

    iget-object v5, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgn:[Ljava/lang/String;

    aget-object v5, v5, v2

    if-eqz v5, :cond_e

    add-int/lit8 v16, v16, 0x1

    invoke-static {v5}, Lcom/google/android/gms/internal/wearable/zzl;->zzg(Ljava/lang/String;)I

    move-result v5

    add-int/2addr v4, v5

    :cond_e
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_f
    add-int/2addr v1, v4

    mul-int v16, v16, v3

    add-int v1, v1, v16

    :cond_10
    iget-object v2, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgo:[J

    if-eqz v2, :cond_1b

    iget-object v2, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgo:[J

    array-length v2, v2

    if-lez v2, :cond_1b

    move v2, v14

    :goto_3
    iget-object v4, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgo:[J

    array-length v4, v4

    if-ge v14, v4, :cond_1a

    iget-object v4, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgo:[J

    aget-wide v17, v4, v14

    const-wide/16 v4, -0x80

    and-long v19, v17, v4

    cmp-long v4, v19, v11

    if-nez v4, :cond_11

    move v4, v3

    goto/16 :goto_4

    :cond_11
    const-wide/16 v4, -0x4000

    and-long v19, v17, v4

    cmp-long v4, v19, v11

    if-nez v4, :cond_12

    const/4 v4, 0x2

    goto :goto_4

    :cond_12
    const-wide/32 v4, -0x200000

    and-long v19, v17, v4

    cmp-long v4, v19, v11

    if-nez v4, :cond_13

    const/4 v4, 0x3

    goto :goto_4

    :cond_13
    const-wide/32 v4, -0x10000000

    and-long v19, v17, v4

    cmp-long v4, v19, v11

    if-nez v4, :cond_14

    move v4, v8

    goto :goto_4

    :cond_14
    const-wide v4, -0x800000000L

    and-long v19, v17, v4

    cmp-long v4, v19, v11

    if-nez v4, :cond_15

    move v4, v7

    goto :goto_4

    :cond_15
    const-wide v4, -0x40000000000L

    and-long v19, v17, v4

    cmp-long v4, v19, v11

    if-nez v4, :cond_16

    move v4, v9

    goto :goto_4

    :cond_16
    const-wide/high16 v4, -0x2000000000000L

    and-long v19, v17, v4

    cmp-long v4, v19, v11

    if-nez v4, :cond_17

    move v4, v10

    goto :goto_4

    :cond_17
    const-wide/high16 v4, -0x100000000000000L

    and-long v19, v17, v4

    cmp-long v4, v19, v11

    if-nez v4, :cond_18

    move v4, v6

    goto :goto_4

    :cond_18
    const-wide/high16 v4, -0x8000000000000000L

    and-long v19, v17, v4

    cmp-long v4, v19, v11

    if-nez v4, :cond_19

    move v4, v13

    goto :goto_4

    :cond_19
    move v4, v15

    :goto_4
    add-int/2addr v2, v4

    add-int/lit8 v14, v14, 0x1

    goto :goto_3

    :cond_1a
    add-int/2addr v1, v2

    iget-object v2, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgo:[J

    array-length v2, v2

    mul-int/2addr v2, v3

    add-int/2addr v1, v2

    :cond_1b
    iget-wide v4, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgq:J

    cmp-long v2, v4, v11

    if-eqz v2, :cond_1c

    const/16 v2, 0xd

    iget-wide v4, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgq:J

    invoke-static {v2, v4, v5}, Lcom/google/android/gms/internal/wearable/zzl;->zzb(IJ)I

    move-result v2

    add-int/2addr v1, v2

    :cond_1c
    iget-object v2, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgp:[F

    if-eqz v2, :cond_1d

    iget-object v2, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgp:[F

    array-length v2, v2

    if-lez v2, :cond_1d

    iget-object v2, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgp:[F

    array-length v2, v2

    mul-int/2addr v8, v2

    add-int/2addr v1, v8

    iget-object v2, v0, Lcom/google/android/gms/internal/wearable/zzj;->zzgp:[F

    array-length v2, v2

    mul-int/2addr v3, v2

    add-int/2addr v1, v3

    :cond_1d
    return v1
.end method
