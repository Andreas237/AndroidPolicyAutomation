.class public final Lcom/google/android/gms/internal/measurement/zzvz;
.super Lcom/google/android/gms/internal/measurement/zzaca;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/measurement/zzaca<",
        "Lcom/google/android/gms/internal/measurement/zzvz;",
        ">;"
    }
.end annotation


# instance fields
.field public zzbmi:J

.field public zzbmj:Lcom/google/android/gms/internal/measurement/zzl;

.field public zzpv:Lcom/google/android/gms/internal/measurement/zzi;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzaca;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzbmi:J

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzbmj:Lcom/google/android/gms/internal/measurement/zzl;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzbxr:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/measurement/zzvz;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzvz;

    iget-wide v3, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzbmi:J

    iget-wide v5, p1, Lcom/google/android/gms/internal/measurement/zzvz;->zzbmi:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    if-nez v1, :cond_3

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzvz;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    if-eqz v1, :cond_4

    return v2

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzvz;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/measurement/zzi;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzbmj:Lcom/google/android/gms/internal/measurement/zzl;

    if-nez v1, :cond_5

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzvz;->zzbmj:Lcom/google/android/gms/internal/measurement/zzl;

    if-eqz v1, :cond_6

    return v2

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzbmj:Lcom/google/android/gms/internal/measurement/zzl;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzvz;->zzbmj:Lcom/google/android/gms/internal/measurement/zzl;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/measurement/zzl;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    if-eqz v1, :cond_8

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzacc;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_0

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzvz;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzacc;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_8
    :goto_0
    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzvz;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    if-eqz v1, :cond_a

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzvz;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

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
    .locals 8

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzbmi:J

    iget-wide v4, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzbmi:J

    const/16 v0, 0x20

    ushr-long/2addr v4, v0

    xor-long v6, v2, v4

    long-to-int v0, v6

    add-int/2addr v1, v0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

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

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzbmj:Lcom/google/android/gms/internal/measurement/zzl;

    mul-int/lit8 v1, v1, 0x1f

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzl;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzacc;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

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

    iget-wide v1, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzbmi:J

    const/4 v3, 0x1

    invoke-static {v3, v1, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zzc(IJ)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    if-eqz v1, :cond_0

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(ILcom/google/android/gms/internal/measurement/zzacg;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzbmj:Lcom/google/android/gms/internal/measurement/zzl;

    if-eqz v1, :cond_1

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzbmj:Lcom/google/android/gms/internal/measurement/zzl;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(ILcom/google/android/gms/internal/measurement/zzacg;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    return v0
.end method

.method public final zza(Lcom/google/android/gms/internal/measurement/zzaby;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzbmi:J

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(IJ)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/zzaby;->zza(ILcom/google/android/gms/internal/measurement/zzacg;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzbmj:Lcom/google/android/gms/internal/measurement/zzl;

    if-eqz v0, :cond_1

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzbmj:Lcom/google/android/gms/internal/measurement/zzl;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/zzaby;->zza(ILcom/google/android/gms/internal/measurement/zzacg;)V

    :cond_1
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/measurement/zzaca;->zza(Lcom/google/android/gms/internal/measurement/zzaby;)V

    return-void
.end method

.method public final synthetic zzb(Lcom/google/android/gms/internal/measurement/zzabx;)Lcom/google/android/gms/internal/measurement/zzacg;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvf()I

    move-result v0

    if-eqz v0, :cond_6

    const/16 v1, 0x8

    if-eq v0, v1, :cond_5

    const/16 v1, 0x12

    if-eq v0, v1, :cond_3

    const/16 v1, 0x1a

    if-eq v0, v1, :cond_1

    invoke-super {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzaca;->zza(Lcom/google/android/gms/internal/measurement/zzabx;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzbmj:Lcom/google/android/gms/internal/measurement/zzl;

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzl;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzl;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzbmj:Lcom/google/android/gms/internal/measurement/zzl;

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzbmj:Lcom/google/android/gms/internal/measurement/zzl;

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    if-nez v0, :cond_4

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzi;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzi;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    :goto_1
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/zzabx;->zza(Lcom/google/android/gms/internal/measurement/zzacg;)V

    goto :goto_0

    :cond_5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvi()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzvz;->zzbmi:J

    goto :goto_0

    :cond_6
    return-object p0
.end method
