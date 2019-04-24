.class public Lorg/apache/sanselan/common/ZLibUtils;
.super Lorg/apache/sanselan/common/BinaryFileFunctions;
.source "ZLibUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Lorg/apache/sanselan/common/BinaryFileFunctions;-><init>()V

    return-void
.end method


# virtual methods
.method public final deflate([B)[B
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 37
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 38
    new-instance v1, Ljava/util/zip/DeflaterOutputStream;

    invoke-direct {v1, v0}, Ljava/util/zip/DeflaterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 39
    invoke-virtual {v1, p1}, Ljava/util/zip/DeflaterOutputStream;->write([B)V

    .line 40
    invoke-virtual {v1}, Ljava/util/zip/DeflaterOutputStream;->close()V

    .line 41
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    return-object p1
.end method

.method public final inflate([B)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 30
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 31
    new-instance p1, Ljava/util/zip/InflaterInputStream;

    invoke-direct {p1, v0}, Ljava/util/zip/InflaterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 32
    invoke-virtual {p0, p1}, Lorg/apache/sanselan/common/ZLibUtils;->getStreamBytes(Ljava/io/InputStream;)[B

    move-result-object p1

    return-object p1
.end method
