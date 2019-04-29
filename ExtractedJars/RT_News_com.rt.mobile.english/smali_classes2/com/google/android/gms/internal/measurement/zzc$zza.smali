.class public final Lcom/google/android/gms/internal/measurement/zzc$zza;
.super Lcom/google/android/gms/internal/measurement/zzaca;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/zzc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "zza"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/measurement/zzaca<",
        "Lcom/google/android/gms/internal/measurement/zzc$zza;",
        ">;"
    }
.end annotation


# static fields
.field public static final zzpi:Lcom/google/android/gms/internal/measurement/zzacb;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/zzacb<",
            "Lcom/google/android/gms/internal/measurement/zzm;",
            "Lcom/google/android/gms/internal/measurement/zzc$zza;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzpj:[Lcom/google/android/gms/internal/measurement/zzc$zza;


# instance fields
.field public zzpk:[I

.field public zzpl:[I

.field public zzpm:[I

.field private zzpn:I

.field public zzpo:[I

.field public zzpp:I

.field private zzpq:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-class v0, Lcom/google/android/gms/internal/measurement/zzc$zza;

    const/16 v1, 0xb

    const-wide/16 v2, 0x32a

    invoke-static {v1, v0, v2, v3}, Lcom/google/android/gms/internal/measurement/zzacb;->zza(ILjava/lang/Class;J)Lcom/google/android/gms/internal/measurement/zzacb;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpi:Lcom/google/android/gms/internal/measurement/zzacb;

    const/4 v0, 0x0

    new-array v0, v0, [Lcom/google/android/gms/internal/measurement/zzc$zza;

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpj:[Lcom/google/android/gms/internal/measurement/zzc$zza;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzaca;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzacj;->zzbts:[I

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpk:[I

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzacj;->zzbts:[I

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpl:[I

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzacj;->zzbts:[I

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpm:[I

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpn:I

    sget-object v1, Lcom/google/android/gms/internal/measurement/zzacj;->zzbts:[I

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpo:[I

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpp:I

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpq:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzbxr:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/measurement/zzc$zza;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzc$zza;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpk:[I

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpk:[I

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/zzace;->equals([I[I)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpl:[I

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpl:[I

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/zzace;->equals([I[I)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpm:[I

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpm:[I

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/zzace;->equals([I[I)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpn:I

    iget v3, p1, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpn:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpo:[I

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpo:[I

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/zzace;->equals([I[I)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpp:I

    iget v3, p1, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpp:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpq:I

    iget v3, p1, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpq:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    if-eqz v1, :cond_a

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzacc;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_9

    goto :goto_0

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzacc;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_a
    :goto_0
    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    if-eqz v1, :cond_c

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzacc;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_b

    return v0

    :cond_b
    return v2

    :cond_c
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

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpk:[I

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzace;->hashCode([I)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpl:[I

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzace;->hashCode([I)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpm:[I

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzace;->hashCode([I)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpn:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpo:[I

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzace;->hashCode([I)I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpp:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpq:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzacc;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

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
    .locals 6

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzaca;->zza()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpk:[I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpk:[I

    array-length v1, v1

    if-lez v1, :cond_1

    move v1, v3

    move v4, v1

    :goto_0
    iget-object v5, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpk:[I

    array-length v5, v5

    if-ge v1, v5, :cond_0

    iget-object v5, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpk:[I

    aget v5, v5, v1

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/zzaby;->zzao(I)I

    move-result v5

    add-int/2addr v4, v5

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    add-int/2addr v0, v4

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpk:[I

    array-length v1, v1

    mul-int/2addr v1, v2

    add-int/2addr v0, v1

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpl:[I

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpl:[I

    array-length v1, v1

    if-lez v1, :cond_3

    move v1, v3

    move v4, v1

    :goto_1
    iget-object v5, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpl:[I

    array-length v5, v5

    if-ge v1, v5, :cond_2

    iget-object v5, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpl:[I

    aget v5, v5, v1

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/zzaby;->zzao(I)I

    move-result v5

    add-int/2addr v4, v5

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    add-int/2addr v0, v4

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpl:[I

    array-length v1, v1

    mul-int/2addr v1, v2

    add-int/2addr v0, v1

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpm:[I

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpm:[I

    array-length v1, v1

    if-lez v1, :cond_5

    move v1, v3

    move v4, v1

    :goto_2
    iget-object v5, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpm:[I

    array-length v5, v5

    if-ge v1, v5, :cond_4

    iget-object v5, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpm:[I

    aget v5, v5, v1

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/zzaby;->zzao(I)I

    move-result v5

    add-int/2addr v4, v5

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_4
    add-int/2addr v0, v4

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpm:[I

    array-length v1, v1

    mul-int/2addr v1, v2

    add-int/2addr v0, v1

    :cond_5
    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpn:I

    if-eqz v1, :cond_6

    const/4 v1, 0x4

    iget v4, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpn:I

    invoke-static {v1, v4}, Lcom/google/android/gms/internal/measurement/zzaby;->zzf(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_6
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpo:[I

    if-eqz v1, :cond_8

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpo:[I

    array-length v1, v1

    if-lez v1, :cond_8

    move v1, v3

    :goto_3
    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpo:[I

    array-length v4, v4

    if-ge v3, v4, :cond_7

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpo:[I

    aget v4, v4, v3

    invoke-static {v4}, Lcom/google/android/gms/internal/measurement/zzaby;->zzao(I)I

    move-result v4

    add-int/2addr v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_7
    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpo:[I

    array-length v1, v1

    mul-int/2addr v2, v1

    add-int/2addr v0, v2

    :cond_8
    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpp:I

    if-eqz v1, :cond_9

    const/4 v1, 0x6

    iget v2, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpp:I

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zzf(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_9
    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpq:I

    if-eqz v1, :cond_a

    const/4 v1, 0x7

    iget v2, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpq:I

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zzf(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_a
    return v0
.end method

.method public final zza(Lcom/google/android/gms/internal/measurement/zzaby;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpk:[I

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpk:[I

    array-length v0, v0

    if-lez v0, :cond_0

    move v0, v1

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpk:[I

    array-length v2, v2

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpk:[I

    aget v2, v2, v0

    const/4 v3, 0x1

    invoke-virtual {p1, v3, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zze(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpl:[I

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpl:[I

    array-length v0, v0

    if-lez v0, :cond_1

    move v0, v1

    :goto_1
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpl:[I

    array-length v2, v2

    if-ge v0, v2, :cond_1

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpl:[I

    aget v3, v3, v0

    invoke-virtual {p1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzaby;->zze(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpm:[I

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpm:[I

    array-length v0, v0

    if-lez v0, :cond_2

    move v0, v1

    :goto_2
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpm:[I

    array-length v2, v2

    if-ge v0, v2, :cond_2

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpm:[I

    aget v3, v3, v0

    invoke-virtual {p1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzaby;->zze(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpn:I

    if-eqz v0, :cond_3

    const/4 v0, 0x4

    iget v2, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpn:I

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zze(II)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpo:[I

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpo:[I

    array-length v0, v0

    if-lez v0, :cond_4

    :goto_3
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpo:[I

    array-length v0, v0

    if-ge v1, v0, :cond_4

    const/4 v0, 0x5

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpo:[I

    aget v2, v2, v1

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/measurement/zzaby;->zze(II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpp:I

    if-eqz v0, :cond_5

    const/4 v0, 0x6

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpp:I

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/zzaby;->zze(II)V

    :cond_5
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpq:I

    if-eqz v0, :cond_6

    const/4 v0, 0x7

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpq:I

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/zzaby;->zze(II)V

    :cond_6
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

    const/4 v1, 0x0

    sparse-switch v0, :sswitch_data_0

    invoke-super {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzaca;->zza(Lcom/google/android/gms/internal/measurement/zzabx;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :sswitch_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpq:I

    goto :goto_0

    :sswitch_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpp:I

    goto :goto_0

    :sswitch_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/zzabx;->zzaf(I)I

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->getPosition()I

    move-result v2

    move v3, v1

    :goto_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvl()I

    move-result v4

    if-lez v4, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/measurement/zzabx;->zzam(I)V

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpo:[I

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpo:[I

    array-length v2, v2

    :goto_2
    add-int/2addr v3, v2

    new-array v3, v3, [I

    if-eqz v2, :cond_3

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpo:[I

    invoke-static {v4, v1, v3, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_3
    :goto_3
    array-length v1, v3

    if-ge v2, v1, :cond_4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v1

    aput v1, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_4
    iput-object v3, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpo:[I

    goto/16 :goto_13

    :sswitch_3
    const/16 v0, 0x28

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/zzacj;->zzb(Lcom/google/android/gms/internal/measurement/zzabx;I)I

    move-result v0

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpo:[I

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_4

    :cond_5
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpo:[I

    array-length v2, v2

    :goto_4
    add-int/2addr v0, v2

    new-array v0, v0, [I

    if-eqz v2, :cond_6

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpo:[I

    invoke-static {v3, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_6
    :goto_5
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    if-ge v2, v1, :cond_7

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v1

    aput v1, v0, v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvf()I

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v1

    aput v1, v0, v2

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpo:[I

    goto/16 :goto_0

    :sswitch_4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpn:I

    goto/16 :goto_0

    :sswitch_5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/zzabx;->zzaf(I)I

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->getPosition()I

    move-result v2

    move v3, v1

    :goto_6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvl()I

    move-result v4

    if-lez v4, :cond_8

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_8
    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/measurement/zzabx;->zzam(I)V

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpm:[I

    if-nez v2, :cond_9

    move v2, v1

    goto :goto_7

    :cond_9
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpm:[I

    array-length v2, v2

    :goto_7
    add-int/2addr v3, v2

    new-array v3, v3, [I

    if-eqz v2, :cond_a

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpm:[I

    invoke-static {v4, v1, v3, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_a
    :goto_8
    array-length v1, v3

    if-ge v2, v1, :cond_b

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v1

    aput v1, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_b
    iput-object v3, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpm:[I

    goto/16 :goto_13

    :sswitch_6
    const/16 v0, 0x18

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/zzacj;->zzb(Lcom/google/android/gms/internal/measurement/zzabx;I)I

    move-result v0

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpm:[I

    if-nez v2, :cond_c

    move v2, v1

    goto :goto_9

    :cond_c
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpm:[I

    array-length v2, v2

    :goto_9
    add-int/2addr v0, v2

    new-array v0, v0, [I

    if-eqz v2, :cond_d

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpm:[I

    invoke-static {v3, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_d
    :goto_a
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    if-ge v2, v1, :cond_e

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v1

    aput v1, v0, v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvf()I

    add-int/lit8 v2, v2, 0x1

    goto :goto_a

    :cond_e
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v1

    aput v1, v0, v2

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpm:[I

    goto/16 :goto_0

    :sswitch_7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/zzabx;->zzaf(I)I

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->getPosition()I

    move-result v2

    move v3, v1

    :goto_b
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvl()I

    move-result v4

    if-lez v4, :cond_f

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    add-int/lit8 v3, v3, 0x1

    goto :goto_b

    :cond_f
    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/measurement/zzabx;->zzam(I)V

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpl:[I

    if-nez v2, :cond_10

    move v2, v1

    goto :goto_c

    :cond_10
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpl:[I

    array-length v2, v2

    :goto_c
    add-int/2addr v3, v2

    new-array v3, v3, [I

    if-eqz v2, :cond_11

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpl:[I

    invoke-static {v4, v1, v3, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_11
    :goto_d
    array-length v1, v3

    if-ge v2, v1, :cond_12

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v1

    aput v1, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_d

    :cond_12
    iput-object v3, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpl:[I

    goto/16 :goto_13

    :sswitch_8
    const/16 v0, 0x10

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/zzacj;->zzb(Lcom/google/android/gms/internal/measurement/zzabx;I)I

    move-result v0

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpl:[I

    if-nez v2, :cond_13

    move v2, v1

    goto :goto_e

    :cond_13
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpl:[I

    array-length v2, v2

    :goto_e
    add-int/2addr v0, v2

    new-array v0, v0, [I

    if-eqz v2, :cond_14

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpl:[I

    invoke-static {v3, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_14
    :goto_f
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    if-ge v2, v1, :cond_15

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v1

    aput v1, v0, v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvf()I

    add-int/lit8 v2, v2, 0x1

    goto :goto_f

    :cond_15
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v1

    aput v1, v0, v2

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpl:[I

    goto/16 :goto_0

    :sswitch_9
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/zzabx;->zzaf(I)I

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->getPosition()I

    move-result v2

    move v3, v1

    :goto_10
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvl()I

    move-result v4

    if-lez v4, :cond_16

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    add-int/lit8 v3, v3, 0x1

    goto :goto_10

    :cond_16
    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/measurement/zzabx;->zzam(I)V

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpk:[I

    if-nez v2, :cond_17

    move v2, v1

    goto :goto_11

    :cond_17
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpk:[I

    array-length v2, v2

    :goto_11
    add-int/2addr v3, v2

    new-array v3, v3, [I

    if-eqz v2, :cond_18

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpk:[I

    invoke-static {v4, v1, v3, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_18
    :goto_12
    array-length v1, v3

    if-ge v2, v1, :cond_19

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v1

    aput v1, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_12

    :cond_19
    iput-object v3, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpk:[I

    :goto_13
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/zzabx;->zzal(I)V

    goto/16 :goto_0

    :sswitch_a
    const/16 v0, 0x8

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/zzacj;->zzb(Lcom/google/android/gms/internal/measurement/zzabx;I)I

    move-result v0

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpk:[I

    if-nez v2, :cond_1a

    move v2, v1

    goto :goto_14

    :cond_1a
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpk:[I

    array-length v2, v2

    :goto_14
    add-int/2addr v0, v2

    new-array v0, v0, [I

    if-eqz v2, :cond_1b

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpk:[I

    invoke-static {v3, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1b
    :goto_15
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    if-ge v2, v1, :cond_1c

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v1

    aput v1, v0, v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvf()I

    add-int/lit8 v2, v2, 0x1

    goto :goto_15

    :cond_1c
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvh()I

    move-result v1

    aput v1, v0, v2

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzc$zza;->zzpk:[I

    goto/16 :goto_0

    :sswitch_b
    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_b
        0x8 -> :sswitch_a
        0xa -> :sswitch_9
        0x10 -> :sswitch_8
        0x12 -> :sswitch_7
        0x18 -> :sswitch_6
        0x1a -> :sswitch_5
        0x20 -> :sswitch_4
        0x28 -> :sswitch_3
        0x2a -> :sswitch_2
        0x30 -> :sswitch_1
        0x38 -> :sswitch_0
    .end sparse-switch
.end method
