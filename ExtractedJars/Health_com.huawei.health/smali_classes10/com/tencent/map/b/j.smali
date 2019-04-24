.class public final Lcom/tencent/map/b/j;
.super Ljava/lang/Object;


# direct methods
.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    const-string v0, "MD5"

    :try_start_0
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v1

    const-string v2, ""

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    array-length v4, v1

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    aget-byte v6, v1, v5

    and-int/lit16 v0, v6, 0xff

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    return-object p0
.end method

.method public static a([B)[B
    .locals 4

    if-nez p0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v3, Ljava/util/zip/DeflaterOutputStream;

    invoke-direct {v3, v2}, Ljava/util/zip/DeflaterOutputStream;-><init>(Ljava/io/OutputStream;)V

    :try_start_0
    array-length v0, p0

    const/4 v1, 0x0

    invoke-virtual {v3, p0, v1, v0}, Ljava/util/zip/DeflaterOutputStream;->write([BII)V

    invoke-virtual {v3}, Ljava/util/zip/DeflaterOutputStream;->finish()V

    invoke-virtual {v3}, Ljava/util/zip/DeflaterOutputStream;->flush()V

    invoke-virtual {v3}, Ljava/util/zip/DeflaterOutputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    return-object v0

    :goto_0
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public static b([B)[B
    .locals 9

    if-nez p0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    move-object p0, v0

    new-instance v3, Ljava/util/zip/InflaterInputStream;

    invoke-direct {v3, p0}, Ljava/util/zip/InflaterInputStream;-><init>(Ljava/io/InputStream;)V

    const/4 v0, 0x0

    new-array v4, v0, [B

    const/4 v5, 0x0

    const/16 v0, 0x400

    new-array v6, v0, [B

    :cond_1
    :try_start_0
    invoke-virtual {v3, v6}, Ljava/util/zip/InflaterInputStream;->read([B)I

    move-result v0

    move v7, v0

    if-lez v0, :cond_2

    add-int v0, v5, v7

    move v5, v0

    new-array v8, v0, [B

    array-length v0, v4

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v4, v1, v8, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v0, v4

    const/4 v1, 0x0

    invoke-static {v6, v1, v8, v0, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v8

    :cond_2
    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    return-object v0

    :goto_0
    if-gtz v7, :cond_1

    :try_start_1
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->close()V

    invoke-virtual {v3}, Ljava/util/zip/InflaterInputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    const/4 v0, 0x0

    return-object v0

    :goto_1
    return-object v4
.end method
