.class public final Lo/deb;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static c([BI)Ljavax/crypto/spec/SecretKeySpec;
    .locals 6

    .line 177
    if-lez p1, :cond_0

    array-length v0, p0

    if-le p1, v0, :cond_1

    .line 178
    :cond_0
    array-length p1, p0

    .line 181
    :cond_1
    const/16 v0, 0x10

    if-le p1, v0, :cond_2

    .line 183
    const/16 p1, 0x10

    .line 186
    :cond_2
    const/16 v0, 0x10

    new-array v5, v0, [B

    .line 188
    const/4 v4, 0x0

    :goto_0
    const/16 v0, 0x10

    if-ge v4, v0, :cond_3

    .line 189
    const/4 v0, 0x0

    aput-byte v0, v5, v4

    .line 188
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 192
    :cond_3
    const/4 v4, 0x0

    :goto_1
    if-ge v4, p1, :cond_4

    .line 193
    aget-byte v0, p0, v4

    aput-byte v0, v5, v4

    .line 192
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 195
    :cond_4
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "AES/CBC/PKCS5Padding"

    const/4 v2, 0x0

    const/16 v3, 0x10

    invoke-direct {v0, v5, v2, v3, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BIILjava/lang/String;)V

    return-object v0
.end method

.method public static e([B[BLjavax/crypto/spec/SecretKeySpec;)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljavax/crypto/NoSuchPaddingException;,
            Ljava/security/InvalidKeyException;,
            Ljava/security/InvalidAlgorithmParameterException;,
            Ljavax/crypto/IllegalBlockSizeException;,
            Ljavax/crypto/BadPaddingException;
        }
    .end annotation

    .line 169
    const-string v0, "AES/CBC/PKCS5Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v1

    .line 170
    new-instance v2, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v2, p1}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 171
    const/4 v0, 0x1

    invoke-virtual {v1, v0, p2, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 172
    invoke-virtual {v1, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0

    return-object v0
.end method
