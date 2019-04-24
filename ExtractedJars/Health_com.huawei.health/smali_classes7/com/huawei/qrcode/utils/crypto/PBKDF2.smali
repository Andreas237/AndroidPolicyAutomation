.class public Lcom/huawei/qrcode/utils/crypto/PBKDF2;
.super Ljava/lang/Object;


# static fields
.field public static final HASH_BYTE_SIZE:I = 0x18

.field public static final ITERATION_INDEX:I = 0x0

.field public static final PBKDF2_ALGORITHM:Ljava/lang/String; = "PBKDF2WithHmacSHA1"

.field public static final PBKDF2_INDEX:I = 0x2

.field public static final PBKDF2_ITERATIONS:I = 0x3e8

.field public static final SALT_BYTE_SIZE:I = 0x18

.field public static final SALT_INDEX:I = 0x1


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static createHash(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/spec/InvalidKeySpecException;
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/qrcode/utils/crypto/PBKDF2;->createHash([C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static createHash([C)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/spec/InvalidKeySpecException;
        }
    .end annotation

    new-instance v2, Ljava/security/SecureRandom;

    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    const/16 v0, 0x18

    new-array v3, v0, [B

    invoke-virtual {v2, v3}, Ljava/security/SecureRandom;->nextBytes([B)V

    const/16 v0, 0x3e8

    const/16 v1, 0x18

    invoke-static {p0, v3, v0, v1}, Lcom/huawei/qrcode/utils/crypto/PBKDF2;->pbkdf2([C[BII)[B

    move-result-object v4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "1000:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v3}, Lcom/huawei/qrcode/utils/crypto/PBKDF2;->toHex([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/qrcode/utils/crypto/PBKDF2;->toHex([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static fromHex(Ljava/lang/String;)[B
    .locals 5

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    new-array v3, v0, [B

    const/4 v4, 0x0

    :goto_0
    array-length v0, v3

    if-ge v4, v0, :cond_0

    mul-int/lit8 v0, v4, 0x2

    mul-int/lit8 v1, v4, 0x2

    add-int/lit8 v1, v1, 0x2

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    int-to-byte v0, v0

    aput-byte v0, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    return-object v3
.end method

.method private static pbkdf2([C[BII)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/spec/InvalidKeySpecException;
        }
    .end annotation

    new-instance v1, Ljavax/crypto/spec/PBEKeySpec;

    mul-int/lit8 v0, p3, 0x8

    invoke-direct {v1, p0, p1, p2, v0}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C[BII)V

    const-string v0, "PBKDF2WithHmacSHA1"

    invoke-static {v0}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object v0

    invoke-interface {v0}, Ljavax/crypto/SecretKey;->getEncoded()[B

    move-result-object v0

    return-object v0
.end method

.method private static slowEquals([B[B)Z
    .locals 4

    array-length v0, p0

    array-length v1, p1

    xor-int v2, v0, v1

    const/4 v3, 0x0

    :goto_0
    array-length v0, p0

    if-ge v3, v0, :cond_0

    array-length v0, p1

    if-ge v3, v0, :cond_0

    aget-byte v0, p0, v3

    aget-byte v1, p1, v3

    xor-int/2addr v0, v1

    or-int/2addr v2, v0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    if-nez v2, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method private static toHex([B)Ljava/lang/String;
    .locals 8

    new-instance v5, Ljava/math/BigInteger;

    const/4 v0, 0x1

    invoke-direct {v5, v0, p0}, Ljava/math/BigInteger;-><init>(I[B)V

    const/16 v0, 0x10

    invoke-virtual {v5, v0}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v6

    array-length v0, p0

    mul-int/lit8 v0, v0, 0x2

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v1

    sub-int v7, v0, v1

    if-lez v7, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "%0"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "d"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    return-object v6
.end method

.method public static validatePassword(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/spec/InvalidKeySpecException;
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    invoke-static {v0, p1}, Lcom/huawei/qrcode/utils/crypto/PBKDF2;->validatePassword([CLjava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static validatePassword([CLjava/lang/String;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/spec/InvalidKeySpecException;
        }
    .end annotation

    const-string v0, ":"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v0, 0x0

    aget-object v0, v1, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    const/4 v0, 0x1

    aget-object v0, v1, v0

    invoke-static {v0}, Lcom/huawei/qrcode/utils/crypto/PBKDF2;->fromHex(Ljava/lang/String;)[B

    move-result-object v3

    const/4 v0, 0x2

    aget-object v0, v1, v0

    invoke-static {v0}, Lcom/huawei/qrcode/utils/crypto/PBKDF2;->fromHex(Ljava/lang/String;)[B

    move-result-object v4

    array-length v0, v4

    invoke-static {p0, v3, v2, v0}, Lcom/huawei/qrcode/utils/crypto/PBKDF2;->pbkdf2([C[BII)[B

    move-result-object v5

    invoke-static {v4, v5}, Lcom/huawei/qrcode/utils/crypto/PBKDF2;->slowEquals([B[B)Z

    move-result v0

    return v0
.end method
