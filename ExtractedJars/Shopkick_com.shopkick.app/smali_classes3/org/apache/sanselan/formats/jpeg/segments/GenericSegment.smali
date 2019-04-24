.class public abstract Lorg/apache/sanselan/formats/jpeg/segments/GenericSegment;
.super Lorg/apache/sanselan/formats/jpeg/segments/Segment;
.source "GenericSegment.java"


# instance fields
.field public final bytes:[B


# direct methods
.method public constructor <init>(IILjava/io/InputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 32
    invoke-direct {p0, p1, p2}, Lorg/apache/sanselan/formats/jpeg/segments/Segment;-><init>(II)V

    const-string p1, "Segment Data"

    const-string v0, "Invalid Segment: insufficient data"

    .line 34
    invoke-virtual {p0, p1, p2, p3, v0}, Lorg/apache/sanselan/formats/jpeg/segments/GenericSegment;->readByteArray(Ljava/lang/String;ILjava/io/InputStream;Ljava/lang/String;)[B

    move-result-object p1

    iput-object p1, p0, Lorg/apache/sanselan/formats/jpeg/segments/GenericSegment;->bytes:[B

    return-void
.end method

.method public constructor <init>(I[B)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 41
    array-length v0, p2

    invoke-direct {p0, p1, v0}, Lorg/apache/sanselan/formats/jpeg/segments/Segment;-><init>(II)V

    .line 43
    iput-object p2, p0, Lorg/apache/sanselan/formats/jpeg/segments/GenericSegment;->bytes:[B

    return-void
.end method


# virtual methods
.method public dump(Ljava/io/PrintWriter;)V
    .locals 1

    const/4 v0, 0x0

    .line 48
    invoke-virtual {p0, p1, v0}, Lorg/apache/sanselan/formats/jpeg/segments/GenericSegment;->dump(Ljava/io/PrintWriter;I)V

    return-void
.end method

.method public dump(Ljava/io/PrintWriter;I)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x32

    if-ge v0, v1, :cond_0

    add-int v1, v0, p2

    .line 53
    iget-object v2, p0, Lorg/apache/sanselan/formats/jpeg/segments/GenericSegment;->bytes:[B

    array-length v2, v2

    if-ge v1, v2, :cond_0

    .line 55
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\t"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lorg/apache/sanselan/formats/jpeg/segments/GenericSegment;->bytes:[B

    aget-byte v1, v3, v1

    invoke-virtual {p0, p1, v2, v1}, Lorg/apache/sanselan/formats/jpeg/segments/GenericSegment;->debugNumber(Ljava/io/PrintWriter;Ljava/lang/String;I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
