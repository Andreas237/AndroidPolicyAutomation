.class Lorg/apache/sanselan/formats/tiff/write/ImageDataOffsets;
.super Ljava/lang/Object;
.source "ImageDataOffsets.java"


# instance fields
.field public final imageDataOffsets:[I

.field public final imageDataOffsetsField:Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

.field public final outputItems:[Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;


# direct methods
.method public constructor <init>([Lorg/apache/sanselan/formats/tiff/TiffElement$DataElement;[ILorg/apache/sanselan/formats/tiff/write/TiffOutputField;)V
    .locals 2

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p2, p0, Lorg/apache/sanselan/formats/tiff/write/ImageDataOffsets;->imageDataOffsets:[I

    .line 32
    iput-object p3, p0, Lorg/apache/sanselan/formats/tiff/write/ImageDataOffsets;->imageDataOffsetsField:Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    .line 34
    array-length p2, p1

    new-array p2, p2, [Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;

    iput-object p2, p0, Lorg/apache/sanselan/formats/tiff/write/ImageDataOffsets;->outputItems:[Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;

    const/4 p2, 0x0

    .line 35
    :goto_0
    array-length p3, p1

    if-ge p2, p3, :cond_0

    .line 37
    new-instance p3, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;

    const-string v0, "TIFF image data"

    aget-object v1, p1, p2

    iget-object v1, v1, Lorg/apache/sanselan/formats/tiff/TiffElement$DataElement;->data:[B

    invoke-direct {p3, v0, v1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;-><init>(Ljava/lang/String;[B)V

    .line 39
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/ImageDataOffsets;->outputItems:[Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;

    aput-object p3, v0, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
