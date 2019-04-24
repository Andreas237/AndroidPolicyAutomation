.class public final Lcom/google/dexmaker/dx/util/HexParser;
.super Ljava/lang/Object;
.source "HexParser.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static parse(Ljava/lang/String;)[B
    .locals 15

    .line 45
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    .line 46
    div-int/lit8 v1, v0, 0x2

    new-array v1, v1, [B

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    if-ge v3, v0, :cond_f

    const/16 v5, 0xa

    .line 51
    invoke-virtual {p0, v5, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v5

    if-gez v5, :cond_0

    move v5, v0

    :cond_0
    const/16 v6, 0x23

    .line 55
    invoke-virtual {p0, v6, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v6

    if-ltz v6, :cond_1

    if-ge v6, v5, :cond_1

    .line 59
    invoke-virtual {p0, v3, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    .line 61
    :cond_1
    invoke-virtual {p0, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    :goto_1
    add-int/lit8 v5, v5, 0x1

    const/16 v6, 0x3a

    .line 65
    invoke-virtual {v3, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    const/16 v7, 0x10

    const/16 v8, 0x22

    const/4 v9, -0x1

    if-eq v6, v9, :cond_4

    .line 69
    invoke-virtual {v3, v8}, Ljava/lang/String;->indexOf(I)I

    move-result v10

    if-eq v10, v9, :cond_2

    if-ge v10, v6, :cond_2

    goto :goto_2

    .line 74
    :cond_2
    invoke-virtual {v3, v2, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v10

    add-int/lit8 v6, v6, 0x1

    .line 75
    invoke-virtual {v3, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    .line 76
    invoke-static {v10, v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v6

    if-ne v6, v4, :cond_3

    goto :goto_2

    .line 78
    :cond_3
    new-instance p0, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "bogus offset marker: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 83
    :cond_4
    :goto_2
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    move v11, v2

    move v12, v4

    move v10, v9

    move v4, v11

    :goto_3
    if-ge v4, v6, :cond_c

    .line 88
    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-eqz v11, :cond_6

    if-ne v13, v8, :cond_5

    move v11, v2

    goto :goto_4

    :cond_5
    int-to-byte v13, v13

    .line 94
    aput-byte v13, v1, v12

    add-int/lit8 v12, v12, 0x1

    goto :goto_4

    :cond_6
    const/16 v14, 0x20

    if-gt v13, v14, :cond_7

    goto :goto_4

    :cond_7
    if-ne v13, v8, :cond_9

    if-ne v10, v9, :cond_8

    const/4 v11, 0x1

    goto :goto_4

    .line 105
    :cond_8
    new-instance p0, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "spare digit around offset "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v12}, Lcom/google/dexmaker/dx/util/Hex;->u4(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 112
    :cond_9
    invoke-static {v13, v7}, Ljava/lang/Character;->digit(CI)I

    move-result v14

    if-eq v14, v9, :cond_b

    if-ne v10, v9, :cond_a

    move v10, v14

    goto :goto_4

    :cond_a
    shl-int/lit8 v10, v10, 0x4

    or-int/2addr v10, v14

    int-to-byte v10, v10

    .line 120
    aput-byte v10, v1, v12

    add-int/lit8 v12, v12, 0x1

    move v10, v9

    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 114
    :cond_b
    new-instance p0, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "bogus digit character: \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_c
    if-ne v10, v9, :cond_e

    if-nez v11, :cond_d

    move v3, v5

    move v4, v12

    goto/16 :goto_0

    .line 132
    :cond_d
    new-instance p0, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "unterminated quote around offset "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v12}, Lcom/google/dexmaker/dx/util/Hex;->u4(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 127
    :cond_e
    new-instance p0, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "spare digit around offset "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v12}, Lcom/google/dexmaker/dx/util/Hex;->u4(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 137
    :cond_f
    array-length p0, v1

    if-ge v4, p0, :cond_10

    .line 138
    new-array p0, v4, [B

    .line 139
    invoke-static {v1, v2, p0, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_5

    :cond_10
    move-object p0, v1

    :goto_5
    return-object p0
.end method
