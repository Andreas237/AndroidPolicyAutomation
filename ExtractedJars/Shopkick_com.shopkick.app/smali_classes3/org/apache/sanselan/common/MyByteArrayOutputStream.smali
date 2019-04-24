.class public Lorg/apache/sanselan/common/MyByteArrayOutputStream;
.super Ljava/io/OutputStream;
.source "MyByteArrayOutputStream.java"


# instance fields
.field private final bytes:[B

.field private count:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const/4 v0, 0x0

    .line 32
    iput v0, p0, Lorg/apache/sanselan/common/MyByteArrayOutputStream;->count:I

    .line 29
    new-array p1, p1, [B

    iput-object p1, p0, Lorg/apache/sanselan/common/MyByteArrayOutputStream;->bytes:[B

    return-void
.end method


# virtual methods
.method public getBytesWritten()I
    .locals 1

    .line 57
    iget v0, p0, Lorg/apache/sanselan/common/MyByteArrayOutputStream;->count:I

    return v0
.end method

.method public toByteArray()[B
    .locals 4

    .line 46
    iget v0, p0, Lorg/apache/sanselan/common/MyByteArrayOutputStream;->count:I

    iget-object v1, p0, Lorg/apache/sanselan/common/MyByteArrayOutputStream;->bytes:[B

    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 48
    new-array v2, v0, [B

    const/4 v3, 0x0

    .line 49
    invoke-static {v1, v3, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2

    :cond_0
    return-object v1
.end method

.method public write(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 36
    iget v0, p0, Lorg/apache/sanselan/common/MyByteArrayOutputStream;->count:I

    iget-object v1, p0, Lorg/apache/sanselan/common/MyByteArrayOutputStream;->bytes:[B

    array-length v2, v1

    if-ge v0, v2, :cond_0

    int-to-byte p1, p1

    .line 40
    aput-byte p1, v1, v0

    add-int/lit8 v0, v0, 0x1

    .line 41
    iput v0, p0, Lorg/apache/sanselan/common/MyByteArrayOutputStream;->count:I

    return-void

    .line 37
    :cond_0
    new-instance p1, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Write exceeded expected length ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/apache/sanselan/common/MyByteArrayOutputStream;->count:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/apache/sanselan/common/MyByteArrayOutputStream;->bytes:[B

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
