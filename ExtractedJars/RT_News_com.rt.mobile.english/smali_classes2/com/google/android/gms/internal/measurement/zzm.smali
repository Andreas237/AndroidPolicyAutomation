.class public final Lcom/google/android/gms/internal/measurement/zzm;
.super Lcom/google/android/gms/internal/measurement/zzaca;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/measurement/zzaca<",
        "Lcom/google/android/gms/internal/measurement/zzm;",
        ">;"
    }
.end annotation


# static fields
.field private static volatile zzpx:[Lcom/google/android/gms/internal/measurement/zzm;


# instance fields
.field public string:Ljava/lang/String;

.field public type:I

.field public zzpy:[Lcom/google/android/gms/internal/measurement/zzm;

.field public zzpz:[Lcom/google/android/gms/internal/measurement/zzm;

.field public zzqa:[Lcom/google/android/gms/internal/measurement/zzm;

.field public zzqb:Ljava/lang/String;

.field public zzqc:Ljava/lang/String;

.field public zzqd:J

.field public zzqe:Z

.field public zzqf:[Lcom/google/android/gms/internal/measurement/zzm;

.field public zzqg:[I

.field public zzqh:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzaca;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->type:I

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->string:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzm;->zzg()[Lcom/google/android/gms/internal/measurement/zzm;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpy:[Lcom/google/android/gms/internal/measurement/zzm;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzm;->zzg()[Lcom/google/android/gms/internal/measurement/zzm;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpz:[Lcom/google/android/gms/internal/measurement/zzm;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzm;->zzg()[Lcom/google/android/gms/internal/measurement/zzm;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqa:[Lcom/google/android/gms/internal/measurement/zzm;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqb:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqc:Ljava/lang/String;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqd:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqe:Z

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzm;->zzg()[Lcom/google/android/gms/internal/measurement/zzm;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqf:[Lcom/google/android/gms/internal/measurement/zzm;

    sget-object v1, Lcom/google/android/gms/internal/measurement/zzacj;->zzbts:[I

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqg:[I

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqh:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzbxr:I

    return-void
.end method

.method private static zza(I)I
    .locals 3

    if-lez p0, :cond_0

    const/16 v0, 0x11

    if-gt p0, v0, :cond_0

    return p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const/16 v1, 0x28

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " is not a valid enum Escaping"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final zzc(Lcom/google/android/gms/internal/measurement/zzabx;)Lcom/google/android/gms/internal/measurement/zzm;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvf()I

    move-result v0

    const/16 v1, 0x50

    const/4 v2, 0x0

    sparse-switch v0, :sswitch_data_0

    invoke-super {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzaca;->zza(Lcom/google/android/gms/internal/measurement/zzabx;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :sswitch_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvg()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqe:Z

    goto :goto_0

    :sswitch_1
    const/16 v0, 0x5a

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/zzacj;->zzb(Lcom/google/android/gms/internal/measurement/zzabx;I)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqf:[Lcom/google/android/gms/internal/measurement/zzm;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqf:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v1, v1

    :goto_1
    add-int/2addr v0, v1

    new-array v0, v0, [Lcom/google/android/gms/internal/measurement/zzm;

    if-eqz v1, :cond_2

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqf:[Lcom/google/android/gms/internal/measurement/zzm;

    invoke-static {v3, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_2
    :goto_2
    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_3

    new-instance v2, Lcom/google/android/gms/internal/measurement/zzm;

    invoke-direct {v2}, Lcom/google/android/gms/internal/measurement/zzm;-><init>()V

    aput-object v2, v0, v1

    aget-object v2, v0, v1

    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/measurement/zzabx;->zza(Lcom/google/android/gms/internal/measurement/zzacg;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvf()I

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_3
    new-instance v2, Lcom/google/android/gms/internal/measurement/zzm;

    invoke-direct {v2}, Lcom/google/android/gms/internal/measurement/zzm;-><init>()V

    aput-object v2, v0, v1

    aget-object v1, v0, v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzabx;->zza(Lcom/google/android/gms/internal/measurement/zzacg;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqf:[Lcom/google/android/gms/internal/measurement/zzm;

    goto :goto_0

    :sswitch_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/zzabx;->zzaf(I)I

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->getPosition()I

    move-result v3

    move v4, v2

    :catch_0
    :goto_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvl()I

    move-result v5

    if-lez v5, :cond_4

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v5

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/zzm;->zza(I)I
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_4
    if-eqz v4, :cond_8

    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/measurement/zzabx;->zzam(I)V

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqg:[I

    if-nez v3, :cond_5

    move v3, v2

    goto :goto_4

    :cond_5
    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqg:[I

    array-length v3, v3

    :goto_4
    add-int/2addr v4, v3

    new-array v4, v4, [I

    if-eqz v3, :cond_6

    iget-object v5, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqg:[I

    invoke-static {v5, v2, v4, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_6
    :goto_5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvl()I

    move-result v2

    if-lez v2, :cond_7

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->getPosition()I

    move-result v2

    :try_start_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v5

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/zzm;->zza(I)I

    move-result v5

    aput v5, v4, v3
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :catch_1
    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/measurement/zzabx;->zzam(I)V

    invoke-virtual {p0, p1, v1}, Lcom/google/android/gms/internal/measurement/zzaca;->zza(Lcom/google/android/gms/internal/measurement/zzabx;I)Z

    goto :goto_5

    :cond_7
    iput-object v4, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqg:[I

    :cond_8
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/zzabx;->zzal(I)V

    goto/16 :goto_0

    :sswitch_3
    invoke-static {p1, v1}, Lcom/google/android/gms/internal/measurement/zzacj;->zzb(Lcom/google/android/gms/internal/measurement/zzabx;I)I

    move-result v1

    new-array v3, v1, [I

    move v4, v2

    move v5, v4

    :goto_6
    if-ge v4, v1, :cond_a

    if-eqz v4, :cond_9

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvf()I

    :cond_9
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->getPosition()I

    move-result v6

    :try_start_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v7

    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/zzm;->zza(I)I

    move-result v7

    aput v7, v3, v5
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    add-int/lit8 v5, v5, 0x1

    goto :goto_7

    :catch_2
    invoke-virtual {p1, v6}, Lcom/google/android/gms/internal/measurement/zzabx;->zzam(I)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzaca;->zza(Lcom/google/android/gms/internal/measurement/zzabx;I)Z

    :goto_7
    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :cond_a
    if-eqz v5, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqg:[I

    if-nez v0, :cond_b

    move v0, v2

    goto :goto_8

    :cond_b
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqg:[I

    array-length v0, v0

    :goto_8
    if-nez v0, :cond_c

    array-length v1, v3

    if-ne v5, v1, :cond_c

    iput-object v3, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqg:[I

    goto/16 :goto_0

    :cond_c
    add-int v1, v0, v5

    new-array v1, v1, [I

    if-eqz v0, :cond_d

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqg:[I

    invoke-static {v4, v2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_d
    invoke-static {v3, v2, v1, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqg:[I

    goto/16 :goto_0

    :sswitch_4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvg()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqh:Z

    goto/16 :goto_0

    :sswitch_5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvi()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqd:J

    goto/16 :goto_0

    :sswitch_6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqc:Ljava/lang/String;

    goto/16 :goto_0

    :sswitch_7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqb:Ljava/lang/String;

    goto/16 :goto_0

    :sswitch_8
    const/16 v0, 0x2a

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/zzacj;->zzb(Lcom/google/android/gms/internal/measurement/zzabx;I)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqa:[Lcom/google/android/gms/internal/measurement/zzm;

    if-nez v1, :cond_e

    move v1, v2

    goto :goto_9

    :cond_e
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqa:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v1, v1

    :goto_9
    add-int/2addr v0, v1

    new-array v0, v0, [Lcom/google/android/gms/internal/measurement/zzm;

    if-eqz v1, :cond_f

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqa:[Lcom/google/android/gms/internal/measurement/zzm;

    invoke-static {v3, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_f
    :goto_a
    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_10

    new-instance v2, Lcom/google/android/gms/internal/measurement/zzm;

    invoke-direct {v2}, Lcom/google/android/gms/internal/measurement/zzm;-><init>()V

    aput-object v2, v0, v1

    aget-object v2, v0, v1

    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/measurement/zzabx;->zza(Lcom/google/android/gms/internal/measurement/zzacg;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvf()I

    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_10
    new-instance v2, Lcom/google/android/gms/internal/measurement/zzm;

    invoke-direct {v2}, Lcom/google/android/gms/internal/measurement/zzm;-><init>()V

    aput-object v2, v0, v1

    aget-object v1, v0, v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzabx;->zza(Lcom/google/android/gms/internal/measurement/zzacg;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqa:[Lcom/google/android/gms/internal/measurement/zzm;

    goto/16 :goto_0

    :sswitch_9
    const/16 v0, 0x22

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/zzacj;->zzb(Lcom/google/android/gms/internal/measurement/zzabx;I)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpz:[Lcom/google/android/gms/internal/measurement/zzm;

    if-nez v1, :cond_11

    move v1, v2

    goto :goto_b

    :cond_11
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpz:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v1, v1

    :goto_b
    add-int/2addr v0, v1

    new-array v0, v0, [Lcom/google/android/gms/internal/measurement/zzm;

    if-eqz v1, :cond_12

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpz:[Lcom/google/android/gms/internal/measurement/zzm;

    invoke-static {v3, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_12
    :goto_c
    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_13

    new-instance v2, Lcom/google/android/gms/internal/measurement/zzm;

    invoke-direct {v2}, Lcom/google/android/gms/internal/measurement/zzm;-><init>()V

    aput-object v2, v0, v1

    aget-object v2, v0, v1

    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/measurement/zzabx;->zza(Lcom/google/android/gms/internal/measurement/zzacg;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvf()I

    add-int/lit8 v1, v1, 0x1

    goto :goto_c

    :cond_13
    new-instance v2, Lcom/google/android/gms/internal/measurement/zzm;

    invoke-direct {v2}, Lcom/google/android/gms/internal/measurement/zzm;-><init>()V

    aput-object v2, v0, v1

    aget-object v1, v0, v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzabx;->zza(Lcom/google/android/gms/internal/measurement/zzacg;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpz:[Lcom/google/android/gms/internal/measurement/zzm;

    goto/16 :goto_0

    :sswitch_a
    const/16 v0, 0x1a

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/zzacj;->zzb(Lcom/google/android/gms/internal/measurement/zzabx;I)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpy:[Lcom/google/android/gms/internal/measurement/zzm;

    if-nez v1, :cond_14

    move v1, v2

    goto :goto_d

    :cond_14
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpy:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v1, v1

    :goto_d
    add-int/2addr v0, v1

    new-array v0, v0, [Lcom/google/android/gms/internal/measurement/zzm;

    if-eqz v1, :cond_15

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpy:[Lcom/google/android/gms/internal/measurement/zzm;

    invoke-static {v3, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_15
    :goto_e
    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_16

    new-instance v2, Lcom/google/android/gms/internal/measurement/zzm;

    invoke-direct {v2}, Lcom/google/android/gms/internal/measurement/zzm;-><init>()V

    aput-object v2, v0, v1

    aget-object v2, v0, v1

    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/measurement/zzabx;->zza(Lcom/google/android/gms/internal/measurement/zzacg;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvf()I

    add-int/lit8 v1, v1, 0x1

    goto :goto_e

    :cond_16
    new-instance v2, Lcom/google/android/gms/internal/measurement/zzm;

    invoke-direct {v2}, Lcom/google/android/gms/internal/measurement/zzm;-><init>()V

    aput-object v2, v0, v1

    aget-object v1, v0, v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzabx;->zza(Lcom/google/android/gms/internal/measurement/zzacg;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpy:[Lcom/google/android/gms/internal/measurement/zzm;

    goto/16 :goto_0

    :sswitch_b
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->string:Ljava/lang/String;

    goto/16 :goto_0

    :sswitch_c
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->getPosition()I

    move-result v1

    :try_start_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v2

    if-lez v2, :cond_17

    const/16 v3, 0x8

    if-gt v2, v3, :cond_17

    iput v2, p0, Lcom/google/android/gms/internal/measurement/zzm;->type:I

    goto/16 :goto_0

    :cond_17
    new-instance v3, Ljava/lang/IllegalArgumentException;

    const/16 v4, 0x24

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " is not a valid enum Type"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzam(I)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzaca;->zza(Lcom/google/android/gms/internal/measurement/zzabx;I)Z

    goto/16 :goto_0

    :sswitch_d
    return-object p0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_d
        0x8 -> :sswitch_c
        0x12 -> :sswitch_b
        0x1a -> :sswitch_a
        0x22 -> :sswitch_9
        0x2a -> :sswitch_8
        0x32 -> :sswitch_7
        0x3a -> :sswitch_6
        0x40 -> :sswitch_5
        0x48 -> :sswitch_4
        0x50 -> :sswitch_3
        0x52 -> :sswitch_2
        0x5a -> :sswitch_1
        0x60 -> :sswitch_0
    .end sparse-switch
.end method

.method public static zzg()[Lcom/google/android/gms/internal/measurement/zzm;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzm;->zzpx:[Lcom/google/android/gms/internal/measurement/zzm;

    if-nez v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzace;->zzbxq:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzm;->zzpx:[Lcom/google/android/gms/internal/measurement/zzm;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    new-array v1, v1, [Lcom/google/android/gms/internal/measurement/zzm;

    sput-object v1, Lcom/google/android/gms/internal/measurement/zzm;->zzpx:[Lcom/google/android/gms/internal/measurement/zzm;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzm;->zzpx:[Lcom/google/android/gms/internal/measurement/zzm;

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/measurement/zzm;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzm;

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->type:I

    iget v3, p1, Lcom/google/android/gms/internal/measurement/zzm;->type:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->string:Ljava/lang/String;

    if-nez v1, :cond_3

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzm;->string:Ljava/lang/String;

    if-eqz v1, :cond_4

    return v2

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->string:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzm;->string:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpy:[Lcom/google/android/gms/internal/measurement/zzm;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzm;->zzpy:[Lcom/google/android/gms/internal/measurement/zzm;

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/zzace;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpz:[Lcom/google/android/gms/internal/measurement/zzm;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzm;->zzpz:[Lcom/google/android/gms/internal/measurement/zzm;

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/zzace;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqa:[Lcom/google/android/gms/internal/measurement/zzm;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzm;->zzqa:[Lcom/google/android/gms/internal/measurement/zzm;

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/zzace;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqb:Ljava/lang/String;

    if-nez v1, :cond_8

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzm;->zzqb:Ljava/lang/String;

    if-eqz v1, :cond_9

    return v2

    :cond_8
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqb:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzm;->zzqb:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqc:Ljava/lang/String;

    if-nez v1, :cond_a

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzm;->zzqc:Ljava/lang/String;

    if-eqz v1, :cond_b

    return v2

    :cond_a
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqc:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzm;->zzqc:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-wide v3, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqd:J

    iget-wide v5, p1, Lcom/google/android/gms/internal/measurement/zzm;->zzqd:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqe:Z

    iget-boolean v3, p1, Lcom/google/android/gms/internal/measurement/zzm;->zzqe:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqf:[Lcom/google/android/gms/internal/measurement/zzm;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzm;->zzqf:[Lcom/google/android/gms/internal/measurement/zzm;

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/zzace;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqg:[I

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzm;->zzqg:[I

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/zzace;->equals([I[I)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqh:Z

    iget-boolean v3, p1, Lcom/google/android/gms/internal/measurement/zzm;->zzqh:Z

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    if-eqz v1, :cond_12

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzacc;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_11

    goto :goto_0

    :cond_11
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzm;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzacc;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_12
    :goto_0
    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzm;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    if-eqz v1, :cond_14

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzm;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzacc;->isEmpty()Z

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

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->type:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->string:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->string:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpy:[Lcom/google/android/gms/internal/measurement/zzm;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzace;->hashCode([Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpz:[Lcom/google/android/gms/internal/measurement/zzm;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzace;->hashCode([Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqa:[Lcom/google/android/gms/internal/measurement/zzm;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzace;->hashCode([Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqb:Ljava/lang/String;

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqb:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqc:Ljava/lang/String;

    if-nez v0, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqc:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v3, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqd:J

    iget-wide v5, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqd:J

    const/16 v0, 0x20

    ushr-long/2addr v5, v0

    xor-long v7, v3, v5

    long-to-int v0, v7

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqe:Z

    const/16 v3, 0x4d5

    const/16 v4, 0x4cf

    if-eqz v0, :cond_3

    move v0, v4

    goto :goto_3

    :cond_3
    move v0, v3

    :goto_3
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqf:[Lcom/google/android/gms/internal/measurement/zzm;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzace;->hashCode([Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqg:[I

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzace;->hashCode([I)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqh:Z

    if-eqz v0, :cond_4

    move v3, v4

    :cond_4
    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzacc;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_4

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzacc;->hashCode()I

    move-result v2

    :cond_6
    :goto_4
    add-int/2addr v1, v2

    return v1
.end method

.method protected final zza()I
    .locals 8

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzaca;->zza()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->type:I

    const/4 v2, 0x1

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/measurement/zzaby;->zzf(II)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->string:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->string:Ljava/lang/String;

    const-string v3, ""

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x2

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzm;->string:Ljava/lang/String;

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/zzaby;->zzc(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpy:[Lcom/google/android/gms/internal/measurement/zzm;

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpy:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v1, v1

    if-lez v1, :cond_3

    move v1, v0

    move v0, v3

    :goto_0
    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpy:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v4, v4

    if-ge v0, v4, :cond_2

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpy:[Lcom/google/android/gms/internal/measurement/zzm;

    aget-object v4, v4, v0

    if-eqz v4, :cond_1

    const/4 v5, 0x3

    invoke-static {v5, v4}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(ILcom/google/android/gms/internal/measurement/zzacg;)I

    move-result v4

    add-int/2addr v1, v4

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    move v0, v1

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpz:[Lcom/google/android/gms/internal/measurement/zzm;

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpz:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v1, v1

    if-lez v1, :cond_6

    move v1, v0

    move v0, v3

    :goto_1
    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpz:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v4, v4

    if-ge v0, v4, :cond_5

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpz:[Lcom/google/android/gms/internal/measurement/zzm;

    aget-object v4, v4, v0

    if-eqz v4, :cond_4

    const/4 v5, 0x4

    invoke-static {v5, v4}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(ILcom/google/android/gms/internal/measurement/zzacg;)I

    move-result v4

    add-int/2addr v1, v4

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    move v0, v1

    :cond_6
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqa:[Lcom/google/android/gms/internal/measurement/zzm;

    if-eqz v1, :cond_9

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqa:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v1, v1

    if-lez v1, :cond_9

    move v1, v0

    move v0, v3

    :goto_2
    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqa:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v4, v4

    if-ge v0, v4, :cond_8

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqa:[Lcom/google/android/gms/internal/measurement/zzm;

    aget-object v4, v4, v0

    if-eqz v4, :cond_7

    const/4 v5, 0x5

    invoke-static {v5, v4}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(ILcom/google/android/gms/internal/measurement/zzacg;)I

    move-result v4

    add-int/2addr v1, v4

    :cond_7
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_8
    move v0, v1

    :cond_9
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqb:Ljava/lang/String;

    if-eqz v1, :cond_a

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqb:Ljava/lang/String;

    const-string v4, ""

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    const/4 v1, 0x6

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqb:Ljava/lang/String;

    invoke-static {v1, v4}, Lcom/google/android/gms/internal/measurement/zzaby;->zzc(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_a
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqc:Ljava/lang/String;

    if-eqz v1, :cond_b

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqc:Ljava/lang/String;

    const-string v4, ""

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    const/4 v1, 0x7

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqc:Ljava/lang/String;

    invoke-static {v1, v4}, Lcom/google/android/gms/internal/measurement/zzaby;->zzc(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_b
    iget-wide v4, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqd:J

    const-wide/16 v6, 0x0

    cmp-long v1, v4, v6

    if-eqz v1, :cond_c

    const/16 v1, 0x8

    iget-wide v4, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqd:J

    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/measurement/zzaby;->zzc(IJ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_c
    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqh:Z

    if-eqz v1, :cond_d

    const/16 v1, 0x9

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/zzaby;->zzaq(I)I

    move-result v1

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    :cond_d
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqg:[I

    if-eqz v1, :cond_f

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqg:[I

    array-length v1, v1

    if-lez v1, :cond_f

    move v1, v3

    move v4, v1

    :goto_3
    iget-object v5, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqg:[I

    array-length v5, v5

    if-ge v1, v5, :cond_e

    iget-object v5, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqg:[I

    aget v5, v5, v1

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/zzaby;->zzao(I)I

    move-result v5

    add-int/2addr v4, v5

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_e
    add-int/2addr v0, v4

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqg:[I

    array-length v1, v1

    mul-int/2addr v1, v2

    add-int/2addr v0, v1

    :cond_f
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqf:[Lcom/google/android/gms/internal/measurement/zzm;

    if-eqz v1, :cond_11

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqf:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v1, v1

    if-lez v1, :cond_11

    :goto_4
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqf:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v1, v1

    if-ge v3, v1, :cond_11

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqf:[Lcom/google/android/gms/internal/measurement/zzm;

    aget-object v1, v1, v3

    if-eqz v1, :cond_10

    const/16 v4, 0xb

    invoke-static {v4, v1}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(ILcom/google/android/gms/internal/measurement/zzacg;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_10
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_11
    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqe:Z

    if-eqz v1, :cond_12

    const/16 v1, 0xc

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/zzaby;->zzaq(I)I

    move-result v1

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    :cond_12
    return v0
.end method

.method public final zza(Lcom/google/android/gms/internal/measurement/zzaby;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->type:I

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/measurement/zzaby;->zze(II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->string:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->string:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->string:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(ILjava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpy:[Lcom/google/android/gms/internal/measurement/zzm;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpy:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v0, v0

    if-lez v0, :cond_2

    move v0, v1

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpy:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v2, v2

    if-ge v0, v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpy:[Lcom/google/android/gms/internal/measurement/zzm;

    aget-object v2, v2, v0

    if-eqz v2, :cond_1

    const/4 v3, 0x3

    invoke-virtual {p1, v3, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zza(ILcom/google/android/gms/internal/measurement/zzacg;)V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpz:[Lcom/google/android/gms/internal/measurement/zzm;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpz:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v0, v0

    if-lez v0, :cond_4

    move v0, v1

    :goto_1
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpz:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v2, v2

    if-ge v0, v2, :cond_4

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzpz:[Lcom/google/android/gms/internal/measurement/zzm;

    aget-object v2, v2, v0

    if-eqz v2, :cond_3

    const/4 v3, 0x4

    invoke-virtual {p1, v3, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zza(ILcom/google/android/gms/internal/measurement/zzacg;)V

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqa:[Lcom/google/android/gms/internal/measurement/zzm;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqa:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v0, v0

    if-lez v0, :cond_6

    move v0, v1

    :goto_2
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqa:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v2, v2

    if-ge v0, v2, :cond_6

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqa:[Lcom/google/android/gms/internal/measurement/zzm;

    aget-object v2, v2, v0

    if-eqz v2, :cond_5

    const/4 v3, 0x5

    invoke-virtual {p1, v3, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zza(ILcom/google/android/gms/internal/measurement/zzacg;)V

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqb:Ljava/lang/String;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqb:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    const/4 v0, 0x6

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqb:Ljava/lang/String;

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(ILjava/lang/String;)V

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqc:Ljava/lang/String;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqc:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    const/4 v0, 0x7

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqc:Ljava/lang/String;

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(ILjava/lang/String;)V

    :cond_8
    iget-wide v2, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqd:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-eqz v0, :cond_9

    const/16 v0, 0x8

    iget-wide v2, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqd:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(IJ)V

    :cond_9
    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqh:Z

    if-eqz v0, :cond_a

    const/16 v0, 0x9

    iget-boolean v2, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqh:Z

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zza(IZ)V

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqg:[I

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqg:[I

    array-length v0, v0

    if-lez v0, :cond_b

    move v0, v1

    :goto_3
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqg:[I

    array-length v2, v2

    if-ge v0, v2, :cond_b

    const/16 v2, 0xa

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqg:[I

    aget v3, v3, v0

    invoke-virtual {p1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzaby;->zze(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_b
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqf:[Lcom/google/android/gms/internal/measurement/zzm;

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqf:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v0, v0

    if-lez v0, :cond_d

    :goto_4
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqf:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v0, v0

    if-ge v1, v0, :cond_d

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqf:[Lcom/google/android/gms/internal/measurement/zzm;

    aget-object v0, v0, v1

    if-eqz v0, :cond_c

    const/16 v2, 0xb

    invoke-virtual {p1, v2, v0}, Lcom/google/android/gms/internal/measurement/zzaby;->zza(ILcom/google/android/gms/internal/measurement/zzacg;)V

    :cond_c
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_d
    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqe:Z

    if-eqz v0, :cond_e

    const/16 v0, 0xc

    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/zzm;->zzqe:Z

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/zzaby;->zza(IZ)V

    :cond_e
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/measurement/zzaca;->zza(Lcom/google/android/gms/internal/measurement/zzaby;)V

    return-void
.end method

.method public final synthetic zzb(Lcom/google/android/gms/internal/measurement/zzabx;)Lcom/google/android/gms/internal/measurement/zzacg;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzm;->zzc(Lcom/google/android/gms/internal/measurement/zzabx;)Lcom/google/android/gms/internal/measurement/zzm;

    move-result-object p1

    return-object p1
.end method
