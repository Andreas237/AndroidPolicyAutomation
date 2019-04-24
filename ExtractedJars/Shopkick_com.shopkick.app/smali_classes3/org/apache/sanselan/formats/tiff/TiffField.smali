.class public Lorg/apache/sanselan/formats/tiff/TiffField;
.super Ljava/lang/Object;
.source "TiffField.java"

# interfaces
.implements Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/sanselan/formats/tiff/TiffField$OversizeValueElement;
    }
.end annotation


# static fields
.field private static final ALL_TAG_MAP:Ljava/util/Map;

.field public static final Attribute_Tag:Ljava/lang/String; = "Tag"

.field private static final EXIF_TAG_MAP:Ljava/util/Map;

.field private static final GPS_TAG_MAP:Ljava/util/Map;

.field private static final TIFF_TAG_MAP:Ljava/util/Map;


# instance fields
.field public final byteOrder:I

.field public final directoryType:I

.field public final fieldType:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public final length:I

.field public oversizeValue:[B

.field private sortHint:I

.field public final tag:I

.field public final tagInfo:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public final type:I

.field public final valueOffset:I

.field public final valueOffsetBytes:[B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 625
    sget-object v0, Lorg/apache/sanselan/formats/tiff/TiffField;->ALL_GPS_TAGS:[Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "GPS"

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lorg/apache/sanselan/formats/tiff/TiffField;->makeTagMap([Lorg/apache/sanselan/formats/tiff/constants/TagInfo;ZLjava/lang/String;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lorg/apache/sanselan/formats/tiff/TiffField;->GPS_TAG_MAP:Ljava/util/Map;

    .line 627
    sget-object v0, Lorg/apache/sanselan/formats/tiff/TiffField;->ALL_TIFF_TAGS:[Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "TIFF"

    invoke-static {v0, v2, v1}, Lorg/apache/sanselan/formats/tiff/TiffField;->makeTagMap([Lorg/apache/sanselan/formats/tiff/constants/TagInfo;ZLjava/lang/String;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lorg/apache/sanselan/formats/tiff/TiffField;->TIFF_TAG_MAP:Ljava/util/Map;

    .line 629
    sget-object v0, Lorg/apache/sanselan/formats/tiff/TiffField;->ALL_EXIF_TAGS:[Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "EXIF"

    const/4 v2, 0x1

    invoke-static {v0, v2, v1}, Lorg/apache/sanselan/formats/tiff/TiffField;->makeTagMap([Lorg/apache/sanselan/formats/tiff/constants/TagInfo;ZLjava/lang/String;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lorg/apache/sanselan/formats/tiff/TiffField;->EXIF_TAG_MAP:Ljava/util/Map;

    .line 631
    sget-object v0, Lorg/apache/sanselan/formats/tiff/TiffField;->ALL_TAGS:[Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "All"

    invoke-static {v0, v2, v1}, Lorg/apache/sanselan/formats/tiff/TiffField;->makeTagMap([Lorg/apache/sanselan/formats/tiff/constants/TagInfo;ZLjava/lang/String;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lorg/apache/sanselan/formats/tiff/TiffField;->ALL_TAG_MAP:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(IIIII[BI)V
    .locals 1

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 47
    iput-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->oversizeValue:[B

    const/4 v0, -0x1

    .line 66
    iput v0, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->sortHint:I

    .line 54
    iput p1, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->tag:I

    .line 55
    iput p2, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->directoryType:I

    .line 56
    iput p3, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->type:I

    .line 57
    iput p4, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->length:I

    .line 58
    iput p5, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->valueOffset:I

    .line 59
    iput-object p6, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->valueOffsetBytes:[B

    .line 60
    iput p7, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->byteOrder:I

    .line 62
    invoke-static {p3}, Lorg/apache/sanselan/formats/tiff/TiffField;->getFieldType(I)Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    move-result-object p3

    iput-object p3, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->fieldType:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    .line 63
    invoke-static {p2, p1}, Lorg/apache/sanselan/formats/tiff/TiffField;->getTag(II)Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->tagInfo:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    return-void
.end method

.method private static getFieldType(I)Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;
    .locals 3

    const/4 v0, 0x0

    .line 110
    :goto_0
    sget-object v1, Lorg/apache/sanselan/formats/tiff/TiffField;->FIELD_TYPES:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    array-length v1, v1

    if-ge v0, v1, :cond_1

    .line 112
    sget-object v1, Lorg/apache/sanselan/formats/tiff/TiffField;->FIELD_TYPES:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    aget-object v1, v1, v0

    .line 113
    iget v2, v1, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->type:I

    if-ne v2, p0, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 117
    :cond_1
    sget-object p0, Lorg/apache/sanselan/formats/tiff/TiffField;->FIELD_TYPE_UNKNOWN:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    return-object p0
.end method

.method private static getTag(II)Lorg/apache/sanselan/formats/tiff/constants/TagInfo;
    .locals 2

    .line 272
    new-instance v0, Ljava/lang/Integer;

    invoke-direct {v0, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 274
    sget-object v1, Lorg/apache/sanselan/formats/tiff/TiffField;->EXIF_TAG_MAP:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    .line 278
    sget-object p0, Lorg/apache/sanselan/formats/tiff/TiffField;->TIFF_TAG_UNKNOWN:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    return-object p0

    .line 281
    :cond_0
    invoke-static {p0, p1, v0}, Lorg/apache/sanselan/formats/tiff/TiffField;->getTag(IILjava/util/List;)Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    move-result-object p0

    return-object p0
.end method

.method private static getTag(IILjava/util/List;)Lorg/apache/sanselan/formats/tiff/constants/TagInfo;
    .locals 5

    .line 123
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x1

    if-ge p1, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 p1, 0x0

    move v1, p1

    .line 132
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_a

    .line 134
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    .line 135
    iget-object v3, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->directoryType:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    sget-object v4, Lorg/apache/sanselan/formats/tiff/TiffField;->EXIF_DIRECTORY_UNKNOWN:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    if-ne v3, v4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, -0x2

    if-ne p0, v3, :cond_2

    .line 138
    iget-object v3, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->directoryType:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    sget-object v4, Lorg/apache/sanselan/formats/tiff/TiffField;->EXIF_DIRECTORY_EXIF_IFD:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    if-ne v3, v4, :cond_2

    return-object v2

    :cond_2
    const/4 v3, -0x4

    if-ne p0, v3, :cond_3

    .line 141
    iget-object v3, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->directoryType:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    sget-object v4, Lorg/apache/sanselan/formats/tiff/TiffField;->EXIF_DIRECTORY_INTEROP_IFD:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    if-ne v3, v4, :cond_3

    return-object v2

    :cond_3
    const/4 v3, -0x3

    if-ne p0, v3, :cond_4

    .line 144
    iget-object v3, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->directoryType:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    sget-object v4, Lorg/apache/sanselan/formats/tiff/TiffField;->EXIF_DIRECTORY_GPS:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    if-ne v3, v4, :cond_4

    return-object v2

    :cond_4
    const/4 v3, -0x5

    if-ne p0, v3, :cond_5

    .line 147
    iget-object v3, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->directoryType:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    sget-object v4, Lorg/apache/sanselan/formats/tiff/TiffField;->EXIF_DIRECTORY_MAKER_NOTES:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    if-ne v3, v4, :cond_5

    return-object v2

    :cond_5
    if-nez p0, :cond_6

    .line 150
    iget-object v3, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->directoryType:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    sget-object v4, Lorg/apache/sanselan/formats/tiff/TiffField;->TIFF_DIRECTORY_IFD0:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    if-ne v3, v4, :cond_6

    return-object v2

    :cond_6
    if-ne p0, v0, :cond_7

    .line 153
    iget-object v3, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->directoryType:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    sget-object v4, Lorg/apache/sanselan/formats/tiff/TiffField;->TIFF_DIRECTORY_IFD1:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    if-ne v3, v4, :cond_7

    return-object v2

    :cond_7
    const/4 v3, 0x2

    if-ne p0, v3, :cond_8

    .line 156
    iget-object v3, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->directoryType:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    sget-object v4, Lorg/apache/sanselan/formats/tiff/TiffField;->TIFF_DIRECTORY_IFD2:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    if-ne v3, v4, :cond_8

    return-object v2

    :cond_8
    const/4 v3, 0x3

    if-ne p0, v3, :cond_9

    .line 159
    iget-object v3, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->directoryType:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    sget-object v4, Lorg/apache/sanselan/formats/tiff/TiffField;->TIFF_DIRECTORY_IFD3:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    if-ne v3, v4, :cond_9

    return-object v2

    :cond_9
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_a
    move v0, p1

    .line 165
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_e

    .line 167
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    .line 169
    iget-object v2, v1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->directoryType:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    sget-object v3, Lorg/apache/sanselan/formats/tiff/TiffField;->EXIF_DIRECTORY_UNKNOWN:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    if-ne v2, v3, :cond_b

    goto :goto_3

    :cond_b
    if-ltz p0, :cond_c

    .line 172
    iget-object v2, v1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->directoryType:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    .line 173
    invoke-virtual {v2}, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;->isImageDirectory()Z

    move-result v2

    if-eqz v2, :cond_c

    return-object v1

    :cond_c
    if-gez p0, :cond_d

    .line 175
    iget-object v2, v1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->directoryType:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    .line 176
    invoke-virtual {v2}, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;->isImageDirectory()Z

    move-result v2

    if-nez v2, :cond_d

    return-object v1

    :cond_d
    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 181
    :cond_e
    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p0

    if-ge p1, p0, :cond_10

    .line 183
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    .line 185
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->directoryType:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    sget-object v1, Lorg/apache/sanselan/formats/tiff/TiffField;->EXIF_DIRECTORY_UNKNOWN:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    if-ne v0, v1, :cond_f

    return-object p0

    :cond_f
    add-int/lit8 p1, p1, 0x1

    goto :goto_4

    .line 215
    :cond_10
    sget-object p0, Lorg/apache/sanselan/formats/tiff/TiffField;->TIFF_TAG_UNKNOWN:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    return-object p0
.end method

.method private getValueDescription(Ljava/lang/Object;)Ljava/lang/String;
    .locals 7

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 329
    :cond_0
    instance-of v0, p1, Ljava/lang/Number;

    if-eqz v0, :cond_1

    .line 331
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 332
    :cond_1
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 334
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 335
    :cond_2
    instance-of v0, p1, Ljava/util/Date;

    if-eqz v0, :cond_3

    .line 337
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd\'T\'HH:mm:ss.SSSZ"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 338
    check-cast p1, Ljava/util/Date;

    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 339
    :cond_3
    instance-of v0, p1, [Ljava/lang/Object;

    const/16 v1, 0x32

    const/4 v2, 0x0

    if-eqz v0, :cond_7

    .line 341
    check-cast p1, [Ljava/lang/Object;

    .line 342
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 344
    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_6

    .line 346
    aget-object v3, p1, v2

    if-le v2, v1, :cond_4

    .line 350
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "... ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_1

    :cond_4
    if-lez v2, :cond_5

    const-string v4, ", "

    .line 354
    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 355
    :cond_5
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, ""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 357
    :cond_6
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 374
    :cond_7
    instance-of v0, p1, [I

    if-eqz v0, :cond_b

    .line 376
    check-cast p1, [I

    .line 377
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 379
    :goto_2
    array-length v3, p1

    if-ge v2, v3, :cond_a

    .line 381
    aget v3, p1, v2

    if-le v2, v1, :cond_8

    .line 385
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "... ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_3

    :cond_8
    if-lez v2, :cond_9

    const-string v4, ", "

    .line 389
    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 390
    :cond_9
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, ""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 392
    :cond_a
    :goto_3
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 393
    :cond_b
    instance-of v0, p1, [J

    if-eqz v0, :cond_f

    .line 395
    check-cast p1, [J

    .line 396
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 398
    :goto_4
    array-length v3, p1

    if-ge v2, v3, :cond_e

    .line 400
    aget-wide v3, p1, v2

    if-le v2, v1, :cond_c

    .line 404
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "... ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_5

    :cond_c
    if-lez v2, :cond_d

    const-string v5, ", "

    .line 408
    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 409
    :cond_d
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, ""

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 411
    :cond_e
    :goto_5
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 412
    :cond_f
    instance-of v0, p1, [D

    if-eqz v0, :cond_13

    .line 414
    check-cast p1, [D

    .line 415
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 417
    :goto_6
    array-length v3, p1

    if-ge v2, v3, :cond_12

    .line 419
    aget-wide v3, p1, v2

    if-le v2, v1, :cond_10

    .line 423
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "... ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_7

    :cond_10
    if-lez v2, :cond_11

    const-string v5, ", "

    .line 427
    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 428
    :cond_11
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, ""

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    .line 430
    :cond_12
    :goto_7
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 431
    :cond_13
    instance-of v0, p1, [B

    if-eqz v0, :cond_17

    .line 433
    check-cast p1, [B

    .line 434
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 436
    :goto_8
    array-length v3, p1

    if-ge v2, v3, :cond_16

    .line 438
    aget-byte v3, p1, v2

    if-le v2, v1, :cond_14

    .line 442
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "... ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_9

    :cond_14
    if-lez v2, :cond_15

    const-string v4, ", "

    .line 446
    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 447
    :cond_15
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, ""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    .line 449
    :cond_16
    :goto_9
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 450
    :cond_17
    instance-of v0, p1, [C

    if-eqz v0, :cond_1b

    .line 452
    check-cast p1, [C

    .line 453
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 455
    :goto_a
    array-length v3, p1

    if-ge v2, v3, :cond_1a

    .line 457
    aget-char v3, p1, v2

    if-le v2, v1, :cond_18

    .line 461
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "... ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_b

    :cond_18
    if-lez v2, :cond_19

    const-string v4, ", "

    .line 465
    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 466
    :cond_19
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, ""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_a

    .line 468
    :cond_1a
    :goto_b
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 469
    :cond_1b
    instance-of v0, p1, [F

    if-eqz v0, :cond_1f

    .line 471
    check-cast p1, [F

    .line 472
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 474
    :goto_c
    array-length v3, p1

    if-ge v2, v3, :cond_1e

    .line 476
    aget v3, p1, v2

    if-le v2, v1, :cond_1c

    .line 480
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "... ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_d

    :cond_1c
    if-lez v2, :cond_1d

    const-string v4, ", "

    .line 484
    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 485
    :cond_1d
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, ""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_c

    .line 487
    :cond_1e
    :goto_d
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 505
    :cond_1f
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private getValueLengthInBytes()I
    .locals 2

    .line 287
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->fieldType:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    iget v0, v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->length:I

    .line 288
    iget v1, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->length:I

    mul-int/2addr v0, v1

    return v0
.end method

.method private static final makeTagMap([Lorg/apache/sanselan/formats/tiff/constants/TagInfo;ZLjava/lang/String;)Ljava/util/Map;
    .locals 3

    .line 595
    new-instance p1, Ljava/util/Hashtable;

    invoke-direct {p1}, Ljava/util/Hashtable;-><init>()V

    const/4 p2, 0x0

    .line 597
    :goto_0
    array-length v0, p0

    if-ge p2, v0, :cond_1

    .line 599
    aget-object v0, p0, p2

    .line 600
    new-instance v1, Ljava/lang/Integer;

    iget v2, v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->tag:I

    invoke-direct {v1, v2}, Ljava/lang/Integer;-><init>(I)V

    .line 602
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-nez v2, :cond_0

    .line 605
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 606
    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 608
    :cond_0
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    return-object p1
.end method


# virtual methods
.method public dump()V
    .locals 2

    .line 510
    new-instance v0, Ljava/io/PrintWriter;

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-direct {v0, v1}, Ljava/io/PrintWriter;-><init>(Ljava/io/OutputStream;)V

    .line 511
    invoke-virtual {p0, v0}, Lorg/apache/sanselan/formats/tiff/TiffField;->dump(Ljava/io/PrintWriter;)V

    .line 512
    invoke-virtual {v0}, Ljava/io/PrintWriter;->flush()V

    return-void
.end method

.method public dump(Ljava/io/PrintWriter;)V
    .locals 1

    const/4 v0, 0x0

    .line 517
    invoke-virtual {p0, p1, v0}, Lorg/apache/sanselan/formats/tiff/TiffField;->dump(Ljava/io/PrintWriter;Ljava/lang/String;)V

    return-void
.end method

.method public dump(Ljava/io/PrintWriter;Ljava/lang/String;)V
    .locals 1

    if-eqz p2, :cond_0

    .line 523
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ": "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 525
    :cond_0
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/TiffField;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 526
    invoke-virtual {p1}, Ljava/io/PrintWriter;->flush()V

    return-void
.end method

.method public fillInValue(Lorg/apache/sanselan/common/byteSources/ByteSource;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 299
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->fieldType:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    invoke-virtual {v0, p0}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->isLocalValue(Lorg/apache/sanselan/formats/tiff/TiffField;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 302
    :cond_0
    invoke-direct {p0}, Lorg/apache/sanselan/formats/tiff/TiffField;->getValueLengthInBytes()I

    move-result v0

    .line 309
    iget v1, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->valueOffset:I

    invoke-virtual {p1, v1, v0}, Lorg/apache/sanselan/common/byteSources/ByteSource;->getBlock(II)[B

    move-result-object p1

    .line 310
    invoke-virtual {p0, p1}, Lorg/apache/sanselan/formats/tiff/TiffField;->setOversizeValue([B)V

    return-void
.end method

.method public getByteArrayValue()[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 784
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->fieldType:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    invoke-virtual {v0, p0}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->getRawBytes(Lorg/apache/sanselan/formats/tiff/TiffField;)[B

    move-result-object v0

    return-object v0
.end method

.method public getBytesLength()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 75
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->fieldType:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    invoke-virtual {v0, p0}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->getBytesLength(Lorg/apache/sanselan/formats/tiff/TiffField;)I

    move-result v0

    return v0
.end method

.method public getDescriptionWithoutValue()Ljava/lang/String;
    .locals 2

    .line 544
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->tag:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " (0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->tag:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->tagInfo:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget-object v1, v1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDoubleArrayValue()[D
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 691
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/TiffField;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 695
    instance-of v1, v0, Ljava/lang/Number;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    .line 697
    new-array v1, v1, [D

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v3

    aput-wide v3, v1, v2

    return-object v1

    .line 698
    :cond_0
    instance-of v1, v0, [Ljava/lang/Number;

    if-eqz v1, :cond_2

    .line 700
    check-cast v0, [Ljava/lang/Number;

    .line 701
    array-length v1, v0

    new-array v1, v1, [D

    .line 702
    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_1

    .line 703
    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v3

    aput-wide v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v1

    .line 705
    :cond_2
    instance-of v1, v0, [I

    if-eqz v1, :cond_4

    .line 707
    check-cast v0, [I

    .line 708
    array-length v1, v0

    new-array v1, v1, [D

    .line 709
    :goto_1
    array-length v3, v0

    if-ge v2, v3, :cond_3

    .line 710
    aget v3, v0, v2

    int-to-double v3, v3

    aput-wide v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    return-object v1

    .line 712
    :cond_4
    instance-of v1, v0, [F

    if-eqz v1, :cond_6

    .line 714
    check-cast v0, [F

    .line 715
    array-length v1, v0

    new-array v1, v1, [D

    .line 716
    :goto_2
    array-length v3, v0

    if-ge v2, v3, :cond_5

    .line 717
    aget v3, v0, v2

    float-to-double v3, v3

    aput-wide v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    return-object v1

    .line 719
    :cond_6
    instance-of v1, v0, [D

    if-eqz v1, :cond_8

    .line 721
    check-cast v0, [D

    .line 722
    array-length v1, v0

    new-array v1, v1, [D

    .line 723
    :goto_3
    array-length v3, v0

    if-ge v2, v3, :cond_7

    .line 724
    aget-wide v3, v0, v2

    aput-wide v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_7
    return-object v1

    .line 728
    :cond_8
    new-instance v1, Lorg/apache/sanselan/ImageReadException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown value: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " for: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->tagInfo:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    .line 729
    invoke-virtual {v0}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public getDoubleValue()D
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 774
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/TiffField;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 779
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    return-wide v0

    .line 776
    :cond_0
    new-instance v0, Lorg/apache/sanselan/ImageReadException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Missing value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->tagInfo:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    .line 777
    invoke-virtual {v2}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getFieldTypeName()Ljava/lang/String;
    .locals 1

    .line 569
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->fieldType:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    iget-object v0, v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getIntArrayValue()[I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 662
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/TiffField;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 666
    instance-of v1, v0, Ljava/lang/Number;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    .line 667
    new-array v1, v1, [I

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    aput v0, v1, v2

    return-object v1

    .line 668
    :cond_0
    instance-of v1, v0, [Ljava/lang/Number;

    if-eqz v1, :cond_2

    .line 670
    check-cast v0, [Ljava/lang/Number;

    .line 671
    array-length v1, v0

    new-array v1, v1, [I

    .line 672
    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_1

    .line 673
    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v1

    .line 675
    :cond_2
    instance-of v1, v0, [I

    if-eqz v1, :cond_4

    .line 677
    check-cast v0, [I

    .line 678
    array-length v1, v0

    new-array v1, v1, [I

    .line 679
    :goto_1
    array-length v3, v0

    if-ge v2, v3, :cond_3

    .line 680
    aget v3, v0, v2

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    return-object v1

    .line 684
    :cond_4
    new-instance v1, Lorg/apache/sanselan/ImageReadException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown value: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " for: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->tagInfo:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    .line 685
    invoke-virtual {v0}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public getIntValue()I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 764
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/TiffField;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 769
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0

    .line 766
    :cond_0
    new-instance v0, Lorg/apache/sanselan/ImageReadException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Missing value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->tagInfo:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    .line 767
    invoke-virtual {v2}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getIntValueOrArraySum()I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 735
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/TiffField;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 739
    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_0

    .line 740
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0

    .line 741
    :cond_0
    instance-of v1, v0, [Ljava/lang/Number;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 743
    check-cast v0, [Ljava/lang/Number;

    move v1, v2

    .line 745
    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_1

    .line 746
    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    add-int/2addr v1, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1

    .line 748
    :cond_2
    instance-of v1, v0, [I

    if-eqz v1, :cond_4

    .line 750
    check-cast v0, [I

    move v1, v2

    .line 752
    :goto_1
    array-length v3, v0

    if-ge v2, v3, :cond_3

    .line 753
    aget v3, v0, v2

    add-int/2addr v1, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    return v1

    .line 757
    :cond_4
    new-instance v1, Lorg/apache/sanselan/ImageReadException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown value: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " for: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->tagInfo:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    .line 758
    invoke-virtual {v0}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public getOversizeValueElement()Lorg/apache/sanselan/formats/tiff/TiffElement;
    .locals 3

    .line 97
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->fieldType:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    invoke-virtual {v0, p0}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->isLocalValue(Lorg/apache/sanselan/formats/tiff/TiffField;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 100
    :cond_0
    new-instance v0, Lorg/apache/sanselan/formats/tiff/TiffField$OversizeValueElement;

    iget v1, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->valueOffset:I

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->oversizeValue:[B

    array-length v2, v2

    invoke-direct {v0, p0, v1, v2}, Lorg/apache/sanselan/formats/tiff/TiffField$OversizeValueElement;-><init>(Lorg/apache/sanselan/formats/tiff/TiffField;II)V

    return-object v0
.end method

.method public getSortHint()I
    .locals 1

    .line 789
    iget v0, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->sortHint:I

    return v0
.end method

.method public getStringValue()Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 582
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/TiffField;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 585
    :cond_0
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 588
    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 586
    :cond_1
    new-instance v1, Lorg/apache/sanselan/ImageReadException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Expected String value("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->tagInfo:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    .line 587
    invoke-virtual {v3}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->getDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public getTagName()Ljava/lang/String;
    .locals 2

    .line 562
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->tagInfo:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    sget-object v1, Lorg/apache/sanselan/formats/tiff/TiffField;->TIFF_TAG_UNKNOWN:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    if-ne v0, v1, :cond_0

    .line 563
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->tagInfo:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget-object v1, v1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " (0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->tag:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 564
    :cond_0
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->tagInfo:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget-object v0, v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 577
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->tagInfo:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {v0, p0}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->getValue(Lorg/apache/sanselan/formats/tiff/TiffField;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getValueDescription()Ljava/lang/String;
    .locals 3

    .line 317
    :try_start_0
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/TiffField;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/apache/sanselan/formats/tiff/TiffField;->getValueDescription(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lorg/apache/sanselan/ImageReadException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 320
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lorg/apache/sanselan/ImageReadException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isLocalValue()Z
    .locals 1

    .line 70
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->fieldType:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    invoke-virtual {v0, p0}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->isLocalValue(Lorg/apache/sanselan/formats/tiff/TiffField;)Z

    move-result v0

    return v0
.end method

.method public setOversizeValue([B)V
    .locals 0

    .line 105
    iput-object p1, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->oversizeValue:[B

    return-void
.end method

.method public setSortHint(I)V
    .locals 0

    .line 794
    iput p1, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->sortHint:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 550
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 552
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->tag:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " (0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->tag:I

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->tagInfo:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget-object v2, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->name:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 554
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/TiffField;->getValueDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->length:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->fieldType:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    iget-object v2, v2, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->name:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 557
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
