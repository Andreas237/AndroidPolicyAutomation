.class public Lorg/apache/sanselan/common/BitInputStream;
.super Ljava/io/InputStream;
.source "BitInputStream.java"

# interfaces
.implements Lorg/apache/sanselan/common/BinaryConstants;


# instance fields
.field private bytes_read:J

.field private cache:I

.field private cacheBitsRemaining:I

.field private final is:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 2

    .line 29
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x0

    .line 42
    iput v0, p0, Lorg/apache/sanselan/common/BitInputStream;->cacheBitsRemaining:I

    const-wide/16 v0, 0x0

    .line 43
    iput-wide v0, p0, Lorg/apache/sanselan/common/BitInputStream;->bytes_read:J

    .line 30
    iput-object p1, p0, Lorg/apache/sanselan/common/BitInputStream;->is:Ljava/io/InputStream;

    return-void
.end method


# virtual methods
.method public flushCache()V
    .locals 1

    const/4 v0, 0x0

    .line 116
    iput v0, p0, Lorg/apache/sanselan/common/BitInputStream;->cacheBitsRemaining:I

    return-void
.end method

.method public getBytesRead()J
    .locals 2

    .line 121
    iget-wide v0, p0, Lorg/apache/sanselan/common/BitInputStream;->bytes_read:J

    return-wide v0
.end method

.method public read()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 36
    iget v0, p0, Lorg/apache/sanselan/common/BitInputStream;->cacheBitsRemaining:I

    if-gtz v0, :cond_0

    .line 38
    iget-object v0, p0, Lorg/apache/sanselan/common/BitInputStream;->is:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    return v0

    .line 37
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "BitInputStream: incomplete bit read"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final readBits(I)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-wide/16 v0, 0x1

    const/16 v2, 0x8

    if-ge p1, v2, :cond_2

    .line 49
    iget v3, p0, Lorg/apache/sanselan/common/BitInputStream;->cacheBitsRemaining:I

    if-nez v3, :cond_0

    .line 52
    iget-object v3, p0, Lorg/apache/sanselan/common/BitInputStream;->is:Ljava/io/InputStream;

    invoke-virtual {v3}, Ljava/io/InputStream;->read()I

    move-result v3

    iput v3, p0, Lorg/apache/sanselan/common/BitInputStream;->cache:I

    .line 53
    iput v2, p0, Lorg/apache/sanselan/common/BitInputStream;->cacheBitsRemaining:I

    .line 54
    iget-wide v3, p0, Lorg/apache/sanselan/common/BitInputStream;->bytes_read:J

    add-long/2addr v3, v0

    iput-wide v3, p0, Lorg/apache/sanselan/common/BitInputStream;->bytes_read:J

    .line 56
    :cond_0
    iget v3, p0, Lorg/apache/sanselan/common/BitInputStream;->cacheBitsRemaining:I

    if-gt p1, v3, :cond_1

    sub-int/2addr v3, p1

    .line 61
    iput v3, p0, Lorg/apache/sanselan/common/BitInputStream;->cacheBitsRemaining:I

    .line 62
    iget v3, p0, Lorg/apache/sanselan/common/BitInputStream;->cache:I

    iget v4, p0, Lorg/apache/sanselan/common/BitInputStream;->cacheBitsRemaining:I

    shr-int/2addr v3, v4

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    and-int/lit8 p1, v3, 0x7f

    return p1

    :pswitch_1
    and-int/lit8 p1, v3, 0x3f

    return p1

    :pswitch_2
    and-int/lit8 p1, v3, 0x1f

    return p1

    :pswitch_3
    and-int/lit8 p1, v3, 0xf

    return p1

    :pswitch_4
    and-int/lit8 p1, v3, 0x7

    return p1

    :pswitch_5
    and-int/lit8 p1, v3, 0x3

    return p1

    :pswitch_6
    and-int/lit8 p1, v3, 0x1

    return p1

    .line 57
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "BitInputStream: can\'t read bit fields across bytes"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 83
    :cond_2
    :goto_0
    iget v3, p0, Lorg/apache/sanselan/common/BitInputStream;->cacheBitsRemaining:I

    if-gtz v3, :cond_7

    if-ne p1, v2, :cond_3

    .line 88
    iget-wide v2, p0, Lorg/apache/sanselan/common/BitInputStream;->bytes_read:J

    add-long/2addr v2, v0

    iput-wide v2, p0, Lorg/apache/sanselan/common/BitInputStream;->bytes_read:J

    .line 89
    iget-object p1, p0, Lorg/apache/sanselan/common/BitInputStream;->is:Ljava/io/InputStream;

    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result p1

    return p1

    :cond_3
    const/16 v0, 0x10

    if-ne p1, v0, :cond_4

    .line 94
    iget-wide v0, p0, Lorg/apache/sanselan/common/BitInputStream;->bytes_read:J

    const-wide/16 v3, 0x2

    add-long/2addr v0, v3

    iput-wide v0, p0, Lorg/apache/sanselan/common/BitInputStream;->bytes_read:J

    .line 95
    iget-object p1, p0, Lorg/apache/sanselan/common/BitInputStream;->is:Ljava/io/InputStream;

    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result p1

    shl-int/2addr p1, v2

    iget-object v0, p0, Lorg/apache/sanselan/common/BitInputStream;->is:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    shl-int/lit8 v0, v0, 0x0

    or-int/2addr p1, v0

    return p1

    :cond_4
    const/16 v1, 0x18

    if-ne p1, v1, :cond_5

    .line 100
    iget-wide v3, p0, Lorg/apache/sanselan/common/BitInputStream;->bytes_read:J

    const-wide/16 v5, 0x3

    add-long/2addr v3, v5

    iput-wide v3, p0, Lorg/apache/sanselan/common/BitInputStream;->bytes_read:J

    .line 101
    iget-object p1, p0, Lorg/apache/sanselan/common/BitInputStream;->is:Ljava/io/InputStream;

    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result p1

    shl-int/2addr p1, v0

    iget-object v0, p0, Lorg/apache/sanselan/common/BitInputStream;->is:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    shl-int/2addr v0, v2

    or-int/2addr p1, v0

    iget-object v0, p0, Lorg/apache/sanselan/common/BitInputStream;->is:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    shl-int/lit8 v0, v0, 0x0

    or-int/2addr p1, v0

    return p1

    :cond_5
    const/16 v3, 0x20

    if-ne p1, v3, :cond_6

    .line 106
    iget-wide v3, p0, Lorg/apache/sanselan/common/BitInputStream;->bytes_read:J

    const-wide/16 v5, 0x4

    add-long/2addr v3, v5

    iput-wide v3, p0, Lorg/apache/sanselan/common/BitInputStream;->bytes_read:J

    .line 107
    iget-object p1, p0, Lorg/apache/sanselan/common/BitInputStream;->is:Ljava/io/InputStream;

    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result p1

    shl-int/2addr p1, v1

    iget-object v1, p0, Lorg/apache/sanselan/common/BitInputStream;->is:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->read()I

    move-result v1

    shl-int/lit8 v0, v1, 0x10

    or-int/2addr p1, v0

    iget-object v0, p0, Lorg/apache/sanselan/common/BitInputStream;->is:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    shl-int/2addr v0, v2

    or-int/2addr p1, v0

    iget-object v0, p0, Lorg/apache/sanselan/common/BitInputStream;->is:Ljava/io/InputStream;

    .line 108
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    shl-int/lit8 v0, v0, 0x0

    or-int/2addr p1, v0

    return p1

    .line 111
    :cond_6
    new-instance p1, Ljava/io/IOException;

    const-string v0, "BitInputStream: unknown error"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 84
    :cond_7
    new-instance p1, Ljava/io/IOException;

    const-string v0, "BitInputStream: incomplete bit read"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
