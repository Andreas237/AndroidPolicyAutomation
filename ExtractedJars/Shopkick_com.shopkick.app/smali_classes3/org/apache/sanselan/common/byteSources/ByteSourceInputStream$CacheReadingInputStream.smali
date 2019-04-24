.class Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;
.super Ljava/io/InputStream;
.source "ByteSourceInputStream.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "CacheReadingInputStream"
.end annotation


# instance fields
.field private block:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

.field private blockIndex:I

.field private readFirst:Z

.field final synthetic this$0:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;


# direct methods
.method private constructor <init>(Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->this$0:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 p1, 0x0

    .line 95
    iput-object p1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->block:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    const/4 p1, 0x0

    .line 96
    iput-boolean p1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->readFirst:Z

    .line 97
    iput p1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->blockIndex:I

    return-void
.end method

.method synthetic constructor <init>(Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$1;)V
    .locals 0

    .line 93
    invoke-direct {p0, p1}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;-><init>(Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;)V

    return-void
.end method


# virtual methods
.method public read()I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 101
    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->block:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    const/4 v1, -0x1

    if-nez v0, :cond_1

    .line 103
    iget-boolean v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->readFirst:Z

    if-eqz v0, :cond_0

    return v1

    .line 105
    :cond_0
    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->this$0:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;

    invoke-static {v0}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->access$100(Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;)Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->block:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    const/4 v0, 0x1

    .line 106
    iput-boolean v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->readFirst:Z

    .line 109
    :cond_1
    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->block:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    if-eqz v0, :cond_2

    iget v2, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->blockIndex:I

    iget-object v0, v0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;->bytes:[B

    array-length v0, v0

    if-lt v2, v0, :cond_2

    .line 111
    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->block:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    invoke-virtual {v0}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;->getNext()Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->block:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    const/4 v0, 0x0

    .line 112
    iput v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->blockIndex:I

    .line 115
    :cond_2
    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->block:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    if-nez v0, :cond_3

    return v1

    .line 118
    :cond_3
    iget v2, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->blockIndex:I

    iget-object v0, v0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;->bytes:[B

    array-length v0, v0

    if-lt v2, v0, :cond_4

    return v1

    .line 121
    :cond_4
    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->block:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    iget-object v0, v0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;->bytes:[B

    iget v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->blockIndex:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->blockIndex:I

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public read([BII)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-eqz p1, :cond_7

    if-ltz p2, :cond_6

    .line 129
    array-length v0, p1

    if-gt p2, v0, :cond_6

    if-ltz p3, :cond_6

    add-int v0, p2, p3

    array-length v1, p1

    if-gt v0, v1, :cond_6

    if-ltz v0, :cond_6

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return v0

    .line 137
    :cond_0
    iget-object v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->block:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    const/4 v2, -0x1

    if-nez v1, :cond_2

    .line 139
    iget-boolean v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->readFirst:Z

    if-eqz v1, :cond_1

    return v2

    .line 141
    :cond_1
    iget-object v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->this$0:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;

    invoke-static {v1}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->access$100(Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;)Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    move-result-object v1

    iput-object v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->block:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    const/4 v1, 0x1

    .line 142
    iput-boolean v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->readFirst:Z

    .line 145
    :cond_2
    iget-object v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->block:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    if-eqz v1, :cond_3

    iget v3, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->blockIndex:I

    iget-object v1, v1, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;->bytes:[B

    array-length v1, v1

    if-lt v3, v1, :cond_3

    .line 147
    iget-object v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->block:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    invoke-virtual {v1}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;->getNext()Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    move-result-object v1

    iput-object v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->block:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    .line 148
    iput v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->blockIndex:I

    .line 151
    :cond_3
    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->block:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    if-nez v0, :cond_4

    return v2

    .line 154
    :cond_4
    iget v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->blockIndex:I

    iget-object v0, v0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;->bytes:[B

    array-length v0, v0

    if-lt v1, v0, :cond_5

    return v2

    .line 157
    :cond_5
    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->block:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    iget-object v0, v0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;->bytes:[B

    array-length v0, v0

    iget v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->blockIndex:I

    sub-int/2addr v0, v1

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 158
    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->block:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    iget-object v0, v0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;->bytes:[B

    iget v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->blockIndex:I

    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 159
    iget p1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->blockIndex:I

    add-int/2addr p1, p3

    iput p1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->blockIndex:I

    return p3

    .line 131
    :cond_6
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    .line 128
    :cond_7
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    throw p1
.end method
