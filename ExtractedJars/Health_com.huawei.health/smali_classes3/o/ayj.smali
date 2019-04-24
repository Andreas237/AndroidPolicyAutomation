.class public Lo/ayj;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ayr;
        }
    .end annotation

    .line 76
    invoke-static {p1}, Lo/aym;->c(Ljava/lang/String;)[B

    move-result-object v2

    .line 77
    array-length v0, v2

    const/16 v1, 0x10

    if-gt v0, v1, :cond_0

    .line 79
    const-string v0, "KeyStoreEncryptAndDecrypt"

    const-string v1, "Decrypt source data is invalid."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    new-instance v0, Lo/ayr;

    const-string v1, "Android6.0 KeyStore Decrypt source data is invalid."

    invoke-direct {v0, v1}, Lo/ayr;-><init>(Ljava/lang/String;)V

    throw v0

    .line 86
    :cond_0
    :try_start_0
    invoke-static {p0}, Lo/ayj;->b(Ljava/lang/String;)Ljavax/crypto/SecretKey;

    move-result-object v4

    .line 87
    const/16 v0, 0x10

    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v5

    .line 88
    const-string v0, "AES/CBC/PKCS7Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v6

    .line 89
    new-instance v0, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v0, v5}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    const/4 v1, 0x2

    invoke-virtual {v6, v1, v4, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 90
    array-length v0, v2

    add-int/lit8 v0, v0, -0x10

    const/16 v1, 0x10

    invoke-virtual {v6, v2, v1, v0}, Ljavax/crypto/Cipher;->doFinal([BII)[B
    :try_end_0
    .catch Lo/ayr; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v3

    .line 100
    goto :goto_0

    .line 92
    :catch_0
    move-exception v4

    .line 94
    throw v4

    .line 96
    :catch_1
    move-exception v4

    .line 98
    const-string v0, "KeyStoreEncryptAndDecrypt"

    const-string v1, "Decrypt exception"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    new-instance v0, Lo/ayr;

    const-string v1, "Android6.0 KeyStore Decrypt Exception."

    invoke-direct {v0, v1}, Lo/ayr;-><init>(Ljava/lang/String;)V

    throw v0

    .line 103
    :goto_0
    :try_start_1
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v3, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_2

    return-object v0

    .line 105
    :catch_2
    move-exception v4

    .line 107
    const-string v0, "KeyStoreEncryptAndDecrypt"

    const-string v1, "unreachable UnsupportedEncodingException"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    new-instance v0, Lo/ayr;

    const-string v1, "Android6.0 KeyStore Decrypt result to utf-8 String meet exception."

    invoke-direct {v0, v1}, Lo/ayr;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static b(Ljava/lang/String;)Ljavax/crypto/SecretKey;
    .locals 8
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ayr;
        }
    .end annotation

    .line 115
    const/4 v4, 0x0

    .line 118
    const-string v0, "AndroidKeyStore"

    :try_start_0
    invoke-static {v0}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v5

    .line 119
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/security/KeyStore;->load(Ljava/security/KeyStore$LoadStoreParameter;)V

    .line 120
    const/4 v0, 0x0

    invoke-virtual {v5, p0, v0}, Ljava/security/KeyStore;->getKey(Ljava/lang/String;[C)Ljava/security/Key;

    move-result-object v6

    .line 121
    if-eqz v6, :cond_0

    instance-of v0, v6, Ljavax/crypto/SecretKey;

    if-eqz v0, :cond_0

    .line 123
    move-object v4, v6

    check-cast v4, Ljavax/crypto/SecretKey;

    goto :goto_0

    .line 127
    :cond_0
    const-string v0, "AES"

    const-string v1, "AndroidKeyStore"

    invoke-static {v0, v1}, Ljavax/crypto/KeyGenerator;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/KeyGenerator;

    move-result-object v7

    .line 129
    new-instance v0, Landroid/security/keystore/KeyGenParameterSpec$Builder;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;-><init>(Ljava/lang/String;I)V

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "CBC"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 131
    invoke-virtual {v0, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setBlockModes([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "PKCS7Padding"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 132
    invoke-virtual {v0, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setEncryptionPaddings([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v0

    .line 133
    const/16 v1, 0x100

    invoke-virtual {v0, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setKeySize(I)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v0

    .line 134
    invoke-virtual {v0}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->build()Landroid/security/keystore/KeyGenParameterSpec;

    move-result-object v0

    .line 129
    invoke-virtual {v7, v0}, Ljavax/crypto/KeyGenerator;->init(Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 135
    invoke-virtual {v7}, Ljavax/crypto/KeyGenerator;->generateKey()Ljavax/crypto/SecretKey;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    .line 142
    :goto_0
    goto :goto_1

    .line 138
    :catch_0
    move-exception v5

    .line 140
    const-string v0, "KeyStoreEncryptAndDecrypt"

    const-string v1, "Generate key exception "

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    new-instance v0, Lo/ayr;

    const-string v1, "Android6.0 KeyStore Generate key exception."

    invoke-direct {v0, v1}, Lo/ayr;-><init>(Ljava/lang/String;)V

    throw v0

    .line 143
    :goto_1
    return-object v4
.end method
