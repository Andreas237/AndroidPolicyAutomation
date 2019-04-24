.class abstract Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsUTF16;
.super Lorg/apache/sanselan/util/UnicodeUtils;
.source "UnicodeUtils.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/sanselan/util/UnicodeUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "UnicodeMetricsUTF16"
.end annotation


# static fields
.field protected static final BYTE_ORDER_BIG_ENDIAN:I = 0x0

.field protected static final BYTE_ORDER_LITTLE_ENDIAN:I = 0x1


# instance fields
.field protected byteOrder:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 327
    invoke-direct {p0, v0}, Lorg/apache/sanselan/util/UnicodeUtils;-><init>(Lorg/apache/sanselan/util/UnicodeUtils$1;)V

    const/4 v0, 0x0

    .line 324
    iput v0, p0, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsUTF16;->byteOrder:I

    .line 328
    iput p1, p0, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsUTF16;->byteOrder:I

    return-void
.end method


# virtual methods
.method public findEnd([BIZ)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;
        }
    .end annotation

    .line 397
    :goto_0
    array-length v0, p1

    if-ne p2, v0, :cond_0

    .line 398
    array-length p1, p1

    return p1

    .line 399
    :cond_0
    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    if-gt p2, v0, :cond_8

    add-int/lit8 v0, p2, 0x1

    .line 402
    aget-byte p2, p1, p2

    and-int/lit16 p2, p2, 0xff

    add-int/lit8 v1, v0, 0x1

    .line 403
    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    .line 404
    iget v2, p0, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsUTF16;->byteOrder:I

    if-nez v2, :cond_1

    move v2, p2

    goto :goto_1

    :cond_1
    move v2, v0

    :goto_1
    if-nez p2, :cond_3

    if-nez v0, :cond_3

    if-eqz p3, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v1, v1, -0x2

    :goto_2
    return v1

    :cond_3
    const/16 p2, 0xd8

    if-lt v2, p2, :cond_7

    .line 411
    array-length p2, p1

    add-int/lit8 p2, p2, -0x1

    if-gt v1, p2, :cond_6

    add-int/lit8 p2, v1, 0x1

    .line 415
    aget-byte v0, p1, v1

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v1, p2, 0x1

    .line 416
    aget-byte p2, p1, p2

    and-int/lit16 p2, p2, 0xff

    .line 417
    iget v2, p0, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsUTF16;->byteOrder:I

    if-nez v2, :cond_4

    move p2, v0

    :cond_4
    const/16 v0, 0xdc

    if-lt p2, v0, :cond_5

    move p2, v1

    goto :goto_0

    .line 419
    :cond_5
    new-instance p1, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;

    const-string p2, "Invalid code point."

    invoke-direct {p1, p2}, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 412
    :cond_6
    new-instance p1, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;

    const-string p2, "Terminator not found."

    invoke-direct {p1, p2}, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    move p2, v1

    goto :goto_0

    .line 400
    :cond_8
    new-instance p1, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;

    const-string p2, "Terminator not found."

    invoke-direct {p1, p2}, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public isValid([BIZZ)Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/util/UnicodeUtils$UnicodeException;
        }
    .end annotation

    .line 339
    :goto_0
    array-length v0, p1

    if-ne p2, v0, :cond_0

    xor-int/lit8 p1, p4, 0x1

    return p1

    .line 345
    :cond_0
    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    if-lt p2, v0, :cond_1

    return v1

    :cond_1
    add-int/lit8 v0, p2, 0x1

    .line 351
    aget-byte p2, p1, p2

    and-int/lit16 p2, p2, 0xff

    add-int/lit8 v2, v0, 0x1

    .line 352
    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    .line 353
    iget v3, p0, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsUTF16;->byteOrder:I

    if-nez v3, :cond_2

    move v3, p2

    goto :goto_1

    :cond_2
    move v3, v0

    :goto_1
    if-nez p2, :cond_3

    if-nez v0, :cond_3

    return p3

    :cond_3
    const/16 p2, 0xd8

    if-lt v3, p2, :cond_8

    const/16 p2, 0xdc

    if-lt v3, p2, :cond_4

    return v1

    .line 371
    :cond_4
    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    if-lt v2, v0, :cond_5

    return v1

    :cond_5
    add-int/lit8 v0, v2, 0x1

    .line 378
    aget-byte v2, p1, v2

    and-int/lit16 v2, v2, 0xff

    add-int/lit8 v3, v0, 0x1

    .line 379
    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    .line 380
    iget v4, p0, Lorg/apache/sanselan/util/UnicodeUtils$UnicodeMetricsUTF16;->byteOrder:I

    if-nez v4, :cond_6

    move v0, v2

    :cond_6
    if-ge v0, p2, :cond_7

    return v1

    :cond_7
    move p2, v3

    goto :goto_0

    :cond_8
    move p2, v2

    goto :goto_0
.end method
