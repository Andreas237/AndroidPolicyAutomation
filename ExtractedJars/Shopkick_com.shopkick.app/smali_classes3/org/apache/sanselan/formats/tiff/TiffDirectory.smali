.class public Lorg/apache/sanselan/formats/tiff/TiffDirectory;
.super Lorg/apache/sanselan/formats/tiff/TiffElement;
.source "TiffDirectory.java"

# interfaces
.implements Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/sanselan/formats/tiff/TiffDirectory$ImageDataElement;
    }
.end annotation


# instance fields
.field public final entries:Ljava/util/ArrayList;

.field private jpegImageData:Lorg/apache/sanselan/formats/tiff/JpegImageData;

.field public final nextDirectoryOffset:I

.field public final type:I


# direct methods
.method public constructor <init>(ILjava/util/ArrayList;II)V
    .locals 1

    .line 98
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0xc

    add-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x4

    invoke-direct {p0, p3, v0}, Lorg/apache/sanselan/formats/tiff/TiffElement;-><init>(II)V

    const/4 p3, 0x0

    .line 291
    iput-object p3, p0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->jpegImageData:Lorg/apache/sanselan/formats/tiff/JpegImageData;

    .line 101
    iput p1, p0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->type:I

    .line 102
    iput-object p2, p0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->entries:Ljava/util/ArrayList;

    .line 103
    iput p4, p0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->nextDirectoryOffset:I

    return-void
.end method

.method public static final description(I)Ljava/lang/String;
    .locals 0

    packed-switch p0, :pswitch_data_0

    const-string p0, "Bad Type"

    return-object p0

    :pswitch_0
    const-string p0, "Thumbnail"

    return-object p0

    :pswitch_1
    const-string p0, "Sub"

    return-object p0

    :pswitch_2
    const-string p0, "Root"

    return-object p0

    :pswitch_3
    const-string p0, "Unknown"

    return-object p0

    :pswitch_4
    const-string p0, "Exif"

    return-object p0

    :pswitch_5
    const-string p0, "Gps"

    return-object p0

    :pswitch_6
    const-string p0, "Interoperability"

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch -0x4
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private getRawImageDataElements(Lorg/apache/sanselan/formats/tiff/TiffField;Lorg/apache/sanselan/formats/tiff/TiffField;)Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 210
    invoke-virtual {p1}, Lorg/apache/sanselan/formats/tiff/TiffField;->getIntArrayValue()[I

    move-result-object p1

    .line 211
    invoke-virtual {p2}, Lorg/apache/sanselan/formats/tiff/TiffField;->getIntArrayValue()[I

    move-result-object p2

    .line 213
    array-length v0, p1

    array-length v1, p2

    if-ne v0, v1, :cond_1

    .line 217
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 218
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_0

    .line 220
    new-instance v2, Lorg/apache/sanselan/formats/tiff/TiffDirectory$ImageDataElement;

    aget v3, p1, v1

    aget v4, p2, v1

    invoke-direct {v2, p0, v3, v4}, Lorg/apache/sanselan/formats/tiff/TiffDirectory$ImageDataElement;-><init>(Lorg/apache/sanselan/formats/tiff/TiffDirectory;II)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    .line 214
    :cond_1
    new-instance v0, Lorg/apache/sanselan/ImageReadException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "offsets.length("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") != byteCounts.length("

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p2

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public description()Ljava/lang/String;
    .locals 1

    .line 35
    iget v0, p0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->type:I

    invoke-static {v0}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->description(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public dump()V
    .locals 2

    const/4 v0, 0x0

    .line 124
    :goto_0
    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->entries:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 126
    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->entries:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/sanselan/formats/tiff/TiffField;

    .line 127
    invoke-virtual {v1}, Lorg/apache/sanselan/formats/tiff/TiffField;->dump()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected fillInValues(Lorg/apache/sanselan/common/byteSources/ByteSource;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 114
    :goto_0
    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->entries:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 116
    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->entries:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/sanselan/formats/tiff/TiffField;

    .line 118
    invoke-virtual {v1, p1}, Lorg/apache/sanselan/formats/tiff/TiffField;->fillInValue(Lorg/apache/sanselan/common/byteSources/ByteSource;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 169
    invoke-virtual {p0, p1, v0}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;Z)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object p1

    return-object p1
.end method

.method public findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;Z)Lorg/apache/sanselan/formats/tiff/TiffField;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 175
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->entries:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const/4 v0, 0x0

    .line 178
    :goto_0
    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->entries:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_2

    .line 180
    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->entries:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/sanselan/formats/tiff/TiffField;

    .line 181
    iget v3, v2, Lorg/apache/sanselan/formats/tiff/TiffField;->tag:I

    iget v4, p1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->tag:I

    if-ne v3, v4, :cond_1

    return-object v2

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    if-nez p2, :cond_3

    return-object v1

    .line 186
    :cond_3
    new-instance p2, Lorg/apache/sanselan/ImageReadException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Missing expected field: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    invoke-virtual {p1}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->getDescription()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public getDirectoryEntrys()Ljava/util/ArrayList;
    .locals 2

    .line 108
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->entries:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getElementDescription(Z)Ljava/lang/String;
    .locals 5

    if-nez p1, :cond_0

    .line 41
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "TIFF Directory ("

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->description()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 43
    :cond_0
    iget p1, p0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->offset:I

    add-int/lit8 p1, p1, 0x2

    .line 45
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v1, 0x0

    .line 46
    :goto_0
    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->entries:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 48
    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->entries:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/sanselan/formats/tiff/TiffField;

    const-string v3, "\t"

    .line 50
    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 51
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "["

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "]: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 52
    iget-object v3, v2, Lorg/apache/sanselan/formats/tiff/TiffField;->tagInfo:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget-object v3, v3, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->name:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 53
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " ("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v2, Lorg/apache/sanselan/formats/tiff/TiffField;->tag:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", 0x"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v2, Lorg/apache/sanselan/formats/tiff/TiffField;->tag:I

    .line 54
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ")"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 53
    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 55
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ", "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v2, Lorg/apache/sanselan/formats/tiff/TiffField;->fieldType:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    iget-object v4, v4, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->name:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 56
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ", "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v2, Lorg/apache/sanselan/formats/tiff/TiffField;->fieldType:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    invoke-virtual {v4, v2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->getRawBytes(Lorg/apache/sanselan/formats/tiff/TiffField;)[B

    move-result-object v4

    array-length v4, v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 57
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ": "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lorg/apache/sanselan/formats/tiff/TiffField;->getValueDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, "\n"

    .line 59
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 p1, p1, 0xc

    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    .line 64
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getJpegImageData()Lorg/apache/sanselan/formats/tiff/JpegImageData;
    .locals 1

    .line 300
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->jpegImageData:Lorg/apache/sanselan/formats/tiff/JpegImageData;

    return-object v0
.end method

.method public getJpegRawImageDataElement()Lorg/apache/sanselan/formats/tiff/TiffDirectory$ImageDataElement;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 264
    sget-object v0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->TIFF_TAG_JPEG_INTERCHANGE_FORMAT:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {p0, v0}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v0

    .line 265
    sget-object v1, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->TIFF_TAG_JPEG_INTERCHANGE_FORMAT_LENGTH:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {p0, v1}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v1

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    .line 270
    invoke-virtual {v0}, Lorg/apache/sanselan/formats/tiff/TiffField;->getIntArrayValue()[I

    move-result-object v0

    const/4 v2, 0x0

    aget v0, v0, v2

    .line 271
    invoke-virtual {v1}, Lorg/apache/sanselan/formats/tiff/TiffField;->getIntArrayValue()[I

    move-result-object v1

    aget v1, v1, v2

    .line 273
    new-instance v2, Lorg/apache/sanselan/formats/tiff/TiffDirectory$ImageDataElement;

    invoke-direct {v2, p0, v0, v1}, Lorg/apache/sanselan/formats/tiff/TiffDirectory$ImageDataElement;-><init>(Lorg/apache/sanselan/formats/tiff/TiffDirectory;II)V

    return-object v2

    .line 276
    :cond_0
    new-instance v0, Lorg/apache/sanselan/ImageReadException;

    const-string v1, "Couldn\'t find image data."

    invoke-direct {v0, v1}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getTiffRawImageDataElements()Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 227
    sget-object v0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->TIFF_TAG_TILE_OFFSETS:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {p0, v0}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v0

    .line 228
    sget-object v1, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->TIFF_TAG_TILE_BYTE_COUNTS:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {p0, v1}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v1

    .line 229
    sget-object v2, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->TIFF_TAG_STRIP_OFFSETS:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {p0, v2}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v2

    .line 230
    sget-object v3, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->TIFF_TAG_STRIP_BYTE_COUNTS:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {p0, v3}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v3

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    .line 234
    invoke-direct {p0, v0, v1}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->getRawImageDataElements(Lorg/apache/sanselan/formats/tiff/TiffField;Lorg/apache/sanselan/formats/tiff/TiffField;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    :cond_0
    if-eqz v2, :cond_1

    if-eqz v3, :cond_1

    .line 238
    invoke-direct {p0, v2, v3}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->getRawImageDataElements(Lorg/apache/sanselan/formats/tiff/TiffField;Lorg/apache/sanselan/formats/tiff/TiffField;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    .line 241
    :cond_1
    new-instance v0, Lorg/apache/sanselan/ImageReadException;

    const-string v1, "Couldn\'t find image data."

    invoke-direct {v0, v1}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public hasJpegImageData()Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 134
    sget-object v0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->TIFF_TAG_JPEG_INTERCHANGE_FORMAT:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {p0, v0}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasTiffImageData()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 142
    sget-object v0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->TIFF_TAG_TILE_OFFSETS:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {p0, v0}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 145
    :cond_0
    sget-object v0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->TIFF_TAG_STRIP_OFFSETS:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {p0, v0}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public imageDataInStrips()Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 246
    sget-object v0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->TIFF_TAG_TILE_OFFSETS:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {p0, v0}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v0

    .line 247
    sget-object v1, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->TIFF_TAG_TILE_BYTE_COUNTS:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {p0, v1}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v1

    .line 248
    sget-object v2, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->TIFF_TAG_STRIP_OFFSETS:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {p0, v2}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v2

    .line 249
    sget-object v3, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->TIFF_TAG_STRIP_BYTE_COUNTS:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {p0, v3}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v3

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    if-eqz v2, :cond_1

    if-eqz v3, :cond_1

    return v0

    :cond_1
    if-eqz v2, :cond_2

    if-eqz v3, :cond_2

    return v0

    .line 258
    :cond_2
    new-instance v0, Lorg/apache/sanselan/ImageReadException;

    const-string v1, "Couldn\'t find image data."

    invoke-direct {v0, v1}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setJpegImageData(Lorg/apache/sanselan/formats/tiff/JpegImageData;)V
    .locals 0

    .line 295
    iput-object p1, p0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->jpegImageData:Lorg/apache/sanselan/formats/tiff/JpegImageData;

    return-void
.end method
