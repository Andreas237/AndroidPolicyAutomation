.class public final Lo/del;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Ljava/lang/String;)[B
    .locals 10

    .line 38
    const/4 v2, 0x0

    .line 39
    const/4 v3, 0x0

    .line 40
    const/4 v4, 0x0

    .line 47
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

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

    :goto_0
    if-ge v6, v5, :cond_5

    .line 60
    invoke-virtual {v4, v6}, Ljava/lang/String;->charAt(I)C

    move-result v9

    .line 62
    const/16 v0, 0x30

    if-gt v0, v9, :cond_2

    const/16 v0, 0x39

    if-le v9, v0, :cond_4

    :cond_2
    const/16 v0, 0x41

    if-gt v0, v9, :cond_3

    const/16 v0, 0x46

    if-le v9, v0, :cond_4

    .line 63
    :cond_3
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 59
    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 67
    :cond_5
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

    :goto_1
    if-ge v6, v5, :cond_8

    .line 74
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

    :goto_2
    const/4 v0, 0x2

    if-ge v8, v0, :cond_7

    .line 78
    aget-byte v0, v3, v8

    const/16 v1, 0x41

    if-gt v1, v0, :cond_6

    aget-byte v0, v3, v8

    const/16 v1, 0x46

    if-gt v0, v1, :cond_6

    .line 79
    aget-byte v0, v3, v8

    add-int/lit8 v0, v0, -0x37

    int-to-byte v0, v0

    aput-byte v0, v3, v8

    goto :goto_3

    .line 81
    :cond_6
    aget-byte v0, v3, v8

    add-int/lit8 v0, v0, -0x30

    int-to-byte v0, v0

    aput-byte v0, v3, v8

    .line 77
    :goto_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 85
    :cond_7
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

    goto :goto_1

    .line 88
    :cond_8
    return-object v2
.end method
