.class Lorg/apache/sanselan/formats/jpeg/JpegImageParser$2;
.super Ljava/lang/Object;
.source "JpegImageParser.java"

# interfaces
.implements Lorg/apache/sanselan/formats/jpeg/JpegUtils$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->hasExifSegment(Lorg/apache/sanselan/common/byteSources/ByteSource;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/sanselan/formats/jpeg/JpegImageParser;

.field final synthetic val$result:[Z


# direct methods
.method constructor <init>(Lorg/apache/sanselan/formats/jpeg/JpegImageParser;[Z)V
    .locals 0

    .line 415
    iput-object p1, p0, Lorg/apache/sanselan/formats/jpeg/JpegImageParser$2;->this$0:Lorg/apache/sanselan/formats/jpeg/JpegImageParser;

    iput-object p2, p0, Lorg/apache/sanselan/formats/jpeg/JpegImageParser$2;->val$result:[Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public beginSOS()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public visitSOS(I[B[B)V
    .locals 0

    return-void
.end method

.method public visitSOS(I[BLjava/io/InputStream;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public visitSegment(I[BI[B[B)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 p2, 0x0

    const p3, 0xffd9

    if-ne p1, p3, :cond_0

    return p2

    :cond_0
    const p3, 0xffe1

    const/4 p4, 0x1

    if-ne p1, p3, :cond_1

    .line 441
    sget-object p1, Lorg/apache/sanselan/formats/jpeg/JpegConstants;->EXIF_IDENTIFIER_CODE:[B

    invoke-static {p5, p1}, Lorg/apache/sanselan/common/BinaryFileParser;->byteArrayHasPrefix([B[B)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 443
    iget-object p1, p0, Lorg/apache/sanselan/formats/jpeg/JpegImageParser$2;->val$result:[Z

    aput-boolean p4, p1, p2

    return p2

    :cond_1
    return p4
.end method
