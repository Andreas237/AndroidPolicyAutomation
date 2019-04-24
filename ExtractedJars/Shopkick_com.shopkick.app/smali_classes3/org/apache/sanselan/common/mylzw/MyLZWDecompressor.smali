.class public final Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;
.super Ljava/lang/Object;
.source "MyLZWDecompressor.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor$Listener;
    }
.end annotation


# static fields
.field private static final MAX_TABLE_SIZE:I = 0x1000


# instance fields
.field private final byteOrder:I

.field private final clearCode:I

.field private codeSize:I

.field private codes:I

.field private final eoiCode:I

.field private final initialCodeSize:I

.field private final listener:Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor$Listener;

.field private final table:[[B

.field private tiffLZWMode:Z

.field private written:I


# direct methods
.method public constructor <init>(II)V
    .locals 1

    const/4 v0, 0x0

    .line 46
    invoke-direct {p0, p1, p2, v0}, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;-><init>(IILorg/apache/sanselan/common/mylzw/MyLZWDecompressor$Listener;)V

    return-void
.end method

.method public constructor <init>(IILorg/apache/sanselan/common/mylzw/MyLZWDecompressor$Listener;)V
    .locals 1

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 31
    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->codes:I

    const/4 v0, 0x0

    .line 137
    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->written:I

    .line 146
    iput-boolean v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->tiffLZWMode:Z

    .line 52
    iput-object p3, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->listener:Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor$Listener;

    .line 53
    iput p2, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->byteOrder:I

    .line 55
    iput p1, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->initialCodeSize:I

    const/16 p2, 0x1000

    .line 57
    new-array p2, p2, [[B

    iput-object p2, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->table:[[B

    const/4 p2, 0x1

    shl-int p1, p2, p1

    .line 58
    iput p1, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->clearCode:I

    .line 59
    iget p1, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->clearCode:I

    add-int/lit8 p2, p1, 0x1

    iput p2, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->eoiCode:I

    if-eqz p3, :cond_0

    .line 62
    iget p2, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->eoiCode:I

    invoke-interface {p3, p1, p2}, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor$Listener;->init(II)V

    .line 64
    :cond_0
    invoke-direct {p0}, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->InitializeTable()V

    return-void
.end method

.method private final InitializeTable()V
    .locals 7

    .line 69
    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->initialCodeSize:I

    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->codeSize:I

    .line 71
    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->codeSize:I

    add-int/lit8 v0, v0, 0x2

    const/4 v1, 0x1

    shl-int v0, v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_0

    .line 74
    iget-object v4, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->table:[[B

    new-array v5, v1, [B

    int-to-byte v6, v3

    aput-byte v6, v5, v2

    aput-object v5, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final addStringToTable([B)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 117
    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->codes:I

    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->codeSize:I

    const/4 v2, 0x1

    shl-int v1, v2, v1

    if-ge v0, v1, :cond_0

    .line 119
    iget-object v1, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->table:[[B

    aput-object p1, v1, v0

    add-int/2addr v0, v2

    .line 120
    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->codes:I

    .line 125
    invoke-direct {p0}, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->checkCodeSize()V

    return-void

    .line 122
    :cond_0
    new-instance p1, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AddStringToTable: codes: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->codes:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " code_size: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->codeSize:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final appendBytes([BB)[B
    .locals 3

    .line 130
    array-length v0, p1

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [B

    .line 132
    array-length v1, p1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 133
    array-length p1, v0

    add-int/lit8 p1, p1, -0x1

    aput-byte p2, v0, p1

    return-object v0
.end method

.method private final checkCodeSize()V
    .locals 2

    .line 213
    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->codeSize:I

    const/4 v1, 0x1

    shl-int v0, v1, v0

    .line 214
    iget-boolean v1, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->tiffLZWMode:Z

    if-eqz v1, :cond_0

    add-int/lit8 v0, v0, -0x1

    .line 217
    :cond_0
    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->codes:I

    if-ne v1, v0, :cond_1

    .line 218
    invoke-direct {p0}, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->incrementCodeSize()V

    :cond_1
    return-void
.end method

.method private final clearTable()V
    .locals 2

    .line 79
    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->initialCodeSize:I

    const/4 v1, 0x1

    shl-int/2addr v1, v0

    add-int/lit8 v1, v1, 0x2

    iput v1, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->codes:I

    .line 80
    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->codeSize:I

    .line 81
    invoke-direct {p0}, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->incrementCodeSize()V

    return-void
.end method

.method private final firstChar([B)B
    .locals 1

    const/4 v0, 0x0

    .line 112
    aget-byte p1, p1, v0

    return p1
.end method

.method private final getNextCode(Lorg/apache/sanselan/common/mylzw/MyBitInputStream;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 89
    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->codeSize:I

    invoke-virtual {p1, v0}, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->readBits(I)I

    move-result p1

    .line 91
    iget-object v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->listener:Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor$Listener;

    if-eqz v0, :cond_0

    .line 92
    invoke-interface {v0, p1}, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor$Listener;->code(I)V

    :cond_0
    return p1
.end method

.method private final incrementCodeSize()V
    .locals 2

    .line 223
    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->codeSize:I

    const/16 v1, 0xc

    if-eq v0, v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    .line 224
    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->codeSize:I

    :cond_0
    return-void
.end method

.method private final isInTable(I)Z
    .locals 1

    .line 107
    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->codes:I

    if-ge p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final stringFromCode(I)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 98
    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->codes:I

    if-ge p1, v0, :cond_0

    if-ltz p1, :cond_0

    .line 102
    iget-object v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->table:[[B

    aget-object p1, v0, p1

    return-object p1

    .line 99
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Bad Code: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " codes: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->codes:I

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " code_size: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->codeSize:I

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", table: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->table:[[B

    array-length p1, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final writeToResult(Ljava/io/OutputStream;[B)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 142
    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    .line 143
    iget p1, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->written:I

    array-length p2, p2

    add-int/2addr p1, p2

    iput p1, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->written:I

    return-void
.end method


# virtual methods
.method public decompress(Ljava/io/InputStream;I)[B
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 157
    new-instance v0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;

    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->byteOrder:I

    invoke-direct {v0, p1, v1}, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 158
    iget-boolean p1, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->tiffLZWMode:Z

    if-eqz p1, :cond_0

    .line 159
    invoke-virtual {v0}, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->setTiffLZWMode()V

    .line 161
    :cond_0
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p1, p2}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 163
    invoke-direct {p0}, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->clearTable()V

    const/4 v1, -0x1

    .line 165
    :cond_1
    invoke-direct {p0, v0}, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->getNextCode(Lorg/apache/sanselan/common/mylzw/MyBitInputStream;)I

    move-result v2

    iget v3, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->eoiCode:I

    if-eq v2, v3, :cond_6

    .line 167
    iget v3, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->clearCode:I

    if-ne v2, v3, :cond_4

    .line 169
    invoke-direct {p0}, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->clearTable()V

    .line 171
    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->written:I

    if-lt v1, p2, :cond_2

    goto :goto_2

    .line 173
    :cond_2
    invoke-direct {p0, v0}, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->getNextCode(Lorg/apache/sanselan/common/mylzw/MyBitInputStream;)I

    move-result v1

    .line 175
    iget v2, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->eoiCode:I

    if-ne v1, v2, :cond_3

    goto :goto_2

    .line 179
    :cond_3
    invoke-direct {p0, v1}, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->stringFromCode(I)[B

    move-result-object v2

    invoke-direct {p0, p1, v2}, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->writeToResult(Ljava/io/OutputStream;[B)V

    goto :goto_1

    .line 185
    :cond_4
    invoke-direct {p0, v2}, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->isInTable(I)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 187
    invoke-direct {p0, v2}, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->stringFromCode(I)[B

    move-result-object v3

    invoke-direct {p0, p1, v3}, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->writeToResult(Ljava/io/OutputStream;[B)V

    .line 189
    invoke-direct {p0, v1}, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->stringFromCode(I)[B

    move-result-object v1

    .line 190
    invoke-direct {p0, v2}, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->stringFromCode(I)[B

    move-result-object v3

    invoke-direct {p0, v3}, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->firstChar([B)B

    move-result v3

    .line 189
    invoke-direct {p0, v1, v3}, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->appendBytes([BB)[B

    move-result-object v1

    invoke-direct {p0, v1}, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->addStringToTable([B)V

    goto :goto_0

    .line 194
    :cond_5
    invoke-direct {p0, v1}, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->stringFromCode(I)[B

    move-result-object v3

    .line 195
    invoke-direct {p0, v1}, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->stringFromCode(I)[B

    move-result-object v1

    invoke-direct {p0, v1}, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->firstChar([B)B

    move-result v1

    .line 194
    invoke-direct {p0, v3, v1}, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->appendBytes([BB)[B

    move-result-object v1

    .line 196
    invoke-direct {p0, p1, v1}, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->writeToResult(Ljava/io/OutputStream;[B)V

    .line 197
    invoke-direct {p0, v1}, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->addStringToTable([B)V

    :goto_0
    move v1, v2

    .line 202
    :goto_1
    iget v2, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->written:I

    if-lt v2, p2, :cond_1

    .line 206
    :cond_6
    :goto_2
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    return-object p1
.end method

.method public setTiffLZWMode()V
    .locals 1

    const/4 v0, 0x1

    .line 150
    iput-boolean v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWDecompressor;->tiffLZWMode:Z

    return-void
.end method
