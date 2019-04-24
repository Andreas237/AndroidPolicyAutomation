.class public final Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;
.super Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;
.source "TiffOutputDirectory.java"

# interfaces
.implements Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;


# instance fields
.field private final fields:Ljava/util/ArrayList;

.field private jpegImageData:Lorg/apache/sanselan/formats/tiff/JpegImageData;

.field private nextDirectory:Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

.field public final type:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 50
    invoke-direct {p0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;-><init>()V

    .line 40
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->fields:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 42
    iput-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->nextDirectory:Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    .line 147
    iput-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->jpegImageData:Lorg/apache/sanselan/formats/tiff/JpegImageData;

    .line 51
    iput p1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->type:I

    return-void
.end method

.method private removeFieldIfPresent(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)V
    .locals 1

    .line 186
    invoke-virtual {p0, p1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 188
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->fields:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public add(Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;)V
    .locals 1

    .line 56
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->fields:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public description()Ljava/lang/String;
    .locals 1

    .line 115
    iget v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->type:I

    invoke-static {v0}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->description(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public findField(I)Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;
    .locals 3

    const/4 v0, 0x0

    .line 88
    :goto_0
    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->fields:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 90
    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->fields:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    .line 91
    iget v2, v1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->tag:I

    if-ne v2, p1, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;
    .locals 0

    .line 83
    iget p1, p1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->tag:I

    invoke-virtual {p0, p1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->findField(I)Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    move-result-object p1

    return-object p1
.end method

.method public getFields()Ljava/util/ArrayList;
    .locals 2

    .line 61
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->fields:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getItemDescription()Ljava/lang/String;
    .locals 3

    .line 179
    iget v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->type:I

    .line 180
    invoke-static {v0}, Lorg/apache/sanselan/formats/tiff/constants/TagConstantsUtils;->getExifDirectoryType(I)Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    move-result-object v0

    .line 181
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Directory: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;->name:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ("

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->type:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getItemLength()I
    .locals 1

    .line 173
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->fields:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0xc

    add-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x4

    return v0
.end method

.method protected getOutputItems(Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 196
    sget-object v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->TIFF_TAG_JPEG_INTERCHANGE_FORMAT:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-direct {p0, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->removeFieldIfPresent(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)V

    .line 197
    sget-object v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->TIFF_TAG_JPEG_INTERCHANGE_FORMAT_LENGTH:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-direct {p0, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->removeFieldIfPresent(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)V

    .line 200
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->jpegImageData:Lorg/apache/sanselan/formats/tiff/JpegImageData;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 202
    new-instance v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    sget-object v2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->TIFF_TAG_JPEG_INTERCHANGE_FORMAT:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    sget-object v3, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->FIELD_TYPE_LONG:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;

    .line 204
    invoke-static {}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->getStubLocalValue()[B

    move-result-object v4

    const/4 v5, 0x1

    invoke-direct {v0, v2, v3, v5, v4}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;-><init>(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;I[B)V

    .line 205
    invoke-virtual {p0, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->add(Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;)V

    .line 207
    sget-object v2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->FIELD_TYPE_LONG:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;

    new-array v3, v5, [I

    iget-object v4, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->jpegImageData:Lorg/apache/sanselan/formats/tiff/JpegImageData;

    iget v4, v4, Lorg/apache/sanselan/formats/tiff/JpegImageData;->length:I

    aput v4, v3, v1

    iget v4, p1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->byteOrder:I

    invoke-virtual {v2, v3, v4}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;->writeData(Ljava/lang/Object;I)[B

    move-result-object v2

    .line 211
    new-instance v3, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    sget-object v4, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->TIFF_TAG_JPEG_INTERCHANGE_FORMAT_LENGTH:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    sget-object v6, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->FIELD_TYPE_LONG:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;

    invoke-direct {v3, v4, v6, v5, v2}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;-><init>(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;I[B)V

    .line 214
    invoke-virtual {p0, v3}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->add(Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 220
    :goto_0
    sget-object v2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->TIFF_TAG_STRIP_OFFSETS:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-direct {p0, v2}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->removeFieldIfPresent(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)V

    .line 221
    sget-object v2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->TIFF_TAG_STRIP_BYTE_COUNTS:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-direct {p0, v2}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->removeFieldIfPresent(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)V

    .line 222
    sget-object v2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->TIFF_TAG_TILE_OFFSETS:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-direct {p0, v2}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->removeFieldIfPresent(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)V

    .line 223
    sget-object v2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->TIFF_TAG_TILE_BYTE_COUNTS:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-direct {p0, v2}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->removeFieldIfPresent(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)V

    .line 284
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 285
    invoke-interface {v2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 286
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->sortFields()V

    .line 288
    :goto_1
    iget-object v3, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->fields:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_2

    .line 290
    iget-object v3, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->fields:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    .line 291
    invoke-virtual {v3}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->isLocalValue()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_2

    .line 294
    :cond_1
    invoke-virtual {v3}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->getSeperateValue()Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;

    move-result-object v3

    .line 295
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 307
    :cond_2
    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->jpegImageData:Lorg/apache/sanselan/formats/tiff/JpegImageData;

    if-eqz v1, :cond_3

    .line 309
    new-instance v3, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;

    const-string v4, "JPEG image data"

    iget-object v1, v1, Lorg/apache/sanselan/formats/tiff/JpegImageData;->data:[B

    invoke-direct {v3, v4, v1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;-><init>(Ljava/lang/String;[B)V

    .line 311
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 312
    invoke-virtual {p1, v3, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->add(Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;)V

    :cond_3
    return-object v2
.end method

.method public getRawJpegImageData()Lorg/apache/sanselan/formats/tiff/JpegImageData;
    .locals 1

    .line 156
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->jpegImageData:Lorg/apache/sanselan/formats/tiff/JpegImageData;

    return-object v0
.end method

.method public removeField(I)V
    .locals 4

    .line 71
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 72
    :goto_0
    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->fields:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 74
    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->fields:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    .line 75
    iget v3, v2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->tag:I

    if-ne v3, p1, :cond_0

    .line 76
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 78
    :cond_1
    iget-object p1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->fields:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public removeField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)V
    .locals 0

    .line 66
    iget p1, p1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->tag:I

    invoke-virtual {p0, p1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->removeField(I)V

    return-void
.end method

.method public setJpegImageData(Lorg/apache/sanselan/formats/tiff/JpegImageData;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->jpegImageData:Lorg/apache/sanselan/formats/tiff/JpegImageData;

    return-void
.end method

.method public setNextDirectory(Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->nextDirectory:Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    return-void
.end method

.method public sortFields()V
    .locals 2

    .line 99
    new-instance v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory$1;

    invoke-direct {v0, p0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory$1;-><init>(Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;)V

    .line 110
    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->fields:Ljava/util/ArrayList;

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-void
.end method

.method public writeItem(Lorg/apache/sanselan/common/BinaryOutputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 122
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->fields:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->write2Bytes(I)V

    const/4 v0, 0x0

    move v1, v0

    .line 125
    :goto_0
    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->fields:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 127
    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->fields:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    .line 128
    invoke-virtual {v2, p1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->writeField(Lorg/apache/sanselan/common/BinaryOutputStream;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 137
    :cond_0
    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->nextDirectory:Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    if-eqz v1, :cond_1

    .line 138
    invoke-virtual {v1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->getOffset()I

    move-result v1

    goto :goto_1

    :cond_1
    move v1, v0

    :goto_1
    const/4 v2, -0x1

    if-ne v1, v2, :cond_2

    .line 142
    invoke-virtual {p1, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->write4Bytes(I)V

    goto :goto_2

    .line 144
    :cond_2
    invoke-virtual {p1, v1}, Lorg/apache/sanselan/common/BinaryOutputStream;->write4Bytes(I)V

    :goto_2
    return-void
.end method
