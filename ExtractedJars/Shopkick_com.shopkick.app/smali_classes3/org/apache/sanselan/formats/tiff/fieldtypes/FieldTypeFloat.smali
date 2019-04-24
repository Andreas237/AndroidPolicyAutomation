.class public Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeFloat;
.super Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;
.source "FieldTypeFloat.java"


# direct methods
.method public constructor <init>()V
    .locals 3

    const-string v0, "Float"

    const/16 v1, 0xb

    const/4 v2, 0x4

    .line 27
    invoke-direct {p0, v1, v2, v0}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;-><init>(IILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getSimpleValue(Lorg/apache/sanselan/formats/tiff/TiffField;)Ljava/lang/Object;
    .locals 8

    .line 34
    iget v0, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->length:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 35
    new-instance v0, Ljava/lang/Float;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeFloat;->name:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->tagInfo:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget-object v2, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->name:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->valueOffsetBytes:[B

    iget p1, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->byteOrder:I

    invoke-virtual {p0, v1, v2, p1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeFloat;->convertByteArrayToFloat(Ljava/lang/String;[BI)F

    move-result p1

    invoke-direct {v0, p1}, Ljava/lang/Float;-><init>(F)V

    return-object v0

    .line 39
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeFloat;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->tagInfo:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget-object v1, v1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 40
    invoke-virtual {p0, p1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeFloat;->getRawBytes(Lorg/apache/sanselan/formats/tiff/TiffField;)[B

    move-result-object v4

    const/4 v5, 0x0

    iget v6, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->length:I

    iget v7, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->byteOrder:I

    move-object v2, p0

    .line 39
    invoke-virtual/range {v2 .. v7}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeFloat;->convertByteArrayToFloatArray(Ljava/lang/String;[BIII)[F

    move-result-object p1

    return-object p1
.end method

.method public writeData(Ljava/lang/Object;I)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 45
    instance-of v0, p1, Ljava/lang/Float;

    if-eqz v0, :cond_0

    .line 46
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1, p2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeFloat;->convertFloatToByteArray(FI)[B

    move-result-object p1

    return-object p1

    .line 47
    :cond_0
    instance-of v0, p1, [F

    if-eqz v0, :cond_1

    .line 49
    check-cast p1, [F

    .line 50
    invoke-virtual {p0, p1, p2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeFloat;->convertFloatArrayToByteArray([FI)[B

    move-result-object p1

    return-object p1

    .line 52
    :cond_1
    instance-of v0, p1, [Ljava/lang/Float;

    if-eqz v0, :cond_3

    .line 54
    check-cast p1, [Ljava/lang/Float;

    .line 55
    array-length v0, p1

    new-array v0, v0, [F

    const/4 v1, 0x0

    .line 56
    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_2

    .line 57
    aget-object v2, p1, v1

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 58
    :cond_2
    invoke-virtual {p0, v0, p2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeFloat;->convertFloatArrayToByteArray([FI)[B

    move-result-object p1

    return-object p1

    .line 61
    :cond_3
    new-instance p2, Lorg/apache/sanselan/ImageWriteException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid data: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
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
