.class public Lorg/apache/sanselan/common/ImageMetadata;
.super Ljava/lang/Object;
.source "ImageMetadata.java"

# interfaces
.implements Lorg/apache/sanselan/common/IImageMetadata;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/sanselan/common/ImageMetadata$Item;
    }
.end annotation


# static fields
.field protected static final newline:Ljava/lang/String;


# instance fields
.field private final items:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "line.separator"

    .line 42
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/apache/sanselan/common/ImageMetadata;->newline:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/apache/sanselan/common/ImageMetadata;->items:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public add(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 28
    new-instance v0, Lorg/apache/sanselan/common/ImageMetadata$Item;

    invoke-direct {v0, p1, p2}, Lorg/apache/sanselan/common/ImageMetadata$Item;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lorg/apache/sanselan/common/ImageMetadata;->add(Lorg/apache/sanselan/common/IImageMetadata$IImageMetadataItem;)V

    return-void
.end method

.method public add(Lorg/apache/sanselan/common/IImageMetadata$IImageMetadataItem;)V
    .locals 1

    .line 33
    iget-object v0, p0, Lorg/apache/sanselan/common/ImageMetadata;->items:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public getItems()Ljava/util/ArrayList;
    .locals 2

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lorg/apache/sanselan/common/ImageMetadata;->items:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 46
    invoke-virtual {p0, v0}, Lorg/apache/sanselan/common/ImageMetadata;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    if-nez p1, :cond_0

    const-string p1, ""

    .line 54
    :cond_0
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v1, 0x0

    .line 55
    :goto_0
    iget-object v2, p0, Lorg/apache/sanselan/common/ImageMetadata;->items:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    if-lez v1, :cond_1

    .line 58
    sget-object v2, Lorg/apache/sanselan/common/ImageMetadata;->newline:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 62
    :cond_1
    iget-object v2, p0, Lorg/apache/sanselan/common/ImageMetadata;->items:Ljava/util/ArrayList;

    .line 63
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/sanselan/common/IImageMetadata$IImageMetadataItem;

    .line 64
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\t"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lorg/apache/sanselan/common/IImageMetadata$IImageMetadataItem;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 70
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
