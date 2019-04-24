.class final Lcom/google/android/gms/internal/measurement/zzzg;
.super Lcom/google/android/gms/internal/measurement/zzze;


# instance fields
.field private final buffer:[B

.field private limit:I

.field private pos:I

.field private final zzbrh:Z

.field private zzbri:I

.field private zzbrj:I

.field private zzbrk:I


# direct methods
.method private constructor <init>([BIIZ)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzze;-><init>(Lcom/google/android/gms/internal/measurement/zzzf;)V

    const v0, 0x7fffffff

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzzg;->zzbrk:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzzg;->buffer:[B

    add-int/2addr p3, p2

    iput p3, p0, Lcom/google/android/gms/internal/measurement/zzzg;->limit:I

    iput p2, p0, Lcom/google/android/gms/internal/measurement/zzzg;->pos:I

    iget p1, p0, Lcom/google/android/gms/internal/measurement/zzzg;->pos:I

    iput p1, p0, Lcom/google/android/gms/internal/measurement/zzzg;->zzbrj:I

    iput-boolean p4, p0, Lcom/google/android/gms/internal/measurement/zzzg;->zzbrh:Z

    return-void
.end method

.method synthetic constructor <init>([BIIZLcom/google/android/gms/internal/measurement/zzzf;)V
    .locals 0

    const/4 p4, 0x0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/measurement/zzzg;-><init>([BIIZ)V

    return-void
.end method

.method private final zzta()V
    .locals 3

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzzg;->limit:I

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzzg;->zzbri:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzzg;->limit:I

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzzg;->limit:I

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzzg;->zzbrj:I

    sub-int v1, v0, v1

    iget v2, p0, Lcom/google/android/gms/internal/measurement/zzzg;->zzbrk:I

    if-le v1, v2, :cond_0

    sub-int/2addr v1, v2

    iput v1, p0, Lcom/google/android/gms/internal/measurement/zzzg;->zzbri:I

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzzg;->zzbri:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzzg;->limit:I

    return-void

    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzzg;->zzbri:I

    return-void
.end method


# virtual methods
.method public final zzaf(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/measurement/zzzt;
        }
    .end annotation

    if-ltz p1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzze;->zzsz()I

    move-result v0

    add-int/2addr p1, v0

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzzg;->zzbrk:I

    if-gt p1, v0, :cond_0

    iput p1, p0, Lcom/google/android/gms/internal/measurement/zzzg;->zzbrk:I

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzzg;->zzta()V

    return v0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzzt;->zztm()Lcom/google/android/gms/internal/measurement/zzzt;

    move-result-object p1

    throw p1

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzzt;->zztn()Lcom/google/android/gms/internal/measurement/zzzt;

    move-result-object p1

    throw p1
.end method

.method public final zzsz()I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzzg;->pos:I

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzzg;->zzbrj:I

    sub-int/2addr v0, v1

    return v0
.end method
