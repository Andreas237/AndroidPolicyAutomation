.class public Lorg/apache/sanselan/formats/jpeg/segments/SOFNSegment;
.super Lorg/apache/sanselan/formats/jpeg/segments/Segment;
.source "SOFNSegment.java"


# instance fields
.field public final height:I

.field public final numberOfComponents:I

.field public final precision:I

.field public final width:I


# direct methods
.method public constructor <init>(IILjava/io/InputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 41
    invoke-direct {p0, p1, p2}, Lorg/apache/sanselan/formats/jpeg/segments/Segment;-><init>(II)V

    .line 43
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/jpeg/segments/SOFNSegment;->getDebug()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 44
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SOF0Segment marker_length: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_0
    const-string p1, "Data_precision"

    const-string v0, "Not a Valid JPEG File"

    .line 47
    invoke-virtual {p0, p1, p3, v0}, Lorg/apache/sanselan/formats/jpeg/segments/SOFNSegment;->readByte(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)B

    move-result p1

    iput p1, p0, Lorg/apache/sanselan/formats/jpeg/segments/SOFNSegment;->precision:I

    const-string p1, "Image_height"

    const-string v0, "Not a Valid JPEG File"

    .line 48
    invoke-virtual {p0, p1, p3, v0}, Lorg/apache/sanselan/formats/jpeg/segments/SOFNSegment;->read2Bytes(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lorg/apache/sanselan/formats/jpeg/segments/SOFNSegment;->height:I

    const-string p1, "Image_Width"

    const-string v0, "Not a Valid JPEG File"

    .line 49
    invoke-virtual {p0, p1, p3, v0}, Lorg/apache/sanselan/formats/jpeg/segments/SOFNSegment;->read2Bytes(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lorg/apache/sanselan/formats/jpeg/segments/SOFNSegment;->width:I

    const-string p1, "Number_of_components"

    const-string v0, "Not a Valid JPEG File"

    .line 50
    invoke-virtual {p0, p1, p3, v0}, Lorg/apache/sanselan/formats/jpeg/segments/SOFNSegment;->readByte(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)B

    move-result p1

    iput p1, p0, Lorg/apache/sanselan/formats/jpeg/segments/SOFNSegment;->numberOfComponents:I

    add-int/lit8 p2, p2, -0x6

    const-string p1, "Not a Valid JPEG File: SOF0 Segment"

    .line 54
    invoke-virtual {p0, p3, p2, p1}, Lorg/apache/sanselan/formats/jpeg/segments/SOFNSegment;->skipBytes(Ljava/io/InputStream;ILjava/lang/String;)V

    .line 65
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/jpeg/segments/SOFNSegment;->getDebug()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 66
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string p2, ""

    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_1
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

    .line 35
    array-length v0, p2

    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, p2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {p0, p1, v0, v1}, Lorg/apache/sanselan/formats/jpeg/segments/SOFNSegment;-><init>(IILjava/io/InputStream;)V

    return-void
.end method


# virtual methods
.method public getDescription()Ljava/lang/String;
    .locals 3

    .line 71
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SOFN (SOF"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/apache/sanselan/formats/jpeg/segments/SOFNSegment;->marker:I

    const v2, 0xffc0

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/jpeg/segments/SOFNSegment;->getSegmentType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
