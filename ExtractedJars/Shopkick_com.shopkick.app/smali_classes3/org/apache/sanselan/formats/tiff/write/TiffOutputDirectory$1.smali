.class Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory$1;
.super Ljava/lang/Object;
.source "TiffOutputDirectory.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->sortFields()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;


# direct methods
.method constructor <init>(Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;)V
    .locals 0

    .line 99
    iput-object p1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory$1;->this$0:Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 102
    check-cast p1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    .line 103
    check-cast p2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    .line 105
    iget v0, p1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->tag:I

    iget v1, p2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->tag:I

    if-eq v0, v1, :cond_0

    .line 106
    iget p1, p1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->tag:I

    iget p2, p2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->tag:I

    sub-int/2addr p1, p2

    return p1

    .line 107
    :cond_0
    invoke-virtual {p1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->getSortHint()I

    move-result p1

    invoke-virtual {p2}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->getSortHint()I

    move-result p2

    sub-int/2addr p1, p2

    return p1
.end method
