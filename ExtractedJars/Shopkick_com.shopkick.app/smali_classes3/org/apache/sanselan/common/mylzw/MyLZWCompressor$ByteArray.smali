.class final Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;
.super Ljava/lang/Object;
.source "MyLZWCompressor.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "ByteArray"
.end annotation


# instance fields
.field private final bytes:[B

.field private final hash:I

.field private final length:I

.field private final start:I


# direct methods
.method public constructor <init>([B)V
    .locals 2

    .line 109
    array-length v0, p1

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;-><init>([BII)V

    return-void
.end method

.method public constructor <init>([BII)V
    .locals 4

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    iput-object p1, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;->bytes:[B

    .line 115
    iput p2, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;->start:I

    .line 116
    iput p3, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;->length:I

    const/4 v0, 0x0

    move v1, p3

    :goto_0
    if-ge v0, p3, :cond_0

    add-int v2, v0, p2

    .line 122
    aget-byte v2, p1, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v3, v1, 0x8

    add-int/2addr v1, v3

    xor-int/2addr v1, v2

    xor-int/2addr v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 126
    :cond_0
    iput v1, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;->hash:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 136
    check-cast p1, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;

    .line 137
    iget v0, p1, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;->hash:I

    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;->hash:I

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    .line 139
    :cond_0
    iget v0, p1, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;->length:I

    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;->length:I

    if-eq v0, v1, :cond_1

    return v2

    :cond_1
    move v0, v2

    .line 142
    :goto_0
    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;->length:I

    if-ge v0, v1, :cond_3

    .line 144
    iget-object v1, p1, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;->bytes:[B

    iget v3, p1, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;->start:I

    add-int/2addr v3, v0

    aget-byte v1, v1, v3

    iget-object v3, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;->bytes:[B

    iget v4, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;->start:I

    add-int/2addr v4, v0

    aget-byte v3, v3, v4

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 131
    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;->hash:I

    return v0
.end method
