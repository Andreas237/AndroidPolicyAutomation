.class public abstract Lcom/huawei/hms/support/api/push/b/b/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()[B
    .locals 5

    .line 62
    invoke-static {}, Lcom/huawei/hms/support/api/push/b/a/a/b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hms/support/api/push/b/a/a/a;->b(Ljava/lang/String;)[B

    move-result-object v1

    .line 63
    invoke-static {}, Lcom/huawei/hms/support/api/push/b/b/b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hms/support/api/push/b/a/a/a;->b(Ljava/lang/String;)[B

    move-result-object v2

    .line 64
    invoke-static {}, Lcom/huawei/hms/support/api/push/b/b/e;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hms/support/api/push/b/a/a/a;->b(Ljava/lang/String;)[B

    move-result-object v3

    .line 65
    invoke-static {v1, v2}, Lcom/huawei/hms/support/api/push/b/b/e;->a([B[B)[B

    move-result-object v0

    invoke-static {v0, v3}, Lcom/huawei/hms/support/api/push/b/b/e;->a([B[B)[B

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hms/support/api/push/b/b/e;->a([B)[B

    move-result-object v4

    .line 67
    return-object v4
.end method

.method private static a([B)[B
    .locals 3

    .line 45
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    array-length v0, p0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 46
    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 49
    :cond_1
    const/4 v2, 0x0

    :goto_0
    array-length v0, p0

    if-ge v2, v0, :cond_2

    .line 50
    aget-byte v0, p0, v2

    shr-int/lit8 v0, v0, 0x2

    int-to-byte v0, v0

    aput-byte v0, p0, v2

    .line 49
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 53
    :cond_2
    return-object p0
.end method

.method private static a([B[B)[B
    .locals 6

    .line 20
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    array-length v0, p0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    array-length v0, p1

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 21
    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 24
    :cond_1
    array-length v2, p0

    .line 25
    array-length v3, p1

    .line 26
    if-eq v2, v3, :cond_2

    .line 27
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 30
    :cond_2
    new-array v4, v2, [B

    .line 31
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_3

    .line 32
    aget-byte v0, p0, v5

    aget-byte v1, p1, v5

    xor-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, v4, v5

    .line 31
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 35
    :cond_3
    return-object v4
.end method

.method private static b()Ljava/lang/String;
    .locals 1

    .line 71
    const-string v0, "2A57086C86EF54970C1E6EB37BFC72B1"

    return-object v0
.end method
