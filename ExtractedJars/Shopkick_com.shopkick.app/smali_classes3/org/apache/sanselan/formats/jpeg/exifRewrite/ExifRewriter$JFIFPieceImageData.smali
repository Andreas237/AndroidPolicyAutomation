.class Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceImageData;
.super Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPiece;
.source "ExifRewriter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "JFIFPieceImageData"
.end annotation


# instance fields
.field public final imageData:[B

.field public final isImageData:Ljava/io/InputStream;

.field public final markerBytes:[B


# direct methods
.method public constructor <init>([BLjava/io/InputStream;)V
    .locals 1

    const/4 v0, 0x0

    .line 144
    invoke-direct {p0, v0}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPiece;-><init>(Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$1;)V

    .line 145
    iput-object p1, p0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceImageData;->markerBytes:[B

    .line 146
    iput-object v0, p0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceImageData;->imageData:[B

    .line 147
    iput-object p2, p0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceImageData;->isImageData:Ljava/io/InputStream;

    return-void
.end method

.method public constructor <init>([B[B)V
    .locals 1

    const/4 v0, 0x0

    .line 135
    invoke-direct {p0, v0}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPiece;-><init>(Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$1;)V

    .line 136
    iput-object p1, p0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceImageData;->markerBytes:[B

    .line 137
    iput-object p2, p0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceImageData;->imageData:[B

    .line 138
    iput-object v0, p0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceImageData;->isImageData:Ljava/io/InputStream;

    return-void
.end method


# virtual methods
.method protected write(Ljava/io/OutputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 152
    iget-object v0, p0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceImageData;->markerBytes:[B

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 153
    iget-object v0, p0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceImageData;->imageData:[B

    if-eqz v0, :cond_0

    .line 154
    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    goto :goto_1

    :cond_0
    const/16 v0, 0x400

    .line 157
    new-array v0, v0, [B

    .line 159
    :goto_0
    iget-object v1, p0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceImageData;->isImageData:Ljava/io/InputStream;

    invoke-virtual {v1, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    if-lez v1, :cond_1

    const/4 v2, 0x0

    .line 161
    invoke-virtual {p1, v0, v2, v1}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    .line 163
    :cond_1
    :try_start_0
    iget-object p1, p0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceImageData;->isImageData:Ljava/io/InputStream;

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_1
    return-void
.end method
