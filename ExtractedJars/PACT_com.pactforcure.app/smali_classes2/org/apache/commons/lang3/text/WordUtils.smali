.class public Lorg/apache/commons/lang3/text/WordUtils;
.super Ljava/lang/Object;
.source "WordUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    return-void
.end method

.method public static capitalize(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    .line 168
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/text/WordUtils;->capitalize(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static varargs capitalize(Ljava/lang/String;[C)Ljava/lang/String;
    .locals 6
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "delimiters"    # [C

    .prologue
    .line 201
    if-nez p1, :cond_1

    const/4 v3, -0x1

    .line 202
    .local v3, "delimLen":I
    :goto_0
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    if-nez v3, :cond_2

    .line 216
    .end local p0    # "str":Ljava/lang/String;
    :cond_0
    :goto_1
    return-object p0

    .line 201
    .end local v3    # "delimLen":I
    .restart local p0    # "str":Ljava/lang/String;
    :cond_1
    array-length v3, p1

    goto :goto_0

    .line 205
    .restart local v3    # "delimLen":I
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    .line 206
    .local v0, "buffer":[C
    const/4 v1, 0x1

    .line 207
    .local v1, "capitalizeNext":Z
    const/4 v4, 0x0

    .local v4, "i":I
    :goto_2
    array-length v5, v0

    if-ge v4, v5, :cond_5

    .line 208
    aget-char v2, v0, v4

    .line 209
    .local v2, "ch":C
    invoke-static {v2, p1}, Lorg/apache/commons/lang3/text/WordUtils;->isDelimiter(C[C)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 210
    const/4 v1, 0x1

    .line 207
    :cond_3
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 211
    :cond_4
    if-eqz v1, :cond_3

    .line 212
    invoke-static {v2}, Ljava/lang/Character;->toTitleCase(C)C

    move-result v5

    aput-char v5, v0, v4

    .line 213
    const/4 v1, 0x0

    goto :goto_3

    .line 216
    .end local v2    # "ch":C
    :cond_5
    new-instance p0, Ljava/lang/String;

    .end local p0    # "str":Ljava/lang/String;
    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    goto :goto_1
.end method

.method public static capitalizeFully(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    .line 240
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/text/WordUtils;->capitalizeFully(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static varargs capitalizeFully(Ljava/lang/String;[C)Ljava/lang/String;
    .locals 2
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "delimiters"    # [C

    .prologue
    .line 270
    if-nez p1, :cond_1

    const/4 v0, -0x1

    .line 271
    .local v0, "delimLen":I
    :goto_0
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    if-nez v0, :cond_2

    .line 275
    .end local p0    # "str":Ljava/lang/String;
    :cond_0
    :goto_1
    return-object p0

    .line 270
    .end local v0    # "delimLen":I
    .restart local p0    # "str":Ljava/lang/String;
    :cond_1
    array-length v0, p1

    goto :goto_0

    .line 274
    .restart local v0    # "delimLen":I
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    .line 275
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/text/WordUtils;->capitalize(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object p0

    goto :goto_1
.end method

.method public static initials(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    .line 421
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/text/WordUtils;->initials(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static varargs initials(Ljava/lang/String;[C)Ljava/lang/String;
    .locals 8
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "delimiters"    # [C

    .prologue
    .line 452
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 474
    .end local p0    # "str":Ljava/lang/String;
    :goto_0
    return-object p0

    .line 455
    .restart local p0    # "str":Ljava/lang/String;
    :cond_0
    if-eqz p1, :cond_1

    array-length v7, p1

    if-nez v7, :cond_1

    .line 456
    const-string p0, ""

    goto :goto_0

    .line 458
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v6

    .line 459
    .local v6, "strLen":I
    div-int/lit8 v7, v6, 0x2

    add-int/lit8 v7, v7, 0x1

    new-array v0, v7, [C

    .line 460
    .local v0, "buf":[C
    const/4 v2, 0x0

    .line 461
    .local v2, "count":I
    const/4 v5, 0x1

    .line 462
    .local v5, "lastWasGap":Z
    const/4 v4, 0x0

    .local v4, "i":I
    move v3, v2

    .end local v2    # "count":I
    .local v3, "count":I
    :goto_1
    if-ge v4, v6, :cond_3

    .line 463
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 465
    .local v1, "ch":C
    invoke-static {v1, p1}, Lorg/apache/commons/lang3/text/WordUtils;->isDelimiter(C[C)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 466
    const/4 v5, 0x1

    move v2, v3

    .line 462
    .end local v3    # "count":I
    .restart local v2    # "count":I
    :goto_2
    add-int/lit8 v4, v4, 0x1

    move v3, v2

    .end local v2    # "count":I
    .restart local v3    # "count":I
    goto :goto_1

    .line 467
    :cond_2
    if-eqz v5, :cond_4

    .line 468
    add-int/lit8 v2, v3, 0x1

    .end local v3    # "count":I
    .restart local v2    # "count":I
    aput-char v1, v0, v3

    .line 469
    const/4 v5, 0x0

    goto :goto_2

    .line 474
    .end local v1    # "ch":C
    .end local v2    # "count":I
    .restart local v3    # "count":I
    :cond_3
    new-instance p0, Ljava/lang/String;

    .end local p0    # "str":Ljava/lang/String;
    const/4 v7, 0x0

    invoke-direct {p0, v0, v7, v3}, Ljava/lang/String;-><init>([CII)V

    goto :goto_0

    .restart local v1    # "ch":C
    .restart local p0    # "str":Ljava/lang/String;
    :cond_4
    move v2, v3

    .end local v3    # "count":I
    .restart local v2    # "count":I
    goto :goto_2
.end method

.method private static isDelimiter(C[C)Z
    .locals 5
    .param p0, "ch"    # C
    .param p1, "delimiters"    # [C

    .prologue
    .line 486
    if-nez p1, :cond_0

    .line 487
    invoke-static {p0}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v4

    .line 494
    :goto_0
    return v4

    .line 489
    :cond_0
    move-object v0, p1

    .local v0, "arr$":[C
    array-length v3, v0

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_1
    if-ge v2, v3, :cond_2

    aget-char v1, v0, v2

    .line 490
    .local v1, "delimiter":C
    if-ne p0, v1, :cond_1

    .line 491
    const/4 v4, 0x1

    goto :goto_0

    .line 489
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 494
    .end local v1    # "delimiter":C
    :cond_2
    const/4 v4, 0x0

    goto :goto_0
.end method

.method public static swapCase(Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    .line 368
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 394
    .end local p0    # "str":Ljava/lang/String;
    :goto_0
    return-object p0

    .line 371
    .restart local p0    # "str":Ljava/lang/String;
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    .line 373
    .local v0, "buffer":[C
    const/4 v3, 0x1

    .line 375
    .local v3, "whitespace":Z
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_1
    array-length v4, v0

    if-ge v2, v4, :cond_5

    .line 376
    aget-char v1, v0, v2

    .line 377
    .local v1, "ch":C
    invoke-static {v1}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 378
    invoke-static {v1}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v4

    aput-char v4, v0, v2

    .line 379
    const/4 v3, 0x0

    .line 375
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 380
    :cond_1
    invoke-static {v1}, Ljava/lang/Character;->isTitleCase(C)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 381
    invoke-static {v1}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v4

    aput-char v4, v0, v2

    .line 382
    const/4 v3, 0x0

    goto :goto_2

    .line 383
    :cond_2
    invoke-static {v1}, Ljava/lang/Character;->isLowerCase(C)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 384
    if-eqz v3, :cond_3

    .line 385
    invoke-static {v1}, Ljava/lang/Character;->toTitleCase(C)C

    move-result v4

    aput-char v4, v0, v2

    .line 386
    const/4 v3, 0x0

    goto :goto_2

    .line 388
    :cond_3
    invoke-static {v1}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v4

    aput-char v4, v0, v2

    goto :goto_2

    .line 391
    :cond_4
    invoke-static {v1}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v3

    goto :goto_2

    .line 394
    .end local v1    # "ch":C
    :cond_5
    new-instance p0, Ljava/lang/String;

    .end local p0    # "str":Ljava/lang/String;
    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    goto :goto_0
.end method

.method public static uncapitalize(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    .line 297
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/text/WordUtils;->uncapitalize(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static varargs uncapitalize(Ljava/lang/String;[C)Ljava/lang/String;
    .locals 6
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "delimiters"    # [C

    .prologue
    .line 326
    if-nez p1, :cond_1

    const/4 v2, -0x1

    .line 327
    .local v2, "delimLen":I
    :goto_0
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    if-nez v2, :cond_2

    .line 341
    .end local p0    # "str":Ljava/lang/String;
    :cond_0
    :goto_1
    return-object p0

    .line 326
    .end local v2    # "delimLen":I
    .restart local p0    # "str":Ljava/lang/String;
    :cond_1
    array-length v2, p1

    goto :goto_0

    .line 330
    .restart local v2    # "delimLen":I
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    .line 331
    .local v0, "buffer":[C
    const/4 v4, 0x1

    .line 332
    .local v4, "uncapitalizeNext":Z
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_2
    array-length v5, v0

    if-ge v3, v5, :cond_5

    .line 333
    aget-char v1, v0, v3

    .line 334
    .local v1, "ch":C
    invoke-static {v1, p1}, Lorg/apache/commons/lang3/text/WordUtils;->isDelimiter(C[C)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 335
    const/4 v4, 0x1

    .line 332
    :cond_3
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 336
    :cond_4
    if-eqz v4, :cond_3

    .line 337
    invoke-static {v1}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v5

    aput-char v5, v0, v3

    .line 338
    const/4 v4, 0x0

    goto :goto_3

    .line 341
    .end local v1    # "ch":C
    :cond_5
    new-instance p0, Ljava/lang/String;

    .end local p0    # "str":Ljava/lang/String;
    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    goto :goto_1
.end method

.method public static wrap(Ljava/lang/String;I)Ljava/lang/String;
    .locals 2
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "wrapLength"    # I

    .prologue
    .line 67
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, p1, v0, v1}, Lorg/apache/commons/lang3/text/WordUtils;->wrap(Ljava/lang/String;ILjava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static wrap(Ljava/lang/String;ILjava/lang/String;Z)Ljava/lang/String;
    .locals 6
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "wrapLength"    # I
    .param p2, "newLineStr"    # Ljava/lang/String;
    .param p3, "wrapLongWords"    # Z

    .prologue
    const/16 v5, 0x20

    .line 89
    if-nez p0, :cond_0

    .line 90
    const/4 v4, 0x0

    .line 140
    :goto_0
    return-object v4

    .line 92
    :cond_0
    if-nez p2, :cond_1

    .line 93
    sget-object p2, Lorg/apache/commons/lang3/SystemUtils;->LINE_SEPARATOR:Ljava/lang/String;

    .line 95
    :cond_1
    const/4 v4, 0x1

    if-ge p1, v4, :cond_2

    .line 96
    const/4 p1, 0x1

    .line 98
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    .line 99
    .local v0, "inputLineLength":I
    const/4 v1, 0x0

    .line 100
    .local v1, "offset":I
    new-instance v3, Ljava/lang/StringBuilder;

    add-int/lit8 v4, v0, 0x20

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 102
    .local v3, "wrappedLine":Ljava/lang/StringBuilder;
    :goto_1
    sub-int v4, v0, v1

    if-le v4, p1, :cond_7

    .line 103
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-ne v4, v5, :cond_3

    .line 104
    add-int/lit8 v1, v1, 0x1

    .line 105
    goto :goto_1

    .line 107
    :cond_3
    add-int v4, p1, v1

    invoke-virtual {p0, v5, v4}, Ljava/lang/String;->lastIndexOf(II)I

    move-result v2

    .line 109
    .local v2, "spaceToWrapAt":I
    if-lt v2, v1, :cond_4

    .line 111
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    add-int/lit8 v1, v2, 0x1

    goto :goto_1

    .line 117
    :cond_4
    if-eqz p3, :cond_5

    .line 119
    add-int v4, p1, v1

    invoke-virtual {p0, v1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    add-int/2addr v1, p1

    goto :goto_1

    .line 124
    :cond_5
    add-int v4, p1, v1

    invoke-virtual {p0, v5, v4}, Ljava/lang/String;->indexOf(II)I

    move-result v2

    .line 125
    if-ltz v2, :cond_6

    .line 126
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    add-int/lit8 v1, v2, 0x1

    goto :goto_1

    .line 130
    :cond_6
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    move v1, v0

    goto :goto_1

    .line 138
    .end local v2    # "spaceToWrapAt":I
    :cond_7
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_0
.end method
