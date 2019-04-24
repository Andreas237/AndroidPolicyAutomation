.class public Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;
.super Lorg/apache/sanselan/common/ImageMetadata;
.source "TiffImageMetadata.java"

# interfaces
.implements Lorg/apache/sanselan/common/IImageMetadata$IImageMetadataItem;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/sanselan/formats/tiff/TiffImageMetadata;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Directory"
.end annotation


# instance fields
.field private final directory:Lorg/apache/sanselan/formats/tiff/TiffDirectory;

.field public final type:I


# direct methods
.method public constructor <init>(Lorg/apache/sanselan/formats/tiff/TiffDirectory;)V
    .locals 1

    .line 58
    invoke-direct {p0}, Lorg/apache/sanselan/common/ImageMetadata;-><init>()V

    .line 59
    iget v0, p1, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->type:I

    iput v0, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;->type:I

    .line 60
    iput-object p1, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;->directory:Lorg/apache/sanselan/formats/tiff/TiffDirectory;

    return-void
.end method

.method static synthetic access$000(Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;)Lorg/apache/sanselan/formats/tiff/TiffDirectory;
    .locals 0

    .line 47
    iget-object p0, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;->directory:Lorg/apache/sanselan/formats/tiff/TiffDirectory;

    return-object p0
.end method


# virtual methods
.method public add(Lorg/apache/sanselan/formats/tiff/TiffField;)V
    .locals 1

    .line 65
    new-instance v0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Item;

    invoke-direct {v0, p1}, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Item;-><init>(Lorg/apache/sanselan/formats/tiff/TiffField;)V

    invoke-virtual {p0, v0}, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;->add(Lorg/apache/sanselan/common/IImageMetadata$IImageMetadataItem;)V

    return-void
.end method

.method public findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 81
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;->directory:Lorg/apache/sanselan/formats/tiff/TiffDirectory;

    invoke-virtual {v0, p1}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object p1

    return-object p1
.end method

.method public getAllFields()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 86
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;->directory:Lorg/apache/sanselan/formats/tiff/TiffDirectory;

    invoke-virtual {v0}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->getDirectoryEntrys()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public getJpegImageData()Lorg/apache/sanselan/formats/tiff/JpegImageData;
    .locals 1

    .line 91
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;->directory:Lorg/apache/sanselan/formats/tiff/TiffDirectory;

    invoke-virtual {v0}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->getJpegImageData()Lorg/apache/sanselan/formats/tiff/JpegImageData;

    move-result-object v0

    return-object v0
.end method

.method public getOutputDirectory(I)Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 108
    :try_start_0
    new-instance v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    iget v1, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;->type:I

    invoke-direct {v0, v1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;-><init>(I)V

    .line 110
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;->getItems()Ljava/util/ArrayList;

    move-result-object v1

    const/4 v2, 0x0

    .line 111
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 114
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Item;

    .line 115
    invoke-virtual {v3}, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Item;->getTiffField()Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v3

    .line 117
    iget v4, v3, Lorg/apache/sanselan/formats/tiff/TiffField;->tag:I

    invoke-virtual {v0, v4}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->findField(I)Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    move-result-object v4

    if-eqz v4, :cond_0

    goto :goto_1

    .line 122
    :cond_0
    iget-object v4, v3, Lorg/apache/sanselan/formats/tiff/TiffField;->tagInfo:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    instance-of v4, v4, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Offset;

    if-eqz v4, :cond_1

    goto :goto_1

    .line 128
    :cond_1
    iget-object v7, v3, Lorg/apache/sanselan/formats/tiff/TiffField;->tagInfo:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    .line 129
    iget-object v8, v3, Lorg/apache/sanselan/formats/tiff/TiffField;->fieldType:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    .line 130
    iget v9, v3, Lorg/apache/sanselan/formats/tiff/TiffField;->length:I

    .line 135
    invoke-virtual {v3}, Lorg/apache/sanselan/formats/tiff/TiffField;->getValue()Ljava/lang/Object;

    move-result-object v4

    .line 139
    invoke-virtual {v7, v8, v4, p1}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->encodeValue(Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;Ljava/lang/Object;I)[B

    move-result-object v10

    .line 148
    new-instance v4, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    iget v6, v3, Lorg/apache/sanselan/formats/tiff/TiffField;->tag:I

    move-object v5, v4

    invoke-direct/range {v5 .. v10}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;-><init>(ILorg/apache/sanselan/formats/tiff/constants/TagInfo;Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;I[B)V

    .line 150
    invoke-virtual {v3}, Lorg/apache/sanselan/formats/tiff/TiffField;->getSortHint()I

    move-result v3

    invoke-virtual {v4, v3}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->setSortHint(I)V

    .line 151
    invoke-virtual {v0, v4}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->add(Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 155
    :cond_2
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;->getJpegImageData()Lorg/apache/sanselan/formats/tiff/JpegImageData;

    move-result-object p1

    invoke-virtual {v0, p1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->setJpegImageData(Lorg/apache/sanselan/formats/tiff/JpegImageData;)V
    :try_end_0
    .catch Lorg/apache/sanselan/ImageReadException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    .line 161
    new-instance v0, Lorg/apache/sanselan/ImageWriteException;

    invoke-virtual {p1}, Lorg/apache/sanselan/ImageReadException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0
.end method

.method public toString(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz p1, :cond_0

    move-object v1, p1

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;->directory:Lorg/apache/sanselan/formats/tiff/TiffDirectory;

    invoke-virtual {v1}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->description()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;->getJpegImageData()Lorg/apache/sanselan/formats/tiff/JpegImageData;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v1, " (jpegImageData)"

    goto :goto_1

    :cond_1
    const-string v1, ""

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    invoke-super {p0, p1}, Lorg/apache/sanselan/common/ImageMetadata;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\n"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
