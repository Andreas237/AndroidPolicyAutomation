.class public Lorg/apache/sanselan/formats/tiff/JpegImageData;
.super Lorg/apache/sanselan/formats/tiff/TiffElement$DataElement;
.source "JpegImageData.java"


# direct methods
.method public constructor <init>(II[B)V
    .locals 0

    .line 24
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/sanselan/formats/tiff/TiffElement$DataElement;-><init>(II[B)V

    return-void
.end method


# virtual methods
.method public getElementDescription(Z)Ljava/lang/String;
    .locals 1

    .line 29
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Jpeg image data: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/JpegImageData;->data:[B

    array-length v0, v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " bytes"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
