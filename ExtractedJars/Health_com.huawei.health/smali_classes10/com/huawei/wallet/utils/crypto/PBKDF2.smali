.class public Lcom/huawei/wallet/utils/crypto/PBKDF2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/wallet/utils/crypto/PBKDF2$PBKDF2Sai4;,
        Lcom/huawei/wallet/utils/crypto/PBKDF2$PBKDF2Sai3;,
        Lcom/huawei/wallet/utils/crypto/PBKDF2$PBKDF2Sai2;,
        Lcom/huawei/wallet/utils/crypto/PBKDF2$PBKDF2Sai1;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/spec/InvalidKeySpecException;
        }
    .end annotation

    .line 24
    const-string v0, "PBKDF2"

    const-string v1, "enter validatePassword"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    invoke-static {v0, p1}, Lcom/huawei/wallet/utils/crypto/PBKDF2;->b([CLjava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private static b([B[B)Z
    .locals 4

    .line 65
    const-string v0, "PBKDF2"

    const-string v1, "enter slowEquals"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    array-length v0, p0

    array-length v1, p1

    xor-int v2, v0, v1

    .line 67
    const/4 v3, 0x0

    :goto_0
    array-length v0, p0

    if-ge v3, v0, :cond_0

    array-length v0, p1

    if-ge v3, v0, :cond_0

    .line 69
    aget-byte v0, p0, v3

    aget-byte v1, p1, v3

    xor-int/2addr v0, v1

    or-int/2addr v2, v0

    .line 67
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 71
    :cond_0
    const-string v0, "PBKDF2"

    const-string v1, "exit slowEquals"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    if-nez v2, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public static b([CLjava/lang/String;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/spec/InvalidKeySpecException;
        }
    .end annotation

    .line 31
    const-string v0, "PBKDF2"

    const-string v1, "enter validate_Password_boolean"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    const-string v0, ":"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 33
    const/4 v0, 0x0

    aget-object v0, v2, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    .line 34
    const/4 v0, 0x1

    aget-object v0, v2, v0

    invoke-static {v0}, Lcom/huawei/wallet/utils/crypto/PBKDF2;->d(Ljava/lang/String;)[B

    move-result-object v4

    .line 35
    const/4 v0, 0x2

    aget-object v0, v2, v0

    invoke-static {v0}, Lcom/huawei/wallet/utils/crypto/PBKDF2;->d(Ljava/lang/String;)[B

    move-result-object v5

    .line 36
    const-string v0, "PBKDF2"

    const-string v1, "midle"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    array-length v0, v5

    invoke-static {p0, v4, v3, v0}, Lcom/huawei/wallet/utils/crypto/PBKDF2;->e([C[BII)[B

    move-result-object v6

    .line 38
    const-string v0, "PBKDF2"

    const-string v1, "exit validate_Password_boolean"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    invoke-static {v5, v6}, Lcom/huawei/wallet/utils/crypto/PBKDF2;->b([B[B)Z

    move-result v0

    return v0
.end method

.method private static d(Ljava/lang/String;)[B
    .locals 5

    .line 51
    const-string v0, "PBKDF2"

    const-string v1, "enter formHex"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    new-array v3, v0, [B

    .line 53
    const-string v0, "PBKDF2"

    const-string v1, "arrag"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    const/4 v4, 0x0

    :goto_0
    array-length v0, v3

    if-ge v4, v0, :cond_0

    .line 56
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

    .line 54
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 58
    :cond_0
    const-string v0, "PBKDF2"

    const-string v1, "exit formHex"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    return-object v3
.end method

.method private static e([C[BII)[B
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/spec/InvalidKeySpecException;
        }
    .end annotation

    .line 88
    const-string v0, "PBKDF2"

    const-string v1, "enter pbkdf2Byte"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 89
    new-instance v2, Ljavax/crypto/spec/PBEKeySpec;

    mul-int/lit8 v0, p3, 0x8

    invoke-direct {v2, p0, p1, p2, v0}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C[BII)V

    .line 90
    const-string v0, "PBKDF2WithHmacSHA1"

    invoke-static {v0}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v3

    .line 91
    const-string v0, "PBKDF2"

    const-string v1, "exit pbkdf2Byte"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 92
    invoke-virtual {v3, v2}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object v0

    invoke-interface {v0}, Ljavax/crypto/SecretKey;->getEncoded()[B

    move-result-object v0

    return-object v0
.end method
