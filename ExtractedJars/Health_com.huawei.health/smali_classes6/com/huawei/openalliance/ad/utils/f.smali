.class public abstract Lcom/huawei/openalliance/ad/utils/f;
.super Ljava/lang/Object;


# static fields
.field private static final a:[C

.field private static b:[B


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/="

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/utils/f;->a:[C

    const/16 v0, 0x100

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/openalliance/ad/utils/f;->b:[B

    const/4 v3, 0x0

    :goto_0
    const/16 v0, 0x100

    if-ge v3, v0, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/utils/f;->b:[B

    const/4 v1, -0x1

    aput-byte v1, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const/16 v3, 0x41

    :goto_1
    const/16 v0, 0x5a

    if-gt v3, v0, :cond_1

    sget-object v0, Lcom/huawei/openalliance/ad/utils/f;->b:[B

    add-int/lit8 v1, v3, -0x41

    int-to-byte v1, v1

    aput-byte v1, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    const/16 v3, 0x61

    :goto_2
    const/16 v0, 0x7a

    if-gt v3, v0, :cond_2

    sget-object v0, Lcom/huawei/openalliance/ad/utils/f;->b:[B

    add-int/lit8 v1, v3, 0x1a

    add-int/lit8 v1, v1, -0x61

    int-to-byte v1, v1

    aput-byte v1, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_2
    const/16 v3, 0x30

    :goto_3
    const/16 v0, 0x39

    if-gt v3, v0, :cond_3

    sget-object v0, Lcom/huawei/openalliance/ad/utils/f;->b:[B

    add-int/lit8 v1, v3, 0x34

    add-int/lit8 v1, v1, -0x30

    int-to-byte v1, v1

    aput-byte v1, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_3
    sget-object v0, Lcom/huawei/openalliance/ad/utils/f;->b:[B

    const/16 v1, 0x3e

    const/16 v2, 0x2b

    aput-byte v1, v0, v2

    sget-object v0, Lcom/huawei/openalliance/ad/utils/f;->b:[B

    const/16 v1, 0x3f

    const/16 v2, 0x2f

    aput-byte v1, v0, v2

    return-void
.end method

.method public static a([B)Ljava/lang/String;
    .locals 1

    array-length v0, p0

    invoke-static {p0, v0}, Lcom/huawei/openalliance/ad/utils/f;->a([BI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a([BI)Ljava/lang/String;
    .locals 9

    add-int/lit8 v0, p1, 0x2

    div-int/lit8 v0, v0, 0x3

    mul-int/lit8 v0, v0, 0x4

    new-array v3, v0, [C

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v4, p1, :cond_4

    const/4 v6, 0x0

    const/4 v7, 0x0

    aget-byte v0, p0, v4

    and-int/lit16 v8, v0, 0xff

    shl-int/lit8 v8, v8, 0x8

    add-int/lit8 v0, v4, 0x1

    if-ge v0, p1, :cond_0

    add-int/lit8 v0, v4, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v8, v0

    const/4 v7, 0x1

    :cond_0
    shl-int/lit8 v8, v8, 0x8

    add-int/lit8 v0, v4, 0x2

    if-ge v0, p1, :cond_1

    add-int/lit8 v0, v4, 0x2

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v8, v0

    const/4 v6, 0x1

    :cond_1
    add-int/lit8 v0, v5, 0x3

    sget-object v1, Lcom/huawei/openalliance/ad/utils/f;->a:[C

    if-eqz v6, :cond_2

    and-int/lit8 v2, v8, 0x3f

    goto :goto_1

    :cond_2
    const/16 v2, 0x40

    :goto_1
    aget-char v1, v1, v2

    aput-char v1, v3, v0

    shr-int/lit8 v8, v8, 0x6

    add-int/lit8 v0, v5, 0x2

    sget-object v1, Lcom/huawei/openalliance/ad/utils/f;->a:[C

    if-eqz v7, :cond_3

    and-int/lit8 v2, v8, 0x3f

    goto :goto_2

    :cond_3
    const/16 v2, 0x40

    :goto_2
    aget-char v1, v1, v2

    aput-char v1, v3, v0

    shr-int/lit8 v8, v8, 0x6

    add-int/lit8 v0, v5, 0x1

    sget-object v1, Lcom/huawei/openalliance/ad/utils/f;->a:[C

    and-int/lit8 v2, v8, 0x3f

    aget-char v1, v1, v2

    aput-char v1, v3, v0

    shr-int/lit8 v8, v8, 0x6

    add-int/lit8 v0, v5, 0x0

    sget-object v1, Lcom/huawei/openalliance/ad/utils/f;->a:[C

    and-int/lit8 v2, v8, 0x3f

    aget-char v1, v1, v2

    aput-char v1, v3, v0

    add-int/lit8 v4, v4, 0x3

    add-int/lit8 v5, v5, 0x4

    goto/16 :goto_0

    :cond_4
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method
