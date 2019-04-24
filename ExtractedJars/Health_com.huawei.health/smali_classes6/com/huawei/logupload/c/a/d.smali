.class public final Lcom/huawei/logupload/c/a/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([B)Ljava/lang/String;
    .locals 1

    .line 34
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/huawei/logupload/c/a/d;->a([BI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a([BI)Ljava/lang/String;
    .locals 5

    .line 8
    const/4 v2, 0x0

    .line 9
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    .line 12
    if-nez p0, :cond_0

    .line 13
    const/4 v0, 0x0

    return-object v0

    .line 16
    :cond_0
    if-lez p1, :cond_1

    array-length v0, p0

    if-le p1, v0, :cond_2

    .line 17
    :cond_1
    array-length p1, p0

    .line 20
    :cond_2
    const/4 v4, 0x0

    goto :goto_0

    .line 21
    :cond_3
    aget-byte v0, p0, v4

    and-int/lit16 v0, v0, 0xff

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    .line 23
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "0"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 27
    :cond_4
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v2, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 20
    add-int/lit8 v4, v4, 0x1

    :goto_0
    if-lt v4, p1, :cond_3

    .line 30
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;)[B
    .locals 10

    .line 38
    const/4 v2, 0x0

    .line 39
    const/4 v3, 0x0

    .line 40
    const/4 v4, 0x0

    .line 47
    if-nez p0, :cond_0

    .line 48
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 51
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    .line 53
    rem-int/lit8 v0, v5, 0x2

    if-eqz v0, :cond_1

    .line 54
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 57
    :cond_1
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    .line 59
    const/4 v6, 0x0

    goto :goto_0

    .line 60
    :cond_2
    invoke-virtual {v4, v6}, Ljava/lang/String;->charAt(I)C

    move-result v9

    .line 62
    const/16 v0, 0x30

    if-gt v0, v9, :cond_3

    const/16 v0, 0x39

    if-le v9, v0, :cond_5

    :cond_3
    const/16 v0, 0x41

    if-gt v0, v9, :cond_4

    const/16 v0, 0x46

    if-le v9, v0, :cond_5

    .line 63
    :cond_4
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 59
    :cond_5
    add-int/lit8 v6, v6, 0x1

    :goto_0
    if-lt v6, v5, :cond_2

    .line 67
    div-int/lit8 v5, v5, 0x2

    .line 69
    new-array v2, v5, [B

    .line 71
    const/4 v0, 0x2

    new-array v3, v0, [B

    .line 73
    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    goto :goto_3

    .line 74
    :cond_6
    move v0, v7

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    int-to-byte v0, v0

    const/4 v1, 0x0

    aput-byte v0, v3, v1

    .line 75
    move v0, v7

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    int-to-byte v0, v0

    const/4 v1, 0x1

    aput-byte v0, v3, v1

    .line 77
    const/4 v8, 0x0

    goto :goto_2

    .line 78
    :cond_7
    aget-byte v0, v3, v8

    const/16 v1, 0x41

    if-gt v1, v0, :cond_8

    aget-byte v0, v3, v8

    const/16 v1, 0x46

    if-gt v0, v1, :cond_8

    .line 79
    aget-byte v0, v3, v8

    add-int/lit8 v0, v0, -0x37

    int-to-byte v0, v0

    aput-byte v0, v3, v8

    .line 80
    goto :goto_1

    .line 81
    :cond_8
    aget-byte v0, v3, v8

    add-int/lit8 v0, v0, -0x30

    int-to-byte v0, v0

    aput-byte v0, v3, v8

    .line 77
    :goto_1
    add-int/lit8 v8, v8, 0x1

    :goto_2
    const/4 v0, 0x2

    if-lt v8, v0, :cond_7

    .line 85
    const/4 v0, 0x0

    aget-byte v0, v3, v0

    shl-int/lit8 v0, v0, 0x4

    const/4 v1, 0x1

    aget-byte v1, v3, v1

    or-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, v2, v6

    .line 73
    add-int/lit8 v6, v6, 0x1

    :goto_3
    if-lt v6, v5, :cond_6

    .line 88
    return-object v2
.end method
