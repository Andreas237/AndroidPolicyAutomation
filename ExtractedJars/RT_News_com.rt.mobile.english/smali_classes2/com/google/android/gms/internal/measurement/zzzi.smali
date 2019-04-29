.class final Lcom/google/android/gms/internal/measurement/zzzi;
.super Lcom/google/android/gms/internal/measurement/zzzg;


# instance fields
.field private final buffer:[B

.field private limit:I

.field private pos:I

.field private final zzbrr:Z

.field private zzbrs:I

.field private zzbrt:I

.field private zzbru:I


# direct methods
.method private constructor <init>([BIIZ)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzzg;-><init>(Lcom/google/android/gms/internal/measurement/zzzh;)V

    const v0, 0x7fffffff

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzzi;->zzbru:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzzi;->buffer:[B

    add-int/2addr p3, p2

    iput p3, p0, Lcom/google/android/gms/internal/measurement/zzzi;->limit:I

    iput p2, p0, Lcom/google/android/gms/internal/measurement/zzzi;->pos:I

    iget p1, p0, Lcom/google/android/gms/internal/measurement/zzzi;->pos:I

    iput p1, p0, Lcom/google/android/gms/internal/measurement/zzzi;->zzbrt:I

    iput-boolean p4, p0, Lcom/google/android/gms/internal/measurement/zzzi;->zzbrr:Z

    return-void
.end method

.method synthetic constructor <init>([BIIZLcom/google/android/gms/internal/measurement/zzzh;)V
    .locals 0

    const/4 p4, 0x0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/measurement/zzzi;-><init>([BIIZ)V

    return-void
.end method

.method private final zztj()V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzzi;->limit:I

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzzi;->zzbrs:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzzi;->limit:I

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzzi;->limit:I

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzzi;->zzbrt:I

    sub-int/2addr v0, v1

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzzi;->zzbru:I

    if-le v0, v1, :cond_0

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzzi;->zzbru:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzzi;->zzbrs:I

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzzi;->limit:I

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzzi;->zzbrs:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzzi;->limit:I

    return-void

    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzzi;->zzbrs:I

    return-void
.end method


# virtual methods
.method public final zzaf(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/measurement/zzzv;
        }
    .end annotation

    if-gez p1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzzv;->zztw()Lcom/google/android/gms/internal/measurement/zzzv;

    move-result-object p1

    throw p1

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzzg;->zzti()I

    move-result v0

    add-int/2addr p1, v0

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzzi;->zzbru:I

    if-le p1, v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzzv;->zztv()Lcom/google/android/gms/internal/measurement/zzzv;

    move-result-object p1

    throw p1

    :cond_1
    iput p1, p0, Lcom/google/android/gms/internal/measurement/zzzi;->zzbru:I

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzzi;->zztj()V

    return v0
.end method

.method public final zzti()I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzzi;->pos:I

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzzi;->zzbrt:I

    sub-int/2addr v0, v1

    return v0
.end method
