.class public Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;
.super Lorg/apache/sanselan/formats/jpeg/segments/APPNSegment;
.source "App2Segment.java"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final cur_marker:I

.field public final icc_bytes:[B

.field public final num_markers:I


# direct methods
.method public constructor <init>(IILjava/io/InputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 40
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/sanselan/formats/jpeg/segments/APPNSegment;-><init>(IILjava/io/InputStream;)V

    .line 42
    iget-object p1, p0, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->bytes:[B

    sget-object p3, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->icc_profile_label:[B

    invoke-virtual {p0, p1, p3}, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->startsWith([B[B)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 44
    new-instance p1, Ljava/io/ByteArrayInputStream;

    iget-object p3, p0, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->bytes:[B

    invoke-direct {p1, p3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 46
    sget-object p3, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->icc_profile_label:[B

    const-string v0, "Not a Valid App2 Segment: missing ICC Profile label"

    invoke-virtual {p0, p1, p3, v0}, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->readAndVerifyBytes(Ljava/io/InputStream;[BLjava/lang/String;)V

    const-string p3, "cur_marker"

    const-string v0, "Not a valid App2 Marker"

    .line 49
    invoke-virtual {p0, p3, p1, v0}, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->readByte(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)B

    move-result p3

    iput p3, p0, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->cur_marker:I

    const-string p3, "num_markers"

    const-string v0, "Not a valid App2 Marker"

    .line 50
    invoke-virtual {p0, p3, p1, v0}, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->readByte(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)B

    move-result p3

    iput p3, p0, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->num_markers:I

    .line 52
    sget-object p3, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->icc_profile_label:[B

    array-length p3, p3

    sub-int/2addr p2, p3

    add-int/lit8 p2, p2, -0x2

    const-string p3, "App2 Data"

    const-string v0, "Invalid App2 Segment: insufficient data"

    .line 55
    invoke-virtual {p0, p3, p2, p1, v0}, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->readByteArray(Ljava/lang/String;ILjava/io/InputStream;Ljava/lang/String;)[B

    move-result-object p1

    iput-object p1, p0, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->icc_bytes:[B

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    .line 61
    iput p1, p0, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->cur_marker:I

    .line 62
    iput p1, p0, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->num_markers:I

    const/4 p1, 0x0

    .line 63
    iput-object p1, p0, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->icc_bytes:[B

    :goto_0
    return-void
.end method

.method public constructor <init>(I[B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 34
    array-length v0, p2

    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, p2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {p0, p1, v0, v1}, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;-><init>(IILjava/io/InputStream;)V

    return-void
.end method


# virtual methods
.method public compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 69
    check-cast p1, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;

    .line 70
    iget v0, p0, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->cur_marker:I

    iget p1, p1, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;->cur_marker:I

    sub-int/2addr v0, p1

    return v0
.end method
