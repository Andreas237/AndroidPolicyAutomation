.class public final Lcom/google/android/gms/internal/measurement/zzi;
.super Lcom/google/android/gms/internal/measurement/zzaca;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/measurement/zzaca<",
        "Lcom/google/android/gms/internal/measurement/zzi;",
        ">;"
    }
.end annotation


# instance fields
.field public version:Ljava/lang/String;

.field private zzoh:[Ljava/lang/String;

.field public zzoi:[Ljava/lang/String;

.field public zzoj:[Lcom/google/android/gms/internal/measurement/zzm;

.field public zzok:[Lcom/google/android/gms/internal/measurement/zzh;

.field public zzol:[Lcom/google/android/gms/internal/measurement/zze;

.field public zzom:[Lcom/google/android/gms/internal/measurement/zze;

.field public zzon:[Lcom/google/android/gms/internal/measurement/zze;

.field public zzoo:[Lcom/google/android/gms/internal/measurement/zzj;

.field private zzop:Ljava/lang/String;

.field private zzoq:Ljava/lang/String;

.field private zzor:Ljava/lang/String;

.field private zzos:Lcom/google/android/gms/internal/measurement/zzd;

.field private zzot:F

.field private zzou:Z

.field private zzov:[Ljava/lang/String;

.field public zzow:I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzaca;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzacj;->zzbya:[Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoh:[Ljava/lang/String;

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzacj;->zzbya:[Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoi:[Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzm;->zzg()[Lcom/google/android/gms/internal/measurement/zzm;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoj:[Lcom/google/android/gms/internal/measurement/zzm;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzh;->zzd()[Lcom/google/android/gms/internal/measurement/zzh;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzok:[Lcom/google/android/gms/internal/measurement/zzh;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zze;->zzb()[Lcom/google/android/gms/internal/measurement/zze;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzol:[Lcom/google/android/gms/internal/measurement/zze;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zze;->zzb()[Lcom/google/android/gms/internal/measurement/zze;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzom:[Lcom/google/android/gms/internal/measurement/zze;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zze;->zzb()[Lcom/google/android/gms/internal/measurement/zze;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzon:[Lcom/google/android/gms/internal/measurement/zze;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzj;->zze()[Lcom/google/android/gms/internal/measurement/zzj;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoo:[Lcom/google/android/gms/internal/measurement/zzj;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzop:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoq:Ljava/lang/String;

    const-string v0, "0"

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzor:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->version:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzos:Lcom/google/android/gms/internal/measurement/zzd;

    const/4 v1, 0x0

    iput v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzot:F

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzou:Z

    sget-object v2, Lcom/google/android/gms/internal/measurement/zzacj;->zzbya:[Ljava/lang/String;

    iput-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzov:[Ljava/lang/String;

    iput v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzow:I

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzbxr:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/measurement/zzi;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzi;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoh:[Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzi;->zzoh:[Ljava/lang/String;

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/zzace;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoi:[Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzi;->zzoi:[Ljava/lang/String;

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/zzace;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoj:[Lcom/google/android/gms/internal/measurement/zzm;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzi;->zzoj:[Lcom/google/android/gms/internal/measurement/zzm;

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/zzace;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzok:[Lcom/google/android/gms/internal/measurement/zzh;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzi;->zzok:[Lcom/google/android/gms/internal/measurement/zzh;

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/zzace;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzol:[Lcom/google/android/gms/internal/measurement/zze;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzi;->zzol:[Lcom/google/android/gms/internal/measurement/zze;

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/zzace;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzom:[Lcom/google/android/gms/internal/measurement/zze;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzi;->zzom:[Lcom/google/android/gms/internal/measurement/zze;

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/zzace;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzon:[Lcom/google/android/gms/internal/measurement/zze;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzi;->zzon:[Lcom/google/android/gms/internal/measurement/zze;

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/zzace;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoo:[Lcom/google/android/gms/internal/measurement/zzj;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzi;->zzoo:[Lcom/google/android/gms/internal/measurement/zzj;

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/zzace;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzop:Ljava/lang/String;

    if-nez v1, :cond_a

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzi;->zzop:Ljava/lang/String;

    if-eqz v1, :cond_b

    return v2

    :cond_a
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzop:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzi;->zzop:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoq:Ljava/lang/String;

    if-nez v1, :cond_c

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzi;->zzoq:Ljava/lang/String;

    if-eqz v1, :cond_d

    return v2

    :cond_c
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoq:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzi;->zzoq:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzor:Ljava/lang/String;

    if-nez v1, :cond_e

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzi;->zzor:Ljava/lang/String;

    if-eqz v1, :cond_f

    return v2

    :cond_e
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzor:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzi;->zzor:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->version:Ljava/lang/String;

    if-nez v1, :cond_10

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzi;->version:Ljava/lang/String;

    if-eqz v1, :cond_11

    return v2

    :cond_10
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->version:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzi;->version:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzos:Lcom/google/android/gms/internal/measurement/zzd;

    if-nez v1, :cond_12

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzi;->zzos:Lcom/google/android/gms/internal/measurement/zzd;

    if-eqz v1, :cond_13

    return v2

    :cond_12
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzos:Lcom/google/android/gms/internal/measurement/zzd;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzi;->zzos:Lcom/google/android/gms/internal/measurement/zzd;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/measurement/zzd;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzot:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    iget v3, p1, Lcom/google/android/gms/internal/measurement/zzi;->zzot:F

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzou:Z

    iget-boolean v3, p1, Lcom/google/android/gms/internal/measurement/zzi;->zzou:Z

    if-eq v1, v3, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzov:[Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzi;->zzov:[Ljava/lang/String;

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/zzace;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzow:I

    iget v3, p1, Lcom/google/android/gms/internal/measurement/zzi;->zzow:I

    if-eq v1, v3, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    if-eqz v1, :cond_19

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzacc;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_18

    goto :goto_0

    :cond_18
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzi;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzacc;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_19
    :goto_0
    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzi;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    if-eqz v1, :cond_1b

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzi;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzacc;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1a

    return v0

    :cond_1a
    return v2

    :cond_1b
    return v0
.end method

.method public final hashCode()I
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoh:[Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzace;->hashCode([Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoi:[Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzace;->hashCode([Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoj:[Lcom/google/android/gms/internal/measurement/zzm;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzace;->hashCode([Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzok:[Lcom/google/android/gms/internal/measurement/zzh;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzace;->hashCode([Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzol:[Lcom/google/android/gms/internal/measurement/zze;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzace;->hashCode([Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzom:[Lcom/google/android/gms/internal/measurement/zze;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzace;->hashCode([Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzon:[Lcom/google/android/gms/internal/measurement/zze;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzace;->hashCode([Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoo:[Lcom/google/android/gms/internal/measurement/zzj;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzace;->hashCode([Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzop:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzop:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoq:Ljava/lang/String;

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoq:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzor:Ljava/lang/String;

    if-nez v0, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzor:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->version:Ljava/lang/String;

    if-nez v0, :cond_3

    move v0, v2

    goto :goto_3

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->version:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v1, v0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzos:Lcom/google/android/gms/internal/measurement/zzd;

    mul-int/lit8 v1, v1, 0x1f

    if-nez v0, :cond_4

    move v0, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzd;->hashCode()I

    move-result v0

    :goto_4
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzot:F

    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzou:Z

    if-eqz v0, :cond_5

    const/16 v0, 0x4cf

    goto :goto_5

    :cond_5
    const/16 v0, 0x4d5

    :goto_5
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzov:[Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzace;->hashCode([Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzow:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzacc;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_6

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzacc;->hashCode()I

    move-result v2

    :cond_7
    :goto_6
    add-int/2addr v1, v2

    return v1
.end method

.method protected final zza()I
    .locals 8

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzaca;->zza()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoi:[Ljava/lang/String;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoi:[Ljava/lang/String;

    array-length v1, v1

    if-lez v1, :cond_2

    move v1, v3

    move v4, v1

    move v5, v4

    :goto_0
    iget-object v6, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoi:[Ljava/lang/String;

    array-length v6, v6

    if-ge v1, v6, :cond_1

    iget-object v6, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoi:[Ljava/lang/String;

    aget-object v6, v6, v1

    if-eqz v6, :cond_0

    add-int/lit8 v5, v5, 0x1

    invoke-static {v6}, Lcom/google/android/gms/internal/measurement/zzaby;->zzfk(Ljava/lang/String;)I

    move-result v6

    add-int/2addr v4, v6

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    add-int/2addr v0, v4

    mul-int/2addr v5, v2

    add-int/2addr v0, v5

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoj:[Lcom/google/android/gms/internal/measurement/zzm;

    const/4 v4, 0x2

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoj:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v1, v1

    if-lez v1, :cond_5

    move v1, v0

    move v0, v3

    :goto_1
    iget-object v5, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoj:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v5, v5

    if-ge v0, v5, :cond_4

    iget-object v5, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoj:[Lcom/google/android/gms/internal/measurement/zzm;

    aget-object v5, v5, v0

    if-eqz v5, :cond_3

    invoke-static {v4, v5}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(ILcom/google/android/gms/internal/measurement/zzacg;)I

    move-result v5

    add-int/2addr v1, v5

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    move v0, v1

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzok:[Lcom/google/android/gms/internal/measurement/zzh;

    if-eqz v1, :cond_8

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzok:[Lcom/google/android/gms/internal/measurement/zzh;

    array-length v1, v1

    if-lez v1, :cond_8

    move v1, v0

    move v0, v3

    :goto_2
    iget-object v5, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzok:[Lcom/google/android/gms/internal/measurement/zzh;

    array-length v5, v5

    if-ge v0, v5, :cond_7

    iget-object v5, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzok:[Lcom/google/android/gms/internal/measurement/zzh;

    aget-object v5, v5, v0

    if-eqz v5, :cond_6

    const/4 v6, 0x3

    invoke-static {v6, v5}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(ILcom/google/android/gms/internal/measurement/zzacg;)I

    move-result v5

    add-int/2addr v1, v5

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_7
    move v0, v1

    :cond_8
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzol:[Lcom/google/android/gms/internal/measurement/zze;

    const/4 v5, 0x4

    if-eqz v1, :cond_b

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzol:[Lcom/google/android/gms/internal/measurement/zze;

    array-length v1, v1

    if-lez v1, :cond_b

    move v1, v0

    move v0, v3

    :goto_3
    iget-object v6, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzol:[Lcom/google/android/gms/internal/measurement/zze;

    array-length v6, v6

    if-ge v0, v6, :cond_a

    iget-object v6, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzol:[Lcom/google/android/gms/internal/measurement/zze;

    aget-object v6, v6, v0

    if-eqz v6, :cond_9

    invoke-static {v5, v6}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(ILcom/google/android/gms/internal/measurement/zzacg;)I

    move-result v6

    add-int/2addr v1, v6

    :cond_9
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_a
    move v0, v1

    :cond_b
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzom:[Lcom/google/android/gms/internal/measurement/zze;

    if-eqz v1, :cond_e

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzom:[Lcom/google/android/gms/internal/measurement/zze;

    array-length v1, v1

    if-lez v1, :cond_e

    move v1, v0

    move v0, v3

    :goto_4
    iget-object v6, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzom:[Lcom/google/android/gms/internal/measurement/zze;

    array-length v6, v6

    if-ge v0, v6, :cond_d

    iget-object v6, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzom:[Lcom/google/android/gms/internal/measurement/zze;

    aget-object v6, v6, v0

    if-eqz v6, :cond_c

    const/4 v7, 0x5

    invoke-static {v7, v6}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(ILcom/google/android/gms/internal/measurement/zzacg;)I

    move-result v6

    add-int/2addr v1, v6

    :cond_c
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_d
    move v0, v1

    :cond_e
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzon:[Lcom/google/android/gms/internal/measurement/zze;

    if-eqz v1, :cond_11

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzon:[Lcom/google/android/gms/internal/measurement/zze;

    array-length v1, v1

    if-lez v1, :cond_11

    move v1, v0

    move v0, v3

    :goto_5
    iget-object v6, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzon:[Lcom/google/android/gms/internal/measurement/zze;

    array-length v6, v6

    if-ge v0, v6, :cond_10

    iget-object v6, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzon:[Lcom/google/android/gms/internal/measurement/zze;

    aget-object v6, v6, v0

    if-eqz v6, :cond_f

    const/4 v7, 0x6

    invoke-static {v7, v6}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(ILcom/google/android/gms/internal/measurement/zzacg;)I

    move-result v6

    add-int/2addr v1, v6

    :cond_f
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_10
    move v0, v1

    :cond_11
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoo:[Lcom/google/android/gms/internal/measurement/zzj;

    if-eqz v1, :cond_14

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoo:[Lcom/google/android/gms/internal/measurement/zzj;

    array-length v1, v1

    if-lez v1, :cond_14

    move v1, v0

    move v0, v3

    :goto_6
    iget-object v6, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoo:[Lcom/google/android/gms/internal/measurement/zzj;

    array-length v6, v6

    if-ge v0, v6, :cond_13

    iget-object v6, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoo:[Lcom/google/android/gms/internal/measurement/zzj;

    aget-object v6, v6, v0

    if-eqz v6, :cond_12

    const/4 v7, 0x7

    invoke-static {v7, v6}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(ILcom/google/android/gms/internal/measurement/zzacg;)I

    move-result v6

    add-int/2addr v1, v6

    :cond_12
    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_13
    move v0, v1

    :cond_14
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzop:Ljava/lang/String;

    if-eqz v1, :cond_15

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzop:Ljava/lang/String;

    const-string v6, ""

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    const/16 v1, 0x9

    iget-object v6, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzop:Ljava/lang/String;

    invoke-static {v1, v6}, Lcom/google/android/gms/internal/measurement/zzaby;->zzc(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_15
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoq:Ljava/lang/String;

    if-eqz v1, :cond_16

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoq:Ljava/lang/String;

    const-string v6, ""

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    const/16 v1, 0xa

    iget-object v6, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoq:Ljava/lang/String;

    invoke-static {v1, v6}, Lcom/google/android/gms/internal/measurement/zzaby;->zzc(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_16
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzor:Ljava/lang/String;

    if-eqz v1, :cond_17

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzor:Ljava/lang/String;

    const-string v6, "0"

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    const/16 v1, 0xc

    iget-object v6, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzor:Ljava/lang/String;

    invoke-static {v1, v6}, Lcom/google/android/gms/internal/measurement/zzaby;->zzc(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_17
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->version:Ljava/lang/String;

    if-eqz v1, :cond_18

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->version:Ljava/lang/String;

    const-string v6, ""

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    const/16 v1, 0xd

    iget-object v6, p0, Lcom/google/android/gms/internal/measurement/zzi;->version:Ljava/lang/String;

    invoke-static {v1, v6}, Lcom/google/android/gms/internal/measurement/zzaby;->zzc(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_18
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzos:Lcom/google/android/gms/internal/measurement/zzd;

    if-eqz v1, :cond_19

    const/16 v1, 0xe

    iget-object v6, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzos:Lcom/google/android/gms/internal/measurement/zzd;

    invoke-static {v1, v6}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(ILcom/google/android/gms/internal/measurement/zzacg;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_19
    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzot:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v6

    if-eq v1, v6, :cond_1a

    const/16 v1, 0xf

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/zzaby;->zzaq(I)I

    move-result v1

    add-int/2addr v1, v5

    add-int/2addr v0, v1

    :cond_1a
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzov:[Ljava/lang/String;

    if-eqz v1, :cond_1d

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzov:[Ljava/lang/String;

    array-length v1, v1

    if-lez v1, :cond_1d

    move v1, v3

    move v5, v1

    move v6, v5

    :goto_7
    iget-object v7, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzov:[Ljava/lang/String;

    array-length v7, v7

    if-ge v1, v7, :cond_1c

    iget-object v7, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzov:[Ljava/lang/String;

    aget-object v7, v7, v1

    if-eqz v7, :cond_1b

    add-int/lit8 v6, v6, 0x1

    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/zzaby;->zzfk(Ljava/lang/String;)I

    move-result v7

    add-int/2addr v5, v7

    :cond_1b
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_1c
    add-int/2addr v0, v5

    mul-int/2addr v6, v4

    add-int/2addr v0, v6

    :cond_1d
    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzow:I

    if-eqz v1, :cond_1e

    const/16 v1, 0x11

    iget v5, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzow:I

    invoke-static {v1, v5}, Lcom/google/android/gms/internal/measurement/zzaby;->zzf(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1e
    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzou:Z

    if-eqz v1, :cond_1f

    const/16 v1, 0x12

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/zzaby;->zzaq(I)I

    move-result v1

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    :cond_1f
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoh:[Ljava/lang/String;

    if-eqz v1, :cond_22

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoh:[Ljava/lang/String;

    array-length v1, v1

    if-lez v1, :cond_22

    move v1, v3

    move v2, v1

    :goto_8
    iget-object v5, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoh:[Ljava/lang/String;

    array-length v5, v5

    if-ge v3, v5, :cond_21

    iget-object v5, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoh:[Ljava/lang/String;

    aget-object v5, v5, v3

    if-eqz v5, :cond_20

    add-int/lit8 v2, v2, 0x1

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/zzaby;->zzfk(Ljava/lang/String;)I

    move-result v5

    add-int/2addr v1, v5

    :cond_20
    add-int/lit8 v3, v3, 0x1

    goto :goto_8

    :cond_21
    add-int/2addr v0, v1

    mul-int/2addr v4, v2

    add-int/2addr v0, v4

    :cond_22
    return v0
.end method

.method public final zza(Lcom/google/android/gms/internal/measurement/zzaby;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoi:[Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoi:[Ljava/lang/String;

    array-length v0, v0

    if-lez v0, :cond_1

    move v0, v1

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoi:[Ljava/lang/String;

    array-length v2, v2

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoi:[Ljava/lang/String;

    aget-object v2, v2, v0

    if-eqz v2, :cond_0

    const/4 v3, 0x1

    invoke-virtual {p1, v3, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(ILjava/lang/String;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoj:[Lcom/google/android/gms/internal/measurement/zzm;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoj:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v0, v0

    if-lez v0, :cond_3

    move v0, v1

    :goto_1
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoj:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v2, v2

    if-ge v0, v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoj:[Lcom/google/android/gms/internal/measurement/zzm;

    aget-object v2, v2, v0

    if-eqz v2, :cond_2

    const/4 v3, 0x2

    invoke-virtual {p1, v3, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zza(ILcom/google/android/gms/internal/measurement/zzacg;)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzok:[Lcom/google/android/gms/internal/measurement/zzh;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzok:[Lcom/google/android/gms/internal/measurement/zzh;

    array-length v0, v0

    if-lez v0, :cond_5

    move v0, v1

    :goto_2
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzok:[Lcom/google/android/gms/internal/measurement/zzh;

    array-length v2, v2

    if-ge v0, v2, :cond_5

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzok:[Lcom/google/android/gms/internal/measurement/zzh;

    aget-object v2, v2, v0

    if-eqz v2, :cond_4

    const/4 v3, 0x3

    invoke-virtual {p1, v3, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zza(ILcom/google/android/gms/internal/measurement/zzacg;)V

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzol:[Lcom/google/android/gms/internal/measurement/zze;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzol:[Lcom/google/android/gms/internal/measurement/zze;

    array-length v0, v0

    if-lez v0, :cond_7

    move v0, v1

    :goto_3
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzol:[Lcom/google/android/gms/internal/measurement/zze;

    array-length v2, v2

    if-ge v0, v2, :cond_7

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzol:[Lcom/google/android/gms/internal/measurement/zze;

    aget-object v2, v2, v0

    if-eqz v2, :cond_6

    const/4 v3, 0x4

    invoke-virtual {p1, v3, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zza(ILcom/google/android/gms/internal/measurement/zzacg;)V

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzom:[Lcom/google/android/gms/internal/measurement/zze;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzom:[Lcom/google/android/gms/internal/measurement/zze;

    array-length v0, v0

    if-lez v0, :cond_9

    move v0, v1

    :goto_4
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzom:[Lcom/google/android/gms/internal/measurement/zze;

    array-length v2, v2

    if-ge v0, v2, :cond_9

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzom:[Lcom/google/android/gms/internal/measurement/zze;

    aget-object v2, v2, v0

    if-eqz v2, :cond_8

    const/4 v3, 0x5

    invoke-virtual {p1, v3, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zza(ILcom/google/android/gms/internal/measurement/zzacg;)V

    :cond_8
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzon:[Lcom/google/android/gms/internal/measurement/zze;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzon:[Lcom/google/android/gms/internal/measurement/zze;

    array-length v0, v0

    if-lez v0, :cond_b

    move v0, v1

    :goto_5
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzon:[Lcom/google/android/gms/internal/measurement/zze;

    array-length v2, v2

    if-ge v0, v2, :cond_b

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzon:[Lcom/google/android/gms/internal/measurement/zze;

    aget-object v2, v2, v0

    if-eqz v2, :cond_a

    const/4 v3, 0x6

    invoke-virtual {p1, v3, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zza(ILcom/google/android/gms/internal/measurement/zzacg;)V

    :cond_a
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_b
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoo:[Lcom/google/android/gms/internal/measurement/zzj;

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoo:[Lcom/google/android/gms/internal/measurement/zzj;

    array-length v0, v0

    if-lez v0, :cond_d

    move v0, v1

    :goto_6
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoo:[Lcom/google/android/gms/internal/measurement/zzj;

    array-length v2, v2

    if-ge v0, v2, :cond_d

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoo:[Lcom/google/android/gms/internal/measurement/zzj;

    aget-object v2, v2, v0

    if-eqz v2, :cond_c

    const/4 v3, 0x7

    invoke-virtual {p1, v3, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zza(ILcom/google/android/gms/internal/measurement/zzacg;)V

    :cond_c
    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_d
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzop:Ljava/lang/String;

    if-eqz v0, :cond_e

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzop:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    const/16 v0, 0x9

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzop:Ljava/lang/String;

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(ILjava/lang/String;)V

    :cond_e
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoq:Ljava/lang/String;

    if-eqz v0, :cond_f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoq:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    const/16 v0, 0xa

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoq:Ljava/lang/String;

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(ILjava/lang/String;)V

    :cond_f
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzor:Ljava/lang/String;

    if-eqz v0, :cond_10

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzor:Ljava/lang/String;

    const-string v2, "0"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    const/16 v0, 0xc

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzor:Ljava/lang/String;

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(ILjava/lang/String;)V

    :cond_10
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->version:Ljava/lang/String;

    if-eqz v0, :cond_11

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->version:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    const/16 v0, 0xd

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->version:Ljava/lang/String;

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(ILjava/lang/String;)V

    :cond_11
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzos:Lcom/google/android/gms/internal/measurement/zzd;

    if-eqz v0, :cond_12

    const/16 v0, 0xe

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzos:Lcom/google/android/gms/internal/measurement/zzd;

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zza(ILcom/google/android/gms/internal/measurement/zzacg;)V

    :cond_12
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzot:F

    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v2

    if-eq v0, v2, :cond_13

    const/16 v0, 0xf

    iget v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzot:F

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zza(IF)V

    :cond_13
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzov:[Ljava/lang/String;

    if-eqz v0, :cond_15

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzov:[Ljava/lang/String;

    array-length v0, v0

    if-lez v0, :cond_15

    move v0, v1

    :goto_7
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzov:[Ljava/lang/String;

    array-length v2, v2

    if-ge v0, v2, :cond_15

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzov:[Ljava/lang/String;

    aget-object v2, v2, v0

    if-eqz v2, :cond_14

    const/16 v3, 0x10

    invoke-virtual {p1, v3, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(ILjava/lang/String;)V

    :cond_14
    add-int/lit8 v0, v0, 0x1

    goto :goto_7

    :cond_15
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzow:I

    if-eqz v0, :cond_16

    const/16 v0, 0x11

    iget v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzow:I

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zze(II)V

    :cond_16
    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzou:Z

    if-eqz v0, :cond_17

    const/16 v0, 0x12

    iget-boolean v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzou:Z

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zza(IZ)V

    :cond_17
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoh:[Ljava/lang/String;

    if-eqz v0, :cond_19

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoh:[Ljava/lang/String;

    array-length v0, v0

    if-lez v0, :cond_19

    :goto_8
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoh:[Ljava/lang/String;

    array-length v0, v0

    if-ge v1, v0, :cond_19

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoh:[Ljava/lang/String;

    aget-object v0, v0, v1

    if-eqz v0, :cond_18

    const/16 v2, 0x13

    invoke-virtual {p1, v2, v0}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(ILjava/lang/String;)V

    :cond_18
    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    :cond_19
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/measurement/zzaca;->zza(Lcom/google/android/gms/internal/measurement/zzaby;)V

    return-void
.end method

.method public final synthetic zzb(Lcom/google/android/gms/internal/measurement/zzabx;)Lcom/google/android/gms/internal/measurement/zzacg;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvf()I

    move-result v0

    const/4 v1, 0x0

    sparse-switch v0, :sswitch_data_0

    invoke-super {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzaca;->zza(Lcom/google/android/gms/internal/measurement/zzabx;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :sswitch_0
    const/16 v0, 0x9a

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/zzacj;->zzb(Lcom/google/android/gms/internal/measurement/zzabx;I)I

    move-result v0

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoh:[Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoh:[Ljava/lang/String;

    array-length v2, v2

    :goto_1
    add-int/2addr v0, v2

    new-array v0, v0, [Ljava/lang/String;

    if-eqz v2, :cond_2

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoh:[Ljava/lang/String;

    invoke-static {v3, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_2
    :goto_2
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    if-ge v2, v1, :cond_3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->readString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvf()I

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->readString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoh:[Ljava/lang/String;

    goto :goto_0

    :sswitch_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvg()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzou:Z

    goto :goto_0

    :sswitch_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzow:I

    goto :goto_0

    :sswitch_3
    const/16 v0, 0x82

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/zzacj;->zzb(Lcom/google/android/gms/internal/measurement/zzabx;I)I

    move-result v0

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzov:[Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_3

    :cond_4
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzov:[Ljava/lang/String;

    array-length v2, v2

    :goto_3
    add-int/2addr v0, v2

    new-array v0, v0, [Ljava/lang/String;

    if-eqz v2, :cond_5

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzov:[Ljava/lang/String;

    invoke-static {v3, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_5
    :goto_4
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    if-ge v2, v1, :cond_6

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->readString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvf()I

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->readString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzov:[Ljava/lang/String;

    goto/16 :goto_0

    :sswitch_4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvj()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzot:F

    goto/16 :goto_0

    :sswitch_5
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzos:Lcom/google/android/gms/internal/measurement/zzd;

    if-nez v0, :cond_7

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzd;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzos:Lcom/google/android/gms/internal/measurement/zzd;

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzos:Lcom/google/android/gms/internal/measurement/zzd;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/zzabx;->zza(Lcom/google/android/gms/internal/measurement/zzacg;)V

    goto/16 :goto_0

    :sswitch_6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->version:Ljava/lang/String;

    goto/16 :goto_0

    :sswitch_7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzor:Ljava/lang/String;

    goto/16 :goto_0

    :sswitch_8
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoq:Ljava/lang/String;

    goto/16 :goto_0

    :sswitch_9
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzop:Ljava/lang/String;

    goto/16 :goto_0

    :sswitch_a
    const/16 v0, 0x3a

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/zzacj;->zzb(Lcom/google/android/gms/internal/measurement/zzabx;I)I

    move-result v0

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoo:[Lcom/google/android/gms/internal/measurement/zzj;

    if-nez v2, :cond_8

    move v2, v1

    goto :goto_5

    :cond_8
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoo:[Lcom/google/android/gms/internal/measurement/zzj;

    array-length v2, v2

    :goto_5
    add-int/2addr v0, v2

    new-array v0, v0, [Lcom/google/android/gms/internal/measurement/zzj;

    if-eqz v2, :cond_9

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoo:[Lcom/google/android/gms/internal/measurement/zzj;

    invoke-static {v3, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_9
    :goto_6
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    if-ge v2, v1, :cond_a

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzj;

    invoke-direct {v1}, Lcom/google/android/gms/internal/measurement/zzj;-><init>()V

    aput-object v1, v0, v2

    aget-object v1, v0, v2

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzabx;->zza(Lcom/google/android/gms/internal/measurement/zzacg;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvf()I

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_a
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzj;

    invoke-direct {v1}, Lcom/google/android/gms/internal/measurement/zzj;-><init>()V

    aput-object v1, v0, v2

    aget-object v1, v0, v2

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzabx;->zza(Lcom/google/android/gms/internal/measurement/zzacg;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoo:[Lcom/google/android/gms/internal/measurement/zzj;

    goto/16 :goto_0

    :sswitch_b
    const/16 v0, 0x32

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/zzacj;->zzb(Lcom/google/android/gms/internal/measurement/zzabx;I)I

    move-result v0

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzon:[Lcom/google/android/gms/internal/measurement/zze;

    if-nez v2, :cond_b

    move v2, v1

    goto :goto_7

    :cond_b
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzon:[Lcom/google/android/gms/internal/measurement/zze;

    array-length v2, v2

    :goto_7
    add-int/2addr v0, v2

    new-array v0, v0, [Lcom/google/android/gms/internal/measurement/zze;

    if-eqz v2, :cond_c

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzon:[Lcom/google/android/gms/internal/measurement/zze;

    invoke-static {v3, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_c
    :goto_8
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    if-ge v2, v1, :cond_d

    new-instance v1, Lcom/google/android/gms/internal/measurement/zze;

    invoke-direct {v1}, Lcom/google/android/gms/internal/measurement/zze;-><init>()V

    aput-object v1, v0, v2

    aget-object v1, v0, v2

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzabx;->zza(Lcom/google/android/gms/internal/measurement/zzacg;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvf()I

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_d
    new-instance v1, Lcom/google/android/gms/internal/measurement/zze;

    invoke-direct {v1}, Lcom/google/android/gms/internal/measurement/zze;-><init>()V

    aput-object v1, v0, v2

    aget-object v1, v0, v2

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzabx;->zza(Lcom/google/android/gms/internal/measurement/zzacg;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzon:[Lcom/google/android/gms/internal/measurement/zze;

    goto/16 :goto_0

    :sswitch_c
    const/16 v0, 0x2a

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/zzacj;->zzb(Lcom/google/android/gms/internal/measurement/zzabx;I)I

    move-result v0

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzom:[Lcom/google/android/gms/internal/measurement/zze;

    if-nez v2, :cond_e

    move v2, v1

    goto :goto_9

    :cond_e
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzom:[Lcom/google/android/gms/internal/measurement/zze;

    array-length v2, v2

    :goto_9
    add-int/2addr v0, v2

    new-array v0, v0, [Lcom/google/android/gms/internal/measurement/zze;

    if-eqz v2, :cond_f

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzom:[Lcom/google/android/gms/internal/measurement/zze;

    invoke-static {v3, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_f
    :goto_a
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    if-ge v2, v1, :cond_10

    new-instance v1, Lcom/google/android/gms/internal/measurement/zze;

    invoke-direct {v1}, Lcom/google/android/gms/internal/measurement/zze;-><init>()V

    aput-object v1, v0, v2

    aget-object v1, v0, v2

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzabx;->zza(Lcom/google/android/gms/internal/measurement/zzacg;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvf()I

    add-int/lit8 v2, v2, 0x1

    goto :goto_a

    :cond_10
    new-instance v1, Lcom/google/android/gms/internal/measurement/zze;

    invoke-direct {v1}, Lcom/google/android/gms/internal/measurement/zze;-><init>()V

    aput-object v1, v0, v2

    aget-object v1, v0, v2

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzabx;->zza(Lcom/google/android/gms/internal/measurement/zzacg;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzom:[Lcom/google/android/gms/internal/measurement/zze;

    goto/16 :goto_0

    :sswitch_d
    const/16 v0, 0x22

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/zzacj;->zzb(Lcom/google/android/gms/internal/measurement/zzabx;I)I

    move-result v0

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzol:[Lcom/google/android/gms/internal/measurement/zze;

    if-nez v2, :cond_11

    move v2, v1

    goto :goto_b

    :cond_11
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzol:[Lcom/google/android/gms/internal/measurement/zze;

    array-length v2, v2

    :goto_b
    add-int/2addr v0, v2

    new-array v0, v0, [Lcom/google/android/gms/internal/measurement/zze;

    if-eqz v2, :cond_12

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzol:[Lcom/google/android/gms/internal/measurement/zze;

    invoke-static {v3, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_12
    :goto_c
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    if-ge v2, v1, :cond_13

    new-instance v1, Lcom/google/android/gms/internal/measurement/zze;

    invoke-direct {v1}, Lcom/google/android/gms/internal/measurement/zze;-><init>()V

    aput-object v1, v0, v2

    aget-object v1, v0, v2

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzabx;->zza(Lcom/google/android/gms/internal/measurement/zzacg;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvf()I

    add-int/lit8 v2, v2, 0x1

    goto :goto_c

    :cond_13
    new-instance v1, Lcom/google/android/gms/internal/measurement/zze;

    invoke-direct {v1}, Lcom/google/android/gms/internal/measurement/zze;-><init>()V

    aput-object v1, v0, v2

    aget-object v1, v0, v2

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzabx;->zza(Lcom/google/android/gms/internal/measurement/zzacg;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzol:[Lcom/google/android/gms/internal/measurement/zze;

    goto/16 :goto_0

    :sswitch_e
    const/16 v0, 0x1a

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/zzacj;->zzb(Lcom/google/android/gms/internal/measurement/zzabx;I)I

    move-result v0

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzok:[Lcom/google/android/gms/internal/measurement/zzh;

    if-nez v2, :cond_14

    move v2, v1

    goto :goto_d

    :cond_14
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzok:[Lcom/google/android/gms/internal/measurement/zzh;

    array-length v2, v2

    :goto_d
    add-int/2addr v0, v2

    new-array v0, v0, [Lcom/google/android/gms/internal/measurement/zzh;

    if-eqz v2, :cond_15

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzok:[Lcom/google/android/gms/internal/measurement/zzh;

    invoke-static {v3, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_15
    :goto_e
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    if-ge v2, v1, :cond_16

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzh;

    invoke-direct {v1}, Lcom/google/android/gms/internal/measurement/zzh;-><init>()V

    aput-object v1, v0, v2

    aget-object v1, v0, v2

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzabx;->zza(Lcom/google/android/gms/internal/measurement/zzacg;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvf()I

    add-int/lit8 v2, v2, 0x1

    goto :goto_e

    :cond_16
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzh;

    invoke-direct {v1}, Lcom/google/android/gms/internal/measurement/zzh;-><init>()V

    aput-object v1, v0, v2

    aget-object v1, v0, v2

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzabx;->zza(Lcom/google/android/gms/internal/measurement/zzacg;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzok:[Lcom/google/android/gms/internal/measurement/zzh;

    goto/16 :goto_0

    :sswitch_f
    const/16 v0, 0x12

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/zzacj;->zzb(Lcom/google/android/gms/internal/measurement/zzabx;I)I

    move-result v0

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoj:[Lcom/google/android/gms/internal/measurement/zzm;

    if-nez v2, :cond_17

    move v2, v1

    goto :goto_f

    :cond_17
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoj:[Lcom/google/android/gms/internal/measurement/zzm;

    array-length v2, v2

    :goto_f
    add-int/2addr v0, v2

    new-array v0, v0, [Lcom/google/android/gms/internal/measurement/zzm;

    if-eqz v2, :cond_18

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoj:[Lcom/google/android/gms/internal/measurement/zzm;

    invoke-static {v3, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_18
    :goto_10
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    if-ge v2, v1, :cond_19

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzm;

    invoke-direct {v1}, Lcom/google/android/gms/internal/measurement/zzm;-><init>()V

    aput-object v1, v0, v2

    aget-object v1, v0, v2

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzabx;->zza(Lcom/google/android/gms/internal/measurement/zzacg;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvf()I

    add-int/lit8 v2, v2, 0x1

    goto :goto_10

    :cond_19
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzm;

    invoke-direct {v1}, Lcom/google/android/gms/internal/measurement/zzm;-><init>()V

    aput-object v1, v0, v2

    aget-object v1, v0, v2

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzabx;->zza(Lcom/google/android/gms/internal/measurement/zzacg;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoj:[Lcom/google/android/gms/internal/measurement/zzm;

    goto/16 :goto_0

    :sswitch_10
    const/16 v0, 0xa

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/zzacj;->zzb(Lcom/google/android/gms/internal/measurement/zzabx;I)I

    move-result v0

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoi:[Ljava/lang/String;

    if-nez v2, :cond_1a

    move v2, v1

    goto :goto_11

    :cond_1a
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoi:[Ljava/lang/String;

    array-length v2, v2

    :goto_11
    add-int/2addr v0, v2

    new-array v0, v0, [Ljava/lang/String;

    if-eqz v2, :cond_1b

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoi:[Ljava/lang/String;

    invoke-static {v3, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1b
    :goto_12
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    if-ge v2, v1, :cond_1c

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->readString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvf()I

    add-int/lit8 v2, v2, 0x1

    goto :goto_12

    :cond_1c
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->readString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzi;->zzoi:[Ljava/lang/String;

    goto/16 :goto_0

    :sswitch_11
    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_11
        0xa -> :sswitch_10
        0x12 -> :sswitch_f
        0x1a -> :sswitch_e
        0x22 -> :sswitch_d
        0x2a -> :sswitch_c
        0x32 -> :sswitch_b
        0x3a -> :sswitch_a
        0x4a -> :sswitch_9
        0x52 -> :sswitch_8
        0x62 -> :sswitch_7
        0x6a -> :sswitch_6
        0x72 -> :sswitch_5
        0x7d -> :sswitch_4
        0x82 -> :sswitch_3
        0x88 -> :sswitch_2
        0x90 -> :sswitch_1
        0x9a -> :sswitch_0
    .end sparse-switch
.end method
