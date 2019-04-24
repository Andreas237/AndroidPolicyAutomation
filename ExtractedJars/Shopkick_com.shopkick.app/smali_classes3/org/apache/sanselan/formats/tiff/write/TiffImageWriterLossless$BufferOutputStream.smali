.class Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;
.super Ljava/io/OutputStream;
.source "TiffImageWriterLossless.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "BufferOutputStream"
.end annotation


# instance fields
.field private final buffer:[B

.field private index:I


# direct methods
.method public constructor <init>([BI)V
    .locals 0

    .line 379
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 380
    iput-object p1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;->buffer:[B

    .line 381
    iput p2, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;->index:I

    return-void
.end method


# virtual methods
.method public write(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 386
    iget v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;->index:I

    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;->buffer:[B

    array-length v2, v1

    if-ge v0, v2, :cond_0

    add-int/lit8 v2, v0, 0x1

    .line 389
    iput v2, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;->index:I

    int-to-byte p1, p1

    aput-byte p1, v1, v0

    return-void

    .line 387
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Buffer overflow."

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public write([BII)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 394
    iget v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;->index:I

    add-int v1, v0, p3

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;->buffer:[B

    array-length v3, v2

    if-gt v1, v3, :cond_0

    .line 396
    invoke-static {p1, p2, v2, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 397
    iget p1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;->index:I

    add-int/2addr p1, p3

    iput p1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;->index:I

    return-void

    .line 395
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Buffer overflow."

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
