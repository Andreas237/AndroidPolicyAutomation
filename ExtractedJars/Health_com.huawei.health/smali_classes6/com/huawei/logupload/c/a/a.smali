.class public final Lcom/huawei/logupload/c/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "LogUpload Service"

.field private static final b:Ljava/lang/String; = "EPYQ=="

.field private static c:Ljava/lang/String; = null


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 35
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/logupload/c/a/a;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ljava/lang/String;
    .locals 1

    .line 28
    const-string v0, "EPYQ=="

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 43
    invoke-static {}, Lcom/huawei/logupload/c/a/a;->b()Ljava/lang/String;

    move-result-object v4

    .line 47
    const-string v5, ""

    .line 50
    :try_start_0
    invoke-static {p0}, Lcom/huawei/logupload/c/a/a;->e(Ljava/lang/String;)[B

    move-result-object v0

    .line 51
    const/4 v1, 0x2

    invoke-static {v4, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v1

    .line 50
    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v2, v1, v3}, Lcom/huawei/logupload/c/a/c;->a([BI[BI)Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_4

    move-result-object v0

    move-object v5, v0

    .line 53
    goto :goto_0

    :catch_0
    move-exception v6

    .line 54
    const-string v0, "LogUpload Service"

    const-string v1, "InvalidKeyException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->h(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 55
    :catch_1
    move-exception v6

    .line 56
    const-string v0, "LogUpload Service"

    const-string v1, "BadPaddingException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->h(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 57
    :catch_2
    move-exception v6

    .line 58
    const-string v0, "LogUpload Service"

    const-string v1, "IllegalBlockSizeException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->h(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 59
    :catch_3
    move-exception v6

    .line 60
    const-string v0, "LogUpload Service"

    const-string v1, "NoSuchAlgorithmException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->h(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 61
    :catch_4
    move-exception v6

    .line 62
    const-string v0, "LogUpload Service"

    const-string v1, "NoSuchPaddingException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    :goto_0
    return-object v5
.end method

.method private static b()Ljava/lang/String;
    .locals 6

    .line 272
    new-instance v2, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v2}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 273
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 275
    :try_start_0
    sget-object v0, Lcom/huawei/logupload/c/a/a;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 276
    sget-object v5, Lcom/huawei/logupload/c/a/a;->c:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 285
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 276
    return-object v5

    .line 278
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/huawei/logupload/c/c;->h()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/logupload/c/d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 279
    invoke-static {}, Lcom/huawei/logupload/c/e;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/huawei/logupload/c/a/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 278
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/logupload/c/a/a;->c:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 280
    goto :goto_0

    :catch_0
    move-exception v3

    .line 281
    const/4 v0, 0x4

    :try_start_2
    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 282
    const-string v0, "LogUpload Service"

    invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->h(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 285
    :cond_1
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_1

    .line 284
    :catchall_0
    move-exception v4

    .line 285
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 286
    throw v4

    .line 285
    :goto_0
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 287
    :goto_1
    sget-object v0, Lcom/huawei/logupload/c/a/a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 76
    invoke-static {}, Lcom/huawei/logupload/c/a/a;->b()Ljava/lang/String;

    move-result-object v2

    .line 80
    const-string v3, ""

    .line 83
    .line 84
    const/4 v0, 0x2

    :try_start_0
    invoke-static {v2, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    .line 83
    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lcom/huawei/logupload/c/a/c;->a(Ljava/lang/String;[BI)[B

    move-result-object v4

    .line 86
    if-eqz v4, :cond_0

    .line 88
    const-string v0, "UTF-8"

    invoke-static {v4, v0}, Lorg/apache/http/util/EncodingUtils;->getString([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v3, v0

    .line 89
    const/4 v0, 0x0

    invoke-static {v4, v0}, Ljava/util/Arrays;->fill([BB)V
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_4

    .line 91
    goto :goto_0

    :catch_0
    move-exception v4

    .line 92
    const-string v0, "LogUpload Service"

    const-string v1, "InvalidKeyException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->h(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 93
    :catch_1
    move-exception v4

    .line 94
    const-string v0, "LogUpload Service"

    const-string v1, "BadPaddingException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->h(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 95
    :catch_2
    move-exception v4

    .line 96
    const-string v0, "LogUpload Service"

    const-string v1, "IllegalBlockSizeException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->h(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 97
    :catch_3
    move-exception v4

    .line 98
    const-string v0, "LogUpload Service"

    const-string v1, "NoSuchAlgorithmException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->h(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 99
    :catch_4
    move-exception v4

    .line 100
    const-string v0, "LogUpload Service"

    const-string v1, "NoSuchPaddingException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    :cond_0
    :goto_0
    return-object v3
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 116
    invoke-static {}, Lcom/huawei/logupload/c/a/a;->b()Ljava/lang/String;

    move-result-object v4

    .line 120
    const-string v5, ""

    .line 122
    :try_start_0
    invoke-static {p0}, Lcom/huawei/logupload/c/a/a;->e(Ljava/lang/String;)[B

    move-result-object v0

    .line 123
    invoke-static {v4}, Lcom/huawei/logupload/c/a/a;->e(Ljava/lang/String;)[B

    move-result-object v1

    .line 122
    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v2, v1, v3}, Lcom/huawei/logupload/c/a/c;->a([BI[BI)Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_4

    move-result-object v0

    move-object v5, v0

    .line 124
    goto :goto_0

    :catch_0
    move-exception v6

    .line 125
    const-string v0, "LogUpload Service"

    const-string v1, "InvalidKeyException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->h(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 126
    :catch_1
    move-exception v6

    .line 127
    const-string v0, "LogUpload Service"

    const-string v1, "BadPaddingException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->h(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 128
    :catch_2
    move-exception v6

    .line 129
    const-string v0, "LogUpload Service"

    const-string v1, "IllegalBlockSizeException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->h(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 130
    :catch_3
    move-exception v6

    .line 131
    const-string v0, "LogUpload Service"

    const-string v1, "NoSuchAlgorithmException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->h(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 132
    :catch_4
    move-exception v6

    .line 133
    const-string v0, "LogUpload Service"

    const-string v1, "NoSuchPaddingException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    :goto_0
    return-object v5
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 148
    invoke-static {}, Lcom/huawei/logupload/c/a/a;->b()Ljava/lang/String;

    move-result-object v2

    .line 152
    const-string v3, ""

    .line 154
    .line 155
    :try_start_0
    invoke-static {v2}, Lcom/huawei/logupload/c/a/a;->e(Ljava/lang/String;)[B

    move-result-object v0

    .line 154
    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lcom/huawei/logupload/c/a/c;->a(Ljava/lang/String;[BI)[B

    move-result-object v4

    .line 156
    if-eqz v4, :cond_0

    .line 158
    const-string v0, "UTF-8"

    invoke-static {v4, v0}, Lorg/apache/http/util/EncodingUtils;->getString([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v3, v0

    .line 159
    const/4 v0, 0x0

    invoke-static {v4, v0}, Ljava/util/Arrays;->fill([BB)V
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_4

    .line 161
    goto :goto_0

    :catch_0
    move-exception v4

    .line 162
    const-string v0, "LogUpload Service"

    const-string v1, "InvalidKeyException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->h(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 163
    :catch_1
    move-exception v4

    .line 164
    const-string v0, "LogUpload Service"

    const-string v1, "BadPaddingException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->h(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 165
    :catch_2
    move-exception v4

    .line 166
    const-string v0, "LogUpload Service"

    const-string v1, "IllegalBlockSizeException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->h(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 167
    :catch_3
    move-exception v4

    .line 168
    const-string v0, "LogUpload Service"

    const-string v1, "NoSuchAlgorithmException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->h(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 169
    :catch_4
    move-exception v4

    .line 170
    const-string v0, "LogUpload Service"

    const-string v1, "NoSuchPaddingException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    :cond_0
    :goto_0
    return-object v3
.end method

.method private static e(Ljava/lang/String;)[B
    .locals 3

    .line 255
    const/4 v1, 0x0

    .line 256
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 258
    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v1, v0

    .line 259
    goto :goto_0

    :catch_0
    move-exception v2

    .line 262
    :cond_0
    :goto_0
    return-object v1
.end method
