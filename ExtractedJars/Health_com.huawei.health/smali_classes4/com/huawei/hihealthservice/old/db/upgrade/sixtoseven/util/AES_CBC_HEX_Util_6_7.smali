.class public Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "DE_AES_CBC_HEX_Util_6_7"

.field private static final SECRET_KEY_E:Ljava/lang/String; = "819C81FBBA46E6813E08ECE598174B2DCAB9D1599B00665CE5C2EAD43698CA90B139328186CED8596BBB9F6F0D0340F3D443B9568DB42251B2E78FDBA811B20E7F0678B12DD4AF06E99832298F64CDC3FB14482AE388855035E418609C7B7F99EEB10659240924DD3113EBFA31F13C4941E4EA78D45DB2DCD1B9192CCDD6CB5F"

.field private static SECRET_KEY_S:Ljava/lang/String; = null

.field private static key:Ljava/lang/String; = null

.field private static mContext:Landroid/content/Context; = null

.field private static secret:[B = null

.field private static vi:[B = null


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 21
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->SECRET_KEY_S:Ljava/lang/String;

    .line 26
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->secret:[B

    .line 28
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->vi:[B

    .line 30
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->key:Ljava/lang/String;

    .line 32
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->mContext:Landroid/content/Context;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static desEncrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 180
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->initSecretAndVi(Ljava/lang/String;)V

    .line 181
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 185
    :try_start_0
    sget-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->secret:[B

    sget-object v1, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->vi:[B

    invoke-static {p0, v0, v1}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_6_7;->desEncryptHex(Ljava/lang/String;[B[B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v6

    .line 192
    goto :goto_0

    .line 187
    :catch_0
    move-exception v7

    .line 189
    const-string v0, "DE_AES_CBC_HEX_Util_6_7"

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

    .line 191
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v7}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 193
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 194
    const-string v0, "DE_AES_CBC_HEX_Util_6_7"

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

    .line 195
    return-object v6
.end method

.method public static encrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 156
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->initSecretAndVi(Ljava/lang/String;)V

    .line 157
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 163
    :try_start_0
    sget-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->secret:[B

    sget-object v1, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->vi:[B

    invoke-static {p0, v0, v1}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_6_7;->encryptHex(Ljava/lang/String;[B[B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v6

    .line 169
    goto :goto_0

    .line 165
    :catch_0
    move-exception v7

    .line 167
    const-string v0, "DE_AES_CBC_HEX_Util_6_7"

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

    .line 168
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v7}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 170
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 171
    const-string v0, "DE_AES_CBC_HEX_Util_6_7"

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

    .line 172
    return-object v6
.end method

.method public static getKey(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 35
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->getKeySync(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static declared-synchronized getKeySync(Landroid/content/Context;)Ljava/lang/String;
    .locals 11

    const-class v10, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;

    monitor-enter v10

    .line 43
    const-string v0, "DE_AES_CBC_HEX_Util_6_7"

    const/4 v1, 0x2

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 45
    sget-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 47
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->mContext:Landroid/content/Context;

    .line 50
    :cond_0
    sget-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->key:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 52
    new-instance v6, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;

    invoke-direct {v6, p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;-><init>(Landroid/content/Context;)V

    .line 53
    const-string v0, "AES_CBC"

    .line 54
    invoke-virtual {v6, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->get(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;

    move-result-object v7

    .line 55
    const/4 v0, 0x0

    if-ne v0, v7, :cond_1

    .line 57
    new-instance v7, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;

    invoke-direct {v7}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;-><init>()V

    .line 58
    const/16 v0, 0x10

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/RootKeyUtil_6_7;->genRandBytes(I)[B

    move-result-object v8

    .line 59
    const/4 v0, 0x0

    invoke-static {v8, v0}, Lcom/huawei/hihealthservice/old/util/HEX;->encode([BI)Ljava/lang/String;

    move-result-object v9

    .line 60
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setCreateTime(J)V

    .line 61
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setData(Ljava/lang/String;)V

    .line 62
    const-string v0, "AES_CBC"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setKey(Ljava/lang/String;)V

    .line 63
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setLastModifyTime(J)V

    .line 64
    invoke-virtual {v6, v7}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->save(Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;)V

    .line 66
    :cond_1
    invoke-virtual {v7}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->getData()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->key:Ljava/lang/String;

    .line 69
    :cond_2
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->initSecretKeyS(Landroid/content/Context;)V

    .line 70
    sget-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->key:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->initSecretAndVi(Ljava/lang/String;)V

    .line 71
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 72
    const-string v0, "DE_AES_CBC_HEX_Util_6_7"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getKey time= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sub-long v2, v6, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    sget-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->key:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v10

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v10

    throw p0
.end method

.method private static declared-synchronized initSecretAndVi(Ljava/lang/String;)V
    .locals 9

    const-class v8, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;

    monitor-enter v8

    .line 78
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v4

    .line 81
    :try_start_1
    sget-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->secret:[B

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    sget-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->vi:[B

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 83
    :cond_0
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/util/HEX;->decode(Ljava/lang/String;)[B

    move-result-object v6

    .line 84
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    sget-object v1, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->SECRET_KEY_S:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "819C81FBBA46E6813E08ECE598174B2DCAB9D1599B00665CE5C2EAD43698CA90B139328186CED8596BBB9F6F0D0340F3D443B9568DB42251B2E78FDBA811B20E7F0678B12DD4AF06E99832298F64CDC3FB14482AE388855035E418609C7B7F99EEB10659240924DD3113EBFA31F13C4941E4EA78D45DB2DCD1B9192CCDD6CB5F"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0, v6}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/RootKeyUtil_6_7;->getAesCbcSecretAndIv([Ljava/lang/String;[B)[[B

    move-result-object v7

    .line 86
    const/4 v0, 0x0

    aget-object v0, v7, v0

    sput-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->secret:[B

    .line 87
    const/4 v0, 0x1

    aget-object v0, v7, v0

    sput-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->vi:[B
    :try_end_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 104
    :cond_1
    goto :goto_0

    .line 90
    :catch_0
    move-exception v6

    .line 92
    const-string v0, "DE_AES_CBC_HEX_Util_6_7"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSecretAndVi NoSuchAlgorithmException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v6}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 95
    :catch_1
    move-exception v6

    .line 97
    const-string v0, "DE_AES_CBC_HEX_Util_6_7"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSecretAndVi InvalidKeySpecException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/security/spec/InvalidKeySpecException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v6}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 100
    :catch_2
    move-exception v6

    .line 102
    const-string v0, "DE_AES_CBC_HEX_Util_6_7"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSecretAndVi "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v6}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 105
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 106
    const-string v0, "DE_AES_CBC_HEX_Util_6_7"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSecretAndVi time= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sub-long v2, v6, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 107
    monitor-exit v8

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v8

    throw p0
.end method

.method public static initSecretKeyS(Landroid/content/Context;)V
    .locals 0

    .line 110
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->initSecretKeySSync(Landroid/content/Context;)V

    .line 111
    return-void
.end method

.method private static declared-synchronized initSecretKeySSync(Landroid/content/Context;)V
    .locals 9

    const-class v8, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;

    monitor-enter v8

    .line 116
    :try_start_0
    sget-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 118
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->mContext:Landroid/content/Context;

    .line 121
    :cond_0
    sget-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->SECRET_KEY_S:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 123
    const/4 v4, 0x0

    .line 126
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "o"

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    move-object v4, v0

    .line 127
    if-eqz v4, :cond_1

    .line 129
    invoke-static {v4}, Lcom/huawei/hihealthservice/old/db/util/Utils;->inputStream(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->SECRET_KEY_S:Ljava/lang/String;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 139
    :cond_1
    if-eqz v4, :cond_3

    .line 143
    :try_start_2
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 148
    goto :goto_1

    .line 145
    :catch_0
    move-exception v5

    .line 147
    const-string v0, "DE_AES_CBC_HEX_Util_6_7"

    const/4 v1, 0x2

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSecretKeyS "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 148
    goto :goto_1

    .line 132
    :catch_1
    move-exception v5

    .line 135
    const-string v0, "DE_AES_CBC_HEX_Util_6_7"

    const/4 v1, 0x2

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v5, v1, v2

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 139
    if-eqz v4, :cond_3

    .line 143
    :try_start_5
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 148
    goto :goto_1

    .line 145
    :catch_2
    move-exception v5

    .line 147
    const-string v0, "DE_AES_CBC_HEX_Util_6_7"

    const/4 v1, 0x2

    :try_start_6
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSecretKeyS "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 148
    goto :goto_1

    .line 139
    :catchall_0
    move-exception v6

    if-eqz v4, :cond_2

    .line 143
    :try_start_7
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 148
    goto :goto_0

    .line 145
    :catch_3
    move-exception v7

    .line 147
    const-string v0, "DE_AES_CBC_HEX_Util_6_7"

    const/4 v1, 0x2

    :try_start_8
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSecretKeyS "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    :cond_2
    :goto_0
    throw v6
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 152
    :cond_3
    :goto_1
    monitor-exit v8

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v8

    throw p0
.end method
