.class public Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "Debug_DE_AES_CBC_HEX_Util_OLD_ONE"

.field private static final SECRET_KEY_E:Ljava/lang/String; = "DkInv@%7d$f4Da5PDDEkl;aj8F>\'vDaldfljl;bkaDIkKyYuuUudf"

.field private static SECRET_KEY_S:Ljava/lang/String; = null

.field private static key:Ljava/lang/String; = null

.field private static secret:[B = null

.field private static vi:[B = null


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 25
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;->SECRET_KEY_S:Ljava/lang/String;

    .line 29
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;->secret:[B

    .line 31
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;->vi:[B

    .line 33
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;->key:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static decodeSecretKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 224
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    .line 225
    array-length v0, v1

    new-array v2, v0, [C

    .line 226
    const/4 v3, 0x0

    .line 227
    move-object v4, v1

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_0

    aget-char v7, v4, v6

    .line 229
    add-int/lit8 v0, v7, 0x2

    int-to-char v0, v0

    aput-char v0, v2, v3

    .line 230
    add-int/lit8 v3, v3, 0x1

    .line 227
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 232
    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static desEncrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 137
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 141
    :try_start_0
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;->getSecret(Ljava/lang/String;)[B

    move-result-object v7

    .line 142
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;->getIV(Ljava/lang/String;)[B

    move-result-object v8

    .line 143
    invoke-static {p0, v7, v8}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX;->desEncrypt(Ljava/lang/String;[B[B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v6

    .line 149
    goto :goto_0

    .line 145
    :catch_0
    move-exception v7

    .line 147
    const-string v0, "Debug_DE_AES_CBC_HEX_Util_OLD_ONE"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "desEncrypt "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v7}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 150
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 151
    const-string v0, "Debug_DE_AES_CBC_HEX_Util_OLD_ONE"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "desEncrypt time= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sub-long v2, v7, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    return-object v6
.end method

.method public static encrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 114
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 118
    :try_start_0
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;->getSecret(Ljava/lang/String;)[B

    move-result-object v7

    .line 119
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;->getIV(Ljava/lang/String;)[B

    move-result-object v8

    .line 120
    invoke-static {p0, v7, v8}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX;->encrypt(Ljava/lang/String;[B[B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v6

    .line 126
    goto :goto_0

    .line 122
    :catch_0
    move-exception v7

    .line 124
    const-string v0, "Debug_DE_AES_CBC_HEX_Util_OLD_ONE"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "encrypt "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v7}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 127
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 128
    const-string v0, "Debug_DE_AES_CBC_HEX_Util_OLD_ONE"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "encrypt time= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sub-long v2, v7, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    return-object v6
.end method

.method private static getByte16Much(Ljava/lang/String;)[B
    .locals 7

    .line 195
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptionUitls;->MD5Encrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 196
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;->getUTF8Bytes(Ljava/lang/String;)[B

    move-result-object v2

    .line 198
    const/16 v3, 0x10

    .line 199
    array-length v4, v2

    .line 200
    new-array v5, v3, [B

    .line 201
    if-lt v4, v3, :cond_1

    .line 203
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v3, :cond_0

    .line 205
    add-int/lit8 v0, v4, -0x1

    sub-int/2addr v0, v6

    aget-byte v0, v2, v0

    add-int/2addr v0, v6

    int-to-byte v0, v0

    aput-byte v0, v5, v6

    .line 203
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    goto :goto_3

    .line 210
    :cond_1
    const/4 v6, 0x0

    :goto_1
    if-ge v6, v4, :cond_2

    .line 212
    add-int/lit8 v0, v4, -0x1

    sub-int/2addr v0, v6

    aget-byte v0, v2, v0

    add-int/2addr v0, v6

    int-to-byte v0, v0

    aput-byte v0, v5, v6

    .line 210
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 214
    :cond_2
    move v6, v4

    :goto_2
    if-ge v6, v3, :cond_3

    .line 216
    int-to-byte v0, v6

    aput-byte v0, v5, v6

    .line 214
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 219
    :cond_3
    :goto_3
    return-object v5
.end method

.method private static declared-synchronized getIV(Ljava/lang/String;)[B
    .locals 3

    const-class v2, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;

    monitor-enter v2

    .line 184
    :try_start_0
    sget-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;->vi:[B

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 187
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;->getByte16Much(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;->vi:[B

    .line 189
    :cond_0
    sget-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;->vi:[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method

.method public static getKey(Landroid/content/Context;)Ljava/lang/String;
    .locals 11

    .line 40
    sget-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;->key:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 42
    new-instance v4, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;

    invoke-direct {v4, p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;-><init>(Landroid/content/Context;)V

    .line 43
    const-string v0, "CBC"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->get(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;

    move-result-object v5

    .line 44
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 46
    new-instance v5, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;

    invoke-direct {v5}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;-><init>()V

    .line 47
    const-wide/16 v6, 0x0

    .line 50
    const-string v0, "SHA1PRNG"

    :try_start_0
    invoke-static {v0}, Ljava/security/SecureRandom;->getInstance(Ljava/lang/String;)Ljava/security/SecureRandom;

    move-result-object v8

    .line 51
    invoke-virtual {v8}, Ljava/security/SecureRandom;->nextLong()J

    move-result-wide v9

    .line 52
    const-wide/32 v0, -0x80000000

    cmp-long v0, v0, v9

    if-nez v0, :cond_0

    .line 54
    const-wide/32 v9, 0x7fffffff

    .line 56
    :cond_0
    invoke-static {v9, v10}, Ljava/lang/Math;->abs(J)J
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v6

    .line 62
    goto :goto_0

    .line 58
    :catch_0
    move-exception v8

    .line 60
    const-string v0, "Debug_DE_AES_CBC_HEX_Util_OLD_ONE"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getKey "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    const/4 v0, 0x0

    return-object v0

    .line 63
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setCreateTime(J)V

    .line 64
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setData(Ljava/lang/String;)V

    .line 65
    const-string v0, "CBC"

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setKey(Ljava/lang/String;)V

    .line 66
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setLastModifyTime(J)V

    .line 67
    invoke-virtual {v4, v5}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->save(Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;)V

    .line 69
    :cond_1
    invoke-virtual {v5}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->getData()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;->key:Ljava/lang/String;

    .line 72
    :cond_2
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;->init(Landroid/content/Context;)V

    .line 74
    sget-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;->key:Ljava/lang/String;

    return-object v0
.end method

.method private static declared-synchronized getSecret(Ljava/lang/String;)[B
    .locals 7

    const-class v6, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;

    monitor-enter v6

    .line 157
    :try_start_0
    sget-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;->secret:[B

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 159
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;->random(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 160
    sget-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;->SECRET_KEY_S:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;->decodeSecretKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 161
    const-string v0, "DkInv@%7d$f4Da5PDDEkl;aj8F>\'vDaldfljl;bkaDIkKyYuuUudf"

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;->decodeSecretKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 162
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 164
    invoke-static {v5}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;->getByte16Much(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;->secret:[B

    .line 166
    :cond_0
    sget-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;->secret:[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v6

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v6

    throw p0
.end method

.method private static getUTF8Bytes(Ljava/lang/String;)[B
    .locals 2

    .line 239
    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 241
    :catch_0
    move-exception v1

    .line 243
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method

.method public static init(Landroid/content/Context;)V
    .locals 8

    .line 79
    sget-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;->SECRET_KEY_S:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 81
    const/4 v4, 0x0

    .line 84
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "s"

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    move-object v4, v0

    .line 85
    if-eqz v4, :cond_0

    .line 87
    invoke-static {v4}, Lcom/huawei/hihealthservice/old/db/util/Utils;->inputStream(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;->SECRET_KEY_S:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    :cond_0
    if-eqz v4, :cond_2

    .line 101
    :try_start_1
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 106
    goto :goto_1

    .line 103
    :catch_0
    move-exception v5

    .line 105
    const-string v0, "Debug_DE_AES_CBC_HEX_Util_OLD_ONE"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    goto :goto_1

    .line 90
    :catch_1
    move-exception v5

    .line 93
    const-string v0, "Debug_DE_AES_CBC_HEX_Util_OLD_ONE"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v5, v1, v2

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 97
    if-eqz v4, :cond_2

    .line 101
    :try_start_3
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 106
    goto :goto_1

    .line 103
    :catch_2
    move-exception v5

    .line 105
    const-string v0, "Debug_DE_AES_CBC_HEX_Util_OLD_ONE"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    goto :goto_1

    .line 97
    :catchall_0
    move-exception v6

    if-eqz v4, :cond_1

    .line 101
    :try_start_4
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 106
    goto :goto_0

    .line 103
    :catch_3
    move-exception v7

    .line 105
    const-string v0, "Debug_DE_AES_CBC_HEX_Util_OLD_ONE"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    :cond_1
    :goto_0
    throw v6

    .line 110
    :cond_2
    :goto_1
    return-void
.end method

.method private static random(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 171
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v2

    .line 172
    array-length v0, v2

    add-int/lit8 v0, v0, -0x1

    aget-char v3, v2, v0

    .line 173
    array-length v0, v2

    rem-int v0, v3, v0

    add-int/lit8 v4, v0, 0x1

    .line 174
    new-array v5, v4, [C

    .line 175
    const/4 v6, 0x0

    :goto_0
    array-length v0, v5

    if-ge v6, v0, :cond_0

    .line 177
    aget-char v0, v2, v6

    add-int/lit8 v0, v0, 0x2

    int-to-char v0, v0

    aput-char v0, v5, v6

    .line 175
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 179
    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method
