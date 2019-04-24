.class public Lorg/apache/commons/io/FilenameUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final EXTENSION_SEPARATOR:C = '.'

.field public static final EXTENSION_SEPARATOR_STR:Ljava/lang/String;

.field private static final NOT_FOUND:I = -0x1

.field private static final OTHER_SEPARATOR:C

.field private static final SYSTEM_SEPARATOR:C

.field private static final UNIX_SEPARATOR:C = '/'

.field private static final WINDOWS_SEPARATOR:C = '\\'


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 96
    const/16 v0, 0x2e

    invoke-static {v0}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/io/FilenameUtils;->EXTENSION_SEPARATOR_STR:Ljava/lang/String;

    .line 111
    sget-char v0, Ljava/io/File;->separatorChar:C

    sput-char v0, Lorg/apache/commons/io/FilenameUtils;->SYSTEM_SEPARATOR:C

    .line 118
    invoke-static {}, Lorg/apache/commons/io/FilenameUtils;->isSystemWindows()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 119
    const/16 v0, 0x2f

    sput-char v0, Lorg/apache/commons/io/FilenameUtils;->OTHER_SEPARATOR:C

    goto :goto_0

    .line 121
    :cond_0
    const/16 v0, 0x5c

    sput-char v0, Lorg/apache/commons/io/FilenameUtils;->OTHER_SEPARATOR:C

    .line 123
    :goto_0
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 129
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 130
    return-void
.end method

.method public static concat(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 486
    invoke-static {p1}, Lorg/apache/commons/io/FilenameUtils;->getPrefixLength(Ljava/lang/String;)I

    move-result v2

    .line 487
    if-gez v2, :cond_0

    .line 488
    const/4 v0, 0x0

    return-object v0

    .line 490
    :cond_0
    if-lez v2, :cond_1

    .line 491
    invoke-static {p1}, Lorg/apache/commons/io/FilenameUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 493
    :cond_1
    if-nez p0, :cond_2

    .line 494
    const/4 v0, 0x0

    return-object v0

    .line 496
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    .line 497
    if-nez v3, :cond_3

    .line 498
    invoke-static {p1}, Lorg/apache/commons/io/FilenameUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 500
    :cond_3
    add-int/lit8 v0, v3, -0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 501
    invoke-static {v4}, Lorg/apache/commons/io/FilenameUtils;->isSeparator(C)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 502
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/io/FilenameUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 504
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/io/FilenameUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static directoryContains(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 535
    if-nez p0, :cond_0

    .line 536
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Directory must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 539
    :cond_0
    if-nez p1, :cond_1

    .line 540
    const/4 v0, 0x0

    return v0

    .line 543
    :cond_1
    sget-object v0, Lorg/apache/commons/io/IOCase;->SYSTEM:Lorg/apache/commons/io/IOCase;

    invoke-virtual {v0, p0, p1}, Lorg/apache/commons/io/IOCase;->checkEquals(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 544
    const/4 v0, 0x0

    return v0

    .line 547
    :cond_2
    sget-object v0, Lorg/apache/commons/io/IOCase;->SYSTEM:Lorg/apache/commons/io/IOCase;

    invoke-virtual {v0, p1, p0}, Lorg/apache/commons/io/IOCase;->checkStartsWith(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private static doGetFullPath(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 4

    .line 927
    if-nez p0, :cond_0

    .line 928
    const/4 v0, 0x0

    return-object v0

    .line 930
    :cond_0
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->getPrefixLength(Ljava/lang/String;)I

    move-result v1

    .line 931
    if-gez v1, :cond_1

    .line 932
    const/4 v0, 0x0

    return-object v0

    .line 934
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-lt v1, v0, :cond_3

    .line 935
    if-eqz p1, :cond_2

    .line 936
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->getPrefix(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 938
    :cond_2
    return-object p0

    .line 941
    :cond_3
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->indexOfLastSeparator(Ljava/lang/String;)I

    move-result v2

    .line 942
    if-gez v2, :cond_4

    .line 943
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 945
    :cond_4
    if-eqz p1, :cond_5

    const/4 v0, 0x1

    goto :goto_0

    :cond_5
    const/4 v0, 0x0

    :goto_0
    add-int v3, v2, v0

    .line 946
    if-nez v3, :cond_6

    .line 947
    add-int/lit8 v3, v3, 0x1

    .line 949
    :cond_6
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static doGetPath(Ljava/lang/String;I)Ljava/lang/String;
    .locals 5

    .line 843
    if-nez p0, :cond_0

    .line 844
    const/4 v0, 0x0

    return-object v0

    .line 846
    :cond_0
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->getPrefixLength(Ljava/lang/String;)I

    move-result v1

    .line 847
    if-gez v1, :cond_1

    .line 848
    const/4 v0, 0x0

    return-object v0

    .line 850
    :cond_1
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->indexOfLastSeparator(Ljava/lang/String;)I

    move-result v2

    .line 851
    add-int v3, v2, p1

    .line 852
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v1, v0, :cond_2

    if-ltz v2, :cond_2

    if-lt v1, v3, :cond_3

    .line 853
    :cond_2
    const-string v0, ""

    return-object v0

    .line 855
    :cond_3
    invoke-virtual {p0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 856
    invoke-static {v4}, Lorg/apache/commons/io/FilenameUtils;->failIfNullBytePresent(Ljava/lang/String;)V

    .line 857
    return-object v4
.end method

.method private static doNormalize(Ljava/lang/String;CZ)Ljava/lang/String;
    .locals 10

    .line 349
    if-nez p0, :cond_0

    .line 350
    const/4 v0, 0x0

    return-object v0

    .line 353
    :cond_0
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->failIfNullBytePresent(Ljava/lang/String;)V

    .line 355
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    .line 356
    if-nez v3, :cond_1

    .line 357
    return-object p0

    .line 359
    :cond_1
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->getPrefixLength(Ljava/lang/String;)I

    move-result v4

    .line 360
    if-gez v4, :cond_2

    .line 361
    const/4 v0, 0x0

    return-object v0

    .line 364
    :cond_2
    add-int/lit8 v0, v3, 0x2

    new-array v5, v0, [C

    .line 365
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v0, v5, v2}, Ljava/lang/String;->getChars(II[CI)V

    .line 368
    sget-char v0, Lorg/apache/commons/io/FilenameUtils;->SYSTEM_SEPARATOR:C

    if-ne p1, v0, :cond_3

    sget-char v6, Lorg/apache/commons/io/FilenameUtils;->OTHER_SEPARATOR:C

    goto :goto_0

    :cond_3
    sget-char v6, Lorg/apache/commons/io/FilenameUtils;->SYSTEM_SEPARATOR:C

    .line 369
    :goto_0
    const/4 v7, 0x0

    :goto_1
    array-length v0, v5

    if-ge v7, v0, :cond_5

    .line 370
    aget-char v0, v5, v7

    if-ne v0, v6, :cond_4

    .line 371
    aput-char p1, v5, v7

    .line 369
    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 376
    :cond_5
    const/4 v7, 0x1

    .line 377
    add-int/lit8 v0, v3, -0x1

    aget-char v0, v5, v0

    if-eq v0, p1, :cond_6

    .line 378
    move v0, v3

    add-int/lit8 v3, v3, 0x1

    aput-char p1, v5, v0

    .line 379
    const/4 v7, 0x0

    .line 383
    :cond_6
    add-int/lit8 v8, v4, 0x1

    :goto_2
    if-ge v8, v3, :cond_8

    .line 384
    aget-char v0, v5, v8

    if-ne v0, p1, :cond_7

    add-int/lit8 v0, v8, -0x1

    aget-char v0, v5, v0

    if-ne v0, p1, :cond_7

    .line 385
    add-int/lit8 v0, v8, -0x1

    sub-int v1, v3, v8

    invoke-static {v5, v8, v5, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 386
    add-int/lit8 v3, v3, -0x1

    .line 387
    add-int/lit8 v8, v8, -0x1

    .line 383
    :cond_7
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 392
    :cond_8
    add-int/lit8 v8, v4, 0x1

    :goto_3
    if-ge v8, v3, :cond_c

    .line 393
    aget-char v0, v5, v8

    if-ne v0, p1, :cond_b

    add-int/lit8 v0, v8, -0x1

    aget-char v0, v5, v0

    const/16 v1, 0x2e

    if-ne v0, v1, :cond_b

    add-int/lit8 v0, v4, 0x1

    if-eq v8, v0, :cond_9

    add-int/lit8 v0, v8, -0x2

    aget-char v0, v5, v0

    if-ne v0, p1, :cond_b

    .line 395
    :cond_9
    add-int/lit8 v0, v3, -0x1

    if-ne v8, v0, :cond_a

    .line 396
    const/4 v7, 0x1

    .line 398
    :cond_a
    add-int/lit8 v0, v8, 0x1

    add-int/lit8 v1, v8, -0x1

    sub-int v2, v3, v8

    invoke-static {v5, v0, v5, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 399
    add-int/lit8 v3, v3, -0x2

    .line 400
    add-int/lit8 v8, v8, -0x1

    .line 392
    :cond_b
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    .line 406
    :cond_c
    add-int/lit8 v8, v4, 0x2

    :goto_4
    if-ge v8, v3, :cond_13

    .line 407
    aget-char v0, v5, v8

    if-ne v0, p1, :cond_12

    add-int/lit8 v0, v8, -0x1

    aget-char v0, v5, v0

    const/16 v1, 0x2e

    if-ne v0, v1, :cond_12

    add-int/lit8 v0, v8, -0x2

    aget-char v0, v5, v0

    const/16 v1, 0x2e

    if-ne v0, v1, :cond_12

    add-int/lit8 v0, v4, 0x2

    if-eq v8, v0, :cond_d

    add-int/lit8 v0, v8, -0x3

    aget-char v0, v5, v0

    if-ne v0, p1, :cond_12

    .line 409
    :cond_d
    add-int/lit8 v0, v4, 0x2

    if-ne v8, v0, :cond_e

    .line 410
    const/4 v0, 0x0

    return-object v0

    .line 412
    :cond_e
    add-int/lit8 v0, v3, -0x1

    if-ne v8, v0, :cond_f

    .line 413
    const/4 v7, 0x1

    .line 416
    :cond_f
    add-int/lit8 v9, v8, -0x4

    :goto_5
    if-lt v9, v4, :cond_11

    .line 417
    aget-char v0, v5, v9

    if-ne v0, p1, :cond_10

    .line 419
    add-int/lit8 v0, v8, 0x1

    add-int/lit8 v1, v9, 0x1

    sub-int v2, v3, v8

    invoke-static {v5, v0, v5, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 420
    sub-int v0, v8, v9

    sub-int/2addr v3, v0

    .line 421
    add-int/lit8 v8, v9, 0x1

    .line 422
    goto :goto_6

    .line 416
    :cond_10
    add-int/lit8 v9, v9, -0x1

    goto :goto_5

    .line 426
    :cond_11
    add-int/lit8 v0, v8, 0x1

    sub-int v1, v3, v8

    invoke-static {v5, v0, v5, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 427
    add-int/lit8 v0, v8, 0x1

    sub-int/2addr v0, v4

    sub-int/2addr v3, v0

    .line 428
    add-int/lit8 v8, v4, 0x1

    .line 406
    :cond_12
    :goto_6
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_4

    .line 432
    :cond_13
    if-gtz v3, :cond_14

    .line 433
    const-string v0, ""

    return-object v0

    .line 435
    :cond_14
    if-gt v3, v4, :cond_15

    .line 436
    new-instance v0, Ljava/lang/String;

    const/4 v1, 0x0

    invoke-direct {v0, v5, v1, v3}, Ljava/lang/String;-><init>([CII)V

    return-object v0

    .line 438
    :cond_15
    if-eqz v7, :cond_16

    if-eqz p2, :cond_16

    .line 439
    new-instance v0, Ljava/lang/String;

    const/4 v1, 0x0

    invoke-direct {v0, v5, v1, v3}, Ljava/lang/String;-><init>([CII)V

    return-object v0

    .line 441
    :cond_16
    new-instance v0, Ljava/lang/String;

    add-int/lit8 v1, v3, -0x1

    const/4 v2, 0x0

    invoke-direct {v0, v5, v2, v1}, Ljava/lang/String;-><init>([CII)V

    return-object v0
.end method

.method public static equals(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1092
    sget-object v0, Lorg/apache/commons/io/IOCase;->SENSITIVE:Lorg/apache/commons/io/IOCase;

    const/4 v1, 0x0

    invoke-static {p0, p1, v1, v0}, Lorg/apache/commons/io/FilenameUtils;->equals(Ljava/lang/String;Ljava/lang/String;ZLorg/apache/commons/io/IOCase;)Z

    move-result v0

    return v0
.end method

.method public static equals(Ljava/lang/String;Ljava/lang/String;ZLorg/apache/commons/io/IOCase;)Z
    .locals 2

    .line 1158
    if-eqz p0, :cond_0

    if-nez p1, :cond_2

    .line 1159
    :cond_0
    if-nez p0, :cond_1

    if-nez p1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 1161
    :cond_2
    if-eqz p2, :cond_4

    .line 1162
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 1163
    invoke-static {p1}, Lorg/apache/commons/io/FilenameUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1164
    if-eqz p0, :cond_3

    if-nez p1, :cond_4

    .line 1165
    :cond_3
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Error normalizing one or both of the file names"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1169
    :cond_4
    if-nez p3, :cond_5

    .line 1170
    sget-object p3, Lorg/apache/commons/io/IOCase;->SENSITIVE:Lorg/apache/commons/io/IOCase;

    .line 1172
    :cond_5
    invoke-virtual {p3, p0, p1}, Lorg/apache/commons/io/IOCase;->checkEquals(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static equalsNormalized(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1123
    sget-object v0, Lorg/apache/commons/io/IOCase;->SENSITIVE:Lorg/apache/commons/io/IOCase;

    const/4 v1, 0x1

    invoke-static {p0, p1, v1, v0}, Lorg/apache/commons/io/FilenameUtils;->equals(Ljava/lang/String;Ljava/lang/String;ZLorg/apache/commons/io/IOCase;)Z

    move-result v0

    return v0
.end method

.method public static equalsNormalizedOnSystem(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1140
    sget-object v0, Lorg/apache/commons/io/IOCase;->SYSTEM:Lorg/apache/commons/io/IOCase;

    const/4 v1, 0x1

    invoke-static {p0, p1, v1, v0}, Lorg/apache/commons/io/FilenameUtils;->equals(Ljava/lang/String;Ljava/lang/String;ZLorg/apache/commons/io/IOCase;)Z

    move-result v0

    return v0
.end method

.method public static equalsOnSystem(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1107
    sget-object v0, Lorg/apache/commons/io/IOCase;->SYSTEM:Lorg/apache/commons/io/IOCase;

    const/4 v1, 0x0

    invoke-static {p0, p1, v1, v0}, Lorg/apache/commons/io/FilenameUtils;->equals(Ljava/lang/String;Ljava/lang/String;ZLorg/apache/commons/io/IOCase;)Z

    move-result v0

    return v0
.end method

.method private static failIfNullBytePresent(Ljava/lang/String;)V
    .locals 4

    .line 986
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    .line 987
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    .line 988
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-nez v0, :cond_0

    .line 989
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 987
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 993
    :cond_1
    return-void
.end method

.method public static getBaseName(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1014
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->getName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/io/FilenameUtils;->removeExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getExtension(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1036
    if-nez p0, :cond_0

    .line 1037
    const/4 v0, 0x0

    return-object v0

    .line 1039
    :cond_0
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->indexOfExtension(Ljava/lang/String;)I

    move-result v1

    .line 1040
    const/4 v0, -0x1

    if-ne v1, v0, :cond_1

    .line 1041
    const-string v0, ""

    return-object v0

    .line 1043
    :cond_1
    add-int/lit8 v0, v1, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getFullPath(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 886
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lorg/apache/commons/io/FilenameUtils;->doGetFullPath(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getFullPathNoEndSeparator(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 916
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lorg/apache/commons/io/FilenameUtils;->doGetFullPath(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getName(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 971
    if-nez p0, :cond_0

    .line 972
    const/4 v0, 0x0

    return-object v0

    .line 974
    :cond_0
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->failIfNullBytePresent(Ljava/lang/String;)V

    .line 975
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->indexOfLastSeparator(Ljava/lang/String;)I

    move-result v1

    .line 976
    add-int/lit8 v0, v1, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getPath(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 804
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lorg/apache/commons/io/FilenameUtils;->doGetPath(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getPathNoEndSeparator(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 832
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lorg/apache/commons/io/FilenameUtils;->doGetPath(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getPrefix(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 764
    if-nez p0, :cond_0

    .line 765
    const/4 v0, 0x0

    return-object v0

    .line 767
    :cond_0
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->getPrefixLength(Ljava/lang/String;)I

    move-result v2

    .line 768
    if-gez v2, :cond_1

    .line 769
    const/4 v0, 0x0

    return-object v0

    .line 771
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v2, v0, :cond_2

    .line 772
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/io/FilenameUtils;->failIfNullBytePresent(Ljava/lang/String;)V

    .line 773
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 775
    :cond_2
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 776
    invoke-static {v3}, Lorg/apache/commons/io/FilenameUtils;->failIfNullBytePresent(Ljava/lang/String;)V

    .line 777
    return-object v3
.end method

.method public static getPrefixLength(Ljava/lang/String;)I
    .locals 7

    .line 634
    if-nez p0, :cond_0

    .line 635
    const/4 v0, -0x1

    return v0

    .line 637
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    .line 638
    if-nez v2, :cond_1

    .line 639
    const/4 v0, 0x0

    return v0

    .line 641
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    .line 642
    const/16 v0, 0x3a

    if-ne v3, v0, :cond_2

    .line 643
    const/4 v0, -0x1

    return v0

    .line 645
    :cond_2
    const/4 v0, 0x1

    if-ne v2, v0, :cond_5

    .line 646
    const/16 v0, 0x7e

    if-ne v3, v0, :cond_3

    .line 647
    const/4 v0, 0x2

    return v0

    .line 649
    :cond_3
    invoke-static {v3}, Lorg/apache/commons/io/FilenameUtils;->isSeparator(C)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 651
    :cond_5
    const/16 v0, 0x7e

    if-ne v3, v0, :cond_9

    .line 652
    const/16 v0, 0x2f

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v4

    .line 653
    const/16 v0, 0x5c

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v5

    .line 654
    const/4 v0, -0x1

    if-ne v4, v0, :cond_6

    const/4 v0, -0x1

    if-ne v5, v0, :cond_6

    .line 655
    add-int/lit8 v0, v2, 0x1

    return v0

    .line 657
    :cond_6
    const/4 v0, -0x1

    if-ne v4, v0, :cond_7

    move v0, v5

    goto :goto_1

    :cond_7
    move v0, v4

    :goto_1
    move v4, v0

    .line 658
    const/4 v0, -0x1

    if-ne v5, v0, :cond_8

    move v0, v4

    goto :goto_2

    :cond_8
    move v0, v5

    :goto_2
    move v5, v0

    .line 659
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0

    .line 661
    :cond_9
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 662
    const/16 v0, 0x3a

    if-ne v4, v0, :cond_e

    .line 663
    invoke-static {v3}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v3

    .line 664
    const/16 v0, 0x41

    if-lt v3, v0, :cond_c

    const/16 v0, 0x5a

    if-gt v3, v0, :cond_c

    .line 665
    const/4 v0, 0x2

    if-eq v2, v0, :cond_a

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lorg/apache/commons/io/FilenameUtils;->isSeparator(C)Z

    move-result v0

    if-nez v0, :cond_b

    .line 666
    :cond_a
    const/4 v0, 0x2

    return v0

    .line 668
    :cond_b
    const/4 v0, 0x3

    return v0

    .line 669
    :cond_c
    const/16 v0, 0x2f

    if-ne v3, v0, :cond_d

    .line 670
    const/4 v0, 0x1

    return v0

    .line 672
    :cond_d
    const/4 v0, -0x1

    return v0

    .line 674
    :cond_e
    invoke-static {v3}, Lorg/apache/commons/io/FilenameUtils;->isSeparator(C)Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-static {v4}, Lorg/apache/commons/io/FilenameUtils;->isSeparator(C)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 675
    const/16 v0, 0x2f

    const/4 v1, 0x2

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v5

    .line 676
    const/16 v0, 0x5c

    const/4 v1, 0x2

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v6

    .line 677
    const/4 v0, -0x1

    if-ne v5, v0, :cond_f

    const/4 v0, -0x1

    if-eq v6, v0, :cond_10

    :cond_f
    const/4 v0, 0x2

    if-eq v5, v0, :cond_10

    const/4 v0, 0x2

    if-ne v6, v0, :cond_11

    .line 678
    :cond_10
    const/4 v0, -0x1

    return v0

    .line 680
    :cond_11
    const/4 v0, -0x1

    if-ne v5, v0, :cond_12

    move v0, v6

    goto :goto_3

    :cond_12
    move v0, v5

    :goto_3
    move v5, v0

    .line 681
    const/4 v0, -0x1

    if-ne v6, v0, :cond_13

    move v0, v5

    goto :goto_4

    :cond_13
    move v0, v6

    :goto_4
    move v6, v0

    .line 682
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0

    .line 684
    :cond_14
    invoke-static {v3}, Lorg/apache/commons/io/FilenameUtils;->isSeparator(C)Z

    move-result v0

    if-eqz v0, :cond_15

    const/4 v0, 0x1

    goto :goto_5

    :cond_15
    const/4 v0, 0x0

    :goto_5
    return v0
.end method

.method public static indexOfExtension(Ljava/lang/String;)I
    .locals 3

    .line 725
    if-nez p0, :cond_0

    .line 726
    const/4 v0, -0x1

    return v0

    .line 728
    :cond_0
    const/16 v0, 0x2e

    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    .line 729
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->indexOfLastSeparator(Ljava/lang/String;)I

    move-result v2

    .line 730
    if-le v2, v1, :cond_1

    const/4 v0, -0x1

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    return v0
.end method

.method public static indexOfLastSeparator(Ljava/lang/String;)I
    .locals 3

    .line 702
    if-nez p0, :cond_0

    .line 703
    const/4 v0, -0x1

    return v0

    .line 705
    :cond_0
    const/16 v0, 0x2f

    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    .line 706
    const/16 v0, 0x5c

    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v2

    .line 707
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public static isExtension(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 1189
    if-nez p0, :cond_0

    .line 1190
    const/4 v0, 0x0

    return v0

    .line 1192
    :cond_0
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->failIfNullBytePresent(Ljava/lang/String;)V

    .line 1194
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1195
    :cond_1
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->indexOfExtension(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 1197
    :cond_3
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->getExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1198
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static isExtension(Ljava/lang/String;Ljava/util/Collection;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Collection<Ljava/lang/String;>;)Z"
        }
    .end annotation

    .line 1244
    if-nez p0, :cond_0

    .line 1245
    const/4 v0, 0x0

    return v0

    .line 1247
    :cond_0
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->failIfNullBytePresent(Ljava/lang/String;)V

    .line 1249
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1250
    :cond_1
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->indexOfExtension(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 1252
    :cond_3
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->getExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1253
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 1254
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1255
    const/4 v0, 0x1

    return v0

    .line 1257
    :cond_4
    goto :goto_1

    .line 1258
    :cond_5
    const/4 v0, 0x0

    return v0
.end method

.method public static isExtension(Ljava/lang/String;[Ljava/lang/String;)Z
    .locals 7

    .line 1214
    if-nez p0, :cond_0

    .line 1215
    const/4 v0, 0x0

    return v0

    .line 1217
    :cond_0
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->failIfNullBytePresent(Ljava/lang/String;)V

    .line 1219
    if-eqz p1, :cond_1

    array-length v0, p1

    if-nez v0, :cond_3

    .line 1220
    :cond_1
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->indexOfExtension(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 1222
    :cond_3
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->getExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1223
    move-object v3, p1

    array-length v4, v3

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_5

    aget-object v6, v3, v5

    .line 1224
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1225
    const/4 v0, 0x1

    return v0

    .line 1223
    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 1228
    :cond_5
    const/4 v0, 0x0

    return v0
.end method

.method private static isSeparator(C)Z
    .locals 1

    .line 150
    const/16 v0, 0x2f

    if-eq p0, v0, :cond_0

    const/16 v0, 0x5c

    if-ne p0, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static isSystemWindows()Z
    .locals 2

    .line 139
    sget-char v0, Lorg/apache/commons/io/FilenameUtils;->SYSTEM_SEPARATOR:C

    const/16 v1, 0x5c

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static normalize(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 195
    sget-char v0, Lorg/apache/commons/io/FilenameUtils;->SYSTEM_SEPARATOR:C

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lorg/apache/commons/io/FilenameUtils;->doNormalize(Ljava/lang/String;CZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static normalize(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 2

    .line 242
    if-eqz p1, :cond_0

    const/16 v1, 0x2f

    goto :goto_0

    :cond_0
    const/16 v1, 0x5c

    .line 243
    :goto_0
    const/4 v0, 0x1

    invoke-static {p0, v1, v0}, Lorg/apache/commons/io/FilenameUtils;->doNormalize(Ljava/lang/String;CZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static normalizeNoEndSeparator(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 289
    sget-char v0, Lorg/apache/commons/io/FilenameUtils;->SYSTEM_SEPARATOR:C

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lorg/apache/commons/io/FilenameUtils;->doNormalize(Ljava/lang/String;CZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static normalizeNoEndSeparator(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 2

    .line 336
    if-eqz p1, :cond_0

    const/16 v1, 0x2f

    goto :goto_0

    :cond_0
    const/16 v1, 0x5c

    .line 337
    :goto_0
    const/4 v0, 0x0

    invoke-static {p0, v1, v0}, Lorg/apache/commons/io/FilenameUtils;->doNormalize(Ljava/lang/String;CZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static removeExtension(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1066
    if-nez p0, :cond_0

    .line 1067
    const/4 v0, 0x0

    return-object v0

    .line 1069
    :cond_0
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->failIfNullBytePresent(Ljava/lang/String;)V

    .line 1071
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->indexOfExtension(Ljava/lang/String;)I

    move-result v1

    .line 1072
    const/4 v0, -0x1

    if-ne v1, v0, :cond_1

    .line 1073
    return-object p0

    .line 1075
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static separatorsToSystem(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 584
    if-nez p0, :cond_0

    .line 585
    const/4 v0, 0x0

    return-object v0

    .line 587
    :cond_0
    invoke-static {}, Lorg/apache/commons/io/FilenameUtils;->isSystemWindows()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 588
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->separatorsToWindows(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 590
    :cond_1
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->separatorsToUnix(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static separatorsToUnix(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 558
    if-eqz p0, :cond_0

    const/16 v0, 0x5c

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 559
    :cond_0
    return-object p0

    .line 561
    :cond_1
    const/16 v0, 0x5c

    const/16 v1, 0x2f

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static separatorsToWindows(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 571
    if-eqz p0, :cond_0

    const/16 v0, 0x2f

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 572
    :cond_0
    return-object p0

    .line 574
    :cond_1
    const/16 v0, 0x2f

    const/16 v1, 0x5c

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static splitOnTokens(Ljava/lang/String;)[Ljava/lang/String;
    .locals 10

    .line 1422
    const/16 v0, 0x3f

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/16 v0, 0x2a

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 1423
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    return-object v0

    .line 1426
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v2

    .line 1427
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1428
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 1429
    const/4 v5, 0x0

    .line 1430
    move-object v6, v2

    array-length v7, v6

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_6

    aget-char v9, v6, v8

    .line 1431
    const/16 v0, 0x3f

    if-eq v9, v0, :cond_1

    const/16 v0, 0x2a

    if-ne v9, v0, :cond_4

    .line 1432
    :cond_1
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-eqz v0, :cond_2

    .line 1433
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1434
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1436
    :cond_2
    const/16 v0, 0x3f

    if-ne v9, v0, :cond_3

    .line 1437
    const-string v0, "?"

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1438
    :cond_3
    const/16 v0, 0x2a

    if-eq v5, v0, :cond_5

    .line 1439
    const-string v0, "*"

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1442
    :cond_4
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1444
    :cond_5
    :goto_1
    move v5, v9

    .line 1430
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 1446
    :cond_6
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-eqz v0, :cond_7

    .line 1447
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1450
    :cond_7
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method public static wildcardMatch(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 1285
    sget-object v0, Lorg/apache/commons/io/IOCase;->SENSITIVE:Lorg/apache/commons/io/IOCase;

    invoke-static {p0, p1, v0}, Lorg/apache/commons/io/FilenameUtils;->wildcardMatch(Ljava/lang/String;Ljava/lang/String;Lorg/apache/commons/io/IOCase;)Z

    move-result v0

    return v0
.end method

.method public static wildcardMatch(Ljava/lang/String;Ljava/lang/String;Lorg/apache/commons/io/IOCase;)Z
    .locals 8

    .line 1329
    if-nez p0, :cond_0

    if-nez p1, :cond_0

    .line 1330
    const/4 v0, 0x1

    return v0

    .line 1332
    :cond_0
    if-eqz p0, :cond_1

    if-nez p1, :cond_2

    .line 1333
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 1335
    :cond_2
    if-nez p2, :cond_3

    .line 1336
    sget-object p2, Lorg/apache/commons/io/IOCase;->SENSITIVE:Lorg/apache/commons/io/IOCase;

    .line 1338
    :cond_3
    invoke-static {p1}, Lorg/apache/commons/io/FilenameUtils;->splitOnTokens(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 1339
    const/4 v3, 0x0

    .line 1340
    const/4 v4, 0x0

    .line 1341
    const/4 v5, 0x0

    .line 1342
    new-instance v6, Ljava/util/Stack;

    invoke-direct {v6}, Ljava/util/Stack;-><init>()V

    .line 1346
    :cond_4
    invoke-virtual {v6}, Ljava/util/Stack;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 1347
    invoke-virtual {v6}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, [I

    .line 1348
    const/4 v0, 0x0

    aget v5, v7, v0

    .line 1349
    const/4 v0, 0x1

    aget v4, v7, v0

    .line 1350
    const/4 v3, 0x1

    .line 1354
    :cond_5
    :goto_0
    array-length v0, v2

    if-ge v5, v0, :cond_e

    .line 1356
    aget-object v0, v2, v5

    const-string v1, "?"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1358
    add-int/lit8 v4, v4, 0x1

    .line 1359
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v4, v0, :cond_6

    .line 1360
    goto/16 :goto_3

    .line 1362
    :cond_6
    const/4 v3, 0x0

    goto/16 :goto_2

    .line 1364
    :cond_7
    aget-object v0, v2, v5

    const-string v1, "*"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1366
    const/4 v3, 0x1

    .line 1367
    array-length v0, v2

    add-int/lit8 v0, v0, -0x1

    if-ne v5, v0, :cond_d

    .line 1368
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    goto :goto_2

    .line 1373
    :cond_8
    if-eqz v3, :cond_b

    .line 1375
    aget-object v0, v2, v5

    invoke-virtual {p2, p0, v4, v0}, Lorg/apache/commons/io/IOCase;->checkIndexOf(Ljava/lang/String;ILjava/lang/String;)I

    move-result v4

    .line 1376
    const/4 v0, -0x1

    if-ne v4, v0, :cond_9

    .line 1378
    goto :goto_3

    .line 1380
    :cond_9
    add-int/lit8 v0, v4, 0x1

    aget-object v1, v2, v5

    invoke-virtual {p2, p0, v0, v1}, Lorg/apache/commons/io/IOCase;->checkIndexOf(Ljava/lang/String;ILjava/lang/String;)I

    move-result v7

    .line 1381
    if-ltz v7, :cond_a

    .line 1382
    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput v5, v0, v1

    const/4 v1, 0x1

    aput v7, v0, v1

    invoke-virtual {v6, v0}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1384
    :cond_a
    goto :goto_1

    .line 1386
    :cond_b
    aget-object v0, v2, v5

    invoke-virtual {p2, p0, v4, v0}, Lorg/apache/commons/io/IOCase;->checkRegionMatches(Ljava/lang/String;ILjava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 1388
    goto :goto_3

    .line 1393
    :cond_c
    :goto_1
    aget-object v0, v2, v5

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v4, v0

    .line 1394
    const/4 v3, 0x0

    .line 1397
    :cond_d
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 1401
    :cond_e
    :goto_3
    array-length v0, v2

    if-ne v5, v0, :cond_f

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-ne v4, v0, :cond_f

    .line 1402
    const/4 v0, 0x1

    return v0

    .line 1405
    :cond_f
    invoke-virtual {v6}, Ljava/util/Stack;->size()I

    move-result v0

    if-gtz v0, :cond_4

    .line 1407
    const/4 v0, 0x0

    return v0
.end method

.method public static wildcardMatchOnSystem(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 1311
    sget-object v0, Lorg/apache/commons/io/IOCase;->SYSTEM:Lorg/apache/commons/io/IOCase;

    invoke-static {p0, p1, v0}, Lorg/apache/commons/io/FilenameUtils;->wildcardMatch(Ljava/lang/String;Ljava/lang/String;Lorg/apache/commons/io/IOCase;)Z

    move-result v0

    return v0
.end method
