.class public Lorg/apache/sanselan/common/mylzw/BitsToByteInputStream;
.super Ljava/io/InputStream;
.source "BitsToByteInputStream.java"


# instance fields
.field private final desiredDepth:I

.field private final is:Lorg/apache/sanselan/common/mylzw/MyBitInputStream;


# direct methods
.method public constructor <init>(Lorg/apache/sanselan/common/mylzw/MyBitInputStream;I)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 29
    iput-object p1, p0, Lorg/apache/sanselan/common/mylzw/BitsToByteInputStream;->is:Lorg/apache/sanselan/common/mylzw/MyBitInputStream;

    .line 30
    iput p2, p0, Lorg/apache/sanselan/common/mylzw/BitsToByteInputStream;->desiredDepth:I

    return-void
.end method


# virtual methods
.method public read()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x8

    .line 35
    invoke-virtual {p0, v0}, Lorg/apache/sanselan/common/mylzw/BitsToByteInputStream;->readBits(I)I

    move-result v0

    return v0
.end method

.method public readBits(I)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 40
    iget-object v0, p0, Lorg/apache/sanselan/common/mylzw/BitsToByteInputStream;->is:Lorg/apache/sanselan/common/mylzw/MyBitInputStream;

    invoke-virtual {v0, p1}, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->readBits(I)I

    move-result v0

    .line 41
    iget v1, p0, Lorg/apache/sanselan/common/mylzw/BitsToByteInputStream;->desiredDepth:I

    if-ge p1, v1, :cond_0

    sub-int/2addr v1, p1

    shl-int/2addr v0, v1

    goto :goto_0

    :cond_0
    if-le p1, v1, :cond_1

    sub-int/2addr p1, v1

    shr-int/2addr v0, p1

    :cond_1
    :goto_0
    return v0
.end method

.method public readBitsArray(II)[I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 51
    new-array v0, p2, [I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    .line 54
    invoke-virtual {p0, p1}, Lorg/apache/sanselan/common/mylzw/BitsToByteInputStream;->readBits(I)I

    move-result v2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method
