.class public Lorg/apache/sanselan/common/byteSources/ByteSourceArray;
.super Lorg/apache/sanselan/common/byteSources/ByteSource;
.source "ByteSourceArray.java"


# instance fields
.field private final bytes:[B


# direct methods
.method public constructor <init>(Ljava/lang/String;[B)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Lorg/apache/sanselan/common/byteSources/ByteSource;-><init>(Ljava/lang/String;)V

    .line 30
    iput-object p2, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;->bytes:[B

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    const/4 v0, 0x0

    .line 35
    invoke-direct {p0, v0}, Lorg/apache/sanselan/common/byteSources/ByteSource;-><init>(Ljava/lang/String;)V

    .line 36
    iput-object p1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;->bytes:[B

    return-void
.end method


# virtual methods
.method public getAll()[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 63
    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;->bytes:[B

    return-object v0
.end method

.method public getBlock(II)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    add-int v0, p1, p2

    .line 46
    iget-object v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;->bytes:[B

    array-length v2, v1

    if-gt v0, v2, :cond_0

    .line 51
    new-array v0, p2, [B

    const/4 v2, 0x0

    .line 52
    invoke-static {v1, p1, v0, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0

    .line 47
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not read block (block start: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", block length: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", data length: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;->bytes:[B

    array-length p1, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 2

    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;->bytes:[B

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " byte array"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getInputStream()Ljava/io/InputStream;
    .locals 2

    .line 41
    new-instance v0, Ljava/io/ByteArrayInputStream;

    iget-object v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;->bytes:[B

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    return-object v0
.end method

.method public getLength()J
    .locals 2

    .line 58
    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;->bytes:[B

    array-length v0, v0

    int-to-long v0, v0

    return-wide v0
.end method
