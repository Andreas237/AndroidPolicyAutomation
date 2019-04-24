.class public Lcom/google/d/a/a;
.super Ljava/lang/Object;
.source "IMASDK"


# instance fields
.field private final a:[B

.field private b:I

.field private c:I


# direct methods
.method public constructor <init>([B)V
    .locals 7

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x100

    .line 8
    new-array v1, v0, [B

    iput-object v1, p0, Lcom/google/d/a/a;->a:[B

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 14
    iget-object v3, p0, Lcom/google/d/a/a;->a:[B

    int-to-byte v4, v2

    aput-byte v4, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_1
    if-ge v2, v0, :cond_1

    .line 17
    iget-object v4, p0, Lcom/google/d/a/a;->a:[B

    aget-byte v5, v4, v2

    add-int/2addr v3, v5

    array-length v5, p1

    rem-int v5, v2, v5

    aget-byte v5, p1, v5

    add-int/2addr v3, v5

    and-int/lit16 v3, v3, 0xff

    .line 19
    aget-byte v5, v4, v2

    .line 20
    aget-byte v6, v4, v3

    aput-byte v6, v4, v2

    .line 21
    aput-byte v5, v4, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 23
    :cond_1
    iput v1, p0, Lcom/google/d/a/a;->b:I

    .line 24
    iput v1, p0, Lcom/google/d/a/a;->c:I

    return-void
.end method


# virtual methods
.method public a([B)V
    .locals 7

    .line 28
    iget v0, p0, Lcom/google/d/a/a;->b:I

    .line 29
    iget v1, p0, Lcom/google/d/a/a;->c:I

    const/4 v2, 0x0

    .line 30
    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_0

    add-int/lit8 v0, v0, 0x1

    and-int/lit16 v0, v0, 0xff

    .line 32
    iget-object v3, p0, Lcom/google/d/a/a;->a:[B

    aget-byte v4, v3, v0

    add-int/2addr v1, v4

    and-int/lit16 v1, v1, 0xff

    .line 34
    aget-byte v4, v3, v0

    .line 35
    aget-byte v5, v3, v1

    aput-byte v5, v3, v0

    .line 36
    aput-byte v4, v3, v1

    .line 38
    aget-byte v4, p1, v2

    aget-byte v5, v3, v0

    aget-byte v6, v3, v1

    add-int/2addr v5, v6

    and-int/lit16 v5, v5, 0xff

    aget-byte v3, v3, v5

    xor-int/2addr v3, v4

    int-to-byte v3, v3

    aput-byte v3, p1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 40
    :cond_0
    iput v0, p0, Lcom/google/d/a/a;->b:I

    .line 41
    iput v1, p0, Lcom/google/d/a/a;->c:I

    return-void
.end method
