.class public final Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;
.super Lorg/apache/sanselan/formats/tiff/constants/TagInfo;
.source "TagInfo.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/sanselan/formats/tiff/constants/TagInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Text"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;
    }
.end annotation


# static fields
.field private static final TEXT_ENCODINGS:[Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

.field private static final TEXT_ENCODING_ASCII:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

.field private static final TEXT_ENCODING_JIS:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

.field private static final TEXT_ENCODING_UNDEFINED:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

.field private static final TEXT_ENCODING_UNICODE:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 265
    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    const/16 v1, 0x8

    new-array v2, v1, [B

    fill-array-data v2, :array_0

    const-string v3, "US-ASCII"

    invoke-direct {v0, v2, v3}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;-><init>([BLjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->TEXT_ENCODING_ASCII:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    .line 269
    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    new-array v2, v1, [B

    fill-array-data v2, :array_1

    const-string v3, "JIS"

    invoke-direct {v0, v2, v3}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;-><init>([BLjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->TEXT_ENCODING_JIS:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    .line 273
    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    new-array v2, v1, [B

    fill-array-data v2, :array_2

    const-string v3, "UTF-8"

    invoke-direct {v0, v2, v3}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;-><init>([BLjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->TEXT_ENCODING_UNICODE:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    .line 278
    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    new-array v1, v1, [B

    fill-array-data v1, :array_3

    const-string v2, "ISO-8859-1"

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;-><init>([BLjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->TEXT_ENCODING_UNDEFINED:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    const/4 v0, 0x4

    .line 283
    new-array v0, v0, [Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->TEXT_ENCODING_ASCII:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->TEXT_ENCODING_JIS:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->TEXT_ENCODING_UNICODE:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->TEXT_ENCODING_UNDEFINED:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->TEXT_ENCODINGS:[Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    return-void

    :array_0
    .array-data 1
        0x41t
        0x53t
        0x43t
        0x49t
        0x49t
        0x0t
        0x0t
        0x0t
    .end array-data

    :array_1
    .array-data 1
        0x4at
        0x49t
        0x53t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data

    :array_2
    .array-data 1
        0x55t
        0x4et
        0x49t
        0x43t
        0x4ft
        0x44t
        0x45t
        0x0t
    .end array-data

    :array_3
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;ILorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V
    .locals 0

    .line 239
    invoke-direct/range {p0 .. p5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;ILorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V
    .locals 0

    .line 245
    invoke-direct/range {p0 .. p5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    return-void
.end method


# virtual methods
.method public encodeValue(Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;Ljava/lang/Object;I)[B
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 293
    instance-of p1, p2, Ljava/lang/String;

    if-eqz p1, :cond_1

    .line 296
    check-cast p2, Ljava/lang/String;

    .line 301
    :try_start_0
    sget-object p1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->TEXT_ENCODING_ASCII:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    iget-object p1, p1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->encodingName:Ljava/lang/String;

    .line 302
    invoke-virtual {p2, p1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    .line 303
    new-instance p3, Ljava/lang/String;

    sget-object v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->TEXT_ENCODING_ASCII:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    iget-object v0, v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->encodingName:Ljava/lang/String;

    invoke-direct {p3, p1, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 305
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    .line 308
    array-length p2, p1

    sget-object p3, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->TEXT_ENCODING_ASCII:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    iget-object p3, p3, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->prefix:[B

    array-length p3, p3

    add-int/2addr p2, p3

    new-array p2, p2, [B

    .line 310
    sget-object p3, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->TEXT_ENCODING_ASCII:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    iget-object p3, p3, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->prefix:[B

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->TEXT_ENCODING_ASCII:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    iget-object v1, v1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->prefix:[B

    array-length v1, v1

    invoke-static {p3, v0, p2, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 312
    sget-object p3, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->TEXT_ENCODING_ASCII:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    iget-object p3, p3, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->prefix:[B

    array-length p3, p3

    array-length v1, p1

    invoke-static {p1, v0, p2, p3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p2

    .line 320
    :cond_0
    sget-object p1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->TEXT_ENCODING_UNICODE:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    iget-object p1, p1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->encodingName:Ljava/lang/String;

    .line 321
    invoke-virtual {p2, p1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    .line 322
    array-length p2, p1

    sget-object p3, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->TEXT_ENCODING_UNICODE:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    iget-object p3, p3, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->prefix:[B

    array-length p3, p3

    add-int/2addr p2, p3

    new-array p2, p2, [B

    .line 324
    sget-object p3, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->TEXT_ENCODING_UNICODE:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    iget-object p3, p3, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->prefix:[B

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->TEXT_ENCODING_UNICODE:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    iget-object v1, v1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->prefix:[B

    array-length v1, v1

    invoke-static {p3, v0, p2, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 326
    sget-object p3, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->TEXT_ENCODING_UNICODE:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    iget-object p3, p3, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->prefix:[B

    array-length p3, p3

    array-length v1, p1

    invoke-static {p1, v0, p2, p3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    .line 334
    new-instance p2, Lorg/apache/sanselan/ImageWriteException;

    invoke-virtual {p1}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2

    .line 294
    :cond_1
    new-instance p1, Lorg/apache/sanselan/ImageWriteException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Text value not String: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " ("

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    invoke-static {p2}, Lorg/apache/sanselan/util/Debug;->getType(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ")"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getValue(Lorg/apache/sanselan/formats/tiff/TiffField;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 344
    iget v0, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->type:I

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->FIELD_TYPE_ASCII:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeASCII;

    iget v1, v1, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeASCII;->type:I

    if-ne v0, v1, :cond_0

    .line 345
    sget-object v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->FIELD_TYPE_ASCII:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeASCII;

    invoke-virtual {v0, p1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeASCII;->getSimpleValue(Lorg/apache/sanselan/formats/tiff/TiffField;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 346
    :cond_0
    iget v0, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->type:I

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->FIELD_TYPE_UNDEFINED:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    iget v1, v1, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->type:I

    if-ne v0, v1, :cond_1

    goto :goto_0

    .line 348
    :cond_1
    iget v0, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->type:I

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->FIELD_TYPE_BYTE:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeByte;

    iget v1, v1, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeByte;->type:I

    if-ne v0, v1, :cond_5

    .line 359
    :goto_0
    iget-object v0, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->fieldType:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    invoke-virtual {v0, p1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->getRawBytes(Lorg/apache/sanselan/formats/tiff/TiffField;)[B

    move-result-object p1

    .line 360
    array-length v0, p1

    const/16 v1, 0x8

    if-ge v0, v1, :cond_2

    .line 365
    :try_start_0
    new-instance v0, Ljava/lang/String;

    const-string v1, "US-ASCII"

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 369
    :catch_0
    new-instance p1, Lorg/apache/sanselan/ImageReadException;

    const-string v0, "Text field missing encoding prefix."

    invoke-direct {p1, v0}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    const/4 v0, 0x0

    move v1, v0

    .line 374
    :goto_1
    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->TEXT_ENCODINGS:[Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    array-length v3, v2

    if-ge v1, v3, :cond_4

    .line 376
    aget-object v2, v2, v1

    .line 377
    iget-object v3, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->prefix:[B

    iget-object v4, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->prefix:[B

    array-length v4, v4

    invoke-static {p1, v0, v3, v0, v4}, Lorg/apache/sanselan/common/BinaryFileFunctions;->compareBytes([BI[BII)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 383
    :try_start_1
    new-instance v0, Ljava/lang/String;

    iget-object v1, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->prefix:[B

    array-length v1, v1

    array-length v3, p1

    iget-object v4, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->prefix:[B

    array-length v4, v4

    sub-int/2addr v3, v4

    iget-object v2, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->encodingName:Ljava/lang/String;

    invoke-direct {v0, p1, v1, v3, v2}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    :catch_1
    move-exception p1

    .line 389
    new-instance v0, Lorg/apache/sanselan/ImageReadException;

    invoke-virtual {p1}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 403
    :cond_4
    :try_start_2
    new-instance v0, Ljava/lang/String;

    const-string v1, "US-ASCII"

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_2

    return-object v0

    .line 407
    :catch_2
    new-instance p1, Lorg/apache/sanselan/ImageReadException;

    const-string v0, "Unknown text encoding prefix."

    invoke-direct {p1, v0}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 352
    :cond_5
    iget v0, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->type:I

    const-string v1, "entry.type"

    invoke-static {v1, v0}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/String;I)V

    .line 353
    iget v0, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->directoryType:I

    const-string v1, "entry.directoryType"

    invoke-static {v1, v0}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/String;I)V

    .line 354
    invoke-virtual {p1}, Lorg/apache/sanselan/formats/tiff/TiffField;->getDescriptionWithoutValue()Ljava/lang/String;

    move-result-object v0

    const-string v1, "entry.type"

    invoke-static {v1, v0}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/String;Ljava/lang/String;)V

    .line 355
    iget-object p1, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->fieldType:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const-string v0, "entry.type"

    invoke-static {v0, p1}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/String;Ljava/lang/Object;)V

    .line 356
    new-instance p1, Lorg/apache/sanselan/ImageReadException;

    const-string v0, "Text field not encoded as bytes."

    invoke-direct {p1, v0}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public isText()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
