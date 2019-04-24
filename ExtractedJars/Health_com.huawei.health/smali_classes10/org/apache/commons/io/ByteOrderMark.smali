.class public Lorg/apache/commons/io/ByteOrderMark;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final UTF_16BE:Lorg/apache/commons/io/ByteOrderMark;

.field public static final UTF_16LE:Lorg/apache/commons/io/ByteOrderMark;

.field public static final UTF_32BE:Lorg/apache/commons/io/ByteOrderMark;

.field public static final UTF_32LE:Lorg/apache/commons/io/ByteOrderMark;

.field public static final UTF_8:Lorg/apache/commons/io/ByteOrderMark;

.field public static final UTF_BOM:C = '\ufeff'

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private final bytes:[I

.field private final charsetName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 36
    new-instance v0, Lorg/apache/commons/io/ByteOrderMark;

    const-string v1, "UTF-8"

    const/4 v2, 0x3

    new-array v2, v2, [I

    fill-array-data v2, :array_0

    invoke-direct {v0, v1, v2}, Lorg/apache/commons/io/ByteOrderMark;-><init>(Ljava/lang/String;[I)V

    sput-object v0, Lorg/apache/commons/io/ByteOrderMark;->UTF_8:Lorg/apache/commons/io/ByteOrderMark;

    .line 39
    new-instance v0, Lorg/apache/commons/io/ByteOrderMark;

    const-string v1, "UTF-16BE"

    const/4 v2, 0x2

    new-array v2, v2, [I

    fill-array-data v2, :array_1

    invoke-direct {v0, v1, v2}, Lorg/apache/commons/io/ByteOrderMark;-><init>(Ljava/lang/String;[I)V

    sput-object v0, Lorg/apache/commons/io/ByteOrderMark;->UTF_16BE:Lorg/apache/commons/io/ByteOrderMark;

    .line 42
    new-instance v0, Lorg/apache/commons/io/ByteOrderMark;

    const-string v1, "UTF-16LE"

    const/4 v2, 0x2

    new-array v2, v2, [I

    fill-array-data v2, :array_2

    invoke-direct {v0, v1, v2}, Lorg/apache/commons/io/ByteOrderMark;-><init>(Ljava/lang/String;[I)V

    sput-object v0, Lorg/apache/commons/io/ByteOrderMark;->UTF_16LE:Lorg/apache/commons/io/ByteOrderMark;

    .line 48
    new-instance v0, Lorg/apache/commons/io/ByteOrderMark;

    const-string v1, "UTF-32BE"

    const/4 v2, 0x4

    new-array v2, v2, [I

    fill-array-data v2, :array_3

    invoke-direct {v0, v1, v2}, Lorg/apache/commons/io/ByteOrderMark;-><init>(Ljava/lang/String;[I)V

    sput-object v0, Lorg/apache/commons/io/ByteOrderMark;->UTF_32BE:Lorg/apache/commons/io/ByteOrderMark;

    .line 54
    new-instance v0, Lorg/apache/commons/io/ByteOrderMark;

    const-string v1, "UTF-32LE"

    const/4 v2, 0x4

    new-array v2, v2, [I

    fill-array-data v2, :array_4

    invoke-direct {v0, v1, v2}, Lorg/apache/commons/io/ByteOrderMark;-><init>(Ljava/lang/String;[I)V

    sput-object v0, Lorg/apache/commons/io/ByteOrderMark;->UTF_32LE:Lorg/apache/commons/io/ByteOrderMark;

    return-void

    :array_0
    .array-data 4
        0xef
        0xbb
        0xbf
    .end array-data

    :array_1
    .array-data 4
        0xfe
        0xff
    .end array-data

    :array_2
    .array-data 4
        0xff
        0xfe
    .end array-data

    :array_3
    .array-data 4
        0x0
        0x0
        0xfe
        0xff
    .end array-data

    :array_4
    .array-data 4
        0xff
        0xfe
        0x0
        0x0
    .end array-data
.end method

.method public varargs constructor <init>(Ljava/lang/String;[I)V
    .locals 4

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 78
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No charsetName specified"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 80
    :cond_1
    if-eqz p2, :cond_2

    array-length v0, p2

    if-nez v0, :cond_3

    .line 81
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No bytes specified"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 83
    :cond_3
    iput-object p1, p0, Lorg/apache/commons/io/ByteOrderMark;->charsetName:Ljava/lang/String;

    .line 84
    array-length v0, p2

    new-array v0, v0, [I

    iput-object v0, p0, Lorg/apache/commons/io/ByteOrderMark;->bytes:[I

    .line 85
    iget-object v0, p0, Lorg/apache/commons/io/ByteOrderMark;->bytes:[I

    array-length v1, p2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p2, v2, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 86
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 138
    instance-of v0, p1, Lorg/apache/commons/io/ByteOrderMark;

    if-nez v0, :cond_0

    .line 139
    const/4 v0, 0x0

    return v0

    .line 141
    :cond_0
    move-object v2, p1

    check-cast v2, Lorg/apache/commons/io/ByteOrderMark;

    .line 142
    iget-object v0, p0, Lorg/apache/commons/io/ByteOrderMark;->bytes:[I

    array-length v0, v0

    invoke-virtual {v2}, Lorg/apache/commons/io/ByteOrderMark;->length()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 143
    const/4 v0, 0x0

    return v0

    .line 145
    :cond_1
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lorg/apache/commons/io/ByteOrderMark;->bytes:[I

    array-length v0, v0

    if-ge v3, v0, :cond_3

    .line 146
    iget-object v0, p0, Lorg/apache/commons/io/ByteOrderMark;->bytes:[I

    aget v0, v0, v3

    invoke-virtual {v2, v3}, Lorg/apache/commons/io/ByteOrderMark;->get(I)I

    move-result v1

    if-eq v0, v1, :cond_2

    .line 147
    const/4 v0, 0x0

    return v0

    .line 145
    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 150
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public get(I)I
    .locals 1

    .line 113
    iget-object v0, p0, Lorg/apache/commons/io/ByteOrderMark;->bytes:[I

    aget v0, v0, p1

    return v0
.end method

.method public getBytes()[B
    .locals 3

    .line 122
    iget-object v0, p0, Lorg/apache/commons/io/ByteOrderMark;->bytes:[I

    array-length v0, v0

    new-array v1, v0, [B

    .line 123
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lorg/apache/commons/io/ByteOrderMark;->bytes:[I

    array-length v0, v0

    if-ge v2, v0, :cond_0

    .line 124
    iget-object v0, p0, Lorg/apache/commons/io/ByteOrderMark;->bytes:[I

    aget v0, v0, v2

    int-to-byte v0, v0

    aput-byte v0, v1, v2

    .line 123
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 126
    :cond_0
    return-object v1
.end method

.method public getCharsetName()Ljava/lang/String;
    .locals 1

    .line 94
    iget-object v0, p0, Lorg/apache/commons/io/ByteOrderMark;->charsetName:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 6

    .line 161
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    .line 162
    iget-object v2, p0, Lorg/apache/commons/io/ByteOrderMark;->bytes:[I

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget v5, v2, v4

    .line 163
    add-int/2addr v1, v5

    .line 162
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 165
    :cond_0
    return v1
.end method

.method public length()I
    .locals 1

    .line 103
    iget-object v0, p0, Lorg/apache/commons/io/ByteOrderMark;->bytes:[I

    array-length v0, v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 175
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 176
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    const/16 v0, 0x5b

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 178
    iget-object v0, p0, Lorg/apache/commons/io/ByteOrderMark;->charsetName:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    const-string v0, ": "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lorg/apache/commons/io/ByteOrderMark;->bytes:[I

    array-length v0, v0

    if-ge v3, v0, :cond_1

    .line 181
    if-lez v3, :cond_0

    .line 182
    const-string v0, ","

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    :cond_0
    const-string v0, "0x"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    iget-object v0, p0, Lorg/apache/commons/io/ByteOrderMark;->bytes:[I

    aget v0, v0, v3

    and-int/lit16 v0, v0, 0xff

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 187
    :cond_1
    const/16 v0, 0x5d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 188
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
