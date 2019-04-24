.class public Lorg/apache/sanselan/formats/tiff/TiffContents;
.super Ljava/lang/Object;
.source "TiffContents.java"


# instance fields
.field public final directories:Ljava/util/ArrayList;

.field public final header:Lorg/apache/sanselan/formats/tiff/TiffHeader;


# direct methods
.method public constructor <init>(Lorg/apache/sanselan/formats/tiff/TiffHeader;Ljava/util/ArrayList;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lorg/apache/sanselan/formats/tiff/TiffContents;->header:Lorg/apache/sanselan/formats/tiff/TiffHeader;

    .line 34
    iput-object p2, p0, Lorg/apache/sanselan/formats/tiff/TiffContents;->directories:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public dissect(Z)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 83
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/TiffContents;->getElements()Ljava/util/ArrayList;

    move-result-object v0

    .line 85
    sget-object v1, Lorg/apache/sanselan/formats/tiff/TiffElement;->COMPARATOR:Ljava/util/Comparator;

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    .line 88
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v2, v4, :cond_3

    .line 90
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/apache/sanselan/formats/tiff/TiffElement;

    .line 92
    iget v5, v4, Lorg/apache/sanselan/formats/tiff/TiffElement;->offset:I

    if-le v5, v3, :cond_0

    .line 93
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\tgap: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, v4, Lorg/apache/sanselan/formats/tiff/TiffElement;->offset:I

    sub-int/2addr v6, v3

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/String;)V

    .line 94
    :cond_0
    iget v5, v4, Lorg/apache/sanselan/formats/tiff/TiffElement;->offset:I

    if-ge v5, v3, :cond_1

    const-string v3, "\toverlap"

    .line 95
    invoke-static {v3}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/String;)V

    .line 97
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "element, start: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, v4, Lorg/apache/sanselan/formats/tiff/TiffElement;->offset:I

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ", length: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, v4, Lorg/apache/sanselan/formats/tiff/TiffElement;->length:I

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ", end: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, v4, Lorg/apache/sanselan/formats/tiff/TiffElement;->offset:I

    iget v6, v4, Lorg/apache/sanselan/formats/tiff/TiffElement;->length:I

    add-int/2addr v5, v6

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ": "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    invoke-virtual {v4, v1}, Lorg/apache/sanselan/formats/tiff/TiffElement;->getElementDescription(Z)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 97
    invoke-static {v3}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/String;)V

    if-eqz p1, :cond_2

    const/4 v3, 0x1

    .line 103
    invoke-virtual {v4, v3}, Lorg/apache/sanselan/formats/tiff/TiffElement;->getElementDescription(Z)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 105
    invoke-static {v3}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/String;)V

    .line 108
    :cond_2
    iget v3, v4, Lorg/apache/sanselan/formats/tiff/TiffElement;->offset:I

    iget v4, v4, Lorg/apache/sanselan/formats/tiff/TiffElement;->length:I

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 110
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "end: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/String;)V

    .line 111
    invoke-static {}, Lorg/apache/sanselan/util/Debug;->debug()V

    return-void
.end method

.method public findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 69
    :goto_0
    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/TiffContents;->directories:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 71
    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/TiffContents;->directories:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/sanselan/formats/tiff/TiffDirectory;

    .line 73
    invoke-virtual {v1, p1}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/TiffField;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public getElements()Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;
        }
    .end annotation

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 41
    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/TiffContents;->header:Lorg/apache/sanselan/formats/tiff/TiffHeader;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    move v2, v1

    .line 43
    :goto_0
    iget-object v3, p0, Lorg/apache/sanselan/formats/tiff/TiffContents;->directories:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_4

    .line 45
    iget-object v3, p0, Lorg/apache/sanselan/formats/tiff/TiffContents;->directories:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/apache/sanselan/formats/tiff/TiffDirectory;

    .line 47
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    iget-object v4, v3, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->entries:Ljava/util/ArrayList;

    move v5, v1

    .line 50
    :goto_1
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v5, v6, :cond_1

    .line 52
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lorg/apache/sanselan/formats/tiff/TiffField;

    .line 53
    invoke-virtual {v6}, Lorg/apache/sanselan/formats/tiff/TiffField;->getOversizeValueElement()Lorg/apache/sanselan/formats/tiff/TiffElement;

    move-result-object v6

    if-eqz v6, :cond_0

    .line 55
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 58
    :cond_1
    invoke-virtual {v3}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->hasTiffImageData()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 59
    invoke-virtual {v3}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->getTiffRawImageDataElements()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 60
    :cond_2
    invoke-virtual {v3}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->hasJpegImageData()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 61
    invoke-virtual {v3}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->getJpegRawImageDataElement()Lorg/apache/sanselan/formats/tiff/TiffDirectory$ImageDataElement;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    return-object v0
.end method
