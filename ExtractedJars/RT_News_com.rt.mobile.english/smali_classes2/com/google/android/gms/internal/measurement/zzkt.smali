.class public final Lcom/google/android/gms/internal/measurement/zzkt;
.super Lcom/google/android/gms/internal/measurement/zzaca;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/measurement/zzaca<",
        "Lcom/google/android/gms/internal/measurement/zzkt;",
        ">;"
    }
.end annotation


# instance fields
.field public zzauw:[J

.field public zzaux:[J


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzaca;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzacj;->zzbxw:[J

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzauw:[J

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzacj;->zzbxw:[J

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzaux:[J

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzbxr:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/measurement/zzkt;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzkt;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzauw:[J

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzkt;->zzauw:[J

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/zzace;->equals([J[J)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzaux:[J

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzkt;->zzaux:[J

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/zzace;->equals([J[J)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzacc;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzkt;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzacc;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_5
    :goto_0
    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzkt;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    if-eqz v1, :cond_7

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzkt;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzacc;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_6

    return v0

    :cond_6
    return v2

    :cond_7
    return v0
.end method

.method public final hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzauw:[J

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzace;->hashCode([J)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzaux:[J

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzace;->hashCode([J)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzacc;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzacc;->hashCode()I

    move-result v0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    :goto_1
    add-int/2addr v1, v0

    return v1
.end method

.method protected final zza()I
    .locals 8

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzaca;->zza()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzauw:[J

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzauw:[J

    array-length v1, v1

    if-lez v1, :cond_1

    move v1, v3

    move v4, v1

    :goto_0
    iget-object v5, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzauw:[J

    array-length v5, v5

    if-ge v1, v5, :cond_0

    iget-object v5, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzauw:[J

    aget-wide v6, v5, v1

    invoke-static {v6, v7}, Lcom/google/android/gms/internal/measurement/zzaby;->zzao(J)I

    move-result v5

    add-int/2addr v4, v5

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    add-int/2addr v0, v4

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzauw:[J

    array-length v1, v1

    mul-int/2addr v1, v2

    add-int/2addr v0, v1

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzaux:[J

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzaux:[J

    array-length v1, v1

    if-lez v1, :cond_3

    move v1, v3

    :goto_1
    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzaux:[J

    array-length v4, v4

    if-ge v3, v4, :cond_2

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzaux:[J

    aget-wide v5, v4, v3

    invoke-static {v5, v6}, Lcom/google/android/gms/internal/measurement/zzaby;->zzao(J)I

    move-result v4

    add-int/2addr v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzaux:[J

    array-length v1, v1

    mul-int/2addr v2, v1

    add-int/2addr v0, v2

    :cond_3
    return v0
.end method

.method public final zza(Lcom/google/android/gms/internal/measurement/zzaby;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzauw:[J

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzauw:[J

    array-length v0, v0

    if-lez v0, :cond_0

    move v0, v1

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzauw:[J

    array-length v2, v2

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzauw:[J

    aget-wide v3, v2, v0

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v3, v4}, Lcom/google/android/gms/internal/measurement/zzaby;->zza(IJ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzaux:[J

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzaux:[J

    array-length v0, v0

    if-lez v0, :cond_1

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzaux:[J

    array-length v0, v0

    if-ge v1, v0, :cond_1

    const/4 v0, 0x2

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzaux:[J

    aget-wide v3, v2, v1

    invoke-virtual {p1, v0, v3, v4}, Lcom/google/android/gms/internal/measurement/zzaby;->zza(IJ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/measurement/zzaca;->zza(Lcom/google/android/gms/internal/measurement/zzaby;)V

    return-void
.end method

.method public final synthetic zzb(Lcom/google/android/gms/internal/measurement/zzabx;)Lcom/google/android/gms/internal/measurement/zzacg;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvf()I

    move-result v0

    if-eqz v0, :cond_13

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-eq v0, v1, :cond_f

    const/16 v1, 0xa

    if-eq v0, v1, :cond_a

    const/16 v1, 0x10

    if-eq v0, v1, :cond_6

    const/16 v1, 0x12

    if-eq v0, v1, :cond_1

    invoke-super {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzaca;->zza(Lcom/google/android/gms/internal/measurement/zzabx;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/zzabx;->zzaf(I)I

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->getPosition()I

    move-result v1

    move v3, v2

    :goto_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvl()I

    move-result v4

    if-lez v4, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvi()J

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzam(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzaux:[J

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_2

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzaux:[J

    array-length v1, v1

    :goto_2
    add-int/2addr v3, v1

    new-array v3, v3, [J

    if-eqz v1, :cond_4

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzaux:[J

    invoke-static {v4, v2, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_4
    :goto_3
    array-length v2, v3

    if-ge v1, v2, :cond_5

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvi()J

    move-result-wide v4

    aput-wide v4, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_5
    iput-object v3, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzaux:[J

    goto/16 :goto_9

    :cond_6
    invoke-static {p1, v1}, Lcom/google/android/gms/internal/measurement/zzacj;->zzb(Lcom/google/android/gms/internal/measurement/zzabx;I)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzaux:[J

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_4

    :cond_7
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzaux:[J

    array-length v1, v1

    :goto_4
    add-int/2addr v0, v1

    new-array v0, v0, [J

    if-eqz v1, :cond_8

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzaux:[J

    invoke-static {v3, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_8
    :goto_5
    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_9

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvi()J

    move-result-wide v2

    aput-wide v2, v0, v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvf()I

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_9
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvi()J

    move-result-wide v2

    aput-wide v2, v0, v1

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzaux:[J

    goto/16 :goto_0

    :cond_a
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/zzabx;->zzaf(I)I

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->getPosition()I

    move-result v1

    move v3, v2

    :goto_6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvl()I

    move-result v4

    if-lez v4, :cond_b

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvi()J

    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_b
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzam(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzauw:[J

    if-nez v1, :cond_c

    move v1, v2

    goto :goto_7

    :cond_c
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzauw:[J

    array-length v1, v1

    :goto_7
    add-int/2addr v3, v1

    new-array v3, v3, [J

    if-eqz v1, :cond_d

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzauw:[J

    invoke-static {v4, v2, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_d
    :goto_8
    array-length v2, v3

    if-ge v1, v2, :cond_e

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvi()J

    move-result-wide v4

    aput-wide v4, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    :cond_e
    iput-object v3, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzauw:[J

    :goto_9
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/zzabx;->zzal(I)V

    goto/16 :goto_0

    :cond_f
    invoke-static {p1, v1}, Lcom/google/android/gms/internal/measurement/zzacj;->zzb(Lcom/google/android/gms/internal/measurement/zzabx;I)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzauw:[J

    if-nez v1, :cond_10

    move v1, v2

    goto :goto_a

    :cond_10
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzauw:[J

    array-length v1, v1

    :goto_a
    add-int/2addr v0, v1

    new-array v0, v0, [J

    if-eqz v1, :cond_11

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzauw:[J

    invoke-static {v3, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_11
    :goto_b
    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_12

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvi()J

    move-result-wide v2

    aput-wide v2, v0, v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvf()I

    add-int/lit8 v1, v1, 0x1

    goto :goto_b

    :cond_12
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvi()J

    move-result-wide v2

    aput-wide v2, v0, v1

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzkt;->zzauw:[J

    goto/16 :goto_0

    :cond_13
    return-object p0
.end method
