.class final Lo/ayq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lo/ayq;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 39
    new-instance v0, Lo/ayq;

    invoke-direct {v0}, Lo/ayq;-><init>()V

    sput-object v0, Lo/ayq;->a:Lo/ayq;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    return-void
.end method

.method private static a([C[B)[B
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/spec/InvalidKeySpecException;
        }
    .end annotation

    .line 113
    new-instance v2, Ljavax/crypto/spec/PBEKeySpec;

    const v0, 0xc350

    const/16 v1, 0x100

    invoke-direct {v2, p0, p1, v0, v1}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C[BII)V

    .line 114
    const-string v0, "PBKDF2WithHmacSHA1"

    invoke-static {v0}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v3

    .line 115
    invoke-virtual {v3, v2}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object v0

    invoke-interface {v0}, Ljavax/crypto/SecretKey;->getEncoded()[B

    move-result-object v0

    return-object v0
.end method

.method public static b()[B
    .locals 4

    .line 57
    const/4 v2, 0x0

    .line 59
    const-string v0, "SHA1PRNG"

    :try_start_0
    invoke-static {v0}, Ljava/security/SecureRandom;->getInstance(Ljava/lang/String;)Ljava/security/SecureRandom;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 63
    goto :goto_0

    .line 60
    :catch_0
    move-exception v3

    .line 61
    const-string v0, "SecurityEncrypt"

    const-string v1, "getSaltByte NoSuchAlgorithmException "

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    new-instance v2, Ljava/security/SecureRandom;

    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    .line 64
    :goto_0
    const/16 v0, 0x8

    new-array v3, v0, [B

    .line 65
    invoke-virtual {v2, v3}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 66
    return-object v3
.end method

.method public static c()[B
    .locals 3

    .line 71
    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    .line 72
    const/16 v0, 0x10

    new-array v2, v0, [B

    .line 73
    invoke-virtual {v1, v2}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 74
    return-object v2
.end method

.method private static d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .line 125
    const-string v0, "UTF-8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v2

    .line 126
    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v3

    .line 128
    array-length v0, v2

    array-length v1, v3

    if-lt v0, v1, :cond_0

    .line 129
    move-object v4, v2

    .line 130
    move-object v5, v3

    goto :goto_0

    .line 132
    :cond_0
    move-object v4, v3

    .line 133
    move-object v5, v2

    .line 135
    :goto_0
    array-length v0, v4

    new-array v6, v0, [B

    .line 136
    const/4 v7, 0x0

    .line 137
    :goto_1
    array-length v0, v5

    if-ge v7, v0, :cond_1

    .line 138
    aget-byte v0, v5, v7

    aget-byte v1, v4, v7

    xor-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, v6, v7

    .line 137
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 140
    :cond_1
    :goto_2
    array-length v0, v4

    if-ge v7, v0, :cond_2

    .line 141
    aget-byte v0, v4, v7

    aput-byte v0, v6, v7

    .line 140
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 143
    :cond_2
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v6, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    return-object v0
.end method

.method public static d()Lo/ayq;
    .locals 1

    .line 47
    sget-object v0, Lo/ayq;->a:Lo/ayq;

    return-object v0
.end method

.method public static e(Landroid/content/Context;)[B
    .locals 7

    .line 83
    const/4 v0, 0x0

    new-array v2, v0, [B

    .line 85
    const-string v0, "F*v5%"

    const-string v1, "8Ma*3"

    :try_start_0
    invoke-static {v0, v1}, Lo/ayq;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 86
    const-string v0, "X2%ua"

    invoke-static {v3, v0}, Lo/ayq;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 87
    invoke-static {p0}, Lo/ayl;->e(Landroid/content/Context;)Lo/ayl;

    move-result-object v0

    invoke-virtual {v0}, Lo/ayl;->e()Ljava/lang/String;

    move-result-object v5

    .line 88
    if-eqz v5, :cond_0

    .line 89
    invoke-static {v5}, Lo/ayk;->b(Ljava/lang/String;)[B

    move-result-object v6

    .line 90
    invoke-virtual {v4}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    invoke-static {v0, v6}, Lo/ayq;->a([C[B)[B
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v0

    move-object v2, v0

    .line 98
    :cond_0
    goto :goto_0

    .line 92
    :catch_0
    move-exception v3

    .line 93
    const-string v0, "SecurityEncrypt"

    const-string v1, "getKeySeed NoSuchAlgorithmException "

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    goto :goto_0

    .line 94
    :catch_1
    move-exception v3

    .line 95
    const-string v0, "SecurityEncrypt"

    const-string v1, "getKeySeed InvalidKeySpecException "

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    goto :goto_0

    .line 96
    :catch_2
    move-exception v3

    .line 97
    const-string v0, "SecurityEncrypt"

    const-string v1, "getKeySeed UnsupportedEncodingException "

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    :goto_0
    return-object v2
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 154
    move-object v2, p2

    .line 157
    :try_start_0
    invoke-static {p1}, Lo/ayl;->e(Landroid/content/Context;)Lo/ayl;

    move-result-object v0

    invoke-virtual {v0}, Lo/ayl;->b()Ljava/lang/String;

    move-result-object v3

    .line 158
    if-eqz v3, :cond_0

    .line 159
    const-string v0, "UTF-8"

    invoke-virtual {v3, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {p3}, Lo/ayk;->b(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {p2, v0, v1}, Lo/ayn;->a(Ljava/lang/String;[B[B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v2, v0

    .line 167
    :cond_0
    goto :goto_0

    .line 161
    :catch_0
    move-exception v3

    .line 162
    const-string v0, "SecurityEncrypt"

    const-string v1, "encrypt failed."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    const-string v0, "SecurityEncrypt encrypt meet GeneralSecurityException."

    invoke-static {v0}, Lo/bpj;->b(Ljava/lang/String;)V

    .line 167
    goto :goto_0

    .line 164
    :catch_1
    move-exception v3

    .line 165
    const-string v0, "SecurityEncrypt"

    const-string v1, "encrypt failed."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    const-string v0, "SecurityEncrypt encrypt meet UnsupportedEncodingException."

    invoke-static {v0}, Lo/bpj;->b(Ljava/lang/String;)V

    .line 168
    :goto_0
    return-object v2
.end method

.method public d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 179
    move-object v2, p2

    .line 182
    :try_start_0
    invoke-static {p1}, Lo/ayl;->e(Landroid/content/Context;)Lo/ayl;

    move-result-object v0

    invoke-virtual {v0}, Lo/ayl;->b()Ljava/lang/String;

    move-result-object v3

    .line 183
    if-eqz v3, :cond_0

    .line 184
    const-string v0, "UTF-8"

    invoke-virtual {v3, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {p3}, Lo/ayk;->b(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v2, v0, v1}, Lo/ayn;->e(Ljava/lang/String;[B[B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 191
    :cond_0
    goto :goto_0

    .line 187
    :catch_0
    move-exception v3

    .line 189
    const-string v0, "SecurityEncrypt decrypt meet UnsupportedEncodingException."

    invoke-static {v0}, Lo/bpj;->b(Ljava/lang/String;)V

    .line 190
    const-string v0, "SecurityEncrypt"

    const-string v1, "decrypt failed."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    :goto_0
    return-object v2
.end method
