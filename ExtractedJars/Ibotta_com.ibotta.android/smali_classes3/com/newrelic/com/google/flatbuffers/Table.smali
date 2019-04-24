.class public Lcom/newrelic/com/google/flatbuffers/Table;
.super Ljava/lang/Object;
.source "Table.java"


# static fields
.field private static final CHAR_BUFFER:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/nio/CharBuffer;",
            ">;"
        }
    .end annotation
.end field

.field public static final UTF8_CHARSET:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/nio/charset/Charset;",
            ">;"
        }
    .end annotation
.end field

.field private static final UTF8_DECODER:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/nio/charset/CharsetDecoder;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field protected bb:Ljava/nio/ByteBuffer;

.field protected bb_pos:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    new-instance v0, Lcom/newrelic/com/google/flatbuffers/Table$1;

    invoke-direct {v0}, Lcom/newrelic/com/google/flatbuffers/Table$1;-><init>()V

    sput-object v0, Lcom/newrelic/com/google/flatbuffers/Table;->UTF8_DECODER:Ljava/lang/ThreadLocal;

    .line 40
    new-instance v0, Lcom/newrelic/com/google/flatbuffers/Table$2;

    invoke-direct {v0}, Lcom/newrelic/com/google/flatbuffers/Table$2;-><init>()V

    sput-object v0, Lcom/newrelic/com/google/flatbuffers/Table;->UTF8_CHARSET:Ljava/lang/ThreadLocal;

    .line 46
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lcom/newrelic/com/google/flatbuffers/Table;->CHAR_BUFFER:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected static __has_identifier(Ljava/nio/ByteBuffer;Ljava/lang/String;)Z
    .locals 5

    .line 198
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    const/4 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 202
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->position()I

    move-result v4

    add-int/2addr v4, v1

    add-int/2addr v4, v2

    invoke-virtual {p0, v4}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v4

    int-to-char v4, v4

    if-eq v3, v4, :cond_0

    return v0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    return p0

    .line 199
    :cond_2
    new-instance p0, Ljava/lang/AssertionError;

    const-string p1, "FlatBuffers: file identifier must be length 4"

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0
.end method

.method protected static __indirect(ILjava/nio/ByteBuffer;)I
    .locals 0

    .line 86
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method protected static __offset(IILjava/nio/ByteBuffer;)I
    .locals 1

    .line 71
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    array-length v0, v0

    sub-int/2addr v0, p1

    add-int/2addr p0, v0

    .line 72
    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    sub-int/2addr p0, p1

    invoke-virtual {p2, p0}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result p0

    add-int/2addr p0, v0

    return p0
.end method

.method protected static compareStrings(IILjava/nio/ByteBuffer;)I
    .locals 8

    .line 241
    invoke-virtual {p2, p0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr p0, v0

    .line 242
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr p1, v0

    .line 243
    invoke-virtual {p2, p0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    .line 244
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    add-int/lit8 p0, p0, 0x4

    add-int/lit8 p1, p1, 0x4

    .line 247
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 248
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    add-int v4, v3, p0

    .line 250
    aget-byte v5, p2, v4

    add-int v6, v3, p1

    aget-byte v7, p2, v6

    if-eq v5, v7, :cond_0

    .line 251
    aget-byte p0, p2, v4

    aget-byte p1, p2, v6

    sub-int/2addr p0, p1

    return p0

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    sub-int/2addr v0, v1

    return v0
.end method

.method protected static compareStrings(I[BLjava/nio/ByteBuffer;)I
    .locals 7

    .line 264
    invoke-virtual {p2, p0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr p0, v0

    .line 265
    invoke-virtual {p2, p0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    .line 266
    array-length v1, p1

    add-int/lit8 p0, p0, 0x4

    .line 268
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 269
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    add-int v4, v3, p0

    .line 271
    aget-byte v5, p2, v4

    aget-byte v6, p1, v3

    if-eq v5, v6, :cond_0

    .line 272
    aget-byte p0, p2, v4

    aget-byte p1, p1, v3

    sub-int/2addr p0, p1

    return p0

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    sub-int/2addr v0, v1

    return v0
.end method


# virtual methods
.method protected __indirect(I)I
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/newrelic/com/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr p1, v0

    return p1
.end method

.method protected __offset(I)I
    .locals 2

    .line 66
    iget v0, p0, Lcom/newrelic/com/google/flatbuffers/Table;->bb_pos:I

    iget-object v1, p0, Lcom/newrelic/com/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    sub-int/2addr v0, v1

    .line 67
    iget-object v1, p0, Lcom/newrelic/com/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v1

    if-ge p1, v1, :cond_0

    iget-object v1, p0, Lcom/newrelic/com/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    add-int/2addr v0, p1

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method protected __string(I)Ljava/lang/String;
    .locals 4

    .line 101
    sget-object v0, Lcom/newrelic/com/google/flatbuffers/Table;->UTF8_DECODER:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/charset/CharsetDecoder;

    .line 102
    invoke-virtual {v0}, Ljava/nio/charset/CharsetDecoder;->reset()Ljava/nio/charset/CharsetDecoder;

    .line 104
    iget-object v1, p0, Lcom/newrelic/com/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    add-int/2addr p1, v1

    .line 105
    iget-object v1, p0, Lcom/newrelic/com/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v1

    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 106
    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    add-int/lit8 p1, p1, 0x4

    .line 107
    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    add-int/2addr p1, v2

    .line 108
    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    int-to-float p1, v2

    .line 110
    invoke-virtual {v0}, Ljava/nio/charset/CharsetDecoder;->maxCharsPerByte()F

    move-result v2

    mul-float p1, p1, v2

    float-to-int p1, p1

    .line 111
    sget-object v2, Lcom/newrelic/com/google/flatbuffers/Table;->CHAR_BUFFER:Ljava/lang/ThreadLocal;

    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/nio/CharBuffer;

    if-eqz v2, :cond_0

    .line 112
    invoke-virtual {v2}, Ljava/nio/CharBuffer;->capacity()I

    move-result v3

    if-ge v3, p1, :cond_1

    .line 113
    :cond_0
    invoke-static {p1}, Ljava/nio/CharBuffer;->allocate(I)Ljava/nio/CharBuffer;

    move-result-object v2

    .line 114
    sget-object p1, Lcom/newrelic/com/google/flatbuffers/Table;->CHAR_BUFFER:Ljava/lang/ThreadLocal;

    invoke-virtual {p1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 117
    :cond_1
    invoke-virtual {v2}, Ljava/nio/CharBuffer;->clear()Ljava/nio/Buffer;

    const/4 p1, 0x1

    .line 120
    :try_start_0
    invoke-virtual {v0, v1, v2, p1}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;Ljava/nio/CharBuffer;Z)Ljava/nio/charset/CoderResult;

    move-result-object p1

    .line 121
    invoke-virtual {p1}, Ljava/nio/charset/CoderResult;->isUnderflow()Z

    move-result v0

    if-nez v0, :cond_2

    .line 122
    invoke-virtual {p1}, Ljava/nio/charset/CoderResult;->throwException()V
    :try_end_0
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 128
    :cond_2
    invoke-virtual {v2}, Ljava/nio/CharBuffer;->flip()Ljava/nio/Buffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 125
    new-instance v0, Ljava/lang/Error;

    invoke-direct {v0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method protected __union(Lcom/newrelic/com/google/flatbuffers/Table;I)Lcom/newrelic/com/google/flatbuffers/Table;
    .locals 1

    .line 183
    iget v0, p0, Lcom/newrelic/com/google/flatbuffers/Table;->bb_pos:I

    add-int/2addr p2, v0

    .line 184
    iget-object v0, p0, Lcom/newrelic/com/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr p2, v0

    iput p2, p1, Lcom/newrelic/com/google/flatbuffers/Table;->bb_pos:I

    .line 185
    iget-object p2, p0, Lcom/newrelic/com/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    iput-object p2, p1, Lcom/newrelic/com/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    return-object p1
.end method

.method protected __vector(I)I
    .locals 1

    .line 150
    iget v0, p0, Lcom/newrelic/com/google/flatbuffers/Table;->bb_pos:I

    add-int/2addr p1, v0

    .line 151
    iget-object v0, p0, Lcom/newrelic/com/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr p1, v0

    add-int/lit8 p1, p1, 0x4

    return p1
.end method

.method protected __vector_as_bytebuffer(II)Ljava/nio/ByteBuffer;
    .locals 2

    .line 166
    invoke-virtual {p0, p1}, Lcom/newrelic/com/google/flatbuffers/Table;->__offset(I)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 168
    :cond_0
    iget-object v0, p0, Lcom/newrelic/com/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 169
    invoke-virtual {p0, p1}, Lcom/newrelic/com/google/flatbuffers/Table;->__vector(I)I

    move-result v1

    .line 170
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 171
    invoke-virtual {p0, p1}, Lcom/newrelic/com/google/flatbuffers/Table;->__vector_len(I)I

    move-result p1

    mul-int p1, p1, p2

    add-int/2addr v1, p1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    return-object v0
.end method

.method protected __vector_len(I)I
    .locals 1

    .line 138
    iget v0, p0, Lcom/newrelic/com/google/flatbuffers/Table;->bb_pos:I

    add-int/2addr p1, v0

    .line 139
    iget-object v0, p0, Lcom/newrelic/com/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr p1, v0

    .line 140
    iget-object v0, p0, Lcom/newrelic/com/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    return p1
.end method

.method public getByteBuffer()Ljava/nio/ByteBuffer;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/newrelic/com/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method protected keysCompare(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/nio/ByteBuffer;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method protected sortTables([ILjava/nio/ByteBuffer;)V
    .locals 4

    .line 214
    array-length v0, p1

    new-array v0, v0, [Ljava/lang/Integer;

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 215
    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_0

    aget v3, p1, v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 216
    :cond_0
    new-instance v2, Lcom/newrelic/com/google/flatbuffers/Table$3;

    invoke-direct {v2, p0, p2}, Lcom/newrelic/com/google/flatbuffers/Table$3;-><init>(Lcom/newrelic/com/google/flatbuffers/Table;Ljava/nio/ByteBuffer;)V

    invoke-static {v0, v2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 221
    :goto_1
    array-length p2, p1

    if-ge v1, p2, :cond_1

    aget-object p2, v0, v1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    aput p2, p1, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method
