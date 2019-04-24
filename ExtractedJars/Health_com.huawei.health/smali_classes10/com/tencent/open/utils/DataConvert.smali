.class public Lcom/tencent/open/utils/DataConvert;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static intToBytes2(I)[B
    .locals 4

    .line 11
    const/4 v0, 0x4

    new-array v2, v0, [B

    .line 12
    const/4 v3, 0x0

    :goto_0
    const/4 v0, 0x4

    if-ge v3, v0, :cond_0

    .line 13
    mul-int/lit8 v0, v3, 0x8

    rsub-int/lit8 v0, v0, 0x18

    shr-int v0, p0, v0

    int-to-byte v0, v0

    aput-byte v0, v2, v3

    .line 12
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 15
    :cond_0
    return-object v2
.end method

.method public static putBytes2Bytes([BI[BI)I
    .locals 3

    .line 91
    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    .line 92
    add-int v0, p3, v2

    aget-byte v1, p0, v2

    aput-byte v1, p2, v0

    .line 91
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 94
    :cond_0
    array-length v0, p0

    return v0
.end method

.method public static putBytes2Bytes([B[BI)I
    .locals 3

    .line 84
    const/4 v2, 0x0

    :goto_0
    array-length v0, p0

    if-ge v2, v0, :cond_0

    .line 85
    add-int v0, p2, v2

    aget-byte v1, p0, v2

    aput-byte v1, p1, v0

    .line 84
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 87
    :cond_0
    array-length v0, p0

    return v0
.end method

.method public static putInt2Bytes(I[BI)I
    .locals 4

    .line 61
    invoke-static {p0}, Lcom/tencent/open/utils/DataConvert;->intToBytes2(I)[B

    move-result-object v2

    .line 62
    const/4 v3, 0x0

    :goto_0
    array-length v0, v2

    if-ge v3, v0, :cond_0

    .line 63
    add-int v0, p2, v3

    aget-byte v1, v2, v3

    aput-byte v1, p1, v0

    .line 62
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 65
    :cond_0
    array-length v0, v2

    return v0
.end method

.method public static putShort2Bytes(I[BI)I
    .locals 3

    .line 69
    invoke-static {p0}, Lcom/tencent/open/utils/DataConvert;->intToBytes2(I)[B

    move-result-object v2

    .line 70
    add-int/lit8 v0, p2, 0x0

    const/4 v1, 0x2

    aget-byte v1, v2, v1

    aput-byte v1, p1, v0

    .line 71
    add-int/lit8 v0, p2, 0x1

    const/4 v1, 0x3

    aget-byte v1, v2, v1

    aput-byte v1, p1, v0

    .line 72
    const/4 v0, 0x2

    return v0
.end method

.method public static putString2Bytes(Ljava/lang/String;[BI)I
    .locals 4

    .line 76
    invoke-static {p0}, Lcom/tencent/open/utils/DataConvert;->string2bytes(Ljava/lang/String;)[B

    move-result-object v2

    .line 77
    const/4 v3, 0x0

    :goto_0
    array-length v0, v2

    if-ge v3, v0, :cond_0

    .line 78
    add-int v0, p2, v3

    aget-byte v1, v2, v3

    aput-byte v1, p1, v0

    .line 77
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 80
    :cond_0
    array-length v0, v2

    return v0
.end method

.method public static string2bytes(Ljava/lang/String;)[B
    .locals 8

    .line 45
    const-string v0, " "

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    .line 46
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    .line 47
    div-int/lit8 v5, v4, 0x2

    .line 48
    rem-int/lit8 v0, v4, 0x2

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 50
    add-int/lit8 v4, v4, 0x1

    .line 51
    add-int/lit8 v5, v5, 0x1

    .line 53
    :cond_0
    new-array v6, v5, [B

    .line 54
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v5, :cond_1

    .line 55
    mul-int/lit8 v0, v7, 0x2

    mul-int/lit8 v1, v7, 0x2

    add-int/lit8 v1, v1, 0x2

    invoke-virtual {v3, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    int-to-byte v0, v0

    aput-byte v0, v6, v7

    .line 54
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 57
    :cond_1
    return-object v6
.end method

.method public static toHexString([B)Ljava/lang/String;
    .locals 6

    .line 24
    if-nez p0, :cond_0

    .line 25
    const/4 v0, 0x0

    return-object v0

    .line 27
    :cond_0
    array-length v0, p0

    mul-int/lit8 v2, v0, 0x2

    .line 28
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 29
    const/4 v4, 0x0

    :goto_0
    array-length v0, p0

    if-ge v4, v0, :cond_2

    .line 30
    aget-byte v0, p0, v4

    and-int/lit16 v0, v0, 0xff

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v5

    .line 31
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 34
    :cond_1
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 36
    :cond_2
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
