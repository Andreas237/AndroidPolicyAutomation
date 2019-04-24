.class public abstract Lo/cjq;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cjq$b;
    }
.end annotation


# direct methods
.method public static a()Ljava/lang/String;
    .locals 3

    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    const/16 v0, 0x10

    new-array v2, v0, [B

    invoke-virtual {v1, v2}, Ljava/security/SecureRandom;->nextBytes([B)V

    invoke-static {v2}, Lo/cjr;->b([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a([BLjava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    array-length v0, p0

    if-nez v0, :cond_1

    :cond_0
    return-object p1

    :cond_1
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    const-string p1, ""

    :cond_2
    invoke-static {p0}, Lo/cjr;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;[B[B)[B
    .locals 6

    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    array-length v0, p1

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    :cond_1
    const-string v0, "AES/CBC/PKCS5Padding"

    :try_start_0
    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v2

    invoke-static {p0}, Lo/cjr;->e(Ljava/lang/String;)[B

    move-result-object v3

    new-instance v4, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "AES"

    invoke-direct {v4, v3, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    new-instance v5, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v5, p1}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    const/4 v0, 0x1

    invoke-virtual {v2, v0, v4, v5}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    invoke-virtual {v2, p2}, Ljavax/crypto/Cipher;->doFinal([B)[B
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_5

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v2

    const-string v0, "Crypter"

    const-string v1, "aesEncrypt(): NoSuchAlgorithmException: fail to encrypt"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    :catch_1
    move-exception v2

    const-string v0, "Crypter"

    const-string v1, "aesEncrypt(): InvalidKeyException: fail to encrypt"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    :catch_2
    move-exception v2

    const-string v0, "Crypter"

    const-string v1, "aesEncrypt(): InvalidAlgorithmParameterException: fail to encrypt"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    :catch_3
    move-exception v2

    const-string v0, "Crypter"

    const-string v1, "aesEncrypt(): NoSuchPaddingException: fail to encrypt"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    :catch_4
    move-exception v2

    const-string v0, "Crypter"

    const-string v1, "aesEncrypt(): BadPaddingException: fail to encrypt"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    :catch_5
    move-exception v2

    const-string v0, "Crypter"

    const-string v1, "aesEncrypt(): IllegalBlockSizeException: fail to encrypt"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method

.method public static b()Ljava/lang/String;
    .locals 3

    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    const/16 v0, 0x80

    new-array v2, v0, [B

    invoke-virtual {v1, v2}, Ljava/security/SecureRandom;->nextBytes([B)V

    invoke-static {v2}, Lo/cjr;->b([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-string v2, ""

    :try_start_0
    invoke-static {p0}, Lo/cjq;->c(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lo/cjq$b; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "Crypter"

    const-string v1, "rasEncryptKey(): RSAEncryptionException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object v2
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lo/cjq;->c([B)[B

    move-result-object v2

    invoke-static {v2}, Lo/cjr;->b([B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v2

    const-string v0, "Crypter"

    const-string v1, "rsaEncrypt(): UnsupportedEncodingException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lo/cjq$b;

    invoke-direct {v0}, Lo/cjq$b;-><init>()V

    throw v0
.end method

.method public static c()[B
    .locals 3

    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    const/16 v0, 0x10

    new-array v2, v0, [B

    invoke-virtual {v1, v2}, Ljava/security/SecureRandom;->nextBytes([B)V

    return-object v2
.end method

.method public static c([B)[B
    .locals 4

    const-string v0, "24907259431961377209480304447420314675278854956424737688244507998454379688588314890162679979323703303509240796245532111474023047392580178709435281576624542294613207523485034492914828565153172773053351891188090398210811384185501117117991603774176386409127476628856566065613009756131651597266262540467980974946876675842468600552312158771248419700603327630677244315755445967726919102965015263135288381740211593751262078285738436597133664401598420056690274760726854877181978220226448211936820860496708860964018593025172845041095854180953040116559241637133730839837036910305932797451786785855051024967644159284784940216337"

    const-string v1, "65537"

    :try_start_0
    invoke-static {v0, v1}, Lo/cjq;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/security/interfaces/RSAPublicKey;

    move-result-object v2

    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    new-instance v0, Ljava/io/UnsupportedEncodingException;

    invoke-direct {v0}, Ljava/io/UnsupportedEncodingException;-><init>()V

    throw v0

    :cond_0
    const-string v0, "RSA/ECB/OAEPWITHSHA-1ANDMGF1PADDING"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v3

    const/4 v0, 0x1

    invoke-virtual {v3, v0, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    invoke-virtual {v3, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_6

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v2

    const-string v0, "Crypter"

    const-string v1, "rsaEncrypt(): UnsupportedEncodingException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lo/cjq$b;

    invoke-direct {v0}, Lo/cjq$b;-><init>()V

    throw v0

    :catch_1
    move-exception v2

    const-string v0, "Crypter"

    const-string v1, "rsaEncrypt(): NoSuchAlgorithmException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lo/cjq$b;

    invoke-direct {v0}, Lo/cjq$b;-><init>()V

    throw v0

    :catch_2
    move-exception v2

    const-string v0, "Crypter"

    const-string v1, "rsaEncrypt(): InvalidKeyException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lo/cjq$b;

    invoke-direct {v0}, Lo/cjq$b;-><init>()V

    throw v0

    :catch_3
    move-exception v2

    const-string v0, "Crypter"

    const-string v1, "rsaEncrypt(): NoSuchPaddingException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lo/cjq$b;

    invoke-direct {v0}, Lo/cjq$b;-><init>()V

    throw v0

    :catch_4
    move-exception v2

    const-string v0, "Crypter"

    const-string v1, "rsaEncrypt(): BadPaddingException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lo/cjq$b;

    invoke-direct {v0}, Lo/cjq$b;-><init>()V

    throw v0

    :catch_5
    move-exception v2

    const-string v0, "Crypter"

    const-string v1, "rsaEncrypt(): InvalidKeySpecException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lo/cjq$b;

    invoke-direct {v0}, Lo/cjq$b;-><init>()V

    throw v0

    :catch_6
    move-exception v2

    const-string v0, "Crypter"

    const-string v1, "rsaEncrypt(): IllegalBlockSizeException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lo/cjq$b;

    invoke-direct {v0}, Lo/cjq$b;-><init>()V

    throw v0
.end method

.method public static d(Ljava/lang/String;[BLjava/lang/String;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    array-length v0, p1

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    :cond_0
    const-string v0, ""

    return-object v0

    :cond_1
    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v2

    invoke-static {p0, p1, v2}, Lo/cjq;->a(Ljava/lang/String;[B[B)[B

    move-result-object v3

    invoke-static {v3}, Lo/cjr;->b([B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v2

    const-string v0, "Crypter"

    const-string v1, "aesEncrypt(): UnsupportedEncodingException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ""

    return-object v0
.end method

.method public static d(Ljava/lang/String;[B[B)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    array-length v0, p1

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    :cond_0
    const-string v0, ""

    return-object v0

    :cond_1
    invoke-static {p0, p1, p2}, Lo/cjq;->a(Ljava/lang/String;[B[B)[B

    move-result-object v2

    invoke-static {v2}, Lo/cjr;->b([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e(Ljava/lang/String;)Landroid/util/Pair;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Landroid/util/Pair<[BLjava/lang/String;>;"
        }
    .end annotation

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x20

    if-ge v0, v1, :cond_1

    :cond_0
    new-instance v0, Landroid/util/Pair;

    const/4 v1, 0x0

    new-array v1, v1, [B

    invoke-direct {v0, v1, p0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_1
    const/4 v0, 0x0

    const/16 v1, 0x20

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const/16 v0, 0x20

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    new-instance v0, Landroid/util/Pair;

    invoke-static {v2}, Lo/cjr;->e(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v0, v1, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static e(Ljava/lang/String;[BLjava/lang/String;)Ljava/lang/String;
    .locals 7

    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    array-length v0, p1

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    :cond_0
    const-string v0, ""

    return-object v0

    :cond_1
    const-string v0, "AES/CBC/PKCS5Padding"

    :try_start_0
    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v2

    invoke-static {p0}, Lo/cjr;->e(Ljava/lang/String;)[B

    move-result-object v3

    new-instance v4, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "AES"

    invoke-direct {v4, v3, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    new-instance v5, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v5, p1}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    const/4 v0, 0x2

    invoke-virtual {v2, v0, v4, v5}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    invoke-static {p2}, Lo/cjr;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v6

    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v6, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_6

    return-object v0

    :catch_0
    move-exception v2

    const-string v0, "Crypter"

    const-string v1, "aesDecrypt(): NoSuchAlgorithmException: fail to decrypt"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v2

    const-string v0, "Crypter"

    const-string v1, "aesDecrypt(): InvalidKeyException: fail to decrypt"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_2
    move-exception v2

    const-string v0, "Crypter"

    const-string v1, "aesDecrypt(): InvalidAlgorithmParameterException: fail to decrypt"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_3
    move-exception v2

    const-string v0, "Crypter"

    const-string v1, "aesDecrypt(): NoSuchPaddingException: fail to decrypt"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_4
    move-exception v2

    const-string v0, "Crypter"

    const-string v1, "aesDecrypt(): BadPaddingException: fail to decrypt"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_5
    move-exception v2

    const-string v0, "Crypter"

    const-string v1, "aesDecrypt(): UnsupportedEncodingException: fail to decrypt"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_6
    move-exception v2

    const-string v0, "Crypter"

    const-string v1, "aesDecrypt(): IllegalBlockSizeException: fail to decrypt"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    const-string v0, ""

    return-object v0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)Ljava/security/interfaces/RSAPublicKey;
    .locals 5

    new-instance v1, Ljava/math/BigInteger;

    invoke-direct {v1, p0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/math/BigInteger;

    invoke-direct {v2, p1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    const-string v0, "RSA"

    invoke-static {v0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v3

    new-instance v4, Ljava/security/spec/RSAPublicKeySpec;

    invoke-direct {v4, v1, v2}, Ljava/security/spec/RSAPublicKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v3, v4}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v0

    check-cast v0, Ljava/security/interfaces/RSAPublicKey;

    return-object v0
.end method
