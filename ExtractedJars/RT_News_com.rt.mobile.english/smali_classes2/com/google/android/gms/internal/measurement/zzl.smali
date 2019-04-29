.class public final Lcom/google/android/gms/internal/measurement/zzl;
.super Lcom/google/android/gms/internal/measurement/zzaca;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/measurement/zzaca<",
        "Lcom/google/android/gms/internal/measurement/zzl;",
        ">;"
    }
.end annotation


# instance fields
.field public zzpu:[Lcom/google/android/gms/internal/measurement/zzk;

.field public zzpv:Lcom/google/android/gms/internal/measurement/zzi;

.field public zzpw:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzaca;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzk;->zzf()[Lcom/google/android/gms/internal/measurement/zzk;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpu:[Lcom/google/android/gms/internal/measurement/zzk;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    const-string v1, ""

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpw:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzbxr:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/measurement/zzl;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzl;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpu:[Lcom/google/android/gms/internal/measurement/zzk;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzl;->zzpu:[Lcom/google/android/gms/internal/measurement/zzk;

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/zzace;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    if-nez v1, :cond_3

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzl;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    if-eqz v1, :cond_4

    return v2

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzl;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/measurement/zzi;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpw:Ljava/lang/String;

    if-nez v1, :cond_5

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzl;->zzpw:Ljava/lang/String;

    if-eqz v1, :cond_6

    return v2

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpw:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzl;->zzpw:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    if-eqz v1, :cond_8

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzacc;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_0

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzl;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzacc;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_8
    :goto_0
    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzl;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    if-eqz v1, :cond_a

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzl;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

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

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpu:[Lcom/google/android/gms/internal/measurement/zzk;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzace;->hashCode([Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v1, v0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    mul-int/lit8 v1, v1, 0x1f

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzi;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpw:Ljava/lang/String;

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpw:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzacc;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzacc;->hashCode()I

    move-result v2

    :cond_3
    :goto_2
    add-int/2addr v1, v2

    return v1
.end method

.method protected final zza()I
    .locals 4

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzaca;->zza()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpu:[Lcom/google/android/gms/internal/measurement/zzk;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpu:[Lcom/google/android/gms/internal/measurement/zzk;

    array-length v1, v1

    if-lez v1, :cond_1

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpu:[Lcom/google/android/gms/internal/measurement/zzk;

    array-length v2, v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpu:[Lcom/google/android/gms/internal/measurement/zzk;

    aget-object v2, v2, v1

    if-eqz v2, :cond_0

    const/4 v3, 0x1

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(ILcom/google/android/gms/internal/measurement/zzacg;)I

    move-result v2

    add-int/2addr v0, v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(ILcom/google/android/gms/internal/measurement/zzacg;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpw:Ljava/lang/String;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpw:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpw:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zzc(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    return v0
.end method

.method public final zza(Lcom/google/android/gms/internal/measurement/zzaby;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpu:[Lcom/google/android/gms/internal/measurement/zzk;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpu:[Lcom/google/android/gms/internal/measurement/zzk;

    array-length v0, v0

    if-lez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpu:[Lcom/google/android/gms/internal/measurement/zzk;

    array-length v1, v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpu:[Lcom/google/android/gms/internal/measurement/zzk;

    aget-object v1, v1, v0

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v1}, Lcom/google/android/gms/internal/measurement/zzaby;->zza(ILcom/google/android/gms/internal/measurement/zzacg;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    if-eqz v0, :cond_2

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/zzaby;->zza(ILcom/google/android/gms/internal/measurement/zzacg;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpw:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpw:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpw:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(ILjava/lang/String;)V

    :cond_3
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

    if-eqz v0, :cond_8

    const/16 v1, 0xa

    if-eq v0, v1, :cond_4

    const/16 v1, 0x12

    if-eq v0, v1, :cond_2

    const/16 v1, 0x1a

    if-eq v0, v1, :cond_1

    invoke-super {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzaca;->zza(Lcom/google/android/gms/internal/measurement/zzabx;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpw:Ljava/lang/String;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    if-nez v0, :cond_3

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzi;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzi;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/zzabx;->zza(Lcom/google/android/gms/internal/measurement/zzacg;)V

    goto :goto_0

    :cond_4
    invoke-static {p1, v1}, Lcom/google/android/gms/internal/measurement/zzacj;->zzb(Lcom/google/android/gms/internal/measurement/zzabx;I)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpu:[Lcom/google/android/gms/internal/measurement/zzk;

    const/4 v2, 0x0

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_1

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpu:[Lcom/google/android/gms/internal/measurement/zzk;

    array-length v1, v1

    :goto_1
    add-int/2addr v0, v1

    new-array v0, v0, [Lcom/google/android/gms/internal/measurement/zzk;

    if-eqz v1, :cond_6

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpu:[Lcom/google/android/gms/internal/measurement/zzk;

    invoke-static {v3, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_6
    :goto_2
    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_7

    new-instance v2, Lcom/google/android/gms/internal/measurement/zzk;

    invoke-direct {v2}, Lcom/google/android/gms/internal/measurement/zzk;-><init>()V

    aput-object v2, v0, v1

    aget-object v2, v0, v1

    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/measurement/zzabx;->zza(Lcom/google/android/gms/internal/measurement/zzacg;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvf()I

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_7
    new-instance v2, Lcom/google/android/gms/internal/measurement/zzk;

    invoke-direct {v2}, Lcom/google/android/gms/internal/measurement/zzk;-><init>()V

    aput-object v2, v0, v1

    aget-object v1, v0, v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzabx;->zza(Lcom/google/android/gms/internal/measurement/zzacg;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzl;->zzpu:[Lcom/google/android/gms/internal/measurement/zzk;

    goto :goto_0

    :cond_8
    return-object p0
.end method
