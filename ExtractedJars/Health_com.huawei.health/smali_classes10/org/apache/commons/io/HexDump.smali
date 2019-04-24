.class public Lorg/apache/commons/io/HexDump;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final EOL:Ljava/lang/String;

.field private static final _hexcodes:[C

.field private static final _shifts:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 121
    const-string v0, "line.separator"

    .line 122
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/io/HexDump;->EOL:Ljava/lang/String;

    .line 123
    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lorg/apache/commons/io/HexDump;->_hexcodes:[C

    .line 128
    const/16 v0, 0x8

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lorg/apache/commons/io/HexDump;->_shifts:[I

    return-void

    nop

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data

    :array_1
    .array-data 4
        0x1c
        0x18
        0x14
        0x10
        0xc
        0x8
        0x4
        0x0
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    return-void
.end method

.method private static dump(Ljava/lang/StringBuilder;B)Ljava/lang/StringBuilder;
    .locals 4

    .line 156
    const/4 v3, 0x0

    :goto_0
    const/4 v0, 0x2

    if-ge v3, v0, :cond_0

    .line 157
    sget-object v0, Lorg/apache/commons/io/HexDump;->_hexcodes:[C

    sget-object v1, Lorg/apache/commons/io/HexDump;->_shifts:[I

    add-int/lit8 v2, v3, 0x6

    aget v1, v1, v2

    shr-int v1, p1, v1

    and-int/lit8 v1, v1, 0xf

    aget-char v0, v0, v1

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 156
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 159
    :cond_0
    return-object p0
.end method

.method private static dump(Ljava/lang/StringBuilder;J)Ljava/lang/StringBuilder;
    .locals 4

    .line 141
    const/4 v3, 0x0

    :goto_0
    const/16 v0, 0x8

    if-ge v3, v0, :cond_0

    .line 142
    sget-object v0, Lorg/apache/commons/io/HexDump;->_hexcodes:[C

    sget-object v1, Lorg/apache/commons/io/HexDump;->_shifts:[I

    aget v1, v1, v3

    shr-long v1, p1, v1

    long-to-int v1, v1

    and-int/lit8 v1, v1, 0xf

    aget-char v0, v0, v1

    .line 143
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 141
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 145
    :cond_0
    return-object p0
.end method

.method public static dump([BJLjava/io/OutputStream;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ArrayIndexOutOfBoundsException;,
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 76
    if-ltz p4, :cond_0

    array-length v0, p0

    if-lt p4, v0, :cond_1

    .line 77
    :cond_0
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "illegal index: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " into array of length "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    array-length v2, p0

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 81
    :cond_1
    if-nez p3, :cond_2

    .line 82
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "cannot write to nullstream"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 84
    :cond_2
    int-to-long v0, p4

    add-long v3, p1, v0

    .line 85
    new-instance v5, Ljava/lang/StringBuilder;

    const/16 v0, 0x4a

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 87
    move v6, p4

    :goto_0
    array-length v0, p0

    if-ge v6, v0, :cond_8

    .line 88
    array-length v0, p0

    sub-int v7, v0, v6

    .line 90
    const/16 v0, 0x10

    if-le v7, v0, :cond_3

    .line 91
    const/16 v7, 0x10

    .line 93
    :cond_3
    invoke-static {v5, v3, v4}, Lorg/apache/commons/io/HexDump;->dump(Ljava/lang/StringBuilder;J)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 94
    const/4 v8, 0x0

    :goto_1
    const/16 v0, 0x10

    if-ge v8, v0, :cond_5

    .line 95
    if-ge v8, v7, :cond_4

    .line 96
    add-int v0, v8, v6

    aget-byte v0, p0, v0

    invoke-static {v5, v0}, Lorg/apache/commons/io/HexDump;->dump(Ljava/lang/StringBuilder;B)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 98
    :cond_4
    const-string v0, "  "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    :goto_2
    const/16 v0, 0x20

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 94
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 102
    :cond_5
    const/4 v8, 0x0

    :goto_3
    if-ge v8, v7, :cond_7

    .line 103
    add-int v0, v8, v6

    aget-byte v0, p0, v0

    const/16 v1, 0x20

    if-lt v0, v1, :cond_6

    add-int v0, v8, v6

    aget-byte v0, p0, v0

    const/16 v1, 0x7f

    if-ge v0, v1, :cond_6

    .line 104
    add-int v0, v8, v6

    aget-byte v0, p0, v0

    int-to-char v0, v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_4

    .line 106
    :cond_6
    const/16 v0, 0x2e

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 102
    :goto_4
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    .line 109
    :cond_7
    sget-object v0, Lorg/apache/commons/io/HexDump;->EOL:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/OutputStream;->write([B)V

    .line 112
    invoke-virtual {p3}, Ljava/io/OutputStream;->flush()V

    .line 113
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 114
    int-to-long v0, v7

    add-long/2addr v3, v0

    .line 87
    add-int/lit8 v6, v6, 0x10

    goto/16 :goto_0

    .line 116
    :cond_8
    return-void
.end method
