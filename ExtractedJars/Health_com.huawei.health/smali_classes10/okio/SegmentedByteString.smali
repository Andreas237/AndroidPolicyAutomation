.class final Lokio/SegmentedByteString;
.super Lokio/ByteString;
.source "SourceFile"


# instance fields
.field final transient directory:[I

.field final transient segments:[[B


# direct methods
.method constructor <init>(Lokio/Buffer;I)V
    .locals 9

    .line 55
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lokio/ByteString;-><init>([B)V

    .line 56
    iget-wide v0, p1, Lokio/Buffer;->size:J

    int-to-long v4, p2

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v5}, Lokio/Util;->checkOffsetAndCount(JJJ)V

    .line 59
    const/4 v6, 0x0

    .line 60
    const/4 v7, 0x0

    .line 61
    iget-object v8, p1, Lokio/Buffer;->head:Lokio/Segment;

    :goto_0
    if-ge v6, p2, :cond_1

    .line 62
    iget v0, v8, Lokio/Segment;->limit:I

    iget v1, v8, Lokio/Segment;->pos:I

    if-ne v0, v1, :cond_0

    .line 63
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "s.limit == s.pos"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 65
    :cond_0
    iget v0, v8, Lokio/Segment;->limit:I

    iget v1, v8, Lokio/Segment;->pos:I

    sub-int/2addr v0, v1

    add-int/2addr v6, v0

    .line 66
    add-int/lit8 v7, v7, 0x1

    .line 61
    iget-object v8, v8, Lokio/Segment;->next:Lokio/Segment;

    goto :goto_0

    .line 70
    :cond_1
    new-array v0, v7, [[B

    iput-object v0, p0, Lokio/SegmentedByteString;->segments:[[B

    .line 71
    mul-int/lit8 v0, v7, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Lokio/SegmentedByteString;->directory:[I

    .line 72
    const/4 v6, 0x0

    .line 73
    const/4 v7, 0x0

    .line 74
    iget-object v8, p1, Lokio/Buffer;->head:Lokio/Segment;

    :goto_1
    if-ge v6, p2, :cond_2

    .line 75
    iget-object v0, p0, Lokio/SegmentedByteString;->segments:[[B

    iget-object v1, v8, Lokio/Segment;->data:[B

    aput-object v1, v0, v7

    .line 76
    iget v0, v8, Lokio/Segment;->limit:I

    iget v1, v8, Lokio/Segment;->pos:I

    sub-int/2addr v0, v1

    add-int/2addr v6, v0

    .line 77
    iget-object v0, p0, Lokio/SegmentedByteString;->directory:[I

    aput v6, v0, v7

    .line 78
    iget-object v0, p0, Lokio/SegmentedByteString;->directory:[I

    iget-object v1, p0, Lokio/SegmentedByteString;->segments:[[B

    array-length v1, v1

    add-int/2addr v1, v7

    iget v2, v8, Lokio/Segment;->pos:I

    aput v2, v0, v1

    .line 79
    const/4 v0, 0x1

    iput-boolean v0, v8, Lokio/Segment;->shared:Z

    .line 80
    add-int/lit8 v7, v7, 0x1

    .line 74
    iget-object v8, v8, Lokio/Segment;->next:Lokio/Segment;

    goto :goto_1

    .line 82
    :cond_2
    return-void
.end method

.method private segment(I)I
    .locals 5

    .line 135
    iget-object v0, p0, Lokio/SegmentedByteString;->directory:[I

    iget-object v1, p0, Lokio/SegmentedByteString;->segments:[[B

    array-length v1, v1

    add-int/lit8 v2, p1, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Ljava/util/Arrays;->binarySearch([IIII)I

    move-result v4

    .line 136
    if-ltz v4, :cond_0

    move v0, v4

    goto :goto_0

    :cond_0
    xor-int/lit8 v0, v4, -0x1

    :goto_0
    return v0
.end method

.method private toByteString()Lokio/ByteString;
    .locals 2

    .line 221
    new-instance v0, Lokio/ByteString;

    invoke-virtual {p0}, Lokio/SegmentedByteString;->toByteArray()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lokio/ByteString;-><init>([B)V

    return-object v0
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 1

    .line 256
    invoke-direct {p0}, Lokio/SegmentedByteString;->toByteString()Lokio/ByteString;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public base64()Ljava/lang/String;
    .locals 1

    .line 89
    invoke-direct {p0}, Lokio/SegmentedByteString;->toByteString()Lokio/ByteString;

    move-result-object v0

    invoke-virtual {v0}, Lokio/ByteString;->base64()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public base64Url()Ljava/lang/String;
    .locals 1

    .line 113
    invoke-direct {p0}, Lokio/SegmentedByteString;->toByteString()Lokio/ByteString;

    move-result-object v0

    invoke-virtual {v0}, Lokio/ByteString;->base64Url()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 225
    if-ne p1, p0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 226
    :cond_0
    instance-of v0, p1, Lokio/ByteString;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lokio/ByteString;

    .line 227
    invoke-virtual {v0}, Lokio/ByteString;->size()I

    move-result v0

    invoke-virtual {p0}, Lokio/SegmentedByteString;->size()I

    move-result v1

    if-ne v0, v1, :cond_1

    move-object v0, p1

    check-cast v0, Lokio/ByteString;

    .line 228
    invoke-virtual {p0}, Lokio/SegmentedByteString;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v0, v3, v1}, Lokio/SegmentedByteString;->rangeEquals(ILokio/ByteString;II)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getByte(I)B
    .locals 9

    .line 125
    iget-object v0, p0, Lokio/SegmentedByteString;->directory:[I

    iget-object v1, p0, Lokio/SegmentedByteString;->segments:[[B

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    int-to-long v0, v0

    int-to-long v2, p1

    const-wide/16 v4, 0x1

    invoke-static/range {v0 .. v5}, Lokio/Util;->checkOffsetAndCount(JJJ)V

    .line 126
    invoke-direct {p0, p1}, Lokio/SegmentedByteString;->segment(I)I

    move-result v6

    .line 127
    if-nez v6, :cond_0

    const/4 v7, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lokio/SegmentedByteString;->directory:[I

    add-int/lit8 v1, v6, -0x1

    aget v7, v0, v1

    .line 128
    :goto_0
    iget-object v0, p0, Lokio/SegmentedByteString;->directory:[I

    iget-object v1, p0, Lokio/SegmentedByteString;->segments:[[B

    array-length v1, v1

    add-int/2addr v1, v6

    aget v8, v0, v1

    .line 129
    iget-object v0, p0, Lokio/SegmentedByteString;->segments:[[B

    aget-object v0, v0, v6

    sub-int v1, p1, v7

    add-int/2addr v1, v8

    aget-byte v0, v0, v1

    return v0
.end method

.method public hashCode()I
    .locals 12

    .line 232
    iget v2, p0, Lokio/SegmentedByteString;->hashCode:I

    .line 233
    if-eqz v2, :cond_0

    return v2

    .line 236
    :cond_0
    const/4 v2, 0x1

    .line 237
    const/4 v3, 0x0

    .line 238
    const/4 v4, 0x0

    iget-object v0, p0, Lokio/SegmentedByteString;->segments:[[B

    array-length v5, v0

    :goto_0
    if-ge v4, v5, :cond_2

    .line 239
    iget-object v0, p0, Lokio/SegmentedByteString;->segments:[[B

    aget-object v6, v0, v4

    .line 240
    iget-object v0, p0, Lokio/SegmentedByteString;->directory:[I

    add-int v1, v5, v4

    aget v7, v0, v1

    .line 241
    iget-object v0, p0, Lokio/SegmentedByteString;->directory:[I

    aget v8, v0, v4

    .line 242
    sub-int v9, v8, v3

    .line 243
    move v10, v7

    add-int v11, v7, v9

    :goto_1
    if-ge v10, v11, :cond_1

    .line 244
    mul-int/lit8 v0, v2, 0x1f

    aget-byte v1, v6, v10

    add-int v2, v0, v1

    .line 243
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 246
    :cond_1
    move v3, v8

    .line 238
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 248
    :cond_2
    iput v2, p0, Lokio/SegmentedByteString;->hashCode:I

    return v2
.end method

.method public hex()Ljava/lang/String;
    .locals 1

    .line 93
    invoke-direct {p0}, Lokio/SegmentedByteString;->toByteString()Lokio/ByteString;

    move-result-object v0

    invoke-virtual {v0}, Lokio/ByteString;->hex()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public md5()Lokio/ByteString;
    .locals 1

    .line 105
    invoke-direct {p0}, Lokio/SegmentedByteString;->toByteString()Lokio/ByteString;

    move-result-object v0

    invoke-virtual {v0}, Lokio/ByteString;->md5()Lokio/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public rangeEquals(ILokio/ByteString;II)Z
    .locals 8

    .line 186
    invoke-virtual {p0}, Lokio/SegmentedByteString;->size()I

    move-result v0

    sub-int/2addr v0, p4

    if-le p1, v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 188
    :cond_0
    invoke-direct {p0, p1}, Lokio/SegmentedByteString;->segment(I)I

    move-result v2

    :goto_0
    if-lez p4, :cond_3

    .line 189
    if-nez v2, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lokio/SegmentedByteString;->directory:[I

    add-int/lit8 v1, v2, -0x1

    aget v3, v0, v1

    .line 190
    :goto_1
    iget-object v0, p0, Lokio/SegmentedByteString;->directory:[I

    aget v0, v0, v2

    sub-int v4, v0, v3

    .line 191
    add-int v0, v3, v4

    sub-int/2addr v0, p1

    invoke-static {p4, v0}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 192
    iget-object v0, p0, Lokio/SegmentedByteString;->directory:[I

    iget-object v1, p0, Lokio/SegmentedByteString;->segments:[[B

    array-length v1, v1

    add-int/2addr v1, v2

    aget v6, v0, v1

    .line 193
    sub-int v0, p1, v3

    add-int v7, v0, v6

    .line 194
    iget-object v0, p0, Lokio/SegmentedByteString;->segments:[[B

    aget-object v0, v0, v2

    invoke-virtual {p2, p3, v0, v7, v5}, Lokio/ByteString;->rangeEquals(I[BII)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    return v0

    .line 195
    :cond_2
    add-int/2addr p1, v5

    .line 196
    add-int/2addr p3, v5

    .line 197
    sub-int/2addr p4, v5

    .line 188
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 199
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public rangeEquals(I[BII)Z
    .locals 8

    .line 203
    invoke-virtual {p0}, Lokio/SegmentedByteString;->size()I

    move-result v0

    sub-int/2addr v0, p4

    if-gt p1, v0, :cond_0

    array-length v0, p2

    sub-int/2addr v0, p4

    if-le p3, v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    return v0

    .line 205
    :cond_1
    invoke-direct {p0, p1}, Lokio/SegmentedByteString;->segment(I)I

    move-result v2

    :goto_0
    if-lez p4, :cond_4

    .line 206
    if-nez v2, :cond_2

    const/4 v3, 0x0

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lokio/SegmentedByteString;->directory:[I

    add-int/lit8 v1, v2, -0x1

    aget v3, v0, v1

    .line 207
    :goto_1
    iget-object v0, p0, Lokio/SegmentedByteString;->directory:[I

    aget v0, v0, v2

    sub-int v4, v0, v3

    .line 208
    add-int v0, v3, v4

    sub-int/2addr v0, p1

    invoke-static {p4, v0}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 209
    iget-object v0, p0, Lokio/SegmentedByteString;->directory:[I

    iget-object v1, p0, Lokio/SegmentedByteString;->segments:[[B

    array-length v1, v1

    add-int/2addr v1, v2

    aget v6, v0, v1

    .line 210
    sub-int v0, p1, v3

    add-int v7, v0, v6

    .line 211
    iget-object v0, p0, Lokio/SegmentedByteString;->segments:[[B

    aget-object v0, v0, v2

    invoke-static {v0, v7, p2, p3, v5}, Lokio/Util;->arrayRangeEquals([BI[BII)Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x0

    return v0

    .line 212
    :cond_3
    add-int/2addr p1, v5

    .line 213
    add-int/2addr p3, v5

    .line 214
    sub-int/2addr p4, v5

    .line 205
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 216
    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method public sha256()Lokio/ByteString;
    .locals 1

    .line 109
    invoke-direct {p0}, Lokio/SegmentedByteString;->toByteString()Lokio/ByteString;

    move-result-object v0

    invoke-virtual {v0}, Lokio/ByteString;->sha256()Lokio/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 3

    .line 140
    iget-object v0, p0, Lokio/SegmentedByteString;->directory:[I

    iget-object v1, p0, Lokio/SegmentedByteString;->segments:[[B

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    return v0
.end method

.method public substring(I)Lokio/ByteString;
    .locals 1

    .line 117
    invoke-direct {p0}, Lokio/SegmentedByteString;->toByteString()Lokio/ByteString;

    move-result-object v0

    invoke-virtual {v0, p1}, Lokio/ByteString;->substring(I)Lokio/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public substring(II)Lokio/ByteString;
    .locals 1

    .line 121
    invoke-direct {p0}, Lokio/SegmentedByteString;->toByteString()Lokio/ByteString;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lokio/ByteString;->substring(II)Lokio/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public toAsciiLowercase()Lokio/ByteString;
    .locals 1

    .line 97
    invoke-direct {p0}, Lokio/SegmentedByteString;->toByteString()Lokio/ByteString;

    move-result-object v0

    invoke-virtual {v0}, Lokio/ByteString;->toAsciiLowercase()Lokio/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public toAsciiUppercase()Lokio/ByteString;
    .locals 1

    .line 101
    invoke-direct {p0}, Lokio/SegmentedByteString;->toByteString()Lokio/ByteString;

    move-result-object v0

    invoke-virtual {v0}, Lokio/ByteString;->toAsciiUppercase()Lokio/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public toByteArray()[B
    .locals 9

    .line 144
    iget-object v0, p0, Lokio/SegmentedByteString;->directory:[I

    iget-object v1, p0, Lokio/SegmentedByteString;->segments:[[B

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    new-array v3, v0, [B

    .line 145
    const/4 v4, 0x0

    .line 146
    const/4 v5, 0x0

    iget-object v0, p0, Lokio/SegmentedByteString;->segments:[[B

    array-length v6, v0

    :goto_0
    if-ge v5, v6, :cond_0

    .line 147
    iget-object v0, p0, Lokio/SegmentedByteString;->directory:[I

    add-int v1, v6, v5

    aget v7, v0, v1

    .line 148
    iget-object v0, p0, Lokio/SegmentedByteString;->directory:[I

    aget v8, v0, v5

    .line 149
    iget-object v0, p0, Lokio/SegmentedByteString;->segments:[[B

    aget-object v0, v0, v5

    sub-int v1, v8, v4

    invoke-static {v0, v7, v3, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 151
    move v4, v8

    .line 146
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 153
    :cond_0
    return-object v3
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 252
    invoke-direct {p0}, Lokio/SegmentedByteString;->toByteString()Lokio/ByteString;

    move-result-object v0

    invoke-virtual {v0}, Lokio/ByteString;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public utf8()Ljava/lang/String;
    .locals 1

    .line 85
    invoke-direct {p0}, Lokio/SegmentedByteString;->toByteString()Lokio/ByteString;

    move-result-object v0

    invoke-virtual {v0}, Lokio/ByteString;->utf8()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public write(Ljava/io/OutputStream;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 157
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "out == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 158
    :cond_0
    const/4 v2, 0x0

    .line 159
    const/4 v3, 0x0

    iget-object v0, p0, Lokio/SegmentedByteString;->segments:[[B

    array-length v4, v0

    :goto_0
    if-ge v3, v4, :cond_1

    .line 160
    iget-object v0, p0, Lokio/SegmentedByteString;->directory:[I

    add-int v1, v4, v3

    aget v5, v0, v1

    .line 161
    iget-object v0, p0, Lokio/SegmentedByteString;->directory:[I

    aget v6, v0, v3

    .line 162
    iget-object v0, p0, Lokio/SegmentedByteString;->segments:[[B

    aget-object v0, v0, v3

    sub-int v1, v6, v2

    invoke-virtual {p1, v0, v5, v1}, Ljava/io/OutputStream;->write([BII)V

    .line 163
    move v2, v6

    .line 159
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 165
    :cond_1
    return-void
.end method

.method write(Lokio/Buffer;)V
    .locals 10

    .line 168
    const/4 v4, 0x0

    .line 169
    const/4 v5, 0x0

    iget-object v0, p0, Lokio/SegmentedByteString;->segments:[[B

    array-length v6, v0

    :goto_0
    if-ge v5, v6, :cond_1

    .line 170
    iget-object v0, p0, Lokio/SegmentedByteString;->directory:[I

    add-int v1, v6, v5

    aget v7, v0, v1

    .line 171
    iget-object v0, p0, Lokio/SegmentedByteString;->directory:[I

    aget v8, v0, v5

    .line 172
    new-instance v9, Lokio/Segment;

    iget-object v0, p0, Lokio/SegmentedByteString;->segments:[[B

    aget-object v0, v0, v5

    add-int v1, v7, v8

    sub-int/2addr v1, v4

    invoke-direct {v9, v0, v7, v1}, Lokio/Segment;-><init>([BII)V

    .line 174
    iget-object v0, p1, Lokio/Buffer;->head:Lokio/Segment;

    if-nez v0, :cond_0

    .line 175
    iput-object v9, v9, Lokio/Segment;->prev:Lokio/Segment;

    iput-object v9, v9, Lokio/Segment;->next:Lokio/Segment;

    iput-object v9, p1, Lokio/Buffer;->head:Lokio/Segment;

    goto :goto_1

    .line 177
    :cond_0
    iget-object v0, p1, Lokio/Buffer;->head:Lokio/Segment;

    iget-object v0, v0, Lokio/Segment;->prev:Lokio/Segment;

    invoke-virtual {v0, v9}, Lokio/Segment;->push(Lokio/Segment;)Lokio/Segment;

    .line 179
    :goto_1
    move v4, v8

    .line 169
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 181
    :cond_1
    iget-wide v0, p1, Lokio/Buffer;->size:J

    int-to-long v2, v4

    add-long/2addr v0, v2

    iput-wide v0, p1, Lokio/Buffer;->size:J

    .line 182
    return-void
.end method
