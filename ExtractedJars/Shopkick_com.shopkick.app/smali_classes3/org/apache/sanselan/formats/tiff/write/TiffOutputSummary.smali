.class Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;
.super Ljava/lang/Object;
.source "TiffOutputSummary.java"

# interfaces
.implements Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary$OffsetItem;
    }
.end annotation


# instance fields
.field public final byteOrder:I

.field public final directoryTypeMap:Ljava/util/Map;

.field private imageDataItems:Ljava/util/List;

.field private offsetItems:Ljava/util/List;

.field public final rootDirectory:Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;


# direct methods
.method public constructor <init>(ILorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;Ljava/util/Map;)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->offsetItems:Ljava/util/List;

    .line 90
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->imageDataItems:Ljava/util/List;

    .line 35
    iput p1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->byteOrder:I

    .line 36
    iput-object p2, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->rootDirectory:Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    .line 37
    iput-object p3, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->directoryTypeMap:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public add(Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;)V
    .locals 2

    .line 59
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->offsetItems:Ljava/util/List;

    new-instance v1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary$OffsetItem;

    invoke-direct {v1, p1, p2}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary$OffsetItem;-><init>(Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addTiffImageData(Lorg/apache/sanselan/formats/tiff/write/ImageDataOffsets;)V
    .locals 1

    .line 94
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->imageDataItems:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public updateOffsets(I)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    const/4 v0, 0x0

    move v1, v0

    .line 64
    :goto_0
    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->offsetItems:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 66
    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->offsetItems:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary$OffsetItem;

    .line 68
    sget-object v3, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->FIELD_TYPE_LONG:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;

    const/4 v4, 0x1

    new-array v4, v4, [I

    iget-object v5, v2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary$OffsetItem;->item:Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;

    .line 69
    invoke-virtual {v5}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;->getOffset()I

    move-result v5

    aput v5, v4, v0

    .line 68
    invoke-virtual {v3, v4, p1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;->writeData(Ljava/lang/Object;I)[B

    move-result-object v3

    .line 71
    iget-object v2, v2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary$OffsetItem;->itemOffsetField:Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    invoke-virtual {v2, v3}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->setData([B)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    .line 74
    :goto_1
    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->imageDataItems:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 76
    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->imageDataItems:Ljava/util/List;

    .line 77
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/sanselan/formats/tiff/write/ImageDataOffsets;

    move v3, v0

    .line 79
    :goto_2
    iget-object v4, v2, Lorg/apache/sanselan/formats/tiff/write/ImageDataOffsets;->outputItems:[Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;

    array-length v4, v4

    if-ge v3, v4, :cond_1

    .line 81
    iget-object v4, v2, Lorg/apache/sanselan/formats/tiff/write/ImageDataOffsets;->outputItems:[Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;

    aget-object v4, v4, v3

    .line 82
    iget-object v5, v2, Lorg/apache/sanselan/formats/tiff/write/ImageDataOffsets;->imageDataOffsets:[I

    invoke-virtual {v4}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;->getOffset()I

    move-result v4

    aput v4, v5, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 85
    :cond_1
    iget-object v3, v2, Lorg/apache/sanselan/formats/tiff/write/ImageDataOffsets;->imageDataOffsetsField:Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    sget-object v4, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->FIELD_TYPE_LONG:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;

    iget-object v2, v2, Lorg/apache/sanselan/formats/tiff/write/ImageDataOffsets;->imageDataOffsets:[I

    .line 86
    invoke-virtual {v4, v2, p1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;->writeData(Ljava/lang/Object;I)[B

    move-result-object v2

    .line 85
    invoke-virtual {v3, v2}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->setData([B)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method
