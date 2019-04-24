.class public Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;
.super Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;
.source "FieldTypeRational.java"


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    const/16 v0, 0x8

    .line 29
    invoke-direct {p0, p1, v0, p2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;-><init>(IILjava/lang/String;)V

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
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->tagInfo:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget-object v1, v1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->oversizeValue:[B

    iget p1, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->byteOrder:I

    invoke-virtual {p0, v0, v1, p1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;->convertByteArrayToRational(Ljava/lang/String;[BI)Lorg/apache/sanselan/common/RationalNumber;

    move-result-object p1

    return-object p1

    .line 38
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;->name:Ljava/lang/String;

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

    .line 39
    invoke-virtual {p0, p1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;->getRawBytes(Lorg/apache/sanselan/formats/tiff/TiffField;)[B

    move-result-object v4

    const/4 v5, 0x0

    iget v6, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->length:I

    iget v7, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->byteOrder:I

    move-object v2, p0

    .line 38
    invoke-virtual/range {v2 .. v7}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;->convertByteArrayToRationalArray(Ljava/lang/String;[BIII)[Lorg/apache/sanselan/common/RationalNumber;

    move-result-object p1

    return-object p1
.end method

.method public writeData(III)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 90
    new-array v1, v0, [I

    const/4 v2, 0x0

    aput p1, v1, v2

    new-array p1, v0, [I

    aput p2, p1, v2

    invoke-virtual {p0, v1, p1, p3}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;->writeData([I[II)[B

    move-result-object p1

    return-object p1
.end method

.method public writeData(Ljava/lang/Object;I)[B
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 44
    instance-of v0, p1, Lorg/apache/sanselan/common/RationalNumber;

    if-eqz v0, :cond_0

    .line 45
    check-cast p1, Lorg/apache/sanselan/common/RationalNumber;

    invoke-virtual {p0, p1, p2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;->convertRationalToByteArray(Lorg/apache/sanselan/common/RationalNumber;I)[B

    move-result-object p1

    return-object p1

    .line 46
    :cond_0
    instance-of v0, p1, [Lorg/apache/sanselan/common/RationalNumber;

    if-eqz v0, :cond_1

    .line 48
    check-cast p1, [Lorg/apache/sanselan/common/RationalNumber;

    invoke-virtual {p0, p1, p2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;->convertRationalArrayToByteArray([Lorg/apache/sanselan/common/RationalNumber;I)[B

    move-result-object p1

    return-object p1

    .line 51
    :cond_1
    instance-of v0, p1, Ljava/lang/Number;

    if-eqz v0, :cond_2

    .line 53
    check-cast p1, Ljava/lang/Number;

    .line 55
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Lorg/apache/sanselan/common/RationalNumberUtilities;->getRationalNumber(D)Lorg/apache/sanselan/common/RationalNumber;

    move-result-object p1

    .line 56
    invoke-virtual {p0, p1, p2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;->convertRationalToByteArray(Lorg/apache/sanselan/common/RationalNumber;I)[B

    move-result-object p1

    return-object p1

    .line 58
    :cond_2
    instance-of v0, p1, [Ljava/lang/Number;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    .line 60
    check-cast p1, [Ljava/lang/Number;

    .line 61
    array-length v0, p1

    new-array v0, v0, [Lorg/apache/sanselan/common/RationalNumber;

    .line 62
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_3

    .line 64
    aget-object v2, p1, v1

    .line 66
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Lorg/apache/sanselan/common/RationalNumberUtilities;->getRationalNumber(D)Lorg/apache/sanselan/common/RationalNumber;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 68
    :cond_3
    invoke-virtual {p0, v0, p2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;->convertRationalArrayToByteArray([Lorg/apache/sanselan/common/RationalNumber;I)[B

    move-result-object p1

    return-object p1

    .line 70
    :cond_4
    instance-of v0, p1, [D

    if-eqz v0, :cond_6

    .line 72
    check-cast p1, [D

    .line 73
    array-length v0, p1

    new-array v0, v0, [Lorg/apache/sanselan/common/RationalNumber;

    .line 74
    :goto_1
    array-length v2, p1

    if-ge v1, v2, :cond_5

    .line 76
    aget-wide v2, p1, v1

    .line 78
    invoke-static {v2, v3}, Lorg/apache/sanselan/common/RationalNumberUtilities;->getRationalNumber(D)Lorg/apache/sanselan/common/RationalNumber;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 80
    :cond_5
    invoke-virtual {p0, v0, p2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;->convertRationalArrayToByteArray([Lorg/apache/sanselan/common/RationalNumber;I)[B

    move-result-object p1

    return-object p1

    .line 83
    :cond_6
    new-instance p2, Lorg/apache/sanselan/ImageWriteException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid data: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
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

.method public writeData([I[II)[B
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 100
    invoke-virtual {p0, p1, p2, p3}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;->convertIntArrayToRationalArray([I[II)[B

    move-result-object p1

    return-object p1
.end method
