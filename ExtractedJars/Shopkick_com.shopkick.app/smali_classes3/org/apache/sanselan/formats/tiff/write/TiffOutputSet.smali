.class public final Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;
.super Ljava/lang/Object;
.source "TiffOutputSet.java"

# interfaces
.implements Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;


# static fields
.field private static final newline:Ljava/lang/String;


# instance fields
.field public final byteOrder:I

.field private final directories:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "line.separator"

    .line 280
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->newline:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x49

    .line 34
    invoke-direct {p0, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->directories:Ljava/util/ArrayList;

    .line 40
    iput p1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->byteOrder:I

    return-void
.end method


# virtual methods
.method public addDirectory(Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 62
    iget v0, p1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->type:I

    invoke-virtual {p0, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->findDirectory(I)Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    move-result-object v0

    if-nez v0, :cond_0

    .line 65
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->directories:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 63
    :cond_0
    new-instance p1, Lorg/apache/sanselan/ImageWriteException;

    const-string v0, "Output set already contains a directory of that type."

    invoke-direct {p1, v0}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addExifDirectory()Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 256
    new-instance v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    const/4 v1, -0x2

    invoke-direct {v0, v1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;-><init>(I)V

    .line 258
    invoke-virtual {p0, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->addDirectory(Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;)V

    return-object v0
.end method

.method public addGPSDirectory()Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 264
    new-instance v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    const/4 v1, -0x3

    invoke-direct {v0, v1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;-><init>(I)V

    .line 265
    invoke-virtual {p0, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->addDirectory(Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;)V

    return-object v0
.end method

.method public addInteroperabilityDirectory()Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 272
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->getOrCreateExifDirectory()Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    .line 274
    new-instance v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    const/4 v1, -0x4

    invoke-direct {v0, v1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;-><init>(I)V

    .line 276
    invoke-virtual {p0, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->addDirectory(Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;)V

    return-object v0
.end method

.method public addRootDirectory()Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 248
    new-instance v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;-><init>(I)V

    .line 250
    invoke-virtual {p0, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->addDirectory(Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;)V

    return-object v0
.end method

.method public dump()V
    .locals 1

    .line 330
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/String;)V

    return-void
.end method

.method public findDirectory(I)Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;
    .locals 3

    const/4 v0, 0x0

    .line 128
    :goto_0
    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->directories:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 130
    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->directories:Ljava/util/ArrayList;

    .line 131
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    .line 132
    iget v2, v1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->type:I

    if-ne v2, p1, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public findField(I)Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;
    .locals 2

    const/4 v0, 0x0

    .line 235
    :goto_0
    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->directories:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 237
    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->directories:Ljava/util/ArrayList;

    .line 238
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    .line 239
    invoke-virtual {v1, p1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->findField(I)Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

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

.method public findField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;
    .locals 0

    .line 230
    iget p1, p1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->tag:I

    invoke-virtual {p0, p1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->findField(I)Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    move-result-object p1

    return-object p1
.end method

.method public getDirectories()Ljava/util/List;
    .locals 2

    .line 70
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->directories:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getExifDirectory()Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;
    .locals 1

    const/4 v0, -0x2

    .line 80
    invoke-virtual {p0, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->findDirectory(I)Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    move-result-object v0

    return-object v0
.end method

.method public getGPSDirectory()Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;
    .locals 1

    const/4 v0, -0x3

    .line 118
    invoke-virtual {p0, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->findDirectory(I)Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    move-result-object v0

    return-object v0
.end method

.method public getInteroperabilityDirectory()Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;
    .locals 1

    const/4 v0, -0x4

    .line 123
    invoke-virtual {p0, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->findDirectory(I)Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    move-result-object v0

    return-object v0
.end method

.method public getOrCreateExifDirectory()Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 96
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->getOrCreateRootDirectory()Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    const/4 v0, -0x2

    .line 98
    invoke-virtual {p0, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->findDirectory(I)Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 101
    :cond_0
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->addExifDirectory()Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    move-result-object v0

    return-object v0
.end method

.method public getOrCreateGPSDirectory()Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 108
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->getOrCreateExifDirectory()Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    const/4 v0, -0x3

    .line 110
    invoke-virtual {p0, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->findDirectory(I)Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 113
    :cond_0
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->addGPSDirectory()Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    move-result-object v0

    return-object v0
.end method

.method public getOrCreateRootDirectory()Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 86
    invoke-virtual {p0, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->findDirectory(I)Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 89
    :cond_0
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->addRootDirectory()Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    move-result-object v0

    return-object v0
.end method

.method protected getOutputItems(Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 48
    :goto_0
    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->directories:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 50
    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->directories:Ljava/util/ArrayList;

    .line 51
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    .line 53
    invoke-virtual {v2, p1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->getOutputItems(Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public getRootDirectory()Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;
    .locals 1

    const/4 v0, 0x0

    .line 75
    invoke-virtual {p0, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->findDirectory(I)Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    move-result-object v0

    return-object v0
.end method

.method public removeField(I)V
    .locals 2

    const/4 v0, 0x0

    .line 220
    :goto_0
    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->directories:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 222
    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->directories:Ljava/util/ArrayList;

    .line 223
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    .line 224
    invoke-virtual {v1, p1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->removeField(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public removeField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)V
    .locals 0

    .line 215
    iget p1, p1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->tag:I

    invoke-virtual {p0, p1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->removeField(I)V

    return-void
.end method

.method public setGPSInDegrees(DD)V
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    move-object/from16 v0, p0

    .line 148
    invoke-virtual/range {p0 .. p0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->getOrCreateGPSDirectory()Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    move-result-object v1

    const-wide/16 v2, 0x0

    cmpg-double v4, p1, v2

    if-gez v4, :cond_0

    const-string v4, "W"

    goto :goto_0

    :cond_0
    const-string v4, "E"

    .line 151
    :goto_0
    invoke-static/range {p1 .. p2}, Ljava/lang/Math;->abs(D)D

    move-result-wide v5

    cmpg-double v2, p3, v2

    if-gez v2, :cond_1

    const-string v2, "S"

    goto :goto_1

    :cond_1
    const-string v2, "N"

    .line 153
    :goto_1
    invoke-static/range {p3 .. p4}, Ljava/lang/Math;->abs(D)D

    move-result-wide v7

    .line 156
    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;->GPS_TAG_GPS_LONGITUDE_REF:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget v9, v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->byteOrder:I

    invoke-static {v3, v9, v4}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->create(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;ILjava/lang/String;)Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    move-result-object v3

    .line 159
    sget-object v4, Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;->GPS_TAG_GPS_LONGITUDE_REF:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {v1, v4}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->removeField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)V

    .line 160
    invoke-virtual {v1, v3}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->add(Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;)V

    .line 164
    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;->GPS_TAG_GPS_LATITUDE_REF:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget v4, v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->byteOrder:I

    invoke-static {v3, v4, v2}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->create(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;ILjava/lang/String;)Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    move-result-object v2

    .line 167
    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;->GPS_TAG_GPS_LATITUDE_REF:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {v1, v3}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->removeField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)V

    .line 168
    invoke-virtual {v1, v2}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->add(Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;)V

    double-to-long v2, v5

    long-to-double v2, v2

    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    rem-double/2addr v5, v9

    const-wide/high16 v11, 0x404e000000000000L    # 60.0

    mul-double/2addr v5, v11

    double-to-long v13, v5

    long-to-double v13, v13

    rem-double/2addr v5, v9

    mul-double/2addr v5, v11

    const/4 v4, 0x3

    .line 180
    new-array v15, v4, [Ljava/lang/Double;

    new-instance v4, Ljava/lang/Double;

    invoke-direct {v4, v2, v3}, Ljava/lang/Double;-><init>(D)V

    const/4 v2, 0x0

    aput-object v4, v15, v2

    new-instance v3, Ljava/lang/Double;

    invoke-direct {v3, v13, v14}, Ljava/lang/Double;-><init>(D)V

    const/4 v4, 0x1

    aput-object v3, v15, v4

    new-instance v3, Ljava/lang/Double;

    invoke-direct {v3, v5, v6}, Ljava/lang/Double;-><init>(D)V

    const/4 v5, 0x2

    aput-object v3, v15, v5

    .line 185
    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;->GPS_TAG_GPS_LONGITUDE:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget v6, v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->byteOrder:I

    invoke-static {v3, v6, v15}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->create(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;I[Ljava/lang/Number;)Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    move-result-object v3

    .line 187
    sget-object v6, Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;->GPS_TAG_GPS_LONGITUDE:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {v1, v6}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->removeField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)V

    .line 188
    invoke-virtual {v1, v3}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->add(Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;)V

    double-to-long v13, v7

    long-to-double v13, v13

    rem-double/2addr v7, v9

    mul-double/2addr v7, v11

    double-to-long v5, v7

    long-to-double v5, v5

    rem-double/2addr v7, v9

    mul-double/2addr v7, v11

    const/4 v3, 0x3

    .line 200
    new-array v3, v3, [Ljava/lang/Double;

    new-instance v9, Ljava/lang/Double;

    invoke-direct {v9, v13, v14}, Ljava/lang/Double;-><init>(D)V

    aput-object v9, v3, v2

    new-instance v2, Ljava/lang/Double;

    invoke-direct {v2, v5, v6}, Ljava/lang/Double;-><init>(D)V

    aput-object v2, v3, v4

    new-instance v2, Ljava/lang/Double;

    invoke-direct {v2, v7, v8}, Ljava/lang/Double;-><init>(D)V

    const/4 v4, 0x2

    aput-object v2, v3, v4

    .line 205
    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;->GPS_TAG_GPS_LATITUDE:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget v4, v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->byteOrder:I

    invoke-static {v2, v4, v3}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->create(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;I[Ljava/lang/Number;)Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    move-result-object v2

    .line 207
    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;->GPS_TAG_GPS_LATITUDE:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {v1, v3}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->removeField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)V

    .line 208
    invoke-virtual {v1, v2}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->add(Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 284
    invoke-virtual {p0, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    if-nez p1, :cond_0

    const-string p1, ""

    .line 292
    :cond_0
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 294
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, "TiffOutputSet {"

    .line 295
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 296
    sget-object v1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->newline:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 298
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 299
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "byteOrder: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->byteOrder:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 300
    sget-object v1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->newline:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const/4 v1, 0x0

    move v2, v1

    .line 302
    :goto_0
    iget-object v3, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->directories:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 304
    iget-object v3, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->directories:Ljava/util/ArrayList;

    .line 305
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    .line 306
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 307
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\tdirectory "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ": "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    invoke-virtual {v3}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->description()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " ("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, v3, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->type:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ")"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 307
    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 309
    sget-object v4, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->newline:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 311
    invoke-virtual {v3}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->getFields()Ljava/util/ArrayList;

    move-result-object v3

    move v4, v1

    .line 312
    :goto_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_1

    .line 314
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    .line 315
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 316
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "\t\tfield "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, ": "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v5, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->tagInfo:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 317
    sget-object v5, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->newline:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 321
    :cond_2
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p1, "}"

    .line 322
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 323
    sget-object p1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->newline:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 325
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
