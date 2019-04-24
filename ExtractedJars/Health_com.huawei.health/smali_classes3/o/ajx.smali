.class public Lo/ajx;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:[B


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()V
    .locals 15

    .line 21
    invoke-static {}, Lo/ajw;->d()[B

    move-result-object v4

    .line 22
    if-eqz v4, :cond_0

    array-length v0, v4

    if-nez v0, :cond_1

    .line 23
    :cond_0
    return-void

    .line 27
    :cond_1
    const/4 v0, 0x0

    aget-byte v5, v4, v0

    .line 30
    new-array v6, v5, [B

    .line 31
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v5, :cond_2

    .line 32
    add-int v0, v7, v5

    mul-int/lit8 v0, v0, 0x8

    add-int/lit8 v0, v0, -0x2

    aget-byte v0, v4, v0

    aput-byte v0, v6, v7

    .line 31
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 35
    :cond_2
    const/4 v7, 0x0

    :goto_1
    array-length v0, v6

    div-int/lit8 v0, v0, 0x2

    if-ge v7, v0, :cond_3

    .line 36
    aget-byte v8, v6, v7

    .line 37
    array-length v0, v6

    add-int/lit8 v0, v0, -0x1

    sub-int/2addr v0, v7

    aget-byte v0, v6, v0

    aput-byte v0, v6, v7

    .line 38
    array-length v0, v6

    add-int/lit8 v0, v0, -0x1

    sub-int/2addr v0, v7

    aput-byte v8, v6, v0

    .line 35
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 41
    :cond_3
    const/16 v0, 0x10

    new-array v7, v0, [B

    .line 42
    const/16 v0, 0x20

    new-array v8, v0, [B

    .line 44
    invoke-static {}, Lo/ajw;->c()[B

    move-result-object v0

    array-length v0, v0

    new-array v9, v0, [B

    .line 45
    const/4 v10, 0x0

    :goto_2
    invoke-static {}, Lo/ajw;->c()[B

    move-result-object v0

    array-length v0, v0

    if-ge v10, v0, :cond_4

    .line 46
    invoke-static {}, Lo/ajw;->c()[B

    move-result-object v0

    invoke-static {}, Lo/ajw;->c()[B

    move-result-object v1

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    sub-int/2addr v1, v10

    aget-byte v0, v0, v1

    aput-byte v0, v9, v10

    .line 45
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    .line 49
    :cond_4
    new-instance v10, Ljava/lang/StringBuilder;

    const-string v0, "53B848A734F834571DF6DF096ACD1A84A47D150FA8"

    invoke-direct {v10, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->reverse()Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ajw;->a(Ljava/lang/String;)[B

    move-result-object v11

    .line 52
    invoke-static {}, Lo/ajt;->e()[B

    move-result-object v0

    array-length v0, v0

    new-array v12, v0, [B

    .line 53
    const/4 v13, 0x0

    :goto_3
    invoke-static {}, Lo/ajt;->e()[B

    move-result-object v0

    array-length v0, v0

    if-ge v13, v0, :cond_5

    .line 54
    invoke-static {}, Lo/ajt;->e()[B

    move-result-object v0

    invoke-static {}, Lo/ajt;->e()[B

    move-result-object v1

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    sub-int/2addr v1, v13

    aget-byte v0, v0, v1

    aput-byte v0, v12, v13

    .line 53
    add-int/lit8 v13, v13, 0x1

    goto :goto_3

    .line 57
    :cond_5
    array-length v0, v9

    array-length v1, v11

    add-int/2addr v0, v1

    array-length v1, v12

    add-int/2addr v0, v1

    new-array v13, v0, [B

    .line 58
    array-length v0, v9

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v9, v1, v13, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 59
    array-length v0, v9

    array-length v1, v11

    const/4 v2, 0x0

    invoke-static {v11, v2, v13, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 60
    array-length v0, v9

    array-length v1, v11

    add-int/2addr v0, v1

    array-length v1, v12

    const/4 v2, 0x0

    invoke-static {v12, v2, v13, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 62
    array-length v0, v7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/16 v0, 0x10

    invoke-static {v13, v1, v7, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 63
    array-length v0, v7

    array-length v1, v8

    const/16 v0, 0x10

    const/4 v2, 0x0

    const/16 v1, 0x20

    invoke-static {v13, v0, v8, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 67
    const/4 v0, 0x2

    :try_start_0
    invoke-static {v0, v6, v7, v8}, Lo/ddy;->b(I[B[B[B)[B

    move-result-object v0

    invoke-static {v0}, Lo/ajt;->e([B)[B

    move-result-object v0

    sput-object v0, Lo/ajx;->a:[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    goto :goto_4

    .line 68
    :catch_0
    move-exception v14

    .line 69
    const-string v0, "CommonPskUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v14}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 70
    const/4 v0, 0x0

    new-array v0, v0, [B

    invoke-static {v0}, Lo/ajt;->e([B)[B

    move-result-object v0

    sput-object v0, Lo/ajx;->a:[B

    .line 72
    :goto_4
    return-void
.end method

.method public static e()[B
    .locals 2

    .line 75
    sget-object v0, Lo/ajx;->a:[B

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-object v0, Lo/ajx;->a:[B

    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    :goto_0
    return-object v0
.end method
