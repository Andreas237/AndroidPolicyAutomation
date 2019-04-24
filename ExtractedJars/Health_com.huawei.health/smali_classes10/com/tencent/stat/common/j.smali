.class Lcom/tencent/stat/common/j;
.super Lcom/tencent/stat/common/h;


# static fields
.field static final synthetic g:Z

.field private static final h:[B

.field private static final i:[B


# instance fields
.field c:I

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field private final j:[B

.field private k:I

.field private final l:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/tencent/stat/common/g;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lcom/tencent/stat/common/j;->g:Z

    const/16 v0, 0x40

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/tencent/stat/common/j;->h:[B

    const/16 v0, 0x40

    new-array v0, v0, [B

    fill-array-data v0, :array_1

    sput-object v0, Lcom/tencent/stat/common/j;->i:[B

    return-void

    :array_0
    .array-data 1
        0x41t
        0x42t
        0x43t
        0x44t
        0x45t
        0x46t
        0x47t
        0x48t
        0x49t
        0x4at
        0x4bt
        0x4ct
        0x4dt
        0x4et
        0x4ft
        0x50t
        0x51t
        0x52t
        0x53t
        0x54t
        0x55t
        0x56t
        0x57t
        0x58t
        0x59t
        0x5at
        0x61t
        0x62t
        0x63t
        0x64t
        0x65t
        0x66t
        0x67t
        0x68t
        0x69t
        0x6at
        0x6bt
        0x6ct
        0x6dt
        0x6et
        0x6ft
        0x70t
        0x71t
        0x72t
        0x73t
        0x74t
        0x75t
        0x76t
        0x77t
        0x78t
        0x79t
        0x7at
        0x30t
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x2bt
        0x2ft
    .end array-data

    :array_1
    .array-data 1
        0x41t
        0x42t
        0x43t
        0x44t
        0x45t
        0x46t
        0x47t
        0x48t
        0x49t
        0x4at
        0x4bt
        0x4ct
        0x4dt
        0x4et
        0x4ft
        0x50t
        0x51t
        0x52t
        0x53t
        0x54t
        0x55t
        0x56t
        0x57t
        0x58t
        0x59t
        0x5at
        0x61t
        0x62t
        0x63t
        0x64t
        0x65t
        0x66t
        0x67t
        0x68t
        0x69t
        0x6at
        0x6bt
        0x6ct
        0x6dt
        0x6et
        0x6ft
        0x70t
        0x71t
        0x72t
        0x73t
        0x74t
        0x75t
        0x76t
        0x77t
        0x78t
        0x79t
        0x7at
        0x30t
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x2dt
        0x5ft
    .end array-data
.end method

.method public constructor <init>(I[B)V
    .locals 1

    invoke-direct {p0}, Lcom/tencent/stat/common/h;-><init>()V

    iput-object p2, p0, Lcom/tencent/stat/common/j;->a:[B

    and-int/lit8 v0, p1, 0x1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/tencent/stat/common/j;->d:Z

    and-int/lit8 v0, p1, 0x2

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lcom/tencent/stat/common/j;->e:Z

    and-int/lit8 v0, p1, 0x4

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    iput-boolean v0, p0, Lcom/tencent/stat/common/j;->f:Z

    and-int/lit8 v0, p1, 0x8

    if-nez v0, :cond_3

    sget-object v0, Lcom/tencent/stat/common/j;->h:[B

    goto :goto_3

    :cond_3
    sget-object v0, Lcom/tencent/stat/common/j;->i:[B

    :goto_3
    iput-object v0, p0, Lcom/tencent/stat/common/j;->l:[B

    const/4 v0, 0x2

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/tencent/stat/common/j;->j:[B

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/stat/common/j;->c:I

    iget-boolean v0, p0, Lcom/tencent/stat/common/j;->e:Z

    if-eqz v0, :cond_4

    const/16 v0, 0x13

    goto :goto_4

    :cond_4
    const/4 v0, -0x1

    :goto_4
    iput v0, p0, Lcom/tencent/stat/common/j;->k:I

    return-void
.end method


# virtual methods
.method public a([BIIZ)Z
    .locals 10

    iget-object v3, p0, Lcom/tencent/stat/common/j;->l:[B

    iget-object v4, p0, Lcom/tencent/stat/common/j;->a:[B

    const/4 v5, 0x0

    iget v6, p0, Lcom/tencent/stat/common/j;->k:I

    move v7, p2

    add-int/2addr p3, p2

    const/4 v8, -0x1

    iget v0, p0, Lcom/tencent/stat/common/j;->c:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    :pswitch_0
    goto :goto_0

    :pswitch_1
    add-int/lit8 v0, v7, 0x2

    if-gt v0, p3, :cond_0

    iget-object v0, p0, Lcom/tencent/stat/common/j;->j:[B

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x10

    move v1, v7

    add-int/lit8 v7, v7, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    move v1, v7

    add-int/lit8 v7, v7, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    or-int v8, v0, v1

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/stat/common/j;->c:I

    goto :goto_0

    :pswitch_2
    add-int/lit8 v0, v7, 0x1

    if-gt v0, p3, :cond_0

    iget-object v0, p0, Lcom/tencent/stat/common/j;->j:[B

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x10

    iget-object v1, p0, Lcom/tencent/stat/common/j;->j:[B

    const/4 v2, 0x1

    aget-byte v1, v1, v2

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    move v1, v7

    add-int/lit8 v7, v7, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    or-int v8, v0, v1

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/stat/common/j;->c:I

    :cond_0
    :goto_0
    const/4 v0, -0x1

    if-eq v8, v0, :cond_2

    move v0, v5

    add-int/lit8 v5, v5, 0x1

    shr-int/lit8 v1, v8, 0x12

    and-int/lit8 v1, v1, 0x3f

    aget-byte v1, v3, v1

    const/4 v0, 0x0

    aput-byte v1, v4, v0

    move v0, v5

    add-int/lit8 v5, v5, 0x1

    shr-int/lit8 v1, v8, 0xc

    and-int/lit8 v1, v1, 0x3f

    aget-byte v1, v3, v1

    const/4 v0, 0x1

    aput-byte v1, v4, v0

    move v0, v5

    add-int/lit8 v5, v5, 0x1

    shr-int/lit8 v1, v8, 0x6

    and-int/lit8 v1, v1, 0x3f

    aget-byte v1, v3, v1

    const/4 v0, 0x2

    aput-byte v1, v4, v0

    move v0, v5

    add-int/lit8 v5, v5, 0x1

    and-int/lit8 v1, v8, 0x3f

    aget-byte v1, v3, v1

    const/4 v0, 0x3

    aput-byte v1, v4, v0

    add-int/lit8 v6, v6, -0x1

    if-nez v6, :cond_2

    iget-boolean v0, p0, Lcom/tencent/stat/common/j;->f:Z

    if-eqz v0, :cond_1

    move v0, v5

    add-int/lit8 v5, v5, 0x1

    const/16 v1, 0xd

    const/4 v0, 0x4

    aput-byte v1, v4, v0

    :cond_1
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    const/16 v1, 0xa

    aput-byte v1, v4, v0

    const/16 v6, 0x13

    :cond_2
    :goto_1
    add-int/lit8 v0, v7, 0x3

    if-gt v0, p3, :cond_4

    aget-byte v0, p1, v7

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x10

    add-int/lit8 v1, v7, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 v1, v7, 0x2

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    or-int v8, v0, v1

    shr-int/lit8 v0, v8, 0x12

    and-int/lit8 v0, v0, 0x3f

    aget-byte v0, v3, v0

    aput-byte v0, v4, v5

    add-int/lit8 v0, v5, 0x1

    shr-int/lit8 v1, v8, 0xc

    and-int/lit8 v1, v1, 0x3f

    aget-byte v1, v3, v1

    aput-byte v1, v4, v0

    add-int/lit8 v0, v5, 0x2

    shr-int/lit8 v1, v8, 0x6

    and-int/lit8 v1, v1, 0x3f

    aget-byte v1, v3, v1

    aput-byte v1, v4, v0

    add-int/lit8 v0, v5, 0x3

    and-int/lit8 v1, v8, 0x3f

    aget-byte v1, v3, v1

    aput-byte v1, v4, v0

    add-int/lit8 v7, v7, 0x3

    add-int/lit8 v5, v5, 0x4

    add-int/lit8 v6, v6, -0x1

    if-nez v6, :cond_2

    iget-boolean v0, p0, Lcom/tencent/stat/common/j;->f:Z

    if-eqz v0, :cond_3

    move v0, v5

    add-int/lit8 v5, v5, 0x1

    const/16 v1, 0xd

    aput-byte v1, v4, v0

    :cond_3
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    const/16 v1, 0xa

    aput-byte v1, v4, v0

    const/16 v6, 0x13

    goto/16 :goto_1

    :cond_4
    if-eqz p4, :cond_13

    iget v0, p0, Lcom/tencent/stat/common/j;->c:I

    sub-int v0, v7, v0

    add-int/lit8 v1, p3, -0x1

    if-ne v0, v1, :cond_9

    const/4 v9, 0x0

    iget v0, p0, Lcom/tencent/stat/common/j;->c:I

    if-lez v0, :cond_5

    iget-object v0, p0, Lcom/tencent/stat/common/j;->j:[B

    move v1, v9

    add-int/lit8 v9, v9, 0x1

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    goto :goto_2

    :cond_5
    move v0, v7

    add-int/lit8 v7, v7, 0x1

    aget-byte v0, p1, v0

    :goto_2
    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v8, v0, 0x4

    iget v0, p0, Lcom/tencent/stat/common/j;->c:I

    sub-int/2addr v0, v9

    iput v0, p0, Lcom/tencent/stat/common/j;->c:I

    move v0, v5

    add-int/lit8 v5, v5, 0x1

    shr-int/lit8 v1, v8, 0x6

    and-int/lit8 v1, v1, 0x3f

    aget-byte v1, v3, v1

    aput-byte v1, v4, v0

    move v0, v5

    add-int/lit8 v5, v5, 0x1

    and-int/lit8 v1, v8, 0x3f

    aget-byte v1, v3, v1

    aput-byte v1, v4, v0

    iget-boolean v0, p0, Lcom/tencent/stat/common/j;->d:Z

    if-eqz v0, :cond_6

    move v0, v5

    add-int/lit8 v5, v5, 0x1

    const/16 v1, 0x3d

    aput-byte v1, v4, v0

    move v0, v5

    add-int/lit8 v5, v5, 0x1

    const/16 v1, 0x3d

    aput-byte v1, v4, v0

    :cond_6
    iget-boolean v0, p0, Lcom/tencent/stat/common/j;->e:Z

    if-eqz v0, :cond_8

    iget-boolean v0, p0, Lcom/tencent/stat/common/j;->f:Z

    if-eqz v0, :cond_7

    move v0, v5

    add-int/lit8 v5, v5, 0x1

    const/16 v1, 0xd

    aput-byte v1, v4, v0

    :cond_7
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    const/16 v1, 0xa

    aput-byte v1, v4, v0

    :cond_8
    goto/16 :goto_5

    :cond_9
    iget v0, p0, Lcom/tencent/stat/common/j;->c:I

    sub-int v0, v7, v0

    add-int/lit8 v1, p3, -0x2

    if-ne v0, v1, :cond_f

    const/4 v9, 0x0

    iget v0, p0, Lcom/tencent/stat/common/j;->c:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_a

    iget-object v0, p0, Lcom/tencent/stat/common/j;->j:[B

    move v1, v9

    add-int/lit8 v9, v9, 0x1

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    goto :goto_3

    :cond_a
    move v0, v7

    add-int/lit8 v7, v7, 0x1

    aget-byte v0, p1, v0

    :goto_3
    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0xa

    iget v1, p0, Lcom/tencent/stat/common/j;->c:I

    if-lez v1, :cond_b

    iget-object v1, p0, Lcom/tencent/stat/common/j;->j:[B

    move v2, v9

    add-int/lit8 v9, v9, 0x1

    aget-byte v1, v1, v2

    goto :goto_4

    :cond_b
    move v1, v7

    add-int/lit8 v7, v7, 0x1

    aget-byte v1, p1, v1

    :goto_4
    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x2

    or-int v8, v0, v1

    iget v0, p0, Lcom/tencent/stat/common/j;->c:I

    sub-int/2addr v0, v9

    iput v0, p0, Lcom/tencent/stat/common/j;->c:I

    move v0, v5

    add-int/lit8 v5, v5, 0x1

    shr-int/lit8 v1, v8, 0xc

    and-int/lit8 v1, v1, 0x3f

    aget-byte v1, v3, v1

    aput-byte v1, v4, v0

    move v0, v5

    add-int/lit8 v5, v5, 0x1

    shr-int/lit8 v1, v8, 0x6

    and-int/lit8 v1, v1, 0x3f

    aget-byte v1, v3, v1

    aput-byte v1, v4, v0

    move v0, v5

    add-int/lit8 v5, v5, 0x1

    and-int/lit8 v1, v8, 0x3f

    aget-byte v1, v3, v1

    aput-byte v1, v4, v0

    iget-boolean v0, p0, Lcom/tencent/stat/common/j;->d:Z

    if-eqz v0, :cond_c

    move v0, v5

    add-int/lit8 v5, v5, 0x1

    const/16 v1, 0x3d

    aput-byte v1, v4, v0

    :cond_c
    iget-boolean v0, p0, Lcom/tencent/stat/common/j;->e:Z

    if-eqz v0, :cond_e

    iget-boolean v0, p0, Lcom/tencent/stat/common/j;->f:Z

    if-eqz v0, :cond_d

    move v0, v5

    add-int/lit8 v5, v5, 0x1

    const/16 v1, 0xd

    aput-byte v1, v4, v0

    :cond_d
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    const/16 v1, 0xa

    aput-byte v1, v4, v0

    :cond_e
    goto :goto_5

    :cond_f
    iget-boolean v0, p0, Lcom/tencent/stat/common/j;->e:Z

    if-eqz v0, :cond_11

    if-lez v5, :cond_11

    const/16 v0, 0x13

    if-eq v6, v0, :cond_11

    iget-boolean v0, p0, Lcom/tencent/stat/common/j;->f:Z

    if-eqz v0, :cond_10

    move v0, v5

    add-int/lit8 v5, v5, 0x1

    const/16 v1, 0xd

    aput-byte v1, v4, v0

    :cond_10
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    const/16 v1, 0xa

    aput-byte v1, v4, v0

    :cond_11
    :goto_5
    sget-boolean v0, Lcom/tencent/stat/common/j;->g:Z

    if-nez v0, :cond_12

    iget v0, p0, Lcom/tencent/stat/common/j;->c:I

    if-eqz v0, :cond_12

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_12
    sget-boolean v0, Lcom/tencent/stat/common/j;->g:Z

    if-nez v0, :cond_15

    if-eq v7, p3, :cond_15

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_13
    add-int/lit8 v0, p3, -0x1

    if-ne v7, v0, :cond_14

    iget-object v0, p0, Lcom/tencent/stat/common/j;->j:[B

    iget v1, p0, Lcom/tencent/stat/common/j;->c:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/tencent/stat/common/j;->c:I

    aget-byte v2, p1, v7

    aput-byte v2, v0, v1

    goto :goto_6

    :cond_14
    add-int/lit8 v0, p3, -0x2

    if-ne v7, v0, :cond_15

    iget-object v0, p0, Lcom/tencent/stat/common/j;->j:[B

    iget v1, p0, Lcom/tencent/stat/common/j;->c:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/tencent/stat/common/j;->c:I

    aget-byte v2, p1, v7

    aput-byte v2, v0, v1

    iget-object v0, p0, Lcom/tencent/stat/common/j;->j:[B

    iget v1, p0, Lcom/tencent/stat/common/j;->c:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/tencent/stat/common/j;->c:I

    add-int/lit8 v2, v7, 0x1

    aget-byte v2, p1, v2

    aput-byte v2, v0, v1

    :cond_15
    :goto_6
    iput v5, p0, Lcom/tencent/stat/common/j;->b:I

    iput v6, p0, Lcom/tencent/stat/common/j;->k:I

    const/4 v0, 0x1

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
