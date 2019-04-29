.class public final Lcom/google/android/gms/internal/wearable/zzi;
.super Lcom/google/android/gms/internal/wearable/zzn;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/wearable/zzn<",
        "Lcom/google/android/gms/internal/wearable/zzi;",
        ">;"
    }
.end annotation


# static fields
.field private static volatile zzgb:[Lcom/google/android/gms/internal/wearable/zzi;


# instance fields
.field public type:I

.field public zzgc:Lcom/google/android/gms/internal/wearable/zzj;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/wearable/zzn;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/wearable/zzi;->type:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/wearable/zzi;->zzgc:Lcom/google/android/gms/internal/wearable/zzj;

    iput-object v0, p0, Lcom/google/android/gms/internal/wearable/zzi;->zzhc:Lcom/google/android/gms/internal/wearable/zzp;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/wearable/zzi;->zzhl:I

    return-void
.end method

.method private final zzb(Lcom/google/android/gms/internal/wearable/zzk;)Lcom/google/android/gms/internal/wearable/zzi;
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

    if-eqz v0, :cond_5

    const/16 v1, 0x8

    if-eq v0, v1, :cond_3

    const/16 v1, 0x12

    if-eq v0, v1, :cond_1

    invoke-super {p0, p1, v0}, Lcom/google/android/gms/internal/wearable/zzn;->zza(Lcom/google/android/gms/internal/wearable/zzk;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/wearable/zzi;->zzgc:Lcom/google/android/gms/internal/wearable/zzj;

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/wearable/zzj;

    invoke-direct {v0}, Lcom/google/android/gms/internal/wearable/zzj;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/wearable/zzi;->zzgc:Lcom/google/android/gms/internal/wearable/zzj;

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/wearable/zzi;->zzgc:Lcom/google/android/gms/internal/wearable/zzj;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/wearable/zzk;->zza(Lcom/google/android/gms/internal/wearable/zzt;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzk;->getPosition()I

    move-result v1

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzk;->zzk()I

    move-result v2

    if-lez v2, :cond_4

    const/16 v3, 0xf

    if-gt v2, v3, :cond_4

    iput v2, p0, Lcom/google/android/gms/internal/wearable/zzi;->type:I

    goto :goto_0

    :cond_4
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
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/wearable/zzk;->zzg(I)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/wearable/zzn;->zza(Lcom/google/android/gms/internal/wearable/zzk;I)Z

    goto :goto_0

    :cond_5
    return-object p0
.end method

.method public static zzi()[Lcom/google/android/gms/internal/wearable/zzi;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/wearable/zzi;->zzgb:[Lcom/google/android/gms/internal/wearable/zzi;

    if-nez v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/wearable/zzr;->zzhk:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/wearable/zzi;->zzgb:[Lcom/google/android/gms/internal/wearable/zzi;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    new-array v1, v1, [Lcom/google/android/gms/internal/wearable/zzi;

    sput-object v1, Lcom/google/android/gms/internal/wearable/zzi;->zzgb:[Lcom/google/android/gms/internal/wearable/zzi;

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
    sget-object v0, Lcom/google/android/gms/internal/wearable/zzi;->zzgb:[Lcom/google/android/gms/internal/wearable/zzi;

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/wearable/zzi;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/wearable/zzi;

    iget v1, p0, Lcom/google/android/gms/internal/wearable/zzi;->type:I

    iget v3, p1, Lcom/google/android/gms/internal/wearable/zzi;->type:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/wearable/zzi;->zzgc:Lcom/google/android/gms/internal/wearable/zzj;

    if-nez v1, :cond_3

    iget-object v1, p1, Lcom/google/android/gms/internal/wearable/zzi;->zzgc:Lcom/google/android/gms/internal/wearable/zzj;

    if-eqz v1, :cond_4

    return v2

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/wearable/zzi;->zzgc:Lcom/google/android/gms/internal/wearable/zzj;

    iget-object v3, p1, Lcom/google/android/gms/internal/wearable/zzi;->zzgc:Lcom/google/android/gms/internal/wearable/zzj;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/wearable/zzj;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/wearable/zzi;->zzhc:Lcom/google/android/gms/internal/wearable/zzp;

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/google/android/gms/internal/wearable/zzi;->zzhc:Lcom/google/android/gms/internal/wearable/zzp;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/wearable/zzp;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/wearable/zzi;->zzhc:Lcom/google/android/gms/internal/wearable/zzp;

    iget-object p1, p1, Lcom/google/android/gms/internal/wearable/zzi;->zzhc:Lcom/google/android/gms/internal/wearable/zzp;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/wearable/zzp;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_6
    :goto_0
    iget-object v1, p1, Lcom/google/android/gms/internal/wearable/zzi;->zzhc:Lcom/google/android/gms/internal/wearable/zzp;

    if-eqz v1, :cond_8

    iget-object p1, p1, Lcom/google/android/gms/internal/wearable/zzi;->zzhc:Lcom/google/android/gms/internal/wearable/zzp;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/wearable/zzp;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_7

    return v0

    :cond_7
    return v2

    :cond_8
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

    iget v0, p0, Lcom/google/android/gms/internal/wearable/zzi;->type:I

    add-int/2addr v1, v0

    iget-object v0, p0, Lcom/google/android/gms/internal/wearable/zzi;->zzgc:Lcom/google/android/gms/internal/wearable/zzj;

    mul-int/lit8 v1, v1, 0x1f

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/wearable/zzj;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/wearable/zzi;->zzhc:Lcom/google/android/gms/internal/wearable/zzp;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/wearable/zzi;->zzhc:Lcom/google/android/gms/internal/wearable/zzp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/wearable/zzp;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/wearable/zzi;->zzhc:Lcom/google/android/gms/internal/wearable/zzp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/wearable/zzp;->hashCode()I

    move-result v2

    :cond_2
    :goto_1
    add-int/2addr v1, v2

    return v1
.end method

.method public final synthetic zza(Lcom/google/android/gms/internal/wearable/zzk;)Lcom/google/android/gms/internal/wearable/zzt;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/wearable/zzi;->zzb(Lcom/google/android/gms/internal/wearable/zzk;)Lcom/google/android/gms/internal/wearable/zzi;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Lcom/google/android/gms/internal/wearable/zzl;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/wearable/zzi;->type:I

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/wearable/zzl;->zzd(II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/wearable/zzi;->zzgc:Lcom/google/android/gms/internal/wearable/zzj;

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/google/android/gms/internal/wearable/zzi;->zzgc:Lcom/google/android/gms/internal/wearable/zzj;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/wearable/zzl;->zza(ILcom/google/android/gms/internal/wearable/zzt;)V

    :cond_0
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/wearable/zzn;->zza(Lcom/google/android/gms/internal/wearable/zzl;)V

    return-void
.end method

.method protected final zzg()I
    .locals 3

    invoke-super {p0}, Lcom/google/android/gms/internal/wearable/zzn;->zzg()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/wearable/zzi;->type:I

    const/4 v2, 0x1

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/wearable/zzl;->zze(II)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/google/android/gms/internal/wearable/zzi;->zzgc:Lcom/google/android/gms/internal/wearable/zzj;

    if-eqz v1, :cond_0

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/internal/wearable/zzi;->zzgc:Lcom/google/android/gms/internal/wearable/zzj;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/wearable/zzl;->zzb(ILcom/google/android/gms/internal/wearable/zzt;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    return v0
.end method
