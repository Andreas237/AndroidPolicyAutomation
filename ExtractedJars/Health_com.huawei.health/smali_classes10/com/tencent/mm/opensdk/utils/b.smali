.class public final Lcom/tencent/mm/opensdk/utils/b;
.super Ljava/lang/Object;


# direct methods
.method public static final c([B)Ljava/lang/String;
    .locals 9

    const/16 v3, 0x10

    new-array v3, v3, [C

    fill-array-data v3, :array_0

    const-string v0, "MD5"

    :try_start_0
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v4

    invoke-virtual {v4, p0}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v4}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    array-length v0, p0

    move v4, v0

    mul-int/lit8 v0, v0, 0x2

    new-array v5, v0, [C

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v4, :cond_0

    aget-byte v8, p0, v7

    move v0, v6

    add-int/lit8 v6, v6, 0x1

    ushr-int/lit8 v1, v8, 0x4

    and-int/lit8 v1, v1, 0xf

    aget-char v1, v3, v1

    aput-char v1, v5, v0

    move v0, v6

    add-int/lit8 v6, v6, 0x1

    and-int/lit8 v1, v8, 0xf

    aget-char v1, v3, v1

    aput-char v1, v5, v0

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0

    nop

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
    .end array-data
.end method
