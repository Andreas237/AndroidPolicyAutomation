.class final Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$1;
.super Ljava/lang/Object;
.source "TiffImageWriterLossless.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 251
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 254
    check-cast p1, Lorg/apache/sanselan/formats/tiff/TiffElement;

    .line 255
    check-cast p2, Lorg/apache/sanselan/formats/tiff/TiffElement;

    .line 256
    iget p1, p1, Lorg/apache/sanselan/formats/tiff/TiffElement;->length:I

    iget p2, p2, Lorg/apache/sanselan/formats/tiff/TiffElement;->length:I

    sub-int/2addr p1, p2

    return p1
.end method
