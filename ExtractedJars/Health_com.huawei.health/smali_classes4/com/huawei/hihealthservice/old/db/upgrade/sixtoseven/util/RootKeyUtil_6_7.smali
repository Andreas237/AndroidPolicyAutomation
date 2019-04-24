.class public Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/RootKeyUtil_6_7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final COMPONENT_SIZE:I = 0x80

.field public static final PBKDF2_ALGORITHM:Ljava/lang/String; = "PBKDF2WithHmacSHA1"

.field public static final PBKDF2_ITER_COUNT:I = 0xc350


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static PBKDF2([C[B)[B
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/spec/InvalidKeySpecException;
        }
    .end annotation

    .line 181
    new-instance v2, Ljavax/crypto/spec/PBEKeySpec;

    const v0, 0xc350

    const/16 v1, 0x100

    invoke-direct {v2, p0, p1, v0, v1}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C[BII)V

    .line 182
    const-string v0, "PBKDF2WithHmacSHA1"

    invoke-static {v0}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v3

    .line 183
    invoke-virtual {v3, v2}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object v0

    invoke-interface {v0}, Ljavax/crypto/SecretKey;->getEncoded()[B

    move-result-object v0

    return-object v0
.end method

.method public static genRandBytes(I)[B
    .locals 2

    .line 194
    new-array v0, p0, [B

    .line 195
    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    .line 196
    invoke-virtual {v1, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 197
    return-object v0
.end method

.method public static genRootKey([Ljava/lang/String;[B)[B
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/spec/InvalidKeySpecException;
        }
    .end annotation

    .line 104
    const/16 v0, 0x80

    new-array v2, v0, [B

    .line 106
    move-object v4, p0

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    aget-object v7, v4, v6

    .line 108
    invoke-static {v7}, Lcom/huawei/hihealthservice/old/util/HEX;->decode(Ljava/lang/String;)[B

    move-result-object v3

    .line 109
    const/4 v8, 0x0

    :goto_1
    const/16 v0, 0x80

    if-ge v8, v0, :cond_0

    .line 111
    aget-byte v0, v2, v8

    aget-byte v1, v3, v8

    xor-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, v2, v8

    .line 109
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 106
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 115
    :cond_1
    invoke-static {v2}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/RootKeyUtil_6_7;->toCharArray([B)[C

    move-result-object v0

    invoke-static {v0, p1}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/RootKeyUtil_6_7;->PBKDF2([C[B)[B

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/RootKeyUtil_6_7;->sha256([B)[B

    move-result-object v0

    return-object v0
.end method

.method public static getAesCbcSecretAndIv([Ljava/lang/String;[B)[[B
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/spec/InvalidKeySpecException;
        }
    .end annotation

    .line 126
    invoke-static {p0, p1}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/RootKeyUtil_6_7;->genRootKey([Ljava/lang/String;[B)[B

    move-result-object v3

    .line 127
    const/16 v0, 0x10

    new-array v4, v0, [B

    .line 128
    const/16 v0, 0x10

    new-array v5, v0, [B

    .line 129
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/16 v2, 0x10

    invoke-static {v3, v0, v4, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 130
    const/16 v0, 0x10

    const/4 v1, 0x0

    const/16 v2, 0x10

    invoke-static {v3, v0, v5, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 131
    const/4 v0, 0x2

    new-array v6, v0, [[B

    .line 132
    const/4 v0, 0x0

    aput-object v4, v6, v0

    .line 133
    const/4 v0, 0x1

    aput-object v5, v6, v0

    .line 134
    return-object v6
.end method

.method public static sha256([B)[B
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;
        }
    .end annotation

    .line 166
    const-string v0, "SHA-256"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v1

    .line 167
    invoke-virtual {v1, p0}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    return-object v0
.end method

.method private static toCharArray([B)[C
    .locals 3

    .line 207
    array-length v0, p0

    new-array v1, v0, [C

    .line 208
    const/4 v2, 0x0

    :goto_0
    array-length v0, p0

    if-ge v2, v0, :cond_0

    .line 210
    aget-byte v0, p0, v2

    int-to-char v0, v0

    aput-char v0, v1, v2

    .line 208
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 212
    :cond_0
    return-object v1
.end method
