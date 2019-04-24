.class public Lcom/tencent/stat/common/e;
.super Ljava/lang/Object;


# static fields
.field static final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "03a976511e2cbe3a7f26808fb7af3c05"

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    sput-object v0, Lcom/tencent/stat/common/e;->a:[B

    return-void
.end method

.method public static a([B)[B
    .locals 1

    sget-object v0, Lcom/tencent/stat/common/e;->a:[B

    invoke-static {p0, v0}, Lcom/tencent/stat/common/e;->a([B[B)[B

    move-result-object v0

    return-object v0
.end method

.method static a([B[B)[B
    .locals 12

    const/16 v0, 0x100

    new-array v2, v0, [I

    const/16 v0, 0x100

    new-array v3, v0, [I

    array-length v4, p1

    const/4 v0, 0x1

    if-lt v4, v0, :cond_0

    const/16 v0, 0x100

    if-le v4, v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "key must be between 1 and 256 bytes"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 v5, 0x0

    :goto_0
    const/16 v0, 0x100

    if-ge v5, v0, :cond_2

    aput v5, v2, v5

    rem-int v0, v5, v4

    aget-byte v0, p1, v0

    aput v0, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_1
    const/16 v0, 0x100

    if-ge v6, v0, :cond_3

    aget v0, v2, v6

    add-int/2addr v0, v5

    aget v1, v3, v6

    add-int/2addr v0, v1

    and-int/lit16 v5, v0, 0xff

    aget v7, v2, v6

    aget v0, v2, v5

    aput v0, v2, v6

    aput v7, v2, v5

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_3
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    array-length v0, p0

    new-array v9, v0, [B

    const/4 v10, 0x0

    :goto_2
    array-length v0, p0

    if-ge v10, v0, :cond_4

    add-int/lit8 v0, v5, 0x1

    and-int/lit16 v5, v0, 0xff

    aget v0, v2, v5

    add-int/2addr v0, v6

    and-int/lit16 v6, v0, 0xff

    aget v11, v2, v5

    aget v0, v2, v6

    aput v0, v2, v5

    aput v11, v2, v6

    aget v0, v2, v5

    aget v1, v2, v6

    add-int/2addr v0, v1

    and-int/lit16 v8, v0, 0xff

    aget v7, v2, v8

    aget-byte v0, p0, v10

    xor-int/2addr v0, v7

    int-to-byte v0, v0

    aput-byte v0, v9, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_4
    return-object v9
.end method

.method public static b([B)[B
    .locals 1

    sget-object v0, Lcom/tencent/stat/common/e;->a:[B

    invoke-static {p0, v0}, Lcom/tencent/stat/common/e;->b([B[B)[B

    move-result-object v0

    return-object v0
.end method

.method static b([B[B)[B
    .locals 1

    invoke-static {p0, p1}, Lcom/tencent/stat/common/e;->a([B[B)[B

    move-result-object v0

    return-object v0
.end method
