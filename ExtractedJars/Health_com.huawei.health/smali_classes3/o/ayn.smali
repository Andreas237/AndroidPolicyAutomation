.class abstract Lo/ayn;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 19
    const-string v0, "AESUtil"

    sput-object v0, Lo/ayn;->e:Ljava/lang/String;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;[B[B)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;,
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .line 52
    if-nez p1, :cond_0

    .line 54
    const/4 v0, 0x0

    return-object v0

    .line 57
    :cond_0
    array-length v0, p1

    const/16 v1, 0x10

    if-ge v0, v1, :cond_1

    .line 59
    const/4 v0, 0x0

    return-object v0

    .line 62
    :cond_1
    array-length v0, p1

    const/16 v1, 0x10

    if-le v0, v1, :cond_2

    .line 64
    const/16 v0, 0x10

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    .line 67
    :cond_2
    const/4 v0, 0x1

    invoke-static {v0, p1, p2}, Lo/ayn;->a(I[B[B)Ljavax/crypto/Cipher;

    move-result-object v3

    .line 69
    const-string v0, "UTF-8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v3, v0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v4

    .line 70
    invoke-static {v4}, Lo/ayk;->e([B)Ljava/lang/String;

    move-result-object v5

    .line 72
    const-string v0, "\n"

    const-string v1, ""

    invoke-virtual {v5, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\r"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static a(I[B[B)Ljavax/crypto/Cipher;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 29
    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "AES"

    invoke-direct {v1, p1, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 31
    const-string v0, "AES/CBC/PKCS5Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v2

    .line 32
    new-instance v3, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v3, p2}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 33
    invoke-virtual {v2, p0, v1, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 35
    return-object v2
.end method

.method public static e(Ljava/lang/String;[B[B)Ljava/lang/String;
    .locals 6

    .line 84
    if-nez p1, :cond_0

    .line 86
    const/4 v0, 0x0

    return-object v0

    .line 89
    :cond_0
    array-length v0, p1

    const/16 v1, 0x10

    if-ge v0, v1, :cond_1

    .line 91
    const/4 v0, 0x0

    return-object v0

    .line 95
    :cond_1
    :try_start_0
    array-length v0, p1

    const/16 v1, 0x10

    if-le v0, v1, :cond_2

    .line 97
    const/16 v0, 0x10

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    .line 99
    :cond_2
    const/4 v0, 0x2

    invoke-static {v0, p1, p2}, Lo/ayn;->a(I[B[B)Ljavax/crypto/Cipher;

    move-result-object v2

    .line 100
    invoke-static {p0}, Lo/ayk;->b(Ljava/lang/String;)[B

    move-result-object v3

    .line 101
    invoke-virtual {v2, v3}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v4

    .line 102
    new-instance v5, Ljava/lang/String;

    const-string v0, "UTF-8"

    invoke-direct {v5, v4, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_2

    .line 103
    return-object v5

    .line 104
    :catch_0
    move-exception v2

    .line 105
    const-string v0, "AESUtil AESBaseDecrypt meet BadPaddingException."

    invoke-static {v0}, Lo/bpj;->b(Ljava/lang/String;)V

    .line 106
    sget-object v0, Lo/ayn;->e:Ljava/lang/String;

    const-string v1, "AESBaseDecrypt error"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    goto :goto_0

    .line 107
    :catch_1
    move-exception v2

    .line 108
    const-string v0, "AESUtil AESBaseDecrypt meet GeneralSecurityException."

    invoke-static {v0}, Lo/bpj;->b(Ljava/lang/String;)V

    .line 109
    sget-object v0, Lo/ayn;->e:Ljava/lang/String;

    const-string v1, "AESBaseDecrypt error"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    goto :goto_0

    .line 110
    :catch_2
    move-exception v2

    .line 111
    const-string v0, "AESUtil AESBaseDecrypt meet UnsupportedEncodingException."

    invoke-static {v0}, Lo/bpj;->b(Ljava/lang/String;)V

    .line 112
    sget-object v0, Lo/ayn;->e:Ljava/lang/String;

    const-string v1, "AESBaseDecrypt error"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
