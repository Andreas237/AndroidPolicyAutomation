.class public Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;
.super Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;
.source "FieldTypeLong.java"


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x4

    .line 27
    invoke-direct {p0, p1, v0, p2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;-><init>(IILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getSimpleValue(Lorg/apache/sanselan/formats/tiff/TiffField;)Ljava/lang/Object;
    .locals 8

    .line 32
    iget v0, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->length:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 33
    new-instance v0, Ljava/lang/Integer;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;->name:Ljava/lang/String;

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

    invoke-virtual {p0, v1, v2, p1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;->convertByteArrayToInt(Ljava/lang/String;[BI)I

    move-result p1

    invoke-direct {v0, p1}, Ljava/lang/Integer;-><init>(I)V

    return-object v0

    .line 37
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;->name:Ljava/lang/String;

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

    .line 38
    invoke-virtual {p0, p1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;->getRawBytes(Lorg/apache/sanselan/formats/tiff/TiffField;)[B

    move-result-object v4

    const/4 v5, 0x0

    iget v6, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->length:I

    iget v7, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->byteOrder:I

    move-object v2, p0

    .line 37
    invoke-virtual/range {v2 .. v7}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;->convertByteArrayToIntArray(Ljava/lang/String;[BIII)[I

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

    .line 43
    instance-of v0, p1, Ljava/lang/Integer;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 44
    new-array v0, v0, [I

    check-cast p1, Ljava/lang/Integer;

    .line 45
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    aput p1, v0, v1

    .line 44
    invoke-virtual {p0, v0, p2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;->convertIntArrayToByteArray([II)[B

    move-result-object p1

    return-object p1

    .line 47
    :cond_0
    instance-of v0, p1, [I

    if-eqz v0, :cond_1

    .line 49
    check-cast p1, [I

    .line 50
    invoke-virtual {p0, p1, p2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;->convertIntArrayToByteArray([II)[B

    move-result-object p1

    return-object p1

    .line 52
    :cond_1
    instance-of v0, p1, [Ljava/lang/Integer;

    if-eqz v0, :cond_3

    .line 54
    check-cast p1, [Ljava/lang/Integer;

    .line 55
    array-length v0, p1

    new-array v0, v0, [I

    .line 56
    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_2

    .line 57
    aget-object v2, p1, v1

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 58
    :cond_2
    invoke-virtual {p0, v0, p2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;->convertIntArrayToByteArray([II)[B

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
