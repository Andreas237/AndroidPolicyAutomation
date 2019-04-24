.class public abstract Lorg/apache/sanselan/common/byteSources/ByteSource;
.super Lorg/apache/sanselan/common/BinaryFileFunctions;
.source "ByteSource.java"


# instance fields
.field protected final filename:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Lorg/apache/sanselan/common/BinaryFileFunctions;-><init>()V

    .line 30
    iput-object p1, p0, Lorg/apache/sanselan/common/byteSources/ByteSource;->filename:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public abstract getAll()[B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract getBlock(II)[B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract getDescription()Ljava/lang/String;
.end method

.method public final getFilename()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSource;->filename:Ljava/lang/String;

    return-object v0
.end method

.method public abstract getInputStream()Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public final getInputStream(I)Ljava/io/InputStream;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 35
    invoke-virtual {p0}, Lorg/apache/sanselan/common/byteSources/ByteSource;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    .line 37
    invoke-virtual {p0, v0, p1}, Lorg/apache/sanselan/common/byteSources/ByteSource;->skipBytes(Ljava/io/InputStream;I)V

    return-object v0
.end method

.method public abstract getLength()J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method
