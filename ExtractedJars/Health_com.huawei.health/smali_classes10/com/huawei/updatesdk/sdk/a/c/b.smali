.class public Lcom/huawei/updatesdk/sdk/a/c/b;
.super Ljava/lang/Object;


# instance fields
.field private a:[B

.field private b:I

.field private c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/updatesdk/sdk/a/c/b;->a:[B

    const/16 v0, 0x400

    iput v0, p0, Lcom/huawei/updatesdk/sdk/a/c/b;->b:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/updatesdk/sdk/a/c/b;->c:I

    iget v0, p0, Lcom/huawei/updatesdk/sdk/a/c/b;->b:I

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/updatesdk/sdk/a/c/b;->a:[B

    return-void
.end method

.method protected static a(CI)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    const/16 v0, 0x10

    invoke-static {p0, v0}, Ljava/lang/Character;->digit(CI)I

    move-result v3

    const/4 v0, -0x1

    if-ne v3, v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Illegal hexadecimal character "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " at index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return v3
.end method

.method public static a([B)Ljava/lang/String;
    .locals 10

    const/16 v3, 0x10

    new-array v3, v3, [C

    fill-array-data v3, :array_0

    array-length v0, p0

    mul-int/lit8 v0, v0, 0x2

    new-array v4, v0, [C

    const/4 v5, 0x0

    move-object v6, p0

    array-length v7, v6

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_0

    aget-byte v9, v6, v8

    move v0, v5

    add-int/lit8 v5, v5, 0x1

    ushr-int/lit8 v1, v9, 0x4

    and-int/lit8 v1, v1, 0xf

    aget-char v1, v3, v1

    aput-char v1, v4, v0

    move v0, v5

    add-int/lit8 v5, v5, 0x1

    and-int/lit8 v1, v9, 0xf

    aget-char v1, v3, v1

    aput-char v1, v4, v0

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v4}, Ljava/lang/String;-><init>([C)V

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
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method public static a([C)[B
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    array-length v2, p0

    and-int/lit8 v0, v2, 0x1

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Odd number of characters."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    shr-int/lit8 v0, v2, 0x1

    new-array v3, v0, [B

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_1

    aget-char v0, p0, v5

    invoke-static {v0, v5}, Lcom/huawei/updatesdk/sdk/a/c/b;->a(CI)I

    move-result v0

    shl-int/lit8 v6, v0, 0x4

    add-int/lit8 v5, v5, 0x1

    aget-char v0, p0, v5

    invoke-static {v0, v5}, Lcom/huawei/updatesdk/sdk/a/c/b;->a(CI)I

    move-result v0

    or-int/2addr v6, v0

    add-int/lit8 v5, v5, 0x1

    and-int/lit16 v0, v6, 0xff

    int-to-byte v0, v0

    aput-byte v0, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    return-object v3
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/huawei/updatesdk/sdk/a/c/b;->c:I

    return v0
.end method

.method public a([BI)V
    .locals 6

    if-gtz p2, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/a/c/b;->a:[B

    array-length v0, v0

    iget v1, p0, Lcom/huawei/updatesdk/sdk/a/c/b;->c:I

    sub-int/2addr v0, v1

    if-lt v0, p2, :cond_1

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/a/c/b;->a:[B

    iget v1, p0, Lcom/huawei/updatesdk/sdk/a/c/b;->c:I

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/a/c/b;->a:[B

    array-length v0, v0

    add-int/2addr v0, p2

    shl-int/lit8 v4, v0, 0x1

    new-array v5, v4, [B

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/a/c/b;->a:[B

    iget v1, p0, Lcom/huawei/updatesdk/sdk/a/c/b;->c:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v2, v5, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p0, Lcom/huawei/updatesdk/sdk/a/c/b;->c:I

    const/4 v1, 0x0

    invoke-static {p1, v1, v5, v0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v5, p0, Lcom/huawei/updatesdk/sdk/a/c/b;->a:[B

    :goto_0
    iget v0, p0, Lcom/huawei/updatesdk/sdk/a/c/b;->c:I

    add-int/2addr v0, p2

    iput v0, p0, Lcom/huawei/updatesdk/sdk/a/c/b;->c:I

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lcom/huawei/updatesdk/sdk/a/c/b;->c:I

    if-gtz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v4, 0x0

    :try_start_0
    new-instance v4, Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/a/c/b;->a:[B

    iget v1, p0, Lcom/huawei/updatesdk/sdk/a/c/b;->c:I

    const-string v2, "UTF-8"

    const/4 v3, 0x0

    invoke-direct {v4, v0, v3, v1, v2}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v5

    const/4 v4, 0x0

    :goto_0
    return-object v4
.end method
