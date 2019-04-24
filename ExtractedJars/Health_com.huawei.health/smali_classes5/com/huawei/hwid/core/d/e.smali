.class public Lcom/huawei/hwid/core/d/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/xmlpull/v1/XmlSerializer;


# static fields
.field private static final a:[Ljava/lang/String;

.field private static b:Ljava/lang/String;


# instance fields
.field private final c:[C

.field private d:I

.field private e:Ljava/io/Writer;

.field private f:Ljava/io/OutputStream;

.field private g:Ljava/nio/charset/CharsetEncoder;

.field private h:Ljava/nio/ByteBuffer;

.field private i:Z

.field private j:Z

.field private k:I

.field private l:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 39
    const/16 v0, 0x40

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x10

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x11

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x12

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x13

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x14

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x15

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x16

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x17

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x18

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x19

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x1d

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x1e

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x1f

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x20

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x21

    aput-object v1, v0, v2

    const-string v1, "&quot;"

    const/16 v2, 0x22

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x23

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x24

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x25

    aput-object v1, v0, v2

    const-string v1, "&amp;"

    const/16 v2, 0x26

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x27

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x28

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x29

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x2a

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x2b

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x2c

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x2d

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x2e

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x2f

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x30

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x31

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x32

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x33

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x34

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x35

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x36

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x37

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x38

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x39

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x3a

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x3b

    aput-object v1, v0, v2

    const-string v1, "&lt;"

    const/16 v2, 0x3c

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x3d

    aput-object v1, v0, v2

    const-string v1, "&gt;"

    const/16 v2, 0x3e

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x3f

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/hwid/core/d/e;->a:[Ljava/lang/String;

    .line 51
    const-string v0, "                                                              "

    sput-object v0, Lcom/huawei/hwid/core/d/e;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    const/16 v0, 0x2000

    new-array v0, v0, [C

    iput-object v0, p0, Lcom/huawei/hwid/core/d/e;->c:[C

    .line 60
    const/16 v0, 0x2000

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/d/e;->h:Ljava/nio/ByteBuffer;

    .line 62
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/core/d/e;->i:Z

    .line 65
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwid/core/d/e;->k:I

    .line 66
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwid/core/d/e;->l:Z

    return-void
.end method

.method private a()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 230
    iget-object v0, p0, Lcom/huawei/hwid/core/d/e;->h:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    move v3, v0

    if-lez v0, :cond_0

    .line 231
    iget-object v0, p0, Lcom/huawei/hwid/core/d/e;->h:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 232
    iget-object v0, p0, Lcom/huawei/hwid/core/d/e;->f:Ljava/io/OutputStream;

    iget-object v1, p0, Lcom/huawei/hwid/core/d/e;->h:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 233
    iget-object v0, p0, Lcom/huawei/hwid/core/d/e;->h:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 235
    :cond_0
    return-void
.end method

.method private a(C)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 69
    iget v1, p0, Lcom/huawei/hwid/core/d/e;->d:I

    .line 70
    const/16 v0, 0x1fff

    if-lt v1, v0, :cond_0

    .line 71
    invoke-virtual {p0}, Lcom/huawei/hwid/core/d/e;->flush()V

    .line 72
    iget v1, p0, Lcom/huawei/hwid/core/d/e;->d:I

    .line 74
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/core/d/e;->c:[C

    aput-char p1, v0, v1

    .line 75
    add-int/lit8 v0, v1, 0x1

    iput v0, p0, Lcom/huawei/hwid/core/d/e;->d:I

    .line 76
    return-void
.end method

.method private a(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 121
    mul-int/lit8 p1, p1, 0x4

    .line 122
    sget-object v0, Lcom/huawei/hwid/core/d/e;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-le p1, v0, :cond_0

    .line 123
    sget-object v0, Lcom/huawei/hwid/core/d/e;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p1

    .line 125
    :cond_0
    sget-object v0, Lcom/huawei/hwid/core/d/e;->b:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1}, Lcom/huawei/hwid/core/d/e;->a(Ljava/lang/String;II)V

    .line 126
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 117
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0}, Lcom/huawei/hwid/core/d/e;->a(Ljava/lang/String;II)V

    .line 118
    return-void
.end method

.method private a(Ljava/lang/String;II)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 79
    const/16 v0, 0x2000

    if-le p3, v0, :cond_2

    .line 80
    add-int v2, p2, p3

    .line 81
    :goto_0
    if-ge p2, v2, :cond_1

    .line 82
    add-int/lit16 v3, p2, 0x2000

    .line 83
    if-ge v3, v2, :cond_0

    const/16 v0, 0x2000

    goto :goto_1

    :cond_0
    sub-int v0, v2, p2

    :goto_1
    invoke-direct {p0, p1, p2, v0}, Lcom/huawei/hwid/core/d/e;->a(Ljava/lang/String;II)V

    .line 84
    move p2, v3

    .line 85
    goto :goto_0

    .line 86
    :cond_1
    return-void

    .line 88
    :cond_2
    iget v2, p0, Lcom/huawei/hwid/core/d/e;->d:I

    .line 89
    add-int v0, v2, p3

    const/16 v1, 0x2000

    if-le v0, v1, :cond_3

    .line 90
    invoke-virtual {p0}, Lcom/huawei/hwid/core/d/e;->flush()V

    .line 91
    iget v2, p0, Lcom/huawei/hwid/core/d/e;->d:I

    .line 93
    :cond_3
    add-int v0, p2, p3

    iget-object v1, p0, Lcom/huawei/hwid/core/d/e;->c:[C

    invoke-virtual {p1, p2, v0, v1, v2}, Ljava/lang/String;->getChars(II[CI)V

    .line 94
    add-int v0, v2, p3

    iput v0, p0, Lcom/huawei/hwid/core/d/e;->d:I

    .line 95
    return-void
.end method

.method private a([CII)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 98
    const/16 v0, 0x2000

    if-le p3, v0, :cond_2

    .line 99
    add-int v2, p2, p3

    .line 100
    :goto_0
    if-ge p2, v2, :cond_1

    .line 101
    add-int/lit16 v3, p2, 0x2000

    .line 102
    if-ge v3, v2, :cond_0

    const/16 v0, 0x2000

    goto :goto_1

    :cond_0
    sub-int v0, v2, p2

    :goto_1
    invoke-direct {p0, p1, p2, v0}, Lcom/huawei/hwid/core/d/e;->a([CII)V

    .line 103
    move p2, v3

    .line 104
    goto :goto_0

    .line 105
    :cond_1
    return-void

    .line 107
    :cond_2
    iget v2, p0, Lcom/huawei/hwid/core/d/e;->d:I

    .line 108
    add-int v0, v2, p3

    const/16 v1, 0x2000

    if-le v0, v1, :cond_3

    .line 109
    invoke-virtual {p0}, Lcom/huawei/hwid/core/d/e;->flush()V

    .line 110
    iget v2, p0, Lcom/huawei/hwid/core/d/e;->d:I

    .line 112
    :cond_3
    iget-object v0, p0, Lcom/huawei/hwid/core/d/e;->c:[C

    invoke-static {p1, p2, v0, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 113
    add-int v0, v2, p3

    iput v0, p0, Lcom/huawei/hwid/core/d/e;->d:I

    .line 114
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 129
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    .line 130
    sget-object v0, Lcom/huawei/hwid/core/d/e;->a:[Ljava/lang/String;

    array-length v0, v0

    int-to-char v2, v0

    .line 131
    sget-object v3, Lcom/huawei/hwid/core/d/e;->a:[Ljava/lang/String;

    .line 132
    const/4 v4, 0x0

    .line 134
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v1, :cond_3

    .line 135
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v6

    .line 136
    if-lt v6, v2, :cond_0

    .line 137
    goto :goto_1

    .line 138
    :cond_0
    aget-object v7, v3, v6

    .line 139
    if-nez v7, :cond_1

    .line 140
    goto :goto_1

    .line 141
    :cond_1
    if-ge v4, v5, :cond_2

    .line 142
    sub-int v0, v5, v4

    invoke-direct {p0, p1, v4, v0}, Lcom/huawei/hwid/core/d/e;->a(Ljava/lang/String;II)V

    .line 143
    :cond_2
    add-int/lit8 v4, v5, 0x1

    .line 144
    invoke-direct {p0, v7}, Lcom/huawei/hwid/core/d/e;->a(Ljava/lang/String;)V

    .line 134
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 146
    :cond_3
    if-ge v4, v5, :cond_4

    .line 147
    sub-int v0, v5, v4

    invoke-direct {p0, p1, v4, v0}, Lcom/huawei/hwid/core/d/e;->a(Ljava/lang/String;II)V

    .line 148
    :cond_4
    return-void
.end method

.method private b([CII)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 151
    sget-object v0, Lcom/huawei/hwid/core/d/e;->a:[Ljava/lang/String;

    array-length v0, v0

    int-to-char v1, v0

    .line 152
    sget-object v2, Lcom/huawei/hwid/core/d/e;->a:[Ljava/lang/String;

    .line 153
    add-int v3, p2, p3

    .line 154
    move v4, p2

    .line 156
    move v5, p2

    :goto_0
    if-ge v5, v3, :cond_3

    .line 157
    aget-char v6, p1, v5

    .line 158
    if-lt v6, v1, :cond_0

    .line 159
    goto :goto_1

    .line 160
    :cond_0
    aget-object v7, v2, v6

    .line 161
    if-nez v7, :cond_1

    .line 162
    goto :goto_1

    .line 163
    :cond_1
    if-ge v4, v5, :cond_2

    .line 164
    sub-int v0, v5, v4

    invoke-direct {p0, p1, v4, v0}, Lcom/huawei/hwid/core/d/e;->a([CII)V

    .line 165
    :cond_2
    add-int/lit8 v4, v5, 0x1

    .line 166
    invoke-direct {p0, v7}, Lcom/huawei/hwid/core/d/e;->a(Ljava/lang/String;)V

    .line 156
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 168
    :cond_3
    if-ge v4, v5, :cond_4

    .line 169
    sub-int v0, v5, v4

    invoke-direct {p0, p1, v4, v0}, Lcom/huawei/hwid/core/d/e;->a([CII)V

    .line 170
    :cond_4
    return-void
.end method


# virtual methods
.method public attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 173
    const/16 v0, 0x20

    invoke-direct {p0, v0}, Lcom/huawei/hwid/core/d/e;->a(C)V

    .line 174
    if-eqz p1, :cond_0

    .line 175
    invoke-direct {p0, p1}, Lcom/huawei/hwid/core/d/e;->a(Ljava/lang/String;)V

    .line 176
    const/16 v0, 0x3a

    invoke-direct {p0, v0}, Lcom/huawei/hwid/core/d/e;->a(C)V

    .line 178
    :cond_0
    invoke-direct {p0, p2}, Lcom/huawei/hwid/core/d/e;->a(Ljava/lang/String;)V

    .line 179
    const-string v0, "=\""

    invoke-direct {p0, v0}, Lcom/huawei/hwid/core/d/e;->a(Ljava/lang/String;)V

    .line 181
    invoke-direct {p0, p3}, Lcom/huawei/hwid/core/d/e;->b(Ljava/lang/String;)V

    .line 182
    const/16 v0, 0x22

    invoke-direct {p0, v0}, Lcom/huawei/hwid/core/d/e;->a(C)V

    .line 183
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/core/d/e;->l:Z

    .line 184
    return-object p0
.end method

.method public cdsect(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 188
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public comment(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 192
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public docdecl(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 196
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public endDocument()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 200
    invoke-virtual {p0}, Lcom/huawei/hwid/core/d/e;->flush()V

    .line 201
    return-void
.end method

.method public endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 204
    iget v0, p0, Lcom/huawei/hwid/core/d/e;->k:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/hwid/core/d/e;->k:I

    .line 205
    iget-boolean v0, p0, Lcom/huawei/hwid/core/d/e;->j:Z

    if-eqz v0, :cond_0

    .line 206
    const-string v0, " />\n"

    invoke-direct {p0, v0}, Lcom/huawei/hwid/core/d/e;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 208
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/hwid/core/d/e;->i:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/huawei/hwid/core/d/e;->l:Z

    if-eqz v0, :cond_1

    .line 209
    iget v0, p0, Lcom/huawei/hwid/core/d/e;->k:I

    invoke-direct {p0, v0}, Lcom/huawei/hwid/core/d/e;->a(I)V

    .line 211
    :cond_1
    const-string v0, "</"

    invoke-direct {p0, v0}, Lcom/huawei/hwid/core/d/e;->a(Ljava/lang/String;)V

    .line 212
    if-eqz p1, :cond_2

    .line 213
    invoke-direct {p0, p1}, Lcom/huawei/hwid/core/d/e;->a(Ljava/lang/String;)V

    .line 214
    const/16 v0, 0x3a

    invoke-direct {p0, v0}, Lcom/huawei/hwid/core/d/e;->a(C)V

    .line 216
    :cond_2
    invoke-direct {p0, p2}, Lcom/huawei/hwid/core/d/e;->a(Ljava/lang/String;)V

    .line 217
    const-string v0, ">\n"

    invoke-direct {p0, v0}, Lcom/huawei/hwid/core/d/e;->a(Ljava/lang/String;)V

    .line 219
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwid/core/d/e;->l:Z

    .line 220
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/core/d/e;->j:Z

    .line 221
    return-object p0
.end method

.method public entityRef(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 225
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public flush()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 239
    iget v0, p0, Lcom/huawei/hwid/core/d/e;->d:I

    if-lez v0, :cond_3

    .line 240
    iget-object v0, p0, Lcom/huawei/hwid/core/d/e;->f:Ljava/io/OutputStream;

    if-eqz v0, :cond_2

    .line 241
    iget-object v0, p0, Lcom/huawei/hwid/core/d/e;->c:[C

    iget v1, p0, Lcom/huawei/hwid/core/d/e;->d:I

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Ljava/nio/CharBuffer;->wrap([CII)Ljava/nio/CharBuffer;

    move-result-object v4

    .line 242
    iget-object v0, p0, Lcom/huawei/hwid/core/d/e;->g:Ljava/nio/charset/CharsetEncoder;

    iget-object v1, p0, Lcom/huawei/hwid/core/d/e;->h:Ljava/nio/ByteBuffer;

    const/4 v2, 0x1

    invoke-virtual {v0, v4, v1, v2}, Ljava/nio/charset/CharsetEncoder;->encode(Ljava/nio/CharBuffer;Ljava/nio/ByteBuffer;Z)Ljava/nio/charset/CoderResult;

    move-result-object v5

    .line 244
    :goto_0
    invoke-virtual {v5}, Ljava/nio/charset/CoderResult;->isError()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 245
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {v5}, Ljava/nio/charset/CoderResult;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 246
    :cond_0
    invoke-virtual {v5}, Ljava/nio/charset/CoderResult;->isOverflow()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 247
    invoke-direct {p0}, Lcom/huawei/hwid/core/d/e;->a()V

    .line 248
    iget-object v0, p0, Lcom/huawei/hwid/core/d/e;->g:Ljava/nio/charset/CharsetEncoder;

    iget-object v1, p0, Lcom/huawei/hwid/core/d/e;->h:Ljava/nio/ByteBuffer;

    const/4 v2, 0x1

    invoke-virtual {v0, v4, v1, v2}, Ljava/nio/charset/CharsetEncoder;->encode(Ljava/nio/CharBuffer;Ljava/nio/ByteBuffer;Z)Ljava/nio/charset/CoderResult;

    move-result-object v5

    .line 249
    goto :goto_0

    .line 253
    :cond_1
    invoke-direct {p0}, Lcom/huawei/hwid/core/d/e;->a()V

    .line 254
    iget-object v0, p0, Lcom/huawei/hwid/core/d/e;->f:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 255
    goto :goto_1

    .line 256
    :cond_2
    iget-object v0, p0, Lcom/huawei/hwid/core/d/e;->e:Ljava/io/Writer;

    iget-object v1, p0, Lcom/huawei/hwid/core/d/e;->c:[C

    iget v2, p0, Lcom/huawei/hwid/core/d/e;->d:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/Writer;->write([CII)V

    .line 257
    iget-object v0, p0, Lcom/huawei/hwid/core/d/e;->e:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->flush()V

    .line 259
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwid/core/d/e;->d:I

    .line 261
    :cond_3
    return-void
.end method

.method public getDepth()I
    .locals 1

    .line 264
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public getFeature(Ljava/lang/String;)Z
    .locals 1

    .line 268
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 272
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public getNamespace()Ljava/lang/String;
    .locals 1

    .line 276
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public getPrefix(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 280
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public getProperty(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 284
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public ignorableWhitespace(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 288
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public processingInstruction(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 292
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public setFeature(Ljava/lang/String;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 296
    const-string v0, "http://xmlpull.org/v1/doc/features.html#indent-output"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 297
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwid/core/d/e;->i:Z

    .line 298
    return-void

    .line 300
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public setOutput(Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 304
    if-nez p1, :cond_0

    .line 305
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 308
    :cond_0
    :try_start_0
    invoke-static {p2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/d/e;->g:Ljava/nio/charset/CharsetEncoder;
    :try_end_0
    .catch Ljava/nio/charset/IllegalCharsetNameException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/nio/charset/UnsupportedCharsetException; {:try_start_0 .. :try_end_0} :catch_1

    .line 313
    goto :goto_0

    .line 309
    :catch_0
    move-exception v1

    .line 310
    new-instance v0, Ljava/io/UnsupportedEncodingException;

    invoke-direct {v0, p2}, Ljava/io/UnsupportedEncodingException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/io/UnsupportedEncodingException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/io/UnsupportedEncodingException;

    check-cast v0, Ljava/io/UnsupportedEncodingException;

    throw v0

    .line 311
    :catch_1
    move-exception v1

    .line 312
    new-instance v0, Ljava/io/UnsupportedEncodingException;

    invoke-direct {v0, p2}, Ljava/io/UnsupportedEncodingException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/io/UnsupportedEncodingException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/io/UnsupportedEncodingException;

    check-cast v0, Ljava/io/UnsupportedEncodingException;

    throw v0

    .line 314
    :goto_0
    iput-object p1, p0, Lcom/huawei/hwid/core/d/e;->f:Ljava/io/OutputStream;

    .line 321
    return-void
.end method

.method public setOutput(Ljava/io/Writer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 324
    iput-object p1, p0, Lcom/huawei/hwid/core/d/e;->e:Ljava/io/Writer;

    .line 325
    return-void
.end method

.method public setPrefix(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 328
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 332
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public startDocument(Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 336
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<?xml version=\'1.0\' encoding=\'utf-8\' standalone=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "yes"

    goto :goto_0

    :cond_0
    const-string v1, "no"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\' ?>\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hwid/core/d/e;->a(Ljava/lang/String;)V

    .line 337
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwid/core/d/e;->l:Z

    .line 338
    return-void
.end method

.method public startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 341
    iget-boolean v0, p0, Lcom/huawei/hwid/core/d/e;->j:Z

    if-eqz v0, :cond_0

    .line 342
    const-string v0, ">\n"

    invoke-direct {p0, v0}, Lcom/huawei/hwid/core/d/e;->a(Ljava/lang/String;)V

    .line 344
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/hwid/core/d/e;->i:Z

    if-eqz v0, :cond_1

    .line 345
    iget v0, p0, Lcom/huawei/hwid/core/d/e;->k:I

    invoke-direct {p0, v0}, Lcom/huawei/hwid/core/d/e;->a(I)V

    .line 347
    :cond_1
    iget v0, p0, Lcom/huawei/hwid/core/d/e;->k:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hwid/core/d/e;->k:I

    .line 348
    const/16 v0, 0x3c

    invoke-direct {p0, v0}, Lcom/huawei/hwid/core/d/e;->a(C)V

    .line 349
    if-eqz p1, :cond_2

    .line 350
    invoke-direct {p0, p1}, Lcom/huawei/hwid/core/d/e;->a(Ljava/lang/String;)V

    .line 351
    const/16 v0, 0x3a

    invoke-direct {p0, v0}, Lcom/huawei/hwid/core/d/e;->a(C)V

    .line 353
    :cond_2
    invoke-direct {p0, p2}, Lcom/huawei/hwid/core/d/e;->a(Ljava/lang/String;)V

    .line 354
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwid/core/d/e;->j:Z

    .line 355
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/core/d/e;->l:Z

    .line 356
    return-object p0
.end method

.method public text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 372
    iget-boolean v0, p0, Lcom/huawei/hwid/core/d/e;->j:Z

    if-eqz v0, :cond_0

    .line 373
    const-string v0, ">"

    invoke-direct {p0, v0}, Lcom/huawei/hwid/core/d/e;->a(Ljava/lang/String;)V

    .line 374
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/core/d/e;->j:Z

    .line 376
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/hwid/core/d/e;->b(Ljava/lang/String;)V

    .line 377
    iget-boolean v0, p0, Lcom/huawei/hwid/core/d/e;->i:Z

    if-eqz v0, :cond_2

    .line 378
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/hwid/core/d/e;->l:Z

    .line 380
    :cond_2
    return-object p0
.end method

.method public text([CII)Lorg/xmlpull/v1/XmlSerializer;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 360
    iget-boolean v0, p0, Lcom/huawei/hwid/core/d/e;->j:Z

    if-eqz v0, :cond_0

    .line 361
    const-string v0, ">"

    invoke-direct {p0, v0}, Lcom/huawei/hwid/core/d/e;->a(Ljava/lang/String;)V

    .line 362
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/core/d/e;->j:Z

    .line 364
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hwid/core/d/e;->b([CII)V

    .line 365
    iget-boolean v0, p0, Lcom/huawei/hwid/core/d/e;->i:Z

    if-eqz v0, :cond_2

    .line 366
    add-int v0, p2, p3

    add-int/lit8 v0, v0, -0x1

    aget-char v0, p1, v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/hwid/core/d/e;->l:Z

    .line 368
    :cond_2
    return-object p0
.end method
