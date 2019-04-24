.class public abstract Lcom/huawei/openalliance/ad/utils/l;
.super Ljava/lang/Object;


# direct methods
.method private static a(C)B
    .locals 1

    const-string v0, "0123456789ABCDEF"

    invoke-virtual {v0, p0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    int-to-byte v0, v0

    return v0
.end method

.method public static a()Ljava/lang/String;
    .locals 1

    const-string v0, "37e3b3ae195"

    return-object v0
.end method

.method public static a([B)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v3, 0x0

    :goto_0
    array-length v0, p0

    if-ge v3, v0, :cond_2

    aget-byte v0, p0, v3

    and-int/lit16 v0, v0, 0xff

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/16 v0, 0x30

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;)[B
    .locals 7

    invoke-static {p0}, Lcom/huawei/openalliance/ad/utils/ad;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    :cond_0
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v2, v0, 0x2

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    new-array v4, v2, [B

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_1

    mul-int/lit8 v6, v5, 0x2

    aget-char v0, v3, v6

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/l;->a(C)B

    move-result v0

    shl-int/lit8 v0, v0, 0x4

    add-int/lit8 v1, v6, 0x1

    aget-char v1, v3, v1

    invoke-static {v1}, Lcom/huawei/openalliance/ad/utils/l;->a(C)B

    move-result v1

    or-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    return-object v4
.end method
