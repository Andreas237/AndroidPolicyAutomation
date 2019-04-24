.class public final Lcom/huawei/phoneserviceuni/common/e/a/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "LogUpload Service"

.field private static final b:Ljava/lang/String; = "EPYQ=="

.field private static c:Ljava/lang/String; = null


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/phoneserviceuni/common/e/a/a/a;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ljava/lang/String;
    .locals 1

    .line 27
    const-string v0, "EPYQ=="

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 42
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a/a/a;->b()Ljava/lang/String;

    move-result-object v4

    .line 46
    const-string v5, ""

    .line 48
    :try_start_0
    invoke-static {p0}, Lcom/huawei/phoneserviceuni/common/e/a/a/a;->e(Ljava/lang/String;)[B

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v4, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v2, v1, v3}, Lcom/huawei/phoneserviceuni/common/e/a/a/c;->a([BI[BI)Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_4

    move-result-object v0

    move-object v5, v0

    .line 59
    goto :goto_0

    .line 49
    :catch_0
    move-exception v6

    .line 50
    const-string v0, "LogUpload Service"

    const-string v1, "encrypterCbc InvalidKeyException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    goto :goto_0

    .line 51
    :catch_1
    move-exception v6

    .line 52
    const-string v0, "LogUpload Service"

    const-string v1, "encrypterCbc BadPaddingException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    goto :goto_0

    .line 53
    :catch_2
    move-exception v6

    .line 54
    const-string v0, "LogUpload Service"

    const-string v1, "encrypterCbc IllegalBlockSizeException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    goto :goto_0

    .line 55
    :catch_3
    move-exception v6

    .line 56
    const-string v0, "LogUpload Service"

    const-string v1, "encrypterCbc NoSuchAlgorithmException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    goto :goto_0

    .line 57
    :catch_4
    move-exception v6

    .line 58
    const-string v0, "LogUpload Service"

    const-string v1, "encrypterCbc NoSuchPaddingException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    :goto_0
    return-object v5
.end method

.method private static b()Ljava/lang/String;
    .locals 5

    .line 263
    new-instance v2, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v2}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 264
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 267
    :try_start_0
    sget-object v0, Lcom/huawei/phoneserviceuni/common/e/a/a/a;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 269
    sget-object v3, Lcom/huawei/phoneserviceuni/common/e/a/a/a;->c:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 275
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v3

    .line 271
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a/a/d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a/a/b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a/a/c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 272
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a/a/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/phoneserviceuni/common/e/a/a/a;->c:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 275
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 276
    goto :goto_0

    .line 275
    :catchall_0
    move-exception v4

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v4

    .line 277
    :goto_0
    sget-object v0, Lcom/huawei/phoneserviceuni/common/e/a/a/a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 72
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a/a/a;->b()Ljava/lang/String;

    move-result-object v2

    .line 76
    const-string v3, ""

    .line 78
    const/4 v0, 0x2

    :try_start_0
    invoke-static {v2, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lcom/huawei/phoneserviceuni/common/e/a/a/c;->a(Ljava/lang/String;[BI)[B

    move-result-object v4

    .line 81
    const-string v0, "UTF-8"

    invoke-static {v4, v0}, Lorg/apache/http/util/EncodingUtils;->getString([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v3, v0

    .line 82
    const/4 v0, 0x0

    invoke-static {v4, v0}, Ljava/util/Arrays;->fill([BB)V
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_4

    .line 94
    goto :goto_0

    .line 84
    :catch_0
    move-exception v4

    .line 85
    const-string v0, "LogUpload Service"

    const-string v1, "decrypterCbc InvalidKeyException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    goto :goto_0

    .line 86
    :catch_1
    move-exception v4

    .line 87
    const-string v0, "LogUpload Service"

    const-string v1, "decrypterCbc BadPaddingException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    goto :goto_0

    .line 88
    :catch_2
    move-exception v4

    .line 89
    const-string v0, "LogUpload Service"

    const-string v1, "decrypterCbc IllegalBlockSizeException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    goto :goto_0

    .line 90
    :catch_3
    move-exception v4

    .line 91
    const-string v0, "LogUpload Service"

    const-string v1, "decrypterCbc NoSuchAlgorithmException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    goto :goto_0

    .line 92
    :catch_4
    move-exception v4

    .line 93
    const-string v0, "LogUpload Service"

    const-string v1, "decrypterCbc NoSuchPaddingException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    :goto_0
    return-object v3
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 109
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a/a/a;->b()Ljava/lang/String;

    move-result-object v4

    .line 113
    const-string v5, ""

    .line 115
    :try_start_0
    invoke-static {p0}, Lcom/huawei/phoneserviceuni/common/e/a/a/a;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/phoneserviceuni/common/e/a/a/a;->e(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v2, v1, v3}, Lcom/huawei/phoneserviceuni/common/e/a/a/c;->a([BI[BI)Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_4

    move-result-object v0

    move-object v5, v0

    .line 126
    goto :goto_0

    .line 116
    :catch_0
    move-exception v6

    .line 117
    const-string v0, "LogUpload Service"

    const-string v1, "encrypter InvalidKeyException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    goto :goto_0

    .line 118
    :catch_1
    move-exception v6

    .line 119
    const-string v0, "LogUpload Service"

    const-string v1, "encrypter BadPaddingException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    goto :goto_0

    .line 120
    :catch_2
    move-exception v6

    .line 121
    const-string v0, "LogUpload Service"

    const-string v1, "encrypter IllegalBlockSizeException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    goto :goto_0

    .line 122
    :catch_3
    move-exception v6

    .line 123
    const-string v0, "LogUpload Service"

    const-string v1, "encrypter NoSuchAlgorithmException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    goto :goto_0

    .line 124
    :catch_4
    move-exception v6

    .line 125
    const-string v0, "LogUpload Service"

    const-string v1, "encrypter NoSuchPaddingException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    :goto_0
    return-object v5
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 140
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a/a/a;->b()Ljava/lang/String;

    move-result-object v2

    .line 144
    const-string v3, ""

    .line 146
    :try_start_0
    invoke-static {v2}, Lcom/huawei/phoneserviceuni/common/e/a/a/a;->e(Ljava/lang/String;)[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lcom/huawei/phoneserviceuni/common/e/a/a/c;->a(Ljava/lang/String;[BI)[B

    move-result-object v4

    .line 149
    const-string v0, "UTF-8"

    invoke-static {v4, v0}, Lorg/apache/http/util/EncodingUtils;->getString([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v3, v0

    .line 150
    const/4 v0, 0x0

    invoke-static {v4, v0}, Ljava/util/Arrays;->fill([BB)V
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_4

    .line 162
    goto :goto_0

    .line 152
    :catch_0
    move-exception v4

    .line 153
    const-string v0, "LogUpload Service"

    const-string v1, "decrypter InvalidKeyException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    goto :goto_0

    .line 154
    :catch_1
    move-exception v4

    .line 155
    const-string v0, "LogUpload Service"

    const-string v1, "decrypter BadPaddingException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    goto :goto_0

    .line 156
    :catch_2
    move-exception v4

    .line 157
    const-string v0, "LogUpload Service"

    const-string v1, "decrypter IllegalBlockSizeException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    goto :goto_0

    .line 158
    :catch_3
    move-exception v4

    .line 159
    const-string v0, "LogUpload Service"

    const-string v1, "decrypter NoSuchAlgorithmException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    goto :goto_0

    .line 160
    :catch_4
    move-exception v4

    .line 161
    const-string v0, "LogUpload Service"

    const-string v1, "decrypter NoSuchPaddingException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    :goto_0
    return-object v3
.end method

.method private static e(Ljava/lang/String;)[B
    .locals 4

    .line 244
    const/4 v2, 0x0

    .line 245
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 247
    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 250
    goto :goto_0

    .line 248
    :catch_0
    move-exception v3

    .line 249
    const-string v0, "LogUpload Service"

    const-string v1, "getUTF8Bytes Exception"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    :cond_0
    :goto_0
    return-object v2
.end method
