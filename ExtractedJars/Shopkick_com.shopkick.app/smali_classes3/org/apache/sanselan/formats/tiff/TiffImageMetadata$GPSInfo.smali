.class public Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;
.super Ljava/lang/Object;
.source "TiffImageMetadata.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/sanselan/formats/tiff/TiffImageMetadata;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GPSInfo"
.end annotation


# instance fields
.field public final latitudeDegrees:Lorg/apache/sanselan/common/RationalNumber;

.field public final latitudeMinutes:Lorg/apache/sanselan/common/RationalNumber;

.field public final latitudeRef:Ljava/lang/String;

.field public final latitudeSeconds:Lorg/apache/sanselan/common/RationalNumber;

.field public final longitudeDegrees:Lorg/apache/sanselan/common/RationalNumber;

.field public final longitudeMinutes:Lorg/apache/sanselan/common/RationalNumber;

.field public final longitudeRef:Ljava/lang/String;

.field public final longitudeSeconds:Lorg/apache/sanselan/common/RationalNumber;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lorg/apache/sanselan/common/RationalNumber;Lorg/apache/sanselan/common/RationalNumber;Lorg/apache/sanselan/common/RationalNumber;Lorg/apache/sanselan/common/RationalNumber;Lorg/apache/sanselan/common/RationalNumber;Lorg/apache/sanselan/common/RationalNumber;)V
    .locals 0

    .line 331
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 332
    iput-object p1, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;->latitudeRef:Ljava/lang/String;

    .line 333
    iput-object p2, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;->longitudeRef:Ljava/lang/String;

    .line 334
    iput-object p3, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;->latitudeDegrees:Lorg/apache/sanselan/common/RationalNumber;

    .line 335
    iput-object p4, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;->latitudeMinutes:Lorg/apache/sanselan/common/RationalNumber;

    .line 336
    iput-object p5, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;->latitudeSeconds:Lorg/apache/sanselan/common/RationalNumber;

    .line 337
    iput-object p6, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;->longitudeDegrees:Lorg/apache/sanselan/common/RationalNumber;

    .line 338
    iput-object p7, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;->longitudeMinutes:Lorg/apache/sanselan/common/RationalNumber;

    .line 339
    iput-object p8, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;->longitudeSeconds:Lorg/apache/sanselan/common/RationalNumber;

    return-void
.end method


# virtual methods
.method public getLatitudeAsDegreesNorth()D
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 381
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;->latitudeDegrees:Lorg/apache/sanselan/common/RationalNumber;

    invoke-virtual {v0}, Lorg/apache/sanselan/common/RationalNumber;->doubleValue()D

    move-result-wide v0

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;->latitudeMinutes:Lorg/apache/sanselan/common/RationalNumber;

    .line 382
    invoke-virtual {v2}, Lorg/apache/sanselan/common/RationalNumber;->doubleValue()D

    move-result-wide v2

    const-wide/high16 v4, 0x404e000000000000L    # 60.0

    div-double/2addr v2, v4

    add-double/2addr v0, v2

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;->latitudeSeconds:Lorg/apache/sanselan/common/RationalNumber;

    .line 383
    invoke-virtual {v2}, Lorg/apache/sanselan/common/RationalNumber;->doubleValue()D

    move-result-wide v2

    const-wide v4, 0x40ac200000000000L    # 3600.0

    div-double/2addr v2, v4

    add-double/2addr v0, v2

    .line 385
    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;->latitudeRef:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    const-string v3, "n"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-wide v0

    .line 387
    :cond_0
    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;->latitudeRef:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    const-string v3, "s"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    neg-double v0, v0

    return-wide v0

    .line 390
    :cond_1
    new-instance v0, Lorg/apache/sanselan/ImageReadException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown latitude ref: \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;->latitudeRef:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getLongitudeAsDegreesEast()D
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 366
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;->longitudeDegrees:Lorg/apache/sanselan/common/RationalNumber;

    invoke-virtual {v0}, Lorg/apache/sanselan/common/RationalNumber;->doubleValue()D

    move-result-wide v0

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;->longitudeMinutes:Lorg/apache/sanselan/common/RationalNumber;

    .line 367
    invoke-virtual {v2}, Lorg/apache/sanselan/common/RationalNumber;->doubleValue()D

    move-result-wide v2

    const-wide/high16 v4, 0x404e000000000000L    # 60.0

    div-double/2addr v2, v4

    add-double/2addr v0, v2

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;->longitudeSeconds:Lorg/apache/sanselan/common/RationalNumber;

    .line 368
    invoke-virtual {v2}, Lorg/apache/sanselan/common/RationalNumber;->doubleValue()D

    move-result-wide v2

    const-wide v4, 0x40ac200000000000L    # 3600.0

    div-double/2addr v2, v4

    add-double/2addr v0, v2

    .line 370
    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;->longitudeRef:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    const-string v3, "e"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-wide v0

    .line 372
    :cond_0
    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;->longitudeRef:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    const-string v3, "w"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    neg-double v0, v0

    return-wide v0

    .line 375
    :cond_1
    new-instance v0, Lorg/apache/sanselan/ImageReadException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown longitude ref: \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;->longitudeRef:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 349
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "[GPS. "

    .line 350
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 351
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Latitude: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;->latitudeDegrees:Lorg/apache/sanselan/common/RationalNumber;

    invoke-virtual {v2}, Lorg/apache/sanselan/common/RationalNumber;->toDisplayString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " degrees, "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;->latitudeMinutes:Lorg/apache/sanselan/common/RationalNumber;

    .line 352
    invoke-virtual {v2}, Lorg/apache/sanselan/common/RationalNumber;->toDisplayString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " minutes, "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;->latitudeSeconds:Lorg/apache/sanselan/common/RationalNumber;

    .line 353
    invoke-virtual {v2}, Lorg/apache/sanselan/common/RationalNumber;->toDisplayString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " seconds "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;->latitudeRef:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 351
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 355
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ", Longitude: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;->longitudeDegrees:Lorg/apache/sanselan/common/RationalNumber;

    invoke-virtual {v2}, Lorg/apache/sanselan/common/RationalNumber;->toDisplayString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " degrees, "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;->longitudeMinutes:Lorg/apache/sanselan/common/RationalNumber;

    .line 356
    invoke-virtual {v2}, Lorg/apache/sanselan/common/RationalNumber;->toDisplayString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " minutes, "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;->longitudeSeconds:Lorg/apache/sanselan/common/RationalNumber;

    .line 357
    invoke-virtual {v2}, Lorg/apache/sanselan/common/RationalNumber;->toDisplayString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " seconds "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$GPSInfo;->longitudeRef:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 355
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, "]"

    .line 359
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 361
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
