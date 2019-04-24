.class abstract Lo/aym;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Ljava/lang/String;)[B
    .locals 10

    .line 58
    const/4 v2, 0x0

    .line 59
    const/4 v3, 0x0

    .line 60
    const/4 v4, 0x0

    .line 67
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 69
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 72
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    .line 74
    rem-int/lit8 v0, v5, 0x2

    if-eqz v0, :cond_1

    .line 76
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 78
    :cond_1
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    .line 79
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_5

    .line 81
    invoke-virtual {v4, v6}, Ljava/lang/String;->charAt(I)C

    move-result v9

    .line 83
    const/16 v0, 0x30

    if-gt v0, v9, :cond_2

    const/16 v0, 0x39

    if-le v9, v0, :cond_4

    :cond_2
    const/16 v0, 0x41

    if-gt v0, v9, :cond_3

    const/16 v0, 0x46

    if-le v9, v0, :cond_4

    .line 85
    :cond_3
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 79
    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 88
    :cond_5
    div-int/lit8 v5, v5, 0x2

    .line 89
    new-array v2, v5, [B

    .line 90
    const/4 v0, 0x2

    new-array v3, v0, [B

    .line 91
    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_1
    if-ge v6, v5, :cond_8

    .line 93
    move v0, v7

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    int-to-byte v0, v0

    const/4 v1, 0x0

    aput-byte v0, v3, v1

    .line 94
    move v0, v7

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    int-to-byte v0, v0

    const/4 v1, 0x1

    aput-byte v0, v3, v1

    .line 95
    const/4 v8, 0x0

    :goto_2
    const/4 v0, 0x2

    if-ge v8, v0, :cond_7

    .line 97
    aget-byte v0, v3, v8

    const/16 v1, 0x41

    if-gt v1, v0, :cond_6

    aget-byte v0, v3, v8

    const/16 v1, 0x46

    if-gt v0, v1, :cond_6

    .line 99
    aget-byte v0, v3, v8

    add-int/lit8 v0, v0, -0x37

    int-to-byte v0, v0

    aput-byte v0, v3, v8

    goto :goto_3

    .line 103
    :cond_6
    aget-byte v0, v3, v8

    add-int/lit8 v0, v0, -0x30

    int-to-byte v0, v0

    aput-byte v0, v3, v8

    .line 95
    :goto_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 106
    :cond_7
    const/4 v0, 0x0

    aget-byte v0, v3, v0

    shl-int/lit8 v0, v0, 0x4

    const/4 v1, 0x1

    aget-byte v1, v3, v1

    or-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, v2, v6

    .line 91
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 108
    :cond_8
    return-object v2
.end method
