.class public abstract Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;
.super Lorg/apache/sanselan/common/BinaryFileFunctions;
.source "FieldType.java"

# interfaces
.implements Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;


# instance fields
.field public final length:I

.field public final name:Ljava/lang/String;

.field public final type:I


# direct methods
.method public constructor <init>(IILjava/lang/String;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lorg/apache/sanselan/common/BinaryFileFunctions;-><init>()V

    .line 33
    iput p1, p0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->type:I

    .line 34
    iput p2, p0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->length:I

    .line 35
    iput-object p3, p0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->name:Ljava/lang/String;

    return-void
.end method

.method public static final getStubLocalValue()[B
    .locals 1

    const/4 v0, 0x4

    .line 56
    new-array v0, v0, [B

    return-object v0
.end method


# virtual methods
.method public getBytesLength(Lorg/apache/sanselan/formats/tiff/TiffField;)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 45
    iget v0, p0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->length:I

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    .line 48
    iget p1, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->length:I

    mul-int/2addr v0, p1

    return v0

    .line 46
    :cond_0
    new-instance p1, Lorg/apache/sanselan/ImageReadException;

    const-string v0, "Unknown field type"

    invoke-direct {p1, v0}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getDisplayValue(Lorg/apache/sanselan/formats/tiff/TiffField;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 66
    invoke-virtual {p0, p1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->getSimpleValue(Lorg/apache/sanselan/formats/tiff/TiffField;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "NULL"

    return-object p1

    .line 69
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getRawBytes(Lorg/apache/sanselan/formats/tiff/TiffField;)[B
    .locals 3

    .line 74
    invoke-virtual {p0, p1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->isLocalValue(Lorg/apache/sanselan/formats/tiff/TiffField;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 76
    iget v0, p0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->length:I

    iget v1, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->length:I

    mul-int/2addr v0, v1

    .line 77
    new-array v1, v0, [B

    .line 78
    iget-object p1, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->valueOffsetBytes:[B

    const/4 v2, 0x0

    invoke-static {p1, v2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1

    .line 86
    :cond_0
    iget-object p1, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->oversizeValue:[B

    return-object p1
.end method

.method public abstract getSimpleValue(Lorg/apache/sanselan/formats/tiff/TiffField;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation
.end method

.method public final getStubValue(I)[B
    .locals 1

    .line 61
    iget v0, p0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->length:I

    mul-int/2addr p1, v0

    new-array p1, p1, [B

    return-object p1
.end method

.method public isLocalValue(Lorg/apache/sanselan/formats/tiff/TiffField;)Z
    .locals 1

    .line 40
    iget v0, p0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->length:I

    if-lez v0, :cond_0

    iget p1, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->length:I

    mul-int/2addr v0, p1

    const/4 p1, 0x4

    if-gt v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 106
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ". type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", name: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", length: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->length:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract writeData(Ljava/lang/Object;I)[B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation
.end method
