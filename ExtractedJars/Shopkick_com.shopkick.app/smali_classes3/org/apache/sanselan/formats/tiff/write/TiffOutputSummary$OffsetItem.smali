.class Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary$OffsetItem;
.super Ljava/lang/Object;
.source "TiffOutputSummary.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "OffsetItem"
.end annotation


# instance fields
.field public final item:Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;

.field public final itemOffsetField:Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;


# direct methods
.method public constructor <init>(Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p2, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary$OffsetItem;->itemOffsetField:Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    .line 50
    iput-object p1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary$OffsetItem;->item:Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;

    return-void
.end method
