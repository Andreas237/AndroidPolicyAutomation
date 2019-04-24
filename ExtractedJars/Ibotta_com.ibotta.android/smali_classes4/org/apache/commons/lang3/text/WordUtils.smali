.class public Lorg/apache/commons/lang3/text/WordUtils;
.super Ljava/lang/Object;
.source "WordUtils.java"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static capitalize(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 376
    invoke-static {p0, v0}, Lorg/apache/commons/lang3/text/WordUtils;->capitalize(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static varargs capitalize(Ljava/lang/String;[C)Ljava/lang/String;
    .locals 6

    if-nez p1, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    .line 409
    :cond_0
    array-length v0, p1

    .line 410
    :goto_0
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    if-nez v0, :cond_1

    goto :goto_3

    .line 413
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 415
    :goto_1
    array-length v4, p0

    if-ge v2, v4, :cond_4

    .line 416
    aget-char v4, p0, v2

    .line 417
    invoke-static {v4, p1}, Lorg/apache/commons/lang3/text/WordUtils;->isDelimiter(C[C)Z

    move-result v5

    if-eqz v5, :cond_2

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    if-eqz v3, :cond_3

    .line 420
    invoke-static {v4}, Ljava/lang/Character;->toTitleCase(C)C

    move-result v3

    aput-char v3, p0, v2

    const/4 v3, 0x0

    :cond_3
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 424
    :cond_4
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, p0}, Ljava/lang/String;-><init>([C)V

    return-object p1

    :cond_5
    :goto_3
    return-object p0
.end method

.method public static capitalizeFully(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 448
    invoke-static {p0, v0}, Lorg/apache/commons/lang3/text/WordUtils;->capitalizeFully(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static varargs capitalizeFully(Ljava/lang/String;[C)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    .line 478
    :cond_0
    array-length v0, p1

    .line 479
    :goto_0
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    if-nez v0, :cond_1

    goto :goto_1

    .line 482
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    .line 483
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/text/WordUtils;->capitalize(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_1
    return-object p0
.end method

.method public static varargs containsAllWords(Ljava/lang/CharSequence;[Ljava/lang/CharSequence;)Z
    .locals 6

    .line 708
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_4

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 711
    :cond_0
    array-length v0, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    aget-object v3, p1, v2

    .line 712
    invoke-static {v3}, Lorg/apache/commons/lang3/StringUtils;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    return v1

    .line 715
    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, ".*\\b"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "\\b.*"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v3

    .line 716
    invoke-virtual {v3, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    move-result v3

    if-nez v3, :cond_2

    return v1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    const/4 p0, 0x1

    return p0

    :cond_4
    :goto_1
    return v1
.end method

.method public static initials(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 628
    invoke-static {p0, v0}, Lorg/apache/commons/lang3/text/WordUtils;->initials(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static varargs initials(Ljava/lang/String;[C)Ljava/lang/String;
    .locals 9

    .line 658
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    if-eqz p1, :cond_1

    .line 661
    array-length v0, p1

    if-nez v0, :cond_1

    const-string p0, ""

    return-object p0

    .line 664
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    .line 665
    div-int/lit8 v1, v0, 0x2

    const/4 v2, 0x1

    add-int/2addr v1, v2

    new-array v1, v1, [C

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    :goto_0
    if-ge v4, v0, :cond_4

    .line 669
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v7

    .line 671
    invoke-static {v7, p1}, Lorg/apache/commons/lang3/text/WordUtils;->isDelimiter(C[C)Z

    move-result v8

    if-eqz v8, :cond_2

    const/4 v6, 0x1

    goto :goto_1

    :cond_2
    if-eqz v6, :cond_3

    add-int/lit8 v6, v5, 0x1

    .line 674
    aput-char v7, v1, v5

    move v5, v6

    const/4 v6, 0x0

    :cond_3
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 680
    :cond_4
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v1, v3, v5}, Ljava/lang/String;-><init>([CII)V

    return-object p0
.end method

.method private static isDelimiter(C[C)Z
    .locals 4

    if-nez p1, :cond_0

    .line 733
    invoke-static {p0}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result p0

    return p0

    .line 735
    :cond_0
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    aget-char v3, p1, v2

    if-ne p0, v3, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public static swapCase(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 576
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 579
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v0, 0x0

    const/4 v2, 0x1

    .line 583
    :goto_0
    array-length v3, p0

    if-ge v0, v3, :cond_5

    .line 584
    aget-char v3, p0, v0

    .line 585
    invoke-static {v3}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 586
    invoke-static {v3}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v2

    aput-char v2, p0, v0

    const/4 v2, 0x0

    goto :goto_1

    .line 588
    :cond_1
    invoke-static {v3}, Ljava/lang/Character;->isTitleCase(C)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 589
    invoke-static {v3}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v2

    aput-char v2, p0, v0

    const/4 v2, 0x0

    goto :goto_1

    .line 591
    :cond_2
    invoke-static {v3}, Ljava/lang/Character;->isLowerCase(C)Z

    move-result v4

    if-eqz v4, :cond_4

    if-eqz v2, :cond_3

    .line 593
    invoke-static {v3}, Ljava/lang/Character;->toTitleCase(C)C

    move-result v2

    aput-char v2, p0, v0

    const/4 v2, 0x0

    goto :goto_1

    .line 596
    :cond_3
    invoke-static {v3}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v3

    aput-char v3, p0, v0

    goto :goto_1

    .line 599
    :cond_4
    invoke-static {v3}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v2

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 602
    :cond_5
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p0}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static uncapitalize(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 505
    invoke-static {p0, v0}, Lorg/apache/commons/lang3/text/WordUtils;->uncapitalize(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static varargs uncapitalize(Ljava/lang/String;[C)Ljava/lang/String;
    .locals 6

    if-nez p1, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    .line 534
    :cond_0
    array-length v0, p1

    .line 535
    :goto_0
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    if-nez v0, :cond_1

    goto :goto_3

    .line 538
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 540
    :goto_1
    array-length v4, p0

    if-ge v2, v4, :cond_4

    .line 541
    aget-char v4, p0, v2

    .line 542
    invoke-static {v4, p1}, Lorg/apache/commons/lang3/text/WordUtils;->isDelimiter(C[C)Z

    move-result v5

    if-eqz v5, :cond_2

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    if-eqz v3, :cond_3

    .line 545
    invoke-static {v4}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v3

    aput-char v3, p0, v2

    const/4 v3, 0x0

    :cond_3
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 549
    :cond_4
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, p0}, Ljava/lang/String;-><init>([C)V

    return-object p1

    :cond_5
    :goto_3
    return-object p0
.end method

.method public static wrap(Ljava/lang/String;I)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 104
    invoke-static {p0, p1, v0, v1}, Lorg/apache/commons/lang3/text/WordUtils;->wrap(Ljava/lang/String;ILjava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static wrap(Ljava/lang/String;ILjava/lang/String;Z)Ljava/lang/String;
    .locals 1

    const-string v0, " "

    .line 181
    invoke-static {p0, p1, p2, p3, v0}, Lorg/apache/commons/lang3/text/WordUtils;->wrap(Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static wrap(Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;
    .locals 11

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-nez p2, :cond_1

    .line 279
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object p2

    :cond_1
    const/4 v0, 0x1

    if-ge p1, v0, :cond_2

    const/4 p1, 0x1

    .line 284
    :cond_2
    invoke-static {p4}, Lorg/apache/commons/lang3/StringUtils;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p4, " "

    .line 287
    :cond_3
    invoke-static {p4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p4

    .line 288
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    .line 290
    new-instance v2, Ljava/lang/StringBuilder;

    add-int/lit8 v3, v0, 0x20

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    :goto_0
    if-ge v1, v0, :cond_c

    const/4 v3, -0x1

    const-wide/32 v4, 0x7fffffff

    add-int v6, v1, p1

    int-to-long v7, v6

    const-wide/16 v9, 0x1

    add-long/2addr v7, v9

    .line 295
    invoke-static {v4, v5, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    long-to-int v5, v4

    invoke-static {v5, v0}, Ljava/lang/Math;->min(II)I

    move-result v4

    invoke-virtual {p0, v1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 294
    invoke-virtual {p4, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    .line 296
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    move-result v5

    if-eqz v5, :cond_5

    .line 297
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->start()I

    move-result v3

    if-nez v3, :cond_4

    .line 298
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->end()I

    move-result v3

    add-int/2addr v1, v3

    goto :goto_0

    .line 301
    :cond_4
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->start()I

    move-result v3

    add-int/2addr v3, v1

    :cond_5
    sub-int v5, v0, v1

    if-gt v5, p1, :cond_6

    goto :goto_2

    .line 309
    :cond_6
    :goto_1
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    move-result v5

    if-eqz v5, :cond_7

    .line 310
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->start()I

    move-result v3

    add-int/2addr v3, v1

    goto :goto_1

    :cond_7
    if-lt v3, v1, :cond_8

    .line 315
    invoke-virtual {v2, p0, v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 316
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v3, 0x1

    goto :goto_0

    :cond_8
    if-eqz p3, :cond_9

    .line 323
    invoke-virtual {v2, p0, v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 324
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v1, v6

    goto :goto_0

    .line 328
    :cond_9
    invoke-virtual {p0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p4, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    .line 329
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    move-result v5

    if-eqz v5, :cond_a

    .line 330
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->start()I

    move-result v3

    add-int/2addr v3, v1

    add-int/2addr v3, p1

    :cond_a
    if-ltz v3, :cond_b

    .line 334
    invoke-virtual {v2, p0, v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 335
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v3, 0x1

    goto :goto_0

    .line 338
    :cond_b
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v2, p0, v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    move v1, v0

    goto/16 :goto_0

    .line 346
    :cond_c
    :goto_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v2, p0, v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 348
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
