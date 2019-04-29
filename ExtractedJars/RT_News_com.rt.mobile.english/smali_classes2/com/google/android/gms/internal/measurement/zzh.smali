.class public final Lcom/google/android/gms/internal/measurement/zzh;
.super Lcom/google/android/gms/internal/measurement/zzaca;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/measurement/zzaca<",
        "Lcom/google/android/gms/internal/measurement/zzh;",
        ">;"
    }
.end annotation


# static fields
.field private static volatile zzog:[Lcom/google/android/gms/internal/measurement/zzh;


# instance fields
.field public key:I

.field public value:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzaca;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzh;->key:I

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzh;->value:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzh;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzh;->zzbxr:I

    return-void
.end method

.method public static zzd()[Lcom/google/android/gms/internal/measurement/zzh;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzh;->zzog:[Lcom/google/android/gms/internal/measurement/zzh;

    if-nez v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzace;->zzbxq:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzh;->zzog:[Lcom/google/android/gms/internal/measurement/zzh;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    new-array v1, v1, [Lcom/google/android/gms/internal/measurement/zzh;

    sput-object v1, Lcom/google/android/gms/internal/measurement/zzh;->zzog:[Lcom/google/android/gms/internal/measurement/zzh;

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
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzh;->zzog:[Lcom/google/android/gms/internal/measurement/zzh;

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/measurement/zzh;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzh;

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzh;->key:I

    iget v3, p1, Lcom/google/android/gms/internal/measurement/zzh;->key:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzh;->value:I

    iget v3, p1, Lcom/google/android/gms/internal/measurement/zzh;->value:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzh;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzh;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzacc;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzh;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzh;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzacc;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_5
    :goto_0
    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzh;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    if-eqz v1, :cond_7

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzh;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

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

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzh;->key:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzh;->value:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzh;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzh;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzacc;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzh;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

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
    .locals 3

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzaca;->zza()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzh;->key:I

    const/4 v2, 0x1

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/measurement/zzaby;->zzf(II)I

    move-result v1

    add-int/2addr v0, v1

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzh;->value:I

    const/4 v2, 0x2

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/measurement/zzaby;->zzf(II)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final zza(Lcom/google/android/gms/internal/measurement/zzaby;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzh;->key:I

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/measurement/zzaby;->zze(II)V

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzh;->value:I

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/measurement/zzaby;->zze(II)V

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

    if-eqz v0, :cond_3

    const/16 v1, 0x8

    if-eq v0, v1, :cond_2

    const/16 v1, 0x10

    if-eq v0, v1, :cond_1

    invoke-super {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzaca;->zza(Lcom/google/android/gms/internal/measurement/zzabx;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzh;->value:I

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzh;->key:I

    goto :goto_0

    :cond_3
    return-object p0
.end method
