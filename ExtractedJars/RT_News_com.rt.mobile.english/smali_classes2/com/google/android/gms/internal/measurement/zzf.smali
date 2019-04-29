.class public final Lcom/google/android/gms/internal/measurement/zzf;
.super Lcom/google/android/gms/internal/measurement/zzaca;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/measurement/zzaca<",
        "Lcom/google/android/gms/internal/measurement/zzf;",
        ">;"
    }
.end annotation


# static fields
.field private static volatile zznx:[Lcom/google/android/gms/internal/measurement/zzf;


# instance fields
.field public zzny:Ljava/lang/String;

.field public zznz:J

.field public zzoa:J

.field public zzob:Z

.field public zzoc:J


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzaca;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzny:Ljava/lang/String;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzf;->zznz:J

    const-wide/32 v2, 0x7fffffff

    iput-wide v2, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzoa:J

    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzob:Z

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzoc:J

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzbxr:I

    return-void
.end method

.method public static zzc()[Lcom/google/android/gms/internal/measurement/zzf;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzf;->zznx:[Lcom/google/android/gms/internal/measurement/zzf;

    if-nez v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzace;->zzbxq:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzf;->zznx:[Lcom/google/android/gms/internal/measurement/zzf;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    new-array v1, v1, [Lcom/google/android/gms/internal/measurement/zzf;

    sput-object v1, Lcom/google/android/gms/internal/measurement/zzf;->zznx:[Lcom/google/android/gms/internal/measurement/zzf;

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
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzf;->zznx:[Lcom/google/android/gms/internal/measurement/zzf;

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/measurement/zzf;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzf;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzny:Ljava/lang/String;

    if-nez v1, :cond_2

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzf;->zzny:Ljava/lang/String;

    if-eqz v1, :cond_3

    return v2

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzny:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzf;->zzny:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/google/android/gms/internal/measurement/zzf;->zznz:J

    iget-wide v5, p1, Lcom/google/android/gms/internal/measurement/zzf;->zznz:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzoa:J

    iget-wide v5, p1, Lcom/google/android/gms/internal/measurement/zzf;->zzoa:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzob:Z

    iget-boolean v3, p1, Lcom/google/android/gms/internal/measurement/zzf;->zzob:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzoc:J

    iget-wide v5, p1, Lcom/google/android/gms/internal/measurement/zzf;->zzoc:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    if-eqz v1, :cond_9

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzacc;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_0

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzf;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzacc;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_9
    :goto_0
    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzf;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    if-eqz v1, :cond_b

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzf;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzacc;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_a

    return v0

    :cond_a
    return v2

    :cond_b
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

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzny:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzny:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v3, p0, Lcom/google/android/gms/internal/measurement/zzf;->zznz:J

    iget-wide v5, p0, Lcom/google/android/gms/internal/measurement/zzf;->zznz:J

    const/16 v0, 0x20

    ushr-long/2addr v5, v0

    xor-long v7, v3, v5

    long-to-int v3, v7

    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v3, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzoa:J

    iget-wide v5, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzoa:J

    ushr-long/2addr v5, v0

    xor-long v7, v3, v5

    long-to-int v3, v7

    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v3, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzob:Z

    if-eqz v3, :cond_1

    const/16 v3, 0x4cf

    goto :goto_1

    :cond_1
    const/16 v3, 0x4d5

    :goto_1
    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v3, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzoc:J

    iget-wide v5, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzoc:J

    ushr-long/2addr v5, v0

    xor-long v7, v3, v5

    long-to-int v0, v7

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzacc;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzacc;->hashCode()I

    move-result v2

    :cond_3
    :goto_2
    add-int/2addr v1, v2

    return v1
.end method

.method protected final zza()I
    .locals 9

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzaca;->zza()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzny:Ljava/lang/String;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzny:Ljava/lang/String;

    const-string v3, ""

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzny:Ljava/lang/String;

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/measurement/zzaby;->zzc(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-wide v3, p0, Lcom/google/android/gms/internal/measurement/zzf;->zznz:J

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-eqz v1, :cond_1

    const/4 v1, 0x2

    iget-wide v3, p0, Lcom/google/android/gms/internal/measurement/zzf;->zznz:J

    invoke-static {v1, v3, v4}, Lcom/google/android/gms/internal/measurement/zzaby;->zzc(IJ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    iget-wide v3, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzoa:J

    const-wide/32 v7, 0x7fffffff

    cmp-long v1, v3, v7

    if-eqz v1, :cond_2

    const/4 v1, 0x3

    iget-wide v3, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzoa:J

    invoke-static {v1, v3, v4}, Lcom/google/android/gms/internal/measurement/zzaby;->zzc(IJ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzob:Z

    if-eqz v1, :cond_3

    const/4 v1, 0x4

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/zzaby;->zzaq(I)I

    move-result v1

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    :cond_3
    iget-wide v1, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzoc:J

    cmp-long v3, v1, v5

    if-eqz v3, :cond_4

    const/4 v1, 0x5

    iget-wide v2, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzoc:J

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzaby;->zzc(IJ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    return v0
.end method

.method public final zza(Lcom/google/android/gms/internal/measurement/zzaby;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzny:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzny:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzny:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(ILjava/lang/String;)V

    :cond_0
    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzf;->zznz:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    const/4 v0, 0x2

    iget-wide v4, p0, Lcom/google/android/gms/internal/measurement/zzf;->zznz:J

    invoke-virtual {p1, v0, v4, v5}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(IJ)V

    :cond_1
    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzoa:J

    const-wide/32 v4, 0x7fffffff

    cmp-long v6, v0, v4

    if-eqz v6, :cond_2

    const/4 v0, 0x3

    iget-wide v4, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzoa:J

    invoke-virtual {p1, v0, v4, v5}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(IJ)V

    :cond_2
    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzob:Z

    if-eqz v0, :cond_3

    const/4 v0, 0x4

    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzob:Z

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/zzaby;->zza(IZ)V

    :cond_3
    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzoc:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_4

    const/4 v0, 0x5

    iget-wide v1, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzoc:J

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb(IJ)V

    :cond_4
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

    const/16 v1, 0xa

    if-eq v0, v1, :cond_5

    const/16 v1, 0x10

    if-eq v0, v1, :cond_4

    const/16 v1, 0x18

    if-eq v0, v1, :cond_3

    const/16 v1, 0x20

    if-eq v0, v1, :cond_2

    const/16 v1, 0x28

    if-eq v0, v1, :cond_1

    invoke-super {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzaca;->zza(Lcom/google/android/gms/internal/measurement/zzabx;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvi()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzoc:J

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvg()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzob:Z

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvi()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzoa:J

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvi()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzf;->zznz:J

    goto :goto_0

    :cond_5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzf;->zzny:Ljava/lang/String;

    goto :goto_0

    :cond_6
    return-object p0
.end method
