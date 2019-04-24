.class Lorg/apache/sanselan/formats/jpeg/JpegImageParser$1;
.super Ljava/lang/Object;
.source "JpegImageParser.java"

# interfaces
.implements Lorg/apache/sanselan/formats/jpeg/JpegUtils$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->readSegments(Lorg/apache/sanselan/common/byteSources/ByteSource;[IZZ)Ljava/util/ArrayList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/sanselan/formats/jpeg/JpegImageParser;

.field final synthetic val$markers:[I

.field final synthetic val$result:Ljava/util/ArrayList;

.field final synthetic val$returnAfterFirst:Z


# direct methods
.method constructor <init>(Lorg/apache/sanselan/formats/jpeg/JpegImageParser;[ILjava/util/ArrayList;Z)V
    .locals 0

    .line 116
    iput-object p1, p0, Lorg/apache/sanselan/formats/jpeg/JpegImageParser$1;->this$0:Lorg/apache/sanselan/formats/jpeg/JpegImageParser;

    iput-object p2, p0, Lorg/apache/sanselan/formats/jpeg/JpegImageParser$1;->val$markers:[I

    iput-object p3, p0, Lorg/apache/sanselan/formats/jpeg/JpegImageParser$1;->val$result:Ljava/util/ArrayList;

    iput-boolean p4, p0, Lorg/apache/sanselan/formats/jpeg/JpegImageParser$1;->val$returnAfterFirst:Z

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
    .locals 1
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

    .line 146
    :cond_0
    iget-object p3, p0, Lorg/apache/sanselan/formats/jpeg/JpegImageParser$1;->this$0:Lorg/apache/sanselan/formats/jpeg/JpegImageParser;

    iget-object p4, p0, Lorg/apache/sanselan/formats/jpeg/JpegImageParser$1;->val$markers:[I

    invoke-static {p3, p1, p4}, Lorg/apache/sanselan/formats/jpeg/JpegImageParser;->access$000(Lorg/apache/sanselan/formats/jpeg/JpegImageParser;I[I)Z

    move-result p3

    const/4 p4, 0x1

    if-nez p3, :cond_1

    return p4

    :cond_1
    const p3, 0xffed

    if-ne p1, p3, :cond_2

    goto :goto_0

    :cond_2
    const p3, 0xffe2

    if-ne p1, p3, :cond_3

    .line 155
    iget-object p3, p0, Lorg/apache/sanselan/formats/jpeg/JpegImageParser$1;->val$result:Ljava/util/ArrayList;

    new-instance v0, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;

    invoke-direct {v0, p1, p5}, Lorg/apache/sanselan/formats/jpeg/segments/App2Segment;-><init>(I[B)V

    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    const p3, 0xffe0

    if-ne p1, p3, :cond_4

    .line 158
    iget-object p3, p0, Lorg/apache/sanselan/formats/jpeg/JpegImageParser$1;->val$result:Ljava/util/ArrayList;

    new-instance v0, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;

    invoke-direct {v0, p1, p5}, Lorg/apache/sanselan/formats/jpeg/segments/JFIFSegment;-><init>(I[B)V

    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    const p3, 0xffc0

    if-lt p1, p3, :cond_5

    const p3, 0xffcf

    if-gt p1, p3, :cond_5

    .line 161
    iget-object p3, p0, Lorg/apache/sanselan/formats/jpeg/JpegImageParser$1;->val$result:Ljava/util/ArrayList;

    new-instance v0, Lorg/apache/sanselan/formats/jpeg/segments/SOFNSegment;

    invoke-direct {v0, p1, p5}, Lorg/apache/sanselan/formats/jpeg/segments/SOFNSegment;-><init>(I[B)V

    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    const p3, 0xffe1

    if-lt p1, p3, :cond_6

    const p3, 0xffef

    if-gt p1, p3, :cond_6

    .line 165
    iget-object p3, p0, Lorg/apache/sanselan/formats/jpeg/JpegImageParser$1;->val$result:Ljava/util/ArrayList;

    new-instance v0, Lorg/apache/sanselan/formats/jpeg/segments/UnknownSegment;

    invoke-direct {v0, p1, p5}, Lorg/apache/sanselan/formats/jpeg/segments/UnknownSegment;-><init>(I[B)V

    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    :cond_6
    :goto_0
    iget-boolean p1, p0, Lorg/apache/sanselan/formats/jpeg/JpegImageParser$1;->val$returnAfterFirst:Z

    if-eqz p1, :cond_7

    return p2

    :cond_7
    return p4
.end method
