.class public Lcom/huawei/hihealthservice/old/util/HEX;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    return-void
.end method

.method public static decode(Ljava/lang/String;)[B
    .locals 10

    .line 48
    const/4 v2, 0x0

    .line 49
    const/4 v3, 0x0

    .line 50
    const/4 v4, 0x0

    .line 57
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 58
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "null == stData"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 61
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    .line 63
    rem-int/lit8 v0, v5, 0x2

    if-eqz v0, :cond_1

    .line 64
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "(l_iLen % 2) != 0"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 67
    :cond_1
    sget-object v0, Lcom/huawei/hihealthservice/old/util/Constants$LOCALE;->DEFAULT_LOCALE:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    .line 69
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_5

    .line 70
    invoke-virtual {v4, v6}, Ljava/lang/String;->charAt(I)C

    move-result v9

    .line 72
    const/16 v0, 0x30

    if-gt v0, v9, :cond_2

    const/16 v0, 0x39

    if-le v9, v0, :cond_4

    :cond_2
    const/16 v0, 0x41

    if-gt v0, v9, :cond_3

    const/16 v0, 0x46

    if-le v9, v0, :cond_4

    .line 73
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "!(((\'0\' <= l_cTmp) && (l_cTmp <= \'9\')) || ((\'A\' <= l_cTmp) && (l_cTmp <= \'F\')))"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 69
    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 77
    :cond_5
    div-int/lit8 v5, v5, 0x2

    .line 79
    new-array v2, v5, [B

    .line 81
    const/4 v0, 0x2

    new-array v3, v0, [B

    .line 83
    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_1
    if-ge v6, v5, :cond_8

    .line 84
    move v0, v7

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    int-to-byte v0, v0

    const/4 v1, 0x0

    aput-byte v0, v3, v1

    .line 85
    move v0, v7

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    int-to-byte v0, v0

    const/4 v1, 0x1

    aput-byte v0, v3, v1

    .line 87
    const/4 v8, 0x0

    :goto_2
    const/4 v0, 0x2

    if-ge v8, v0, :cond_7

    .line 88
    aget-byte v0, v3, v8

    const/16 v1, 0x41

    if-gt v1, v0, :cond_6

    aget-byte v0, v3, v8

    const/16 v1, 0x46

    if-gt v0, v1, :cond_6

    .line 89
    aget-byte v0, v3, v8

    add-int/lit8 v0, v0, -0x37

    int-to-byte v0, v0

    aput-byte v0, v3, v8

    goto :goto_3

    .line 91
    :cond_6
    aget-byte v0, v3, v8

    add-int/lit8 v0, v0, -0x30

    int-to-byte v0, v0

    aput-byte v0, v3, v8

    .line 87
    :goto_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 95
    :cond_7
    const/4 v0, 0x0

    aget-byte v0, v3, v0

    shl-int/lit8 v0, v0, 0x4

    const/4 v1, 0x1

    aget-byte v1, v3, v1

    or-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, v2, v6

    .line 83
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 98
    :cond_8
    return-object v2
.end method

.method public static encode([BI)Ljava/lang/String;
    .locals 5

    .line 17
    const/4 v2, 0x0

    .line 18
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    .line 21
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 22
    const/4 v0, 0x0

    return-object v0

    .line 25
    :cond_0
    if-lez p1, :cond_1

    array-length v0, p0

    if-le p1, v0, :cond_2

    .line 26
    :cond_1
    array-length p1, p0

    .line 29
    :cond_2
    const/4 v4, 0x0

    :goto_0
    if-ge v4, p1, :cond_4

    .line 30
    aget-byte v0, p0, v4

    and-int/lit16 v0, v0, 0xff

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    .line 32
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 36
    :cond_3
    sget-object v0, Lcom/huawei/hihealthservice/old/util/Constants$LOCALE;->DEFAULT_LOCALE:Ljava/util/Locale;

    invoke-virtual {v2, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 29
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 39
    :cond_4
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
