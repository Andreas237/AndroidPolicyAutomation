.class public abstract Lcom/huawei/openalliance/ad/utils/y;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/utils/y$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/utils/y;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/utils/y;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    if-nez p0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    invoke-static {p0}, Lcom/huawei/openalliance/ad/utils/y$a;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/utils/y$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/utils/y$a;->a()Ljava/lang/String;

    move-result-object v3

    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    invoke-static {p0, v1}, Lcom/huawei/openalliance/ad/utils/y;->a(Landroid/content/Context;Lcom/huawei/openalliance/ad/utils/y$a;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    invoke-static {p0}, Lcom/huawei/openalliance/ad/utils/y;->c(Landroid/content/Context;)[B

    move-result-object v0

    invoke-static {v3, v0}, Lcom/huawei/openalliance/ad/utils/b;->b(Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p0, v1}, Lcom/huawei/openalliance/ad/utils/y;->a(Landroid/content/Context;Lcom/huawei/openalliance/ad/utils/y$a;)Ljava/lang/String;

    move-result-object v2

    :cond_2
    :goto_0
    return-object v2
.end method

.method private static a(Landroid/content/Context;Lcom/huawei/openalliance/ad/utils/y$a;)Ljava/lang/String;
    .locals 4

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/y;->c()[B

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/openalliance/ad/utils/l;->a([B)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lcom/huawei/openalliance/ad/utils/y;->c(Landroid/content/Context;)[B

    move-result-object v0

    invoke-static {v2, v0}, Lcom/huawei/openalliance/ad/utils/b;->a(Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/huawei/openalliance/ad/utils/y$a;->a(Ljava/lang/String;)V

    return-object v2
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 1

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const-string v0, "aNull"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "eNull"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "LOW"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "MD5"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "EXP"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SRP"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "DSS"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "PSK"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "RC4"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "DES"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static a()[B
    .locals 7

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/ad;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/y;->d()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/l;->a()Ljava/lang/String;

    move-result-object v4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/ad;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-static {v5}, Lcom/huawei/openalliance/ad/utils/l;->a(Ljava/lang/String;)[B

    move-result-object v6

    :cond_0
    return-object v6
.end method

.method public static a(I)[B
    .locals 2

    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    new-array v1, p0, [B

    invoke-virtual {v0, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    return-object v1
.end method

.method public static a([C[B)[B
    .locals 5

    new-instance v2, Ljavax/crypto/spec/PBEKeySpec;

    const/16 v0, 0x3e8

    const/16 v1, 0x100

    invoke-direct {v2, p0, p1, v0, v1}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C[BII)V

    const-string v0, "PBKDF2WithHmacSHA1"

    invoke-static {v0}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object v0

    invoke-interface {v0}, Ljavax/crypto/SecretKey;->getEncoded()[B

    move-result-object v4

    return-object v4
.end method

.method public static b()[B
    .locals 1

    const/16 v0, 0x8

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/y;->a(I)[B

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/content/Context;)[B
    .locals 1

    invoke-static {p0}, Lcom/huawei/openalliance/ad/utils/y;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/l;->a(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method public static c()[B
    .locals 1

    const/16 v0, 0x10

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/y;->a(I)[B

    move-result-object v0

    return-object v0
.end method

.method private static c(Landroid/content/Context;)[B
    .locals 7

    if-nez p0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    :cond_0
    invoke-static {p0}, Lcom/huawei/openalliance/ad/utils/y$a;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/utils/y$a;

    move-result-object v2

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/y;->a()[B

    move-result-object v3

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/utils/y$a;->b()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    :try_start_0
    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/l;->a([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/l;->a(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/y;->a([C[B)[B
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v5, v0

    goto :goto_0

    :catch_0
    move-exception v6

    sget-object v0, Lcom/huawei/openalliance/ad/utils/y;->a:Ljava/lang/String;

    const-string v1, "get userRootKey NoSuchAlgorithmException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v6

    sget-object v0, Lcom/huawei/openalliance/ad/utils/y;->a:Ljava/lang/String;

    const-string v1, "get userRootKey InvalidKeySpecException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object v5
.end method

.method private static d()Ljava/lang/String;
    .locals 1

    const-string v0, "dcc6873e13a"

    return-object v0
.end method
