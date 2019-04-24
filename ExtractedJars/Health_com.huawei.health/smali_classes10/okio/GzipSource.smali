.class public final Lokio/GzipSource;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokio/Source;


# static fields
.field private static final FCOMMENT:B = 0x4t

.field private static final FEXTRA:B = 0x2t

.field private static final FHCRC:B = 0x1t

.field private static final FNAME:B = 0x3t

.field private static final SECTION_BODY:B = 0x1t

.field private static final SECTION_DONE:B = 0x3t

.field private static final SECTION_HEADER:B = 0x0t

.field private static final SECTION_TRAILER:B = 0x2t


# instance fields
.field private final crc:Ljava/util/zip/CRC32;

.field private final inflater:Ljava/util/zip/Inflater;

.field private final inflaterSource:Lokio/InflaterSource;

.field private section:I

.field private final source:Lokio/BufferedSource;


# direct methods
.method public constructor <init>(Lokio/Source;)V
    .locals 3

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    const/4 v0, 0x0

    iput v0, p0, Lokio/GzipSource;->section:I

    .line 58
    new-instance v0, Ljava/util/zip/CRC32;

    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    iput-object v0, p0, Lokio/GzipSource;->crc:Ljava/util/zip/CRC32;

    .line 61
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "source == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 62
    :cond_0
    new-instance v0, Ljava/util/zip/Inflater;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    iput-object v0, p0, Lokio/GzipSource;->inflater:Ljava/util/zip/Inflater;

    .line 63
    invoke-static {p1}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    move-result-object v0

    iput-object v0, p0, Lokio/GzipSource;->source:Lokio/BufferedSource;

    .line 64
    new-instance v0, Lokio/InflaterSource;

    iget-object v1, p0, Lokio/GzipSource;->source:Lokio/BufferedSource;

    iget-object v2, p0, Lokio/GzipSource;->inflater:Ljava/util/zip/Inflater;

    invoke-direct {v0, v1, v2}, Lokio/InflaterSource;-><init>(Lokio/BufferedSource;Ljava/util/zip/Inflater;)V

    iput-object v0, p0, Lokio/GzipSource;->inflaterSource:Lokio/InflaterSource;

    .line 65
    return-void
.end method

.method private checkEqual(Ljava/lang/String;II)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 204
    if-eq p3, p2, :cond_0

    .line 205
    new-instance v0, Ljava/io/IOException;

    const-string v1, "%s: actual 0x%08x != expected 0x%08x"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    .line 206
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    .line 205
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 208
    :cond_0
    return-void
.end method

.method private consumeHeader()V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 114
    iget-object v0, p0, Lokio/GzipSource;->source:Lokio/BufferedSource;

    const-wide/16 v1, 0xa

    invoke-interface {v0, v1, v2}, Lokio/BufferedSource;->require(J)V

    .line 115
    iget-object v0, p0, Lokio/GzipSource;->source:Lokio/BufferedSource;

    invoke-interface {v0}, Lokio/BufferedSource;->buffer()Lokio/Buffer;

    move-result-object v0

    const-wide/16 v1, 0x3

    invoke-virtual {v0, v1, v2}, Lokio/Buffer;->getByte(J)B

    move-result v6

    .line 116
    shr-int/lit8 v0, v6, 0x1

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v7, 0x1

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    .line 117
    :goto_0
    if-eqz v7, :cond_1

    move-object v0, p0

    iget-object v1, p0, Lokio/GzipSource;->source:Lokio/BufferedSource;

    invoke-interface {v1}, Lokio/BufferedSource;->buffer()Lokio/Buffer;

    move-result-object v1

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0xa

    invoke-direct/range {v0 .. v5}, Lokio/GzipSource;->updateCrc(Lokio/Buffer;JJ)V

    .line 119
    :cond_1
    iget-object v0, p0, Lokio/GzipSource;->source:Lokio/BufferedSource;

    invoke-interface {v0}, Lokio/BufferedSource;->readShort()S

    move-result v8

    .line 120
    const-string v0, "ID1ID2"

    const/16 v1, 0x1f8b

    invoke-direct {p0, v0, v1, v8}, Lokio/GzipSource;->checkEqual(Ljava/lang/String;II)V

    .line 121
    iget-object v0, p0, Lokio/GzipSource;->source:Lokio/BufferedSource;

    const-wide/16 v1, 0x8

    invoke-interface {v0, v1, v2}, Lokio/BufferedSource;->skip(J)V

    .line 127
    shr-int/lit8 v0, v6, 0x2

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 128
    iget-object v0, p0, Lokio/GzipSource;->source:Lokio/BufferedSource;

    const-wide/16 v1, 0x2

    invoke-interface {v0, v1, v2}, Lokio/BufferedSource;->require(J)V

    .line 129
    if-eqz v7, :cond_2

    move-object v0, p0

    iget-object v1, p0, Lokio/GzipSource;->source:Lokio/BufferedSource;

    invoke-interface {v1}, Lokio/BufferedSource;->buffer()Lokio/Buffer;

    move-result-object v1

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x2

    invoke-direct/range {v0 .. v5}, Lokio/GzipSource;->updateCrc(Lokio/Buffer;JJ)V

    .line 130
    :cond_2
    iget-object v0, p0, Lokio/GzipSource;->source:Lokio/BufferedSource;

    invoke-interface {v0}, Lokio/BufferedSource;->buffer()Lokio/Buffer;

    move-result-object v0

    invoke-virtual {v0}, Lokio/Buffer;->readShortLe()S

    move-result v9

    .line 131
    iget-object v0, p0, Lokio/GzipSource;->source:Lokio/BufferedSource;

    int-to-long v1, v9

    invoke-interface {v0, v1, v2}, Lokio/BufferedSource;->require(J)V

    .line 132
    if-eqz v7, :cond_3

    move-object v0, p0

    iget-object v1, p0, Lokio/GzipSource;->source:Lokio/BufferedSource;

    invoke-interface {v1}, Lokio/BufferedSource;->buffer()Lokio/Buffer;

    move-result-object v1

    int-to-long v4, v9

    const-wide/16 v2, 0x0

    invoke-direct/range {v0 .. v5}, Lokio/GzipSource;->updateCrc(Lokio/Buffer;JJ)V

    .line 133
    :cond_3
    iget-object v0, p0, Lokio/GzipSource;->source:Lokio/BufferedSource;

    int-to-long v1, v9

    invoke-interface {v0, v1, v2}, Lokio/BufferedSource;->skip(J)V

    .line 140
    :cond_4
    shr-int/lit8 v0, v6, 0x3

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_7

    .line 141
    iget-object v0, p0, Lokio/GzipSource;->source:Lokio/BufferedSource;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lokio/BufferedSource;->indexOf(B)J

    move-result-wide v9

    .line 142
    const-wide/16 v0, -0x1

    cmp-long v0, v9, v0

    if-nez v0, :cond_5

    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    .line 143
    :cond_5
    if-eqz v7, :cond_6

    move-object v0, p0

    iget-object v1, p0, Lokio/GzipSource;->source:Lokio/BufferedSource;

    invoke-interface {v1}, Lokio/BufferedSource;->buffer()Lokio/Buffer;

    move-result-object v1

    const-wide/16 v2, 0x1

    add-long v4, v9, v2

    const-wide/16 v2, 0x0

    invoke-direct/range {v0 .. v5}, Lokio/GzipSource;->updateCrc(Lokio/Buffer;JJ)V

    .line 144
    :cond_6
    iget-object v0, p0, Lokio/GzipSource;->source:Lokio/BufferedSource;

    const-wide/16 v1, 0x1

    add-long/2addr v1, v9

    invoke-interface {v0, v1, v2}, Lokio/BufferedSource;->skip(J)V

    .line 151
    :cond_7
    shr-int/lit8 v0, v6, 0x4

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_a

    .line 152
    iget-object v0, p0, Lokio/GzipSource;->source:Lokio/BufferedSource;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lokio/BufferedSource;->indexOf(B)J

    move-result-wide v9

    .line 153
    const-wide/16 v0, -0x1

    cmp-long v0, v9, v0

    if-nez v0, :cond_8

    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    .line 154
    :cond_8
    if-eqz v7, :cond_9

    move-object v0, p0

    iget-object v1, p0, Lokio/GzipSource;->source:Lokio/BufferedSource;

    invoke-interface {v1}, Lokio/BufferedSource;->buffer()Lokio/Buffer;

    move-result-object v1

    const-wide/16 v2, 0x1

    add-long v4, v9, v2

    const-wide/16 v2, 0x0

    invoke-direct/range {v0 .. v5}, Lokio/GzipSource;->updateCrc(Lokio/Buffer;JJ)V

    .line 155
    :cond_9
    iget-object v0, p0, Lokio/GzipSource;->source:Lokio/BufferedSource;

    const-wide/16 v1, 0x1

    add-long/2addr v1, v9

    invoke-interface {v0, v1, v2}, Lokio/BufferedSource;->skip(J)V

    .line 162
    :cond_a
    if-eqz v7, :cond_b

    .line 163
    const-string v0, "FHCRC"

    iget-object v1, p0, Lokio/GzipSource;->source:Lokio/BufferedSource;

    invoke-interface {v1}, Lokio/BufferedSource;->readShortLe()S

    move-result v1

    iget-object v2, p0, Lokio/GzipSource;->crc:Ljava/util/zip/CRC32;

    invoke-virtual {v2}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v2

    long-to-int v2, v2

    int-to-short v2, v2

    invoke-direct {p0, v0, v1, v2}, Lokio/GzipSource;->checkEqual(Ljava/lang/String;II)V

    .line 164
    iget-object v0, p0, Lokio/GzipSource;->crc:Ljava/util/zip/CRC32;

    invoke-virtual {v0}, Ljava/util/zip/CRC32;->reset()V

    .line 166
    :cond_b
    return-void
.end method

.method private consumeTrailer()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 173
    const-string v0, "CRC"

    iget-object v1, p0, Lokio/GzipSource;->source:Lokio/BufferedSource;

    invoke-interface {v1}, Lokio/BufferedSource;->readIntLe()I

    move-result v1

    iget-object v2, p0, Lokio/GzipSource;->crc:Ljava/util/zip/CRC32;

    invoke-virtual {v2}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v2

    long-to-int v2, v2

    invoke-direct {p0, v0, v1, v2}, Lokio/GzipSource;->checkEqual(Ljava/lang/String;II)V

    .line 174
    const-string v0, "ISIZE"

    iget-object v1, p0, Lokio/GzipSource;->source:Lokio/BufferedSource;

    invoke-interface {v1}, Lokio/BufferedSource;->readIntLe()I

    move-result v1

    iget-object v2, p0, Lokio/GzipSource;->inflater:Ljava/util/zip/Inflater;

    invoke-virtual {v2}, Ljava/util/zip/Inflater;->getTotalOut()I

    move-result v2

    invoke-direct {p0, v0, v1, v2}, Lokio/GzipSource;->checkEqual(Ljava/lang/String;II)V

    .line 175
    return-void
.end method

.method private updateCrc(Lokio/Buffer;JJ)V
    .locals 5

    .line 188
    iget-object v2, p1, Lokio/Buffer;->head:Lokio/Segment;

    .line 189
    :goto_0
    iget v0, v2, Lokio/Segment;->limit:I

    iget v1, v2, Lokio/Segment;->pos:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    cmp-long v0, p2, v0

    if-ltz v0, :cond_0

    .line 190
    iget v0, v2, Lokio/Segment;->limit:I

    iget v1, v2, Lokio/Segment;->pos:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    sub-long/2addr p2, v0

    .line 189
    iget-object v2, v2, Lokio/Segment;->next:Lokio/Segment;

    goto :goto_0

    .line 194
    :cond_0
    :goto_1
    const-wide/16 v0, 0x0

    cmp-long v0, p4, v0

    if-lez v0, :cond_1

    .line 195
    iget v0, v2, Lokio/Segment;->pos:I

    int-to-long v0, v0

    add-long/2addr v0, p2

    long-to-int v3, v0

    .line 196
    iget v0, v2, Lokio/Segment;->limit:I

    sub-int/2addr v0, v3

    int-to-long v0, v0

    invoke-static {v0, v1, p4, p5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v4, v0

    .line 197
    iget-object v0, p0, Lokio/GzipSource;->crc:Ljava/util/zip/CRC32;

    iget-object v1, v2, Lokio/Segment;->data:[B

    invoke-virtual {v0, v1, v3, v4}, Ljava/util/zip/CRC32;->update([BII)V

    .line 198
    int-to-long v0, v4

    sub-long/2addr p4, v0

    .line 199
    const-wide/16 p2, 0x0

    .line 194
    iget-object v2, v2, Lokio/Segment;->next:Lokio/Segment;

    goto :goto_1

    .line 201
    :cond_1
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 182
    iget-object v0, p0, Lokio/GzipSource;->inflaterSource:Lokio/InflaterSource;

    invoke-virtual {v0}, Lokio/InflaterSource;->close()V

    .line 183
    return-void
.end method

.method public read(Lokio/Buffer;J)J
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 68
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-gez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "byteCount < 0: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 69
    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-nez v0, :cond_1

    const-wide/16 v0, 0x0

    return-wide v0

    .line 72
    :cond_1
    iget v0, p0, Lokio/GzipSource;->section:I

    if-nez v0, :cond_2

    .line 73
    invoke-direct {p0}, Lokio/GzipSource;->consumeHeader()V

    .line 74
    const/4 v0, 0x1

    iput v0, p0, Lokio/GzipSource;->section:I

    .line 78
    :cond_2
    iget v0, p0, Lokio/GzipSource;->section:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 79
    iget-wide v6, p1, Lokio/Buffer;->size:J

    .line 80
    iget-object v0, p0, Lokio/GzipSource;->inflaterSource:Lokio/InflaterSource;

    invoke-virtual {v0, p1, p2, p3}, Lokio/InflaterSource;->read(Lokio/Buffer;J)J

    move-result-wide v8

    .line 81
    const-wide/16 v0, -0x1

    cmp-long v0, v8, v0

    if-eqz v0, :cond_3

    .line 82
    move-object v0, p0

    move-object v1, p1

    move-wide v2, v6

    move-wide v4, v8

    invoke-direct/range {v0 .. v5}, Lokio/GzipSource;->updateCrc(Lokio/Buffer;JJ)V

    .line 83
    return-wide v8

    .line 85
    :cond_3
    const/4 v0, 0x2

    iput v0, p0, Lokio/GzipSource;->section:I

    .line 91
    :cond_4
    iget v0, p0, Lokio/GzipSource;->section:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_5

    .line 92
    invoke-direct {p0}, Lokio/GzipSource;->consumeTrailer()V

    .line 93
    const/4 v0, 0x3

    iput v0, p0, Lokio/GzipSource;->section:I

    .line 99
    iget-object v0, p0, Lokio/GzipSource;->source:Lokio/BufferedSource;

    invoke-interface {v0}, Lokio/BufferedSource;->exhausted()Z

    move-result v0

    if-nez v0, :cond_5

    .line 100
    new-instance v0, Ljava/io/IOException;

    const-string v1, "gzip finished without exhausting source"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 104
    :cond_5
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public timeout()Lokio/Timeout;
    .locals 1

    .line 178
    iget-object v0, p0, Lokio/GzipSource;->source:Lokio/BufferedSource;

    invoke-interface {v0}, Lokio/BufferedSource;->timeout()Lokio/Timeout;

    move-result-object v0

    return-object v0
.end method
