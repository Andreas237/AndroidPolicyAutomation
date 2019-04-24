.class public abstract Lo/cjw;
.super Ljava/lang/Object;


# direct methods
.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    invoke-static {p0}, Lo/cjr;->e(Ljava/lang/String;)[B

    move-result-object v2

    invoke-static {p1}, Lo/cjr;->e(Ljava/lang/String;)[B

    move-result-object v3

    invoke-static {p2}, Lo/cjr;->e(Ljava/lang/String;)[B

    move-result-object v4

    invoke-static {p3}, Lo/cjr;->e(Ljava/lang/String;)[B

    move-result-object v5

    array-length v6, v2

    array-length v0, v3

    if-le v6, v0, :cond_0

    array-length v6, v3

    :cond_0
    array-length v0, v4

    if-le v6, v0, :cond_1

    array-length v6, v4

    :cond_1
    array-length v0, v5

    if-le v6, v0, :cond_2

    array-length v6, v5

    :cond_2
    new-array v7, v6, [C

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v6, :cond_3

    aget-byte v0, v2, v8

    aget-byte v1, v3, v8

    xor-int/2addr v0, v1

    aget-byte v1, v4, v8

    xor-int/2addr v0, v1

    aget-byte v1, v5, v8

    xor-int/2addr v0, v1

    int-to-char v0, v0

    aput-char v0, v7, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_3
    invoke-static {p4}, Lo/cjr;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v7, v0}, Lo/cjw;->c([C[B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static c()Ljava/lang/String;
    .locals 1

    const-string v0, "f6040d0e807aaec325ecf44823765544e92905158169f694b282bf17388632cf95a83bae7d2d235c1f039"

    return-object v0
.end method

.method static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const-string v3, ""

    const-string v0, "SHA-256"

    :try_start_0
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2

    const-string v0, "UTF-8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {v0}, Lo/cjr;->b([B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v3, v0

    goto :goto_0

    :catch_0
    move-exception v4

    const-string v0, "HiStringUtils"

    const-string v1, "getSHA256StrJava, getInstance Exception"

    invoke-static {v0, v1}, Lo/ciy;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v4

    const-string v0, "HiStringUtils"

    const-string v1, "getSHA256StrJava, update Exception "

    invoke-static {v0, v1}, Lo/ciy;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object v3
.end method

.method private static c([C[B)Ljava/lang/String;
    .locals 6

    const/16 v2, 0x2710

    :try_start_0
    new-instance v3, Ljavax/crypto/spec/PBEKeySpec;

    const/16 v0, 0x80

    invoke-direct {v3, p0, p1, v2, v0}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C[BII)V

    const-string v0, "PBKDF2WithHmacSHA1"

    invoke-static {v0}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object v0

    invoke-interface {v0}, Ljavax/crypto/SecretKey;->getEncoded()[B

    move-result-object v5

    invoke-static {v5}, Lo/cjr;->b([B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v2

    const-string v0, "HiAnalytics"

    const-string v1, "encryptPBKDF2 InvalidKeySpecException"

    invoke-static {v0, v1}, Lo/ciy;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v2

    const-string v0, "HiAnalytics"

    const-string v1, "encryptPBKDF2 NoSuchAlgorithmException"

    invoke-static {v0, v1}, Lo/ciy;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static d(Ljava/lang/String;I)Ljava/lang/String;
    .locals 5

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-gt v0, p1, :cond_1

    :cond_0
    return-object p0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, p1, :cond_2

    add-int/lit8 v0, v3, -0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    add-int/lit8 v1, v3, -0x1

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object p0, v2

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    return-object p0
.end method
