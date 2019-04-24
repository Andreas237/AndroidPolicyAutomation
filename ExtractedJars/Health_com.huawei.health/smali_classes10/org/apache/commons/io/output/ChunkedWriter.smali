.class public Lorg/apache/commons/io/output/ChunkedWriter;
.super Ljava/io/FilterWriter;
.source "SourceFile"


# static fields
.field private static final DEFAULT_CHUNK_SIZE:I = 0x1000


# instance fields
.field private final chunkSize:I


# direct methods
.method public constructor <init>(Ljava/io/Writer;)V
    .locals 1

    .line 62
    const/16 v0, 0x1000

    invoke-direct {p0, p1, v0}, Lorg/apache/commons/io/output/ChunkedWriter;-><init>(Ljava/io/Writer;I)V

    .line 63
    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;I)V
    .locals 1

    .line 50
    invoke-direct {p0, p1}, Ljava/io/FilterWriter;-><init>(Ljava/io/Writer;)V

    .line 51
    if-gtz p2, :cond_0

    .line 52
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 54
    :cond_0
    iput p2, p0, Lorg/apache/commons/io/output/ChunkedWriter;->chunkSize:I

    .line 55
    return-void
.end method


# virtual methods
.method public write([CII)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 75
    move v1, p3

    .line 76
    move v2, p2

    .line 77
    :goto_0
    if-lez v1, :cond_0

    .line 78
    iget v0, p0, Lorg/apache/commons/io/output/ChunkedWriter;->chunkSize:I

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 79
    iget-object v0, p0, Lorg/apache/commons/io/output/ChunkedWriter;->out:Ljava/io/Writer;

    invoke-virtual {v0, p1, v2, v3}, Ljava/io/Writer;->write([CII)V

    .line 80
    sub-int/2addr v1, v3

    .line 81
    add-int/2addr v2, v3

    .line 82
    goto :goto_0

    .line 83
    :cond_0
    return-void
.end method
