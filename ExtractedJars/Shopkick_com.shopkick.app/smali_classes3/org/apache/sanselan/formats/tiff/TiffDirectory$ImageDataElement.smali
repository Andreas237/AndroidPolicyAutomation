.class public final Lorg/apache/sanselan/formats/tiff/TiffDirectory$ImageDataElement;
.super Lorg/apache/sanselan/formats/tiff/TiffElement;
.source "TiffDirectory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/sanselan/formats/tiff/TiffDirectory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "ImageDataElement"
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/sanselan/formats/tiff/TiffDirectory;


# direct methods
.method public constructor <init>(Lorg/apache/sanselan/formats/tiff/TiffDirectory;II)V
    .locals 0

    .line 195
    iput-object p1, p0, Lorg/apache/sanselan/formats/tiff/TiffDirectory$ImageDataElement;->this$0:Lorg/apache/sanselan/formats/tiff/TiffDirectory;

    .line 196
    invoke-direct {p0, p2, p3}, Lorg/apache/sanselan/formats/tiff/TiffElement;-><init>(II)V

    return-void
.end method


# virtual methods
.method public getElementDescription(Z)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string p1, "ImageDataElement"

    return-object p1
.end method
