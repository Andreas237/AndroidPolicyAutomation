.class Lorg/apache/sanselan/formats/jpeg/JpegUtils$1;
.super Ljava/lang/Object;
.source "JpegUtils.java"

# interfaces
.implements Lorg/apache/sanselan/formats/jpeg/JpegUtils$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/sanselan/formats/jpeg/JpegUtils;->dumpJFIF(Lorg/apache/sanselan/common/byteSources/ByteSource;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/sanselan/formats/jpeg/JpegUtils;


# direct methods
.method constructor <init>(Lorg/apache/sanselan/formats/jpeg/JpegUtils;)V
    .locals 0

    .line 185
    iput-object p1, p0, Lorg/apache/sanselan/formats/jpeg/JpegUtils$1;->this$0:Lorg/apache/sanselan/formats/jpeg/JpegUtils;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public beginSOS()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public visitSOS(I[B[B)V
    .locals 0

    .line 195
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "SOS marker.  "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p2, p3

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " bytes of image data."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/String;)V

    const-string p1, ""

    .line 197
    invoke-static {p1}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/String;)V

    return-void
.end method

.method public visitSOS(I[BLjava/io/InputStream;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public visitSegment(I[BI[B[B)Z
    .locals 0

    .line 209
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Segment marker: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " ("

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    invoke-static {p1}, Lorg/apache/sanselan/formats/jpeg/JpegUtils;->getMarkerName(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "), "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p5

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " bytes of segment data."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 209
    invoke-static {p1}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method
