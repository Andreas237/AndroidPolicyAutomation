.class final Lokhttp3/internal/framed/Hpack$Reader;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/framed/Hpack;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Reader"
.end annotation


# instance fields
.field dynamicTable:[Lokhttp3/internal/framed/Header;

.field dynamicTableByteCount:I

.field headerCount:I

.field private final headerList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lokhttp3/internal/framed/Header;>;"
        }
    .end annotation
.end field

.field private headerTableSizeSetting:I

.field private maxDynamicTableByteCount:I

.field nextHeaderIndex:I

.field private final source:Lokio/BufferedSource;


# direct methods
.method constructor <init>(ILokio/Source;)V
    .locals 2

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 116
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->headerList:Ljava/util/List;

    .line 122
    const/16 v0, 0x8

    new-array v0, v0, [Lokhttp3/internal/framed/Header;

    iput-object v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTable:[Lokhttp3/internal/framed/Header;

    .line 124
    iget-object v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTable:[Lokhttp3/internal/framed/Header;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->nextHeaderIndex:I

    .line 125
    const/4 v0, 0x0

    iput v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->headerCount:I

    .line 126
    const/4 v0, 0x0

    iput v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTableByteCount:I

    .line 129
    iput p1, p0, Lokhttp3/internal/framed/Hpack$Reader;->headerTableSizeSetting:I

    .line 130
    iput p1, p0, Lokhttp3/internal/framed/Hpack$Reader;->maxDynamicTableByteCount:I

    .line 131
    invoke-static {p2}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->source:Lokio/BufferedSource;

    .line 132
    return-void
.end method

.method private adjustDynamicTableByteCount()V
    .locals 2

    .line 152
    iget v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->maxDynamicTableByteCount:I

    iget v1, p0, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTableByteCount:I

    if-ge v0, v1, :cond_1

    .line 153
    iget v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->maxDynamicTableByteCount:I

    if-nez v0, :cond_0

    .line 154
    invoke-direct {p0}, Lokhttp3/internal/framed/Hpack$Reader;->clearDynamicTable()V

    goto :goto_0

    .line 156
    :cond_0
    iget v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTableByteCount:I

    iget v1, p0, Lokhttp3/internal/framed/Hpack$Reader;->maxDynamicTableByteCount:I

    sub-int/2addr v0, v1

    invoke-direct {p0, v0}, Lokhttp3/internal/framed/Hpack$Reader;->evictToRecoverBytes(I)I

    .line 159
    :cond_1
    :goto_0
    return-void
.end method

.method private clearDynamicTable()V
    .locals 2

    .line 162
    iget-object v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->headerList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 163
    iget-object v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTable:[Lokhttp3/internal/framed/Header;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 164
    iget-object v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTable:[Lokhttp3/internal/framed/Header;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->nextHeaderIndex:I

    .line 165
    const/4 v0, 0x0

    iput v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->headerCount:I

    .line 166
    const/4 v0, 0x0

    iput v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTableByteCount:I

    .line 167
    return-void
.end method

.method private dynamicTableIndex(I)I
    .locals 2

    .line 241
    iget v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->nextHeaderIndex:I

    add-int/lit8 v0, v0, 0x1

    add-int/2addr v0, p1

    return v0
.end method

.method private evictToRecoverBytes(I)I
    .locals 7

    .line 171
    const/4 v5, 0x0

    .line 172
    if-lez p1, :cond_1

    .line 174
    iget-object v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTable:[Lokhttp3/internal/framed/Header;

    array-length v0, v0

    add-int/lit8 v6, v0, -0x1

    :goto_0
    iget v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->nextHeaderIndex:I

    if-lt v6, v0, :cond_0

    if-lez p1, :cond_0

    .line 175
    iget-object v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTable:[Lokhttp3/internal/framed/Header;

    aget-object v0, v0, v6

    iget v0, v0, Lokhttp3/internal/framed/Header;->hpackSize:I

    sub-int/2addr p1, v0

    .line 176
    iget v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTableByteCount:I

    iget-object v1, p0, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTable:[Lokhttp3/internal/framed/Header;

    aget-object v1, v1, v6

    iget v1, v1, Lokhttp3/internal/framed/Header;->hpackSize:I

    sub-int/2addr v0, v1

    iput v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTableByteCount:I

    .line 177
    iget v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->headerCount:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->headerCount:I

    .line 178
    add-int/lit8 v5, v5, 0x1

    .line 174
    add-int/lit8 v6, v6, -0x1

    goto :goto_0

    .line 180
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTable:[Lokhttp3/internal/framed/Header;

    iget v1, p0, Lokhttp3/internal/framed/Hpack$Reader;->nextHeaderIndex:I

    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTable:[Lokhttp3/internal/framed/Header;

    iget v3, p0, Lokhttp3/internal/framed/Hpack$Reader;->nextHeaderIndex:I

    add-int/lit8 v3, v3, 0x1

    add-int/2addr v3, v5

    iget v4, p0, Lokhttp3/internal/framed/Hpack$Reader;->headerCount:I

    invoke-static {v0, v1, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 182
    iget v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->nextHeaderIndex:I

    add-int/2addr v0, v5

    iput v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->nextHeaderIndex:I

    .line 184
    :cond_1
    return v5
.end method

.method private getName(I)Lokio/ByteString;
    .locals 2

    .line 270
    invoke-direct {p0, p1}, Lokhttp3/internal/framed/Hpack$Reader;->isStaticHeader(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 271
    invoke-static {}, Lokhttp3/internal/framed/Hpack;->access$000()[Lokhttp3/internal/framed/Header;

    move-result-object v0

    aget-object v0, v0, p1

    iget-object v0, v0, Lokhttp3/internal/framed/Header;->name:Lokio/ByteString;

    return-object v0

    .line 273
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTable:[Lokhttp3/internal/framed/Header;

    invoke-static {}, Lokhttp3/internal/framed/Hpack;->access$000()[Lokhttp3/internal/framed/Header;

    move-result-object v1

    array-length v1, v1

    sub-int v1, p1, v1

    invoke-direct {p0, v1}, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTableIndex(I)I

    move-result v1

    aget-object v0, v0, v1

    iget-object v0, v0, Lokhttp3/internal/framed/Header;->name:Lokio/ByteString;

    return-object v0
.end method

.method private insertIntoDynamicTable(ILokhttp3/internal/framed/Header;)V
    .locals 8

    .line 283
    iget-object v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->headerList:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 285
    iget v4, p2, Lokhttp3/internal/framed/Header;->hpackSize:I

    .line 286
    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    .line 287
    iget-object v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTable:[Lokhttp3/internal/framed/Header;

    invoke-direct {p0, p1}, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTableIndex(I)I

    move-result v1

    aget-object v0, v0, v1

    iget v0, v0, Lokhttp3/internal/framed/Header;->hpackSize:I

    sub-int/2addr v4, v0

    .line 291
    :cond_0
    iget v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->maxDynamicTableByteCount:I

    if-le v4, v0, :cond_1

    .line 292
    invoke-direct {p0}, Lokhttp3/internal/framed/Hpack$Reader;->clearDynamicTable()V

    .line 293
    return-void

    .line 297
    :cond_1
    iget v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTableByteCount:I

    add-int/2addr v0, v4

    iget v1, p0, Lokhttp3/internal/framed/Hpack$Reader;->maxDynamicTableByteCount:I

    sub-int v5, v0, v1

    .line 298
    invoke-direct {p0, v5}, Lokhttp3/internal/framed/Hpack$Reader;->evictToRecoverBytes(I)I

    move-result v6

    .line 300
    const/4 v0, -0x1

    if-ne p1, v0, :cond_3

    .line 301
    iget v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->headerCount:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTable:[Lokhttp3/internal/framed/Header;

    array-length v1, v1

    if-le v0, v1, :cond_2

    .line 302
    iget-object v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTable:[Lokhttp3/internal/framed/Header;

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x2

    new-array v7, v0, [Lokhttp3/internal/framed/Header;

    .line 303
    iget-object v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTable:[Lokhttp3/internal/framed/Header;

    iget-object v1, p0, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTable:[Lokhttp3/internal/framed/Header;

    array-length v1, v1

    iget-object v2, p0, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTable:[Lokhttp3/internal/framed/Header;

    array-length v2, v2

    const/4 v3, 0x0

    invoke-static {v0, v3, v7, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 304
    iget-object v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTable:[Lokhttp3/internal/framed/Header;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->nextHeaderIndex:I

    .line 305
    iput-object v7, p0, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTable:[Lokhttp3/internal/framed/Header;

    .line 307
    :cond_2
    iget p1, p0, Lokhttp3/internal/framed/Hpack$Reader;->nextHeaderIndex:I

    add-int/lit8 v0, p1, -0x1

    iput v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->nextHeaderIndex:I

    .line 308
    iget-object v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTable:[Lokhttp3/internal/framed/Header;

    aput-object p2, v0, p1

    .line 309
    iget v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->headerCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->headerCount:I

    goto :goto_0

    .line 311
    :cond_3
    invoke-direct {p0, p1}, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTableIndex(I)I

    move-result v0

    add-int/2addr v0, v6

    add-int/2addr p1, v0

    .line 312
    iget-object v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTable:[Lokhttp3/internal/framed/Header;

    aput-object p2, v0, p1

    .line 314
    :goto_0
    iget v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTableByteCount:I

    add-int/2addr v0, v4

    iput v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTableByteCount:I

    .line 315
    return-void
.end method

.method private isStaticHeader(I)Z
    .locals 2

    .line 278
    if-ltz p1, :cond_0

    invoke-static {}, Lokhttp3/internal/framed/Hpack;->access$000()[Lokhttp3/internal/framed/Header;

    move-result-object v0

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    if-gt p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private readByte()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 318
    iget-object v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->source:Lokio/BufferedSource;

    invoke-interface {v0}, Lokio/BufferedSource;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method private readIndexedHeader(I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 227
    invoke-direct {p0, p1}, Lokhttp3/internal/framed/Hpack$Reader;->isStaticHeader(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 228
    invoke-static {}, Lokhttp3/internal/framed/Hpack;->access$000()[Lokhttp3/internal/framed/Header;

    move-result-object v0

    aget-object v3, v0, p1

    .line 229
    iget-object v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->headerList:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 230
    goto :goto_0

    .line 231
    :cond_0
    invoke-static {}, Lokhttp3/internal/framed/Hpack;->access$000()[Lokhttp3/internal/framed/Header;

    move-result-object v0

    array-length v0, v0

    sub-int v0, p1, v0

    invoke-direct {p0, v0}, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTableIndex(I)I

    move-result v3

    .line 232
    if-ltz v3, :cond_1

    iget-object v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTable:[Lokhttp3/internal/framed/Header;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    if-le v3, v0, :cond_2

    .line 233
    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Header index too large "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    add-int/lit8 v2, p1, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 235
    :cond_2
    iget-object v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->headerList:Ljava/util/List;

    iget-object v1, p0, Lokhttp3/internal/framed/Hpack$Reader;->dynamicTable:[Lokhttp3/internal/framed/Header;

    aget-object v1, v1, v3

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 237
    :goto_0
    return-void
.end method

.method private readLiteralHeaderWithIncrementalIndexingIndexedName(I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 258
    invoke-direct {p0, p1}, Lokhttp3/internal/framed/Hpack$Reader;->getName(I)Lokio/ByteString;

    move-result-object v2

    .line 259
    invoke-virtual {p0}, Lokhttp3/internal/framed/Hpack$Reader;->readByteString()Lokio/ByteString;

    move-result-object v3

    .line 260
    new-instance v0, Lokhttp3/internal/framed/Header;

    invoke-direct {v0, v2, v3}, Lokhttp3/internal/framed/Header;-><init>(Lokio/ByteString;Lokio/ByteString;)V

    const/4 v1, -0x1

    invoke-direct {p0, v1, v0}, Lokhttp3/internal/framed/Hpack$Reader;->insertIntoDynamicTable(ILokhttp3/internal/framed/Header;)V

    .line 261
    return-void
.end method

.method private readLiteralHeaderWithIncrementalIndexingNewName()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 264
    invoke-virtual {p0}, Lokhttp3/internal/framed/Hpack$Reader;->readByteString()Lokio/ByteString;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/internal/framed/Hpack;->access$100(Lokio/ByteString;)Lokio/ByteString;

    move-result-object v2

    .line 265
    invoke-virtual {p0}, Lokhttp3/internal/framed/Hpack$Reader;->readByteString()Lokio/ByteString;

    move-result-object v3

    .line 266
    new-instance v0, Lokhttp3/internal/framed/Header;

    invoke-direct {v0, v2, v3}, Lokhttp3/internal/framed/Header;-><init>(Lokio/ByteString;Lokio/ByteString;)V

    const/4 v1, -0x1

    invoke-direct {p0, v1, v0}, Lokhttp3/internal/framed/Hpack$Reader;->insertIntoDynamicTable(ILokhttp3/internal/framed/Header;)V

    .line 267
    return-void
.end method

.method private readLiteralHeaderWithoutIndexingIndexedName(I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 245
    invoke-direct {p0, p1}, Lokhttp3/internal/framed/Hpack$Reader;->getName(I)Lokio/ByteString;

    move-result-object v2

    .line 246
    invoke-virtual {p0}, Lokhttp3/internal/framed/Hpack$Reader;->readByteString()Lokio/ByteString;

    move-result-object v3

    .line 247
    iget-object v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->headerList:Ljava/util/List;

    new-instance v1, Lokhttp3/internal/framed/Header;

    invoke-direct {v1, v2, v3}, Lokhttp3/internal/framed/Header;-><init>(Lokio/ByteString;Lokio/ByteString;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 248
    return-void
.end method

.method private readLiteralHeaderWithoutIndexingNewName()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 251
    invoke-virtual {p0}, Lokhttp3/internal/framed/Hpack$Reader;->readByteString()Lokio/ByteString;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/internal/framed/Hpack;->access$100(Lokio/ByteString;)Lokio/ByteString;

    move-result-object v2

    .line 252
    invoke-virtual {p0}, Lokhttp3/internal/framed/Hpack$Reader;->readByteString()Lokio/ByteString;

    move-result-object v3

    .line 253
    iget-object v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->headerList:Ljava/util/List;

    new-instance v1, Lokhttp3/internal/framed/Header;

    invoke-direct {v1, v2, v3}, Lokhttp3/internal/framed/Header;-><init>(Lokio/ByteString;Lokio/ByteString;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 254
    return-void
.end method


# virtual methods
.method public getAndResetHeaderList()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lokhttp3/internal/framed/Header;>;"
        }
    .end annotation

    .line 221
    new-instance v1, Ljava/util/ArrayList;

    iget-object v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->headerList:Ljava/util/List;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 222
    iget-object v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->headerList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 223
    return-object v1
.end method

.method headerTableSizeSetting(I)V
    .locals 0

    .line 146
    iput p1, p0, Lokhttp3/internal/framed/Hpack$Reader;->headerTableSizeSetting:I

    .line 147
    iput p1, p0, Lokhttp3/internal/framed/Hpack$Reader;->maxDynamicTableByteCount:I

    .line 148
    invoke-direct {p0}, Lokhttp3/internal/framed/Hpack$Reader;->adjustDynamicTableByteCount()V

    .line 149
    return-void
.end method

.method maxDynamicTableByteCount()I
    .locals 1

    .line 135
    iget v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->maxDynamicTableByteCount:I

    return v0
.end method

.method readByteString()Lokio/ByteString;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 345
    invoke-direct {p0}, Lokhttp3/internal/framed/Hpack$Reader;->readByte()I

    move-result v4

    .line 346
    and-int/lit16 v0, v4, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 347
    :goto_0
    const/16 v0, 0x7f

    invoke-virtual {p0, v4, v0}, Lokhttp3/internal/framed/Hpack$Reader;->readInt(II)I

    move-result v6

    .line 349
    if-eqz v5, :cond_1

    .line 350
    invoke-static {}, Lokhttp3/internal/framed/Huffman;->get()Lokhttp3/internal/framed/Huffman;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/framed/Hpack$Reader;->source:Lokio/BufferedSource;

    int-to-long v2, v6

    invoke-interface {v1, v2, v3}, Lokio/BufferedSource;->readByteArray(J)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lokhttp3/internal/framed/Huffman;->decode([B)[B

    move-result-object v0

    invoke-static {v0}, Lokio/ByteString;->of([B)Lokio/ByteString;

    move-result-object v0

    return-object v0

    .line 352
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->source:Lokio/BufferedSource;

    int-to-long v1, v6

    invoke-interface {v0, v1, v2}, Lokio/BufferedSource;->readByteString(J)Lokio/ByteString;

    move-result-object v0

    return-object v0
.end method

.method readHeaders()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 192
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->source:Lokio/BufferedSource;

    invoke-interface {v0}, Lokio/BufferedSource;->exhausted()Z

    move-result v0

    if-nez v0, :cond_9

    .line 193
    iget-object v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->source:Lokio/BufferedSource;

    invoke-interface {v0}, Lokio/BufferedSource;->readByte()B

    move-result v0

    and-int/lit16 v3, v0, 0xff

    .line 194
    const/16 v0, 0x80

    if-ne v3, v0, :cond_0

    .line 195
    new-instance v0, Ljava/io/IOException;

    const-string v1, "index == 0"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 196
    :cond_0
    and-int/lit16 v0, v3, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_1

    .line 197
    const/16 v0, 0x7f

    invoke-virtual {p0, v3, v0}, Lokhttp3/internal/framed/Hpack$Reader;->readInt(II)I

    move-result v4

    .line 198
    add-int/lit8 v0, v4, -0x1

    invoke-direct {p0, v0}, Lokhttp3/internal/framed/Hpack$Reader;->readIndexedHeader(I)V

    .line 199
    goto/16 :goto_1

    :cond_1
    const/16 v0, 0x40

    if-ne v3, v0, :cond_2

    .line 200
    invoke-direct {p0}, Lokhttp3/internal/framed/Hpack$Reader;->readLiteralHeaderWithIncrementalIndexingNewName()V

    goto/16 :goto_1

    .line 201
    :cond_2
    and-int/lit8 v0, v3, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_3

    .line 202
    const/16 v0, 0x3f

    invoke-virtual {p0, v3, v0}, Lokhttp3/internal/framed/Hpack$Reader;->readInt(II)I

    move-result v4

    .line 203
    add-int/lit8 v0, v4, -0x1

    invoke-direct {p0, v0}, Lokhttp3/internal/framed/Hpack$Reader;->readLiteralHeaderWithIncrementalIndexingIndexedName(I)V

    .line 204
    goto :goto_1

    :cond_3
    and-int/lit8 v0, v3, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_6

    .line 205
    const/16 v0, 0x1f

    invoke-virtual {p0, v3, v0}, Lokhttp3/internal/framed/Hpack$Reader;->readInt(II)I

    move-result v0

    iput v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->maxDynamicTableByteCount:I

    .line 206
    iget v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->maxDynamicTableByteCount:I

    if-ltz v0, :cond_4

    iget v0, p0, Lokhttp3/internal/framed/Hpack$Reader;->maxDynamicTableByteCount:I

    iget v1, p0, Lokhttp3/internal/framed/Hpack$Reader;->headerTableSizeSetting:I

    if-le v0, v1, :cond_5

    .line 208
    :cond_4
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid dynamic table size update "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lokhttp3/internal/framed/Hpack$Reader;->maxDynamicTableByteCount:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 210
    :cond_5
    invoke-direct {p0}, Lokhttp3/internal/framed/Hpack$Reader;->adjustDynamicTableByteCount()V

    goto :goto_1

    .line 211
    :cond_6
    const/16 v0, 0x10

    if-eq v3, v0, :cond_7

    if-nez v3, :cond_8

    .line 212
    :cond_7
    invoke-direct {p0}, Lokhttp3/internal/framed/Hpack$Reader;->readLiteralHeaderWithoutIndexingNewName()V

    goto :goto_1

    .line 214
    :cond_8
    const/16 v0, 0xf

    invoke-virtual {p0, v3, v0}, Lokhttp3/internal/framed/Hpack$Reader;->readInt(II)I

    move-result v4

    .line 215
    add-int/lit8 v0, v4, -0x1

    invoke-direct {p0, v0}, Lokhttp3/internal/framed/Hpack$Reader;->readLiteralHeaderWithoutIndexingIndexedName(I)V

    .line 217
    :goto_1
    goto/16 :goto_0

    .line 218
    :cond_9
    return-void
.end method

.method readInt(II)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 322
    and-int v1, p1, p2

    .line 323
    if-ge v1, p2, :cond_0

    .line 324
    return v1

    .line 328
    :cond_0
    move v2, p2

    .line 329
    const/4 v3, 0x0

    .line 331
    :goto_0
    invoke-direct {p0}, Lokhttp3/internal/framed/Hpack$Reader;->readByte()I

    move-result v4

    .line 332
    and-int/lit16 v0, v4, 0x80

    if-eqz v0, :cond_1

    .line 333
    and-int/lit8 v0, v4, 0x7f

    shl-int/2addr v0, v3

    add-int/2addr v2, v0

    .line 334
    add-int/lit8 v3, v3, 0x7

    goto :goto_1

    .line 336
    :cond_1
    shl-int v0, v4, v3

    add-int/2addr v2, v0

    .line 337
    goto :goto_2

    .line 339
    :goto_1
    goto :goto_0

    .line 340
    :goto_2
    return v2
.end method
