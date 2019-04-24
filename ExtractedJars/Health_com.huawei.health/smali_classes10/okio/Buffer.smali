.class public final Lokio/Buffer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokio/BufferedSource;
.implements Lokio/BufferedSink;
.implements Ljava/lang/Cloneable;


# static fields
.field private static final DIGITS:[B

.field static final REPLACEMENT_CHARACTER:I = 0xfffd


# instance fields
.field head:Lokio/Segment;

.field size:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 48
    const/16 v0, 0x10

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lokio/Buffer;->DIGITS:[B

    return-void

    :array_0
    .array-data 1
        0x30t
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x61t
        0x62t
        0x63t
        0x64t
        0x65t
        0x66t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    return-void
.end method

.method private readFrom(Ljava/io/InputStream;JZ)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 239
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "in == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 240
    :cond_0
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-gtz v0, :cond_1

    if-eqz p4, :cond_4

    .line 241
    :cond_1
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lokio/Buffer;->writableSegment(I)Lokio/Segment;

    move-result-object v4

    .line 242
    iget v0, v4, Lokio/Segment;->limit:I

    rsub-int v0, v0, 0x800

    int-to-long v0, v0

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v5, v0

    .line 243
    iget-object v0, v4, Lokio/Segment;->data:[B

    iget v1, v4, Lokio/Segment;->limit:I

    invoke-virtual {p1, v0, v1, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v6

    .line 244
    const/4 v0, -0x1

    if-ne v6, v0, :cond_3

    .line 245
    if-eqz p4, :cond_2

    return-void

    .line 246
    :cond_2
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    .line 248
    :cond_3
    iget v0, v4, Lokio/Segment;->limit:I

    add-int/2addr v0, v6

    iput v0, v4, Lokio/Segment;->limit:I

    .line 249
    iget-wide v0, p0, Lokio/Buffer;->size:J

    int-to-long v2, v6

    add-long/2addr v0, v2

    iput-wide v0, p0, Lokio/Buffer;->size:J

    .line 250
    int-to-long v0, v6

    sub-long/2addr p2, v0

    .line 251
    goto :goto_0

    .line 252
    :cond_4
    return-void
.end method


# virtual methods
.method public buffer()Lokio/Buffer;
    .locals 0

    .line 64
    return-object p0
.end method

.method public clear()V
    .locals 3

    .line 762
    :try_start_0
    iget-wide v0, p0, Lokio/Buffer;->size:J

    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->skip(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 765
    goto :goto_0

    .line 763
    :catch_0
    move-exception v2

    .line 764
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 766
    :goto_0
    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 47
    invoke-virtual {p0}, Lokio/Buffer;->clone()Lokio/Buffer;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lokio/Buffer;
    .locals 6

    .line 1410
    new-instance v4, Lokio/Buffer;

    invoke-direct {v4}, Lokio/Buffer;-><init>()V

    .line 1411
    iget-wide v0, p0, Lokio/Buffer;->size:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    return-object v4

    .line 1413
    :cond_0
    new-instance v0, Lokio/Segment;

    iget-object v1, p0, Lokio/Buffer;->head:Lokio/Segment;

    invoke-direct {v0, v1}, Lokio/Segment;-><init>(Lokio/Segment;)V

    iput-object v0, v4, Lokio/Buffer;->head:Lokio/Segment;

    .line 1414
    iget-object v0, v4, Lokio/Buffer;->head:Lokio/Segment;

    iget-object v2, v4, Lokio/Buffer;->head:Lokio/Segment;

    iget-object v1, v4, Lokio/Buffer;->head:Lokio/Segment;

    iput-object v1, v2, Lokio/Segment;->prev:Lokio/Segment;

    iput-object v1, v0, Lokio/Segment;->next:Lokio/Segment;

    .line 1415
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    iget-object v5, v0, Lokio/Segment;->next:Lokio/Segment;

    :goto_0
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    if-eq v5, v0, :cond_1

    .line 1416
    iget-object v0, v4, Lokio/Buffer;->head:Lokio/Segment;

    iget-object v0, v0, Lokio/Segment;->prev:Lokio/Segment;

    new-instance v1, Lokio/Segment;

    invoke-direct {v1, v5}, Lokio/Segment;-><init>(Lokio/Segment;)V

    invoke-virtual {v0, v1}, Lokio/Segment;->push(Lokio/Segment;)Lokio/Segment;

    .line 1415
    iget-object v5, v5, Lokio/Segment;->next:Lokio/Segment;

    goto :goto_0

    .line 1418
    :cond_1
    iget-wide v0, p0, Lokio/Buffer;->size:J

    iput-wide v0, v4, Lokio/Buffer;->size:J

    .line 1419
    return-object v4
.end method

.method public close()V
    .locals 0

    .line 1322
    return-void
.end method

.method public completeSegmentByteCount()J
    .locals 5

    .line 260
    iget-wide v2, p0, Lokio/Buffer;->size:J

    .line 261
    const-wide/16 v0, 0x0

    cmp-long v0, v2, v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 264
    :cond_0
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    iget-object v4, v0, Lokio/Segment;->prev:Lokio/Segment;

    .line 265
    iget v0, v4, Lokio/Segment;->limit:I

    const/16 v1, 0x800

    if-ge v0, v1, :cond_1

    iget-boolean v0, v4, Lokio/Segment;->owner:Z

    if-eqz v0, :cond_1

    .line 266
    iget v0, v4, Lokio/Segment;->limit:I

    iget v1, v4, Lokio/Segment;->pos:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    sub-long/2addr v2, v0

    .line 269
    :cond_1
    return-wide v2
.end method

.method public copyTo(Ljava/io/OutputStream;)Lokio/Buffer;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 135
    move-object v0, p0

    move-object v1, p1

    iget-wide v4, p0, Lokio/Buffer;->size:J

    const-wide/16 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Lokio/Buffer;->copyTo(Ljava/io/OutputStream;JJ)Lokio/Buffer;

    move-result-object v0

    return-object v0
.end method

.method public copyTo(Ljava/io/OutputStream;JJ)Lokio/Buffer;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 143
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "out == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 144
    :cond_0
    iget-wide v0, p0, Lokio/Buffer;->size:J

    move-wide v2, p2

    move-wide v4, p4

    invoke-static/range {v0 .. v5}, Lokio/Util;->checkOffsetAndCount(JJJ)V

    .line 145
    const-wide/16 v0, 0x0

    cmp-long v0, p4, v0

    if-nez v0, :cond_1

    return-object p0

    .line 148
    :cond_1
    iget-object v6, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 149
    :goto_0
    iget v0, v6, Lokio/Segment;->limit:I

    iget v1, v6, Lokio/Segment;->pos:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    cmp-long v0, p2, v0

    if-ltz v0, :cond_2

    .line 150
    iget v0, v6, Lokio/Segment;->limit:I

    iget v1, v6, Lokio/Segment;->pos:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    sub-long/2addr p2, v0

    .line 149
    iget-object v6, v6, Lokio/Segment;->next:Lokio/Segment;

    goto :goto_0

    .line 154
    :cond_2
    :goto_1
    const-wide/16 v0, 0x0

    cmp-long v0, p4, v0

    if-lez v0, :cond_3

    .line 155
    iget v0, v6, Lokio/Segment;->pos:I

    int-to-long v0, v0

    add-long/2addr v0, p2

    long-to-int v7, v0

    .line 156
    iget v0, v6, Lokio/Segment;->limit:I

    sub-int/2addr v0, v7

    int-to-long v0, v0

    invoke-static {v0, v1, p4, p5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v8, v0

    .line 157
    iget-object v0, v6, Lokio/Segment;->data:[B

    invoke-virtual {p1, v0, v7, v8}, Ljava/io/OutputStream;->write([BII)V

    .line 158
    int-to-long v0, v8

    sub-long/2addr p4, v0

    .line 159
    const-wide/16 p2, 0x0

    .line 154
    iget-object v6, v6, Lokio/Segment;->next:Lokio/Segment;

    goto :goto_1

    .line 162
    :cond_3
    return-object p0
.end method

.method public copyTo(Lokio/Buffer;JJ)Lokio/Buffer;
    .locals 8

    .line 167
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "out == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 168
    :cond_0
    iget-wide v0, p0, Lokio/Buffer;->size:J

    move-wide v2, p2

    move-wide v4, p4

    invoke-static/range {v0 .. v5}, Lokio/Util;->checkOffsetAndCount(JJJ)V

    .line 169
    const-wide/16 v0, 0x0

    cmp-long v0, p4, v0

    if-nez v0, :cond_1

    return-object p0

    .line 171
    :cond_1
    iget-wide v0, p1, Lokio/Buffer;->size:J

    add-long/2addr v0, p4

    iput-wide v0, p1, Lokio/Buffer;->size:J

    .line 174
    iget-object v6, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 175
    :goto_0
    iget v0, v6, Lokio/Segment;->limit:I

    iget v1, v6, Lokio/Segment;->pos:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    cmp-long v0, p2, v0

    if-ltz v0, :cond_2

    .line 176
    iget v0, v6, Lokio/Segment;->limit:I

    iget v1, v6, Lokio/Segment;->pos:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    sub-long/2addr p2, v0

    .line 175
    iget-object v6, v6, Lokio/Segment;->next:Lokio/Segment;

    goto :goto_0

    .line 180
    :cond_2
    :goto_1
    const-wide/16 v0, 0x0

    cmp-long v0, p4, v0

    if-lez v0, :cond_4

    .line 181
    new-instance v7, Lokio/Segment;

    invoke-direct {v7, v6}, Lokio/Segment;-><init>(Lokio/Segment;)V

    .line 182
    iget v0, v7, Lokio/Segment;->pos:I

    int-to-long v0, v0

    add-long/2addr v0, p2

    long-to-int v0, v0

    iput v0, v7, Lokio/Segment;->pos:I

    .line 183
    iget v0, v7, Lokio/Segment;->pos:I

    long-to-int v1, p4

    add-int/2addr v0, v1

    iget v1, v7, Lokio/Segment;->limit:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, v7, Lokio/Segment;->limit:I

    .line 184
    iget-object v0, p1, Lokio/Buffer;->head:Lokio/Segment;

    if-nez v0, :cond_3

    .line 185
    iput-object v7, v7, Lokio/Segment;->prev:Lokio/Segment;

    iput-object v7, v7, Lokio/Segment;->next:Lokio/Segment;

    iput-object v7, p1, Lokio/Buffer;->head:Lokio/Segment;

    goto :goto_2

    .line 187
    :cond_3
    iget-object v0, p1, Lokio/Buffer;->head:Lokio/Segment;

    iget-object v0, v0, Lokio/Segment;->prev:Lokio/Segment;

    invoke-virtual {v0, v7}, Lokio/Segment;->push(Lokio/Segment;)Lokio/Segment;

    .line 189
    :goto_2
    iget v0, v7, Lokio/Segment;->limit:I

    iget v1, v7, Lokio/Segment;->pos:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    sub-long/2addr p4, v0

    .line 190
    const-wide/16 p2, 0x0

    .line 180
    iget-object v6, v6, Lokio/Segment;->next:Lokio/Segment;

    goto :goto_1

    .line 193
    :cond_4
    return-object p0
.end method

.method public emit()Lokio/BufferedSink;
    .locals 0

    .line 94
    return-object p0
.end method

.method public emitCompleteSegments()Lokio/Buffer;
    .locals 0

    .line 90
    return-object p0
.end method

.method public bridge synthetic emitCompleteSegments()Lokio/BufferedSink;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 47
    invoke-virtual {p0}, Lokio/Buffer;->emitCompleteSegments()Lokio/Buffer;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 14

    .line 1340
    if-ne p0, p1, :cond_0

    const/4 v0, 0x1

    return v0

    .line 1341
    :cond_0
    instance-of v0, p1, Lokio/Buffer;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    .line 1342
    :cond_1
    move-object v4, p1

    check-cast v4, Lokio/Buffer;

    .line 1343
    iget-wide v0, p0, Lokio/Buffer;->size:J

    iget-wide v2, v4, Lokio/Buffer;->size:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    return v0

    .line 1344
    :cond_2
    iget-wide v0, p0, Lokio/Buffer;->size:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    const/4 v0, 0x1

    return v0

    .line 1346
    :cond_3
    iget-object v5, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 1347
    iget-object v6, v4, Lokio/Buffer;->head:Lokio/Segment;

    .line 1348
    iget v7, v5, Lokio/Segment;->pos:I

    .line 1349
    iget v8, v6, Lokio/Segment;->pos:I

    .line 1351
    const-wide/16 v9, 0x0

    :goto_0
    iget-wide v0, p0, Lokio/Buffer;->size:J

    cmp-long v0, v9, v0

    if-gez v0, :cond_8

    .line 1352
    iget v0, v5, Lokio/Segment;->limit:I

    sub-int/2addr v0, v7

    iget v1, v6, Lokio/Segment;->limit:I

    sub-int/2addr v1, v8

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    int-to-long v11, v0

    .line 1354
    const/4 v13, 0x0

    :goto_1
    int-to-long v0, v13

    cmp-long v0, v0, v11

    if-gez v0, :cond_5

    .line 1355
    iget-object v0, v5, Lokio/Segment;->data:[B

    move v1, v7

    add-int/lit8 v7, v7, 0x1

    aget-byte v0, v0, v1

    iget-object v1, v6, Lokio/Segment;->data:[B

    move v2, v8

    add-int/lit8 v8, v8, 0x1

    aget-byte v1, v1, v2

    if-eq v0, v1, :cond_4

    const/4 v0, 0x0

    return v0

    .line 1354
    :cond_4
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    .line 1358
    :cond_5
    iget v0, v5, Lokio/Segment;->limit:I

    if-ne v7, v0, :cond_6

    .line 1359
    iget-object v5, v5, Lokio/Segment;->next:Lokio/Segment;

    .line 1360
    iget v7, v5, Lokio/Segment;->pos:I

    .line 1363
    :cond_6
    iget v0, v6, Lokio/Segment;->limit:I

    if-ne v8, v0, :cond_7

    .line 1364
    iget-object v6, v6, Lokio/Segment;->next:Lokio/Segment;

    .line 1365
    iget v8, v6, Lokio/Segment;->pos:I

    .line 1351
    :cond_7
    add-long/2addr v9, v11

    goto :goto_0

    .line 1369
    :cond_8
    const/4 v0, 0x1

    return v0
.end method

.method public exhausted()Z
    .locals 4

    .line 98
    iget-wide v0, p0, Lokio/Buffer;->size:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public flush()V
    .locals 0

    .line 1319
    return-void
.end method

.method public getByte(J)B
    .locals 8

    .line 295
    iget-wide v0, p0, Lokio/Buffer;->size:J

    move-wide v2, p1

    const-wide/16 v4, 0x1

    invoke-static/range {v0 .. v5}, Lokio/Util;->checkOffsetAndCount(JJJ)V

    .line 296
    iget-object v6, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 297
    :goto_0
    iget v0, v6, Lokio/Segment;->limit:I

    iget v1, v6, Lokio/Segment;->pos:I

    sub-int v7, v0, v1

    .line 298
    int-to-long v0, v7

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    iget-object v0, v6, Lokio/Segment;->data:[B

    iget v1, v6, Lokio/Segment;->pos:I

    long-to-int v2, p1

    add-int/2addr v1, v2

    aget-byte v0, v0, v1

    return v0

    .line 299
    :cond_0
    int-to-long v0, v7

    sub-long/2addr p1, v0

    .line 296
    iget-object v6, v6, Lokio/Segment;->next:Lokio/Segment;

    goto :goto_0
.end method

.method public hashCode()I
    .locals 6

    .line 1373
    iget-object v2, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 1374
    if-nez v2, :cond_0

    const/4 v0, 0x0

    return v0

    .line 1375
    :cond_0
    const/4 v3, 0x1

    .line 1377
    :cond_1
    iget v4, v2, Lokio/Segment;->pos:I

    iget v5, v2, Lokio/Segment;->limit:I

    :goto_0
    if-ge v4, v5, :cond_2

    .line 1378
    mul-int/lit8 v0, v3, 0x1f

    iget-object v1, v2, Lokio/Segment;->data:[B

    aget-byte v1, v1, v4

    add-int v3, v0, v1

    .line 1377
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 1380
    :cond_2
    iget-object v2, v2, Lokio/Segment;->next:Lokio/Segment;

    .line 1381
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    if-ne v2, v0, :cond_1

    .line 1382
    return v3
.end method

.method public indexOf(B)J
    .locals 2

    .line 1226
    const-wide/16 v0, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lokio/Buffer;->indexOf(BJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public indexOf(BJ)J
    .locals 11

    .line 1234
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-gez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "fromIndex < 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1236
    :cond_0
    iget-object v4, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 1237
    if-nez v4, :cond_1

    const-wide/16 v0, -0x1

    return-wide v0

    .line 1238
    :cond_1
    const-wide/16 v5, 0x0

    .line 1240
    :cond_2
    iget v0, v4, Lokio/Segment;->limit:I

    iget v1, v4, Lokio/Segment;->pos:I

    sub-int v7, v0, v1

    .line 1241
    int-to-long v0, v7

    cmp-long v0, p2, v0

    if-ltz v0, :cond_3

    .line 1242
    int-to-long v0, v7

    sub-long/2addr p2, v0

    goto :goto_1

    .line 1244
    :cond_3
    iget-object v8, v4, Lokio/Segment;->data:[B

    .line 1245
    iget v0, v4, Lokio/Segment;->pos:I

    int-to-long v0, v0

    add-long/2addr v0, p2

    long-to-int v9, v0

    iget v10, v4, Lokio/Segment;->limit:I

    :goto_0
    if-ge v9, v10, :cond_5

    .line 1246
    aget-byte v0, v8, v9

    if-ne v0, p1, :cond_4

    int-to-long v0, v9

    add-long/2addr v0, v5

    iget v2, v4, Lokio/Segment;->pos:I

    int-to-long v2, v2

    sub-long/2addr v0, v2

    return-wide v0

    .line 1245
    :cond_4
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 1248
    :cond_5
    const-wide/16 p2, 0x0

    .line 1250
    :goto_1
    int-to-long v0, v7

    add-long/2addr v5, v0

    .line 1251
    iget-object v4, v4, Lokio/Segment;->next:Lokio/Segment;

    .line 1252
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    if-ne v4, v0, :cond_2

    .line 1253
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public indexOf(Lokio/ByteString;)J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1257
    const-wide/16 v0, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lokio/Buffer;->indexOf(Lokio/ByteString;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public indexOf(Lokio/ByteString;J)J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1261
    invoke-virtual {p1}, Lokio/ByteString;->size()I

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "bytes is empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1263
    :cond_0
    :goto_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lokio/ByteString;->getByte(I)B

    move-result v0

    invoke-virtual {p0, v0, p2, p3}, Lokio/Buffer;->indexOf(BJ)J

    move-result-wide p2

    .line 1264
    const-wide/16 v0, -0x1

    cmp-long v0, p2, v0

    if-nez v0, :cond_1

    .line 1265
    const-wide/16 v0, -0x1

    return-wide v0

    .line 1267
    :cond_1
    invoke-virtual {p0, p2, p3, p1}, Lokio/Buffer;->rangeEquals(JLokio/ByteString;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1268
    return-wide p2

    .line 1270
    :cond_2
    const-wide/16 v0, 0x1

    add-long/2addr p2, v0

    goto :goto_0
.end method

.method public indexOfElement(Lokio/ByteString;)J
    .locals 2

    .line 1275
    const-wide/16 v0, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lokio/Buffer;->indexOfElement(Lokio/ByteString;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public indexOfElement(Lokio/ByteString;J)J
    .locals 19

    .line 1279
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-gez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "fromIndex < 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1281
    :cond_0
    move-object/from16 v0, p0

    iget-object v4, v0, Lokio/Buffer;->head:Lokio/Segment;

    .line 1282
    if-nez v4, :cond_1

    const-wide/16 v0, -0x1

    return-wide v0

    .line 1283
    :cond_1
    const-wide/16 v5, 0x0

    .line 1284
    invoke-virtual/range {p1 .. p1}, Lokio/ByteString;->toByteArray()[B

    move-result-object v7

    .line 1286
    :cond_2
    iget v0, v4, Lokio/Segment;->limit:I

    iget v1, v4, Lokio/Segment;->pos:I

    sub-int v8, v0, v1

    .line 1287
    int-to-long v0, v8

    cmp-long v0, p2, v0

    if-ltz v0, :cond_3

    .line 1288
    int-to-long v0, v8

    sub-long p2, p2, v0

    goto :goto_2

    .line 1290
    :cond_3
    iget-object v9, v4, Lokio/Segment;->data:[B

    .line 1291
    iget v0, v4, Lokio/Segment;->pos:I

    int-to-long v0, v0

    add-long v10, v0, p2

    iget v0, v4, Lokio/Segment;->limit:I

    int-to-long v12, v0

    :goto_0
    cmp-long v0, v10, v12

    if-gez v0, :cond_6

    .line 1292
    long-to-int v0, v10

    aget-byte v14, v9, v0

    .line 1293
    move-object v15, v7

    array-length v0, v15

    move/from16 v16, v0

    const/16 v17, 0x0

    :goto_1
    move/from16 v0, v17

    move/from16 v1, v16

    if-ge v0, v1, :cond_5

    aget-byte v18, v15, v17

    .line 1294
    move/from16 v0, v18

    if-ne v14, v0, :cond_4

    add-long v0, v5, v10

    iget v2, v4, Lokio/Segment;->pos:I

    int-to-long v2, v2

    sub-long/2addr v0, v2

    return-wide v0

    .line 1293
    :cond_4
    add-int/lit8 v17, v17, 0x1

    goto :goto_1

    .line 1291
    :cond_5
    const-wide/16 v0, 0x1

    add-long/2addr v10, v0

    goto :goto_0

    .line 1297
    :cond_6
    const-wide/16 p2, 0x0

    .line 1299
    :goto_2
    int-to-long v0, v8

    add-long/2addr v5, v0

    .line 1300
    iget-object v4, v4, Lokio/Segment;->next:Lokio/Segment;

    .line 1301
    move-object/from16 v0, p0

    iget-object v0, v0, Lokio/Buffer;->head:Lokio/Segment;

    if-ne v4, v0, :cond_2

    .line 1302
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public inputStream()Ljava/io/InputStream;
    .locals 1

    .line 110
    new-instance v0, Lokio/Buffer$2;

    invoke-direct {v0, p0}, Lokio/Buffer$2;-><init>(Lokio/Buffer;)V

    return-object v0
.end method

.method public outputStream()Ljava/io/OutputStream;
    .locals 1

    .line 68
    new-instance v0, Lokio/Buffer$1;

    invoke-direct {v0, p0}, Lokio/Buffer$1;-><init>(Lokio/Buffer;)V

    return-object v0
.end method

.method rangeEquals(JLokio/ByteString;)Z
    .locals 6

    .line 1306
    invoke-virtual {p3}, Lokio/ByteString;->size()I

    move-result v4

    .line 1307
    iget-wide v0, p0, Lokio/Buffer;->size:J

    sub-long/2addr v0, p1

    int-to-long v2, v4

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 1308
    const/4 v0, 0x0

    return v0

    .line 1310
    :cond_0
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_2

    .line 1311
    int-to-long v0, v5

    add-long/2addr v0, p1

    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->getByte(J)B

    move-result v0

    invoke-virtual {p3, v5}, Lokio/ByteString;->getByte(I)B

    move-result v1

    if-eq v0, v1, :cond_1

    .line 1312
    const/4 v0, 0x0

    return v0

    .line 1310
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 1315
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public read([B)I
    .locals 2

    .line 725
    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lokio/Buffer;->read([BII)I

    move-result v0

    return v0
.end method

.method public read([BII)I
    .locals 8

    .line 738
    array-length v0, p1

    int-to-long v0, v0

    int-to-long v2, p2

    int-to-long v4, p3

    invoke-static/range {v0 .. v5}, Lokio/Util;->checkOffsetAndCount(JJJ)V

    .line 740
    iget-object v6, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 741
    if-nez v6, :cond_0

    const/4 v0, -0x1

    return v0

    .line 742
    :cond_0
    iget v0, v6, Lokio/Segment;->limit:I

    iget v1, v6, Lokio/Segment;->pos:I

    sub-int/2addr v0, v1

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result v7

    .line 743
    iget-object v0, v6, Lokio/Segment;->data:[B

    iget v1, v6, Lokio/Segment;->pos:I

    invoke-static {v0, v1, p1, p2, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 745
    iget v0, v6, Lokio/Segment;->pos:I

    add-int/2addr v0, v7

    iput v0, v6, Lokio/Segment;->pos:I

    .line 746
    iget-wide v0, p0, Lokio/Buffer;->size:J

    int-to-long v2, v7

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lokio/Buffer;->size:J

    .line 748
    iget v0, v6, Lokio/Segment;->pos:I

    iget v1, v6, Lokio/Segment;->limit:I

    if-ne v0, v1, :cond_1

    .line 749
    invoke-virtual {v6}, Lokio/Segment;->pop()Lokio/Segment;

    move-result-object v0

    iput-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 750
    invoke-static {v6}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    .line 753
    :cond_1
    return v7
.end method

.method public read(Lokio/Buffer;J)J
    .locals 4

    .line 1217
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "sink == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1218
    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-gez v0, :cond_1

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

    .line 1219
    :cond_1
    iget-wide v0, p0, Lokio/Buffer;->size:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    const-wide/16 v0, -0x1

    return-wide v0

    .line 1220
    :cond_2
    iget-wide v0, p0, Lokio/Buffer;->size:J

    cmp-long v0, p2, v0

    if-lez v0, :cond_3

    iget-wide p2, p0, Lokio/Buffer;->size:J

    .line 1221
    :cond_3
    invoke-virtual {p1, p0, p2, p3}, Lokio/Buffer;->write(Lokio/Buffer;J)V

    .line 1222
    return-wide p2
.end method

.method public readAll(Lokio/Sink;)J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 541
    iget-wide v2, p0, Lokio/Buffer;->size:J

    .line 542
    const-wide/16 v0, 0x0

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    .line 543
    invoke-interface {p1, p0, v2, v3}, Lokio/Sink;->write(Lokio/Buffer;J)V

    .line 545
    :cond_0
    return-wide v2
.end method

.method public readByte()B
    .locals 9

    .line 273
    iget-wide v0, p0, Lokio/Buffer;->size:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "size == 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 275
    :cond_0
    iget-object v4, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 276
    iget v5, v4, Lokio/Segment;->pos:I

    .line 277
    iget v6, v4, Lokio/Segment;->limit:I

    .line 279
    iget-object v7, v4, Lokio/Segment;->data:[B

    .line 280
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    aget-byte v8, v7, v0

    .line 281
    iget-wide v0, p0, Lokio/Buffer;->size:J

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lokio/Buffer;->size:J

    .line 283
    if-ne v5, v6, :cond_1

    .line 284
    invoke-virtual {v4}, Lokio/Segment;->pop()Lokio/Segment;

    move-result-object v0

    iput-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 285
    invoke-static {v4}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    goto :goto_0

    .line 287
    :cond_1
    iput v5, v4, Lokio/Segment;->pos:I

    .line 290
    :goto_0
    return v8
.end method

.method public readByteArray()[B
    .locals 3

    .line 707
    :try_start_0
    iget-wide v0, p0, Lokio/Buffer;->size:J

    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->readByteArray(J)[B
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 708
    :catch_0
    move-exception v2

    .line 709
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public readByteArray(J)[B
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/EOFException;
        }
    .end annotation

    .line 714
    iget-wide v0, p0, Lokio/Buffer;->size:J

    move-wide v4, p1

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v5}, Lokio/Util;->checkOffsetAndCount(JJJ)V

    .line 715
    const-wide/32 v0, 0x7fffffff

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    .line 716
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "byteCount > Integer.MAX_VALUE: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 719
    :cond_0
    long-to-int v0, p1

    new-array v6, v0, [B

    .line 720
    invoke-virtual {p0, v6}, Lokio/Buffer;->readFully([B)V

    .line 721
    return-object v6
.end method

.method public readByteString()Lokio/ByteString;
    .locals 2

    .line 525
    new-instance v0, Lokio/ByteString;

    invoke-virtual {p0}, Lokio/Buffer;->readByteArray()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lokio/ByteString;-><init>([B)V

    return-object v0
.end method

.method public readByteString(J)Lokio/ByteString;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/EOFException;
        }
    .end annotation

    .line 529
    new-instance v0, Lokio/ByteString;

    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->readByteArray(J)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lokio/ByteString;-><init>([B)V

    return-object v0
.end method

.method public readDecimalLong()J
    .locals 20

    .line 411
    move-object/from16 v0, p0

    iget-wide v0, v0, Lokio/Buffer;->size:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "size == 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 414
    :cond_0
    const-wide/16 v4, 0x0

    .line 415
    const/4 v6, 0x0

    .line 416
    const/4 v7, 0x0

    .line 417
    const/4 v8, 0x0

    .line 419
    const-wide v9, -0xcccccccccccccccL

    .line 420
    const-wide/16 v11, -0x7

    .line 423
    :cond_1
    move-object/from16 v0, p0

    iget-object v13, v0, Lokio/Buffer;->head:Lokio/Segment;

    .line 425
    iget-object v14, v13, Lokio/Segment;->data:[B

    .line 426
    iget v15, v13, Lokio/Segment;->pos:I

    .line 427
    iget v0, v13, Lokio/Segment;->limit:I

    move/from16 v16, v0

    .line 429
    :goto_0
    move/from16 v0, v16

    if-ge v15, v0, :cond_8

    .line 430
    aget-byte v17, v14, v15

    .line 431
    move/from16 v0, v17

    const/16 v1, 0x30

    if-lt v0, v1, :cond_5

    move/from16 v0, v17

    const/16 v1, 0x39

    if-gt v0, v1, :cond_5

    .line 432
    rsub-int/lit8 v18, v17, 0x30

    .line 435
    cmp-long v0, v4, v9

    if-ltz v0, :cond_2

    cmp-long v0, v4, v9

    if-nez v0, :cond_4

    move/from16 v0, v18

    int-to-long v0, v0

    cmp-long v0, v0, v11

    if-gez v0, :cond_4

    .line 436
    :cond_2
    new-instance v0, Lokio/Buffer;

    invoke-direct {v0}, Lokio/Buffer;-><init>()V

    invoke-virtual {v0, v4, v5}, Lokio/Buffer;->writeDecimalLong(J)Lokio/Buffer;

    move-result-object v0

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    move-result-object v19

    .line 437
    if-nez v7, :cond_3

    invoke-virtual/range {v19 .. v19}, Lokio/Buffer;->readByte()B

    .line 438
    :cond_3
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Number too large: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual/range {v19 .. v19}, Lokio/Buffer;->readUtf8()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 440
    :cond_4
    const-wide/16 v0, 0xa

    mul-long/2addr v4, v0

    .line 441
    move/from16 v0, v18

    int-to-long v0, v0

    add-long/2addr v4, v0

    .line 442
    goto :goto_1

    :cond_5
    move/from16 v0, v17

    const/16 v1, 0x2d

    if-ne v0, v1, :cond_6

    if-nez v6, :cond_6

    .line 443
    const/4 v7, 0x1

    .line 444
    const-wide/16 v0, 0x1

    sub-long/2addr v11, v0

    goto :goto_1

    .line 446
    :cond_6
    if-nez v6, :cond_7

    .line 447
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected leading [0-9] or \'-\' character but was 0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 448
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 451
    :cond_7
    const/4 v8, 0x1

    .line 452
    goto :goto_2

    .line 429
    :goto_1
    add-int/lit8 v15, v15, 0x1

    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 456
    :cond_8
    :goto_2
    move/from16 v0, v16

    if-ne v15, v0, :cond_9

    .line 457
    invoke-virtual {v13}, Lokio/Segment;->pop()Lokio/Segment;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lokio/Buffer;->head:Lokio/Segment;

    .line 458
    invoke-static {v13}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    goto :goto_3

    .line 460
    :cond_9
    iput v15, v13, Lokio/Segment;->pos:I

    .line 462
    :goto_3
    if-nez v8, :cond_a

    move-object/from16 v0, p0

    iget-object v0, v0, Lokio/Buffer;->head:Lokio/Segment;

    if-nez v0, :cond_1

    .line 464
    :cond_a
    move-object/from16 v0, p0

    iget-wide v0, v0, Lokio/Buffer;->size:J

    int-to-long v2, v6

    sub-long/2addr v0, v2

    move-object/from16 v2, p0

    iput-wide v0, v2, Lokio/Buffer;->size:J

    .line 465
    if-eqz v7, :cond_b

    move-wide v0, v4

    goto :goto_4

    :cond_b
    neg-long v0, v4

    :goto_4
    return-wide v0
.end method

.method public readFrom(Ljava/io/InputStream;)Lokio/Buffer;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 227
    const-wide v0, 0x7fffffffffffffffL

    const/4 v2, 0x1

    invoke-direct {p0, p1, v0, v1, v2}, Lokio/Buffer;->readFrom(Ljava/io/InputStream;JZ)V

    .line 228
    return-object p0
.end method

.method public readFrom(Ljava/io/InputStream;J)Lokio/Buffer;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 233
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

    .line 234
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lokio/Buffer;->readFrom(Ljava/io/InputStream;JZ)V

    .line 235
    return-object p0
.end method

.method public readFully(Lokio/Buffer;J)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/EOFException;
        }
    .end annotation

    .line 533
    iget-wide v0, p0, Lokio/Buffer;->size:J

    cmp-long v0, v0, p2

    if-gez v0, :cond_0

    .line 534
    iget-wide v0, p0, Lokio/Buffer;->size:J

    invoke-virtual {p1, p0, v0, v1}, Lokio/Buffer;->write(Lokio/Buffer;J)V

    .line 535
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    .line 537
    :cond_0
    invoke-virtual {p1, p0, p2, p3}, Lokio/Buffer;->write(Lokio/Buffer;J)V

    .line 538
    return-void
.end method

.method public readFully([B)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/EOFException;
        }
    .end annotation

    .line 729
    const/4 v1, 0x0

    .line 730
    :goto_0
    array-length v0, p1

    if-ge v1, v0, :cond_1

    .line 731
    array-length v0, p1

    sub-int/2addr v0, v1

    invoke-virtual {p0, p1, v1, v0}, Lokio/Buffer;->read([BII)I

    move-result v2

    .line 732
    const/4 v0, -0x1

    if-ne v2, v0, :cond_0

    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    .line 733
    :cond_0
    add-int/2addr v1, v2

    .line 734
    goto :goto_0

    .line 735
    :cond_1
    return-void
.end method

.method public readHexadecimalUnsignedLong()J
    .locals 15

    .line 469
    iget-wide v0, p0, Lokio/Buffer;->size:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "size == 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 471
    :cond_0
    const-wide/16 v4, 0x0

    .line 472
    const/4 v6, 0x0

    .line 473
    const/4 v7, 0x0

    .line 476
    :cond_1
    iget-object v8, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 478
    iget-object v9, v8, Lokio/Segment;->data:[B

    .line 479
    iget v10, v8, Lokio/Segment;->pos:I

    .line 480
    iget v11, v8, Lokio/Segment;->limit:I

    .line 482
    :goto_0
    if-ge v10, v11, :cond_7

    .line 485
    aget-byte v13, v9, v10

    .line 486
    const/16 v0, 0x30

    if-lt v13, v0, :cond_2

    const/16 v0, 0x39

    if-gt v13, v0, :cond_2

    .line 487
    add-int/lit8 v12, v13, -0x30

    goto :goto_1

    .line 488
    :cond_2
    const/16 v0, 0x61

    if-lt v13, v0, :cond_3

    const/16 v0, 0x66

    if-gt v13, v0, :cond_3

    .line 489
    add-int/lit8 v0, v13, -0x61

    add-int/lit8 v12, v0, 0xa

    goto :goto_1

    .line 490
    :cond_3
    const/16 v0, 0x41

    if-lt v13, v0, :cond_4

    const/16 v0, 0x46

    if-gt v13, v0, :cond_4

    .line 491
    add-int/lit8 v0, v13, -0x41

    add-int/lit8 v12, v0, 0xa

    goto :goto_1

    .line 493
    :cond_4
    if-nez v6, :cond_5

    .line 494
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected leading [0-9a-fA-F] character but was 0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 495
    invoke-static {v13}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 498
    :cond_5
    const/4 v7, 0x1

    .line 499
    goto :goto_2

    .line 503
    :goto_1
    const-wide/high16 v0, -0x1000000000000000L    # -3.105036184601418E231

    and-long/2addr v0, v4

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_6

    .line 504
    new-instance v0, Lokio/Buffer;

    invoke-direct {v0}, Lokio/Buffer;-><init>()V

    invoke-virtual {v0, v4, v5}, Lokio/Buffer;->writeHexadecimalUnsignedLong(J)Lokio/Buffer;

    move-result-object v0

    invoke-virtual {v0, v13}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    move-result-object v14

    .line 505
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Number too large: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v14}, Lokio/Buffer;->readUtf8()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 508
    :cond_6
    const/4 v0, 0x4

    shl-long/2addr v4, v0

    .line 509
    int-to-long v0, v12

    or-long/2addr v4, v0

    .line 482
    add-int/lit8 v10, v10, 0x1

    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 512
    :cond_7
    :goto_2
    if-ne v10, v11, :cond_8

    .line 513
    invoke-virtual {v8}, Lokio/Segment;->pop()Lokio/Segment;

    move-result-object v0

    iput-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 514
    invoke-static {v8}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    goto :goto_3

    .line 516
    :cond_8
    iput v10, v8, Lokio/Segment;->pos:I

    .line 518
    :goto_3
    if-nez v7, :cond_9

    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    if-nez v0, :cond_1

    .line 520
    :cond_9
    iget-wide v0, p0, Lokio/Buffer;->size:J

    int-to-long v2, v6

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lokio/Buffer;->size:J

    .line 521
    return-wide v4
.end method

.method public readInt()I
    .locals 9

    .line 333
    iget-wide v0, p0, Lokio/Buffer;->size:J

    const-wide/16 v2, 0x4

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "size < 4: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lokio/Buffer;->size:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 335
    :cond_0
    iget-object v4, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 336
    iget v5, v4, Lokio/Segment;->pos:I

    .line 337
    iget v6, v4, Lokio/Segment;->limit:I

    .line 340
    sub-int v0, v6, v5

    const/4 v1, 0x4

    if-ge v0, v1, :cond_1

    .line 341
    invoke-virtual {p0}, Lokio/Buffer;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    .line 342
    invoke-virtual {p0}, Lokio/Buffer;->readByte()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    .line 343
    invoke-virtual {p0}, Lokio/Buffer;->readByte()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    .line 344
    invoke-virtual {p0}, Lokio/Buffer;->readByte()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    return v0

    .line 347
    :cond_1
    iget-object v7, v4, Lokio/Segment;->data:[B

    .line 348
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    aget-byte v0, v7, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    move v1, v5

    add-int/lit8 v5, v5, 0x1

    aget-byte v1, v7, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    move v1, v5

    add-int/lit8 v5, v5, 0x1

    aget-byte v1, v7, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    move v1, v5

    add-int/lit8 v5, v5, 0x1

    aget-byte v1, v7, v1

    and-int/lit16 v1, v1, 0xff

    or-int v8, v0, v1

    .line 352
    iget-wide v0, p0, Lokio/Buffer;->size:J

    const-wide/16 v2, 0x4

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lokio/Buffer;->size:J

    .line 354
    if-ne v5, v6, :cond_2

    .line 355
    invoke-virtual {v4}, Lokio/Segment;->pop()Lokio/Segment;

    move-result-object v0

    iput-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 356
    invoke-static {v4}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    goto :goto_0

    .line 358
    :cond_2
    iput v5, v4, Lokio/Segment;->pos:I

    .line 361
    :goto_0
    return v8
.end method

.method public readIntLe()I
    .locals 1

    .line 403
    invoke-virtual {p0}, Lokio/Buffer;->readInt()I

    move-result v0

    invoke-static {v0}, Lokio/Util;->reverseBytesInt(I)I

    move-result v0

    return v0
.end method

.method public readLong()J
    .locals 12

    .line 365
    iget-wide v0, p0, Lokio/Buffer;->size:J

    const-wide/16 v2, 0x8

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "size < 8: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lokio/Buffer;->size:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 367
    :cond_0
    iget-object v6, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 368
    iget v7, v6, Lokio/Segment;->pos:I

    .line 369
    iget v8, v6, Lokio/Segment;->limit:I

    .line 372
    sub-int v0, v8, v7

    const/16 v1, 0x8

    if-ge v0, v1, :cond_1

    .line 373
    invoke-virtual {p0}, Lokio/Buffer;->readInt()I

    move-result v0

    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    .line 374
    invoke-virtual {p0}, Lokio/Buffer;->readInt()I

    move-result v2

    int-to-long v2, v2

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    return-wide v0

    .line 377
    :cond_1
    iget-object v9, v6, Lokio/Segment;->data:[B

    .line 378
    move v0, v7

    add-int/lit8 v7, v7, 0x1

    aget-byte v0, v9, v0

    int-to-long v0, v0

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    const/16 v2, 0x38

    shl-long/2addr v0, v2

    move v2, v7

    add-int/lit8 v7, v7, 0x1

    aget-byte v2, v9, v2

    int-to-long v2, v2

    const-wide/16 v4, 0xff

    and-long/2addr v2, v4

    const/16 v4, 0x30

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    move v2, v7

    add-int/lit8 v7, v7, 0x1

    aget-byte v2, v9, v2

    int-to-long v2, v2

    const-wide/16 v4, 0xff

    and-long/2addr v2, v4

    const/16 v4, 0x28

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    move v2, v7

    add-int/lit8 v7, v7, 0x1

    aget-byte v2, v9, v2

    int-to-long v2, v2

    const-wide/16 v4, 0xff

    and-long/2addr v2, v4

    const/16 v4, 0x20

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    move v2, v7

    add-int/lit8 v7, v7, 0x1

    aget-byte v2, v9, v2

    int-to-long v2, v2

    const-wide/16 v4, 0xff

    and-long/2addr v2, v4

    const/16 v4, 0x18

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    move v2, v7

    add-int/lit8 v7, v7, 0x1

    aget-byte v2, v9, v2

    int-to-long v2, v2

    const-wide/16 v4, 0xff

    and-long/2addr v2, v4

    const/16 v4, 0x10

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    move v2, v7

    add-int/lit8 v7, v7, 0x1

    aget-byte v2, v9, v2

    int-to-long v2, v2

    const-wide/16 v4, 0xff

    and-long/2addr v2, v4

    const/16 v4, 0x8

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    move v2, v7

    add-int/lit8 v7, v7, 0x1

    aget-byte v2, v9, v2

    int-to-long v2, v2

    const-wide/16 v4, 0xff

    and-long/2addr v2, v4

    or-long v10, v0, v2

    .line 386
    iget-wide v0, p0, Lokio/Buffer;->size:J

    const-wide/16 v2, 0x8

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lokio/Buffer;->size:J

    .line 388
    if-ne v7, v8, :cond_2

    .line 389
    invoke-virtual {v6}, Lokio/Segment;->pop()Lokio/Segment;

    move-result-object v0

    iput-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 390
    invoke-static {v6}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    goto :goto_0

    .line 392
    :cond_2
    iput v7, v6, Lokio/Segment;->pos:I

    .line 395
    :goto_0
    return-wide v10
.end method

.method public readLongLe()J
    .locals 2

    .line 407
    invoke-virtual {p0}, Lokio/Buffer;->readLong()J

    move-result-wide v0

    invoke-static {v0, v1}, Lokio/Util;->reverseBytesLong(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public readShort()S
    .locals 9

    .line 304
    iget-wide v0, p0, Lokio/Buffer;->size:J

    const-wide/16 v2, 0x2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "size < 2: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lokio/Buffer;->size:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 306
    :cond_0
    iget-object v4, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 307
    iget v5, v4, Lokio/Segment;->pos:I

    .line 308
    iget v6, v4, Lokio/Segment;->limit:I

    .line 311
    sub-int v0, v6, v5

    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    .line 312
    invoke-virtual {p0}, Lokio/Buffer;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    .line 313
    invoke-virtual {p0}, Lokio/Buffer;->readByte()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    or-int v7, v0, v1

    .line 314
    int-to-short v0, v7

    return v0

    .line 317
    :cond_1
    iget-object v7, v4, Lokio/Segment;->data:[B

    .line 318
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    aget-byte v0, v7, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    move v1, v5

    add-int/lit8 v5, v5, 0x1

    aget-byte v1, v7, v1

    and-int/lit16 v1, v1, 0xff

    or-int v8, v0, v1

    .line 320
    iget-wide v0, p0, Lokio/Buffer;->size:J

    const-wide/16 v2, 0x2

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lokio/Buffer;->size:J

    .line 322
    if-ne v5, v6, :cond_2

    .line 323
    invoke-virtual {v4}, Lokio/Segment;->pop()Lokio/Segment;

    move-result-object v0

    iput-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 324
    invoke-static {v4}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    goto :goto_0

    .line 326
    :cond_2
    iput v5, v4, Lokio/Segment;->pos:I

    .line 329
    :goto_0
    int-to-short v0, v8

    return v0
.end method

.method public readShortLe()S
    .locals 1

    .line 399
    invoke-virtual {p0}, Lokio/Buffer;->readShort()S

    move-result v0

    invoke-static {v0}, Lokio/Util;->reverseBytesShort(S)S

    move-result v0

    return v0
.end method

.method public readString(JLjava/nio/charset/Charset;)Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/EOFException;
        }
    .end annotation

    .line 569
    iget-wide v0, p0, Lokio/Buffer;->size:J

    move-wide v4, p1

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v5}, Lokio/Util;->checkOffsetAndCount(JJJ)V

    .line 570
    if-nez p3, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "charset == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 571
    :cond_0
    const-wide/32 v0, 0x7fffffff

    cmp-long v0, p1, v0

    if-lez v0, :cond_1

    .line 572
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "byteCount > Integer.MAX_VALUE: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 574
    :cond_1
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_2

    const-string v0, ""

    return-object v0

    .line 576
    :cond_2
    iget-object v6, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 577
    iget v0, v6, Lokio/Segment;->pos:I

    int-to-long v0, v0

    add-long/2addr v0, p1

    iget v2, v6, Lokio/Segment;->limit:I

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    .line 579
    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->readByteArray(J)[B

    move-result-object v1

    invoke-direct {v0, v1, p3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0

    .line 582
    :cond_3
    new-instance v7, Ljava/lang/String;

    iget-object v0, v6, Lokio/Segment;->data:[B

    iget v1, v6, Lokio/Segment;->pos:I

    long-to-int v2, p1

    invoke-direct {v7, v0, v1, v2, p3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 583
    iget v0, v6, Lokio/Segment;->pos:I

    int-to-long v0, v0

    add-long/2addr v0, p1

    long-to-int v0, v0

    iput v0, v6, Lokio/Segment;->pos:I

    .line 584
    iget-wide v0, p0, Lokio/Buffer;->size:J

    sub-long/2addr v0, p1

    iput-wide v0, p0, Lokio/Buffer;->size:J

    .line 586
    iget v0, v6, Lokio/Segment;->pos:I

    iget v1, v6, Lokio/Segment;->limit:I

    if-ne v0, v1, :cond_4

    .line 587
    invoke-virtual {v6}, Lokio/Segment;->pop()Lokio/Segment;

    move-result-object v0

    iput-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 588
    invoke-static {v6}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    .line 591
    :cond_4
    return-object v7
.end method

.method public readString(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 3

    .line 562
    :try_start_0
    iget-wide v0, p0, Lokio/Buffer;->size:J

    invoke-virtual {p0, v0, v1, p1}, Lokio/Buffer;->readString(JLjava/nio/charset/Charset;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 563
    :catch_0
    move-exception v2

    .line 564
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public readUtf8()Ljava/lang/String;
    .locals 4

    .line 550
    :try_start_0
    iget-wide v0, p0, Lokio/Buffer;->size:J

    sget-object v2, Lokio/Util;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0, v1, v2}, Lokio/Buffer;->readString(JLjava/nio/charset/Charset;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 551
    :catch_0
    move-exception v3

    .line 552
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, v3}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public readUtf8(J)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/EOFException;
        }
    .end annotation

    .line 557
    sget-object v0, Lokio/Util;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, p1, p2, v0}, Lokio/Buffer;->readString(JLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public readUtf8CodePoint()I
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/EOFException;
        }
    .end annotation

    .line 631
    iget-wide v0, p0, Lokio/Buffer;->size:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    .line 633
    :cond_0
    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->getByte(J)B

    move-result v4

    .line 638
    and-int/lit16 v0, v4, 0x80

    if-nez v0, :cond_1

    .line 640
    and-int/lit8 v5, v4, 0x7f

    .line 641
    const/4 v6, 0x1

    .line 642
    const/4 v7, 0x0

    goto :goto_0

    .line 644
    :cond_1
    and-int/lit16 v0, v4, 0xe0

    const/16 v1, 0xc0

    if-ne v0, v1, :cond_2

    .line 646
    and-int/lit8 v5, v4, 0x1f

    .line 647
    const/4 v6, 0x2

    .line 648
    const/16 v7, 0x80

    goto :goto_0

    .line 650
    :cond_2
    and-int/lit16 v0, v4, 0xf0

    const/16 v1, 0xe0

    if-ne v0, v1, :cond_3

    .line 652
    and-int/lit8 v5, v4, 0xf

    .line 653
    const/4 v6, 0x3

    .line 654
    const/16 v7, 0x800

    goto :goto_0

    .line 656
    :cond_3
    and-int/lit16 v0, v4, 0xf8

    const/16 v1, 0xf0

    if-ne v0, v1, :cond_4

    .line 658
    and-int/lit8 v5, v4, 0x7

    .line 659
    const/4 v6, 0x4

    .line 660
    const/high16 v7, 0x10000

    goto :goto_0

    .line 664
    :cond_4
    const-wide/16 v0, 0x1

    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->skip(J)V

    .line 665
    const v0, 0xfffd

    return v0

    .line 668
    :goto_0
    iget-wide v0, p0, Lokio/Buffer;->size:J

    int-to-long v2, v6

    cmp-long v0, v0, v2

    if-gez v0, :cond_5

    .line 669
    new-instance v0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "size < "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lokio/Buffer;->size:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " (to read code point prefixed 0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 670
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 676
    :cond_5
    const/4 v8, 0x1

    :goto_1
    if-ge v8, v6, :cond_7

    .line 677
    int-to-long v0, v8

    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->getByte(J)B

    move-result v9

    .line 678
    and-int/lit16 v0, v9, 0xc0

    const/16 v1, 0x80

    if-ne v0, v1, :cond_6

    .line 680
    shl-int/lit8 v5, v5, 0x6

    .line 681
    and-int/lit8 v0, v9, 0x3f

    or-int/2addr v5, v0

    goto :goto_2

    .line 683
    :cond_6
    int-to-long v0, v8

    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->skip(J)V

    .line 684
    const v0, 0xfffd

    return v0

    .line 676
    :goto_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 688
    :cond_7
    int-to-long v0, v6

    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->skip(J)V

    .line 690
    const v0, 0x10ffff

    if-le v5, v0, :cond_8

    .line 691
    const v0, 0xfffd

    return v0

    .line 694
    :cond_8
    const v0, 0xd800

    if-lt v5, v0, :cond_9

    const v0, 0xdfff

    if-gt v5, v0, :cond_9

    .line 695
    const v0, 0xfffd

    return v0

    .line 698
    :cond_9
    if-ge v5, v7, :cond_a

    .line 699
    const v0, 0xfffd

    return v0

    .line 702
    :cond_a
    return v5
.end method

.method public readUtf8Line()Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/EOFException;
        }
    .end annotation

    .line 595
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lokio/Buffer;->indexOf(B)J

    move-result-wide v4

    .line 597
    const-wide/16 v0, -0x1

    cmp-long v0, v4, v0

    if-nez v0, :cond_1

    .line 598
    iget-wide v0, p0, Lokio/Buffer;->size:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lokio/Buffer;->size:J

    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->readUtf8(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 601
    :cond_1
    invoke-virtual {p0, v4, v5}, Lokio/Buffer;->readUtf8Line(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method readUtf8Line(J)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/EOFException;
        }
    .end annotation

    .line 616
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    const-wide/16 v0, 0x1

    sub-long v0, p1, v0

    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->getByte(J)B

    move-result v0

    const/16 v1, 0xd

    if-ne v0, v1, :cond_0

    .line 618
    const-wide/16 v0, 0x1

    sub-long v0, p1, v0

    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->readUtf8(J)Ljava/lang/String;

    move-result-object v2

    .line 619
    const-wide/16 v0, 0x2

    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->skip(J)V

    .line 620
    return-object v2

    .line 624
    :cond_0
    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->readUtf8(J)Ljava/lang/String;

    move-result-object v2

    .line 625
    const-wide/16 v0, 0x1

    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->skip(J)V

    .line 626
    return-object v2
.end method

.method public readUtf8LineStrict()Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/EOFException;
        }
    .end annotation

    .line 605
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lokio/Buffer;->indexOf(B)J

    move-result-wide v6

    .line 606
    const-wide/16 v0, -0x1

    cmp-long v0, v6, v0

    if-nez v0, :cond_0

    .line 607
    new-instance v8, Lokio/Buffer;

    invoke-direct {v8}, Lokio/Buffer;-><init>()V

    .line 608
    move-object v0, p0

    move-object v1, v8

    iget-wide v2, p0, Lokio/Buffer;->size:J

    const-wide/16 v4, 0x20

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    const-wide/16 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Lokio/Buffer;->copyTo(Lokio/Buffer;JJ)Lokio/Buffer;

    .line 609
    new-instance v0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\\n not found: size="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " content="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 610
    invoke-virtual {v8}, Lokio/Buffer;->readByteString()Lokio/ByteString;

    move-result-object v2

    invoke-virtual {v2}, Lokio/ByteString;->hex()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "..."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 612
    :cond_0
    invoke-virtual {p0, v6, v7}, Lokio/Buffer;->readUtf8Line(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public request(J)Z
    .locals 2

    .line 106
    iget-wide v0, p0, Lokio/Buffer;->size:J

    cmp-long v0, v0, p1

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public require(J)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/EOFException;
        }
    .end annotation

    .line 102
    iget-wide v0, p0, Lokio/Buffer;->size:J

    cmp-long v0, v0, p1

    if-gez v0, :cond_0

    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    .line 103
    :cond_0
    return-void
.end method

.method segmentSizes()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 1330
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 1331
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1332
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    iget v0, v0, Lokio/Segment;->limit:I

    iget-object v1, p0, Lokio/Buffer;->head:Lokio/Segment;

    iget v1, v1, Lokio/Segment;->pos:I

    sub-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1333
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    iget-object v3, v0, Lokio/Segment;->next:Lokio/Segment;

    :goto_0
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    if-eq v3, v0, :cond_1

    .line 1334
    iget v0, v3, Lokio/Segment;->limit:I

    iget v1, v3, Lokio/Segment;->pos:I

    sub-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1333
    iget-object v3, v3, Lokio/Segment;->next:Lokio/Segment;

    goto :goto_0

    .line 1336
    :cond_1
    return-object v2
.end method

.method public size()J
    .locals 2

    .line 60
    iget-wide v0, p0, Lokio/Buffer;->size:J

    return-wide v0
.end method

.method public skip(J)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/EOFException;
        }
    .end annotation

    .line 770
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_2

    .line 771
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    if-nez v0, :cond_0

    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    .line 773
    :cond_0
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    iget v0, v0, Lokio/Segment;->limit:I

    iget-object v1, p0, Lokio/Buffer;->head:Lokio/Segment;

    iget v1, v1, Lokio/Segment;->pos:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v4, v0

    .line 774
    iget-wide v0, p0, Lokio/Buffer;->size:J

    int-to-long v2, v4

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lokio/Buffer;->size:J

    .line 775
    int-to-long v0, v4

    sub-long/2addr p1, v0

    .line 776
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    iget v1, v0, Lokio/Segment;->pos:I

    add-int/2addr v1, v4

    iput v1, v0, Lokio/Segment;->pos:I

    .line 778
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    iget v0, v0, Lokio/Segment;->pos:I

    iget-object v1, p0, Lokio/Buffer;->head:Lokio/Segment;

    iget v1, v1, Lokio/Segment;->limit:I

    if-ne v0, v1, :cond_1

    .line 779
    iget-object v5, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 780
    invoke-virtual {v5}, Lokio/Segment;->pop()Lokio/Segment;

    move-result-object v0

    iput-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 781
    invoke-static {v5}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    .line 783
    :cond_1
    goto :goto_0

    .line 784
    :cond_2
    return-void
.end method

.method public snapshot()Lokio/ByteString;
    .locals 4

    .line 1424
    iget-wide v0, p0, Lokio/Buffer;->size:J

    const-wide/32 v2, 0x7fffffff

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 1425
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "size > Integer.MAX_VALUE: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lokio/Buffer;->size:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1427
    :cond_0
    iget-wide v0, p0, Lokio/Buffer;->size:J

    long-to-int v0, v0

    invoke-virtual {p0, v0}, Lokio/Buffer;->snapshot(I)Lokio/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public snapshot(I)Lokio/ByteString;
    .locals 1

    .line 1434
    if-nez p1, :cond_0

    sget-object v0, Lokio/ByteString;->EMPTY:Lokio/ByteString;

    return-object v0

    .line 1435
    :cond_0
    new-instance v0, Lokio/SegmentedByteString;

    invoke-direct {v0, p0, p1}, Lokio/SegmentedByteString;-><init>(Lokio/Buffer;I)V

    return-object v0
.end method

.method public timeout()Lokio/Timeout;
    .locals 1

    .line 1325
    sget-object v0, Lokio/Timeout;->NONE:Lokio/Timeout;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1386
    iget-wide v0, p0, Lokio/Buffer;->size:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 1387
    const-string v0, "Buffer[size=0]"

    return-object v0

    .line 1390
    :cond_0
    iget-wide v0, p0, Lokio/Buffer;->size:J

    const-wide/16 v2, 0x10

    cmp-long v0, v0, v2

    if-gtz v0, :cond_1

    .line 1391
    invoke-virtual {p0}, Lokio/Buffer;->clone()Lokio/Buffer;

    move-result-object v0

    invoke-virtual {v0}, Lokio/Buffer;->readByteString()Lokio/ByteString;

    move-result-object v4

    .line 1392
    const-string v0, "Buffer[size=%s data=%s]"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-wide v2, p0, Lokio/Buffer;->size:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lokio/ByteString;->hex()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1396
    :cond_1
    const-string v0, "MD5"

    :try_start_0
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v4

    .line 1397
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    iget-object v0, v0, Lokio/Segment;->data:[B

    iget-object v1, p0, Lokio/Buffer;->head:Lokio/Segment;

    iget v1, v1, Lokio/Segment;->pos:I

    iget-object v2, p0, Lokio/Buffer;->head:Lokio/Segment;

    iget v2, v2, Lokio/Segment;->limit:I

    iget-object v3, p0, Lokio/Buffer;->head:Lokio/Segment;

    iget v3, v3, Lokio/Segment;->pos:I

    sub-int/2addr v2, v3

    invoke-virtual {v4, v0, v1, v2}, Ljava/security/MessageDigest;->update([BII)V

    .line 1398
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    iget-object v5, v0, Lokio/Segment;->next:Lokio/Segment;

    :goto_0
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    if-eq v5, v0, :cond_2

    .line 1399
    iget-object v0, v5, Lokio/Segment;->data:[B

    iget v1, v5, Lokio/Segment;->pos:I

    iget v2, v5, Lokio/Segment;->limit:I

    iget v3, v5, Lokio/Segment;->pos:I

    sub-int/2addr v2, v3

    invoke-virtual {v4, v0, v1, v2}, Ljava/security/MessageDigest;->update([BII)V

    .line 1398
    iget-object v5, v5, Lokio/Segment;->next:Lokio/Segment;

    goto :goto_0

    .line 1401
    :cond_2
    const-string v0, "Buffer[size=%s md5=%s]"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-wide v2, p0, Lokio/Buffer;->size:J

    .line 1402
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v2

    invoke-static {v2}, Lokio/ByteString;->of([B)Lokio/ByteString;

    move-result-object v2

    invoke-virtual {v2}, Lokio/ByteString;->hex()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 1401
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 1403
    :catch_0
    move-exception v4

    .line 1404
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method writableSegment(I)Lokio/Segment;
    .locals 4

    .line 1111
    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    const/16 v0, 0x800

    if-le p1, v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 1113
    :cond_1
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    if-nez v0, :cond_2

    .line 1114
    invoke-static {}, Lokio/SegmentPool;->take()Lokio/Segment;

    move-result-object v0

    iput-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 1115
    iget-object v1, p0, Lokio/Buffer;->head:Lokio/Segment;

    iget-object v2, p0, Lokio/Buffer;->head:Lokio/Segment;

    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    iput-object v0, v2, Lokio/Segment;->prev:Lokio/Segment;

    iput-object v0, v1, Lokio/Segment;->next:Lokio/Segment;

    return-object v0

    .line 1118
    :cond_2
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    iget-object v3, v0, Lokio/Segment;->prev:Lokio/Segment;

    .line 1119
    iget v0, v3, Lokio/Segment;->limit:I

    add-int/2addr v0, p1

    const/16 v1, 0x800

    if-gt v0, v1, :cond_3

    iget-boolean v0, v3, Lokio/Segment;->owner:Z

    if-nez v0, :cond_4

    .line 1120
    :cond_3
    invoke-static {}, Lokio/SegmentPool;->take()Lokio/Segment;

    move-result-object v0

    invoke-virtual {v3, v0}, Lokio/Segment;->push(Lokio/Segment;)Lokio/Segment;

    move-result-object v3

    .line 1122
    :cond_4
    return-object v3
.end method

.method public write(Lokio/ByteString;)Lokio/Buffer;
    .locals 2

    .line 787
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "byteString == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 788
    :cond_0
    invoke-virtual {p1, p0}, Lokio/ByteString;->write(Lokio/Buffer;)V

    .line 789
    return-object p0
.end method

.method public write([B)Lokio/Buffer;
    .locals 2

    .line 930
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "source == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 931
    :cond_0
    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lokio/Buffer;->write([BII)Lokio/Buffer;

    move-result-object v0

    return-object v0
.end method

.method public write([BII)Lokio/Buffer;
    .locals 9

    .line 935
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "source == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 936
    :cond_0
    array-length v0, p1

    int-to-long v0, v0

    int-to-long v2, p2

    int-to-long v4, p3

    invoke-static/range {v0 .. v5}, Lokio/Util;->checkOffsetAndCount(JJJ)V

    .line 938
    add-int v6, p2, p3

    .line 939
    :goto_0
    if-ge p2, v6, :cond_1

    .line 940
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lokio/Buffer;->writableSegment(I)Lokio/Segment;

    move-result-object v7

    .line 942
    sub-int v0, v6, p2

    iget v1, v7, Lokio/Segment;->limit:I

    rsub-int v1, v1, 0x800

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v8

    .line 943
    iget-object v0, v7, Lokio/Segment;->data:[B

    iget v1, v7, Lokio/Segment;->limit:I

    invoke-static {p1, p2, v0, v1, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 945
    add-int/2addr p2, v8

    .line 946
    iget v0, v7, Lokio/Segment;->limit:I

    add-int/2addr v0, v8

    iput v0, v7, Lokio/Segment;->limit:I

    .line 947
    goto :goto_0

    .line 949
    :cond_1
    iget-wide v0, p0, Lokio/Buffer;->size:J

    int-to-long v2, p3

    add-long/2addr v0, v2

    iput-wide v0, p0, Lokio/Buffer;->size:J

    .line 950
    return-object p0
.end method

.method public bridge synthetic write(Lokio/ByteString;)Lokio/BufferedSink;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 47
    invoke-virtual {p0, p1}, Lokio/Buffer;->write(Lokio/ByteString;)Lokio/Buffer;

    move-result-object v0

    return-object v0
.end method

.method public write(Lokio/Source;J)Lokio/BufferedSink;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 963
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-lez v0, :cond_1

    .line 964
    invoke-interface {p1, p0, p2, p3}, Lokio/Source;->read(Lokio/Buffer;J)J

    move-result-wide v2

    .line 965
    const-wide/16 v0, -0x1

    cmp-long v0, v2, v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    .line 966
    :cond_0
    sub-long/2addr p2, v2

    .line 967
    goto :goto_0

    .line 968
    :cond_1
    return-object p0
.end method

.method public bridge synthetic write([B)Lokio/BufferedSink;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 47
    invoke-virtual {p0, p1}, Lokio/Buffer;->write([B)Lokio/Buffer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic write([BII)Lokio/BufferedSink;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 47
    invoke-virtual {p0, p1, p2, p3}, Lokio/Buffer;->write([BII)Lokio/Buffer;

    move-result-object v0

    return-object v0
.end method

.method public write(Lokio/Buffer;J)V
    .locals 10

    .line 1176
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "source == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1177
    :cond_0
    if-ne p1, p0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "source == this"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1178
    :cond_1
    iget-wide v0, p1, Lokio/Buffer;->size:J

    move-wide v4, p2

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v5}, Lokio/Util;->checkOffsetAndCount(JJJ)V

    .line 1180
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-lez v0, :cond_7

    .line 1182
    iget-object v0, p1, Lokio/Buffer;->head:Lokio/Segment;

    iget v0, v0, Lokio/Segment;->limit:I

    iget-object v1, p1, Lokio/Buffer;->head:Lokio/Segment;

    iget v1, v1, Lokio/Segment;->pos:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    cmp-long v0, p2, v0

    if-gez v0, :cond_5

    .line 1183
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    iget-object v6, v0, Lokio/Segment;->prev:Lokio/Segment;

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    .line 1184
    :goto_1
    if-eqz v6, :cond_4

    iget-boolean v0, v6, Lokio/Segment;->owner:Z

    if-eqz v0, :cond_4

    iget v0, v6, Lokio/Segment;->limit:I

    int-to-long v0, v0

    add-long/2addr v0, p2

    iget-boolean v2, v6, Lokio/Segment;->shared:Z

    if-eqz v2, :cond_3

    const/4 v2, 0x0

    goto :goto_2

    :cond_3
    iget v2, v6, Lokio/Segment;->pos:I

    :goto_2
    int-to-long v2, v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x800

    cmp-long v0, v0, v2

    if-gtz v0, :cond_4

    .line 1187
    iget-object v0, p1, Lokio/Buffer;->head:Lokio/Segment;

    long-to-int v1, p2

    invoke-virtual {v0, v6, v1}, Lokio/Segment;->writeTo(Lokio/Segment;I)V

    .line 1188
    iget-wide v0, p1, Lokio/Buffer;->size:J

    sub-long/2addr v0, p2

    iput-wide v0, p1, Lokio/Buffer;->size:J

    .line 1189
    iget-wide v0, p0, Lokio/Buffer;->size:J

    add-long/2addr v0, p2

    iput-wide v0, p0, Lokio/Buffer;->size:J

    .line 1190
    return-void

    .line 1194
    :cond_4
    iget-object v0, p1, Lokio/Buffer;->head:Lokio/Segment;

    long-to-int v1, p2

    invoke-virtual {v0, v1}, Lokio/Segment;->split(I)Lokio/Segment;

    move-result-object v0

    iput-object v0, p1, Lokio/Buffer;->head:Lokio/Segment;

    .line 1199
    :cond_5
    iget-object v6, p1, Lokio/Buffer;->head:Lokio/Segment;

    .line 1200
    iget v0, v6, Lokio/Segment;->limit:I

    iget v1, v6, Lokio/Segment;->pos:I

    sub-int/2addr v0, v1

    int-to-long v7, v0

    .line 1201
    invoke-virtual {v6}, Lokio/Segment;->pop()Lokio/Segment;

    move-result-object v0

    iput-object v0, p1, Lokio/Buffer;->head:Lokio/Segment;

    .line 1202
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    if-nez v0, :cond_6

    .line 1203
    iput-object v6, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 1204
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    iget-object v2, p0, Lokio/Buffer;->head:Lokio/Segment;

    iget-object v1, p0, Lokio/Buffer;->head:Lokio/Segment;

    iput-object v1, v2, Lokio/Segment;->prev:Lokio/Segment;

    iput-object v1, v0, Lokio/Segment;->next:Lokio/Segment;

    goto :goto_3

    .line 1206
    :cond_6
    iget-object v0, p0, Lokio/Buffer;->head:Lokio/Segment;

    iget-object v9, v0, Lokio/Segment;->prev:Lokio/Segment;

    .line 1207
    invoke-virtual {v9, v6}, Lokio/Segment;->push(Lokio/Segment;)Lokio/Segment;

    move-result-object v9

    .line 1208
    invoke-virtual {v9}, Lokio/Segment;->compact()V

    .line 1210
    :goto_3
    iget-wide v0, p1, Lokio/Buffer;->size:J

    sub-long/2addr v0, v7

    iput-wide v0, p1, Lokio/Buffer;->size:J

    .line 1211
    iget-wide v0, p0, Lokio/Buffer;->size:J

    add-long/2addr v0, v7

    iput-wide v0, p0, Lokio/Buffer;->size:J

    .line 1212
    sub-long/2addr p2, v7

    .line 1213
    goto/16 :goto_0

    .line 1214
    :cond_7
    return-void
.end method

.method public writeAll(Lokio/Source;)J
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 954
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "source == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 955
    :cond_0
    const-wide/16 v4, 0x0

    .line 956
    :goto_0
    const-wide/16 v0, 0x800

    invoke-interface {p1, p0, v0, v1}, Lokio/Source;->read(Lokio/Buffer;J)J

    move-result-wide v0

    move-wide v6, v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 957
    add-long/2addr v4, v6

    goto :goto_0

    .line 959
    :cond_1
    return-wide v4
.end method

.method public writeByte(I)Lokio/Buffer;
    .locals 5

    .line 972
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lokio/Buffer;->writableSegment(I)Lokio/Segment;

    move-result-object v4

    .line 973
    iget-object v0, v4, Lokio/Segment;->data:[B

    iget v1, v4, Lokio/Segment;->limit:I

    add-int/lit8 v2, v1, 0x1

    iput v2, v4, Lokio/Segment;->limit:I

    int-to-byte v2, p1

    aput-byte v2, v0, v1

    .line 974
    iget-wide v0, p0, Lokio/Buffer;->size:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lokio/Buffer;->size:J

    .line 975
    return-object p0
.end method

.method public bridge synthetic writeByte(I)Lokio/BufferedSink;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 47
    invoke-virtual {p0, p1}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    move-result-object v0

    return-object v0
.end method

.method public writeDecimalLong(J)Lokio/Buffer;
    .locals 10

    .line 1032
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    .line 1034
    const/16 v0, 0x30

    invoke-virtual {p0, v0}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    move-result-object v0

    return-object v0

    .line 1037
    :cond_0
    const/4 v4, 0x0

    .line 1038
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gez v0, :cond_2

    .line 1039
    neg-long p1, p1

    .line 1040
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gez v0, :cond_1

    .line 1041
    const-string v0, "-9223372036854775808"

    invoke-virtual {p0, v0}, Lokio/Buffer;->writeUtf8(Ljava/lang/String;)Lokio/Buffer;

    move-result-object v0

    return-object v0

    .line 1043
    :cond_1
    const/4 v4, 0x1

    .line 1047
    :cond_2
    const-wide/32 v0, 0x5f5e100

    cmp-long v0, p1, v0

    if-gez v0, :cond_a

    const-wide/16 v0, 0x2710

    cmp-long v0, p1, v0

    if-gez v0, :cond_6

    const-wide/16 v0, 0x64

    cmp-long v0, p1, v0

    if-gez v0, :cond_4

    const-wide/16 v0, 0xa

    cmp-long v0, p1, v0

    if-gez v0, :cond_3

    const/4 v5, 0x1

    goto/16 :goto_0

    :cond_3
    const/4 v5, 0x2

    goto/16 :goto_0

    :cond_4
    const-wide/16 v0, 0x3e8

    cmp-long v0, p1, v0

    if-gez v0, :cond_5

    const/4 v5, 0x3

    goto/16 :goto_0

    :cond_5
    const/4 v5, 0x4

    goto/16 :goto_0

    :cond_6
    const-wide/32 v0, 0xf4240

    cmp-long v0, p1, v0

    if-gez v0, :cond_8

    const-wide/32 v0, 0x186a0

    cmp-long v0, p1, v0

    if-gez v0, :cond_7

    const/4 v5, 0x5

    goto/16 :goto_0

    :cond_7
    const/4 v5, 0x6

    goto/16 :goto_0

    :cond_8
    const-wide/32 v0, 0x989680

    cmp-long v0, p1, v0

    if-gez v0, :cond_9

    const/4 v5, 0x7

    goto/16 :goto_0

    :cond_9
    const/16 v5, 0x8

    goto/16 :goto_0

    :cond_a
    const-wide v0, 0xe8d4a51000L

    cmp-long v0, p1, v0

    if-gez v0, :cond_e

    const-wide v0, 0x2540be400L

    cmp-long v0, p1, v0

    if-gez v0, :cond_c

    const-wide/32 v0, 0x3b9aca00

    cmp-long v0, p1, v0

    if-gez v0, :cond_b

    const/16 v5, 0x9

    goto :goto_0

    :cond_b
    const/16 v5, 0xa

    goto :goto_0

    :cond_c
    const-wide v0, 0x174876e800L

    cmp-long v0, p1, v0

    if-gez v0, :cond_d

    const/16 v5, 0xb

    goto :goto_0

    :cond_d
    const/16 v5, 0xc

    goto :goto_0

    :cond_e
    const-wide v0, 0x38d7ea4c68000L

    cmp-long v0, p1, v0

    if-gez v0, :cond_11

    const-wide v0, 0x9184e72a000L

    cmp-long v0, p1, v0

    if-gez v0, :cond_f

    const/16 v5, 0xd

    goto :goto_0

    :cond_f
    const-wide v0, 0x5af3107a4000L

    cmp-long v0, p1, v0

    if-gez v0, :cond_10

    const/16 v5, 0xe

    goto :goto_0

    :cond_10
    const/16 v5, 0xf

    goto :goto_0

    :cond_11
    const-wide v0, 0x16345785d8a0000L

    cmp-long v0, p1, v0

    if-gez v0, :cond_13

    const-wide v0, 0x2386f26fc10000L

    cmp-long v0, p1, v0

    if-gez v0, :cond_12

    const/16 v5, 0x10

    goto :goto_0

    :cond_12
    const/16 v5, 0x11

    goto :goto_0

    :cond_13
    const-wide v0, 0xde0b6b3a7640000L

    cmp-long v0, p1, v0

    if-gez v0, :cond_14

    const/16 v5, 0x12

    goto :goto_0

    :cond_14
    const/16 v5, 0x13

    .line 1066
    :goto_0
    if-eqz v4, :cond_15

    .line 1067
    add-int/lit8 v5, v5, 0x1

    .line 1070
    :cond_15
    invoke-virtual {p0, v5}, Lokio/Buffer;->writableSegment(I)Lokio/Segment;

    move-result-object v6

    .line 1071
    iget-object v7, v6, Lokio/Segment;->data:[B

    .line 1072
    iget v0, v6, Lokio/Segment;->limit:I

    add-int v8, v0, v5

    .line 1073
    :goto_1
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-eqz v0, :cond_16

    .line 1074
    const-wide/16 v0, 0xa

    rem-long v0, p1, v0

    long-to-int v9, v0

    .line 1075
    add-int/lit8 v8, v8, -0x1

    sget-object v0, Lokio/Buffer;->DIGITS:[B

    aget-byte v0, v0, v9

    aput-byte v0, v7, v8

    .line 1076
    const-wide/16 v0, 0xa

    div-long/2addr p1, v0

    .line 1077
    goto :goto_1

    .line 1078
    :cond_16
    if-eqz v4, :cond_17

    .line 1079
    add-int/lit8 v8, v8, -0x1

    const/16 v0, 0x2d

    aput-byte v0, v7, v8

    .line 1082
    :cond_17
    iget v0, v6, Lokio/Segment;->limit:I

    add-int/2addr v0, v5

    iput v0, v6, Lokio/Segment;->limit:I

    .line 1083
    iget-wide v0, p0, Lokio/Buffer;->size:J

    int-to-long v2, v5

    add-long/2addr v0, v2

    iput-wide v0, p0, Lokio/Buffer;->size:J

    .line 1084
    return-object p0
.end method

.method public bridge synthetic writeDecimalLong(J)Lokio/BufferedSink;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 47
    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->writeDecimalLong(J)Lokio/Buffer;

    move-result-object v0

    return-object v0
.end method

.method public writeHexadecimalUnsignedLong(J)Lokio/Buffer;
    .locals 9

    .line 1088
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    .line 1090
    const/16 v0, 0x30

    invoke-virtual {p0, v0}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    move-result-object v0

    return-object v0

    .line 1093
    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Long;->highestOneBit(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v0

    div-int/lit8 v0, v0, 0x4

    add-int/lit8 v4, v0, 0x1

    .line 1095
    invoke-virtual {p0, v4}, Lokio/Buffer;->writableSegment(I)Lokio/Segment;

    move-result-object v5

    .line 1096
    iget-object v6, v5, Lokio/Segment;->data:[B

    .line 1097
    iget v0, v5, Lokio/Segment;->limit:I

    add-int/2addr v0, v4

    add-int/lit8 v7, v0, -0x1

    iget v8, v5, Lokio/Segment;->limit:I

    :goto_0
    if-lt v7, v8, :cond_1

    .line 1098
    sget-object v0, Lokio/Buffer;->DIGITS:[B

    const-wide/16 v1, 0xf

    and-long/2addr v1, p1

    long-to-int v1, v1

    aget-byte v0, v0, v1

    aput-byte v0, v6, v7

    .line 1099
    const/4 v0, 0x4

    ushr-long/2addr p1, v0

    .line 1097
    add-int/lit8 v7, v7, -0x1

    goto :goto_0

    .line 1101
    :cond_1
    iget v0, v5, Lokio/Segment;->limit:I

    add-int/2addr v0, v4

    iput v0, v5, Lokio/Segment;->limit:I

    .line 1102
    iget-wide v0, p0, Lokio/Buffer;->size:J

    int-to-long v2, v4

    add-long/2addr v0, v2

    iput-wide v0, p0, Lokio/Buffer;->size:J

    .line 1103
    return-object p0
.end method

.method public bridge synthetic writeHexadecimalUnsignedLong(J)Lokio/BufferedSink;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 47
    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->writeHexadecimalUnsignedLong(J)Lokio/Buffer;

    move-result-object v0

    return-object v0
.end method

.method public writeInt(I)Lokio/Buffer;
    .locals 7

    .line 994
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lokio/Buffer;->writableSegment(I)Lokio/Segment;

    move-result-object v4

    .line 995
    iget-object v5, v4, Lokio/Segment;->data:[B

    .line 996
    iget v6, v4, Lokio/Segment;->limit:I

    .line 997
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    ushr-int/lit8 v1, p1, 0x18

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, v5, v0

    .line 998
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    ushr-int/lit8 v1, p1, 0x10

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, v5, v0

    .line 999
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    ushr-int/lit8 v1, p1, 0x8

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, v5, v0

    .line 1000
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    and-int/lit16 v1, p1, 0xff

    int-to-byte v1, v1

    aput-byte v1, v5, v0

    .line 1001
    iput v6, v4, Lokio/Segment;->limit:I

    .line 1002
    iget-wide v0, p0, Lokio/Buffer;->size:J

    const-wide/16 v2, 0x4

    add-long/2addr v0, v2

    iput-wide v0, p0, Lokio/Buffer;->size:J

    .line 1003
    return-object p0
.end method

.method public bridge synthetic writeInt(I)Lokio/BufferedSink;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 47
    invoke-virtual {p0, p1}, Lokio/Buffer;->writeInt(I)Lokio/Buffer;

    move-result-object v0

    return-object v0
.end method

.method public writeIntLe(I)Lokio/Buffer;
    .locals 1

    .line 1007
    invoke-static {p1}, Lokio/Util;->reverseBytesInt(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lokio/Buffer;->writeInt(I)Lokio/Buffer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic writeIntLe(I)Lokio/BufferedSink;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 47
    invoke-virtual {p0, p1}, Lokio/Buffer;->writeIntLe(I)Lokio/Buffer;

    move-result-object v0

    return-object v0
.end method

.method public writeLong(J)Lokio/Buffer;
    .locals 8

    .line 1011
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lokio/Buffer;->writableSegment(I)Lokio/Segment;

    move-result-object v5

    .line 1012
    iget-object v6, v5, Lokio/Segment;->data:[B

    .line 1013
    iget v7, v5, Lokio/Segment;->limit:I

    .line 1014
    move v0, v7

    add-int/lit8 v7, v7, 0x1

    const/16 v1, 0x38

    ushr-long v1, p1, v1

    const-wide/16 v3, 0xff

    and-long/2addr v1, v3

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, v6, v0

    .line 1015
    move v0, v7

    add-int/lit8 v7, v7, 0x1

    const/16 v1, 0x30

    ushr-long v1, p1, v1

    const-wide/16 v3, 0xff

    and-long/2addr v1, v3

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, v6, v0

    .line 1016
    move v0, v7

    add-int/lit8 v7, v7, 0x1

    const/16 v1, 0x28

    ushr-long v1, p1, v1

    const-wide/16 v3, 0xff

    and-long/2addr v1, v3

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, v6, v0

    .line 1017
    move v0, v7

    add-int/lit8 v7, v7, 0x1

    const/16 v1, 0x20

    ushr-long v1, p1, v1

    const-wide/16 v3, 0xff

    and-long/2addr v1, v3

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, v6, v0

    .line 1018
    move v0, v7

    add-int/lit8 v7, v7, 0x1

    const/16 v1, 0x18

    ushr-long v1, p1, v1

    const-wide/16 v3, 0xff

    and-long/2addr v1, v3

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, v6, v0

    .line 1019
    move v0, v7

    add-int/lit8 v7, v7, 0x1

    const/16 v1, 0x10

    ushr-long v1, p1, v1

    const-wide/16 v3, 0xff

    and-long/2addr v1, v3

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, v6, v0

    .line 1020
    move v0, v7

    add-int/lit8 v7, v7, 0x1

    const/16 v1, 0x8

    ushr-long v1, p1, v1

    const-wide/16 v3, 0xff

    and-long/2addr v1, v3

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, v6, v0

    .line 1021
    move v0, v7

    add-int/lit8 v7, v7, 0x1

    const-wide/16 v1, 0xff

    and-long/2addr v1, p1

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, v6, v0

    .line 1022
    iput v7, v5, Lokio/Segment;->limit:I

    .line 1023
    iget-wide v0, p0, Lokio/Buffer;->size:J

    const-wide/16 v2, 0x8

    add-long/2addr v0, v2

    iput-wide v0, p0, Lokio/Buffer;->size:J

    .line 1024
    return-object p0
.end method

.method public bridge synthetic writeLong(J)Lokio/BufferedSink;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 47
    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->writeLong(J)Lokio/Buffer;

    move-result-object v0

    return-object v0
.end method

.method public writeLongLe(J)Lokio/Buffer;
    .locals 2

    .line 1028
    invoke-static {p1, p2}, Lokio/Util;->reverseBytesLong(J)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lokio/Buffer;->writeLong(J)Lokio/Buffer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic writeLongLe(J)Lokio/BufferedSink;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 47
    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->writeLongLe(J)Lokio/Buffer;

    move-result-object v0

    return-object v0
.end method

.method public writeShort(I)Lokio/Buffer;
    .locals 7

    .line 979
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lokio/Buffer;->writableSegment(I)Lokio/Segment;

    move-result-object v4

    .line 980
    iget-object v5, v4, Lokio/Segment;->data:[B

    .line 981
    iget v6, v4, Lokio/Segment;->limit:I

    .line 982
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    ushr-int/lit8 v1, p1, 0x8

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, v5, v0

    .line 983
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    and-int/lit16 v1, p1, 0xff

    int-to-byte v1, v1

    aput-byte v1, v5, v0

    .line 984
    iput v6, v4, Lokio/Segment;->limit:I

    .line 985
    iget-wide v0, p0, Lokio/Buffer;->size:J

    const-wide/16 v2, 0x2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lokio/Buffer;->size:J

    .line 986
    return-object p0
.end method

.method public bridge synthetic writeShort(I)Lokio/BufferedSink;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 47
    invoke-virtual {p0, p1}, Lokio/Buffer;->writeShort(I)Lokio/Buffer;

    move-result-object v0

    return-object v0
.end method

.method public writeShortLe(I)Lokio/Buffer;
    .locals 1

    .line 990
    int-to-short v0, p1

    invoke-static {v0}, Lokio/Util;->reverseBytesShort(S)S

    move-result v0

    invoke-virtual {p0, v0}, Lokio/Buffer;->writeShort(I)Lokio/Buffer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic writeShortLe(I)Lokio/BufferedSink;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 47
    invoke-virtual {p0, p1}, Lokio/Buffer;->writeShortLe(I)Lokio/Buffer;

    move-result-object v0

    return-object v0
.end method

.method public writeString(Ljava/lang/String;IILjava/nio/charset/Charset;)Lokio/Buffer;
    .locals 4

    .line 914
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "string == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 915
    :cond_0
    if-gez p2, :cond_1

    new-instance v0, Ljava/lang/IllegalAccessError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "beginIndex < 0: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalAccessError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 916
    :cond_1
    if-ge p3, p2, :cond_2

    .line 917
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "endIndex < beginIndex: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " < "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 919
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-le p3, v0, :cond_3

    .line 920
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "endIndex > string.length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " > "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 921
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 923
    :cond_3
    if-nez p4, :cond_4

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "charset == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 924
    :cond_4
    sget-object v0, Lokio/Util;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p4, v0}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0, p1}, Lokio/Buffer;->writeUtf8(Ljava/lang/String;)Lokio/Buffer;

    move-result-object v0

    return-object v0

    .line 925
    :cond_5
    invoke-virtual {p1, p2, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    .line 926
    array-length v0, v3

    const/4 v1, 0x0

    invoke-virtual {p0, v3, v1, v0}, Lokio/Buffer;->write([BII)Lokio/Buffer;

    move-result-object v0

    return-object v0
.end method

.method public writeString(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/Buffer;
    .locals 2

    .line 909
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0, p2}, Lokio/Buffer;->writeString(Ljava/lang/String;IILjava/nio/charset/Charset;)Lokio/Buffer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic writeString(Ljava/lang/String;IILjava/nio/charset/Charset;)Lokio/BufferedSink;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 47
    invoke-virtual {p0, p1, p2, p3, p4}, Lokio/Buffer;->writeString(Ljava/lang/String;IILjava/nio/charset/Charset;)Lokio/Buffer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic writeString(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/BufferedSink;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 47
    invoke-virtual {p0, p1, p2}, Lokio/Buffer;->writeString(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/Buffer;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Ljava/io/OutputStream;)Lokio/Buffer;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 198
    iget-wide v0, p0, Lokio/Buffer;->size:J

    invoke-virtual {p0, p1, v0, v1}, Lokio/Buffer;->writeTo(Ljava/io/OutputStream;J)Lokio/Buffer;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Ljava/io/OutputStream;J)Lokio/Buffer;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 203
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "out == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 204
    :cond_0
    iget-wide v0, p0, Lokio/Buffer;->size:J

    move-wide v4, p2

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v5}, Lokio/Util;->checkOffsetAndCount(JJJ)V

    .line 206
    iget-object v6, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 207
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-lez v0, :cond_2

    .line 208
    iget v0, v6, Lokio/Segment;->limit:I

    iget v1, v6, Lokio/Segment;->pos:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v7, v0

    .line 209
    iget-object v0, v6, Lokio/Segment;->data:[B

    iget v1, v6, Lokio/Segment;->pos:I

    invoke-virtual {p1, v0, v1, v7}, Ljava/io/OutputStream;->write([BII)V

    .line 211
    iget v0, v6, Lokio/Segment;->pos:I

    add-int/2addr v0, v7

    iput v0, v6, Lokio/Segment;->pos:I

    .line 212
    iget-wide v0, p0, Lokio/Buffer;->size:J

    int-to-long v2, v7

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lokio/Buffer;->size:J

    .line 213
    int-to-long v0, v7

    sub-long/2addr p2, v0

    .line 215
    iget v0, v6, Lokio/Segment;->pos:I

    iget v1, v6, Lokio/Segment;->limit:I

    if-ne v0, v1, :cond_1

    .line 216
    move-object v8, v6

    .line 217
    invoke-virtual {v8}, Lokio/Segment;->pop()Lokio/Segment;

    move-result-object v6

    iput-object v6, p0, Lokio/Buffer;->head:Lokio/Segment;

    .line 218
    invoke-static {v8}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    .line 220
    :cond_1
    goto :goto_0

    .line 222
    :cond_2
    return-object p0
.end method

.method public writeUtf8(Ljava/lang/String;)Lokio/Buffer;
    .locals 2

    .line 793
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lokio/Buffer;->writeUtf8(Ljava/lang/String;II)Lokio/Buffer;

    move-result-object v0

    return-object v0
.end method

.method public writeUtf8(Ljava/lang/String;II)Lokio/Buffer;
    .locals 11

    .line 797
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "string == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 798
    :cond_0
    if-gez p2, :cond_1

    new-instance v0, Ljava/lang/IllegalAccessError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "beginIndex < 0: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalAccessError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 799
    :cond_1
    if-ge p3, p2, :cond_2

    .line 800
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "endIndex < beginIndex: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " < "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 802
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-le p3, v0, :cond_3

    .line 803
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "endIndex > string.length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " > "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 804
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 808
    :cond_3
    move v4, p2

    :goto_0
    if-ge v4, p3, :cond_d

    .line 809
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    .line 811
    const/16 v0, 0x80

    if-ge v5, v0, :cond_6

    .line 812
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lokio/Buffer;->writableSegment(I)Lokio/Segment;

    move-result-object v6

    .line 813
    iget-object v7, v6, Lokio/Segment;->data:[B

    .line 814
    iget v0, v6, Lokio/Segment;->limit:I

    sub-int v8, v0, v4

    .line 815
    rsub-int v0, v8, 0x800

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result v9

    .line 818
    move v0, v4

    add-int/lit8 v4, v4, 0x1

    add-int/2addr v0, v8

    int-to-byte v1, v5

    aput-byte v1, v7, v0

    .line 822
    :goto_1
    if-ge v4, v9, :cond_5

    .line 823
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    .line 824
    const/16 v0, 0x80

    if-lt v5, v0, :cond_4

    goto :goto_2

    .line 825
    :cond_4
    move v0, v4

    add-int/lit8 v4, v4, 0x1

    add-int/2addr v0, v8

    int-to-byte v1, v5

    aput-byte v1, v7, v0

    goto :goto_1

    .line 828
    :cond_5
    :goto_2
    add-int v0, v4, v8

    iget v1, v6, Lokio/Segment;->limit:I

    sub-int v10, v0, v1

    .line 829
    iget v0, v6, Lokio/Segment;->limit:I

    add-int/2addr v0, v10

    iput v0, v6, Lokio/Segment;->limit:I

    .line 830
    iget-wide v0, p0, Lokio/Buffer;->size:J

    int-to-long v2, v10

    add-long/2addr v0, v2

    iput-wide v0, p0, Lokio/Buffer;->size:J

    .line 832
    goto/16 :goto_4

    :cond_6
    const/16 v0, 0x800

    if-ge v5, v0, :cond_7

    .line 834
    shr-int/lit8 v0, v5, 0x6

    or-int/lit16 v0, v0, 0xc0

    invoke-virtual {p0, v0}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 835
    and-int/lit8 v0, v5, 0x3f

    or-int/lit16 v0, v0, 0x80

    invoke-virtual {p0, v0}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 836
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_4

    .line 838
    :cond_7
    const v0, 0xd800

    if-lt v5, v0, :cond_8

    const v0, 0xdfff

    if-le v5, v0, :cond_9

    .line 840
    :cond_8
    shr-int/lit8 v0, v5, 0xc

    or-int/lit16 v0, v0, 0xe0

    invoke-virtual {p0, v0}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 841
    shr-int/lit8 v0, v5, 0x6

    and-int/lit8 v0, v0, 0x3f

    or-int/lit16 v0, v0, 0x80

    invoke-virtual {p0, v0}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 842
    and-int/lit8 v0, v5, 0x3f

    or-int/lit16 v0, v0, 0x80

    invoke-virtual {p0, v0}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 843
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_4

    .line 848
    :cond_9
    add-int/lit8 v0, v4, 0x1

    if-ge v0, p3, :cond_a

    add-int/lit8 v0, v4, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v6

    goto :goto_3

    :cond_a
    const/4 v6, 0x0

    .line 849
    :goto_3
    const v0, 0xdbff

    if-gt v5, v0, :cond_b

    const v0, 0xdc00

    if-lt v6, v0, :cond_b

    const v0, 0xdfff

    if-le v6, v0, :cond_c

    .line 850
    :cond_b
    const/16 v0, 0x3f

    invoke-virtual {p0, v0}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 851
    add-int/lit8 v4, v4, 0x1

    .line 852
    goto/16 :goto_0

    .line 858
    :cond_c
    const v0, -0xd801

    and-int/2addr v0, v5

    shl-int/lit8 v0, v0, 0xa

    const v1, -0xdc01

    and-int/2addr v1, v6

    or-int/2addr v0, v1

    const/high16 v1, 0x10000

    add-int v7, v1, v0

    .line 861
    shr-int/lit8 v0, v7, 0x12

    or-int/lit16 v0, v0, 0xf0

    invoke-virtual {p0, v0}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 862
    shr-int/lit8 v0, v7, 0xc

    and-int/lit8 v0, v0, 0x3f

    or-int/lit16 v0, v0, 0x80

    invoke-virtual {p0, v0}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 863
    shr-int/lit8 v0, v7, 0x6

    and-int/lit8 v0, v0, 0x3f

    or-int/lit16 v0, v0, 0x80

    invoke-virtual {p0, v0}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 864
    and-int/lit8 v0, v7, 0x3f

    or-int/lit16 v0, v0, 0x80

    invoke-virtual {p0, v0}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 865
    add-int/lit8 v4, v4, 0x2

    .line 867
    :goto_4
    goto/16 :goto_0

    .line 869
    :cond_d
    return-object p0
.end method

.method public bridge synthetic writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 47
    invoke-virtual {p0, p1}, Lokio/Buffer;->writeUtf8(Ljava/lang/String;)Lokio/Buffer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic writeUtf8(Ljava/lang/String;II)Lokio/BufferedSink;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 47
    invoke-virtual {p0, p1, p2, p3}, Lokio/Buffer;->writeUtf8(Ljava/lang/String;II)Lokio/Buffer;

    move-result-object v0

    return-object v0
.end method

.method public writeUtf8CodePoint(I)Lokio/Buffer;
    .locals 3

    .line 873
    const/16 v0, 0x80

    if-ge p1, v0, :cond_0

    .line 875
    invoke-virtual {p0, p1}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    goto/16 :goto_0

    .line 877
    :cond_0
    const/16 v0, 0x800

    if-ge p1, v0, :cond_1

    .line 879
    shr-int/lit8 v0, p1, 0x6

    or-int/lit16 v0, v0, 0xc0

    invoke-virtual {p0, v0}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 880
    and-int/lit8 v0, p1, 0x3f

    or-int/lit16 v0, v0, 0x80

    invoke-virtual {p0, v0}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    goto/16 :goto_0

    .line 882
    :cond_1
    const/high16 v0, 0x10000

    if-ge p1, v0, :cond_3

    .line 883
    const v0, 0xd800

    if-lt p1, v0, :cond_2

    const v0, 0xdfff

    if-gt p1, v0, :cond_2

    .line 884
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected code point: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 885
    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 889
    :cond_2
    shr-int/lit8 v0, p1, 0xc

    or-int/lit16 v0, v0, 0xe0

    invoke-virtual {p0, v0}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 890
    shr-int/lit8 v0, p1, 0x6

    and-int/lit8 v0, v0, 0x3f

    or-int/lit16 v0, v0, 0x80

    invoke-virtual {p0, v0}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 891
    and-int/lit8 v0, p1, 0x3f

    or-int/lit16 v0, v0, 0x80

    invoke-virtual {p0, v0}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    goto :goto_0

    .line 893
    :cond_3
    const v0, 0x10ffff

    if-gt p1, v0, :cond_4

    .line 895
    shr-int/lit8 v0, p1, 0x12

    or-int/lit16 v0, v0, 0xf0

    invoke-virtual {p0, v0}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 896
    shr-int/lit8 v0, p1, 0xc

    and-int/lit8 v0, v0, 0x3f

    or-int/lit16 v0, v0, 0x80

    invoke-virtual {p0, v0}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 897
    shr-int/lit8 v0, p1, 0x6

    and-int/lit8 v0, v0, 0x3f

    or-int/lit16 v0, v0, 0x80

    invoke-virtual {p0, v0}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 898
    and-int/lit8 v0, p1, 0x3f

    or-int/lit16 v0, v0, 0x80

    invoke-virtual {p0, v0}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    goto :goto_0

    .line 901
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected code point: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 902
    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 905
    :goto_0
    return-object p0
.end method

.method public bridge synthetic writeUtf8CodePoint(I)Lokio/BufferedSink;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 47
    invoke-virtual {p0, p1}, Lokio/Buffer;->writeUtf8CodePoint(I)Lokio/Buffer;

    move-result-object v0

    return-object v0
.end method
