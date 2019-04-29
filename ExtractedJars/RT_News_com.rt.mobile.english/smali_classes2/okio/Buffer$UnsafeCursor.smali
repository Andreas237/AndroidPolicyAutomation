.class public final Lokio/Buffer$UnsafeCursor;
.super Ljava/lang/Object;
.source "Buffer.java"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokio/Buffer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "UnsafeCursor"
.end annotation


# instance fields
.field public buffer:Lokio/Buffer;

.field public data:[B

.field public end:I

.field public offset:J

.field public readWrite:Z

.field private segment:Lokio/Segment;

.field public start:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1980
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 1985
    iput-wide v0, p0, Lokio/Buffer$UnsafeCursor;->offset:J

    const/4 v0, -0x1

    .line 1987
    iput v0, p0, Lokio/Buffer$UnsafeCursor;->start:I

    .line 1988
    iput v0, p0, Lokio/Buffer$UnsafeCursor;->end:I

    return-void
.end method


# virtual methods
.method public close()V
    .locals 3

    .line 2208
    iget-object v0, p0, Lokio/Buffer$UnsafeCursor;->buffer:Lokio/Buffer;

    if-nez v0, :cond_0

    .line 2209
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "not attached to a buffer"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const/4 v0, 0x0

    .line 2212
    iput-object v0, p0, Lokio/Buffer$UnsafeCursor;->buffer:Lokio/Buffer;

    .line 2213
    iput-object v0, p0, Lokio/Buffer$UnsafeCursor;->segment:Lokio/Segment;

    const-wide/16 v1, -0x1

    .line 2214
    iput-wide v1, p0, Lokio/Buffer$UnsafeCursor;->offset:J

    .line 2215
    iput-object v0, p0, Lokio/Buffer$UnsafeCursor;->data:[B

    const/4 v0, -0x1

    .line 2216
    iput v0, p0, Lokio/Buffer$UnsafeCursor;->start:I

    .line 2217
    iput v0, p0, Lokio/Buffer$UnsafeCursor;->end:I

    return-void
.end method

.method public expandBuffer(I)J
    .locals 9

    if-gtz p1, :cond_0

    .line 2178
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "minByteCount <= 0: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const/16 v0, 0x2000

    if-le p1, v0, :cond_1

    .line 2181
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "minByteCount > Segment.SIZE: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2183
    :cond_1
    iget-object v1, p0, Lokio/Buffer$UnsafeCursor;->buffer:Lokio/Buffer;

    if-nez v1, :cond_2

    .line 2184
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "not attached to a buffer"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 2186
    :cond_2
    iget-boolean v1, p0, Lokio/Buffer$UnsafeCursor;->readWrite:Z

    if-nez v1, :cond_3

    .line 2187
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "expandBuffer() only permitted for read/write buffers"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 2190
    :cond_3
    iget-object v1, p0, Lokio/Buffer$UnsafeCursor;->buffer:Lokio/Buffer;

    iget-wide v1, v1, Lokio/Buffer;->size:J

    .line 2191
    iget-object v3, p0, Lokio/Buffer$UnsafeCursor;->buffer:Lokio/Buffer;

    invoke-virtual {v3, p1}, Lokio/Buffer;->writableSegment(I)Lokio/Segment;

    move-result-object p1

    .line 2192
    iget v3, p1, Lokio/Segment;->limit:I

    rsub-int v3, v3, 0x2000

    .line 2193
    iput v0, p1, Lokio/Segment;->limit:I

    .line 2194
    iget-object v4, p0, Lokio/Buffer$UnsafeCursor;->buffer:Lokio/Buffer;

    int-to-long v5, v3

    add-long v7, v1, v5

    iput-wide v7, v4, Lokio/Buffer;->size:J

    .line 2197
    iput-object p1, p0, Lokio/Buffer$UnsafeCursor;->segment:Lokio/Segment;

    .line 2198
    iput-wide v1, p0, Lokio/Buffer$UnsafeCursor;->offset:J

    .line 2199
    iget-object p1, p1, Lokio/Segment;->data:[B

    iput-object p1, p0, Lokio/Buffer$UnsafeCursor;->data:[B

    rsub-int p1, v3, 0x2000

    .line 2200
    iput p1, p0, Lokio/Buffer$UnsafeCursor;->start:I

    .line 2201
    iput v0, p0, Lokio/Buffer$UnsafeCursor;->end:I

    return-wide v5
.end method

.method public next()I
    .locals 6

    .line 1996
    iget-wide v0, p0, Lokio/Buffer$UnsafeCursor;->offset:J

    iget-object v2, p0, Lokio/Buffer$UnsafeCursor;->buffer:Lokio/Buffer;

    iget-wide v2, v2, Lokio/Buffer;->size:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 1997
    :cond_0
    iget-wide v0, p0, Lokio/Buffer$UnsafeCursor;->offset:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lokio/Buffer$UnsafeCursor;->seek(J)I

    move-result v0

    return v0

    .line 1998
    :cond_1
    iget-wide v0, p0, Lokio/Buffer$UnsafeCursor;->offset:J

    iget v2, p0, Lokio/Buffer$UnsafeCursor;->end:I

    iget v3, p0, Lokio/Buffer$UnsafeCursor;->start:I

    sub-int/2addr v2, v3

    int-to-long v2, v2

    add-long v4, v0, v2

    invoke-virtual {p0, v4, v5}, Lokio/Buffer$UnsafeCursor;->seek(J)I

    move-result v0

    return v0
.end method

.method public resizeBuffer(J)J
    .locals 17

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    .line 2096
    iget-object v3, v0, Lokio/Buffer$UnsafeCursor;->buffer:Lokio/Buffer;

    if-nez v3, :cond_0

    .line 2097
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "not attached to a buffer"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 2099
    :cond_0
    iget-boolean v3, v0, Lokio/Buffer$UnsafeCursor;->readWrite:Z

    if-nez v3, :cond_1

    .line 2100
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "resizeBuffer() only permitted for read/write buffers"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 2103
    :cond_1
    iget-object v3, v0, Lokio/Buffer$UnsafeCursor;->buffer:Lokio/Buffer;

    iget-wide v3, v3, Lokio/Buffer;->size:J

    cmp-long v5, v1, v3

    const-wide/16 v6, 0x0

    if-gtz v5, :cond_5

    cmp-long v5, v1, v6

    if-gez v5, :cond_2

    .line 2106
    new-instance v3, Ljava/lang/IllegalArgumentException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "newSize < 0: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_2
    sub-long v8, v3, v1

    :goto_0
    cmp-long v5, v8, v6

    if-lez v5, :cond_4

    .line 2110
    iget-object v5, v0, Lokio/Buffer$UnsafeCursor;->buffer:Lokio/Buffer;

    iget-object v5, v5, Lokio/Buffer;->head:Lokio/Segment;

    iget-object v5, v5, Lokio/Segment;->prev:Lokio/Segment;

    .line 2111
    iget v10, v5, Lokio/Segment;->limit:I

    iget v11, v5, Lokio/Segment;->pos:I

    sub-int/2addr v10, v11

    int-to-long v10, v10

    cmp-long v12, v10, v8

    if-gtz v12, :cond_3

    .line 2113
    iget-object v12, v0, Lokio/Buffer$UnsafeCursor;->buffer:Lokio/Buffer;

    invoke-virtual {v5}, Lokio/Segment;->pop()Lokio/Segment;

    move-result-object v13

    iput-object v13, v12, Lokio/Buffer;->head:Lokio/Segment;

    .line 2114
    invoke-static {v5}, Lokio/SegmentPool;->recycle(Lokio/Segment;)V

    sub-long v12, v8, v10

    move-wide v8, v12

    goto :goto_0

    .line 2117
    :cond_3
    iget v6, v5, Lokio/Segment;->limit:I

    int-to-long v6, v6

    sub-long v10, v6, v8

    long-to-int v6, v10

    iput v6, v5, Lokio/Segment;->limit:I

    :cond_4
    const/4 v5, 0x0

    .line 2122
    iput-object v5, v0, Lokio/Buffer$UnsafeCursor;->segment:Lokio/Segment;

    .line 2123
    iput-wide v1, v0, Lokio/Buffer$UnsafeCursor;->offset:J

    .line 2124
    iput-object v5, v0, Lokio/Buffer$UnsafeCursor;->data:[B

    const/4 v5, -0x1

    .line 2125
    iput v5, v0, Lokio/Buffer$UnsafeCursor;->start:I

    .line 2126
    iput v5, v0, Lokio/Buffer$UnsafeCursor;->end:I

    goto :goto_2

    :cond_5
    cmp-long v5, v1, v3

    if-lez v5, :cond_7

    sub-long v8, v1, v3

    const/4 v5, 0x1

    move v10, v5

    :goto_1
    cmp-long v11, v8, v6

    if-lez v11, :cond_7

    .line 2131
    iget-object v11, v0, Lokio/Buffer$UnsafeCursor;->buffer:Lokio/Buffer;

    invoke-virtual {v11, v5}, Lokio/Buffer;->writableSegment(I)Lokio/Segment;

    move-result-object v11

    .line 2132
    iget v12, v11, Lokio/Segment;->limit:I

    rsub-int v12, v12, 0x2000

    int-to-long v12, v12

    invoke-static {v8, v9, v12, v13}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v12

    long-to-int v12, v12

    .line 2133
    iget v13, v11, Lokio/Segment;->limit:I

    add-int/2addr v13, v12

    iput v13, v11, Lokio/Segment;->limit:I

    int-to-long v13, v12

    sub-long v15, v8, v13

    if-eqz v10, :cond_6

    .line 2138
    iput-object v11, v0, Lokio/Buffer$UnsafeCursor;->segment:Lokio/Segment;

    .line 2139
    iput-wide v3, v0, Lokio/Buffer$UnsafeCursor;->offset:J

    .line 2140
    iget-object v8, v11, Lokio/Segment;->data:[B

    iput-object v8, v0, Lokio/Buffer$UnsafeCursor;->data:[B

    .line 2141
    iget v8, v11, Lokio/Segment;->limit:I

    sub-int/2addr v8, v12

    iput v8, v0, Lokio/Buffer$UnsafeCursor;->start:I

    .line 2142
    iget v8, v11, Lokio/Segment;->limit:I

    iput v8, v0, Lokio/Buffer$UnsafeCursor;->end:I

    const/4 v8, 0x0

    move v10, v8

    :cond_6
    move-wide v8, v15

    goto :goto_1

    .line 2148
    :cond_7
    :goto_2
    iget-object v5, v0, Lokio/Buffer$UnsafeCursor;->buffer:Lokio/Buffer;

    iput-wide v1, v5, Lokio/Buffer;->size:J

    return-wide v3
.end method

.method public seek(J)I
    .locals 12

    const-wide/16 v0, -0x1

    cmp-long v2, p1, v0

    if-ltz v2, :cond_9

    .line 2007
    iget-object v2, p0, Lokio/Buffer$UnsafeCursor;->buffer:Lokio/Buffer;

    iget-wide v2, v2, Lokio/Buffer;->size:J

    cmp-long v4, p1, v2

    if-lez v4, :cond_0

    goto/16 :goto_4

    :cond_0
    cmp-long v2, p1, v0

    if-eqz v2, :cond_8

    .line 2012
    iget-object v0, p0, Lokio/Buffer$UnsafeCursor;->buffer:Lokio/Buffer;

    iget-wide v0, v0, Lokio/Buffer;->size:J

    cmp-long v2, p1, v0

    if-nez v2, :cond_1

    goto/16 :goto_3

    :cond_1
    const-wide/16 v0, 0x0

    .line 2023
    iget-object v2, p0, Lokio/Buffer$UnsafeCursor;->buffer:Lokio/Buffer;

    iget-wide v2, v2, Lokio/Buffer;->size:J

    .line 2024
    iget-object v4, p0, Lokio/Buffer$UnsafeCursor;->buffer:Lokio/Buffer;

    iget-object v4, v4, Lokio/Buffer;->head:Lokio/Segment;

    .line 2025
    iget-object v5, p0, Lokio/Buffer$UnsafeCursor;->buffer:Lokio/Buffer;

    iget-object v5, v5, Lokio/Buffer;->head:Lokio/Segment;

    .line 2026
    iget-object v6, p0, Lokio/Buffer$UnsafeCursor;->segment:Lokio/Segment;

    if-eqz v6, :cond_3

    .line 2027
    iget-wide v6, p0, Lokio/Buffer$UnsafeCursor;->offset:J

    iget v8, p0, Lokio/Buffer$UnsafeCursor;->start:I

    iget-object v9, p0, Lokio/Buffer$UnsafeCursor;->segment:Lokio/Segment;

    iget v9, v9, Lokio/Segment;->pos:I

    sub-int/2addr v8, v9

    int-to-long v8, v8

    sub-long v10, v6, v8

    cmp-long v6, v10, p1

    if-lez v6, :cond_2

    .line 2031
    iget-object v5, p0, Lokio/Buffer$UnsafeCursor;->segment:Lokio/Segment;

    move-wide v2, v10

    goto :goto_0

    .line 2035
    :cond_2
    iget-object v4, p0, Lokio/Buffer$UnsafeCursor;->segment:Lokio/Segment;

    move-wide v0, v10

    :cond_3
    :goto_0
    sub-long v6, v2, p1

    sub-long v8, p1, v0

    cmp-long v10, v6, v8

    if-lez v10, :cond_4

    .line 2045
    :goto_1
    iget v2, v4, Lokio/Segment;->limit:I

    iget v3, v4, Lokio/Segment;->pos:I

    sub-int/2addr v2, v3

    int-to-long v2, v2

    add-long v5, v0, v2

    cmp-long v2, p1, v5

    if-ltz v2, :cond_5

    .line 2046
    iget v2, v4, Lokio/Segment;->limit:I

    iget v3, v4, Lokio/Segment;->pos:I

    sub-int/2addr v2, v3

    int-to-long v2, v2

    add-long v5, v0, v2

    .line 2047
    iget-object v4, v4, Lokio/Segment;->next:Lokio/Segment;

    move-wide v0, v5

    goto :goto_1

    :cond_4
    move-wide v0, v2

    move-object v4, v5

    :goto_2
    cmp-long v2, v0, p1

    if-lez v2, :cond_5

    .line 2054
    iget-object v4, v4, Lokio/Segment;->prev:Lokio/Segment;

    .line 2055
    iget v2, v4, Lokio/Segment;->limit:I

    iget v3, v4, Lokio/Segment;->pos:I

    sub-int/2addr v2, v3

    int-to-long v2, v2

    sub-long v5, v0, v2

    move-wide v0, v5

    goto :goto_2

    .line 2060
    :cond_5
    iget-boolean v2, p0, Lokio/Buffer$UnsafeCursor;->readWrite:Z

    if-eqz v2, :cond_7

    iget-boolean v2, v4, Lokio/Segment;->shared:Z

    if-eqz v2, :cond_7

    .line 2061
    invoke-virtual {v4}, Lokio/Segment;->unsharedCopy()Lokio/Segment;

    move-result-object v2

    .line 2062
    iget-object v3, p0, Lokio/Buffer$UnsafeCursor;->buffer:Lokio/Buffer;

    iget-object v3, v3, Lokio/Buffer;->head:Lokio/Segment;

    if-ne v3, v4, :cond_6

    .line 2063
    iget-object v3, p0, Lokio/Buffer$UnsafeCursor;->buffer:Lokio/Buffer;

    iput-object v2, v3, Lokio/Buffer;->head:Lokio/Segment;

    .line 2065
    :cond_6
    invoke-virtual {v4, v2}, Lokio/Segment;->push(Lokio/Segment;)Lokio/Segment;

    move-result-object v4

    .line 2066
    iget-object v2, v4, Lokio/Segment;->prev:Lokio/Segment;

    invoke-virtual {v2}, Lokio/Segment;->pop()Lokio/Segment;

    .line 2070
    :cond_7
    iput-object v4, p0, Lokio/Buffer$UnsafeCursor;->segment:Lokio/Segment;

    .line 2071
    iput-wide p1, p0, Lokio/Buffer$UnsafeCursor;->offset:J

    .line 2072
    iget-object v2, v4, Lokio/Segment;->data:[B

    iput-object v2, p0, Lokio/Buffer$UnsafeCursor;->data:[B

    .line 2073
    iget v2, v4, Lokio/Segment;->pos:I

    sub-long v5, p1, v0

    long-to-int p1, v5

    add-int/2addr v2, p1

    iput v2, p0, Lokio/Buffer$UnsafeCursor;->start:I

    .line 2074
    iget p1, v4, Lokio/Segment;->limit:I

    iput p1, p0, Lokio/Buffer$UnsafeCursor;->end:I

    .line 2075
    iget p1, p0, Lokio/Buffer$UnsafeCursor;->end:I

    iget p2, p0, Lokio/Buffer$UnsafeCursor;->start:I

    sub-int/2addr p1, p2

    return p1

    :cond_8
    :goto_3
    const/4 v0, 0x0

    .line 2013
    iput-object v0, p0, Lokio/Buffer$UnsafeCursor;->segment:Lokio/Segment;

    .line 2014
    iput-wide p1, p0, Lokio/Buffer$UnsafeCursor;->offset:J

    .line 2015
    iput-object v0, p0, Lokio/Buffer$UnsafeCursor;->data:[B

    const/4 p1, -0x1

    .line 2016
    iput p1, p0, Lokio/Buffer$UnsafeCursor;->start:I

    .line 2017
    iput p1, p0, Lokio/Buffer$UnsafeCursor;->end:I

    return p1

    .line 2008
    :cond_9
    :goto_4
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string v1, "offset=%s > size=%s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    .line 2009
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    aput-object p1, v2, v3

    const/4 p1, 0x1

    iget-object p2, p0, Lokio/Buffer$UnsafeCursor;->buffer:Lokio/Buffer;

    iget-wide v3, p2, Lokio/Buffer;->size:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    aput-object p2, v2, p1

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
