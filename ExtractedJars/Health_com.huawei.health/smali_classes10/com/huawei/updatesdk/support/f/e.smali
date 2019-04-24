.class public final Lcom/huawei/updatesdk/support/f/e;
.super Ljava/lang/Object;


# static fields
.field private static a:Lcom/huawei/updatesdk/support/f/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/huawei/updatesdk/support/f/e;

    invoke-direct {v0}, Lcom/huawei/updatesdk/support/f/e;-><init>()V

    sput-object v0, Lcom/huawei/updatesdk/support/f/e;->a:Lcom/huawei/updatesdk/support/f/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/huawei/updatesdk/support/f/e;
    .locals 1

    sget-object v0, Lcom/huawei/updatesdk/support/f/e;->a:Lcom/huawei/updatesdk/support/f/e;

    return-object v0
.end method

.method public static b()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "TrulyRandom"
        }
    .end annotation

    invoke-static {}, Lcom/huawei/updatesdk/sdk/a/c/a/c;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    const-string v0, "UTF-8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v2

    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v3

    array-length v0, v2

    array-length v1, v3

    if-lt v0, v1, :cond_0

    move-object v4, v2

    move-object v5, v3

    goto :goto_0

    :cond_0
    move-object v4, v3

    move-object v5, v2

    :goto_0
    array-length v0, v4

    new-array v6, v0, [B

    const/4 v7, 0x0

    :goto_1
    array-length v0, v5

    if-ge v7, v0, :cond_1

    aget-byte v0, v5, v7

    aget-byte v1, v4, v7

    xor-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    array-length v0, v4

    if-ge v7, v0, :cond_2

    aget-byte v0, v4, v7

    aput-byte v0, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_2
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v6, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    return-object v0
.end method

.method public static c()[B
    .locals 4

    const/4 v2, 0x0

    const-string v0, "SHA1PRNG"

    :try_start_0
    invoke-static {v0}, Ljava/security/SecureRandom;->getInstance(Ljava/lang/String;)Ljava/security/SecureRandom;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "SecurityEncrypt"

    const-string v1, "getSaltByte NoSuchAlgorithmException "

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/updatesdk/sdk/a/c/a/c;->d()[B

    move-result-object v0

    return-object v0

    :goto_0
    const/16 v0, 0x8

    new-array v3, v0, [B

    invoke-virtual {v2, v3}, Ljava/security/SecureRandom;->nextBytes([B)V

    return-object v3
.end method

.method public static d()[B
    .locals 1

    invoke-static {}, Lcom/huawei/updatesdk/sdk/a/c/a/c;->c()[B

    move-result-object v0

    return-object v0
.end method

.method public static e()[B
    .locals 4

    :try_start_0
    invoke-static {}, Lcom/huawei/updatesdk/support/f/e;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v3

    const-string v0, "SecurityEncrypt"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getKeySeedBytes error:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/io/UnsupportedEncodingException;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method private static f()Ljava/lang/String;
    .locals 7

    const-string v2, ""

    const-string v0, "Ds4*%"

    const-string v1, "3Lj*8"

    :try_start_0
    invoke-static {v0, v1}, Lcom/huawei/updatesdk/support/f/e;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v0, "#dM^%9"

    invoke-static {v3, v0}, Lcom/huawei/updatesdk/support/f/e;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/huawei/updatesdk/service/a/b;->a()Lcom/huawei/updatesdk/service/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/updatesdk/service/a/b;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/updatesdk/sdk/a/c/a;->a(Ljava/lang/String;)[B

    move-result-object v5

    invoke-virtual {v4}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    invoke-static {v0, v5}, Lcom/huawei/updatesdk/sdk/a/c/a/c;->a([C[B)[B

    move-result-object v6

    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v6, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_2

    move-object v2, v0

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "SecurityEncrypt"

    const-string v1, "getKeySeed NoSuchAlgorithmException "

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v3

    const-string v0, "SecurityEncrypt"

    const-string v1, "getKeySeed InvalidKeySpecException "

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_2
    move-exception v3

    const-string v0, "SecurityEncrypt"

    const-string v1, "getKeySeed UnsupportedEncodingException "

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object v2
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    move-object v2, p1

    :try_start_0
    invoke-static {}, Lcom/huawei/updatesdk/service/a/b;->a()Lcom/huawei/updatesdk/service/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/updatesdk/service/a/b;->m()Ljava/lang/String;

    move-result-object v3

    const-string v0, "UTF-8"

    invoke-virtual {v3, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {p2}, Lcom/huawei/updatesdk/sdk/a/c/a;->a(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/huawei/updatesdk/sdk/a/c/a/a;->a(Ljava/lang/String;[B[B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "SecurityEncrypt"

    const-string v1, "encrypt failed."

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object v2
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    move-object v2, p1

    :try_start_0
    invoke-static {}, Lcom/huawei/updatesdk/service/a/b;->a()Lcom/huawei/updatesdk/service/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/updatesdk/service/a/b;->m()Ljava/lang/String;

    move-result-object v3

    const-string v0, "UTF-8"

    invoke-virtual {v3, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {p2}, Lcom/huawei/updatesdk/sdk/a/c/a;->a(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v2, v0, v1}, Lcom/huawei/updatesdk/sdk/a/c/a/a;->b(Ljava/lang/String;[B[B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "SecurityEncrypt"

    const-string v1, "decrypt failed."

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object v2
.end method
