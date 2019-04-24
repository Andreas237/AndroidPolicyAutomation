.class public Lorg/apache/sanselan/formats/tiff/TiffHeader;
.super Lorg/apache/sanselan/formats/tiff/TiffElement;
.source "TiffHeader.java"


# instance fields
.field public final byteOrder:I

.field public final offsetToFirstIFD:I

.field public final tiffVersion:I


# direct methods
.method public constructor <init>(III)V
    .locals 2

    const/4 v0, 0x0

    const/16 v1, 0x8

    .line 29
    invoke-direct {p0, v0, v1}, Lorg/apache/sanselan/formats/tiff/TiffElement;-><init>(II)V

    .line 31
    iput p1, p0, Lorg/apache/sanselan/formats/tiff/TiffHeader;->byteOrder:I

    .line 32
    iput p2, p0, Lorg/apache/sanselan/formats/tiff/TiffHeader;->tiffVersion:I

    .line 33
    iput p3, p0, Lorg/apache/sanselan/formats/tiff/TiffHeader;->offsetToFirstIFD:I

    return-void
.end method


# virtual methods
.method public getElementDescription(Z)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string p1, "TIFF Header"

    return-object p1
.end method
