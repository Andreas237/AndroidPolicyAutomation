.class public Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeUnknown;
.super Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;
.source "FieldTypeUnknown.java"


# direct methods
.method public constructor <init>()V
    .locals 3

    const-string v0, "Unknown"

    const/4 v1, -0x1

    const/4 v2, 0x1

    .line 27
    invoke-direct {p0, v1, v2, v0}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;-><init>(IILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getSimpleValue(Lorg/apache/sanselan/formats/tiff/TiffField;)Ljava/lang/Object;
    .locals 2

    .line 39
    iget v0, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->length:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 40
    new-instance v0, Ljava/lang/Byte;

    iget-object p1, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->valueOffsetBytes:[B

    const/4 v1, 0x0

    aget-byte p1, p1, v1

    invoke-direct {v0, p1}, Ljava/lang/Byte;-><init>(B)V

    return-object v0

    .line 42
    :cond_0
    invoke-virtual {p0, p1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeUnknown;->getRawBytes(Lorg/apache/sanselan/formats/tiff/TiffField;)[B

    move-result-object p1

    return-object p1
.end method

.method public writeData(Ljava/lang/Object;I)[B
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 47
    instance-of p2, p1, Ljava/lang/Byte;

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    .line 48
    new-array p2, p2, [B

    const/4 v0, 0x0

    check-cast p1, Ljava/lang/Byte;

    .line 49
    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    move-result p1

    aput-byte p1, p2, v0

    return-object p2

    .line 51
    :cond_0
    instance-of p2, p1, [B

    if-eqz p2, :cond_1

    .line 52
    check-cast p1, [B

    return-object p1

    .line 54
    :cond_1
    new-instance p2, Lorg/apache/sanselan/ImageWriteException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid data: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    invoke-static {p1}, Lorg/apache/sanselan/util/Debug;->getType(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
