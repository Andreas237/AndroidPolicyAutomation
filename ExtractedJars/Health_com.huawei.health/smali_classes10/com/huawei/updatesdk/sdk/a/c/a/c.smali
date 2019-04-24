.class public Lcom/huawei/updatesdk/sdk/a/c/a/c;
.super Ljava/lang/Object;


# direct methods
.method public static a()I
    .locals 2

    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v1}, Ljava/security/SecureRandom;->nextInt()I

    move-result v0

    return v0
.end method

.method public static a([C[B)[B
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/spec/InvalidKeySpecException;
        }
    .end annotation

    const/16 v1, 0x1388

    new-instance v2, Ljavax/crypto/spec/PBEKeySpec;

    const/16 v0, 0x100

    invoke-direct {v2, p0, p1, v1, v0}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C[BII)V

    const-string v0, "PBKDF2WithHmacSHA1"

    invoke-static {v0}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object v0

    invoke-interface {v0}, Ljavax/crypto/SecretKey;->getEncoded()[B

    move-result-object v4

    return-object v4
.end method

.method public static b()Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/huawei/updatesdk/sdk/a/c/a/c;->c()[B

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/updatesdk/sdk/a/c/b;->a([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
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

.method public static d()[B
    .locals 3

    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    const/16 v0, 0x8

    new-array v2, v0, [B

    invoke-virtual {v1, v2}, Ljava/security/SecureRandom;->nextBytes([B)V

    return-object v2
.end method
