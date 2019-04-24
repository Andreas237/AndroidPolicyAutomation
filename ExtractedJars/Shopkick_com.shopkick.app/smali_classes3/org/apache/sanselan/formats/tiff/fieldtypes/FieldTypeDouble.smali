.class public Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeDouble;
.super Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;
.source "FieldTypeDouble.java"


# direct methods
.method public constructor <init>()V
    .locals 3

    const-string v0, "Double"

    const/16 v1, 0xc

    const/16 v2, 0x8

    .line 27
    invoke-direct {p0, v1, v2, v0}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;-><init>(IILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getSimpleValue(Lorg/apache/sanselan/formats/tiff/TiffField;)Ljava/lang/Object;
    .locals 0

    const-string p1, "?"

    return-object p1
.end method

.method public writeData(Ljava/lang/Object;I)[B
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 37
    instance-of v0, p1, Ljava/lang/Double;

    if-eqz v0, :cond_0

    .line 38
    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1, p2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeDouble;->convertDoubleToByteArray(DI)[B

    move-result-object p1

    return-object p1

    .line 40
    :cond_0
    instance-of v0, p1, [D

    if-eqz v0, :cond_1

    .line 42
    check-cast p1, [D

    .line 43
    invoke-virtual {p0, p1, p2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeDouble;->convertDoubleArrayToByteArray([DI)[B

    move-result-object p1

    return-object p1

    .line 45
    :cond_1
    instance-of v0, p1, [Ljava/lang/Double;

    if-eqz v0, :cond_3

    .line 47
    check-cast p1, [Ljava/lang/Double;

    .line 48
    array-length v0, p1

    new-array v0, v0, [D

    const/4 v1, 0x0

    .line 49
    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_2

    .line 50
    aget-object v2, p1, v1

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    aput-wide v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 51
    :cond_2
    invoke-virtual {p0, v0, p2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeDouble;->convertDoubleArrayToByteArray([DI)[B

    move-result-object p1

    return-object p1

    .line 54
    :cond_3
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
