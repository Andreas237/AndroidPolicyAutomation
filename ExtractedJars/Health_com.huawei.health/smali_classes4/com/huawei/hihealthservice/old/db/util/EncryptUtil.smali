.class public Lcom/huawei/hihealthservice/old/db/util/EncryptUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final padding:Ljava/lang/String; = "AES/CBC/ISO10126Padding"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static decrypter(Ljava/lang/String;Lcom/huawei/hihealthservice/old/util/IEncryptManager;)Ljava/lang/String;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 80
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    .line 82
    invoke-interface {p1, v3}, Lcom/huawei/hihealthservice/old/util/IEncryptManager;->getSecret(C)[B

    move-result-object v4

    .line 83
    invoke-interface {p1, v3}, Lcom/huawei/hihealthservice/old/util/IEncryptManager;->getEncryptType(C)C

    move-result v5

    .line 85
    const/16 v0, 0x33

    if-ne v0, v5, :cond_0

    .line 87
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v6

    .line 88
    const-string v0, "AES/CBC/ISO10126Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v7

    .line 89
    new-instance v8, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "AES"

    invoke-direct {v8, v4, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 90
    new-instance v9, Ljavax/crypto/spec/IvParameterSpec;

    const/4 v0, 0x0

    const/16 v1, 0x10

    invoke-direct {v9, v6, v0, v1}, Ljavax/crypto/spec/IvParameterSpec;-><init>([BII)V

    .line 91
    const/4 v0, 0x2

    invoke-virtual {v7, v0, v8, v9}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 92
    new-instance v0, Ljava/lang/String;

    array-length v1, v6

    add-int/lit8 v1, v1, -0x10

    const/16 v2, 0x10

    invoke-virtual {v7, v6, v2, v1}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    move-result-object v1

    const-string v2, "UTF-8"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 94
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "unsupport encrypter type"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static encrypter(Ljava/lang/String;Lcom/huawei/hihealthservice/old/util/IEncryptManager;)Ljava/lang/String;
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 36
    invoke-interface/range {p1 .. p1}, Lcom/huawei/hihealthservice/old/util/IEncryptManager;->getEncryptVersion()C

    move-result v5

    .line 37
    move-object/from16 v0, p1

    invoke-interface {v0, v5}, Lcom/huawei/hihealthservice/old/util/IEncryptManager;->getEncryptType(C)C

    move-result v6

    .line 38
    move-object/from16 v0, p1

    invoke-interface {v0, v5}, Lcom/huawei/hihealthservice/old/util/IEncryptManager;->getSecret(C)[B

    move-result-object v7

    .line 40
    const/16 v0, 0x33

    if-ne v0, v6, :cond_1

    .line 42
    const/16 v0, 0x10

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/util/RootKeyUtil;->genRandBytes(I)[B

    move-result-object v8

    .line 44
    const-string v0, "AES/CBC/ISO10126Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v9

    .line 45
    invoke-virtual {v9}, Ljavax/crypto/Cipher;->getBlockSize()I

    move-result v10

    .line 47
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v11

    .line 48
    array-length v12, v11

    .line 49
    rem-int v0, v12, v10

    if-eqz v0, :cond_0

    .line 51
    rem-int v0, v12, v10

    sub-int v0, v10, v0

    add-int/2addr v12, v0

    .line 54
    :cond_0
    new-array v13, v12, [B

    .line 55
    array-length v0, v11

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v11, v1, v13, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 57
    new-instance v14, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "AES"

    invoke-direct {v14, v7, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 58
    new-instance v15, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v15, v8}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 60
    const/4 v0, 0x1

    invoke-virtual {v9, v0, v14, v15}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 61
    invoke-virtual {v9, v13}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v16

    .line 63
    move-object/from16 v0, v16

    array-length v0, v0

    add-int/lit8 v0, v0, 0x10

    new-array v1, v0, [B

    move-object/from16 v17, v1

    .line 64
    const/4 v0, 0x0

    move-object/from16 v1, v17

    const/4 v2, 0x0

    const/16 v3, 0x10

    invoke-static {v8, v0, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 65
    move-object/from16 v0, v16

    array-length v0, v0

    move-object/from16 v1, v16

    const/4 v2, 0x0

    move-object/from16 v3, v17

    const/16 v4, 0x10

    invoke-static {v1, v2, v3, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v17

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 68
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "unsupport encrypter type"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
