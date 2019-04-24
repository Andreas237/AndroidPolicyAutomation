.class Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;
.super Ljava/lang/Object;
.source "TiffReader.java"

# interfaces
.implements Lorg/apache/sanselan/formats/tiff/TiffReader$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/sanselan/formats/tiff/TiffReader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Collector"
.end annotation


# instance fields
.field private directories:Ljava/util/ArrayList;

.field private fields:Ljava/util/ArrayList;

.field private final readThumbnails:Z

.field private tiffHeader:Lorg/apache/sanselan/formats/tiff/TiffHeader;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 318
    invoke-direct {p0, v0}, Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;-><init>(Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 2

    .line 322
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 311
    iput-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;->tiffHeader:Lorg/apache/sanselan/formats/tiff/TiffHeader;

    .line 312
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;->directories:Ljava/util/ArrayList;

    .line 313
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;->fields:Ljava/util/ArrayList;

    if-eqz p1, :cond_0

    const-string v0, "READ_THUMBNAILS"

    .line 324
    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 325
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v1, "READ_THUMBNAILS"

    .line 326
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 325
    invoke-virtual {v0, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    .line 327
    :goto_0
    iput-boolean p1, p0, Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;->readThumbnails:Z

    return-void
.end method


# virtual methods
.method public addDirectory(Lorg/apache/sanselan/formats/tiff/TiffDirectory;)Z
    .locals 1

    .line 338
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;->directories:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public addField(Lorg/apache/sanselan/formats/tiff/TiffField;)Z
    .locals 1

    .line 344
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;->fields:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public getContents()Lorg/apache/sanselan/formats/tiff/TiffContents;
    .locals 3

    .line 360
    new-instance v0, Lorg/apache/sanselan/formats/tiff/TiffContents;

    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;->tiffHeader:Lorg/apache/sanselan/formats/tiff/TiffHeader;

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;->directories:Ljava/util/ArrayList;

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/formats/tiff/TiffContents;-><init>(Lorg/apache/sanselan/formats/tiff/TiffHeader;Ljava/util/ArrayList;)V

    return-object v0
.end method

.method public readImageData()Z
    .locals 1

    .line 350
    iget-boolean v0, p0, Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;->readThumbnails:Z

    return v0
.end method

.method public readOffsetDirectories()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public setTiffHeader(Lorg/apache/sanselan/formats/tiff/TiffHeader;)Z
    .locals 0

    .line 332
    iput-object p1, p0, Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;->tiffHeader:Lorg/apache/sanselan/formats/tiff/TiffHeader;

    const/4 p1, 0x1

    return p1
.end method
