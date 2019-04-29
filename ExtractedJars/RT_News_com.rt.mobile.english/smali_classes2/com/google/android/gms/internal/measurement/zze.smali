.class public final Lcom/google/android/gms/internal/measurement/zze;
.super Lcom/google/android/gms/internal/measurement/zzaca;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/measurement/zzaca<",
        "Lcom/google/android/gms/internal/measurement/zze;",
        ">;"
    }
.end annotation


# static fields
.field private static volatile zzns:[Lcom/google/android/gms/internal/measurement/zze;


# instance fields
.field private name:I

.field public zznt:[I

.field private zznu:I

.field private zznv:Z

.field private zznw:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzaca;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzacj;->zzbts:[I

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zze;->zznt:[I

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zze;->zznu:I

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zze;->name:I

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zze;->zznv:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zze;->zznw:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zze;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zze;->zzbxr:I

    return-void
.end method

.method public static zzb()[Lcom/google/android/gms/internal/measurement/zze;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/measurement/zze;->zzns:[Lcom/google/android/gms/internal/measurement/zze;

    if-nez v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzace;->zzbxq:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/measurement/zze;->zzns:[Lcom/google/android/gms/internal/measurement/zze;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    new-array v1, v1, [Lcom/google/android/gms/internal/measurement/zze;

    sput-object v1, Lcom/google/android/gms/internal/measurement/zze;->zzns:[Lcom/google/android/gms/internal/measurement/zze;

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
    sget-object v0, Lcom/google/android/gms/internal/measurement/zze;->zzns:[Lcom/google/android/gms/internal/measurement/zze;

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/measurement/zze;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/measurement/zze;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zze;->zznt:[I

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zze;->zznt:[I

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/zzace;->equals([I[I)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/google/android/gms/internal/measurement/zze;->zznu:I

    iget v3, p1, Lcom/google/android/gms/internal/measurement/zze;->zznu:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/google/android/gms/internal/measurement/zze;->name:I

    iget v3, p1, Lcom/google/android/gms/internal/measurement/zze;->name:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/zze;->zznv:Z

    iget-boolean v3, p1, Lcom/google/android/gms/internal/measurement/zze;->zznv:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/zze;->zznw:Z

    iget-boolean v3, p1, Lcom/google/android/gms/internal/measurement/zze;->zznw:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zze;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    if-eqz v1, :cond_8

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zze;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzacc;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_0

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zze;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zze;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzacc;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_8
    :goto_0
    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zze;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    if-eqz v1, :cond_a

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zze;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzacc;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_9

    return v0

    :cond_9
    return v2

    :cond_a
    return v0
.end method

.method public final hashCode()I
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zze;->zznt:[I

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzace;->hashCode([I)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zze;->zznu:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zze;->name:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zze;->zznv:Z

    const/16 v2, 0x4d5

    const/16 v3, 0x4cf

    if-eqz v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zze;->zznw:Z

    if-eqz v0, :cond_1

    move v2, v3

    :cond_1
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zze;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zze;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzacc;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zze;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzacc;->hashCode()I

    move-result v0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v0, 0x0

    :goto_2
    add-int/2addr v1, v0

    return v1
.end method

.method protected final zza()I
    .locals 5

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzaca;->zza()I

    move-result v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/zze;->zznw:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zzaq(I)I

    move-result v1

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    :cond_0
    const/4 v1, 0x2

    iget v3, p0, Lcom/google/android/gms/internal/measurement/zze;->zznu:I

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/zzaby;->zzf(II)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zze;->zznt:[I

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zze;->zznt:[I

    array-length v1, v1

    if-lez v1, :cond_2

    const/4 v1, 0x0

    move v3, v1

    :goto_0
    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zze;->zznt:[I

    array-length v4, v4

    if-ge v1, v4, :cond_1

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zze;->zznt:[I

    aget v4, v4, v1

    invoke-static {v4}, Lcom/google/android/gms/internal/measurement/zzaby;->zzao(I)I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    add-int/2addr v0, v3

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zze;->zznt:[I

    array-length v1, v1

    mul-int/2addr v1, v2

    add-int/2addr v0, v1

    :cond_2
    iget v1, p0, Lcom/google/android/gms/internal/measurement/zze;->name:I

    if-eqz v1, :cond_3

    const/4 v1, 0x4

    iget v3, p0, Lcom/google/android/gms/internal/measurement/zze;->name:I

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/zzaby;->zzf(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/zze;->zznv:Z

    if-eqz v1, :cond_4

    const/4 v1, 0x6

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/zzaby;->zzaq(I)I

    move-result v1

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    :cond_4
    return v0
.end method

.method public final zza(Lcom/google/android/gms/internal/measurement/zzaby;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zze;->zznw:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zze;->zznw:Z

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/measurement/zzaby;->zza(IZ)V

    :cond_0
    const/4 v0, 0x2

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zze;->zznu:I

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/zzaby;->zze(II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zze;->zznt:[I

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zze;->zznt:[I

    array-length v0, v0

    if-lez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zze;->zznt:[I

    array-length v1, v1

    if-ge v0, v1, :cond_1

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zze;->zznt:[I

    aget v2, v2, v0

    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zze(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zze;->name:I

    if-eqz v0, :cond_2

    const/4 v0, 0x4

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zze;->name:I

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/zzaby;->zze(II)V

    :cond_2
    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zze;->zznv:Z

    if-eqz v0, :cond_3

    const/4 v0, 0x6

    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/zze;->zznv:Z

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/zzaby;->zza(IZ)V

    :cond_3
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/measurement/zzaca;->zza(Lcom/google/android/gms/internal/measurement/zzaby;)V

    return-void
.end method

.method public final synthetic zzb(Lcom/google/android/gms/internal/measurement/zzabx;)Lcom/google/android/gms/internal/measurement/zzacg;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvf()I

    move-result v0

    if-eqz v0, :cond_e

    const/16 v1, 0x8

    if-eq v0, v1, :cond_d

    const/16 v1, 0x10

    if-eq v0, v1, :cond_c

    const/16 v1, 0x18

    const/4 v2, 0x0

    if-eq v0, v1, :cond_8

    const/16 v1, 0x1a

    if-eq v0, v1, :cond_3

    const/16 v1, 0x20

    if-eq v0, v1, :cond_2

    const/16 v1, 0x30

    if-eq v0, v1, :cond_1

    invoke-super {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzaca;->zza(Lcom/google/android/gms/internal/measurement/zzabx;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvg()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zze;->zznv:Z

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zze;->name:I

    goto :goto_0

    :cond_3
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

    if-lez v4, :cond_4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzam(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zze;->zznt:[I

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_2

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zze;->zznt:[I

    array-length v1, v1

    :goto_2
    add-int/2addr v3, v1

    new-array v3, v3, [I

    if-eqz v1, :cond_6

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zze;->zznt:[I

    invoke-static {v4, v2, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_6
    :goto_3
    array-length v2, v3

    if-ge v1, v2, :cond_7

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v2

    aput v2, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_7
    iput-object v3, p0, Lcom/google/android/gms/internal/measurement/zze;->zznt:[I

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/zzabx;->zzal(I)V

    goto :goto_0

    :cond_8
    invoke-static {p1, v1}, Lcom/google/android/gms/internal/measurement/zzacj;->zzb(Lcom/google/android/gms/internal/measurement/zzabx;I)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zze;->zznt:[I

    if-nez v1, :cond_9

    move v1, v2

    goto :goto_4

    :cond_9
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zze;->zznt:[I

    array-length v1, v1

    :goto_4
    add-int/2addr v0, v1

    new-array v0, v0, [I

    if-eqz v1, :cond_a

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zze;->zznt:[I

    invoke-static {v3, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_a
    :goto_5
    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_b

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v2

    aput v2, v0, v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvf()I

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_b
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v2

    aput v2, v0, v1

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zze;->zznt:[I

    goto/16 :goto_0

    :cond_c
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zze;->zznu:I

    goto/16 :goto_0

    :cond_d
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvg()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zze;->zznw:Z

    goto/16 :goto_0

    :cond_e
    return-object p0
.end method
