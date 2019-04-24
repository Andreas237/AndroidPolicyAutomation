.class public Lcom/huawei/hihealthservice/old/util/RootKeyUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final COMPONENT_SIZE:I = 0x10

.field public static final PBKDF2_ALGORITHM:Ljava/lang/String; = "PBKDF2WithHmacSHA1"

.field public static final PBKDF2_ITER_COUNT:I = 0x1388


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static genRandBytes(I)[B
    .locals 2

    .line 120
    new-array v0, p0, [B

    .line 121
    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    .line 122
    invoke-virtual {v1, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 123
    return-object v0
.end method

.method public static genRootKey([Ljava/lang/String;)[B
    .locals 6

    .line 83
    const/16 v0, 0x10

    new-array v2, v0, [B

    .line 84
    const/4 v3, 0x0

    .line 85
    const/4 v4, 0x0

    :goto_0
    array-length v0, p0

    if-ge v4, v0, :cond_1

    .line 87
    aget-object v0, p0, v4

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/util/HEX;->decode(Ljava/lang/String;)[B

    move-result-object v3

    .line 88
    const/4 v5, 0x0

    :goto_1
    const/16 v0, 0x10

    if-ge v5, v0, :cond_0

    .line 90
    aget-byte v0, v2, v5

    aget-byte v1, v3, v5

    xor-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, v2, v5

    .line 88
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 85
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 93
    :cond_1
    return-object v2
.end method

.method public static sha256(Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;
        }
    .end annotation

    .line 101
    const/4 v0, 0x0

    new-array v4, v0, [B

    .line 103
    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 106
    goto :goto_0

    .line 104
    :catch_0
    move-exception v5

    .line 105
    const-string v0, "RootKeyUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sha256 e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    :goto_0
    const-string v0, "SHA-256"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v5

    .line 108
    invoke-virtual {v5, v4}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hihealthservice/old/util/HEX;->encode([BI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
