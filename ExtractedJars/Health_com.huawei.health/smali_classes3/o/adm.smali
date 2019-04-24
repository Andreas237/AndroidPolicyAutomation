.class public Lo/adm;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:[B

.field private static final c:[B


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 22
    const/16 v0, 0x10

    new-array v0, v0, [B

    sput-object v0, Lo/adm;->b:[B

    .line 24
    const/16 v0, 0x10

    new-array v0, v0, [B

    sput-object v0, Lo/adm;->c:[B

    .line 27
    const-string v3, "3d a2 78 4a fb 87 b1 2a 98 0f de 34 56 73 21 56"

    .line 28
    const-string v4, "4e f7 64 32 2f da 76 32 12 3d eb 87 90 fe a2 19"

    .line 30
    const-string v0, " "

    invoke-virtual {v3, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 31
    const-string v0, " "

    invoke-virtual {v4, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 33
    const/4 v7, 0x0

    :goto_0
    const/16 v0, 0x10

    if-ge v7, v0, :cond_0

    .line 34
    sget-object v0, Lo/adm;->b:[B

    aget-object v1, v5, v7

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    int-to-byte v1, v1

    aput-byte v1, v0, v7

    .line 35
    sget-object v0, Lo/adm;->c:[B

    aget-object v1, v6, v7

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    int-to-byte v1, v1

    aput-byte v1, v0, v7

    .line 33
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 37
    :cond_0
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([B)V
    .locals 3

    .line 43
    const/4 v2, 0x0

    :goto_0
    array-length v0, p0

    if-ge v2, v0, :cond_0

    .line 44
    sget-object v0, Lo/adm;->b:[B

    aget-byte v1, p0, v2

    aput-byte v1, v0, v2

    .line 43
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 47
    :cond_0
    return-void
.end method

.method public static c([B)[B
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 57
    const-string v0, "AES/CTR/PKCS7Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v1

    .line 58
    sget-object v2, Lo/adm;->b:[B

    .line 59
    new-instance v3, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "AES"

    invoke-direct {v3, v2, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 60
    new-instance v4, Ljavax/crypto/spec/IvParameterSpec;

    sget-object v0, Lo/adm;->c:[B

    invoke-direct {v4, v0}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 61
    const/4 v0, 0x1

    invoke-virtual {v1, v0, v3, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 62
    invoke-virtual {v1, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v5

    .line 63
    return-object v5
.end method

.method public static d(Ljava/lang/String;)[B
    .locals 5

    .line 103
    const/16 v0, 0x10

    new-array v3, v0, [B

    .line 104
    const/4 v4, 0x0

    :goto_0
    const/16 v0, 0x10

    if-ge v4, v0, :cond_0

    .line 105
    mul-int/lit8 v0, v4, 0x2

    add-int/lit8 v1, v4, 0x1

    mul-int/lit8 v1, v1, 0x2

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    int-to-byte v0, v0

    aput-byte v0, v3, v4

    .line 104
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 107
    :cond_0
    return-object v3
.end method

.method public static e([B)[B
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 74
    :try_start_0
    sget-object v4, Lo/adm;->b:[B

    .line 76
    new-instance v5, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "AES"

    invoke-direct {v5, v4, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 77
    const-string v0, "AES/CTR/PKCS7Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v6

    .line 78
    new-instance v7, Ljavax/crypto/spec/IvParameterSpec;

    sget-object v0, Lo/adm;->c:[B

    invoke-direct {v7, v0}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 79
    const/4 v0, 0x2

    invoke-virtual {v6, v0, v5, v7}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 80
    move-object v8, p0

    .line 81
    invoke-virtual {v6, v8}, Ljavax/crypto/Cipher;->doFinal([B)[B
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v9

    .line 82
    return-object v9

    .line 83
    :catch_0
    move-exception v4

    .line 84
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ex "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    goto :goto_0

    .line 85
    :catch_1
    move-exception v4

    .line 86
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ex "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
