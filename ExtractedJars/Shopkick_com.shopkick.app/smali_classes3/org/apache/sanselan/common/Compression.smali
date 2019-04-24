.class public Lorg/apache/sanselan/common/Compression;
.super Ljava/lang/Object;
.source "Compression.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compressLZW([BIIZ)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 53
    new-instance v0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;

    invoke-direct {v0, p2, p3, p4}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;-><init>(IIZ)V

    .line 56
    invoke-virtual {v0, p1}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->compress([B)[B

    move-result-object p1

    return-object p1
.end method

.method public decompressLZW([BIII)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 33
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 35
    new-instance p1, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;

    invoke-direct {p1, p2, p4}, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;-><init>(II)V

    .line 37
    invoke-virtual {p1, v0, p3}, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->decompress(Ljava/io/InputStream;I)[B

    move-result-object p1

    return-object p1
.end method

.method public decompressPackBits([BII)[B
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 45
    new-instance p3, Lorg/apache/sanselan/common/PackBits;

    invoke-direct {p3}, Lorg/apache/sanselan/common/PackBits;-><init>()V

    invoke-virtual {p3, p1, p2}, Lorg/apache/sanselan/common/PackBits;->decompress([BI)[B

    move-result-object p1

    return-object p1
.end method
