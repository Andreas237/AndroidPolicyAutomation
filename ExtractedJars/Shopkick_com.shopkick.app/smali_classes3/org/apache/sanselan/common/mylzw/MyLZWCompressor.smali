.class public Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;
.super Ljava/lang/Object;
.source "MyLZWCompressor.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$Listener;,
        Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;
    }
.end annotation


# instance fields
.field private final byteOrder:I

.field private final clearCode:I

.field private codeSize:I

.field private codes:I

.field private final earlyLimit:Z

.field private final eoiCode:I

.field private final initialCodeSize:I

.field private final listener:Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$Listener;

.field private final map:Ljava/util/Map;


# direct methods
.method public constructor <init>(IIZ)V
    .locals 1

    const/4 v0, 0x0

    .line 42
    invoke-direct {p0, p1, p2, p3, v0}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;-><init>(IIZLorg/apache/sanselan/common/mylzw/MyLZWCompressor$Listener;)V

    return-void
.end method

.method public constructor <init>(IIZLorg/apache/sanselan/common/mylzw/MyLZWCompressor$Listener;)V
    .locals 1

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 31
    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->codes:I

    .line 63
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->map:Ljava/util/Map;

    .line 48
    iput-object p4, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->listener:Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$Listener;

    .line 49
    iput p2, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->byteOrder:I

    .line 50
    iput-boolean p3, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->earlyLimit:Z

    .line 52
    iput p1, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->initialCodeSize:I

    const/4 p2, 0x1

    shl-int p1, p2, p1

    .line 54
    iput p1, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->clearCode:I

    .line 55
    iget p1, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->clearCode:I

    add-int/lit8 p2, p1, 0x1

    iput p2, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->eoiCode:I

    if-eqz p4, :cond_0

    .line 58
    iget p2, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->eoiCode:I

    invoke-interface {p4, p1, p2}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$Listener;->init(II)V

    .line 60
    :cond_0
    invoke-direct {p0}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->InitializeStringTable()V

    return-void
.end method

.method private final InitializeStringTable()V
    .locals 6

    .line 67
    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->initialCodeSize:I

    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->codeSize:I

    .line 69
    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->codeSize:I

    const/4 v1, 0x1

    shl-int v0, v1, v0

    add-int/lit8 v0, v0, 0x2

    .line 71
    iget-object v2, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->map:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->clear()V

    const/4 v2, 0x0

    .line 72
    :goto_0
    iput v2, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->codes:I

    iget v2, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->codes:I

    if-ge v2, v0, :cond_1

    .line 74
    iget v3, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->clearCode:I

    if-eq v2, v3, :cond_0

    iget v3, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->eoiCode:I

    if-eq v2, v3, :cond_0

    int-to-byte v2, v2

    .line 76
    invoke-direct {p0, v2}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->arrayToKey(B)Ljava/lang/Object;

    move-result-object v2

    .line 78
    iget-object v3, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->map:Ljava/util/Map;

    new-instance v4, Ljava/lang/Integer;

    iget v5, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->codes:I

    invoke-direct {v4, v5}, Ljava/lang/Integer;-><init>(I)V

    invoke-interface {v3, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    :cond_0
    iget v2, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->codes:I

    add-int/2addr v2, v1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private final addTableEntry(Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;Ljava/lang/Object;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 216
    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->codeSize:I

    const/4 v1, 0x1

    shl-int v0, v1, v0

    .line 217
    iget-boolean v2, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->earlyLimit:Z

    if-eqz v2, :cond_0

    add-int/lit8 v0, v0, -0x1

    .line 220
    :cond_0
    iget v2, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->codes:I

    if-ne v2, v0, :cond_2

    .line 222
    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->codeSize:I

    const/16 v2, 0xc

    if-ge v0, v2, :cond_1

    .line 223
    invoke-direct {p0}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->incrementCodeSize()V

    goto :goto_0

    .line 226
    :cond_1
    invoke-direct {p0, p1}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->writeClearCode(Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;)V

    .line 227
    invoke-direct {p0}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->clearTable()V

    move p1, v1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    :goto_1
    if-nez p1, :cond_3

    .line 235
    iget-object v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->map:Ljava/util/Map;

    new-instance v2, Ljava/lang/Integer;

    iget v3, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->codes:I

    invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V

    invoke-interface {v0, p2, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    iget p2, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->codes:I

    add-int/2addr p2, v1

    iput p2, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->codes:I

    :cond_3
    return p1
.end method

.method private final addTableEntry(Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;[BII)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 206
    invoke-direct {p0, p2, p3, p4}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->arrayToKey([BII)Ljava/lang/Object;

    move-result-object p2

    .line 207
    invoke-direct {p0, p1, p2}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->addTableEntry(Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private final arrayToKey(B)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x1

    .line 97
    new-array v1, v0, [B

    const/4 v2, 0x0

    aput-byte p1, v1, v2

    invoke-direct {p0, v1, v2, v0}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->arrayToKey([BII)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final arrayToKey([BII)Ljava/lang/Object;
    .locals 1

    .line 154
    new-instance v0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;

    invoke-direct {v0, p1, p2, p3}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;-><init>([BII)V

    return-object v0
.end method

.method private final clearTable()V
    .locals 0

    .line 85
    invoke-direct {p0}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->InitializeStringTable()V

    .line 86
    invoke-direct {p0}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->incrementCodeSize()V

    return-void
.end method

.method private final codeFromString([BII)I
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 196
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->arrayToKey([BII)Ljava/lang/Object;

    move-result-object p1

    .line 197
    iget-object p2, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->map:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 200
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    .line 199
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "CodeFromString"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final incrementCodeSize()V
    .locals 2

    .line 91
    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->codeSize:I

    const/16 v1, 0xc

    if-eq v0, v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    .line 92
    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->codeSize:I

    :cond_0
    return-void
.end method

.method private final isInTable([BII)Z
    .locals 0

    .line 188
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->arrayToKey([BII)Ljava/lang/Object;

    move-result-object p1

    .line 190
    iget-object p2, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->map:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private final writeClearCode(Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 168
    iget-object v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->listener:Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$Listener;

    if-eqz v0, :cond_0

    .line 169
    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->clearCode:I

    invoke-interface {v0, v1}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$Listener;->dataCode(I)V

    .line 170
    :cond_0
    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->clearCode:I

    invoke-direct {p0, p1, v0}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->writeCode(Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;I)V

    return-void
.end method

.method private final writeCode(Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 183
    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->codeSize:I

    invoke-virtual {p1, p2, v0}, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->writeBits(II)V

    return-void
.end method

.method private final writeDataCode(Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 160
    iget-object v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->listener:Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$Listener;

    if-eqz v0, :cond_0

    .line 161
    invoke-interface {v0, p2}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$Listener;->dataCode(I)V

    .line 162
    :cond_0
    invoke-direct {p0, p1, p2}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->writeCode(Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;I)V

    return-void
.end method

.method private final writeEoiCode(Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 175
    iget-object v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->listener:Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$Listener;

    if-eqz v0, :cond_0

    .line 176
    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->eoiCode:I

    invoke-interface {v0, v1}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$Listener;->eoiCode(I)V

    .line 177
    :cond_0
    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->eoiCode:I

    invoke-direct {p0, p1, v0}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->writeCode(Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;I)V

    return-void
.end method


# virtual methods
.method public compress([B)[B
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 255
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 256
    new-instance v1, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;

    iget v2, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->byteOrder:I

    invoke-direct {v1, v0, v2}, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;-><init>(Ljava/io/OutputStream;I)V

    .line 258
    invoke-direct {p0}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->InitializeStringTable()V

    .line 259
    invoke-direct {p0}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->clearTable()V

    .line 260
    invoke-direct {p0, v1}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->writeClearCode(Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;)V

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    .line 266
    :goto_0
    array-length v5, p1

    if-ge v2, v5, :cond_1

    add-int/lit8 v5, v4, 0x1

    .line 268
    invoke-direct {p0, p1, v3, v5}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->isInTable([BII)Z

    move-result v6

    if-eqz v6, :cond_0

    move v4, v5

    goto :goto_1

    .line 275
    :cond_0
    invoke-direct {p0, p1, v3, v4}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->codeFromString([BII)I

    move-result v4

    .line 276
    invoke-direct {p0, v1, v4}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->writeDataCode(Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;I)V

    .line 277
    invoke-direct {p0, v1, p1, v3, v5}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->addTableEntry(Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;[BII)Z

    const/4 v3, 0x1

    move v4, v3

    move v3, v2

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 284
    :cond_1
    invoke-direct {p0, p1, v3, v4}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->codeFromString([BII)I

    move-result p1

    .line 285
    invoke-direct {p0, v1, p1}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->writeDataCode(Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;I)V

    .line 287
    invoke-direct {p0, v1}, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor;->writeEoiCode(Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;)V

    .line 289
    invoke-virtual {v1}, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->flushCache()V

    .line 291
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    return-object p1
.end method
