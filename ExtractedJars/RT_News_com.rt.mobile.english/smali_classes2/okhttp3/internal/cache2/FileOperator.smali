.class final Lokhttp3/internal/cache2/FileOperator;
.super Ljava/lang/Object;
.source "FileOperator.java"


# instance fields
.field private final fileChannel:Ljava/nio/channels/FileChannel;


# direct methods
.method constructor <init>(Ljava/nio/channels/FileChannel;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lokhttp3/internal/cache2/FileOperator;->fileChannel:Ljava/nio/channels/FileChannel;

    return-void
.end method


# virtual methods
.method public read(JLokio/Buffer;J)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v2, p4, v0

    if-gez v2, :cond_0

    .line 60
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    :cond_0
    :goto_0
    cmp-long v2, p4, v0

    if-lez v2, :cond_1

    .line 63
    iget-object v2, p0, Lokhttp3/internal/cache2/FileOperator;->fileChannel:Ljava/nio/channels/FileChannel;

    move-wide v3, p1

    move-wide v5, p4

    move-object v7, p3

    invoke-virtual/range {v2 .. v7}, Ljava/nio/channels/FileChannel;->transferTo(JJLjava/nio/channels/WritableByteChannel;)J

    move-result-wide v2

    add-long v4, p1, v2

    sub-long p1, p4, v2

    move-wide p4, p1

    move-wide p1, v4

    goto :goto_0

    :cond_1
    return-void
.end method

.method public write(JLokio/Buffer;J)V
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-wide/16 v2, 0x0

    cmp-long v4, p4, v2

    if-ltz v4, :cond_2

    .line 45
    invoke-virtual/range {p3 .. p3}, Lokio/Buffer;->size()J

    move-result-wide v4

    cmp-long v6, p4, v4

    if-lez v6, :cond_0

    goto :goto_1

    :cond_0
    move-wide v4, p1

    move-wide/from16 v0, p4

    :goto_0
    cmp-long v6, v0, v2

    if-lez v6, :cond_1

    move-object v6, p0

    .line 48
    iget-object v7, v6, Lokhttp3/internal/cache2/FileOperator;->fileChannel:Ljava/nio/channels/FileChannel;

    move-object/from16 v8, p3

    move-wide v9, v4

    move-wide v11, v0

    invoke-virtual/range {v7 .. v12}, Ljava/nio/channels/FileChannel;->transferFrom(Ljava/nio/channels/ReadableByteChannel;JJ)J

    move-result-wide v7

    add-long v9, v4, v7

    sub-long v4, v0, v7

    move-wide v0, v4

    move-wide v4, v9

    goto :goto_0

    :cond_1
    move-object v6, p0

    return-void

    :cond_2
    :goto_1
    move-object v6, p0

    .line 45
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0
.end method
